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

import org.jomc.model.Specification;
import org.jomc.model.Properties;
import org.jomc.model.Property;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.xml.namespace.QName;
import org.jomc.model.Dependencies;
import org.jomc.model.Dependency;
import org.jomc.model.Implementation;
import org.jomc.model.ImplementationReference;
import org.jomc.model.Implementations;
import org.jomc.model.ModelContext;
import org.jomc.model.ModelException;
import org.jomc.model.Module;
import org.jomc.model.Modules;
import org.jomc.model.Text;
import org.jomc.model.Texts;
import static javax.xml.XMLConstants.NULL_NS_URI;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * SDK 'ModelProcessor' implementation.
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
public final class SdkModelProcessor implements org.jomc.model.ModelProcessor
{
    // SECTION-START[SdkModelProcessor]

    /** {@code QName} of the {@code java-context-id} attribute of {@code schema} elements. */
    public static final QName XML_SCHEMA_JAVA_CONTEXT_ID_ATTRIBUTE = new QName( NULL_NS_URI, "java-context-id" );

    /** {@code QName} of the {@code java-classpath-id} attribute of {@code schema} elements. */
    public static final QName XML_SCHEMA_JAVA_CLASSPATH_ID_ATTRIBUTE = new QName( NULL_NS_URI, "java-classpath-id" );

    /** Identifier of the {@code XML Schema Set} specification. */
    private static final String XML_SCHEMA_SET_SPECIFICATION_IDENTIFIER = "XML Schema Set";

    public Modules processModules( final ModelContext context, final Modules modules ) throws ModelException
    {
        if ( context == null )
        {
            throw new NullPointerException( "context" );
        }
        if ( modules == null )
        {
            throw new NullPointerException( "modules" );
        }

        final Modules processedModules = new Modules( modules );
        final Implementations schemaSets = modules.getImplementations( XML_SCHEMA_SET_SPECIFICATION_IDENTIFIER );

        if ( schemaSets != null )
        {
            for ( Implementation schemaSet : schemaSets.getImplementation() )
            {
                processedModules.getModule().add( this.createSchemaSetModule( processedModules, schemaSet ) );
            }
        }

        this.substituteSystemProperties( processedModules );
        return processedModules;
    }

    private Module createSchemaSetModule( final Modules modules, final Implementation schemaSet )
    {
        final Module m = new Module();
        m.setName( getMessage( "schemaSetModuleName", schemaSet.getIdentifier() ) );
        m.setVendor( schemaSet.getVendor() );
        m.setVersion( schemaSet.getVersion() );
        m.setDocumentation( getTexts( "modelProcessorInfo" ) );
        m.setImplementations( new Implementations() );
        m.getImplementations().setDocumentation( getTexts( "modelProcessorInfo" ) );

        final List<Implementation> impls = m.getImplementations().getImplementation();
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxbContextFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxbBinderFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxbIntrospectorFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxbMarshallerFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxbUnmarshallerFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxpSchemaFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxpValidatorFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxpValidatorHandlerFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxpEntityResolverFactory.class ) );
        impls.add( this.createJavaSchemaSetImplementation( modules, schemaSet, JaxpResourceResolverFactory.class ) );
        return m;
    }

    private Implementation createJavaSchemaSetImplementation(
        final Modules modules, final Implementation schemaSet, final Class factoryClazz )
    {
        final Implementation i = new Implementation();
        i.setIdentifier( getMessage( "schemaSetImplementationIdenifier", schemaSet.getIdentifier(),
                                     factoryClazz.getSimpleName() ) );

        i.setName( schemaSet.getName() );
        i.setDocumentation( getTexts( "modelProcessorInfo" ) );
        i.setClazz( factoryClazz.getName() );
        i.setFinal( true );
        i.setStateless( true );
        i.setVendor( schemaSet.getVendor() );
        i.setVersion( schemaSet.getVersion() );
        i.setProperties( schemaSet.getProperties() );
        i.setDependencies( schemaSet.getDependencies() );
        i.setMessages( schemaSet.getMessages() );

        final Implementation factoryDeclaration = modules.getImplementation( factoryClazz );

        if ( factoryDeclaration != null )
        {
            final Implementations implementationReferences = new Implementations();
            final ImplementationReference implementationReference = new ImplementationReference();
            i.setImplementations( implementationReferences );
            implementationReferences.getReference().add( implementationReference );
            implementationReference.setIdentifier( factoryDeclaration.getIdentifier() );
            implementationReference.setVersion( factoryDeclaration.getVersion() );

            final Dependencies dependencyDeclarations = modules.getDependencies( factoryDeclaration.getIdentifier() );
            if ( dependencyDeclarations != null )
            {
                for ( Dependency dependencyDeclaration : dependencyDeclarations.getDependency() )
                {
                    if ( dependencyDeclaration.getImplementationName() != null
                         && dependencyDeclaration.getImplementationName().equals( factoryDeclaration.getName() )
                         && !dependencyDeclaration.isFinal() )
                    {
                        if ( i.getDependencies() == null )
                        {
                            i.setDependencies( new Dependencies() );
                        }

                        final Dependency d = new Dependency( dependencyDeclaration );
                        d.setImplementationName( i.getName() );
                        d.setFinal( true );
                        d.setOverride( true );
                        i.getDependencies().getDependency().add( d );
                    }
                }
            }
        }

        return i;
    }

    private void substituteSystemProperties( final Modules modules )
    {
        for ( Module m : modules.getModule() )
        {
            this.substituteSystemProperties( m.getProperties() );

            if ( m.getSpecifications() != null )
            {
                for ( Specification s : m.getSpecifications().getSpecification() )
                {
                    this.substituteSystemProperties( s.getProperties() );
                }
            }

            if ( m.getImplementations() != null )
            {
                for ( Implementation i : m.getImplementations().getImplementation() )
                {
                    this.substituteSystemProperties( i.getProperties() );

                    if ( i.getDependencies() != null )
                    {
                        for ( Dependency d : i.getDependencies().getDependency() )
                        {
                            this.substituteSystemProperties( d );
                        }
                    }
                }
            }
        }
    }

    private void substituteSystemProperties( final Dependency dependency )
    {
        this.substituteSystemProperties( dependency.getProperties() );

        if ( dependency.getDependencies() != null )
        {
            for ( Dependency d : dependency.getDependencies().getDependency() )
            {
                this.substituteSystemProperties( d );
            }
        }
    }

    private void substituteSystemProperties( final Properties properties )
    {
        final String startingMarker =
            System.getProperty( "org.jomc.sdk.model.support.SdkModelProcessor.systemPropertyStartingMarker", "@@" );

        final String endingMarker =
            System.getProperty( "org.jomc.sdk.model.support.SdkModelProcessor.systemPropertyEndingMarker", "@@" );

        if ( properties != null )
        {
            for ( Property p : properties.getProperty() )
            {
                if ( p.getValue() != null )
                {
                    final StringBuilder b = new StringBuilder();
                    final StringBuilder propertyName = new StringBuilder();
                    boolean inPropertyName = false;

                    for ( int i = 0; i < p.getValue().length(); i++ )
                    {
                        if ( !inPropertyName )
                        {
                            if ( i + startingMarker.length() <= p.getValue().length()
                                 && startingMarker.equals( p.getValue().substring( i, i + startingMarker.length() ) ) )
                            {
                                propertyName.setLength( 0 );
                                propertyName.append( startingMarker );
                                i += startingMarker.length() - 1;
                                inPropertyName = true;
                                continue;
                            }

                            b.append( p.getValue().charAt( i ) );
                            continue;
                        }

                        if ( inPropertyName )
                        {
                            if ( i + endingMarker.length() <= p.getValue().length()
                                 && endingMarker.equals( p.getValue().substring( i, i + endingMarker.length() ) ) )
                            {
                                b.append( System.getProperty( propertyName.substring( startingMarker.length() ),
                                                              propertyName + endingMarker ) );

                                propertyName.setLength( 0 );
                                i += endingMarker.length() - 1;
                                inPropertyName = false;
                                continue;
                            }

                            propertyName.append( p.getValue().charAt( i ) );
                            continue;
                        }
                    }

                    if ( propertyName.length() > 0 )
                    {
                        b.append( propertyName );
                    }

                    p.setValue( b.toString() );
                }
            }
        }
    }

    private static Texts getTexts( final String key, final Object... arguments )
    {
        final Texts texts = new Texts();
        final Text text = new Text();
        texts.getText().add( text );
        texts.setDefaultLanguage( Locale.getDefault().getLanguage() );
        text.setLanguage( texts.getDefaultLanguage() );
        text.setValue( getMessage( key, arguments ) );
        return texts;
    }

    private static String getMessage( final String key, final Object... arguments )
    {
        return MessageFormat.format( ResourceBundle.getBundle( SdkModelProcessor.class.getName().replace( '.', '/' ) ).
            getString( key ), arguments );

    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code SdkModelProcessor} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.0-beta-5-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.0-beta-5-SNAPSHOT/jomc-tools" )
    public SdkModelProcessor()
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
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}
