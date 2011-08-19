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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * JAXP {@code DocumentBuilder} factory implementation.
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="2" nowrap><font size="+2">Implementation</font></th>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Identifier:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code JOMC :: JAXP Document Builder Factory}</td>
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
 *       <td align="left" nowrap>{@code javax.xml.parsers.DocumentBuilder}</td>
 *       <td align="left" nowrap>{@code javax.xml.parsers.DocumentBuilder}</td>
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
 *       <td align="left" valign="top" nowrap>{@link #getAttributes attributes}</td>
 *       <td align="left" valign="top" nowrap>{@code java.util.Map<String,Object>}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">See {@link javax.xml.parsers.DocumentBuilderFactory#setAttribute(java.lang.String, java.lang.Object)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isCoalescing coalescing}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which convert CDATA nodes to Text nodes and append them to the adjacent (if any) Text node; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isEntityResolverIgnored entityResolverIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code entityResolver} dependency is ignored. See {@link javax.xml.parsers.DocumentBuilder#setEntityResolver(org.xml.sax.EntityResolver)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isErrorHandlerIgnored errorHandlerIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code errorHandler} dependency is ignored. See {@link javax.xml.parsers.DocumentBuilder#setErrorHandler(org.xml.sax.ErrorHandler)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isExpandingEntityReferences expandingEntityReferences}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which expand entity reference nodes; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getFeatures features}</td>
 *       <td align="left" valign="top" nowrap>{@code java.util.Map<String,Boolean>}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">See {@link javax.xml.parsers.DocumentBuilderFactory#setFeature(java.lang.String, boolean)}.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isIgnoringComments ignoringComments}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which ignores comments; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isIgnoringElementContentWhitespace ignoringElementContentWhitespace}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which ignore ignorable whitespace in element content; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isNamespaceAware namespaceAware}</td>
 *       <td align="left" valign="top" nowrap>{@code java.lang.Boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">{@code true} if the factory is configured to produce parsers which are namespace aware; {@code false} otherwise.</td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #isSchemaIgnored schemaIgnored}</td>
 *       <td align="left" valign="top" nowrap>{@code boolean}</td>
 *       <td align="left" valign="top" nowrap>{@code none}</td>
 *       <td align="left" valign="top">Flag indicating the {@code schema} dependency is ignored. See {@link javax.xml.parsers.DocumentBuilderFactory#setSchema(javax.xml.validation.Schema)}.</td>
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
public final class JaxpDocumentBuilderFactory
{
    // SECTION-START[DocumentBuilder]
    // SECTION-END
    // SECTION-START[JaxpDocumentBuilderFactory]

    public DocumentBuilder getObject() throws ParserConfigurationException
    {
        final DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

        if ( !this.isSchemaIgnored() )
        {
            f.setSchema( this.getSchema() );
        }

        f.setCoalescing( this.isCoalescing() );
        f.setExpandEntityReferences( this.isExpandingEntityReferences() );
        f.setIgnoringComments( this.isIgnoringComments() );
        f.setIgnoringElementContentWhitespace( this.isIgnoringElementContentWhitespace() );
        f.setNamespaceAware( this.isNamespaceAware() );
        f.setValidating( this.isValidating() );
        f.setXIncludeAware( this.isXIncludeAware() );

        for ( Map.Entry<String, Boolean> e : this.getFeatures().entrySet() )
        {
            f.setFeature( e.getKey(), e.getValue() );
        }

        for ( Map.Entry<String, Object> e : this.getAttributes().entrySet() )
        {
            f.setAttribute( e.getKey(), e.getValue() );
        }

        final DocumentBuilder b = f.newDocumentBuilder();

        if ( !this.isEntityResolverIgnored() )
        {
            b.setEntityResolver( this.getEntityResolver() );
        }

        if ( !this.isErrorHandlerIgnored() )
        {
            b.setErrorHandler( this.getErrorHandler() );
        }

        return b;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxpDocumentBuilderFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JaxpDocumentBuilderFactory()
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
     * Gets the value of the {@code attributes} property.
     * @return See {@link javax.xml.parsers.DocumentBuilderFactory#setAttribute(java.lang.String, java.lang.Object)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Object> getAttributes()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "attributes" );
        assert _p != null : "'attributes' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code coalescing} property.
     * @return {@code true} if the factory is configured to produce parsers which convert CDATA nodes to Text nodes and append them to the adjacent (if any) Text node; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isCoalescing()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "coalescing" );
        assert _p != null : "'coalescing' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code entityResolverIgnored} property.
     * @return Flag indicating the {@code entityResolver} dependency is ignored. See {@link javax.xml.parsers.DocumentBuilder#setEntityResolver(org.xml.sax.EntityResolver)}.
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
     * @return Flag indicating the {@code errorHandler} dependency is ignored. See {@link javax.xml.parsers.DocumentBuilder#setErrorHandler(org.xml.sax.ErrorHandler)}.
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
     * Gets the value of the {@code expandingEntityReferences} property.
     * @return {@code true} if the factory is configured to produce parsers which expand entity reference nodes; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isExpandingEntityReferences()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "expandingEntityReferences" );
        assert _p != null : "'expandingEntityReferences' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code features} property.
     * @return See {@link javax.xml.parsers.DocumentBuilderFactory#setFeature(java.lang.String, boolean)}.
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
     * Gets the value of the {@code ignoringComments} property.
     * @return {@code true} if the factory is configured to produce parsers which ignores comments; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isIgnoringComments()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "ignoringComments" );
        assert _p != null : "'ignoringComments' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code ignoringElementContentWhitespace} property.
     * @return {@code true} if the factory is configured to produce parsers which ignore ignorable whitespace in element content; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.lang.Boolean isIgnoringElementContentWhitespace()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "ignoringElementContentWhitespace" );
        assert _p != null : "'ignoringElementContentWhitespace' property not found.";
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
     * Gets the value of the {@code schemaIgnored} property.
     * @return Flag indicating the {@code schema} dependency is ignored. See {@link javax.xml.parsers.DocumentBuilderFactory#setSchema(javax.xml.validation.Schema)}.
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
