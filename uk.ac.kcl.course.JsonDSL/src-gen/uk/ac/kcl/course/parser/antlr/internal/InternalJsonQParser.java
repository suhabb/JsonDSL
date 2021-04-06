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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonQParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GET'", "'WHERE'", "'AND'", "'OR'", "'AVG'", "'DATA'", "'COUNT'", "'firstName'", "'lastName'", "'gender'", "'counrtyCode'", "'cityName'", "'isVaccinated'", "'income'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonQParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonQParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonQParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonQ.g"; }



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




    // $ANTLR start "entryRuleJSONQueryModel"
    // InternalJsonQ.g:65:1: entryRuleJSONQueryModel returns [EObject current=null] : iv_ruleJSONQueryModel= ruleJSONQueryModel EOF ;
    public final EObject entryRuleJSONQueryModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONQueryModel = null;


        try {
            // InternalJsonQ.g:65:55: (iv_ruleJSONQueryModel= ruleJSONQueryModel EOF )
            // InternalJsonQ.g:66:2: iv_ruleJSONQueryModel= ruleJSONQueryModel EOF
            {
             newCompositeNode(grammarAccess.getJSONQueryModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONQueryModel=ruleJSONQueryModel();

            state._fsp--;

             current =iv_ruleJSONQueryModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSONQueryModel"


    // $ANTLR start "ruleJSONQueryModel"
    // InternalJsonQ.g:72:1: ruleJSONQueryModel returns [EObject current=null] : ( (lv_inputStatement_0_0= ruleStatements ) )* ;
    public final EObject ruleJSONQueryModel() throws RecognitionException {
        EObject current = null;

        EObject lv_inputStatement_0_0 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:78:2: ( ( (lv_inputStatement_0_0= ruleStatements ) )* )
            // InternalJsonQ.g:79:2: ( (lv_inputStatement_0_0= ruleStatements ) )*
            {
            // InternalJsonQ.g:79:2: ( (lv_inputStatement_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonQ.g:80:3: (lv_inputStatement_0_0= ruleStatements )
            	    {
            	    // InternalJsonQ.g:80:3: (lv_inputStatement_0_0= ruleStatements )
            	    // InternalJsonQ.g:81:4: lv_inputStatement_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getJSONQueryModelAccess().getInputStatementStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_inputStatement_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getJSONQueryModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"inputStatement",
            	    					lv_inputStatement_0_0,
            	    					"uk.ac.kcl.course.JsonQ.Statements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSONQueryModel"


    // $ANTLR start "entryRuleStatements"
    // InternalJsonQ.g:101:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalJsonQ.g:101:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalJsonQ.g:102:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalJsonQ.g:108:1: ruleStatements returns [EObject current=null] : (this_GetStatements_0= ruleGetStatements | this_AggregateStatements_1= ruleAggregateStatements ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_GetStatements_0 = null;

        EObject this_AggregateStatements_1 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:114:2: ( (this_GetStatements_0= ruleGetStatements | this_AggregateStatements_1= ruleAggregateStatements ) )
            // InternalJsonQ.g:115:2: (this_GetStatements_0= ruleGetStatements | this_AggregateStatements_1= ruleAggregateStatements )
            {
            // InternalJsonQ.g:115:2: (this_GetStatements_0= ruleGetStatements | this_AggregateStatements_1= ruleAggregateStatements )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJsonQ.g:116:3: this_GetStatements_0= ruleGetStatements
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getGetStatementsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetStatements_0=ruleGetStatements();

                    state._fsp--;


                    			current = this_GetStatements_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:125:3: this_AggregateStatements_1= ruleAggregateStatements
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getAggregateStatementsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AggregateStatements_1=ruleAggregateStatements();

                    state._fsp--;


                    			current = this_AggregateStatements_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleAggregateStatements"
    // InternalJsonQ.g:137:1: entryRuleAggregateStatements returns [EObject current=null] : iv_ruleAggregateStatements= ruleAggregateStatements EOF ;
    public final EObject entryRuleAggregateStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregateStatements = null;


        try {
            // InternalJsonQ.g:137:60: (iv_ruleAggregateStatements= ruleAggregateStatements EOF )
            // InternalJsonQ.g:138:2: iv_ruleAggregateStatements= ruleAggregateStatements EOF
            {
             newCompositeNode(grammarAccess.getAggregateStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregateStatements=ruleAggregateStatements();

            state._fsp--;

             current =iv_ruleAggregateStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregateStatements"


    // $ANTLR start "ruleAggregateStatements"
    // InternalJsonQ.g:144:1: ruleAggregateStatements returns [EObject current=null] : (otherlv_0= 'GET' ( (lv_opAgg_1_0= ruleOperationAgg ) ) ( (lv_aggField_2_0= ruleInputFieldSingle ) ) otherlv_3= 'WHERE' ( (lv_q1key_4_0= ruleInputFieldSingle ) ) ( (lv_q1val_5_0= ruleInputVal ) ) ( (lv_qryadditional_6_0= ruleAdditionalQuery ) )? ) ;
    public final EObject ruleAggregateStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Enumerator lv_opAgg_1_0 = null;

        Enumerator lv_aggField_2_0 = null;

        Enumerator lv_q1key_4_0 = null;

        EObject lv_q1val_5_0 = null;

        EObject lv_qryadditional_6_0 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:150:2: ( (otherlv_0= 'GET' ( (lv_opAgg_1_0= ruleOperationAgg ) ) ( (lv_aggField_2_0= ruleInputFieldSingle ) ) otherlv_3= 'WHERE' ( (lv_q1key_4_0= ruleInputFieldSingle ) ) ( (lv_q1val_5_0= ruleInputVal ) ) ( (lv_qryadditional_6_0= ruleAdditionalQuery ) )? ) )
            // InternalJsonQ.g:151:2: (otherlv_0= 'GET' ( (lv_opAgg_1_0= ruleOperationAgg ) ) ( (lv_aggField_2_0= ruleInputFieldSingle ) ) otherlv_3= 'WHERE' ( (lv_q1key_4_0= ruleInputFieldSingle ) ) ( (lv_q1val_5_0= ruleInputVal ) ) ( (lv_qryadditional_6_0= ruleAdditionalQuery ) )? )
            {
            // InternalJsonQ.g:151:2: (otherlv_0= 'GET' ( (lv_opAgg_1_0= ruleOperationAgg ) ) ( (lv_aggField_2_0= ruleInputFieldSingle ) ) otherlv_3= 'WHERE' ( (lv_q1key_4_0= ruleInputFieldSingle ) ) ( (lv_q1val_5_0= ruleInputVal ) ) ( (lv_qryadditional_6_0= ruleAdditionalQuery ) )? )
            // InternalJsonQ.g:152:3: otherlv_0= 'GET' ( (lv_opAgg_1_0= ruleOperationAgg ) ) ( (lv_aggField_2_0= ruleInputFieldSingle ) ) otherlv_3= 'WHERE' ( (lv_q1key_4_0= ruleInputFieldSingle ) ) ( (lv_q1val_5_0= ruleInputVal ) ) ( (lv_qryadditional_6_0= ruleAdditionalQuery ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregateStatementsAccess().getGETKeyword_0());
            		
            // InternalJsonQ.g:156:3: ( (lv_opAgg_1_0= ruleOperationAgg ) )
            // InternalJsonQ.g:157:4: (lv_opAgg_1_0= ruleOperationAgg )
            {
            // InternalJsonQ.g:157:4: (lv_opAgg_1_0= ruleOperationAgg )
            // InternalJsonQ.g:158:5: lv_opAgg_1_0= ruleOperationAgg
            {

            					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getOpAggOperationAggEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_opAgg_1_0=ruleOperationAgg();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
            					}
            					set(
            						current,
            						"opAgg",
            						lv_opAgg_1_0,
            						"uk.ac.kcl.course.JsonQ.OperationAgg");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:175:3: ( (lv_aggField_2_0= ruleInputFieldSingle ) )
            // InternalJsonQ.g:176:4: (lv_aggField_2_0= ruleInputFieldSingle )
            {
            // InternalJsonQ.g:176:4: (lv_aggField_2_0= ruleInputFieldSingle )
            // InternalJsonQ.g:177:5: lv_aggField_2_0= ruleInputFieldSingle
            {

            					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getAggFieldInputFieldSingleEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_aggField_2_0=ruleInputFieldSingle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
            					}
            					set(
            						current,
            						"aggField",
            						lv_aggField_2_0,
            						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregateStatementsAccess().getWHEREKeyword_3());
            		
            // InternalJsonQ.g:198:3: ( (lv_q1key_4_0= ruleInputFieldSingle ) )
            // InternalJsonQ.g:199:4: (lv_q1key_4_0= ruleInputFieldSingle )
            {
            // InternalJsonQ.g:199:4: (lv_q1key_4_0= ruleInputFieldSingle )
            // InternalJsonQ.g:200:5: lv_q1key_4_0= ruleInputFieldSingle
            {

            					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_q1key_4_0=ruleInputFieldSingle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
            					}
            					set(
            						current,
            						"q1key",
            						lv_q1key_4_0,
            						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:217:3: ( (lv_q1val_5_0= ruleInputVal ) )
            // InternalJsonQ.g:218:4: (lv_q1val_5_0= ruleInputVal )
            {
            // InternalJsonQ.g:218:4: (lv_q1val_5_0= ruleInputVal )
            // InternalJsonQ.g:219:5: lv_q1val_5_0= ruleInputVal
            {

            					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getQ1valInputValParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_q1val_5_0=ruleInputVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
            					}
            					set(
            						current,
            						"q1val",
            						lv_q1val_5_0,
            						"uk.ac.kcl.course.JsonQ.InputVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:236:3: ( (lv_qryadditional_6_0= ruleAdditionalQuery ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonQ.g:237:4: (lv_qryadditional_6_0= ruleAdditionalQuery )
                    {
                    // InternalJsonQ.g:237:4: (lv_qryadditional_6_0= ruleAdditionalQuery )
                    // InternalJsonQ.g:238:5: lv_qryadditional_6_0= ruleAdditionalQuery
                    {

                    					newCompositeNode(grammarAccess.getAggregateStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qryadditional_6_0=ruleAdditionalQuery();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAggregateStatementsRule());
                    					}
                    					set(
                    						current,
                    						"qryadditional",
                    						lv_qryadditional_6_0,
                    						"uk.ac.kcl.course.JsonQ.AdditionalQuery");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAggregateStatements"


    // $ANTLR start "entryRuleGetStatements"
    // InternalJsonQ.g:259:1: entryRuleGetStatements returns [EObject current=null] : iv_ruleGetStatements= ruleGetStatements EOF ;
    public final EObject entryRuleGetStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetStatements = null;


        try {
            // InternalJsonQ.g:259:54: (iv_ruleGetStatements= ruleGetStatements EOF )
            // InternalJsonQ.g:260:2: iv_ruleGetStatements= ruleGetStatements EOF
            {
             newCompositeNode(grammarAccess.getGetStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetStatements=ruleGetStatements();

            state._fsp--;

             current =iv_ruleGetStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetStatements"


    // $ANTLR start "ruleGetStatements"
    // InternalJsonQ.g:266:1: ruleGetStatements returns [EObject current=null] : (otherlv_0= 'GET' ( (lv_opGet_1_0= ruleOperationGET ) ) otherlv_2= 'WHERE' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( (lv_qryadditional_5_0= ruleAdditionalQuery ) )? ) ;
    public final EObject ruleGetStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_opGet_1_0 = null;

        Enumerator lv_q1key_3_0 = null;

        EObject lv_q1val_4_0 = null;

        EObject lv_qryadditional_5_0 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:272:2: ( (otherlv_0= 'GET' ( (lv_opGet_1_0= ruleOperationGET ) ) otherlv_2= 'WHERE' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( (lv_qryadditional_5_0= ruleAdditionalQuery ) )? ) )
            // InternalJsonQ.g:273:2: (otherlv_0= 'GET' ( (lv_opGet_1_0= ruleOperationGET ) ) otherlv_2= 'WHERE' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( (lv_qryadditional_5_0= ruleAdditionalQuery ) )? )
            {
            // InternalJsonQ.g:273:2: (otherlv_0= 'GET' ( (lv_opGet_1_0= ruleOperationGET ) ) otherlv_2= 'WHERE' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( (lv_qryadditional_5_0= ruleAdditionalQuery ) )? )
            // InternalJsonQ.g:274:3: otherlv_0= 'GET' ( (lv_opGet_1_0= ruleOperationGET ) ) otherlv_2= 'WHERE' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( (lv_qryadditional_5_0= ruleAdditionalQuery ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGetStatementsAccess().getGETKeyword_0());
            		
            // InternalJsonQ.g:278:3: ( (lv_opGet_1_0= ruleOperationGET ) )
            // InternalJsonQ.g:279:4: (lv_opGet_1_0= ruleOperationGET )
            {
            // InternalJsonQ.g:279:4: (lv_opGet_1_0= ruleOperationGET )
            // InternalJsonQ.g:280:5: lv_opGet_1_0= ruleOperationGET
            {

            					newCompositeNode(grammarAccess.getGetStatementsAccess().getOpGetOperationGETEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_opGet_1_0=ruleOperationGET();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetStatementsRule());
            					}
            					set(
            						current,
            						"opGet",
            						lv_opGet_1_0,
            						"uk.ac.kcl.course.JsonQ.OperationGET");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGetStatementsAccess().getWHEREKeyword_2());
            		
            // InternalJsonQ.g:301:3: ( (lv_q1key_3_0= ruleInputFieldSingle ) )
            // InternalJsonQ.g:302:4: (lv_q1key_3_0= ruleInputFieldSingle )
            {
            // InternalJsonQ.g:302:4: (lv_q1key_3_0= ruleInputFieldSingle )
            // InternalJsonQ.g:303:5: lv_q1key_3_0= ruleInputFieldSingle
            {

            					newCompositeNode(grammarAccess.getGetStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_q1key_3_0=ruleInputFieldSingle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetStatementsRule());
            					}
            					set(
            						current,
            						"q1key",
            						lv_q1key_3_0,
            						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:320:3: ( (lv_q1val_4_0= ruleInputVal ) )
            // InternalJsonQ.g:321:4: (lv_q1val_4_0= ruleInputVal )
            {
            // InternalJsonQ.g:321:4: (lv_q1val_4_0= ruleInputVal )
            // InternalJsonQ.g:322:5: lv_q1val_4_0= ruleInputVal
            {

            					newCompositeNode(grammarAccess.getGetStatementsAccess().getQ1valInputValParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_q1val_4_0=ruleInputVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetStatementsRule());
            					}
            					set(
            						current,
            						"q1val",
            						lv_q1val_4_0,
            						"uk.ac.kcl.course.JsonQ.InputVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:339:3: ( (lv_qryadditional_5_0= ruleAdditionalQuery ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonQ.g:340:4: (lv_qryadditional_5_0= ruleAdditionalQuery )
                    {
                    // InternalJsonQ.g:340:4: (lv_qryadditional_5_0= ruleAdditionalQuery )
                    // InternalJsonQ.g:341:5: lv_qryadditional_5_0= ruleAdditionalQuery
                    {

                    					newCompositeNode(grammarAccess.getGetStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_qryadditional_5_0=ruleAdditionalQuery();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGetStatementsRule());
                    					}
                    					set(
                    						current,
                    						"qryadditional",
                    						lv_qryadditional_5_0,
                    						"uk.ac.kcl.course.JsonQ.AdditionalQuery");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetStatements"


    // $ANTLR start "entryRuleAdditionalQuery"
    // InternalJsonQ.g:362:1: entryRuleAdditionalQuery returns [EObject current=null] : iv_ruleAdditionalQuery= ruleAdditionalQuery EOF ;
    public final EObject entryRuleAdditionalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalQuery = null;


        try {
            // InternalJsonQ.g:362:56: (iv_ruleAdditionalQuery= ruleAdditionalQuery EOF )
            // InternalJsonQ.g:363:2: iv_ruleAdditionalQuery= ruleAdditionalQuery EOF
            {
             newCompositeNode(grammarAccess.getAdditionalQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalQuery=ruleAdditionalQuery();

            state._fsp--;

             current =iv_ruleAdditionalQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalQuery"


    // $ANTLR start "ruleAdditionalQuery"
    // InternalJsonQ.g:369:1: ruleAdditionalQuery returns [EObject current=null] : ( ( ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) ) ) ( (lv_q2key_1_0= ruleInputFieldSingle ) ) ( (lv_q2val_2_0= ruleInputVal ) ) ) ;
    public final EObject ruleAdditionalQuery() throws RecognitionException {
        EObject current = null;

        Token lv_connector_0_1=null;
        Token lv_connector_0_2=null;
        Enumerator lv_q2key_1_0 = null;

        EObject lv_q2val_2_0 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:375:2: ( ( ( ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) ) ) ( (lv_q2key_1_0= ruleInputFieldSingle ) ) ( (lv_q2val_2_0= ruleInputVal ) ) ) )
            // InternalJsonQ.g:376:2: ( ( ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) ) ) ( (lv_q2key_1_0= ruleInputFieldSingle ) ) ( (lv_q2val_2_0= ruleInputVal ) ) )
            {
            // InternalJsonQ.g:376:2: ( ( ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) ) ) ( (lv_q2key_1_0= ruleInputFieldSingle ) ) ( (lv_q2val_2_0= ruleInputVal ) ) )
            // InternalJsonQ.g:377:3: ( ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) ) ) ( (lv_q2key_1_0= ruleInputFieldSingle ) ) ( (lv_q2val_2_0= ruleInputVal ) )
            {
            // InternalJsonQ.g:377:3: ( ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) ) )
            // InternalJsonQ.g:378:4: ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) )
            {
            // InternalJsonQ.g:378:4: ( (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' ) )
            // InternalJsonQ.g:379:5: (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' )
            {
            // InternalJsonQ.g:379:5: (lv_connector_0_1= 'AND' | lv_connector_0_2= 'OR' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonQ.g:380:6: lv_connector_0_1= 'AND'
                    {
                    lv_connector_0_1=(Token)match(input,13,FOLLOW_5); 

                    						newLeafNode(lv_connector_0_1, grammarAccess.getAdditionalQueryAccess().getConnectorANDKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionalQueryRule());
                    						}
                    						setWithLastConsumed(current, "connector", lv_connector_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:391:6: lv_connector_0_2= 'OR'
                    {
                    lv_connector_0_2=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_connector_0_2, grammarAccess.getAdditionalQueryAccess().getConnectorORKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAdditionalQueryRule());
                    						}
                    						setWithLastConsumed(current, "connector", lv_connector_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalJsonQ.g:404:3: ( (lv_q2key_1_0= ruleInputFieldSingle ) )
            // InternalJsonQ.g:405:4: (lv_q2key_1_0= ruleInputFieldSingle )
            {
            // InternalJsonQ.g:405:4: (lv_q2key_1_0= ruleInputFieldSingle )
            // InternalJsonQ.g:406:5: lv_q2key_1_0= ruleInputFieldSingle
            {

            					newCompositeNode(grammarAccess.getAdditionalQueryAccess().getQ2keyInputFieldSingleEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_q2key_1_0=ruleInputFieldSingle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalQueryRule());
            					}
            					set(
            						current,
            						"q2key",
            						lv_q2key_1_0,
            						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:423:3: ( (lv_q2val_2_0= ruleInputVal ) )
            // InternalJsonQ.g:424:4: (lv_q2val_2_0= ruleInputVal )
            {
            // InternalJsonQ.g:424:4: (lv_q2val_2_0= ruleInputVal )
            // InternalJsonQ.g:425:5: lv_q2val_2_0= ruleInputVal
            {

            					newCompositeNode(grammarAccess.getAdditionalQueryAccess().getQ2valInputValParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_q2val_2_0=ruleInputVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionalQueryRule());
            					}
            					set(
            						current,
            						"q2val",
            						lv_q2val_2_0,
            						"uk.ac.kcl.course.JsonQ.InputVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalQuery"


    // $ANTLR start "entryRuleInputVal"
    // InternalJsonQ.g:446:1: entryRuleInputVal returns [EObject current=null] : iv_ruleInputVal= ruleInputVal EOF ;
    public final EObject entryRuleInputVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVal = null;


        try {
            // InternalJsonQ.g:446:49: (iv_ruleInputVal= ruleInputVal EOF )
            // InternalJsonQ.g:447:2: iv_ruleInputVal= ruleInputVal EOF
            {
             newCompositeNode(grammarAccess.getInputValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputVal=ruleInputVal();

            state._fsp--;

             current =iv_ruleInputVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputVal"


    // $ANTLR start "ruleInputVal"
    // InternalJsonQ.g:453:1: ruleInputVal returns [EObject current=null] : (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleInputVal() throws RecognitionException {
        EObject current = null;

        EObject this_INTLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:459:2: ( (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalJsonQ.g:460:2: (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalJsonQ.g:460:2: (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonQ.g:461:3: this_INTLiteral_0= ruleINTLiteral
                    {

                    			newCompositeNode(grammarAccess.getInputValAccess().getINTLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_INTLiteral_0=ruleINTLiteral();

                    state._fsp--;


                    			current = this_INTLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:470:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputVal"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalJsonQ.g:482:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalJsonQ.g:482:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalJsonQ.g:483:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalJsonQ.g:489:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJsonQ.g:495:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJsonQ.g:496:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJsonQ.g:496:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJsonQ.g:497:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJsonQ.g:497:3: (lv_value_0_0= RULE_STRING )
            // InternalJsonQ.g:498:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleINTLiteral"
    // InternalJsonQ.g:517:1: entryRuleINTLiteral returns [EObject current=null] : iv_ruleINTLiteral= ruleINTLiteral EOF ;
    public final EObject entryRuleINTLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTLiteral = null;


        try {
            // InternalJsonQ.g:517:51: (iv_ruleINTLiteral= ruleINTLiteral EOF )
            // InternalJsonQ.g:518:2: iv_ruleINTLiteral= ruleINTLiteral EOF
            {
             newCompositeNode(grammarAccess.getINTLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTLiteral=ruleINTLiteral();

            state._fsp--;

             current =iv_ruleINTLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTLiteral"


    // $ANTLR start "ruleINTLiteral"
    // InternalJsonQ.g:524:1: ruleINTLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleINTLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJsonQ.g:530:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalJsonQ.g:531:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalJsonQ.g:531:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalJsonQ.g:532:3: (lv_value_0_0= RULE_INT )
            {
            // InternalJsonQ.g:532:3: (lv_value_0_0= RULE_INT )
            // InternalJsonQ.g:533:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getINTLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getINTLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTLiteral"


    // $ANTLR start "ruleOperationAgg"
    // InternalJsonQ.g:552:1: ruleOperationAgg returns [Enumerator current=null] : (enumLiteral_0= 'AVG' ) ;
    public final Enumerator ruleOperationAgg() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalJsonQ.g:558:2: ( (enumLiteral_0= 'AVG' ) )
            // InternalJsonQ.g:559:2: (enumLiteral_0= 'AVG' )
            {
            // InternalJsonQ.g:559:2: (enumLiteral_0= 'AVG' )
            // InternalJsonQ.g:560:3: enumLiteral_0= 'AVG'
            {
            enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

            			current = grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationAgg"


    // $ANTLR start "ruleOperationGET"
    // InternalJsonQ.g:569:1: ruleOperationGET returns [Enumerator current=null] : ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'COUNT' ) ) ;
    public final Enumerator ruleOperationGET() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJsonQ.g:575:2: ( ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'COUNT' ) ) )
            // InternalJsonQ.g:576:2: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'COUNT' ) )
            {
            // InternalJsonQ.g:576:2: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'COUNT' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonQ.g:577:3: (enumLiteral_0= 'DATA' )
                    {
                    // InternalJsonQ.g:577:3: (enumLiteral_0= 'DATA' )
                    // InternalJsonQ.g:578:4: enumLiteral_0= 'DATA'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:585:3: (enumLiteral_1= 'COUNT' )
                    {
                    // InternalJsonQ.g:585:3: (enumLiteral_1= 'COUNT' )
                    // InternalJsonQ.g:586:4: enumLiteral_1= 'COUNT'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationGET"


    // $ANTLR start "ruleInputFieldSingle"
    // InternalJsonQ.g:596:1: ruleInputFieldSingle returns [Enumerator current=null] : ( (enumLiteral_0= 'firstName' ) | (enumLiteral_1= 'lastName' ) | (enumLiteral_2= 'gender' ) | (enumLiteral_3= 'counrtyCode' ) | (enumLiteral_4= 'cityName' ) | (enumLiteral_5= 'isVaccinated' ) | (enumLiteral_6= 'income' ) ) ;
    public final Enumerator ruleInputFieldSingle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalJsonQ.g:602:2: ( ( (enumLiteral_0= 'firstName' ) | (enumLiteral_1= 'lastName' ) | (enumLiteral_2= 'gender' ) | (enumLiteral_3= 'counrtyCode' ) | (enumLiteral_4= 'cityName' ) | (enumLiteral_5= 'isVaccinated' ) | (enumLiteral_6= 'income' ) ) )
            // InternalJsonQ.g:603:2: ( (enumLiteral_0= 'firstName' ) | (enumLiteral_1= 'lastName' ) | (enumLiteral_2= 'gender' ) | (enumLiteral_3= 'counrtyCode' ) | (enumLiteral_4= 'cityName' ) | (enumLiteral_5= 'isVaccinated' ) | (enumLiteral_6= 'income' ) )
            {
            // InternalJsonQ.g:603:2: ( (enumLiteral_0= 'firstName' ) | (enumLiteral_1= 'lastName' ) | (enumLiteral_2= 'gender' ) | (enumLiteral_3= 'counrtyCode' ) | (enumLiteral_4= 'cityName' ) | (enumLiteral_5= 'isVaccinated' ) | (enumLiteral_6= 'income' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJsonQ.g:604:3: (enumLiteral_0= 'firstName' )
                    {
                    // InternalJsonQ.g:604:3: (enumLiteral_0= 'firstName' )
                    // InternalJsonQ.g:605:4: enumLiteral_0= 'firstName'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:612:3: (enumLiteral_1= 'lastName' )
                    {
                    // InternalJsonQ.g:612:3: (enumLiteral_1= 'lastName' )
                    // InternalJsonQ.g:613:4: enumLiteral_1= 'lastName'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonQ.g:620:3: (enumLiteral_2= 'gender' )
                    {
                    // InternalJsonQ.g:620:3: (enumLiteral_2= 'gender' )
                    // InternalJsonQ.g:621:4: enumLiteral_2= 'gender'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonQ.g:628:3: (enumLiteral_3= 'counrtyCode' )
                    {
                    // InternalJsonQ.g:628:3: (enumLiteral_3= 'counrtyCode' )
                    // InternalJsonQ.g:629:4: enumLiteral_3= 'counrtyCode'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonQ.g:636:3: (enumLiteral_4= 'cityName' )
                    {
                    // InternalJsonQ.g:636:3: (enumLiteral_4= 'cityName' )
                    // InternalJsonQ.g:637:4: enumLiteral_4= 'cityName'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonQ.g:644:3: (enumLiteral_5= 'isVaccinated' )
                    {
                    // InternalJsonQ.g:644:3: (enumLiteral_5= 'isVaccinated' )
                    // InternalJsonQ.g:645:4: enumLiteral_5= 'isVaccinated'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonQ.g:652:3: (enumLiteral_6= 'income' )
                    {
                    // InternalJsonQ.g:652:3: (enumLiteral_6= 'income' )
                    // InternalJsonQ.g:653:4: enumLiteral_6= 'income'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputFieldSingle"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});

}