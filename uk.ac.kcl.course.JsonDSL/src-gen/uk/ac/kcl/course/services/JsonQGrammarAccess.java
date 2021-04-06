/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.course.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class JsonQGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class JSONQueryModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.JSONQueryModel");
		private final Assignment cInputStatementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cInputStatementStatementsParserRuleCall_0 = (RuleCall)cInputStatementAssignment.eContents().get(0);
		
		//JSONQueryModel:
		//    (inputStatement+=Statements)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(inputStatement+=Statements)*
		public Assignment getInputStatementAssignment() { return cInputStatementAssignment; }
		
		//Statements
		public RuleCall getInputStatementStatementsParserRuleCall_0() { return cInputStatementStatementsParserRuleCall_0; }
	}
	public class StatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.Statements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGetStatementsParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAggregateStatementsParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statements:
		//    GetStatements |
		//    AggregateStatements
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//GetStatements |
		//AggregateStatements
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GetStatements
		public RuleCall getGetStatementsParserRuleCall_0() { return cGetStatementsParserRuleCall_0; }
		
		//AggregateStatements
		public RuleCall getAggregateStatementsParserRuleCall_1() { return cAggregateStatementsParserRuleCall_1; }
	}
	public class AggregateStatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.AggregateStatements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGETKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOpAggAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpAggOperationAggEnumRuleCall_1_0 = (RuleCall)cOpAggAssignment_1.eContents().get(0);
		private final Assignment cAggFieldAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAggFieldInputFieldSingleEnumRuleCall_2_0 = (RuleCall)cAggFieldAssignment_2.eContents().get(0);
		private final Keyword cWHEREKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cQ1keyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cQ1keyInputFieldSingleEnumRuleCall_4_0 = (RuleCall)cQ1keyAssignment_4.eContents().get(0);
		private final Assignment cQ1valAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cQ1valInputValParserRuleCall_5_0 = (RuleCall)cQ1valAssignment_5.eContents().get(0);
		private final Assignment cQryadditionalAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cQryadditionalAdditionalQueryParserRuleCall_6_0 = (RuleCall)cQryadditionalAssignment_6.eContents().get(0);
		
		//AggregateStatements:
		//    'GET' opAgg=OperationAgg aggField=InputFieldSingle 'WHERE' q1key=InputFieldSingle q1val=InputVal (qryadditional=AdditionalQuery)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'GET' opAgg=OperationAgg aggField=InputFieldSingle 'WHERE' q1key=InputFieldSingle q1val=InputVal (qryadditional=AdditionalQuery)?
		public Group getGroup() { return cGroup; }
		
		//'GET'
		public Keyword getGETKeyword_0() { return cGETKeyword_0; }
		
		//opAgg=OperationAgg
		public Assignment getOpAggAssignment_1() { return cOpAggAssignment_1; }
		
		//OperationAgg
		public RuleCall getOpAggOperationAggEnumRuleCall_1_0() { return cOpAggOperationAggEnumRuleCall_1_0; }
		
		//aggField=InputFieldSingle
		public Assignment getAggFieldAssignment_2() { return cAggFieldAssignment_2; }
		
		//InputFieldSingle
		public RuleCall getAggFieldInputFieldSingleEnumRuleCall_2_0() { return cAggFieldInputFieldSingleEnumRuleCall_2_0; }
		
		//'WHERE'
		public Keyword getWHEREKeyword_3() { return cWHEREKeyword_3; }
		
		//q1key=InputFieldSingle
		public Assignment getQ1keyAssignment_4() { return cQ1keyAssignment_4; }
		
		//InputFieldSingle
		public RuleCall getQ1keyInputFieldSingleEnumRuleCall_4_0() { return cQ1keyInputFieldSingleEnumRuleCall_4_0; }
		
		//q1val=InputVal
		public Assignment getQ1valAssignment_5() { return cQ1valAssignment_5; }
		
		//InputVal
		public RuleCall getQ1valInputValParserRuleCall_5_0() { return cQ1valInputValParserRuleCall_5_0; }
		
		//(qryadditional=AdditionalQuery)?
		public Assignment getQryadditionalAssignment_6() { return cQryadditionalAssignment_6; }
		
		//AdditionalQuery
		public RuleCall getQryadditionalAdditionalQueryParserRuleCall_6_0() { return cQryadditionalAdditionalQueryParserRuleCall_6_0; }
	}
	public class GetStatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.GetStatements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGETKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOpGetAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpGetOperationGETEnumRuleCall_1_0 = (RuleCall)cOpGetAssignment_1.eContents().get(0);
		private final Keyword cWHEREKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQ1keyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQ1keyInputFieldSingleEnumRuleCall_3_0 = (RuleCall)cQ1keyAssignment_3.eContents().get(0);
		private final Assignment cQ1valAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cQ1valInputValParserRuleCall_4_0 = (RuleCall)cQ1valAssignment_4.eContents().get(0);
		private final Assignment cQryadditionalAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cQryadditionalAdditionalQueryParserRuleCall_5_0 = (RuleCall)cQryadditionalAssignment_5.eContents().get(0);
		
		//GetStatements:
		//    'GET' opGet=OperationGET 'WHERE' q1key=InputFieldSingle q1val=InputVal (qryadditional=AdditionalQuery)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'GET' opGet=OperationGET 'WHERE' q1key=InputFieldSingle q1val=InputVal (qryadditional=AdditionalQuery)?
		public Group getGroup() { return cGroup; }
		
		//'GET'
		public Keyword getGETKeyword_0() { return cGETKeyword_0; }
		
		//opGet=OperationGET
		public Assignment getOpGetAssignment_1() { return cOpGetAssignment_1; }
		
		//OperationGET
		public RuleCall getOpGetOperationGETEnumRuleCall_1_0() { return cOpGetOperationGETEnumRuleCall_1_0; }
		
		//'WHERE'
		public Keyword getWHEREKeyword_2() { return cWHEREKeyword_2; }
		
		//q1key=InputFieldSingle
		public Assignment getQ1keyAssignment_3() { return cQ1keyAssignment_3; }
		
		//InputFieldSingle
		public RuleCall getQ1keyInputFieldSingleEnumRuleCall_3_0() { return cQ1keyInputFieldSingleEnumRuleCall_3_0; }
		
		//q1val=InputVal
		public Assignment getQ1valAssignment_4() { return cQ1valAssignment_4; }
		
		//InputVal
		public RuleCall getQ1valInputValParserRuleCall_4_0() { return cQ1valInputValParserRuleCall_4_0; }
		
		//(qryadditional=AdditionalQuery)?
		public Assignment getQryadditionalAssignment_5() { return cQryadditionalAssignment_5; }
		
		//AdditionalQuery
		public RuleCall getQryadditionalAdditionalQueryParserRuleCall_5_0() { return cQryadditionalAdditionalQueryParserRuleCall_5_0; }
	}
	public class AdditionalQueryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.AdditionalQuery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConnectorAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cConnectorAlternatives_0_0 = (Alternatives)cConnectorAssignment_0.eContents().get(0);
		private final Keyword cConnectorANDKeyword_0_0_0 = (Keyword)cConnectorAlternatives_0_0.eContents().get(0);
		private final Keyword cConnectorORKeyword_0_0_1 = (Keyword)cConnectorAlternatives_0_0.eContents().get(1);
		private final Assignment cQ2keyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQ2keyInputFieldSingleEnumRuleCall_1_0 = (RuleCall)cQ2keyAssignment_1.eContents().get(0);
		private final Assignment cQ2valAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQ2valInputValParserRuleCall_2_0 = (RuleCall)cQ2valAssignment_2.eContents().get(0);
		
		//AdditionalQuery:
		//    connector=('AND'|'OR') q2key=InputFieldSingle q2val=InputVal
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//connector=('AND'|'OR') q2key=InputFieldSingle q2val=InputVal
		public Group getGroup() { return cGroup; }
		
		//connector=('AND'|'OR')
		public Assignment getConnectorAssignment_0() { return cConnectorAssignment_0; }
		
		//('AND'|'OR')
		public Alternatives getConnectorAlternatives_0_0() { return cConnectorAlternatives_0_0; }
		
		//'AND'
		public Keyword getConnectorANDKeyword_0_0_0() { return cConnectorANDKeyword_0_0_0; }
		
		//'OR'
		public Keyword getConnectorORKeyword_0_0_1() { return cConnectorORKeyword_0_0_1; }
		
		//q2key=InputFieldSingle
		public Assignment getQ2keyAssignment_1() { return cQ2keyAssignment_1; }
		
		//InputFieldSingle
		public RuleCall getQ2keyInputFieldSingleEnumRuleCall_1_0() { return cQ2keyInputFieldSingleEnumRuleCall_1_0; }
		
		//q2val=InputVal
		public Assignment getQ2valAssignment_2() { return cQ2valAssignment_2; }
		
		//InputVal
		public RuleCall getQ2valInputValParserRuleCall_2_0() { return cQ2valInputValParserRuleCall_2_0; }
	}
	public class InputValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.InputVal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//InputVal:
		//    INTLiteral | StringLiteral
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//INTLiteral | StringLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INTLiteral
		public RuleCall getINTLiteralParserRuleCall_0() { return cINTLiteralParserRuleCall_0; }
		
		//StringLiteral
		public RuleCall getStringLiteralParserRuleCall_1() { return cStringLiteralParserRuleCall_1; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.StringLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringLiteral:
		//    value = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value = STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class INTLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.INTLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//INTLiteral:
		//    value = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value = INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	
	public class OperationAggElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.OperationAgg");
		private final EnumLiteralDeclaration cAVGEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cAVGAVGKeyword_0 = (Keyword)cAVGEnumLiteralDeclaration.eContents().get(0);
		
		//enum OperationAgg:
		//    AVG
		//;
		public EnumRule getRule() { return rule; }
		
		//AVG
		public EnumLiteralDeclaration getAVGEnumLiteralDeclaration() { return cAVGEnumLiteralDeclaration; }
		
		public Keyword getAVGAVGKeyword_0() { return cAVGAVGKeyword_0; }
	}
	public class OperationGETElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.OperationGET");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDATAEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDATADATAKeyword_0_0 = (Keyword)cDATAEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCOUNTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCOUNTCOUNTKeyword_1_0 = (Keyword)cCOUNTEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum OperationGET:
		//    DATA | COUNT
		//;
		public EnumRule getRule() { return rule; }
		
		//DATA | COUNT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DATA
		public EnumLiteralDeclaration getDATAEnumLiteralDeclaration_0() { return cDATAEnumLiteralDeclaration_0; }
		
		public Keyword getDATADATAKeyword_0_0() { return cDATADATAKeyword_0_0; }
		
		//COUNT
		public EnumLiteralDeclaration getCOUNTEnumLiteralDeclaration_1() { return cCOUNTEnumLiteralDeclaration_1; }
		
		public Keyword getCOUNTCOUNTKeyword_1_0() { return cCOUNTCOUNTKeyword_1_0; }
	}
	public class InputFieldSingleElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.course.JsonQ.InputFieldSingle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cFirstNameEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cFirstNameFirstNameKeyword_0_0 = (Keyword)cFirstNameEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLastNameEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLastNameLastNameKeyword_1_0 = (Keyword)cLastNameEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGenderEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGenderGenderKeyword_2_0 = (Keyword)cGenderEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCounrtyCodeEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCounrtyCodeCounrtyCodeKeyword_3_0 = (Keyword)cCounrtyCodeEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cCityNameEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cCityNameCityNameKeyword_4_0 = (Keyword)cCityNameEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cIsVaccinatedEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cIsVaccinatedIsVaccinatedKeyword_5_0 = (Keyword)cIsVaccinatedEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cIncomeEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cIncomeIncomeKeyword_6_0 = (Keyword)cIncomeEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum InputFieldSingle:
		//    firstName |
		//    lastName |
		//    gender |
		//    counrtyCode |
		//    cityName |
		//    isVaccinated |
		//    income
		//;
		public EnumRule getRule() { return rule; }
		
		//firstName |
		//lastName |
		//gender |
		//counrtyCode |
		//cityName |
		//isVaccinated |
		//income
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//firstName
		public EnumLiteralDeclaration getFirstNameEnumLiteralDeclaration_0() { return cFirstNameEnumLiteralDeclaration_0; }
		
		public Keyword getFirstNameFirstNameKeyword_0_0() { return cFirstNameFirstNameKeyword_0_0; }
		
		//lastName
		public EnumLiteralDeclaration getLastNameEnumLiteralDeclaration_1() { return cLastNameEnumLiteralDeclaration_1; }
		
		public Keyword getLastNameLastNameKeyword_1_0() { return cLastNameLastNameKeyword_1_0; }
		
		//gender
		public EnumLiteralDeclaration getGenderEnumLiteralDeclaration_2() { return cGenderEnumLiteralDeclaration_2; }
		
		public Keyword getGenderGenderKeyword_2_0() { return cGenderGenderKeyword_2_0; }
		
		//counrtyCode
		public EnumLiteralDeclaration getCounrtyCodeEnumLiteralDeclaration_3() { return cCounrtyCodeEnumLiteralDeclaration_3; }
		
		public Keyword getCounrtyCodeCounrtyCodeKeyword_3_0() { return cCounrtyCodeCounrtyCodeKeyword_3_0; }
		
		//cityName
		public EnumLiteralDeclaration getCityNameEnumLiteralDeclaration_4() { return cCityNameEnumLiteralDeclaration_4; }
		
		public Keyword getCityNameCityNameKeyword_4_0() { return cCityNameCityNameKeyword_4_0; }
		
		//isVaccinated
		public EnumLiteralDeclaration getIsVaccinatedEnumLiteralDeclaration_5() { return cIsVaccinatedEnumLiteralDeclaration_5; }
		
		public Keyword getIsVaccinatedIsVaccinatedKeyword_5_0() { return cIsVaccinatedIsVaccinatedKeyword_5_0; }
		
		//income
		public EnumLiteralDeclaration getIncomeEnumLiteralDeclaration_6() { return cIncomeEnumLiteralDeclaration_6; }
		
		public Keyword getIncomeIncomeKeyword_6_0() { return cIncomeIncomeKeyword_6_0; }
	}
	
	private final JSONQueryModelElements pJSONQueryModel;
	private final StatementsElements pStatements;
	private final AggregateStatementsElements pAggregateStatements;
	private final GetStatementsElements pGetStatements;
	private final AdditionalQueryElements pAdditionalQuery;
	private final InputValElements pInputVal;
	private final StringLiteralElements pStringLiteral;
	private final INTLiteralElements pINTLiteral;
	private final OperationAggElements eOperationAgg;
	private final OperationGETElements eOperationGET;
	private final InputFieldSingleElements eInputFieldSingle;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public JsonQGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pJSONQueryModel = new JSONQueryModelElements();
		this.pStatements = new StatementsElements();
		this.pAggregateStatements = new AggregateStatementsElements();
		this.pGetStatements = new GetStatementsElements();
		this.pAdditionalQuery = new AdditionalQueryElements();
		this.pInputVal = new InputValElements();
		this.pStringLiteral = new StringLiteralElements();
		this.pINTLiteral = new INTLiteralElements();
		this.eOperationAgg = new OperationAggElements();
		this.eOperationGET = new OperationGETElements();
		this.eInputFieldSingle = new InputFieldSingleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.course.JsonQ".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//JSONQueryModel:
	//    (inputStatement+=Statements)*
	//;
	public JSONQueryModelElements getJSONQueryModelAccess() {
		return pJSONQueryModel;
	}
	
	public ParserRule getJSONQueryModelRule() {
		return getJSONQueryModelAccess().getRule();
	}
	
	//Statements:
	//    GetStatements |
	//    AggregateStatements
	//;
	public StatementsElements getStatementsAccess() {
		return pStatements;
	}
	
	public ParserRule getStatementsRule() {
		return getStatementsAccess().getRule();
	}
	
	//AggregateStatements:
	//    'GET' opAgg=OperationAgg aggField=InputFieldSingle 'WHERE' q1key=InputFieldSingle q1val=InputVal (qryadditional=AdditionalQuery)?
	//;
	public AggregateStatementsElements getAggregateStatementsAccess() {
		return pAggregateStatements;
	}
	
	public ParserRule getAggregateStatementsRule() {
		return getAggregateStatementsAccess().getRule();
	}
	
	//GetStatements:
	//    'GET' opGet=OperationGET 'WHERE' q1key=InputFieldSingle q1val=InputVal (qryadditional=AdditionalQuery)?
	//;
	public GetStatementsElements getGetStatementsAccess() {
		return pGetStatements;
	}
	
	public ParserRule getGetStatementsRule() {
		return getGetStatementsAccess().getRule();
	}
	
	//AdditionalQuery:
	//    connector=('AND'|'OR') q2key=InputFieldSingle q2val=InputVal
	//;
	public AdditionalQueryElements getAdditionalQueryAccess() {
		return pAdditionalQuery;
	}
	
	public ParserRule getAdditionalQueryRule() {
		return getAdditionalQueryAccess().getRule();
	}
	
	//InputVal:
	//    INTLiteral | StringLiteral
	//;
	public InputValElements getInputValAccess() {
		return pInputVal;
	}
	
	public ParserRule getInputValRule() {
		return getInputValAccess().getRule();
	}
	
	//StringLiteral:
	//    value = STRING
	//;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//INTLiteral:
	//    value = INT
	//;
	public INTLiteralElements getINTLiteralAccess() {
		return pINTLiteral;
	}
	
	public ParserRule getINTLiteralRule() {
		return getINTLiteralAccess().getRule();
	}
	
	//enum OperationAgg:
	//    AVG
	//;
	public OperationAggElements getOperationAggAccess() {
		return eOperationAgg;
	}
	
	public EnumRule getOperationAggRule() {
		return getOperationAggAccess().getRule();
	}
	
	//enum OperationGET:
	//    DATA | COUNT
	//;
	public OperationGETElements getOperationGETAccess() {
		return eOperationGET;
	}
	
	public EnumRule getOperationGETRule() {
		return getOperationGETAccess().getRule();
	}
	
	//enum InputFieldSingle:
	//    firstName |
	//    lastName |
	//    gender |
	//    counrtyCode |
	//    cityName |
	//    isVaccinated |
	//    income
	//;
	public InputFieldSingleElements getInputFieldSingleAccess() {
		return eInputFieldSingle;
	}
	
	public EnumRule getInputFieldSingleRule() {
		return getInputFieldSingleAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
