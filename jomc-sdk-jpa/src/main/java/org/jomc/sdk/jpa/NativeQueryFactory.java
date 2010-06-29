// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2010 The JOMC Project
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
// </editor-fold>
// SECTION-END
package org.jomc.sdk.jpa;

import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Factory providing a native JPA query instance.
 * <p><b>Specifications</b><ul>
 * <li>{@code 'javax.persistence.Query'} {@code (javax.persistence.Query)} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getNativeQuery nativeQuery}"
 * <blockquote>Property of type {@code java.lang.String}.
 * <p>Native query to provide.</p>
 * </blockquote></li>
 * <li>"{@link #getParameterMap parameterMap}"
 * <blockquote>Property of type {@code java.util.Map<String,Object>}.
 * <p>Map of parameters to set on the query.</p>
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getEntityManager EntityManager}"<blockquote>
 * Dependency on {@code 'javax.persistence.EntityManager'} {@code (javax.persistence.EntityManager)}.</blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
// </editor-fold>
// SECTION-END
public final class NativeQueryFactory
{
    // SECTION-START[Query]
    // SECTION-END
    // SECTION-START[NativeQueryFactory]

    public Query getObject()
    {
        final EntityManager em = this.getEntityManager();

        if ( em != null )
        {
            final Query q = em.createNativeQuery( this.getNativeQuery() );

            for ( Map.Entry<String, Object> e : this.getParameterMap().entrySet() )
            {
                q.setParameter( e.getKey(), e.getValue() );
            }

            return q;
        }

        return null;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code NativeQueryFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    public NativeQueryFactory()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // <editor-fold defaultstate="collapsed" desc=" Generated Dependencies ">

    /**
     * Gets the {@code EntityManager} dependency.
     * <p>This method returns the {@code 'JOMC SDK JPA'} object of the {@code 'javax.persistence.EntityManager'} {@code (javax.persistence.EntityManager)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested.</p>
     * @return The {@code EntityManager} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    private javax.persistence.EntityManager getEntityManager()
    {
        return (javax.persistence.EntityManager) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "EntityManager" );
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code nativeQuery} property.
     * @return Native query to provide.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    private java.lang.String getNativeQuery()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "nativeQuery" );
        assert _p != null : "'nativeQuery' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code parameterMap} property.
     * @return Map of parameters to set on the query.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    private java.util.Map<String,Object> getParameterMap()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "parameterMap" );
        assert _p != null : "'parameterMap' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
