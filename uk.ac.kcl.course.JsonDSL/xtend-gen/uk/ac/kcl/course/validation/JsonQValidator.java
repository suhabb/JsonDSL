/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.validation;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import uk.ac.kcl.course.jsonQ.AdditionalQuery;
import uk.ac.kcl.course.jsonQ.InputFieldSingle;
import uk.ac.kcl.course.jsonQ.InputVal;
import uk.ac.kcl.course.jsonQ.JsonQPackage;
import uk.ac.kcl.course.jsonQ.Statements;
import uk.ac.kcl.course.jsonQ.StringLiteral;
import uk.ac.kcl.course.typing.validation.JsonDSLTypeSystemValidator;

/**
 * This class contains custom validation rules.
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class JsonQValidator extends JsonDSLTypeSystemValidator {
  public static final String INVALID_CONNECTOR_NAME = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_CONNECTOR_NAME";
  
  public static final String INVALID_QUERY_TERMINATION = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_QUERY_TERMINATION";
  
  public static final String INVALID_INPUT_LITERAL_NAME = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_LITERAL_NAME";
  
  public static final String INVALID_INPUT_INCOME = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_INCOME";
  
  public static final String INVALID_INPUT_VACCINATED = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_VACCINATED";
  
  public static final String INVALID_INPUT_GENDER = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_GENDER";
  
  @Check(CheckType.FAST)
  public void checkInputValidData(final InputVal inputVal) {
    EObject queryInstance = inputVal.eContainer();
    if ((queryInstance instanceof Statements)) {
      EObject _eContainer = inputVal.eContainer();
      Statements stmt = ((Statements) _eContainer);
      String q1key = stmt.getQ1key().getName();
      boolean _equalsIgnoreCase = q1key.equalsIgnoreCase(InputFieldSingle.INCOME.getName());
      if (_equalsIgnoreCase) {
        try {
          StringLiteral q1Val = ((StringLiteral) inputVal);
          String q1ValString = q1Val.getValue();
          Integer.parseInt(q1ValString);
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            this.error("\"Income\" must have integer value", stmt, JsonQPackage.Literals.STATEMENTS__Q1VAL, 
              JsonQValidator.INVALID_INPUT_INCOME);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      boolean _equalsIgnoreCase_1 = q1key.equalsIgnoreCase(InputFieldSingle.GENDER.getName());
      if (_equalsIgnoreCase_1) {
        StringLiteral q1Val = ((StringLiteral) inputVal);
        String q1ValString = q1Val.getValue();
        final List<String> gender = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("female", "male"));
        boolean _contains = gender.contains(q1ValString.toLowerCase());
        boolean _not = (!_contains);
        if (_not) {
          this.error("\"Gender\" must have \"Female\" or \"Male\"", stmt, JsonQPackage.Literals.STATEMENTS__Q1VAL, 
            JsonQValidator.INVALID_INPUT_GENDER);
        }
      }
      boolean _equalsIgnoreCase_2 = q1key.equalsIgnoreCase(InputFieldSingle.IS_VACCINATED.getName());
      if (_equalsIgnoreCase_2) {
        StringLiteral q1Val_1 = ((StringLiteral) inputVal);
        String q1ValString_1 = q1Val_1.getValue();
        final List<String> gender_1 = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("yes", "no"));
        boolean _contains_1 = gender_1.contains(q1ValString_1.toLowerCase());
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          this.error("\"Vaccinated\" can have \"Yes\" or \"No\" values.", stmt, 
            JsonQPackage.Literals.STATEMENTS__Q1VAL, JsonQValidator.INVALID_INPUT_VACCINATED);
        }
      }
    } else {
      if ((queryInstance instanceof AdditionalQuery)) {
        AdditionalQuery secondQuery = ((AdditionalQuery) queryInstance);
        String q2key = secondQuery.getQ2key().getName();
        boolean _equalsIgnoreCase_3 = q2key.equalsIgnoreCase(InputFieldSingle.INCOME.getName());
        if (_equalsIgnoreCase_3) {
          try {
            StringLiteral q2Val = ((StringLiteral) inputVal);
            String q2ValString = q2Val.getValue();
            Integer.parseInt(q2ValString);
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              this.error("\"Income\" must have integer value", secondQuery, 
                JsonQPackage.Literals.ADDITIONAL_QUERY__Q2VAL, JsonQValidator.INVALID_INPUT_INCOME);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
        boolean _equalsIgnoreCase_4 = q2key.equalsIgnoreCase(InputFieldSingle.GENDER.getName());
        if (_equalsIgnoreCase_4) {
          StringLiteral q2Val = ((StringLiteral) inputVal);
          String q2ValString = q2Val.getValue();
          final List<String> gender_2 = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("female", "male"));
          boolean _contains_2 = gender_2.contains(q2ValString.toLowerCase());
          boolean _not_2 = (!_contains_2);
          if (_not_2) {
            this.error("\"Gender\" must have \"Female\" or \"Male\"", secondQuery, 
              JsonQPackage.Literals.ADDITIONAL_QUERY__Q2VAL, JsonQValidator.INVALID_INPUT_GENDER);
          }
        }
        boolean _equalsIgnoreCase_5 = q2key.equalsIgnoreCase(InputFieldSingle.IS_VACCINATED.getName());
        if (_equalsIgnoreCase_5) {
          StringLiteral q2Val_1 = ((StringLiteral) inputVal);
          String q2ValString_1 = q2Val_1.getValue();
          final List<String> gender_3 = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("yes", "no"));
          boolean _contains_3 = gender_3.contains(q2ValString_1.toLowerCase());
          boolean _not_3 = (!_contains_3);
          if (_not_3) {
            this.error("\"Vaccinated\" can have \"Yes\" or \"No\" values.", secondQuery, 
              JsonQPackage.Literals.ADDITIONAL_QUERY__Q2VAL, JsonQValidator.INVALID_INPUT_VACCINATED);
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkConnectorValid(final InputVal inputVal) {
    EObject queryInstance = inputVal.eContainer();
    if ((queryInstance instanceof Statements)) {
      EObject _eContainer = inputVal.eContainer();
      Statements stmt = ((Statements) _eContainer);
      String q1key = stmt.getQ1key().getName();
      StringLiteral q1Val = ((StringLiteral) inputVal);
      String q1ValString = q1Val.getValue();
      boolean _isNull = Objects.isNull(q1ValString);
      if (_isNull) {
        this.error((q1key + " value is missing"), stmt, JsonQPackage.Literals.STATEMENTS__Q1KEY);
      }
    } else {
      if ((queryInstance instanceof AdditionalQuery)) {
        AdditionalQuery secondQuery = ((AdditionalQuery) queryInstance);
        String q2key = secondQuery.getQ2key().getName();
        StringLiteral q2Val = ((StringLiteral) inputVal);
        String q2ValString = q2Val.getValue();
        boolean _isNull_1 = Objects.isNull(q2ValString);
        if (_isNull_1) {
          this.error((q2key + " value is missing"), secondQuery, JsonQPackage.Literals.ADDITIONAL_QUERY__Q2KEY);
        }
      }
    }
  }
}