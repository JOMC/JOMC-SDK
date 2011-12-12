// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (C) Christian Schulte, 2005-206
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
 *   THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 *   INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 *   AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 *   THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *   INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *   NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *   DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *   THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *   THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   $JOMC$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.sdk.model.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.jomc.model.Text;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Test cases for the {@code ListType} complex type.
 *
 * <p>
 *   This implementation is identified by {@code <org.jomc.sdk.model.test.ListTypeTest>}.
 * </p>
 * <dl>
 *   <dt><b>Abstract:</b></dt><dd>No</dd>
 *   <dt><b>Final:</b></dt><dd>No</dd>
 *   <dt><b>Stateless:</b></dt><dd>No</dd>
 * </dl>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version 1.0-beta-3-SNAPSHOT
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public class ListTypeTest
{
    // SECTION-START[ListTypeTest]

    @Test public void testPrimitiveList() throws Exception
    {
        assertEquals( 5, this.getPrimitiveList().size() );
        assertTrue( this.getPrimitiveList().contains( 1 ) );
        assertTrue( this.getPrimitiveList().contains( 2 ) );
        assertTrue( this.getPrimitiveList().contains( 3 ) );
        assertTrue( this.getPrimitiveList().contains( 4 ) );
        assertTrue( this.getPrimitiveList().contains( 5 ) );
    }

    @Test public void testStringList() throws Exception
    {
        assertEquals( 5, this.getStringList().size() );
        assertTrue( this.getStringList().contains( "String 1" ) );
        assertTrue( this.getStringList().contains( "String 2" ) );
        assertTrue( this.getStringList().contains( "String 3" ) );
        assertTrue( this.getStringList().contains( "String 4" ) );
        assertTrue( this.getStringList().contains( "String 5" ) );
    }

    @Test public void testFileList() throws Exception
    {
        assertEquals( 5, this.getFileList().size() );
        assertTrue( this.getFileList().contains( new File( "/tmp/1" ) ) );
        assertTrue( this.getFileList().contains( new File( "/tmp/2" ) ) );
        assertTrue( this.getFileList().contains( new File( "/tmp/3" ) ) );
        assertTrue( this.getFileList().contains( new File( "/tmp/4" ) ) );
        assertTrue( this.getFileList().contains( new File( "/tmp/5" ) ) );
    }

    @Test public void testComplexTypeList() throws Exception
    {
        assertEquals( 5, this.getComplexTypeList().size() );

        final Map<String, Integer> textMap = new HashMap<String, Integer>();
        for ( Text text : this.getComplexTypeList() )
        {
            final Integer i = textMap.get( text.getValue() );
            if ( i == null )
            {
                textMap.put( text.getValue(), 1 );
            }
            else
            {
                textMap.put( text.getValue(), i + 1 );
            }
        }

        assertEquals( (Integer) 1, textMap.get( "Text 1" ) );
        assertEquals( (Integer) 1, textMap.get( "Text 2" ) );
        assertEquals( (Integer) 1, textMap.get( "Text 3" ) );
        assertEquals( (Integer) 1, textMap.get( "Text 4" ) );
        assertEquals( (Integer) 1, textMap.get( "Text 5" ) );
        assertEquals( 5, textMap.size() );
    }

    @Test public void testListOfLists() throws Exception
    {
        assertEquals( 5, this.getListOfLists().size() );
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code ListTypeTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public ListTypeTest()
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
     * Gets the value of the {@code <complexTypeList>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return The value of the {@code <complexTypeList>} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.List<org.jomc.model.Text> getComplexTypeList()
    {
        final java.util.List<org.jomc.model.Text> _p = (java.util.List<org.jomc.model.Text>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "complexTypeList" );
        assert _p != null : "'complexTypeList' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <fileList>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return The value of the {@code <fileList>} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.List<java.io.File> getFileList()
    {
        final java.util.List<java.io.File> _p = (java.util.List<java.io.File>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "fileList" );
        assert _p != null : "'fileList' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <listOfLists>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return The value of the {@code <listOfLists>} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.List<java.util.List<String>> getListOfLists()
    {
        final java.util.List<java.util.List<String>> _p = (java.util.List<java.util.List<String>>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "listOfLists" );
        assert _p != null : "'listOfLists' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <primitiveList>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return The value of the {@code <primitiveList>} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.List<Integer> getPrimitiveList()
    {
        final java.util.List<Integer> _p = (java.util.List<Integer>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "primitiveList" );
        assert _p != null : "'primitiveList' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <stringList>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return The value of the {@code <stringList>} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.List<String> getStringList()
    {
        final java.util.List<String> _p = (java.util.List<String>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "stringList" );
        assert _p != null : "'stringList' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
