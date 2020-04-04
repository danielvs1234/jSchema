package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'num'", "'object'", "'require'", "'minimum'", "'maximum'", "'properties'", "'string'", "'number'", "'array'", "'boolean'", "'null'", "'name'", "'type'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
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
    // InternalJSchema.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalJSchema.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalJSchema.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalJSchema.g:71:1: ruleModel returns [EObject current=null] : this_Object_0= ruleObject ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Object_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:77:2: (this_Object_0= ruleObject )
            // InternalJSchema.g:78:2: this_Object_0= ruleObject
            {

            		newCompositeNode(grammarAccess.getModelAccess().getObjectParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Object_0=ruleObject();

            state._fsp--;


            		current = this_Object_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalJSchema.g:89:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalJSchema.g:89:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalJSchema.g:90:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalJSchema.g:96:1: ruleNumber returns [EObject current=null] : ( (otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) ) ) | this_DOUBLE_2= RULE_DOUBLE ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token this_DOUBLE_2=null;


        	enterRule();

        try {
            // InternalJSchema.g:102:2: ( ( (otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) ) ) | this_DOUBLE_2= RULE_DOUBLE ) )
            // InternalJSchema.g:103:2: ( (otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) ) ) | this_DOUBLE_2= RULE_DOUBLE )
            {
            // InternalJSchema.g:103:2: ( (otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) ) ) | this_DOUBLE_2= RULE_DOUBLE )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
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
                    // InternalJSchema.g:104:3: (otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalJSchema.g:104:3: (otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalJSchema.g:105:4: otherlv_0= 'num' ( (lv_value_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getNumberAccess().getNumKeyword_0_0());
                    			
                    // InternalJSchema.g:109:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalJSchema.g:110:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalJSchema.g:110:5: (lv_value_1_0= RULE_INT )
                    // InternalJSchema.g:111:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:129:3: this_DOUBLE_2= RULE_DOUBLE
                    {
                    this_DOUBLE_2=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			newLeafNode(this_DOUBLE_2, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleObject"
    // InternalJSchema.g:137:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalJSchema.g:137:47: (iv_ruleObject= ruleObject EOF )
            // InternalJSchema.g:138:2: iv_ruleObject= ruleObject EOF
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
    // InternalJSchema.g:144:1: ruleObject returns [EObject current=null] : (otherlv_0= 'object' (this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties )? ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ObjectRequireMinimumProperties_1 = null;



        	enterRule();

        try {
            // InternalJSchema.g:150:2: ( (otherlv_0= 'object' (this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties )? ) )
            // InternalJSchema.g:151:2: (otherlv_0= 'object' (this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties )? )
            {
            // InternalJSchema.g:151:2: (otherlv_0= 'object' (this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties )? )
            // InternalJSchema.g:152:3: otherlv_0= 'object' (this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectAccess().getObjectKeyword_0());
            		
            // InternalJSchema.g:156:3: (this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJSchema.g:157:4: this_ObjectRequireMinimumProperties_1= ruleObjectRequireMinimumProperties
                    {

                    				newCompositeNode(grammarAccess.getObjectAccess().getObjectRequireMinimumPropertiesParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_ObjectRequireMinimumProperties_1=ruleObjectRequireMinimumProperties();

                    state._fsp--;


                    				current = this_ObjectRequireMinimumProperties_1;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleObjectRequireMinimumProperties"
    // InternalJSchema.g:170:1: entryRuleObjectRequireMinimumProperties returns [EObject current=null] : iv_ruleObjectRequireMinimumProperties= ruleObjectRequireMinimumProperties EOF ;
    public final EObject entryRuleObjectRequireMinimumProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectRequireMinimumProperties = null;


        try {
            // InternalJSchema.g:170:71: (iv_ruleObjectRequireMinimumProperties= ruleObjectRequireMinimumProperties EOF )
            // InternalJSchema.g:171:2: iv_ruleObjectRequireMinimumProperties= ruleObjectRequireMinimumProperties EOF
            {
             newCompositeNode(grammarAccess.getObjectRequireMinimumPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectRequireMinimumProperties=ruleObjectRequireMinimumProperties();

            state._fsp--;

             current =iv_ruleObjectRequireMinimumProperties; 
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
    // $ANTLR end "entryRuleObjectRequireMinimumProperties"


    // $ANTLR start "ruleObjectRequireMinimumProperties"
    // InternalJSchema.g:177:1: ruleObjectRequireMinimumProperties returns [EObject current=null] : (otherlv_0= 'require' (otherlv_1= 'minimum' | otherlv_2= 'maximum' ) this_Number_3= ruleNumber otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) ) ;
    public final EObject ruleObjectRequireMinimumProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Number_3 = null;

        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:183:2: ( (otherlv_0= 'require' (otherlv_1= 'minimum' | otherlv_2= 'maximum' ) this_Number_3= ruleNumber otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) ) )
            // InternalJSchema.g:184:2: (otherlv_0= 'require' (otherlv_1= 'minimum' | otherlv_2= 'maximum' ) this_Number_3= ruleNumber otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )
            {
            // InternalJSchema.g:184:2: (otherlv_0= 'require' (otherlv_1= 'minimum' | otherlv_2= 'maximum' ) this_Number_3= ruleNumber otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) ) )
            // InternalJSchema.g:185:3: otherlv_0= 'require' (otherlv_1= 'minimum' | otherlv_2= 'maximum' ) this_Number_3= ruleNumber otherlv_4= 'properties' ( (lv_properties_5_0= ruleProperties ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectRequireMinimumPropertiesAccess().getRequireKeyword_0());
            		
            // InternalJSchema.g:189:3: (otherlv_1= 'minimum' | otherlv_2= 'maximum' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:190:4: otherlv_1= 'minimum'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectRequireMinimumPropertiesAccess().getMinimumKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:195:4: otherlv_2= 'maximum'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectRequireMinimumPropertiesAccess().getMaximumKeyword_1_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getObjectRequireMinimumPropertiesAccess().getNumberParserRuleCall_2());
            		
            pushFollow(FOLLOW_7);
            this_Number_3=ruleNumber();

            state._fsp--;


            			current = this_Number_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesKeyword_3());
            		
            // InternalJSchema.g:212:3: ( (lv_properties_5_0= ruleProperties ) )
            // InternalJSchema.g:213:4: (lv_properties_5_0= ruleProperties )
            {
            // InternalJSchema.g:213:4: (lv_properties_5_0= ruleProperties )
            // InternalJSchema.g:214:5: lv_properties_5_0= ruleProperties
            {

            					newCompositeNode(grammarAccess.getObjectRequireMinimumPropertiesAccess().getPropertiesPropertiesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_properties_5_0=ruleProperties();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRequireMinimumPropertiesRule());
            					}
            					set(
            						current,
            						"properties",
            						lv_properties_5_0,
            						"org.xtext.example.mydsl.JSchema.Properties");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleObjectRequireMinimumProperties"


    // $ANTLR start "entryRuleTypes"
    // InternalJSchema.g:235:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalJSchema.g:235:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalJSchema.g:236:2: iv_ruleTypes= ruleTypes EOF
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
    // InternalJSchema.g:242:1: ruleTypes returns [EObject current=null] : ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) | ( () otherlv_7= 'array' ) | ( () otherlv_9= 'boolean' ) | ( () otherlv_11= 'null' ) ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalJSchema.g:248:2: ( ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) | ( () otherlv_7= 'array' ) | ( () otherlv_9= 'boolean' ) | ( () otherlv_11= 'null' ) ) )
            // InternalJSchema.g:249:2: ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) | ( () otherlv_7= 'array' ) | ( () otherlv_9= 'boolean' ) | ( () otherlv_11= 'null' ) )
            {
            // InternalJSchema.g:249:2: ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'string' ) | ( () otherlv_5= 'number' ) | ( () otherlv_7= 'array' ) | ( () otherlv_9= 'boolean' ) | ( () otherlv_11= 'null' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            case 22:
                {
                alt4=5;
                }
                break;
            case 23:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:250:3: ( () otherlv_1= 'object' )
                    {
                    // InternalJSchema.g:250:3: ( () otherlv_1= 'object' )
                    // InternalJSchema.g:251:4: () otherlv_1= 'object'
                    {
                    // InternalJSchema.g:251:4: ()
                    // InternalJSchema.g:252:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getObjectAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypesAccess().getObjectKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:264:3: ( () otherlv_3= 'string' )
                    {
                    // InternalJSchema.g:264:3: ( () otherlv_3= 'string' )
                    // InternalJSchema.g:265:4: () otherlv_3= 'string'
                    {
                    // InternalJSchema.g:265:4: ()
                    // InternalJSchema.g:266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getSTRINGAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypesAccess().getStringKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJSchema.g:278:3: ( () otherlv_5= 'number' )
                    {
                    // InternalJSchema.g:278:3: ( () otherlv_5= 'number' )
                    // InternalJSchema.g:279:4: () otherlv_5= 'number'
                    {
                    // InternalJSchema.g:279:4: ()
                    // InternalJSchema.g:280:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getNumberAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypesAccess().getNumberKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJSchema.g:292:3: ( () otherlv_7= 'array' )
                    {
                    // InternalJSchema.g:292:3: ( () otherlv_7= 'array' )
                    // InternalJSchema.g:293:4: () otherlv_7= 'array'
                    {
                    // InternalJSchema.g:293:4: ()
                    // InternalJSchema.g:294:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getArrayAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypesAccess().getArrayKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJSchema.g:306:3: ( () otherlv_9= 'boolean' )
                    {
                    // InternalJSchema.g:306:3: ( () otherlv_9= 'boolean' )
                    // InternalJSchema.g:307:4: () otherlv_9= 'boolean'
                    {
                    // InternalJSchema.g:307:4: ()
                    // InternalJSchema.g:308:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getBooleanAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getTypesAccess().getBooleanKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJSchema.g:320:3: ( () otherlv_11= 'null' )
                    {
                    // InternalJSchema.g:320:3: ( () otherlv_11= 'null' )
                    // InternalJSchema.g:321:4: () otherlv_11= 'null'
                    {
                    // InternalJSchema.g:321:4: ()
                    // InternalJSchema.g:322:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypesAccess().getNullAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getTypesAccess().getNullKeyword_5_1());
                    			

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


    // $ANTLR start "entryRuleProperties"
    // InternalJSchema.g:337:1: entryRuleProperties returns [EObject current=null] : iv_ruleProperties= ruleProperties EOF ;
    public final EObject entryRuleProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperties = null;


        try {
            // InternalJSchema.g:337:51: (iv_ruleProperties= ruleProperties EOF )
            // InternalJSchema.g:338:2: iv_ruleProperties= ruleProperties EOF
            {
             newCompositeNode(grammarAccess.getPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperties=ruleProperties();

            state._fsp--;

             current =iv_ruleProperties; 
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
    // $ANTLR end "entryRuleProperties"


    // $ANTLR start "ruleProperties"
    // InternalJSchema.g:344:1: ruleProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleProperty ) )* ) ;
    public final EObject ruleProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:350:2: ( ( () ( (lv_properties_1_0= ruleProperty ) )* ) )
            // InternalJSchema.g:351:2: ( () ( (lv_properties_1_0= ruleProperty ) )* )
            {
            // InternalJSchema.g:351:2: ( () ( (lv_properties_1_0= ruleProperty ) )* )
            // InternalJSchema.g:352:3: () ( (lv_properties_1_0= ruleProperty ) )*
            {
            // InternalJSchema.g:352:3: ()
            // InternalJSchema.g:353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertiesAccess().getPropertiesAction_0(),
            					current);
            			

            }

            // InternalJSchema.g:359:3: ( (lv_properties_1_0= ruleProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJSchema.g:360:4: (lv_properties_1_0= ruleProperty )
            	    {
            	    // InternalJSchema.g:360:4: (lv_properties_1_0= ruleProperty )
            	    // InternalJSchema.g:361:5: lv_properties_1_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getPropertiesAccess().getPropertiesPropertyParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_properties_1_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.xtext.example.mydsl.JSchema.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleProperties"


    // $ANTLR start "entryRuleProperty"
    // InternalJSchema.g:382:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJSchema.g:382:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJSchema.g:383:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalJSchema.g:389:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTypes ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJSchema.g:395:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTypes ) ) ) )
            // InternalJSchema.g:396:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTypes ) ) )
            {
            // InternalJSchema.g:396:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTypes ) ) )
            // InternalJSchema.g:397:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTypes ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getNameKeyword_0());
            		
            // InternalJSchema.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalJSchema.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalJSchema.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalJSchema.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getTypeKeyword_2());
            		
            // InternalJSchema.g:423:3: ( (lv_type_3_0= ruleTypes ) )
            // InternalJSchema.g:424:4: (lv_type_3_0= ruleTypes )
            {
            // InternalJSchema.g:424:4: (lv_type_3_0= ruleTypes )
            // InternalJSchema.g:425:5: lv_type_3_0= ruleTypes
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.JSchema.Types");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F84000L});

}