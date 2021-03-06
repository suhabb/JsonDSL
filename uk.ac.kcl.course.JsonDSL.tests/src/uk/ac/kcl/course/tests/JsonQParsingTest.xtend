/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import uk.ac.kcl.course.jsonQ.JSONQueryModel
import org.eclipse.xtext.util.EmfFormatter
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.generator.IGenerator2

@ExtendWith(InjectionExtension)
@InjectWith(JsonQInjectorProvider)
class JsonQParsingTest {
	@Inject extension CompilationTestHelper
	@Inject extension ParseHelper<JSONQueryModel>
	
	@Test
	def void testModelValidity(){
		val model = '''
			GET DATA WHERE gender "Female" AND isVaccinated "No" END
			GET COUNT WHERE isVaccinated "Yes" END
			GET AVG income WHERE cityName "London"  AND isVaccinated "No" END
		'''.parse
		
		//print on console to see the Model AST
		println(EmfFormatter.objToStr(model))
		Assertions.assertNotNull(model)
		val errors = model.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')		
	}
	
	@Test
	def void testQueryModelAndCodeGeneration() {
		'''
		GET DATA WHERE gender "Female" AND isVaccinated "No" END
		GET COUNT WHERE isVaccinated "Yes" END
		GET AVG income WHERE cityName "London"  AND isVaccinated "No" END'''
		.assertCompilesTo('''
			
			import java.util.Arrays;
			import java.util.List;
			import java.util.Map;
			import org.json.JSONObject;
			
			import uk.ac.kcl.course.json_lib.dto.JSONQuery;
			import uk.ac.kcl.course.json_lib.dto.JSONQueryBuilder;
			import uk.ac.kcl.course.json_lib.service.JSONQueryProcess;
			
			
			public class JSONQueryMain {
			
				    public static void main(String[] args) {
						
						JSONQuery json0= new JSONQueryBuilder()
						      	.setOperationValue("DATA")
						      	.setFirstQueryKey("gender")
						      	.setFirstQueryValue("Female")
						      	.setConnectorValue("AND")
						      	.setSecondQueryKey("isVaccinated")
						      	.setSecondQueryValue("No")
						      	.build();
						      	
						
						JSONQuery json1= new JSONQueryBuilder()
						      	.setOperationValue("COUNT")
						      	.setFirstQueryKey("isVaccinated")
						      	.setFirstQueryValue("Yes")
						      	.build();
						      	
						
						JSONQuery json2= new JSONQueryBuilder()
						      	.setOperationValue("AVG")
						      	.setAggregateField("income")
						      	.setFirstQueryKey("cityName")
						      	.setFirstQueryValue("London")
						      	.setConnectorValue("AND")
						      	.setSecondQueryKey("isVaccinated")
						      	.setSecondQueryValue("No")
						      	.build();
						      	
						List<JSONQuery> jsonList = Arrays.asList(json0,json1,json2);
						JSONQueryProcess jsonProcess = new JSONQueryProcess(jsonList);
						Map<String, List<JSONObject>> map = jsonProcess.processJSONQuery();
						System.out.println("Json:"+map.toString());
					}
			}
		''')		
	}
}
