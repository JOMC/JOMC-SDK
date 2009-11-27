// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2009 The JOMC Project
 *   Copyright (c) 2005 Christian Schulte <cs@jomc.org>
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
package org.jomc.sdk.xml.test;

import junit.framework.Assert;
import junit.framework.TestCase;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Test cases for the {@code JOMC SDK Model} implementation.
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getContext Context}"<blockquote>
 * Dependency on {@code javax.xml.bind.JAXBContext} bound to an instance.</blockquote></li>
 * <li>"{@link #getEntityResolver EntityResolver}"<blockquote>
 * Dependency on {@code org.xml.sax.EntityResolver} bound to an instance.</blockquote></li>
 * <li>"{@link #getMarshaller Marshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Marshaller} bound to an instance.</blockquote></li>
 * <li>"{@link #getResourceResolver ResourceResolver}"<blockquote>
 * Dependency on {@code org.w3c.dom.ls.LSResourceResolver} bound to an instance.</blockquote></li>
 * <li>"{@link #getSchema Schema}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
 * <li>"{@link #getUnmarshaller Unmarshaller}"<blockquote>
 * Dependency on {@code javax.xml.bind.Unmarshaller} bound to an instance.</blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:cs@jomc.org">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
// </editor-fold>
// SECTION-END
public class ModelTest extends TestCase
{
    // SECTION-START[ModelTest]

    public void testContext() throws Exception
    {
        Assert.assertNotNull( this.getContext() );
    }

    public void testMarshaller() throws Exception
    {
        Assert.assertNotNull( this.getMarshaller() );
    }

    public void testUnmarshaller() throws Exception
    {
        Assert.assertNotNull( this.getUnmarshaller() );
    }

    public void testSchema() throws Exception
    {
        Assert.assertNotNull( this.getSchema() );
    }

    public void testEntityResolver() throws Exception
    {
        Assert.assertNotNull( this.getEntityResolver() );
    }

    public void testResourceResolver() throws Exception
    {
        Assert.assertNotNull( this.getResourceResolver() );
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code ModelTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
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
     * Gets the {@code Context} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code javax.xml.bind.JAXBContext} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Context} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    private javax.xml.bind.JAXBContext getContext()
    {
        final javax.xml.bind.JAXBContext _d = (javax.xml.bind.JAXBContext) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Context" );
        assert _d != null : "'Context' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code EntityResolver} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code org.xml.sax.EntityResolver} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code EntityResolver} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    private org.xml.sax.EntityResolver getEntityResolver()
    {
        final org.xml.sax.EntityResolver _d = (org.xml.sax.EntityResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "EntityResolver" );
        assert _d != null : "'EntityResolver' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code Marshaller} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code javax.xml.bind.Marshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Marshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    private javax.xml.bind.Marshaller getMarshaller()
    {
        final javax.xml.bind.Marshaller _d = (javax.xml.bind.Marshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Marshaller" );
        assert _d != null : "'Marshaller' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code ResourceResolver} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code org.w3c.dom.ls.LSResourceResolver} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code ResourceResolver} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    private org.w3c.dom.ls.LSResourceResolver getResourceResolver()
    {
        final org.w3c.dom.ls.LSResourceResolver _d = (org.w3c.dom.ls.LSResourceResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "ResourceResolver" );
        assert _d != null : "'ResourceResolver' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code Schema} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code javax.xml.validation.Schema} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Schema} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    private javax.xml.validation.Schema getSchema()
    {
        final javax.xml.validation.Schema _d = (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Schema" );
        assert _d != null : "'Schema' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code Unmarshaller} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code javax.xml.bind.Unmarshaller} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Unmarshaller} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-10/jomc-tools" )
    private javax.xml.bind.Unmarshaller getUnmarshaller()
    {
        final javax.xml.bind.Unmarshaller _d = (javax.xml.bind.Unmarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Unmarshaller" );
        assert _d != null : "'Unmarshaller' dependency not found.";
        return _d;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
