/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.course.JsonDSL.ui.internal.JsonDSLActivator;

public class JsonQUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JsonDSLActivator.getInstance().getInjector("uk.ac.kcl.course.JsonQ");
	}

}
