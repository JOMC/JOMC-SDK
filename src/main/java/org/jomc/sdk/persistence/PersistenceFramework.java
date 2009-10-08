// SECTION-START[License Header]
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
// SECTION-END
package org.jomc.sdk.persistence;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.jomc.sdk.Environment;

// SECTION-START[Documentation]
/**
 * Persistence framework.
 * <p><b>Specifications</b><ul>
 * <li>{@code javax.persistence.EntityManager} {@code Multiton}</li>
 * <li>{@code javax.persistence.EntityManagerFactory} {@code Multiton}</li>
 * </ul></p>
 * <p><b>Properties</b><ul>
 * <li>"{@link #isContainerManaged containerManaged}"
 * <blockquote>Property of type {@code boolean}.
 * <p>{@code true} if the {@code EntityManager} looked up from the JNDI context is provided by an EJB container; {@code false} to perform a call to the {@code EntityManager.joinTransaction} method on each JNDI lookup.</p>
 * </blockquote></li>
 * </ul></p>
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getContext Context}"<blockquote>
 * Dependency on {@code javax.naming.Context}.</blockquote></li>
 * <li>"{@link #getLocale Locale}"<blockquote>
 * Dependency on {@code java.util.Locale} at specification level 1.1 bound to an instance.</blockquote></li>
 * <li>"{@link #getLogger Logger}"<blockquote>
 * Dependency on {@code org.jomc.logging.Logger} at specification level 1.0 bound to an instance.</blockquote></li>
 * </ul></p>
 * <p><b>Messages</b><ul>
 * <li>"{@link #getMissingEntityManagerMessage missingEntityManager}"<table>
 * <tr><td valign="top">English:</td><td valign="top"><pre>Entity manager ''{0}'' not found.</pre></td></tr>
 * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Entity manager ''{0}'' nicht gefunden.</pre></td></tr>
 * </table>
 * <li>"{@link #getMissingEntityManagerFactoryMessage missingEntityManagerFactory}"<table>
 * <tr><td valign="top">English:</td><td valign="top"><pre>Entity manager factory ''{0}'' not found.</pre></td></tr>
 * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Entity manager factory ''{0}'' nicht gefunden.</pre></td></tr>
 * </table>
 * </ul></p>
 *
 * @author <a href="mailto:cs@jomc.org">Christian Schulte</a> 1.0
 * @version $Id$
 */
// SECTION-END
// SECTION-START[Annotations]
@javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
// SECTION-END
public class PersistenceFramework
{
    // SECTION-START[PersistenceFramework]

    public EntityManagerFactory getEntityManagerFactory() throws NamingException
    {
        final EntityManagerFactory entityManagerFactory = (EntityManagerFactory) this.getContext().lookup(
            this.getSdkEnvironment().getEntityManagerFactoryJndiName() );

        if ( entityManagerFactory == null )
        {
            this.getLogger().warn( this.getMissingEntityManagerFactoryMessage(
                this.getLocale(), this.getSdkEnvironment().getEntityManagerFactoryJndiName() ) );

        }

        return entityManagerFactory;
    }

    public EntityManager getEntityManager() throws NamingException
    {
        final EntityManager entityManager =
            (EntityManager) this.getContext().lookup( this.getSdkEnvironment().getEntityManagerJndiName() );

        if ( entityManager != null )
        {
            if ( !this.isContainerManaged() )
            {
                entityManager.joinTransaction();
            }
        }
        else
        {
            this.getLogger().warn( this.getMissingEntityManagerMessage(
                this.getLocale(), this.getSdkEnvironment().getEntityManagerJndiName() ) );

        }

        return entityManager;
    }

    // SECTION-END
    // SECTION-START[PersistenceFramework]
    private Environment sdkEnvironment;

    public Environment getSdkEnvironment()
    {
        if ( this.sdkEnvironment == null )
        {
            this.sdkEnvironment = new Environment();
        }

        return this.sdkEnvironment;
    }

    // SECTION-END
    // SECTION-START[Constructors]

    /** Creates a new {@code PersistenceFramework} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    public PersistenceFramework()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // SECTION-END
    // SECTION-START[Dependencies]

    /**
     * Gets the {@code Context} dependency.
     * <p>This method returns the "{@code JOMC SDK}" object of the {@code javax.naming.Context} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested.</p>
     * @return The {@code Context} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    private javax.naming.Context getContext()
    {
        final javax.naming.Context _d = (javax.naming.Context) org.jomc.ObjectManagerFactory.getObjectManager().getDependency( this, "Context" );
        assert _d != null : "'Context' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code Locale} dependency.
     * <p>This method returns the "{@code default}" object of the {@code java.util.Locale} specification at specification level 1.1.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Locale} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    private java.util.Locale getLocale()
    {
        final java.util.Locale _d = (java.util.Locale) org.jomc.ObjectManagerFactory.getObjectManager().getDependency( this, "Locale" );
        assert _d != null : "'Locale' dependency not found.";
        return _d;
    }

    /**
     * Gets the {@code Logger} dependency.
     * <p>This method returns any available object of the {@code org.jomc.logging.Logger} specification at specification level 1.0.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code name}"</dt>
     * <dd>Property of type {@code java.lang.String}.
     * </dd>
     * </dl>
     * @return The {@code Logger} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    private org.jomc.logging.Logger getLogger()
    {
        final org.jomc.logging.Logger _d = (org.jomc.logging.Logger) org.jomc.ObjectManagerFactory.getObjectManager().getDependency( this, "Logger" );
        assert _d != null : "'Logger' dependency not found.";
        return _d;
    }
    // SECTION-END
    // SECTION-START[Properties]

    /**
     * Gets the value of the {@code containerManaged} property.
     * @return {@code true} if the {@code EntityManager} looked up from the JNDI context is provided by an EJB container; {@code false} to perform a call to the {@code EntityManager.joinTransaction} method on each JNDI lookup.
     * @throws org.jomc.ObjectManagementException if getting the property instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    private boolean isContainerManaged()
    {
        final java.lang.Boolean _p = (java.lang.Boolean) org.jomc.ObjectManagerFactory.getObjectManager().getProperty( this, "containerManaged" );
        assert _p != null : "'containerManaged' property not found.";
        return _p.booleanValue();
    }
    // SECTION-END
    // SECTION-START[Messages]

    /**
     * Gets the text of the {@code missingEntityManager} message.
     * <p><b>Templates</b><br/><table>
     * <tr><td valign="top">English:</td><td valign="top"><pre>Entity manager ''{0}'' not found.</pre></td></tr>
     * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Entity manager ''{0}'' nicht gefunden.</pre></td></tr>
     * </table></p>
     * @param locale The locale of the message to return.
     * @param jndiName Format argument.
     * @return The text of the {@code missingEntityManager} message.
     *
     * @throws org.jomc.ObjectManagementException if getting the message instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    private String getMissingEntityManagerMessage( final java.util.Locale locale, final java.lang.String jndiName )
    {
        final String _m = org.jomc.ObjectManagerFactory.getObjectManager().getMessage( this, "missingEntityManager", locale, new Object[] { jndiName, null } );
        assert _m != null : "'missingEntityManager' message not found.";
        return _m;
    }

    /**
     * Gets the text of the {@code missingEntityManagerFactory} message.
     * <p><b>Templates</b><br/><table>
     * <tr><td valign="top">English:</td><td valign="top"><pre>Entity manager factory ''{0}'' not found.</pre></td></tr>
     * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Entity manager factory ''{0}'' nicht gefunden.</pre></td></tr>
     * </table></p>
     * @param locale The locale of the message to return.
     * @param jndiName Format argument.
     * @return The text of the {@code missingEntityManagerFactory} message.
     *
     * @throws org.jomc.ObjectManagementException if getting the message instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-6/jomc-tools" )
    private String getMissingEntityManagerFactoryMessage( final java.util.Locale locale, final java.lang.String jndiName )
    {
        final String _m = org.jomc.ObjectManagerFactory.getObjectManager().getMessage( this, "missingEntityManagerFactory", locale, new Object[] { jndiName, null } );
        assert _m != null : "'missingEntityManagerFactory' message not found.";
        return _m;
    }
    // SECTION-END
}
