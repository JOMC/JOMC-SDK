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
package org.jomc.sdk.transaction;

import javax.naming.NamingException;
import javax.transaction.TransactionManager;
import javax.transaction.TransactionSynchronizationRegistry;
import javax.transaction.UserTransaction;
import org.jomc.sdk.Environment;

// SECTION-START[Documentation]
/**
 * Transaction framework.
 * <p><b>Specifications</b><ul>
 * <li>{@code javax.transaction.TransactionManager} {@code Multiton}</li>
 * <li>{@code javax.transaction.TransactionSynchronizationRegistry} {@code Multiton}</li>
 * <li>{@code javax.transaction.UserTransaction} {@code Multiton}</li>
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
 * <li>"{@link #getMissingTransactionManagerMessage missingTransactionManager}"<table>
 * <tr><td valign="top">English:</td><td valign="top"><pre>Transaction manager ''{0}'' not found.</pre></td></tr>
 * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Transaction manager ''{0}'' nicht gefunden.</pre></td></tr>
 * </table>
 * <li>"{@link #getMissingTransactionSynchronizationRegistryMessage missingTransactionSynchronizationRegistry}"<table>
 * <tr><td valign="top">English:</td><td valign="top"><pre>Transaction synchronization registry ''{0}'' not found.</pre></td></tr>
 * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Transaction synchronization registry ''{0}'' nicht gefunden.</pre></td></tr>
 * </table>
 * <li>"{@link #getMissingUserTransactionMessage missingUserTransaction}"<table>
 * <tr><td valign="top">English:</td><td valign="top"><pre>User transaction ''{0}'' not found.</pre></td></tr>
 * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>User transaction ''{0}'' nicht gefunden.</pre></td></tr>
 * </table>
 * </ul></p>
 *
 * @author <a href="mailto:cs@jomc.org">Christian Schulte</a> 1.0
 * @version $Id$
 */
// SECTION-END
// SECTION-START[Annotations]
@javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                             comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
// SECTION-END
public class TransactionFramework
{
    // SECTION-START[TransactionFramework]

    public TransactionManager getTransactionManager() throws NamingException
    {
        final TransactionManager transactionManager = (TransactionManager) this.getContext().lookup(
            this.getSdkEnvironment().getTransactionManagerJndiName() );

        if ( transactionManager == null )
        {
            this.getLogger().warn( this.getMissingTransactionManagerMessage(
                this.getLocale(), this.getSdkEnvironment().getTransactionManagerJndiName() ) );

        }

        return transactionManager;
    }

    public UserTransaction getUserTransaction() throws NamingException
    {
        final UserTransaction userTransaction = (UserTransaction) this.getContext().lookup(
            this.getSdkEnvironment().getUserTransactionJndiName() );

        if ( userTransaction == null )
        {
            this.getLogger().warn( this.getMissingUserTransactionMessage(
                this.getLocale(), this.getSdkEnvironment().getUserTransactionJndiName() ) );

        }

        return userTransaction;
    }

    public TransactionSynchronizationRegistry getTransactionSynchronizationRegistry() throws NamingException
    {
        final TransactionSynchronizationRegistry transactionSynchronizationRegistry =
            (TransactionSynchronizationRegistry) this.getContext().lookup(
            this.getSdkEnvironment().getTransactionSynchronizationRegistryJndiName() );

        if ( transactionSynchronizationRegistry == null )
        {
            this.getLogger().warn( this.getMissingTransactionSynchronizationRegistryMessage(
                this.getLocale(), this.getSdkEnvironment().getTransactionSynchronizationRegistryJndiName() ) );

        }

        return transactionSynchronizationRegistry;
    }

    // SECTION-END
    // SECTION-START[TransactionFramework]
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

    /** Creates a new {@code TransactionFramework} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    public TransactionFramework()
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
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    private javax.naming.Context getContext() throws org.jomc.ObjectManagementException
    {
        return (javax.naming.Context) org.jomc.ObjectManagerFactory.getObjectManager().getDependency( this, "Context" );
    }

    /**
     * Gets the {@code Locale} dependency.
     * <p>This method returns the "{@code default}" object of the {@code java.util.Locale} specification at specification level 1.1.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * @return The {@code Locale} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    private java.util.Locale getLocale() throws org.jomc.ObjectManagementException
    {
        return (java.util.Locale) org.jomc.ObjectManagerFactory.getObjectManager().getDependency( this, "Locale" );
    }

    /**
     * Gets the {@code Logger} dependency.
     * <p>This method returns any available object of the {@code org.jomc.logging.Logger} specification at specification level 1.0.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code name}"</dt>
     * <dd>Property of type {@code java.lang.String} with value "org.jomc.sdk.transaction.TransactionFramework".
     * </dd>
     * </dl>
     * @return The {@code Logger} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    private org.jomc.logging.Logger getLogger() throws org.jomc.ObjectManagementException
    {
        return (org.jomc.logging.Logger) org.jomc.ObjectManagerFactory.getObjectManager().getDependency( this, "Logger" );
    }
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]

    /**
     * Gets the text of the {@code missingTransactionManager} message.
     * <p><b>Templates</b><br/><table>
     * <tr><td valign="top">English:</td><td valign="top"><pre>Transaction manager ''{0}'' not found.</pre></td></tr>
     * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Transaction manager ''{0}'' nicht gefunden.</pre></td></tr>
     * </table></p>
     * @param locale The locale of the message to return.
     * @param jndiName Format argument.
     * @return The text of the {@code missingTransactionManager} message.
     *
     * @throws org.jomc.ObjectManagementException if getting the message instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    private String getMissingTransactionManagerMessage( final java.util.Locale locale, final java.lang.String jndiName ) throws org.jomc.ObjectManagementException
    {
        return org.jomc.ObjectManagerFactory.getObjectManager().getMessage( this, "missingTransactionManager", locale, new Object[] { jndiName, null } );
    }

    /**
     * Gets the text of the {@code missingTransactionSynchronizationRegistry} message.
     * <p><b>Templates</b><br/><table>
     * <tr><td valign="top">English:</td><td valign="top"><pre>Transaction synchronization registry ''{0}'' not found.</pre></td></tr>
     * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>Transaction synchronization registry ''{0}'' nicht gefunden.</pre></td></tr>
     * </table></p>
     * @param locale The locale of the message to return.
     * @param jndiName Format argument.
     * @return The text of the {@code missingTransactionSynchronizationRegistry} message.
     *
     * @throws org.jomc.ObjectManagementException if getting the message instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    private String getMissingTransactionSynchronizationRegistryMessage( final java.util.Locale locale, final java.lang.String jndiName ) throws org.jomc.ObjectManagementException
    {
        return org.jomc.ObjectManagerFactory.getObjectManager().getMessage( this, "missingTransactionSynchronizationRegistry", locale, new Object[] { jndiName, null } );
    }

    /**
     * Gets the text of the {@code missingUserTransaction} message.
     * <p><b>Templates</b><br/><table>
     * <tr><td valign="top">English:</td><td valign="top"><pre>User transaction ''{0}'' not found.</pre></td></tr>
     * <tr><td valign="top">Deutsch:</td><td valign="top"><pre>User transaction ''{0}'' nicht gefunden.</pre></td></tr>
     * </table></p>
     * @param locale The locale of the message to return.
     * @param jndiName Format argument.
     * @return The text of the {@code missingUserTransaction} message.
     *
     * @throws org.jomc.ObjectManagementException if getting the message instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.JavaSources",
                                 comments = "See http://jomc.sourceforge.net/jomc/1.0-alpha-1-SNAPSHOT/jomc-tools" )
    private String getMissingUserTransactionMessage( final java.util.Locale locale, final java.lang.String jndiName ) throws org.jomc.ObjectManagementException
    {
        return org.jomc.ObjectManagerFactory.getObjectManager().getMessage( this, "missingUserTransaction", locale, new Object[] { jndiName, null } );
    }
    // SECTION-END
}
