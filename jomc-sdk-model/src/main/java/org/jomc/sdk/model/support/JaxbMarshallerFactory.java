// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2010 The JOMC Project
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
package org.jomc.sdk.model.support;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.jomc.sdk.model.SchemaType;
import static org.jomc.sdk.model.support.SdkModelProcessor.XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXB 'Marshaller' factory implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code javax.xml.bind.Marshaller} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getJaxbEncoding jaxbEncoding}"
 * <blockquote>Property of type {@code java.lang.String}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_ENCODING}.</p>
 * </blockquote></li>
 * <li>"{@link #isJaxbFormattedOutput jaxbFormattedOutput}"
 * <blockquote>Property of type {@code boolean}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_FORMATTED_OUTPUT}.</p>
 * </blockquote></li>
 * <li>"{@link #isJaxbFragment jaxbFragment}"
 * <blockquote>Property of type {@code boolean}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_FRAGMENT}.</p>
 * </blockquote></li>
 * <li>"{@link #getJaxbNoNamespaceSchemaLocation jaxbNoNamespaceSchemaLocation}"
 * <blockquote>Property of type {@code java.lang.String}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_NO_NAMESPACE_SCHEMA_LOCATION}.</p>
 * </blockquote></li>
 * <li>"{@link #isJaxbSchemaLocation jaxbSchemaLocation}"
 * <blockquote>Property of type {@code boolean}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_SCHEMA_LOCATION}.</p>
 * </blockquote></li>
 * <li>"{@link #isJaxpSchemaValidation jaxpSchemaValidation}"
 * <blockquote>Property of type {@code boolean}.
 * <p>See {@link javax.xml.bind.Marshaller#setSchema(javax.xml.validation.Schema)}.</p>
 * </blockquote></li>
 * <li>"{@link #getSchemas schemas}"
 * <blockquote>Property of type {@code org.jomc.sdk.model.SchemasType}.
 * <p>List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).</p>
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getContext Context}"<blockquote>
 * Dependency on {@code javax.xml.bind.JAXBContext} bound to an instance.</blockquote></li>
 * <li>"{@link #getSchema Schema}"<blockquote>
 * Dependency on {@code javax.xml.validation.Schema} bound to an instance.</blockquote></li>
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
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
// </editor-fold>
// SECTION-END
public class JaxbMarshallerFactory
{
    // SECTION-START[JaxbMarshallerFactory]

    public Marshaller getObject() throws JAXBException
    {
        final Marshaller marshaller = this.getContext().createMarshaller();
        final StringBuilder schemaLocation = new StringBuilder();

        for ( SchemaType s : this.getSchemas().getSchema() )
        {
            if ( s.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) )
            {
                if ( s.getPublicId() != null )
                {
                    schemaLocation.append( " " ).append( s.getPublicId() ).append( " " ).append( s.getSystemId() );
                }
            }
        }

        marshaller.setProperty( Marshaller.JAXB_ENCODING, this.getJaxbEncoding() );
        marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, this.isJaxbFormattedOutput() );
        marshaller.setProperty( Marshaller.JAXB_FRAGMENT, this.isJaxbFragment() );

        if ( this.getJaxbNoNamespaceSchemaLocation().length() > 0 )
        {
            marshaller.setProperty( Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION,
                                    this.getJaxbNoNamespaceSchemaLocation() );

        }
        if ( this.isJaxbSchemaLocation() && schemaLocation.length() > 0 )
        {
            marshaller.setProperty( Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation.toString() );
        }
        if ( this.isJaxpSchemaValidation() )
        {
            marshaller.setSchema( this.getSchema() );
        }

        return marshaller;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxbMarshallerFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    public JaxbMarshallerFactory()
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
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.JAXBContext getContext()
    {
        final javax.xml.bind.JAXBContext _d = (javax.xml.bind.JAXBContext) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Context" );
        assert _d != null : "'Context' dependency not found.";
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
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Schema getSchema()
    {
        final javax.xml.validation.Schema _d = (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Schema" );
        assert _d != null : "'Schema' dependency not found.";
        return _d;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code jaxbEncoding} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_ENCODING}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private java.lang.String getJaxbEncoding()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbEncoding" );
        assert _p != null : "'jaxbEncoding' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code jaxbFormattedOutput} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_FORMATTED_OUTPUT}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private boolean isJaxbFormattedOutput()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbFormattedOutput" );
        assert _p != null : "'jaxbFormattedOutput' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code jaxbFragment} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_FRAGMENT}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private boolean isJaxbFragment()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbFragment" );
        assert _p != null : "'jaxbFragment' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code jaxbNoNamespaceSchemaLocation} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_NO_NAMESPACE_SCHEMA_LOCATION}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private java.lang.String getJaxbNoNamespaceSchemaLocation()
    {
        final java.lang.String _p = (java.lang.String) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbNoNamespaceSchemaLocation" );
        assert _p != null : "'jaxbNoNamespaceSchemaLocation' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code jaxbSchemaLocation} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_SCHEMA_LOCATION}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private boolean isJaxbSchemaLocation()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbSchemaLocation" );
        assert _p != null : "'jaxbSchemaLocation' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code jaxpSchemaValidation} property.
     * @return See {@link javax.xml.bind.Marshaller#setSchema(javax.xml.validation.Schema)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private boolean isJaxpSchemaValidation()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxpSchemaValidation" );
        assert _p != null : "'jaxpSchemaValidation' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code schemas} property.
     * @return List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-16-SNAPSHOT/jomc-tools" )
    private org.jomc.sdk.model.SchemasType getSchemas()
    {
        final org.jomc.sdk.model.SchemasType _p = (org.jomc.sdk.model.SchemasType) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "schemas" );
        assert _p != null : "'schemas' property not found.";
        return _p;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}