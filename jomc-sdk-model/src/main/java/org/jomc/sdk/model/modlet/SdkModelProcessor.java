// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (C) 2009 - 2011 The JOMC Project
 *   Copyright (C) 2005 - 2011 Christian Schulte <schulte2005@users.sourceforge.net>
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
package org.jomc.sdk.model.modlet;

import java.text.MessageFormat;
import java.util.ResourceBundle;
import java.util.logging.Level;
import org.jomc.model.Dependency;
import org.jomc.model.Implementation;
import org.jomc.model.Module;
import org.jomc.model.Modules;
import org.jomc.model.Properties;
import org.jomc.model.Property;
import org.jomc.model.Specification;
import org.jomc.model.modlet.ModelHelper;
import org.jomc.modlet.Model;
import org.jomc.modlet.ModelContext;
import org.jomc.modlet.ModelException;
import org.jomc.modlet.ModelProcessor;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * SDK 'ModelProcessor' implementation.
 * <p>
 *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
 *     <tr class="TableHeadingColor">
 *       <th align="left" scope="col" colspan="2" nowrap><font size="+2">Implementation</font></th>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Identifier:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code JOMC SDK Model Processor}</td>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Name:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code JOMC SDK Model}</td>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Flags:</b></td>
 *       <td class="TableRowColor" align="left" nowrap> {@code stateless}</td>
 *     </tr>
 *     <tr>
 *       <td class="TableSubHeadingColor" align="left" nowrap><b>Version:</b></td>
 *       <td class="TableRowColor" align="left" nowrap>{@code 1.0-beta-3-SNAPSHOT}</td>
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
public final class SdkModelProcessor implements ModelProcessor
{
    // SECTION-START[SdkModelProcessor]

    public Model processModel( final ModelContext context, final Model model ) throws ModelException
    {
        if ( context == null )
        {
            throw new NullPointerException( "context" );
        }
        if ( model == null )
        {
            throw new NullPointerException( "model" );
        }

        Model processed = null;
        Modules modules = ModelHelper.getModules( model );

        if ( modules != null )
        {
            processed = new Model( model );
            modules = ModelHelper.getModules( processed );
            this.substituteSystemProperties( modules );
        }
        else if ( context.isLoggable( Level.WARNING ) )
        {
            context.log( Level.WARNING, getMessage( "modulesNotFound", model.getIdentifier() ), null );
        }

        return processed;
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
            System.getProperty( "org.jomc.sdk.model.modlet.SdkModelProcessor.systemPropertyStartingMarker", "@@" );

        final String endingMarker =
            System.getProperty( "org.jomc.sdk.model.modlet.SdkModelProcessor.systemPropertyEndingMarker", "@@" );

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

    private static String getMessage( final String key, final Object... arguments )
    {
        return MessageFormat.format( ResourceBundle.getBundle( SdkModelProcessor.class.getName().replace( '.', '/' ) ).
            getString( key ), arguments );

    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code SdkModelProcessor} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
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
