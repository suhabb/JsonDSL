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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DATA'", "'AND'", "'OR'", "'areaType'", "'areaName'", "'areaCode'", "'GET'", "'FOR'"
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

                if ( (LA1_0==17) ) {
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
    // InternalJsonQ.g:87:1: ruleStatements : ( ( rule__Statements__Group__0 ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:91:2: ( ( ( rule__Statements__Group__0 ) ) )
            // InternalJsonQ.g:92:2: ( ( rule__Statements__Group__0 ) )
            {
            // InternalJsonQ.g:92:2: ( ( rule__Statements__Group__0 ) )
            // InternalJsonQ.g:93:3: ( rule__Statements__Group__0 )
            {
             before(grammarAccess.getStatementsAccess().getGroup()); 
            // InternalJsonQ.g:94:3: ( rule__Statements__Group__0 )
            // InternalJsonQ.g:94:4: rule__Statements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getGroup()); 

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


    // $ANTLR start "entryRuleInputVal"
    // InternalJsonQ.g:103:1: entryRuleInputVal : ruleInputVal EOF ;
    public final void entryRuleInputVal() throws RecognitionException {
        try {
            // InternalJsonQ.g:104:1: ( ruleInputVal EOF )
            // InternalJsonQ.g:105:1: ruleInputVal EOF
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
    // InternalJsonQ.g:112:1: ruleInputVal : ( ( rule__InputVal__Alternatives ) ) ;
    public final void ruleInputVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:116:2: ( ( ( rule__InputVal__Alternatives ) ) )
            // InternalJsonQ.g:117:2: ( ( rule__InputVal__Alternatives ) )
            {
            // InternalJsonQ.g:117:2: ( ( rule__InputVal__Alternatives ) )
            // InternalJsonQ.g:118:3: ( rule__InputVal__Alternatives )
            {
             before(grammarAccess.getInputValAccess().getAlternatives()); 
            // InternalJsonQ.g:119:3: ( rule__InputVal__Alternatives )
            // InternalJsonQ.g:119:4: rule__InputVal__Alternatives
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
    // InternalJsonQ.g:128:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalJsonQ.g:129:1: ( ruleStringLiteral EOF )
            // InternalJsonQ.g:130:1: ruleStringLiteral EOF
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
    // InternalJsonQ.g:137:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:141:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalJsonQ.g:142:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalJsonQ.g:142:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalJsonQ.g:143:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalJsonQ.g:144:3: ( rule__StringLiteral__ValueAssignment )
            // InternalJsonQ.g:144:4: rule__StringLiteral__ValueAssignment
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
    // InternalJsonQ.g:153:1: entryRuleINTLiteral : ruleINTLiteral EOF ;
    public final void entryRuleINTLiteral() throws RecognitionException {
        try {
            // InternalJsonQ.g:154:1: ( ruleINTLiteral EOF )
            // InternalJsonQ.g:155:1: ruleINTLiteral EOF
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
    // InternalJsonQ.g:162:1: ruleINTLiteral : ( ( rule__INTLiteral__ValueAssignment ) ) ;
    public final void ruleINTLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:166:2: ( ( ( rule__INTLiteral__ValueAssignment ) ) )
            // InternalJsonQ.g:167:2: ( ( rule__INTLiteral__ValueAssignment ) )
            {
            // InternalJsonQ.g:167:2: ( ( rule__INTLiteral__ValueAssignment ) )
            // InternalJsonQ.g:168:3: ( rule__INTLiteral__ValueAssignment )
            {
             before(grammarAccess.getINTLiteralAccess().getValueAssignment()); 
            // InternalJsonQ.g:169:3: ( rule__INTLiteral__ValueAssignment )
            // InternalJsonQ.g:169:4: rule__INTLiteral__ValueAssignment
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


    // $ANTLR start "ruleOperation"
    // InternalJsonQ.g:178:1: ruleOperation : ( ( 'DATA' ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:182:1: ( ( ( 'DATA' ) ) )
            // InternalJsonQ.g:183:2: ( ( 'DATA' ) )
            {
            // InternalJsonQ.g:183:2: ( ( 'DATA' ) )
            // InternalJsonQ.g:184:3: ( 'DATA' )
            {
             before(grammarAccess.getOperationAccess().getDATAEnumLiteralDeclaration()); 
            // InternalJsonQ.g:185:3: ( 'DATA' )
            // InternalJsonQ.g:185:4: 'DATA'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOperationAccess().getDATAEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleInputFieldSingle"
    // InternalJsonQ.g:194:1: ruleInputFieldSingle : ( ( rule__InputFieldSingle__Alternatives ) ) ;
    public final void ruleInputFieldSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:198:1: ( ( ( rule__InputFieldSingle__Alternatives ) ) )
            // InternalJsonQ.g:199:2: ( ( rule__InputFieldSingle__Alternatives ) )
            {
            // InternalJsonQ.g:199:2: ( ( rule__InputFieldSingle__Alternatives ) )
            // InternalJsonQ.g:200:3: ( rule__InputFieldSingle__Alternatives )
            {
             before(grammarAccess.getInputFieldSingleAccess().getAlternatives()); 
            // InternalJsonQ.g:201:3: ( rule__InputFieldSingle__Alternatives )
            // InternalJsonQ.g:201:4: rule__InputFieldSingle__Alternatives
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


    // $ANTLR start "rule__Statements__ConnectorAlternatives_5_0"
    // InternalJsonQ.g:209:1: rule__Statements__ConnectorAlternatives_5_0 : ( ( 'AND' ) | ( 'OR' ) );
    public final void rule__Statements__ConnectorAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:213:1: ( ( 'AND' ) | ( 'OR' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJsonQ.g:214:2: ( 'AND' )
                    {
                    // InternalJsonQ.g:214:2: ( 'AND' )
                    // InternalJsonQ.g:215:3: 'AND'
                    {
                     before(grammarAccess.getStatementsAccess().getConnectorANDKeyword_5_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStatementsAccess().getConnectorANDKeyword_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:220:2: ( 'OR' )
                    {
                    // InternalJsonQ.g:220:2: ( 'OR' )
                    // InternalJsonQ.g:221:3: 'OR'
                    {
                     before(grammarAccess.getStatementsAccess().getConnectorORKeyword_5_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStatementsAccess().getConnectorORKeyword_5_0_1()); 

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
    // $ANTLR end "rule__Statements__ConnectorAlternatives_5_0"


    // $ANTLR start "rule__InputVal__Alternatives"
    // InternalJsonQ.g:230:1: rule__InputVal__Alternatives : ( ( ruleINTLiteral ) | ( ruleStringLiteral ) );
    public final void rule__InputVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:234:1: ( ( ruleINTLiteral ) | ( ruleStringLiteral ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonQ.g:235:2: ( ruleINTLiteral )
                    {
                    // InternalJsonQ.g:235:2: ( ruleINTLiteral )
                    // InternalJsonQ.g:236:3: ruleINTLiteral
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
                    // InternalJsonQ.g:241:2: ( ruleStringLiteral )
                    {
                    // InternalJsonQ.g:241:2: ( ruleStringLiteral )
                    // InternalJsonQ.g:242:3: ruleStringLiteral
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


    // $ANTLR start "rule__InputFieldSingle__Alternatives"
    // InternalJsonQ.g:251:1: rule__InputFieldSingle__Alternatives : ( ( ( 'areaType' ) ) | ( ( 'areaName' ) ) | ( ( 'areaCode' ) ) );
    public final void rule__InputFieldSingle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:255:1: ( ( ( 'areaType' ) ) | ( ( 'areaName' ) ) | ( ( 'areaCode' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJsonQ.g:256:2: ( ( 'areaType' ) )
                    {
                    // InternalJsonQ.g:256:2: ( ( 'areaType' ) )
                    // InternalJsonQ.g:257:3: ( 'areaType' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getAreaTypeEnumLiteralDeclaration_0()); 
                    // InternalJsonQ.g:258:3: ( 'areaType' )
                    // InternalJsonQ.g:258:4: 'areaType'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getAreaTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonQ.g:262:2: ( ( 'areaName' ) )
                    {
                    // InternalJsonQ.g:262:2: ( ( 'areaName' ) )
                    // InternalJsonQ.g:263:3: ( 'areaName' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getAreaNameEnumLiteralDeclaration_1()); 
                    // InternalJsonQ.g:264:3: ( 'areaName' )
                    // InternalJsonQ.g:264:4: 'areaName'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getAreaNameEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonQ.g:268:2: ( ( 'areaCode' ) )
                    {
                    // InternalJsonQ.g:268:2: ( ( 'areaCode' ) )
                    // InternalJsonQ.g:269:3: ( 'areaCode' )
                    {
                     before(grammarAccess.getInputFieldSingleAccess().getAreaCodeEnumLiteralDeclaration_2()); 
                    // InternalJsonQ.g:270:3: ( 'areaCode' )
                    // InternalJsonQ.g:270:4: 'areaCode'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getInputFieldSingleAccess().getAreaCodeEnumLiteralDeclaration_2()); 

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


    // $ANTLR start "rule__Statements__Group__0"
    // InternalJsonQ.g:278:1: rule__Statements__Group__0 : rule__Statements__Group__0__Impl rule__Statements__Group__1 ;
    public final void rule__Statements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:282:1: ( rule__Statements__Group__0__Impl rule__Statements__Group__1 )
            // InternalJsonQ.g:283:2: rule__Statements__Group__0__Impl rule__Statements__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__1();

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
    // $ANTLR end "rule__Statements__Group__0"


    // $ANTLR start "rule__Statements__Group__0__Impl"
    // InternalJsonQ.g:290:1: rule__Statements__Group__0__Impl : ( 'GET' ) ;
    public final void rule__Statements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:294:1: ( ( 'GET' ) )
            // InternalJsonQ.g:295:1: ( 'GET' )
            {
            // InternalJsonQ.g:295:1: ( 'GET' )
            // InternalJsonQ.g:296:2: 'GET'
            {
             before(grammarAccess.getStatementsAccess().getGETKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatementsAccess().getGETKeyword_0()); 

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
    // $ANTLR end "rule__Statements__Group__0__Impl"


    // $ANTLR start "rule__Statements__Group__1"
    // InternalJsonQ.g:305:1: rule__Statements__Group__1 : rule__Statements__Group__1__Impl rule__Statements__Group__2 ;
    public final void rule__Statements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:309:1: ( rule__Statements__Group__1__Impl rule__Statements__Group__2 )
            // InternalJsonQ.g:310:2: rule__Statements__Group__1__Impl rule__Statements__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Statements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__2();

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
    // $ANTLR end "rule__Statements__Group__1"


    // $ANTLR start "rule__Statements__Group__1__Impl"
    // InternalJsonQ.g:317:1: rule__Statements__Group__1__Impl : ( ( rule__Statements__OperationAssignment_1 ) ) ;
    public final void rule__Statements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:321:1: ( ( ( rule__Statements__OperationAssignment_1 ) ) )
            // InternalJsonQ.g:322:1: ( ( rule__Statements__OperationAssignment_1 ) )
            {
            // InternalJsonQ.g:322:1: ( ( rule__Statements__OperationAssignment_1 ) )
            // InternalJsonQ.g:323:2: ( rule__Statements__OperationAssignment_1 )
            {
             before(grammarAccess.getStatementsAccess().getOperationAssignment_1()); 
            // InternalJsonQ.g:324:2: ( rule__Statements__OperationAssignment_1 )
            // InternalJsonQ.g:324:3: rule__Statements__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statements__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getOperationAssignment_1()); 

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
    // $ANTLR end "rule__Statements__Group__1__Impl"


    // $ANTLR start "rule__Statements__Group__2"
    // InternalJsonQ.g:332:1: rule__Statements__Group__2 : rule__Statements__Group__2__Impl rule__Statements__Group__3 ;
    public final void rule__Statements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:336:1: ( rule__Statements__Group__2__Impl rule__Statements__Group__3 )
            // InternalJsonQ.g:337:2: rule__Statements__Group__2__Impl rule__Statements__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Statements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__3();

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
    // $ANTLR end "rule__Statements__Group__2"


    // $ANTLR start "rule__Statements__Group__2__Impl"
    // InternalJsonQ.g:344:1: rule__Statements__Group__2__Impl : ( 'FOR' ) ;
    public final void rule__Statements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:348:1: ( ( 'FOR' ) )
            // InternalJsonQ.g:349:1: ( 'FOR' )
            {
            // InternalJsonQ.g:349:1: ( 'FOR' )
            // InternalJsonQ.g:350:2: 'FOR'
            {
             before(grammarAccess.getStatementsAccess().getFORKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatementsAccess().getFORKeyword_2()); 

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
    // $ANTLR end "rule__Statements__Group__2__Impl"


    // $ANTLR start "rule__Statements__Group__3"
    // InternalJsonQ.g:359:1: rule__Statements__Group__3 : rule__Statements__Group__3__Impl rule__Statements__Group__4 ;
    public final void rule__Statements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:363:1: ( rule__Statements__Group__3__Impl rule__Statements__Group__4 )
            // InternalJsonQ.g:364:2: rule__Statements__Group__3__Impl rule__Statements__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Statements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__4();

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
    // $ANTLR end "rule__Statements__Group__3"


    // $ANTLR start "rule__Statements__Group__3__Impl"
    // InternalJsonQ.g:371:1: rule__Statements__Group__3__Impl : ( ( rule__Statements__Q1keyAssignment_3 ) ) ;
    public final void rule__Statements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:375:1: ( ( ( rule__Statements__Q1keyAssignment_3 ) ) )
            // InternalJsonQ.g:376:1: ( ( rule__Statements__Q1keyAssignment_3 ) )
            {
            // InternalJsonQ.g:376:1: ( ( rule__Statements__Q1keyAssignment_3 ) )
            // InternalJsonQ.g:377:2: ( rule__Statements__Q1keyAssignment_3 )
            {
             before(grammarAccess.getStatementsAccess().getQ1keyAssignment_3()); 
            // InternalJsonQ.g:378:2: ( rule__Statements__Q1keyAssignment_3 )
            // InternalJsonQ.g:378:3: rule__Statements__Q1keyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Q1keyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getQ1keyAssignment_3()); 

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
    // $ANTLR end "rule__Statements__Group__3__Impl"


    // $ANTLR start "rule__Statements__Group__4"
    // InternalJsonQ.g:386:1: rule__Statements__Group__4 : rule__Statements__Group__4__Impl rule__Statements__Group__5 ;
    public final void rule__Statements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:390:1: ( rule__Statements__Group__4__Impl rule__Statements__Group__5 )
            // InternalJsonQ.g:391:2: rule__Statements__Group__4__Impl rule__Statements__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Statements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__5();

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
    // $ANTLR end "rule__Statements__Group__4"


    // $ANTLR start "rule__Statements__Group__4__Impl"
    // InternalJsonQ.g:398:1: rule__Statements__Group__4__Impl : ( ( rule__Statements__Q1valAssignment_4 ) ) ;
    public final void rule__Statements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:402:1: ( ( ( rule__Statements__Q1valAssignment_4 ) ) )
            // InternalJsonQ.g:403:1: ( ( rule__Statements__Q1valAssignment_4 ) )
            {
            // InternalJsonQ.g:403:1: ( ( rule__Statements__Q1valAssignment_4 ) )
            // InternalJsonQ.g:404:2: ( rule__Statements__Q1valAssignment_4 )
            {
             before(grammarAccess.getStatementsAccess().getQ1valAssignment_4()); 
            // InternalJsonQ.g:405:2: ( rule__Statements__Q1valAssignment_4 )
            // InternalJsonQ.g:405:3: rule__Statements__Q1valAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Q1valAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getQ1valAssignment_4()); 

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
    // $ANTLR end "rule__Statements__Group__4__Impl"


    // $ANTLR start "rule__Statements__Group__5"
    // InternalJsonQ.g:413:1: rule__Statements__Group__5 : rule__Statements__Group__5__Impl rule__Statements__Group__6 ;
    public final void rule__Statements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:417:1: ( rule__Statements__Group__5__Impl rule__Statements__Group__6 )
            // InternalJsonQ.g:418:2: rule__Statements__Group__5__Impl rule__Statements__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Statements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__6();

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
    // $ANTLR end "rule__Statements__Group__5"


    // $ANTLR start "rule__Statements__Group__5__Impl"
    // InternalJsonQ.g:425:1: rule__Statements__Group__5__Impl : ( ( rule__Statements__ConnectorAssignment_5 )? ) ;
    public final void rule__Statements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:429:1: ( ( ( rule__Statements__ConnectorAssignment_5 )? ) )
            // InternalJsonQ.g:430:1: ( ( rule__Statements__ConnectorAssignment_5 )? )
            {
            // InternalJsonQ.g:430:1: ( ( rule__Statements__ConnectorAssignment_5 )? )
            // InternalJsonQ.g:431:2: ( rule__Statements__ConnectorAssignment_5 )?
            {
             before(grammarAccess.getStatementsAccess().getConnectorAssignment_5()); 
            // InternalJsonQ.g:432:2: ( rule__Statements__ConnectorAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=13)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonQ.g:432:3: rule__Statements__ConnectorAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__ConnectorAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementsAccess().getConnectorAssignment_5()); 

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
    // $ANTLR end "rule__Statements__Group__5__Impl"


    // $ANTLR start "rule__Statements__Group__6"
    // InternalJsonQ.g:440:1: rule__Statements__Group__6 : rule__Statements__Group__6__Impl ;
    public final void rule__Statements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:444:1: ( rule__Statements__Group__6__Impl )
            // InternalJsonQ.g:445:2: rule__Statements__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group__6__Impl();

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
    // $ANTLR end "rule__Statements__Group__6"


    // $ANTLR start "rule__Statements__Group__6__Impl"
    // InternalJsonQ.g:451:1: rule__Statements__Group__6__Impl : ( ( rule__Statements__Group_6__0 )? ) ;
    public final void rule__Statements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:455:1: ( ( ( rule__Statements__Group_6__0 )? ) )
            // InternalJsonQ.g:456:1: ( ( rule__Statements__Group_6__0 )? )
            {
            // InternalJsonQ.g:456:1: ( ( rule__Statements__Group_6__0 )? )
            // InternalJsonQ.g:457:2: ( rule__Statements__Group_6__0 )?
            {
             before(grammarAccess.getStatementsAccess().getGroup_6()); 
            // InternalJsonQ.g:458:2: ( rule__Statements__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=16)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonQ.g:458:3: rule__Statements__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementsAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Statements__Group__6__Impl"


    // $ANTLR start "rule__Statements__Group_6__0"
    // InternalJsonQ.g:467:1: rule__Statements__Group_6__0 : rule__Statements__Group_6__0__Impl rule__Statements__Group_6__1 ;
    public final void rule__Statements__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:471:1: ( rule__Statements__Group_6__0__Impl rule__Statements__Group_6__1 )
            // InternalJsonQ.g:472:2: rule__Statements__Group_6__0__Impl rule__Statements__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Statements__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group_6__1();

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
    // $ANTLR end "rule__Statements__Group_6__0"


    // $ANTLR start "rule__Statements__Group_6__0__Impl"
    // InternalJsonQ.g:479:1: rule__Statements__Group_6__0__Impl : ( ( rule__Statements__Q2keyAssignment_6_0 ) ) ;
    public final void rule__Statements__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:483:1: ( ( ( rule__Statements__Q2keyAssignment_6_0 ) ) )
            // InternalJsonQ.g:484:1: ( ( rule__Statements__Q2keyAssignment_6_0 ) )
            {
            // InternalJsonQ.g:484:1: ( ( rule__Statements__Q2keyAssignment_6_0 ) )
            // InternalJsonQ.g:485:2: ( rule__Statements__Q2keyAssignment_6_0 )
            {
             before(grammarAccess.getStatementsAccess().getQ2keyAssignment_6_0()); 
            // InternalJsonQ.g:486:2: ( rule__Statements__Q2keyAssignment_6_0 )
            // InternalJsonQ.g:486:3: rule__Statements__Q2keyAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Q2keyAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getQ2keyAssignment_6_0()); 

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
    // $ANTLR end "rule__Statements__Group_6__0__Impl"


    // $ANTLR start "rule__Statements__Group_6__1"
    // InternalJsonQ.g:494:1: rule__Statements__Group_6__1 : rule__Statements__Group_6__1__Impl ;
    public final void rule__Statements__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:498:1: ( rule__Statements__Group_6__1__Impl )
            // InternalJsonQ.g:499:2: rule__Statements__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_6__1__Impl();

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
    // $ANTLR end "rule__Statements__Group_6__1"


    // $ANTLR start "rule__Statements__Group_6__1__Impl"
    // InternalJsonQ.g:505:1: rule__Statements__Group_6__1__Impl : ( ( rule__Statements__Q2valAssignment_6_1 ) ) ;
    public final void rule__Statements__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:509:1: ( ( ( rule__Statements__Q2valAssignment_6_1 ) ) )
            // InternalJsonQ.g:510:1: ( ( rule__Statements__Q2valAssignment_6_1 ) )
            {
            // InternalJsonQ.g:510:1: ( ( rule__Statements__Q2valAssignment_6_1 ) )
            // InternalJsonQ.g:511:2: ( rule__Statements__Q2valAssignment_6_1 )
            {
             before(grammarAccess.getStatementsAccess().getQ2valAssignment_6_1()); 
            // InternalJsonQ.g:512:2: ( rule__Statements__Q2valAssignment_6_1 )
            // InternalJsonQ.g:512:3: rule__Statements__Q2valAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Q2valAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getQ2valAssignment_6_1()); 

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
    // $ANTLR end "rule__Statements__Group_6__1__Impl"


    // $ANTLR start "rule__JSONQueryModel__InputStatementAssignment"
    // InternalJsonQ.g:521:1: rule__JSONQueryModel__InputStatementAssignment : ( ruleStatements ) ;
    public final void rule__JSONQueryModel__InputStatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:525:1: ( ( ruleStatements ) )
            // InternalJsonQ.g:526:2: ( ruleStatements )
            {
            // InternalJsonQ.g:526:2: ( ruleStatements )
            // InternalJsonQ.g:527:3: ruleStatements
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


    // $ANTLR start "rule__Statements__OperationAssignment_1"
    // InternalJsonQ.g:536:1: rule__Statements__OperationAssignment_1 : ( ruleOperation ) ;
    public final void rule__Statements__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:540:1: ( ( ruleOperation ) )
            // InternalJsonQ.g:541:2: ( ruleOperation )
            {
            // InternalJsonQ.g:541:2: ( ruleOperation )
            // InternalJsonQ.g:542:3: ruleOperation
            {
             before(grammarAccess.getStatementsAccess().getOperationOperationEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getOperationOperationEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statements__OperationAssignment_1"


    // $ANTLR start "rule__Statements__Q1keyAssignment_3"
    // InternalJsonQ.g:551:1: rule__Statements__Q1keyAssignment_3 : ( ruleInputFieldSingle ) ;
    public final void rule__Statements__Q1keyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:555:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:556:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:556:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:557:3: ruleInputFieldSingle
            {
             before(grammarAccess.getStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFieldSingle();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getQ1keyInputFieldSingleEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Statements__Q1keyAssignment_3"


    // $ANTLR start "rule__Statements__Q1valAssignment_4"
    // InternalJsonQ.g:566:1: rule__Statements__Q1valAssignment_4 : ( ruleInputVal ) ;
    public final void rule__Statements__Q1valAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:570:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:571:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:571:2: ( ruleInputVal )
            // InternalJsonQ.g:572:3: ruleInputVal
            {
             before(grammarAccess.getStatementsAccess().getQ1valInputValParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInputVal();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getQ1valInputValParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Statements__Q1valAssignment_4"


    // $ANTLR start "rule__Statements__ConnectorAssignment_5"
    // InternalJsonQ.g:581:1: rule__Statements__ConnectorAssignment_5 : ( ( rule__Statements__ConnectorAlternatives_5_0 ) ) ;
    public final void rule__Statements__ConnectorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:585:1: ( ( ( rule__Statements__ConnectorAlternatives_5_0 ) ) )
            // InternalJsonQ.g:586:2: ( ( rule__Statements__ConnectorAlternatives_5_0 ) )
            {
            // InternalJsonQ.g:586:2: ( ( rule__Statements__ConnectorAlternatives_5_0 ) )
            // InternalJsonQ.g:587:3: ( rule__Statements__ConnectorAlternatives_5_0 )
            {
             before(grammarAccess.getStatementsAccess().getConnectorAlternatives_5_0()); 
            // InternalJsonQ.g:588:3: ( rule__Statements__ConnectorAlternatives_5_0 )
            // InternalJsonQ.g:588:4: rule__Statements__ConnectorAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__ConnectorAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getConnectorAlternatives_5_0()); 

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
    // $ANTLR end "rule__Statements__ConnectorAssignment_5"


    // $ANTLR start "rule__Statements__Q2keyAssignment_6_0"
    // InternalJsonQ.g:596:1: rule__Statements__Q2keyAssignment_6_0 : ( ruleInputFieldSingle ) ;
    public final void rule__Statements__Q2keyAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:600:1: ( ( ruleInputFieldSingle ) )
            // InternalJsonQ.g:601:2: ( ruleInputFieldSingle )
            {
            // InternalJsonQ.g:601:2: ( ruleInputFieldSingle )
            // InternalJsonQ.g:602:3: ruleInputFieldSingle
            {
             before(grammarAccess.getStatementsAccess().getQ2keyInputFieldSingleEnumRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInputFieldSingle();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getQ2keyInputFieldSingleEnumRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Statements__Q2keyAssignment_6_0"


    // $ANTLR start "rule__Statements__Q2valAssignment_6_1"
    // InternalJsonQ.g:611:1: rule__Statements__Q2valAssignment_6_1 : ( ruleInputVal ) ;
    public final void rule__Statements__Q2valAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:615:1: ( ( ruleInputVal ) )
            // InternalJsonQ.g:616:2: ( ruleInputVal )
            {
            // InternalJsonQ.g:616:2: ( ruleInputVal )
            // InternalJsonQ.g:617:3: ruleInputVal
            {
             before(grammarAccess.getStatementsAccess().getQ2valInputValParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputVal();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getQ2valInputValParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Statements__Q2valAssignment_6_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalJsonQ.g:626:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:630:1: ( ( RULE_STRING ) )
            // InternalJsonQ.g:631:2: ( RULE_STRING )
            {
            // InternalJsonQ.g:631:2: ( RULE_STRING )
            // InternalJsonQ.g:632:3: RULE_STRING
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
    // InternalJsonQ.g:641:1: rule__INTLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__INTLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonQ.g:645:1: ( ( RULE_INT ) )
            // InternalJsonQ.g:646:2: ( RULE_INT )
            {
            // InternalJsonQ.g:646:2: ( RULE_INT )
            // InternalJsonQ.g:647:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001F000L});

}