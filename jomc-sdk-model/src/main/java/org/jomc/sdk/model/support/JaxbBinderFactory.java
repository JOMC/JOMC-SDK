// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Java Object Management and Configuration
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
import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.jomc.sdk.model.SchemaType;
import static org.jomc.sdk.model.modlet.SdkModelProvider.XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set {@code Binder} factory implementation.
 *
 * <dl>
 *   <dt><b>Identifier:</b></dt><dd>JOMC :: JAXB Binder Factory</dd>
 *   <dt><b>Name:</b></dt><dd>JOMC :: JAXB Binder Factory :: Default</dd>
 *   <dt><b>Specifications:</b></dt>
 *     <dd>javax.xml.bind.Binder</dd>
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
public final class JaxbBinderFactory
{
    // SECTION-START[Binder]
    // SECTION-END
    // SECTION-START[JaxbBinderFactory]

    public Binder<?> getObject() throws JAXBException
    {
        Binder<?> binder = null;
        final StringBuilder packages = new StringBuilder();

        for ( SchemaType s : this.getSchemas().getSchema() )
        {
            if ( s.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) )
            {
                packages.append( ':' ).append( s.getOtherAttributes().get( XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE ) );
            }
        }

        if ( packages.length() > 0 )
        {
            final String ctx = packages.toString().substring( 1 );
            binder = JAXBContext.newInstance( ctx ).createBinder();

            if ( this.isSchema() )
            {
                binder.setSchema( this.getSchema() );
            }

            if ( this.isValidationEventHandler() )
            {
                binder.setEventHandler( this.getValidationEventHandler() );
            }

            for ( Map.Entry<String, Object> e : this.getBinderProperties().entrySet() )
            {
                binder.setProperty( e.getKey(), e.getValue() );
            }
        }

        return binder;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code JaxbBinderFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JaxbBinderFactory()
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
     * Gets the {@code <schema>} dependency.
     * <p>
     *   This method returns the {@code <JOMC :: JAXB Binder Factory :: Default>} object of the {@code <javax.xml.validation.Schema>} specification at any specification level.
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
     *   This method returns the {@code <JOMC :: JAXB Binder Factory :: Default>} object of the {@code <javax.xml.bind.ValidationEventHandler>} specification at any specification level.
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
     * Gets the value of the {@code <binderProperties>} property.
     * <p><dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl></p>
     * @return See {@link javax.xml.bind.Binder#setProperty(java.lang.String, java.lang.Object)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Object> getBinderProperties()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "binderProperties" );
        assert _p != null : "'binderProperties' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <schema>} property.
     * <p><dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl></p>
     * @return Flag indicating the {@code schema} dependency is applied. See {@link javax.xml.bind.Binder#setSchema(javax.xml.validation.Schema)}.
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
     * <p><dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl></p>
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
     * Gets the value of the {@code <validationEventHandler>} property.
     * <p><dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl></p>
     * @return Flag indicating the {@code validationEventHandler} dependency is applied. See {@link javax.xml.bind.Binder#setEventHandler(javax.xml.bind.ValidationEventHandler)}.
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
