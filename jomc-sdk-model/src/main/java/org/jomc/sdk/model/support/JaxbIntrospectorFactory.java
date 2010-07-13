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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import org.jomc.sdk.model.SchemaType;
import static org.jomc.sdk.model.modlet.SdkModelProvider.XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set 'JAXBIntrospector' factory implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code 'javax.xml.bind.JAXBIntrospector'} {@code (javax.xml.bind.JAXBIntrospector)} {@code Multiton}</li>
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
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools-1.1-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public final class JaxbIntrospectorFactory
{
    // SECTION-START[JAXBIntrospector]
    // SECTION-END
    // SECTION-START[JaxbIntrospectorFactory]

    public JAXBIntrospector getObject() throws JAXBException
    {
        JAXBIntrospector introspector = null;
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
            introspector = JAXBContext.newInstance( ctx ).createJAXBIntrospector();
        }

        return introspector;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxbIntrospectorFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools-1.1-SNAPSHOT" )
    public JaxbIntrospectorFactory()
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools-1.1-SNAPSHOT" )
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
