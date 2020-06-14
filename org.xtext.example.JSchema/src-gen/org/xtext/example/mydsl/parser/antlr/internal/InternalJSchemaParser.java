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
    // InternalJSchema.g:169:1: ruleAbstractObject returns [EObject current=null] : (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject ) ;
    public final EObject ruleAbstractObject() throws RecognitionException {
        EObject current = null;

        EObject this_MainObject_0 = null;

        EObject this_PrimitiveObject_1 = null;



        	enterRule();

        try {
            // InternalJSchema.g:175:2: ( (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject ) )
            // InternalJSchema.g:176:2: (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject )
            {
            // InternalJSchema.g:176:2: (this_MainObject_0= ruleMainObject | this_PrimitiveObject_1= rulePrimitiveObject )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    alt3=2;
                }
                else if ( (LA3_1==12||LA3_1==15||LA3_1==21||LA3_1==26) ) {
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
                    // InternalJSchema.g:177:3: this_MainObject_0= ruleMainObject
                    {

                    			newCompositeNode(grammarAccess.getAbstractObjectAccess().getMainObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MainObject_0=ruleMainObject();

                    state._fsp--;


                    			current = this_MainObject_0;
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


    // $ANTLR start "entryRuleMainObject"
    // InternalJSchema.g:198:1: entryRuleMainObject returns [EObject current=null] : iv_ruleMainObject= ruleMainObject EOF ;
    public final EObject entryRuleMainObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainObject = null;


        try {
            // InternalJSchema.g:198:51: (iv_ruleMainObject= ruleMainObject EOF )
            // InternalJSchema.g:199:2: iv_ruleMainObject= ruleMainObject EOF
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
    // InternalJSchema.g:205:1: ruleMainObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? otherlv_3= '{' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleMainObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_root_1_0 = null;

        EObject lv_inherits_2_1 = null;

        EObject lv_inherits_2_2 = null;



        	enterRule();

        try {
            // InternalJSchema.g:211:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? otherlv_3= '{' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '}' ) )
            // InternalJSchema.g:212:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? otherlv_3= '{' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '}' )
            {
            // InternalJSchema.g:212:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? otherlv_3= '{' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '}' )
            // InternalJSchema.g:213:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_root_1_0= ruleIsRoot ) )? ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )? otherlv_3= '{' ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '}'
            {
            // InternalJSchema.g:213:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJSchema.g:214:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJSchema.g:214:4: (lv_name_0_0= RULE_ID )
            // InternalJSchema.g:215:5: lv_name_0_0= RULE_ID
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

            // InternalJSchema.g:231:3: ( (lv_root_1_0= ruleIsRoot ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:232:4: (lv_root_1_0= ruleIsRoot )
                    {
                    // InternalJSchema.g:232:4: (lv_root_1_0= ruleIsRoot )
                    // InternalJSchema.g:233:5: lv_root_1_0= ruleIsRoot
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

            // InternalJSchema.g:250:3: ( ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15||LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:251:4: ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) )
                    {
                    // InternalJSchema.g:251:4: ( (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes ) )
                    // InternalJSchema.g:252:5: (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes )
                    {
                    // InternalJSchema.g:252:5: (lv_inherits_2_1= ruleExtends | lv_inherits_2_2= ruleIncludes )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
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
                            // InternalJSchema.g:253:6: lv_inherits_2_1= ruleExtends
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
                            // InternalJSchema.g:269:6: lv_inherits_2_2= ruleIncludes
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

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getMainObjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJSchema.g:291:3: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJSchema.g:292:4: ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // InternalJSchema.g:292:4: ( (otherlv_4= RULE_ID ) )
                    // InternalJSchema.g:293:5: (otherlv_4= RULE_ID )
                    {
                    // InternalJSchema.g:293:5: (otherlv_4= RULE_ID )
                    // InternalJSchema.g:294:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMainObjectRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectCrossReference_4_0_0());
                    					

                    }


                    }

                    // InternalJSchema.g:305:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJSchema.g:306:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_11); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMainObjectAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalJSchema.g:310:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalJSchema.g:311:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalJSchema.g:311:6: (otherlv_6= RULE_ID )
                    	    // InternalJSchema.g:312:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMainObjectRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getMainObjectAccess().getPropertiesAbstractObjectCrossReference_4_1_1_0());
                    	    						

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

            			newLeafNode(otherlv_7, grammarAccess.getMainObjectAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalJSchema.g:333:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalJSchema.g:333:48: (iv_ruleExtends= ruleExtends EOF )
            // InternalJSchema.g:334:2: iv_ruleExtends= ruleExtends EOF
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
    // InternalJSchema.g:340:1: ruleExtends returns [EObject current=null] : (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJSchema.g:346:2: ( (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalJSchema.g:347:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalJSchema.g:347:2: (otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalJSchema.g:348:3: otherlv_0= 'extends' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
            		
            // InternalJSchema.g:352:3: ( (otherlv_1= RULE_ID ) )
            // InternalJSchema.g:353:4: (otherlv_1= RULE_ID )
            {
            // InternalJSchema.g:353:4: (otherlv_1= RULE_ID )
            // InternalJSchema.g:354:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getExtendsAbstractObjectCrossReference_1_0());
            				

            }


            }

            // InternalJSchema.g:365:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJSchema.g:366:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExtendsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJSchema.g:370:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalJSchema.g:371:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalJSchema.g:371:5: (otherlv_3= RULE_ID )
            	    // InternalJSchema.g:372:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtendsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_3, grammarAccess.getExtendsAccess().getExtendsAbstractObjectCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRulePrimitiveObject"
    // InternalJSchema.g:388:1: entryRulePrimitiveObject returns [EObject current=null] : iv_rulePrimitiveObject= rulePrimitiveObject EOF ;
    public final EObject entryRulePrimitiveObject() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveObject = null;


        try {
            // InternalJSchema.g:388:56: (iv_rulePrimitiveObject= rulePrimitiveObject EOF )
            // InternalJSchema.g:389:2: iv_rulePrimitiveObject= rulePrimitiveObject EOF
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
    // InternalJSchema.g:395:1: rulePrimitiveObject returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) ;
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
            // InternalJSchema.g:401:2: ( ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? ) )
            // InternalJSchema.g:402:2: ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            {
            // InternalJSchema.g:402:2: ( ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )? )
            // InternalJSchema.g:403:3: ( (lv_type_0_0= rulePrimitiveTypes ) ) (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            {
            // InternalJSchema.g:403:3: ( (lv_type_0_0= rulePrimitiveTypes ) )
            // InternalJSchema.g:404:4: (lv_type_0_0= rulePrimitiveTypes )
            {
            // InternalJSchema.g:404:4: (lv_type_0_0= rulePrimitiveTypes )
            // InternalJSchema.g:405:5: lv_type_0_0= rulePrimitiveTypes
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

            // InternalJSchema.g:422:3: (otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJSchema.g:423:4: otherlv_1= 'with' ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) ) (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )* otherlv_5= ';'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveObjectAccess().getWithKeyword_1_0());
                    			
                    // InternalJSchema.g:427:4: ( (lv_primitiveProperties_2_0= rulePrimitiveProperties ) )
                    // InternalJSchema.g:428:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    {
                    // InternalJSchema.g:428:5: (lv_primitiveProperties_2_0= rulePrimitiveProperties )
                    // InternalJSchema.g:429:6: lv_primitiveProperties_2_0= rulePrimitiveProperties
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

                    // InternalJSchema.g:446:4: (otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJSchema.g:447:5: otherlv_3= ',' ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getPrimitiveObjectAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalJSchema.g:451:5: ( (lv_primitiveProperties_4_0= rulePrimitiveProperties ) )
                    	    // InternalJSchema.g:452:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    {
                    	    // InternalJSchema.g:452:6: (lv_primitiveProperties_4_0= rulePrimitiveProperties )
                    	    // InternalJSchema.g:453:7: lv_primitiveProperties_4_0= rulePrimitiveProperties
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
                    	    break loop10;
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
    // InternalJSchema.g:480:1: entryRulePrimitiveTypes returns [EObject current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final EObject entryRulePrimitiveTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypes = null;


        try {
            // InternalJSchema.g:480:55: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // InternalJSchema.g:481:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
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
    // InternalJSchema.g:487:1: rulePrimitiveTypes returns [EObject current=null] : ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) ) ;
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
            // InternalJSchema.g:493:2: ( ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) ) )
            // InternalJSchema.g:494:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) )
            {
            // InternalJSchema.g:494:2: ( (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) ) | ( (lv_array_2_0= ruleArray ) ) | (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalJSchema.g:495:3: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalJSchema.g:495:3: (otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalJSchema.g:496:4: otherlv_0= 'String' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypesAccess().getStringKeyword_0_0());
                    			
                    // InternalJSchema.g:500:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalJSchema.g:501:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalJSchema.g:501:5: (lv_name_1_0= RULE_ID )
                    // InternalJSchema.g:502:6: lv_name_1_0= RULE_ID
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
                    // InternalJSchema.g:520:3: ( (lv_array_2_0= ruleArray ) )
                    {
                    // InternalJSchema.g:520:3: ( (lv_array_2_0= ruleArray ) )
                    // InternalJSchema.g:521:4: (lv_array_2_0= ruleArray )
                    {
                    // InternalJSchema.g:521:4: (lv_array_2_0= ruleArray )
                    // InternalJSchema.g:522:5: lv_array_2_0= ruleArray
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
                    // InternalJSchema.g:540:3: (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) )
                    {
                    // InternalJSchema.g:540:3: (otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) ) )
                    // InternalJSchema.g:541:4: otherlv_3= 'num' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '=' ( (lv_number_6_0= ruleNumber ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypesAccess().getNumKeyword_2_0());
                    			
                    // InternalJSchema.g:545:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalJSchema.g:546:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalJSchema.g:546:5: (lv_name_4_0= RULE_ID )
                    // InternalJSchema.g:547:6: lv_name_4_0= RULE_ID
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
                    			
                    // InternalJSchema.g:567:4: ( (lv_number_6_0= ruleNumber ) )
                    // InternalJSchema.g:568:5: (lv_number_6_0= ruleNumber )
                    {
                    // InternalJSchema.g:568:5: (lv_number_6_0= ruleNumber )
                    // InternalJSchema.g:569:6: lv_number_6_0= ruleNumber
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
    // InternalJSchema.g:591:1: entryRuleIsRoot returns [EObject current=null] : iv_ruleIsRoot= ruleIsRoot EOF ;
    public final EObject entryRuleIsRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsRoot = null;


        try {
            // InternalJSchema.g:591:47: (iv_ruleIsRoot= ruleIsRoot EOF )
            // InternalJSchema.g:592:2: iv_ruleIsRoot= ruleIsRoot EOF
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
    // InternalJSchema.g:598:1: ruleIsRoot returns [EObject current=null] : ( (lv_string_0_0= 'root' ) ) ;
    public final EObject ruleIsRoot() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:604:2: ( ( (lv_string_0_0= 'root' ) ) )
            // InternalJSchema.g:605:2: ( (lv_string_0_0= 'root' ) )
            {
            // InternalJSchema.g:605:2: ( (lv_string_0_0= 'root' ) )
            // InternalJSchema.g:606:3: (lv_string_0_0= 'root' )
            {
            // InternalJSchema.g:606:3: (lv_string_0_0= 'root' )
            // InternalJSchema.g:607:4: lv_string_0_0= 'root'
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
    // InternalJSchema.g:622:1: entryRulePrimitiveProperties returns [EObject current=null] : iv_rulePrimitiveProperties= rulePrimitiveProperties EOF ;
    public final EObject entryRulePrimitiveProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveProperties = null;


        try {
            // InternalJSchema.g:622:60: (iv_rulePrimitiveProperties= rulePrimitiveProperties EOF )
            // InternalJSchema.g:623:2: iv_rulePrimitiveProperties= rulePrimitiveProperties EOF
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
    // InternalJSchema.g:629:1: rulePrimitiveProperties returns [EObject current=null] : ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) ;
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
            // InternalJSchema.g:635:2: ( ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) ) )
            // InternalJSchema.g:636:2: ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            {
            // InternalJSchema.g:636:2: ( (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) ) | (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) ) | (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:637:3: (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) )
                    {
                    // InternalJSchema.g:637:3: (otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) ) )
                    // InternalJSchema.g:638:4: otherlv_0= 'length' ( (lv_stringLength_1_0= ruleStringLength ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimitivePropertiesAccess().getLengthKeyword_0_0());
                    			
                    // InternalJSchema.g:642:4: ( (lv_stringLength_1_0= ruleStringLength ) )
                    // InternalJSchema.g:643:5: (lv_stringLength_1_0= ruleStringLength )
                    {
                    // InternalJSchema.g:643:5: (lv_stringLength_1_0= ruleStringLength )
                    // InternalJSchema.g:644:6: lv_stringLength_1_0= ruleStringLength
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
                    // InternalJSchema.g:663:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    {
                    // InternalJSchema.g:663:3: (otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) ) )
                    // InternalJSchema.g:664:4: otherlv_2= 'pattern' ( (lv_patternString_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitivePropertiesAccess().getPatternKeyword_1_0());
                    			
                    // InternalJSchema.g:668:4: ( (lv_patternString_3_0= RULE_STRING ) )
                    // InternalJSchema.g:669:5: (lv_patternString_3_0= RULE_STRING )
                    {
                    // InternalJSchema.g:669:5: (lv_patternString_3_0= RULE_STRING )
                    // InternalJSchema.g:670:6: lv_patternString_3_0= RULE_STRING
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
                    // InternalJSchema.g:688:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    {
                    // InternalJSchema.g:688:3: (otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) ) )
                    // InternalJSchema.g:689:4: otherlv_4= 'format' ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitivePropertiesAccess().getFormatKeyword_2_0());
                    			
                    // InternalJSchema.g:693:4: ( (lv_stringFormat_5_0= ruleFormatTypes ) )
                    // InternalJSchema.g:694:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    {
                    // InternalJSchema.g:694:5: (lv_stringFormat_5_0= ruleFormatTypes )
                    // InternalJSchema.g:695:6: lv_stringFormat_5_0= ruleFormatTypes
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
    // InternalJSchema.g:717:1: entryRuleStringLength returns [String current=null] : iv_ruleStringLength= ruleStringLength EOF ;
    public final String entryRuleStringLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLength = null;


        try {
            // InternalJSchema.g:717:52: (iv_ruleStringLength= ruleStringLength EOF )
            // InternalJSchema.g:718:2: iv_ruleStringLength= ruleStringLength EOF
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
    // InternalJSchema.g:724:1: ruleStringLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleStringLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalJSchema.g:730:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) )
            // InternalJSchema.g:731:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            {
            // InternalJSchema.g:731:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            // InternalJSchema.g:732:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT
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
    // InternalJSchema.g:755:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalJSchema.g:755:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalJSchema.g:756:2: iv_ruleIncludes= ruleIncludes EOF
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
    // InternalJSchema.g:762:1: ruleIncludes returns [EObject current=null] : (otherlv_0= 'includes' ( (lv_objectID_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_objectID_1_0=null;
        Token otherlv_2=null;
        Token lv_objectID_3_0=null;


        	enterRule();

        try {
            // InternalJSchema.g:768:2: ( (otherlv_0= 'includes' ( (lv_objectID_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) ) )* ) )
            // InternalJSchema.g:769:2: (otherlv_0= 'includes' ( (lv_objectID_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) ) )* )
            {
            // InternalJSchema.g:769:2: (otherlv_0= 'includes' ( (lv_objectID_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) ) )* )
            // InternalJSchema.g:770:3: otherlv_0= 'includes' ( (lv_objectID_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludesAccess().getIncludesKeyword_0());
            		
            // InternalJSchema.g:774:3: ( (lv_objectID_1_0= RULE_ID ) )
            // InternalJSchema.g:775:4: (lv_objectID_1_0= RULE_ID )
            {
            // InternalJSchema.g:775:4: (lv_objectID_1_0= RULE_ID )
            // InternalJSchema.g:776:5: lv_objectID_1_0= RULE_ID
            {
            lv_objectID_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_objectID_1_0, grammarAccess.getIncludesAccess().getObjectIDIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"objectID",
            						lv_objectID_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalJSchema.g:792:3: (otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJSchema.g:793:4: otherlv_2= ',' ( (lv_objectID_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getIncludesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJSchema.g:797:4: ( (lv_objectID_3_0= RULE_ID ) )
            	    // InternalJSchema.g:798:5: (lv_objectID_3_0= RULE_ID )
            	    {
            	    // InternalJSchema.g:798:5: (lv_objectID_3_0= RULE_ID )
            	    // InternalJSchema.g:799:6: lv_objectID_3_0= RULE_ID
            	    {
            	    lv_objectID_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(lv_objectID_3_0, grammarAccess.getIncludesAccess().getObjectIDIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIncludesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"objectID",
            	    							lv_objectID_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalJSchema.g:820:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalJSchema.g:820:46: (iv_ruleArray= ruleArray EOF )
            // InternalJSchema.g:821:2: iv_ruleArray= ruleArray EOF
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
    // InternalJSchema.g:827:1: ruleArray returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' ) ;
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
            // InternalJSchema.g:833:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' ) )
            // InternalJSchema.g:834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' )
            {
            // InternalJSchema.g:834:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']' )
            // InternalJSchema.g:835:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? ( (lv_arrayType_5_0= ruleArrayType ) )? otherlv_6= ']'
            {
            // InternalJSchema.g:835:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJSchema.g:836:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJSchema.g:836:4: (lv_name_0_0= RULE_ID )
            // InternalJSchema.g:837:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJSchema.g:857:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJSchema.g:858:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // InternalJSchema.g:858:4: ( (otherlv_2= RULE_ID ) )
                    // InternalJSchema.g:859:5: (otherlv_2= RULE_ID )
                    {
                    // InternalJSchema.g:859:5: (otherlv_2= RULE_ID )
                    // InternalJSchema.g:860:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getArrayRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalJSchema.g:871:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalJSchema.g:872:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJSchema.g:876:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalJSchema.g:877:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalJSchema.g:877:6: (otherlv_4= RULE_ID )
                    	    // InternalJSchema.g:878:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getArrayRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getPropertiesAbstractObjectCrossReference_2_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJSchema.g:891:3: ( (lv_arrayType_5_0= ruleArrayType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=29 && LA17_0<=32)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJSchema.g:892:4: (lv_arrayType_5_0= ruleArrayType )
                    {
                    // InternalJSchema.g:892:4: (lv_arrayType_5_0= ruleArrayType )
                    // InternalJSchema.g:893:5: lv_arrayType_5_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getArrayAccess().getArrayTypeArrayTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_23);
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
    // InternalJSchema.g:918:1: entryRuleArrayType returns [String current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final String entryRuleArrayType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayType = null;


        try {
            // InternalJSchema.g:918:49: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalJSchema.g:919:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalJSchema.g:925:1: ruleArrayType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleArrayType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJSchema.g:931:2: ( (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' ) )
            // InternalJSchema.g:932:2: (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' )
            {
            // InternalJSchema.g:932:2: (kw= 'string' | kw= 'integer' | kw= 'float' | kw= 'double' )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalJSchema.g:933:3: kw= 'string'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:939:3: kw= 'integer'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getIntegerKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJSchema.g:945:3: kw= 'float'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getArrayTypeAccess().getFloatKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalJSchema.g:951:3: kw= 'double'
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
    // InternalJSchema.g:960:1: ruleFormatTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) ) ;
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
            // InternalJSchema.g:966:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) ) )
            // InternalJSchema.g:967:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) )
            {
            // InternalJSchema.g:967:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'date-time' ) | (enumLiteral_2= 'time' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'email' ) | (enumLiteral_5= 'idn-email' ) | (enumLiteral_6= 'hostname' ) | (enumLiteral_7= 'ipv4' ) | (enumLiteral_8= 'ipv6' ) | (enumLiteral_9= 'uri' ) | (enumLiteral_10= 'uri-reference' ) | (enumLiteral_11= 'iri' ) | (enumLiteral_12= 'iri-reference' ) | (enumLiteral_13= 'uri-template' ) | (enumLiteral_14= 'json-pointer' ) | (enumLiteral_15= 'relative-json-pointer' ) | (enumLiteral_16= 'regex' ) )
            int alt19=17;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            case 37:
                {
                alt19=5;
                }
                break;
            case 38:
                {
                alt19=6;
                }
                break;
            case 39:
                {
                alt19=7;
                }
                break;
            case 40:
                {
                alt19=8;
                }
                break;
            case 41:
                {
                alt19=9;
                }
                break;
            case 42:
                {
                alt19=10;
                }
                break;
            case 43:
                {
                alt19=11;
                }
                break;
            case 44:
                {
                alt19=12;
                }
                break;
            case 45:
                {
                alt19=13;
                }
                break;
            case 46:
                {
                alt19=14;
                }
                break;
            case 47:
                {
                alt19=15;
                }
                break;
            case 48:
                {
                alt19=16;
                }
                break;
            case 49:
                {
                alt19=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalJSchema.g:968:3: (enumLiteral_0= 'null' )
                    {
                    // InternalJSchema.g:968:3: (enumLiteral_0= 'null' )
                    // InternalJSchema.g:969:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatTypesAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:976:3: (enumLiteral_1= 'date-time' )
                    {
                    // InternalJSchema.g:976:3: (enumLiteral_1= 'date-time' )
                    // InternalJSchema.g:977:4: enumLiteral_1= 'date-time'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatTypesAccess().getDate_timeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:984:3: (enumLiteral_2= 'time' )
                    {
                    // InternalJSchema.g:984:3: (enumLiteral_2= 'time' )
                    // InternalJSchema.g:985:4: enumLiteral_2= 'time'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatTypesAccess().getTimeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:992:3: (enumLiteral_3= 'date' )
                    {
                    // InternalJSchema.g:992:3: (enumLiteral_3= 'date' )
                    // InternalJSchema.g:993:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFormatTypesAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:1000:3: (enumLiteral_4= 'email' )
                    {
                    // InternalJSchema.g:1000:3: (enumLiteral_4= 'email' )
                    // InternalJSchema.g:1001:4: enumLiteral_4= 'email'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFormatTypesAccess().getEmailEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:1008:3: (enumLiteral_5= 'idn-email' )
                    {
                    // InternalJSchema.g:1008:3: (enumLiteral_5= 'idn-email' )
                    // InternalJSchema.g:1009:4: enumLiteral_5= 'idn-email'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFormatTypesAccess().getIdn_emailEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJSchema.g:1016:3: (enumLiteral_6= 'hostname' )
                    {
                    // InternalJSchema.g:1016:3: (enumLiteral_6= 'hostname' )
                    // InternalJSchema.g:1017:4: enumLiteral_6= 'hostname'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFormatTypesAccess().getHostnameEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJSchema.g:1024:3: (enumLiteral_7= 'ipv4' )
                    {
                    // InternalJSchema.g:1024:3: (enumLiteral_7= 'ipv4' )
                    // InternalJSchema.g:1025:4: enumLiteral_7= 'ipv4'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFormatTypesAccess().getIpv4EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJSchema.g:1032:3: (enumLiteral_8= 'ipv6' )
                    {
                    // InternalJSchema.g:1032:3: (enumLiteral_8= 'ipv6' )
                    // InternalJSchema.g:1033:4: enumLiteral_8= 'ipv6'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFormatTypesAccess().getIpv6EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalJSchema.g:1040:3: (enumLiteral_9= 'uri' )
                    {
                    // InternalJSchema.g:1040:3: (enumLiteral_9= 'uri' )
                    // InternalJSchema.g:1041:4: enumLiteral_9= 'uri'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFormatTypesAccess().getUriEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalJSchema.g:1048:3: (enumLiteral_10= 'uri-reference' )
                    {
                    // InternalJSchema.g:1048:3: (enumLiteral_10= 'uri-reference' )
                    // InternalJSchema.g:1049:4: enumLiteral_10= 'uri-reference'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFormatTypesAccess().getUri_referenceEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalJSchema.g:1056:3: (enumLiteral_11= 'iri' )
                    {
                    // InternalJSchema.g:1056:3: (enumLiteral_11= 'iri' )
                    // InternalJSchema.g:1057:4: enumLiteral_11= 'iri'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFormatTypesAccess().getIriEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalJSchema.g:1064:3: (enumLiteral_12= 'iri-reference' )
                    {
                    // InternalJSchema.g:1064:3: (enumLiteral_12= 'iri-reference' )
                    // InternalJSchema.g:1065:4: enumLiteral_12= 'iri-reference'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFormatTypesAccess().getIri_referenceEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalJSchema.g:1072:3: (enumLiteral_13= 'uri-template' )
                    {
                    // InternalJSchema.g:1072:3: (enumLiteral_13= 'uri-template' )
                    // InternalJSchema.g:1073:4: enumLiteral_13= 'uri-template'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFormatTypesAccess().getUri_templateEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalJSchema.g:1080:3: (enumLiteral_14= 'json-pointer' )
                    {
                    // InternalJSchema.g:1080:3: (enumLiteral_14= 'json-pointer' )
                    // InternalJSchema.g:1081:4: enumLiteral_14= 'json-pointer'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getFormatTypesAccess().getJson_pointerEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalJSchema.g:1088:3: (enumLiteral_15= 'relative-json-pointer' )
                    {
                    // InternalJSchema.g:1088:3: (enumLiteral_15= 'relative-json-pointer' )
                    // InternalJSchema.g:1089:4: enumLiteral_15= 'relative-json-pointer'
                    {
                    enumLiteral_15=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getFormatTypesAccess().getRelative_json_pointerEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalJSchema.g:1096:3: (enumLiteral_16= 'regex' )
                    {
                    // InternalJSchema.g:1096:3: (enumLiteral_16= 'regex' )
                    // InternalJSchema.g:1097:4: enumLiteral_16= 'regex'
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004209000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0003FFFE00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001F0000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001F0002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});

}