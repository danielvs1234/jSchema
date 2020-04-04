package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'minimum'", "'maximum'", "'num'", "'object'", "'require'", "'properties'", "'string'", "'number'", "'array'", "'boolean'", "'null'", "'name'", "'type'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJSchema.g"; }


    	private JSchemaGrammarAccess grammarAccess;

    	public void setGrammarAccess(JSchemaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalJSchema.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalJSchema.g:54:1: ( ruleModel EOF )
            // InternalJSchema.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJSchema.g:62:1: ruleModel : ( ruleObject ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:66:2: ( ( ruleObject ) )
            // InternalJSchema.g:67:2: ( ruleObject )
            {
            // InternalJSchema.g:67:2: ( ruleObject )
            // InternalJSchema.g:68:3: ruleObject
            {
             before(grammarAccess.getModelAccess().getObjectParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getModelAccess().getObjectParserRuleCall()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNumber"
    // InternalJSchema.g:78:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalJSchema.g:79:1: ( ruleNumber EOF )
            // InternalJSchema.g:80:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSchema.g:87:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:91:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalJSchema.g:92:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalJSchema.g:92:2: ( ( rule__Number__Alternatives ) )
            // InternalJSchema.g:93:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalJSchema.g:94:3: ( rule__Number__Alternatives )
            // InternalJSchema.g:94:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleObject"
    // InternalJSchema.g:103:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalJSchema.g:104:1: ( ruleObject EOF )
            // InternalJSchema.g:105:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalJSchema.g:112:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:116:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalJSchema.g:117:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalJSchema.g:117:2: ( ( rule__Object__Group__0 ) )
            // InternalJSchema.g:118:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalJSchema.g:119:3: ( rule__Object__Group__0 )
            // InternalJSchema.g:119:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleObjectRequireMinimumProperties"
    // InternalJSchema.g:128:1: entryRuleObjectRequireMinimumProperties : ruleObjectRequireMinimumProperties EOF ;
    public final void entryRuleObjectRequireMinimumProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:129:1: ( ruleObjectRequireMinimumProperties EOF )
            // InternalJSchema.g:130:1: ruleObjectRequireMinimumProperties EOF
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectRequireMinimumProperties();

            state._fsp--;

             after(grammarAccess.getObjectRequireMinimumPropertiesRule()); 
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
    // $ANTLR end "entryRuleObjectRequireMinimumProperties"


    // $ANTLR start "ruleObjectRequireMinimumProperties"
    // InternalJSchema.g:137:1: ruleObjectRequireMinimumProperties : ( ( rule__ObjectRequireMinimumProperties__Group__0 ) ) ;
    public final void ruleObjectRequireMinimumProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:141:2: ( ( ( rule__ObjectRequireMinimumProperties__Group__0 ) ) )
            // InternalJSchema.g:142:2: ( ( rule__ObjectRequireMinimumProperties__Group__0 ) )
            {
            // InternalJSchema.g:142:2: ( ( rule__ObjectRequireMinimumProperties__Group__0 ) )
            // InternalJSchema.g:143:3: ( rule__ObjectRequireMinimumProperties__Group__0 )
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getGroup()); 
            // InternalJSchema.g:144:3: ( rule__ObjectRequireMinimumProperties__Group__0 )
            // InternalJSchema.g:144:4: rule__ObjectRequireMinimumProperties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectRequireMinimumProperties"


    // $ANTLR start "entryRuleTypes"
    // InternalJSchema.g:153:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // InternalJSchema.g:154:1: ( ruleTypes EOF )
            // InternalJSchema.g:155:1: ruleTypes EOF
            {
             before(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getTypesRule()); 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalJSchema.g:162:1: ruleTypes : ( ( rule__Types__Alternatives ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:166:2: ( ( ( rule__Types__Alternatives ) ) )
            // InternalJSchema.g:167:2: ( ( rule__Types__Alternatives ) )
            {
            // InternalJSchema.g:167:2: ( ( rule__Types__Alternatives ) )
            // InternalJSchema.g:168:3: ( rule__Types__Alternatives )
            {
             before(grammarAccess.getTypesAccess().getAlternatives()); 
            // InternalJSchema.g:169:3: ( rule__Types__Alternatives )
            // InternalJSchema.g:169:4: rule__Types__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Types__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleProperties"
    // InternalJSchema.g:178:1: entryRuleProperties : ruleProperties EOF ;
    public final void entryRuleProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:179:1: ( ruleProperties EOF )
            // InternalJSchema.g:180:1: ruleProperties EOF
            {
             before(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getPropertiesRule()); 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalJSchema.g:187:1: ruleProperties : ( ( rule__Properties__Group__0 ) ) ;
    public final void ruleProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:191:2: ( ( ( rule__Properties__Group__0 ) ) )
            // InternalJSchema.g:192:2: ( ( rule__Properties__Group__0 ) )
            {
            // InternalJSchema.g:192:2: ( ( rule__Properties__Group__0 ) )
            // InternalJSchema.g:193:3: ( rule__Properties__Group__0 )
            {
             before(grammarAccess.getPropertiesAccess().getGroup()); 
            // InternalJSchema.g:194:3: ( rule__Properties__Group__0 )
            // InternalJSchema.g:194:4: rule__Properties__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertiesAccess().getGroup()); 

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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalJSchema.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalJSchema.g:204:1: ( ruleProperty EOF )
            // InternalJSchema.g:205:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJSchema.g:212:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:216:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalJSchema.g:217:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalJSchema.g:217:2: ( ( rule__Property__Group__0 ) )
            // InternalJSchema.g:218:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalJSchema.g:219:3: ( rule__Property__Group__0 )
            // InternalJSchema.g:219:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalJSchema.g:227:1: rule__Number__Alternatives : ( ( ( rule__Number__Group_0__0 ) ) | ( RULE_DOUBLE ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:231:1: ( ( ( rule__Number__Group_0__0 ) ) | ( RULE_DOUBLE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_DOUBLE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSchema.g:232:2: ( ( rule__Number__Group_0__0 ) )
                    {
                    // InternalJSchema.g:232:2: ( ( rule__Number__Group_0__0 ) )
                    // InternalJSchema.g:233:3: ( rule__Number__Group_0__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_0()); 
                    // InternalJSchema.g:234:3: ( rule__Number__Group_0__0 )
                    // InternalJSchema.g:234:4: rule__Number__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:238:2: ( RULE_DOUBLE )
                    {
                    // InternalJSchema.g:238:2: ( RULE_DOUBLE )
                    // InternalJSchema.g:239:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Alternatives_1"
    // InternalJSchema.g:248:1: rule__ObjectRequireMinimumProperties__Alternatives_1 : ( ( 'minimum' ) | ( 'maximum' ) );
    public final void rule__ObjectRequireMinimumProperties__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:252:1: ( ( 'minimum' ) | ( 'maximum' ) )
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
                    // InternalJSchema.g:253:2: ( 'minimum' )
                    {
                    // InternalJSchema.g:253:2: ( 'minimum' )
                    // InternalJSchema.g:254:3: 'minimum'
                    {
                     before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getMinimumKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getMinimumKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:259:2: ( 'maximum' )
                    {
                    // InternalJSchema.g:259:2: ( 'maximum' )
                    // InternalJSchema.g:260:3: 'maximum'
                    {
                     before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getMaximumKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getMaximumKeyword_1_1()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Alternatives_1"


    // $ANTLR start "rule__Types__Alternatives"
    // InternalJSchema.g:269:1: rule__Types__Alternatives : ( ( ( rule__Types__Group_0__0 ) ) | ( ( rule__Types__Group_1__0 ) ) | ( ( rule__Types__Group_2__0 ) ) | ( ( rule__Types__Group_3__0 ) ) | ( ( rule__Types__Group_4__0 ) ) | ( ( rule__Types__Group_5__0 ) ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:273:1: ( ( ( rule__Types__Group_0__0 ) ) | ( ( rule__Types__Group_1__0 ) ) | ( ( rule__Types__Group_2__0 ) ) | ( ( rule__Types__Group_3__0 ) ) | ( ( rule__Types__Group_4__0 ) ) | ( ( rule__Types__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:274:2: ( ( rule__Types__Group_0__0 ) )
                    {
                    // InternalJSchema.g:274:2: ( ( rule__Types__Group_0__0 ) )
                    // InternalJSchema.g:275:3: ( rule__Types__Group_0__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_0()); 
                    // InternalJSchema.g:276:3: ( rule__Types__Group_0__0 )
                    // InternalJSchema.g:276:4: rule__Types__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:280:2: ( ( rule__Types__Group_1__0 ) )
                    {
                    // InternalJSchema.g:280:2: ( ( rule__Types__Group_1__0 ) )
                    // InternalJSchema.g:281:3: ( rule__Types__Group_1__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_1()); 
                    // InternalJSchema.g:282:3: ( rule__Types__Group_1__0 )
                    // InternalJSchema.g:282:4: rule__Types__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:286:2: ( ( rule__Types__Group_2__0 ) )
                    {
                    // InternalJSchema.g:286:2: ( ( rule__Types__Group_2__0 ) )
                    // InternalJSchema.g:287:3: ( rule__Types__Group_2__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_2()); 
                    // InternalJSchema.g:288:3: ( rule__Types__Group_2__0 )
                    // InternalJSchema.g:288:4: rule__Types__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:292:2: ( ( rule__Types__Group_3__0 ) )
                    {
                    // InternalJSchema.g:292:2: ( ( rule__Types__Group_3__0 ) )
                    // InternalJSchema.g:293:3: ( rule__Types__Group_3__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_3()); 
                    // InternalJSchema.g:294:3: ( rule__Types__Group_3__0 )
                    // InternalJSchema.g:294:4: rule__Types__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:298:2: ( ( rule__Types__Group_4__0 ) )
                    {
                    // InternalJSchema.g:298:2: ( ( rule__Types__Group_4__0 ) )
                    // InternalJSchema.g:299:3: ( rule__Types__Group_4__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_4()); 
                    // InternalJSchema.g:300:3: ( rule__Types__Group_4__0 )
                    // InternalJSchema.g:300:4: rule__Types__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:304:2: ( ( rule__Types__Group_5__0 ) )
                    {
                    // InternalJSchema.g:304:2: ( ( rule__Types__Group_5__0 ) )
                    // InternalJSchema.g:305:3: ( rule__Types__Group_5__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_5()); 
                    // InternalJSchema.g:306:3: ( rule__Types__Group_5__0 )
                    // InternalJSchema.g:306:4: rule__Types__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Types__Alternatives"


    // $ANTLR start "rule__Number__Group_0__0"
    // InternalJSchema.g:314:1: rule__Number__Group_0__0 : rule__Number__Group_0__0__Impl rule__Number__Group_0__1 ;
    public final void rule__Number__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:318:1: ( rule__Number__Group_0__0__Impl rule__Number__Group_0__1 )
            // InternalJSchema.g:319:2: rule__Number__Group_0__0__Impl rule__Number__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Number__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_0__1();

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
    // $ANTLR end "rule__Number__Group_0__0"


    // $ANTLR start "rule__Number__Group_0__0__Impl"
    // InternalJSchema.g:326:1: rule__Number__Group_0__0__Impl : ( 'num' ) ;
    public final void rule__Number__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:330:1: ( ( 'num' ) )
            // InternalJSchema.g:331:1: ( 'num' )
            {
            // InternalJSchema.g:331:1: ( 'num' )
            // InternalJSchema.g:332:2: 'num'
            {
             before(grammarAccess.getNumberAccess().getNumKeyword_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNumKeyword_0_0()); 

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
    // $ANTLR end "rule__Number__Group_0__0__Impl"


    // $ANTLR start "rule__Number__Group_0__1"
    // InternalJSchema.g:341:1: rule__Number__Group_0__1 : rule__Number__Group_0__1__Impl ;
    public final void rule__Number__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:345:1: ( rule__Number__Group_0__1__Impl )
            // InternalJSchema.g:346:2: rule__Number__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_0__1__Impl();

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
    // $ANTLR end "rule__Number__Group_0__1"


    // $ANTLR start "rule__Number__Group_0__1__Impl"
    // InternalJSchema.g:352:1: rule__Number__Group_0__1__Impl : ( ( rule__Number__ValueAssignment_0_1 ) ) ;
    public final void rule__Number__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:356:1: ( ( ( rule__Number__ValueAssignment_0_1 ) ) )
            // InternalJSchema.g:357:1: ( ( rule__Number__ValueAssignment_0_1 ) )
            {
            // InternalJSchema.g:357:1: ( ( rule__Number__ValueAssignment_0_1 ) )
            // InternalJSchema.g:358:2: ( rule__Number__ValueAssignment_0_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_0_1()); 
            // InternalJSchema.g:359:2: ( rule__Number__ValueAssignment_0_1 )
            // InternalJSchema.g:359:3: rule__Number__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Number__Group_0__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalJSchema.g:368:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:372:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalJSchema.g:373:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

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
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalJSchema.g:380:1: rule__Object__Group__0__Impl : ( 'object' ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:384:1: ( ( 'object' ) )
            // InternalJSchema.g:385:1: ( 'object' )
            {
            // InternalJSchema.g:385:1: ( 'object' )
            // InternalJSchema.g:386:2: 'object'
            {
             before(grammarAccess.getObjectAccess().getObjectKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjectKeyword_0()); 

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
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalJSchema.g:395:1: rule__Object__Group__1 : rule__Object__Group__1__Impl ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:399:1: ( rule__Object__Group__1__Impl )
            // InternalJSchema.g:400:2: rule__Object__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__1__Impl();

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
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalJSchema.g:406:1: rule__Object__Group__1__Impl : ( ( ruleObjectRequireMinimumProperties )? ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:410:1: ( ( ( ruleObjectRequireMinimumProperties )? ) )
            // InternalJSchema.g:411:1: ( ( ruleObjectRequireMinimumProperties )? )
            {
            // InternalJSchema.g:411:1: ( ( ruleObjectRequireMinimumProperties )? )
            // InternalJSchema.g:412:2: ( ruleObjectRequireMinimumProperties )?
            {
             before(grammarAccess.getObjectAccess().getObjectRequireMinimumPropertiesParserRuleCall_1()); 
            // InternalJSchema.g:413:2: ( ruleObjectRequireMinimumProperties )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:413:3: ruleObjectRequireMinimumProperties
                    {
                    pushFollow(FOLLOW_2);
                    ruleObjectRequireMinimumProperties();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getObjectRequireMinimumPropertiesParserRuleCall_1()); 

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
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__0"
    // InternalJSchema.g:422:1: rule__ObjectRequireMinimumProperties__Group__0 : rule__ObjectRequireMinimumProperties__Group__0__Impl rule__ObjectRequireMinimumProperties__Group__1 ;
    public final void rule__ObjectRequireMinimumProperties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:426:1: ( rule__ObjectRequireMinimumProperties__Group__0__Impl rule__ObjectRequireMinimumProperties__Group__1 )
            // InternalJSchema.g:427:2: rule__ObjectRequireMinimumProperties__Group__0__Impl rule__ObjectRequireMinimumProperties__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectRequireMinimumProperties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Group__1();

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__0"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__0__Impl"
    // InternalJSchema.g:434:1: rule__ObjectRequireMinimumProperties__Group__0__Impl : ( 'require' ) ;
    public final void rule__ObjectRequireMinimumProperties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:438:1: ( ( 'require' ) )
            // InternalJSchema.g:439:1: ( 'require' )
            {
            // InternalJSchema.g:439:1: ( 'require' )
            // InternalJSchema.g:440:2: 'require'
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getRequireKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getRequireKeyword_0()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__0__Impl"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__1"
    // InternalJSchema.g:449:1: rule__ObjectRequireMinimumProperties__Group__1 : rule__ObjectRequireMinimumProperties__Group__1__Impl rule__ObjectRequireMinimumProperties__Group__2 ;
    public final void rule__ObjectRequireMinimumProperties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:453:1: ( rule__ObjectRequireMinimumProperties__Group__1__Impl rule__ObjectRequireMinimumProperties__Group__2 )
            // InternalJSchema.g:454:2: rule__ObjectRequireMinimumProperties__Group__1__Impl rule__ObjectRequireMinimumProperties__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ObjectRequireMinimumProperties__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Group__2();

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__1"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__1__Impl"
    // InternalJSchema.g:461:1: rule__ObjectRequireMinimumProperties__Group__1__Impl : ( ( rule__ObjectRequireMinimumProperties__Alternatives_1 ) ) ;
    public final void rule__ObjectRequireMinimumProperties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:465:1: ( ( ( rule__ObjectRequireMinimumProperties__Alternatives_1 ) ) )
            // InternalJSchema.g:466:1: ( ( rule__ObjectRequireMinimumProperties__Alternatives_1 ) )
            {
            // InternalJSchema.g:466:1: ( ( rule__ObjectRequireMinimumProperties__Alternatives_1 ) )
            // InternalJSchema.g:467:2: ( rule__ObjectRequireMinimumProperties__Alternatives_1 )
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getAlternatives_1()); 
            // InternalJSchema.g:468:2: ( rule__ObjectRequireMinimumProperties__Alternatives_1 )
            // InternalJSchema.g:468:3: rule__ObjectRequireMinimumProperties__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__1__Impl"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__2"
    // InternalJSchema.g:476:1: rule__ObjectRequireMinimumProperties__Group__2 : rule__ObjectRequireMinimumProperties__Group__2__Impl rule__ObjectRequireMinimumProperties__Group__3 ;
    public final void rule__ObjectRequireMinimumProperties__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:480:1: ( rule__ObjectRequireMinimumProperties__Group__2__Impl rule__ObjectRequireMinimumProperties__Group__3 )
            // InternalJSchema.g:481:2: rule__ObjectRequireMinimumProperties__Group__2__Impl rule__ObjectRequireMinimumProperties__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ObjectRequireMinimumProperties__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Group__3();

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__2"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__2__Impl"
    // InternalJSchema.g:488:1: rule__ObjectRequireMinimumProperties__Group__2__Impl : ( ruleNumber ) ;
    public final void rule__ObjectRequireMinimumProperties__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:492:1: ( ( ruleNumber ) )
            // InternalJSchema.g:493:1: ( ruleNumber )
            {
            // InternalJSchema.g:493:1: ( ruleNumber )
            // InternalJSchema.g:494:2: ruleNumber
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getNumberParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getNumberParserRuleCall_2()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__2__Impl"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__3"
    // InternalJSchema.g:503:1: rule__ObjectRequireMinimumProperties__Group__3 : rule__ObjectRequireMinimumProperties__Group__3__Impl rule__ObjectRequireMinimumProperties__Group__4 ;
    public final void rule__ObjectRequireMinimumProperties__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:507:1: ( rule__ObjectRequireMinimumProperties__Group__3__Impl rule__ObjectRequireMinimumProperties__Group__4 )
            // InternalJSchema.g:508:2: rule__ObjectRequireMinimumProperties__Group__3__Impl rule__ObjectRequireMinimumProperties__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ObjectRequireMinimumProperties__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Group__4();

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__3"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__3__Impl"
    // InternalJSchema.g:515:1: rule__ObjectRequireMinimumProperties__Group__3__Impl : ( 'properties' ) ;
    public final void rule__ObjectRequireMinimumProperties__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:519:1: ( ( 'properties' ) )
            // InternalJSchema.g:520:1: ( 'properties' )
            {
            // InternalJSchema.g:520:1: ( 'properties' )
            // InternalJSchema.g:521:2: 'properties'
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesKeyword_3()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__3__Impl"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__4"
    // InternalJSchema.g:530:1: rule__ObjectRequireMinimumProperties__Group__4 : rule__ObjectRequireMinimumProperties__Group__4__Impl ;
    public final void rule__ObjectRequireMinimumProperties__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:534:1: ( rule__ObjectRequireMinimumProperties__Group__4__Impl )
            // InternalJSchema.g:535:2: rule__ObjectRequireMinimumProperties__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__Group__4__Impl();

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__4"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__Group__4__Impl"
    // InternalJSchema.g:541:1: rule__ObjectRequireMinimumProperties__Group__4__Impl : ( ( rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 ) ) ;
    public final void rule__ObjectRequireMinimumProperties__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:545:1: ( ( ( rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 ) ) )
            // InternalJSchema.g:546:1: ( ( rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 ) )
            {
            // InternalJSchema.g:546:1: ( ( rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 ) )
            // InternalJSchema.g:547:2: ( rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 )
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesAssignment_4()); 
            // InternalJSchema.g:548:2: ( rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 )
            // InternalJSchema.g:548:3: rule__ObjectRequireMinimumProperties__PropertiesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ObjectRequireMinimumProperties__PropertiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesAssignment_4()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__Group__4__Impl"


    // $ANTLR start "rule__Types__Group_0__0"
    // InternalJSchema.g:557:1: rule__Types__Group_0__0 : rule__Types__Group_0__0__Impl rule__Types__Group_0__1 ;
    public final void rule__Types__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:561:1: ( rule__Types__Group_0__0__Impl rule__Types__Group_0__1 )
            // InternalJSchema.g:562:2: rule__Types__Group_0__0__Impl rule__Types__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Types__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_0__1();

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
    // $ANTLR end "rule__Types__Group_0__0"


    // $ANTLR start "rule__Types__Group_0__0__Impl"
    // InternalJSchema.g:569:1: rule__Types__Group_0__0__Impl : ( () ) ;
    public final void rule__Types__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:573:1: ( ( () ) )
            // InternalJSchema.g:574:1: ( () )
            {
            // InternalJSchema.g:574:1: ( () )
            // InternalJSchema.g:575:2: ()
            {
             before(grammarAccess.getTypesAccess().getObjectAction_0_0()); 
            // InternalJSchema.g:576:2: ()
            // InternalJSchema.g:576:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getObjectAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_0__0__Impl"


    // $ANTLR start "rule__Types__Group_0__1"
    // InternalJSchema.g:584:1: rule__Types__Group_0__1 : rule__Types__Group_0__1__Impl ;
    public final void rule__Types__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:588:1: ( rule__Types__Group_0__1__Impl )
            // InternalJSchema.g:589:2: rule__Types__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_0__1__Impl();

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
    // $ANTLR end "rule__Types__Group_0__1"


    // $ANTLR start "rule__Types__Group_0__1__Impl"
    // InternalJSchema.g:595:1: rule__Types__Group_0__1__Impl : ( 'object' ) ;
    public final void rule__Types__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:599:1: ( ( 'object' ) )
            // InternalJSchema.g:600:1: ( 'object' )
            {
            // InternalJSchema.g:600:1: ( 'object' )
            // InternalJSchema.g:601:2: 'object'
            {
             before(grammarAccess.getTypesAccess().getObjectKeyword_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getObjectKeyword_0_1()); 

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
    // $ANTLR end "rule__Types__Group_0__1__Impl"


    // $ANTLR start "rule__Types__Group_1__0"
    // InternalJSchema.g:611:1: rule__Types__Group_1__0 : rule__Types__Group_1__0__Impl rule__Types__Group_1__1 ;
    public final void rule__Types__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:615:1: ( rule__Types__Group_1__0__Impl rule__Types__Group_1__1 )
            // InternalJSchema.g:616:2: rule__Types__Group_1__0__Impl rule__Types__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Types__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_1__1();

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
    // $ANTLR end "rule__Types__Group_1__0"


    // $ANTLR start "rule__Types__Group_1__0__Impl"
    // InternalJSchema.g:623:1: rule__Types__Group_1__0__Impl : ( () ) ;
    public final void rule__Types__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:627:1: ( ( () ) )
            // InternalJSchema.g:628:1: ( () )
            {
            // InternalJSchema.g:628:1: ( () )
            // InternalJSchema.g:629:2: ()
            {
             before(grammarAccess.getTypesAccess().getSTRINGAction_1_0()); 
            // InternalJSchema.g:630:2: ()
            // InternalJSchema.g:630:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getSTRINGAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_1__0__Impl"


    // $ANTLR start "rule__Types__Group_1__1"
    // InternalJSchema.g:638:1: rule__Types__Group_1__1 : rule__Types__Group_1__1__Impl ;
    public final void rule__Types__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:642:1: ( rule__Types__Group_1__1__Impl )
            // InternalJSchema.g:643:2: rule__Types__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_1__1__Impl();

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
    // $ANTLR end "rule__Types__Group_1__1"


    // $ANTLR start "rule__Types__Group_1__1__Impl"
    // InternalJSchema.g:649:1: rule__Types__Group_1__1__Impl : ( 'string' ) ;
    public final void rule__Types__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:653:1: ( ( 'string' ) )
            // InternalJSchema.g:654:1: ( 'string' )
            {
            // InternalJSchema.g:654:1: ( 'string' )
            // InternalJSchema.g:655:2: 'string'
            {
             before(grammarAccess.getTypesAccess().getStringKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getStringKeyword_1_1()); 

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
    // $ANTLR end "rule__Types__Group_1__1__Impl"


    // $ANTLR start "rule__Types__Group_2__0"
    // InternalJSchema.g:665:1: rule__Types__Group_2__0 : rule__Types__Group_2__0__Impl rule__Types__Group_2__1 ;
    public final void rule__Types__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:669:1: ( rule__Types__Group_2__0__Impl rule__Types__Group_2__1 )
            // InternalJSchema.g:670:2: rule__Types__Group_2__0__Impl rule__Types__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Types__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_2__1();

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
    // $ANTLR end "rule__Types__Group_2__0"


    // $ANTLR start "rule__Types__Group_2__0__Impl"
    // InternalJSchema.g:677:1: rule__Types__Group_2__0__Impl : ( () ) ;
    public final void rule__Types__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:681:1: ( ( () ) )
            // InternalJSchema.g:682:1: ( () )
            {
            // InternalJSchema.g:682:1: ( () )
            // InternalJSchema.g:683:2: ()
            {
             before(grammarAccess.getTypesAccess().getNumberAction_2_0()); 
            // InternalJSchema.g:684:2: ()
            // InternalJSchema.g:684:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getNumberAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_2__0__Impl"


    // $ANTLR start "rule__Types__Group_2__1"
    // InternalJSchema.g:692:1: rule__Types__Group_2__1 : rule__Types__Group_2__1__Impl ;
    public final void rule__Types__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:696:1: ( rule__Types__Group_2__1__Impl )
            // InternalJSchema.g:697:2: rule__Types__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_2__1__Impl();

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
    // $ANTLR end "rule__Types__Group_2__1"


    // $ANTLR start "rule__Types__Group_2__1__Impl"
    // InternalJSchema.g:703:1: rule__Types__Group_2__1__Impl : ( 'number' ) ;
    public final void rule__Types__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:707:1: ( ( 'number' ) )
            // InternalJSchema.g:708:1: ( 'number' )
            {
            // InternalJSchema.g:708:1: ( 'number' )
            // InternalJSchema.g:709:2: 'number'
            {
             before(grammarAccess.getTypesAccess().getNumberKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getNumberKeyword_2_1()); 

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
    // $ANTLR end "rule__Types__Group_2__1__Impl"


    // $ANTLR start "rule__Types__Group_3__0"
    // InternalJSchema.g:719:1: rule__Types__Group_3__0 : rule__Types__Group_3__0__Impl rule__Types__Group_3__1 ;
    public final void rule__Types__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:723:1: ( rule__Types__Group_3__0__Impl rule__Types__Group_3__1 )
            // InternalJSchema.g:724:2: rule__Types__Group_3__0__Impl rule__Types__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Types__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_3__1();

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
    // $ANTLR end "rule__Types__Group_3__0"


    // $ANTLR start "rule__Types__Group_3__0__Impl"
    // InternalJSchema.g:731:1: rule__Types__Group_3__0__Impl : ( () ) ;
    public final void rule__Types__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:735:1: ( ( () ) )
            // InternalJSchema.g:736:1: ( () )
            {
            // InternalJSchema.g:736:1: ( () )
            // InternalJSchema.g:737:2: ()
            {
             before(grammarAccess.getTypesAccess().getArrayAction_3_0()); 
            // InternalJSchema.g:738:2: ()
            // InternalJSchema.g:738:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getArrayAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_3__0__Impl"


    // $ANTLR start "rule__Types__Group_3__1"
    // InternalJSchema.g:746:1: rule__Types__Group_3__1 : rule__Types__Group_3__1__Impl ;
    public final void rule__Types__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:750:1: ( rule__Types__Group_3__1__Impl )
            // InternalJSchema.g:751:2: rule__Types__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_3__1__Impl();

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
    // $ANTLR end "rule__Types__Group_3__1"


    // $ANTLR start "rule__Types__Group_3__1__Impl"
    // InternalJSchema.g:757:1: rule__Types__Group_3__1__Impl : ( 'array' ) ;
    public final void rule__Types__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:761:1: ( ( 'array' ) )
            // InternalJSchema.g:762:1: ( 'array' )
            {
            // InternalJSchema.g:762:1: ( 'array' )
            // InternalJSchema.g:763:2: 'array'
            {
             before(grammarAccess.getTypesAccess().getArrayKeyword_3_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getArrayKeyword_3_1()); 

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
    // $ANTLR end "rule__Types__Group_3__1__Impl"


    // $ANTLR start "rule__Types__Group_4__0"
    // InternalJSchema.g:773:1: rule__Types__Group_4__0 : rule__Types__Group_4__0__Impl rule__Types__Group_4__1 ;
    public final void rule__Types__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:777:1: ( rule__Types__Group_4__0__Impl rule__Types__Group_4__1 )
            // InternalJSchema.g:778:2: rule__Types__Group_4__0__Impl rule__Types__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Types__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_4__1();

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
    // $ANTLR end "rule__Types__Group_4__0"


    // $ANTLR start "rule__Types__Group_4__0__Impl"
    // InternalJSchema.g:785:1: rule__Types__Group_4__0__Impl : ( () ) ;
    public final void rule__Types__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:789:1: ( ( () ) )
            // InternalJSchema.g:790:1: ( () )
            {
            // InternalJSchema.g:790:1: ( () )
            // InternalJSchema.g:791:2: ()
            {
             before(grammarAccess.getTypesAccess().getBooleanAction_4_0()); 
            // InternalJSchema.g:792:2: ()
            // InternalJSchema.g:792:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getBooleanAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_4__0__Impl"


    // $ANTLR start "rule__Types__Group_4__1"
    // InternalJSchema.g:800:1: rule__Types__Group_4__1 : rule__Types__Group_4__1__Impl ;
    public final void rule__Types__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:804:1: ( rule__Types__Group_4__1__Impl )
            // InternalJSchema.g:805:2: rule__Types__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_4__1__Impl();

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
    // $ANTLR end "rule__Types__Group_4__1"


    // $ANTLR start "rule__Types__Group_4__1__Impl"
    // InternalJSchema.g:811:1: rule__Types__Group_4__1__Impl : ( 'boolean' ) ;
    public final void rule__Types__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:815:1: ( ( 'boolean' ) )
            // InternalJSchema.g:816:1: ( 'boolean' )
            {
            // InternalJSchema.g:816:1: ( 'boolean' )
            // InternalJSchema.g:817:2: 'boolean'
            {
             before(grammarAccess.getTypesAccess().getBooleanKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getBooleanKeyword_4_1()); 

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
    // $ANTLR end "rule__Types__Group_4__1__Impl"


    // $ANTLR start "rule__Types__Group_5__0"
    // InternalJSchema.g:827:1: rule__Types__Group_5__0 : rule__Types__Group_5__0__Impl rule__Types__Group_5__1 ;
    public final void rule__Types__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:831:1: ( rule__Types__Group_5__0__Impl rule__Types__Group_5__1 )
            // InternalJSchema.g:832:2: rule__Types__Group_5__0__Impl rule__Types__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Types__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_5__1();

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
    // $ANTLR end "rule__Types__Group_5__0"


    // $ANTLR start "rule__Types__Group_5__0__Impl"
    // InternalJSchema.g:839:1: rule__Types__Group_5__0__Impl : ( () ) ;
    public final void rule__Types__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:843:1: ( ( () ) )
            // InternalJSchema.g:844:1: ( () )
            {
            // InternalJSchema.g:844:1: ( () )
            // InternalJSchema.g:845:2: ()
            {
             before(grammarAccess.getTypesAccess().getNullAction_5_0()); 
            // InternalJSchema.g:846:2: ()
            // InternalJSchema.g:846:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getNullAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Group_5__0__Impl"


    // $ANTLR start "rule__Types__Group_5__1"
    // InternalJSchema.g:854:1: rule__Types__Group_5__1 : rule__Types__Group_5__1__Impl ;
    public final void rule__Types__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:858:1: ( rule__Types__Group_5__1__Impl )
            // InternalJSchema.g:859:2: rule__Types__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_5__1__Impl();

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
    // $ANTLR end "rule__Types__Group_5__1"


    // $ANTLR start "rule__Types__Group_5__1__Impl"
    // InternalJSchema.g:865:1: rule__Types__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__Types__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:869:1: ( ( 'null' ) )
            // InternalJSchema.g:870:1: ( 'null' )
            {
            // InternalJSchema.g:870:1: ( 'null' )
            // InternalJSchema.g:871:2: 'null'
            {
             before(grammarAccess.getTypesAccess().getNullKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getNullKeyword_5_1()); 

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
    // $ANTLR end "rule__Types__Group_5__1__Impl"


    // $ANTLR start "rule__Properties__Group__0"
    // InternalJSchema.g:881:1: rule__Properties__Group__0 : rule__Properties__Group__0__Impl rule__Properties__Group__1 ;
    public final void rule__Properties__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:885:1: ( rule__Properties__Group__0__Impl rule__Properties__Group__1 )
            // InternalJSchema.g:886:2: rule__Properties__Group__0__Impl rule__Properties__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Properties__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Properties__Group__1();

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
    // $ANTLR end "rule__Properties__Group__0"


    // $ANTLR start "rule__Properties__Group__0__Impl"
    // InternalJSchema.g:893:1: rule__Properties__Group__0__Impl : ( () ) ;
    public final void rule__Properties__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:897:1: ( ( () ) )
            // InternalJSchema.g:898:1: ( () )
            {
            // InternalJSchema.g:898:1: ( () )
            // InternalJSchema.g:899:2: ()
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAction_0()); 
            // InternalJSchema.g:900:2: ()
            // InternalJSchema.g:900:3: 
            {
            }

             after(grammarAccess.getPropertiesAccess().getPropertiesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Properties__Group__0__Impl"


    // $ANTLR start "rule__Properties__Group__1"
    // InternalJSchema.g:908:1: rule__Properties__Group__1 : rule__Properties__Group__1__Impl ;
    public final void rule__Properties__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:912:1: ( rule__Properties__Group__1__Impl )
            // InternalJSchema.g:913:2: rule__Properties__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Properties__Group__1__Impl();

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
    // $ANTLR end "rule__Properties__Group__1"


    // $ANTLR start "rule__Properties__Group__1__Impl"
    // InternalJSchema.g:919:1: rule__Properties__Group__1__Impl : ( ( rule__Properties__PropertiesAssignment_1 )* ) ;
    public final void rule__Properties__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:923:1: ( ( ( rule__Properties__PropertiesAssignment_1 )* ) )
            // InternalJSchema.g:924:1: ( ( rule__Properties__PropertiesAssignment_1 )* )
            {
            // InternalJSchema.g:924:1: ( ( rule__Properties__PropertiesAssignment_1 )* )
            // InternalJSchema.g:925:2: ( rule__Properties__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesAssignment_1()); 
            // InternalJSchema.g:926:2: ( rule__Properties__PropertiesAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJSchema.g:926:3: rule__Properties__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Properties__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPropertiesAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__Properties__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalJSchema.g:935:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:939:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalJSchema.g:940:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalJSchema.g:947:1: rule__Property__Group__0__Impl : ( 'name' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:951:1: ( ( 'name' ) )
            // InternalJSchema.g:952:1: ( 'name' )
            {
            // InternalJSchema.g:952:1: ( 'name' )
            // InternalJSchema.g:953:2: 'name'
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalJSchema.g:962:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:966:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalJSchema.g:967:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalJSchema.g:974:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:978:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalJSchema.g:979:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalJSchema.g:979:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalJSchema.g:980:2: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalJSchema.g:981:2: ( rule__Property__NameAssignment_1 )
            // InternalJSchema.g:981:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalJSchema.g:989:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:993:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalJSchema.g:994:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalJSchema.g:1001:1: rule__Property__Group__2__Impl : ( 'type' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1005:1: ( ( 'type' ) )
            // InternalJSchema.g:1006:1: ( 'type' )
            {
            // InternalJSchema.g:1006:1: ( 'type' )
            // InternalJSchema.g:1007:2: 'type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalJSchema.g:1016:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1020:1: ( rule__Property__Group__3__Impl )
            // InternalJSchema.g:1021:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__3__Impl();

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalJSchema.g:1027:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1031:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // InternalJSchema.g:1032:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // InternalJSchema.g:1032:1: ( ( rule__Property__TypeAssignment_3 ) )
            // InternalJSchema.g:1033:2: ( rule__Property__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            // InternalJSchema.g:1034:2: ( rule__Property__TypeAssignment_3 )
            // InternalJSchema.g:1034:3: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Number__ValueAssignment_0_1"
    // InternalJSchema.g:1043:1: rule__Number__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1047:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1048:2: ( RULE_INT )
            {
            // InternalJSchema.g:1048:2: ( RULE_INT )
            // InternalJSchema.g:1049:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Number__ValueAssignment_0_1"


    // $ANTLR start "rule__ObjectRequireMinimumProperties__PropertiesAssignment_4"
    // InternalJSchema.g:1058:1: rule__ObjectRequireMinimumProperties__PropertiesAssignment_4 : ( ruleProperties ) ;
    public final void rule__ObjectRequireMinimumProperties__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1062:1: ( ( ruleProperties ) )
            // InternalJSchema.g:1063:2: ( ruleProperties )
            {
            // InternalJSchema.g:1063:2: ( ruleProperties )
            // InternalJSchema.g:1064:3: ruleProperties
            {
             before(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesPropertiesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProperties();

            state._fsp--;

             after(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesPropertiesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ObjectRequireMinimumProperties__PropertiesAssignment_4"


    // $ANTLR start "rule__Properties__PropertiesAssignment_1"
    // InternalJSchema.g:1073:1: rule__Properties__PropertiesAssignment_1 : ( ruleProperty ) ;
    public final void rule__Properties__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1077:1: ( ( ruleProperty ) )
            // InternalJSchema.g:1078:2: ( ruleProperty )
            {
            // InternalJSchema.g:1078:2: ( ruleProperty )
            // InternalJSchema.g:1079:3: ruleProperty
            {
             before(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Properties__PropertiesAssignment_1"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalJSchema.g:1088:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1092:1: ( ( RULE_ID ) )
            // InternalJSchema.g:1093:2: ( RULE_ID )
            {
            // InternalJSchema.g:1093:2: ( RULE_ID )
            // InternalJSchema.g:1094:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__TypeAssignment_3"
    // InternalJSchema.g:1103:1: rule__Property__TypeAssignment_3 : ( ruleTypes ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1107:1: ( ( ruleTypes ) )
            // InternalJSchema.g:1108:2: ( ruleTypes )
            {
            // InternalJSchema.g:1108:2: ( ruleTypes )
            // InternalJSchema.g:1109:3: ruleTypes
            {
             before(grammarAccess.getPropertyAccess().getTypeTypesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000F90000L});

}