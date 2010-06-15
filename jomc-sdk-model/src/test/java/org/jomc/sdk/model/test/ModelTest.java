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

import javax.xml.bind.Marshaller;
import org.jomc.ObjectManagementException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Test;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Test cases for the {@code Test XML Schema Set}.
 * <p><b>Properties</b><ul>
 * <li>"{@link #getSysIllegalSubstitution sysIllegalSubstitution}"
 * <blockquote>Property of type {@code java.lang.String}.
 * </blockquote></li>
 * <li>"{@link #getSysUserDir sysUserDir}"
 * <blockquote>Property of type {@code java.lang.String}.
 * </blockquote></li>
 * <li>"{@link #getSysUserHome sysUserHome}"
 * <blockquote>Property of type {@code java.lang.String}.
 * </blockquote></li>
 * <li>"{@link #getSysUserName sysUserName}"
 * <blockquote>Property of type {@code java.lang.String}.
 * </blockquote></li>
 * <li>"{@link #getSysUserNameAndHomeAndDir sysUserNameAndHomeAndDir}"
 * <blockquote>Property of type {@code java.lang.String}.
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getCustomMarshaller CustomMarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Marshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomSaxParser CustomSaxParser}"<blockquote>
 * Dependency on {@code javax.xml.parsers.SAXParser} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomSaxXmlReader CustomSaxXmlReader}"<blockquote>
 * Dependency on {@code org.xml.sax.XMLReader} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomSchema CustomSchema}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomSchemaUnrecognizedFeature CustomSchemaUnrecognizedFeature}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomSchemaUnrecognizedProperty CustomSchemaUnrecognizedProperty}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomUnmarshaller CustomUnmarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Unmarshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomValidatorHandlerUnrecognizedFeature CustomValidatorHandlerUnrecognizedFeature}"<blockquote>
 * Dependency on {@code javax.xml.validation.ValidatorHandler} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomValidatorHandlerUnrecognizedProperty CustomValidatorHandlerUnrecognizedProperty}"<blockquote>
 * Dependency on {@code javax.xml.validation.ValidatorHandler} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomValidatorUnrecognizedFeature CustomValidatorUnrecognizedFeature}"<blockquote>
 * Dependency on {@code javax.xml.validation.Validator} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomValidatorUnrecognizedProperty CustomValidatorUnrecognizedProperty}"<blockquote>
 * Dependency on {@code javax.xml.validation.Validator} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultBinder DefaultBinder}"<blockquote>
 * Dependency on {@code javax.xml.bind.Binder} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultContentHandler DefaultContentHandler}"<blockquote>
 * Dependency on {@code org.xml.sax.ContentHandler} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultContext DefaultContext}"<blockquote>
 * Dependency on {@code javax.xml.bind.JAXBContext} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultDocumentBuilder DefaultDocumentBuilder}"<blockquote>
 * Dependency on {@code javax.xml.parsers.DocumentBuilder} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultEntityResolver DefaultEntityResolver}"<blockquote>
 * Dependency on {@code org.xml.sax.EntityResolver} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultIntrospector DefaultIntrospector}"<blockquote>
 * Dependency on {@code javax.xml.bind.JAXBIntrospector} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultMarshaller DefaultMarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Marshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultResourceResolver DefaultResourceResolver}"<blockquote>
 * Dependency on {@code org.w3c.dom.ls.LSResourceResolver} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultSaxParser DefaultSaxParser}"<blockquote>
 * Dependency on {@code javax.xml.parsers.SAXParser} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultSaxXmlReader DefaultSaxXmlReader}"<blockquote>
 * Dependency on {@code org.xml.sax.XMLReader} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultSchema DefaultSchema}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultUnmarshaller DefaultUnmarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Unmarshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultValidator DefaultValidator}"<blockquote>
 * Dependency on {@code javax.xml.validation.Validator} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultValidatorHandler DefaultValidatorHandler}"<blockquote>
 * Dependency on {@code javax.xml.validation.ValidatorHandler} bound to an instance.</blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
// </editor-fold>
// SECTION-END
public class ModelTest
{
    // SECTION-START[ModelTest]

    @Test public void testDefaultContext() throws Exception
    {
        assertNotNull( this.getDefaultContext() );
    }

    @Test public void testDefaultMarshaller() throws Exception
    {
        assertNotNull( this.getDefaultMarshaller() );
        assertEquals( "UTF-8", this.getDefaultMarshaller().getProperty( Marshaller.JAXB_ENCODING ) );
        assertEquals( Boolean.FALSE, this.getDefaultMarshaller().getProperty( Marshaller.JAXB_FORMATTED_OUTPUT ) );
        assertEquals( Boolean.TRUE, this.getDefaultMarshaller().getProperty( Marshaller.JAXB_FRAGMENT ) );
        assertNull( this.getDefaultMarshaller().getProperty( Marshaller.JAXB_SCHEMA_LOCATION ) );
        assertNull( this.getDefaultMarshaller().getProperty( Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION ) );
        assertNull( this.getDefaultMarshaller().getSchema() );
    }

    @Test public void testCustomMarshaller() throws Exception
    {
        assertNotNull( this.getCustomMarshaller() );
        assertEquals( "US-ASCII", this.getCustomMarshaller().getProperty( Marshaller.JAXB_ENCODING ) );
        assertEquals( Boolean.TRUE, this.getCustomMarshaller().getProperty( Marshaller.JAXB_FORMATTED_OUTPUT ) );
        assertEquals( Boolean.FALSE, this.getCustomMarshaller().getProperty( Marshaller.JAXB_FRAGMENT ) );
        assertNotNull( this.getCustomMarshaller().getProperty( Marshaller.JAXB_SCHEMA_LOCATION ) );
        assertNotNull( this.getCustomMarshaller().getProperty( Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION ) );
        assertNotNull( this.getCustomMarshaller().getSchema() );
    }

    @Test public void testDefaultUnmarshaller() throws Exception
    {
        assertNotNull( this.getDefaultUnmarshaller() );
        assertNull( this.getDefaultUnmarshaller().getSchema() );
    }

    @Test public void testCustomUnmarshaller() throws Exception
    {
        assertNotNull( this.getCustomUnmarshaller() );
        assertNotNull( this.getCustomUnmarshaller().getSchema() );
    }

    @Test public void testDefaultSchema() throws Exception
    {
        assertNotNull( this.getDefaultSchema() );
    }

    @Test public void testCustomSchema() throws Exception
    {
        assertNotNull( this.getCustomSchema() );
    }

    @Test public void testCustomSchemaUnrecognizedFeature() throws Exception
    {
        try
        {
            assertNotNull( this.getCustomSchemaUnrecognizedFeature() );
            fail( "Expected 'ObjectManagementException' not thrown." );
        }
        catch ( final ObjectManagementException e )
        {
            assertNotNull( e.getMessage() );
            System.out.println( e );
        }
    }

    @Test public void testCustomSchemaUnrecognizedProperty() throws Exception
    {
        try
        {
            assertNotNull( this.getCustomSchemaUnrecognizedProperty() );
            fail( "Expected 'ObjectManagementException' not thrown." );
        }
        catch ( final ObjectManagementException e )
        {
            assertNotNull( e.getMessage() );
            System.out.println( e );
        }
    }

    @Test public void testDefaultValidator() throws Exception
    {
        assertNotNull( this.getDefaultValidator() );
    }

    @Test public void testCustomValidatorUnrecognizedFeature() throws Exception
    {
        try
        {
            assertNotNull( this.getCustomValidatorUnrecognizedFeature() );
            fail( "Expected 'ObjectManagementException' not thrown." );
        }
        catch ( final ObjectManagementException e )
        {
            assertNotNull( e.getMessage() );
            System.out.println( e );
        }
    }

    @Test public void testCustomValidatorUnrecognizedProperty() throws Exception
    {
        try
        {
            assertNotNull( this.getCustomValidatorUnrecognizedProperty() );
            fail( "Expected 'ObjectManagementException' not thrown." );
        }
        catch ( final ObjectManagementException e )
        {
            assertNotNull( e.getMessage() );
            System.out.println( e );
        }
    }

    @Test public void testDefaultValidatorHandler() throws Exception
    {
        assertNotNull( this.getDefaultValidatorHandler() );
    }

    @Test public void testCustomValidatorHandlerUnrecognizedFeature() throws Exception
    {
        try
        {
            assertNotNull( this.getCustomValidatorHandlerUnrecognizedFeature() );
            fail( "Expected 'ObjectManagementException' not thrown." );
        }
        catch ( final ObjectManagementException e )
        {
            assertNotNull( e.getMessage() );
            System.out.println( e );
        }
    }

    @Test public void testCustomValidatorHandlerUnrecognizedProperty() throws Exception
    {
        try
        {
            assertNotNull( this.getCustomValidatorHandlerUnrecognizedProperty() );
            fail( "Expected 'ObjectManagementException' not thrown." );
        }
        catch ( final ObjectManagementException e )
        {
            assertNotNull( e.getMessage() );
            System.out.println( e );
        }
    }

    @Test public void testDefaultContentHandler() throws Exception
    {
        assertNotNull( this.getDefaultContentHandler() );
    }

    @Test public void testDefaultEntityResolver() throws Exception
    {
        assertNotNull( this.getDefaultEntityResolver() );
    }

    @Test public void testDefaultResourceResolver() throws Exception
    {
        assertNotNull( this.getDefaultResourceResolver() );
    }

    @Test public void testDefaultBinder() throws Exception
    {
        assertNotNull( this.getDefaultBinder() );
    }

    @Test public void testDefaultIntrospector() throws Exception
    {
        assertNotNull( this.getDefaultIntrospector() );
    }

    @Test public void testDefaultDocumentBuilder() throws Exception
    {
        assertNotNull( this.getDefaultDocumentBuilder() );
    }

    @Test public void testDefaultSaxParser() throws Exception
    {
        assertNotNull( this.getDefaultSaxParser() );
    }

    @Test public void testCustomSaxParser() throws Exception
    {
        assertNotNull( this.getCustomSaxParser() );
    }

    @Test public void testDefaultSaxXmlReader() throws Exception
    {
        assertNotNull( this.getDefaultSaxXmlReader() );
    }

    @Test public void testCustomSaxXmlReader() throws Exception
    {
        assertNotNull( this.getCustomSaxXmlReader() );
    }

    @Test public void testSystemProperties() throws Exception
    {
        final String userName = System.getProperty( "user.name" );
        final String userHome = System.getProperty( "user.home" );
        final String userDir = System.getProperty( "user.dir" );

        assertEquals( userName, this.getSysUserName() );
        assertEquals( userHome, this.getSysUserHome() );
        assertEquals( userDir, this.getSysUserDir() );
        assertEquals( userName + " AND " + userHome + " AND " + userDir, this.getSysUserNameAndHomeAndDir() );
        assertEquals( "@@user.name AND @@user.home AND @@user.dir", this.getSysIllegalSubstitution() );
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code ModelTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    public ModelTest()
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
     * Gets the {@code CustomMarshaller} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Marshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code jaxbEncoding}"</dt>
     * <dd>Property of type {@code java.lang.String}.
     * </dd>
     * <dt>"{@code jaxbFormattedOutput}"</dt>
     * <dd>Property of type {@code boolean}.
     * </dd>
     * <dt>"{@code jaxbFragment}"</dt>
     * <dd>Property of type {@code boolean}.
     * </dd>
     * <dt>"{@code jaxbSchemaLocation}"</dt>
     * <dd>Property of type {@code boolean}.
     * </dd>
     * <dt>"{@code jaxbNoNamespaceSchemaLocation}"</dt>
     * <dd>Property of type {@code java.lang.String}.
     * </dd>
     * </dl>
     * @return The {@code CustomMarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.Marshaller getCustomMarshaller()
    {
        final javax.xml.bind.Marshaller _d = (javax.xml.bind.Marshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomMarshaller" );
        assert _d != null : "'CustomMarshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomSaxParser} dependency.
     * <p>This method returns the "{@code JOMC SDK}" object of the {@code javax.xml.parsers.SAXParser} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code CustomSaxParser} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.parsers.SAXParser getCustomSaxParser()
    {
        final javax.xml.parsers.SAXParser _d = (javax.xml.parsers.SAXParser) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomSaxParser" );
        assert _d != null : "'CustomSaxParser' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomSaxXmlReader} dependency.
     * <p>This method returns the "{@code JOMC SDK}" object of the {@code org.xml.sax.XMLReader} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code CustomSaxXmlReader} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private org.xml.sax.XMLReader getCustomSaxXmlReader()
    {
        final org.xml.sax.XMLReader _d = (org.xml.sax.XMLReader) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomSaxXmlReader" );
        assert _d != null : "'CustomSaxXmlReader' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomSchema} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Schema} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code CustomSchema} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Schema getCustomSchema()
    {
        final javax.xml.validation.Schema _d = (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomSchema" );
        assert _d != null : "'CustomSchema' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomSchemaUnrecognizedFeature} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Schema} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code schemaFeatures}"</dt>
     * <dd>Property of type {@code java.util.Map<java.lang.String,java.lang.Boolean>}.
     * </dd>
     * </dl>
     * @return The {@code CustomSchemaUnrecognizedFeature} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Schema getCustomSchemaUnrecognizedFeature()
    {
        final javax.xml.validation.Schema _d = (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomSchemaUnrecognizedFeature" );
        assert _d != null : "'CustomSchemaUnrecognizedFeature' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomSchemaUnrecognizedProperty} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Schema} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code schemaProperties}"</dt>
     * <dd>Property of type {@code java.util.Map<java.lang.String,java.lang.Object>}.
     * </dd>
     * </dl>
     * @return The {@code CustomSchemaUnrecognizedProperty} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Schema getCustomSchemaUnrecognizedProperty()
    {
        final javax.xml.validation.Schema _d = (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomSchemaUnrecognizedProperty" );
        assert _d != null : "'CustomSchemaUnrecognizedProperty' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomUnmarshaller} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Unmarshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code CustomUnmarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.Unmarshaller getCustomUnmarshaller()
    {
        final javax.xml.bind.Unmarshaller _d = (javax.xml.bind.Unmarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomUnmarshaller" );
        assert _d != null : "'CustomUnmarshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomValidatorHandlerUnrecognizedFeature} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.ValidatorHandler} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code validatorHandlerFeatures}"</dt>
     * <dd>Property of type {@code java.util.Map<java.lang.String,java.lang.Boolean>}.
     * </dd>
     * </dl>
     * @return The {@code CustomValidatorHandlerUnrecognizedFeature} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.ValidatorHandler getCustomValidatorHandlerUnrecognizedFeature()
    {
        final javax.xml.validation.ValidatorHandler _d = (javax.xml.validation.ValidatorHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomValidatorHandlerUnrecognizedFeature" );
        assert _d != null : "'CustomValidatorHandlerUnrecognizedFeature' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomValidatorHandlerUnrecognizedProperty} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.ValidatorHandler} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code validatorHandlerProperties}"</dt>
     * <dd>Property of type {@code java.util.Map<java.lang.String,java.lang.Object>}.
     * </dd>
     * </dl>
     * @return The {@code CustomValidatorHandlerUnrecognizedProperty} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.ValidatorHandler getCustomValidatorHandlerUnrecognizedProperty()
    {
        final javax.xml.validation.ValidatorHandler _d = (javax.xml.validation.ValidatorHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomValidatorHandlerUnrecognizedProperty" );
        assert _d != null : "'CustomValidatorHandlerUnrecognizedProperty' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomValidatorUnrecognizedFeature} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Validator} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code validatorFeatures}"</dt>
     * <dd>Property of type {@code java.util.Map<java.lang.String,java.lang.Boolean>}.
     * </dd>
     * </dl>
     * @return The {@code CustomValidatorUnrecognizedFeature} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Validator getCustomValidatorUnrecognizedFeature()
    {
        final javax.xml.validation.Validator _d = (javax.xml.validation.Validator) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomValidatorUnrecognizedFeature" );
        assert _d != null : "'CustomValidatorUnrecognizedFeature' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomValidatorUnrecognizedProperty} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Validator} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code validatorProperties}"</dt>
     * <dd>Property of type {@code java.util.Map<java.lang.String,java.lang.Object>}.
     * </dd>
     * </dl>
     * @return The {@code CustomValidatorUnrecognizedProperty} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Validator getCustomValidatorUnrecognizedProperty()
    {
        final javax.xml.validation.Validator _d = (javax.xml.validation.Validator) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomValidatorUnrecognizedProperty" );
        assert _d != null : "'CustomValidatorUnrecognizedProperty' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultBinder} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Binder} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultBinder} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.Binder getDefaultBinder()
    {
        final javax.xml.bind.Binder _d = (javax.xml.bind.Binder) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultBinder" );
        assert _d != null : "'DefaultBinder' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultContentHandler} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code org.xml.sax.ContentHandler} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultContentHandler} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private org.xml.sax.ContentHandler getDefaultContentHandler()
    {
        final org.xml.sax.ContentHandler _d = (org.xml.sax.ContentHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultContentHandler" );
        assert _d != null : "'DefaultContentHandler' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultContext} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.JAXBContext} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultContext} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.JAXBContext getDefaultContext()
    {
        final javax.xml.bind.JAXBContext _d = (javax.xml.bind.JAXBContext) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultContext" );
        assert _d != null : "'DefaultContext' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultDocumentBuilder} dependency.
     * <p>This method returns the "{@code JOMC SDK}" object of the {@code javax.xml.parsers.DocumentBuilder} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultDocumentBuilder} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.parsers.DocumentBuilder getDefaultDocumentBuilder()
    {
        final javax.xml.parsers.DocumentBuilder _d = (javax.xml.parsers.DocumentBuilder) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultDocumentBuilder" );
        assert _d != null : "'DefaultDocumentBuilder' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultEntityResolver} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code org.xml.sax.EntityResolver} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultEntityResolver} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private org.xml.sax.EntityResolver getDefaultEntityResolver()
    {
        final org.xml.sax.EntityResolver _d = (org.xml.sax.EntityResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultEntityResolver" );
        assert _d != null : "'DefaultEntityResolver' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultIntrospector} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.JAXBIntrospector} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultIntrospector} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.JAXBIntrospector getDefaultIntrospector()
    {
        final javax.xml.bind.JAXBIntrospector _d = (javax.xml.bind.JAXBIntrospector) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultIntrospector" );
        assert _d != null : "'DefaultIntrospector' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultMarshaller} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Marshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultMarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.Marshaller getDefaultMarshaller()
    {
        final javax.xml.bind.Marshaller _d = (javax.xml.bind.Marshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultMarshaller" );
        assert _d != null : "'DefaultMarshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultResourceResolver} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code org.w3c.dom.ls.LSResourceResolver} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultResourceResolver} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private org.w3c.dom.ls.LSResourceResolver getDefaultResourceResolver()
    {
        final org.w3c.dom.ls.LSResourceResolver _d = (org.w3c.dom.ls.LSResourceResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultResourceResolver" );
        assert _d != null : "'DefaultResourceResolver' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultSaxParser} dependency.
     * <p>This method returns the "{@code JOMC SDK}" object of the {@code javax.xml.parsers.SAXParser} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultSaxParser} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.parsers.SAXParser getDefaultSaxParser()
    {
        final javax.xml.parsers.SAXParser _d = (javax.xml.parsers.SAXParser) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultSaxParser" );
        assert _d != null : "'DefaultSaxParser' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultSaxXmlReader} dependency.
     * <p>This method returns the "{@code JOMC SDK}" object of the {@code org.xml.sax.XMLReader} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultSaxXmlReader} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private org.xml.sax.XMLReader getDefaultSaxXmlReader()
    {
        final org.xml.sax.XMLReader _d = (org.xml.sax.XMLReader) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultSaxXmlReader" );
        assert _d != null : "'DefaultSaxXmlReader' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultSchema} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Schema} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultSchema} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Schema getDefaultSchema()
    {
        final javax.xml.validation.Schema _d = (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultSchema" );
        assert _d != null : "'DefaultSchema' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultUnmarshaller} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Unmarshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultUnmarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.Unmarshaller getDefaultUnmarshaller()
    {
        final javax.xml.bind.Unmarshaller _d = (javax.xml.bind.Unmarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultUnmarshaller" );
        assert _d != null : "'DefaultUnmarshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultValidator} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Validator} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultValidator} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Validator getDefaultValidator()
    {
        final javax.xml.validation.Validator _d = (javax.xml.validation.Validator) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultValidator" );
        assert _d != null : "'DefaultValidator' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultValidatorHandler} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.ValidatorHandler} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultValidatorHandler} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.ValidatorHandler getDefaultValidatorHandler()
    {
        final javax.xml.validation.ValidatorHandler _d = (javax.xml.validation.ValidatorHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultValidatorHandler" );
        assert _d != null : "'DefaultValidatorHandler' dependency not found.";
        return _d;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code sysIllegalSubstitution} property.
     * @return The value of the {@code sysIllegalSubstitution} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.String getSysIllegalSubstitution()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "sysIllegalSubstitution" );
        assert _p != null : "'sysIllegalSubstitution' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code sysUserDir} property.
     * @return The value of the {@code sysUserDir} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.String getSysUserDir()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "sysUserDir" );
        assert _p != null : "'sysUserDir' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code sysUserHome} property.
     * @return The value of the {@code sysUserHome} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.String getSysUserHome()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "sysUserHome" );
        assert _p != null : "'sysUserHome' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code sysUserName} property.
     * @return The value of the {@code sysUserName} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.String getSysUserName()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "sysUserName" );
        assert _p != null : "'sysUserName' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code sysUserNameAndHomeAndDir} property.
     * @return The value of the {@code sysUserNameAndHomeAndDir} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.String getSysUserNameAndHomeAndDir()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "sysUserNameAndHomeAndDir" );
        assert _p != null : "'sysUserNameAndHomeAndDir' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
