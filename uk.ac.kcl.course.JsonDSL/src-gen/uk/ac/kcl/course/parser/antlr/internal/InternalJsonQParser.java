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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GET'", "'FOR'", "'AND'", "'OR'", "'DATA'", "'areaType'", "'areaName'", "'areaCode'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalJsonQ.g:108:1: ruleStatements returns [EObject current=null] : (otherlv_0= 'GET' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'FOR' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) ) )? ( ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) ) )? ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_connector_5_1=null;
        Token lv_connector_5_2=null;
        Enumerator lv_operation_1_0 = null;

        Enumerator lv_q1key_3_0 = null;

        EObject lv_q1val_4_0 = null;

        Enumerator lv_q2key_6_0 = null;

        EObject lv_q2val_7_0 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:114:2: ( (otherlv_0= 'GET' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'FOR' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) ) )? ( ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) ) )? ) )
            // InternalJsonQ.g:115:2: (otherlv_0= 'GET' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'FOR' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) ) )? ( ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) ) )? )
            {
            // InternalJsonQ.g:115:2: (otherlv_0= 'GET' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'FOR' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) ) )? ( ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) ) )? )
            // InternalJsonQ.g:116:3: otherlv_0= 'GET' ( (lv_operation_1_0= ruleOperation ) ) otherlv_2= 'FOR' ( (lv_q1key_3_0= ruleInputFieldSingle ) ) ( (lv_q1val_4_0= ruleInputVal ) ) ( ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) ) )? ( ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementsAccess().getGETKeyword_0());
            		
            // InternalJsonQ.g:120:3: ( (lv_operation_1_0= ruleOperation ) )
            // InternalJsonQ.g:121:4: (lv_operation_1_0= ruleOperation )
            {
            // InternalJsonQ.g:121:4: (lv_operation_1_0= ruleOperation )
            // InternalJsonQ.g:122:5: lv_operation_1_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getOperationOperationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_operation_1_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementsRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_1_0,
            						"uk.ac.kcl.course.JsonQ.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementsAccess().getFORKeyword_2());
            		
            // InternalJsonQ.g:143:3: ( (lv_q1key_3_0= ruleInputFieldSingle ) )
            // InternalJsonQ.g:144:4: (lv_q1key_3_0= ruleInputFieldSingle )
            {
            // InternalJsonQ.g:144:4: (lv_q1key_3_0= ruleInputFieldSingle )
            // InternalJsonQ.g:145:5: lv_q1key_3_0= ruleInputFieldSingle
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_q1key_3_0=ruleInputFieldSingle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementsRule());
            					}
            					set(
            						current,
            						"q1key",
            						lv_q1key_3_0,
            						"uk.ac.kcl.course.JsonQ.InputFieldSingle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:162:3: ( (lv_q1val_4_0= ruleInputVal ) )
            // InternalJsonQ.g:163:4: (lv_q1val_4_0= ruleInputVal )
            {
            // InternalJsonQ.g:163:4: (lv_q1val_4_0= ruleInputVal )
            // InternalJsonQ.g:164:5: lv_q1val_4_0= ruleInputVal
            {

            					newCompositeNode(grammarAccess.getStatementsAccess().getQ1valInputValParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_q1val_4_0=ruleInputVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementsRule());
            					}
            					set(
            						current,
            						"q1val",
            						lv_q1val_4_0,
            						"uk.ac.kcl.course.JsonQ.InputVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonQ.g:181:3: ( ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonQ.g:182:4: ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) )
                    {
                    // InternalJsonQ.g:182:4: ( (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' ) )
                    // InternalJsonQ.g:183:5: (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' )
                    {
                    // InternalJsonQ.g:183:5: (lv_connector_5_1= 'AND' | lv_connector_5_2= 'OR' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==14) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalJsonQ.g:184:6: lv_connector_5_1= 'AND'
                            {
                            lv_connector_5_1=(Token)match(input,13,FOLLOW_9); 

                            						newLeafNode(lv_connector_5_1, grammarAccess.getStatementsAccess().getConnectorANDKeyword_5_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getStatementsRule());
                            						}
                            						addWithLastConsumed(current, "connector", lv_connector_5_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalJsonQ.g:195:6: lv_connector_5_2= 'OR'
                            {
                            lv_connector_5_2=(Token)match(input,14,FOLLOW_9); 

                            						newLeafNode(lv_connector_5_2, grammarAccess.getStatementsAccess().getConnectorORKeyword_5_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getStatementsRule());
                            						}
                            						addWithLastConsumed(current, "connector", lv_connector_5_2, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalJsonQ.g:208:3: ( ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=18)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonQ.g:209:4: ( (lv_q2key_6_0= ruleInputFieldSingle ) ) ( (lv_q2val_7_0= ruleInputVal ) )
                    {
                    // InternalJsonQ.g:209:4: ( (lv_q2key_6_0= ruleInputFieldSingle ) )
                    // InternalJsonQ.g:210:5: (lv_q2key_6_0= ruleInputFieldSingle )
                    {
                    // InternalJsonQ.g:210:5: (lv_q2key_6_0= ruleInputFieldSingle )
                    // InternalJsonQ.g:211:6: lv_q2key_6_0= ruleInputFieldSingle
                    {

                    						newCompositeNode(grammarAccess.getStatementsAccess().getQ2keyInputFieldSingleEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_q2key_6_0=ruleInputFieldSingle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementsRule());
                    						}
                    						set(
                    							current,
                    							"q2key",
                    							lv_q2key_6_0,
                    							"uk.ac.kcl.course.JsonQ.InputFieldSingle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonQ.g:228:4: ( (lv_q2val_7_0= ruleInputVal ) )
                    // InternalJsonQ.g:229:5: (lv_q2val_7_0= ruleInputVal )
                    {
                    // InternalJsonQ.g:229:5: (lv_q2val_7_0= ruleInputVal )
                    // InternalJsonQ.g:230:6: lv_q2val_7_0= ruleInputVal
                    {

                    						newCompositeNode(grammarAccess.getStatementsAccess().getQ2valInputValParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_q2val_7_0=ruleInputVal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementsRule());
                    						}
                    						set(
                    							current,
                    							"q2val",
                    							lv_q2val_7_0,
                    							"uk.ac.kcl.course.JsonQ.InputVal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleInputVal"
    // InternalJsonQ.g:252:1: entryRuleInputVal returns [EObject current=null] : iv_ruleInputVal= ruleInputVal EOF ;
    public final EObject entryRuleInputVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVal = null;


        try {
            // InternalJsonQ.g:252:49: (iv_ruleInputVal= ruleInputVal EOF )
            // InternalJsonQ.g:253:2: iv_ruleInputVal= ruleInputVal EOF
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
    // InternalJsonQ.g:259:1: ruleInputVal returns [EObject current=null] : (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleInputVal() throws RecognitionException {
        EObject current = null;

        EObject this_INTLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalJsonQ.g:265:2: ( (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalJsonQ.g:266:2: (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalJsonQ.g:266:2: (this_INTLiteral_0= ruleINTLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonQ.g:267:3: this_INTLiteral_0= ruleINTLiteral
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
                    // InternalJsonQ.g:276:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalJsonQ.g:288:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalJsonQ.g:288:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalJsonQ.g:289:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalJsonQ.g:295:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJsonQ.g:301:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJsonQ.g:302:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJsonQ.g:302:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJsonQ.g:303:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJsonQ.g:303:3: (lv_value_0_0= RULE_STRING )
            // InternalJsonQ.g:304:4: lv_value_0_0= RULE_STRING
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
    // InternalJsonQ.g:323:1: entryRuleINTLiteral returns [EObject current=null] : iv_ruleINTLiteral= ruleINTLiteral EOF ;
    public final EObject entryRuleINTLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTLiteral = null;


        try {
            // InternalJsonQ.g:323:51: (iv_ruleINTLiteral= ruleINTLiteral EOF )
            // InternalJsonQ.g:324:2: iv_ruleINTLiteral= ruleINTLiteral EOF
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
    // InternalJsonQ.g:330:1: ruleINTLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleINTLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJsonQ.g:336:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalJsonQ.g:337:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalJsonQ.g:337:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalJsonQ.g:338:3: (lv_value_0_0= RULE_INT )
            {
            // InternalJsonQ.g:338:3: (lv_value_0_0= RULE_INT )
            // InternalJsonQ.g:339:4: lv_value_0_0= RULE_INT
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


    // $ANTLR start "ruleOperation"
    // InternalJsonQ.g:358:1: ruleOperation returns [Enumerator current=null] : (enumLiteral_0= 'DATA' ) ;
    public final Enumerator ruleOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalJsonQ.g:364:2: ( (enumLiteral_0= 'DATA' ) )
            // InternalJsonQ.g:365:2: (enumLiteral_0= 'DATA' )
            {
            // InternalJsonQ.g:365:2: (enumLiteral_0= 'DATA' )
            // InternalJsonQ.g:366:3: enumLiteral_0= 'DATA'
            {
            enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

            			current = grammarAccess.getOperationAccess().getDATAEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getDATAEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleInputFieldSingle"
    // InternalJsonQ.g:375:1: ruleInputFieldSingle returns [Enumerator current=null] : ( (enumLiteral_0= 'areaType' ) | (enumLiteral_1= 'areaName' ) | (enumLiteral_2= 'areaCode' ) ) ;
    public final Enumerator ruleInputFieldSingle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJsonQ.g:381:2: ( ( (enumLiteral_0= 'areaType' ) | (enumLiteral_1= 'areaName' ) | (enumLiteral_2= 'areaCode' ) ) )
            // InternalJsonQ.g:382:2: ( (enumLiteral_0= 'areaType' ) | (enumLiteral_1= 'areaName' ) | (enumLiteral_2= 'areaCode' ) )
            {
            // InternalJsonQ.g:382:2: ( (enumLiteral_0= 'areaType' ) | (enumLiteral_1= 'areaName' ) | (enumLiteral_2= 'areaCode' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJsonQ.g:383:3: (enumLiteral_0= 'areaType' )
                    {
                    // InternalJsonQ.g:383:3: (enumLiteral_0= 'areaType' )
                    // InternalJsonQ.g:384:4: enumLiteral_0= 'areaType'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getAreaTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInputFieldSingleAccess().getAreaTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:391:3: (enumLiteral_1= 'areaName' )
                    {
                    // InternalJsonQ.g:391:3: (enumLiteral_1= 'areaName' )
                    // InternalJsonQ.g:392:4: enumLiteral_1= 'areaName'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getAreaNameEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInputFieldSingleAccess().getAreaNameEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonQ.g:399:3: (enumLiteral_2= 'areaCode' )
                    {
                    // InternalJsonQ.g:399:3: (enumLiteral_2= 'areaCode' )
                    // InternalJsonQ.g:400:4: enumLiteral_2= 'areaCode'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getInputFieldSingleAccess().getAreaCodeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInputFieldSingleAccess().getAreaCodeEnumLiteralDeclaration_2());
                    			

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000076002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000070002L});

}