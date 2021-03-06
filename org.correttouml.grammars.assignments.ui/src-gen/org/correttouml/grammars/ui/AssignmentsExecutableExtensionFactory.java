/*
 * generated by Xtext
 */
package org.correttouml.grammars.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.correttouml.grammars.ui.internal.AssignmentsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AssignmentsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AssignmentsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AssignmentsActivator.getInstance().getInjector(AssignmentsActivator.ORG_CORRETTOUML_GRAMMARS_ASSIGNMENTS);
	}
	
}
