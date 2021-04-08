/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import uk.ac.kcl.course.jsonQ.AdditionalQuery
import uk.ac.kcl.course.jsonQ.InputFieldSingle
import uk.ac.kcl.course.jsonQ.InputVal
import uk.ac.kcl.course.jsonQ.JsonQPackage
import uk.ac.kcl.course.jsonQ.Statements
import uk.ac.kcl.course.jsonQ.StringLiteral
import java.util.Objects
import uk.ac.kcl.course.typing.validation.JsonDSLTypeSystemValidator

/** 
 * This class contains custom validation rules.
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class JsonQValidator extends JsonDSLTypeSystemValidator {

	public static final String INVALID_CONNECTOR_NAME = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_CONNECTOR_NAME"
	public static final String INVALID_QUERY_TERMINATION = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_QUERY_TERMINATION"
	public static final String INVALID_INPUT_LITERAL_NAME = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_LITERAL_NAME"
	public static final String INVALID_INPUT_INCOME = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_INCOME"
	public static final String INVALID_INPUT_VACCINATED = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_VACCINATED"
	public static final String INVALID_INPUT_GENDER = "uk.ac.kcl.course.jsonQ.JsonQPackage.INVALID_INPUT_GENDER"

	@Check(CheckType.FAST)
	def void checkInputValidData(InputVal inputVal) {

		var queryInstance = inputVal.eContainer
		if (queryInstance instanceof Statements) {
			var stmt = inputVal.eContainer as Statements;
			var q1key = stmt.q1key.getName

			if (q1key.equalsIgnoreCase(InputFieldSingle.INCOME.getName)) {

				try {
					var q1Val = inputVal as StringLiteral
					var q1ValString = q1Val.value
					Integer.parseInt(q1ValString)
				} catch (Exception e) {
					error("\"Income\" must have integer value", stmt, JsonQPackage.Literals.STATEMENTS__Q1VAL,
						INVALID_INPUT_INCOME);
				}
			}

			if (q1key.equalsIgnoreCase(InputFieldSingle.GENDER.getName)) {

				var q1Val = inputVal as StringLiteral
				var q1ValString = q1Val.value
				val gender = #['female', 'male']
				if (!gender.contains(q1ValString.toLowerCase)) {
					error("\"Gender\" must have \"Female\" or \"Male\"", stmt, JsonQPackage.Literals.STATEMENTS__Q1VAL,
						INVALID_INPUT_GENDER)
				}
			}

			if (q1key.equalsIgnoreCase(InputFieldSingle.IS_VACCINATED.getName)) {

				var q1Val = inputVal as StringLiteral
				var q1ValString = q1Val.value
				val gender = #['yes', 'no']
				if (!gender.contains(q1ValString.toLowerCase)) {
					error("\"Vaccinated\" can have \"Yes\" or \"No\" values.", stmt,
						JsonQPackage.Literals.STATEMENTS__Q1VAL, INVALID_INPUT_VACCINATED)
				}
			}
		} else if (queryInstance instanceof AdditionalQuery) {
			var secondQuery = queryInstance as AdditionalQuery
			var q2key = secondQuery.q2key.getName

			if (q2key.equalsIgnoreCase(InputFieldSingle.INCOME.getName)) {

				try {
					var q2Val = inputVal as StringLiteral
					var q2ValString = q2Val.value
					Integer.parseInt(q2ValString)
				} catch (Exception e) {
					error("\"Income\" must have integer value", secondQuery,
						JsonQPackage.Literals.ADDITIONAL_QUERY__Q2VAL, INVALID_INPUT_INCOME);
				}
			}
			if (q2key.equalsIgnoreCase(InputFieldSingle.GENDER.getName)) {

				var q2Val = inputVal as StringLiteral
				var q2ValString = q2Val.value
				val gender = #['female', 'male']
				if (!gender.contains(q2ValString.toLowerCase)) {
					error("\"Gender\" must have \"Female\" or \"Male\"", secondQuery,
						JsonQPackage.Literals.ADDITIONAL_QUERY__Q2VAL, INVALID_INPUT_GENDER)
				}
			}

			if (q2key.equalsIgnoreCase(InputFieldSingle.IS_VACCINATED.getName)) {

				var q2Val = inputVal as StringLiteral
				var q2ValString = q2Val.value
				val gender = #['yes', 'no']
				if (!gender.contains(q2ValString.toLowerCase)) {
					error("\"Vaccinated\" can have \"Yes\" or \"No\" values.", secondQuery,
						JsonQPackage.Literals.ADDITIONAL_QUERY__Q2VAL, INVALID_INPUT_VACCINATED)
				}
			}
		}
	}

	@Check(CheckType.FAST)
	def void checkConnectorValid(InputVal inputVal) {
		var queryInstance = inputVal.eContainer
		if (queryInstance instanceof Statements) {
			var stmt = inputVal.eContainer as Statements;
			var q1key = stmt.q1key.getName
			var q1Val = inputVal as StringLiteral
			var q1ValString = q1Val.value
			if (Objects.isNull(q1ValString)) {
				error(q1key + " value is missing", stmt, JsonQPackage.Literals.STATEMENTS__Q1KEY);
			}
		} else if (queryInstance instanceof AdditionalQuery) {
			var secondQuery = queryInstance as AdditionalQuery
			var q2key = secondQuery.q2key.getName

			var q2Val = inputVal as StringLiteral
			var q2ValString = q2Val.value
			if (Objects.isNull(q2ValString)) {
				error(q2key + " value is missing", secondQuery, JsonQPackage.Literals.ADDITIONAL_QUERY__Q2KEY);
			}
		}
	}

}

