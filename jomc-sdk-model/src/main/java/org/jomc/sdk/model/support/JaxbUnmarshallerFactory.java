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

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * XML Schema Set JAXB 'Unmarshaller' factory implementation.
 * <p><b>Specifications</b><ul>
 * <li>{@code javax.xml.bind.Unmarshaller} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #isJaxpSchemaValidation jaxpSchemaValidation}"
 * <blockquote>Property of type {@code boolean}.
 * <p>See {@link javax.xml.bind.Unmarshaller#setSchema(javax.xml.validation.Schema)}.</p>
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
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
// </editor-fold>
// SECTION-END
public class JaxbUnmarshallerFactory
{
    // SECTION-START[Unmarshaller]
    // SECTION-END
    // SECTION-START[JaxbUnmarshallerFactory]

    public Unmarshaller getObject() throws JAXBException
    {
        final Unmarshaller unmarshaller = this.getContext().createUnmarshaller();
        if ( this.isJaxpSchemaValidation() )
        {
            unmarshaller.setSchema( this.getSchema() );
        }

        return unmarshaller;
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code JaxbUnmarshallerFactory} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
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
     * Gets the {@code Context} dependency.
     * <p>This method returns the "{@code JOMC SDK Model}" object of the {@code javax.xml.bind.JAXBContext} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Context} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
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
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
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
     * Gets the value of the {@code jaxpSchemaValidation} property.
     * @return See {@link javax.xml.bind.Unmarshaller#setSchema(javax.xml.validation.Schema)}.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
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
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-17-SNAPSHOT/jomc-tools" )
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
