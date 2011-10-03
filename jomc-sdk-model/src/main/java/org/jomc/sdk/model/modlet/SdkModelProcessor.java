// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (C) Christian Schulte, 2005-07-25
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
 * SDK {@code ModelProcessor} implementation.
 *
 * <p>
 *   This implementation is identified by identifier {@code <JOMC SDK Model Processor>}.
 *   It does not provide any specified objects.
 * </p>
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
public class SdkModelProcessor implements ModelProcessor
{
    // SECTION-START[SdkModelProcessor]

    /**
     * The default system property substitution starting marker.
     * @see #getDefaultSystemPropertySubstitutionStartingMarker()
     */
    private static volatile String defaultSystemPropertySubstitutionStartingMarker;

    /**
     * The default system property substitution ending marker.
     * @see #getDefaultSystemPropertySubstitutionEndingMarker()
     */
    private static volatile String defaultSystemPropertySubstitutionEndingMarker;

    /**
     * The default value of the default system property substitution starting marker.
     * @see #getDefaultSystemPropertySubstitutionStartingMarker()
     */
    private static final String DEFAULT_SYSTEM_PROPERTY_SUBSTITUTION_STARTING_MARKER = "@@";

    /**
     * The default value of the default system property substitution ending marker.
     * @see #getDefaultSystemPropertySubstitutionEndingMarker()
     */
    private static final String DEFAULT_SYSTEM_PROPERTY_SUBSTITUTION_ENDING_MARKER = "@@";

    /** The system property substitution starting marker of the instance. */
    private String systemPropertySubstitutionStartingMarker;

    /** The system property substitution ending marker of the instance. */
    private String systemPropertySubstitutionEndingMarker;

    /**
     * Constant for the name of the model context attribute backing property
     * {@code systemPropertySubstitutionStartingMarker}.
     * @see #processModel(org.jomc.modlet.ModelContext, org.jomc.modlet.Model)
     * @see ModelContext#getAttribute(java.lang.String)
     */
    public static final String SYSTEM_PROPERTY_SUBSTITUTION_STARTING_MARKER_ATTRIBUTE_NAME =
        "org.jomc.sdk.model.modlet.SdkModelProcessor.systemPropertySubstitutionStartingMarkerAttribute";

    /**
     * Constant for the name of the model context attribute backing property
     * {@code systemPropertySubstitutionEndingMarker}.
     * @see #processModel(org.jomc.modlet.ModelContext, org.jomc.modlet.Model)
     * @see ModelContext#getAttribute(java.lang.String)
     */
    public static final String SYSTEM_PROPERTY_SUBSTITUTION_ENDING_MARKER_ATTRIBUTE_NAME =
        "org.jomc.sdk.model.modlet.SdkModelProcessor.systemPropertySubstitutionEndingMarkerAttribute";

    /**
     * Gets a default string marking the start of a system property substitution.
     * <p>The default system property substitution starting marker is controlled by system property
     * {@code org.jomc.sdk.model.modlet.SdkModelProcessor.defaultSystemPropertySubstitutionStartingMarker} holding a
     * string marking the start of a system property substitution. If that property is not set, the {@code @@} default
     * is returned.</p>
     *
     * @return The default system property substitution starting marker.
     *
     * @see #setDefaultSystemPropertySubstitutionStartingMarker(java.lang.String)
     */
    public static String getDefaultSystemPropertySubstitutionStartingMarker()
    {
        if ( defaultSystemPropertySubstitutionStartingMarker == null )
        {
            defaultSystemPropertySubstitutionStartingMarker = System.getProperty(
                "org.jomc.sdk.model.modlet.SdkModelProcessor.defaultSystemPropertySubstitutionStartingMarker",
                DEFAULT_SYSTEM_PROPERTY_SUBSTITUTION_STARTING_MARKER );

        }

        return defaultSystemPropertySubstitutionStartingMarker;
    }

    /**
     * Sets the default string marking the start of a system property substitution.
     *
     * @param value The new default string marking the start of a system property substitution or {@code null}.
     *
     * @see #getDefaultSystemPropertySubstitutionStartingMarker()
     */
    public static void setDefaultSystemPropertySubstitutionStartingMarker( final String value )
    {
        defaultSystemPropertySubstitutionStartingMarker = value;
    }

    /**
     * Gets a string marking the start of a system property substitution.
     *
     * @return A string marking the start of a system property substitution.
     *
     * @see #getDefaultSystemPropertySubstitutionStartingMarker()
     * @see #setSystemPropertySubstitutionStartingMarker(java.lang.String)
     */
    public final String getSystemPropertySubstitutionStartingMarker()
    {
        if ( this.systemPropertySubstitutionStartingMarker == null )
        {
            this.systemPropertySubstitutionStartingMarker = getDefaultSystemPropertySubstitutionStartingMarker();
        }

        return this.systemPropertySubstitutionStartingMarker;
    }

    /**
     * Sets the string marking the start of a system property substitution.
     *
     * @param value The new string marking the start of a system property substitution or {@code null}.
     *
     * @see #getSystemPropertySubstitutionStartingMarker()
     */
    public final void setSystemPropertySubstitutionStartingMarker( final String value )
    {
        this.systemPropertySubstitutionStartingMarker = value;
    }

    /**
     * Gets a default string marking the end of a system property substitution.
     * <p>The default system property substitution ending marker is controlled by system property
     * {@code org.jomc.sdk.model.modlet.SdkModelProcessor.defaultSystemPropertySubstitutionEndingMarker} holding a
     * string marking the end of a system property substitution. If that property is not set, the {@code @@} default
     * is returned.</p>
     *
     * @return The default system property substitution ending marker.
     *
     * @see #setDefaultSystemPropertySubstitutionEndingMarker(java.lang.String)
     */
    public static String getDefaultSystemPropertySubstitutionEndingMarker()
    {
        if ( defaultSystemPropertySubstitutionEndingMarker == null )
        {
            defaultSystemPropertySubstitutionEndingMarker = System.getProperty(
                "org.jomc.sdk.model.modlet.SdkModelProcessor.defaultSystemPropertySubstitutionEndingMarker",
                DEFAULT_SYSTEM_PROPERTY_SUBSTITUTION_ENDING_MARKER );

        }

        return defaultSystemPropertySubstitutionEndingMarker;
    }

    /**
     * Sets the default string marking the end of a system property substitution.
     *
     * @param value The new default string marking the end of a system property substitution or {@code null}.
     *
     * @see #getDefaultSystemPropertySubstitutionEndingMarker()
     */
    public static void setDefaultSystemPropertySubstitutionEndingMarker( final String value )
    {
        defaultSystemPropertySubstitutionEndingMarker = value;
    }

    /**
     * Gets a string marking the end of a system property substitution.
     *
     * @return A string marking the end of a system property substitution.
     *
     * @see #getDefaultSystemPropertySubstitutionEndingMarker()
     * @see #setSystemPropertySubstitutionEndingMarker(java.lang.String)
     */
    public final String getSystemPropertySubstitutionEndingMarker()
    {
        if ( this.systemPropertySubstitutionEndingMarker == null )
        {
            this.systemPropertySubstitutionEndingMarker = getDefaultSystemPropertySubstitutionEndingMarker();
        }

        return this.systemPropertySubstitutionEndingMarker;
    }

    /**
     * Sets the string marking the end of a system property substitution.
     *
     * @param value The new string marking the end of a system property substitution or {@code null}.
     *
     * @see #getSystemPropertySubstitutionEndingMarker()
     */
    public final void setSystemPropertySubstitutionEndingMarker( final String value )
    {
        this.systemPropertySubstitutionEndingMarker = value;
    }

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

        Model processed = model;
        Modules modules = ModelHelper.getModules( model );

        String contextStartingMarker = this.getSystemPropertySubstitutionStartingMarker();
        if ( DEFAULT_SYSTEM_PROPERTY_SUBSTITUTION_STARTING_MARKER.equals( contextStartingMarker )
             && context.getAttribute( SYSTEM_PROPERTY_SUBSTITUTION_STARTING_MARKER_ATTRIBUTE_NAME ) != null )
        {
            contextStartingMarker =
                (String) context.getAttribute( SYSTEM_PROPERTY_SUBSTITUTION_STARTING_MARKER_ATTRIBUTE_NAME );

        }

        String contextEndingMarker = this.getSystemPropertySubstitutionEndingMarker();
        if ( DEFAULT_SYSTEM_PROPERTY_SUBSTITUTION_ENDING_MARKER.equals( contextEndingMarker )
             && context.getAttribute( SYSTEM_PROPERTY_SUBSTITUTION_ENDING_MARKER_ATTRIBUTE_NAME ) != null )
        {
            contextEndingMarker =
                (String) context.getAttribute( SYSTEM_PROPERTY_SUBSTITUTION_ENDING_MARKER_ATTRIBUTE_NAME );

        }

        if ( modules != null )
        {
            processed = new Model( model );
            modules = ModelHelper.getModules( processed );
            this.substituteSystemProperties( modules, contextStartingMarker, contextEndingMarker );
        }
        else if ( context.isLoggable( Level.WARNING ) )
        {
            context.log( Level.WARNING, getMessage( "modulesNotFound", model.getIdentifier() ), null );
        }

        return processed;
    }

    private void substituteSystemProperties( final Modules modules, final String startingMarker,
                                             final String endingMarker )
    {
        for ( Module m : modules.getModule() )
        {
            this.substituteSystemProperties( m.getProperties(), startingMarker, endingMarker );

            if ( m.getSpecifications() != null )
            {
                for ( Specification s : m.getSpecifications().getSpecification() )
                {
                    this.substituteSystemProperties( s.getProperties(), startingMarker, endingMarker );
                }
            }

            if ( m.getImplementations() != null )
            {
                for ( Implementation i : m.getImplementations().getImplementation() )
                {
                    this.substituteSystemProperties( i.getProperties(), startingMarker, endingMarker );

                    if ( i.getDependencies() != null )
                    {
                        for ( Dependency d : i.getDependencies().getDependency() )
                        {
                            this.substituteSystemProperties( d, startingMarker, endingMarker );
                        }
                    }
                }
            }
        }
    }

    private void substituteSystemProperties( final Dependency dependency, final String startingMarker,
                                             final String endingMarker )
    {
        this.substituteSystemProperties( dependency.getProperties(), startingMarker, endingMarker );

        if ( dependency.getDependencies() != null )
        {
            for ( Dependency d : dependency.getDependencies().getDependency() )
            {
                this.substituteSystemProperties( d, startingMarker, endingMarker );
            }
        }
    }

    private void substituteSystemProperties( final Properties properties, final String startingMarker,
                                             final String endingMarker )
    {
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
