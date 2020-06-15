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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'{'", "','", "'}'", "'extends'", "'with'", "';'", "'String'", "'num'", "'='", "'root'", "'length'", "'pattern'", "'format'", "'-'", "'includes'", "'['", "']'", "'string'", "'integer'", "'float'", "'double'", "'null'", "'date-time'", "'time'", "'date'", "'email'", "'idn-email'", "'hostname'", "'ipv4'", "'ipv6'", "'uri'", "'uri-reference'", "'iri'", "'iri-reference'", "'uri-template'", "'json-pointer'", "'relative-json-pointer'", "'regex'"
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
    // InternalJSchema.g:169:1: ruleAbstractObject returns [EObject current=null] : ( ( (lv_mainObject_0_0= ruleMainObject ) ) | ( (lv_primitiveObject_1_0= rulePrimitiveObject ) ) ) ;
    public final EObject ruleAbstractObject() throws RecognitionException {
        EObject current = null;

        EObject lv_mainObject_0_0 = null;

        EObject lv_primitiveObject_1_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:175:2: ( ( ( (lv_mainObject_0_0= ruleMainObject ) ) | ( (lv_primitiveObject_1_0= rulePrimitiveObject ) ) ) )
            // InternalJSchema.g:176:2: ( ( (lv_mainObject_0_0= ruleMainObject ) ) | ( (lv_primitiveObject_1_0= rulePrimitiveObject ) ) )
            {
            // InternalJSchema.g:176:2: ( ( (lv_mainObject_0_0= ruleMainObject ) ) | ( (lv_primitiveObject_1_0= rulePrimitiveObject ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=12 && LA3_1<=15)||(LA3_1>=18 && LA3_1<=19)||LA3_1==21||LA3_1==26) ) {
                    alt3=1;
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
                    // InternalJSchema.g:177:3: ( (lv_mainObject_0_0= ruleMainObject ) )
                    {
                    // InternalJSchema.g:177:3: ( (lv_mainObject_0_0= ruleMainObject ) )
                    // InternalJSchema.g:178:4: (lv_mainObject_0_0= ruleMainObject )
                    {
                    // InternalJSchema.g:178:4: (lv_mainObject_0_0= ruleMainObject )
                    // InternalJSchema.g:179:5: lv_mainObject_0_0= ruleMainObject
                    {

                    					newCompositeNode(grammarAccess.getAbstractObjectAccess().getMainObjectMainObjectParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mainObject_0_0=ruleMainObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractObjectRule());
                    					}
                    					set(
                    						current,
                    						"mainObject",
                    						lv_mainObject_0_0,
                    						"org.xtext.example.mydsl.JSchema.MainObject");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:197:3: ( (lv_primitiveObject_1_0= rulePrimitiveObject ) )
                    {
                    // InternalJSchema.g:197:3: ( (lv_primitiveObject_1_0= rulePrimitiveObject ) )
                    // InternalJSchema.g:198:4: (lv_primitiveObject_1_0= rulePrimitiveObject )
                    {
                    // InternalJSchema.g:198:4: (lv_primitiveObject_1_0= rulePrimitiveObject )
                    // InternalJSchema.g:199:5: lv_primitiveObject_1_0= rulePrimitiveObject
                    {

                    					newCompositeNode(grammarAccess.getAbstractObjectAccess().getPrimitiveObjectPrimitiveObjectParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitiveObject_1_0=rulePrimitiveObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAbstractObjectRule());
                    					}
                    					set(
                    						current,
                    						"primitiveObject",
                    						lv_primitiveObject_1_0,
                    						"org.xtext.example.mydsl.JSchema.PrimitiveObject");
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
    // $ANTLR end "ruleAbstractObject"


    // $ANTLR start "entryRuleMainObject"
    // InternalJSchema.g:220:1: entryRuleMainObject returns [EObject current=null] : iv_ruleMainObject= ruleMainObject EOF ;
    public final EObject entryRuleMainObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainObject = null;


        try {
            // InternalJSchema.g:220:51: (iv_ruleMainObject= ruleMainObject EOF )
            // InternalJSchema.g:221:2: iv_ruleMainObject= ruleMainObject EOF
            {
             newCompositeNode(grammarAccess.getMainObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainObject=ruleMainObject();

            state._fsp--;

             current =iv_ruleMainObject; 
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
    // $ANTLR end "entryRuleMainObject"


    // $ANTLR start "ruleMainObject"
    // InternalJSchema.g:227:1: ruleMainObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? (otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}' )? ) ;
    public final EObject ruleMainObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_root_1_0 = null;

        EObject lv_inherits_2_1 = null;

        EObject lv_inherits_2_2 = null;

        EObject lv_properties_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:233:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? (otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}' )? ) )
            // InternalJSchema.g:234:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? (otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}' )? )
            {
            // InternalJSchema.g:234:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? (otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}' )? )
            // InternalJSchema.g:235:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? (otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}' )?
            {
            // InternalJSchema.g:235:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJSchema.g:236:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJSchema.g:236:4: (lv_name_0_0= RULE_ID )
            // InternalJSchema.g:237:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMainObjectAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJSchema.g:253:3: ( (lv_root_1_0= ruleIsRoot ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:254:4: (lv_root_1_0= ruleIsRoot )
                    {
                    // InternalJSchema.g:254:4: (lv_root_1_0= ruleIsRoot )
                    // InternalJSchema.g:255:5: lv_root_1_0= ruleIsRoot
                    {

                    					newCompositeNode(grammarAccess.getMainObjectAccess().getRootIsRootParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_root_1_0=ruleIsRoot();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainObjectRule());
                    					}
                    					set(
                    						current,
                    						"root",
                    						lv_root_1_0,
                    						"org.xtext.example.mydsl.JSchema.IsRoot");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJSchema.g:272:3: ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:273:4: ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) )
                    {
                    // InternalJSchema.g:273:4: ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) )
                    // InternalJSchema.g:274:5: (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes )
                    {
                    // InternalJSchema.g:274:5: (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID||LA5_0==15) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==26) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalJSchema.g:275:6: lv_inherits_2_1= ruleExtends
                            {

                            						newCompositeNode(grammarAccess.getMainObjectAccess().getInheritsExtendsParserRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_8);
                            lv_inherits_2_1=ruleExtends();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getMainObjectRule());
                            						}
                            						set(
                            							current,
                            							"inherits",
                            							lv_inherits_2_1,
                            							"org.xtext.example.mydsl.JSchema.Extends");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalJSchema.g:291:6: lv_inherits_2_2= ruleIncludes
                            {

                            						newCompositeNode(grammarAccess.getMainObjectAccess().getInheritsIncludesParserRuleCall_2_0_1());
                            					
                            pushFollow(FOLLOW_8);
                            lv_inherits_2_2=ruleIncludes();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getMainObjectRule());
                            						}
                            						set(
                            							current,
                            							"inherits",
                            							lv_inherits_2_2,
                            							"org.xtext.example.mydsl.JSchema.Includes");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalJSchema.g:309:3: (otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:310:4: otherlv_3= '{' ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )? otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalJSchema.g:314:4: ( ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||(LA8_0>=18 && LA8_0<=19)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalJSchema.g:315:5: ( (lv_properties_4_0= ruleAbstractObject ) ) (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )*
                            {
                            // InternalJSchema.g:315:5: ( (lv_properties_4_0= ruleAbstractObject ) )
                            // InternalJSchema.g:316:6: (lv_properties_4_0= ruleAbstractObject )
                            {
                            // InternalJSchema.g:316:6: (lv_properties_4_0= ruleAbstractObject )
                            // InternalJSchema.g:317:7: lv_properties_4_0= ruleAbstractObject
                            {

                            							newCompositeNode(grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_properties_4_0=ruleAbstractObject();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMainObjectRule());
                            							}
                            							add(
                            								current,
                            								"properties",
                            								lv_properties_4_0,
                            								"org.xtext.example.mydsl.JSchema.AbstractObject");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalJSchema.g:334:5: (otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==13) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalJSchema.g:335:6: otherlv_5= ',' ( (lv_properties_6_0= ruleAbstractObject ) )
                            	    {
                            	    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getMainObjectAccess().getCommaKeyword_3_1_1_0());
                            	    					
                            	    // InternalJSchema.g:339:6: ( (lv_properties_6_0= ruleAbstractObject ) )
                            	    // InternalJSchema.g:340:7: (lv_properties_6_0= ruleAbstractObject )
                            	    {
                            	    // InternalJSchema.g:340:7: (lv_properties_6_0= ruleAbstractObject )
                            	    // InternalJSchema.g:341:8: lv_properties_6_0= ruleAbstractObject
                            	    {

                            	    								newCompositeNode(grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_10);
                            	    lv_properties_6_0=ruleAbstractObject();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMainObjectRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"properties",
                            	    									lv_properties_6_0,
                            	    									"org.xtext.example.mydsl.JSchema.AbstractObject");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleMainObject"


    // $ANTLR start "entryRuleExtends"
    // InternalJSchema.g:369:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalJSchema.g:369:48: (iv_ruleExtends= ruleExtends EOF )
            // InternalJSchema.g:370:2: iv_ruleExtends= ruleExtends EOF
            {
             newCompositeNode(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtends=ruleExtends();

            state._fsp--;

             current =iv_ruleExtends; 
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
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // InternalJSchema.g:376:1: ruleExtends returns [EObject current=null] : ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )* ) ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalJSchema.g:382:2: ( ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )* ) ) )
            // InternalJSchema.g:383:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )* ) )
            {
            // InternalJSchema.g:383:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) ) | ( ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )* ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSchema.g:384:3: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalJSchema.g:384:3: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) )
                    // InternalJSchema.g:385:4: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0_0());
                    			
                    // InternalJSchema.g:389:4: ( (otherlv_1= RULE_ID ) )
                    // InternalJSchema.g:390:5: (otherlv_1= RULE_ID )
                    {
                    // InternalJSchema.g:390:5: (otherlv_1= RULE_ID )
                    // InternalJSchema.g:391:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendsRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:404:3: ( ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalJSchema.g:404:3: ( ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalJSchema.g:405:4: ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalJSchema.g:405:4: ( (otherlv_2= RULE_ID ) )
                    // InternalJSchema.g:406:5: (otherlv_2= RULE_ID )
                    {
                    // InternalJSchema.g:406:5: (otherlv_2= RULE_ID )
                    // InternalJSchema.g:407:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendsRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_2, grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalJSchema.g:418:4: ( (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) ) | ( (otherlv_5= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=2;
                        }
                        else if ( (LA10_0==13) ) {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==RULE_ID) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJSchema.g:419:5: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )
                    	    {
                    	    // InternalJSchema.g:419:5: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )
                    	    // InternalJSchema.g:420:6: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_11); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getExtendsAccess().getCommaKeyword_1_1_0_0());
                    	    					
                    	    // InternalJSchema.g:424:6: ( (otherlv_4= RULE_ID ) )
                    	    // InternalJSchema.g:425:7: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalJSchema.g:425:7: (otherlv_4= RULE_ID )
                    	    // InternalJSchema.g:426:8: otherlv_4= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getExtendsRule());
                    	    								}
                    	    							
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    								newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getExtensionMainObjectMainObjectCrossReference_1_1_0_1_0());
                    	    							

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:439:5: ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    // InternalJSchema.g:439:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalJSchema.g:440:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalJSchema.g:440:6: (otherlv_5= RULE_ID )
                    	    // InternalJSchema.g:441:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getExtendsRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getExtendsAccess().getExtensionPrimitiveObjectPrimitiveObjectCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:458:1: entryRulePrimitiveObject returns [EObject current=null] : iv_rulePrimitiveObject= rulePrimitiveObject EOF ;
    public final EObject entryRulePrimitiveObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveObject = null;


        try {
            // InternalJSchema.g:458:56: (iv_rulePrimitiveObject= rulePrimitiveObject EOF )
            // InternalJSchema.g:459:2: iv_rulePrimitiveObject= rulePrimitiveObject EOF
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
    // InternalJSchema.g:465:1: rulePrimitiveObject returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) ;
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
            // InternalJSchema.g:471:2: ( ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) )
            // InternalJSchema.g:472:2: ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            {
            // InternalJSchema.g:472:2: ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            // InternalJSchema.g:473:3: ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            {
            // InternalJSchema.g:473:3: ( (lv_type_0_0= rulePrimitiveTypes ) )
            // InternalJSchema.g:474:4: (lv_type_0_0= rulePrimitiveTypes )
            {
            // InternalJSchema.g:474:4: (lv_type_0_0= rulePrimitiveTypes )
            // InternalJSchema.g:475:5: lv_type_0_0= rulePrimitiveTypes
            {

            					newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getTypePrimitiveTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_0_0=rulePrimitiveTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveObjectRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.JSchema.PrimitiveTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJSchema.g:492:3: (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:493:4: otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0());
                    			
                    // InternalJSchema.g:497:4: ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) )
                    // InternalJSchema.g:498:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    {
                    // InternalJSchema.g:498:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    // InternalJSchema.g:499:6: lv_primitiveProperties_2_0= rulePrimitiveProperties
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalJSchema.g:516:4: (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalJSchema.g:517:5: otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalJSchema.g:521:5: ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    // InternalJSchema.g:522:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    {
                    	    // InternalJSchema.g:522:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    // InternalJSchema.g:523:7: lv_primitiveProperties_4_0= rulePrimitiveProperties
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimitiveObjectAccess().getPrimitivePropertiesPrimitivePropertiesParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop12;
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


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalJSchema.g:550:1: entryRulePrimitiveTypes returns [EObject current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final EObject entryRulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypes = null;


        try {
            // InternalJSchema.g:550:55: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // InternalJSchema.g:551:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();

            state._fsp--;

             current =iv_rulePrimitiveTypes; 
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
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalJSchema.g:557:1: rulePrimitiveTypes returns [EObject current=null] : ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) ) ;
    public final EObject rulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_array_2_0 = null;

        EObject lv_number_6_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:563:2: ( ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) ) )
            // InternalJSchema.g:564:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) )
            {
            // InternalJSchema.g:564:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJSchema.g:565:3: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalJSchema.g:565:3: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalJSchema.g:566:4: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0());
                    			
                    // InternalJSchema.g:570:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalJSchema.g:571:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalJSchema.g:571:5: (lv_name_1_0= RULE_ID )
                    // InternalJSchema.g:572:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypesAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:590:3: ( (lv_array_2_0= ruleArray ) )
                    {
                    // InternalJSchema.g:590:3: ( (lv_array_2_0= ruleArray ) )
                    // InternalJSchema.g:591:4: (lv_array_2_0= ruleArray )
                    {
                    // InternalJSchema.g:591:4: (lv_array_2_0= ruleArray )
                    // InternalJSchema.g:592:5: lv_array_2_0= ruleArray
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getArrayArrayParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_2_0=ruleArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypesRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_2_0,
                    						"org.xtext.example.mydsl.JSchema.Array");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:610:3: (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) )
                    {
                    // InternalJSchema.g:610:3: (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) )
                    // InternalJSchema.g:611:4: otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0());
                    			
                    // InternalJSchema.g:615:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalJSchema.g:616:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalJSchema.g:616:5: (lv_name_4_0= RULE_ID )
                    // InternalJSchema.g:617:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getPrimitiveTypesAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveTypesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveTypesAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalJSchema.g:637:4: ( (lv_number_6_0= ruleNumber ) )
                    // InternalJSchema.g:638:5: (lv_number_6_0= ruleNumber )
                    {
                    // InternalJSchema.g:638:5: (lv_number_6_0= ruleNumber )
                    // InternalJSchema.g:639:6: lv_number_6_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getNumberNumberParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_6_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveTypesRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_6_0,
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
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "entryRuleIsRoot"
    // InternalJSchema.g:661:1: entryRuleIsRoot returns [EObject current=null] : iv_ruleIsRoot= ruleIsRoot EOF ;
    public final EObject entryRuleIsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsRoot = null;


        try {
            // InternalJSchema.g:661:47: (iv_ruleIsRoot= ruleIsRoot EOF )
            // InternalJSchema.g:662:2: iv_ruleIsRoot= ruleIsRoot EOF
            {
             newCompositeNode(grammarAccess.getIsRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsRoot=ruleIsRoot();

            state._fsp--;

             current =iv_ruleIsRoot; 
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
    // $ANTLR end "entryRuleIsRoot"


    // $ANTLR start "ruleIsRoot"
    // InternalJSchema.g:668:1: ruleIsRoot returns [EObject current=null] : ( (lv_string_0_0= 'root' ) ) ;
    public final EObject ruleIsRoot() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:674:2: ( ( (lv_string_0_0= 'root' ) ) )
            // InternalJSchema.g:675:2: ( (lv_string_0_0= 'root' ) )
            {
            // InternalJSchema.g:675:2: ( (lv_string_0_0= 'root' ) )
            // InternalJSchema.g:676:3: (lv_string_0_0= 'root' )
            {
            // InternalJSchema.g:676:3: (lv_string_0_0= 'root' )
            // InternalJSchema.g:677:4: lv_string_0_0= 'root'
            {
            lv_string_0_0=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(lv_string_0_0, grammarAccess.getIsRootAccess().getStringRootKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIsRootRule());
            				}
            				setWithLastConsumed(current, "string", lv_string_0_0, "root");
            			

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
    // $ANTLR end "ruleIsRoot"


    // $ANTLR start "entryRulePrimitiveProperties"
    // InternalJSchema.g:692:1: entryRulePrimitiveProperties returns [EObject current=null] : iv_rulePrimitiveProperties= rulePrimitiveProperties EOF ;
    public final EObject entryRulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveProperties = null;


        try {
            // InternalJSchema.g:692:60: (iv_rulePrimitiveProperties= rulePrimitiveProperties EOF )
            // InternalJSchema.g:693:2: iv_rulePrimitiveProperties= rulePrimitiveProperties EOF
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
    // InternalJSchema.g:699:1: rulePrimitiveProperties returns [EObject current=null] : ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) ;
    public final EObject rulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_patternString_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_stringLength_1_0 = null;

        Enumerator lv_stringFormat_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:705:2: ( ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) )
            // InternalJSchema.g:706:2: ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            {
            // InternalJSchema.g:706:2: ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalJSchema.g:707:3: (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) )
                    {
                    // InternalJSchema.g:707:3: (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) )
                    // InternalJSchema.g:708:4: otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0());
                    			
                    // InternalJSchema.g:712:4: ( (lv_stringLength_1_0= ruleStringLength ) )
                    // InternalJSchema.g:713:5: (lv_stringLength_1_0= ruleStringLength )
                    {
                    // InternalJSchema.g:713:5: (lv_stringLength_1_0= ruleStringLength )
                    // InternalJSchema.g:714:6: lv_stringLength_1_0= ruleStringLength
                    {

                    						newCompositeNode(grammarAccess.getPrimitivePropertiesAccess().getStringLengthStringLengthParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_stringLength_1_0=ruleStringLength();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitivePropertiesRule());
                    						}
                    						set(
                    							current,
                    							"stringLength",
                    							lv_stringLength_1_0,
                    							"org.xtext.example.mydsl.JSchema.StringLength");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:733:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    {
                    // InternalJSchema.g:733:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    // InternalJSchema.g:734:4: otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0());
                    			
                    // InternalJSchema.g:738:4: ( (lv_patternString_3_0= RULE_STRING ) )
                    // InternalJSchema.g:739:5: (lv_patternString_3_0= RULE_STRING )
                    {
                    // InternalJSchema.g:739:5: (lv_patternString_3_0= RULE_STRING )
                    // InternalJSchema.g:740:6: lv_patternString_3_0= RULE_STRING
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
                    // InternalJSchema.g:758:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    {
                    // InternalJSchema.g:758:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    // InternalJSchema.g:759:4: otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0());
                    			
                    // InternalJSchema.g:763:4: ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    // InternalJSchema.g:764:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    {
                    // InternalJSchema.g:764:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    // InternalJSchema.g:765:6: lv_stringFormat_5_0= ruleFormatTypes
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
    // InternalJSchema.g:787:1: entryRuleStringLength returns [String current=null] : iv_ruleStringLength= ruleStringLength EOF ;
    public final String entryRuleStringLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLength = null;


        try {
            // InternalJSchema.g:787:52: (iv_ruleStringLength= ruleStringLength EOF )
            // InternalJSchema.g:788:2: iv_ruleStringLength= ruleStringLength EOF
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
    // InternalJSchema.g:794:1: ruleStringLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleStringLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalJSchema.g:800:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) )
            // InternalJSchema.g:801:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            {
            // InternalJSchema.g:801:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            // InternalJSchema.g:802:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getStringLengthAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,25,FOLLOW_5); 

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
    // InternalJSchema.g:825:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalJSchema.g:825:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalJSchema.g:826:2: iv_ruleIncludes= ruleIncludes EOF
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
    // InternalJSchema.g:832:1: ruleIncludes returns [EObject current=null] : ( () (otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )* ) ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalJSchema.g:838:2: ( ( () (otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )* ) ) )
            // InternalJSchema.g:839:2: ( () (otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )* ) )
            {
            // InternalJSchema.g:839:2: ( () (otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )* ) )
            // InternalJSchema.g:840:3: () (otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )* )
            {
            // InternalJSchema.g:840:3: ()
            // InternalJSchema.g:841:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncludesAccess().getIncludesAction_0(),
            					current);
            			

            }

            // InternalJSchema.g:847:3: (otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )* )
            // InternalJSchema.g:848:4: otherlv_1= 'includes' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )*
            {
            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getIncludesKeyword_1_0());
            			
            // InternalJSchema.g:852:4: ( (otherlv_2= RULE_ID ) )
            // InternalJSchema.g:853:5: (otherlv_2= RULE_ID )
            {
            // InternalJSchema.g:853:5: (otherlv_2= RULE_ID )
            // InternalJSchema.g:854:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getIncludesRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            						newLeafNode(otherlv_2, grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectCrossReference_1_1_0());
            					

            }


            }

            // InternalJSchema.g:865:4: ( (otherlv_3= RULE_ID ) )
            // InternalJSchema.g:866:5: (otherlv_3= RULE_ID )
            {
            // InternalJSchema.g:866:5: (otherlv_3= RULE_ID )
            // InternalJSchema.g:867:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getIncludesRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

            						newLeafNode(otherlv_3, grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectCrossReference_1_2_0());
            					

            }


            }

            // InternalJSchema.g:878:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_ID) ) {
                        int LA16_3 = input.LA(3);

                        if ( (LA16_3==RULE_ID) ) {
                            alt16=1;
                        }


                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalJSchema.g:879:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getIncludesAccess().getCommaKeyword_1_3_0());
            	    				
            	    // InternalJSchema.g:883:5: ( (otherlv_5= RULE_ID ) )
            	    // InternalJSchema.g:884:6: (otherlv_5= RULE_ID )
            	    {
            	    // InternalJSchema.g:884:6: (otherlv_5= RULE_ID )
            	    // InternalJSchema.g:885:7: otherlv_5= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getIncludesRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    							newLeafNode(otherlv_5, grammarAccess.getIncludesAccess().getIncludesMainObjectMainObjectCrossReference_1_3_1_0());
            	    						

            	    }


            	    }

            	    // InternalJSchema.g:896:5: ( (otherlv_6= RULE_ID ) )
            	    // InternalJSchema.g:897:6: (otherlv_6= RULE_ID )
            	    {
            	    // InternalJSchema.g:897:6: (otherlv_6= RULE_ID )
            	    // InternalJSchema.g:898:7: otherlv_6= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getIncludesRule());
            	    							}
            	    						
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    							newLeafNode(otherlv_6, grammarAccess.getIncludesAccess().getIncludesPrimitiveObjectPrimitiveObjectCrossReference_1_3_2_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleArray"
    // InternalJSchema.g:915:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSchema.g:915:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSchema.g:916:2: iv_ruleArray= ruleArray EOF
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
    // InternalJSchema.g:922:1: ruleArray returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_arrayType_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:928:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' ) )
            // InternalJSchema.g:929:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' )
            {
            // InternalJSchema.g:929:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' )
            // InternalJSchema.g:930:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']'
            {
            // InternalJSchema.g:930:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJSchema.g:931:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJSchema.g:931:4: (lv_name_0_0= RULE_ID )
            // InternalJSchema.g:932:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArrayAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJSchema.g:952:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJSchema.g:953:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // InternalJSchema.g:953:4: ( (otherlv_2= RULE_ID ) )
                    // InternalJSchema.g:954:5: (otherlv_2= RULE_ID )
                    {
                    // InternalJSchema.g:954:5: (otherlv_2= RULE_ID )
                    // InternalJSchema.g:955:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrayRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalJSchema.g:966:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==13) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalJSchema.g:967:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJSchema.g:971:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalJSchema.g:972:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalJSchema.g:972:6: (otherlv_4= RULE_ID )
                    	    // InternalJSchema.g:973:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getArrayRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJSchema.g:986:3: ( (lv_arrayType_5_0= ruleArrayType ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=29 && LA19_0<=32)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJSchema.g:987:4: (lv_arrayType_5_0= ruleArrayType )
                    {
                    // InternalJSchema.g:987:4: (lv_arrayType_5_0= ruleArrayType )
                    // InternalJSchema.g:988:5: lv_arrayType_5_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_arrayType_5_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArrayRule());
                    					}
                    					set(
                    						current,
                    						"arrayType",
                    						lv_arrayType_5_0,
                    						"org.xtext.example.mydsl.JSchema.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleArrayType"
    // InternalJSchema.g:1013:1: entryRuleArrayType returns [String current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final String entryRuleArrayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayType = null;


        try {
            // InternalJSchema.g:1013:49: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalJSchema.g:1014:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType.getText(); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalJSchema.g:1020:1: ruleArrayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleArrayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJSchema.g:1026:2: ( (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' ) )
            // InternalJSchema.g:1027:2: (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' )
            {
            // InternalJSchema.g:1027:2: (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt20=1;
                }
                break;
            case 30:
                {
                alt20=2;
                }
                break;
            case 31:
                {
                alt20=3;
                }
                break;
            case 32:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalJSchema.g:1028:3: kw= 'string'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:1034:3: kw= 'integer'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJSchema.g:1040:3: kw= 'float'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJSchema.g:1046:3: kw= 'double'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getDoubleKeyword_3());
                    		

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "ruleFormatTypes"
    // InternalJSchema.g:1055:1: ruleFormatTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) ) ;
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
        Token enumLiteral_16=null;


        	enterRule();

        try {
            // InternalJSchema.g:1061:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) ) )
            // InternalJSchema.g:1062:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) )
            {
            // InternalJSchema.g:1062:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) )
            int alt21=17;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            case 36:
                {
                alt21=4;
                }
                break;
            case 37:
                {
                alt21=5;
                }
                break;
            case 38:
                {
                alt21=6;
                }
                break;
            case 39:
                {
                alt21=7;
                }
                break;
            case 40:
                {
                alt21=8;
                }
                break;
            case 41:
                {
                alt21=9;
                }
                break;
            case 42:
                {
                alt21=10;
                }
                break;
            case 43:
                {
                alt21=11;
                }
                break;
            case 44:
                {
                alt21=12;
                }
                break;
            case 45:
                {
                alt21=13;
                }
                break;
            case 46:
                {
                alt21=14;
                }
                break;
            case 47:
                {
                alt21=15;
                }
                break;
            case 48:
                {
                alt21=16;
                }
                break;
            case 49:
                {
                alt21=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalJSchema.g:1063:3: (enumLiteral_0= 'null' )
                    {
                    // InternalJSchema.g:1063:3: (enumLiteral_0= 'null' )
                    // InternalJSchema.g:1064:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:1071:3: (enumLiteral_1= 'date-time' )
                    {
                    // InternalJSchema.g:1071:3: (enumLiteral_1= 'date-time' )
                    // InternalJSchema.g:1072:4: enumLiteral_1= 'date-time'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:1079:3: (enumLiteral_2= 'time' )
                    {
                    // InternalJSchema.g:1079:3: (enumLiteral_2= 'time' )
                    // InternalJSchema.g:1080:4: enumLiteral_2= 'time'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:1087:3: (enumLiteral_3= 'date' )
                    {
                    // InternalJSchema.g:1087:3: (enumLiteral_3= 'date' )
                    // InternalJSchema.g:1088:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:1095:3: (enumLiteral_4= 'email' )
                    {
                    // InternalJSchema.g:1095:3: (enumLiteral_4= 'email' )
                    // InternalJSchema.g:1096:4: enumLiteral_4= 'email'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:1103:3: (enumLiteral_5= 'idn-email' )
                    {
                    // InternalJSchema.g:1103:3: (enumLiteral_5= 'idn-email' )
                    // InternalJSchema.g:1104:4: enumLiteral_5= 'idn-email'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:1111:3: (enumLiteral_6= 'hostname' )
                    {
                    // InternalJSchema.g:1111:3: (enumLiteral_6= 'hostname' )
                    // InternalJSchema.g:1112:4: enumLiteral_6= 'hostname'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:1119:3: (enumLiteral_7= 'ipv4' )
                    {
                    // InternalJSchema.g:1119:3: (enumLiteral_7= 'ipv4' )
                    // InternalJSchema.g:1120:4: enumLiteral_7= 'ipv4'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:1127:3: (enumLiteral_8= 'ipv6' )
                    {
                    // InternalJSchema.g:1127:3: (enumLiteral_8= 'ipv6' )
                    // InternalJSchema.g:1128:4: enumLiteral_8= 'ipv6'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:1135:3: (enumLiteral_9= 'uri' )
                    {
                    // InternalJSchema.g:1135:3: (enumLiteral_9= 'uri' )
                    // InternalJSchema.g:1136:4: enumLiteral_9= 'uri'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:1143:3: (enumLiteral_10= 'uri-reference' )
                    {
                    // InternalJSchema.g:1143:3: (enumLiteral_10= 'uri-reference' )
                    // InternalJSchema.g:1144:4: enumLiteral_10= 'uri-reference'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:1151:3: (enumLiteral_11= 'iri' )
                    {
                    // InternalJSchema.g:1151:3: (enumLiteral_11= 'iri' )
                    // InternalJSchema.g:1152:4: enumLiteral_11= 'iri'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:1159:3: (enumLiteral_12= 'iri-reference' )
                    {
                    // InternalJSchema.g:1159:3: (enumLiteral_12= 'iri-reference' )
                    // InternalJSchema.g:1160:4: enumLiteral_12= 'iri-reference'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:1167:3: (enumLiteral_13= 'uri-template' )
                    {
                    // InternalJSchema.g:1167:3: (enumLiteral_13= 'uri-template' )
                    // InternalJSchema.g:1168:4: enumLiteral_13= 'uri-template'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:1175:3: (enumLiteral_14= 'json-pointer' )
                    {
                    // InternalJSchema.g:1175:3: (enumLiteral_14= 'json-pointer' )
                    // InternalJSchema.g:1176:4: enumLiteral_14= 'json-pointer'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:1183:3: (enumLiteral_15= 'relative-json-pointer' )
                    {
                    // InternalJSchema.g:1183:3: (enumLiteral_15= 'relative-json-pointer' )
                    // InternalJSchema.g:1184:4: enumLiteral_15= 'relative-json-pointer'
                    {
                    enumLiteral_15=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalJSchema.g:1191:3: (enumLiteral_16= 'regex' )
                    {
                    // InternalJSchema.g:1191:3: (enumLiteral_16= 'regex' )
                    // InternalJSchema.g:1192:4: enumLiteral_16= 'regex'
                    {
                    enumLiteral_16=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getFormatTypesAccess().getRegexEnumLiteralDeclaration_16());
                    			

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004209022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004009022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C6020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0003FFFE00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001F0000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001F0002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});

}