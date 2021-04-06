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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AVG'", "'AND'", "'OR'", "'DATA'", "'COUNT'", "'firstName'", "'lastName'", "'gender'", "'counrtyCode'", "'cityName'", "'isVaccinated'", "'income'", "'GET'", "'WHERE'"
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


    // $ANTLR start "entryRuleINTLiteral"
    // InternalJsonQ.g:228:1: entryRuleINTLiteral : ruleINTLiteral EOF ;
    public final void entryRuleINTLiteral() throws RecognitionException {
        try {
            // InternalJsonQ.g:229:1: ( ruleINTLiteral EOF )
            // InternalJsonQ.g:230:1: ruleINTLiteral EOF
            {
             before(grammarAccess.getINTLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleINTLiteral();

            state._fsp--;

             after(grammarAccess.getINTLiteralRule()); 
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
    // $ANTLR end "entryRuleINTLiteral"


    // $ANTLR start "ruleINTLiteral"
    // InternalJsonQ.g:237:1: ruleINTLiteral : ( ( rule__INTLiteral__ValueAssignment ) ) ;
    public final void ruleINTLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:241:2: ( ( ( rule__INTLiteral__ValueAssignment ) ) )
            // InternalJsonQ.g:242:2: ( ( rule__INTLiteral__ValueAssignment ) )
            {
            // InternalJsonQ.g:242:2: ( ( rule__INTLiteral__ValueAssignment ) )
            // InternalJsonQ.g:243:3: ( rule__INTLiteral__ValueAssignment )
            {
             before(grammarAccess.getINTLiteralAccess().getValueAssignment()); 
            // InternalJsonQ.g:244:3: ( rule__INTLiteral__ValueAssignment )
            // InternalJsonQ.g:244:4: rule__INTLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__INTLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getINTLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleINTLiteral"


    // $ANTLR start "ruleOperationAgg"
    // InternalJsonQ.g:253:1: ruleOperationAgg : ( ( 'AVG' ) ) ;
    public final void ruleOperationAgg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:257:1: ( ( ( 'AVG' ) ) )
            // InternalJsonQ.g:258:2: ( ( 'AVG' ) )
            {
            // InternalJsonQ.g:258:2: ( ( 'AVG' ) )
            // InternalJsonQ.g:259:3: ( 'AVG' )
            {
             before(grammarAccess.getOperationAggAccess().getAVGEnumLiteralDeclaration()); 
            // InternalJsonQ.g:260:3: ( 'AVG' )
            // InternalJsonQ.g:260:4: 'AVG'
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
    // InternalJsonQ.g:269:1: ruleOperationGET : ( ( rule__OperationGET__Alternatives ) ) ;
    public final void ruleOperationGET() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:273:1: ( ( ( rule__OperationGET__Alternatives ) ) )
            // InternalJsonQ.g:274:2: ( ( rule__OperationGET__Alternatives ) )
            {
            // InternalJsonQ.g:274:2: ( ( rule__OperationGET__Alternatives ) )
            // InternalJsonQ.g:275:3: ( rule__OperationGET__Alternatives )
            {
             before(grammarAccess.getOperationGETAccess().getAlternatives()); 
            // InternalJsonQ.g:276:3: ( rule__OperationGET__Alternatives )
            // InternalJsonQ.g:276:4: rule__OperationGET__Alternatives
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
    // InternalJsonQ.g:285:1: ruleInputFieldSingle : ( ( rule__InputFieldSingle__Alternatives ) ) ;
    public final void ruleInputFieldSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:289:1: ( ( ( rule__InputFieldSingle__Alternatives ) ) )
            // InternalJsonQ.g:290:2: ( ( rule__InputFieldSingle__Alternatives ) )
            {
            // InternalJsonQ.g:290:2: ( ( rule__InputFieldSingle__Alternatives ) )
            // InternalJsonQ.g:291:3: ( rule__InputFieldSingle__Alternatives )
            {
             before(grammarAccess.getInputFieldSingleAccess().getAlternatives()); 
            // InternalJsonQ.g:292:3: ( rule__InputFieldSingle__Alternatives )
            // InternalJsonQ.g:292:4: rule__InputFieldSingle__Alternatives
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
    // InternalJsonQ.g:300:1: rule__Statements__Alternatives : ( ( ruleGetStatements ) | ( ruleAggregateStatements ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:304:1: ( ( ruleGetStatements ) | ( ruleAggregateStatements ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=14 && LA2_1<=15)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==11) ) {
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
                    // InternalJsonQ.g:305:2: ( ruleGetStatements )
                    {
                    // InternalJsonQ.g:305:2: ( ruleGetStatements )
                    // InternalJsonQ.g:306:3: ruleGetStatements
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
                    // InternalJsonQ.g:311:2: ( ruleAggregateStatements )
                    {
                    // InternalJsonQ.g:311:2: ( ruleAggregateStatements )
                    // InternalJsonQ.g:312:3: ruleAggregateStatements
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


    // $ANTLR start "rule__AdditionalQuery__ConnectorAlternatives_0_0"
    // InternalJsonQ.g:321:1: rule__AdditionalQuery__ConnectorAlternatives_0_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__AdditionalQuery__ConnectorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:325:1: ( ( 'AND' ) | ( 'OR' ) )
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
                    // InternalJsonQ.g:326:2: ( 'AND' )
                    {
                    // InternalJsonQ.g:326:2: ( 'AND' )
                    // InternalJsonQ.g:327:3: 'AND'
                    {
                     before(grammarAccess.getAdditionalQueryAccess().getConnectorANDKeyword_0_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAdditionalQueryAccess().getConnectorANDKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:332:2: ( 'OR' )
                    {
                    // InternalJsonQ.g:332:2: ( 'OR' )
                    // InternalJsonQ.g:333:3: 'OR'
                    {
                     before(grammarAccess.getAdditionalQueryAccess().getConnectorORKeyword_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAdditionalQueryAccess().getConnectorORKeyword_0_0_1()); 

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
    // $ANTLR end "rule__AdditionalQuery__ConnectorAlternatives_0_0"


    // $ANTLR start "rule__InputVal__Alternatives"
    // InternalJsonQ.g:342:1: rule__InputVal__Alternatives : ( ( ruleINTLiteral ) | ( ruleStringLiteral ) );
    public final void rule__InputVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:346:1: ( ( ruleINTLiteral ) | ( ruleStringLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonQ.g:347:2: ( ruleINTLiteral )
                    {
                    // InternalJsonQ.g:347:2: ( ruleINTLiteral )
                    // InternalJsonQ.g:348:3: ruleINTLiteral
                    {
                     before(grammarAccess.getInputValAccess().getINTLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleINTLiteral();

                    state._fsp--;

                     after(grammarAccess.getInputValAccess().getINTLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:353:2: ( ruleStringLiteral )
                    {
                    // InternalJsonQ.g:353:2: ( ruleStringLiteral )
                    // InternalJsonQ.g:354:3: ruleStringLiteral
                    {
                     before(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getInputValAccess().getStringLiteralParserRuleCall_1()); 

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


    // $ANTLR start "rule__OperationGET__Alternatives"
    // InternalJsonQ.g:363:1: rule__OperationGET__Alternatives : ( ( ( 'DATA' ) ) | ( ( 'COUNT' ) ) );
    public final void rule__OperationGET__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:367:1: ( ( ( 'DATA' ) ) | ( ( 'COUNT' ) ) )
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
                    // InternalJsonQ.g:368:2: ( ( 'DATA' ) )
                    {
                    // InternalJsonQ.g:368:2: ( ( 'DATA' ) )
                    // InternalJsonQ.g:369:3: ( 'DATA' )
                    {
                     before(grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:370:3: ( 'DATA' )
                    // InternalJsonQ.g:370:4: 'DATA'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationGETAccess().getDATAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:374:2: ( ( 'COUNT' ) )
                    {
                    // InternalJsonQ.g:374:2: ( ( 'COUNT' ) )
                    // InternalJsonQ.g:375:3: ( 'COUNT' )
                    {
                     before(grammarAccess.getOperationGETAccess().getCOUNTEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:376:3: ( 'COUNT' )
                    // InternalJsonQ.g:376:4: 'COUNT'
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
    // InternalJsonQ.g:384:1: rule__InputFieldSingle__Alternatives : ( ( ( 'firstName' ) ) | ( ( 'lastName' ) ) | ( ( 'gender' ) ) | ( ( 'counrtyCode' ) ) | ( ( 'cityName' ) ) | ( ( 'isVaccinated' ) ) | ( ( 'income' ) ) );
    public final void rule__InputFieldSingle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:388:1: ( ( ( 'firstName' ) ) | ( ( 'lastName' ) ) | ( ( 'gender' ) ) | ( ( 'counrtyCode' ) ) | ( ( 'cityName' ) ) | ( ( 'isVaccinated' ) ) | ( ( 'income' ) ) )
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
                    // InternalJsonQ.g:389:2: ( ( 'firstName' ) )
                    {
                    // InternalJsonQ.g:389:2: ( ( 'firstName' ) )
                    // InternalJsonQ.g:390:3: ( 'firstName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:391:3: ( 'firstName' )
                    // InternalJsonQ.g:391:4: 'firstName'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getFirstNameEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:395:2: ( ( 'lastName' ) )
                    {
                    // InternalJsonQ.g:395:2: ( ( 'lastName' ) )
                    // InternalJsonQ.g:396:3: ( 'lastName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:397:3: ( 'lastName' )
                    // InternalJsonQ.g:397:4: 'lastName'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getLastNameEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonQ.g:401:2: ( ( 'gender' ) )
                    {
                    // InternalJsonQ.g:401:2: ( ( 'gender' ) )
                    // InternalJsonQ.g:402:3: ( 'gender' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2()); 
                    // InternalJsonQ.g:403:3: ( 'gender' )
                    // InternalJsonQ.g:403:4: 'gender'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getGenderEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonQ.g:407:2: ( ( 'counrtyCode' ) )
                    {
                    // InternalJsonQ.g:407:2: ( ( 'counrtyCode' ) )
                    // InternalJsonQ.g:408:3: ( 'counrtyCode' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3()); 
                    // InternalJsonQ.g:409:3: ( 'counrtyCode' )
                    // InternalJsonQ.g:409:4: 'counrtyCode'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getCounrtyCodeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonQ.g:413:2: ( ( 'cityName' ) )
                    {
                    // InternalJsonQ.g:413:2: ( ( 'cityName' ) )
                    // InternalJsonQ.g:414:3: ( 'cityName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4()); 
                    // InternalJsonQ.g:415:3: ( 'cityName' )
                    // InternalJsonQ.g:415:4: 'cityName'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getCityNameEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonQ.g:419:2: ( ( 'isVaccinated' ) )
                    {
                    // InternalJsonQ.g:419:2: ( ( 'isVaccinated' ) )
                    // InternalJsonQ.g:420:3: ( 'isVaccinated' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5()); 
                    // InternalJsonQ.g:421:3: ( 'isVaccinated' )
                    // InternalJsonQ.g:421:4: 'isVaccinated'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getIsVaccinatedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJsonQ.g:425:2: ( ( 'income' ) )
                    {
                    // InternalJsonQ.g:425:2: ( ( 'income' ) )
                    // InternalJsonQ.g:426:3: ( 'income' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getIncomeEnumLiteralDeclaration_6()); 
                    // InternalJsonQ.g:427:3: ( 'income' )
                    // InternalJsonQ.g:427:4: 'income'
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
    // InternalJsonQ.g:435:1: rule__AggregateStatements__Group__0 : rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1 ;
    public final void rule__AggregateStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:439:1: ( rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1 )
            // InternalJsonQ.g:440:2: rule__AggregateStatements__Group__0__Impl rule__AggregateStatements__Group__1
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
    // InternalJsonQ.g:447:1: rule__AggregateStatements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__AggregateStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:451:1: ( ( 'GET' ) )
            // InternalJsonQ.g:452:1: ( 'GET' )
            {
            // InternalJsonQ.g:452:1: ( 'GET' )
            // InternalJsonQ.g:453:2: 'GET'
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
    // InternalJsonQ.g:462:1: rule__AggregateStatements__Group__1 : rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2 ;
    public final void rule__AggregateStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:466:1: ( rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2 )
            // InternalJsonQ.g:467:2: rule__AggregateStatements__Group__1__Impl rule__AggregateStatements__Group__2
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
    // InternalJsonQ.g:474:1: rule__AggregateStatements__Group__1__Impl : ( ( rule__AggregateStatements__OpAggAssignment_1 ) ) ;
    public final void rule__AggregateStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:478:1: ( ( ( rule__AggregateStatements__OpAggAssignment_1 ) ) )
            // InternalJsonQ.g:479:1: ( ( rule__AggregateStatements__OpAggAssignment_1 ) )
            {
            // InternalJsonQ.g:479:1: ( ( rule__AggregateStatements__OpAggAssignment_1 ) )
            // InternalJsonQ.g:480:2: ( rule__AggregateStatements__OpAggAssignment_1 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getOpAggAssignment_1()); 
            // InternalJsonQ.g:481:2: ( rule__AggregateStatements__OpAggAssignment_1 )
            // InternalJsonQ.g:481:3: rule__AggregateStatements__OpAggAssignment_1
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
    // InternalJsonQ.g:489:1: rule__AggregateStatements__Group__2 : rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3 ;
    public final void rule__AggregateStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:493:1: ( rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3 )
            // InternalJsonQ.g:494:2: rule__AggregateStatements__Group__2__Impl rule__AggregateStatements__Group__3
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
    // InternalJsonQ.g:501:1: rule__AggregateStatements__Group__2__Impl : ( ( rule__AggregateStatements__AggFieldAssignment_2 ) ) ;
    public final void rule__AggregateStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:505:1: ( ( ( rule__AggregateStatements__AggFieldAssignment_2 ) ) )
            // InternalJsonQ.g:506:1: ( ( rule__AggregateStatements__AggFieldAssignment_2 ) )
            {
            // InternalJsonQ.g:506:1: ( ( rule__AggregateStatements__AggFieldAssignment_2 ) )
            // InternalJsonQ.g:507:2: ( rule__AggregateStatements__AggFieldAssignment_2 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getAggFieldAssignment_2()); 
            // InternalJsonQ.g:508:2: ( rule__AggregateStatements__AggFieldAssignment_2 )
            // InternalJsonQ.g:508:3: rule__AggregateStatements__AggFieldAssignment_2
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
    // InternalJsonQ.g:516:1: rule__AggregateStatements__Group__3 : rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4 ;
    public final void rule__AggregateStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:520:1: ( rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4 )
            // InternalJsonQ.g:521:2: rule__AggregateStatements__Group__3__Impl rule__AggregateStatements__Group__4
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
    // InternalJsonQ.g:528:1: rule__AggregateStatements__Group__3__Impl : ( 'WHERE' ) ;
    public final void rule__AggregateStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:532:1: ( ( 'WHERE' ) )
            // InternalJsonQ.g:533:1: ( 'WHERE' )
            {
            // InternalJsonQ.g:533:1: ( 'WHERE' )
            // InternalJsonQ.g:534:2: 'WHERE'
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
    // InternalJsonQ.g:543:1: rule__AggregateStatements__Group__4 : rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5 ;
    public final void rule__AggregateStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:547:1: ( rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5 )
            // InternalJsonQ.g:548:2: rule__AggregateStatements__Group__4__Impl rule__AggregateStatements__Group__5
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
    // InternalJsonQ.g:555:1: rule__AggregateStatements__Group__4__Impl : ( ( rule__AggregateStatements__Q1keyAssignment_4 ) ) ;
    public final void rule__AggregateStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:559:1: ( ( ( rule__AggregateStatements__Q1keyAssignment_4 ) ) )
            // InternalJsonQ.g:560:1: ( ( rule__AggregateStatements__Q1keyAssignment_4 ) )
            {
            // InternalJsonQ.g:560:1: ( ( rule__AggregateStatements__Q1keyAssignment_4 ) )
            // InternalJsonQ.g:561:2: ( rule__AggregateStatements__Q1keyAssignment_4 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1keyAssignment_4()); 
            // InternalJsonQ.g:562:2: ( rule__AggregateStatements__Q1keyAssignment_4 )
            // InternalJsonQ.g:562:3: rule__AggregateStatements__Q1keyAssignment_4
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
    // InternalJsonQ.g:570:1: rule__AggregateStatements__Group__5 : rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6 ;
    public final void rule__AggregateStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:574:1: ( rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6 )
            // InternalJsonQ.g:575:2: rule__AggregateStatements__Group__5__Impl rule__AggregateStatements__Group__6
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
    // InternalJsonQ.g:582:1: rule__AggregateStatements__Group__5__Impl : ( ( rule__AggregateStatements__Q1valAssignment_5 ) ) ;
    public final void rule__AggregateStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:586:1: ( ( ( rule__AggregateStatements__Q1valAssignment_5 ) ) )
            // InternalJsonQ.g:587:1: ( ( rule__AggregateStatements__Q1valAssignment_5 ) )
            {
            // InternalJsonQ.g:587:1: ( ( rule__AggregateStatements__Q1valAssignment_5 ) )
            // InternalJsonQ.g:588:2: ( rule__AggregateStatements__Q1valAssignment_5 )
            {
             before(grammarAccess.getAggregateStatementsAccess().getQ1valAssignment_5()); 
            // InternalJsonQ.g:589:2: ( rule__AggregateStatements__Q1valAssignment_5 )
            // InternalJsonQ.g:589:3: rule__AggregateStatements__Q1valAssignment_5
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
    // InternalJsonQ.g:597:1: rule__AggregateStatements__Group__6 : rule__AggregateStatements__Group__6__Impl ;
    public final void rule__AggregateStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:601:1: ( rule__AggregateStatements__Group__6__Impl )
            // InternalJsonQ.g:602:2: rule__AggregateStatements__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregateStatements__Group__6__Impl();

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
    // InternalJsonQ.g:608:1: rule__AggregateStatements__Group__6__Impl : ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? ) ;
    public final void rule__AggregateStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:612:1: ( ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? ) )
            // InternalJsonQ.g:613:1: ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? )
            {
            // InternalJsonQ.g:613:1: ( ( rule__AggregateStatements__QryadditionalAssignment_6 )? )
            // InternalJsonQ.g:614:2: ( rule__AggregateStatements__QryadditionalAssignment_6 )?
            {
             before(grammarAccess.getAggregateStatementsAccess().getQryadditionalAssignment_6()); 
            // InternalJsonQ.g:615:2: ( rule__AggregateStatements__QryadditionalAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonQ.g:615:3: rule__AggregateStatements__QryadditionalAssignment_6
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


    // $ANTLR start "rule__GetStatements__Group__0"
    // InternalJsonQ.g:624:1: rule__GetStatements__Group__0 : rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1 ;
    public final void rule__GetStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:628:1: ( rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1 )
            // InternalJsonQ.g:629:2: rule__GetStatements__Group__0__Impl rule__GetStatements__Group__1
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
    // InternalJsonQ.g:636:1: rule__GetStatements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__GetStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:640:1: ( ( 'GET' ) )
            // InternalJsonQ.g:641:1: ( 'GET' )
            {
            // InternalJsonQ.g:641:1: ( 'GET' )
            // InternalJsonQ.g:642:2: 'GET'
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
    // InternalJsonQ.g:651:1: rule__GetStatements__Group__1 : rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2 ;
    public final void rule__GetStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:655:1: ( rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2 )
            // InternalJsonQ.g:656:2: rule__GetStatements__Group__1__Impl rule__GetStatements__Group__2
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
    // InternalJsonQ.g:663:1: rule__GetStatements__Group__1__Impl : ( ( rule__GetStatements__OpGetAssignment_1 ) ) ;
    public final void rule__GetStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:667:1: ( ( ( rule__GetStatements__OpGetAssignment_1 ) ) )
            // InternalJsonQ.g:668:1: ( ( rule__GetStatements__OpGetAssignment_1 ) )
            {
            // InternalJsonQ.g:668:1: ( ( rule__GetStatements__OpGetAssignment_1 ) )
            // InternalJsonQ.g:669:2: ( rule__GetStatements__OpGetAssignment_1 )
            {
             before(grammarAccess.getGetStatementsAccess().getOpGetAssignment_1()); 
            // InternalJsonQ.g:670:2: ( rule__GetStatements__OpGetAssignment_1 )
            // InternalJsonQ.g:670:3: rule__GetStatements__OpGetAssignment_1
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
    // InternalJsonQ.g:678:1: rule__GetStatements__Group__2 : rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3 ;
    public final void rule__GetStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:682:1: ( rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3 )
            // InternalJsonQ.g:683:2: rule__GetStatements__Group__2__Impl rule__GetStatements__Group__3
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
    // InternalJsonQ.g:690:1: rule__GetStatements__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__GetStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:694:1: ( ( 'WHERE' ) )
            // InternalJsonQ.g:695:1: ( 'WHERE' )
            {
            // InternalJsonQ.g:695:1: ( 'WHERE' )
            // InternalJsonQ.g:696:2: 'WHERE'
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
    // InternalJsonQ.g:705:1: rule__GetStatements__Group__3 : rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4 ;
    public final void rule__GetStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:709:1: ( rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4 )
            // InternalJsonQ.g:710:2: rule__GetStatements__Group__3__Impl rule__GetStatements__Group__4
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
    // InternalJsonQ.g:717:1: rule__GetStatements__Group__3__Impl : ( ( rule__GetStatements__Q1keyAssignment_3 ) ) ;
    public final void rule__GetStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:721:1: ( ( ( rule__GetStatements__Q1keyAssignment_3 ) ) )
            // InternalJsonQ.g:722:1: ( ( rule__GetStatements__Q1keyAssignment_3 ) )
            {
            // InternalJsonQ.g:722:1: ( ( rule__GetStatements__Q1keyAssignment_3 ) )
            // InternalJsonQ.g:723:2: ( rule__GetStatements__Q1keyAssignment_3 )
            {
             before(grammarAccess.getGetStatementsAccess().getQ1keyAssignment_3()); 
            // InternalJsonQ.g:724:2: ( rule__GetStatements__Q1keyAssignment_3 )
            // InternalJsonQ.g:724:3: rule__GetStatements__Q1keyAssignment_3
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
    // InternalJsonQ.g:732:1: rule__GetStatements__Group__4 : rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5 ;
    public final void rule__GetStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:736:1: ( rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5 )
            // InternalJsonQ.g:737:2: rule__GetStatements__Group__4__Impl rule__GetStatements__Group__5
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
    // InternalJsonQ.g:744:1: rule__GetStatements__Group__4__Impl : ( ( rule__GetStatements__Q1valAssignment_4 ) ) ;
    public final void rule__GetStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:748:1: ( ( ( rule__GetStatements__Q1valAssignment_4 ) ) )
            // InternalJsonQ.g:749:1: ( ( rule__GetStatements__Q1valAssignment_4 ) )
            {
            // InternalJsonQ.g:749:1: ( ( rule__GetStatements__Q1valAssignment_4 ) )
            // InternalJsonQ.g:750:2: ( rule__GetStatements__Q1valAssignment_4 )
            {
             before(grammarAccess.getGetStatementsAccess().getQ1valAssignment_4()); 
            // InternalJsonQ.g:751:2: ( rule__GetStatements__Q1valAssignment_4 )
            // InternalJsonQ.g:751:3: rule__GetStatements__Q1valAssignment_4
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
    // InternalJsonQ.g:759:1: rule__GetStatements__Group__5 : rule__GetStatements__Group__5__Impl ;
    public final void rule__GetStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:763:1: ( rule__GetStatements__Group__5__Impl )
            // InternalJsonQ.g:764:2: rule__GetStatements__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetStatements__Group__5__Impl();

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
    // InternalJsonQ.g:770:1: rule__GetStatements__Group__5__Impl : ( ( rule__GetStatements__QryadditionalAssignment_5 )? ) ;
    public final void rule__GetStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:774:1: ( ( ( rule__GetStatements__QryadditionalAssignment_5 )? ) )
            // InternalJsonQ.g:775:1: ( ( rule__GetStatements__QryadditionalAssignment_5 )? )
            {
            // InternalJsonQ.g:775:1: ( ( rule__GetStatements__QryadditionalAssignment_5 )? )
            // InternalJsonQ.g:776:2: ( rule__GetStatements__QryadditionalAssignment_5 )?
            {
             before(grammarAccess.getGetStatementsAccess().getQryadditionalAssignment_5()); 
            // InternalJsonQ.g:777:2: ( rule__GetStatements__QryadditionalAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=13)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonQ.g:777:3: rule__GetStatements__QryadditionalAssignment_5
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


    // $ANTLR start "rule__AdditionalQuery__Group__0"
    // InternalJsonQ.g:786:1: rule__AdditionalQuery__Group__0 : rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1 ;
    public final void rule__AdditionalQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:790:1: ( rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1 )
            // InternalJsonQ.g:791:2: rule__AdditionalQuery__Group__0__Impl rule__AdditionalQuery__Group__1
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
    // InternalJsonQ.g:798:1: rule__AdditionalQuery__Group__0__Impl : ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) ) ;
    public final void rule__AdditionalQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:802:1: ( ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) ) )
            // InternalJsonQ.g:803:1: ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) )
            {
            // InternalJsonQ.g:803:1: ( ( rule__AdditionalQuery__ConnectorAssignment_0 ) )
            // InternalJsonQ.g:804:2: ( rule__AdditionalQuery__ConnectorAssignment_0 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getConnectorAssignment_0()); 
            // InternalJsonQ.g:805:2: ( rule__AdditionalQuery__ConnectorAssignment_0 )
            // InternalJsonQ.g:805:3: rule__AdditionalQuery__ConnectorAssignment_0
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
    // InternalJsonQ.g:813:1: rule__AdditionalQuery__Group__1 : rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2 ;
    public final void rule__AdditionalQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:817:1: ( rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2 )
            // InternalJsonQ.g:818:2: rule__AdditionalQuery__Group__1__Impl rule__AdditionalQuery__Group__2
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
    // InternalJsonQ.g:825:1: rule__AdditionalQuery__Group__1__Impl : ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) ) ;
    public final void rule__AdditionalQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:829:1: ( ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) ) )
            // InternalJsonQ.g:830:1: ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) )
            {
            // InternalJsonQ.g:830:1: ( ( rule__AdditionalQuery__Q2keyAssignment_1 ) )
            // InternalJsonQ.g:831:2: ( rule__AdditionalQuery__Q2keyAssignment_1 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2keyAssignment_1()); 
            // InternalJsonQ.g:832:2: ( rule__AdditionalQuery__Q2keyAssignment_1 )
            // InternalJsonQ.g:832:3: rule__AdditionalQuery__Q2keyAssignment_1
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
    // InternalJsonQ.g:840:1: rule__AdditionalQuery__Group__2 : rule__AdditionalQuery__Group__2__Impl ;
    public final void rule__AdditionalQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:844:1: ( rule__AdditionalQuery__Group__2__Impl )
            // InternalJsonQ.g:845:2: rule__AdditionalQuery__Group__2__Impl
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
    // InternalJsonQ.g:851:1: rule__AdditionalQuery__Group__2__Impl : ( ( rule__AdditionalQuery__Q2valAssignment_2 ) ) ;
    public final void rule__AdditionalQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:855:1: ( ( ( rule__AdditionalQuery__Q2valAssignment_2 ) ) )
            // InternalJsonQ.g:856:1: ( ( rule__AdditionalQuery__Q2valAssignment_2 ) )
            {
            // InternalJsonQ.g:856:1: ( ( rule__AdditionalQuery__Q2valAssignment_2 ) )
            // InternalJsonQ.g:857:2: ( rule__AdditionalQuery__Q2valAssignment_2 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getQ2valAssignment_2()); 
            // InternalJsonQ.g:858:2: ( rule__AdditionalQuery__Q2valAssignment_2 )
            // InternalJsonQ.g:858:3: rule__AdditionalQuery__Q2valAssignment_2
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
    // InternalJsonQ.g:867:1: rule__JSONQueryModel__InputStatementAssignment : ( ruleStatements ) ;
    public final void rule__JSONQueryModel__InputStatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:871:1: ( ( ruleStatements ) )
            // InternalJsonQ.g:872:2: ( ruleStatements )
            {
            // InternalJsonQ.g:872:2: ( ruleStatements )
            // InternalJsonQ.g:873:3: ruleStatements
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
    // InternalJsonQ.g:882:1: rule__AggregateStatements__OpAggAssignment_1 : ( ruleOperationAgg ) ;
    public final void rule__AggregateStatements__OpAggAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:886:1: ( ( ruleOperationAgg ) )
            // InternalJsonQ.g:887:2: ( ruleOperationAgg )
            {
            // InternalJsonQ.g:887:2: ( ruleOperationAgg )
            // InternalJsonQ.g:888:3: ruleOperationAgg
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
    // InternalJsonQ.g:897:1: rule__AggregateStatements__AggFieldAssignment_2 : ( ruleInputFieldSingle ) ;
    public final void rule__AggregateStatements__AggFieldAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:901:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:902:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:902:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:903:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:912:1: rule__AggregateStatements__Q1keyAssignment_4 : ( ruleInputFieldSingle ) ;
    public final void rule__AggregateStatements__Q1keyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:916:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:917:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:917:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:918:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:927:1: rule__AggregateStatements__Q1valAssignment_5 : ( ruleInputVal ) ;
    public final void rule__AggregateStatements__Q1valAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:931:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:932:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:932:2: ( ruleInputVal )
            // InternalJsonQ.g:933:3: ruleInputVal
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
    // InternalJsonQ.g:942:1: rule__AggregateStatements__QryadditionalAssignment_6 : ( ruleAdditionalQuery ) ;
    public final void rule__AggregateStatements__QryadditionalAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:946:1: ( ( ruleAdditionalQuery ) )
            // InternalJsonQ.g:947:2: ( ruleAdditionalQuery )
            {
            // InternalJsonQ.g:947:2: ( ruleAdditionalQuery )
            // InternalJsonQ.g:948:3: ruleAdditionalQuery
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
    // InternalJsonQ.g:957:1: rule__GetStatements__OpGetAssignment_1 : ( ruleOperationGET ) ;
    public final void rule__GetStatements__OpGetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:961:1: ( ( ruleOperationGET ) )
            // InternalJsonQ.g:962:2: ( ruleOperationGET )
            {
            // InternalJsonQ.g:962:2: ( ruleOperationGET )
            // InternalJsonQ.g:963:3: ruleOperationGET
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
    // InternalJsonQ.g:972:1: rule__GetStatements__Q1keyAssignment_3 : ( ruleInputFieldSingle ) ;
    public final void rule__GetStatements__Q1keyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:976:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:977:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:977:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:978:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:987:1: rule__GetStatements__Q1valAssignment_4 : ( ruleInputVal ) ;
    public final void rule__GetStatements__Q1valAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:991:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:992:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:992:2: ( ruleInputVal )
            // InternalJsonQ.g:993:3: ruleInputVal
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
    // InternalJsonQ.g:1002:1: rule__GetStatements__QryadditionalAssignment_5 : ( ruleAdditionalQuery ) ;
    public final void rule__GetStatements__QryadditionalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1006:1: ( ( ruleAdditionalQuery ) )
            // InternalJsonQ.g:1007:2: ( ruleAdditionalQuery )
            {
            // InternalJsonQ.g:1007:2: ( ruleAdditionalQuery )
            // InternalJsonQ.g:1008:3: ruleAdditionalQuery
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
    // InternalJsonQ.g:1017:1: rule__AdditionalQuery__ConnectorAssignment_0 : ( ( rule__AdditionalQuery__ConnectorAlternatives_0_0 ) ) ;
    public final void rule__AdditionalQuery__ConnectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1021:1: ( ( ( rule__AdditionalQuery__ConnectorAlternatives_0_0 ) ) )
            // InternalJsonQ.g:1022:2: ( ( rule__AdditionalQuery__ConnectorAlternatives_0_0 ) )
            {
            // InternalJsonQ.g:1022:2: ( ( rule__AdditionalQuery__ConnectorAlternatives_0_0 ) )
            // InternalJsonQ.g:1023:3: ( rule__AdditionalQuery__ConnectorAlternatives_0_0 )
            {
             before(grammarAccess.getAdditionalQueryAccess().getConnectorAlternatives_0_0()); 
            // InternalJsonQ.g:1024:3: ( rule__AdditionalQuery__ConnectorAlternatives_0_0 )
            // InternalJsonQ.g:1024:4: rule__AdditionalQuery__ConnectorAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AdditionalQuery__ConnectorAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionalQueryAccess().getConnectorAlternatives_0_0()); 

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
    // InternalJsonQ.g:1032:1: rule__AdditionalQuery__Q2keyAssignment_1 : ( ruleInputFieldSingle ) ;
    public final void rule__AdditionalQuery__Q2keyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1036:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:1037:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:1037:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:1038:3: ruleInputFieldSingle
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
    // InternalJsonQ.g:1047:1: rule__AdditionalQuery__Q2valAssignment_2 : ( ruleInputVal ) ;
    public final void rule__AdditionalQuery__Q2valAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1051:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:1052:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:1052:2: ( ruleInputVal )
            // InternalJsonQ.g:1053:3: ruleInputVal
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
    // InternalJsonQ.g:1062:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1066:1: ( ( RULE_STRING ) )
            // InternalJsonQ.g:1067:2: ( RULE_STRING )
            {
            // InternalJsonQ.g:1067:2: ( RULE_STRING )
            // InternalJsonQ.g:1068:3: RULE_STRING
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


    // $ANTLR start "rule__INTLiteral__ValueAssignment"
    // InternalJsonQ.g:1077:1: rule__INTLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__INTLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:1081:1: ( ( RULE_INT ) )
            // InternalJsonQ.g:1082:2: ( RULE_INT )
            {
            // InternalJsonQ.g:1082:2: ( RULE_INT )
            // InternalJsonQ.g:1083:3: RULE_INT
            {
             before(grammarAccess.getINTLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getINTLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__INTLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});

}