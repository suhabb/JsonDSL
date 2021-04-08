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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AVG'", "'AND'", "'OR'", "'DATA'", "'COUNT'", "'firstName'", "'lastName'", "'gender'", "'countryCode'", "'cityName'", "'isVaccinated'", "'income'", "'GET'", "'WHERE'", "'END'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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
    // InternalJsonQ.g:187:1: ruleInputVal : ( ( rule__InputVal__Alternatives ) ) ;
    public final void ruleInputVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:191:2: ( ( ( rule__InputVal__Alternatives ) ) )
            // InternalJsonQ.g:192:2: ( ( rule__InputVal__Alternatives ) )
            {
            // InternalJsonQ.g:192:2: ( ( rule__InputVal__Alternatives ) )
            // InternalJsonQ.g:193:3: ( rule__InputVal__Alternatives )
            {
             before(grammarAccess.getInputValAccess().getAlternatives()); 
            // InternalJsonQ.g:194:3: ( rule__InputVal__Alternatives )
            // InternalJsonQ.g:194:4: rule__InputVal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputVal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputValAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalJsonQ.g:203:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalJsonQ.g:204:1: ( ruleIntLiteral EOF )
            // InternalJsonQ.g:205:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalJsonQ.g:212:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:216:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalJsonQ.g:217:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalJsonQ.g:217:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalJsonQ.g:218:3: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // InternalJsonQ.g:219:3: ( rule__IntLiteral__ValueAssignment )
            // InternalJsonQ.g:219:4: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalJsonQ.g:228:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJsonQ.g:229:1: ( ruleStringLiteral EOF )
            // InternalJsonQ.g:230:1: ruleStringLiteral EOF
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
    // InternalJsonQ.g:237:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:241:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalJsonQ.g:242:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalJsonQ.g:242:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalJsonQ.g:243:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalJsonQ.g:244:3: ( rule__StringLiteral__ValueAssignment )
            // InternalJsonQ.g:244:4: rule__StringLiteral__ValueAssignment
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
    // InternalJsonQ.g:253:1: ruleConnector : ( ( rule__Connector__Alternatives ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:257:1: ( ( ( rule__Connector__Alternatives ) ) )
            // InternalJsonQ.g:258:2: ( ( rule__Connector__Alternatives ) )
            {
            // InternalJsonQ.g:258:2: ( ( rule__Connector__Alternatives ) )
            // InternalJsonQ.g:259:3: ( rule__Connector__Alternatives )
            {
             before(grammarAccess.getConnectorAccess().getAlternatives()); 
            // InternalJsonQ.g:260:3: ( rule__Connector__Alternatives )
            // InternalJsonQ.g:260:4: rule__Connector__Alternatives
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
    // InternalJsonQ.g:269:1: ruleOperationAgg : ( ( 'AVG' ) ) ;
    public final void ruleOperationAgg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:273:1: ( ( ( 'AVG' ) ) )
            // InternalJsonQ.g:274:2: ( ( 'AVG' ) )
            {
            // InternalJsonQ.g:274:2: ( ( 'AVG' ) )
            // InternalJsonQ.g:275:3: ( 'AVG' )
            {
             before(grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration()); 
            // InternalJsonQ.g:276:3: ( 'AVG' )
            // InternalJsonQ.g:276:4: 'AVG'
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
    // InternalJsonQ.g:285:1: ruleOperationGET : ( ( rule__OperationGET__Alternatives ) ) ;
    public final void ruleOperationGET() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:289:1: ( ( ( rule__OperationGET__Alternatives ) ) )
            // InternalJsonQ.g:290:2: ( ( rule__OperationGET__Alternatives ) )
            {
            // InternalJsonQ.g:290:2: ( ( rule__OperationGET__Alternatives ) )
            // InternalJsonQ.g:291:3: ( rule__OperationGET__Alternatives )
            {
             before(grammarAccess.getOperationGETAccess().getAlternatives()); 
            // InternalJsonQ.g:292:3: ( rule__OperationGET__Alternatives )
            // InternalJsonQ.g:292:4: rule__OperationGET__Alternatives
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
    // InternalJsonQ.g:301:1: ruleInputFieldSingle : ( ( rule__InputFieldSingle__Alternatives ) ) ;
    public final void ruleInputFieldSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:305:1: ( ( ( rule__InputFieldSingle__Alternatives ) ) )
            // InternalJsonQ.g:306:2: ( ( rule__InputFieldSingle__Alternatives ) )
            {
            // InternalJsonQ.g:306:2: ( ( rule__InputFieldSingle__Alternatives ) )
            // InternalJsonQ.g:307:3: ( rule__InputFieldSingle__Alternatives )
            {
             before(grammarAccess.getInputFieldSingleAccess().getAlternatives()); 
            // InternalJsonQ.g:308:3: ( rule__InputFieldSingle__Alternatives )
            // InternalJsonQ.g:308:4: rule__InputFieldSingle__Alternatives
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
    // InternalJsonQ.g:316:1: rule__Statements__Alternatives : ( ( ruleGetStatements ) | ( ruleAggregateStatements ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:320:1: ( ( ruleGetStatements ) | ( ruleAggregateStatements ) )
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
                    // InternalJsonQ.g:321:2: ( ruleGetStatements )
                    {
                    // InternalJsonQ.g:321:2: ( ruleGetStatements )
                    // InternalJsonQ.g:322:3: ruleGetStatements
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
                    // InternalJsonQ.g:327:2: ( ruleAggregateStatements )
                    {
                    // InternalJsonQ.g:327:2: ( ruleAggregateStatements )
                    // InternalJsonQ.g:328:3: ruleAggregateStatements
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


    // $ANTLR start "rule__InputVal__Alternatives"
    // InternalJsonQ.g:337:1: rule__InputVal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) );
    public final void rule__InputVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:341:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonQ.g:342:2: ( ruleStringLiteral )
                    {
                    // InternalJsonQ.g:342:2: ( ruleStringLiteral )
                    // InternalJsonQ.g:343:3: ruleStringLiteral
                    {
                     before(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:348:2: ( ruleIntLiteral )
                    {
                    // InternalJsonQ.g:348:2: ( ruleIntLiteral )
                    // InternalJsonQ.g:349:3: ruleIntLiteral
                    {
                     before(grammarAccess.getInputValAccess().getIntLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getInputValAccess().getIntLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__InputVal__Alternatives"


    // $ANTLR start "rule__Connector__Alternatives"
    // InternalJsonQ.g:358:1: rule__Connector__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__Connector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:362:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonQ.g:363:2: ( ( 'AND' ) )
                    {
                    // InternalJsonQ.g:363:2: ( ( 'AND' ) )
                    // InternalJsonQ.g:364:3: ( 'AND' )
                    {
                     before(grammarAccess.getConnectorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:365:3: ( 'AND' )
                    // InternalJsonQ.g:365:4: 'AND'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getConnectorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:369:2: ( ( 'OR' ) )
                    {
                    // InternalJsonQ.g:369:2: ( ( 'OR' ) )
                    // InternalJsonQ.g:370:3: ( 'OR' )
                    {
                     before(grammarAccess.getConnectorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:371:3: ( 'OR' )
                    // InternalJsonQ.g:371:4: 'OR'
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
    // InternalJsonQ.g:379:1: rule__OperationGET__Alternatives : ( ( ( 'DATA' ) ) | ( ( 'COUNT' ) ) );
    public final void rule__OperationGET__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:383:1: ( ( ( 'DATA' ) ) | ( ( 'COUNT' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonQ.g:384:2: ( ( 'DATA' ) )
                    {
                    // InternalJsonQ.g:384:2: ( ( 'DATA' ) )
                    // InternalJsonQ.g:385:3: ( 'DATA' )
                    {
                     before(grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:386:3: ( 'DATA' )
                    // InternalJsonQ.g:386:4: 'DATA'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:390:2: ( ( 'COUNT' ) )
                    {
                    // InternalJsonQ.g:390:2: ( ( 'COUNT' ) )
                    // InternalJsonQ.g:391:3: ( 'COUNT' )
                    {
                     before(grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:392:3: ( 'COUNT' )
                    // InternalJsonQ.g:392:4: 'COUNT'
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
    // InternalJsonQ.g:400:1: rule__InputFieldSingle__Alternatives : ( ( ( 'firstName' ) ) | ( ( 'lastName' ) ) | ( ( 'gender' ) ) | ( ( 'countryCode' ) ) | ( ( 'cityName' ) ) | ( ( 'isVaccinated' ) ) | ( ( 'income' ) ) );
    public final void rule__InputFieldSingle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:404:1: ( ( ( 'firstName' ) ) | ( ( 'lastName' ) ) | ( ( 'gender' ) ) | ( ( 'countryCode' ) ) | ( ( 'cityName' ) ) | ( ( 'isVaccinated' ) ) | ( ( 'income' ) ) )
            int alt6=7;
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
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJsonQ.g:405:2: ( ( 'firstName' ) )
                    {
                    // InternalJsonQ.g:405:2: ( ( 'firstName' ) )
                    // InternalJsonQ.g:406:3: ( 'firstName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:407:3: ( 'firstName' )
                    // InternalJsonQ.g:407:4: 'firstName'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:411:2: ( ( 'lastName' ) )
                    {
                    // InternalJsonQ.g:411:2: ( ( 'lastName' ) )
                    // InternalJsonQ.g:412:3: ( 'lastName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:413:3: ( 'lastName' )
                    // InternalJsonQ.g:413:4: 'lastName'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonQ.g:417:2: ( ( 'gender' ) )
                    {
                    // InternalJsonQ.g:417:2: ( ( 'gender' ) )
                    // InternalJsonQ.g:418:3: ( 'gender' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2()); 
                    // InternalJsonQ.g:419:3: ( 'gender' )
                    // InternalJsonQ.g:419:4: 'gender'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonQ.g:423:2: ( ( 'countryCode' ) )
                    {
                    // InternalJsonQ.g:423:2: ( ( 'countryCode' ) )
                    // InternalJsonQ.g:424:3: ( 'countryCode' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getCountryCodeEnumLiteralDeclaration_3()); 
                    // InternalJsonQ.g:425:3: ( 'countryCode' )
                    // InternalJsonQ.g:425:4: 'countryCode'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getCountryCodeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonQ.g:429:2: ( ( 'cityName' ) )
                    {
                    // InternalJsonQ.g:429:2: ( ( 'cityName' ) )
                    // InternalJsonQ.g:430:3: ( 'cityName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4()); 
                    // InternalJsonQ.g:431:3: ( 'cityName' )
                    // InternalJsonQ.g:431:4: 'cityName'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonQ.g:435:2: ( ( 'isVaccinated' ) )
                    {
                    // InternalJsonQ.g:435:2: ( ( 'isVaccinated' ) )
                    // InternalJsonQ.g:436:3: ( 'isVaccinated' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5()); 
                    // InternalJsonQ.g:437:3: ( 'isVaccinated' )
                    // InternalJsonQ.g:437:4: 'isVaccinated'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonQ.g:441:2: ( ( 'income' ) )
                    {
                    // InternalJsonQ.g:441:2: ( ( 'income' ) )
                    // InternalJsonQ.g:442:3: ( 'income' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6()); 
                    // InternalJsonQ.g:443:3: ( 'income' )
                    // InternalJsonQ.g:443:4: 'income'
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
    // InternalJsonQ.g:451:1: rule__AggregateStatements__Group__0 : rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1 ;
    public final void rule__AggregateStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:455:1: ( rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1 )
            // InternalJsonQ.g:456:2: rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1
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
    // InternalJsonQ.g:463:1: rule__AggregateStatements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__AggregateStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:467:1: ( ( 'GET' ) )
            // InternalJsonQ.g:468:1: ( 'GET' )
            {
            // InternalJsonQ.g:468:1: ( 'GET' )
            // InternalJsonQ.g:469:2: 'GET'
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
    // InternalJsonQ.g:478:1: rule__AggregateStatements__Group__1 : rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2 ;
    public final void rule__AggregateStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:482:1: ( rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2 )
            // InternalJsonQ.g:483:2: rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2
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
    // InternalJsonQ.g:490:1: rule__AggregateStatements__Group__1__Impl : ( ( rule__AggregateStatements__OpAggAssignment_1 ) ) ;
    public final void rule__AggregateStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:494:1: ( ( ( rule__AggregateStatements__OpAggAssignment_1 ) ) )
            // InternalJsonQ.g:495:1: ( ( rule__AggregateStatements__OpAggAssignment_1 ) )
            {
            // InternalJsonQ.g:495:1: ( ( rule__AggregateStatements__OpAggAssignment_1 ) )
            // InternalJsonQ.g:496:2: ( rule__AggregateStatements__OpAggAssignment_1 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getOpAggAssignment_1()); 
            // InternalJsonQ.g:497:2: ( rule__AggregateStatements__OpAggAssignment_1 )
            // InternalJsonQ.g:497:3: rule__AggregateStatements__OpAggAssignment_1
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
    // InternalJsonQ.g:505:1: rule__AggregateStatements__Group__2 : rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3 ;
    public final void rule__AggregateStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:509:1: ( rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3 )
            // InternalJsonQ.g:510:2: rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3
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
    // InternalJsonQ.g:517:1: rule__AggregateStatements__Group__2__Impl : ( ( rule__AggregateStatements__AggFieldAssignment_2 ) ) ;
    public final void rule__AggregateStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:521:1: ( ( ( rule__AggregateStatements__AggFieldAssignment_2 ) ) )
            // InternalJsonQ.g:522:1: ( ( rule__AggregateStatements__AggFieldAssignment_2 ) )
            {
            // InternalJsonQ.g:522:1: ( ( rule__AggregateStatements__AggFieldAssignment_2 ) )
            // InternalJsonQ.g:523:2: ( rule__AggregateStatements__AggFieldAssignment_2 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getAggFieldAssignment_2()); 
            // InternalJsonQ.g:524:2: ( rule__AggregateStatements__AggFieldAssignment_2 )
            // InternalJsonQ.g:524:3: rule__AggregateStatements__AggFieldAssignment_2
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
    // InternalJsonQ.g:532:1: rule__AggregateStatements__Group__3 : rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4 ;
    public final void rule__AggregateStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:536:1: ( rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4 )
            // InternalJsonQ.g:537:2: rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4
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
    // InternalJsonQ.g:544:1: rule__AggregateStatements__Group__3__Impl : ( 'WHERE' ) ;
    public final void rule__AggregateStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:548:1: ( ( 'WHERE' ) )
            // InternalJsonQ.g:549:1: ( 'WHERE' )
            {
            // InternalJsonQ.g:549:1: ( 'WHERE' )
            // InternalJsonQ.g:550:2: 'WHERE'
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
    // InternalJsonQ.g:559:1: rule__AggregateStatements__Group__4 : rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5 ;
    public final void rule__AggregateStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:563:1: ( rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5 )
            // InternalJsonQ.g:564:2: rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5
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
    // InternalJsonQ.g:571:1: rule__AggregateStatements__Group__4__Impl : ( ( rule__AggregateStatements__Q1keyAssignment_4 ) ) ;
    public final void rule__AggregateStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:575:1: ( ( ( rule__AggregateStatements__Q1keyAssignment_4 ) ) )
            // InternalJsonQ.g:576:1: ( ( rule__AggregateStatements__Q1keyAssignment_4 ) )
            {
            // InternalJsonQ.g:576:1: ( ( rule__AggregateStatements__Q1keyAssignment_4 ) )
            // InternalJsonQ.g:577:2: ( rule__AggregateStatements__Q1keyAssignment_4 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1keyAssignment_4()); 
            // InternalJsonQ.g:578:2: ( rule__AggregateStatements__Q1keyAssignment_4 )
            // InternalJsonQ.g:578:3: rule__AggregateStatements__Q1keyAssignment_4
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
    // InternalJsonQ.g:586:1: rule__AggregateStatements__Group__5 : rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6 ;
    public final void rule__AggregateStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:590:1: ( rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6 )
            // InternalJsonQ.g:591:2: rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6
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
    // InternalJsonQ.g:598:1: rule__AggregateStatements__Group__5__Impl : ( ( rule__AggregateStatements__Q1valAssignment_5 ) ) ;
    public final void rule__AggregateStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:602:1: ( ( ( rule__AggregateStatements__Q1valAssignment_5 ) ) )
            // InternalJsonQ.g:603:1: ( ( rule__AggregateStatements__Q1valAssignment_5 ) )
            {
            // InternalJsonQ.g:603:1: ( ( rule__AggregateStatements__Q1valAssignment_5 ) )
            // InternalJsonQ.g:604:2: ( rule__AggregateStatements__Q1valAssignment_5 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1valAssignment_5()); 
            // InternalJsonQ.g:605:2: ( rule__AggregateStatements__Q1valAssignment_5 )
            // InternalJsonQ.g:605:3: rule__AggregateStatements__Q1valAssignment_5
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
    // InternalJsonQ.g:613:1: rule__AggregateStatements__Group__6 : rule__AggregateStatements__Group__6__Impl rule__AggregateStatements__Group__7 ;
    public final void rule__AggregateStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:617:1: ( rule__AggregateStatements__Group__6__Impl rule__AggregateStatements__Group__7 )
            // InternalJsonQ.g:618:2: rule__AggregateStatements__Group__6__Impl rule__AggregateStatements__Group__7
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
    // InternalJsonQ.g:625:1: rule__AggregateStatements__Group__6__Impl : ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? ) ;
    public final void rule__AggregateStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:629:1: ( ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? ) )
            // InternalJsonQ.g:630:1: ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? )
            {
            // InternalJsonQ.g:630:1: ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? )
            // InternalJsonQ.g:631:2: ( rule__AggregateStatements__QryadditionalAssignment_6 )?
            {
             before(grammarAccess.getAggregateStatementsAccess().getQryadditionalAssignment_6()); 
            // InternalJsonQ.g:632:2: ( rule__AggregateStatements__QryadditionalAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonQ.g:632:3: rule__AggregateStatements__QryadditionalAssignment_6
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
    // InternalJsonQ.g:640:1: rule__AggregateStatements__Group__7 : rule__AggregateStatements__Group__7__Impl ;
    public final void rule__AggregateStatements__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:644:1: ( rule__AggregateStatements__Group__7__Impl )
            // InternalJsonQ.g:645:2: rule__AggregateStatements__Group__7__Impl
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
    // InternalJsonQ.g:651:1: rule__AggregateStatements__Group__7__Impl : ( 'END' ) ;
    public final void rule__AggregateStatements__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:655:1: ( ( 'END' ) )
            // InternalJsonQ.g:656:1: ( 'END' )
            {
            // InternalJsonQ.g:656:1: ( 'END' )
            // InternalJsonQ.g:657:2: 'END'
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
    // InternalJsonQ.g:667:1: rule__GetStatements__Group__0 : rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1 ;
    public final void rule__GetStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:671:1: ( rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1 )
            // InternalJsonQ.g:672:2: rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1
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
    // InternalJsonQ.g:679:1: rule__GetStatements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__GetStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:683:1: ( ( 'GET' ) )
            // InternalJsonQ.g:684:1: ( 'GET' )
            {
            // InternalJsonQ.g:684:1: ( 'GET' )
            // InternalJsonQ.g:685:2: 'GET'
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
    // InternalJsonQ.g:694:1: rule__GetStatements__Group__1 : rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2 ;
    public final void rule__GetStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:698:1: ( rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2 )
            // InternalJsonQ.g:699:2: rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2
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
    // InternalJsonQ.g:706:1: rule__GetStatements__Group__1__Impl : ( ( rule__GetStatements__OpGetAssignment_1 ) ) ;
    public final void rule__GetStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:710:1: ( ( ( rule__GetStatements__OpGetAssignment_1 ) ) )
            // InternalJsonQ.g:711:1: ( ( rule__GetStatements__OpGetAssignment_1 ) )
            {
            // InternalJsonQ.g:711:1: ( ( rule__GetStatements__OpGetAssignment_1 ) )
            // InternalJsonQ.g:712:2: ( rule__GetStatements__OpGetAssignment_1 )
            {
             before(grammarAccess.getGetStatementsAccess().getOpGetAssignment_1()); 
            // InternalJsonQ.g:713:2: ( rule__GetStatements__OpGetAssignment_1 )
            // InternalJsonQ.g:713:3: rule__GetStatements__OpGetAssignment_1
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
    // InternalJsonQ.g:721:1: rule__GetStatements__Group__2 : rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3 ;
    public final void rule__GetStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:725:1: ( rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3 )
            // InternalJsonQ.g:726:2: rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3
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
    // InternalJsonQ.g:733:1: rule__GetStatements__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__GetStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:737:1: ( ( 'WHERE' ) )
            // InternalJsonQ.g:738:1: ( 'WHERE' )
            {
            // InternalJsonQ.g:738:1: ( 'WHERE' )
            // InternalJsonQ.g:739:2: 'WHERE'
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
    // InternalJsonQ.g:748:1: rule__GetStatements__Group__3 : rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4 ;
    public final void rule__GetStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:752:1: ( rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4 )
            // InternalJsonQ.g:753:2: rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4
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
    // InternalJsonQ.g:760:1: rule__GetStatements__Group__3__Impl : ( ( rule__GetStatements__Q1keyAssignment_3 ) ) ;
    public final void rule__GetStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:764:1: ( ( ( rule__GetStatements__Q1keyAssignment_3 ) ) )
            // InternalJsonQ.g:765:1: ( ( rule__GetStatements__Q1keyAssignment_3 ) )
            {
            // InternalJsonQ.g:765:1: ( ( rule__GetStatements__Q1keyAssignment_3 ) )
            // InternalJsonQ.g:766:2: ( rule__GetStatements__Q1keyAssignment_3 )
            {
             before(grammarAccess.getGetStatementsAccess().getQ1keyAssignment_3()); 
            // InternalJsonQ.g:767:2: ( rule__GetStatements__Q1keyAssignment_3 )
            // InternalJsonQ.g:767:3: rule__GetStatements__Q1keyAssignment_3
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
    // InternalJsonQ.g:775:1: rule__GetStatements__Group__4 : rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5 ;
    public final void rule__GetStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:779:1: ( rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5 )
            // InternalJsonQ.g:780:2: rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5
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
    // InternalJsonQ.g:787:1: rule__GetStatements__Group__4__Impl : ( ( rule__GetStatements__Q1valAssignment_4 ) ) ;
    public final void rule__GetStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:791:1: ( ( ( rule__GetStatements__Q1valAssignment_4 ) ) )
            // InternalJsonQ.g:792:1: ( ( rule__GetStatements__Q1valAssignment_4 ) )
            {
            // InternalJsonQ.g:792:1: ( ( rule__GetStatements__Q1valAssignment_4 ) )
            // InternalJsonQ.g:793:2: ( rule__GetStatements__Q1valAssignment_4 )
            {
             before(grammarAccess.getGetStatementsAccess().getQ1valAssignment_4()); 
            // InternalJsonQ.g:794:2: ( rule__GetStatements__Q1valAssignment_4 )
            // InternalJsonQ.g:794:3: rule__GetStatements__Q1valAssignment_4
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
    // InternalJsonQ.g:802:1: rule__GetStatements__Group__5 : rule__GetStatements__Group__5__Impl rule__GetStatements__Group__6 ;
    public final void rule__GetStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:806:1: ( rule__GetStatements__Group__5__Impl rule__GetStatements__Group__6 )
            // InternalJsonQ.g:807:2: rule__GetStatements__Group__5__Impl rule__GetStatements__Group__6
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
    // InternalJsonQ.g:814:1: rule__GetStatements__Group__5__Impl : ( ( rule__GetStatements__QryadditionalAssignment_5 )? ) ;
    public final void rule__GetStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:818:1: ( ( ( rule__GetStatements__QryadditionalAssignment_5 )? ) )
            // InternalJsonQ.g:819:1: ( ( rule__GetStatements__QryadditionalAssignment_5 )? )
            {
            // InternalJsonQ.g:819:1: ( ( rule__GetStatements__QryadditionalAssignment_5 )? )
            // InternalJsonQ.g:820:2: ( rule__GetStatements__QryadditionalAssignment_5 )?
            {
             before(grammarAccess.getGetStatementsAccess().getQryadditionalAssignment_5()); 
            // InternalJsonQ.g:821:2: ( rule__GetStatements__QryadditionalAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=13)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonQ.g:821:3: rule__GetStatements__QryadditionalAssignment_5
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
    // InternalJsonQ.g:829:1: rule__GetStatements__Group__6 : rule__GetStatements__Group__6__Impl ;
    public final void rule__GetStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:833:1: ( rule__GetStatements__Group__6__Impl )
            // InternalJsonQ.g:834:2: rule__GetStatements__Group__6__Impl
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
    // InternalJsonQ.g:840:1: rule__GetStatements__Group__6__Impl : ( 'END' ) ;
    public final void rule__GetStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:844:1: ( ( 'END' ) )
            // InternalJsonQ.g:845:1: ( 'END' )
            {
            // InternalJsonQ.g:845:1: ( 'END' )
            // InternalJsonQ.g:846:2: 'END'
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
    // InternalJsonQ.g:856:1: rule__AdditionalQuery__Group__0 : rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1 ;
    public final void rule__AdditionalQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:860:1: ( rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1 )
            // InternalJsonQ.g:861:2: rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1
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
    // InternalJsonQ.g:868:1: rule__AdditionalQuery__Group__0__Impl : ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) ) ;
    public final void rule__AdditionalQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:872:1: ( ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) ) )
            // InternalJsonQ.g:873:1: ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) )
            {
            // InternalJsonQ.g:873:1: ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) )
            // InternalJsonQ.g:874:2: ( rule__AdditionalQuery__ConnectorAssignment_0 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getConnectorAssignment_0()); 
            // InternalJsonQ.g:875:2: ( rule__AdditionalQuery__ConnectorAssignment_0 )
            // InternalJsonQ.g:875:3: rule__AdditionalQuery__ConnectorAssignment_0
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
    // InternalJsonQ.g:883:1: rule__AdditionalQuery__Group__1 : rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2 ;
    public final void rule__AdditionalQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:887:1: ( rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2 )
            // InternalJsonQ.g:888:2: rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2
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
    // InternalJsonQ.g:895:1: rule__AdditionalQuery__Group__1__Impl : ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) ) ;
    public final void rule__AdditionalQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:899:1: ( ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) ) )
            // InternalJsonQ.g:900:1: ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) )
            {
            // InternalJsonQ.g:900:1: ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) )
            // InternalJsonQ.g:901:2: ( rule__AdditionalQuery__Q2keyAssignment_1 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2keyAssignment_1()); 
            // InternalJsonQ.g:902:2: ( rule__AdditionalQuery__Q2keyAssignment_1 )
            // InternalJsonQ.g:902:3: rule__AdditionalQuery__Q2keyAssignment_1
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
    // InternalJsonQ.g:910:1: rule__AdditionalQuery__Group__2 : rule__AdditionalQuery__Group__2__Impl ;
    public final void rule__AdditionalQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:914:1: ( rule__AdditionalQuery__Group__2__Impl )
            // InternalJsonQ.g:915:2: rule__AdditionalQuery__Group__2__Impl
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
    // InternalJsonQ.g:921:1: rule__AdditionalQuery__Group__2__Impl : ( ( rule__AdditionalQuery__Q2valAssignment_2 ) ) ;
    public final void rule__AdditionalQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:925:1: ( ( ( rule__AdditionalQuery__Q2valAssignment_2 ) ) )
            // InternalJsonQ.g:926:1: ( ( rule__AdditionalQuery__Q2valAssignment_2 ) )
            {
            // InternalJsonQ.g:926:1: ( ( rule__AdditionalQuery__Q2valAssignment_2 ) )
            // InternalJsonQ.g:927:2: ( rule__AdditionalQuery__Q2valAssignment_2 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2valAssignment_2()); 
            // InternalJsonQ.g:928:2: ( rule__AdditionalQuery__Q2valAssignment_2 )
            // InternalJsonQ.g:928:3: rule__AdditionalQuery__Q2valAssignment_2
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
    // InternalJsonQ.g:937:1: rule__JSONQueryModel__InputStatementAssignment : ( ruleStatements ) ;
    public final void rule__JSONQueryModel__InputStatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:941:1: ( ( ruleStatements ) )
            // InternalJsonQ.g:942:2: ( ruleStatements )
            {
            // InternalJsonQ.g:942:2: ( ruleStatements )
            // InternalJsonQ.g:943:3: ruleStatements
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
    // InternalJsonQ.g:952:1: rule__AggregateStatements__OpAggAssignment_1 : ( ruleOperationAgg ) ;
    public final void rule__AggregateStatements__OpAggAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:956:1: ( ( ruleOperationAgg ) )
            // InternalJsonQ.g:957:2: ( ruleOperationAgg )
            {
            // InternalJsonQ.g:957:2: ( ruleOperationAgg )
            // InternalJsonQ.g:958:3: ruleOperationAgg
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
    // InternalJsonQ.g:967:1: rule__AggregateStatements__AggFieldAssignment_2 : ( ruleInputFieldSingle ) ;
    public final void rule__AggregateStatements__AggFieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:971:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:972:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:972:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:973:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:982:1: rule__AggregateStatements__Q1keyAssignment_4 : ( ruleInputFieldSingle ) ;
    public final void rule__AggregateStatements__Q1keyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:986:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:987:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:987:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:988:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:997:1: rule__AggregateStatements__Q1valAssignment_5 : ( ruleInputVal ) ;
    public final void rule__AggregateStatements__Q1valAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1001:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:1002:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:1002:2: ( ruleInputVal )
            // InternalJsonQ.g:1003:3: ruleInputVal
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
    // InternalJsonQ.g:1012:1: rule__AggregateStatements__QryadditionalAssignment_6 : ( ruleAdditionalQuery ) ;
    public final void rule__AggregateStatements__QryadditionalAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1016:1: ( ( ruleAdditionalQuery ) )
            // InternalJsonQ.g:1017:2: ( ruleAdditionalQuery )
            {
            // InternalJsonQ.g:1017:2: ( ruleAdditionalQuery )
            // InternalJsonQ.g:1018:3: ruleAdditionalQuery
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
    // InternalJsonQ.g:1027:1: rule__GetStatements__OpGetAssignment_1 : ( ruleOperationGET ) ;
    public final void rule__GetStatements__OpGetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1031:1: ( ( ruleOperationGET ) )
            // InternalJsonQ.g:1032:2: ( ruleOperationGET )
            {
            // InternalJsonQ.g:1032:2: ( ruleOperationGET )
            // InternalJsonQ.g:1033:3: ruleOperationGET
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
    // InternalJsonQ.g:1042:1: rule__GetStatements__Q1keyAssignment_3 : ( ruleInputFieldSingle ) ;
    public final void rule__GetStatements__Q1keyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1046:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:1047:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:1047:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:1048:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:1057:1: rule__GetStatements__Q1valAssignment_4 : ( ruleInputVal ) ;
    public final void rule__GetStatements__Q1valAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1061:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:1062:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:1062:2: ( ruleInputVal )
            // InternalJsonQ.g:1063:3: ruleInputVal
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
    // InternalJsonQ.g:1072:1: rule__GetStatements__QryadditionalAssignment_5 : ( ruleAdditionalQuery ) ;
    public final void rule__GetStatements__QryadditionalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1076:1: ( ( ruleAdditionalQuery ) )
            // InternalJsonQ.g:1077:2: ( ruleAdditionalQuery )
            {
            // InternalJsonQ.g:1077:2: ( ruleAdditionalQuery )
            // InternalJsonQ.g:1078:3: ruleAdditionalQuery
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
    // InternalJsonQ.g:1087:1: rule__AdditionalQuery__ConnectorAssignment_0 : ( ruleConnector ) ;
    public final void rule__AdditionalQuery__ConnectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1091:1: ( ( ruleConnector ) )
            // InternalJsonQ.g:1092:2: ( ruleConnector )
            {
            // InternalJsonQ.g:1092:2: ( ruleConnector )
            // InternalJsonQ.g:1093:3: ruleConnector
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
    // InternalJsonQ.g:1102:1: rule__AdditionalQuery__Q2keyAssignment_1 : ( ruleInputFieldSingle ) ;
    public final void rule__AdditionalQuery__Q2keyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1106:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:1107:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:1107:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:1108:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:1117:1: rule__AdditionalQuery__Q2valAssignment_2 : ( ruleInputVal ) ;
    public final void rule__AdditionalQuery__Q2valAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1121:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:1122:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:1122:2: ( ruleInputVal )
            // InternalJsonQ.g:1123:3: ruleInputVal
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


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalJsonQ.g:1132:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1136:1: ( ( RULE_INT ) )
            // InternalJsonQ.g:1137:2: ( RULE_INT )
            {
            // InternalJsonQ.g:1137:2: ( RULE_INT )
            // InternalJsonQ.g:1138:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalJsonQ.g:1147:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1151:1: ( ( RULE_STRING ) )
            // InternalJsonQ.g:1152:2: ( RULE_STRING )
            {
            // InternalJsonQ.g:1152:2: ( RULE_STRING )
            // InternalJsonQ.g:1153:3: RULE_STRING
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});

}