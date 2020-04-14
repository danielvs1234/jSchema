package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJSchemaLexer extends Lexer {
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

    public InternalJSchemaLexer() {;} 
    public InternalJSchemaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJSchemaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJSchema.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:11:7: ( '\"date-time\"' )
            // InternalJSchema.g:11:9: '\"date-time\"'
            {
            match("\"date-time\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:12:7: ( '\"time\"' )
            // InternalJSchema.g:12:9: '\"time\"'
            {
            match("\"time\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:13:7: ( '\"date\"' )
            // InternalJSchema.g:13:9: '\"date\"'
            {
            match("\"date\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:14:7: ( '\"email\"' )
            // InternalJSchema.g:14:9: '\"email\"'
            {
            match("\"email\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:15:7: ( '\"idn-email\"' )
            // InternalJSchema.g:15:9: '\"idn-email\"'
            {
            match("\"idn-email\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:16:7: ( '\"hostname\"' )
            // InternalJSchema.g:16:9: '\"hostname\"'
            {
            match("\"hostname\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:17:7: ( '\"ipv4\"' )
            // InternalJSchema.g:17:9: '\"ipv4\"'
            {
            match("\"ipv4\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:18:7: ( '\"ipv6\"' )
            // InternalJSchema.g:18:9: '\"ipv6\"'
            {
            match("\"ipv6\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:19:7: ( '\"uri\"' )
            // InternalJSchema.g:19:9: '\"uri\"'
            {
            match("\"uri\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:20:7: ( '\"uri-reference\"' )
            // InternalJSchema.g:20:9: '\"uri-reference\"'
            {
            match("\"uri-reference\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:21:7: ( '\"iri\"' )
            // InternalJSchema.g:21:9: '\"iri\"'
            {
            match("\"iri\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:22:7: ( '\"iri-reference\"' )
            // InternalJSchema.g:22:9: '\"iri-reference\"'
            {
            match("\"iri-reference\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:23:7: ( '\"uri-template\"' )
            // InternalJSchema.g:23:9: '\"uri-template\"'
            {
            match("\"uri-template\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:24:7: ( '\"json-pointer\"' )
            // InternalJSchema.g:24:9: '\"json-pointer\"'
            {
            match("\"json-pointer\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:25:7: ( '\"relative-json-pointer\"' )
            // InternalJSchema.g:25:9: '\"relative-json-pointer\"'
            {
            match("\"relative-json-pointer\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:26:7: ( '\"regex\"' )
            // InternalJSchema.g:26:9: '\"regex\"'
            {
            match("\"regex\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:27:7: ( '.' )
            // InternalJSchema.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:28:7: ( '{' )
            // InternalJSchema.g:28:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:29:7: ( '}' )
            // InternalJSchema.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:30:7: ( 'includes' )
            // InternalJSchema.g:30:9: 'includes'
            {
            match("includes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:31:7: ( 'with' )
            // InternalJSchema.g:31:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:32:7: ( ';' )
            // InternalJSchema.g:32:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:33:7: ( ',' )
            // InternalJSchema.g:33:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:34:7: ( 'String' )
            // InternalJSchema.g:34:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:35:7: ( 'num' )
            // InternalJSchema.g:35:9: 'num'
            {
            match("num"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:36:7: ( 'length' )
            // InternalJSchema.g:36:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:37:7: ( 'pattern' )
            // InternalJSchema.g:37:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:38:7: ( 'format' )
            // InternalJSchema.g:38:9: 'format'
            {
            match("format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:39:7: ( '-' )
            // InternalJSchema.g:39:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:40:7: ( '[' )
            // InternalJSchema.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:41:7: ( ']' )
            // InternalJSchema.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2129:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJSchema.g:2129:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJSchema.g:2129:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSchema.g:2129:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalJSchema.g:2129:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJSchema.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2131:10: ( ( '0' .. '9' )+ )
            // InternalJSchema.g:2131:12: ( '0' .. '9' )+
            {
            // InternalJSchema.g:2131:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJSchema.g:2131:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2133:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJSchema.g:2133:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJSchema.g:2133:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJSchema.g:2133:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJSchema.g:2133:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJSchema.g:2133:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:2133:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:2133:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJSchema.g:2133:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJSchema.g:2133:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:2133:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2135:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJSchema.g:2135:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJSchema.g:2135:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJSchema.g:2135:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2137:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJSchema.g:2137:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJSchema.g:2137:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJSchema.g:2137:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalJSchema.g:2137:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:2137:41: ( '\\r' )? '\\n'
                    {
                    // InternalJSchema.g:2137:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalJSchema.g:2137:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2139:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJSchema.g:2139:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJSchema.g:2139:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJSchema.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:2141:16: ( . )
            // InternalJSchema.g:2141:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalJSchema.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalJSchema.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalJSchema.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalJSchema.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalJSchema.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalJSchema.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalJSchema.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalJSchema.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalJSchema.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalJSchema.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalJSchema.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalJSchema.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalJSchema.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalJSchema.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalJSchema.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalJSchema.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalJSchema.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalJSchema.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalJSchema.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalJSchema.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalJSchema.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalJSchema.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalJSchema.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalJSchema.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalJSchema.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalJSchema.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalJSchema.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalJSchema.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalJSchema.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalJSchema.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalJSchema.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalJSchema.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalJSchema.g:1:196: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalJSchema.g:1:204: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalJSchema.g:1:213: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalJSchema.g:1:225: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalJSchema.g:1:241: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalJSchema.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalJSchema.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\27\3\uffff\2\45\2\uffff\5\45\3\uffff\1\27\2\uffff\2\27\16\uffff\1\45\1\uffff\1\45\2\uffff\5\45\21\uffff\3\45\1\124\3\45\13\uffff\1\45\1\147\1\45\1\uffff\3\45\16\uffff\1\45\1\uffff\4\45\20\uffff\1\45\1\u0090\1\u0091\1\45\1\u0093\16\uffff\1\45\2\uffff\1\u009f\13\uffff\1\u00a8\73\uffff";
    static final String DFA12_eofS =
        "\u00da\uffff";
    static final String DFA12_minS =
        "\2\0\3\uffff\1\156\1\151\2\uffff\1\164\1\165\1\145\1\141\1\157\3\uffff\1\101\2\uffff\1\0\1\52\2\uffff\10\0\4\uffff\1\143\1\uffff\1\164\2\uffff\1\162\1\155\1\156\1\164\1\162\7\uffff\12\0\1\154\1\150\1\151\1\60\1\147\1\164\1\155\13\0\1\165\1\60\1\156\1\uffff\1\164\1\145\1\141\6\0\1\uffff\2\0\1\uffff\4\0\1\144\1\uffff\1\147\1\150\1\162\1\164\1\0\2\uffff\2\0\3\uffff\2\0\1\uffff\5\0\1\145\2\60\1\156\1\60\1\0\3\uffff\1\0\2\uffff\6\0\1\uffff\1\163\2\uffff\1\60\1\uffff\1\0\1\uffff\7\0\1\uffff\1\60\1\uffff\10\0\1\uffff\3\0\1\uffff\4\0\2\uffff\1\0\1\uffff\4\0\2\uffff\14\0\2\uffff\1\0\4\uffff\1\0\2\uffff\7\0\2\uffff";
    static final String DFA12_maxS =
        "\2\uffff\3\uffff\1\156\1\151\2\uffff\1\164\1\165\1\145\1\141\1\157\3\uffff\1\172\2\uffff\1\uffff\1\57\2\uffff\10\uffff\4\uffff\1\143\1\uffff\1\164\2\uffff\1\162\1\155\1\156\1\164\1\162\7\uffff\12\uffff\1\154\1\150\1\151\1\172\1\147\1\164\1\155\13\uffff\1\165\1\172\1\156\1\uffff\1\164\1\145\1\141\6\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\144\1\uffff\1\147\1\150\1\162\1\164\1\uffff\2\uffff\2\uffff\3\uffff\2\uffff\1\uffff\5\uffff\1\145\2\172\1\156\1\172\1\uffff\3\uffff\1\uffff\2\uffff\6\uffff\1\uffff\1\163\2\uffff\1\172\1\uffff\1\uffff\1\uffff\7\uffff\1\uffff\1\172\1\uffff\10\uffff\1\uffff\3\uffff\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff\4\uffff\2\uffff\14\uffff\2\uffff\1\uffff\4\uffff\1\uffff\2\uffff\7\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\21\1\22\1\23\2\uffff\1\26\1\27\5\uffff\1\35\1\36\1\37\1\uffff\1\40\1\41\2\uffff\1\45\1\46\10\uffff\1\42\1\21\1\22\1\23\1\uffff\1\40\1\uffff\1\26\1\27\5\uffff\1\35\1\36\1\37\1\41\1\43\1\44\1\45\37\uffff\1\31\11\uffff\1\13\2\uffff\1\11\5\uffff\1\25\5\uffff\1\3\1\2\2\uffff\1\7\1\10\1\13\2\uffff\1\11\13\uffff\1\3\1\2\1\4\1\uffff\1\7\1\10\6\uffff\1\20\1\uffff\1\30\1\32\1\uffff\1\34\1\uffff\1\4\7\uffff\1\20\1\uffff\1\33\10\uffff\1\24\3\uffff\1\6\4\uffff\1\1\1\5\1\uffff\1\6\4\uffff\1\1\1\5\14\uffff\1\15\1\16\1\uffff\1\14\1\12\1\15\1\16\1\uffff\1\14\1\12\7\uffff\2\17";
    static final String DFA12_specialS =
        "\1\53\1\105\22\uffff\1\106\3\uffff\1\5\1\124\1\130\1\104\1\145\1\114\1\37\1\112\25\uffff\1\10\1\125\1\131\1\135\1\102\1\107\1\146\1\115\1\40\1\113\7\uffff\1\13\1\126\1\132\1\136\1\103\1\110\1\147\1\116\1\41\1\54\1\77\7\uffff\1\14\1\127\1\133\1\137\1\155\1\156\1\uffff\1\15\1\150\1\uffff\1\111\1\42\1\55\1\100\6\uffff\1\117\2\uffff\1\134\1\140\3\uffff\1\16\1\151\1\uffff\1\0\1\27\1\43\1\56\1\101\5\uffff\1\120\3\uffff\1\141\2\uffff\1\17\1\152\1\1\1\30\1\44\1\57\6\uffff\1\121\1\uffff\1\142\1\20\1\153\1\2\1\31\1\45\1\60\3\uffff\1\122\1\143\1\21\1\154\1\3\1\32\1\46\1\61\1\uffff\1\123\1\144\1\22\1\uffff\1\4\1\33\1\47\1\62\2\uffff\1\23\1\uffff\1\6\1\34\1\50\1\63\2\uffff\1\24\1\7\1\35\1\51\1\64\1\25\1\11\1\36\1\52\1\65\1\26\1\12\2\uffff\1\66\4\uffff\1\67\2\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\1\4\27\1\24\4\27\1\10\1\16\1\2\1\25\12\23\1\27\1\7\5\27\22\22\1\11\7\22\1\17\1\27\1\20\1\21\1\22\1\27\5\22\1\15\2\22\1\5\2\22\1\13\1\22\1\12\1\22\1\14\6\22\1\6\3\22\1\3\1\27\1\4\uff82\27",
            "\144\40\1\30\1\32\2\40\1\34\1\33\1\36\7\40\1\37\1\40\1\31\1\35\uff8a\40",
            "",
            "",
            "",
            "\1\44",
            "\1\46",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\40",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "\141\40\1\65\uff9e\40",
            "\151\40\1\66\uff96\40",
            "\155\40\1\67\uff92\40",
            "\144\40\1\70\13\40\1\71\1\40\1\72\uff8d\40",
            "\157\40\1\73\uff90\40",
            "\162\40\1\74\uff8d\40",
            "\163\40\1\75\uff8c\40",
            "\145\40\1\76\uff9a\40",
            "",
            "",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\164\40\1\106\uff8b\40",
            "\155\40\1\107\uff92\40",
            "\141\40\1\110\uff9e\40",
            "\156\40\1\111\uff91\40",
            "\166\40\1\112\uff89\40",
            "\151\40\1\113\uff96\40",
            "\163\40\1\114\uff8c\40",
            "\151\40\1\115\uff96\40",
            "\157\40\1\116\uff90\40",
            "\147\40\1\120\4\40\1\117\uff93\40",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\125",
            "\1\126",
            "\1\127",
            "\145\40\1\130\uff9a\40",
            "\145\40\1\131\uff9a\40",
            "\151\40\1\132\uff96\40",
            "\55\40\1\133\uffd2\40",
            "\64\40\1\134\1\40\1\135\uffc9\40",
            "\42\40\1\136\12\40\1\137\uffd2\40",
            "\164\40\1\140\uff8b\40",
            "\42\40\1\141\12\40\1\142\uffd2\40",
            "\156\40\1\143\uff91\40",
            "\141\40\1\144\uff9e\40",
            "\145\40\1\145\uff9a\40",
            "\1\146",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\42\40\1\155\12\40\1\154\uffd2\40",
            "\42\40\1\156\uffdd\40",
            "\154\40\1\157\uff93\40",
            "\145\40\1\160\uff9a\40",
            "\42\40\1\161\uffdd\40",
            "\42\40\1\162\uffdd\40",
            "",
            "\162\40\1\164\uff8d\40",
            "\156\40\1\165\uff91\40",
            "",
            "\162\40\1\167\1\40\1\170\uff8b\40",
            "\55\40\1\171\uffd2\40",
            "\164\40\1\172\uff8b\40",
            "\170\40\1\173\uff87\40",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\164\40\1\u0081\uff8b\40",
            "",
            "",
            "\42\40\1\u0084\uffdd\40",
            "\155\40\1\u0085\uff92\40",
            "",
            "",
            "",
            "\145\40\1\u0088\uff9a\40",
            "\141\40\1\u0089\uff9e\40",
            "",
            "\145\40\1\u008a\uff9a\40",
            "\145\40\1\u008b\uff9a\40",
            "\160\40\1\u008c\uff8f\40",
            "\151\40\1\u008d\uff96\40",
            "\42\40\1\u008e\uffdd\40",
            "\1\u008f",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0092",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\151\40\1\u0094\uff96\40",
            "",
            "",
            "",
            "\141\40\1\u0096\uff9e\40",
            "",
            "",
            "\146\40\1\u0097\uff99\40",
            "\155\40\1\u0098\uff92\40",
            "\146\40\1\u0099\uff99\40",
            "\155\40\1\u009a\uff92\40",
            "\157\40\1\u009b\uff90\40",
            "\166\40\1\u009c\uff89\40",
            "",
            "\1\u009e",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\155\40\1\u00a0\uff92\40",
            "",
            "\151\40\1\u00a1\uff96\40",
            "\145\40\1\u00a2\uff9a\40",
            "\145\40\1\u00a3\uff9a\40",
            "\145\40\1\u00a4\uff9a\40",
            "\160\40\1\u00a5\uff8f\40",
            "\151\40\1\u00a6\uff96\40",
            "\145\40\1\u00a7\uff9a\40",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\145\40\1\u00a9\uff9a\40",
            "\154\40\1\u00aa\uff93\40",
            "\162\40\1\u00ab\uff8d\40",
            "\42\40\1\u00ac\uffdd\40",
            "\162\40\1\u00ad\uff8d\40",
            "\154\40\1\u00ae\uff93\40",
            "\156\40\1\u00af\uff91\40",
            "\55\40\1\u00b0\uffd2\40",
            "",
            "\42\40\1\u00b1\uffdd\40",
            "\42\40\1\u00b2\uffdd\40",
            "\145\40\1\u00b3\uff9a\40",
            "",
            "\145\40\1\u00b5\uff9a\40",
            "\141\40\1\u00b6\uff9e\40",
            "\164\40\1\u00b7\uff8b\40",
            "\152\40\1\u00b8\uff95\40",
            "",
            "",
            "\156\40\1\u00bb\uff91\40",
            "",
            "\156\40\1\u00bc\uff91\40",
            "\164\40\1\u00bd\uff8b\40",
            "\145\40\1\u00be\uff9a\40",
            "\163\40\1\u00bf\uff8c\40",
            "",
            "",
            "\143\40\1\u00c0\uff9c\40",
            "\143\40\1\u00c1\uff9c\40",
            "\145\40\1\u00c2\uff9a\40",
            "\162\40\1\u00c3\uff8d\40",
            "\157\40\1\u00c4\uff90\40",
            "\145\40\1\u00c5\uff9a\40",
            "\145\40\1\u00c6\uff9a\40",
            "\42\40\1\u00c7\uffdd\40",
            "\42\40\1\u00c8\uffdd\40",
            "\156\40\1\u00c9\uff91\40",
            "\42\40\1\u00ca\uffdd\40",
            "\42\40\1\u00cb\uffdd\40",
            "",
            "",
            "\55\40\1\u00ce\uffd2\40",
            "",
            "",
            "",
            "",
            "\160\40\1\u00d1\uff8f\40",
            "",
            "",
            "\157\40\1\u00d2\uff90\40",
            "\151\40\1\u00d3\uff96\40",
            "\156\40\1\u00d4\uff91\40",
            "\164\40\1\u00d5\uff8b\40",
            "\145\40\1\u00d6\uff9a\40",
            "\162\40\1\u00d7\uff8d\40",
            "\42\40\1\u00d8\uffdd\40",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='e') ) {s = 138;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='d')||(LA12_119>='f' && LA12_119<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='f') ) {s = 153;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<='e')||(LA12_138>='g' && LA12_138<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_153 = input.LA(1);

                        s = -1;
                        if ( (LA12_153=='e') ) {s = 164;}

                        else if ( ((LA12_153>='\u0000' && LA12_153<='d')||(LA12_153>='f' && LA12_153<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_164 = input.LA(1);

                        s = -1;
                        if ( (LA12_164=='r') ) {s = 173;}

                        else if ( ((LA12_164>='\u0000' && LA12_164<='q')||(LA12_164>='s' && LA12_164<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_173 = input.LA(1);

                        s = -1;
                        if ( (LA12_173=='e') ) {s = 181;}

                        else if ( ((LA12_173>='\u0000' && LA12_173<='d')||(LA12_173>='f' && LA12_173<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='a') ) {s = 53;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='`')||(LA12_24>='b' && LA12_24<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_181 = input.LA(1);

                        s = -1;
                        if ( (LA12_181=='n') ) {s = 188;}

                        else if ( ((LA12_181>='\u0000' && LA12_181<='m')||(LA12_181>='o' && LA12_181<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='c') ) {s = 193;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='b')||(LA12_188>='d' && LA12_188<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='t') ) {s = 70;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='s')||(LA12_53>='u' && LA12_53<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_193 = input.LA(1);

                        s = -1;
                        if ( (LA12_193=='e') ) {s = 198;}

                        else if ( ((LA12_193>='\u0000' && LA12_193<='d')||(LA12_193>='f' && LA12_193<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='\"') ) {s = 203;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='!')||(LA12_198>='#' && LA12_198<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_70 = input.LA(1);

                        s = -1;
                        if ( (LA12_70=='e') ) {s = 88;}

                        else if ( ((LA12_70>='\u0000' && LA12_70<='d')||(LA12_70>='f' && LA12_70<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88=='-') ) {s = 108;}

                        else if ( (LA12_88=='\"') ) {s = 109;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='!')||(LA12_88>='#' && LA12_88<=',')||(LA12_88>='.' && LA12_88<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='r') ) {s = 116;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='q')||(LA12_95>='s' && LA12_95<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='e') ) {s = 136;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='d')||(LA12_116>='f' && LA12_116<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='f') ) {s = 151;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='e')||(LA12_136>='g' && LA12_136<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_151 = input.LA(1);

                        s = -1;
                        if ( (LA12_151=='e') ) {s = 162;}

                        else if ( ((LA12_151>='\u0000' && LA12_151<='d')||(LA12_151>='f' && LA12_151<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_162 = input.LA(1);

                        s = -1;
                        if ( (LA12_162=='r') ) {s = 171;}

                        else if ( ((LA12_162>='\u0000' && LA12_162<='q')||(LA12_162>='s' && LA12_162<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_171 = input.LA(1);

                        s = -1;
                        if ( (LA12_171=='e') ) {s = 179;}

                        else if ( ((LA12_171>='\u0000' && LA12_171<='d')||(LA12_171>='f' && LA12_171<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='n') ) {s = 187;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='m')||(LA12_179>='o' && LA12_179<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_187 = input.LA(1);

                        s = -1;
                        if ( (LA12_187=='c') ) {s = 192;}

                        else if ( ((LA12_187>='\u0000' && LA12_187<='b')||(LA12_187>='d' && LA12_187<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_192 = input.LA(1);

                        s = -1;
                        if ( (LA12_192=='e') ) {s = 197;}

                        else if ( ((LA12_192>='\u0000' && LA12_192<='d')||(LA12_192>='f' && LA12_192<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='\"') ) {s = 202;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='!')||(LA12_197>='#' && LA12_197<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='e') ) {s = 139;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<='d')||(LA12_120>='f' && LA12_120<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='m') ) {s = 154;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='l')||(LA12_139>='n' && LA12_139<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_154 = input.LA(1);

                        s = -1;
                        if ( (LA12_154=='p') ) {s = 165;}

                        else if ( ((LA12_154>='\u0000' && LA12_154<='o')||(LA12_154>='q' && LA12_154<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='l') ) {s = 174;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='k')||(LA12_165>='m' && LA12_165<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='a') ) {s = 182;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='`')||(LA12_174>='b' && LA12_174<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_182 = input.LA(1);

                        s = -1;
                        if ( (LA12_182=='t') ) {s = 189;}

                        else if ( ((LA12_182>='\u0000' && LA12_182<='s')||(LA12_182>='u' && LA12_182<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_189 = input.LA(1);

                        s = -1;
                        if ( (LA12_189=='e') ) {s = 194;}

                        else if ( ((LA12_189>='\u0000' && LA12_189<='d')||(LA12_189>='f' && LA12_189<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='\"') ) {s = 199;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='!')||(LA12_194>='#' && LA12_194<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( (LA12_30=='s') ) {s = 61;}

                        else if ( ((LA12_30>='\u0000' && LA12_30<='r')||(LA12_30>='t' && LA12_30<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_61 = input.LA(1);

                        s = -1;
                        if ( (LA12_61=='o') ) {s = 78;}

                        else if ( ((LA12_61>='\u0000' && LA12_61<='n')||(LA12_61>='p' && LA12_61<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='n') ) {s = 99;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='m')||(LA12_78>='o' && LA12_78<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='-') ) {s = 121;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<=',')||(LA12_99>='.' && LA12_99<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='p') ) {s = 140;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='o')||(LA12_121>='q' && LA12_121<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_140 = input.LA(1);

                        s = -1;
                        if ( (LA12_140=='o') ) {s = 155;}

                        else if ( ((LA12_140>='\u0000' && LA12_140<='n')||(LA12_140>='p' && LA12_140<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_155 = input.LA(1);

                        s = -1;
                        if ( (LA12_155=='i') ) {s = 166;}

                        else if ( ((LA12_155>='\u0000' && LA12_155<='h')||(LA12_155>='j' && LA12_155<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_166 = input.LA(1);

                        s = -1;
                        if ( (LA12_166=='n') ) {s = 175;}

                        else if ( ((LA12_166>='\u0000' && LA12_166<='m')||(LA12_166>='o' && LA12_166<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='t') ) {s = 183;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='s')||(LA12_175>='u' && LA12_175<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_183 = input.LA(1);

                        s = -1;
                        if ( (LA12_183=='e') ) {s = 190;}

                        else if ( ((LA12_183>='\u0000' && LA12_183<='d')||(LA12_183>='f' && LA12_183<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='r') ) {s = 195;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='q')||(LA12_190>='s' && LA12_190<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='\"') ) {s = 200;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='!')||(LA12_195>='#' && LA12_195<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='\"') ) {s = 1;}

                        else if ( (LA12_0=='.') ) {s = 2;}

                        else if ( (LA12_0=='{') ) {s = 3;}

                        else if ( (LA12_0=='}') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='w') ) {s = 6;}

                        else if ( (LA12_0==';') ) {s = 7;}

                        else if ( (LA12_0==',') ) {s = 8;}

                        else if ( (LA12_0=='S') ) {s = 9;}

                        else if ( (LA12_0=='n') ) {s = 10;}

                        else if ( (LA12_0=='l') ) {s = 11;}

                        else if ( (LA12_0=='p') ) {s = 12;}

                        else if ( (LA12_0=='f') ) {s = 13;}

                        else if ( (LA12_0=='-') ) {s = 14;}

                        else if ( (LA12_0=='[') ) {s = 15;}

                        else if ( (LA12_0==']') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( ((LA12_0>='A' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='o'||(LA12_0>='q' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='a') ) {s = 100;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='`')||(LA12_79>='b' && LA12_79<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_100 = input.LA(1);

                        s = -1;
                        if ( (LA12_100=='t') ) {s = 122;}

                        else if ( ((LA12_100>='\u0000' && LA12_100<='s')||(LA12_100>='u' && LA12_100<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='i') ) {s = 141;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='h')||(LA12_122>='j' && LA12_122<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_141 = input.LA(1);

                        s = -1;
                        if ( (LA12_141=='v') ) {s = 156;}

                        else if ( ((LA12_141>='\u0000' && LA12_141<='u')||(LA12_141>='w' && LA12_141<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_156 = input.LA(1);

                        s = -1;
                        if ( (LA12_156=='e') ) {s = 167;}

                        else if ( ((LA12_156>='\u0000' && LA12_156<='d')||(LA12_156>='f' && LA12_156<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='-') ) {s = 176;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<=',')||(LA12_167>='.' && LA12_167<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='j') ) {s = 184;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='i')||(LA12_176>='k' && LA12_176<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_184 = input.LA(1);

                        s = -1;
                        if ( (LA12_184=='s') ) {s = 191;}

                        else if ( ((LA12_184>='\u0000' && LA12_184<='r')||(LA12_184>='t' && LA12_184<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_191 = input.LA(1);

                        s = -1;
                        if ( (LA12_191=='o') ) {s = 196;}

                        else if ( ((LA12_191>='\u0000' && LA12_191<='n')||(LA12_191>='p' && LA12_191<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_196 = input.LA(1);

                        s = -1;
                        if ( (LA12_196=='n') ) {s = 201;}

                        else if ( ((LA12_196>='\u0000' && LA12_196<='m')||(LA12_196>='o' && LA12_196<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_201 = input.LA(1);

                        s = -1;
                        if ( (LA12_201=='-') ) {s = 206;}

                        else if ( ((LA12_201>='\u0000' && LA12_201<=',')||(LA12_201>='.' && LA12_201<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_206 = input.LA(1);

                        s = -1;
                        if ( (LA12_206=='p') ) {s = 209;}

                        else if ( ((LA12_206>='\u0000' && LA12_206<='o')||(LA12_206>='q' && LA12_206<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_209 = input.LA(1);

                        s = -1;
                        if ( (LA12_209=='o') ) {s = 210;}

                        else if ( ((LA12_209>='\u0000' && LA12_209<='n')||(LA12_209>='p' && LA12_209<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_210 = input.LA(1);

                        s = -1;
                        if ( (LA12_210=='i') ) {s = 211;}

                        else if ( ((LA12_210>='\u0000' && LA12_210<='h')||(LA12_210>='j' && LA12_210<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_211 = input.LA(1);

                        s = -1;
                        if ( (LA12_211=='n') ) {s = 212;}

                        else if ( ((LA12_211>='\u0000' && LA12_211<='m')||(LA12_211>='o' && LA12_211<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_212 = input.LA(1);

                        s = -1;
                        if ( (LA12_212=='t') ) {s = 213;}

                        else if ( ((LA12_212>='\u0000' && LA12_212<='s')||(LA12_212>='u' && LA12_212<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_213 = input.LA(1);

                        s = -1;
                        if ( (LA12_213=='e') ) {s = 214;}

                        else if ( ((LA12_213>='\u0000' && LA12_213<='d')||(LA12_213>='f' && LA12_213<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_214 = input.LA(1);

                        s = -1;
                        if ( (LA12_214=='r') ) {s = 215;}

                        else if ( ((LA12_214>='\u0000' && LA12_214<='q')||(LA12_214>='s' && LA12_214<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_215 = input.LA(1);

                        s = -1;
                        if ( (LA12_215=='\"') ) {s = 216;}

                        else if ( ((LA12_215>='\u0000' && LA12_215<='!')||(LA12_215>='#' && LA12_215<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='e') ) {s = 101;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='d')||(LA12_80>='f' && LA12_80<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101=='x') ) {s = 123;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='w')||(LA12_101>='y' && LA12_101<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_123 = input.LA(1);

                        s = -1;
                        if ( (LA12_123=='\"') ) {s = 142;}

                        else if ( ((LA12_123>='\u0000' && LA12_123<='!')||(LA12_123>='#' && LA12_123<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_57 = input.LA(1);

                        s = -1;
                        if ( (LA12_57=='v') ) {s = 74;}

                        else if ( ((LA12_57>='\u0000' && LA12_57<='u')||(LA12_57>='w' && LA12_57<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='4') ) {s = 92;}

                        else if ( (LA12_74=='6') ) {s = 93;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='3')||LA12_74=='5'||(LA12_74>='7' && LA12_74<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( (LA12_27=='d') ) {s = 56;}

                        else if ( (LA12_27=='p') ) {s = 57;}

                        else if ( (LA12_27=='r') ) {s = 58;}

                        else if ( ((LA12_27>='\u0000' && LA12_27<='c')||(LA12_27>='e' && LA12_27<='o')||LA12_27=='q'||(LA12_27>='s' && LA12_27<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_1 = input.LA(1);

                        s = -1;
                        if ( (LA12_1=='d') ) {s = 24;}

                        else if ( (LA12_1=='t') ) {s = 25;}

                        else if ( (LA12_1=='e') ) {s = 26;}

                        else if ( (LA12_1=='i') ) {s = 27;}

                        else if ( (LA12_1=='h') ) {s = 28;}

                        else if ( (LA12_1=='u') ) {s = 29;}

                        else if ( (LA12_1=='j') ) {s = 30;}

                        else if ( (LA12_1=='r') ) {s = 31;}

                        else if ( ((LA12_1>='\u0000' && LA12_1<='c')||(LA12_1>='f' && LA12_1<='g')||(LA12_1>='k' && LA12_1<='q')||LA12_1=='s'||(LA12_1>='v' && LA12_1<='\uFFFF')) ) {s = 32;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 32;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='i') ) {s = 75;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='h')||(LA12_58>='j' && LA12_58<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='\"') ) {s = 94;}

                        else if ( (LA12_75=='-') ) {s = 95;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='!')||(LA12_75>='#' && LA12_75<=',')||(LA12_75>='.' && LA12_75<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='r') ) {s = 119;}

                        else if ( (LA12_98=='t') ) {s = 120;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='q')||LA12_98=='s'||(LA12_98>='u' && LA12_98<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( (LA12_31=='e') ) {s = 62;}

                        else if ( ((LA12_31>='\u0000' && LA12_31<='d')||(LA12_31>='f' && LA12_31<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='l') ) {s = 79;}

                        else if ( (LA12_62=='g') ) {s = 80;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='f')||(LA12_62>='h' && LA12_62<='k')||(LA12_62>='m' && LA12_62<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( (LA12_29=='r') ) {s = 60;}

                        else if ( ((LA12_29>='\u0000' && LA12_29<='q')||(LA12_29>='s' && LA12_29<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='i') ) {s = 77;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='h')||(LA12_60>='j' && LA12_60<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='\"') ) {s = 97;}

                        else if ( (LA12_77=='-') ) {s = 98;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='!')||(LA12_77>='#' && LA12_77<=',')||(LA12_77>='.' && LA12_77<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='t') ) {s = 129;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='s')||(LA12_108>='u' && LA12_108<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_129 = input.LA(1);

                        s = -1;
                        if ( (LA12_129=='i') ) {s = 148;}

                        else if ( ((LA12_129>='\u0000' && LA12_129<='h')||(LA12_129>='j' && LA12_129<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_148 = input.LA(1);

                        s = -1;
                        if ( (LA12_148=='m') ) {s = 160;}

                        else if ( ((LA12_148>='\u0000' && LA12_148<='l')||(LA12_148>='n' && LA12_148<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_160 = input.LA(1);

                        s = -1;
                        if ( (LA12_160=='e') ) {s = 169;}

                        else if ( ((LA12_160>='\u0000' && LA12_160<='d')||(LA12_160>='f' && LA12_160<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_169 = input.LA(1);

                        s = -1;
                        if ( (LA12_169=='\"') ) {s = 177;}

                        else if ( ((LA12_169>='\u0000' && LA12_169<='!')||(LA12_169>='#' && LA12_169<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( (LA12_25=='i') ) {s = 54;}

                        else if ( ((LA12_25>='\u0000' && LA12_25<='h')||(LA12_25>='j' && LA12_25<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='m') ) {s = 71;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='l')||(LA12_54>='n' && LA12_54<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='e') ) {s = 89;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='d')||(LA12_71>='f' && LA12_71<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='\"') ) {s = 110;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='!')||(LA12_89>='#' && LA12_89<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( (LA12_26=='m') ) {s = 55;}

                        else if ( ((LA12_26>='\u0000' && LA12_26<='l')||(LA12_26>='n' && LA12_26<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='a') ) {s = 72;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='`')||(LA12_55>='b' && LA12_55<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='i') ) {s = 90;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='h')||(LA12_72>='j' && LA12_72<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='l') ) {s = 111;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<='k')||(LA12_90>='m' && LA12_90<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='\"') ) {s = 132;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='!')||(LA12_111>='#' && LA12_111<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='n') ) {s = 73;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='m')||(LA12_56>='o' && LA12_56<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='-') ) {s = 91;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<=',')||(LA12_73>='.' && LA12_73<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_91 = input.LA(1);

                        s = -1;
                        if ( (LA12_91=='e') ) {s = 112;}

                        else if ( ((LA12_91>='\u0000' && LA12_91<='d')||(LA12_91>='f' && LA12_91<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='m') ) {s = 133;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='l')||(LA12_112>='n' && LA12_112<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='a') ) {s = 150;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='`')||(LA12_133>='b' && LA12_133<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='i') ) {s = 161;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='h')||(LA12_150>='j' && LA12_150<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_161 = input.LA(1);

                        s = -1;
                        if ( (LA12_161=='l') ) {s = 170;}

                        else if ( ((LA12_161>='\u0000' && LA12_161<='k')||(LA12_161>='m' && LA12_161<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_170 = input.LA(1);

                        s = -1;
                        if ( (LA12_170=='\"') ) {s = 178;}

                        else if ( ((LA12_170>='\u0000' && LA12_170<='!')||(LA12_170>='#' && LA12_170<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( (LA12_28=='o') ) {s = 59;}

                        else if ( ((LA12_28>='\u0000' && LA12_28<='n')||(LA12_28>='p' && LA12_28<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='s') ) {s = 76;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='r')||(LA12_59>='t' && LA12_59<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='t') ) {s = 96;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='s')||(LA12_76>='u' && LA12_76<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='n') ) {s = 117;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='m')||(LA12_96>='o' && LA12_96<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='a') ) {s = 137;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='`')||(LA12_117>='b' && LA12_117<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='m') ) {s = 152;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='l')||(LA12_137>='n' && LA12_137<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA12_152 = input.LA(1);

                        s = -1;
                        if ( (LA12_152=='e') ) {s = 163;}

                        else if ( ((LA12_152>='\u0000' && LA12_152<='d')||(LA12_152>='f' && LA12_152<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA12_163 = input.LA(1);

                        s = -1;
                        if ( (LA12_163=='\"') ) {s = 172;}

                        else if ( ((LA12_163>='\u0000' && LA12_163<='!')||(LA12_163>='#' && LA12_163<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='\"') ) {s = 113;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='!')||(LA12_92>='#' && LA12_92<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='\"') ) {s = 114;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='!')||(LA12_93>='#' && LA12_93<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}