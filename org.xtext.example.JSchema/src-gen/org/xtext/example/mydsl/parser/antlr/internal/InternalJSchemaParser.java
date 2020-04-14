package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.JSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSchemaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'includes'", "'{'", "'}'", "'with'", "','", "';'", "'String'", "'num'", "'length'", "'pattern'", "'format'", "'-'", "'['", "']'", "'\"date-time\"'", "'\"time\"'", "'\"date\"'", "'\"email\"'", "'\"idn-email\"'", "'\"hostname\"'", "'\"ipv4\"'", "'\"ipv6\"'", "'\"uri\"'", "'\"uri-reference\"'", "'\"iri\"'", "'\"iri-reference\"'", "'\"uri-template\"'", "'\"json-pointer\"'", "'\"relative-json-pointer\"'", "'\"regex\"'"
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

        public InternalJSchemaParser(TokenStream input, JSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected JSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalJSchema.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJSchema.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalJSchema.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalJSchema.g:72:1: ruleModel returns [EObject current=null] : ( (lv_AbstractObject_0_0= ruleAbstractObject ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_AbstractObject_0_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:78:2: ( ( (lv_AbstractObject_0_0= ruleAbstractObject ) )* )
            // InternalJSchema.g:79:2: ( (lv_AbstractObject_0_0= ruleAbstractObject ) )*
            {
            // InternalJSchema.g:79:2: ( (lv_AbstractObject_0_0= ruleAbstractObject ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJSchema.g:80:3: (lv_AbstractObject_0_0= ruleAbstractObject )
            	    {
            	    // InternalJSchema.g:80:3: (lv_AbstractObject_0_0= ruleAbstractObject )
            	    // InternalJSchema.g:81:4: lv_AbstractObject_0_0= ruleAbstractObject
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getAbstractObjectAbstractObjectParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_AbstractObject_0_0=ruleAbstractObject();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"AbstractObject",
            	    					lv_AbstractObject_0_0,
            	    					"org.xtext.example.mydsl.JSchema.AbstractObject");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNumber"
    // InternalJSchema.g:101:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalJSchema.g:101:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalJSchema.g:102:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalJSchema.g:108:1: ruleNumber returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:114:2: ( ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? ) )
            // InternalJSchema.g:115:2: ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            {
            // InternalJSchema.g:115:2: ( ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )? )
            // InternalJSchema.g:116:3: ( (lv_number_0_0= RULE_INT ) ) (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            {
            // InternalJSchema.g:116:3: ( (lv_number_0_0= RULE_INT ) )
            // InternalJSchema.g:117:4: (lv_number_0_0= RULE_INT )
            {
            // InternalJSchema.g:117:4: (lv_number_0_0= RULE_INT )
            // InternalJSchema.g:118:5: lv_number_0_0= RULE_INT
            {
            lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_number_0_0, grammarAccess.getNumberAccess().getNumberINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalJSchema.g:134:3: (otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:135:4: otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                    			
                    // InternalJSchema.g:139:4: ( (lv_decimal_2_0= RULE_INT ) )
                    // InternalJSchema.g:140:5: (lv_decimal_2_0= RULE_INT )
                    {
                    // InternalJSchema.g:140:5: (lv_decimal_2_0= RULE_INT )
                    // InternalJSchema.g:141:6: lv_decimal_2_0= RULE_INT
                    {
                    lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_decimal_2_0, grammarAccess.getNumberAccess().getDecimalINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"decimal",
                    							lv_decimal_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleAbstractObject"
    // InternalJSchema.g:162:1: entryRuleAbstractObject returns [EObject current=null] : iv_ruleAbstractObject= ruleAbstractObject EOF ;
    public final EObject entryRuleAbstractObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractObject = null;


        try {
            // InternalJSchema.g:162:55: (iv_ruleAbstractObject= ruleAbstractObject EOF )
            // InternalJSchema.g:163:2: iv_ruleAbstractObject= ruleAbstractObject EOF
            {
             newCompositeNode(grammarAccess.getAbstractObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractObject=ruleAbstractObject();

            state._fsp--;

             current =iv_ruleAbstractObject; 
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
    // $ANTLR end "entryRuleAbstractObject"


    // $ANTLR start "ruleAbstractObject"
    // InternalJSchema.g:169:1: ruleAbstractObject returns [EObject current=null] : (this_Object_0= ruleObject | this_PrimitiveObject_1= rulePrimitiveObject ) ;
    public final EObject ruleAbstractObject() throws RecognitionException {
        EObject current = null;

        EObject this_Object_0 = null;

        EObject this_PrimitiveObject_1 = null;



        	enterRule();

        try {
            // InternalJSchema.g:175:2: ( (this_Object_0= ruleObject | this_PrimitiveObject_1= rulePrimitiveObject ) )
            // InternalJSchema.g:176:2: (this_Object_0= ruleObject | this_PrimitiveObject_1= rulePrimitiveObject )
            {
            // InternalJSchema.g:176:2: (this_Object_0= ruleObject | this_PrimitiveObject_1= rulePrimitiveObject )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=12 && LA3_1<=13)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==24) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:177:3: this_Object_0= ruleObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractObjectAccess().getObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Object_0=ruleObject();

                    state._fsp--;


                    			current = this_Object_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:186:3: this_PrimitiveObject_1= rulePrimitiveObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveObject_1=rulePrimitiveObject();

                    state._fsp--;


                    			current = this_PrimitiveObject_1;
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
    // $ANTLR end "ruleAbstractObject"


    // $ANTLR start "entryRuleObject"
    // InternalJSchema.g:198:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalJSchema.g:198:47: (iv_ruleObject= ruleObject EOF )
            // InternalJSchema.g:199:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalJSchema.g:205:1: ruleObject returns [EObject current=null] : ( ( (lv_objectName_0_0= RULE_ID ) ) (otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) ) )? otherlv_3= '{' ( (lv_properties_4_0= rulehasProperties ) )? otherlv_5= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_objectName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_includeObjects_2_0 = null;

        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:211:2: ( ( ( (lv_objectName_0_0= RULE_ID ) ) (otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) ) )? otherlv_3= '{' ( (lv_properties_4_0= rulehasProperties ) )? otherlv_5= '}' ) )
            // InternalJSchema.g:212:2: ( ( (lv_objectName_0_0= RULE_ID ) ) (otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) ) )? otherlv_3= '{' ( (lv_properties_4_0= rulehasProperties ) )? otherlv_5= '}' )
            {
            // InternalJSchema.g:212:2: ( ( (lv_objectName_0_0= RULE_ID ) ) (otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) ) )? otherlv_3= '{' ( (lv_properties_4_0= rulehasProperties ) )? otherlv_5= '}' )
            // InternalJSchema.g:213:3: ( (lv_objectName_0_0= RULE_ID ) ) (otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) ) )? otherlv_3= '{' ( (lv_properties_4_0= rulehasProperties ) )? otherlv_5= '}'
            {
            // InternalJSchema.g:213:3: ( (lv_objectName_0_0= RULE_ID ) )
            // InternalJSchema.g:214:4: (lv_objectName_0_0= RULE_ID )
            {
            // InternalJSchema.g:214:4: (lv_objectName_0_0= RULE_ID )
            // InternalJSchema.g:215:5: lv_objectName_0_0= RULE_ID
            {
            lv_objectName_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_objectName_0_0, grammarAccess.getObjectAccess().getObjectNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objectName",
            						lv_objectName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJSchema.g:231:3: (otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:232:4: otherlv_1= 'includes' ( (lv_includeObjects_2_0= ruleIncludes ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getIncludesKeyword_1_0());
                    			
                    // InternalJSchema.g:236:4: ( (lv_includeObjects_2_0= ruleIncludes ) )
                    // InternalJSchema.g:237:5: (lv_includeObjects_2_0= ruleIncludes )
                    {
                    // InternalJSchema.g:237:5: (lv_includeObjects_2_0= ruleIncludes )
                    // InternalJSchema.g:238:6: lv_includeObjects_2_0= ruleIncludes
                    {

                    						newCompositeNode(grammarAccess.getObjectAccess().getIncludeObjectsIncludesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_includeObjects_2_0=ruleIncludes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectRule());
                    						}
                    						set(
                    							current,
                    							"includeObjects",
                    							lv_includeObjects_2_0,
                    							"org.xtext.example.mydsl.JSchema.Includes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJSchema.g:260:3: ( (lv_properties_4_0= rulehasProperties ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJSchema.g:261:4: (lv_properties_4_0= rulehasProperties )
                    {
                    // InternalJSchema.g:261:4: (lv_properties_4_0= rulehasProperties )
                    // InternalJSchema.g:262:5: lv_properties_4_0= rulehasProperties
                    {

                    					newCompositeNode(grammarAccess.getObjectAccess().getPropertiesHasPropertiesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_properties_4_0=rulehasProperties();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectRule());
                    					}
                    					add(
                    						current,
                    						"properties",
                    						lv_properties_4_0,
                    						"org.xtext.example.mydsl.JSchema.hasProperties");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:287:1: entryRulePrimitiveObject returns [EObject current=null] : iv_rulePrimitiveObject= rulePrimitiveObject EOF ;
    public final EObject entryRulePrimitiveObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveObject = null;


        try {
            // InternalJSchema.g:287:56: (iv_rulePrimitiveObject= rulePrimitiveObject EOF )
            // InternalJSchema.g:288:2: iv_rulePrimitiveObject= rulePrimitiveObject EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveObject=rulePrimitiveObject();

            state._fsp--;

             current =iv_rulePrimitiveObject; 
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
    // $ANTLR end "entryRulePrimitiveObject"


    // $ANTLR start "rulePrimitiveObject"
    // InternalJSchema.g:294:1: rulePrimitiveObject returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) ;
    public final EObject rulePrimitiveObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_primitiveProperties_2_0 = null;

        EObject lv_primitiveProperties_4_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:300:2: ( ( ( (lv_type_0_0= ruleTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) )
            // InternalJSchema.g:301:2: ( ( (lv_type_0_0= ruleTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            {
            // InternalJSchema.g:301:2: ( ( (lv_type_0_0= ruleTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            // InternalJSchema.g:302:3: ( (lv_type_0_0= ruleTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            {
            // InternalJSchema.g:302:3: ( (lv_type_0_0= ruleTypes ) )
            // InternalJSchema.g:303:4: (lv_type_0_0= ruleTypes )
            {
            // InternalJSchema.g:303:4: (lv_type_0_0= ruleTypes )
            // InternalJSchema.g:304:5: lv_type_0_0= ruleTypes
            {

            					newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getTypeTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_0_0=ruleTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.JSchema.Types");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJSchema.g:321:3: (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJSchema.g:322:4: otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0());
                    			
                    // InternalJSchema.g:326:4: ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) )
                    // InternalJSchema.g:327:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    {
                    // InternalJSchema.g:327:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    // InternalJSchema.g:328:6: lv_primitiveProperties_2_0= rulePrimitiveProperties
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_primitiveProperties_2_0=rulePrimitiveProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
                    						}
                    						add(
                    							current,
                    							"primitiveProperties",
                    							lv_primitiveProperties_2_0,
                    							"org.xtext.example.mydsl.JSchema.PrimitiveProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSchema.g:345:4: (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJSchema.g:346:5: otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalJSchema.g:350:5: ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    // InternalJSchema.g:351:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    {
                    	    // InternalJSchema.g:351:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    // InternalJSchema.g:352:7: lv_primitiveProperties_4_0= rulePrimitiveProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_primitiveProperties_4_0=rulePrimitiveProperties();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"primitiveProperties",
                    	    								lv_primitiveProperties_4_0,
                    	    								"org.xtext.example.mydsl.JSchema.PrimitiveProperties");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveObjectAccess().getSemicolonKeyword_1_3());
                    			

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
    // $ANTLR end "rulePrimitiveObject"


    // $ANTLR start "entryRuleTypes"
    // InternalJSchema.g:379:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalJSchema.g:379:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalJSchema.g:380:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalJSchema.g:386:1: ruleTypes returns [EObject current=null] : ( ( () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) ) ) | ( (lv_array_3_0= ruleArray ) ) | (otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) ) ) ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_4=null;
        EObject lv_array_3_0 = null;

        EObject lv_number_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:392:2: ( ( ( () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) ) ) | ( (lv_array_3_0= ruleArray ) ) | (otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) ) ) ) )
            // InternalJSchema.g:393:2: ( ( () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) ) ) | ( (lv_array_3_0= ruleArray ) ) | (otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) ) ) )
            {
            // InternalJSchema.g:393:2: ( ( () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) ) ) | ( (lv_array_3_0= ruleArray ) ) | (otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:394:3: ( () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) ) )
                    {
                    // InternalJSchema.g:394:3: ( () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) ) )
                    // InternalJSchema.g:395:4: () otherlv_1= 'String' ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalJSchema.g:395:4: ()
                    // InternalJSchema.g:396:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getSTRINGAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypesAccess().getStringKeyword_0_1());
                    			
                    // InternalJSchema.g:406:4: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalJSchema.g:407:5: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalJSchema.g:407:5: (lv_string_2_0= RULE_STRING )
                    // InternalJSchema.g:408:6: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_2_0, grammarAccess.getTypesAccess().getStringSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:426:3: ( (lv_array_3_0= ruleArray ) )
                    {
                    // InternalJSchema.g:426:3: ( (lv_array_3_0= ruleArray ) )
                    // InternalJSchema.g:427:4: (lv_array_3_0= ruleArray )
                    {
                    // InternalJSchema.g:427:4: (lv_array_3_0= ruleArray )
                    // InternalJSchema.g:428:5: lv_array_3_0= ruleArray
                    {

                    					newCompositeNode(grammarAccess.getTypesAccess().getArrayArrayParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=ruleArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypesRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_3_0,
                    						"org.xtext.example.mydsl.JSchema.Array");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:446:3: (otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) ) )
                    {
                    // InternalJSchema.g:446:3: (otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) ) )
                    // InternalJSchema.g:447:4: otherlv_4= 'num' ( (lv_number_5_0= ruleNumber ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTypesAccess().getNumKeyword_2_0());
                    			
                    // InternalJSchema.g:451:4: ( (lv_number_5_0= ruleNumber ) )
                    // InternalJSchema.g:452:5: (lv_number_5_0= ruleNumber )
                    {
                    // InternalJSchema.g:452:5: (lv_number_5_0= ruleNumber )
                    // InternalJSchema.g:453:6: lv_number_5_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getTypesAccess().getNumberNumberParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_5_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypesRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_5_0,
                    							"org.xtext.example.mydsl.JSchema.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRulehasProperties"
    // InternalJSchema.g:475:1: entryRulehasProperties returns [EObject current=null] : iv_rulehasProperties= rulehasProperties EOF ;
    public final EObject entryRulehasProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulehasProperties = null;


        try {
            // InternalJSchema.g:475:54: (iv_rulehasProperties= rulehasProperties EOF )
            // InternalJSchema.g:476:2: iv_rulehasProperties= rulehasProperties EOF
            {
             newCompositeNode(grammarAccess.getHasPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulehasProperties=rulehasProperties();

            state._fsp--;

             current =iv_rulehasProperties; 
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
    // $ANTLR end "entryRulehasProperties"


    // $ANTLR start "rulehasProperties"
    // InternalJSchema.g:482:1: rulehasProperties returns [EObject current=null] : ( (lv_properties_0_0= ruleProperty ) ) ;
    public final EObject rulehasProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_0_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:488:2: ( ( (lv_properties_0_0= ruleProperty ) ) )
            // InternalJSchema.g:489:2: ( (lv_properties_0_0= ruleProperty ) )
            {
            // InternalJSchema.g:489:2: ( (lv_properties_0_0= ruleProperty ) )
            // InternalJSchema.g:490:3: (lv_properties_0_0= ruleProperty )
            {
            // InternalJSchema.g:490:3: (lv_properties_0_0= ruleProperty )
            // InternalJSchema.g:491:4: lv_properties_0_0= ruleProperty
            {

            				newCompositeNode(grammarAccess.getHasPropertiesAccess().getPropertiesPropertyParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_properties_0_0=ruleProperty();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getHasPropertiesRule());
            				}
            				set(
            					current,
            					"properties",
            					lv_properties_0_0,
            					"org.xtext.example.mydsl.JSchema.Property");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulehasProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalJSchema.g:511:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJSchema.g:511:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJSchema.g:512:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJSchema.g:518:1: ruleProperty returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypes ) ) | ( (lv_object_1_0= ruleObject ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_object_1_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:524:2: ( ( ( (lv_type_0_0= ruleTypes ) ) | ( (lv_object_1_0= ruleObject ) ) ) )
            // InternalJSchema.g:525:2: ( ( (lv_type_0_0= ruleTypes ) ) | ( (lv_object_1_0= ruleObject ) ) )
            {
            // InternalJSchema.g:525:2: ( ( (lv_type_0_0= ruleTypes ) ) | ( (lv_object_1_0= ruleObject ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=19)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==24) ) {
                    alt9=1;
                }
                else if ( ((LA9_2>=12 && LA9_2<=13)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:526:3: ( (lv_type_0_0= ruleTypes ) )
                    {
                    // InternalJSchema.g:526:3: ( (lv_type_0_0= ruleTypes ) )
                    // InternalJSchema.g:527:4: (lv_type_0_0= ruleTypes )
                    {
                    // InternalJSchema.g:527:4: (lv_type_0_0= ruleTypes )
                    // InternalJSchema.g:528:5: lv_type_0_0= ruleTypes
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_0=ruleTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.example.mydsl.JSchema.Types");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:546:3: ( (lv_object_1_0= ruleObject ) )
                    {
                    // InternalJSchema.g:546:3: ( (lv_object_1_0= ruleObject ) )
                    // InternalJSchema.g:547:4: (lv_object_1_0= ruleObject )
                    {
                    // InternalJSchema.g:547:4: (lv_object_1_0= ruleObject )
                    // InternalJSchema.g:548:5: lv_object_1_0= ruleObject
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getObjectObjectParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_object_1_0=ruleObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"object",
                    						lv_object_1_0,
                    						"org.xtext.example.mydsl.JSchema.Object");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePrimitiveProperties"
    // InternalJSchema.g:569:1: entryRulePrimitiveProperties returns [EObject current=null] : iv_rulePrimitiveProperties= rulePrimitiveProperties EOF ;
    public final EObject entryRulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveProperties = null;


        try {
            // InternalJSchema.g:569:60: (iv_rulePrimitiveProperties= rulePrimitiveProperties EOF )
            // InternalJSchema.g:570:2: iv_rulePrimitiveProperties= rulePrimitiveProperties EOF
            {
             newCompositeNode(grammarAccess.getPrimitivePropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveProperties=rulePrimitiveProperties();

            state._fsp--;

             current =iv_rulePrimitiveProperties; 
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
    // $ANTLR end "entryRulePrimitiveProperties"


    // $ANTLR start "rulePrimitiveProperties"
    // InternalJSchema.g:576:1: rulePrimitiveProperties returns [EObject current=null] : ( (otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) ;
    public final EObject rulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_patternString_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_stringLenght_1_0 = null;

        Enumerator lv_stringFormat_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:582:2: ( ( (otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) )
            // InternalJSchema.g:583:2: ( (otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            {
            // InternalJSchema.g:583:2: ( (otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:584:3: (otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) ) )
                    {
                    // InternalJSchema.g:584:3: (otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) ) )
                    // InternalJSchema.g:585:4: otherlv_0= 'length' ( (lv_stringLenght_1_0= ruleStringLength ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0());
                    			
                    // InternalJSchema.g:589:4: ( (lv_stringLenght_1_0= ruleStringLength ) )
                    // InternalJSchema.g:590:5: (lv_stringLenght_1_0= ruleStringLength )
                    {
                    // InternalJSchema.g:590:5: (lv_stringLenght_1_0= ruleStringLength )
                    // InternalJSchema.g:591:6: lv_stringLenght_1_0= ruleStringLength
                    {

                    						newCompositeNode(grammarAccess.getPrimitivePropertiesAccess().getStringLenghtStringLengthParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stringLenght_1_0=ruleStringLength();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						set(
                    							current,
                    							"stringLenght",
                    							lv_stringLenght_1_0,
                    							"org.xtext.example.mydsl.JSchema.StringLength");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:610:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    {
                    // InternalJSchema.g:610:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    // InternalJSchema.g:611:4: otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0());
                    			
                    // InternalJSchema.g:615:4: ( (lv_patternString_3_0= RULE_STRING ) )
                    // InternalJSchema.g:616:5: (lv_patternString_3_0= RULE_STRING )
                    {
                    // InternalJSchema.g:616:5: (lv_patternString_3_0= RULE_STRING )
                    // InternalJSchema.g:617:6: lv_patternString_3_0= RULE_STRING
                    {
                    lv_patternString_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_patternString_3_0, grammarAccess.getPrimitivePropertiesAccess().getPatternStringSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"patternString",
                    							lv_patternString_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:635:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    {
                    // InternalJSchema.g:635:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    // InternalJSchema.g:636:4: otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0());
                    			
                    // InternalJSchema.g:640:4: ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    // InternalJSchema.g:641:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    {
                    // InternalJSchema.g:641:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    // InternalJSchema.g:642:6: lv_stringFormat_5_0= ruleFormatTypes
                    {

                    						newCompositeNode(grammarAccess.getPrimitivePropertiesAccess().getStringFormatFormatTypesEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stringFormat_5_0=ruleFormatTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						set(
                    							current,
                    							"stringFormat",
                    							lv_stringFormat_5_0,
                    							"org.xtext.example.mydsl.JSchema.FormatTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulePrimitiveProperties"


    // $ANTLR start "entryRuleStringLength"
    // InternalJSchema.g:664:1: entryRuleStringLength returns [String current=null] : iv_ruleStringLength= ruleStringLength EOF ;
    public final String entryRuleStringLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLength = null;


        try {
            // InternalJSchema.g:664:52: (iv_ruleStringLength= ruleStringLength EOF )
            // InternalJSchema.g:665:2: iv_ruleStringLength= ruleStringLength EOF
            {
             newCompositeNode(grammarAccess.getStringLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLength=ruleStringLength();

            state._fsp--;

             current =iv_ruleStringLength.getText(); 
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
    // $ANTLR end "entryRuleStringLength"


    // $ANTLR start "ruleStringLength"
    // InternalJSchema.g:671:1: ruleStringLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleStringLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalJSchema.g:677:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) )
            // InternalJSchema.g:678:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            {
            // InternalJSchema.g:678:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            // InternalJSchema.g:679:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,23,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getStringLengthAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleStringLength"


    // $ANTLR start "entryRuleIncludes"
    // InternalJSchema.g:702:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalJSchema.g:702:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalJSchema.g:703:2: iv_ruleIncludes= ruleIncludes EOF
            {
             newCompositeNode(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludes=ruleIncludes();

            state._fsp--;

             current =iv_ruleIncludes; 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalJSchema.g:709:1: ruleIncludes returns [EObject current=null] : ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token lv_objectID_0_0=null;
        Token otherlv_1=null;
        Token lv_objectID_2_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:715:2: ( ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* ) )
            // InternalJSchema.g:716:2: ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* )
            {
            // InternalJSchema.g:716:2: ( ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )* )
            // InternalJSchema.g:717:3: ( (lv_objectID_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )*
            {
            // InternalJSchema.g:717:3: ( (lv_objectID_0_0= RULE_STRING ) )
            // InternalJSchema.g:718:4: (lv_objectID_0_0= RULE_STRING )
            {
            // InternalJSchema.g:718:4: (lv_objectID_0_0= RULE_STRING )
            // InternalJSchema.g:719:5: lv_objectID_0_0= RULE_STRING
            {
            lv_objectID_0_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_objectID_0_0, grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"objectID",
            						lv_objectID_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalJSchema.g:735:3: (otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJSchema.g:736:4: otherlv_1= ',' ( (lv_objectID_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalJSchema.g:740:4: ( (lv_objectID_2_0= RULE_STRING ) )
            	    // InternalJSchema.g:741:5: (lv_objectID_2_0= RULE_STRING )
            	    {
            	    // InternalJSchema.g:741:5: (lv_objectID_2_0= RULE_STRING )
            	    // InternalJSchema.g:742:6: lv_objectID_2_0= RULE_STRING
            	    {
            	    lv_objectID_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    						newLeafNode(lv_objectID_2_0, grammarAccess.getIncludesAccess().getObjectIDSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIncludesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"objectID",
            	    							lv_objectID_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleArray"
    // InternalJSchema.g:763:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSchema.g:763:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSchema.g:764:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalJSchema.g:770:1: ruleArray returns [EObject current=null] : ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token lv_arrayName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:776:2: ( ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? otherlv_5= ']' ) )
            // InternalJSchema.g:777:2: ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? otherlv_5= ']' )
            {
            // InternalJSchema.g:777:2: ( ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? otherlv_5= ']' )
            // InternalJSchema.g:778:3: ( (lv_arrayName_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )? otherlv_5= ']'
            {
            // InternalJSchema.g:778:3: ( (lv_arrayName_0_0= RULE_ID ) )
            // InternalJSchema.g:779:4: (lv_arrayName_0_0= RULE_ID )
            {
            // InternalJSchema.g:779:4: (lv_arrayName_0_0= RULE_ID )
            // InternalJSchema.g:780:5: lv_arrayName_0_0= RULE_ID
            {
            lv_arrayName_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_arrayName_0_0, grammarAccess.getArrayAccess().getArrayNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"arrayName",
            						lv_arrayName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJSchema.g:800:3: ( ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=18 && LA13_0<=19)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:801:4: ( (lv_properties_2_0= ruleProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )*
                    {
                    // InternalJSchema.g:801:4: ( (lv_properties_2_0= ruleProperty ) )
                    // InternalJSchema.g:802:5: (lv_properties_2_0= ruleProperty )
                    {
                    // InternalJSchema.g:802:5: (lv_properties_2_0= ruleProperty )
                    // InternalJSchema.g:803:6: lv_properties_2_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_properties_2_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_2_0,
                    							"org.xtext.example.mydsl.JSchema.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJSchema.g:820:4: (otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalJSchema.g:821:5: otherlv_3= ',' ( (lv_properties_4_0= ruleProperty ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_20); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJSchema.g:825:5: ( (lv_properties_4_0= ruleProperty ) )
                    	    // InternalJSchema.g:826:6: (lv_properties_4_0= ruleProperty )
                    	    {
                    	    // InternalJSchema.g:826:6: (lv_properties_4_0= ruleProperty )
                    	    // InternalJSchema.g:827:7: lv_properties_4_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayAccess().getPropertiesPropertyParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_properties_4_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_4_0,
                    	    								"org.xtext.example.mydsl.JSchema.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "ruleFormatTypes"
    // InternalJSchema.g:854:1: ruleFormatTypes returns [Enumerator current=null] : ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) ) ;
    public final Enumerator ruleFormatTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalJSchema.g:860:2: ( ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) ) )
            // InternalJSchema.g:861:2: ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) )
            {
            // InternalJSchema.g:861:2: ( (enumLiteral_0= '\"date-time\"' ) | (enumLiteral_1= '\"time\"' ) | (enumLiteral_2= '\"date\"' ) | (enumLiteral_3= '\"email\"' ) | (enumLiteral_4= '\"idn-email\"' ) | (enumLiteral_5= '\"hostname\"' ) | (enumLiteral_6= '\"ipv4\"' ) | (enumLiteral_7= '\"ipv6\"' ) | (enumLiteral_8= '\"uri\"' ) | (enumLiteral_9= '\"uri-reference\"' ) | (enumLiteral_10= '\"iri\"' ) | (enumLiteral_11= '\"iri-reference\"' ) | (enumLiteral_12= '\"uri-template\"' ) | (enumLiteral_13= '\"json-pointer\"' ) | (enumLiteral_14= '\"relative-json-pointer\"' ) | (enumLiteral_15= '\"regex\"' ) )
            int alt14=16;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 30:
                {
                alt14=5;
                }
                break;
            case 31:
                {
                alt14=6;
                }
                break;
            case 32:
                {
                alt14=7;
                }
                break;
            case 33:
                {
                alt14=8;
                }
                break;
            case 34:
                {
                alt14=9;
                }
                break;
            case 35:
                {
                alt14=10;
                }
                break;
            case 36:
                {
                alt14=11;
                }
                break;
            case 37:
                {
                alt14=12;
                }
                break;
            case 38:
                {
                alt14=13;
                }
                break;
            case 39:
                {
                alt14=14;
                }
                break;
            case 40:
                {
                alt14=15;
                }
                break;
            case 41:
                {
                alt14=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJSchema.g:862:3: (enumLiteral_0= '\"date-time\"' )
                    {
                    // InternalJSchema.g:862:3: (enumLiteral_0= '\"date-time\"' )
                    // InternalJSchema.g:863:4: enumLiteral_0= '\"date-time\"'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:870:3: (enumLiteral_1= '\"time\"' )
                    {
                    // InternalJSchema.g:870:3: (enumLiteral_1= '\"time\"' )
                    // InternalJSchema.g:871:4: enumLiteral_1= '\"time\"'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:878:3: (enumLiteral_2= '\"date\"' )
                    {
                    // InternalJSchema.g:878:3: (enumLiteral_2= '\"date\"' )
                    // InternalJSchema.g:879:4: enumLiteral_2= '\"date\"'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:886:3: (enumLiteral_3= '\"email\"' )
                    {
                    // InternalJSchema.g:886:3: (enumLiteral_3= '\"email\"' )
                    // InternalJSchema.g:887:4: enumLiteral_3= '\"email\"'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:894:3: (enumLiteral_4= '\"idn-email\"' )
                    {
                    // InternalJSchema.g:894:3: (enumLiteral_4= '\"idn-email\"' )
                    // InternalJSchema.g:895:4: enumLiteral_4= '\"idn-email\"'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:902:3: (enumLiteral_5= '\"hostname\"' )
                    {
                    // InternalJSchema.g:902:3: (enumLiteral_5= '\"hostname\"' )
                    // InternalJSchema.g:903:4: enumLiteral_5= '\"hostname\"'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:910:3: (enumLiteral_6= '\"ipv4\"' )
                    {
                    // InternalJSchema.g:910:3: (enumLiteral_6= '\"ipv4\"' )
                    // InternalJSchema.g:911:4: enumLiteral_6= '\"ipv4\"'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:918:3: (enumLiteral_7= '\"ipv6\"' )
                    {
                    // InternalJSchema.g:918:3: (enumLiteral_7= '\"ipv6\"' )
                    // InternalJSchema.g:919:4: enumLiteral_7= '\"ipv6\"'
                    {
                    enumLiteral_7=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:926:3: (enumLiteral_8= '\"uri\"' )
                    {
                    // InternalJSchema.g:926:3: (enumLiteral_8= '\"uri\"' )
                    // InternalJSchema.g:927:4: enumLiteral_8= '\"uri\"'
                    {
                    enumLiteral_8=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:934:3: (enumLiteral_9= '\"uri-reference\"' )
                    {
                    // InternalJSchema.g:934:3: (enumLiteral_9= '\"uri-reference\"' )
                    // InternalJSchema.g:935:4: enumLiteral_9= '\"uri-reference\"'
                    {
                    enumLiteral_9=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:942:3: (enumLiteral_10= '\"iri\"' )
                    {
                    // InternalJSchema.g:942:3: (enumLiteral_10= '\"iri\"' )
                    // InternalJSchema.g:943:4: enumLiteral_10= '\"iri\"'
                    {
                    enumLiteral_10=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:950:3: (enumLiteral_11= '\"iri-reference\"' )
                    {
                    // InternalJSchema.g:950:3: (enumLiteral_11= '\"iri-reference\"' )
                    // InternalJSchema.g:951:4: enumLiteral_11= '\"iri-reference\"'
                    {
                    enumLiteral_11=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:958:3: (enumLiteral_12= '\"uri-template\"' )
                    {
                    // InternalJSchema.g:958:3: (enumLiteral_12= '\"uri-template\"' )
                    // InternalJSchema.g:959:4: enumLiteral_12= '\"uri-template\"'
                    {
                    enumLiteral_12=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:966:3: (enumLiteral_13= '\"json-pointer\"' )
                    {
                    // InternalJSchema.g:966:3: (enumLiteral_13= '\"json-pointer\"' )
                    // InternalJSchema.g:967:4: enumLiteral_13= '\"json-pointer\"'
                    {
                    enumLiteral_13=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:974:3: (enumLiteral_14= '\"relative-json-pointer\"' )
                    {
                    // InternalJSchema.g:974:3: (enumLiteral_14= '\"relative-json-pointer\"' )
                    // InternalJSchema.g:975:4: enumLiteral_14= '\"relative-json-pointer\"'
                    {
                    enumLiteral_14=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:982:3: (enumLiteral_15= '\"regex\"' )
                    {
                    // InternalJSchema.g:982:3: (enumLiteral_15= '\"regex\"' )
                    // InternalJSchema.g:983:4: enumLiteral_15= '\"regex\"'
                    {
                    enumLiteral_15=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_15());
                    			

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
    // $ANTLR end "ruleFormatTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000C0022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C4020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003FFFC000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000020C0020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000C0020L});

}