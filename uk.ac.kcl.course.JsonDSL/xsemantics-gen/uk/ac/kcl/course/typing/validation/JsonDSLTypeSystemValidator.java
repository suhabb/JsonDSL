package uk.ac.kcl.course.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.ac.kcl.course.typing.JsonDSLTypeSystem;
import uk.ac.kcl.course.validation.AbstractJsonQValidator;

@SuppressWarnings("all")
public class JsonDSLTypeSystemValidator extends AbstractJsonQValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected JsonDSLTypeSystem xsemanticsSystem;
  
  protected JsonDSLTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
