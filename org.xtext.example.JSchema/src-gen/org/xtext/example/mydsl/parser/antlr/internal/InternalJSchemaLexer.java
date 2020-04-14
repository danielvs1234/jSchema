package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
            // InternalJSchema.g:11:7: ( '.' )
            // InternalJSchema.g:11:9: '.'
            {
            match('.'); 

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
            // InternalJSchema.g:12:7: ( 'includes' )
            // InternalJSchema.g:12:9: 'includes'
            {
            match("includes"); 


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
            // InternalJSchema.g:13:7: ( '{' )
            // InternalJSchema.g:13:9: '{'
            {
            match('{'); 

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
            // InternalJSchema.g:14:7: ( '}' )
            // InternalJSchema.g:14:9: '}'
            {
            match('}'); 

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
            // InternalJSchema.g:15:7: ( 'with' )
            // InternalJSchema.g:15:9: 'with'
            {
            match("with"); 


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
            // InternalJSchema.g:16:7: ( ',' )
            // InternalJSchema.g:16:9: ','
            {
            match(','); 

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
            // InternalJSchema.g:17:7: ( ';' )
            // InternalJSchema.g:17:9: ';'
            {
            match(';'); 

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
            // InternalJSchema.g:18:7: ( 'String' )
            // InternalJSchema.g:18:9: 'String'
            {
            match("String"); 


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
            // InternalJSchema.g:19:7: ( 'num' )
            // InternalJSchema.g:19:9: 'num'
            {
            match("num"); 


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
            // InternalJSchema.g:20:7: ( 'length' )
            // InternalJSchema.g:20:9: 'length'
            {
            match("length"); 


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
            // InternalJSchema.g:21:7: ( 'pattern' )
            // InternalJSchema.g:21:9: 'pattern'
            {
            match("pattern"); 


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
            // InternalJSchema.g:22:7: ( 'format' )
            // InternalJSchema.g:22:9: 'format'
            {
            match("format"); 


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
            // InternalJSchema.g:23:7: ( '-' )
            // InternalJSchema.g:23:9: '-'
            {
            match('-'); 

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
            // InternalJSchema.g:24:7: ( '[' )
            // InternalJSchema.g:24:9: '['
            {
            match('['); 

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
            // InternalJSchema.g:25:7: ( ']' )
            // InternalJSchema.g:25:9: ']'
            {
            match(']'); 

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
            // InternalJSchema.g:26:7: ( '\"date-time\"' )
            // InternalJSchema.g:26:9: '\"date-time\"'
            {
            match("\"date-time\""); 


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
            // InternalJSchema.g:27:7: ( '\"time\"' )
            // InternalJSchema.g:27:9: '\"time\"'
            {
            match("\"time\""); 


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
            // InternalJSchema.g:28:7: ( '\"date\"' )
            // InternalJSchema.g:28:9: '\"date\"'
            {
            match("\"date\""); 


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
            // InternalJSchema.g:29:7: ( '\"email\"' )
            // InternalJSchema.g:29:9: '\"email\"'
            {
            match("\"email\""); 


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
            // InternalJSchema.g:30:7: ( '\"idn-email\"' )
            // InternalJSchema.g:30:9: '\"idn-email\"'
            {
            match("\"idn-email\""); 


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
            // InternalJSchema.g:31:7: ( '\"hostname\"' )
            // InternalJSchema.g:31:9: '\"hostname\"'
            {
            match("\"hostname\""); 


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
            // InternalJSchema.g:32:7: ( '\"ipv4\"' )
            // InternalJSchema.g:32:9: '\"ipv4\"'
            {
            match("\"ipv4\""); 


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
            // InternalJSchema.g:33:7: ( '\"ipv6\"' )
            // InternalJSchema.g:33:9: '\"ipv6\"'
            {
            match("\"ipv6\""); 


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
            // InternalJSchema.g:34:7: ( '\"uri\"' )
            // InternalJSchema.g:34:9: '\"uri\"'
            {
            match("\"uri\""); 


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
            // InternalJSchema.g:35:7: ( '\"uri-reference\"' )
            // InternalJSchema.g:35:9: '\"uri-reference\"'
            {
            match("\"uri-reference\""); 


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
            // InternalJSchema.g:36:7: ( '\"iri\"' )
            // InternalJSchema.g:36:9: '\"iri\"'
            {
            match("\"iri\""); 


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
            // InternalJSchema.g:37:7: ( '\"iri-reference\"' )
            // InternalJSchema.g:37:9: '\"iri-reference\"'
            {
            match("\"iri-reference\""); 


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
            // InternalJSchema.g:38:7: ( '\"uri-template\"' )
            // InternalJSchema.g:38:9: '\"uri-template\"'
            {
            match("\"uri-template\""); 


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
            // InternalJSchema.g:39:7: ( '\"json-pointer\"' )
            // InternalJSchema.g:39:9: '\"json-pointer\"'
            {
            match("\"json-pointer\""); 


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
            // InternalJSchema.g:40:7: ( '\"relative-json-pointer\"' )
            // InternalJSchema.g:40:9: '\"relative-json-pointer\"'
            {
            match("\"relative-json-pointer\""); 


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
            // InternalJSchema.g:41:7: ( '\"regex\"' )
            // InternalJSchema.g:41:9: '\"regex\"'
            {
            match("\"regex\""); 


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
            // InternalJSchema.g:992:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJSchema.g:992:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJSchema.g:992:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSchema.g:992:11: '^'
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

            // InternalJSchema.g:992:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalJSchema.g:994:10: ( ( '0' .. '9' )+ )
            // InternalJSchema.g:994:12: ( '0' .. '9' )+
            {
            // InternalJSchema.g:994:12: ( '0' .. '9' )+
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
            	    // InternalJSchema.g:994:13: '0' .. '9'
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
            // InternalJSchema.g:996:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJSchema.g:996:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJSchema.g:996:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalJSchema.g:996:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJSchema.g:996:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalJSchema.g:996:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:996:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalJSchema.g:996:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJSchema.g:996:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalJSchema.g:996:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:996:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalJSchema.g:998:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJSchema.g:998:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJSchema.g:998:24: ( options {greedy=false; } : . )*
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
            	    // InternalJSchema.g:998:52: .
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
            // InternalJSchema.g:1000:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJSchema.g:1000:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJSchema.g:1000:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJSchema.g:1000:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalJSchema.g:1000:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:1000:41: ( '\\r' )? '\\n'
                    {
                    // InternalJSchema.g:1000:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalJSchema.g:1000:41: '\\r'
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
            // InternalJSchema.g:1002:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJSchema.g:1002:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJSchema.g:1002:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalJSchema.g:1004:16: ( . )
            // InternalJSchema.g:1004:18: .
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
        "\2\uffff\1\32\2\uffff\1\32\2\uffff\5\32\3\uffff\2\27\2\uffff\2\27\3\uffff\1\32\3\uffff\1\32\2\uffff\5\32\20\uffff\3\32\1\111\3\32\12\uffff\1\32\1\131\1\32\1\uffff\3\32\13\uffff\1\32\1\uffff\4\32\16\uffff\1\32\1\u0082\1\u0083\1\32\1\u0085\20\uffff\1\32\2\uffff\1\u0095\17\uffff\1\u00a0\105\uffff";
    static final String DFA12_eofS =
        "\u00da\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\156\2\uffff\1\151\2\uffff\1\164\1\165\1\145\1\141\1\157\3\uffff\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\143\3\uffff\1\164\2\uffff\1\162\1\155\1\156\1\164\1\162\3\uffff\10\0\5\uffff\1\154\1\150\1\151\1\60\1\147\1\164\1\155\12\0\1\165\1\60\1\156\1\uffff\1\164\1\145\1\141\13\0\1\144\1\uffff\1\147\1\150\1\162\1\164\6\0\1\uffff\2\0\1\uffff\4\0\1\145\2\60\1\156\1\60\1\0\2\uffff\2\0\3\uffff\2\0\1\uffff\5\0\1\163\2\uffff\1\60\1\uffff\1\0\3\uffff\1\0\2\uffff\6\0\1\uffff\1\60\1\uffff\1\0\1\uffff\7\0\2\uffff\13\0\1\uffff\4\0\2\uffff\1\0\1\uffff\4\0\2\uffff\14\0\2\uffff\1\0\4\uffff\1\0\2\uffff\7\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\156\2\uffff\1\151\2\uffff\1\164\1\165\1\145\1\141\1\157\3\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\1\143\3\uffff\1\164\2\uffff\1\162\1\155\1\156\1\164\1\162\3\uffff\10\uffff\5\uffff\1\154\1\150\1\151\1\172\1\147\1\164\1\155\12\uffff\1\165\1\172\1\156\1\uffff\1\164\1\145\1\141\13\uffff\1\144\1\uffff\1\147\1\150\1\162\1\164\6\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\145\2\172\1\156\1\172\1\uffff\2\uffff\2\uffff\3\uffff\2\uffff\1\uffff\5\uffff\1\163\2\uffff\1\172\1\uffff\1\uffff\3\uffff\1\uffff\2\uffff\6\uffff\1\uffff\1\172\1\uffff\1\uffff\1\uffff\7\uffff\2\uffff\13\uffff\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff\4\uffff\2\uffff\14\uffff\2\uffff\1\uffff\4\uffff\1\uffff\2\uffff\7\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\6\1\7\5\uffff\1\15\1\16\1\17\2\uffff\1\40\1\41\2\uffff\1\45\1\46\1\1\1\uffff\1\40\1\3\1\4\1\uffff\1\6\1\7\5\uffff\1\15\1\16\1\17\10\uffff\1\42\1\41\1\43\1\44\1\45\24\uffff\1\11\17\uffff\1\5\12\uffff\1\32\2\uffff\1\30\12\uffff\1\22\1\21\2\uffff\1\26\1\27\1\32\2\uffff\1\30\6\uffff\1\10\1\12\1\uffff\1\14\1\uffff\1\22\1\21\1\23\1\uffff\1\26\1\27\6\uffff\1\37\1\uffff\1\13\1\uffff\1\23\7\uffff\1\37\1\2\13\uffff\1\25\4\uffff\1\20\1\24\1\uffff\1\25\4\uffff\1\20\1\24\14\uffff\1\34\1\35\1\uffff\1\33\1\31\1\34\1\35\1\uffff\1\33\1\31\7\uffff\2\36";
    static final String DFA12_specialS =
        "\1\153\17\uffff\1\57\3\uffff\1\150\23\uffff\1\141\1\5\1\11\1\42\1\30\1\100\1\77\1\13\14\uffff\1\142\1\6\1\12\1\20\1\151\1\154\1\31\1\104\1\101\1\16\7\uffff\1\143\1\7\1\14\1\21\1\152\1\155\1\32\1\110\1\102\1\116\1\144\6\uffff\1\146\1\10\1\15\1\22\1\40\1\41\1\uffff\1\54\1\33\1\uffff\1\156\1\103\1\117\1\145\5\uffff\1\0\2\uffff\1\17\1\23\3\uffff\1\55\1\34\1\uffff\1\43\1\67\1\105\1\120\1\147\5\uffff\1\1\3\uffff\1\24\2\uffff\1\56\1\35\1\44\1\70\1\106\1\121\3\uffff\1\2\1\uffff\1\25\1\60\1\36\1\45\1\71\1\107\1\122\2\uffff\1\3\1\26\1\61\1\37\1\46\1\72\1\111\1\123\1\4\1\27\1\62\1\uffff\1\47\1\73\1\112\1\124\2\uffff\1\63\1\uffff\1\50\1\74\1\113\1\125\2\uffff\1\64\1\51\1\75\1\114\1\126\1\65\1\52\1\76\1\115\1\127\1\66\1\53\2\uffff\1\130\4\uffff\1\131\2\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\20\4\27\1\24\4\27\1\6\1\15\1\1\1\25\12\23\1\27\1\7\5\27\22\22\1\10\7\22\1\16\1\27\1\17\1\21\1\22\1\27\5\22\1\14\2\22\1\2\2\22\1\12\1\22\1\11\1\22\1\13\6\22\1\5\3\22\1\3\1\27\1\4\uff82\27",
            "",
            "\1\31",
            "",
            "",
            "\1\35",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "",
            "\144\60\1\50\1\52\2\60\1\54\1\53\1\56\7\60\1\57\1\60\1\51\1\55\uff8a\60",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\60",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\141\60\1\74\uff9e\60",
            "\151\60\1\75\uff96\60",
            "\155\60\1\76\uff92\60",
            "\144\60\1\77\13\60\1\100\1\60\1\101\uff8d\60",
            "\157\60\1\102\uff90\60",
            "\162\60\1\103\uff8d\60",
            "\163\60\1\104\uff8c\60",
            "\145\60\1\105\uff9a\60",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\112",
            "\1\113",
            "\1\114",
            "\164\60\1\115\uff8b\60",
            "\155\60\1\116\uff92\60",
            "\141\60\1\117\uff9e\60",
            "\156\60\1\120\uff91\60",
            "\166\60\1\121\uff89\60",
            "\151\60\1\122\uff96\60",
            "\163\60\1\123\uff8c\60",
            "\151\60\1\124\uff96\60",
            "\157\60\1\125\uff90\60",
            "\147\60\1\127\4\60\1\126\uff93\60",
            "\1\130",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\145\60\1\136\uff9a\60",
            "\145\60\1\137\uff9a\60",
            "\151\60\1\140\uff96\60",
            "\55\60\1\141\uffd2\60",
            "\64\60\1\142\1\60\1\143\uffc9\60",
            "\42\60\1\144\12\60\1\145\uffd2\60",
            "\164\60\1\146\uff8b\60",
            "\42\60\1\147\12\60\1\150\uffd2\60",
            "\156\60\1\151\uff91\60",
            "\141\60\1\152\uff9e\60",
            "\145\60\1\153\uff9a\60",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\42\60\1\162\12\60\1\161\uffd2\60",
            "\42\60\1\163\uffdd\60",
            "\154\60\1\164\uff93\60",
            "\145\60\1\165\uff9a\60",
            "\42\60\1\166\uffdd\60",
            "\42\60\1\167\uffdd\60",
            "",
            "\162\60\1\171\uff8d\60",
            "\156\60\1\172\uff91\60",
            "",
            "\162\60\1\174\1\60\1\175\uff8b\60",
            "\55\60\1\176\uffd2\60",
            "\164\60\1\177\uff8b\60",
            "\170\60\1\u0080\uff87\60",
            "\1\u0081",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0084",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\164\60\1\u0086\uff8b\60",
            "",
            "",
            "\42\60\1\u0089\uffdd\60",
            "\155\60\1\u008a\uff92\60",
            "",
            "",
            "",
            "\145\60\1\u008d\uff9a\60",
            "\141\60\1\u008e\uff9e\60",
            "",
            "\145\60\1\u008f\uff9a\60",
            "\145\60\1\u0090\uff9a\60",
            "\160\60\1\u0091\uff8f\60",
            "\151\60\1\u0092\uff96\60",
            "\42\60\1\u0093\uffdd\60",
            "\1\u0094",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\151\60\1\u0096\uff96\60",
            "",
            "",
            "",
            "\141\60\1\u0098\uff9e\60",
            "",
            "",
            "\146\60\1\u0099\uff99\60",
            "\155\60\1\u009a\uff92\60",
            "\146\60\1\u009b\uff99\60",
            "\155\60\1\u009c\uff92\60",
            "\157\60\1\u009d\uff90\60",
            "\166\60\1\u009e\uff89\60",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\155\60\1\u00a1\uff92\60",
            "",
            "\151\60\1\u00a2\uff96\60",
            "\145\60\1\u00a3\uff9a\60",
            "\145\60\1\u00a4\uff9a\60",
            "\145\60\1\u00a5\uff9a\60",
            "\160\60\1\u00a6\uff8f\60",
            "\151\60\1\u00a7\uff96\60",
            "\145\60\1\u00a8\uff9a\60",
            "",
            "",
            "\145\60\1\u00a9\uff9a\60",
            "\154\60\1\u00aa\uff93\60",
            "\162\60\1\u00ab\uff8d\60",
            "\42\60\1\u00ac\uffdd\60",
            "\162\60\1\u00ad\uff8d\60",
            "\154\60\1\u00ae\uff93\60",
            "\156\60\1\u00af\uff91\60",
            "\55\60\1\u00b0\uffd2\60",
            "\42\60\1\u00b1\uffdd\60",
            "\42\60\1\u00b2\uffdd\60",
            "\145\60\1\u00b3\uff9a\60",
            "",
            "\145\60\1\u00b5\uff9a\60",
            "\141\60\1\u00b6\uff9e\60",
            "\164\60\1\u00b7\uff8b\60",
            "\152\60\1\u00b8\uff95\60",
            "",
            "",
            "\156\60\1\u00bb\uff91\60",
            "",
            "\156\60\1\u00bc\uff91\60",
            "\164\60\1\u00bd\uff8b\60",
            "\145\60\1\u00be\uff9a\60",
            "\163\60\1\u00bf\uff8c\60",
            "",
            "",
            "\143\60\1\u00c0\uff9c\60",
            "\143\60\1\u00c1\uff9c\60",
            "\145\60\1\u00c2\uff9a\60",
            "\162\60\1\u00c3\uff8d\60",
            "\157\60\1\u00c4\uff90\60",
            "\145\60\1\u00c5\uff9a\60",
            "\145\60\1\u00c6\uff9a\60",
            "\42\60\1\u00c7\uffdd\60",
            "\42\60\1\u00c8\uffdd\60",
            "\156\60\1\u00c9\uff91\60",
            "\42\60\1\u00ca\uffdd\60",
            "\42\60\1\u00cb\uffdd\60",
            "",
            "",
            "\55\60\1\u00ce\uffd2\60",
            "",
            "",
            "",
            "",
            "\160\60\1\u00d1\uff8f\60",
            "",
            "",
            "\157\60\1\u00d2\uff90\60",
            "\151\60\1\u00d3\uff96\60",
            "\156\60\1\u00d4\uff91\60",
            "\164\60\1\u00d5\uff8b\60",
            "\145\60\1\u00d6\uff9a\60",
            "\162\60\1\u00d7\uff8d\60",
            "\42\60\1\u00d8\uffdd\60",
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
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='t') ) {s = 134;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='s')||(LA12_113>='u' && LA12_113<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_134 = input.LA(1);

                        s = -1;
                        if ( (LA12_134=='i') ) {s = 150;}

                        else if ( ((LA12_134>='\u0000' && LA12_134<='h')||(LA12_134>='j' && LA12_134<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='m') ) {s = 161;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='l')||(LA12_150>='n' && LA12_150<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_161 = input.LA(1);

                        s = -1;
                        if ( (LA12_161=='e') ) {s = 169;}

                        else if ( ((LA12_161>='\u0000' && LA12_161<='d')||(LA12_161>='f' && LA12_161<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_169 = input.LA(1);

                        s = -1;
                        if ( (LA12_169=='\"') ) {s = 177;}

                        else if ( ((LA12_169>='\u0000' && LA12_169<='!')||(LA12_169>='#' && LA12_169<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='i') ) {s = 61;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='h')||(LA12_41>='j' && LA12_41<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_61 = input.LA(1);

                        s = -1;
                        if ( (LA12_61=='m') ) {s = 78;}

                        else if ( ((LA12_61>='\u0000' && LA12_61<='l')||(LA12_61>='n' && LA12_61<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='e') ) {s = 95;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='d')||(LA12_78>='f' && LA12_78<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='\"') ) {s = 115;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='!')||(LA12_95>='#' && LA12_95<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='m') ) {s = 62;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='l')||(LA12_42>='n' && LA12_42<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='a') ) {s = 79;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='`')||(LA12_62>='b' && LA12_62<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='e') ) {s = 69;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='d')||(LA12_47>='f' && LA12_47<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='i') ) {s = 96;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='h')||(LA12_79>='j' && LA12_79<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='l') ) {s = 116;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='k')||(LA12_96>='m' && LA12_96<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='l') ) {s = 86;}

                        else if ( (LA12_69=='g') ) {s = 87;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='f')||(LA12_69>='h' && LA12_69<='k')||(LA12_69>='m' && LA12_69<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='\"') ) {s = 137;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='!')||(LA12_116>='#' && LA12_116<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_63 = input.LA(1);

                        s = -1;
                        if ( (LA12_63=='n') ) {s = 80;}

                        else if ( ((LA12_63>='\u0000' && LA12_63<='m')||(LA12_63>='o' && LA12_63<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='-') ) {s = 97;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<=',')||(LA12_80>='.' && LA12_80<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='e') ) {s = 117;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='d')||(LA12_97>='f' && LA12_97<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='m') ) {s = 138;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='l')||(LA12_117>='n' && LA12_117<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='a') ) {s = 152;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<='`')||(LA12_138>='b' && LA12_138<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_152 = input.LA(1);

                        s = -1;
                        if ( (LA12_152=='i') ) {s = 162;}

                        else if ( ((LA12_152>='\u0000' && LA12_152<='h')||(LA12_152>='j' && LA12_152<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_162 = input.LA(1);

                        s = -1;
                        if ( (LA12_162=='l') ) {s = 170;}

                        else if ( ((LA12_162>='\u0000' && LA12_162<='k')||(LA12_162>='m' && LA12_162<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_170 = input.LA(1);

                        s = -1;
                        if ( (LA12_170=='\"') ) {s = 178;}

                        else if ( ((LA12_170>='\u0000' && LA12_170<='!')||(LA12_170>='#' && LA12_170<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='o') ) {s = 66;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='n')||(LA12_44>='p' && LA12_44<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='s') ) {s = 83;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='r')||(LA12_66>='t' && LA12_66<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='t') ) {s = 102;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='s')||(LA12_83>='u' && LA12_83<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='n') ) {s = 122;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='m')||(LA12_102>='o' && LA12_102<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='a') ) {s = 142;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='`')||(LA12_122>='b' && LA12_122<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='m') ) {s = 154;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='l')||(LA12_142>='n' && LA12_142<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_154 = input.LA(1);

                        s = -1;
                        if ( (LA12_154=='e') ) {s = 164;}

                        else if ( ((LA12_154>='\u0000' && LA12_154<='d')||(LA12_154>='f' && LA12_154<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_164 = input.LA(1);

                        s = -1;
                        if ( (LA12_164=='\"') ) {s = 172;}

                        else if ( ((LA12_164>='\u0000' && LA12_164<='!')||(LA12_164>='#' && LA12_164<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='\"') ) {s = 118;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='!')||(LA12_98>='#' && LA12_98<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='\"') ) {s = 119;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='!')||(LA12_99>='#' && LA12_99<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='d') ) {s = 63;}

                        else if ( (LA12_43=='p') ) {s = 64;}

                        else if ( (LA12_43=='r') ) {s = 65;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='c')||(LA12_43>='e' && LA12_43<='o')||LA12_43=='q'||(LA12_43>='s' && LA12_43<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='e') ) {s = 143;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='d')||(LA12_124>='f' && LA12_124<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_143 = input.LA(1);

                        s = -1;
                        if ( (LA12_143=='f') ) {s = 155;}

                        else if ( ((LA12_143>='\u0000' && LA12_143<='e')||(LA12_143>='g' && LA12_143<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_155 = input.LA(1);

                        s = -1;
                        if ( (LA12_155=='e') ) {s = 165;}

                        else if ( ((LA12_155>='\u0000' && LA12_155<='d')||(LA12_155>='f' && LA12_155<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='r') ) {s = 173;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='q')||(LA12_165>='s' && LA12_165<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_173 = input.LA(1);

                        s = -1;
                        if ( (LA12_173=='e') ) {s = 181;}

                        else if ( ((LA12_173>='\u0000' && LA12_173<='d')||(LA12_173>='f' && LA12_173<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_181 = input.LA(1);

                        s = -1;
                        if ( (LA12_181=='n') ) {s = 188;}

                        else if ( ((LA12_181>='\u0000' && LA12_181<='m')||(LA12_181>='o' && LA12_181<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='c') ) {s = 193;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='b')||(LA12_188>='d' && LA12_188<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_193 = input.LA(1);

                        s = -1;
                        if ( (LA12_193=='e') ) {s = 198;}

                        else if ( ((LA12_193>='\u0000' && LA12_193<='d')||(LA12_193>='f' && LA12_193<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='\"') ) {s = 203;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='!')||(LA12_198>='#' && LA12_198<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101=='r') ) {s = 121;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='q')||(LA12_101>='s' && LA12_101<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='e') ) {s = 141;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='d')||(LA12_121>='f' && LA12_121<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_141 = input.LA(1);

                        s = -1;
                        if ( (LA12_141=='f') ) {s = 153;}

                        else if ( ((LA12_141>='\u0000' && LA12_141<='e')||(LA12_141>='g' && LA12_141<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( (LA12_16=='d') ) {s = 40;}

                        else if ( (LA12_16=='t') ) {s = 41;}

                        else if ( (LA12_16=='e') ) {s = 42;}

                        else if ( (LA12_16=='i') ) {s = 43;}

                        else if ( (LA12_16=='h') ) {s = 44;}

                        else if ( (LA12_16=='u') ) {s = 45;}

                        else if ( (LA12_16=='j') ) {s = 46;}

                        else if ( (LA12_16=='r') ) {s = 47;}

                        else if ( ((LA12_16>='\u0000' && LA12_16<='c')||(LA12_16>='f' && LA12_16<='g')||(LA12_16>='k' && LA12_16<='q')||LA12_16=='s'||(LA12_16>='v' && LA12_16<='\uFFFF')) ) {s = 48;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_153 = input.LA(1);

                        s = -1;
                        if ( (LA12_153=='e') ) {s = 163;}

                        else if ( ((LA12_153>='\u0000' && LA12_153<='d')||(LA12_153>='f' && LA12_153<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_163 = input.LA(1);

                        s = -1;
                        if ( (LA12_163=='r') ) {s = 171;}

                        else if ( ((LA12_163>='\u0000' && LA12_163<='q')||(LA12_163>='s' && LA12_163<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_171 = input.LA(1);

                        s = -1;
                        if ( (LA12_171=='e') ) {s = 179;}

                        else if ( ((LA12_171>='\u0000' && LA12_171<='d')||(LA12_171>='f' && LA12_171<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='n') ) {s = 187;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='m')||(LA12_179>='o' && LA12_179<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_187 = input.LA(1);

                        s = -1;
                        if ( (LA12_187=='c') ) {s = 192;}

                        else if ( ((LA12_187>='\u0000' && LA12_187<='b')||(LA12_187>='d' && LA12_187<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_192 = input.LA(1);

                        s = -1;
                        if ( (LA12_192=='e') ) {s = 197;}

                        else if ( ((LA12_192>='\u0000' && LA12_192<='d')||(LA12_192>='f' && LA12_192<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='\"') ) {s = 202;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='!')||(LA12_197>='#' && LA12_197<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='e') ) {s = 144;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='d')||(LA12_125>='f' && LA12_125<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='m') ) {s = 156;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='l')||(LA12_144>='n' && LA12_144<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_156 = input.LA(1);

                        s = -1;
                        if ( (LA12_156=='p') ) {s = 166;}

                        else if ( ((LA12_156>='\u0000' && LA12_156<='o')||(LA12_156>='q' && LA12_156<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_166 = input.LA(1);

                        s = -1;
                        if ( (LA12_166=='l') ) {s = 174;}

                        else if ( ((LA12_166>='\u0000' && LA12_166<='k')||(LA12_166>='m' && LA12_166<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='a') ) {s = 182;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='`')||(LA12_174>='b' && LA12_174<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_182 = input.LA(1);

                        s = -1;
                        if ( (LA12_182=='t') ) {s = 189;}

                        else if ( ((LA12_182>='\u0000' && LA12_182<='s')||(LA12_182>='u' && LA12_182<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_189 = input.LA(1);

                        s = -1;
                        if ( (LA12_189=='e') ) {s = 194;}

                        else if ( ((LA12_189>='\u0000' && LA12_189<='d')||(LA12_189>='f' && LA12_189<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='\"') ) {s = 199;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='!')||(LA12_194>='#' && LA12_194<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='s') ) {s = 68;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='r')||(LA12_46>='t' && LA12_46<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='r') ) {s = 67;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='q')||(LA12_45>='s' && LA12_45<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='o') ) {s = 85;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='n')||(LA12_68>='p' && LA12_68<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='n') ) {s = 105;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='m')||(LA12_85>='o' && LA12_85<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105=='-') ) {s = 126;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<=',')||(LA12_105>='.' && LA12_105<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='i') ) {s = 84;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='h')||(LA12_67>='j' && LA12_67<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='p') ) {s = 145;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<='o')||(LA12_126>='q' && LA12_126<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='o') ) {s = 157;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='n')||(LA12_145>='p' && LA12_145<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_157 = input.LA(1);

                        s = -1;
                        if ( (LA12_157=='i') ) {s = 167;}

                        else if ( ((LA12_157>='\u0000' && LA12_157<='h')||(LA12_157>='j' && LA12_157<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='\"') ) {s = 103;}

                        else if ( (LA12_84=='-') ) {s = 104;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='!')||(LA12_84>='#' && LA12_84<=',')||(LA12_84>='.' && LA12_84<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='n') ) {s = 175;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='m')||(LA12_167>='o' && LA12_167<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='t') ) {s = 183;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='s')||(LA12_175>='u' && LA12_175<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_183 = input.LA(1);

                        s = -1;
                        if ( (LA12_183=='e') ) {s = 190;}

                        else if ( ((LA12_183>='\u0000' && LA12_183<='d')||(LA12_183>='f' && LA12_183<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='r') ) {s = 195;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='q')||(LA12_190>='s' && LA12_190<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='\"') ) {s = 200;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='!')||(LA12_195>='#' && LA12_195<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_86 = input.LA(1);

                        s = -1;
                        if ( (LA12_86=='a') ) {s = 106;}

                        else if ( ((LA12_86>='\u0000' && LA12_86<='`')||(LA12_86>='b' && LA12_86<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='t') ) {s = 127;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='s')||(LA12_106>='u' && LA12_106<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='i') ) {s = 146;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='h')||(LA12_127>='j' && LA12_127<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_146 = input.LA(1);

                        s = -1;
                        if ( (LA12_146=='v') ) {s = 158;}

                        else if ( ((LA12_146>='\u0000' && LA12_146<='u')||(LA12_146>='w' && LA12_146<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_158 = input.LA(1);

                        s = -1;
                        if ( (LA12_158=='e') ) {s = 168;}

                        else if ( ((LA12_158>='\u0000' && LA12_158<='d')||(LA12_158>='f' && LA12_158<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_168 = input.LA(1);

                        s = -1;
                        if ( (LA12_168=='-') ) {s = 176;}

                        else if ( ((LA12_168>='\u0000' && LA12_168<=',')||(LA12_168>='.' && LA12_168<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='j') ) {s = 184;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='i')||(LA12_176>='k' && LA12_176<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_184 = input.LA(1);

                        s = -1;
                        if ( (LA12_184=='s') ) {s = 191;}

                        else if ( ((LA12_184>='\u0000' && LA12_184<='r')||(LA12_184>='t' && LA12_184<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_191 = input.LA(1);

                        s = -1;
                        if ( (LA12_191=='o') ) {s = 196;}

                        else if ( ((LA12_191>='\u0000' && LA12_191<='n')||(LA12_191>='p' && LA12_191<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_196 = input.LA(1);

                        s = -1;
                        if ( (LA12_196=='n') ) {s = 201;}

                        else if ( ((LA12_196>='\u0000' && LA12_196<='m')||(LA12_196>='o' && LA12_196<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_201 = input.LA(1);

                        s = -1;
                        if ( (LA12_201=='-') ) {s = 206;}

                        else if ( ((LA12_201>='\u0000' && LA12_201<=',')||(LA12_201>='.' && LA12_201<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_206 = input.LA(1);

                        s = -1;
                        if ( (LA12_206=='p') ) {s = 209;}

                        else if ( ((LA12_206>='\u0000' && LA12_206<='o')||(LA12_206>='q' && LA12_206<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_209 = input.LA(1);

                        s = -1;
                        if ( (LA12_209=='o') ) {s = 210;}

                        else if ( ((LA12_209>='\u0000' && LA12_209<='n')||(LA12_209>='p' && LA12_209<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_210 = input.LA(1);

                        s = -1;
                        if ( (LA12_210=='i') ) {s = 211;}

                        else if ( ((LA12_210>='\u0000' && LA12_210<='h')||(LA12_210>='j' && LA12_210<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_211 = input.LA(1);

                        s = -1;
                        if ( (LA12_211=='n') ) {s = 212;}

                        else if ( ((LA12_211>='\u0000' && LA12_211<='m')||(LA12_211>='o' && LA12_211<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_212 = input.LA(1);

                        s = -1;
                        if ( (LA12_212=='t') ) {s = 213;}

                        else if ( ((LA12_212>='\u0000' && LA12_212<='s')||(LA12_212>='u' && LA12_212<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_213 = input.LA(1);

                        s = -1;
                        if ( (LA12_213=='e') ) {s = 214;}

                        else if ( ((LA12_213>='\u0000' && LA12_213<='d')||(LA12_213>='f' && LA12_213<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_214 = input.LA(1);

                        s = -1;
                        if ( (LA12_214=='r') ) {s = 215;}

                        else if ( ((LA12_214>='\u0000' && LA12_214<='q')||(LA12_214>='s' && LA12_214<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_215 = input.LA(1);

                        s = -1;
                        if ( (LA12_215=='\"') ) {s = 216;}

                        else if ( ((LA12_215>='\u0000' && LA12_215<='!')||(LA12_215>='#' && LA12_215<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='a') ) {s = 60;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='`')||(LA12_40>='b' && LA12_40<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='t') ) {s = 77;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='s')||(LA12_60>='u' && LA12_60<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='e') ) {s = 94;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='d')||(LA12_77>='f' && LA12_77<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='e') ) {s = 107;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='d')||(LA12_87>='f' && LA12_87<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_107 = input.LA(1);

                        s = -1;
                        if ( (LA12_107=='x') ) {s = 128;}

                        else if ( ((LA12_107>='\u0000' && LA12_107<='w')||(LA12_107>='y' && LA12_107<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_94 = input.LA(1);

                        s = -1;
                        if ( (LA12_94=='-') ) {s = 113;}

                        else if ( (LA12_94=='\"') ) {s = 114;}

                        else if ( ((LA12_94>='\u0000' && LA12_94<='!')||(LA12_94>='#' && LA12_94<=',')||(LA12_94>='.' && LA12_94<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='\"') ) {s = 147;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='!')||(LA12_128>='#' && LA12_128<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 48;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='v') ) {s = 81;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='u')||(LA12_64>='w' && LA12_64<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='4') ) {s = 98;}

                        else if ( (LA12_81=='6') ) {s = 99;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='3')||LA12_81=='5'||(LA12_81>='7' && LA12_81<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='.') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='{') ) {s = 3;}

                        else if ( (LA12_0=='}') ) {s = 4;}

                        else if ( (LA12_0=='w') ) {s = 5;}

                        else if ( (LA12_0==',') ) {s = 6;}

                        else if ( (LA12_0==';') ) {s = 7;}

                        else if ( (LA12_0=='S') ) {s = 8;}

                        else if ( (LA12_0=='n') ) {s = 9;}

                        else if ( (LA12_0=='l') ) {s = 10;}

                        else if ( (LA12_0=='p') ) {s = 11;}

                        else if ( (LA12_0=='f') ) {s = 12;}

                        else if ( (LA12_0=='-') ) {s = 13;}

                        else if ( (LA12_0=='[') ) {s = 14;}

                        else if ( (LA12_0==']') ) {s = 15;}

                        else if ( (LA12_0=='\"') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( ((LA12_0>='A' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='o'||(LA12_0>='q' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='i') ) {s = 82;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='h')||(LA12_65>='j' && LA12_65<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA12_82 = input.LA(1);

                        s = -1;
                        if ( (LA12_82=='\"') ) {s = 100;}

                        else if ( (LA12_82=='-') ) {s = 101;}

                        else if ( ((LA12_82>='\u0000' && LA12_82<='!')||(LA12_82>='#' && LA12_82<=',')||(LA12_82>='.' && LA12_82<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='r') ) {s = 124;}

                        else if ( (LA12_104=='t') ) {s = 125;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='q')||LA12_104=='s'||(LA12_104>='u' && LA12_104<='\uFFFF')) ) {s = 48;}

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