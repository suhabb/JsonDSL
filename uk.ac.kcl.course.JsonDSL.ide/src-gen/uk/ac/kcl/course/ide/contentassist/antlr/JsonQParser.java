/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.course.ide.contentassist.antlr.internal.InternalJsonQParser;
import uk.ac.kcl.course.services.JsonQGrammarAccess;

public class JsonQParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JsonQGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JsonQGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementsAccess().getAlternatives(), "rule__Statements__Alternatives");
			builder.put(grammarAccess.getConnectorAccess().getAlternatives(), "rule__Connector__Alternatives");
			builder.put(grammarAccess.getOperationGETAccess().getAlternatives(), "rule__OperationGET__Alternatives");
			builder.put(grammarAccess.getInputFieldSingleAccess().getAlternatives(), "rule__InputFieldSingle__Alternatives");
			builder.put(grammarAccess.getAggregateStatementsAccess().getGroup(), "rule__AggregateStatements__Group__0");
			builder.put(grammarAccess.getGetStatementsAccess().getGroup(), "rule__GetStatements__Group__0");
			builder.put(grammarAccess.getAdditionalQueryAccess().getGroup(), "rule__AdditionalQuery__Group__0");
			builder.put(grammarAccess.getJSONQueryModelAccess().getInputStatementAssignment(), "rule__JSONQueryModel__InputStatementAssignment");
			builder.put(grammarAccess.getAggregateStatementsAccess().getOpAggAssignment_1(), "rule__AggregateStatements__OpAggAssignment_1");
			builder.put(grammarAccess.getAggregateStatementsAccess().getAggFieldAssignment_2(), "rule__AggregateStatements__AggFieldAssignment_2");
			builder.put(grammarAccess.getAggregateStatementsAccess().getQ1keyAssignment_4(), "rule__AggregateStatements__Q1keyAssignment_4");
			builder.put(grammarAccess.getAggregateStatementsAccess().getQ1valAssignment_5(), "rule__AggregateStatements__Q1valAssignment_5");
			builder.put(grammarAccess.getAggregateStatementsAccess().getQryadditionalAssignment_6(), "rule__AggregateStatements__QryadditionalAssignment_6");
			builder.put(grammarAccess.getGetStatementsAccess().getOpGetAssignment_1(), "rule__GetStatements__OpGetAssignment_1");
			builder.put(grammarAccess.getGetStatementsAccess().getQ1keyAssignment_3(), "rule__GetStatements__Q1keyAssignment_3");
			builder.put(grammarAccess.getGetStatementsAccess().getQ1valAssignment_4(), "rule__GetStatements__Q1valAssignment_4");
			builder.put(grammarAccess.getGetStatementsAccess().getQryadditionalAssignment_5(), "rule__GetStatements__QryadditionalAssignment_5");
			builder.put(grammarAccess.getAdditionalQueryAccess().getConnectorAssignment_0(), "rule__AdditionalQuery__ConnectorAssignment_0");
			builder.put(grammarAccess.getAdditionalQueryAccess().getQ2keyAssignment_1(), "rule__AdditionalQuery__Q2keyAssignment_1");
			builder.put(grammarAccess.getAdditionalQueryAccess().getQ2valAssignment_2(), "rule__AdditionalQuery__Q2valAssignment_2");
			builder.put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JsonQGrammarAccess grammarAccess;

	@Override
	protected InternalJsonQParser createParser() {
		InternalJsonQParser result = new InternalJsonQParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JsonQGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JsonQGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
