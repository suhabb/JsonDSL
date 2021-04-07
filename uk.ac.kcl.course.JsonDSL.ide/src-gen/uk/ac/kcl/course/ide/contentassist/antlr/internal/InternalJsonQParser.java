package uk.ac.kcl.course.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.course.services.JsonQGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonQParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AVG'", "'AND'", "'OR'", "'DATA'", "'COUNT'", "'firstName'", "'lastName'", "'gender'", "'counrtyCode'", "'cityName'", "'isVaccinated'", "'income'", "'GET'", "'WHERE'", "'END'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

    	public void setGrammarAccess(JsonQGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleJSONQueryModel"
    // InternalJsonQ.g:53:1: entryRuleJSONQueryModel : ruleJSONQueryModel EOF ;
    public final void entryRuleJSONQueryModel() throws RecognitionException {
        try {
            // InternalJsonQ.g:54:1: ( ruleJSONQueryModel EOF )
            // InternalJsonQ.g:55:1: ruleJSONQueryModel EOF
            {
             before(grammarAccess.getJSONQueryModelRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONQueryModel();

            state._fsp--;

             after(grammarAccess.getJSONQueryModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSONQueryModel"


    // $ANTLR start "ruleJSONQueryModel"
    // InternalJsonQ.g:62:1: ruleJSONQueryModel : ( ( rule__JSONQueryModel__InputStatementAssignment )* ) ;
    public final void ruleJSONQueryModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:66:2: ( ( ( rule__JSONQueryModel__InputStatementAssignment )* ) )
            // InternalJsonQ.g:67:2: ( ( rule__JSONQueryModel__InputStatementAssignment )* )
            {
            // InternalJsonQ.g:67:2: ( ( rule__JSONQueryModel__InputStatementAssignment )* )
            // InternalJsonQ.g:68:3: ( rule__JSONQueryModel__InputStatementAssignment )*
            {
             before(grammarAccess.getJSONQueryModelAccess().getInputStatementAssignment()); 
            // InternalJsonQ.g:69:3: ( rule__JSONQueryModel__InputStatementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonQ.g:69:4: rule__JSONQueryModel__InputStatementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__JSONQueryModel__InputStatementAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getJSONQueryModelAccess().getInputStatementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONQueryModel"


    // $ANTLR start "entryRuleStatements"
    // InternalJsonQ.g:78:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalJsonQ.g:79:1: ( ruleStatements EOF )
            // InternalJsonQ.g:80:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalJsonQ.g:87:1: ruleStatements : ( ( rule__Statements__Alternatives ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:91:2: ( ( ( rule__Statements__Alternatives ) ) )
            // InternalJsonQ.g:92:2: ( ( rule__Statements__Alternatives ) )
            {
            // InternalJsonQ.g:92:2: ( ( rule__Statements__Alternatives ) )
            // InternalJsonQ.g:93:3: ( rule__Statements__Alternatives )
            {
             before(grammarAccess.getStatementsAccess().getAlternatives()); 
            // InternalJsonQ.g:94:3: ( rule__Statements__Alternatives )
            // InternalJsonQ.g:94:4: rule__Statements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleAggregateStatements"
    // InternalJsonQ.g:103:1: entryRuleAggregateStatements : ruleAggregateStatements EOF ;
    public final void entryRuleAggregateStatements() throws RecognitionException {
        try {
            // InternalJsonQ.g:104:1: ( ruleAggregateStatements EOF )
            // InternalJsonQ.g:105:1: ruleAggregateStatements EOF
            {
             before(grammarAccess.getAggregateStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregateStatements();

            state._fsp--;

             after(grammarAccess.getAggregateStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregateStatements"


    // $ANTLR start "ruleAggregateStatements"
    // InternalJsonQ.g:112:1: ruleAggregateStatements : ( ( rule__AggregateStatements__Group__0 ) ) ;
    public final void ruleAggregateStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:116:2: ( ( ( rule__AggregateStatements__Group__0 ) ) )
            // InternalJsonQ.g:117:2: ( ( rule__AggregateStatements__Group__0 ) )
            {
            // InternalJsonQ.g:117:2: ( ( rule__AggregateStatements__Group__0 ) )
            // InternalJsonQ.g:118:3: ( rule__AggregateStatements__Group__0 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getGroup()); 
            // InternalJsonQ.g:119:3: ( rule__AggregateStatements__Group__0 )
            // InternalJsonQ.g:119:4: rule__AggregateStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregateStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregateStatements"


    // $ANTLR start "entryRuleGetStatements"
    // InternalJsonQ.g:128:1: entryRuleGetStatements : ruleGetStatements EOF ;
    public final void entryRuleGetStatements() throws RecognitionException {
        try {
            // InternalJsonQ.g:129:1: ( ruleGetStatements EOF )
            // InternalJsonQ.g:130:1: ruleGetStatements EOF
            {
             before(grammarAccess.getGetStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleGetStatements();

            state._fsp--;

             after(grammarAccess.getGetStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetStatements"


    // $ANTLR start "ruleGetStatements"
    // InternalJsonQ.g:137:1: ruleGetStatements : ( ( rule__GetStatements__Group__0 ) ) ;
    public final void ruleGetStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:141:2: ( ( ( rule__GetStatements__Group__0 ) ) )
            // InternalJsonQ.g:142:2: ( ( rule__GetStatements__Group__0 ) )
            {
            // InternalJsonQ.g:142:2: ( ( rule__GetStatements__Group__0 ) )
            // InternalJsonQ.g:143:3: ( rule__GetStatements__Group__0 )
            {
             before(grammarAccess.getGetStatementsAccess().getGroup()); 
            // InternalJsonQ.g:144:3: ( rule__GetStatements__Group__0 )
            // InternalJsonQ.g:144:4: rule__GetStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetStatements"


    // $ANTLR start "entryRuleAdditionalQuery"
    // InternalJsonQ.g:153:1: entryRuleAdditionalQuery : ruleAdditionalQuery EOF ;
    public final void entryRuleAdditionalQuery() throws RecognitionException {
        try {
            // InternalJsonQ.g:154:1: ( ruleAdditionalQuery EOF )
            // InternalJsonQ.g:155:1: ruleAdditionalQuery EOF
            {
             before(grammarAccess.getAdditionalQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditionalQuery();

            state._fsp--;

             after(grammarAccess.getAdditionalQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionalQuery"


    // $ANTLR start "ruleAdditionalQuery"
    // InternalJsonQ.g:162:1: ruleAdditionalQuery : ( ( rule__AdditionalQuery__Group__0 ) ) ;
    public final void ruleAdditionalQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:166:2: ( ( ( rule__AdditionalQuery__Group__0 ) ) )
            // InternalJsonQ.g:167:2: ( ( rule__AdditionalQuery__Group__0 ) )
            {
            // InternalJsonQ.g:167:2: ( ( rule__AdditionalQuery__Group__0 ) )
            // InternalJsonQ.g:168:3: ( rule__AdditionalQuery__Group__0 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getGroup()); 
            // InternalJsonQ.g:169:3: ( rule__AdditionalQuery__Group__0 )
            // InternalJsonQ.g:169:4: rule__AdditionalQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionalQuery"


    // $ANTLR start "entryRuleInputVal"
    // InternalJsonQ.g:178:1: entryRuleInputVal : ruleInputVal EOF ;
    public final void entryRuleInputVal() throws RecognitionException {
        try {
            // InternalJsonQ.g:179:1: ( ruleInputVal EOF )
            // InternalJsonQ.g:180:1: ruleInputVal EOF
            {
             before(grammarAccess.getInputValRule()); 
            pushFollow(FOLLOW_1);
            ruleInputVal();

            state._fsp--;

             after(grammarAccess.getInputValRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputVal"


    // $ANTLR start "ruleInputVal"
    // InternalJsonQ.g:187:1: ruleInputVal : ( ruleStringLiteral ) ;
    public final void ruleInputVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:191:2: ( ( ruleStringLiteral ) )
            // InternalJsonQ.g:192:2: ( ruleStringLiteral )
            {
            // InternalJsonQ.g:192:2: ( ruleStringLiteral )
            // InternalJsonQ.g:193:3: ruleStringLiteral
            {
             before(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputVal"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalJsonQ.g:203:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJsonQ.g:204:1: ( ruleStringLiteral EOF )
            // InternalJsonQ.g:205:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalJsonQ.g:212:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:216:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalJsonQ.g:217:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalJsonQ.g:217:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalJsonQ.g:218:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalJsonQ.g:219:3: ( rule__StringLiteral__ValueAssignment )
            // InternalJsonQ.g:219:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "ruleConnector"
    // InternalJsonQ.g:228:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:232:1: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalJsonQ.g:233:2: ( ( rule__Connector__Alternatives ) )
            {
            // InternalJsonQ.g:233:2: ( ( rule__Connector__Alternatives ) )
            // InternalJsonQ.g:234:3: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalJsonQ.g:235:3: ( rule__Connector__Alternatives )
            // InternalJsonQ.g:235:4: rule__Connector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "ruleOperationAgg"
    // InternalJsonQ.g:244:1: ruleOperationAgg : ( ( 'AVG' ) ) ;
    public final void ruleOperationAgg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:248:1: ( ( ( 'AVG' ) ) )
            // InternalJsonQ.g:249:2: ( ( 'AVG' ) )
            {
            // InternalJsonQ.g:249:2: ( ( 'AVG' ) )
            // InternalJsonQ.g:250:3: ( 'AVG' )
            {
             before(grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration()); 
            // InternalJsonQ.g:251:3: ( 'AVG' )
            // InternalJsonQ.g:251:4: 'AVG'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationAgg"


    // $ANTLR start "ruleOperationGET"
    // InternalJsonQ.g:260:1: ruleOperationGET : ( ( rule__OperationGET__Alternatives ) ) ;
    public final void ruleOperationGET() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:264:1: ( ( ( rule__OperationGET__Alternatives ) ) )
            // InternalJsonQ.g:265:2: ( ( rule__OperationGET__Alternatives ) )
            {
            // InternalJsonQ.g:265:2: ( ( rule__OperationGET__Alternatives ) )
            // InternalJsonQ.g:266:3: ( rule__OperationGET__Alternatives )
            {
             before(grammarAccess.getOperationGETAccess().getAlternatives()); 
            // InternalJsonQ.g:267:3: ( rule__OperationGET__Alternatives )
            // InternalJsonQ.g:267:4: rule__OperationGET__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationGET__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationGETAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationGET"


    // $ANTLR start "ruleInputFieldSingle"
    // InternalJsonQ.g:276:1: ruleInputFieldSingle : ( ( rule__InputFieldSingle__Alternatives ) ) ;
    public final void ruleInputFieldSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:280:1: ( ( ( rule__InputFieldSingle__Alternatives ) ) )
            // InternalJsonQ.g:281:2: ( ( rule__InputFieldSingle__Alternatives ) )
            {
            // InternalJsonQ.g:281:2: ( ( rule__InputFieldSingle__Alternatives ) )
            // InternalJsonQ.g:282:3: ( rule__InputFieldSingle__Alternatives )
            {
             before(grammarAccess.getInputFieldSingleAccess().getAlternatives()); 
            // InternalJsonQ.g:283:3: ( rule__InputFieldSingle__Alternatives )
            // InternalJsonQ.g:283:4: rule__InputFieldSingle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputFieldSingle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputFieldSingleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputFieldSingle"


    // $ANTLR start "rule__Statements__Alternatives"
    // InternalJsonQ.g:291:1: rule__Statements__Alternatives : ( ( ruleGetStatements ) | ( ruleAggregateStatements ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:295:1: ( ( ruleGetStatements ) | ( ruleAggregateStatements ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==11) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=14 && LA2_1<=15)) ) {
                    alt2=1;
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
                    // InternalJsonQ.g:296:2: ( ruleGetStatements )
                    {
                    // InternalJsonQ.g:296:2: ( ruleGetStatements )
                    // InternalJsonQ.g:297:3: ruleGetStatements
                    {
                     before(grammarAccess.getStatementsAccess().getGetStatementsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGetStatements();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getGetStatementsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:302:2: ( ruleAggregateStatements )
                    {
                    // InternalJsonQ.g:302:2: ( ruleAggregateStatements )
                    // InternalJsonQ.g:303:3: ruleAggregateStatements
                    {
                     before(grammarAccess.getStatementsAccess().getAggregateStatementsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAggregateStatements();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getAggregateStatementsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Alternatives"


    // $ANTLR start "rule__Connector__Alternatives"
    // InternalJsonQ.g:312:1: rule__Connector__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:316:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonQ.g:317:2: ( ( 'AND' ) )
                    {
                    // InternalJsonQ.g:317:2: ( ( 'AND' ) )
                    // InternalJsonQ.g:318:3: ( 'AND' )
                    {
                     before(grammarAccess.getConnectorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:319:3: ( 'AND' )
                    // InternalJsonQ.g:319:4: 'AND'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getConnectorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:323:2: ( ( 'OR' ) )
                    {
                    // InternalJsonQ.g:323:2: ( ( 'OR' ) )
                    // InternalJsonQ.g:324:3: ( 'OR' )
                    {
                     before(grammarAccess.getConnectorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:325:3: ( 'OR' )
                    // InternalJsonQ.g:325:4: 'OR'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getConnectorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Alternatives"


    // $ANTLR start "rule__OperationGET__Alternatives"
    // InternalJsonQ.g:333:1: rule__OperationGET__Alternatives : ( ( ( 'DATA' ) ) | ( ( 'COUNT' ) ) );
    public final void rule__OperationGET__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:337:1: ( ( ( 'DATA' ) ) | ( ( 'COUNT' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonQ.g:338:2: ( ( 'DATA' ) )
                    {
                    // InternalJsonQ.g:338:2: ( ( 'DATA' ) )
                    // InternalJsonQ.g:339:3: ( 'DATA' )
                    {
                     before(grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:340:3: ( 'DATA' )
                    // InternalJsonQ.g:340:4: 'DATA'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:344:2: ( ( 'COUNT' ) )
                    {
                    // InternalJsonQ.g:344:2: ( ( 'COUNT' ) )
                    // InternalJsonQ.g:345:3: ( 'COUNT' )
                    {
                     before(grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:346:3: ( 'COUNT' )
                    // InternalJsonQ.g:346:4: 'COUNT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationGET__Alternatives"


    // $ANTLR start "rule__InputFieldSingle__Alternatives"
    // InternalJsonQ.g:354:1: rule__InputFieldSingle__Alternatives : ( ( ( 'firstName' ) ) | ( ( 'lastName' ) ) | ( ( 'gender' ) ) | ( ( 'counrtyCode' ) ) | ( ( 'cityName' ) ) | ( ( 'isVaccinated' ) ) | ( ( 'income' ) ) );
    public final void rule__InputFieldSingle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:358:1: ( ( ( 'firstName' ) ) | ( ( 'lastName' ) ) | ( ( 'gender' ) ) | ( ( 'counrtyCode' ) ) | ( ( 'cityName' ) ) | ( ( 'isVaccinated' ) ) | ( ( 'income' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            case 22:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJsonQ.g:359:2: ( ( 'firstName' ) )
                    {
                    // InternalJsonQ.g:359:2: ( ( 'firstName' ) )
                    // InternalJsonQ.g:360:3: ( 'firstName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:361:3: ( 'firstName' )
                    // InternalJsonQ.g:361:4: 'firstName'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:365:2: ( ( 'lastName' ) )
                    {
                    // InternalJsonQ.g:365:2: ( ( 'lastName' ) )
                    // InternalJsonQ.g:366:3: ( 'lastName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:367:3: ( 'lastName' )
                    // InternalJsonQ.g:367:4: 'lastName'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonQ.g:371:2: ( ( 'gender' ) )
                    {
                    // InternalJsonQ.g:371:2: ( ( 'gender' ) )
                    // InternalJsonQ.g:372:3: ( 'gender' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2()); 
                    // InternalJsonQ.g:373:3: ( 'gender' )
                    // InternalJsonQ.g:373:4: 'gender'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonQ.g:377:2: ( ( 'counrtyCode' ) )
                    {
                    // InternalJsonQ.g:377:2: ( ( 'counrtyCode' ) )
                    // InternalJsonQ.g:378:3: ( 'counrtyCode' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3()); 
                    // InternalJsonQ.g:379:3: ( 'counrtyCode' )
                    // InternalJsonQ.g:379:4: 'counrtyCode'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonQ.g:383:2: ( ( 'cityName' ) )
                    {
                    // InternalJsonQ.g:383:2: ( ( 'cityName' ) )
                    // InternalJsonQ.g:384:3: ( 'cityName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4()); 
                    // InternalJsonQ.g:385:3: ( 'cityName' )
                    // InternalJsonQ.g:385:4: 'cityName'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonQ.g:389:2: ( ( 'isVaccinated' ) )
                    {
                    // InternalJsonQ.g:389:2: ( ( 'isVaccinated' ) )
                    // InternalJsonQ.g:390:3: ( 'isVaccinated' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5()); 
                    // InternalJsonQ.g:391:3: ( 'isVaccinated' )
                    // InternalJsonQ.g:391:4: 'isVaccinated'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonQ.g:395:2: ( ( 'income' ) )
                    {
                    // InternalJsonQ.g:395:2: ( ( 'income' ) )
                    // InternalJsonQ.g:396:3: ( 'income' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6()); 
                    // InternalJsonQ.g:397:3: ( 'income' )
                    // InternalJsonQ.g:397:4: 'income'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputFieldSingle__Alternatives"


    // $ANTLR start "rule__AggregateStatements__Group__0"
    // InternalJsonQ.g:405:1: rule__AggregateStatements__Group__0 : rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1 ;
    public final void rule__AggregateStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:409:1: ( rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1 )
            // InternalJsonQ.g:410:2: rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AggregateStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__0"


    // $ANTLR start "rule__AggregateStatements__Group__0__Impl"
    // InternalJsonQ.g:417:1: rule__AggregateStatements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__AggregateStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:421:1: ( ( 'GET' ) )
            // InternalJsonQ.g:422:1: ( 'GET' )
            {
            // InternalJsonQ.g:422:1: ( 'GET' )
            // InternalJsonQ.g:423:2: 'GET'
            {
             before(grammarAccess.getAggregateStatementsAccess().getGETKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAggregateStatementsAccess().getGETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__0__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__1"
    // InternalJsonQ.g:432:1: rule__AggregateStatements__Group__1 : rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2 ;
    public final void rule__AggregateStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:436:1: ( rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2 )
            // InternalJsonQ.g:437:2: rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AggregateStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__1"


    // $ANTLR start "rule__AggregateStatements__Group__1__Impl"
    // InternalJsonQ.g:444:1: rule__AggregateStatements__Group__1__Impl : ( ( rule__AggregateStatements__OpAggAssignment_1 ) ) ;
    public final void rule__AggregateStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:448:1: ( ( ( rule__AggregateStatements__OpAggAssignment_1 ) ) )
            // InternalJsonQ.g:449:1: ( ( rule__AggregateStatements__OpAggAssignment_1 ) )
            {
            // InternalJsonQ.g:449:1: ( ( rule__AggregateStatements__OpAggAssignment_1 ) )
            // InternalJsonQ.g:450:2: ( rule__AggregateStatements__OpAggAssignment_1 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getOpAggAssignment_1()); 
            // InternalJsonQ.g:451:2: ( rule__AggregateStatements__OpAggAssignment_1 )
            // InternalJsonQ.g:451:3: rule__AggregateStatements__OpAggAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__OpAggAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAggregateStatementsAccess().getOpAggAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__1__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__2"
    // InternalJsonQ.g:459:1: rule__AggregateStatements__Group__2 : rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3 ;
    public final void rule__AggregateStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:463:1: ( rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3 )
            // InternalJsonQ.g:464:2: rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AggregateStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__2"


    // $ANTLR start "rule__AggregateStatements__Group__2__Impl"
    // InternalJsonQ.g:471:1: rule__AggregateStatements__Group__2__Impl : ( ( rule__AggregateStatements__AggFieldAssignment_2 ) ) ;
    public final void rule__AggregateStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:475:1: ( ( ( rule__AggregateStatements__AggFieldAssignment_2 ) ) )
            // InternalJsonQ.g:476:1: ( ( rule__AggregateStatements__AggFieldAssignment_2 ) )
            {
            // InternalJsonQ.g:476:1: ( ( rule__AggregateStatements__AggFieldAssignment_2 ) )
            // InternalJsonQ.g:477:2: ( rule__AggregateStatements__AggFieldAssignment_2 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getAggFieldAssignment_2()); 
            // InternalJsonQ.g:478:2: ( rule__AggregateStatements__AggFieldAssignment_2 )
            // InternalJsonQ.g:478:3: rule__AggregateStatements__AggFieldAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__AggFieldAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAggregateStatementsAccess().getAggFieldAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__2__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__3"
    // InternalJsonQ.g:486:1: rule__AggregateStatements__Group__3 : rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4 ;
    public final void rule__AggregateStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:490:1: ( rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4 )
            // InternalJsonQ.g:491:2: rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AggregateStatements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__3"


    // $ANTLR start "rule__AggregateStatements__Group__3__Impl"
    // InternalJsonQ.g:498:1: rule__AggregateStatements__Group__3__Impl : ( 'WHERE' ) ;
    public final void rule__AggregateStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:502:1: ( ( 'WHERE' ) )
            // InternalJsonQ.g:503:1: ( 'WHERE' )
            {
            // InternalJsonQ.g:503:1: ( 'WHERE' )
            // InternalJsonQ.g:504:2: 'WHERE'
            {
             before(grammarAccess.getAggregateStatementsAccess().getWHEREKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAggregateStatementsAccess().getWHEREKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__3__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__4"
    // InternalJsonQ.g:513:1: rule__AggregateStatements__Group__4 : rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5 ;
    public final void rule__AggregateStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:517:1: ( rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5 )
            // InternalJsonQ.g:518:2: rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AggregateStatements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__4"


    // $ANTLR start "rule__AggregateStatements__Group__4__Impl"
    // InternalJsonQ.g:525:1: rule__AggregateStatements__Group__4__Impl : ( ( rule__AggregateStatements__Q1keyAssignment_4 ) ) ;
    public final void rule__AggregateStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:529:1: ( ( ( rule__AggregateStatements__Q1keyAssignment_4 ) ) )
            // InternalJsonQ.g:530:1: ( ( rule__AggregateStatements__Q1keyAssignment_4 ) )
            {
            // InternalJsonQ.g:530:1: ( ( rule__AggregateStatements__Q1keyAssignment_4 ) )
            // InternalJsonQ.g:531:2: ( rule__AggregateStatements__Q1keyAssignment_4 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1keyAssignment_4()); 
            // InternalJsonQ.g:532:2: ( rule__AggregateStatements__Q1keyAssignment_4 )
            // InternalJsonQ.g:532:3: rule__AggregateStatements__Q1keyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Q1keyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAggregateStatementsAccess().getQ1keyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__4__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__5"
    // InternalJsonQ.g:540:1: rule__AggregateStatements__Group__5 : rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6 ;
    public final void rule__AggregateStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:544:1: ( rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6 )
            // InternalJsonQ.g:545:2: rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__AggregateStatements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__5"


    // $ANTLR start "rule__AggregateStatements__Group__5__Impl"
    // InternalJsonQ.g:552:1: rule__AggregateStatements__Group__5__Impl : ( ( rule__AggregateStatements__Q1valAssignment_5 ) ) ;
    public final void rule__AggregateStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:556:1: ( ( ( rule__AggregateStatements__Q1valAssignment_5 ) ) )
            // InternalJsonQ.g:557:1: ( ( rule__AggregateStatements__Q1valAssignment_5 ) )
            {
            // InternalJsonQ.g:557:1: ( ( rule__AggregateStatements__Q1valAssignment_5 ) )
            // InternalJsonQ.g:558:2: ( rule__AggregateStatements__Q1valAssignment_5 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1valAssignment_5()); 
            // InternalJsonQ.g:559:2: ( rule__AggregateStatements__Q1valAssignment_5 )
            // InternalJsonQ.g:559:3: rule__AggregateStatements__Q1valAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Q1valAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAggregateStatementsAccess().getQ1valAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__5__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__6"
    // InternalJsonQ.g:567:1: rule__AggregateStatements__Group__6 : rule__AggregateStatements__Group__6__Impl rule__AggregateStatements__Group__7 ;
    public final void rule__AggregateStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:571:1: ( rule__AggregateStatements__Group__6__Impl rule__AggregateStatements__Group__7 )
            // InternalJsonQ.g:572:2: rule__AggregateStatements__Group__6__Impl rule__AggregateStatements__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AggregateStatements__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__6"


    // $ANTLR start "rule__AggregateStatements__Group__6__Impl"
    // InternalJsonQ.g:579:1: rule__AggregateStatements__Group__6__Impl : ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? ) ;
    public final void rule__AggregateStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:583:1: ( ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? ) )
            // InternalJsonQ.g:584:1: ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? )
            {
            // InternalJsonQ.g:584:1: ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? )
            // InternalJsonQ.g:585:2: ( rule__AggregateStatements__QryadditionalAssignment_6 )?
            {
             before(grammarAccess.getAggregateStatementsAccess().getQryadditionalAssignment_6()); 
            // InternalJsonQ.g:586:2: ( rule__AggregateStatements__QryadditionalAssignment_6 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=12 && LA6_0<=13)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonQ.g:586:3: rule__AggregateStatements__QryadditionalAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__AggregateStatements__QryadditionalAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAggregateStatementsAccess().getQryadditionalAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__6__Impl"


    // $ANTLR start "rule__AggregateStatements__Group__7"
    // InternalJsonQ.g:594:1: rule__AggregateStatements__Group__7 : rule__AggregateStatements__Group__7__Impl ;
    public final void rule__AggregateStatements__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:598:1: ( rule__AggregateStatements__Group__7__Impl )
            // InternalJsonQ.g:599:2: rule__AggregateStatements__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__7"


    // $ANTLR start "rule__AggregateStatements__Group__7__Impl"
    // InternalJsonQ.g:605:1: rule__AggregateStatements__Group__7__Impl : ( 'END' ) ;
    public final void rule__AggregateStatements__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:609:1: ( ( 'END' ) )
            // InternalJsonQ.g:610:1: ( 'END' )
            {
            // InternalJsonQ.g:610:1: ( 'END' )
            // InternalJsonQ.g:611:2: 'END'
            {
             before(grammarAccess.getAggregateStatementsAccess().getENDKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAggregateStatementsAccess().getENDKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Group__7__Impl"


    // $ANTLR start "rule__GetStatements__Group__0"
    // InternalJsonQ.g:621:1: rule__GetStatements__Group__0 : rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1 ;
    public final void rule__GetStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:625:1: ( rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1 )
            // InternalJsonQ.g:626:2: rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__GetStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__0"


    // $ANTLR start "rule__GetStatements__Group__0__Impl"
    // InternalJsonQ.g:633:1: rule__GetStatements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__GetStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:637:1: ( ( 'GET' ) )
            // InternalJsonQ.g:638:1: ( 'GET' )
            {
            // InternalJsonQ.g:638:1: ( 'GET' )
            // InternalJsonQ.g:639:2: 'GET'
            {
             before(grammarAccess.getGetStatementsAccess().getGETKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGetStatementsAccess().getGETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__0__Impl"


    // $ANTLR start "rule__GetStatements__Group__1"
    // InternalJsonQ.g:648:1: rule__GetStatements__Group__1 : rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2 ;
    public final void rule__GetStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:652:1: ( rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2 )
            // InternalJsonQ.g:653:2: rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__GetStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__1"


    // $ANTLR start "rule__GetStatements__Group__1__Impl"
    // InternalJsonQ.g:660:1: rule__GetStatements__Group__1__Impl : ( ( rule__GetStatements__OpGetAssignment_1 ) ) ;
    public final void rule__GetStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:664:1: ( ( ( rule__GetStatements__OpGetAssignment_1 ) ) )
            // InternalJsonQ.g:665:1: ( ( rule__GetStatements__OpGetAssignment_1 ) )
            {
            // InternalJsonQ.g:665:1: ( ( rule__GetStatements__OpGetAssignment_1 ) )
            // InternalJsonQ.g:666:2: ( rule__GetStatements__OpGetAssignment_1 )
            {
             before(grammarAccess.getGetStatementsAccess().getOpGetAssignment_1()); 
            // InternalJsonQ.g:667:2: ( rule__GetStatements__OpGetAssignment_1 )
            // InternalJsonQ.g:667:3: rule__GetStatements__OpGetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GetStatements__OpGetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGetStatementsAccess().getOpGetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__1__Impl"


    // $ANTLR start "rule__GetStatements__Group__2"
    // InternalJsonQ.g:675:1: rule__GetStatements__Group__2 : rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3 ;
    public final void rule__GetStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:679:1: ( rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3 )
            // InternalJsonQ.g:680:2: rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GetStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__2"


    // $ANTLR start "rule__GetStatements__Group__2__Impl"
    // InternalJsonQ.g:687:1: rule__GetStatements__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__GetStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:691:1: ( ( 'WHERE' ) )
            // InternalJsonQ.g:692:1: ( 'WHERE' )
            {
            // InternalJsonQ.g:692:1: ( 'WHERE' )
            // InternalJsonQ.g:693:2: 'WHERE'
            {
             before(grammarAccess.getGetStatementsAccess().getWHEREKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGetStatementsAccess().getWHEREKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__2__Impl"


    // $ANTLR start "rule__GetStatements__Group__3"
    // InternalJsonQ.g:702:1: rule__GetStatements__Group__3 : rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4 ;
    public final void rule__GetStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:706:1: ( rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4 )
            // InternalJsonQ.g:707:2: rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GetStatements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__3"


    // $ANTLR start "rule__GetStatements__Group__3__Impl"
    // InternalJsonQ.g:714:1: rule__GetStatements__Group__3__Impl : ( ( rule__GetStatements__Q1keyAssignment_3 ) ) ;
    public final void rule__GetStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:718:1: ( ( ( rule__GetStatements__Q1keyAssignment_3 ) ) )
            // InternalJsonQ.g:719:1: ( ( rule__GetStatements__Q1keyAssignment_3 ) )
            {
            // InternalJsonQ.g:719:1: ( ( rule__GetStatements__Q1keyAssignment_3 ) )
            // InternalJsonQ.g:720:2: ( rule__GetStatements__Q1keyAssignment_3 )
            {
             before(grammarAccess.getGetStatementsAccess().getQ1keyAssignment_3()); 
            // InternalJsonQ.g:721:2: ( rule__GetStatements__Q1keyAssignment_3 )
            // InternalJsonQ.g:721:3: rule__GetStatements__Q1keyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GetStatements__Q1keyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGetStatementsAccess().getQ1keyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__3__Impl"


    // $ANTLR start "rule__GetStatements__Group__4"
    // InternalJsonQ.g:729:1: rule__GetStatements__Group__4 : rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5 ;
    public final void rule__GetStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:733:1: ( rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5 )
            // InternalJsonQ.g:734:2: rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__GetStatements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__4"


    // $ANTLR start "rule__GetStatements__Group__4__Impl"
    // InternalJsonQ.g:741:1: rule__GetStatements__Group__4__Impl : ( ( rule__GetStatements__Q1valAssignment_4 ) ) ;
    public final void rule__GetStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:745:1: ( ( ( rule__GetStatements__Q1valAssignment_4 ) ) )
            // InternalJsonQ.g:746:1: ( ( rule__GetStatements__Q1valAssignment_4 ) )
            {
            // InternalJsonQ.g:746:1: ( ( rule__GetStatements__Q1valAssignment_4 ) )
            // InternalJsonQ.g:747:2: ( rule__GetStatements__Q1valAssignment_4 )
            {
             before(grammarAccess.getGetStatementsAccess().getQ1valAssignment_4()); 
            // InternalJsonQ.g:748:2: ( rule__GetStatements__Q1valAssignment_4 )
            // InternalJsonQ.g:748:3: rule__GetStatements__Q1valAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GetStatements__Q1valAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGetStatementsAccess().getQ1valAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__4__Impl"


    // $ANTLR start "rule__GetStatements__Group__5"
    // InternalJsonQ.g:756:1: rule__GetStatements__Group__5 : rule__GetStatements__Group__5__Impl rule__GetStatements__Group__6 ;
    public final void rule__GetStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:760:1: ( rule__GetStatements__Group__5__Impl rule__GetStatements__Group__6 )
            // InternalJsonQ.g:761:2: rule__GetStatements__Group__5__Impl rule__GetStatements__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__GetStatements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__5"


    // $ANTLR start "rule__GetStatements__Group__5__Impl"
    // InternalJsonQ.g:768:1: rule__GetStatements__Group__5__Impl : ( ( rule__GetStatements__QryadditionalAssignment_5 )? ) ;
    public final void rule__GetStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:772:1: ( ( ( rule__GetStatements__QryadditionalAssignment_5 )? ) )
            // InternalJsonQ.g:773:1: ( ( rule__GetStatements__QryadditionalAssignment_5 )? )
            {
            // InternalJsonQ.g:773:1: ( ( rule__GetStatements__QryadditionalAssignment_5 )? )
            // InternalJsonQ.g:774:2: ( rule__GetStatements__QryadditionalAssignment_5 )?
            {
             before(grammarAccess.getGetStatementsAccess().getQryadditionalAssignment_5()); 
            // InternalJsonQ.g:775:2: ( rule__GetStatements__QryadditionalAssignment_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonQ.g:775:3: rule__GetStatements__QryadditionalAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__GetStatements__QryadditionalAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetStatementsAccess().getQryadditionalAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__5__Impl"


    // $ANTLR start "rule__GetStatements__Group__6"
    // InternalJsonQ.g:783:1: rule__GetStatements__Group__6 : rule__GetStatements__Group__6__Impl ;
    public final void rule__GetStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:787:1: ( rule__GetStatements__Group__6__Impl )
            // InternalJsonQ.g:788:2: rule__GetStatements__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__6"


    // $ANTLR start "rule__GetStatements__Group__6__Impl"
    // InternalJsonQ.g:794:1: rule__GetStatements__Group__6__Impl : ( 'END' ) ;
    public final void rule__GetStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:798:1: ( ( 'END' ) )
            // InternalJsonQ.g:799:1: ( 'END' )
            {
            // InternalJsonQ.g:799:1: ( 'END' )
            // InternalJsonQ.g:800:2: 'END'
            {
             before(grammarAccess.getGetStatementsAccess().getENDKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGetStatementsAccess().getENDKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Group__6__Impl"


    // $ANTLR start "rule__AdditionalQuery__Group__0"
    // InternalJsonQ.g:810:1: rule__AdditionalQuery__Group__0 : rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1 ;
    public final void rule__AdditionalQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:814:1: ( rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1 )
            // InternalJsonQ.g:815:2: rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AdditionalQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Group__0"


    // $ANTLR start "rule__AdditionalQuery__Group__0__Impl"
    // InternalJsonQ.g:822:1: rule__AdditionalQuery__Group__0__Impl : ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) ) ;
    public final void rule__AdditionalQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:826:1: ( ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) ) )
            // InternalJsonQ.g:827:1: ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) )
            {
            // InternalJsonQ.g:827:1: ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) )
            // InternalJsonQ.g:828:2: ( rule__AdditionalQuery__ConnectorAssignment_0 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getConnectorAssignment_0()); 
            // InternalJsonQ.g:829:2: ( rule__AdditionalQuery__ConnectorAssignment_0 )
            // InternalJsonQ.g:829:3: rule__AdditionalQuery__ConnectorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__ConnectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalQueryAccess().getConnectorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Group__0__Impl"


    // $ANTLR start "rule__AdditionalQuery__Group__1"
    // InternalJsonQ.g:837:1: rule__AdditionalQuery__Group__1 : rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2 ;
    public final void rule__AdditionalQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:841:1: ( rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2 )
            // InternalJsonQ.g:842:2: rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__AdditionalQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Group__1"


    // $ANTLR start "rule__AdditionalQuery__Group__1__Impl"
    // InternalJsonQ.g:849:1: rule__AdditionalQuery__Group__1__Impl : ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) ) ;
    public final void rule__AdditionalQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:853:1: ( ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) ) )
            // InternalJsonQ.g:854:1: ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) )
            {
            // InternalJsonQ.g:854:1: ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) )
            // InternalJsonQ.g:855:2: ( rule__AdditionalQuery__Q2keyAssignment_1 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2keyAssignment_1()); 
            // InternalJsonQ.g:856:2: ( rule__AdditionalQuery__Q2keyAssignment_1 )
            // InternalJsonQ.g:856:3: rule__AdditionalQuery__Q2keyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__Q2keyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalQueryAccess().getQ2keyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Group__1__Impl"


    // $ANTLR start "rule__AdditionalQuery__Group__2"
    // InternalJsonQ.g:864:1: rule__AdditionalQuery__Group__2 : rule__AdditionalQuery__Group__2__Impl ;
    public final void rule__AdditionalQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:868:1: ( rule__AdditionalQuery__Group__2__Impl )
            // InternalJsonQ.g:869:2: rule__AdditionalQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Group__2"


    // $ANTLR start "rule__AdditionalQuery__Group__2__Impl"
    // InternalJsonQ.g:875:1: rule__AdditionalQuery__Group__2__Impl : ( ( rule__AdditionalQuery__Q2valAssignment_2 ) ) ;
    public final void rule__AdditionalQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:879:1: ( ( ( rule__AdditionalQuery__Q2valAssignment_2 ) ) )
            // InternalJsonQ.g:880:1: ( ( rule__AdditionalQuery__Q2valAssignment_2 ) )
            {
            // InternalJsonQ.g:880:1: ( ( rule__AdditionalQuery__Q2valAssignment_2 ) )
            // InternalJsonQ.g:881:2: ( rule__AdditionalQuery__Q2valAssignment_2 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2valAssignment_2()); 
            // InternalJsonQ.g:882:2: ( rule__AdditionalQuery__Q2valAssignment_2 )
            // InternalJsonQ.g:882:3: rule__AdditionalQuery__Q2valAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__Q2valAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalQueryAccess().getQ2valAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Group__2__Impl"


    // $ANTLR start "rule__JSONQueryModel__InputStatementAssignment"
    // InternalJsonQ.g:891:1: rule__JSONQueryModel__InputStatementAssignment : ( ruleStatements ) ;
    public final void rule__JSONQueryModel__InputStatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:895:1: ( ( ruleStatements ) )
            // InternalJsonQ.g:896:2: ( ruleStatements )
            {
            // InternalJsonQ.g:896:2: ( ruleStatements )
            // InternalJsonQ.g:897:3: ruleStatements
            {
             before(grammarAccess.getJSONQueryModelAccess().getInputStatementStatementsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getJSONQueryModelAccess().getInputStatementStatementsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONQueryModel__InputStatementAssignment"


    // $ANTLR start "rule__AggregateStatements__OpAggAssignment_1"
    // InternalJsonQ.g:906:1: rule__AggregateStatements__OpAggAssignment_1 : ( ruleOperationAgg ) ;
    public final void rule__AggregateStatements__OpAggAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:910:1: ( ( ruleOperationAgg ) )
            // InternalJsonQ.g:911:2: ( ruleOperationAgg )
            {
            // InternalJsonQ.g:911:2: ( ruleOperationAgg )
            // InternalJsonQ.g:912:3: ruleOperationAgg
            {
             before(grammarAccess.getAggregateStatementsAccess().getOpAggOperationAggEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationAgg();

            state._fsp--;

             after(grammarAccess.getAggregateStatementsAccess().getOpAggOperationAggEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__OpAggAssignment_1"


    // $ANTLR start "rule__AggregateStatements__AggFieldAssignment_2"
    // InternalJsonQ.g:921:1: rule__AggregateStatements__AggFieldAssignment_2 : ( ruleInputFieldSingle ) ;
    public final void rule__AggregateStatements__AggFieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:925:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:926:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:926:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:927:3: ruleInputFieldSingle
            {
             before(grammarAccess.getAggregateStatementsAccess().getAggFieldInputFieldSingleEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFieldSingle();

            state._fsp--;

             after(grammarAccess.getAggregateStatementsAccess().getAggFieldInputFieldSingleEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__AggFieldAssignment_2"


    // $ANTLR start "rule__AggregateStatements__Q1keyAssignment_4"
    // InternalJsonQ.g:936:1: rule__AggregateStatements__Q1keyAssignment_4 : ( ruleInputFieldSingle ) ;
    public final void rule__AggregateStatements__Q1keyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:940:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:941:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:941:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:942:3: ruleInputFieldSingle
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFieldSingle();

            state._fsp--;

             after(grammarAccess.getAggregateStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Q1keyAssignment_4"


    // $ANTLR start "rule__AggregateStatements__Q1valAssignment_5"
    // InternalJsonQ.g:951:1: rule__AggregateStatements__Q1valAssignment_5 : ( ruleInputVal ) ;
    public final void rule__AggregateStatements__Q1valAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:955:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:956:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:956:2: ( ruleInputVal )
            // InternalJsonQ.g:957:3: ruleInputVal
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1valInputValParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleInputVal();

            state._fsp--;

             after(grammarAccess.getAggregateStatementsAccess().getQ1valInputValParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__Q1valAssignment_5"


    // $ANTLR start "rule__AggregateStatements__QryadditionalAssignment_6"
    // InternalJsonQ.g:966:1: rule__AggregateStatements__QryadditionalAssignment_6 : ( ruleAdditionalQuery ) ;
    public final void rule__AggregateStatements__QryadditionalAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:970:1: ( ( ruleAdditionalQuery ) )
            // InternalJsonQ.g:971:2: ( ruleAdditionalQuery )
            {
            // InternalJsonQ.g:971:2: ( ruleAdditionalQuery )
            // InternalJsonQ.g:972:3: ruleAdditionalQuery
            {
             before(grammarAccess.getAggregateStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalQuery();

            state._fsp--;

             after(grammarAccess.getAggregateStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AggregateStatements__QryadditionalAssignment_6"


    // $ANTLR start "rule__GetStatements__OpGetAssignment_1"
    // InternalJsonQ.g:981:1: rule__GetStatements__OpGetAssignment_1 : ( ruleOperationGET ) ;
    public final void rule__GetStatements__OpGetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:985:1: ( ( ruleOperationGET ) )
            // InternalJsonQ.g:986:2: ( ruleOperationGET )
            {
            // InternalJsonQ.g:986:2: ( ruleOperationGET )
            // InternalJsonQ.g:987:3: ruleOperationGET
            {
             before(grammarAccess.getGetStatementsAccess().getOpGetOperationGETEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationGET();

            state._fsp--;

             after(grammarAccess.getGetStatementsAccess().getOpGetOperationGETEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__OpGetAssignment_1"


    // $ANTLR start "rule__GetStatements__Q1keyAssignment_3"
    // InternalJsonQ.g:996:1: rule__GetStatements__Q1keyAssignment_3 : ( ruleInputFieldSingle ) ;
    public final void rule__GetStatements__Q1keyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1000:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:1001:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:1001:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:1002:3: ruleInputFieldSingle
            {
             before(grammarAccess.getGetStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFieldSingle();

            state._fsp--;

             after(grammarAccess.getGetStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Q1keyAssignment_3"


    // $ANTLR start "rule__GetStatements__Q1valAssignment_4"
    // InternalJsonQ.g:1011:1: rule__GetStatements__Q1valAssignment_4 : ( ruleInputVal ) ;
    public final void rule__GetStatements__Q1valAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1015:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:1016:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:1016:2: ( ruleInputVal )
            // InternalJsonQ.g:1017:3: ruleInputVal
            {
             before(grammarAccess.getGetStatementsAccess().getQ1valInputValParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInputVal();

            state._fsp--;

             after(grammarAccess.getGetStatementsAccess().getQ1valInputValParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__Q1valAssignment_4"


    // $ANTLR start "rule__GetStatements__QryadditionalAssignment_5"
    // InternalJsonQ.g:1026:1: rule__GetStatements__QryadditionalAssignment_5 : ( ruleAdditionalQuery ) ;
    public final void rule__GetStatements__QryadditionalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1030:1: ( ( ruleAdditionalQuery ) )
            // InternalJsonQ.g:1031:2: ( ruleAdditionalQuery )
            {
            // InternalJsonQ.g:1031:2: ( ruleAdditionalQuery )
            // InternalJsonQ.g:1032:3: ruleAdditionalQuery
            {
             before(grammarAccess.getGetStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditionalQuery();

            state._fsp--;

             after(grammarAccess.getGetStatementsAccess().getQryadditionalAdditionalQueryParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetStatements__QryadditionalAssignment_5"


    // $ANTLR start "rule__AdditionalQuery__ConnectorAssignment_0"
    // InternalJsonQ.g:1041:1: rule__AdditionalQuery__ConnectorAssignment_0 : ( ruleConnector ) ;
    public final void rule__AdditionalQuery__ConnectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1045:1: ( ( ruleConnector ) )
            // InternalJsonQ.g:1046:2: ( ruleConnector )
            {
            // InternalJsonQ.g:1046:2: ( ruleConnector )
            // InternalJsonQ.g:1047:3: ruleConnector
            {
             before(grammarAccess.getAdditionalQueryAccess().getConnectorConnectorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getAdditionalQueryAccess().getConnectorConnectorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__ConnectorAssignment_0"


    // $ANTLR start "rule__AdditionalQuery__Q2keyAssignment_1"
    // InternalJsonQ.g:1056:1: rule__AdditionalQuery__Q2keyAssignment_1 : ( ruleInputFieldSingle ) ;
    public final void rule__AdditionalQuery__Q2keyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1060:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:1061:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:1061:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:1062:3: ruleInputFieldSingle
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2keyInputFieldSingleEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFieldSingle();

            state._fsp--;

             after(grammarAccess.getAdditionalQueryAccess().getQ2keyInputFieldSingleEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Q2keyAssignment_1"


    // $ANTLR start "rule__AdditionalQuery__Q2valAssignment_2"
    // InternalJsonQ.g:1071:1: rule__AdditionalQuery__Q2valAssignment_2 : ( ruleInputVal ) ;
    public final void rule__AdditionalQuery__Q2valAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1075:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:1076:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:1076:2: ( ruleInputVal )
            // InternalJsonQ.g:1077:3: ruleInputVal
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2valInputValParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInputVal();

            state._fsp--;

             after(grammarAccess.getAdditionalQueryAccess().getQ2valInputValParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionalQuery__Q2valAssignment_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalJsonQ.g:1086:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1090:1: ( ( RULE_STRING ) )
            // InternalJsonQ.g:1091:2: ( RULE_STRING )
            {
            // InternalJsonQ.g:1091:2: ( RULE_STRING )
            // InternalJsonQ.g:1092:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});

}