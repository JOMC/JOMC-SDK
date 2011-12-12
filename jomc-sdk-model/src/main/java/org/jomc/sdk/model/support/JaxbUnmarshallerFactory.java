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
package org.jomc.sdk.model.support;

import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.jomc.sdk.model.SchemaType;
import static org.jomc.sdk.model.modlet.SdkModelProvider.XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE;
import org.xml.sax.SAXException;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXB {@code Unmarshaller} factory implementation.
 *
 * <p>
 *   This implementation is identified by {@code <JOMC :: JAXB Unmarshaller Factory>}.
 * </p>
 * <p>
 *   It provides objects named {@code <JOMC :: JAXB Unmarshaller Factory :: Default>} of the following specifications:
 *
 *   <ul>
 *     <li>{@code <javax.xml.bind.Unmarshaller>} at any specification level.</li>
 *   </ul>
 * </p>
 * <dl>
 *   <dt><b>Abstract:</b></dt><dd>No</dd>
 *   <dt><b>Final:</b></dt><dd>No</dd>
 *   <dt><b>Stateless:</b></dt><dd>Yes</dd>
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
public final class JaxbUnmarshallerFactory
{
    // SECTION-START[Unmarshaller]
    // SECTION-END
    // SECTION-START[JaxbUnmarshallerFactory]

    public Unmarshaller getObject() throws JAXBException, SAXException
    {
        Unmarshaller unmarshaller = null;
        final StringBuilder packageNames = new StringBuilder();

        for ( SchemaType s : this.getSchemas().getSchema() )
        {
            if ( s.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) )
            {
                packageNames.append( ':' ).append( s.getOtherAttributes().get( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) );
            }
        }

        if ( packageNames.length() > 0 )
        {
            unmarshaller = JAXBContext.newInstance( packageNames.substring( 1 ) ).createUnmarshaller();

            for ( Map.Entry<String, Object> e : this.getUnmarshallerProperties().entrySet() )
            {
                unmarshaller.setProperty( e.getKey(), e.getValue() );
            }

            if ( this.isAttachmentUnmarshaller() )
            {
                unmarshaller.setAttachmentUnmarshaller( this.getAttachmentUnmarshaller() );
            }

            if ( this.isValidationEventHandler() )
            {
                unmarshaller.setEventHandler( this.getValidationEventHandler() );
            }

            if ( this.isSchema() )
            {
                unmarshaller.setSchema( this.getSchema() );
            }
        }

        return unmarshaller;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code JaxbUnmarshallerFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JaxbUnmarshallerFactory()
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
     * Gets the {@code <attachmentUnmarshaller>} dependency.
     * <p>
     *   This method returns the {@code <JOMC :: JAXB Unmarshaller Factory :: Default>} object of the {@code <javax.xml.bind.attachment.AttachmentUnmarshaller>} specification at any specification level.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return The {@code <attachmentUnmarshaller>} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private javax.xml.bind.attachment.AttachmentUnmarshaller getAttachmentUnmarshaller()
    {
        return (javax.xml.bind.attachment.AttachmentUnmarshaller) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "attachmentUnmarshaller" );
    }
    /**
     * Gets the {@code <schema>} dependency.
     * <p>
     *   This method returns the {@code <JOMC :: JAXB Unmarshaller Factory :: Default>} object of the {@code <javax.xml.validation.Schema>} specification at any specification level.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return The {@code <schema>} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private javax.xml.validation.Schema getSchema()
    {
        return (javax.xml.validation.Schema) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "schema" );
    }
    /**
     * Gets the {@code <validationEventHandler>} dependency.
     * <p>
     *   This method returns the {@code <JOMC :: JAXB Unmarshaller Factory :: Default>} object of the {@code <javax.xml.bind.ValidationEventHandler>} specification at any specification level.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return The {@code <validationEventHandler>} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private javax.xml.bind.ValidationEventHandler getValidationEventHandler()
    {
        return (javax.xml.bind.ValidationEventHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "validationEventHandler" );
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">
    /**
     * Gets the value of the {@code <attachmentUnmarshaller>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return Flag indicating the {@code attachmentUnmarshaller} dependency is applied. See {@link javax.xml.bind.Unmarshaller#setAttachmentUnmarshaller(javax.xml.bind.attachment.AttachmentUnmarshaller)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isAttachmentUnmarshaller()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "attachmentUnmarshaller" );
        assert _p != null : "'attachmentUnmarshaller' property not found.";
        return _p.booleanValue();
    }
    /**
     * Gets the value of the {@code <schema>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return Flag indicating the {@code schema} dependency is applied. See {@link javax.xml.bind.Unmarshaller#setSchema(javax.xml.validation.Schema)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isSchema()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "schema" );
        assert _p != null : "'schema' property not found.";
        return _p.booleanValue();
    }
    /**
     * Gets the value of the {@code <schemas>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return List of XML schemas ({@code schemas} element from XML namespace {@code http://jomc.org/sdk/model}).
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.jomc.sdk.model.SchemasType getSchemas()
    {
        final org.jomc.sdk.model.SchemasType _p = (org.jomc.sdk.model.SchemasType) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "schemas" );
        assert _p != null : "'schemas' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <unmarshallerProperties>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return See {@link javax.xml.bind.Unmarshaller#setProperty(java.lang.String, java.lang.Object)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Object> getUnmarshallerProperties()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "unmarshallerProperties" );
        assert _p != null : "'unmarshallerProperties' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <validationEventHandler>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return Flag indicating the {@code validationEventHandler} dependency is applied. See {@link javax.xml.bind.Unmarshaller#setEventHandler(javax.xml.bind.ValidationEventHandler)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isValidationEventHandler()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "validationEventHandler" );
        assert _p != null : "'validationEventHandler' property not found.";
        return _p.booleanValue();
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
