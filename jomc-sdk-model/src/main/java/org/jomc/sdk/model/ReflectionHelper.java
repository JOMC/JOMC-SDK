/*
 *   Copyright (c) 2009 The JOMC Project
 *   Copyright (c) 2005 Christian Schulte <schulte2005@users.sourceforge.net>
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions
 *   are met:
 *
 *     o Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *     o Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in
 *       the documentation and/or other materials provided with the
 *       distribution.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE JOMC PROJECT AND CONTRIBUTORS "AS IS"
 *   AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 *   THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *   PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE JOMC PROJECT OR
 *   CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *   EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *   OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 *   WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 *   OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *   ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   $Id$
 *
 */
package org.jomc.sdk.model;

import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Provides package private static helper methods for accessing objects using reflection.
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a>
 * @version $Id$
 */
abstract class ReflectionHelper
{

    private static String GET_JAVA_VALUE = "getJavaValue";

    ReflectionHelper()
    {
        super();
    }

    static java.lang.Object getJavaValue( final ClassLoader classLoader, final Object o ) throws ModelException
    {
        if ( o != null )
        {
            try
            {
                return o.getClass().getMethod( GET_JAVA_VALUE, ClassLoader.class ).invoke( o, classLoader );
            }
            catch ( final IllegalAccessException e )
            {
                throw new ModelException( getMessage(
                    "methodAccessDenied", GET_JAVA_VALUE, o.getClass().getName() ), e );

            }
            catch ( final IllegalArgumentException e )
            {
                throw new AssertionError( e );
            }
            catch ( final InvocationTargetException e )
            {
                throw new ModelException( getMessage(
                    "methodInvocationFailure", GET_JAVA_VALUE, o.getClass().getName() ), e );

            }
            catch ( final SecurityException e )
            {
                throw new ModelException( getMessage(
                    "methodAccessDenied", GET_JAVA_VALUE, o.getClass().getName() ), e );

            }
            catch ( final NoSuchMethodException e )
            {
                // Optional method not provided.
                return o;
            }
        }

        return o;
    }

    static <T> T getJavaValue( final ClassLoader classLoader, final Object o, final Class<T> returnType )
        throws ModelException
    {
        final Object javaValue = getJavaValue( classLoader, o );

        if ( javaValue != null && !returnType.isAssignableFrom( javaValue.getClass() ) )
        {
            throw new ModelException( getMessage(
                "illegalMethodInvocationResult", GET_JAVA_VALUE, o.getClass().getName(), javaValue.getClass().getName(),
                returnType.getName() ) );

        }

        return (T) javaValue;
    }

    static <T> T getJavaValue( final Class<T> type, final String value ) throws ModelException
    {
        if ( value != null )
        {
            try
            {
                if ( type == Character.class )
                {
                    if ( value.length() != 1 )
                    {
                        throw new ModelException( getMessage( "illegalValue", value, Character.class.getName() ) );
                    }

                    return type.getConstructor( new Class[]
                        {
                            char.class
                        } ).newInstance( new java.lang.Object[]
                        {
                            value.charAt( 0 )
                        } );

                }
                else if ( type == String.class )
                {
                    return (T) value;
                }
                else
                {
                    return type.getConstructor( new Class[]
                        {
                            String.class
                        } ).newInstance( value );

                }
            }
            catch ( final InstantiationException e )
            {
                throw new ModelException( getMessage( "instantiationException", type.getName() ), e );
            }
            catch ( final IllegalAccessException e )
            {
                throw new ModelException( getMessage( "constructorAccessDenied", type.getName() ), e );
            }
            catch ( final IllegalArgumentException e )
            {
                throw new AssertionError( e );
            }
            catch ( final InvocationTargetException e )
            {
                throw new ModelException( getMessage( "constructorInvocationFailure", type.getName() ), e );
            }
            catch ( final NoSuchMethodException e )
            {
                throw new ModelException( getMessage( "constructorNotFound", type.getName() ), e );
            }
        }

        return null;
    }

    private static String getMessage( final String key, final java.lang.Object... arguments )
    {
        return MessageFormat.format( ResourceBundle.getBundle( ReflectionHelper.class.getName().replace( '.', '/' ),
                                                               Locale.getDefault() ).getString( key ), arguments );

    }

}
