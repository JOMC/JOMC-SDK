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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.jomc.sdk.model.SchemaType;
import org.jomc.sdk.model.SchemasType;
import static org.jomc.sdk.model.modlet.SdkModelProvider.XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE;
import org.xml.sax.SAXException;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXP {@code Schema} factory implementation.
 *
 * <p>
 *   This implementation is identified by {@code <JOMC :: JAXP Schema Factory>}.
 * </p>
 * <p>
 *   It provides objects named {@code <JOMC :: JAXP Schema Factory :: Default>} of the following specifications:
 *
 *   <ul>
 *     <li>{@code <javax.xml.validation.Schema>} at any specification level.</li>
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
public final class JaxpSchemaFactory
{
    // SECTION-START[Schema]
    // SECTION-END
    // SECTION-START[JaxpSchemaFactory]

    public Schema getObject() throws IOException, SAXException
    {
        Schema schema = null;
        final SchemaFactory schemaFactory = SchemaFactory.newInstance( this.getSchemas().getLanguageId() );
        final SchemasType schemas = this.getSchemas();
        final List<Source> sources = new ArrayList<Source>( schemas.getSchema().size() );

        for ( SchemaType s : schemas.getSchema() )
        {
            final StreamSource source = new StreamSource();
            source.setPublicId( s.getPublicId() );
            source.setSystemId( s.getSystemId() );

            if ( s.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE ) )
            {
                String absoluteLocation = s.getOtherAttributes().get( XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE );
                if ( !absoluteLocation.startsWith( "/" ) )
                {
                    absoluteLocation = '/' + absoluteLocation;
                }

                final URL resource = this.getClass().getResource( absoluteLocation );
                if ( resource != null )
                {
                    source.setSystemId( resource.toExternalForm() );
                    source.setInputStream( resource.openStream() );
                }
            }

            sources.add( source );
        }

        if ( !sources.isEmpty() )
        {
            if ( this.isErrorHandler() )
            {
                schemaFactory.setErrorHandler( this.getErrorHandler() );
            }

            if ( this.isResourceResolver() )
            {
                schemaFactory.setResourceResolver( this.getResourceResolver() );
            }

            for ( Map.Entry<String, Boolean> e : this.getSchemaFeatures().entrySet() )
            {
                schemaFactory.setFeature( e.getKey(), e.getValue() );
            }

            for ( Map.Entry<String, Object> e : this.getSchemaProperties().entrySet() )
            {
                schemaFactory.setProperty( e.getKey(), e.getValue() );
            }

            schema = schemaFactory.newSchema( sources.toArray( new Source[ sources.size() ] ) );
        }

        return schema;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code JaxpSchemaFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JaxpSchemaFactory()
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
     * Gets the {@code <errorHandler>} dependency.
     * <p>
     *   This method returns the {@code <JOMC :: JAXP Schema Factory :: Default>} object of the {@code <org.xml.sax.ErrorHandler>} specification at any specification level.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return The {@code <errorHandler>} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.xml.sax.ErrorHandler getErrorHandler()
    {
        return (org.xml.sax.ErrorHandler) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "errorHandler" );
    }
    /**
     * Gets the {@code <resourceResolver>} dependency.
     * <p>
     *   This method returns the {@code <JOMC :: JAXP Schema Factory :: Default>} object of the {@code <org.w3c.dom.ls.LSResourceResolver>} specification at any specification level.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return The {@code <resourceResolver>} dependency.
     * {@code null} if no object is available.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private org.w3c.dom.ls.LSResourceResolver getResourceResolver()
    {
        return (org.w3c.dom.ls.LSResourceResolver) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "resourceResolver" );
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">
    /**
     * Gets the value of the {@code <errorHandler>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return Flag indicating the {@code errorHandler} dependency is applied. See {@link javax.xml.validation.SchemaFactory#setErrorHandler(org.xml.sax.ErrorHandler)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isErrorHandler()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "errorHandler" );
        assert _p != null : "'errorHandler' property not found.";
        return _p.booleanValue();
    }
    /**
     * Gets the value of the {@code <resourceResolver>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return Flag indicating the {@code resourceResolver} dependency is applied. See {@link javax.xml.validation.SchemaFactory#setResourceResolver(org.w3c.dom.ls.LSResourceResolver)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private boolean isResourceResolver()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "resourceResolver" );
        assert _p != null : "'resourceResolver' property not found.";
        return _p.booleanValue();
    }
    /**
     * Gets the value of the {@code <schemaFeatures>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return See {@link javax.xml.validation.SchemaFactory#setFeature(java.lang.String, boolean)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Boolean> getSchemaFeatures()
    {
        final java.util.Map<String,Boolean> _p = (java.util.Map<String,Boolean>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "schemaFeatures" );
        assert _p != null : "'schemaFeatures' property not found.";
        return _p;
    }
    /**
     * Gets the value of the {@code <schemaProperties>} property.
     * <p>
     *   <dl>
     *     <dt><b>Final:</b></dt><dd>No</dd>
     *   </dl>
     * </p>
     * @return See {@link javax.xml.validation.SchemaFactory#setProperty(java.lang.String, java.lang.Object)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    private java.util.Map<String,Object> getSchemaProperties()
    {
        final java.util.Map<String,Object> _p = (java.util.Map<String,Object>) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getProperty( this, "schemaProperties" );
        assert _p != null : "'schemaProperties' property not found.";
        return _p;
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
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
