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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Test cases for the {@code Test XML Schema Set}.
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getCustomMarshaller CustomMarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Marshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getCustomUnmarshaller CustomUnmarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Unmarshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultContext DefaultContext}"<blockquote>
 * Dependency on {@code javax.xml.bind.JAXBContext} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultEntityResolver DefaultEntityResolver}"<blockquote>
 * Dependency on {@code org.xml.sax.EntityResolver} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultMarshaller DefaultMarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Marshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultResourceResolver DefaultResourceResolver}"<blockquote>
 * Dependency on {@code org.w3c.dom.ls.LSResourceResolver} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultSchema DefaultSchema}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
 * <li>"{@link #getDefaultUnmarshaller DefaultUnmarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Unmarshaller} bound to an instance.</blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
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

    @Test public void testDefaultEntityResolver() throws Exception
    {
        assertNotNull( this.getDefaultEntityResolver() );
    }

    @Test public void testDefaultResourceResolver() throws Exception
    {
        assertNotNull( this.getDefaultResourceResolver() );
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code ModelTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
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
     * <dt>"{@code jaxpSchemaValidation}"</dt>
     * <dd>Property of type {@code boolean}.
     * </dd>
     * </dl>
     * @return The {@code CustomMarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
    private javax.xml.bind.Marshaller getCustomMarshaller()
    {
        final javax.xml.bind.Marshaller _d = (javax.xml.bind.Marshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomMarshaller" );
        assert _d != null : "'CustomMarshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code CustomUnmarshaller} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Unmarshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code jaxpSchemaValidation}"</dt>
     * <dd>Property of type {@code boolean}.
     * </dd>
     * </dl>
     * @return The {@code CustomUnmarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
    private javax.xml.bind.Unmarshaller getCustomUnmarshaller()
    {
        final javax.xml.bind.Unmarshaller _d = (javax.xml.bind.Unmarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "CustomUnmarshaller" );
        assert _d != null : "'CustomUnmarshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultContext} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.JAXBContext} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultContext} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
    private javax.xml.bind.JAXBContext getDefaultContext()
    {
        final javax.xml.bind.JAXBContext _d = (javax.xml.bind.JAXBContext) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultContext" );
        assert _d != null : "'DefaultContext' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultEntityResolver} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code org.xml.sax.EntityResolver} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultEntityResolver} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
    private org.xml.sax.EntityResolver getDefaultEntityResolver()
    {
        final org.xml.sax.EntityResolver _d = (org.xml.sax.EntityResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultEntityResolver" );
        assert _d != null : "'DefaultEntityResolver' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultMarshaller} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.bind.Marshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultMarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
    private org.w3c.dom.ls.LSResourceResolver getDefaultResourceResolver()
    {
        final org.w3c.dom.ls.LSResourceResolver _d = (org.w3c.dom.ls.LSResourceResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultResourceResolver" );
        assert _d != null : "'DefaultResourceResolver' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code DefaultSchema} dependency.
     * <p>This method returns the "{@code Test XML Schema Set}" object of the {@code javax.xml.validation.Schema} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code DefaultSchema} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-4", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-4/jomc-tools" )
    private javax.xml.bind.Unmarshaller getDefaultUnmarshaller()
    {
        final javax.xml.bind.Unmarshaller _d = (javax.xml.bind.Unmarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "DefaultUnmarshaller" );
        assert _d != null : "'DefaultUnmarshaller' dependency not found.";
        return _d;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
