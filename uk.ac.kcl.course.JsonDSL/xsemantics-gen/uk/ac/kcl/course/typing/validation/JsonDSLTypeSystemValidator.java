package uk.ac.kcl.course.typing.validation;

import com.google.inject.Inject;
import org.eclipse.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.course.jsonQ.AdditionalQuery;
import uk.ac.kcl.course.jsonQ.AggregateStatements;
import uk.ac.kcl.course.jsonQ.GetStatements;
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
  
  @Check
  public void checkGetStatementInput(final GetStatements stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkGetStatementInput(stmt),
    		stmt);
  }
  
  @Check
  public void checkAggStatementInput(final AggregateStatements stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkAggStatementInput(stmt),
    		stmt);
  }
  
  @Check
  public void checkAddtionalQueryStatementInput(final AdditionalQuery stmt) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkAddtionalQueryStatementInput(stmt),
    		stmt);
  }
}
