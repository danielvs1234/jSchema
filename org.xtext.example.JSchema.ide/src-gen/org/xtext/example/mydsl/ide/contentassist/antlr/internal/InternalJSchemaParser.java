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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\"date-time\"'", "'\"time\"'", "'\"date\"'", "'\"email\"'", "'\"idn-email\"'", "'\"hostname\"'", "'\"ipv4\"'", "'\"ipv6\"'", "'\"uri\"'", "'\"uri-reference\"'", "'\"iri\"'", "'\"iri-reference\"'", "'\"uri-template\"'", "'\"json-pointer\"'", "'\"relative-json-pointer\"'", "'\"regex\"'", "'.'", "'{'", "'}'", "'includes'", "'with'", "';'", "','", "'String'", "'num'", "'length'", "'pattern'", "'format'", "'-'", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
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
    // InternalJSchema.g:62:1: ruleModel : ( ( rule__Model__AbstractObjectAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:66:2: ( ( ( rule__Model__AbstractObjectAssignment )* ) )
            // InternalJSchema.g:67:2: ( ( rule__Model__AbstractObjectAssignment )* )
            {
            // InternalJSchema.g:67:2: ( ( rule__Model__AbstractObjectAssignment )* )
            // InternalJSchema.g:68:3: ( rule__Model__AbstractObjectAssignment )*
            {
             before(grammarAccess.getModelAccess().getAbstractObjectAssignment()); 
            // InternalJSchema.g:69:3: ( rule__Model__AbstractObjectAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=34 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJSchema.g:69:4: rule__Model__AbstractObjectAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AbstractObjectAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAbstractObjectAssignment()); 

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
    // InternalJSchema.g:87:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:91:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalJSchema.g:92:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalJSchema.g:92:2: ( ( rule__Number__Group__0 ) )
            // InternalJSchema.g:93:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalJSchema.g:94:3: ( rule__Number__Group__0 )
            // InternalJSchema.g:94:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAbstractObject"
    // InternalJSchema.g:103:1: entryRuleAbstractObject : ruleAbstractObject EOF ;
    public final void entryRuleAbstractObject() throws RecognitionException {
        try {
            // InternalJSchema.g:104:1: ( ruleAbstractObject EOF )
            // InternalJSchema.g:105:1: ruleAbstractObject EOF
            {
             before(grammarAccess.getAbstractObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractObject();

            state._fsp--;

             after(grammarAccess.getAbstractObjectRule()); 
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
    // $ANTLR end "entryRuleAbstractObject"


    // $ANTLR start "ruleAbstractObject"
    // InternalJSchema.g:112:1: ruleAbstractObject : ( ( rule__AbstractObject__Alternatives ) ) ;
    public final void ruleAbstractObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:116:2: ( ( ( rule__AbstractObject__Alternatives ) ) )
            // InternalJSchema.g:117:2: ( ( rule__AbstractObject__Alternatives ) )
            {
            // InternalJSchema.g:117:2: ( ( rule__AbstractObject__Alternatives ) )
            // InternalJSchema.g:118:3: ( rule__AbstractObject__Alternatives )
            {
             before(grammarAccess.getAbstractObjectAccess().getAlternatives()); 
            // InternalJSchema.g:119:3: ( rule__AbstractObject__Alternatives )
            // InternalJSchema.g:119:4: rule__AbstractObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractObject"


    // $ANTLR start "entryRuleObject"
    // InternalJSchema.g:128:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalJSchema.g:129:1: ( ruleObject EOF )
            // InternalJSchema.g:130:1: ruleObject EOF
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
    // InternalJSchema.g:137:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:141:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalJSchema.g:142:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalJSchema.g:142:2: ( ( rule__Object__Group__0 ) )
            // InternalJSchema.g:143:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalJSchema.g:144:3: ( rule__Object__Group__0 )
            // InternalJSchema.g:144:4: rule__Object__Group__0
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


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:153:1: entryRulePrimitiveObject : rulePrimitiveObject EOF ;
    public final void entryRulePrimitiveObject() throws RecognitionException {
        try {
            // InternalJSchema.g:154:1: ( rulePrimitiveObject EOF )
            // InternalJSchema.g:155:1: rulePrimitiveObject EOF
            {
             before(grammarAccess.getPrimitiveObjectRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveObject();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectRule()); 
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
    // $ANTLR end "entryRulePrimitiveObject"


    // $ANTLR start "rulePrimitiveObject"
    // InternalJSchema.g:162:1: rulePrimitiveObject : ( ( rule__PrimitiveObject__Group__0 ) ) ;
    public final void rulePrimitiveObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:166:2: ( ( ( rule__PrimitiveObject__Group__0 ) ) )
            // InternalJSchema.g:167:2: ( ( rule__PrimitiveObject__Group__0 ) )
            {
            // InternalJSchema.g:167:2: ( ( rule__PrimitiveObject__Group__0 ) )
            // InternalJSchema.g:168:3: ( rule__PrimitiveObject__Group__0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup()); 
            // InternalJSchema.g:169:3: ( rule__PrimitiveObject__Group__0 )
            // InternalJSchema.g:169:4: rule__PrimitiveObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveObject"


    // $ANTLR start "entryRuleTypes"
    // InternalJSchema.g:178:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // InternalJSchema.g:179:1: ( ruleTypes EOF )
            // InternalJSchema.g:180:1: ruleTypes EOF
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
    // InternalJSchema.g:187:1: ruleTypes : ( ( rule__Types__Alternatives ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:191:2: ( ( ( rule__Types__Alternatives ) ) )
            // InternalJSchema.g:192:2: ( ( rule__Types__Alternatives ) )
            {
            // InternalJSchema.g:192:2: ( ( rule__Types__Alternatives ) )
            // InternalJSchema.g:193:3: ( rule__Types__Alternatives )
            {
             before(grammarAccess.getTypesAccess().getAlternatives()); 
            // InternalJSchema.g:194:3: ( rule__Types__Alternatives )
            // InternalJSchema.g:194:4: rule__Types__Alternatives
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


    // $ANTLR start "entryRulehasProperties"
    // InternalJSchema.g:203:1: entryRulehasProperties : rulehasProperties EOF ;
    public final void entryRulehasProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:204:1: ( rulehasProperties EOF )
            // InternalJSchema.g:205:1: rulehasProperties EOF
            {
             before(grammarAccess.getHasPropertiesRule()); 
            pushFollow(FOLLOW_1);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getHasPropertiesRule()); 
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
    // $ANTLR end "entryRulehasProperties"


    // $ANTLR start "rulehasProperties"
    // InternalJSchema.g:212:1: rulehasProperties : ( ( rule__HasProperties__PropertiesAssignment ) ) ;
    public final void rulehasProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:216:2: ( ( ( rule__HasProperties__PropertiesAssignment ) ) )
            // InternalJSchema.g:217:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            {
            // InternalJSchema.g:217:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            // InternalJSchema.g:218:3: ( rule__HasProperties__PropertiesAssignment )
            {
             before(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment()); 
            // InternalJSchema.g:219:3: ( rule__HasProperties__PropertiesAssignment )
            // InternalJSchema.g:219:4: rule__HasProperties__PropertiesAssignment
            {
            pushFollow(FOLLOW_2);
            rule__HasProperties__PropertiesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment()); 

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
    // $ANTLR end "rulehasProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalJSchema.g:228:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalJSchema.g:229:1: ( ruleProperty EOF )
            // InternalJSchema.g:230:1: ruleProperty EOF
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
    // InternalJSchema.g:237:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:241:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalJSchema.g:242:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalJSchema.g:242:2: ( ( rule__Property__Alternatives ) )
            // InternalJSchema.g:243:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalJSchema.g:244:3: ( rule__Property__Alternatives )
            // InternalJSchema.g:244:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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


    // $ANTLR start "entryRulePrimitiveProperties"
    // InternalJSchema.g:253:1: entryRulePrimitiveProperties : rulePrimitiveProperties EOF ;
    public final void entryRulePrimitiveProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:254:1: ( rulePrimitiveProperties EOF )
            // InternalJSchema.g:255:1: rulePrimitiveProperties EOF
            {
             before(grammarAccess.getPrimitivePropertiesRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveProperties();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesRule()); 
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
    // $ANTLR end "entryRulePrimitiveProperties"


    // $ANTLR start "rulePrimitiveProperties"
    // InternalJSchema.g:262:1: rulePrimitiveProperties : ( ( rule__PrimitiveProperties__Alternatives ) ) ;
    public final void rulePrimitiveProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:266:2: ( ( ( rule__PrimitiveProperties__Alternatives ) ) )
            // InternalJSchema.g:267:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            {
            // InternalJSchema.g:267:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            // InternalJSchema.g:268:3: ( rule__PrimitiveProperties__Alternatives )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getAlternatives()); 
            // InternalJSchema.g:269:3: ( rule__PrimitiveProperties__Alternatives )
            // InternalJSchema.g:269:4: rule__PrimitiveProperties__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveProperties"


    // $ANTLR start "entryRuleStringLength"
    // InternalJSchema.g:278:1: entryRuleStringLength : ruleStringLength EOF ;
    public final void entryRuleStringLength() throws RecognitionException {
        try {
            // InternalJSchema.g:279:1: ( ruleStringLength EOF )
            // InternalJSchema.g:280:1: ruleStringLength EOF
            {
             before(grammarAccess.getStringLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLength();

            state._fsp--;

             after(grammarAccess.getStringLengthRule()); 
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
    // $ANTLR end "entryRuleStringLength"


    // $ANTLR start "ruleStringLength"
    // InternalJSchema.g:287:1: ruleStringLength : ( ( rule__StringLength__Group__0 ) ) ;
    public final void ruleStringLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:291:2: ( ( ( rule__StringLength__Group__0 ) ) )
            // InternalJSchema.g:292:2: ( ( rule__StringLength__Group__0 ) )
            {
            // InternalJSchema.g:292:2: ( ( rule__StringLength__Group__0 ) )
            // InternalJSchema.g:293:3: ( rule__StringLength__Group__0 )
            {
             before(grammarAccess.getStringLengthAccess().getGroup()); 
            // InternalJSchema.g:294:3: ( rule__StringLength__Group__0 )
            // InternalJSchema.g:294:4: rule__StringLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringLength__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLengthAccess().getGroup()); 

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
    // $ANTLR end "ruleStringLength"


    // $ANTLR start "entryRuleIncludes"
    // InternalJSchema.g:303:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalJSchema.g:304:1: ( ruleIncludes EOF )
            // InternalJSchema.g:305:1: ruleIncludes EOF
            {
             before(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getIncludesRule()); 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalJSchema.g:312:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:316:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalJSchema.g:317:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalJSchema.g:317:2: ( ( rule__Includes__Group__0 ) )
            // InternalJSchema.g:318:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalJSchema.g:319:3: ( rule__Includes__Group__0 )
            // InternalJSchema.g:319:4: rule__Includes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getGroup()); 

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
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleArray"
    // InternalJSchema.g:328:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalJSchema.g:329:1: ( ruleArray EOF )
            // InternalJSchema.g:330:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSchema.g:337:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:341:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalJSchema.g:342:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalJSchema.g:342:2: ( ( rule__Array__Group__0 ) )
            // InternalJSchema.g:343:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalJSchema.g:344:3: ( rule__Array__Group__0 )
            // InternalJSchema.g:344:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "ruleFormatTypes"
    // InternalJSchema.g:353:1: ruleFormatTypes : ( ( rule__FormatTypes__Alternatives ) ) ;
    public final void ruleFormatTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:357:1: ( ( ( rule__FormatTypes__Alternatives ) ) )
            // InternalJSchema.g:358:2: ( ( rule__FormatTypes__Alternatives ) )
            {
            // InternalJSchema.g:358:2: ( ( rule__FormatTypes__Alternatives ) )
            // InternalJSchema.g:359:3: ( rule__FormatTypes__Alternatives )
            {
             before(grammarAccess.getFormatTypesAccess().getAlternatives()); 
            // InternalJSchema.g:360:3: ( rule__FormatTypes__Alternatives )
            // InternalJSchema.g:360:4: rule__FormatTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormatTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormatTypes"


    // $ANTLR start "rule__AbstractObject__Alternatives"
    // InternalJSchema.g:368:1: rule__AbstractObject__Alternatives : ( ( ruleObject ) | ( rulePrimitiveObject ) );
    public final void rule__AbstractObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:372:1: ( ( ruleObject ) | ( rulePrimitiveObject ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==28||LA2_1==30) ) {
                    alt2=1;
                }
                else if ( (LA2_1==40) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=34 && LA2_0<=35)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:373:2: ( ruleObject )
                    {
                    // InternalJSchema.g:373:2: ( ruleObject )
                    // InternalJSchema.g:374:3: ruleObject
                    {
                     before(grammarAccess.getAbstractObjectAccess().getObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractObjectAccess().getObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:379:2: ( rulePrimitiveObject )
                    {
                    // InternalJSchema.g:379:2: ( rulePrimitiveObject )
                    // InternalJSchema.g:380:3: rulePrimitiveObject
                    {
                     before(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractObject__Alternatives"


    // $ANTLR start "rule__Types__Alternatives"
    // InternalJSchema.g:389:1: rule__Types__Alternatives : ( ( ( rule__Types__Group_0__0 ) ) | ( ( rule__Types__ArrayAssignment_1 ) ) | ( ( rule__Types__Group_2__0 ) ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:393:1: ( ( ( rule__Types__Group_0__0 ) ) | ( ( rule__Types__ArrayAssignment_1 ) ) | ( ( rule__Types__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:394:2: ( ( rule__Types__Group_0__0 ) )
                    {
                    // InternalJSchema.g:394:2: ( ( rule__Types__Group_0__0 ) )
                    // InternalJSchema.g:395:3: ( rule__Types__Group_0__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_0()); 
                    // InternalJSchema.g:396:3: ( rule__Types__Group_0__0 )
                    // InternalJSchema.g:396:4: rule__Types__Group_0__0
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
                    // InternalJSchema.g:400:2: ( ( rule__Types__ArrayAssignment_1 ) )
                    {
                    // InternalJSchema.g:400:2: ( ( rule__Types__ArrayAssignment_1 ) )
                    // InternalJSchema.g:401:3: ( rule__Types__ArrayAssignment_1 )
                    {
                     before(grammarAccess.getTypesAccess().getArrayAssignment_1()); 
                    // InternalJSchema.g:402:3: ( rule__Types__ArrayAssignment_1 )
                    // InternalJSchema.g:402:4: rule__Types__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__ArrayAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getArrayAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:406:2: ( ( rule__Types__Group_2__0 ) )
                    {
                    // InternalJSchema.g:406:2: ( ( rule__Types__Group_2__0 ) )
                    // InternalJSchema.g:407:3: ( rule__Types__Group_2__0 )
                    {
                     before(grammarAccess.getTypesAccess().getGroup_2()); 
                    // InternalJSchema.g:408:3: ( rule__Types__Group_2__0 )
                    // InternalJSchema.g:408:4: rule__Types__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Types__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypesAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Property__Alternatives"
    // InternalJSchema.g:416:1: rule__Property__Alternatives : ( ( ( rule__Property__TypeAssignment_0 ) ) | ( ( rule__Property__ObjectAssignment_1 ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:420:1: ( ( ( rule__Property__TypeAssignment_0 ) ) | ( ( rule__Property__ObjectAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=34 && LA4_0<=35)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==40) ) {
                    alt4=1;
                }
                else if ( (LA4_2==28||LA4_2==30) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:421:2: ( ( rule__Property__TypeAssignment_0 ) )
                    {
                    // InternalJSchema.g:421:2: ( ( rule__Property__TypeAssignment_0 ) )
                    // InternalJSchema.g:422:3: ( rule__Property__TypeAssignment_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
                    // InternalJSchema.g:423:3: ( rule__Property__TypeAssignment_0 )
                    // InternalJSchema.g:423:4: rule__Property__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:427:2: ( ( rule__Property__ObjectAssignment_1 ) )
                    {
                    // InternalJSchema.g:427:2: ( ( rule__Property__ObjectAssignment_1 ) )
                    // InternalJSchema.g:428:3: ( rule__Property__ObjectAssignment_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getObjectAssignment_1()); 
                    // InternalJSchema.g:429:3: ( rule__Property__ObjectAssignment_1 )
                    // InternalJSchema.g:429:4: rule__Property__ObjectAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__ObjectAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getObjectAssignment_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__PrimitiveProperties__Alternatives"
    // InternalJSchema.g:437:1: rule__PrimitiveProperties__Alternatives : ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) );
    public final void rule__PrimitiveProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:441:1: ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 37:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJSchema.g:442:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    {
                    // InternalJSchema.g:442:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    // InternalJSchema.g:443:3: ( rule__PrimitiveProperties__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 
                    // InternalJSchema.g:444:3: ( rule__PrimitiveProperties__Group_0__0 )
                    // InternalJSchema.g:444:4: rule__PrimitiveProperties__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveProperties__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:448:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    {
                    // InternalJSchema.g:448:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    // InternalJSchema.g:449:3: ( rule__PrimitiveProperties__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 
                    // InternalJSchema.g:450:3: ( rule__PrimitiveProperties__Group_1__0 )
                    // InternalJSchema.g:450:4: rule__PrimitiveProperties__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveProperties__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:454:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    {
                    // InternalJSchema.g:454:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    // InternalJSchema.g:455:3: ( rule__PrimitiveProperties__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 
                    // InternalJSchema.g:456:3: ( rule__PrimitiveProperties__Group_2__0 )
                    // InternalJSchema.g:456:4: rule__PrimitiveProperties__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveProperties__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Alternatives"


    // $ANTLR start "rule__FormatTypes__Alternatives"
    // InternalJSchema.g:464:1: rule__FormatTypes__Alternatives : ( ( ( '\"date-time\"' ) ) | ( ( '\"time\"' ) ) | ( ( '\"date\"' ) ) | ( ( '\"email\"' ) ) | ( ( '\"idn-email\"' ) ) | ( ( '\"hostname\"' ) ) | ( ( '\"ipv4\"' ) ) | ( ( '\"ipv6\"' ) ) | ( ( '\"uri\"' ) ) | ( ( '\"uri-reference\"' ) ) | ( ( '\"iri\"' ) ) | ( ( '\"iri-reference\"' ) ) | ( ( '\"uri-template\"' ) ) | ( ( '\"json-pointer\"' ) ) | ( ( '\"relative-json-pointer\"' ) ) | ( ( '\"regex\"' ) ) );
    public final void rule__FormatTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:468:1: ( ( ( '\"date-time\"' ) ) | ( ( '\"time\"' ) ) | ( ( '\"date\"' ) ) | ( ( '\"email\"' ) ) | ( ( '\"idn-email\"' ) ) | ( ( '\"hostname\"' ) ) | ( ( '\"ipv4\"' ) ) | ( ( '\"ipv6\"' ) ) | ( ( '\"uri\"' ) ) | ( ( '\"uri-reference\"' ) ) | ( ( '\"iri\"' ) ) | ( ( '\"iri-reference\"' ) ) | ( ( '\"uri-template\"' ) ) | ( ( '\"json-pointer\"' ) ) | ( ( '\"relative-json-pointer\"' ) ) | ( ( '\"regex\"' ) ) )
            int alt6=16;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            case 20:
                {
                alt6=10;
                }
                break;
            case 21:
                {
                alt6=11;
                }
                break;
            case 22:
                {
                alt6=12;
                }
                break;
            case 23:
                {
                alt6=13;
                }
                break;
            case 24:
                {
                alt6=14;
                }
                break;
            case 25:
                {
                alt6=15;
                }
                break;
            case 26:
                {
                alt6=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:469:2: ( ( '\"date-time\"' ) )
                    {
                    // InternalJSchema.g:469:2: ( ( '\"date-time\"' ) )
                    // InternalJSchema.g:470:3: ( '\"date-time\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0()); 
                    // InternalJSchema.g:471:3: ( '\"date-time\"' )
                    // InternalJSchema.g:471:4: '\"date-time\"'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:475:2: ( ( '\"time\"' ) )
                    {
                    // InternalJSchema.g:475:2: ( ( '\"time\"' ) )
                    // InternalJSchema.g:476:3: ( '\"time\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1()); 
                    // InternalJSchema.g:477:3: ( '\"time\"' )
                    // InternalJSchema.g:477:4: '\"time\"'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:481:2: ( ( '\"date\"' ) )
                    {
                    // InternalJSchema.g:481:2: ( ( '\"date\"' ) )
                    // InternalJSchema.g:482:3: ( '\"date\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2()); 
                    // InternalJSchema.g:483:3: ( '\"date\"' )
                    // InternalJSchema.g:483:4: '\"date\"'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:487:2: ( ( '\"email\"' ) )
                    {
                    // InternalJSchema.g:487:2: ( ( '\"email\"' ) )
                    // InternalJSchema.g:488:3: ( '\"email\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3()); 
                    // InternalJSchema.g:489:3: ( '\"email\"' )
                    // InternalJSchema.g:489:4: '\"email\"'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:493:2: ( ( '\"idn-email\"' ) )
                    {
                    // InternalJSchema.g:493:2: ( ( '\"idn-email\"' ) )
                    // InternalJSchema.g:494:3: ( '\"idn-email\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4()); 
                    // InternalJSchema.g:495:3: ( '\"idn-email\"' )
                    // InternalJSchema.g:495:4: '\"idn-email\"'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:499:2: ( ( '\"hostname\"' ) )
                    {
                    // InternalJSchema.g:499:2: ( ( '\"hostname\"' ) )
                    // InternalJSchema.g:500:3: ( '\"hostname\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5()); 
                    // InternalJSchema.g:501:3: ( '\"hostname\"' )
                    // InternalJSchema.g:501:4: '\"hostname\"'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:505:2: ( ( '\"ipv4\"' ) )
                    {
                    // InternalJSchema.g:505:2: ( ( '\"ipv4\"' ) )
                    // InternalJSchema.g:506:3: ( '\"ipv4\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6()); 
                    // InternalJSchema.g:507:3: ( '\"ipv4\"' )
                    // InternalJSchema.g:507:4: '\"ipv4\"'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:511:2: ( ( '\"ipv6\"' ) )
                    {
                    // InternalJSchema.g:511:2: ( ( '\"ipv6\"' ) )
                    // InternalJSchema.g:512:3: ( '\"ipv6\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7()); 
                    // InternalJSchema.g:513:3: ( '\"ipv6\"' )
                    // InternalJSchema.g:513:4: '\"ipv6\"'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:517:2: ( ( '\"uri\"' ) )
                    {
                    // InternalJSchema.g:517:2: ( ( '\"uri\"' ) )
                    // InternalJSchema.g:518:3: ( '\"uri\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8()); 
                    // InternalJSchema.g:519:3: ( '\"uri\"' )
                    // InternalJSchema.g:519:4: '\"uri\"'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:523:2: ( ( '\"uri-reference\"' ) )
                    {
                    // InternalJSchema.g:523:2: ( ( '\"uri-reference\"' ) )
                    // InternalJSchema.g:524:3: ( '\"uri-reference\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9()); 
                    // InternalJSchema.g:525:3: ( '\"uri-reference\"' )
                    // InternalJSchema.g:525:4: '\"uri-reference\"'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:529:2: ( ( '\"iri\"' ) )
                    {
                    // InternalJSchema.g:529:2: ( ( '\"iri\"' ) )
                    // InternalJSchema.g:530:3: ( '\"iri\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10()); 
                    // InternalJSchema.g:531:3: ( '\"iri\"' )
                    // InternalJSchema.g:531:4: '\"iri\"'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:535:2: ( ( '\"iri-reference\"' ) )
                    {
                    // InternalJSchema.g:535:2: ( ( '\"iri-reference\"' ) )
                    // InternalJSchema.g:536:3: ( '\"iri-reference\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11()); 
                    // InternalJSchema.g:537:3: ( '\"iri-reference\"' )
                    // InternalJSchema.g:537:4: '\"iri-reference\"'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:541:2: ( ( '\"uri-template\"' ) )
                    {
                    // InternalJSchema.g:541:2: ( ( '\"uri-template\"' ) )
                    // InternalJSchema.g:542:3: ( '\"uri-template\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12()); 
                    // InternalJSchema.g:543:3: ( '\"uri-template\"' )
                    // InternalJSchema.g:543:4: '\"uri-template\"'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:547:2: ( ( '\"json-pointer\"' ) )
                    {
                    // InternalJSchema.g:547:2: ( ( '\"json-pointer\"' ) )
                    // InternalJSchema.g:548:3: ( '\"json-pointer\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13()); 
                    // InternalJSchema.g:549:3: ( '\"json-pointer\"' )
                    // InternalJSchema.g:549:4: '\"json-pointer\"'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:553:2: ( ( '\"relative-json-pointer\"' ) )
                    {
                    // InternalJSchema.g:553:2: ( ( '\"relative-json-pointer\"' ) )
                    // InternalJSchema.g:554:3: ( '\"relative-json-pointer\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14()); 
                    // InternalJSchema.g:555:3: ( '\"relative-json-pointer\"' )
                    // InternalJSchema.g:555:4: '\"relative-json-pointer\"'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:559:2: ( ( '\"regex\"' ) )
                    {
                    // InternalJSchema.g:559:2: ( ( '\"regex\"' ) )
                    // InternalJSchema.g:560:3: ( '\"regex\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15()); 
                    // InternalJSchema.g:561:3: ( '\"regex\"' )
                    // InternalJSchema.g:561:4: '\"regex\"'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15()); 

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
    // $ANTLR end "rule__FormatTypes__Alternatives"


    // $ANTLR start "rule__Number__Group__0"
    // InternalJSchema.g:569:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:573:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSchema.g:574:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalJSchema.g:581:1: rule__Number__Group__0__Impl : ( ( rule__Number__NumberAssignment_0 ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:585:1: ( ( ( rule__Number__NumberAssignment_0 ) ) )
            // InternalJSchema.g:586:1: ( ( rule__Number__NumberAssignment_0 ) )
            {
            // InternalJSchema.g:586:1: ( ( rule__Number__NumberAssignment_0 ) )
            // InternalJSchema.g:587:2: ( rule__Number__NumberAssignment_0 )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment_0()); 
            // InternalJSchema.g:588:2: ( rule__Number__NumberAssignment_0 )
            // InternalJSchema.g:588:3: rule__Number__NumberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Number__NumberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNumberAssignment_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalJSchema.g:596:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:600:1: ( rule__Number__Group__1__Impl )
            // InternalJSchema.g:601:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalJSchema.g:607:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:611:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalJSchema.g:612:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalJSchema.g:612:1: ( ( rule__Number__Group_1__0 )? )
            // InternalJSchema.g:613:2: ( rule__Number__Group_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1()); 
            // InternalJSchema.g:614:2: ( rule__Number__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:614:3: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalJSchema.g:623:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:627:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalJSchema.g:628:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1();

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
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalJSchema.g:635:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:639:1: ( ( '.' ) )
            // InternalJSchema.g:640:1: ( '.' )
            {
            // InternalJSchema.g:640:1: ( '.' )
            // InternalJSchema.g:641:2: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalJSchema.g:650:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:654:1: ( rule__Number__Group_1__1__Impl )
            // InternalJSchema.g:655:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1__Impl();

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
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalJSchema.g:661:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__DecimalAssignment_1_1 ) ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:665:1: ( ( ( rule__Number__DecimalAssignment_1_1 ) ) )
            // InternalJSchema.g:666:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            {
            // InternalJSchema.g:666:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            // InternalJSchema.g:667:2: ( rule__Number__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 
            // InternalJSchema.g:668:2: ( rule__Number__DecimalAssignment_1_1 )
            // InternalJSchema.g:668:3: rule__Number__DecimalAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__DecimalAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 

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
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalJSchema.g:677:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:681:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalJSchema.g:682:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalJSchema.g:689:1: rule__Object__Group__0__Impl : ( ( rule__Object__ObjectNameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:693:1: ( ( ( rule__Object__ObjectNameAssignment_0 ) ) )
            // InternalJSchema.g:694:1: ( ( rule__Object__ObjectNameAssignment_0 ) )
            {
            // InternalJSchema.g:694:1: ( ( rule__Object__ObjectNameAssignment_0 ) )
            // InternalJSchema.g:695:2: ( rule__Object__ObjectNameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObjectNameAssignment_0()); 
            // InternalJSchema.g:696:2: ( rule__Object__ObjectNameAssignment_0 )
            // InternalJSchema.g:696:3: rule__Object__ObjectNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__ObjectNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObjectNameAssignment_0()); 

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
    // InternalJSchema.g:704:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:708:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalJSchema.g:709:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

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
    // InternalJSchema.g:716:1: rule__Object__Group__1__Impl : ( ( rule__Object__Group_1__0 )? ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:720:1: ( ( ( rule__Object__Group_1__0 )? ) )
            // InternalJSchema.g:721:1: ( ( rule__Object__Group_1__0 )? )
            {
            // InternalJSchema.g:721:1: ( ( rule__Object__Group_1__0 )? )
            // InternalJSchema.g:722:2: ( rule__Object__Group_1__0 )?
            {
             before(grammarAccess.getObjectAccess().getGroup_1()); 
            // InternalJSchema.g:723:2: ( rule__Object__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:723:3: rule__Object__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Object__Group__2"
    // InternalJSchema.g:731:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:735:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalJSchema.g:736:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

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
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalJSchema.g:743:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:747:1: ( ( '{' ) )
            // InternalJSchema.g:748:1: ( '{' )
            {
            // InternalJSchema.g:748:1: ( '{' )
            // InternalJSchema.g:749:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalJSchema.g:758:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:762:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalJSchema.g:763:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

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
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalJSchema.g:770:1: rule__Object__Group__3__Impl : ( ( rule__Object__PropertiesAssignment_3 )? ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:774:1: ( ( ( rule__Object__PropertiesAssignment_3 )? ) )
            // InternalJSchema.g:775:1: ( ( rule__Object__PropertiesAssignment_3 )? )
            {
            // InternalJSchema.g:775:1: ( ( rule__Object__PropertiesAssignment_3 )? )
            // InternalJSchema.g:776:2: ( rule__Object__PropertiesAssignment_3 )?
            {
             before(grammarAccess.getObjectAccess().getPropertiesAssignment_3()); 
            // InternalJSchema.g:777:2: ( rule__Object__PropertiesAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=34 && LA9_0<=35)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:777:3: rule__Object__PropertiesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__PropertiesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalJSchema.g:785:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:789:1: ( rule__Object__Group__4__Impl )
            // InternalJSchema.g:790:2: rule__Object__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__4__Impl();

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
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalJSchema.g:796:1: rule__Object__Group__4__Impl : ( '}' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:800:1: ( ( '}' ) )
            // InternalJSchema.g:801:1: ( '}' )
            {
            // InternalJSchema.g:801:1: ( '}' )
            // InternalJSchema.g:802:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group_1__0"
    // InternalJSchema.g:812:1: rule__Object__Group_1__0 : rule__Object__Group_1__0__Impl rule__Object__Group_1__1 ;
    public final void rule__Object__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:816:1: ( rule__Object__Group_1__0__Impl rule__Object__Group_1__1 )
            // InternalJSchema.g:817:2: rule__Object__Group_1__0__Impl rule__Object__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Object__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_1__1();

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
    // $ANTLR end "rule__Object__Group_1__0"


    // $ANTLR start "rule__Object__Group_1__0__Impl"
    // InternalJSchema.g:824:1: rule__Object__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__Object__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:828:1: ( ( 'includes' ) )
            // InternalJSchema.g:829:1: ( 'includes' )
            {
            // InternalJSchema.g:829:1: ( 'includes' )
            // InternalJSchema.g:830:2: 'includes'
            {
             before(grammarAccess.getObjectAccess().getIncludesKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getIncludesKeyword_1_0()); 

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
    // $ANTLR end "rule__Object__Group_1__0__Impl"


    // $ANTLR start "rule__Object__Group_1__1"
    // InternalJSchema.g:839:1: rule__Object__Group_1__1 : rule__Object__Group_1__1__Impl ;
    public final void rule__Object__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:843:1: ( rule__Object__Group_1__1__Impl )
            // InternalJSchema.g:844:2: rule__Object__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_1__1__Impl();

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
    // $ANTLR end "rule__Object__Group_1__1"


    // $ANTLR start "rule__Object__Group_1__1__Impl"
    // InternalJSchema.g:850:1: rule__Object__Group_1__1__Impl : ( ( rule__Object__IncludeObjectsAssignment_1_1 ) ) ;
    public final void rule__Object__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:854:1: ( ( ( rule__Object__IncludeObjectsAssignment_1_1 ) ) )
            // InternalJSchema.g:855:1: ( ( rule__Object__IncludeObjectsAssignment_1_1 ) )
            {
            // InternalJSchema.g:855:1: ( ( rule__Object__IncludeObjectsAssignment_1_1 ) )
            // InternalJSchema.g:856:2: ( rule__Object__IncludeObjectsAssignment_1_1 )
            {
             before(grammarAccess.getObjectAccess().getIncludeObjectsAssignment_1_1()); 
            // InternalJSchema.g:857:2: ( rule__Object__IncludeObjectsAssignment_1_1 )
            // InternalJSchema.g:857:3: rule__Object__IncludeObjectsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Object__IncludeObjectsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getIncludeObjectsAssignment_1_1()); 

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
    // $ANTLR end "rule__Object__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group__0"
    // InternalJSchema.g:866:1: rule__PrimitiveObject__Group__0 : rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 ;
    public final void rule__PrimitiveObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:870:1: ( rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 )
            // InternalJSchema.g:871:2: rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PrimitiveObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group__1();

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
    // $ANTLR end "rule__PrimitiveObject__Group__0"


    // $ANTLR start "rule__PrimitiveObject__Group__0__Impl"
    // InternalJSchema.g:878:1: rule__PrimitiveObject__Group__0__Impl : ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:882:1: ( ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) )
            // InternalJSchema.g:883:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            {
            // InternalJSchema.g:883:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            // InternalJSchema.g:884:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 
            // InternalJSchema.g:885:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            // InternalJSchema.g:885:3: rule__PrimitiveObject__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group__1"
    // InternalJSchema.g:893:1: rule__PrimitiveObject__Group__1 : rule__PrimitiveObject__Group__1__Impl ;
    public final void rule__PrimitiveObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:897:1: ( rule__PrimitiveObject__Group__1__Impl )
            // InternalJSchema.g:898:2: rule__PrimitiveObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group__1__Impl();

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
    // $ANTLR end "rule__PrimitiveObject__Group__1"


    // $ANTLR start "rule__PrimitiveObject__Group__1__Impl"
    // InternalJSchema.g:904:1: rule__PrimitiveObject__Group__1__Impl : ( ( rule__PrimitiveObject__Group_1__0 )? ) ;
    public final void rule__PrimitiveObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:908:1: ( ( ( rule__PrimitiveObject__Group_1__0 )? ) )
            // InternalJSchema.g:909:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            {
            // InternalJSchema.g:909:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            // InternalJSchema.g:910:2: ( rule__PrimitiveObject__Group_1__0 )?
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 
            // InternalJSchema.g:911:2: ( rule__PrimitiveObject__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:911:3: rule__PrimitiveObject__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveObject__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__0"
    // InternalJSchema.g:920:1: rule__PrimitiveObject__Group_1__0 : rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 ;
    public final void rule__PrimitiveObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:924:1: ( rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 )
            // InternalJSchema.g:925:2: rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__PrimitiveObject__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__1();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__0"


    // $ANTLR start "rule__PrimitiveObject__Group_1__0__Impl"
    // InternalJSchema.g:932:1: rule__PrimitiveObject__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__PrimitiveObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:936:1: ( ( 'with' ) )
            // InternalJSchema.g:937:1: ( 'with' )
            {
            // InternalJSchema.g:937:1: ( 'with' )
            // InternalJSchema.g:938:2: 'with'
            {
             before(grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__1"
    // InternalJSchema.g:947:1: rule__PrimitiveObject__Group_1__1 : rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 ;
    public final void rule__PrimitiveObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:951:1: ( rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 )
            // InternalJSchema.g:952:2: rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__PrimitiveObject__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__2();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__1"


    // $ANTLR start "rule__PrimitiveObject__Group_1__1__Impl"
    // InternalJSchema.g:959:1: rule__PrimitiveObject__Group_1__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:963:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) )
            // InternalJSchema.g:964:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            {
            // InternalJSchema.g:964:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            // InternalJSchema.g:965:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 
            // InternalJSchema.g:966:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            // InternalJSchema.g:966:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__2"
    // InternalJSchema.g:974:1: rule__PrimitiveObject__Group_1__2 : rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 ;
    public final void rule__PrimitiveObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:978:1: ( rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 )
            // InternalJSchema.g:979:2: rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__PrimitiveObject__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__3();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__2"


    // $ANTLR start "rule__PrimitiveObject__Group_1__2__Impl"
    // InternalJSchema.g:986:1: rule__PrimitiveObject__Group_1__2__Impl : ( ( rule__PrimitiveObject__Group_1_2__0 )* ) ;
    public final void rule__PrimitiveObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:990:1: ( ( ( rule__PrimitiveObject__Group_1_2__0 )* ) )
            // InternalJSchema.g:991:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            {
            // InternalJSchema.g:991:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            // InternalJSchema.g:992:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 
            // InternalJSchema.g:993:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJSchema.g:993:3: rule__PrimitiveObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PrimitiveObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__2__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1__3"
    // InternalJSchema.g:1001:1: rule__PrimitiveObject__Group_1__3 : rule__PrimitiveObject__Group_1__3__Impl ;
    public final void rule__PrimitiveObject__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1005:1: ( rule__PrimitiveObject__Group_1__3__Impl )
            // InternalJSchema.g:1006:2: rule__PrimitiveObject__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1__3__Impl();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__3"


    // $ANTLR start "rule__PrimitiveObject__Group_1__3__Impl"
    // InternalJSchema.g:1012:1: rule__PrimitiveObject__Group_1__3__Impl : ( ';' ) ;
    public final void rule__PrimitiveObject__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1016:1: ( ( ';' ) )
            // InternalJSchema.g:1017:1: ( ';' )
            {
            // InternalJSchema.g:1017:1: ( ';' )
            // InternalJSchema.g:1018:2: ';'
            {
             before(grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group_1__3__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__0"
    // InternalJSchema.g:1028:1: rule__PrimitiveObject__Group_1_2__0 : rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 ;
    public final void rule__PrimitiveObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1032:1: ( rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 )
            // InternalJSchema.g:1033:2: rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1
            {
            pushFollow(FOLLOW_10);
            rule__PrimitiveObject__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1_2__1();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__0"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__0__Impl"
    // InternalJSchema.g:1040:1: rule__PrimitiveObject__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1044:1: ( ( ',' ) )
            // InternalJSchema.g:1045:1: ( ',' )
            {
            // InternalJSchema.g:1045:1: ( ',' )
            // InternalJSchema.g:1046:2: ','
            {
             before(grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__0__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__1"
    // InternalJSchema.g:1055:1: rule__PrimitiveObject__Group_1_2__1 : rule__PrimitiveObject__Group_1_2__1__Impl ;
    public final void rule__PrimitiveObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1059:1: ( rule__PrimitiveObject__Group_1_2__1__Impl )
            // InternalJSchema.g:1060:2: rule__PrimitiveObject__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__1"


    // $ANTLR start "rule__PrimitiveObject__Group_1_2__1__Impl"
    // InternalJSchema.g:1066:1: rule__PrimitiveObject__Group_1_2__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1070:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) )
            // InternalJSchema.g:1071:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            {
            // InternalJSchema.g:1071:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            // InternalJSchema.g:1072:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 
            // InternalJSchema.g:1073:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            // InternalJSchema.g:1073:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 

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
    // $ANTLR end "rule__PrimitiveObject__Group_1_2__1__Impl"


    // $ANTLR start "rule__Types__Group_0__0"
    // InternalJSchema.g:1082:1: rule__Types__Group_0__0 : rule__Types__Group_0__0__Impl rule__Types__Group_0__1 ;
    public final void rule__Types__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1086:1: ( rule__Types__Group_0__0__Impl rule__Types__Group_0__1 )
            // InternalJSchema.g:1087:2: rule__Types__Group_0__0__Impl rule__Types__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:1094:1: rule__Types__Group_0__0__Impl : ( () ) ;
    public final void rule__Types__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1098:1: ( ( () ) )
            // InternalJSchema.g:1099:1: ( () )
            {
            // InternalJSchema.g:1099:1: ( () )
            // InternalJSchema.g:1100:2: ()
            {
             before(grammarAccess.getTypesAccess().getSTRINGAction_0_0()); 
            // InternalJSchema.g:1101:2: ()
            // InternalJSchema.g:1101:3: 
            {
            }

             after(grammarAccess.getTypesAccess().getSTRINGAction_0_0()); 

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
    // InternalJSchema.g:1109:1: rule__Types__Group_0__1 : rule__Types__Group_0__1__Impl rule__Types__Group_0__2 ;
    public final void rule__Types__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1113:1: ( rule__Types__Group_0__1__Impl rule__Types__Group_0__2 )
            // InternalJSchema.g:1114:2: rule__Types__Group_0__1__Impl rule__Types__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Types__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Types__Group_0__2();

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
    // InternalJSchema.g:1121:1: rule__Types__Group_0__1__Impl : ( 'String' ) ;
    public final void rule__Types__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1125:1: ( ( 'String' ) )
            // InternalJSchema.g:1126:1: ( 'String' )
            {
            // InternalJSchema.g:1126:1: ( 'String' )
            // InternalJSchema.g:1127:2: 'String'
            {
             before(grammarAccess.getTypesAccess().getStringKeyword_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getStringKeyword_0_1()); 

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


    // $ANTLR start "rule__Types__Group_0__2"
    // InternalJSchema.g:1136:1: rule__Types__Group_0__2 : rule__Types__Group_0__2__Impl ;
    public final void rule__Types__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1140:1: ( rule__Types__Group_0__2__Impl )
            // InternalJSchema.g:1141:2: rule__Types__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Types__Group_0__2__Impl();

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
    // $ANTLR end "rule__Types__Group_0__2"


    // $ANTLR start "rule__Types__Group_0__2__Impl"
    // InternalJSchema.g:1147:1: rule__Types__Group_0__2__Impl : ( ( rule__Types__StringAssignment_0_2 ) ) ;
    public final void rule__Types__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1151:1: ( ( ( rule__Types__StringAssignment_0_2 ) ) )
            // InternalJSchema.g:1152:1: ( ( rule__Types__StringAssignment_0_2 ) )
            {
            // InternalJSchema.g:1152:1: ( ( rule__Types__StringAssignment_0_2 ) )
            // InternalJSchema.g:1153:2: ( rule__Types__StringAssignment_0_2 )
            {
             before(grammarAccess.getTypesAccess().getStringAssignment_0_2()); 
            // InternalJSchema.g:1154:2: ( rule__Types__StringAssignment_0_2 )
            // InternalJSchema.g:1154:3: rule__Types__StringAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Types__StringAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getStringAssignment_0_2()); 

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
    // $ANTLR end "rule__Types__Group_0__2__Impl"


    // $ANTLR start "rule__Types__Group_2__0"
    // InternalJSchema.g:1163:1: rule__Types__Group_2__0 : rule__Types__Group_2__0__Impl rule__Types__Group_2__1 ;
    public final void rule__Types__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1167:1: ( rule__Types__Group_2__0__Impl rule__Types__Group_2__1 )
            // InternalJSchema.g:1168:2: rule__Types__Group_2__0__Impl rule__Types__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalJSchema.g:1175:1: rule__Types__Group_2__0__Impl : ( 'num' ) ;
    public final void rule__Types__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1179:1: ( ( 'num' ) )
            // InternalJSchema.g:1180:1: ( 'num' )
            {
            // InternalJSchema.g:1180:1: ( 'num' )
            // InternalJSchema.g:1181:2: 'num'
            {
             before(grammarAccess.getTypesAccess().getNumKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getNumKeyword_2_0()); 

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
    // $ANTLR end "rule__Types__Group_2__0__Impl"


    // $ANTLR start "rule__Types__Group_2__1"
    // InternalJSchema.g:1190:1: rule__Types__Group_2__1 : rule__Types__Group_2__1__Impl ;
    public final void rule__Types__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1194:1: ( rule__Types__Group_2__1__Impl )
            // InternalJSchema.g:1195:2: rule__Types__Group_2__1__Impl
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
    // InternalJSchema.g:1201:1: rule__Types__Group_2__1__Impl : ( ( rule__Types__NumberAssignment_2_1 ) ) ;
    public final void rule__Types__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1205:1: ( ( ( rule__Types__NumberAssignment_2_1 ) ) )
            // InternalJSchema.g:1206:1: ( ( rule__Types__NumberAssignment_2_1 ) )
            {
            // InternalJSchema.g:1206:1: ( ( rule__Types__NumberAssignment_2_1 ) )
            // InternalJSchema.g:1207:2: ( rule__Types__NumberAssignment_2_1 )
            {
             before(grammarAccess.getTypesAccess().getNumberAssignment_2_1()); 
            // InternalJSchema.g:1208:2: ( rule__Types__NumberAssignment_2_1 )
            // InternalJSchema.g:1208:3: rule__Types__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Types__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypesAccess().getNumberAssignment_2_1()); 

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


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0"
    // InternalJSchema.g:1217:1: rule__PrimitiveProperties__Group_0__0 : rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 ;
    public final void rule__PrimitiveProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1221:1: ( rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 )
            // InternalJSchema.g:1222:2: rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveProperties__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_0__1();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_0__0"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0__Impl"
    // InternalJSchema.g:1229:1: rule__PrimitiveProperties__Group_0__0__Impl : ( 'length' ) ;
    public final void rule__PrimitiveProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1233:1: ( ( 'length' ) )
            // InternalJSchema.g:1234:1: ( 'length' )
            {
            // InternalJSchema.g:1234:1: ( 'length' )
            // InternalJSchema.g:1235:2: 'length'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__1"
    // InternalJSchema.g:1244:1: rule__PrimitiveProperties__Group_0__1 : rule__PrimitiveProperties__Group_0__1__Impl ;
    public final void rule__PrimitiveProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1248:1: ( rule__PrimitiveProperties__Group_0__1__Impl )
            // InternalJSchema.g:1249:2: rule__PrimitiveProperties__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_0__1"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__1__Impl"
    // InternalJSchema.g:1255:1: rule__PrimitiveProperties__Group_0__1__Impl : ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1259:1: ( ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) ) )
            // InternalJSchema.g:1260:1: ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) )
            {
            // InternalJSchema.g:1260:1: ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) )
            // InternalJSchema.g:1261:2: ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLenghtAssignment_0_1()); 
            // InternalJSchema.g:1262:2: ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 )
            // InternalJSchema.g:1262:3: rule__PrimitiveProperties__StringLenghtAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__StringLenghtAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getStringLenghtAssignment_0_1()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Group_0__1__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__0"
    // InternalJSchema.g:1271:1: rule__PrimitiveProperties__Group_1__0 : rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 ;
    public final void rule__PrimitiveProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1275:1: ( rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 )
            // InternalJSchema.g:1276:2: rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveProperties__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_1__1();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_1__0"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__0__Impl"
    // InternalJSchema.g:1283:1: rule__PrimitiveProperties__Group_1__0__Impl : ( 'pattern' ) ;
    public final void rule__PrimitiveProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1287:1: ( ( 'pattern' ) )
            // InternalJSchema.g:1288:1: ( 'pattern' )
            {
            // InternalJSchema.g:1288:1: ( 'pattern' )
            // InternalJSchema.g:1289:2: 'pattern'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__1"
    // InternalJSchema.g:1298:1: rule__PrimitiveProperties__Group_1__1 : rule__PrimitiveProperties__Group_1__1__Impl ;
    public final void rule__PrimitiveProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1302:1: ( rule__PrimitiveProperties__Group_1__1__Impl )
            // InternalJSchema.g:1303:2: rule__PrimitiveProperties__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_1__1"


    // $ANTLR start "rule__PrimitiveProperties__Group_1__1__Impl"
    // InternalJSchema.g:1309:1: rule__PrimitiveProperties__Group_1__1__Impl : ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1313:1: ( ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) )
            // InternalJSchema.g:1314:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            {
            // InternalJSchema.g:1314:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            // InternalJSchema.g:1315:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 
            // InternalJSchema.g:1316:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            // InternalJSchema.g:1316:3: rule__PrimitiveProperties__PatternStringAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__PatternStringAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__0"
    // InternalJSchema.g:1325:1: rule__PrimitiveProperties__Group_2__0 : rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 ;
    public final void rule__PrimitiveProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1329:1: ( rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 )
            // InternalJSchema.g:1330:2: rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__PrimitiveProperties__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_2__1();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_2__0"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__0__Impl"
    // InternalJSchema.g:1337:1: rule__PrimitiveProperties__Group_2__0__Impl : ( 'format' ) ;
    public final void rule__PrimitiveProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1341:1: ( ( 'format' ) )
            // InternalJSchema.g:1342:1: ( 'format' )
            {
            // InternalJSchema.g:1342:1: ( 'format' )
            // InternalJSchema.g:1343:2: 'format'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__1"
    // InternalJSchema.g:1352:1: rule__PrimitiveProperties__Group_2__1 : rule__PrimitiveProperties__Group_2__1__Impl ;
    public final void rule__PrimitiveProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1356:1: ( rule__PrimitiveProperties__Group_2__1__Impl )
            // InternalJSchema.g:1357:2: rule__PrimitiveProperties__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveProperties__Group_2__1"


    // $ANTLR start "rule__PrimitiveProperties__Group_2__1__Impl"
    // InternalJSchema.g:1363:1: rule__PrimitiveProperties__Group_2__1__Impl : ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1367:1: ( ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) )
            // InternalJSchema.g:1368:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            {
            // InternalJSchema.g:1368:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            // InternalJSchema.g:1369:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 
            // InternalJSchema.g:1370:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            // InternalJSchema.g:1370:3: rule__PrimitiveProperties__StringFormatAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__StringFormatAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 

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
    // $ANTLR end "rule__PrimitiveProperties__Group_2__1__Impl"


    // $ANTLR start "rule__StringLength__Group__0"
    // InternalJSchema.g:1379:1: rule__StringLength__Group__0 : rule__StringLength__Group__0__Impl rule__StringLength__Group__1 ;
    public final void rule__StringLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1383:1: ( rule__StringLength__Group__0__Impl rule__StringLength__Group__1 )
            // InternalJSchema.g:1384:2: rule__StringLength__Group__0__Impl rule__StringLength__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__StringLength__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLength__Group__1();

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
    // $ANTLR end "rule__StringLength__Group__0"


    // $ANTLR start "rule__StringLength__Group__0__Impl"
    // InternalJSchema.g:1391:1: rule__StringLength__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1395:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1396:1: ( RULE_INT )
            {
            // InternalJSchema.g:1396:1: ( RULE_INT )
            // InternalJSchema.g:1397:2: RULE_INT
            {
             before(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLength__Group__0__Impl"


    // $ANTLR start "rule__StringLength__Group__1"
    // InternalJSchema.g:1406:1: rule__StringLength__Group__1 : rule__StringLength__Group__1__Impl rule__StringLength__Group__2 ;
    public final void rule__StringLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1410:1: ( rule__StringLength__Group__1__Impl rule__StringLength__Group__2 )
            // InternalJSchema.g:1411:2: rule__StringLength__Group__1__Impl rule__StringLength__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StringLength__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLength__Group__2();

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
    // $ANTLR end "rule__StringLength__Group__1"


    // $ANTLR start "rule__StringLength__Group__1__Impl"
    // InternalJSchema.g:1418:1: rule__StringLength__Group__1__Impl : ( '-' ) ;
    public final void rule__StringLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1422:1: ( ( '-' ) )
            // InternalJSchema.g:1423:1: ( '-' )
            {
            // InternalJSchema.g:1423:1: ( '-' )
            // InternalJSchema.g:1424:2: '-'
            {
             before(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__StringLength__Group__1__Impl"


    // $ANTLR start "rule__StringLength__Group__2"
    // InternalJSchema.g:1433:1: rule__StringLength__Group__2 : rule__StringLength__Group__2__Impl ;
    public final void rule__StringLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1437:1: ( rule__StringLength__Group__2__Impl )
            // InternalJSchema.g:1438:2: rule__StringLength__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLength__Group__2__Impl();

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
    // $ANTLR end "rule__StringLength__Group__2"


    // $ANTLR start "rule__StringLength__Group__2__Impl"
    // InternalJSchema.g:1444:1: rule__StringLength__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1448:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1449:1: ( RULE_INT )
            {
            // InternalJSchema.g:1449:1: ( RULE_INT )
            // InternalJSchema.g:1450:2: RULE_INT
            {
             before(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__StringLength__Group__2__Impl"


    // $ANTLR start "rule__Includes__Group__0"
    // InternalJSchema.g:1460:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1464:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalJSchema.g:1465:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Includes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__1();

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
    // $ANTLR end "rule__Includes__Group__0"


    // $ANTLR start "rule__Includes__Group__0__Impl"
    // InternalJSchema.g:1472:1: rule__Includes__Group__0__Impl : ( ( rule__Includes__ObjectIDAssignment_0 ) ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1476:1: ( ( ( rule__Includes__ObjectIDAssignment_0 ) ) )
            // InternalJSchema.g:1477:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            {
            // InternalJSchema.g:1477:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            // InternalJSchema.g:1478:2: ( rule__Includes__ObjectIDAssignment_0 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_0()); 
            // InternalJSchema.g:1479:2: ( rule__Includes__ObjectIDAssignment_0 )
            // InternalJSchema.g:1479:3: rule__Includes__ObjectIDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__ObjectIDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getObjectIDAssignment_0()); 

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
    // $ANTLR end "rule__Includes__Group__0__Impl"


    // $ANTLR start "rule__Includes__Group__1"
    // InternalJSchema.g:1487:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1491:1: ( rule__Includes__Group__1__Impl )
            // InternalJSchema.g:1492:2: rule__Includes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__1__Impl();

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
    // $ANTLR end "rule__Includes__Group__1"


    // $ANTLR start "rule__Includes__Group__1__Impl"
    // InternalJSchema.g:1498:1: rule__Includes__Group__1__Impl : ( ( rule__Includes__Group_1__0 )* ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1502:1: ( ( ( rule__Includes__Group_1__0 )* ) )
            // InternalJSchema.g:1503:1: ( ( rule__Includes__Group_1__0 )* )
            {
            // InternalJSchema.g:1503:1: ( ( rule__Includes__Group_1__0 )* )
            // InternalJSchema.g:1504:2: ( rule__Includes__Group_1__0 )*
            {
             before(grammarAccess.getIncludesAccess().getGroup_1()); 
            // InternalJSchema.g:1505:2: ( rule__Includes__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJSchema.g:1505:3: rule__Includes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Includes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getIncludesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Includes__Group__1__Impl"


    // $ANTLR start "rule__Includes__Group_1__0"
    // InternalJSchema.g:1514:1: rule__Includes__Group_1__0 : rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 ;
    public final void rule__Includes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1518:1: ( rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 )
            // InternalJSchema.g:1519:2: rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Includes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__1();

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
    // $ANTLR end "rule__Includes__Group_1__0"


    // $ANTLR start "rule__Includes__Group_1__0__Impl"
    // InternalJSchema.g:1526:1: rule__Includes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Includes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1530:1: ( ( ',' ) )
            // InternalJSchema.g:1531:1: ( ',' )
            {
            // InternalJSchema.g:1531:1: ( ',' )
            // InternalJSchema.g:1532:2: ','
            {
             before(grammarAccess.getIncludesAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Includes__Group_1__0__Impl"


    // $ANTLR start "rule__Includes__Group_1__1"
    // InternalJSchema.g:1541:1: rule__Includes__Group_1__1 : rule__Includes__Group_1__1__Impl ;
    public final void rule__Includes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1545:1: ( rule__Includes__Group_1__1__Impl )
            // InternalJSchema.g:1546:2: rule__Includes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__1__Impl();

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
    // $ANTLR end "rule__Includes__Group_1__1"


    // $ANTLR start "rule__Includes__Group_1__1__Impl"
    // InternalJSchema.g:1552:1: rule__Includes__Group_1__1__Impl : ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) ;
    public final void rule__Includes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1556:1: ( ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) )
            // InternalJSchema.g:1557:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            {
            // InternalJSchema.g:1557:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            // InternalJSchema.g:1558:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1()); 
            // InternalJSchema.g:1559:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            // InternalJSchema.g:1559:3: rule__Includes__ObjectIDAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Includes__ObjectIDAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1()); 

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
    // $ANTLR end "rule__Includes__Group_1__1__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalJSchema.g:1568:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1572:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSchema.g:1573:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalJSchema.g:1580:1: rule__Array__Group__0__Impl : ( ( rule__Array__ArrayNameAssignment_0 ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1584:1: ( ( ( rule__Array__ArrayNameAssignment_0 ) ) )
            // InternalJSchema.g:1585:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            {
            // InternalJSchema.g:1585:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            // InternalJSchema.g:1586:2: ( rule__Array__ArrayNameAssignment_0 )
            {
             before(grammarAccess.getArrayAccess().getArrayNameAssignment_0()); 
            // InternalJSchema.g:1587:2: ( rule__Array__ArrayNameAssignment_0 )
            // InternalJSchema.g:1587:3: rule__Array__ArrayNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__ArrayNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getArrayNameAssignment_0()); 

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
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalJSchema.g:1595:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1599:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSchema.g:1600:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__2();

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalJSchema.g:1607:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1611:1: ( ( '[' ) )
            // InternalJSchema.g:1612:1: ( '[' )
            {
            // InternalJSchema.g:1612:1: ( '[' )
            // InternalJSchema.g:1613:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // InternalJSchema.g:1622:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1626:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // InternalJSchema.g:1627:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__3();

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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // InternalJSchema.g:1634:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1638:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // InternalJSchema.g:1639:1: ( ( rule__Array__Group_2__0 )? )
            {
            // InternalJSchema.g:1639:1: ( ( rule__Array__Group_2__0 )? )
            // InternalJSchema.g:1640:2: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // InternalJSchema.g:1641:2: ( rule__Array__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=34 && LA13_0<=35)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:1641:3: rule__Array__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Array__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // InternalJSchema.g:1649:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1653:1: ( rule__Array__Group__3__Impl )
            // InternalJSchema.g:1654:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__3__Impl();

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
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // InternalJSchema.g:1660:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1664:1: ( ( ']' ) )
            // InternalJSchema.g:1665:1: ( ']' )
            {
            // InternalJSchema.g:1665:1: ( ']' )
            // InternalJSchema.g:1666:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group_2__0"
    // InternalJSchema.g:1676:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1680:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // InternalJSchema.g:1681:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_2__1();

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
    // $ANTLR end "rule__Array__Group_2__0"


    // $ANTLR start "rule__Array__Group_2__0__Impl"
    // InternalJSchema.g:1688:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__PropertiesAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1692:1: ( ( ( rule__Array__PropertiesAssignment_2_0 ) ) )
            // InternalJSchema.g:1693:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            {
            // InternalJSchema.g:1693:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            // InternalJSchema.g:1694:2: ( rule__Array__PropertiesAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 
            // InternalJSchema.g:1695:2: ( rule__Array__PropertiesAssignment_2_0 )
            // InternalJSchema.g:1695:3: rule__Array__PropertiesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__PropertiesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 

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
    // $ANTLR end "rule__Array__Group_2__0__Impl"


    // $ANTLR start "rule__Array__Group_2__1"
    // InternalJSchema.g:1703:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1707:1: ( rule__Array__Group_2__1__Impl )
            // InternalJSchema.g:1708:2: rule__Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_2__1__Impl();

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
    // $ANTLR end "rule__Array__Group_2__1"


    // $ANTLR start "rule__Array__Group_2__1__Impl"
    // InternalJSchema.g:1714:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1718:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // InternalJSchema.g:1719:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // InternalJSchema.g:1719:1: ( ( rule__Array__Group_2_1__0 )* )
            // InternalJSchema.g:1720:2: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // InternalJSchema.g:1721:2: ( rule__Array__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJSchema.g:1721:3: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Array__Group_2__1__Impl"


    // $ANTLR start "rule__Array__Group_2_1__0"
    // InternalJSchema.g:1730:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1734:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // InternalJSchema.g:1735:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Array__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group_2_1__1();

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
    // $ANTLR end "rule__Array__Group_2_1__0"


    // $ANTLR start "rule__Array__Group_2_1__0__Impl"
    // InternalJSchema.g:1742:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1746:1: ( ( ',' ) )
            // InternalJSchema.g:1747:1: ( ',' )
            {
            // InternalJSchema.g:1747:1: ( ',' )
            // InternalJSchema.g:1748:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Array__Group_2_1__0__Impl"


    // $ANTLR start "rule__Array__Group_2_1__1"
    // InternalJSchema.g:1757:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1761:1: ( rule__Array__Group_2_1__1__Impl )
            // InternalJSchema.g:1762:2: rule__Array__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Array__Group_2_1__1"


    // $ANTLR start "rule__Array__Group_2_1__1__Impl"
    // InternalJSchema.g:1768:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1772:1: ( ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) )
            // InternalJSchema.g:1773:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            {
            // InternalJSchema.g:1773:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            // InternalJSchema.g:1774:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 
            // InternalJSchema.g:1775:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            // InternalJSchema.g:1775:3: rule__Array__PropertiesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Array__PropertiesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Array__Group_2_1__1__Impl"


    // $ANTLR start "rule__Model__AbstractObjectAssignment"
    // InternalJSchema.g:1784:1: rule__Model__AbstractObjectAssignment : ( ruleAbstractObject ) ;
    public final void rule__Model__AbstractObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1788:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:1789:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:1789:2: ( ruleAbstractObject )
            // InternalJSchema.g:1790:3: ruleAbstractObject
            {
             before(grammarAccess.getModelAccess().getAbstractObjectAbstractObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractObject();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAbstractObjectAbstractObjectParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__AbstractObjectAssignment"


    // $ANTLR start "rule__Number__NumberAssignment_0"
    // InternalJSchema.g:1799:1: rule__Number__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__Number__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1803:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1804:2: ( RULE_INT )
            {
            // InternalJSchema.g:1804:2: ( RULE_INT )
            // InternalJSchema.g:1805:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Number__NumberAssignment_0"


    // $ANTLR start "rule__Number__DecimalAssignment_1_1"
    // InternalJSchema.g:1814:1: rule__Number__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Number__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1818:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1819:2: ( RULE_INT )
            {
            // InternalJSchema.g:1819:2: ( RULE_INT )
            // InternalJSchema.g:1820:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Number__DecimalAssignment_1_1"


    // $ANTLR start "rule__Object__ObjectNameAssignment_0"
    // InternalJSchema.g:1829:1: rule__Object__ObjectNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__ObjectNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1833:1: ( ( RULE_ID ) )
            // InternalJSchema.g:1834:2: ( RULE_ID )
            {
            // InternalJSchema.g:1834:2: ( RULE_ID )
            // InternalJSchema.g:1835:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Object__ObjectNameAssignment_0"


    // $ANTLR start "rule__Object__IncludeObjectsAssignment_1_1"
    // InternalJSchema.g:1844:1: rule__Object__IncludeObjectsAssignment_1_1 : ( ruleIncludes ) ;
    public final void rule__Object__IncludeObjectsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1848:1: ( ( ruleIncludes ) )
            // InternalJSchema.g:1849:2: ( ruleIncludes )
            {
            // InternalJSchema.g:1849:2: ( ruleIncludes )
            // InternalJSchema.g:1850:3: ruleIncludes
            {
             before(grammarAccess.getObjectAccess().getIncludeObjectsIncludesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getIncludeObjectsIncludesParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Object__IncludeObjectsAssignment_1_1"


    // $ANTLR start "rule__Object__PropertiesAssignment_3"
    // InternalJSchema.g:1859:1: rule__Object__PropertiesAssignment_3 : ( rulehasProperties ) ;
    public final void rule__Object__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1863:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:1864:2: ( rulehasProperties )
            {
            // InternalJSchema.g:1864:2: ( rulehasProperties )
            // InternalJSchema.g:1865:3: rulehasProperties
            {
             before(grammarAccess.getObjectAccess().getPropertiesHasPropertiesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPropertiesHasPropertiesParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Object__PropertiesAssignment_3"


    // $ANTLR start "rule__PrimitiveObject__TypeAssignment_0"
    // InternalJSchema.g:1874:1: rule__PrimitiveObject__TypeAssignment_0 : ( ruleTypes ) ;
    public final void rule__PrimitiveObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1878:1: ( ( ruleTypes ) )
            // InternalJSchema.g:1879:2: ( ruleTypes )
            {
            // InternalJSchema.g:1879:2: ( ruleTypes )
            // InternalJSchema.g:1880:3: ruleTypes
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypeTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getTypeTypesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PrimitiveObject__TypeAssignment_0"


    // $ANTLR start "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1"
    // InternalJSchema.g:1889:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1893:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:1894:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:1894:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:1895:3: rulePrimitiveProperties
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveProperties();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1"


    // $ANTLR start "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1"
    // InternalJSchema.g:1904:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1908:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:1909:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:1909:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:1910:3: rulePrimitiveProperties
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveProperties();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1"


    // $ANTLR start "rule__Types__StringAssignment_0_2"
    // InternalJSchema.g:1919:1: rule__Types__StringAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__Types__StringAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1923:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:1924:2: ( RULE_STRING )
            {
            // InternalJSchema.g:1924:2: ( RULE_STRING )
            // InternalJSchema.g:1925:3: RULE_STRING
            {
             before(grammarAccess.getTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Types__StringAssignment_0_2"


    // $ANTLR start "rule__Types__ArrayAssignment_1"
    // InternalJSchema.g:1934:1: rule__Types__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__Types__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1938:1: ( ( ruleArray ) )
            // InternalJSchema.g:1939:2: ( ruleArray )
            {
            // InternalJSchema.g:1939:2: ( ruleArray )
            // InternalJSchema.g:1940:3: ruleArray
            {
             before(grammarAccess.getTypesAccess().getArrayArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getTypesAccess().getArrayArrayParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Types__ArrayAssignment_1"


    // $ANTLR start "rule__Types__NumberAssignment_2_1"
    // InternalJSchema.g:1949:1: rule__Types__NumberAssignment_2_1 : ( ruleNumber ) ;
    public final void rule__Types__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1953:1: ( ( ruleNumber ) )
            // InternalJSchema.g:1954:2: ( ruleNumber )
            {
            // InternalJSchema.g:1954:2: ( ruleNumber )
            // InternalJSchema.g:1955:3: ruleNumber
            {
             before(grammarAccess.getTypesAccess().getNumberNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTypesAccess().getNumberNumberParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Types__NumberAssignment_2_1"


    // $ANTLR start "rule__HasProperties__PropertiesAssignment"
    // InternalJSchema.g:1964:1: rule__HasProperties__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__HasProperties__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1968:1: ( ( ruleProperty ) )
            // InternalJSchema.g:1969:2: ( ruleProperty )
            {
            // InternalJSchema.g:1969:2: ( ruleProperty )
            // InternalJSchema.g:1970:3: ruleProperty
            {
             before(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0()); 

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
    // $ANTLR end "rule__HasProperties__PropertiesAssignment"


    // $ANTLR start "rule__Property__TypeAssignment_0"
    // InternalJSchema.g:1979:1: rule__Property__TypeAssignment_0 : ( ruleTypes ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1983:1: ( ( ruleTypes ) )
            // InternalJSchema.g:1984:2: ( ruleTypes )
            {
            // InternalJSchema.g:1984:2: ( ruleTypes )
            // InternalJSchema.g:1985:3: ruleTypes
            {
             before(grammarAccess.getPropertyAccess().getTypeTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Property__TypeAssignment_0"


    // $ANTLR start "rule__Property__ObjectAssignment_1"
    // InternalJSchema.g:1994:1: rule__Property__ObjectAssignment_1 : ( ruleObject ) ;
    public final void rule__Property__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1998:1: ( ( ruleObject ) )
            // InternalJSchema.g:1999:2: ( ruleObject )
            {
            // InternalJSchema.g:1999:2: ( ruleObject )
            // InternalJSchema.g:2000:3: ruleObject
            {
             before(grammarAccess.getPropertyAccess().getObjectObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getObjectObjectParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Property__ObjectAssignment_1"


    // $ANTLR start "rule__PrimitiveProperties__StringLenghtAssignment_0_1"
    // InternalJSchema.g:2009:1: rule__PrimitiveProperties__StringLenghtAssignment_0_1 : ( ruleStringLength ) ;
    public final void rule__PrimitiveProperties__StringLenghtAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2013:1: ( ( ruleStringLength ) )
            // InternalJSchema.g:2014:2: ( ruleStringLength )
            {
            // InternalJSchema.g:2014:2: ( ruleStringLength )
            // InternalJSchema.g:2015:3: ruleStringLength
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLenghtStringLengthParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLength();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesAccess().getStringLenghtStringLengthParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperties__StringLenghtAssignment_0_1"


    // $ANTLR start "rule__PrimitiveProperties__PatternStringAssignment_1_1"
    // InternalJSchema.g:2024:1: rule__PrimitiveProperties__PatternStringAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PrimitiveProperties__PatternStringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2028:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2029:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2029:2: ( RULE_STRING )
            // InternalJSchema.g:2030:3: RULE_STRING
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitivePropertiesAccess().getPatternStringSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperties__PatternStringAssignment_1_1"


    // $ANTLR start "rule__PrimitiveProperties__StringFormatAssignment_2_1"
    // InternalJSchema.g:2039:1: rule__PrimitiveProperties__StringFormatAssignment_2_1 : ( ruleFormatTypes ) ;
    public final void rule__PrimitiveProperties__StringFormatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2043:1: ( ( ruleFormatTypes ) )
            // InternalJSchema.g:2044:2: ( ruleFormatTypes )
            {
            // InternalJSchema.g:2044:2: ( ruleFormatTypes )
            // InternalJSchema.g:2045:3: ruleFormatTypes
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatFormatTypesEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormatTypes();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesAccess().getStringFormatFormatTypesEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__PrimitiveProperties__StringFormatAssignment_2_1"


    // $ANTLR start "rule__Includes__ObjectIDAssignment_0"
    // InternalJSchema.g:2054:1: rule__Includes__ObjectIDAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2058:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2059:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2059:2: ( RULE_STRING )
            // InternalJSchema.g:2060:3: RULE_STRING
            {
             before(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Includes__ObjectIDAssignment_0"


    // $ANTLR start "rule__Includes__ObjectIDAssignment_1_1"
    // InternalJSchema.g:2069:1: rule__Includes__ObjectIDAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2073:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2074:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2074:2: ( RULE_STRING )
            // InternalJSchema.g:2075:3: RULE_STRING
            {
             before(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Includes__ObjectIDAssignment_1_1"


    // $ANTLR start "rule__Array__ArrayNameAssignment_0"
    // InternalJSchema.g:2084:1: rule__Array__ArrayNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Array__ArrayNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2088:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2089:2: ( RULE_ID )
            {
            // InternalJSchema.g:2089:2: ( RULE_ID )
            // InternalJSchema.g:2090:3: RULE_ID
            {
             before(grammarAccess.getArrayAccess().getArrayNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getArrayNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Array__ArrayNameAssignment_0"


    // $ANTLR start "rule__Array__PropertiesAssignment_2_0"
    // InternalJSchema.g:2099:1: rule__Array__PropertiesAssignment_2_0 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2103:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2104:2: ( ruleProperty )
            {
            // InternalJSchema.g:2104:2: ( ruleProperty )
            // InternalJSchema.g:2105:3: ruleProperty
            {
             before(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Array__PropertiesAssignment_2_0"


    // $ANTLR start "rule__Array__PropertiesAssignment_2_1_1"
    // InternalJSchema.g:2114:1: rule__Array__PropertiesAssignment_2_1_1 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2118:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2119:2: ( ruleProperty )
            {
            // InternalJSchema.g:2119:2: ( ruleProperty )
            // InternalJSchema.g:2120:3: ruleProperty
            {
             before(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Array__PropertiesAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000C00000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C20000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007FFF800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020C00000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000C00000020L});

}