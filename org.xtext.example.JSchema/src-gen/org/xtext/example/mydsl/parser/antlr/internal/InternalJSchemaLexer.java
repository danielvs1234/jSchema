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

    public InternalJSchemaLexer() {;} 
    public InternalJSchemaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJSchemaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJSchema.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:14:7: ( ',' )
            // InternalJSchema.g:14:9: ','
            {
            match(','); 

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
            // InternalJSchema.g:15:7: ( '}' )
            // InternalJSchema.g:15:9: '}'
            {
            match('}'); 

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
            // InternalJSchema.g:16:7: ( 'with' )
            // InternalJSchema.g:16:9: 'with'
            {
            match("with"); 


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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:20:7: ( 'root' )
            // InternalJSchema.g:20:9: 'root'
            {
            match("root"); 


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
            // InternalJSchema.g:21:7: ( 'length' )
            // InternalJSchema.g:21:9: 'length'
            {
            match("length"); 


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
            // InternalJSchema.g:22:7: ( 'pattern' )
            // InternalJSchema.g:22:9: 'pattern'
            {
            match("pattern"); 


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
            // InternalJSchema.g:23:7: ( 'format' )
            // InternalJSchema.g:23:9: 'format'
            {
            match("format"); 


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
            // InternalJSchema.g:24:7: ( '-' )
            // InternalJSchema.g:24:9: '-'
            {
            match('-'); 

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
            // InternalJSchema.g:25:7: ( '[' )
            // InternalJSchema.g:25:9: '['
            {
            match('['); 

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
            // InternalJSchema.g:26:7: ( ']' )
            // InternalJSchema.g:26:9: ']'
            {
            match(']'); 

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
            // InternalJSchema.g:27:7: ( 'Int' )
            // InternalJSchema.g:27:9: 'Int'
            {
            match("Int"); 


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
            // InternalJSchema.g:28:7: ( 'float' )
            // InternalJSchema.g:28:9: 'float'
            {
            match("float"); 


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
            // InternalJSchema.g:29:7: ( 'double' )
            // InternalJSchema.g:29:9: 'double'
            {
            match("double"); 


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
            // InternalJSchema.g:30:7: ( '\"date-time\"' )
            // InternalJSchema.g:30:9: '\"date-time\"'
            {
            match("\"date-time\""); 


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
            // InternalJSchema.g:31:7: ( '\"time\"' )
            // InternalJSchema.g:31:9: '\"time\"'
            {
            match("\"time\""); 


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
            // InternalJSchema.g:32:7: ( '\"date\"' )
            // InternalJSchema.g:32:9: '\"date\"'
            {
            match("\"date\""); 


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
            // InternalJSchema.g:33:7: ( '\"email\"' )
            // InternalJSchema.g:33:9: '\"email\"'
            {
            match("\"email\""); 


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
            // InternalJSchema.g:34:7: ( '\"idn-email\"' )
            // InternalJSchema.g:34:9: '\"idn-email\"'
            {
            match("\"idn-email\""); 


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
            // InternalJSchema.g:35:7: ( '\"hostname\"' )
            // InternalJSchema.g:35:9: '\"hostname\"'
            {
            match("\"hostname\""); 


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
            // InternalJSchema.g:36:7: ( '\"ipv4\"' )
            // InternalJSchema.g:36:9: '\"ipv4\"'
            {
            match("\"ipv4\""); 


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
            // InternalJSchema.g:37:7: ( '\"ipv6\"' )
            // InternalJSchema.g:37:9: '\"ipv6\"'
            {
            match("\"ipv6\""); 


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
            // InternalJSchema.g:38:7: ( '\"uri\"' )
            // InternalJSchema.g:38:9: '\"uri\"'
            {
            match("\"uri\""); 


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
            // InternalJSchema.g:39:7: ( '\"uri-reference\"' )
            // InternalJSchema.g:39:9: '\"uri-reference\"'
            {
            match("\"uri-reference\""); 


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
            // InternalJSchema.g:40:7: ( '\"iri\"' )
            // InternalJSchema.g:40:9: '\"iri\"'
            {
            match("\"iri\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:41:7: ( '\"iri-reference\"' )
            // InternalJSchema.g:41:9: '\"iri-reference\"'
            {
            match("\"iri-reference\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:42:7: ( '\"uri-template\"' )
            // InternalJSchema.g:42:9: '\"uri-template\"'
            {
            match("\"uri-template\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:43:7: ( '\"json-pointer\"' )
            // InternalJSchema.g:43:9: '\"json-pointer\"'
            {
            match("\"json-pointer\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:44:7: ( '\"relative-json-pointer\"' )
            // InternalJSchema.g:44:9: '\"relative-json-pointer\"'
            {
            match("\"relative-json-pointer\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:45:7: ( '\"regex\"' )
            // InternalJSchema.g:45:9: '\"regex\"'
            {
            match("\"regex\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:1123:11: ( 'null' )
            // InternalJSchema.g:1123:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:1125:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJSchema.g:1125:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJSchema.g:1125:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSchema.g:1125:11: '^'
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

            // InternalJSchema.g:1125:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalJSchema.g:1127:10: ( ( '0' .. '9' )+ )
            // InternalJSchema.g:1127:12: ( '0' .. '9' )+
            {
            // InternalJSchema.g:1127:12: ( '0' .. '9' )+
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
            	    // InternalJSchema.g:1127:13: '0' .. '9'
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
            // InternalJSchema.g:1129:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJSchema.g:1129:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJSchema.g:1129:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalJSchema.g:1129:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJSchema.g:1129:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalJSchema.g:1129:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:1129:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalJSchema.g:1129:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJSchema.g:1129:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalJSchema.g:1129:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:1129:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalJSchema.g:1131:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJSchema.g:1131:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJSchema.g:1131:24: ( options {greedy=false; } : . )*
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
            	    // InternalJSchema.g:1131:52: .
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
            // InternalJSchema.g:1133:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJSchema.g:1133:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJSchema.g:1133:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJSchema.g:1133:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalJSchema.g:1133:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:1133:41: ( '\\r' )? '\\n'
                    {
                    // InternalJSchema.g:1133:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalJSchema.g:1133:41: '\\r'
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
            // InternalJSchema.g:1135:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJSchema.g:1135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJSchema.g:1135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalJSchema.g:1137:16: ( . )
            // InternalJSchema.g:1137:18: .
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
        // InternalJSchema.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=43;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalJSchema.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalJSchema.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalJSchema.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalJSchema.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalJSchema.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalJSchema.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalJSchema.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalJSchema.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalJSchema.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalJSchema.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalJSchema.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalJSchema.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalJSchema.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalJSchema.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalJSchema.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalJSchema.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalJSchema.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalJSchema.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalJSchema.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalJSchema.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalJSchema.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalJSchema.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalJSchema.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalJSchema.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalJSchema.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalJSchema.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalJSchema.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalJSchema.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalJSchema.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalJSchema.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalJSchema.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalJSchema.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalJSchema.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalJSchema.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalJSchema.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalJSchema.g:1:220: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 37 :
                // InternalJSchema.g:1:230: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalJSchema.g:1:238: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalJSchema.g:1:247: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalJSchema.g:1:259: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalJSchema.g:1:275: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalJSchema.g:1:291: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalJSchema.g:1:299: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\35\3\uffff\1\35\1\uffff\6\35\3\uffff\2\35\2\32\2\uffff\2\32\3\uffff\1\35\4\uffff\1\35\1\uffff\7\35\3\uffff\2\35\15\uffff\3\35\1\125\6\35\1\134\1\35\12\uffff\1\35\1\152\1\35\1\uffff\1\154\1\155\4\35\1\uffff\1\35\13\uffff\1\35\1\uffff\1\35\2\uffff\3\35\1\u0086\1\35\16\uffff\1\35\1\u0099\1\u009a\1\35\1\u009c\1\uffff\1\u009d\20\uffff\1\35\2\uffff\1\u00ad\20\uffff\1\u00b8\105\uffff";
    static final String DFA12_eofS =
        "\u00f2\uffff";
    static final String DFA12_minS =
        "\1\0\1\uffff\1\156\3\uffff\1\151\1\uffff\1\164\1\165\1\157\1\145\1\141\1\154\3\uffff\1\156\1\157\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\143\4\uffff\1\164\1\uffff\1\162\1\154\1\157\1\156\1\164\1\162\1\157\3\uffff\1\164\1\165\10\0\5\uffff\1\154\1\150\1\151\1\60\1\154\1\164\1\147\1\164\1\155\1\141\1\60\1\142\12\0\1\165\1\60\1\156\1\uffff\2\60\1\164\1\145\1\141\1\164\1\uffff\1\154\13\0\1\144\1\uffff\1\147\2\uffff\1\150\1\162\1\164\1\60\1\145\6\0\1\uffff\2\0\1\uffff\4\0\1\145\2\60\1\156\1\60\1\uffff\1\60\1\0\2\uffff\2\0\3\uffff\2\0\1\uffff\5\0\1\163\2\uffff\1\60\2\uffff\1\0\3\uffff\1\0\2\uffff\6\0\1\uffff\1\60\1\uffff\1\0\1\uffff\7\0\2\uffff\13\0\1\uffff\4\0\2\uffff\1\0\1\uffff\4\0\2\uffff\14\0\2\uffff\1\0\4\uffff\1\0\2\uffff\7\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\uffff\1\156\3\uffff\1\151\1\uffff\1\164\1\165\1\157\1\145\1\141\1\157\3\uffff\1\156\1\157\1\uffff\1\172\2\uffff\1\uffff\1\57\3\uffff\1\143\4\uffff\1\164\1\uffff\1\162\1\155\1\157\1\156\1\164\1\162\1\157\3\uffff\1\164\1\165\10\uffff\5\uffff\1\154\1\150\1\151\1\172\1\154\1\164\1\147\1\164\1\155\1\141\1\172\1\142\12\uffff\1\165\1\172\1\156\1\uffff\2\172\1\164\1\145\1\141\1\164\1\uffff\1\154\13\uffff\1\144\1\uffff\1\147\2\uffff\1\150\1\162\1\164\1\172\1\145\6\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\145\2\172\1\156\1\172\1\uffff\1\172\1\uffff\2\uffff\2\uffff\3\uffff\2\uffff\1\uffff\5\uffff\1\163\2\uffff\1\172\2\uffff\1\uffff\3\uffff\1\uffff\2\uffff\6\uffff\1\uffff\1\172\1\uffff\1\uffff\1\uffff\7\uffff\2\uffff\13\uffff\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff\4\uffff\2\uffff\14\uffff\2\uffff\1\uffff\4\uffff\1\uffff\2\uffff\7\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\uffff\1\7\6\uffff\1\16\1\17\1\20\4\uffff\1\45\1\46\2\uffff\1\52\1\53\1\1\1\uffff\1\45\1\3\1\4\1\5\1\uffff\1\7\7\uffff\1\16\1\17\1\20\12\uffff\1\47\1\46\1\50\1\51\1\52\31\uffff\1\11\6\uffff\1\21\15\uffff\1\6\1\uffff\1\44\1\12\13\uffff\1\36\2\uffff\1\34\11\uffff\1\22\2\uffff\1\26\1\25\2\uffff\1\32\1\33\1\36\2\uffff\1\34\6\uffff\1\10\1\13\1\uffff\1\15\1\23\1\uffff\1\26\1\25\1\27\1\uffff\1\32\1\33\6\uffff\1\43\1\uffff\1\14\1\uffff\1\27\7\uffff\1\43\1\2\13\uffff\1\31\4\uffff\1\24\1\30\1\uffff\1\31\4\uffff\1\24\1\30\14\uffff\1\40\1\41\1\uffff\1\37\1\35\1\40\1\41\1\uffff\1\37\1\35\7\uffff\2\42";
    static final String DFA12_specialS =
        "\1\52\22\uffff\1\70\3\uffff\1\65\27\uffff\1\53\1\77\1\103\1\62\1\120\1\54\1\10\1\131\21\uffff\1\55\1\100\1\104\1\110\1\63\1\66\1\121\1\56\1\11\1\132\14\uffff\1\57\1\101\1\105\1\111\1\64\1\67\1\122\1\60\1\12\1\24\1\47\12\uffff\1\61\1\102\1\106\1\112\1\130\1\133\1\uffff\1\145\1\123\1\uffff\1\71\1\13\1\25\1\50\7\uffff\1\72\2\uffff\1\107\1\113\3\uffff\1\146\1\124\1\uffff\1\134\1\0\1\14\1\26\1\51\6\uffff\1\73\3\uffff\1\114\2\uffff\1\147\1\125\1\135\1\1\1\15\1\27\3\uffff\1\74\1\uffff\1\115\1\150\1\126\1\136\1\2\1\16\1\30\2\uffff\1\75\1\116\1\151\1\127\1\137\1\3\1\17\1\31\1\76\1\117\1\152\1\uffff\1\140\1\4\1\20\1\32\2\uffff\1\153\1\uffff\1\141\1\5\1\21\1\33\2\uffff\1\154\1\142\1\6\1\22\1\34\1\155\1\143\1\7\1\23\1\35\1\156\1\144\2\uffff\1\36\4\uffff\1\37\2\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\23\4\32\1\27\4\32\1\4\1\16\1\1\1\30\12\26\1\32\1\7\5\32\10\25\1\21\11\25\1\10\7\25\1\17\1\32\1\20\1\24\1\25\1\32\3\25\1\22\1\25\1\15\2\25\1\2\2\25\1\13\1\25\1\11\1\25\1\14\1\25\1\12\4\25\1\6\3\25\1\3\1\32\1\5\uff82\32",
            "",
            "\1\34",
            "",
            "",
            "",
            "\1\41",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\2\uffff\1\50",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\144\67\1\57\1\61\2\67\1\63\1\62\1\65\7\67\1\66\1\67\1\60\1\64\uff8a\67",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\67",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\100\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\141\67\1\110\uff9e\67",
            "\151\67\1\111\uff96\67",
            "\155\67\1\112\uff92\67",
            "\144\67\1\113\13\67\1\114\1\67\1\115\uff8d\67",
            "\157\67\1\116\uff90\67",
            "\162\67\1\117\uff8d\67",
            "\163\67\1\120\uff8c\67",
            "\145\67\1\121\uff9a\67",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\135",
            "\164\67\1\136\uff8b\67",
            "\155\67\1\137\uff92\67",
            "\141\67\1\140\uff9e\67",
            "\156\67\1\141\uff91\67",
            "\166\67\1\142\uff89\67",
            "\151\67\1\143\uff96\67",
            "\163\67\1\144\uff8c\67",
            "\151\67\1\145\uff96\67",
            "\157\67\1\146\uff90\67",
            "\147\67\1\150\4\67\1\147\uff93\67",
            "\1\151",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\153",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\145\67\1\163\uff9a\67",
            "\145\67\1\164\uff9a\67",
            "\151\67\1\165\uff96\67",
            "\55\67\1\166\uffd2\67",
            "\64\67\1\167\1\67\1\170\uffc9\67",
            "\42\67\1\171\12\67\1\172\uffd2\67",
            "\164\67\1\173\uff8b\67",
            "\42\67\1\174\12\67\1\175\uffd2\67",
            "\156\67\1\176\uff91\67",
            "\141\67\1\177\uff9e\67",
            "\145\67\1\u0080\uff9a\67",
            "\1\u0081",
            "",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0087",
            "\42\67\1\u0089\12\67\1\u0088\uffd2\67",
            "\42\67\1\u008a\uffdd\67",
            "\154\67\1\u008b\uff93\67",
            "\145\67\1\u008c\uff9a\67",
            "\42\67\1\u008d\uffdd\67",
            "\42\67\1\u008e\uffdd\67",
            "",
            "\162\67\1\u0090\uff8d\67",
            "\156\67\1\u0091\uff91\67",
            "",
            "\162\67\1\u0093\1\67\1\u0094\uff8b\67",
            "\55\67\1\u0095\uffd2\67",
            "\164\67\1\u0096\uff8b\67",
            "\170\67\1\u0097\uff87\67",
            "\1\u0098",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u009b",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\164\67\1\u009e\uff8b\67",
            "",
            "",
            "\42\67\1\u00a1\uffdd\67",
            "\155\67\1\u00a2\uff92\67",
            "",
            "",
            "",
            "\145\67\1\u00a5\uff9a\67",
            "\141\67\1\u00a6\uff9e\67",
            "",
            "\145\67\1\u00a7\uff9a\67",
            "\145\67\1\u00a8\uff9a\67",
            "\160\67\1\u00a9\uff8f\67",
            "\151\67\1\u00aa\uff96\67",
            "\42\67\1\u00ab\uffdd\67",
            "\1\u00ac",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\151\67\1\u00ae\uff96\67",
            "",
            "",
            "",
            "\141\67\1\u00b0\uff9e\67",
            "",
            "",
            "\146\67\1\u00b1\uff99\67",
            "\155\67\1\u00b2\uff92\67",
            "\146\67\1\u00b3\uff99\67",
            "\155\67\1\u00b4\uff92\67",
            "\157\67\1\u00b5\uff90\67",
            "\166\67\1\u00b6\uff89\67",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\155\67\1\u00b9\uff92\67",
            "",
            "\151\67\1\u00ba\uff96\67",
            "\145\67\1\u00bb\uff9a\67",
            "\145\67\1\u00bc\uff9a\67",
            "\145\67\1\u00bd\uff9a\67",
            "\160\67\1\u00be\uff8f\67",
            "\151\67\1\u00bf\uff96\67",
            "\145\67\1\u00c0\uff9a\67",
            "",
            "",
            "\145\67\1\u00c1\uff9a\67",
            "\154\67\1\u00c2\uff93\67",
            "\162\67\1\u00c3\uff8d\67",
            "\42\67\1\u00c4\uffdd\67",
            "\162\67\1\u00c5\uff8d\67",
            "\154\67\1\u00c6\uff93\67",
            "\156\67\1\u00c7\uff91\67",
            "\55\67\1\u00c8\uffd2\67",
            "\42\67\1\u00c9\uffdd\67",
            "\42\67\1\u00ca\uffdd\67",
            "\145\67\1\u00cb\uff9a\67",
            "",
            "\145\67\1\u00cd\uff9a\67",
            "\141\67\1\u00ce\uff9e\67",
            "\164\67\1\u00cf\uff8b\67",
            "\152\67\1\u00d0\uff95\67",
            "",
            "",
            "\156\67\1\u00d3\uff91\67",
            "",
            "\156\67\1\u00d4\uff91\67",
            "\164\67\1\u00d5\uff8b\67",
            "\145\67\1\u00d6\uff9a\67",
            "\163\67\1\u00d7\uff8c\67",
            "",
            "",
            "\143\67\1\u00d8\uff9c\67",
            "\143\67\1\u00d9\uff9c\67",
            "\145\67\1\u00da\uff9a\67",
            "\162\67\1\u00db\uff8d\67",
            "\157\67\1\u00dc\uff90\67",
            "\145\67\1\u00dd\uff9a\67",
            "\145\67\1\u00de\uff9a\67",
            "\42\67\1\u00df\uffdd\67",
            "\42\67\1\u00e0\uffdd\67",
            "\156\67\1\u00e1\uff91\67",
            "\42\67\1\u00e2\uffdd\67",
            "\42\67\1\u00e3\uffdd\67",
            "",
            "",
            "\55\67\1\u00e6\uffd2\67",
            "",
            "",
            "",
            "",
            "\160\67\1\u00e9\uff8f\67",
            "",
            "",
            "\157\67\1\u00ea\uff90\67",
            "\151\67\1\u00eb\uff96\67",
            "\156\67\1\u00ec\uff91\67",
            "\164\67\1\u00ed\uff8b\67",
            "\145\67\1\u00ee\uff9a\67",
            "\162\67\1\u00ef\uff8d\67",
            "\42\67\1\u00f0\uffdd\67",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_NULL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_148 = input.LA(1);

                        s = -1;
                        if ( (LA12_148=='e') ) {s = 168;}

                        else if ( ((LA12_148>='\u0000' && LA12_148<='d')||(LA12_148>='f' && LA12_148<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_168 = input.LA(1);

                        s = -1;
                        if ( (LA12_168=='m') ) {s = 180;}

                        else if ( ((LA12_168>='\u0000' && LA12_168<='l')||(LA12_168>='n' && LA12_168<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_180 = input.LA(1);

                        s = -1;
                        if ( (LA12_180=='p') ) {s = 190;}

                        else if ( ((LA12_180>='\u0000' && LA12_180<='o')||(LA12_180>='q' && LA12_180<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='l') ) {s = 198;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='k')||(LA12_190>='m' && LA12_190<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='a') ) {s = 206;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='`')||(LA12_198>='b' && LA12_198<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_206 = input.LA(1);

                        s = -1;
                        if ( (LA12_206=='t') ) {s = 213;}

                        else if ( ((LA12_206>='\u0000' && LA12_206<='s')||(LA12_206>='u' && LA12_206<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_213 = input.LA(1);

                        s = -1;
                        if ( (LA12_213=='e') ) {s = 218;}

                        else if ( ((LA12_213>='\u0000' && LA12_213<='d')||(LA12_213>='f' && LA12_213<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_218 = input.LA(1);

                        s = -1;
                        if ( (LA12_218=='\"') ) {s = 223;}

                        else if ( ((LA12_218>='\u0000' && LA12_218<='!')||(LA12_218>='#' && LA12_218<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='s') ) {s = 80;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='r')||(LA12_53>='t' && LA12_53<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='o') ) {s = 102;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='n')||(LA12_80>='p' && LA12_80<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='n') ) {s = 126;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='m')||(LA12_102>='o' && LA12_102<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_126 = input.LA(1);

                        s = -1;
                        if ( (LA12_126=='-') ) {s = 149;}

                        else if ( ((LA12_126>='\u0000' && LA12_126<=',')||(LA12_126>='.' && LA12_126<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_149 = input.LA(1);

                        s = -1;
                        if ( (LA12_149=='p') ) {s = 169;}

                        else if ( ((LA12_149>='\u0000' && LA12_149<='o')||(LA12_149>='q' && LA12_149<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_169 = input.LA(1);

                        s = -1;
                        if ( (LA12_169=='o') ) {s = 181;}

                        else if ( ((LA12_169>='\u0000' && LA12_169<='n')||(LA12_169>='p' && LA12_169<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_181 = input.LA(1);

                        s = -1;
                        if ( (LA12_181=='i') ) {s = 191;}

                        else if ( ((LA12_181>='\u0000' && LA12_181<='h')||(LA12_181>='j' && LA12_181<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_191 = input.LA(1);

                        s = -1;
                        if ( (LA12_191=='n') ) {s = 199;}

                        else if ( ((LA12_191>='\u0000' && LA12_191<='m')||(LA12_191>='o' && LA12_191<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_199 = input.LA(1);

                        s = -1;
                        if ( (LA12_199=='t') ) {s = 207;}

                        else if ( ((LA12_199>='\u0000' && LA12_199<='s')||(LA12_199>='u' && LA12_199<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_207 = input.LA(1);

                        s = -1;
                        if ( (LA12_207=='e') ) {s = 214;}

                        else if ( ((LA12_207>='\u0000' && LA12_207<='d')||(LA12_207>='f' && LA12_207<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_214 = input.LA(1);

                        s = -1;
                        if ( (LA12_214=='r') ) {s = 219;}

                        else if ( ((LA12_214>='\u0000' && LA12_214<='q')||(LA12_214>='s' && LA12_214<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_219 = input.LA(1);

                        s = -1;
                        if ( (LA12_219=='\"') ) {s = 224;}

                        else if ( ((LA12_219>='\u0000' && LA12_219<='!')||(LA12_219>='#' && LA12_219<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_103 = input.LA(1);

                        s = -1;
                        if ( (LA12_103=='a') ) {s = 127;}

                        else if ( ((LA12_103>='\u0000' && LA12_103<='`')||(LA12_103>='b' && LA12_103<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='t') ) {s = 150;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='s')||(LA12_127>='u' && LA12_127<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='i') ) {s = 170;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='h')||(LA12_150>='j' && LA12_150<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_170 = input.LA(1);

                        s = -1;
                        if ( (LA12_170=='v') ) {s = 182;}

                        else if ( ((LA12_170>='\u0000' && LA12_170<='u')||(LA12_170>='w' && LA12_170<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_182 = input.LA(1);

                        s = -1;
                        if ( (LA12_182=='e') ) {s = 192;}

                        else if ( ((LA12_182>='\u0000' && LA12_182<='d')||(LA12_182>='f' && LA12_182<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_192 = input.LA(1);

                        s = -1;
                        if ( (LA12_192=='-') ) {s = 200;}

                        else if ( ((LA12_192>='\u0000' && LA12_192<=',')||(LA12_192>='.' && LA12_192<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_200 = input.LA(1);

                        s = -1;
                        if ( (LA12_200=='j') ) {s = 208;}

                        else if ( ((LA12_200>='\u0000' && LA12_200<='i')||(LA12_200>='k' && LA12_200<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_208 = input.LA(1);

                        s = -1;
                        if ( (LA12_208=='s') ) {s = 215;}

                        else if ( ((LA12_208>='\u0000' && LA12_208<='r')||(LA12_208>='t' && LA12_208<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_215 = input.LA(1);

                        s = -1;
                        if ( (LA12_215=='o') ) {s = 220;}

                        else if ( ((LA12_215>='\u0000' && LA12_215<='n')||(LA12_215>='p' && LA12_215<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_220 = input.LA(1);

                        s = -1;
                        if ( (LA12_220=='n') ) {s = 225;}

                        else if ( ((LA12_220>='\u0000' && LA12_220<='m')||(LA12_220>='o' && LA12_220<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_225 = input.LA(1);

                        s = -1;
                        if ( (LA12_225=='-') ) {s = 230;}

                        else if ( ((LA12_225>='\u0000' && LA12_225<=',')||(LA12_225>='.' && LA12_225<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_230 = input.LA(1);

                        s = -1;
                        if ( (LA12_230=='p') ) {s = 233;}

                        else if ( ((LA12_230>='\u0000' && LA12_230<='o')||(LA12_230>='q' && LA12_230<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_233 = input.LA(1);

                        s = -1;
                        if ( (LA12_233=='o') ) {s = 234;}

                        else if ( ((LA12_233>='\u0000' && LA12_233<='n')||(LA12_233>='p' && LA12_233<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_234 = input.LA(1);

                        s = -1;
                        if ( (LA12_234=='i') ) {s = 235;}

                        else if ( ((LA12_234>='\u0000' && LA12_234<='h')||(LA12_234>='j' && LA12_234<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_235 = input.LA(1);

                        s = -1;
                        if ( (LA12_235=='n') ) {s = 236;}

                        else if ( ((LA12_235>='\u0000' && LA12_235<='m')||(LA12_235>='o' && LA12_235<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_236 = input.LA(1);

                        s = -1;
                        if ( (LA12_236=='t') ) {s = 237;}

                        else if ( ((LA12_236>='\u0000' && LA12_236<='s')||(LA12_236>='u' && LA12_236<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_237 = input.LA(1);

                        s = -1;
                        if ( (LA12_237=='e') ) {s = 238;}

                        else if ( ((LA12_237>='\u0000' && LA12_237<='d')||(LA12_237>='f' && LA12_237<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_238 = input.LA(1);

                        s = -1;
                        if ( (LA12_238=='r') ) {s = 239;}

                        else if ( ((LA12_238>='\u0000' && LA12_238<='q')||(LA12_238>='s' && LA12_238<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_239 = input.LA(1);

                        s = -1;
                        if ( (LA12_239=='\"') ) {s = 240;}

                        else if ( ((LA12_239>='\u0000' && LA12_239<='!')||(LA12_239>='#' && LA12_239<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='e') ) {s = 128;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='d')||(LA12_104>='f' && LA12_104<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_128 = input.LA(1);

                        s = -1;
                        if ( (LA12_128=='x') ) {s = 151;}

                        else if ( ((LA12_128>='\u0000' && LA12_128<='w')||(LA12_128>='y' && LA12_128<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_151 = input.LA(1);

                        s = -1;
                        if ( (LA12_151=='\"') ) {s = 171;}

                        else if ( ((LA12_151>='\u0000' && LA12_151<='!')||(LA12_151>='#' && LA12_151<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='.') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='{') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='w') ) {s = 6;}

                        else if ( (LA12_0==';') ) {s = 7;}

                        else if ( (LA12_0=='S') ) {s = 8;}

                        else if ( (LA12_0=='n') ) {s = 9;}

                        else if ( (LA12_0=='r') ) {s = 10;}

                        else if ( (LA12_0=='l') ) {s = 11;}

                        else if ( (LA12_0=='p') ) {s = 12;}

                        else if ( (LA12_0=='f') ) {s = 13;}

                        else if ( (LA12_0=='-') ) {s = 14;}

                        else if ( (LA12_0=='[') ) {s = 15;}

                        else if ( (LA12_0==']') ) {s = 16;}

                        else if ( (LA12_0=='I') ) {s = 17;}

                        else if ( (LA12_0=='d') ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='o'||LA12_0=='q'||(LA12_0>='s' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 25;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='a') ) {s = 72;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='`')||(LA12_47>='b' && LA12_47<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_52 = input.LA(1);

                        s = -1;
                        if ( (LA12_52=='r') ) {s = 79;}

                        else if ( ((LA12_52>='\u0000' && LA12_52<='q')||(LA12_52>='s' && LA12_52<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='t') ) {s = 94;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='s')||(LA12_72>='u' && LA12_72<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='i') ) {s = 101;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='h')||(LA12_79>='j' && LA12_79<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_94 = input.LA(1);

                        s = -1;
                        if ( (LA12_94=='e') ) {s = 115;}

                        else if ( ((LA12_94>='\u0000' && LA12_94<='d')||(LA12_94>='f' && LA12_94<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101=='\"') ) {s = 124;}

                        else if ( (LA12_101=='-') ) {s = 125;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='!')||(LA12_101>='#' && LA12_101<=',')||(LA12_101>='.' && LA12_101<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115=='-') ) {s = 136;}

                        else if ( (LA12_115=='\"') ) {s = 137;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='!')||(LA12_115>='#' && LA12_115<=',')||(LA12_115>='.' && LA12_115<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( (LA12_50=='d') ) {s = 75;}

                        else if ( (LA12_50=='p') ) {s = 76;}

                        else if ( (LA12_50=='r') ) {s = 77;}

                        else if ( ((LA12_50>='\u0000' && LA12_50<='c')||(LA12_50>='e' && LA12_50<='o')||LA12_50=='q'||(LA12_50>='s' && LA12_50<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='v') ) {s = 98;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='u')||(LA12_76>='w' && LA12_76<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='4') ) {s = 119;}

                        else if ( (LA12_98=='6') ) {s = 120;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='3')||LA12_98=='5'||(LA12_98>='7' && LA12_98<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 55;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='i') ) {s = 99;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='h')||(LA12_77>='j' && LA12_77<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='\"') ) {s = 121;}

                        else if ( (LA12_99=='-') ) {s = 122;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='!')||(LA12_99>='#' && LA12_99<=',')||(LA12_99>='.' && LA12_99<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='d') ) {s = 47;}

                        else if ( (LA12_19=='t') ) {s = 48;}

                        else if ( (LA12_19=='e') ) {s = 49;}

                        else if ( (LA12_19=='i') ) {s = 50;}

                        else if ( (LA12_19=='h') ) {s = 51;}

                        else if ( (LA12_19=='u') ) {s = 52;}

                        else if ( (LA12_19=='j') ) {s = 53;}

                        else if ( (LA12_19=='r') ) {s = 54;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='c')||(LA12_19>='f' && LA12_19<='g')||(LA12_19>='k' && LA12_19<='q')||LA12_19=='s'||(LA12_19>='v' && LA12_19<='\uFFFF')) ) {s = 55;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='r') ) {s = 147;}

                        else if ( (LA12_125=='t') ) {s = 148;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='q')||LA12_125=='s'||(LA12_125>='u' && LA12_125<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='t') ) {s = 158;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='s')||(LA12_136>='u' && LA12_136<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_158 = input.LA(1);

                        s = -1;
                        if ( (LA12_158=='i') ) {s = 174;}

                        else if ( ((LA12_158>='\u0000' && LA12_158<='h')||(LA12_158>='j' && LA12_158<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='m') ) {s = 185;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='l')||(LA12_174>='n' && LA12_174<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_185 = input.LA(1);

                        s = -1;
                        if ( (LA12_185=='e') ) {s = 193;}

                        else if ( ((LA12_185>='\u0000' && LA12_185<='d')||(LA12_185>='f' && LA12_185<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_193 = input.LA(1);

                        s = -1;
                        if ( (LA12_193=='\"') ) {s = 201;}

                        else if ( ((LA12_193>='\u0000' && LA12_193<='!')||(LA12_193>='#' && LA12_193<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='i') ) {s = 73;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='h')||(LA12_48>='j' && LA12_48<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='m') ) {s = 95;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<='l')||(LA12_73>='n' && LA12_73<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='e') ) {s = 116;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='d')||(LA12_95>='f' && LA12_95<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='\"') ) {s = 138;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='!')||(LA12_116>='#' && LA12_116<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='m') ) {s = 74;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='l')||(LA12_49>='n' && LA12_49<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='a') ) {s = 96;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='`')||(LA12_74>='b' && LA12_74<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='i') ) {s = 117;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='h')||(LA12_96>='j' && LA12_96<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='l') ) {s = 139;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='k')||(LA12_117>='m' && LA12_117<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='\"') ) {s = 161;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<='!')||(LA12_139>='#' && LA12_139<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='n') ) {s = 97;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='m')||(LA12_75>='o' && LA12_75<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='-') ) {s = 118;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<=',')||(LA12_97>='.' && LA12_97<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='e') ) {s = 140;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='d')||(LA12_118>='f' && LA12_118<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_140 = input.LA(1);

                        s = -1;
                        if ( (LA12_140=='m') ) {s = 162;}

                        else if ( ((LA12_140>='\u0000' && LA12_140<='l')||(LA12_140>='n' && LA12_140<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_162 = input.LA(1);

                        s = -1;
                        if ( (LA12_162=='a') ) {s = 176;}

                        else if ( ((LA12_162>='\u0000' && LA12_162<='`')||(LA12_162>='b' && LA12_162<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='i') ) {s = 186;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='h')||(LA12_176>='j' && LA12_176<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_186 = input.LA(1);

                        s = -1;
                        if ( (LA12_186=='l') ) {s = 194;}

                        else if ( ((LA12_186>='\u0000' && LA12_186<='k')||(LA12_186>='m' && LA12_186<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='\"') ) {s = 202;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='!')||(LA12_194>='#' && LA12_194<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='o') ) {s = 78;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='n')||(LA12_51>='p' && LA12_51<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='s') ) {s = 100;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='r')||(LA12_78>='t' && LA12_78<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_100 = input.LA(1);

                        s = -1;
                        if ( (LA12_100=='t') ) {s = 123;}

                        else if ( ((LA12_100>='\u0000' && LA12_100<='s')||(LA12_100>='u' && LA12_100<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_123 = input.LA(1);

                        s = -1;
                        if ( (LA12_123=='n') ) {s = 145;}

                        else if ( ((LA12_123>='\u0000' && LA12_123<='m')||(LA12_123>='o' && LA12_123<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='a') ) {s = 166;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='`')||(LA12_145>='b' && LA12_145<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_166 = input.LA(1);

                        s = -1;
                        if ( (LA12_166=='m') ) {s = 178;}

                        else if ( ((LA12_166>='\u0000' && LA12_166<='l')||(LA12_166>='n' && LA12_166<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_178 = input.LA(1);

                        s = -1;
                        if ( (LA12_178=='e') ) {s = 188;}

                        else if ( ((LA12_178>='\u0000' && LA12_178<='d')||(LA12_178>='f' && LA12_178<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='\"') ) {s = 196;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='!')||(LA12_188>='#' && LA12_188<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='\"') ) {s = 141;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='!')||(LA12_119>='#' && LA12_119<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='e') ) {s = 81;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='d')||(LA12_54>='f' && LA12_54<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='l') ) {s = 103;}

                        else if ( (LA12_81=='g') ) {s = 104;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='f')||(LA12_81>='h' && LA12_81<='k')||(LA12_81>='m' && LA12_81<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='\"') ) {s = 142;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<='!')||(LA12_120>='#' && LA12_120<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_147 = input.LA(1);

                        s = -1;
                        if ( (LA12_147=='e') ) {s = 167;}

                        else if ( ((LA12_147>='\u0000' && LA12_147<='d')||(LA12_147>='f' && LA12_147<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='f') ) {s = 179;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='e')||(LA12_167>='g' && LA12_167<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='e') ) {s = 189;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='d')||(LA12_179>='f' && LA12_179<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_189 = input.LA(1);

                        s = -1;
                        if ( (LA12_189=='r') ) {s = 197;}

                        else if ( ((LA12_189>='\u0000' && LA12_189<='q')||(LA12_189>='s' && LA12_189<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='e') ) {s = 205;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='d')||(LA12_197>='f' && LA12_197<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_205 = input.LA(1);

                        s = -1;
                        if ( (LA12_205=='n') ) {s = 212;}

                        else if ( ((LA12_205>='\u0000' && LA12_205<='m')||(LA12_205>='o' && LA12_205<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_212 = input.LA(1);

                        s = -1;
                        if ( (LA12_212=='c') ) {s = 217;}

                        else if ( ((LA12_212>='\u0000' && LA12_212<='b')||(LA12_212>='d' && LA12_212<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_217 = input.LA(1);

                        s = -1;
                        if ( (LA12_217=='e') ) {s = 222;}

                        else if ( ((LA12_217>='\u0000' && LA12_217<='d')||(LA12_217>='f' && LA12_217<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_222 = input.LA(1);

                        s = -1;
                        if ( (LA12_222=='\"') ) {s = 227;}

                        else if ( ((LA12_222>='\u0000' && LA12_222<='!')||(LA12_222>='#' && LA12_222<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='r') ) {s = 144;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='q')||(LA12_122>='s' && LA12_122<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='e') ) {s = 165;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='d')||(LA12_144>='f' && LA12_144<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='f') ) {s = 177;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='e')||(LA12_165>='g' && LA12_165<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA12_177 = input.LA(1);

                        s = -1;
                        if ( (LA12_177=='e') ) {s = 187;}

                        else if ( ((LA12_177>='\u0000' && LA12_177<='d')||(LA12_177>='f' && LA12_177<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA12_187 = input.LA(1);

                        s = -1;
                        if ( (LA12_187=='r') ) {s = 195;}

                        else if ( ((LA12_187>='\u0000' && LA12_187<='q')||(LA12_187>='s' && LA12_187<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='e') ) {s = 203;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='d')||(LA12_195>='f' && LA12_195<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA12_203 = input.LA(1);

                        s = -1;
                        if ( (LA12_203=='n') ) {s = 211;}

                        else if ( ((LA12_203>='\u0000' && LA12_203<='m')||(LA12_203>='o' && LA12_203<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA12_211 = input.LA(1);

                        s = -1;
                        if ( (LA12_211=='c') ) {s = 216;}

                        else if ( ((LA12_211>='\u0000' && LA12_211<='b')||(LA12_211>='d' && LA12_211<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA12_216 = input.LA(1);

                        s = -1;
                        if ( (LA12_216=='e') ) {s = 221;}

                        else if ( ((LA12_216>='\u0000' && LA12_216<='d')||(LA12_216>='f' && LA12_216<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA12_221 = input.LA(1);

                        s = -1;
                        if ( (LA12_221=='\"') ) {s = 226;}

                        else if ( ((LA12_221>='\u0000' && LA12_221<='!')||(LA12_221>='#' && LA12_221<='\uFFFF')) ) {s = 55;}

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