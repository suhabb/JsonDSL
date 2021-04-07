/*
 * generated by Xtext 2.25.0
 */
grammar InternalJsonQ;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.course.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.course.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.course.services.JsonQGrammarAccess;

}

@parser::members {

 	private JsonQGrammarAccess grammarAccess;

    public InternalJsonQParser(TokenStream input, JsonQGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "JSONQueryModel";
   	}

   	@Override
   	protected JsonQGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleJSONQueryModel
entryRuleJSONQueryModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJSONQueryModelRule()); }
	iv_ruleJSONQueryModel=ruleJSONQueryModel
	{ $current=$iv_ruleJSONQueryModel.current; }
	EOF;

// Rule JSONQueryModel
ruleJSONQueryModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getJSONQueryModelAccess().getInputStatementStatementsParserRuleCall_0());
			}
			lv_inputStatement_0_0=ruleStatements
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getJSONQueryModelRule());
				}
				add(
					$current,
					"inputStatement",
					lv_inputStatement_0_0,
					"uk.ac.kcl.course.JsonQ.Statements");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatements
entryRuleStatements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementsRule()); }
	iv_ruleStatements=ruleStatements
	{ $current=$iv_ruleStatements.current; }
	EOF;

// Rule Statements
ruleStatements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementsAccess().getGetStatementsParserRuleCall_0());
		}
		this_GetStatements_0=ruleGetStatements
		{
			$current = $this_GetStatements_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementsAccess().getAggregateStatementsParserRuleCall_1());
		}
		this_AggregateStatements_1=ruleAggregateStatements
		{
			$current = $this_AggregateStatements_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAggregateStatements
entryRuleAggregateStatements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAggregateStatementsRule()); }
	iv_ruleAggregateStatements=ruleAggregateStatements
	{ $current=$iv_ruleAggregateStatements.current; }
	EOF;

// Rule AggregateStatements
ruleAggregateStatements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GET'
		{
			newLeafNode(otherlv_0, grammarAccess.getAggregateStatementsAccess().getGETKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getOpAggOperationAggEnumRuleCall_1_0());
				}
				lv_opAgg_1_0=ruleOperationAgg
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
					}
					set(
						$current,
						"opAgg",
						lv_opAgg_1_0,
						"uk.ac.kcl.course.JsonQ.OperationAgg");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getAggFieldInputFieldSingleEnumRuleCall_2_0());
				}
				lv_aggField_2_0=ruleInputFieldSingle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
					}
					set(
						$current,
						"aggField",
						lv_aggField_2_0,
						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='WHERE'
		{
			newLeafNode(otherlv_3, grammarAccess.getAggregateStatementsAccess().getWHEREKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_4_0());
				}
				lv_q1key_4_0=ruleInputFieldSingle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
					}
					set(
						$current,
						"q1key",
						lv_q1key_4_0,
						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getQ1valInputValParserRuleCall_5_0());
				}
				lv_q1val_5_0=ruleInputVal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
					}
					set(
						$current,
						"q1val",
						lv_q1val_5_0,
						"uk.ac.kcl.course.JsonQ.InputVal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_6_0());
				}
				lv_qryadditional_6_0=ruleAdditionalQuery
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
					}
					set(
						$current,
						"qryadditional",
						lv_qryadditional_6_0,
						"uk.ac.kcl.course.JsonQ.AdditionalQuery");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_7='END'
		{
			newLeafNode(otherlv_7, grammarAccess.getAggregateStatementsAccess().getENDKeyword_7());
		}
	)
;

// Entry rule entryRuleGetStatements
entryRuleGetStatements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGetStatementsRule()); }
	iv_ruleGetStatements=ruleGetStatements
	{ $current=$iv_ruleGetStatements.current; }
	EOF;

// Rule GetStatements
ruleGetStatements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GET'
		{
			newLeafNode(otherlv_0, grammarAccess.getGetStatementsAccess().getGETKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGetStatementsAccess().getOpGetOperationGETEnumRuleCall_1_0());
				}
				lv_opGet_1_0=ruleOperationGET
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetStatementsRule());
					}
					set(
						$current,
						"opGet",
						lv_opGet_1_0,
						"uk.ac.kcl.course.JsonQ.OperationGET");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='WHERE'
		{
			newLeafNode(otherlv_2, grammarAccess.getGetStatementsAccess().getWHEREKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGetStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0());
				}
				lv_q1key_3_0=ruleInputFieldSingle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetStatementsRule());
					}
					set(
						$current,
						"q1key",
						lv_q1key_3_0,
						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGetStatementsAccess().getQ1valInputValParserRuleCall_4_0());
				}
				lv_q1val_4_0=ruleInputVal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetStatementsRule());
					}
					set(
						$current,
						"q1val",
						lv_q1val_4_0,
						"uk.ac.kcl.course.JsonQ.InputVal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGetStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_5_0());
				}
				lv_qryadditional_5_0=ruleAdditionalQuery
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGetStatementsRule());
					}
					set(
						$current,
						"qryadditional",
						lv_qryadditional_5_0,
						"uk.ac.kcl.course.JsonQ.AdditionalQuery");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6='END'
		{
			newLeafNode(otherlv_6, grammarAccess.getGetStatementsAccess().getENDKeyword_6());
		}
	)
;

// Entry rule entryRuleAdditionalQuery
entryRuleAdditionalQuery returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionalQueryRule()); }
	iv_ruleAdditionalQuery=ruleAdditionalQuery
	{ $current=$iv_ruleAdditionalQuery.current; }
	EOF;

// Rule AdditionalQuery
ruleAdditionalQuery returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAdditionalQueryAccess().getConnectorConnectorEnumRuleCall_0_0());
				}
				lv_connector_0_0=ruleConnector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAdditionalQueryRule());
					}
					set(
						$current,
						"connector",
						lv_connector_0_0,
						"uk.ac.kcl.course.JsonQ.Connector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAdditionalQueryAccess().getQ2keyInputFieldSingleEnumRuleCall_1_0());
				}
				lv_q2key_1_0=ruleInputFieldSingle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAdditionalQueryRule());
					}
					set(
						$current,
						"q2key",
						lv_q2key_1_0,
						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAdditionalQueryAccess().getQ2valInputValParserRuleCall_2_0());
				}
				lv_q2val_2_0=ruleInputVal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAdditionalQueryRule());
					}
					set(
						$current,
						"q2val",
						lv_q2val_2_0,
						"uk.ac.kcl.course.JsonQ.InputVal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInputVal
entryRuleInputVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputValRule()); }
	iv_ruleInputVal=ruleInputVal
	{ $current=$iv_ruleInputVal.current; }
	EOF;

// Rule InputVal
ruleInputVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall());
	}
	this_StringLiteral_0=ruleStringLiteral
	{
		$current = $this_StringLiteral_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	iv_ruleStringLiteral=ruleStringLiteral
	{ $current=$iv_ruleStringLiteral.current; }
	EOF;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Rule Connector
ruleConnector returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='AND'
			{
				$current = grammarAccess.getConnectorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getConnectorAccess().getANDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='OR'
			{
				$current = grammarAccess.getConnectorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getConnectorAccess().getOREnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule OperationAgg
ruleOperationAgg returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='AVG'
		{
			$current = grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration());
		}
	)
;

// Rule OperationGET
ruleOperationGET returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='DATA'
			{
				$current = grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='COUNT'
			{
				$current = grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule InputFieldSingle
ruleInputFieldSingle returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='firstName'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='lastName'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='gender'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='counrtyCode'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='cityName'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='isVaccinated'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='income'
			{
				$current = grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
