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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'float'", "'double'", "'\"date-time\"'", "'\"time\"'", "'\"date\"'", "'\"email\"'", "'\"idn-email\"'", "'\"hostname\"'", "'\"ipv4\"'", "'\"ipv6\"'", "'\"uri\"'", "'\"uri-reference\"'", "'\"iri\"'", "'\"iri-reference\"'", "'\"uri-template\"'", "'\"json-pointer\"'", "'\"relative-json-pointer\"'", "'\"regex\"'", "'.'", "'{'", "'}'", "'includes'", "','", "'with'", "';'", "'num'", "'length'", "'pattern'", "'format'", "'-'", "'['", "']'", "'root'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_NULL=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==39) ) {
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


    // $ANTLR start "entryRuleMainObject"
    // InternalJSchema.g:128:1: entryRuleMainObject : ruleMainObject EOF ;
    public final void entryRuleMainObject() throws RecognitionException {
        try {
            // InternalJSchema.g:129:1: ( ruleMainObject EOF )
            // InternalJSchema.g:130:1: ruleMainObject EOF
            {
             before(grammarAccess.getMainObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleMainObject();

            state._fsp--;

             after(grammarAccess.getMainObjectRule()); 
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
    // $ANTLR end "entryRuleMainObject"


    // $ANTLR start "ruleMainObject"
    // InternalJSchema.g:137:1: ruleMainObject : ( ( rule__MainObject__Group__0 ) ) ;
    public final void ruleMainObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:141:2: ( ( ( rule__MainObject__Group__0 ) ) )
            // InternalJSchema.g:142:2: ( ( rule__MainObject__Group__0 ) )
            {
            // InternalJSchema.g:142:2: ( ( rule__MainObject__Group__0 ) )
            // InternalJSchema.g:143:3: ( rule__MainObject__Group__0 )
            {
             before(grammarAccess.getMainObjectAccess().getGroup()); 
            // InternalJSchema.g:144:3: ( rule__MainObject__Group__0 )
            // InternalJSchema.g:144:4: rule__MainObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainObject"


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


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalJSchema.g:178:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // InternalJSchema.g:179:1: ( rulePrimitiveTypes EOF )
            // InternalJSchema.g:180:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
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
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalJSchema.g:187:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:191:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // InternalJSchema.g:192:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // InternalJSchema.g:192:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            // InternalJSchema.g:193:3: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // InternalJSchema.g:194:3: ( rule__PrimitiveTypes__Alternatives )
            // InternalJSchema.g:194:4: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "entryRuleIsRoot"
    // InternalJSchema.g:203:1: entryRuleIsRoot : ruleIsRoot EOF ;
    public final void entryRuleIsRoot() throws RecognitionException {
        try {
            // InternalJSchema.g:204:1: ( ruleIsRoot EOF )
            // InternalJSchema.g:205:1: ruleIsRoot EOF
            {
             before(grammarAccess.getIsRootRule()); 
            pushFollow(FOLLOW_1);
            ruleIsRoot();

            state._fsp--;

             after(grammarAccess.getIsRootRule()); 
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
    // $ANTLR end "entryRuleIsRoot"


    // $ANTLR start "ruleIsRoot"
    // InternalJSchema.g:212:1: ruleIsRoot : ( ( rule__IsRoot__StringAssignment ) ) ;
    public final void ruleIsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:216:2: ( ( ( rule__IsRoot__StringAssignment ) ) )
            // InternalJSchema.g:217:2: ( ( rule__IsRoot__StringAssignment ) )
            {
            // InternalJSchema.g:217:2: ( ( rule__IsRoot__StringAssignment ) )
            // InternalJSchema.g:218:3: ( rule__IsRoot__StringAssignment )
            {
             before(grammarAccess.getIsRootAccess().getStringAssignment()); 
            // InternalJSchema.g:219:3: ( rule__IsRoot__StringAssignment )
            // InternalJSchema.g:219:4: rule__IsRoot__StringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IsRoot__StringAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIsRootAccess().getStringAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsRoot"


    // $ANTLR start "entryRulehasProperties"
    // InternalJSchema.g:228:1: entryRulehasProperties : rulehasProperties EOF ;
    public final void entryRulehasProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:229:1: ( rulehasProperties EOF )
            // InternalJSchema.g:230:1: rulehasProperties EOF
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
    // InternalJSchema.g:237:1: rulehasProperties : ( ( rule__HasProperties__PropertiesAssignment ) ) ;
    public final void rulehasProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:241:2: ( ( ( rule__HasProperties__PropertiesAssignment ) ) )
            // InternalJSchema.g:242:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            {
            // InternalJSchema.g:242:2: ( ( rule__HasProperties__PropertiesAssignment ) )
            // InternalJSchema.g:243:3: ( rule__HasProperties__PropertiesAssignment )
            {
             before(grammarAccess.getHasPropertiesAccess().getPropertiesAssignment()); 
            // InternalJSchema.g:244:3: ( rule__HasProperties__PropertiesAssignment )
            // InternalJSchema.g:244:4: rule__HasProperties__PropertiesAssignment
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
    // InternalJSchema.g:253:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalJSchema.g:254:1: ( ruleProperty EOF )
            // InternalJSchema.g:255:1: ruleProperty EOF
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
    // InternalJSchema.g:262:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:266:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalJSchema.g:267:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalJSchema.g:267:2: ( ( rule__Property__Alternatives ) )
            // InternalJSchema.g:268:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalJSchema.g:269:3: ( rule__Property__Alternatives )
            // InternalJSchema.g:269:4: rule__Property__Alternatives
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
    // InternalJSchema.g:278:1: entryRulePrimitiveProperties : rulePrimitiveProperties EOF ;
    public final void entryRulePrimitiveProperties() throws RecognitionException {
        try {
            // InternalJSchema.g:279:1: ( rulePrimitiveProperties EOF )
            // InternalJSchema.g:280:1: rulePrimitiveProperties EOF
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
    // InternalJSchema.g:287:1: rulePrimitiveProperties : ( ( rule__PrimitiveProperties__Alternatives ) ) ;
    public final void rulePrimitiveProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:291:2: ( ( ( rule__PrimitiveProperties__Alternatives ) ) )
            // InternalJSchema.g:292:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            {
            // InternalJSchema.g:292:2: ( ( rule__PrimitiveProperties__Alternatives ) )
            // InternalJSchema.g:293:3: ( rule__PrimitiveProperties__Alternatives )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getAlternatives()); 
            // InternalJSchema.g:294:3: ( rule__PrimitiveProperties__Alternatives )
            // InternalJSchema.g:294:4: rule__PrimitiveProperties__Alternatives
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
    // InternalJSchema.g:303:1: entryRuleStringLength : ruleStringLength EOF ;
    public final void entryRuleStringLength() throws RecognitionException {
        try {
            // InternalJSchema.g:304:1: ( ruleStringLength EOF )
            // InternalJSchema.g:305:1: ruleStringLength EOF
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
    // InternalJSchema.g:312:1: ruleStringLength : ( ( rule__StringLength__Group__0 ) ) ;
    public final void ruleStringLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:316:2: ( ( ( rule__StringLength__Group__0 ) ) )
            // InternalJSchema.g:317:2: ( ( rule__StringLength__Group__0 ) )
            {
            // InternalJSchema.g:317:2: ( ( rule__StringLength__Group__0 ) )
            // InternalJSchema.g:318:3: ( rule__StringLength__Group__0 )
            {
             before(grammarAccess.getStringLengthAccess().getGroup()); 
            // InternalJSchema.g:319:3: ( rule__StringLength__Group__0 )
            // InternalJSchema.g:319:4: rule__StringLength__Group__0
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
    // InternalJSchema.g:328:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalJSchema.g:329:1: ( ruleIncludes EOF )
            // InternalJSchema.g:330:1: ruleIncludes EOF
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
    // InternalJSchema.g:337:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:341:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalJSchema.g:342:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalJSchema.g:342:2: ( ( rule__Includes__Group__0 ) )
            // InternalJSchema.g:343:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalJSchema.g:344:3: ( rule__Includes__Group__0 )
            // InternalJSchema.g:344:4: rule__Includes__Group__0
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
    // InternalJSchema.g:353:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalJSchema.g:354:1: ( ruleArray EOF )
            // InternalJSchema.g:355:1: ruleArray EOF
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
    // InternalJSchema.g:362:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:366:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalJSchema.g:367:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalJSchema.g:367:2: ( ( rule__Array__Group__0 ) )
            // InternalJSchema.g:368:3: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // InternalJSchema.g:369:3: ( rule__Array__Group__0 )
            // InternalJSchema.g:369:4: rule__Array__Group__0
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


    // $ANTLR start "entryRuleArrayType"
    // InternalJSchema.g:378:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalJSchema.g:379:1: ( ruleArrayType EOF )
            // InternalJSchema.g:380:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalJSchema.g:387:1: ruleArrayType : ( ( rule__ArrayType__Alternatives ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:391:2: ( ( ( rule__ArrayType__Alternatives ) ) )
            // InternalJSchema.g:392:2: ( ( rule__ArrayType__Alternatives ) )
            {
            // InternalJSchema.g:392:2: ( ( rule__ArrayType__Alternatives ) )
            // InternalJSchema.g:393:3: ( rule__ArrayType__Alternatives )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives()); 
            // InternalJSchema.g:394:3: ( rule__ArrayType__Alternatives )
            // InternalJSchema.g:394:4: rule__ArrayType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "ruleFormatTypes"
    // InternalJSchema.g:403:1: ruleFormatTypes : ( ( rule__FormatTypes__Alternatives ) ) ;
    public final void ruleFormatTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:407:1: ( ( ( rule__FormatTypes__Alternatives ) ) )
            // InternalJSchema.g:408:2: ( ( rule__FormatTypes__Alternatives ) )
            {
            // InternalJSchema.g:408:2: ( ( rule__FormatTypes__Alternatives ) )
            // InternalJSchema.g:409:3: ( rule__FormatTypes__Alternatives )
            {
             before(grammarAccess.getFormatTypesAccess().getAlternatives()); 
            // InternalJSchema.g:410:3: ( rule__FormatTypes__Alternatives )
            // InternalJSchema.g:410:4: rule__FormatTypes__Alternatives
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
    // InternalJSchema.g:418:1: rule__AbstractObject__Alternatives : ( ( ruleMainObject ) | ( rulePrimitiveObject ) );
    public final void rule__AbstractObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:422:1: ( ( ruleMainObject ) | ( rulePrimitiveObject ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==33||LA2_1==35||LA2_1==46) ) {
                    alt2=1;
                }
                else if ( (LA2_1==44) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==12||LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:423:2: ( ruleMainObject )
                    {
                    // InternalJSchema.g:423:2: ( ruleMainObject )
                    // InternalJSchema.g:424:3: ruleMainObject
                    {
                     before(grammarAccess.getAbstractObjectAccess().getMainObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMainObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractObjectAccess().getMainObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:429:2: ( rulePrimitiveObject )
                    {
                    // InternalJSchema.g:429:2: ( rulePrimitiveObject )
                    // InternalJSchema.g:430:3: rulePrimitiveObject
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


    // $ANTLR start "rule__PrimitiveTypes__Alternatives"
    // InternalJSchema.g:439:1: rule__PrimitiveTypes__Alternatives : ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:443:1: ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 39:
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
                    // InternalJSchema.g:444:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    {
                    // InternalJSchema.g:444:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    // InternalJSchema.g:445:3: ( rule__PrimitiveTypes__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_0()); 
                    // InternalJSchema.g:446:3: ( rule__PrimitiveTypes__Group_0__0 )
                    // InternalJSchema.g:446:4: rule__PrimitiveTypes__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:450:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    {
                    // InternalJSchema.g:450:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    // InternalJSchema.g:451:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1()); 
                    // InternalJSchema.g:452:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    // InternalJSchema.g:452:4: rule__PrimitiveTypes__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__ArrayAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:456:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    {
                    // InternalJSchema.g:456:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    // InternalJSchema.g:457:3: ( rule__PrimitiveTypes__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_2()); 
                    // InternalJSchema.g:458:3: ( rule__PrimitiveTypes__Group_2__0 )
                    // InternalJSchema.g:458:4: rule__PrimitiveTypes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypesAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PrimitiveTypes__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalJSchema.g:466:1: rule__Property__Alternatives : ( ( ( rule__Property__TypeAssignment_0 ) ) | ( ( rule__Property__ObjectAssignment_1 ) ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:470:1: ( ( ( rule__Property__TypeAssignment_0 ) ) | ( ( rule__Property__ObjectAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12||LA4_0==39) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==44) ) {
                    alt4=1;
                }
                else if ( (LA4_2==33||LA4_2==35||LA4_2==46) ) {
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
                    // InternalJSchema.g:471:2: ( ( rule__Property__TypeAssignment_0 ) )
                    {
                    // InternalJSchema.g:471:2: ( ( rule__Property__TypeAssignment_0 ) )
                    // InternalJSchema.g:472:3: ( rule__Property__TypeAssignment_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
                    // InternalJSchema.g:473:3: ( rule__Property__TypeAssignment_0 )
                    // InternalJSchema.g:473:4: rule__Property__TypeAssignment_0
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
                    // InternalJSchema.g:477:2: ( ( rule__Property__ObjectAssignment_1 ) )
                    {
                    // InternalJSchema.g:477:2: ( ( rule__Property__ObjectAssignment_1 ) )
                    // InternalJSchema.g:478:3: ( rule__Property__ObjectAssignment_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getObjectAssignment_1()); 
                    // InternalJSchema.g:479:3: ( rule__Property__ObjectAssignment_1 )
                    // InternalJSchema.g:479:4: rule__Property__ObjectAssignment_1
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
    // InternalJSchema.g:487:1: rule__PrimitiveProperties__Alternatives : ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) );
    public final void rule__PrimitiveProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:491:1: ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
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
                    // InternalJSchema.g:492:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    {
                    // InternalJSchema.g:492:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    // InternalJSchema.g:493:3: ( rule__PrimitiveProperties__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 
                    // InternalJSchema.g:494:3: ( rule__PrimitiveProperties__Group_0__0 )
                    // InternalJSchema.g:494:4: rule__PrimitiveProperties__Group_0__0
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
                    // InternalJSchema.g:498:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    {
                    // InternalJSchema.g:498:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    // InternalJSchema.g:499:3: ( rule__PrimitiveProperties__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 
                    // InternalJSchema.g:500:3: ( rule__PrimitiveProperties__Group_1__0 )
                    // InternalJSchema.g:500:4: rule__PrimitiveProperties__Group_1__0
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
                    // InternalJSchema.g:504:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    {
                    // InternalJSchema.g:504:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    // InternalJSchema.g:505:3: ( rule__PrimitiveProperties__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 
                    // InternalJSchema.g:506:3: ( rule__PrimitiveProperties__Group_2__0 )
                    // InternalJSchema.g:506:4: rule__PrimitiveProperties__Group_2__0
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


    // $ANTLR start "rule__ArrayType__Alternatives"
    // InternalJSchema.g:514:1: rule__ArrayType__Alternatives : ( ( 'String' ) | ( 'Int' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__ArrayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:518:1: ( ( 'String' ) | ( 'Int' ) | ( 'float' ) | ( 'double' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:519:2: ( 'String' )
                    {
                    // InternalJSchema.g:519:2: ( 'String' )
                    // InternalJSchema.g:520:3: 'String'
                    {
                     before(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:525:2: ( 'Int' )
                    {
                    // InternalJSchema.g:525:2: ( 'Int' )
                    // InternalJSchema.g:526:3: 'Int'
                    {
                     before(grammarAccess.getArrayTypeAccess().getIntKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:531:2: ( 'float' )
                    {
                    // InternalJSchema.g:531:2: ( 'float' )
                    // InternalJSchema.g:532:3: 'float'
                    {
                     before(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:537:2: ( 'double' )
                    {
                    // InternalJSchema.g:537:2: ( 'double' )
                    // InternalJSchema.g:538:3: 'double'
                    {
                     before(grammarAccess.getArrayTypeAccess().getDoubleKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getDoubleKeyword_3()); 

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
    // $ANTLR end "rule__ArrayType__Alternatives"


    // $ANTLR start "rule__FormatTypes__Alternatives"
    // InternalJSchema.g:547:1: rule__FormatTypes__Alternatives : ( ( ( '\"date-time\"' ) ) | ( ( '\"time\"' ) ) | ( ( '\"date\"' ) ) | ( ( '\"email\"' ) ) | ( ( '\"idn-email\"' ) ) | ( ( '\"hostname\"' ) ) | ( ( '\"ipv4\"' ) ) | ( ( '\"ipv6\"' ) ) | ( ( '\"uri\"' ) ) | ( ( '\"uri-reference\"' ) ) | ( ( '\"iri\"' ) ) | ( ( '\"iri-reference\"' ) ) | ( ( '\"uri-template\"' ) ) | ( ( '\"json-pointer\"' ) ) | ( ( '\"relative-json-pointer\"' ) ) | ( ( '\"regex\"' ) ) );
    public final void rule__FormatTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:551:1: ( ( ( '\"date-time\"' ) ) | ( ( '\"time\"' ) ) | ( ( '\"date\"' ) ) | ( ( '\"email\"' ) ) | ( ( '\"idn-email\"' ) ) | ( ( '\"hostname\"' ) ) | ( ( '\"ipv4\"' ) ) | ( ( '\"ipv6\"' ) ) | ( ( '\"uri\"' ) ) | ( ( '\"uri-reference\"' ) ) | ( ( '\"iri\"' ) ) | ( ( '\"iri-reference\"' ) ) | ( ( '\"uri-template\"' ) ) | ( ( '\"json-pointer\"' ) ) | ( ( '\"relative-json-pointer\"' ) ) | ( ( '\"regex\"' ) ) )
            int alt7=16;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 24:
                {
                alt7=9;
                }
                break;
            case 25:
                {
                alt7=10;
                }
                break;
            case 26:
                {
                alt7=11;
                }
                break;
            case 27:
                {
                alt7=12;
                }
                break;
            case 28:
                {
                alt7=13;
                }
                break;
            case 29:
                {
                alt7=14;
                }
                break;
            case 30:
                {
                alt7=15;
                }
                break;
            case 31:
                {
                alt7=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:552:2: ( ( '\"date-time\"' ) )
                    {
                    // InternalJSchema.g:552:2: ( ( '\"date-time\"' ) )
                    // InternalJSchema.g:553:3: ( '\"date-time\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0()); 
                    // InternalJSchema.g:554:3: ( '\"date-time\"' )
                    // InternalJSchema.g:554:4: '\"date-time\"'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:558:2: ( ( '\"time\"' ) )
                    {
                    // InternalJSchema.g:558:2: ( ( '\"time\"' ) )
                    // InternalJSchema.g:559:3: ( '\"time\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1()); 
                    // InternalJSchema.g:560:3: ( '\"time\"' )
                    // InternalJSchema.g:560:4: '\"time\"'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:564:2: ( ( '\"date\"' ) )
                    {
                    // InternalJSchema.g:564:2: ( ( '\"date\"' ) )
                    // InternalJSchema.g:565:3: ( '\"date\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2()); 
                    // InternalJSchema.g:566:3: ( '\"date\"' )
                    // InternalJSchema.g:566:4: '\"date\"'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:570:2: ( ( '\"email\"' ) )
                    {
                    // InternalJSchema.g:570:2: ( ( '\"email\"' ) )
                    // InternalJSchema.g:571:3: ( '\"email\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3()); 
                    // InternalJSchema.g:572:3: ( '\"email\"' )
                    // InternalJSchema.g:572:4: '\"email\"'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:576:2: ( ( '\"idn-email\"' ) )
                    {
                    // InternalJSchema.g:576:2: ( ( '\"idn-email\"' ) )
                    // InternalJSchema.g:577:3: ( '\"idn-email\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4()); 
                    // InternalJSchema.g:578:3: ( '\"idn-email\"' )
                    // InternalJSchema.g:578:4: '\"idn-email\"'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:582:2: ( ( '\"hostname\"' ) )
                    {
                    // InternalJSchema.g:582:2: ( ( '\"hostname\"' ) )
                    // InternalJSchema.g:583:3: ( '\"hostname\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5()); 
                    // InternalJSchema.g:584:3: ( '\"hostname\"' )
                    // InternalJSchema.g:584:4: '\"hostname\"'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:588:2: ( ( '\"ipv4\"' ) )
                    {
                    // InternalJSchema.g:588:2: ( ( '\"ipv4\"' ) )
                    // InternalJSchema.g:589:3: ( '\"ipv4\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6()); 
                    // InternalJSchema.g:590:3: ( '\"ipv4\"' )
                    // InternalJSchema.g:590:4: '\"ipv4\"'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:594:2: ( ( '\"ipv6\"' ) )
                    {
                    // InternalJSchema.g:594:2: ( ( '\"ipv6\"' ) )
                    // InternalJSchema.g:595:3: ( '\"ipv6\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7()); 
                    // InternalJSchema.g:596:3: ( '\"ipv6\"' )
                    // InternalJSchema.g:596:4: '\"ipv6\"'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:600:2: ( ( '\"uri\"' ) )
                    {
                    // InternalJSchema.g:600:2: ( ( '\"uri\"' ) )
                    // InternalJSchema.g:601:3: ( '\"uri\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8()); 
                    // InternalJSchema.g:602:3: ( '\"uri\"' )
                    // InternalJSchema.g:602:4: '\"uri\"'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:606:2: ( ( '\"uri-reference\"' ) )
                    {
                    // InternalJSchema.g:606:2: ( ( '\"uri-reference\"' ) )
                    // InternalJSchema.g:607:3: ( '\"uri-reference\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9()); 
                    // InternalJSchema.g:608:3: ( '\"uri-reference\"' )
                    // InternalJSchema.g:608:4: '\"uri-reference\"'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:612:2: ( ( '\"iri\"' ) )
                    {
                    // InternalJSchema.g:612:2: ( ( '\"iri\"' ) )
                    // InternalJSchema.g:613:3: ( '\"iri\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10()); 
                    // InternalJSchema.g:614:3: ( '\"iri\"' )
                    // InternalJSchema.g:614:4: '\"iri\"'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:618:2: ( ( '\"iri-reference\"' ) )
                    {
                    // InternalJSchema.g:618:2: ( ( '\"iri-reference\"' ) )
                    // InternalJSchema.g:619:3: ( '\"iri-reference\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11()); 
                    // InternalJSchema.g:620:3: ( '\"iri-reference\"' )
                    // InternalJSchema.g:620:4: '\"iri-reference\"'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:624:2: ( ( '\"uri-template\"' ) )
                    {
                    // InternalJSchema.g:624:2: ( ( '\"uri-template\"' ) )
                    // InternalJSchema.g:625:3: ( '\"uri-template\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12()); 
                    // InternalJSchema.g:626:3: ( '\"uri-template\"' )
                    // InternalJSchema.g:626:4: '\"uri-template\"'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:630:2: ( ( '\"json-pointer\"' ) )
                    {
                    // InternalJSchema.g:630:2: ( ( '\"json-pointer\"' ) )
                    // InternalJSchema.g:631:3: ( '\"json-pointer\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13()); 
                    // InternalJSchema.g:632:3: ( '\"json-pointer\"' )
                    // InternalJSchema.g:632:4: '\"json-pointer\"'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:636:2: ( ( '\"relative-json-pointer\"' ) )
                    {
                    // InternalJSchema.g:636:2: ( ( '\"relative-json-pointer\"' ) )
                    // InternalJSchema.g:637:3: ( '\"relative-json-pointer\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14()); 
                    // InternalJSchema.g:638:3: ( '\"relative-json-pointer\"' )
                    // InternalJSchema.g:638:4: '\"relative-json-pointer\"'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:642:2: ( ( '\"regex\"' ) )
                    {
                    // InternalJSchema.g:642:2: ( ( '\"regex\"' ) )
                    // InternalJSchema.g:643:3: ( '\"regex\"' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15()); 
                    // InternalJSchema.g:644:3: ( '\"regex\"' )
                    // InternalJSchema.g:644:4: '\"regex\"'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalJSchema.g:652:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:656:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSchema.g:657:2: rule__Number__Group__0__Impl rule__Number__Group__1
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
    // InternalJSchema.g:664:1: rule__Number__Group__0__Impl : ( ( rule__Number__NumberAssignment_0 ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:668:1: ( ( ( rule__Number__NumberAssignment_0 ) ) )
            // InternalJSchema.g:669:1: ( ( rule__Number__NumberAssignment_0 ) )
            {
            // InternalJSchema.g:669:1: ( ( rule__Number__NumberAssignment_0 ) )
            // InternalJSchema.g:670:2: ( rule__Number__NumberAssignment_0 )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment_0()); 
            // InternalJSchema.g:671:2: ( rule__Number__NumberAssignment_0 )
            // InternalJSchema.g:671:3: rule__Number__NumberAssignment_0
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
    // InternalJSchema.g:679:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:683:1: ( rule__Number__Group__1__Impl )
            // InternalJSchema.g:684:2: rule__Number__Group__1__Impl
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
    // InternalJSchema.g:690:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:694:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalJSchema.g:695:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalJSchema.g:695:1: ( ( rule__Number__Group_1__0 )? )
            // InternalJSchema.g:696:2: ( rule__Number__Group_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1()); 
            // InternalJSchema.g:697:2: ( rule__Number__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:697:3: rule__Number__Group_1__0
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
    // InternalJSchema.g:706:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:710:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalJSchema.g:711:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
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
    // InternalJSchema.g:718:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:722:1: ( ( '.' ) )
            // InternalJSchema.g:723:1: ( '.' )
            {
            // InternalJSchema.g:723:1: ( '.' )
            // InternalJSchema.g:724:2: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalJSchema.g:733:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:737:1: ( rule__Number__Group_1__1__Impl )
            // InternalJSchema.g:738:2: rule__Number__Group_1__1__Impl
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
    // InternalJSchema.g:744:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__DecimalAssignment_1_1 ) ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:748:1: ( ( ( rule__Number__DecimalAssignment_1_1 ) ) )
            // InternalJSchema.g:749:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            {
            // InternalJSchema.g:749:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            // InternalJSchema.g:750:2: ( rule__Number__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 
            // InternalJSchema.g:751:2: ( rule__Number__DecimalAssignment_1_1 )
            // InternalJSchema.g:751:3: rule__Number__DecimalAssignment_1_1
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


    // $ANTLR start "rule__MainObject__Group__0"
    // InternalJSchema.g:760:1: rule__MainObject__Group__0 : rule__MainObject__Group__0__Impl rule__MainObject__Group__1 ;
    public final void rule__MainObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:764:1: ( rule__MainObject__Group__0__Impl rule__MainObject__Group__1 )
            // InternalJSchema.g:765:2: rule__MainObject__Group__0__Impl rule__MainObject__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MainObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__1();

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
    // $ANTLR end "rule__MainObject__Group__0"


    // $ANTLR start "rule__MainObject__Group__0__Impl"
    // InternalJSchema.g:772:1: rule__MainObject__Group__0__Impl : ( ( rule__MainObject__ObjectNameAssignment_0 ) ) ;
    public final void rule__MainObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:776:1: ( ( ( rule__MainObject__ObjectNameAssignment_0 ) ) )
            // InternalJSchema.g:777:1: ( ( rule__MainObject__ObjectNameAssignment_0 ) )
            {
            // InternalJSchema.g:777:1: ( ( rule__MainObject__ObjectNameAssignment_0 ) )
            // InternalJSchema.g:778:2: ( rule__MainObject__ObjectNameAssignment_0 )
            {
             before(grammarAccess.getMainObjectAccess().getObjectNameAssignment_0()); 
            // InternalJSchema.g:779:2: ( rule__MainObject__ObjectNameAssignment_0 )
            // InternalJSchema.g:779:3: rule__MainObject__ObjectNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__ObjectNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getObjectNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__0__Impl"


    // $ANTLR start "rule__MainObject__Group__1"
    // InternalJSchema.g:787:1: rule__MainObject__Group__1 : rule__MainObject__Group__1__Impl rule__MainObject__Group__2 ;
    public final void rule__MainObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:791:1: ( rule__MainObject__Group__1__Impl rule__MainObject__Group__2 )
            // InternalJSchema.g:792:2: rule__MainObject__Group__1__Impl rule__MainObject__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MainObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__2();

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
    // $ANTLR end "rule__MainObject__Group__1"


    // $ANTLR start "rule__MainObject__Group__1__Impl"
    // InternalJSchema.g:799:1: rule__MainObject__Group__1__Impl : ( ( rule__MainObject__RootAssignment_1 )? ) ;
    public final void rule__MainObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:803:1: ( ( ( rule__MainObject__RootAssignment_1 )? ) )
            // InternalJSchema.g:804:1: ( ( rule__MainObject__RootAssignment_1 )? )
            {
            // InternalJSchema.g:804:1: ( ( rule__MainObject__RootAssignment_1 )? )
            // InternalJSchema.g:805:2: ( rule__MainObject__RootAssignment_1 )?
            {
             before(grammarAccess.getMainObjectAccess().getRootAssignment_1()); 
            // InternalJSchema.g:806:2: ( rule__MainObject__RootAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==46) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:806:3: rule__MainObject__RootAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainObject__RootAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainObjectAccess().getRootAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__1__Impl"


    // $ANTLR start "rule__MainObject__Group__2"
    // InternalJSchema.g:814:1: rule__MainObject__Group__2 : rule__MainObject__Group__2__Impl rule__MainObject__Group__3 ;
    public final void rule__MainObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:818:1: ( rule__MainObject__Group__2__Impl rule__MainObject__Group__3 )
            // InternalJSchema.g:819:2: rule__MainObject__Group__2__Impl rule__MainObject__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MainObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__3();

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
    // $ANTLR end "rule__MainObject__Group__2"


    // $ANTLR start "rule__MainObject__Group__2__Impl"
    // InternalJSchema.g:826:1: rule__MainObject__Group__2__Impl : ( ( rule__MainObject__Group_2__0 )? ) ;
    public final void rule__MainObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:830:1: ( ( ( rule__MainObject__Group_2__0 )? ) )
            // InternalJSchema.g:831:1: ( ( rule__MainObject__Group_2__0 )? )
            {
            // InternalJSchema.g:831:1: ( ( rule__MainObject__Group_2__0 )? )
            // InternalJSchema.g:832:2: ( rule__MainObject__Group_2__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_2()); 
            // InternalJSchema.g:833:2: ( rule__MainObject__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:833:3: rule__MainObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__2__Impl"


    // $ANTLR start "rule__MainObject__Group__3"
    // InternalJSchema.g:841:1: rule__MainObject__Group__3 : rule__MainObject__Group__3__Impl rule__MainObject__Group__4 ;
    public final void rule__MainObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:845:1: ( rule__MainObject__Group__3__Impl rule__MainObject__Group__4 )
            // InternalJSchema.g:846:2: rule__MainObject__Group__3__Impl rule__MainObject__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MainObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__4();

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
    // $ANTLR end "rule__MainObject__Group__3"


    // $ANTLR start "rule__MainObject__Group__3__Impl"
    // InternalJSchema.g:853:1: rule__MainObject__Group__3__Impl : ( '{' ) ;
    public final void rule__MainObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:857:1: ( ( '{' ) )
            // InternalJSchema.g:858:1: ( '{' )
            {
            // InternalJSchema.g:858:1: ( '{' )
            // InternalJSchema.g:859:2: '{'
            {
             before(grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__3__Impl"


    // $ANTLR start "rule__MainObject__Group__4"
    // InternalJSchema.g:868:1: rule__MainObject__Group__4 : rule__MainObject__Group__4__Impl rule__MainObject__Group__5 ;
    public final void rule__MainObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:872:1: ( rule__MainObject__Group__4__Impl rule__MainObject__Group__5 )
            // InternalJSchema.g:873:2: rule__MainObject__Group__4__Impl rule__MainObject__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MainObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group__5();

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
    // $ANTLR end "rule__MainObject__Group__4"


    // $ANTLR start "rule__MainObject__Group__4__Impl"
    // InternalJSchema.g:880:1: rule__MainObject__Group__4__Impl : ( ( rule__MainObject__Group_4__0 )? ) ;
    public final void rule__MainObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:884:1: ( ( ( rule__MainObject__Group_4__0 )? ) )
            // InternalJSchema.g:885:1: ( ( rule__MainObject__Group_4__0 )? )
            {
            // InternalJSchema.g:885:1: ( ( rule__MainObject__Group_4__0 )? )
            // InternalJSchema.g:886:2: ( rule__MainObject__Group_4__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4()); 
            // InternalJSchema.g:887:2: ( rule__MainObject__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==12||LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSchema.g:887:3: rule__MainObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainObjectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__4__Impl"


    // $ANTLR start "rule__MainObject__Group__5"
    // InternalJSchema.g:895:1: rule__MainObject__Group__5 : rule__MainObject__Group__5__Impl ;
    public final void rule__MainObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:899:1: ( rule__MainObject__Group__5__Impl )
            // InternalJSchema.g:900:2: rule__MainObject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group__5__Impl();

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
    // $ANTLR end "rule__MainObject__Group__5"


    // $ANTLR start "rule__MainObject__Group__5__Impl"
    // InternalJSchema.g:906:1: rule__MainObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MainObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:910:1: ( ( '}' ) )
            // InternalJSchema.g:911:1: ( '}' )
            {
            // InternalJSchema.g:911:1: ( '}' )
            // InternalJSchema.g:912:2: '}'
            {
             before(grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group__5__Impl"


    // $ANTLR start "rule__MainObject__Group_2__0"
    // InternalJSchema.g:922:1: rule__MainObject__Group_2__0 : rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1 ;
    public final void rule__MainObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:926:1: ( rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1 )
            // InternalJSchema.g:927:2: rule__MainObject__Group_2__0__Impl rule__MainObject__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__MainObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group_2__1();

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
    // $ANTLR end "rule__MainObject__Group_2__0"


    // $ANTLR start "rule__MainObject__Group_2__0__Impl"
    // InternalJSchema.g:934:1: rule__MainObject__Group_2__0__Impl : ( 'includes' ) ;
    public final void rule__MainObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:938:1: ( ( 'includes' ) )
            // InternalJSchema.g:939:1: ( 'includes' )
            {
            // InternalJSchema.g:939:1: ( 'includes' )
            // InternalJSchema.g:940:2: 'includes'
            {
             before(grammarAccess.getMainObjectAccess().getIncludesKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getIncludesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_2__0__Impl"


    // $ANTLR start "rule__MainObject__Group_2__1"
    // InternalJSchema.g:949:1: rule__MainObject__Group_2__1 : rule__MainObject__Group_2__1__Impl ;
    public final void rule__MainObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:953:1: ( rule__MainObject__Group_2__1__Impl )
            // InternalJSchema.g:954:2: rule__MainObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group_2__1__Impl();

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
    // $ANTLR end "rule__MainObject__Group_2__1"


    // $ANTLR start "rule__MainObject__Group_2__1__Impl"
    // InternalJSchema.g:960:1: rule__MainObject__Group_2__1__Impl : ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) ) ;
    public final void rule__MainObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:964:1: ( ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) ) )
            // InternalJSchema.g:965:1: ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) )
            {
            // InternalJSchema.g:965:1: ( ( rule__MainObject__IncludeObjectsAssignment_2_1 ) )
            // InternalJSchema.g:966:2: ( rule__MainObject__IncludeObjectsAssignment_2_1 )
            {
             before(grammarAccess.getMainObjectAccess().getIncludeObjectsAssignment_2_1()); 
            // InternalJSchema.g:967:2: ( rule__MainObject__IncludeObjectsAssignment_2_1 )
            // InternalJSchema.g:967:3: rule__MainObject__IncludeObjectsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__IncludeObjectsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getIncludeObjectsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_2__1__Impl"


    // $ANTLR start "rule__MainObject__Group_4__0"
    // InternalJSchema.g:976:1: rule__MainObject__Group_4__0 : rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 ;
    public final void rule__MainObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:980:1: ( rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 )
            // InternalJSchema.g:981:2: rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__MainObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4__1();

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
    // $ANTLR end "rule__MainObject__Group_4__0"


    // $ANTLR start "rule__MainObject__Group_4__0__Impl"
    // InternalJSchema.g:988:1: rule__MainObject__Group_4__0__Impl : ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) ;
    public final void rule__MainObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:992:1: ( ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) )
            // InternalJSchema.g:993:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            {
            // InternalJSchema.g:993:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            // InternalJSchema.g:994:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0()); 
            // InternalJSchema.g:995:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            // InternalJSchema.g:995:3: rule__MainObject__PropertiesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__PropertiesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4__0__Impl"


    // $ANTLR start "rule__MainObject__Group_4__1"
    // InternalJSchema.g:1003:1: rule__MainObject__Group_4__1 : rule__MainObject__Group_4__1__Impl ;
    public final void rule__MainObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1007:1: ( rule__MainObject__Group_4__1__Impl )
            // InternalJSchema.g:1008:2: rule__MainObject__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4__1__Impl();

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
    // $ANTLR end "rule__MainObject__Group_4__1"


    // $ANTLR start "rule__MainObject__Group_4__1__Impl"
    // InternalJSchema.g:1014:1: rule__MainObject__Group_4__1__Impl : ( ( rule__MainObject__Group_4_1__0 )* ) ;
    public final void rule__MainObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1018:1: ( ( ( rule__MainObject__Group_4_1__0 )* ) )
            // InternalJSchema.g:1019:1: ( ( rule__MainObject__Group_4_1__0 )* )
            {
            // InternalJSchema.g:1019:1: ( ( rule__MainObject__Group_4_1__0 )* )
            // InternalJSchema.g:1020:2: ( rule__MainObject__Group_4_1__0 )*
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4_1()); 
            // InternalJSchema.g:1021:2: ( rule__MainObject__Group_4_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJSchema.g:1021:3: rule__MainObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMainObjectAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4__1__Impl"


    // $ANTLR start "rule__MainObject__Group_4_1__0"
    // InternalJSchema.g:1030:1: rule__MainObject__Group_4_1__0 : rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 ;
    public final void rule__MainObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1034:1: ( rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 )
            // InternalJSchema.g:1035:2: rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MainObject__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4_1__1();

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
    // $ANTLR end "rule__MainObject__Group_4_1__0"


    // $ANTLR start "rule__MainObject__Group_4_1__0__Impl"
    // InternalJSchema.g:1042:1: rule__MainObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MainObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1046:1: ( ( ',' ) )
            // InternalJSchema.g:1047:1: ( ',' )
            {
            // InternalJSchema.g:1047:1: ( ',' )
            // InternalJSchema.g:1048:2: ','
            {
             before(grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4_1__0__Impl"


    // $ANTLR start "rule__MainObject__Group_4_1__1"
    // InternalJSchema.g:1057:1: rule__MainObject__Group_4_1__1 : rule__MainObject__Group_4_1__1__Impl ;
    public final void rule__MainObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1061:1: ( rule__MainObject__Group_4_1__1__Impl )
            // InternalJSchema.g:1062:2: rule__MainObject__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__MainObject__Group_4_1__1"


    // $ANTLR start "rule__MainObject__Group_4_1__1__Impl"
    // InternalJSchema.g:1068:1: rule__MainObject__Group_4_1__1__Impl : ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) ;
    public final void rule__MainObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1072:1: ( ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) )
            // InternalJSchema.g:1073:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            {
            // InternalJSchema.g:1073:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            // InternalJSchema.g:1074:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1()); 
            // InternalJSchema.g:1075:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            // InternalJSchema.g:1075:3: rule__MainObject__PropertiesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__PropertiesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__Group_4_1__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group__0"
    // InternalJSchema.g:1084:1: rule__PrimitiveObject__Group__0 : rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 ;
    public final void rule__PrimitiveObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1088:1: ( rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 )
            // InternalJSchema.g:1089:2: rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalJSchema.g:1096:1: rule__PrimitiveObject__Group__0__Impl : ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1100:1: ( ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) )
            // InternalJSchema.g:1101:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            {
            // InternalJSchema.g:1101:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            // InternalJSchema.g:1102:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 
            // InternalJSchema.g:1103:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            // InternalJSchema.g:1103:3: rule__PrimitiveObject__TypeAssignment_0
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
    // InternalJSchema.g:1111:1: rule__PrimitiveObject__Group__1 : rule__PrimitiveObject__Group__1__Impl ;
    public final void rule__PrimitiveObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1115:1: ( rule__PrimitiveObject__Group__1__Impl )
            // InternalJSchema.g:1116:2: rule__PrimitiveObject__Group__1__Impl
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
    // InternalJSchema.g:1122:1: rule__PrimitiveObject__Group__1__Impl : ( ( rule__PrimitiveObject__Group_1__0 )? ) ;
    public final void rule__PrimitiveObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1126:1: ( ( ( rule__PrimitiveObject__Group_1__0 )? ) )
            // InternalJSchema.g:1127:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            {
            // InternalJSchema.g:1127:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            // InternalJSchema.g:1128:2: ( rule__PrimitiveObject__Group_1__0 )?
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 
            // InternalJSchema.g:1129:2: ( rule__PrimitiveObject__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:1129:3: rule__PrimitiveObject__Group_1__0
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
    // InternalJSchema.g:1138:1: rule__PrimitiveObject__Group_1__0 : rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 ;
    public final void rule__PrimitiveObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1142:1: ( rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 )
            // InternalJSchema.g:1143:2: rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:1150:1: rule__PrimitiveObject__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__PrimitiveObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1154:1: ( ( 'with' ) )
            // InternalJSchema.g:1155:1: ( 'with' )
            {
            // InternalJSchema.g:1155:1: ( 'with' )
            // InternalJSchema.g:1156:2: 'with'
            {
             before(grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalJSchema.g:1165:1: rule__PrimitiveObject__Group_1__1 : rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 ;
    public final void rule__PrimitiveObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1169:1: ( rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 )
            // InternalJSchema.g:1170:2: rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalJSchema.g:1177:1: rule__PrimitiveObject__Group_1__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1181:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) )
            // InternalJSchema.g:1182:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            {
            // InternalJSchema.g:1182:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            // InternalJSchema.g:1183:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 
            // InternalJSchema.g:1184:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            // InternalJSchema.g:1184:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1
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
    // InternalJSchema.g:1192:1: rule__PrimitiveObject__Group_1__2 : rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 ;
    public final void rule__PrimitiveObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1196:1: ( rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 )
            // InternalJSchema.g:1197:2: rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalJSchema.g:1204:1: rule__PrimitiveObject__Group_1__2__Impl : ( ( rule__PrimitiveObject__Group_1_2__0 )* ) ;
    public final void rule__PrimitiveObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1208:1: ( ( ( rule__PrimitiveObject__Group_1_2__0 )* ) )
            // InternalJSchema.g:1209:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            {
            // InternalJSchema.g:1209:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            // InternalJSchema.g:1210:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 
            // InternalJSchema.g:1211:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJSchema.g:1211:3: rule__PrimitiveObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PrimitiveObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJSchema.g:1219:1: rule__PrimitiveObject__Group_1__3 : rule__PrimitiveObject__Group_1__3__Impl ;
    public final void rule__PrimitiveObject__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1223:1: ( rule__PrimitiveObject__Group_1__3__Impl )
            // InternalJSchema.g:1224:2: rule__PrimitiveObject__Group_1__3__Impl
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
    // InternalJSchema.g:1230:1: rule__PrimitiveObject__Group_1__3__Impl : ( ';' ) ;
    public final void rule__PrimitiveObject__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1234:1: ( ( ';' ) )
            // InternalJSchema.g:1235:1: ( ';' )
            {
            // InternalJSchema.g:1235:1: ( ';' )
            // InternalJSchema.g:1236:2: ';'
            {
             before(grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalJSchema.g:1246:1: rule__PrimitiveObject__Group_1_2__0 : rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 ;
    public final void rule__PrimitiveObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1250:1: ( rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 )
            // InternalJSchema.g:1251:2: rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:1258:1: rule__PrimitiveObject__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1262:1: ( ( ',' ) )
            // InternalJSchema.g:1263:1: ( ',' )
            {
            // InternalJSchema.g:1263:1: ( ',' )
            // InternalJSchema.g:1264:2: ','
            {
             before(grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJSchema.g:1273:1: rule__PrimitiveObject__Group_1_2__1 : rule__PrimitiveObject__Group_1_2__1__Impl ;
    public final void rule__PrimitiveObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1277:1: ( rule__PrimitiveObject__Group_1_2__1__Impl )
            // InternalJSchema.g:1278:2: rule__PrimitiveObject__Group_1_2__1__Impl
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
    // InternalJSchema.g:1284:1: rule__PrimitiveObject__Group_1_2__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1288:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) )
            // InternalJSchema.g:1289:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            {
            // InternalJSchema.g:1289:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            // InternalJSchema.g:1290:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 
            // InternalJSchema.g:1291:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            // InternalJSchema.g:1291:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1
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


    // $ANTLR start "rule__PrimitiveTypes__Group_0__0"
    // InternalJSchema.g:1300:1: rule__PrimitiveTypes__Group_0__0 : rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 ;
    public final void rule__PrimitiveTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1304:1: ( rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 )
            // InternalJSchema.g:1305:2: rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__PrimitiveTypes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__1();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_0__0"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__0__Impl"
    // InternalJSchema.g:1312:1: rule__PrimitiveTypes__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimitiveTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1316:1: ( ( () ) )
            // InternalJSchema.g:1317:1: ( () )
            {
            // InternalJSchema.g:1317:1: ( () )
            // InternalJSchema.g:1318:2: ()
            {
             before(grammarAccess.getPrimitiveTypesAccess().getSTRINGAction_0_0()); 
            // InternalJSchema.g:1319:2: ()
            // InternalJSchema.g:1319:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypesAccess().getSTRINGAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__1"
    // InternalJSchema.g:1327:1: rule__PrimitiveTypes__Group_0__1 : rule__PrimitiveTypes__Group_0__1__Impl rule__PrimitiveTypes__Group_0__2 ;
    public final void rule__PrimitiveTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1331:1: ( rule__PrimitiveTypes__Group_0__1__Impl rule__PrimitiveTypes__Group_0__2 )
            // InternalJSchema.g:1332:2: rule__PrimitiveTypes__Group_0__1__Impl rule__PrimitiveTypes__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveTypes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__2();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_0__1"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__1__Impl"
    // InternalJSchema.g:1339:1: rule__PrimitiveTypes__Group_0__1__Impl : ( 'String' ) ;
    public final void rule__PrimitiveTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1343:1: ( ( 'String' ) )
            // InternalJSchema.g:1344:1: ( 'String' )
            {
            // InternalJSchema.g:1344:1: ( 'String' )
            // InternalJSchema.g:1345:2: 'String'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__1__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__2"
    // InternalJSchema.g:1354:1: rule__PrimitiveTypes__Group_0__2 : rule__PrimitiveTypes__Group_0__2__Impl ;
    public final void rule__PrimitiveTypes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1358:1: ( rule__PrimitiveTypes__Group_0__2__Impl )
            // InternalJSchema.g:1359:2: rule__PrimitiveTypes__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__2__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_0__2"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__2__Impl"
    // InternalJSchema.g:1365:1: rule__PrimitiveTypes__Group_0__2__Impl : ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) ) ;
    public final void rule__PrimitiveTypes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1369:1: ( ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) ) )
            // InternalJSchema.g:1370:1: ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) )
            {
            // InternalJSchema.g:1370:1: ( ( rule__PrimitiveTypes__StringAssignment_0_2 ) )
            // InternalJSchema.g:1371:2: ( rule__PrimitiveTypes__StringAssignment_0_2 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_2()); 
            // InternalJSchema.g:1372:2: ( rule__PrimitiveTypes__StringAssignment_0_2 )
            // InternalJSchema.g:1372:3: rule__PrimitiveTypes__StringAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__StringAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getStringAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__2__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__0"
    // InternalJSchema.g:1381:1: rule__PrimitiveTypes__Group_2__0 : rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 ;
    public final void rule__PrimitiveTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1385:1: ( rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 )
            // InternalJSchema.g:1386:2: rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__1();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__0"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__0__Impl"
    // InternalJSchema.g:1393:1: rule__PrimitiveTypes__Group_2__0__Impl : ( 'num' ) ;
    public final void rule__PrimitiveTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1397:1: ( ( 'num' ) )
            // InternalJSchema.g:1398:1: ( 'num' )
            {
            // InternalJSchema.g:1398:1: ( 'num' )
            // InternalJSchema.g:1399:2: 'num'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__1"
    // InternalJSchema.g:1408:1: rule__PrimitiveTypes__Group_2__1 : rule__PrimitiveTypes__Group_2__1__Impl ;
    public final void rule__PrimitiveTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1412:1: ( rule__PrimitiveTypes__Group_2__1__Impl )
            // InternalJSchema.g:1413:2: rule__PrimitiveTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__1"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__1__Impl"
    // InternalJSchema.g:1419:1: rule__PrimitiveTypes__Group_2__1__Impl : ( ( rule__PrimitiveTypes__NumberAssignment_2_1 ) ) ;
    public final void rule__PrimitiveTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1423:1: ( ( ( rule__PrimitiveTypes__NumberAssignment_2_1 ) ) )
            // InternalJSchema.g:1424:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_1 ) )
            {
            // InternalJSchema.g:1424:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_1 ) )
            // InternalJSchema.g:1425:2: ( rule__PrimitiveTypes__NumberAssignment_2_1 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_1()); 
            // InternalJSchema.g:1426:2: ( rule__PrimitiveTypes__NumberAssignment_2_1 )
            // InternalJSchema.g:1426:3: rule__PrimitiveTypes__NumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__NumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__1__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0"
    // InternalJSchema.g:1435:1: rule__PrimitiveProperties__Group_0__0 : rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 ;
    public final void rule__PrimitiveProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1439:1: ( rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 )
            // InternalJSchema.g:1440:2: rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1
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
    // InternalJSchema.g:1447:1: rule__PrimitiveProperties__Group_0__0__Impl : ( 'length' ) ;
    public final void rule__PrimitiveProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1451:1: ( ( 'length' ) )
            // InternalJSchema.g:1452:1: ( 'length' )
            {
            // InternalJSchema.g:1452:1: ( 'length' )
            // InternalJSchema.g:1453:2: 'length'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJSchema.g:1462:1: rule__PrimitiveProperties__Group_0__1 : rule__PrimitiveProperties__Group_0__1__Impl ;
    public final void rule__PrimitiveProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1466:1: ( rule__PrimitiveProperties__Group_0__1__Impl )
            // InternalJSchema.g:1467:2: rule__PrimitiveProperties__Group_0__1__Impl
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
    // InternalJSchema.g:1473:1: rule__PrimitiveProperties__Group_0__1__Impl : ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1477:1: ( ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) ) )
            // InternalJSchema.g:1478:1: ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) )
            {
            // InternalJSchema.g:1478:1: ( ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 ) )
            // InternalJSchema.g:1479:2: ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLenghtAssignment_0_1()); 
            // InternalJSchema.g:1480:2: ( rule__PrimitiveProperties__StringLenghtAssignment_0_1 )
            // InternalJSchema.g:1480:3: rule__PrimitiveProperties__StringLenghtAssignment_0_1
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
    // InternalJSchema.g:1489:1: rule__PrimitiveProperties__Group_1__0 : rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 ;
    public final void rule__PrimitiveProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1493:1: ( rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 )
            // InternalJSchema.g:1494:2: rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1
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
    // InternalJSchema.g:1501:1: rule__PrimitiveProperties__Group_1__0__Impl : ( 'pattern' ) ;
    public final void rule__PrimitiveProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1505:1: ( ( 'pattern' ) )
            // InternalJSchema.g:1506:1: ( 'pattern' )
            {
            // InternalJSchema.g:1506:1: ( 'pattern' )
            // InternalJSchema.g:1507:2: 'pattern'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalJSchema.g:1516:1: rule__PrimitiveProperties__Group_1__1 : rule__PrimitiveProperties__Group_1__1__Impl ;
    public final void rule__PrimitiveProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1520:1: ( rule__PrimitiveProperties__Group_1__1__Impl )
            // InternalJSchema.g:1521:2: rule__PrimitiveProperties__Group_1__1__Impl
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
    // InternalJSchema.g:1527:1: rule__PrimitiveProperties__Group_1__1__Impl : ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1531:1: ( ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) )
            // InternalJSchema.g:1532:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            {
            // InternalJSchema.g:1532:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            // InternalJSchema.g:1533:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 
            // InternalJSchema.g:1534:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            // InternalJSchema.g:1534:3: rule__PrimitiveProperties__PatternStringAssignment_1_1
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
    // InternalJSchema.g:1543:1: rule__PrimitiveProperties__Group_2__0 : rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 ;
    public final void rule__PrimitiveProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1547:1: ( rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 )
            // InternalJSchema.g:1548:2: rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJSchema.g:1555:1: rule__PrimitiveProperties__Group_2__0__Impl : ( 'format' ) ;
    public final void rule__PrimitiveProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1559:1: ( ( 'format' ) )
            // InternalJSchema.g:1560:1: ( 'format' )
            {
            // InternalJSchema.g:1560:1: ( 'format' )
            // InternalJSchema.g:1561:2: 'format'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJSchema.g:1570:1: rule__PrimitiveProperties__Group_2__1 : rule__PrimitiveProperties__Group_2__1__Impl ;
    public final void rule__PrimitiveProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1574:1: ( rule__PrimitiveProperties__Group_2__1__Impl )
            // InternalJSchema.g:1575:2: rule__PrimitiveProperties__Group_2__1__Impl
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
    // InternalJSchema.g:1581:1: rule__PrimitiveProperties__Group_2__1__Impl : ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1585:1: ( ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) )
            // InternalJSchema.g:1586:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            {
            // InternalJSchema.g:1586:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            // InternalJSchema.g:1587:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 
            // InternalJSchema.g:1588:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            // InternalJSchema.g:1588:3: rule__PrimitiveProperties__StringFormatAssignment_2_1
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
    // InternalJSchema.g:1597:1: rule__StringLength__Group__0 : rule__StringLength__Group__0__Impl rule__StringLength__Group__1 ;
    public final void rule__StringLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1601:1: ( rule__StringLength__Group__0__Impl rule__StringLength__Group__1 )
            // InternalJSchema.g:1602:2: rule__StringLength__Group__0__Impl rule__StringLength__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJSchema.g:1609:1: rule__StringLength__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1613:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1614:1: ( RULE_INT )
            {
            // InternalJSchema.g:1614:1: ( RULE_INT )
            // InternalJSchema.g:1615:2: RULE_INT
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
    // InternalJSchema.g:1624:1: rule__StringLength__Group__1 : rule__StringLength__Group__1__Impl rule__StringLength__Group__2 ;
    public final void rule__StringLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1628:1: ( rule__StringLength__Group__1__Impl rule__StringLength__Group__2 )
            // InternalJSchema.g:1629:2: rule__StringLength__Group__1__Impl rule__StringLength__Group__2
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
    // InternalJSchema.g:1636:1: rule__StringLength__Group__1__Impl : ( '-' ) ;
    public final void rule__StringLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1640:1: ( ( '-' ) )
            // InternalJSchema.g:1641:1: ( '-' )
            {
            // InternalJSchema.g:1641:1: ( '-' )
            // InternalJSchema.g:1642:2: '-'
            {
             before(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJSchema.g:1651:1: rule__StringLength__Group__2 : rule__StringLength__Group__2__Impl ;
    public final void rule__StringLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1655:1: ( rule__StringLength__Group__2__Impl )
            // InternalJSchema.g:1656:2: rule__StringLength__Group__2__Impl
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
    // InternalJSchema.g:1662:1: rule__StringLength__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1666:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1667:1: ( RULE_INT )
            {
            // InternalJSchema.g:1667:1: ( RULE_INT )
            // InternalJSchema.g:1668:2: RULE_INT
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
    // InternalJSchema.g:1678:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1682:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalJSchema.g:1683:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalJSchema.g:1690:1: rule__Includes__Group__0__Impl : ( ( rule__Includes__ObjectIDAssignment_0 ) ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1694:1: ( ( ( rule__Includes__ObjectIDAssignment_0 ) ) )
            // InternalJSchema.g:1695:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            {
            // InternalJSchema.g:1695:1: ( ( rule__Includes__ObjectIDAssignment_0 ) )
            // InternalJSchema.g:1696:2: ( rule__Includes__ObjectIDAssignment_0 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_0()); 
            // InternalJSchema.g:1697:2: ( rule__Includes__ObjectIDAssignment_0 )
            // InternalJSchema.g:1697:3: rule__Includes__ObjectIDAssignment_0
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
    // InternalJSchema.g:1705:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1709:1: ( rule__Includes__Group__1__Impl )
            // InternalJSchema.g:1710:2: rule__Includes__Group__1__Impl
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
    // InternalJSchema.g:1716:1: rule__Includes__Group__1__Impl : ( ( rule__Includes__Group_1__0 )* ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1720:1: ( ( ( rule__Includes__Group_1__0 )* ) )
            // InternalJSchema.g:1721:1: ( ( rule__Includes__Group_1__0 )* )
            {
            // InternalJSchema.g:1721:1: ( ( rule__Includes__Group_1__0 )* )
            // InternalJSchema.g:1722:2: ( rule__Includes__Group_1__0 )*
            {
             before(grammarAccess.getIncludesAccess().getGroup_1()); 
            // InternalJSchema.g:1723:2: ( rule__Includes__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJSchema.g:1723:3: rule__Includes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Includes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalJSchema.g:1732:1: rule__Includes__Group_1__0 : rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 ;
    public final void rule__Includes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1736:1: ( rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 )
            // InternalJSchema.g:1737:2: rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1
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
    // InternalJSchema.g:1744:1: rule__Includes__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Includes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1748:1: ( ( ',' ) )
            // InternalJSchema.g:1749:1: ( ',' )
            {
            // InternalJSchema.g:1749:1: ( ',' )
            // InternalJSchema.g:1750:2: ','
            {
             before(grammarAccess.getIncludesAccess().getCommaKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJSchema.g:1759:1: rule__Includes__Group_1__1 : rule__Includes__Group_1__1__Impl ;
    public final void rule__Includes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1763:1: ( rule__Includes__Group_1__1__Impl )
            // InternalJSchema.g:1764:2: rule__Includes__Group_1__1__Impl
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
    // InternalJSchema.g:1770:1: rule__Includes__Group_1__1__Impl : ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) ;
    public final void rule__Includes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1774:1: ( ( ( rule__Includes__ObjectIDAssignment_1_1 ) ) )
            // InternalJSchema.g:1775:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            {
            // InternalJSchema.g:1775:1: ( ( rule__Includes__ObjectIDAssignment_1_1 ) )
            // InternalJSchema.g:1776:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            {
             before(grammarAccess.getIncludesAccess().getObjectIDAssignment_1_1()); 
            // InternalJSchema.g:1777:2: ( rule__Includes__ObjectIDAssignment_1_1 )
            // InternalJSchema.g:1777:3: rule__Includes__ObjectIDAssignment_1_1
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
    // InternalJSchema.g:1786:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1790:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSchema.g:1791:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalJSchema.g:1798:1: rule__Array__Group__0__Impl : ( ( rule__Array__ArrayNameAssignment_0 ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1802:1: ( ( ( rule__Array__ArrayNameAssignment_0 ) ) )
            // InternalJSchema.g:1803:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            {
            // InternalJSchema.g:1803:1: ( ( rule__Array__ArrayNameAssignment_0 ) )
            // InternalJSchema.g:1804:2: ( rule__Array__ArrayNameAssignment_0 )
            {
             before(grammarAccess.getArrayAccess().getArrayNameAssignment_0()); 
            // InternalJSchema.g:1805:2: ( rule__Array__ArrayNameAssignment_0 )
            // InternalJSchema.g:1805:3: rule__Array__ArrayNameAssignment_0
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
    // InternalJSchema.g:1813:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1817:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSchema.g:1818:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalJSchema.g:1825:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1829:1: ( ( '[' ) )
            // InternalJSchema.g:1830:1: ( '[' )
            {
            // InternalJSchema.g:1830:1: ( '[' )
            // InternalJSchema.g:1831:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJSchema.g:1840:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1844:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // InternalJSchema.g:1845:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalJSchema.g:1852:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1856:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // InternalJSchema.g:1857:1: ( ( rule__Array__Group_2__0 )? )
            {
            // InternalJSchema.g:1857:1: ( ( rule__Array__Group_2__0 )? )
            // InternalJSchema.g:1858:2: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // InternalJSchema.g:1859:2: ( rule__Array__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_STRING) ) {
                    alt16=1;
                }
            }
            else if ( (LA16_0==RULE_ID||LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJSchema.g:1859:3: rule__Array__Group_2__0
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
    // InternalJSchema.g:1867:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1871:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // InternalJSchema.g:1872:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Array__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array__Group__4();

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
    // InternalJSchema.g:1879:1: rule__Array__Group__3__Impl : ( ( rule__Array__ArrayTypeAssignment_3 )? ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1883:1: ( ( ( rule__Array__ArrayTypeAssignment_3 )? ) )
            // InternalJSchema.g:1884:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            {
            // InternalJSchema.g:1884:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            // InternalJSchema.g:1885:2: ( rule__Array__ArrayTypeAssignment_3 )?
            {
             before(grammarAccess.getArrayAccess().getArrayTypeAssignment_3()); 
            // InternalJSchema.g:1886:2: ( rule__Array__ArrayTypeAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=15)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJSchema.g:1886:3: rule__Array__ArrayTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Array__ArrayTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getArrayTypeAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Array__Group__4"
    // InternalJSchema.g:1894:1: rule__Array__Group__4 : rule__Array__Group__4__Impl ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1898:1: ( rule__Array__Group__4__Impl )
            // InternalJSchema.g:1899:2: rule__Array__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__4__Impl();

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
    // $ANTLR end "rule__Array__Group__4"


    // $ANTLR start "rule__Array__Group__4__Impl"
    // InternalJSchema.g:1905:1: rule__Array__Group__4__Impl : ( ']' ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1909:1: ( ( ']' ) )
            // InternalJSchema.g:1910:1: ( ']' )
            {
            // InternalJSchema.g:1910:1: ( ']' )
            // InternalJSchema.g:1911:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__4__Impl"


    // $ANTLR start "rule__Array__Group_2__0"
    // InternalJSchema.g:1921:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1925:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // InternalJSchema.g:1926:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalJSchema.g:1933:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__PropertiesAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1937:1: ( ( ( rule__Array__PropertiesAssignment_2_0 ) ) )
            // InternalJSchema.g:1938:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            {
            // InternalJSchema.g:1938:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            // InternalJSchema.g:1939:2: ( rule__Array__PropertiesAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 
            // InternalJSchema.g:1940:2: ( rule__Array__PropertiesAssignment_2_0 )
            // InternalJSchema.g:1940:3: rule__Array__PropertiesAssignment_2_0
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
    // InternalJSchema.g:1948:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1952:1: ( rule__Array__Group_2__1__Impl )
            // InternalJSchema.g:1953:2: rule__Array__Group_2__1__Impl
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
    // InternalJSchema.g:1959:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1963:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // InternalJSchema.g:1964:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // InternalJSchema.g:1964:1: ( ( rule__Array__Group_2_1__0 )* )
            // InternalJSchema.g:1965:2: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // InternalJSchema.g:1966:2: ( rule__Array__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJSchema.g:1966:3: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalJSchema.g:1975:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1979:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // InternalJSchema.g:1980:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalJSchema.g:1987:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1991:1: ( ( ',' ) )
            // InternalJSchema.g:1992:1: ( ',' )
            {
            // InternalJSchema.g:1992:1: ( ',' )
            // InternalJSchema.g:1993:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalJSchema.g:2002:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2006:1: ( rule__Array__Group_2_1__1__Impl )
            // InternalJSchema.g:2007:2: rule__Array__Group_2_1__1__Impl
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
    // InternalJSchema.g:2013:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2017:1: ( ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) )
            // InternalJSchema.g:2018:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            {
            // InternalJSchema.g:2018:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            // InternalJSchema.g:2019:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 
            // InternalJSchema.g:2020:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            // InternalJSchema.g:2020:3: rule__Array__PropertiesAssignment_2_1_1
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
    // InternalJSchema.g:2029:1: rule__Model__AbstractObjectAssignment : ( ruleAbstractObject ) ;
    public final void rule__Model__AbstractObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2033:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:2034:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:2034:2: ( ruleAbstractObject )
            // InternalJSchema.g:2035:3: ruleAbstractObject
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
    // InternalJSchema.g:2044:1: rule__Number__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__Number__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2048:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2049:2: ( RULE_INT )
            {
            // InternalJSchema.g:2049:2: ( RULE_INT )
            // InternalJSchema.g:2050:3: RULE_INT
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
    // InternalJSchema.g:2059:1: rule__Number__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Number__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2063:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2064:2: ( RULE_INT )
            {
            // InternalJSchema.g:2064:2: ( RULE_INT )
            // InternalJSchema.g:2065:3: RULE_INT
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


    // $ANTLR start "rule__MainObject__ObjectNameAssignment_0"
    // InternalJSchema.g:2074:1: rule__MainObject__ObjectNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MainObject__ObjectNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2078:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2079:2: ( RULE_ID )
            {
            // InternalJSchema.g:2079:2: ( RULE_ID )
            // InternalJSchema.g:2080:3: RULE_ID
            {
             before(grammarAccess.getMainObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getObjectNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__ObjectNameAssignment_0"


    // $ANTLR start "rule__MainObject__RootAssignment_1"
    // InternalJSchema.g:2089:1: rule__MainObject__RootAssignment_1 : ( ruleIsRoot ) ;
    public final void rule__MainObject__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2093:1: ( ( ruleIsRoot ) )
            // InternalJSchema.g:2094:2: ( ruleIsRoot )
            {
            // InternalJSchema.g:2094:2: ( ruleIsRoot )
            // InternalJSchema.g:2095:3: ruleIsRoot
            {
             before(grammarAccess.getMainObjectAccess().getRootIsRootParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIsRoot();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getRootIsRootParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__RootAssignment_1"


    // $ANTLR start "rule__MainObject__IncludeObjectsAssignment_2_1"
    // InternalJSchema.g:2104:1: rule__MainObject__IncludeObjectsAssignment_2_1 : ( ruleIncludes ) ;
    public final void rule__MainObject__IncludeObjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2108:1: ( ( ruleIncludes ) )
            // InternalJSchema.g:2109:2: ( ruleIncludes )
            {
            // InternalJSchema.g:2109:2: ( ruleIncludes )
            // InternalJSchema.g:2110:3: ruleIncludes
            {
             before(grammarAccess.getMainObjectAccess().getIncludeObjectsIncludesParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getIncludeObjectsIncludesParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__IncludeObjectsAssignment_2_1"


    // $ANTLR start "rule__MainObject__PropertiesAssignment_4_0"
    // InternalJSchema.g:2119:1: rule__MainObject__PropertiesAssignment_4_0 : ( rulehasProperties ) ;
    public final void rule__MainObject__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2123:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2124:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2124:2: ( rulehasProperties )
            // InternalJSchema.g:2125:3: rulehasProperties
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__PropertiesAssignment_4_0"


    // $ANTLR start "rule__MainObject__PropertiesAssignment_4_1_1"
    // InternalJSchema.g:2134:1: rule__MainObject__PropertiesAssignment_4_1_1 : ( rulehasProperties ) ;
    public final void rule__MainObject__PropertiesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2138:1: ( ( rulehasProperties ) )
            // InternalJSchema.g:2139:2: ( rulehasProperties )
            {
            // InternalJSchema.g:2139:2: ( rulehasProperties )
            // InternalJSchema.g:2140:3: rulehasProperties
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulehasProperties();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getPropertiesHasPropertiesParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__PropertiesAssignment_4_1_1"


    // $ANTLR start "rule__PrimitiveObject__TypeAssignment_0"
    // InternalJSchema.g:2149:1: rule__PrimitiveObject__TypeAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__PrimitiveObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2153:1: ( ( rulePrimitiveTypes ) )
            // InternalJSchema.g:2154:2: ( rulePrimitiveTypes )
            {
            // InternalJSchema.g:2154:2: ( rulePrimitiveTypes )
            // InternalJSchema.g:2155:3: rulePrimitiveTypes
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypePrimitiveTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveObjectAccess().getTypePrimitiveTypesParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2164:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2168:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2169:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2169:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2170:3: rulePrimitiveProperties
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
    // InternalJSchema.g:2179:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2183:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2184:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2184:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2185:3: rulePrimitiveProperties
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


    // $ANTLR start "rule__PrimitiveTypes__StringAssignment_0_2"
    // InternalJSchema.g:2194:1: rule__PrimitiveTypes__StringAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__PrimitiveTypes__StringAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2198:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2199:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2199:2: ( RULE_STRING )
            // InternalJSchema.g:2200:3: RULE_STRING
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__StringAssignment_0_2"


    // $ANTLR start "rule__PrimitiveTypes__ArrayAssignment_1"
    // InternalJSchema.g:2209:1: rule__PrimitiveTypes__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__PrimitiveTypes__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2213:1: ( ( ruleArray ) )
            // InternalJSchema.g:2214:2: ( ruleArray )
            {
            // InternalJSchema.g:2214:2: ( ruleArray )
            // InternalJSchema.g:2215:3: ruleArray
            {
             before(grammarAccess.getPrimitiveTypesAccess().getArrayArrayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getArrayArrayParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__ArrayAssignment_1"


    // $ANTLR start "rule__PrimitiveTypes__NumberAssignment_2_1"
    // InternalJSchema.g:2224:1: rule__PrimitiveTypes__NumberAssignment_2_1 : ( ruleNumber ) ;
    public final void rule__PrimitiveTypes__NumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2228:1: ( ( ruleNumber ) )
            // InternalJSchema.g:2229:2: ( ruleNumber )
            {
            // InternalJSchema.g:2229:2: ( ruleNumber )
            // InternalJSchema.g:2230:3: ruleNumber
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NumberAssignment_2_1"


    // $ANTLR start "rule__IsRoot__StringAssignment"
    // InternalJSchema.g:2239:1: rule__IsRoot__StringAssignment : ( ( 'root' ) ) ;
    public final void rule__IsRoot__StringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2243:1: ( ( ( 'root' ) ) )
            // InternalJSchema.g:2244:2: ( ( 'root' ) )
            {
            // InternalJSchema.g:2244:2: ( ( 'root' ) )
            // InternalJSchema.g:2245:3: ( 'root' )
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            // InternalJSchema.g:2246:3: ( 'root' )
            // InternalJSchema.g:2247:4: 'root'
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 

            }

             after(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsRoot__StringAssignment"


    // $ANTLR start "rule__HasProperties__PropertiesAssignment"
    // InternalJSchema.g:2258:1: rule__HasProperties__PropertiesAssignment : ( ruleProperty ) ;
    public final void rule__HasProperties__PropertiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2262:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2263:2: ( ruleProperty )
            {
            // InternalJSchema.g:2263:2: ( ruleProperty )
            // InternalJSchema.g:2264:3: ruleProperty
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
    // InternalJSchema.g:2273:1: rule__Property__TypeAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2277:1: ( ( rulePrimitiveTypes ) )
            // InternalJSchema.g:2278:2: ( rulePrimitiveTypes )
            {
            // InternalJSchema.g:2278:2: ( rulePrimitiveTypes )
            // InternalJSchema.g:2279:3: rulePrimitiveTypes
            {
             before(grammarAccess.getPropertyAccess().getTypePrimitiveTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypePrimitiveTypesParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2288:1: rule__Property__ObjectAssignment_1 : ( ruleMainObject ) ;
    public final void rule__Property__ObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2292:1: ( ( ruleMainObject ) )
            // InternalJSchema.g:2293:2: ( ruleMainObject )
            {
            // InternalJSchema.g:2293:2: ( ruleMainObject )
            // InternalJSchema.g:2294:3: ruleMainObject
            {
             before(grammarAccess.getPropertyAccess().getObjectMainObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMainObject();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getObjectMainObjectParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2303:1: rule__PrimitiveProperties__StringLenghtAssignment_0_1 : ( ruleStringLength ) ;
    public final void rule__PrimitiveProperties__StringLenghtAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2307:1: ( ( ruleStringLength ) )
            // InternalJSchema.g:2308:2: ( ruleStringLength )
            {
            // InternalJSchema.g:2308:2: ( ruleStringLength )
            // InternalJSchema.g:2309:3: ruleStringLength
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
    // InternalJSchema.g:2318:1: rule__PrimitiveProperties__PatternStringAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PrimitiveProperties__PatternStringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2322:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2323:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2323:2: ( RULE_STRING )
            // InternalJSchema.g:2324:3: RULE_STRING
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
    // InternalJSchema.g:2333:1: rule__PrimitiveProperties__StringFormatAssignment_2_1 : ( ruleFormatTypes ) ;
    public final void rule__PrimitiveProperties__StringFormatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2337:1: ( ( ruleFormatTypes ) )
            // InternalJSchema.g:2338:2: ( ruleFormatTypes )
            {
            // InternalJSchema.g:2338:2: ( ruleFormatTypes )
            // InternalJSchema.g:2339:3: ruleFormatTypes
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
    // InternalJSchema.g:2348:1: rule__Includes__ObjectIDAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2352:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2353:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2353:2: ( RULE_STRING )
            // InternalJSchema.g:2354:3: RULE_STRING
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
    // InternalJSchema.g:2363:1: rule__Includes__ObjectIDAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Includes__ObjectIDAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2367:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2368:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2368:2: ( RULE_STRING )
            // InternalJSchema.g:2369:3: RULE_STRING
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
    // InternalJSchema.g:2378:1: rule__Array__ArrayNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Array__ArrayNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2382:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2383:2: ( RULE_ID )
            {
            // InternalJSchema.g:2383:2: ( RULE_ID )
            // InternalJSchema.g:2384:3: RULE_ID
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
    // InternalJSchema.g:2393:1: rule__Array__PropertiesAssignment_2_0 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2397:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2398:2: ( ruleProperty )
            {
            // InternalJSchema.g:2398:2: ( ruleProperty )
            // InternalJSchema.g:2399:3: ruleProperty
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
    // InternalJSchema.g:2408:1: rule__Array__PropertiesAssignment_2_1_1 : ( ruleProperty ) ;
    public final void rule__Array__PropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2412:1: ( ( ruleProperty ) )
            // InternalJSchema.g:2413:2: ( ruleProperty )
            {
            // InternalJSchema.g:2413:2: ( ruleProperty )
            // InternalJSchema.g:2414:3: ruleProperty
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


    // $ANTLR start "rule__Array__ArrayTypeAssignment_3"
    // InternalJSchema.g:2423:1: rule__Array__ArrayTypeAssignment_3 : ( ruleArrayType ) ;
    public final void rule__Array__ArrayTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2427:1: ( ( ruleArrayType ) )
            // InternalJSchema.g:2428:2: ( ruleArrayType )
            {
            // InternalJSchema.g:2428:2: ( ruleArrayType )
            // InternalJSchema.g:2429:3: ruleArrayType
            {
             before(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ArrayTypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000001022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400A00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008400001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000001020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000FFFF0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000020800000F020L});

}