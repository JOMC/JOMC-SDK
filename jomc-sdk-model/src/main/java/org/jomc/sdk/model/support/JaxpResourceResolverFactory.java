// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2009 - 2011 The JOMC Project
 *   Copyright (c) 2005 - 2011 Christian Schulte <schulte2005@users.sourceforge.net>
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

import org.w3c.dom.ls.LSResourceResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.jomc.sdk.model.SchemaType;
import org.jomc.sdk.model.SchemasType;
import org.w3c.dom.ls.LSInput;
import static org.jomc.sdk.model.modlet.SdkModelProvider.XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXP 'LSResourceResolver' factory implementation.
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
 *       <td align="left" nowrap>{@code org.w3c.dom.ls.LSResourceResolver}</td>
 *       <td align="left" nowrap>{@code org.w3c.dom.ls.LSResourceResolver}</td>
 *       <td align="left" nowrap>{@code Multiton}</td>
 *       <td align="left" nowrap></td>
 *     </tr>
 *   </table>
 * </p>
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="3" nowrap><font size="+2">Properties</font></th>
 *     </tr>
 *     <tr class="TableSubHeadingColor">
 *       <td align="left" scope="col" nowrap><b>Name</b></td>
 *       <td align="left" scope="col" nowrap><b>Type</b></td>
 *       <td align="left" scope="col" nowrap><b>Documentation</b></td>
 *     </tr>
 *     <tr class="TableRowColor">
 *       <td align="left" valign="top" nowrap>{@link #getSchemas schemas}</td>
 *       <td align="left" valign="top" nowrap>{@code org.jomc.sdk.model.SchemasType}</td>
 *       <td align="left" valign="top">List of XML schemas ('schemas' element from XML namespace 'http://jomc.org/sdk/model).</td>
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
public final class JaxpResourceResolverFactory implements LSResourceResolver
{
    // SECTION-START[LSResourceResolver]

    public LSInput resolveResource( final String type, final String namespaceURI, final String publicId,
                                    final String systemId, final String baseURI )
    {
        LSInput input = null;
        final SchemasType schemas = this.getSchemas();

        if ( schemas.getLanguageId().equals( type ) )
        {
            SchemaType schema = null;

            if ( namespaceURI != null )
            {
                schema = schemas.getSchemaByPublicId( namespaceURI );
            }
            if ( schema == null && publicId != null )
            {
                schema = schemas.getSchemaByPublicId( publicId );
            }
            if ( schema == null && systemId != null )
            {
                schema = schemas.getSchemaBySystemId( systemId );
            }

            if ( schema != null )
            {
                input = new SchemaTypeInput( schema );
            }
        }

        return input;
    }

    // SECTION-END
    // SECTION-START[JaxpResourceResolverFactory]
    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxpResourceResolverFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public JaxpResourceResolverFactory()
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

/**
 * {@code LSInput} implementation backed by {@code SchemaType} instance.
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
class SchemaTypeInput implements LSInput
{

    /** The schema backing the input. */
    private final SchemaType schemaType;

    /**
     * Creates a new {@code SchemaTypeInput} instance taking a {@code SchemaType} instance.
     *
     * @param schemaType The schema backing the input.
     */
    SchemaTypeInput( final SchemaType schemaType )
    {
        this.schemaType = schemaType;
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
            final URL javaResource = this.getJavaResource();
            if ( javaResource != null )
            {
                return javaResource.openStream();
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
        final URL javaResource = this.getJavaResource();
        return javaResource != null ? javaResource.toExternalForm() : this.schemaType.getSystemId();
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

    private URL getJavaResource()
    {
        if ( this.schemaType.getOtherAttributes().containsKey( XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE ) )
        {
            String absoluteLocation =
                this.schemaType.getOtherAttributes().get( XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE );

            if ( !absoluteLocation.startsWith( "/" ) )
            {
                absoluteLocation = '/' + absoluteLocation;
            }

            return this.getClass().getResource( absoluteLocation );
        }

        return null;
    }

}
