/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.agen.ui.internal.AgenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AgenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(AgenActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		AgenActivator activator = AgenActivator.getInstance();
		return activator != null ? activator.getInjector(AgenActivator.ORG_XTEXT_AGEN) : null;
	}

}
