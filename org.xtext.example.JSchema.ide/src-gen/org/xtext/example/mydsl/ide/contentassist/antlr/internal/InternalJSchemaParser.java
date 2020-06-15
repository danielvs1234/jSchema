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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'integer'", "'float'", "'double'", "'null'", "'date-time'", "'time'", "'date'", "'email'", "'idn-email'", "'hostname'", "'ipv4'", "'ipv6'", "'uri'", "'uri-reference'", "'iri'", "'iri-reference'", "'uri-template'", "'json-pointer'", "'relative-json-pointer'", "'regex'", "'.'", "'{'", "'}'", "','", "'extends'", "'with'", "';'", "'String'", "'num'", "'='", "'length'", "'pattern'", "'format'", "'-'", "'includes'", "'['", "']'", "'root'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=39 && LA1_0<=40)) ) {
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


    // $ANTLR start "entryRuleExtends"
    // InternalJSchema.g:153:1: entryRuleExtends : ruleExtends EOF ;
    public final void entryRuleExtends() throws RecognitionException {
        try {
            // InternalJSchema.g:154:1: ( ruleExtends EOF )
            // InternalJSchema.g:155:1: ruleExtends EOF
            {
             before(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_1);
            ruleExtends();

            state._fsp--;

             after(grammarAccess.getExtendsRule()); 
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
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // InternalJSchema.g:162:1: ruleExtends : ( ( rule__Extends__Group__0 ) ) ;
    public final void ruleExtends() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:166:2: ( ( ( rule__Extends__Group__0 ) ) )
            // InternalJSchema.g:167:2: ( ( rule__Extends__Group__0 ) )
            {
            // InternalJSchema.g:167:2: ( ( rule__Extends__Group__0 ) )
            // InternalJSchema.g:168:3: ( rule__Extends__Group__0 )
            {
             before(grammarAccess.getExtendsAccess().getGroup()); 
            // InternalJSchema.g:169:3: ( rule__Extends__Group__0 )
            // InternalJSchema.g:169:4: rule__Extends__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extends__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:178:1: entryRulePrimitiveObject : rulePrimitiveObject EOF ;
    public final void entryRulePrimitiveObject() throws RecognitionException {
        try {
            // InternalJSchema.g:179:1: ( rulePrimitiveObject EOF )
            // InternalJSchema.g:180:1: rulePrimitiveObject EOF
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
    // InternalJSchema.g:187:1: rulePrimitiveObject : ( ( rule__PrimitiveObject__Group__0 ) ) ;
    public final void rulePrimitiveObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:191:2: ( ( ( rule__PrimitiveObject__Group__0 ) ) )
            // InternalJSchema.g:192:2: ( ( rule__PrimitiveObject__Group__0 ) )
            {
            // InternalJSchema.g:192:2: ( ( rule__PrimitiveObject__Group__0 ) )
            // InternalJSchema.g:193:3: ( rule__PrimitiveObject__Group__0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup()); 
            // InternalJSchema.g:194:3: ( rule__PrimitiveObject__Group__0 )
            // InternalJSchema.g:194:4: rule__PrimitiveObject__Group__0
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
    // InternalJSchema.g:203:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // InternalJSchema.g:204:1: ( rulePrimitiveTypes EOF )
            // InternalJSchema.g:205:1: rulePrimitiveTypes EOF
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
    // InternalJSchema.g:212:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:216:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // InternalJSchema.g:217:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // InternalJSchema.g:217:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            // InternalJSchema.g:218:3: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // InternalJSchema.g:219:3: ( rule__PrimitiveTypes__Alternatives )
            // InternalJSchema.g:219:4: rule__PrimitiveTypes__Alternatives
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
    // InternalJSchema.g:228:1: entryRuleIsRoot : ruleIsRoot EOF ;
    public final void entryRuleIsRoot() throws RecognitionException {
        try {
            // InternalJSchema.g:229:1: ( ruleIsRoot EOF )
            // InternalJSchema.g:230:1: ruleIsRoot EOF
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
    // InternalJSchema.g:237:1: ruleIsRoot : ( ( rule__IsRoot__StringAssignment ) ) ;
    public final void ruleIsRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:241:2: ( ( ( rule__IsRoot__StringAssignment ) ) )
            // InternalJSchema.g:242:2: ( ( rule__IsRoot__StringAssignment ) )
            {
            // InternalJSchema.g:242:2: ( ( rule__IsRoot__StringAssignment ) )
            // InternalJSchema.g:243:3: ( rule__IsRoot__StringAssignment )
            {
             before(grammarAccess.getIsRootAccess().getStringAssignment()); 
            // InternalJSchema.g:244:3: ( rule__IsRoot__StringAssignment )
            // InternalJSchema.g:244:4: rule__IsRoot__StringAssignment
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


    // $ANTLR start "entryRuleArrayType"
    // InternalJSchema.g:353:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalJSchema.g:354:1: ( ruleArrayType EOF )
            // InternalJSchema.g:355:1: ruleArrayType EOF
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
    // InternalJSchema.g:362:1: ruleArrayType : ( ( rule__ArrayType__Alternatives ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:366:2: ( ( ( rule__ArrayType__Alternatives ) ) )
            // InternalJSchema.g:367:2: ( ( rule__ArrayType__Alternatives ) )
            {
            // InternalJSchema.g:367:2: ( ( rule__ArrayType__Alternatives ) )
            // InternalJSchema.g:368:3: ( rule__ArrayType__Alternatives )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives()); 
            // InternalJSchema.g:369:3: ( rule__ArrayType__Alternatives )
            // InternalJSchema.g:369:4: rule__ArrayType__Alternatives
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
    // InternalJSchema.g:378:1: ruleFormatTypes : ( ( rule__FormatTypes__Alternatives ) ) ;
    public final void ruleFormatTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:382:1: ( ( ( rule__FormatTypes__Alternatives ) ) )
            // InternalJSchema.g:383:2: ( ( rule__FormatTypes__Alternatives ) )
            {
            // InternalJSchema.g:383:2: ( ( rule__FormatTypes__Alternatives ) )
            // InternalJSchema.g:384:3: ( rule__FormatTypes__Alternatives )
            {
             before(grammarAccess.getFormatTypesAccess().getAlternatives()); 
            // InternalJSchema.g:385:3: ( rule__FormatTypes__Alternatives )
            // InternalJSchema.g:385:4: rule__FormatTypes__Alternatives
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
    // InternalJSchema.g:393:1: rule__AbstractObject__Alternatives : ( ( ( rule__AbstractObject__MainObjectAssignment_0 ) ) | ( ( rule__AbstractObject__PrimitiveObjectAssignment_1 ) ) );
    public final void rule__AbstractObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:397:1: ( ( ( rule__AbstractObject__MainObjectAssignment_0 ) ) | ( ( rule__AbstractObject__PrimitiveObjectAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID||LA2_1==33||LA2_1==36||LA2_1==46||LA2_1==49) ) {
                    alt2=1;
                }
                else if ( (LA2_1==47) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=39 && LA2_0<=40)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:398:2: ( ( rule__AbstractObject__MainObjectAssignment_0 ) )
                    {
                    // InternalJSchema.g:398:2: ( ( rule__AbstractObject__MainObjectAssignment_0 ) )
                    // InternalJSchema.g:399:3: ( rule__AbstractObject__MainObjectAssignment_0 )
                    {
                     before(grammarAccess.getAbstractObjectAccess().getMainObjectAssignment_0()); 
                    // InternalJSchema.g:400:3: ( rule__AbstractObject__MainObjectAssignment_0 )
                    // InternalJSchema.g:400:4: rule__AbstractObject__MainObjectAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractObject__MainObjectAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractObjectAccess().getMainObjectAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:404:2: ( ( rule__AbstractObject__PrimitiveObjectAssignment_1 ) )
                    {
                    // InternalJSchema.g:404:2: ( ( rule__AbstractObject__PrimitiveObjectAssignment_1 ) )
                    // InternalJSchema.g:405:3: ( rule__AbstractObject__PrimitiveObjectAssignment_1 )
                    {
                     before(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectAssignment_1()); 
                    // InternalJSchema.g:406:3: ( rule__AbstractObject__PrimitiveObjectAssignment_1 )
                    // InternalJSchema.g:406:4: rule__AbstractObject__PrimitiveObjectAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractObject__PrimitiveObjectAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectAssignment_1()); 

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


    // $ANTLR start "rule__MainObject__InheritsAlternatives_2_0"
    // InternalJSchema.g:414:1: rule__MainObject__InheritsAlternatives_2_0 : ( ( ruleExtends ) | ( ruleIncludes ) );
    public final void rule__MainObject__InheritsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:418:1: ( ( ruleExtends ) | ( ruleIncludes ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==46) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:419:2: ( ruleExtends )
                    {
                    // InternalJSchema.g:419:2: ( ruleExtends )
                    // InternalJSchema.g:420:3: ruleExtends
                    {
                     before(grammarAccess.getMainObjectAccess().getInheritsExtendsParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExtends();

                    state._fsp--;

                     after(grammarAccess.getMainObjectAccess().getInheritsExtendsParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:425:2: ( ruleIncludes )
                    {
                    // InternalJSchema.g:425:2: ( ruleIncludes )
                    // InternalJSchema.g:426:3: ruleIncludes
                    {
                     before(grammarAccess.getMainObjectAccess().getInheritsIncludesParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIncludes();

                    state._fsp--;

                     after(grammarAccess.getMainObjectAccess().getInheritsIncludesParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__MainObject__InheritsAlternatives_2_0"


    // $ANTLR start "rule__Extends__Alternatives_1"
    // InternalJSchema.g:435:1: rule__Extends__Alternatives_1 : ( ( ( rule__Extends__Group_1_0__0 ) ) | ( ( rule__Extends__Group_1_1__0 ) ) );
    public final void rule__Extends__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:439:1: ( ( ( rule__Extends__Group_1_0__0 ) ) | ( ( rule__Extends__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:440:2: ( ( rule__Extends__Group_1_0__0 ) )
                    {
                    // InternalJSchema.g:440:2: ( ( rule__Extends__Group_1_0__0 ) )
                    // InternalJSchema.g:441:3: ( rule__Extends__Group_1_0__0 )
                    {
                     before(grammarAccess.getExtendsAccess().getGroup_1_0()); 
                    // InternalJSchema.g:442:3: ( rule__Extends__Group_1_0__0 )
                    // InternalJSchema.g:442:4: rule__Extends__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extends__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendsAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:446:2: ( ( rule__Extends__Group_1_1__0 ) )
                    {
                    // InternalJSchema.g:446:2: ( ( rule__Extends__Group_1_1__0 ) )
                    // InternalJSchema.g:447:3: ( rule__Extends__Group_1_1__0 )
                    {
                     before(grammarAccess.getExtendsAccess().getGroup_1_1()); 
                    // InternalJSchema.g:448:3: ( rule__Extends__Group_1_1__0 )
                    // InternalJSchema.g:448:4: rule__Extends__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extends__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendsAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Extends__Alternatives_1"


    // $ANTLR start "rule__Extends__Alternatives_1_1_1"
    // InternalJSchema.g:456:1: rule__Extends__Alternatives_1_1_1 : ( ( ( rule__Extends__Group_1_1_1_0__0 ) ) | ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 ) ) );
    public final void rule__Extends__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:460:1: ( ( ( rule__Extends__Group_1_1_1_0__0 ) ) | ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSchema.g:461:2: ( ( rule__Extends__Group_1_1_1_0__0 ) )
                    {
                    // InternalJSchema.g:461:2: ( ( rule__Extends__Group_1_1_1_0__0 ) )
                    // InternalJSchema.g:462:3: ( rule__Extends__Group_1_1_1_0__0 )
                    {
                     before(grammarAccess.getExtendsAccess().getGroup_1_1_1_0()); 
                    // InternalJSchema.g:463:3: ( rule__Extends__Group_1_1_1_0__0 )
                    // InternalJSchema.g:463:4: rule__Extends__Group_1_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extends__Group_1_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendsAccess().getGroup_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:467:2: ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 ) )
                    {
                    // InternalJSchema.g:467:2: ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 ) )
                    // InternalJSchema.g:468:3: ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 )
                    {
                     before(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectAssignment_1_1_1_1()); 
                    // InternalJSchema.g:469:3: ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 )
                    // InternalJSchema.g:469:4: rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectAssignment_1_1_1_1()); 

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
    // $ANTLR end "rule__Extends__Alternatives_1_1_1"


    // $ANTLR start "rule__PrimitiveTypes__Alternatives"
    // InternalJSchema.g:477:1: rule__PrimitiveTypes__Alternatives : ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:481:1: ( ( ( rule__PrimitiveTypes__Group_0__0 ) ) | ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) ) | ( ( rule__PrimitiveTypes__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 40:
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
                    // InternalJSchema.g:482:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    {
                    // InternalJSchema.g:482:2: ( ( rule__PrimitiveTypes__Group_0__0 ) )
                    // InternalJSchema.g:483:3: ( rule__PrimitiveTypes__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_0()); 
                    // InternalJSchema.g:484:3: ( rule__PrimitiveTypes__Group_0__0 )
                    // InternalJSchema.g:484:4: rule__PrimitiveTypes__Group_0__0
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
                    // InternalJSchema.g:488:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    {
                    // InternalJSchema.g:488:2: ( ( rule__PrimitiveTypes__ArrayAssignment_1 ) )
                    // InternalJSchema.g:489:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getArrayAssignment_1()); 
                    // InternalJSchema.g:490:3: ( rule__PrimitiveTypes__ArrayAssignment_1 )
                    // InternalJSchema.g:490:4: rule__PrimitiveTypes__ArrayAssignment_1
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
                    // InternalJSchema.g:494:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    {
                    // InternalJSchema.g:494:2: ( ( rule__PrimitiveTypes__Group_2__0 ) )
                    // InternalJSchema.g:495:3: ( rule__PrimitiveTypes__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getGroup_2()); 
                    // InternalJSchema.g:496:3: ( rule__PrimitiveTypes__Group_2__0 )
                    // InternalJSchema.g:496:4: rule__PrimitiveTypes__Group_2__0
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


    // $ANTLR start "rule__PrimitiveProperties__Alternatives"
    // InternalJSchema.g:504:1: rule__PrimitiveProperties__Alternatives : ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) );
    public final void rule__PrimitiveProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:508:1: ( ( ( rule__PrimitiveProperties__Group_0__0 ) ) | ( ( rule__PrimitiveProperties__Group_1__0 ) ) | ( ( rule__PrimitiveProperties__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=2;
                }
                break;
            case 44:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:509:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    {
                    // InternalJSchema.g:509:2: ( ( rule__PrimitiveProperties__Group_0__0 ) )
                    // InternalJSchema.g:510:3: ( rule__PrimitiveProperties__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_0()); 
                    // InternalJSchema.g:511:3: ( rule__PrimitiveProperties__Group_0__0 )
                    // InternalJSchema.g:511:4: rule__PrimitiveProperties__Group_0__0
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
                    // InternalJSchema.g:515:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    {
                    // InternalJSchema.g:515:2: ( ( rule__PrimitiveProperties__Group_1__0 ) )
                    // InternalJSchema.g:516:3: ( rule__PrimitiveProperties__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_1()); 
                    // InternalJSchema.g:517:3: ( rule__PrimitiveProperties__Group_1__0 )
                    // InternalJSchema.g:517:4: rule__PrimitiveProperties__Group_1__0
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
                    // InternalJSchema.g:521:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    {
                    // InternalJSchema.g:521:2: ( ( rule__PrimitiveProperties__Group_2__0 ) )
                    // InternalJSchema.g:522:3: ( rule__PrimitiveProperties__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitivePropertiesAccess().getGroup_2()); 
                    // InternalJSchema.g:523:3: ( rule__PrimitiveProperties__Group_2__0 )
                    // InternalJSchema.g:523:4: rule__PrimitiveProperties__Group_2__0
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
    // InternalJSchema.g:531:1: rule__ArrayType__Alternatives : ( ( 'string' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__ArrayType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:535:1: ( ( 'string' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:536:2: ( 'string' )
                    {
                    // InternalJSchema.g:536:2: ( 'string' )
                    // InternalJSchema.g:537:3: 'string'
                    {
                     before(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:542:2: ( 'integer' )
                    {
                    // InternalJSchema.g:542:2: ( 'integer' )
                    // InternalJSchema.g:543:3: 'integer'
                    {
                     before(grammarAccess.getArrayTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getIntegerKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:548:2: ( 'float' )
                    {
                    // InternalJSchema.g:548:2: ( 'float' )
                    // InternalJSchema.g:549:3: 'float'
                    {
                     before(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getArrayTypeAccess().getFloatKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:554:2: ( 'double' )
                    {
                    // InternalJSchema.g:554:2: ( 'double' )
                    // InternalJSchema.g:555:3: 'double'
                    {
                     before(grammarAccess.getArrayTypeAccess().getDoubleKeyword_3()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalJSchema.g:564:1: rule__FormatTypes__Alternatives : ( ( ( 'null' ) ) | ( ( 'date-time' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'email' ) ) | ( ( 'idn-email' ) ) | ( ( 'hostname' ) ) | ( ( 'ipv4' ) ) | ( ( 'ipv6' ) ) | ( ( 'uri' ) ) | ( ( 'uri-reference' ) ) | ( ( 'iri' ) ) | ( ( 'iri-reference' ) ) | ( ( 'uri-template' ) ) | ( ( 'json-pointer' ) ) | ( ( 'relative-json-pointer' ) ) | ( ( 'regex' ) ) );
    public final void rule__FormatTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:568:1: ( ( ( 'null' ) ) | ( ( 'date-time' ) ) | ( ( 'time' ) ) | ( ( 'date' ) ) | ( ( 'email' ) ) | ( ( 'idn-email' ) ) | ( ( 'hostname' ) ) | ( ( 'ipv4' ) ) | ( ( 'ipv6' ) ) | ( ( 'uri' ) ) | ( ( 'uri-reference' ) ) | ( ( 'iri' ) ) | ( ( 'iri-reference' ) ) | ( ( 'uri-template' ) ) | ( ( 'json-pointer' ) ) | ( ( 'relative-json-pointer' ) ) | ( ( 'regex' ) ) )
            int alt9=17;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            case 21:
                {
                alt9=7;
                }
                break;
            case 22:
                {
                alt9=8;
                }
                break;
            case 23:
                {
                alt9=9;
                }
                break;
            case 24:
                {
                alt9=10;
                }
                break;
            case 25:
                {
                alt9=11;
                }
                break;
            case 26:
                {
                alt9=12;
                }
                break;
            case 27:
                {
                alt9=13;
                }
                break;
            case 28:
                {
                alt9=14;
                }
                break;
            case 29:
                {
                alt9=15;
                }
                break;
            case 30:
                {
                alt9=16;
                }
                break;
            case 31:
                {
                alt9=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:569:2: ( ( 'null' ) )
                    {
                    // InternalJSchema.g:569:2: ( ( 'null' ) )
                    // InternalJSchema.g:570:3: ( 'null' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0()); 
                    // InternalJSchema.g:571:3: ( 'null' )
                    // InternalJSchema.g:571:4: 'null'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:575:2: ( ( 'date-time' ) )
                    {
                    // InternalJSchema.g:575:2: ( ( 'date-time' ) )
                    // InternalJSchema.g:576:3: ( 'date-time' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1()); 
                    // InternalJSchema.g:577:3: ( 'date-time' )
                    // InternalJSchema.g:577:4: 'date-time'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:581:2: ( ( 'time' ) )
                    {
                    // InternalJSchema.g:581:2: ( ( 'time' ) )
                    // InternalJSchema.g:582:3: ( 'time' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2()); 
                    // InternalJSchema.g:583:3: ( 'time' )
                    // InternalJSchema.g:583:4: 'time'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:587:2: ( ( 'date' ) )
                    {
                    // InternalJSchema.g:587:2: ( ( 'date' ) )
                    // InternalJSchema.g:588:3: ( 'date' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalJSchema.g:589:3: ( 'date' )
                    // InternalJSchema.g:589:4: 'date'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:593:2: ( ( 'email' ) )
                    {
                    // InternalJSchema.g:593:2: ( ( 'email' ) )
                    // InternalJSchema.g:594:3: ( 'email' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4()); 
                    // InternalJSchema.g:595:3: ( 'email' )
                    // InternalJSchema.g:595:4: 'email'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:599:2: ( ( 'idn-email' ) )
                    {
                    // InternalJSchema.g:599:2: ( ( 'idn-email' ) )
                    // InternalJSchema.g:600:3: ( 'idn-email' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5()); 
                    // InternalJSchema.g:601:3: ( 'idn-email' )
                    // InternalJSchema.g:601:4: 'idn-email'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:605:2: ( ( 'hostname' ) )
                    {
                    // InternalJSchema.g:605:2: ( ( 'hostname' ) )
                    // InternalJSchema.g:606:3: ( 'hostname' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6()); 
                    // InternalJSchema.g:607:3: ( 'hostname' )
                    // InternalJSchema.g:607:4: 'hostname'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:611:2: ( ( 'ipv4' ) )
                    {
                    // InternalJSchema.g:611:2: ( ( 'ipv4' ) )
                    // InternalJSchema.g:612:3: ( 'ipv4' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7()); 
                    // InternalJSchema.g:613:3: ( 'ipv4' )
                    // InternalJSchema.g:613:4: 'ipv4'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:617:2: ( ( 'ipv6' ) )
                    {
                    // InternalJSchema.g:617:2: ( ( 'ipv6' ) )
                    // InternalJSchema.g:618:3: ( 'ipv6' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8()); 
                    // InternalJSchema.g:619:3: ( 'ipv6' )
                    // InternalJSchema.g:619:4: 'ipv6'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:623:2: ( ( 'uri' ) )
                    {
                    // InternalJSchema.g:623:2: ( ( 'uri' ) )
                    // InternalJSchema.g:624:3: ( 'uri' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9()); 
                    // InternalJSchema.g:625:3: ( 'uri' )
                    // InternalJSchema.g:625:4: 'uri'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:629:2: ( ( 'uri-reference' ) )
                    {
                    // InternalJSchema.g:629:2: ( ( 'uri-reference' ) )
                    // InternalJSchema.g:630:3: ( 'uri-reference' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10()); 
                    // InternalJSchema.g:631:3: ( 'uri-reference' )
                    // InternalJSchema.g:631:4: 'uri-reference'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:635:2: ( ( 'iri' ) )
                    {
                    // InternalJSchema.g:635:2: ( ( 'iri' ) )
                    // InternalJSchema.g:636:3: ( 'iri' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11()); 
                    // InternalJSchema.g:637:3: ( 'iri' )
                    // InternalJSchema.g:637:4: 'iri'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:641:2: ( ( 'iri-reference' ) )
                    {
                    // InternalJSchema.g:641:2: ( ( 'iri-reference' ) )
                    // InternalJSchema.g:642:3: ( 'iri-reference' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12()); 
                    // InternalJSchema.g:643:3: ( 'iri-reference' )
                    // InternalJSchema.g:643:4: 'iri-reference'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:647:2: ( ( 'uri-template' ) )
                    {
                    // InternalJSchema.g:647:2: ( ( 'uri-template' ) )
                    // InternalJSchema.g:648:3: ( 'uri-template' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13()); 
                    // InternalJSchema.g:649:3: ( 'uri-template' )
                    // InternalJSchema.g:649:4: 'uri-template'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:653:2: ( ( 'json-pointer' ) )
                    {
                    // InternalJSchema.g:653:2: ( ( 'json-pointer' ) )
                    // InternalJSchema.g:654:3: ( 'json-pointer' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14()); 
                    // InternalJSchema.g:655:3: ( 'json-pointer' )
                    // InternalJSchema.g:655:4: 'json-pointer'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:659:2: ( ( 'relative-json-pointer' ) )
                    {
                    // InternalJSchema.g:659:2: ( ( 'relative-json-pointer' ) )
                    // InternalJSchema.g:660:3: ( 'relative-json-pointer' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15()); 
                    // InternalJSchema.g:661:3: ( 'relative-json-pointer' )
                    // InternalJSchema.g:661:4: 'relative-json-pointer'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalJSchema.g:665:2: ( ( 'regex' ) )
                    {
                    // InternalJSchema.g:665:2: ( ( 'regex' ) )
                    // InternalJSchema.g:666:3: ( 'regex' )
                    {
                     before(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16()); 
                    // InternalJSchema.g:667:3: ( 'regex' )
                    // InternalJSchema.g:667:4: 'regex'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16()); 

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
    // InternalJSchema.g:675:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:679:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalJSchema.g:680:2: rule__Number__Group__0__Impl rule__Number__Group__1
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
    // InternalJSchema.g:687:1: rule__Number__Group__0__Impl : ( ( rule__Number__NumberAssignment_0 ) ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:691:1: ( ( ( rule__Number__NumberAssignment_0 ) ) )
            // InternalJSchema.g:692:1: ( ( rule__Number__NumberAssignment_0 ) )
            {
            // InternalJSchema.g:692:1: ( ( rule__Number__NumberAssignment_0 ) )
            // InternalJSchema.g:693:2: ( rule__Number__NumberAssignment_0 )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment_0()); 
            // InternalJSchema.g:694:2: ( rule__Number__NumberAssignment_0 )
            // InternalJSchema.g:694:3: rule__Number__NumberAssignment_0
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
    // InternalJSchema.g:702:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:706:1: ( rule__Number__Group__1__Impl )
            // InternalJSchema.g:707:2: rule__Number__Group__1__Impl
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
    // InternalJSchema.g:713:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:717:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalJSchema.g:718:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalJSchema.g:718:1: ( ( rule__Number__Group_1__0 )? )
            // InternalJSchema.g:719:2: ( rule__Number__Group_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1()); 
            // InternalJSchema.g:720:2: ( rule__Number__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:720:3: rule__Number__Group_1__0
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
    // InternalJSchema.g:729:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:733:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalJSchema.g:734:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
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
    // InternalJSchema.g:741:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:745:1: ( ( '.' ) )
            // InternalJSchema.g:746:1: ( '.' )
            {
            // InternalJSchema.g:746:1: ( '.' )
            // InternalJSchema.g:747:2: '.'
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
    // InternalJSchema.g:756:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:760:1: ( rule__Number__Group_1__1__Impl )
            // InternalJSchema.g:761:2: rule__Number__Group_1__1__Impl
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
    // InternalJSchema.g:767:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__DecimalAssignment_1_1 ) ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:771:1: ( ( ( rule__Number__DecimalAssignment_1_1 ) ) )
            // InternalJSchema.g:772:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            {
            // InternalJSchema.g:772:1: ( ( rule__Number__DecimalAssignment_1_1 ) )
            // InternalJSchema.g:773:2: ( rule__Number__DecimalAssignment_1_1 )
            {
             before(grammarAccess.getNumberAccess().getDecimalAssignment_1_1()); 
            // InternalJSchema.g:774:2: ( rule__Number__DecimalAssignment_1_1 )
            // InternalJSchema.g:774:3: rule__Number__DecimalAssignment_1_1
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
    // InternalJSchema.g:783:1: rule__MainObject__Group__0 : rule__MainObject__Group__0__Impl rule__MainObject__Group__1 ;
    public final void rule__MainObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:787:1: ( rule__MainObject__Group__0__Impl rule__MainObject__Group__1 )
            // InternalJSchema.g:788:2: rule__MainObject__Group__0__Impl rule__MainObject__Group__1
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
    // InternalJSchema.g:795:1: rule__MainObject__Group__0__Impl : ( ( rule__MainObject__NameAssignment_0 ) ) ;
    public final void rule__MainObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:799:1: ( ( ( rule__MainObject__NameAssignment_0 ) ) )
            // InternalJSchema.g:800:1: ( ( rule__MainObject__NameAssignment_0 ) )
            {
            // InternalJSchema.g:800:1: ( ( rule__MainObject__NameAssignment_0 ) )
            // InternalJSchema.g:801:2: ( rule__MainObject__NameAssignment_0 )
            {
             before(grammarAccess.getMainObjectAccess().getNameAssignment_0()); 
            // InternalJSchema.g:802:2: ( rule__MainObject__NameAssignment_0 )
            // InternalJSchema.g:802:3: rule__MainObject__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalJSchema.g:810:1: rule__MainObject__Group__1 : rule__MainObject__Group__1__Impl rule__MainObject__Group__2 ;
    public final void rule__MainObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:814:1: ( rule__MainObject__Group__1__Impl rule__MainObject__Group__2 )
            // InternalJSchema.g:815:2: rule__MainObject__Group__1__Impl rule__MainObject__Group__2
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
    // InternalJSchema.g:822:1: rule__MainObject__Group__1__Impl : ( ( rule__MainObject__RootAssignment_1 )? ) ;
    public final void rule__MainObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:826:1: ( ( ( rule__MainObject__RootAssignment_1 )? ) )
            // InternalJSchema.g:827:1: ( ( rule__MainObject__RootAssignment_1 )? )
            {
            // InternalJSchema.g:827:1: ( ( rule__MainObject__RootAssignment_1 )? )
            // InternalJSchema.g:828:2: ( rule__MainObject__RootAssignment_1 )?
            {
             before(grammarAccess.getMainObjectAccess().getRootAssignment_1()); 
            // InternalJSchema.g:829:2: ( rule__MainObject__RootAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSchema.g:829:3: rule__MainObject__RootAssignment_1
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
    // InternalJSchema.g:837:1: rule__MainObject__Group__2 : rule__MainObject__Group__2__Impl rule__MainObject__Group__3 ;
    public final void rule__MainObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:841:1: ( rule__MainObject__Group__2__Impl rule__MainObject__Group__3 )
            // InternalJSchema.g:842:2: rule__MainObject__Group__2__Impl rule__MainObject__Group__3
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
    // InternalJSchema.g:849:1: rule__MainObject__Group__2__Impl : ( ( rule__MainObject__InheritsAssignment_2 )* ) ;
    public final void rule__MainObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:853:1: ( ( ( rule__MainObject__InheritsAssignment_2 )* ) )
            // InternalJSchema.g:854:1: ( ( rule__MainObject__InheritsAssignment_2 )* )
            {
            // InternalJSchema.g:854:1: ( ( rule__MainObject__InheritsAssignment_2 )* )
            // InternalJSchema.g:855:2: ( rule__MainObject__InheritsAssignment_2 )*
            {
             before(grammarAccess.getMainObjectAccess().getInheritsAssignment_2()); 
            // InternalJSchema.g:856:2: ( rule__MainObject__InheritsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==36||LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJSchema.g:856:3: rule__MainObject__InheritsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MainObject__InheritsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMainObjectAccess().getInheritsAssignment_2()); 

            }


            }

        }
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
    // InternalJSchema.g:864:1: rule__MainObject__Group__3 : rule__MainObject__Group__3__Impl rule__MainObject__Group__4 ;
    public final void rule__MainObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:868:1: ( rule__MainObject__Group__3__Impl rule__MainObject__Group__4 )
            // InternalJSchema.g:869:2: rule__MainObject__Group__3__Impl rule__MainObject__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalJSchema.g:876:1: rule__MainObject__Group__3__Impl : ( '{' ) ;
    public final void rule__MainObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:880:1: ( ( '{' ) )
            // InternalJSchema.g:881:1: ( '{' )
            {
            // InternalJSchema.g:881:1: ( '{' )
            // InternalJSchema.g:882:2: '{'
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
    // InternalJSchema.g:891:1: rule__MainObject__Group__4 : rule__MainObject__Group__4__Impl rule__MainObject__Group__5 ;
    public final void rule__MainObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:895:1: ( rule__MainObject__Group__4__Impl rule__MainObject__Group__5 )
            // InternalJSchema.g:896:2: rule__MainObject__Group__4__Impl rule__MainObject__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalJSchema.g:903:1: rule__MainObject__Group__4__Impl : ( ( rule__MainObject__Group_4__0 )? ) ;
    public final void rule__MainObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:907:1: ( ( ( rule__MainObject__Group_4__0 )? ) )
            // InternalJSchema.g:908:1: ( ( rule__MainObject__Group_4__0 )? )
            {
            // InternalJSchema.g:908:1: ( ( rule__MainObject__Group_4__0 )? )
            // InternalJSchema.g:909:2: ( rule__MainObject__Group_4__0 )?
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4()); 
            // InternalJSchema.g:910:2: ( rule__MainObject__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=39 && LA13_0<=40)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:910:3: rule__MainObject__Group_4__0
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
    // InternalJSchema.g:918:1: rule__MainObject__Group__5 : rule__MainObject__Group__5__Impl ;
    public final void rule__MainObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:922:1: ( rule__MainObject__Group__5__Impl )
            // InternalJSchema.g:923:2: rule__MainObject__Group__5__Impl
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
    // InternalJSchema.g:929:1: rule__MainObject__Group__5__Impl : ( '}' ) ;
    public final void rule__MainObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:933:1: ( ( '}' ) )
            // InternalJSchema.g:934:1: ( '}' )
            {
            // InternalJSchema.g:934:1: ( '}' )
            // InternalJSchema.g:935:2: '}'
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


    // $ANTLR start "rule__MainObject__Group_4__0"
    // InternalJSchema.g:945:1: rule__MainObject__Group_4__0 : rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 ;
    public final void rule__MainObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:949:1: ( rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1 )
            // InternalJSchema.g:950:2: rule__MainObject__Group_4__0__Impl rule__MainObject__Group_4__1
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
    // InternalJSchema.g:957:1: rule__MainObject__Group_4__0__Impl : ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) ;
    public final void rule__MainObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:961:1: ( ( ( rule__MainObject__PropertiesAssignment_4_0 ) ) )
            // InternalJSchema.g:962:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            {
            // InternalJSchema.g:962:1: ( ( rule__MainObject__PropertiesAssignment_4_0 ) )
            // InternalJSchema.g:963:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_0()); 
            // InternalJSchema.g:964:2: ( rule__MainObject__PropertiesAssignment_4_0 )
            // InternalJSchema.g:964:3: rule__MainObject__PropertiesAssignment_4_0
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
    // InternalJSchema.g:972:1: rule__MainObject__Group_4__1 : rule__MainObject__Group_4__1__Impl ;
    public final void rule__MainObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:976:1: ( rule__MainObject__Group_4__1__Impl )
            // InternalJSchema.g:977:2: rule__MainObject__Group_4__1__Impl
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
    // InternalJSchema.g:983:1: rule__MainObject__Group_4__1__Impl : ( ( rule__MainObject__Group_4_1__0 )* ) ;
    public final void rule__MainObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:987:1: ( ( ( rule__MainObject__Group_4_1__0 )* ) )
            // InternalJSchema.g:988:1: ( ( rule__MainObject__Group_4_1__0 )* )
            {
            // InternalJSchema.g:988:1: ( ( rule__MainObject__Group_4_1__0 )* )
            // InternalJSchema.g:989:2: ( rule__MainObject__Group_4_1__0 )*
            {
             before(grammarAccess.getMainObjectAccess().getGroup_4_1()); 
            // InternalJSchema.g:990:2: ( rule__MainObject__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJSchema.g:990:3: rule__MainObject__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainObject__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJSchema.g:999:1: rule__MainObject__Group_4_1__0 : rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 ;
    public final void rule__MainObject__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1003:1: ( rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1 )
            // InternalJSchema.g:1004:2: rule__MainObject__Group_4_1__0__Impl rule__MainObject__Group_4_1__1
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
    // InternalJSchema.g:1011:1: rule__MainObject__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MainObject__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1015:1: ( ( ',' ) )
            // InternalJSchema.g:1016:1: ( ',' )
            {
            // InternalJSchema.g:1016:1: ( ',' )
            // InternalJSchema.g:1017:2: ','
            {
             before(grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJSchema.g:1026:1: rule__MainObject__Group_4_1__1 : rule__MainObject__Group_4_1__1__Impl ;
    public final void rule__MainObject__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1030:1: ( rule__MainObject__Group_4_1__1__Impl )
            // InternalJSchema.g:1031:2: rule__MainObject__Group_4_1__1__Impl
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
    // InternalJSchema.g:1037:1: rule__MainObject__Group_4_1__1__Impl : ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) ;
    public final void rule__MainObject__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1041:1: ( ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) ) )
            // InternalJSchema.g:1042:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            {
            // InternalJSchema.g:1042:1: ( ( rule__MainObject__PropertiesAssignment_4_1_1 ) )
            // InternalJSchema.g:1043:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAssignment_4_1_1()); 
            // InternalJSchema.g:1044:2: ( rule__MainObject__PropertiesAssignment_4_1_1 )
            // InternalJSchema.g:1044:3: rule__MainObject__PropertiesAssignment_4_1_1
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


    // $ANTLR start "rule__Extends__Group__0"
    // InternalJSchema.g:1053:1: rule__Extends__Group__0 : rule__Extends__Group__0__Impl rule__Extends__Group__1 ;
    public final void rule__Extends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1057:1: ( rule__Extends__Group__0__Impl rule__Extends__Group__1 )
            // InternalJSchema.g:1058:2: rule__Extends__Group__0__Impl rule__Extends__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Extends__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extends__Group__1();

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
    // $ANTLR end "rule__Extends__Group__0"


    // $ANTLR start "rule__Extends__Group__0__Impl"
    // InternalJSchema.g:1065:1: rule__Extends__Group__0__Impl : ( () ) ;
    public final void rule__Extends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1069:1: ( ( () ) )
            // InternalJSchema.g:1070:1: ( () )
            {
            // InternalJSchema.g:1070:1: ( () )
            // InternalJSchema.g:1071:2: ()
            {
             before(grammarAccess.getExtendsAccess().getExtendsAction_0()); 
            // InternalJSchema.g:1072:2: ()
            // InternalJSchema.g:1072:3: 
            {
            }

             after(grammarAccess.getExtendsAccess().getExtendsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__0__Impl"


    // $ANTLR start "rule__Extends__Group__1"
    // InternalJSchema.g:1080:1: rule__Extends__Group__1 : rule__Extends__Group__1__Impl ;
    public final void rule__Extends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1084:1: ( rule__Extends__Group__1__Impl )
            // InternalJSchema.g:1085:2: rule__Extends__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extends__Group__1__Impl();

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
    // $ANTLR end "rule__Extends__Group__1"


    // $ANTLR start "rule__Extends__Group__1__Impl"
    // InternalJSchema.g:1091:1: rule__Extends__Group__1__Impl : ( ( rule__Extends__Alternatives_1 ) ) ;
    public final void rule__Extends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1095:1: ( ( ( rule__Extends__Alternatives_1 ) ) )
            // InternalJSchema.g:1096:1: ( ( rule__Extends__Alternatives_1 ) )
            {
            // InternalJSchema.g:1096:1: ( ( rule__Extends__Alternatives_1 ) )
            // InternalJSchema.g:1097:2: ( rule__Extends__Alternatives_1 )
            {
             before(grammarAccess.getExtendsAccess().getAlternatives_1()); 
            // InternalJSchema.g:1098:2: ( rule__Extends__Alternatives_1 )
            // InternalJSchema.g:1098:3: rule__Extends__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Extends__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__1__Impl"


    // $ANTLR start "rule__Extends__Group_1_0__0"
    // InternalJSchema.g:1107:1: rule__Extends__Group_1_0__0 : rule__Extends__Group_1_0__0__Impl rule__Extends__Group_1_0__1 ;
    public final void rule__Extends__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1111:1: ( rule__Extends__Group_1_0__0__Impl rule__Extends__Group_1_0__1 )
            // InternalJSchema.g:1112:2: rule__Extends__Group_1_0__0__Impl rule__Extends__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Extends__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extends__Group_1_0__1();

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
    // $ANTLR end "rule__Extends__Group_1_0__0"


    // $ANTLR start "rule__Extends__Group_1_0__0__Impl"
    // InternalJSchema.g:1119:1: rule__Extends__Group_1_0__0__Impl : ( 'extends' ) ;
    public final void rule__Extends__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1123:1: ( ( 'extends' ) )
            // InternalJSchema.g:1124:1: ( 'extends' )
            {
            // InternalJSchema.g:1124:1: ( 'extends' )
            // InternalJSchema.g:1125:2: 'extends'
            {
             before(grammarAccess.getExtendsAccess().getExtendsKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExtendsAccess().getExtendsKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group_1_0__0__Impl"


    // $ANTLR start "rule__Extends__Group_1_0__1"
    // InternalJSchema.g:1134:1: rule__Extends__Group_1_0__1 : rule__Extends__Group_1_0__1__Impl ;
    public final void rule__Extends__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1138:1: ( rule__Extends__Group_1_0__1__Impl )
            // InternalJSchema.g:1139:2: rule__Extends__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extends__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Extends__Group_1_0__1"


    // $ANTLR start "rule__Extends__Group_1_0__1__Impl"
    // InternalJSchema.g:1145:1: rule__Extends__Group_1_0__1__Impl : ( ( rule__Extends__ExtensionMainObjectAssignment_1_0_1 ) ) ;
    public final void rule__Extends__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1149:1: ( ( ( rule__Extends__ExtensionMainObjectAssignment_1_0_1 ) ) )
            // InternalJSchema.g:1150:1: ( ( rule__Extends__ExtensionMainObjectAssignment_1_0_1 ) )
            {
            // InternalJSchema.g:1150:1: ( ( rule__Extends__ExtensionMainObjectAssignment_1_0_1 ) )
            // InternalJSchema.g:1151:2: ( rule__Extends__ExtensionMainObjectAssignment_1_0_1 )
            {
             before(grammarAccess.getExtendsAccess().getExtensionMainObjectAssignment_1_0_1()); 
            // InternalJSchema.g:1152:2: ( rule__Extends__ExtensionMainObjectAssignment_1_0_1 )
            // InternalJSchema.g:1152:3: rule__Extends__ExtensionMainObjectAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Extends__ExtensionMainObjectAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getExtensionMainObjectAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group_1_0__1__Impl"


    // $ANTLR start "rule__Extends__Group_1_1__0"
    // InternalJSchema.g:1161:1: rule__Extends__Group_1_1__0 : rule__Extends__Group_1_1__0__Impl rule__Extends__Group_1_1__1 ;
    public final void rule__Extends__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1165:1: ( rule__Extends__Group_1_1__0__Impl rule__Extends__Group_1_1__1 )
            // InternalJSchema.g:1166:2: rule__Extends__Group_1_1__0__Impl rule__Extends__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Extends__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extends__Group_1_1__1();

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
    // $ANTLR end "rule__Extends__Group_1_1__0"


    // $ANTLR start "rule__Extends__Group_1_1__0__Impl"
    // InternalJSchema.g:1173:1: rule__Extends__Group_1_1__0__Impl : ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 ) ) ;
    public final void rule__Extends__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1177:1: ( ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 ) ) )
            // InternalJSchema.g:1178:1: ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 ) )
            {
            // InternalJSchema.g:1178:1: ( ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 ) )
            // InternalJSchema.g:1179:2: ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 )
            {
             before(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectAssignment_1_1_0()); 
            // InternalJSchema.g:1180:2: ( rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 )
            // InternalJSchema.g:1180:3: rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group_1_1__0__Impl"


    // $ANTLR start "rule__Extends__Group_1_1__1"
    // InternalJSchema.g:1188:1: rule__Extends__Group_1_1__1 : rule__Extends__Group_1_1__1__Impl ;
    public final void rule__Extends__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1192:1: ( rule__Extends__Group_1_1__1__Impl )
            // InternalJSchema.g:1193:2: rule__Extends__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extends__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Extends__Group_1_1__1"


    // $ANTLR start "rule__Extends__Group_1_1__1__Impl"
    // InternalJSchema.g:1199:1: rule__Extends__Group_1_1__1__Impl : ( ( rule__Extends__Alternatives_1_1_1 )* ) ;
    public final void rule__Extends__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1203:1: ( ( ( rule__Extends__Alternatives_1_1_1 )* ) )
            // InternalJSchema.g:1204:1: ( ( rule__Extends__Alternatives_1_1_1 )* )
            {
            // InternalJSchema.g:1204:1: ( ( rule__Extends__Alternatives_1_1_1 )* )
            // InternalJSchema.g:1205:2: ( rule__Extends__Alternatives_1_1_1 )*
            {
             before(grammarAccess.getExtendsAccess().getAlternatives_1_1_1()); 
            // InternalJSchema.g:1206:2: ( rule__Extends__Alternatives_1_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJSchema.g:1206:3: rule__Extends__Alternatives_1_1_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Extends__Alternatives_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExtendsAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group_1_1__1__Impl"


    // $ANTLR start "rule__Extends__Group_1_1_1_0__0"
    // InternalJSchema.g:1215:1: rule__Extends__Group_1_1_1_0__0 : rule__Extends__Group_1_1_1_0__0__Impl rule__Extends__Group_1_1_1_0__1 ;
    public final void rule__Extends__Group_1_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1219:1: ( rule__Extends__Group_1_1_1_0__0__Impl rule__Extends__Group_1_1_1_0__1 )
            // InternalJSchema.g:1220:2: rule__Extends__Group_1_1_1_0__0__Impl rule__Extends__Group_1_1_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Extends__Group_1_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extends__Group_1_1_1_0__1();

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
    // $ANTLR end "rule__Extends__Group_1_1_1_0__0"


    // $ANTLR start "rule__Extends__Group_1_1_1_0__0__Impl"
    // InternalJSchema.g:1227:1: rule__Extends__Group_1_1_1_0__0__Impl : ( ',' ) ;
    public final void rule__Extends__Group_1_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1231:1: ( ( ',' ) )
            // InternalJSchema.g:1232:1: ( ',' )
            {
            // InternalJSchema.g:1232:1: ( ',' )
            // InternalJSchema.g:1233:2: ','
            {
             before(grammarAccess.getExtendsAccess().getCommaKeyword_1_1_1_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExtendsAccess().getCommaKeyword_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group_1_1_1_0__0__Impl"


    // $ANTLR start "rule__Extends__Group_1_1_1_0__1"
    // InternalJSchema.g:1242:1: rule__Extends__Group_1_1_1_0__1 : rule__Extends__Group_1_1_1_0__1__Impl ;
    public final void rule__Extends__Group_1_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1246:1: ( rule__Extends__Group_1_1_1_0__1__Impl )
            // InternalJSchema.g:1247:2: rule__Extends__Group_1_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extends__Group_1_1_1_0__1__Impl();

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
    // $ANTLR end "rule__Extends__Group_1_1_1_0__1"


    // $ANTLR start "rule__Extends__Group_1_1_1_0__1__Impl"
    // InternalJSchema.g:1253:1: rule__Extends__Group_1_1_1_0__1__Impl : ( ( rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 ) ) ;
    public final void rule__Extends__Group_1_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1257:1: ( ( ( rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 ) ) )
            // InternalJSchema.g:1258:1: ( ( rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 ) )
            {
            // InternalJSchema.g:1258:1: ( ( rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 ) )
            // InternalJSchema.g:1259:2: ( rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 )
            {
             before(grammarAccess.getExtendsAccess().getExtensionMainObjectAssignment_1_1_1_0_1()); 
            // InternalJSchema.g:1260:2: ( rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 )
            // InternalJSchema.g:1260:3: rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getExtensionMainObjectAssignment_1_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group_1_1_1_0__1__Impl"


    // $ANTLR start "rule__PrimitiveObject__Group__0"
    // InternalJSchema.g:1269:1: rule__PrimitiveObject__Group__0 : rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 ;
    public final void rule__PrimitiveObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1273:1: ( rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1 )
            // InternalJSchema.g:1274:2: rule__PrimitiveObject__Group__0__Impl rule__PrimitiveObject__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalJSchema.g:1281:1: rule__PrimitiveObject__Group__0__Impl : ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1285:1: ( ( ( rule__PrimitiveObject__TypeAssignment_0 ) ) )
            // InternalJSchema.g:1286:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            {
            // InternalJSchema.g:1286:1: ( ( rule__PrimitiveObject__TypeAssignment_0 ) )
            // InternalJSchema.g:1287:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getTypeAssignment_0()); 
            // InternalJSchema.g:1288:2: ( rule__PrimitiveObject__TypeAssignment_0 )
            // InternalJSchema.g:1288:3: rule__PrimitiveObject__TypeAssignment_0
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
    // InternalJSchema.g:1296:1: rule__PrimitiveObject__Group__1 : rule__PrimitiveObject__Group__1__Impl ;
    public final void rule__PrimitiveObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1300:1: ( rule__PrimitiveObject__Group__1__Impl )
            // InternalJSchema.g:1301:2: rule__PrimitiveObject__Group__1__Impl
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
    // InternalJSchema.g:1307:1: rule__PrimitiveObject__Group__1__Impl : ( ( rule__PrimitiveObject__Group_1__0 )? ) ;
    public final void rule__PrimitiveObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1311:1: ( ( ( rule__PrimitiveObject__Group_1__0 )? ) )
            // InternalJSchema.g:1312:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            {
            // InternalJSchema.g:1312:1: ( ( rule__PrimitiveObject__Group_1__0 )? )
            // InternalJSchema.g:1313:2: ( rule__PrimitiveObject__Group_1__0 )?
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1()); 
            // InternalJSchema.g:1314:2: ( rule__PrimitiveObject__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJSchema.g:1314:3: rule__PrimitiveObject__Group_1__0
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
    // InternalJSchema.g:1323:1: rule__PrimitiveObject__Group_1__0 : rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 ;
    public final void rule__PrimitiveObject__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1327:1: ( rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1 )
            // InternalJSchema.g:1328:2: rule__PrimitiveObject__Group_1__0__Impl rule__PrimitiveObject__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJSchema.g:1335:1: rule__PrimitiveObject__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__PrimitiveObject__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1339:1: ( ( 'with' ) )
            // InternalJSchema.g:1340:1: ( 'with' )
            {
            // InternalJSchema.g:1340:1: ( 'with' )
            // InternalJSchema.g:1341:2: 'with'
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
    // InternalJSchema.g:1350:1: rule__PrimitiveObject__Group_1__1 : rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 ;
    public final void rule__PrimitiveObject__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1354:1: ( rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2 )
            // InternalJSchema.g:1355:2: rule__PrimitiveObject__Group_1__1__Impl rule__PrimitiveObject__Group_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalJSchema.g:1362:1: rule__PrimitiveObject__Group_1__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1366:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) ) )
            // InternalJSchema.g:1367:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            {
            // InternalJSchema.g:1367:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 ) )
            // InternalJSchema.g:1368:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_1()); 
            // InternalJSchema.g:1369:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 )
            // InternalJSchema.g:1369:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1
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
    // InternalJSchema.g:1377:1: rule__PrimitiveObject__Group_1__2 : rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 ;
    public final void rule__PrimitiveObject__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1381:1: ( rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3 )
            // InternalJSchema.g:1382:2: rule__PrimitiveObject__Group_1__2__Impl rule__PrimitiveObject__Group_1__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalJSchema.g:1389:1: rule__PrimitiveObject__Group_1__2__Impl : ( ( rule__PrimitiveObject__Group_1_2__0 )* ) ;
    public final void rule__PrimitiveObject__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1393:1: ( ( ( rule__PrimitiveObject__Group_1_2__0 )* ) )
            // InternalJSchema.g:1394:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            {
            // InternalJSchema.g:1394:1: ( ( rule__PrimitiveObject__Group_1_2__0 )* )
            // InternalJSchema.g:1395:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            {
             before(grammarAccess.getPrimitiveObjectAccess().getGroup_1_2()); 
            // InternalJSchema.g:1396:2: ( rule__PrimitiveObject__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJSchema.g:1396:3: rule__PrimitiveObject__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PrimitiveObject__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalJSchema.g:1404:1: rule__PrimitiveObject__Group_1__3 : rule__PrimitiveObject__Group_1__3__Impl ;
    public final void rule__PrimitiveObject__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1408:1: ( rule__PrimitiveObject__Group_1__3__Impl )
            // InternalJSchema.g:1409:2: rule__PrimitiveObject__Group_1__3__Impl
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
    // InternalJSchema.g:1415:1: rule__PrimitiveObject__Group_1__3__Impl : ( ';' ) ;
    public final void rule__PrimitiveObject__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1419:1: ( ( ';' ) )
            // InternalJSchema.g:1420:1: ( ';' )
            {
            // InternalJSchema.g:1420:1: ( ';' )
            // InternalJSchema.g:1421:2: ';'
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
    // InternalJSchema.g:1431:1: rule__PrimitiveObject__Group_1_2__0 : rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 ;
    public final void rule__PrimitiveObject__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1435:1: ( rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1 )
            // InternalJSchema.g:1436:2: rule__PrimitiveObject__Group_1_2__0__Impl rule__PrimitiveObject__Group_1_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalJSchema.g:1443:1: rule__PrimitiveObject__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveObject__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1447:1: ( ( ',' ) )
            // InternalJSchema.g:1448:1: ( ',' )
            {
            // InternalJSchema.g:1448:1: ( ',' )
            // InternalJSchema.g:1449:2: ','
            {
             before(grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJSchema.g:1458:1: rule__PrimitiveObject__Group_1_2__1 : rule__PrimitiveObject__Group_1_2__1__Impl ;
    public final void rule__PrimitiveObject__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1462:1: ( rule__PrimitiveObject__Group_1_2__1__Impl )
            // InternalJSchema.g:1463:2: rule__PrimitiveObject__Group_1_2__1__Impl
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
    // InternalJSchema.g:1469:1: rule__PrimitiveObject__Group_1_2__1__Impl : ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) ;
    public final void rule__PrimitiveObject__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1473:1: ( ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) ) )
            // InternalJSchema.g:1474:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            {
            // InternalJSchema.g:1474:1: ( ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 ) )
            // InternalJSchema.g:1475:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            {
             before(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesAssignment_1_2_1()); 
            // InternalJSchema.g:1476:2: ( rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 )
            // InternalJSchema.g:1476:3: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1
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
    // InternalJSchema.g:1485:1: rule__PrimitiveTypes__Group_0__0 : rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 ;
    public final void rule__PrimitiveTypes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1489:1: ( rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1 )
            // InternalJSchema.g:1490:2: rule__PrimitiveTypes__Group_0__0__Impl rule__PrimitiveTypes__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:1497:1: rule__PrimitiveTypes__Group_0__0__Impl : ( 'String' ) ;
    public final void rule__PrimitiveTypes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1501:1: ( ( 'String' ) )
            // InternalJSchema.g:1502:1: ( 'String' )
            {
            // InternalJSchema.g:1502:1: ( 'String' )
            // InternalJSchema.g:1503:2: 'String'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_0__1"
    // InternalJSchema.g:1512:1: rule__PrimitiveTypes__Group_0__1 : rule__PrimitiveTypes__Group_0__1__Impl ;
    public final void rule__PrimitiveTypes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1516:1: ( rule__PrimitiveTypes__Group_0__1__Impl )
            // InternalJSchema.g:1517:2: rule__PrimitiveTypes__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_0__1__Impl();

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
    // InternalJSchema.g:1523:1: rule__PrimitiveTypes__Group_0__1__Impl : ( ( rule__PrimitiveTypes__NameAssignment_0_1 ) ) ;
    public final void rule__PrimitiveTypes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1527:1: ( ( ( rule__PrimitiveTypes__NameAssignment_0_1 ) ) )
            // InternalJSchema.g:1528:1: ( ( rule__PrimitiveTypes__NameAssignment_0_1 ) )
            {
            // InternalJSchema.g:1528:1: ( ( rule__PrimitiveTypes__NameAssignment_0_1 ) )
            // InternalJSchema.g:1529:2: ( rule__PrimitiveTypes__NameAssignment_0_1 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNameAssignment_0_1()); 
            // InternalJSchema.g:1530:2: ( rule__PrimitiveTypes__NameAssignment_0_1 )
            // InternalJSchema.g:1530:3: rule__PrimitiveTypes__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getNameAssignment_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypes__Group_2__0"
    // InternalJSchema.g:1539:1: rule__PrimitiveTypes__Group_2__0 : rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 ;
    public final void rule__PrimitiveTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1543:1: ( rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1 )
            // InternalJSchema.g:1544:2: rule__PrimitiveTypes__Group_2__0__Impl rule__PrimitiveTypes__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:1551:1: rule__PrimitiveTypes__Group_2__0__Impl : ( 'num' ) ;
    public final void rule__PrimitiveTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1555:1: ( ( 'num' ) )
            // InternalJSchema.g:1556:1: ( 'num' )
            {
            // InternalJSchema.g:1556:1: ( 'num' )
            // InternalJSchema.g:1557:2: 'num'
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalJSchema.g:1566:1: rule__PrimitiveTypes__Group_2__1 : rule__PrimitiveTypes__Group_2__1__Impl rule__PrimitiveTypes__Group_2__2 ;
    public final void rule__PrimitiveTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1570:1: ( rule__PrimitiveTypes__Group_2__1__Impl rule__PrimitiveTypes__Group_2__2 )
            // InternalJSchema.g:1571:2: rule__PrimitiveTypes__Group_2__1__Impl rule__PrimitiveTypes__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveTypes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__2();

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
    // InternalJSchema.g:1578:1: rule__PrimitiveTypes__Group_2__1__Impl : ( ( rule__PrimitiveTypes__NameAssignment_2_1 ) ) ;
    public final void rule__PrimitiveTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1582:1: ( ( ( rule__PrimitiveTypes__NameAssignment_2_1 ) ) )
            // InternalJSchema.g:1583:1: ( ( rule__PrimitiveTypes__NameAssignment_2_1 ) )
            {
            // InternalJSchema.g:1583:1: ( ( rule__PrimitiveTypes__NameAssignment_2_1 ) )
            // InternalJSchema.g:1584:2: ( rule__PrimitiveTypes__NameAssignment_2_1 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNameAssignment_2_1()); 
            // InternalJSchema.g:1585:2: ( rule__PrimitiveTypes__NameAssignment_2_1 )
            // InternalJSchema.g:1585:3: rule__PrimitiveTypes__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getNameAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypes__Group_2__2"
    // InternalJSchema.g:1593:1: rule__PrimitiveTypes__Group_2__2 : rule__PrimitiveTypes__Group_2__2__Impl rule__PrimitiveTypes__Group_2__3 ;
    public final void rule__PrimitiveTypes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1597:1: ( rule__PrimitiveTypes__Group_2__2__Impl rule__PrimitiveTypes__Group_2__3 )
            // InternalJSchema.g:1598:2: rule__PrimitiveTypes__Group_2__2__Impl rule__PrimitiveTypes__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypes__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__3();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__2"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__2__Impl"
    // InternalJSchema.g:1605:1: rule__PrimitiveTypes__Group_2__2__Impl : ( '=' ) ;
    public final void rule__PrimitiveTypes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1609:1: ( ( '=' ) )
            // InternalJSchema.g:1610:1: ( '=' )
            {
            // InternalJSchema.g:1610:1: ( '=' )
            // InternalJSchema.g:1611:2: '='
            {
             before(grammarAccess.getPrimitiveTypesAccess().getEqualsSignKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__2__Impl"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__3"
    // InternalJSchema.g:1620:1: rule__PrimitiveTypes__Group_2__3 : rule__PrimitiveTypes__Group_2__3__Impl ;
    public final void rule__PrimitiveTypes__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1624:1: ( rule__PrimitiveTypes__Group_2__3__Impl )
            // InternalJSchema.g:1625:2: rule__PrimitiveTypes__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Group_2__3__Impl();

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
    // $ANTLR end "rule__PrimitiveTypes__Group_2__3"


    // $ANTLR start "rule__PrimitiveTypes__Group_2__3__Impl"
    // InternalJSchema.g:1631:1: rule__PrimitiveTypes__Group_2__3__Impl : ( ( rule__PrimitiveTypes__NumberAssignment_2_3 ) ) ;
    public final void rule__PrimitiveTypes__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1635:1: ( ( ( rule__PrimitiveTypes__NumberAssignment_2_3 ) ) )
            // InternalJSchema.g:1636:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_3 ) )
            {
            // InternalJSchema.g:1636:1: ( ( rule__PrimitiveTypes__NumberAssignment_2_3 ) )
            // InternalJSchema.g:1637:2: ( rule__PrimitiveTypes__NumberAssignment_2_3 )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_3()); 
            // InternalJSchema.g:1638:2: ( rule__PrimitiveTypes__NumberAssignment_2_3 )
            // InternalJSchema.g:1638:3: rule__PrimitiveTypes__NumberAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__NumberAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getNumberAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__Group_2__3__Impl"


    // $ANTLR start "rule__PrimitiveProperties__Group_0__0"
    // InternalJSchema.g:1647:1: rule__PrimitiveProperties__Group_0__0 : rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 ;
    public final void rule__PrimitiveProperties__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1651:1: ( rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1 )
            // InternalJSchema.g:1652:2: rule__PrimitiveProperties__Group_0__0__Impl rule__PrimitiveProperties__Group_0__1
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
    // InternalJSchema.g:1659:1: rule__PrimitiveProperties__Group_0__0__Impl : ( 'length' ) ;
    public final void rule__PrimitiveProperties__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1663:1: ( ( 'length' ) )
            // InternalJSchema.g:1664:1: ( 'length' )
            {
            // InternalJSchema.g:1664:1: ( 'length' )
            // InternalJSchema.g:1665:2: 'length'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalJSchema.g:1674:1: rule__PrimitiveProperties__Group_0__1 : rule__PrimitiveProperties__Group_0__1__Impl ;
    public final void rule__PrimitiveProperties__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1678:1: ( rule__PrimitiveProperties__Group_0__1__Impl )
            // InternalJSchema.g:1679:2: rule__PrimitiveProperties__Group_0__1__Impl
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
    // InternalJSchema.g:1685:1: rule__PrimitiveProperties__Group_0__1__Impl : ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1689:1: ( ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) ) )
            // InternalJSchema.g:1690:1: ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) )
            {
            // InternalJSchema.g:1690:1: ( ( rule__PrimitiveProperties__StringLengthAssignment_0_1 ) )
            // InternalJSchema.g:1691:2: ( rule__PrimitiveProperties__StringLengthAssignment_0_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLengthAssignment_0_1()); 
            // InternalJSchema.g:1692:2: ( rule__PrimitiveProperties__StringLengthAssignment_0_1 )
            // InternalJSchema.g:1692:3: rule__PrimitiveProperties__StringLengthAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveProperties__StringLengthAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitivePropertiesAccess().getStringLengthAssignment_0_1()); 

            }


            }

        }
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
    // InternalJSchema.g:1701:1: rule__PrimitiveProperties__Group_1__0 : rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 ;
    public final void rule__PrimitiveProperties__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1705:1: ( rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1 )
            // InternalJSchema.g:1706:2: rule__PrimitiveProperties__Group_1__0__Impl rule__PrimitiveProperties__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalJSchema.g:1713:1: rule__PrimitiveProperties__Group_1__0__Impl : ( 'pattern' ) ;
    public final void rule__PrimitiveProperties__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1717:1: ( ( 'pattern' ) )
            // InternalJSchema.g:1718:1: ( 'pattern' )
            {
            // InternalJSchema.g:1718:1: ( 'pattern' )
            // InternalJSchema.g:1719:2: 'pattern'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalJSchema.g:1728:1: rule__PrimitiveProperties__Group_1__1 : rule__PrimitiveProperties__Group_1__1__Impl ;
    public final void rule__PrimitiveProperties__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1732:1: ( rule__PrimitiveProperties__Group_1__1__Impl )
            // InternalJSchema.g:1733:2: rule__PrimitiveProperties__Group_1__1__Impl
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
    // InternalJSchema.g:1739:1: rule__PrimitiveProperties__Group_1__1__Impl : ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1743:1: ( ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) ) )
            // InternalJSchema.g:1744:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            {
            // InternalJSchema.g:1744:1: ( ( rule__PrimitiveProperties__PatternStringAssignment_1_1 ) )
            // InternalJSchema.g:1745:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getPatternStringAssignment_1_1()); 
            // InternalJSchema.g:1746:2: ( rule__PrimitiveProperties__PatternStringAssignment_1_1 )
            // InternalJSchema.g:1746:3: rule__PrimitiveProperties__PatternStringAssignment_1_1
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
    // InternalJSchema.g:1755:1: rule__PrimitiveProperties__Group_2__0 : rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 ;
    public final void rule__PrimitiveProperties__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1759:1: ( rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1 )
            // InternalJSchema.g:1760:2: rule__PrimitiveProperties__Group_2__0__Impl rule__PrimitiveProperties__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalJSchema.g:1767:1: rule__PrimitiveProperties__Group_2__0__Impl : ( 'format' ) ;
    public final void rule__PrimitiveProperties__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1771:1: ( ( 'format' ) )
            // InternalJSchema.g:1772:1: ( 'format' )
            {
            // InternalJSchema.g:1772:1: ( 'format' )
            // InternalJSchema.g:1773:2: 'format'
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalJSchema.g:1782:1: rule__PrimitiveProperties__Group_2__1 : rule__PrimitiveProperties__Group_2__1__Impl ;
    public final void rule__PrimitiveProperties__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1786:1: ( rule__PrimitiveProperties__Group_2__1__Impl )
            // InternalJSchema.g:1787:2: rule__PrimitiveProperties__Group_2__1__Impl
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
    // InternalJSchema.g:1793:1: rule__PrimitiveProperties__Group_2__1__Impl : ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) ;
    public final void rule__PrimitiveProperties__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1797:1: ( ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) ) )
            // InternalJSchema.g:1798:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            {
            // InternalJSchema.g:1798:1: ( ( rule__PrimitiveProperties__StringFormatAssignment_2_1 ) )
            // InternalJSchema.g:1799:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringFormatAssignment_2_1()); 
            // InternalJSchema.g:1800:2: ( rule__PrimitiveProperties__StringFormatAssignment_2_1 )
            // InternalJSchema.g:1800:3: rule__PrimitiveProperties__StringFormatAssignment_2_1
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
    // InternalJSchema.g:1809:1: rule__StringLength__Group__0 : rule__StringLength__Group__0__Impl rule__StringLength__Group__1 ;
    public final void rule__StringLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1813:1: ( rule__StringLength__Group__0__Impl rule__StringLength__Group__1 )
            // InternalJSchema.g:1814:2: rule__StringLength__Group__0__Impl rule__StringLength__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalJSchema.g:1821:1: rule__StringLength__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1825:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1826:1: ( RULE_INT )
            {
            // InternalJSchema.g:1826:1: ( RULE_INT )
            // InternalJSchema.g:1827:2: RULE_INT
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
    // InternalJSchema.g:1836:1: rule__StringLength__Group__1 : rule__StringLength__Group__1__Impl rule__StringLength__Group__2 ;
    public final void rule__StringLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1840:1: ( rule__StringLength__Group__1__Impl rule__StringLength__Group__2 )
            // InternalJSchema.g:1841:2: rule__StringLength__Group__1__Impl rule__StringLength__Group__2
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
    // InternalJSchema.g:1848:1: rule__StringLength__Group__1__Impl : ( '-' ) ;
    public final void rule__StringLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1852:1: ( ( '-' ) )
            // InternalJSchema.g:1853:1: ( '-' )
            {
            // InternalJSchema.g:1853:1: ( '-' )
            // InternalJSchema.g:1854:2: '-'
            {
             before(grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalJSchema.g:1863:1: rule__StringLength__Group__2 : rule__StringLength__Group__2__Impl ;
    public final void rule__StringLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1867:1: ( rule__StringLength__Group__2__Impl )
            // InternalJSchema.g:1868:2: rule__StringLength__Group__2__Impl
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
    // InternalJSchema.g:1874:1: rule__StringLength__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__StringLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1878:1: ( ( RULE_INT ) )
            // InternalJSchema.g:1879:1: ( RULE_INT )
            {
            // InternalJSchema.g:1879:1: ( RULE_INT )
            // InternalJSchema.g:1880:2: RULE_INT
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
    // InternalJSchema.g:1890:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1894:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalJSchema.g:1895:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalJSchema.g:1902:1: rule__Includes__Group__0__Impl : ( () ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1906:1: ( ( () ) )
            // InternalJSchema.g:1907:1: ( () )
            {
            // InternalJSchema.g:1907:1: ( () )
            // InternalJSchema.g:1908:2: ()
            {
             before(grammarAccess.getIncludesAccess().getIncludesAction_0()); 
            // InternalJSchema.g:1909:2: ()
            // InternalJSchema.g:1909:3: 
            {
            }

             after(grammarAccess.getIncludesAccess().getIncludesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0__Impl"


    // $ANTLR start "rule__Includes__Group__1"
    // InternalJSchema.g:1917:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1921:1: ( rule__Includes__Group__1__Impl )
            // InternalJSchema.g:1922:2: rule__Includes__Group__1__Impl
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
    // InternalJSchema.g:1928:1: rule__Includes__Group__1__Impl : ( ( rule__Includes__Group_1__0 ) ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1932:1: ( ( ( rule__Includes__Group_1__0 ) ) )
            // InternalJSchema.g:1933:1: ( ( rule__Includes__Group_1__0 ) )
            {
            // InternalJSchema.g:1933:1: ( ( rule__Includes__Group_1__0 ) )
            // InternalJSchema.g:1934:2: ( rule__Includes__Group_1__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup_1()); 
            // InternalJSchema.g:1935:2: ( rule__Includes__Group_1__0 )
            // InternalJSchema.g:1935:3: rule__Includes__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__0();

            state._fsp--;


            }

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
    // InternalJSchema.g:1944:1: rule__Includes__Group_1__0 : rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 ;
    public final void rule__Includes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1948:1: ( rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1 )
            // InternalJSchema.g:1949:2: rule__Includes__Group_1__0__Impl rule__Includes__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:1956:1: rule__Includes__Group_1__0__Impl : ( 'includes' ) ;
    public final void rule__Includes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1960:1: ( ( 'includes' ) )
            // InternalJSchema.g:1961:1: ( 'includes' )
            {
            // InternalJSchema.g:1961:1: ( 'includes' )
            // InternalJSchema.g:1962:2: 'includes'
            {
             before(grammarAccess.getIncludesAccess().getIncludesKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getIncludesKeyword_1_0()); 

            }


            }

        }
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
    // InternalJSchema.g:1971:1: rule__Includes__Group_1__1 : rule__Includes__Group_1__1__Impl rule__Includes__Group_1__2 ;
    public final void rule__Includes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1975:1: ( rule__Includes__Group_1__1__Impl rule__Includes__Group_1__2 )
            // InternalJSchema.g:1976:2: rule__Includes__Group_1__1__Impl rule__Includes__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Includes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__2();

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
    // InternalJSchema.g:1983:1: rule__Includes__Group_1__1__Impl : ( ( rule__Includes__IncludesMainObjectAssignment_1_1 ) ) ;
    public final void rule__Includes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:1987:1: ( ( ( rule__Includes__IncludesMainObjectAssignment_1_1 ) ) )
            // InternalJSchema.g:1988:1: ( ( rule__Includes__IncludesMainObjectAssignment_1_1 ) )
            {
            // InternalJSchema.g:1988:1: ( ( rule__Includes__IncludesMainObjectAssignment_1_1 ) )
            // InternalJSchema.g:1989:2: ( rule__Includes__IncludesMainObjectAssignment_1_1 )
            {
             before(grammarAccess.getIncludesAccess().getIncludesMainObjectAssignment_1_1()); 
            // InternalJSchema.g:1990:2: ( rule__Includes__IncludesMainObjectAssignment_1_1 )
            // InternalJSchema.g:1990:3: rule__Includes__IncludesMainObjectAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Includes__IncludesMainObjectAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getIncludesMainObjectAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Includes__Group_1__2"
    // InternalJSchema.g:1998:1: rule__Includes__Group_1__2 : rule__Includes__Group_1__2__Impl rule__Includes__Group_1__3 ;
    public final void rule__Includes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2002:1: ( rule__Includes__Group_1__2__Impl rule__Includes__Group_1__3 )
            // InternalJSchema.g:2003:2: rule__Includes__Group_1__2__Impl rule__Includes__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Includes__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__3();

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
    // $ANTLR end "rule__Includes__Group_1__2"


    // $ANTLR start "rule__Includes__Group_1__2__Impl"
    // InternalJSchema.g:2010:1: rule__Includes__Group_1__2__Impl : ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_2 ) ) ;
    public final void rule__Includes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2014:1: ( ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_2 ) ) )
            // InternalJSchema.g:2015:1: ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_2 ) )
            {
            // InternalJSchema.g:2015:1: ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_2 ) )
            // InternalJSchema.g:2016:2: ( rule__Includes__IncludesPrimitiveObjectAssignment_1_2 )
            {
             before(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectAssignment_1_2()); 
            // InternalJSchema.g:2017:2: ( rule__Includes__IncludesPrimitiveObjectAssignment_1_2 )
            // InternalJSchema.g:2017:3: rule__Includes__IncludesPrimitiveObjectAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Includes__IncludesPrimitiveObjectAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1__2__Impl"


    // $ANTLR start "rule__Includes__Group_1__3"
    // InternalJSchema.g:2025:1: rule__Includes__Group_1__3 : rule__Includes__Group_1__3__Impl ;
    public final void rule__Includes__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2029:1: ( rule__Includes__Group_1__3__Impl )
            // InternalJSchema.g:2030:2: rule__Includes__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_1__3__Impl();

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
    // $ANTLR end "rule__Includes__Group_1__3"


    // $ANTLR start "rule__Includes__Group_1__3__Impl"
    // InternalJSchema.g:2036:1: rule__Includes__Group_1__3__Impl : ( ( rule__Includes__Group_1_3__0 )* ) ;
    public final void rule__Includes__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2040:1: ( ( ( rule__Includes__Group_1_3__0 )* ) )
            // InternalJSchema.g:2041:1: ( ( rule__Includes__Group_1_3__0 )* )
            {
            // InternalJSchema.g:2041:1: ( ( rule__Includes__Group_1_3__0 )* )
            // InternalJSchema.g:2042:2: ( rule__Includes__Group_1_3__0 )*
            {
             before(grammarAccess.getIncludesAccess().getGroup_1_3()); 
            // InternalJSchema.g:2043:2: ( rule__Includes__Group_1_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJSchema.g:2043:3: rule__Includes__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Includes__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIncludesAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1__3__Impl"


    // $ANTLR start "rule__Includes__Group_1_3__0"
    // InternalJSchema.g:2052:1: rule__Includes__Group_1_3__0 : rule__Includes__Group_1_3__0__Impl rule__Includes__Group_1_3__1 ;
    public final void rule__Includes__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2056:1: ( rule__Includes__Group_1_3__0__Impl rule__Includes__Group_1_3__1 )
            // InternalJSchema.g:2057:2: rule__Includes__Group_1_3__0__Impl rule__Includes__Group_1_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Includes__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_1_3__1();

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
    // $ANTLR end "rule__Includes__Group_1_3__0"


    // $ANTLR start "rule__Includes__Group_1_3__0__Impl"
    // InternalJSchema.g:2064:1: rule__Includes__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Includes__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2068:1: ( ( ',' ) )
            // InternalJSchema.g:2069:1: ( ',' )
            {
            // InternalJSchema.g:2069:1: ( ',' )
            // InternalJSchema.g:2070:2: ','
            {
             before(grammarAccess.getIncludesAccess().getCommaKeyword_1_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1_3__0__Impl"


    // $ANTLR start "rule__Includes__Group_1_3__1"
    // InternalJSchema.g:2079:1: rule__Includes__Group_1_3__1 : rule__Includes__Group_1_3__1__Impl rule__Includes__Group_1_3__2 ;
    public final void rule__Includes__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2083:1: ( rule__Includes__Group_1_3__1__Impl rule__Includes__Group_1_3__2 )
            // InternalJSchema.g:2084:2: rule__Includes__Group_1_3__1__Impl rule__Includes__Group_1_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Includes__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group_1_3__2();

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
    // $ANTLR end "rule__Includes__Group_1_3__1"


    // $ANTLR start "rule__Includes__Group_1_3__1__Impl"
    // InternalJSchema.g:2091:1: rule__Includes__Group_1_3__1__Impl : ( ( rule__Includes__IncludesMainObjectAssignment_1_3_1 ) ) ;
    public final void rule__Includes__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2095:1: ( ( ( rule__Includes__IncludesMainObjectAssignment_1_3_1 ) ) )
            // InternalJSchema.g:2096:1: ( ( rule__Includes__IncludesMainObjectAssignment_1_3_1 ) )
            {
            // InternalJSchema.g:2096:1: ( ( rule__Includes__IncludesMainObjectAssignment_1_3_1 ) )
            // InternalJSchema.g:2097:2: ( rule__Includes__IncludesMainObjectAssignment_1_3_1 )
            {
             before(grammarAccess.getIncludesAccess().getIncludesMainObjectAssignment_1_3_1()); 
            // InternalJSchema.g:2098:2: ( rule__Includes__IncludesMainObjectAssignment_1_3_1 )
            // InternalJSchema.g:2098:3: rule__Includes__IncludesMainObjectAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Includes__IncludesMainObjectAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getIncludesMainObjectAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1_3__1__Impl"


    // $ANTLR start "rule__Includes__Group_1_3__2"
    // InternalJSchema.g:2106:1: rule__Includes__Group_1_3__2 : rule__Includes__Group_1_3__2__Impl ;
    public final void rule__Includes__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2110:1: ( rule__Includes__Group_1_3__2__Impl )
            // InternalJSchema.g:2111:2: rule__Includes__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Includes__Group_1_3__2"


    // $ANTLR start "rule__Includes__Group_1_3__2__Impl"
    // InternalJSchema.g:2117:1: rule__Includes__Group_1_3__2__Impl : ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 ) ) ;
    public final void rule__Includes__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2121:1: ( ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 ) ) )
            // InternalJSchema.g:2122:1: ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 ) )
            {
            // InternalJSchema.g:2122:1: ( ( rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 ) )
            // InternalJSchema.g:2123:2: ( rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 )
            {
             before(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectAssignment_1_3_2()); 
            // InternalJSchema.g:2124:2: ( rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 )
            // InternalJSchema.g:2124:3: rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group_1_3__2__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalJSchema.g:2133:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2137:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalJSchema.g:2138:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalJSchema.g:2145:1: rule__Array__Group__0__Impl : ( ( rule__Array__NameAssignment_0 ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2149:1: ( ( ( rule__Array__NameAssignment_0 ) ) )
            // InternalJSchema.g:2150:1: ( ( rule__Array__NameAssignment_0 ) )
            {
            // InternalJSchema.g:2150:1: ( ( rule__Array__NameAssignment_0 ) )
            // InternalJSchema.g:2151:2: ( rule__Array__NameAssignment_0 )
            {
             before(grammarAccess.getArrayAccess().getNameAssignment_0()); 
            // InternalJSchema.g:2152:2: ( rule__Array__NameAssignment_0 )
            // InternalJSchema.g:2152:3: rule__Array__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Array__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2160:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2164:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalJSchema.g:2165:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalJSchema.g:2172:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2176:1: ( ( '[' ) )
            // InternalJSchema.g:2177:1: ( '[' )
            {
            // InternalJSchema.g:2177:1: ( '[' )
            // InternalJSchema.g:2178:2: '['
            {
             before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalJSchema.g:2187:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2191:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // InternalJSchema.g:2192:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalJSchema.g:2199:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2203:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // InternalJSchema.g:2204:1: ( ( rule__Array__Group_2__0 )? )
            {
            // InternalJSchema.g:2204:1: ( ( rule__Array__Group_2__0 )? )
            // InternalJSchema.g:2205:2: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // InternalJSchema.g:2206:2: ( rule__Array__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJSchema.g:2206:3: rule__Array__Group_2__0
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
    // InternalJSchema.g:2214:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2218:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // InternalJSchema.g:2219:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalJSchema.g:2226:1: rule__Array__Group__3__Impl : ( ( rule__Array__ArrayTypeAssignment_3 )? ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2230:1: ( ( ( rule__Array__ArrayTypeAssignment_3 )? ) )
            // InternalJSchema.g:2231:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            {
            // InternalJSchema.g:2231:1: ( ( rule__Array__ArrayTypeAssignment_3 )? )
            // InternalJSchema.g:2232:2: ( rule__Array__ArrayTypeAssignment_3 )?
            {
             before(grammarAccess.getArrayAccess().getArrayTypeAssignment_3()); 
            // InternalJSchema.g:2233:2: ( rule__Array__ArrayTypeAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=14)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJSchema.g:2233:3: rule__Array__ArrayTypeAssignment_3
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
    // InternalJSchema.g:2241:1: rule__Array__Group__4 : rule__Array__Group__4__Impl ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2245:1: ( rule__Array__Group__4__Impl )
            // InternalJSchema.g:2246:2: rule__Array__Group__4__Impl
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
    // InternalJSchema.g:2252:1: rule__Array__Group__4__Impl : ( ']' ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2256:1: ( ( ']' ) )
            // InternalJSchema.g:2257:1: ( ']' )
            {
            // InternalJSchema.g:2257:1: ( ']' )
            // InternalJSchema.g:2258:2: ']'
            {
             before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalJSchema.g:2268:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2272:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // InternalJSchema.g:2273:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
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
    // InternalJSchema.g:2280:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__PropertiesAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2284:1: ( ( ( rule__Array__PropertiesAssignment_2_0 ) ) )
            // InternalJSchema.g:2285:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            {
            // InternalJSchema.g:2285:1: ( ( rule__Array__PropertiesAssignment_2_0 ) )
            // InternalJSchema.g:2286:2: ( rule__Array__PropertiesAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_0()); 
            // InternalJSchema.g:2287:2: ( rule__Array__PropertiesAssignment_2_0 )
            // InternalJSchema.g:2287:3: rule__Array__PropertiesAssignment_2_0
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
    // InternalJSchema.g:2295:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2299:1: ( rule__Array__Group_2__1__Impl )
            // InternalJSchema.g:2300:2: rule__Array__Group_2__1__Impl
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
    // InternalJSchema.g:2306:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2310:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // InternalJSchema.g:2311:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // InternalJSchema.g:2311:1: ( ( rule__Array__Group_2_1__0 )* )
            // InternalJSchema.g:2312:2: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // InternalJSchema.g:2313:2: ( rule__Array__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJSchema.g:2313:3: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalJSchema.g:2322:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2326:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // InternalJSchema.g:2327:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalJSchema.g:2334:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2338:1: ( ( ',' ) )
            // InternalJSchema.g:2339:1: ( ',' )
            {
            // InternalJSchema.g:2339:1: ( ',' )
            // InternalJSchema.g:2340:2: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalJSchema.g:2349:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2353:1: ( rule__Array__Group_2_1__1__Impl )
            // InternalJSchema.g:2354:2: rule__Array__Group_2_1__1__Impl
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
    // InternalJSchema.g:2360:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2364:1: ( ( ( rule__Array__PropertiesAssignment_2_1_1 ) ) )
            // InternalJSchema.g:2365:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            {
            // InternalJSchema.g:2365:1: ( ( rule__Array__PropertiesAssignment_2_1_1 ) )
            // InternalJSchema.g:2366:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAssignment_2_1_1()); 
            // InternalJSchema.g:2367:2: ( rule__Array__PropertiesAssignment_2_1_1 )
            // InternalJSchema.g:2367:3: rule__Array__PropertiesAssignment_2_1_1
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
    // InternalJSchema.g:2376:1: rule__Model__AbstractObjectAssignment : ( ruleAbstractObject ) ;
    public final void rule__Model__AbstractObjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2380:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:2381:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:2381:2: ( ruleAbstractObject )
            // InternalJSchema.g:2382:3: ruleAbstractObject
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
    // InternalJSchema.g:2391:1: rule__Number__NumberAssignment_0 : ( RULE_INT ) ;
    public final void rule__Number__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2395:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2396:2: ( RULE_INT )
            {
            // InternalJSchema.g:2396:2: ( RULE_INT )
            // InternalJSchema.g:2397:3: RULE_INT
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
    // InternalJSchema.g:2406:1: rule__Number__DecimalAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Number__DecimalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2410:1: ( ( RULE_INT ) )
            // InternalJSchema.g:2411:2: ( RULE_INT )
            {
            // InternalJSchema.g:2411:2: ( RULE_INT )
            // InternalJSchema.g:2412:3: RULE_INT
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


    // $ANTLR start "rule__AbstractObject__MainObjectAssignment_0"
    // InternalJSchema.g:2421:1: rule__AbstractObject__MainObjectAssignment_0 : ( ruleMainObject ) ;
    public final void rule__AbstractObject__MainObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2425:1: ( ( ruleMainObject ) )
            // InternalJSchema.g:2426:2: ( ruleMainObject )
            {
            // InternalJSchema.g:2426:2: ( ruleMainObject )
            // InternalJSchema.g:2427:3: ruleMainObject
            {
             before(grammarAccess.getAbstractObjectAccess().getMainObjectMainObjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMainObject();

            state._fsp--;

             after(grammarAccess.getAbstractObjectAccess().getMainObjectMainObjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractObject__MainObjectAssignment_0"


    // $ANTLR start "rule__AbstractObject__PrimitiveObjectAssignment_1"
    // InternalJSchema.g:2436:1: rule__AbstractObject__PrimitiveObjectAssignment_1 : ( rulePrimitiveObject ) ;
    public final void rule__AbstractObject__PrimitiveObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2440:1: ( ( rulePrimitiveObject ) )
            // InternalJSchema.g:2441:2: ( rulePrimitiveObject )
            {
            // InternalJSchema.g:2441:2: ( rulePrimitiveObject )
            // InternalJSchema.g:2442:3: rulePrimitiveObject
            {
             before(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectPrimitiveObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveObject();

            state._fsp--;

             after(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectPrimitiveObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractObject__PrimitiveObjectAssignment_1"


    // $ANTLR start "rule__MainObject__NameAssignment_0"
    // InternalJSchema.g:2451:1: rule__MainObject__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MainObject__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2455:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2456:2: ( RULE_ID )
            {
            // InternalJSchema.g:2456:2: ( RULE_ID )
            // InternalJSchema.g:2457:3: RULE_ID
            {
             before(grammarAccess.getMainObjectAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainObjectAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__NameAssignment_0"


    // $ANTLR start "rule__MainObject__RootAssignment_1"
    // InternalJSchema.g:2466:1: rule__MainObject__RootAssignment_1 : ( ruleIsRoot ) ;
    public final void rule__MainObject__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2470:1: ( ( ruleIsRoot ) )
            // InternalJSchema.g:2471:2: ( ruleIsRoot )
            {
            // InternalJSchema.g:2471:2: ( ruleIsRoot )
            // InternalJSchema.g:2472:3: ruleIsRoot
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


    // $ANTLR start "rule__MainObject__InheritsAssignment_2"
    // InternalJSchema.g:2481:1: rule__MainObject__InheritsAssignment_2 : ( ( rule__MainObject__InheritsAlternatives_2_0 ) ) ;
    public final void rule__MainObject__InheritsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2485:1: ( ( ( rule__MainObject__InheritsAlternatives_2_0 ) ) )
            // InternalJSchema.g:2486:2: ( ( rule__MainObject__InheritsAlternatives_2_0 ) )
            {
            // InternalJSchema.g:2486:2: ( ( rule__MainObject__InheritsAlternatives_2_0 ) )
            // InternalJSchema.g:2487:3: ( rule__MainObject__InheritsAlternatives_2_0 )
            {
             before(grammarAccess.getMainObjectAccess().getInheritsAlternatives_2_0()); 
            // InternalJSchema.g:2488:3: ( rule__MainObject__InheritsAlternatives_2_0 )
            // InternalJSchema.g:2488:4: rule__MainObject__InheritsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MainObject__InheritsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMainObjectAccess().getInheritsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainObject__InheritsAssignment_2"


    // $ANTLR start "rule__MainObject__PropertiesAssignment_4_0"
    // InternalJSchema.g:2496:1: rule__MainObject__PropertiesAssignment_4_0 : ( ruleAbstractObject ) ;
    public final void rule__MainObject__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2500:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:2501:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:2501:2: ( ruleAbstractObject )
            // InternalJSchema.g:2502:3: ruleAbstractObject
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractObject();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectParserRuleCall_4_0_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2511:1: rule__MainObject__PropertiesAssignment_4_1_1 : ( ruleAbstractObject ) ;
    public final void rule__MainObject__PropertiesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2515:1: ( ( ruleAbstractObject ) )
            // InternalJSchema.g:2516:2: ( ruleAbstractObject )
            {
            // InternalJSchema.g:2516:2: ( ruleAbstractObject )
            // InternalJSchema.g:2517:3: ruleAbstractObject
            {
             before(grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractObject();

            state._fsp--;

             after(grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectParserRuleCall_4_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extends__ExtensionMainObjectAssignment_1_0_1"
    // InternalJSchema.g:2526:1: rule__Extends__ExtensionMainObjectAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Extends__ExtensionMainObjectAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2530:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2531:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2531:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2532:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectCrossReference_1_0_1_0()); 
            // InternalJSchema.g:2533:3: ( RULE_ID )
            // InternalJSchema.g:2534:4: RULE_ID
            {
             before(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectIDTerminalRuleCall_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectIDTerminalRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectCrossReference_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__ExtensionMainObjectAssignment_1_0_1"


    // $ANTLR start "rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0"
    // InternalJSchema.g:2545:1: rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2549:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2550:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2550:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2551:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectCrossReference_1_1_0_0()); 
            // InternalJSchema.g:2552:3: ( RULE_ID )
            // InternalJSchema.g:2553:4: RULE_ID
            {
             before(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_0"


    // $ANTLR start "rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1"
    // InternalJSchema.g:2564:1: rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2568:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2569:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2569:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2570:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectCrossReference_1_1_1_0_1_0()); 
            // InternalJSchema.g:2571:3: ( RULE_ID )
            // InternalJSchema.g:2572:4: RULE_ID
            {
             before(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectIDTerminalRuleCall_1_1_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectIDTerminalRuleCall_1_1_1_0_1_0_1()); 

            }

             after(grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectCrossReference_1_1_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__ExtensionMainObjectAssignment_1_1_1_0_1"


    // $ANTLR start "rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1"
    // InternalJSchema.g:2583:1: rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2587:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2588:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2588:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2589:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectCrossReference_1_1_1_1_0()); 
            // InternalJSchema.g:2590:3: ( RULE_ID )
            // InternalJSchema.g:2591:4: RULE_ID
            {
             before(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_1_1_1_0_1()); 

            }

             after(grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectCrossReference_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__ExtensionPrimitiveObjectAssignment_1_1_1_1"


    // $ANTLR start "rule__PrimitiveObject__TypeAssignment_0"
    // InternalJSchema.g:2602:1: rule__PrimitiveObject__TypeAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__PrimitiveObject__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2606:1: ( ( rulePrimitiveTypes ) )
            // InternalJSchema.g:2607:2: ( rulePrimitiveTypes )
            {
            // InternalJSchema.g:2607:2: ( rulePrimitiveTypes )
            // InternalJSchema.g:2608:3: rulePrimitiveTypes
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
    // InternalJSchema.g:2617:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2621:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2622:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2622:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2623:3: rulePrimitiveProperties
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
    // InternalJSchema.g:2632:1: rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1 : ( rulePrimitiveProperties ) ;
    public final void rule__PrimitiveObject__PrimitivePropertiesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2636:1: ( ( rulePrimitiveProperties ) )
            // InternalJSchema.g:2637:2: ( rulePrimitiveProperties )
            {
            // InternalJSchema.g:2637:2: ( rulePrimitiveProperties )
            // InternalJSchema.g:2638:3: rulePrimitiveProperties
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


    // $ANTLR start "rule__PrimitiveTypes__NameAssignment_0_1"
    // InternalJSchema.g:2647:1: rule__PrimitiveTypes__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypes__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2651:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2652:2: ( RULE_ID )
            {
            // InternalJSchema.g:2652:2: ( RULE_ID )
            // InternalJSchema.g:2653:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NameAssignment_0_1"


    // $ANTLR start "rule__PrimitiveTypes__ArrayAssignment_1"
    // InternalJSchema.g:2662:1: rule__PrimitiveTypes__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__PrimitiveTypes__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2666:1: ( ( ruleArray ) )
            // InternalJSchema.g:2667:2: ( ruleArray )
            {
            // InternalJSchema.g:2667:2: ( ruleArray )
            // InternalJSchema.g:2668:3: ruleArray
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


    // $ANTLR start "rule__PrimitiveTypes__NameAssignment_2_1"
    // InternalJSchema.g:2677:1: rule__PrimitiveTypes__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypes__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2681:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2682:2: ( RULE_ID )
            {
            // InternalJSchema.g:2682:2: ( RULE_ID )
            // InternalJSchema.g:2683:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypesAccess().getNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NameAssignment_2_1"


    // $ANTLR start "rule__PrimitiveTypes__NumberAssignment_2_3"
    // InternalJSchema.g:2692:1: rule__PrimitiveTypes__NumberAssignment_2_3 : ( ruleNumber ) ;
    public final void rule__PrimitiveTypes__NumberAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2696:1: ( ( ruleNumber ) )
            // InternalJSchema.g:2697:2: ( ruleNumber )
            {
            // InternalJSchema.g:2697:2: ( ruleNumber )
            // InternalJSchema.g:2698:3: ruleNumber
            {
             before(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypes__NumberAssignment_2_3"


    // $ANTLR start "rule__IsRoot__StringAssignment"
    // InternalJSchema.g:2707:1: rule__IsRoot__StringAssignment : ( ( 'root' ) ) ;
    public final void rule__IsRoot__StringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2711:1: ( ( ( 'root' ) ) )
            // InternalJSchema.g:2712:2: ( ( 'root' ) )
            {
            // InternalJSchema.g:2712:2: ( ( 'root' ) )
            // InternalJSchema.g:2713:3: ( 'root' )
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            // InternalJSchema.g:2714:3: ( 'root' )
            // InternalJSchema.g:2715:4: 'root'
            {
             before(grammarAccess.getIsRootAccess().getStringRootKeyword_0()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__PrimitiveProperties__StringLengthAssignment_0_1"
    // InternalJSchema.g:2726:1: rule__PrimitiveProperties__StringLengthAssignment_0_1 : ( ruleStringLength ) ;
    public final void rule__PrimitiveProperties__StringLengthAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2730:1: ( ( ruleStringLength ) )
            // InternalJSchema.g:2731:2: ( ruleStringLength )
            {
            // InternalJSchema.g:2731:2: ( ruleStringLength )
            // InternalJSchema.g:2732:3: ruleStringLength
            {
             before(grammarAccess.getPrimitivePropertiesAccess().getStringLengthStringLengthParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringLength();

            state._fsp--;

             after(grammarAccess.getPrimitivePropertiesAccess().getStringLengthStringLengthParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveProperties__StringLengthAssignment_0_1"


    // $ANTLR start "rule__PrimitiveProperties__PatternStringAssignment_1_1"
    // InternalJSchema.g:2741:1: rule__PrimitiveProperties__PatternStringAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__PrimitiveProperties__PatternStringAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2745:1: ( ( RULE_STRING ) )
            // InternalJSchema.g:2746:2: ( RULE_STRING )
            {
            // InternalJSchema.g:2746:2: ( RULE_STRING )
            // InternalJSchema.g:2747:3: RULE_STRING
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
    // InternalJSchema.g:2756:1: rule__PrimitiveProperties__StringFormatAssignment_2_1 : ( ruleFormatTypes ) ;
    public final void rule__PrimitiveProperties__StringFormatAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2760:1: ( ( ruleFormatTypes ) )
            // InternalJSchema.g:2761:2: ( ruleFormatTypes )
            {
            // InternalJSchema.g:2761:2: ( ruleFormatTypes )
            // InternalJSchema.g:2762:3: ruleFormatTypes
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


    // $ANTLR start "rule__Includes__IncludesMainObjectAssignment_1_1"
    // InternalJSchema.g:2771:1: rule__Includes__IncludesMainObjectAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Includes__IncludesMainObjectAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2775:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2776:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2776:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2777:3: ( RULE_ID )
            {
             before(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectCrossReference_1_1_0()); 
            // InternalJSchema.g:2778:3: ( RULE_ID )
            // InternalJSchema.g:2779:4: RULE_ID
            {
             before(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__IncludesMainObjectAssignment_1_1"


    // $ANTLR start "rule__Includes__IncludesPrimitiveObjectAssignment_1_2"
    // InternalJSchema.g:2790:1: rule__Includes__IncludesPrimitiveObjectAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Includes__IncludesPrimitiveObjectAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2794:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2795:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2795:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2796:3: ( RULE_ID )
            {
             before(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectCrossReference_1_2_0()); 
            // InternalJSchema.g:2797:3: ( RULE_ID )
            // InternalJSchema.g:2798:4: RULE_ID
            {
             before(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__IncludesPrimitiveObjectAssignment_1_2"


    // $ANTLR start "rule__Includes__IncludesMainObjectAssignment_1_3_1"
    // InternalJSchema.g:2809:1: rule__Includes__IncludesMainObjectAssignment_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Includes__IncludesMainObjectAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2813:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2814:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2814:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2815:3: ( RULE_ID )
            {
             before(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectCrossReference_1_3_1_0()); 
            // InternalJSchema.g:2816:3: ( RULE_ID )
            // InternalJSchema.g:2817:4: RULE_ID
            {
             before(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectIDTerminalRuleCall_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectIDTerminalRuleCall_1_3_1_0_1()); 

            }

             after(grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectCrossReference_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__IncludesMainObjectAssignment_1_3_1"


    // $ANTLR start "rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2"
    // InternalJSchema.g:2828:1: rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2832:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2833:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2833:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2834:3: ( RULE_ID )
            {
             before(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectCrossReference_1_3_2_0()); 
            // InternalJSchema.g:2835:3: ( RULE_ID )
            // InternalJSchema.g:2836:4: RULE_ID
            {
             before(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectIDTerminalRuleCall_1_3_2_0_1()); 

            }

             after(grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectCrossReference_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__IncludesPrimitiveObjectAssignment_1_3_2"


    // $ANTLR start "rule__Array__NameAssignment_0"
    // InternalJSchema.g:2847:1: rule__Array__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Array__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2851:1: ( ( RULE_ID ) )
            // InternalJSchema.g:2852:2: ( RULE_ID )
            {
            // InternalJSchema.g:2852:2: ( RULE_ID )
            // InternalJSchema.g:2853:3: RULE_ID
            {
             before(grammarAccess.getArrayAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__NameAssignment_0"


    // $ANTLR start "rule__Array__PropertiesAssignment_2_0"
    // InternalJSchema.g:2862:1: rule__Array__PropertiesAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Array__PropertiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2866:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2867:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2867:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2868:3: ( RULE_ID )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_0_0()); 
            // InternalJSchema.g:2869:3: ( RULE_ID )
            // InternalJSchema.g:2870:4: RULE_ID
            {
             before(grammarAccess.getArrayAccess().getPropertiesAbstractObjectIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getPropertiesAbstractObjectIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_0_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2881:1: rule__Array__PropertiesAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Array__PropertiesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2885:1: ( ( ( RULE_ID ) ) )
            // InternalJSchema.g:2886:2: ( ( RULE_ID ) )
            {
            // InternalJSchema.g:2886:2: ( ( RULE_ID ) )
            // InternalJSchema.g:2887:3: ( RULE_ID )
            {
             before(grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_1_1_0()); 
            // InternalJSchema.g:2888:3: ( RULE_ID )
            // InternalJSchema.g:2889:4: RULE_ID
            {
             before(grammarAccess.getArrayAccess().getPropertiesAbstractObjectIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArrayAccess().getPropertiesAbstractObjectIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_1_1_0()); 

            }


            }

        }
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
    // InternalJSchema.g:2900:1: rule__Array__ArrayTypeAssignment_3 : ( ruleArrayType ) ;
    public final void rule__Array__ArrayTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJSchema.g:2904:1: ( ( ruleArrayType ) )
            // InternalJSchema.g:2905:2: ( ruleArrayType )
            {
            // InternalJSchema.g:2905:2: ( ruleArrayType )
            // InternalJSchema.g:2906:3: ruleArrayType
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000018000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002401200000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000401000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000018400000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000018000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000FFFF8000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000401000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000007820L});

}