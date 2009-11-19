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
package org.jomc.sdk.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.jomc.sdk.model.SchemaType;
import org.w3c.dom.ls.LSInput;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * {@code LSResourceResolver} implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code org.w3c.dom.ls.LSResourceResolver} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #getSchemas schemas}"
 * <blockquote>Property of type {@code org.jomc.sdk.model.SchemasType}.
 * <p>The schemas of the model ({@code schemas} element from XML namespace {@code http://jomc.org/sdk/model}).</p>
 * </blockquote></li>
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
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-9/jomc-tools" )
// </editor-fold>
// SECTION-END
public class LSResourceResolverImplementation
    implements
    org.w3c.dom.ls.LSResourceResolver
{
    // SECTION-START[LSResourceResolver]

    public LSInput resolveResource( final String type, final String namespaceURI, final String publicId,
                                    final String systemId, final String baseURI )
    {
        LSInput input = null;

        if ( this.getSchemas().getLanguageId().equals( type ) )
        {
            SchemaType schema = null;

            if ( namespaceURI != null )
            {
                schema = this.getSchemas().getSchemaByPublicId( namespaceURI );
            }
            if ( schema == null && publicId != null )
            {
                schema = this.getSchemas().getSchemaByPublicId( publicId );
            }
            if ( schema == null && systemId != null )
            {
                schema = this.getSchemas().getSchemaBySystemId( systemId );
            }

            if ( schema != null )
            {
                input = new SchemaTypeInput( schema );
            }
        }

        return input;
    }

    // SECTION-END
    // SECTION-START[LSResourceResolverImplementation]
    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code LSResourceResolverImplementation} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-9/jomc-tools" )
    public LSResourceResolverImplementation()
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
     * @return The schemas of the model ({@code schemas} element from XML namespace {@code http://jomc.org/sdk/model}).
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-9/jomc-tools" )
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

/**
 * {@code LSInput} implementation backed by {@code SchemaType} instance.
 *
 * @author <a href="mailto:cs@jomc.org">Christian Schulte</a> 1.0
 * @version $Id$
 */
class SchemaTypeInput implements LSInput
{

    /** The schema backing the input. */
    private final SchemaType schemaType;

    /** The URL of the schema or {@code null}. */
    private final URL schemaResource;

    /**
     * Creates a new {@code SchemaTypeInput} instance taking a {@code SchemaType} instance.
     *
     * @param schemaType The schema backing the input.
     */
    SchemaTypeInput( final SchemaType schemaType )
    {
        this.schemaType = schemaType;
        if ( this.schemaType.getClasspathId() != null )
        {
            String location = this.schemaType.getClasspathId();
            if ( !location.startsWith( "/" ) )
            {
                location = '/' + location;
            }

            this.schemaResource = this.getClass().getResource( location );
        }
        else
        {
            this.schemaResource = null;
        }
    }

    public Reader getCharacterStream()
    {
        return null;
    }

    public void setCharacterStream( final Reader characterStream )
    {
    }

    public InputStream getByteStream()
    {
        try
        {
            if ( this.schemaResource != null )
            {
                return this.schemaResource.openStream();
            }

            return null;
        }
        catch ( final IOException e )
        {
            return null;
        }
    }

    public void setByteStream( final InputStream byteStream )
    {
    }

    public String getStringData()
    {
        return null;
    }

    public void setStringData( final String stringData )
    {
    }

    public String getSystemId()
    {
        if ( this.schemaResource != null )
        {
            return this.schemaResource.toExternalForm();
        }

        return this.schemaType.getSystemId();
    }

    public void setSystemId( final String systemId )
    {
    }

    public String getPublicId()
    {
        return this.schemaType.getPublicId();
    }

    public void setPublicId( final String publicId )
    {
    }

    public String getBaseURI()
    {
        return null;
    }

    public void setBaseURI( final String baseURI )
    {
    }

    public String getEncoding()
    {
        return null;
    }

    public void setEncoding( final String encoding )
    {
    }

    public boolean getCertifiedText()
    {
        return false;
    }

    public void setCertifiedText( final boolean certifiedText )
    {
    }

}
