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
package org.jomc.sdk.model.support;

import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * JAXP 'SAXParser' factory implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code 'javax.xml.parsers.SAXParser'} {@code (javax.xml.parsers.SAXParser)} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #isXIncludeAware XIncludeAware}"
 * <blockquote>Property of type {@code java.lang.Boolean}.
 * <p>{@code true} if the factory is configured to produce XInclude aware parsers; {@code false} otherwise.</p>
 * </blockquote></li>
 * <li>"{@link #getFeatures features}"
 * <blockquote>Property of type {@code java.util.Map<String,Boolean>}.
 * </blockquote></li>
 * <li>"{@link #isNamespaceAware namespaceAware}"
 * <blockquote>Property of type {@code java.lang.Boolean}.
 * <p>{@code true} if the factory is configured to produce parsers which are namespace aware; {@code false} otherwise.</p>
 * </blockquote></li>
 * <li>"{@link #getProperties properties}"
 * <blockquote>Property of type {@code java.util.Map<String,Object>}.
 * </blockquote></li>
 * <li>"{@link #isValidating validating}"
 * <blockquote>Property of type {@code java.lang.Boolean}.
 * <p>{@code true} if the factory is configured to produce parsers which validate the XML content during parse; {@code false} otherwise.</p>
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getSchema schema}"<blockquote>
 * Dependency on {@code 'javax.xml.validation.Schema'} {@code (javax.xml.validation.Schema)} bound to an instance.</blockquote></li>
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
public final class JaxpSaxParserFactory
{
    // SECTION-START[SAXParser]
    // SECTION-END
    // SECTION-START[JaxpSaxParserFactory]

    public SAXParser getObject() throws ParserConfigurationException, SAXException
    {
        final SAXParserFactory f = SAXParserFactory.newInstance();
        f.setSchema( this.getSchema() );
        f.setNamespaceAware( this.isNamespaceAware() );
        f.setValidating( this.isValidating() );
        f.setXIncludeAware( this.isXIncludeAware() );

        for ( Map.Entry<String, Boolean> e : this.getFeatures().entrySet() )
        {
            f.setFeature( e.getKey(), e.getValue() );
        }

        final SAXParser p = f.newSAXParser();

        for ( Map.Entry<String, Object> e : this.getProperties().entrySet() )
        {
            p.setProperty( e.getKey(), e.getValue() );
        }

        return p;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxpSaxParserFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    public JaxpSaxParserFactory()
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
     * Gets the {@code schema} dependency.
     * <p>This method returns the {@code 'JOMC SDK Model Default'} object of the {@code 'javax.xml.validation.Schema'} {@code (javax.xml.validation.Schema)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code schema} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    private java.lang.Boolean isXIncludeAware()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "XIncludeAware" );
        assert _p != null : "'XIncludeAware' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code features} property.
     * @return The value of the {@code features} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    private java.lang.Boolean isNamespaceAware()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "namespaceAware" );
        assert _p != null : "'namespaceAware' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code properties} property.
     * @return The value of the {@code properties} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
    private java.util.Map<String,Object> getProperties()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "properties" );
        assert _p != null : "'properties' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code validating} property.
     * @return {@code true} if the factory is configured to produce parsers which validate the XML content during parse; {@code false} otherwise.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0", comments = "See http://jomc.sourceforge.net/jomc/1.0/jomc-tools" )
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
