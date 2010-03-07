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

import java.io.IOException;
import java.net.URL;
import org.jomc.sdk.model.SchemaType;
import org.jomc.sdk.model.SchemasType;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import static org.jomc.sdk.model.support.SdkModelProcessor.XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXP 'EntityResolver' factory implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code org.xml.sax.EntityResolver} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getSchemas schemas}"
 * <blockquote>Property of type {@code org.jomc.sdk.model.SchemasType}.
 * <p>List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).</p>
 * </blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17/jomc-tools" )
// </editor-fold>
// SECTION-END
public class JaxpEntityResolverFactory extends DefaultHandler
{
    // SECTION-START[EntityResolver]

    @Override
    public InputSource resolveEntity( final String publicId, final String systemId ) throws SAXException, IOException
    {
        final SchemasType schemas = this.getSchemas();
        SchemaType schema = null;
        InputSource source = null;

        if ( publicId != null )
        {
            schema = schemas.getSchemaByPublicId( publicId );
        }
        if ( schema == null )
        {
            schema = schemas.getSchemaBySystemId( systemId );
        }
        if ( schema != null )
        {
            source = new InputSource();
            source.setPublicId( schema.getPublicId() == null ? publicId : schema.getPublicId() );
            source.setSystemId( schema.getSystemId() == null ? systemId : schema.getSystemId() );

            if ( schema.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE ) )
            {
                String absoluteLocation = schema.getOtherAttributes().get( XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE );

                if ( !absoluteLocation.startsWith( "/" ) )
                {
                    absoluteLocation = '/' + absoluteLocation;
                }

                final URL resource = this.getClass().getResource( absoluteLocation );
                if ( resource != null )
                {
                    source.setSystemId( resource.toExternalForm() );
                    source.setByteStream( resource.openStream() );
                }
            }
        }

        return source;
    }

    // SECTION-END
    // SECTION-START[JaxpEntityResolverFactory]
    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxpEntityResolverFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17/jomc-tools" )
    public JaxpEntityResolverFactory()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // SECTION-END
    // SECTION-START[Properties]
    // <editor-fold defaultstate="collapsed" desc=" Generated Properties ">

    /**
     * Gets the value of the {@code schemas} property.
     * @return List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17/jomc-tools" )
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
