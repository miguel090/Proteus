/*
 * generated by Xtext 2.25.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.agen.ui.internal.AgenActivator;

public class AgenUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return AgenActivator.getInstance().getInjector("org.xtext.Agen");
	}

}