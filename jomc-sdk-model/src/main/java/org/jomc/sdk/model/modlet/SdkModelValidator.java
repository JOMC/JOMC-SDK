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
import javax.xml.bind.JAXBElement;
import org.jomc.model.Dependency;
import org.jomc.model.Implementation;
import org.jomc.model.Module;
import org.jomc.model.Modules;
import org.jomc.model.ObjectFactory;
import org.jomc.model.Properties;
import org.jomc.model.Property;
import org.jomc.model.PropertyException;
import org.jomc.model.Specification;
import org.jomc.model.modlet.ModelHelper;
import org.jomc.modlet.Model;
import org.jomc.modlet.ModelContext;
import org.jomc.modlet.ModelException;
import org.jomc.modlet.ModelValidationReport;
import org.jomc.modlet.ModelValidator;
import org.jomc.sdk.model.ItemType;
import org.jomc.sdk.model.ListType;
import org.jomc.sdk.model.MapType;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * SDK {@code ModelValidator} implementation.
 *
 * <p>
 *   This implementation is identified by identifier {@code <JOMC SDK Model Validator>}.
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
public class SdkModelValidator implements ModelValidator
{
    // SECTION-START[SdkModelValidator]

    public ModelValidationReport validateModel( final ModelContext context, final Model model ) throws ModelException
    {
        if ( context == null )
        {
            throw new NullPointerException( "context" );
        }
        if ( model == null )
        {
            throw new NullPointerException( "model" );
        }

        final ModelValidationReport report = new ModelValidationReport();
        final Modules modules = ModelHelper.getModules( model );

        if ( modules != null )
        {
            for ( Module m : modules.getModule() )
            {
                this.assertValidSdkObjects( context, m, null, null, null, report );

                if ( m.getSpecifications() != null )
                {
                    for ( Specification s : m.getSpecifications().getSpecification() )
                    {
                        this.assertValidSdkObjects( context, null, s, null, null, report );
                    }
                }

                if ( m.getImplementations() != null )
                {
                    for ( Implementation i : m.getImplementations().getImplementation() )
                    {
                        this.assertValidSdkObjects( context, null, null, i, null, report );

                        if ( i.getDependencies() != null )
                        {
                            for ( Dependency d : i.getDependencies().getDependency() )
                            {
                                this.assertValidSdkObjects( context, null, null, i, d, report );
                            }
                        }
                    }
                }
            }
        }
        else if ( context.isLoggable( Level.WARNING ) )
        {
            context.log( Level.WARNING, getMessage( "modulesNotFound", model.getIdentifier() ), null );
        }

        return report;
    }

    private void assertValidSdkObjects( final ModelContext context, final Module module,
                                        final Specification specification, final Implementation implementation,
                                        final Dependency dependency, final ModelValidationReport report )
    {
        if ( module != null && ( implementation != null || dependency != null || specification != null ) )
        {
            throw new IllegalArgumentException();
        }
        if ( implementation != null && ( module != null || specification != null ) )
        {
            throw new IllegalArgumentException();
        }
        if ( specification != null && ( module != null || implementation != null || dependency != null ) )
        {
            throw new IllegalArgumentException();
        }

        Properties properties = null;
        JAXBElement<?> detailElement = null;

        if ( module != null )
        {
            properties = module.getProperties();
            detailElement = new ObjectFactory().createModule( module );
        }
        if ( specification != null )
        {
            properties = specification.getProperties();
            detailElement = new ObjectFactory().createSpecification( specification );
        }
        if ( implementation != null )
        {
            properties = implementation.getProperties();
            detailElement = new ObjectFactory().createImplementation( implementation );
        }
        if ( dependency != null )
        {
            properties = dependency.getProperties();
        }

        if ( properties != null )
        {
            for ( Property p : properties.getProperty() )
            {
                if ( p.getAny() != null )
                {
                    final Object any =
                        p.getAny() instanceof JAXBElement<?> ? ( (JAXBElement<?>) p.getAny() ).getValue() : p.getAny();

                    if ( any instanceof ListType )
                    {
                        final ListType list = (ListType) any;

                        for ( ItemType item : list.getItem() )
                        {
                            if ( item.getValue() != null && item.getAny() != null )
                            {
                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_LIST_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleListItemValueConstraint", module.getName(), p.getName() ),
                                        detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_LIST_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationListItemValueConstraint", specification.getIdentifier(),
                                        p.getName() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_LIST_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyListItemValueConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_LIST_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationListItemValueConstraint", implementation.getIdentifier(),
                                            p.getName() ), detailElement ) );

                                    }
                                }
                            }

                            if ( item.getAny() != null && item.getType() == null )
                            {
                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_LIST_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleListItemTypeConstraint", module.getName(), p.getName() ),
                                        detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_LIST_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationListItemTypeConstraint", specification.getIdentifier(),
                                        p.getName() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_LIST_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyListItemTypeConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_LIST_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationListItemTypeConstraint", implementation.getIdentifier(),
                                            p.getName() ), detailElement ) );

                                    }
                                }
                            }

                            try
                            {
                                item.getJavaValue( context.getClassLoader() );
                            }
                            catch ( final PropertyException e )
                            {
                                if ( context.isLoggable( Level.FINE ) )
                                {
                                    context.log( Level.FINE, e.getMessage(), e );
                                }

                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_LIST_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleListItemJavaValueConstraint", module.getName(), p.getName(),
                                        e.getMessage() ), detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_LIST_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationListItemJavaValueConstraint", specification.getIdentifier(),
                                        p.getName(), e.getMessage() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_LIST_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyListItemJavaValueConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName(), e.getMessage() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_LIST_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationListItemJavaValueConstraint", implementation.getIdentifier(),
                                            p.getName(), e.getMessage() ), detailElement ) );

                                    }
                                }
                            }
                        }

                        try
                        {
                            list.getJavaValue( context.getClassLoader() );
                        }
                        catch ( final PropertyException e )
                        {
                            if ( context.isLoggable( Level.FINE ) )
                            {
                                context.log( Level.FINE, e.getMessage(), e );
                            }

                            if ( module != null )
                            {
                                report.getDetails().add( new ModelValidationReport.Detail(
                                    "MODULE_LIST_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                    "moduleListJavaValueConstraint", module.getName(), p.getName(), e.getMessage() ),
                                    detailElement ) );

                            }

                            if ( specification != null )
                            {
                                report.getDetails().add( new ModelValidationReport.Detail(
                                    "SPECIFICATION_LIST_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                    "specificationListJavaValueConstraint", specification.getIdentifier(),
                                    p.getName(), e.getMessage() ), detailElement ) );

                            }

                            if ( implementation != null )
                            {
                                if ( dependency != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "DEPENDENCY_LIST_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "dependencyListJavaValueConstraint", implementation.getIdentifier(),
                                        dependency.getName(), p.getName(), e.getMessage() ), detailElement ) );

                                }
                                else
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "IMPLEMENTATION_LIST_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "implementationListJavaValueConstraint", implementation.getIdentifier(),
                                        p.getName(), e.getMessage() ), detailElement ) );

                                }
                            }
                        }
                    }

                    if ( any instanceof MapType )
                    {
                        final MapType map = (MapType) any;

                        for ( MapType.Entry entry : map.getEntry() )
                        {
                            if ( entry.getKey().getValue() != null && entry.getKey().getAny() != null )
                            {
                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_MAP_KEY_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleMapKeyItemValueConstraint", module.getName(), p.getName() ),
                                        detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_MAP_KEY_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationMapKeyItemValueConstraint", specification.getIdentifier(),
                                        p.getName() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_MAP_KEY_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyMapKeyItemValueConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_MAP_KEY_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationMapKeyItemValueConstraint", implementation.getIdentifier(),
                                            p.getName() ), detailElement ) );

                                    }
                                }
                            }

                            if ( entry.getValue().getValue() != null && entry.getValue().getAny() != null )
                            {
                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_MAP_VALUE_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleMapValueItemValueConstraint", module.getName(), p.getName() ),
                                        detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_MAP_VALUE_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationMapValueItemValueConstraint", specification.getIdentifier(),
                                        p.getName() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_MAP_VALUE_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyMapValueItemValueConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_MAP_VALUE_ITEM_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationMapValueItemValueConstraint", implementation.getIdentifier(),
                                            p.getName() ), detailElement ) );

                                    }
                                }
                            }

                            if ( entry.getKey().getAny() != null && entry.getKey().getType() == null )
                            {
                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_MAP_KEY_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleMapKeyItemTypeConstraint", module.getName(), p.getName() ),
                                        detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_MAP_KEY_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationMapKeyItemTypeConstraint", specification.getIdentifier(),
                                        p.getName() ), detailElement ) );

                                }


                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_MAP_KEY_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyMapKeyItemTypeConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_MAP_KEY_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationMapKeyItemTypeConstraint", implementation.getIdentifier(),
                                            p.getName() ), detailElement ) );

                                    }
                                }
                            }

                            if ( entry.getValue().getAny() != null && entry.getValue().getType() == null )
                            {
                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_MAP_VALUE_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleMapValueItemTypeConstraint", module.getName(), p.getName() ),
                                        detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_MAP_VALUE_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationMapValueItemTypeConstraint", specification.getIdentifier(),
                                        p.getName() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_MAP_VALUE_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyMapValueItemTypeConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_MAP_VALUE_ITEM_TYPE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "implementationMapValueItemTypeConstraint", implementation.getIdentifier(),
                                            p.getName() ), detailElement ) );

                                    }
                                }
                            }

                            try
                            {
                                entry.getKey().getJavaValue( context.getClassLoader() );
                            }
                            catch ( final PropertyException e )
                            {
                                if ( context.isLoggable( Level.FINE ) )
                                {
                                    context.log( Level.FINE, e.getMessage(), e );
                                }

                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_MAP_KEY_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleMapKeyItemJavaValueConstraint", module.getName(), p.getName(),
                                        e.getMessage() ), detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_MAP_KEY_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationMapKeyItemJavaValueConstraint", specification.getIdentifier(),
                                        p.getName(), e.getMessage() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_MAP_KEY_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                            "dependencyMapKeyItemJavaValueConstraint", implementation.getIdentifier(),
                                            dependency.getName(), p.getName(), e.getMessage() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_MAP_KEY_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE,
                                            getMessage( "implementationMapKeyItemJavaValueConstraint",
                                                        implementation.getIdentifier(), p.getName(), e.getMessage() ),
                                            detailElement ) );

                                    }
                                }
                            }

                            try
                            {
                                entry.getValue().getJavaValue( context.getClassLoader() );
                            }
                            catch ( final PropertyException e )
                            {
                                if ( context.isLoggable( Level.FINE ) )
                                {
                                    context.log( Level.FINE, e.getMessage(), e );
                                }

                                if ( module != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "MODULE_MAP_VALUE_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "moduleMapValueItemJavaValueConstraint", module.getName(), p.getName(),
                                        e.getMessage() ), detailElement ) );

                                }

                                if ( specification != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "SPECIFICATION_MAP_VALUE_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "specificationMapValueItemJavaValueConstraint", specification.getIdentifier(),
                                        p.getName(), e.getMessage() ), detailElement ) );

                                }

                                if ( implementation != null )
                                {
                                    if ( dependency != null )
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "DEPENDENCY_MAP_VALUE_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE,
                                            getMessage( "dependencyMapValueItemJavaValueConstraint",
                                                        implementation.getIdentifier(), dependency.getName(),
                                                        p.getName(), e.getMessage() ), detailElement ) );

                                    }
                                    else
                                    {
                                        report.getDetails().add( new ModelValidationReport.Detail(
                                            "IMPLEMENTATION_MAP_VALUE_ITEM_JAVA_VALUE_CONSTRAINT", Level.SEVERE,
                                            getMessage( "implementationMapValueItemJavaValueConstraint",
                                                        implementation.getIdentifier(), p.getName(), e.getMessage() ),
                                            detailElement ) );

                                    }
                                }
                            }
                        }

                        try
                        {
                            map.getJavaValue( context.getClassLoader() );
                        }
                        catch ( final PropertyException e )
                        {
                            if ( context.isLoggable( Level.FINE ) )
                            {
                                context.log( Level.FINE, e.getMessage(), e );
                            }

                            if ( module != null )
                            {
                                report.getDetails().add( new ModelValidationReport.Detail(
                                    "MODULE_MAP_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                    "moduleMapJavaValueConstraint", module.getName(), p.getName(), e.getMessage() ),
                                    detailElement ) );

                            }

                            if ( specification != null )
                            {
                                report.getDetails().add( new ModelValidationReport.Detail(
                                    "SPECIFICATION_MAP_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                    "specificationMapJavaValueConstraint", specification.getIdentifier(),
                                    p.getName(), e.getMessage() ), detailElement ) );

                            }

                            if ( implementation != null )
                            {
                                if ( dependency != null )
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "DEPENDENCY_MAP_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "dependencyMapJavaValueConstraint", implementation.getIdentifier(),
                                        dependency.getName(), p.getName(), e.getMessage() ), detailElement ) );

                                }
                                else
                                {
                                    report.getDetails().add( new ModelValidationReport.Detail(
                                        "IMPLEMENTATION_MAP_JAVA_VALUE_CONSTRAINT", Level.SEVERE, getMessage(
                                        "implementationMapJavaValueConstraint", implementation.getIdentifier(),
                                        p.getName(), e.getMessage() ), detailElement ) );

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static String getMessage( final String key, final Object... arguments )
    {
        return MessageFormat.format( ResourceBundle.getBundle( SdkModelValidator.class.getName().replace( '.', '/' ) ).
            getString( key ), arguments );

    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code SdkModelValidator} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public SdkModelValidator()
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
