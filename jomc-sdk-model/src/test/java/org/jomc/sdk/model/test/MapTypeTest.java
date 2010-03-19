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
package org.jomc.sdk.model.test;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Test cases for the {@code MapType} complex type.
 * <p><b>Properties</b><ul>
 * <li>"{@link #getComplexTypeMap complexTypeMap}"
 * <blockquote>Property of type {@code java.util.Map<Integer,org.jomc.model.Text>}.
 * </blockquote></li>
 * <li>"{@link #getFileMap fileMap}"
 * <blockquote>Property of type {@code java.util.Map<java.io.File,java.io.File>}.
 * </blockquote></li>
 * <li>"{@link #getMapOfMaps mapOfMaps}"
 * <blockquote>Property of type {@code java.util.Map<java.util.Map<String,String>,java.util.Map<String,String>>}.
 * </blockquote></li>
 * <li>"{@link #getPrimitiveMap primitiveMap}"
 * <blockquote>Property of type {@code java.util.Map<Integer,Integer>}.
 * </blockquote></li>
 * <li>"{@link #getStringMap stringMap}"
 * <blockquote>Property of type {@code java.util.Map<String,String>}.
 * </blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
// </editor-fold>
// SECTION-END
public class MapTypeTest
{
    // SECTION-START[MapTypeTest]

    @Test public void testPrimitiveMap() throws Exception
    {
        assertEquals( 5, this.getPrimitiveMap().size() );
        assertEquals( (Integer) 1, this.getPrimitiveMap().get( 1 ) );
        assertEquals( (Integer) 2, this.getPrimitiveMap().get( 2 ) );
        assertEquals( (Integer) 3, this.getPrimitiveMap().get( 3 ) );
        assertEquals( (Integer) 4, this.getPrimitiveMap().get( 4 ) );
        assertEquals( (Integer) 5, this.getPrimitiveMap().get( 5 ) );
    }

    @Test public void testStringMap() throws Exception
    {
        assertEquals( 5, this.getStringMap().size() );
        assertEquals( "String 1", this.getStringMap().get( "String 1" ) );
        assertEquals( "String 2", this.getStringMap().get( "String 2" ) );
        assertEquals( "String 3", this.getStringMap().get( "String 3" ) );
        assertEquals( "String 4", this.getStringMap().get( "String 4" ) );
        assertEquals( "String 5", this.getStringMap().get( "String 5" ) );
    }

    @Test public void testFileMap() throws Exception
    {
        assertEquals( 5, this.getFileMap().size() );
        assertEquals( new File( "/tmp/1" ), this.getFileMap().get( new File( "/tmp/1" ) ) );
        assertEquals( new File( "/tmp/2" ), this.getFileMap().get( new File( "/tmp/2" ) ) );
        assertEquals( new File( "/tmp/3" ), this.getFileMap().get( new File( "/tmp/3" ) ) );
        assertEquals( new File( "/tmp/4" ), this.getFileMap().get( new File( "/tmp/4" ) ) );
        assertEquals( new File( "/tmp/5" ), this.getFileMap().get( new File( "/tmp/5" ) ) );
    }

    @Test public void testComplexTypeMap() throws Exception
    {
        assertEquals( 5, this.getComplexTypeMap().size() );

        for ( int i = 1; i < 6; i++ )
        {
            assertEquals( "Text " + i, this.getComplexTypeMap().get( i ).getValue() );
        }
    }

    @Test public void testMapOfMaps() throws Exception
    {
        assertEquals( 5, this.getMapOfMaps().size() );
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code MapTypeTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
    public MapTypeTest()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code complexTypeMap} property.
     * @return The value of the {@code complexTypeMap} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
    private java.util.Map<Integer,org.jomc.model.Text> getComplexTypeMap()
    {
        final java.util.Map<Integer,org.jomc.model.Text> _p = (java.util.Map<Integer,org.jomc.model.Text>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "complexTypeMap" );
        assert _p != null : "'complexTypeMap' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code fileMap} property.
     * @return The value of the {@code fileMap} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
    private java.util.Map<java.io.File,java.io.File> getFileMap()
    {
        final java.util.Map<java.io.File,java.io.File> _p = (java.util.Map<java.io.File,java.io.File>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "fileMap" );
        assert _p != null : "'fileMap' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code mapOfMaps} property.
     * @return The value of the {@code mapOfMaps} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
    private java.util.Map<java.util.Map<String,String>,java.util.Map<String,String>> getMapOfMaps()
    {
        final java.util.Map<java.util.Map<String,String>,java.util.Map<String,String>> _p = (java.util.Map<java.util.Map<String,String>,java.util.Map<String,String>>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "mapOfMaps" );
        assert _p != null : "'mapOfMaps' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code primitiveMap} property.
     * @return The value of the {@code primitiveMap} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
    private java.util.Map<Integer,Integer> getPrimitiveMap()
    {
        final java.util.Map<Integer,Integer> _p = (java.util.Map<Integer,Integer>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "primitiveMap" );
        assert _p != null : "'primitiveMap' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code stringMap} property.
     * @return The value of the {@code stringMap} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-18/jomc-tools" )
    private java.util.Map<String,String> getStringMap()
    {
        final java.util.Map<String,String> _p = (java.util.Map<String,String>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "stringMap" );
        assert _p != null : "'stringMap' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
