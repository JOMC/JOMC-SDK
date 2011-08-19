// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (C) 2009 - 2011 The JOMC Project
 *   Copyright (C) 2005 - 2011 Christian Schulte <schulte2005@users.sourceforge.net>
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
package org.jomc.sdk.model.support;

import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * JAXP {@code XMLReader} factory implementation.
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="2" nowrap><font size="+2">Implementation</font></th>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Identifier:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code JOMC :: JAXP SAX XML Reader Factory}</td>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Name:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code JOMC SDK}</td>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Flags:</b></td>
 *       <td class="TableRowColor" align="left" nowrap> {@code stateless}</td>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Version:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code 1.0-beta-3-SNAPSHOT}</td>
 *     </tr>
 *   </table>
 * </p>
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="4" nowrap><font size="+2">Specifications</font></th>
 *     </tr>
 *     <tr class="TableSubHeadingColor">
 *       <td align="left" scope="col" nowrap><b>Identifier</b></td>
 *       <td align="left" scope="col" nowrap><b>Class</b></td>
 *       <td align="left" scope="col" nowrap><b>Scope</b></td>
 *       <td align="left" scope="col" nowrap><b>Version</b></td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" nowrap>{@code org.xml.sax.XMLReader}</td>
 *       <td align="left" nowrap>{@code org.xml.sax.XMLReader}</td>
 *       <td align="left" nowrap>{@code Multiton}</td>
 *       <td align="left" nowrap></td>
 *     </tr>
 *   </table>
 * </p>
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="4" nowrap><font size="+2">Properties</font></th>
 *     </tr>
 *     <tr class="TableSubHeadingColor">
 *       <td align="left" scope="col" nowrap><b>Name</b></td>
 *       <td align="left" scope="col" nowrap><b>Type</b></td>
 *       <td align="left" scope="col" nowrap><b>Flags</b></td>
 *       <td align="left" scope="col" nowrap><b>Documentation</b></td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isXIncludeAware XIncludeAware}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce XInclude aware parsers; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isContentHandlerIgnored contentHandlerIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setContentHandler(org.xml.sax.ContentHandler)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isDtdHandlerIgnored dtdHandlerIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setDTDHandler(org.xml.sax.DTDHandler)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isEntityResolverIgnored entityResolverIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setEntityResolver(org.xml.sax.EntityResolver)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isErrorHandlerIgnored errorHandlerIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setErrorHandler(org.xml.sax.ErrorHandler)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getFeatures features}</td>
 *       <td align="left" valign="top" nowrap>{@code java.util.Map<String,Boolean>}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">See {@link org.xml.sax.XMLReader#setFeature(java.lang.String, boolean)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isNamespaceAware namespaceAware}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which are namespace aware; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getProperties properties}</td>
 *       <td align="left" valign="top" nowrap>{@code java.util.Map<String,Object>}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">See {@link org.xml.sax.XMLReader#setProperty(java.lang.String, java.lang.Object)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isSchemaIgnored schemaIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code schema} dependency is ignored. See {@link javax.xml.parsers.SAXParserFactory#setSchema(javax.xml.validation.Schema)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isValidating validating}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which validate the XML content during parse; {@code false} otherwise.</td>
 *     </tr>
 *   </table>
 * </p>
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="3" nowrap><font size="+2">Dependencies</font></th>
 *     </tr>
 *     <tr class="TableSubHeadingColor">
 *       <td align="left" scope="col" nowrap><b>Name</b></td>
 *       <td align="left" scope="col" nowrap><b>Flags</b></td>
 *       <td align="left" scope="col" nowrap><b>Description</b></td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getContentHandler contentHandler}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Dependency on the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.ContentHandler'} {@code (org.xml.sax.ContentHandler)} specification bound to an instance.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getDtdHandler dtdHandler}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Dependency on the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.DTDHandler'} {@code (org.xml.sax.DTDHandler)} specification bound to an instance.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getEntityResolver entityResolver}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Dependency on the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.EntityResolver'} {@code (org.xml.sax.EntityResolver)} specification bound to an instance.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getErrorHandler errorHandler}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Dependency on the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.ErrorHandler'} {@code (org.xml.sax.ErrorHandler)} specification bound to an instance.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getSchema schema}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Dependency on the {@code 'JOMC SDK Model Default'} object of the {@code 'javax.xml.validation.Schema'} {@code (javax.xml.validation.Schema)} specification bound to an instance.</td>
 *     </tr>
 *   </table>
 * </p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public final class JaxpSaxXmlReaderFactory
{
    // SECTION-START[XMLReader]
    // SECTION-END
    // SECTION-START[JaxpSaxXmlReaderFactory]

    public XMLReader getObject() throws ParserConfigurationException, SAXException
    {
        final SAXParserFactory f = SAXParserFactory.newInstance();

        if ( !this.isSchemaIgnored() )
        {
            f.setSchema( this.getSchema() );
        }

        f.setNamespaceAware( this.isNamespaceAware() );
        f.setValidating( this.isValidating() );
        f.setXIncludeAware( this.isXIncludeAware() );

        final SAXParser p = f.newSAXParser();
        final XMLReader r = p.getXMLReader();

        if ( !this.isContentHandlerIgnored() )
        {
            r.setContentHandler( this.getContentHandler() );
        }

        if ( !this.isDtdHandlerIgnored() )
        {
            r.setDTDHandler( this.getDtdHandler() );
        }

        if ( !this.isEntityResolverIgnored() )
        {
            r.setEntityResolver( this.getEntityResolver() );
        }

        if ( !this.isErrorHandlerIgnored() )
        {
            r.setErrorHandler( this.getErrorHandler() );
        }

        for ( Map.Entry<String, Boolean> e : this.getFeatures().entrySet() )
        {
            r.setFeature( e.getKey(), e.getValue() );
        }

        for ( Map.Entry<String, Object> e : this.getProperties().entrySet() )
        {
            r.setProperty( e.getKey(), e.getValue() );
        }

        return r;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxpSaxXmlReaderFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JaxpSaxXmlReaderFactory()
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
     * Gets the {@code contentHandler} dependency.
     * <p>This method returns the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.ContentHandler'} {@code (org.xml.sax.ContentHandler)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code contentHandler} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.xml.sax.ContentHandler getContentHandler()
    {
        return (org.xml.sax.ContentHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "contentHandler" );
    }

    /**
     * Gets the {@code dtdHandler} dependency.
     * <p>This method returns the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.DTDHandler'} {@code (org.xml.sax.DTDHandler)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code dtdHandler} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.xml.sax.DTDHandler getDtdHandler()
    {
        return (org.xml.sax.DTDHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "dtdHandler" );
    }

    /**
     * Gets the {@code entityResolver} dependency.
     * <p>This method returns the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.EntityResolver'} {@code (org.xml.sax.EntityResolver)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code entityResolver} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.xml.sax.EntityResolver getEntityResolver()
    {
        return (org.xml.sax.EntityResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "entityResolver" );
    }

    /**
     * Gets the {@code errorHandler} dependency.
     * <p>This method returns the {@code 'JOMC SDK Model Default'} object of the {@code 'org.xml.sax.ErrorHandler'} {@code (org.xml.sax.ErrorHandler)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code errorHandler} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.xml.sax.ErrorHandler getErrorHandler()
    {
        return (org.xml.sax.ErrorHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "errorHandler" );
    }

    /**
     * Gets the {@code schema} dependency.
     * <p>This method returns the {@code 'JOMC SDK Model Default'} object of the {@code 'javax.xml.validation.Schema'} {@code (javax.xml.validation.Schema)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code schema} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private javax.xml.validation.Schema getSchema()
    {
        return (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "schema" );
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code XIncludeAware} property.
     * @return {@code true} if the factory is configured to produce XInclude aware parsers; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isXIncludeAware()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "XIncludeAware" );
        assert _p != null : "'XIncludeAware' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code contentHandlerIgnored} property.
     * @return Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setContentHandler(org.xml.sax.ContentHandler)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isContentHandlerIgnored()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "contentHandlerIgnored" );
        assert _p != null : "'contentHandlerIgnored' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code dtdHandlerIgnored} property.
     * @return Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setDTDHandler(org.xml.sax.DTDHandler)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isDtdHandlerIgnored()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "dtdHandlerIgnored" );
        assert _p != null : "'dtdHandlerIgnored' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code entityResolverIgnored} property.
     * @return Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setEntityResolver(org.xml.sax.EntityResolver)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isEntityResolverIgnored()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "entityResolverIgnored" );
        assert _p != null : "'entityResolverIgnored' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code errorHandlerIgnored} property.
     * @return Flag indicating the {@code schema} dependency is ignored. See {@link org.xml.sax.XMLReader#setErrorHandler(org.xml.sax.ErrorHandler)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isErrorHandlerIgnored()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "errorHandlerIgnored" );
        assert _p != null : "'errorHandlerIgnored' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code features} property.
     * @return See {@link org.xml.sax.XMLReader#setFeature(java.lang.String, boolean)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Boolean> getFeatures()
    {
        final java.util.Map<String,Boolean> _p = (java.util.Map<String,Boolean>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "features" );
        assert _p != null : "'features' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code namespaceAware} property.
     * @return {@code true} if the factory is configured to produce parsers which are namespace aware; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isNamespaceAware()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "namespaceAware" );
        assert _p != null : "'namespaceAware' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code properties} property.
     * @return See {@link org.xml.sax.XMLReader#setProperty(java.lang.String, java.lang.Object)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Object> getProperties()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "properties" );
        assert _p != null : "'properties' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code schemaIgnored} property.
     * @return Flag indicating the {@code schema} dependency is ignored. See {@link javax.xml.parsers.SAXParserFactory#setSchema(javax.xml.validation.Schema)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isSchemaIgnored()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "schemaIgnored" );
        assert _p != null : "'schemaIgnored' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code validating} property.
     * @return {@code true} if the factory is configured to produce parsers which validate the XML content during parse; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isValidating()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "validating" );
        assert _p != null : "'validating' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
