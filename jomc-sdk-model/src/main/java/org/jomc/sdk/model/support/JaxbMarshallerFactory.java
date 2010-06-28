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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.jomc.sdk.model.SchemaType;
import static org.jomc.sdk.model.modlet.SdkModelProvider.XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE;
import org.xml.sax.SAXException;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXB 'Marshaller' factory implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code 'javax.xml.bind.Marshaller'} ({@code javax.xml.bind.Marshaller}) {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getJaxbEncoding jaxbEncoding}"
 * <blockquote>Property of type {@code java.lang.String}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_ENCODING}.</p>
 * </blockquote></li>
 * <li>"{@link #isJaxbFormattedOutput jaxbFormattedOutput}"
 * <blockquote>Property of type {@code java.lang.Boolean}.
 * <p>See {@link javax.xml.bind.Marshaller#JAXB_FORMATTED_OUTPUT}.</p>
 * </blockquote></li>
 * <li>"{@link #isJaxbFragment jaxbFragment}"
 * <blockquote>Property of type {@code java.lang.Boolean}.
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
 * <li>"{@link #getMarshallerProperties marshallerProperties}"
 * <blockquote>Property of type {@code java.util.Map<String,Object>}.
 * </blockquote></li>
 * <li>"{@link #getSchemas schemas}"
 * <blockquote>Property of type {@code org.jomc.sdk.model.SchemasType}.
 * <p>List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).</p>
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getAttachmentMarshaller attachmentMarshaller}"<blockquote>
 * Dependency on {@code 'javax.xml.bind.attachment.AttachmentMarshaller'} ({@code javax.xml.bind.attachment.AttachmentMarshaller}) bound to an instance.</blockquote></li>
 * <li>"{@link #getSchema schema}"<blockquote>
 * Dependency on {@code 'javax.xml.validation.Schema'} ({@code javax.xml.validation.Schema}) bound to an instance.</blockquote></li>
 * <li>"{@link #getValidationEventHandler validationEventHandler}"<blockquote>
 * Dependency on {@code 'javax.xml.bind.ValidationEventHandler'} ({@code javax.xml.bind.ValidationEventHandler}) bound to an instance.</blockquote></li>
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
public final class JaxbMarshallerFactory
{
    // SECTION-START[Marshaller]
    // SECTION-END
    // SECTION-START[JaxbMarshallerFactory]

    public Marshaller getObject() throws JAXBException, SAXException
    {
        Marshaller marshaller = null;
        final StringBuilder schemaLocation = new StringBuilder();
        final StringBuilder packageNames = new StringBuilder();

        for ( SchemaType s : this.getSchemas().getSchema() )
        {
            if ( s.getPublicId() != null )
            {
                schemaLocation.append( " " ).append( s.getPublicId() ).append( " " ).append( s.getSystemId() );
            }

            if ( s.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) )
            {
                packageNames.append( ':' ).append( s.getOtherAttributes().get( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) );
            }
        }

        if ( packageNames.length() > 0 )
        {
            marshaller = JAXBContext.newInstance( packageNames.substring( 1 ) ).createMarshaller();
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
                marshaller.setProperty( Marshaller.JAXB_SCHEMA_LOCATION, schemaLocation.substring( 1 ) );
            }

            marshaller.setAttachmentMarshaller( this.getAttachmentMarshaller() );
            marshaller.setEventHandler( this.getValidationEventHandler() );
            marshaller.setSchema( this.getSchema() );

            for ( Map.Entry<String, Object> e : this.getMarshallerProperties().entrySet() )
            {
                marshaller.setProperty( e.getKey(), e.getValue() );
            }
        }

        return marshaller;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxbMarshallerFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
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
     * Gets the {@code attachmentMarshaller} dependency.
     * <p>This method returns the "{@code JOMC SDK Model Default}" object of the {@code 'javax.xml.bind.attachment.AttachmentMarshaller'} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code attachmentMarshaller} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.attachment.AttachmentMarshaller getAttachmentMarshaller()
    {
        return (javax.xml.bind.attachment.AttachmentMarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "attachmentMarshaller" );
    }

    /**
     * Gets the {@code schema} dependency.
     * <p>This method returns the "{@code JOMC SDK Model Default}" object of the {@code 'javax.xml.validation.Schema'} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code schema} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.validation.Schema getSchema()
    {
        return (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "schema" );
    }

    /**
     * Gets the {@code validationEventHandler} dependency.
     * <p>This method returns the "{@code JOMC SDK Model Default}" object of the {@code 'javax.xml.bind.ValidationEventHandler'} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code validationEventHandler} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private javax.xml.bind.ValidationEventHandler getValidationEventHandler()
    {
        return (javax.xml.bind.ValidationEventHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "validationEventHandler" );
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.Boolean isJaxbFormattedOutput()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbFormattedOutput" );
        assert _p != null : "'jaxbFormattedOutput' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code jaxbFragment} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_FRAGMENT}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.lang.Boolean isJaxbFragment()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbFragment" );
        assert _p != null : "'jaxbFragment' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code jaxbNoNamespaceSchemaLocation} property.
     * @return See {@link javax.xml.bind.Marshaller#JAXB_NO_NAMESPACE_SCHEMA_LOCATION}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private boolean isJaxbSchemaLocation()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "jaxbSchemaLocation" );
        assert _p != null : "'jaxbSchemaLocation' property not found.";
        return _p.booleanValue();
    }

    /**
     * Gets the value of the {@code marshallerProperties} property.
     * @return The value of the {@code marshallerProperties} property.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    private java.util.Map<String,Object> getMarshallerProperties()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "marshallerProperties" );
        assert _p != null : "'marshallerProperties' property not found.";
        return _p;
    }

    /**
     * Gets the value of the {@code schemas} property.
     * @return List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
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
