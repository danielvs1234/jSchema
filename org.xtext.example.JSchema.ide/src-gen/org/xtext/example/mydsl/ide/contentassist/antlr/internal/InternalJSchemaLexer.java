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
            // InternalJSchema.g:11:7: ( 'String' )
            // InternalJSchema.g:11:9: 'String'
            {
            match("String"); 


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
            // InternalJSchema.g:12:7: ( 'Int' )
            // InternalJSchema.g:12:9: 'Int'
            {
            match("Int"); 


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
            // InternalJSchema.g:13:7: ( 'float' )
            // InternalJSchema.g:13:9: 'float'
            {
            match("float"); 


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
            // InternalJSchema.g:14:7: ( 'double' )
            // InternalJSchema.g:14:9: 'double'
            {
            match("double"); 


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
            // InternalJSchema.g:15:7: ( '\"date-time\"' )
            // InternalJSchema.g:15:9: '\"date-time\"'
            {
            match("\"date-time\""); 


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
            // InternalJSchema.g:16:7: ( '\"time\"' )
            // InternalJSchema.g:16:9: '\"time\"'
            {
            match("\"time\""); 


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
            // InternalJSchema.g:17:7: ( '\"date\"' )
            // InternalJSchema.g:17:9: '\"date\"'
            {
            match("\"date\""); 


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
            // InternalJSchema.g:18:7: ( '\"email\"' )
            // InternalJSchema.g:18:9: '\"email\"'
            {
            match("\"email\""); 


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
            // InternalJSchema.g:19:7: ( '\"idn-email\"' )
            // InternalJSchema.g:19:9: '\"idn-email\"'
            {
            match("\"idn-email\""); 


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
            // InternalJSchema.g:20:7: ( '\"hostname\"' )
            // InternalJSchema.g:20:9: '\"hostname\"'
            {
            match("\"hostname\""); 


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
            // InternalJSchema.g:21:7: ( '\"ipv4\"' )
            // InternalJSchema.g:21:9: '\"ipv4\"'
            {
            match("\"ipv4\""); 


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
            // InternalJSchema.g:22:7: ( '\"ipv6\"' )
            // InternalJSchema.g:22:9: '\"ipv6\"'
            {
            match("\"ipv6\""); 


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
            // InternalJSchema.g:23:7: ( '\"uri\"' )
            // InternalJSchema.g:23:9: '\"uri\"'
            {
            match("\"uri\""); 


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
            // InternalJSchema.g:24:7: ( '\"uri-reference\"' )
            // InternalJSchema.g:24:9: '\"uri-reference\"'
            {
            match("\"uri-reference\""); 


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
            // InternalJSchema.g:25:7: ( '\"iri\"' )
            // InternalJSchema.g:25:9: '\"iri\"'
            {
            match("\"iri\""); 


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
            // InternalJSchema.g:26:7: ( '\"iri-reference\"' )
            // InternalJSchema.g:26:9: '\"iri-reference\"'
            {
            match("\"iri-reference\""); 


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
            // InternalJSchema.g:27:7: ( '\"uri-template\"' )
            // InternalJSchema.g:27:9: '\"uri-template\"'
            {
            match("\"uri-template\""); 


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
            // InternalJSchema.g:28:7: ( '\"json-pointer\"' )
            // InternalJSchema.g:28:9: '\"json-pointer\"'
            {
            match("\"json-pointer\""); 


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
            // InternalJSchema.g:29:7: ( '\"relative-json-pointer\"' )
            // InternalJSchema.g:29:9: '\"relative-json-pointer\"'
            {
            match("\"relative-json-pointer\""); 


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
            // InternalJSchema.g:30:7: ( '\"regex\"' )
            // InternalJSchema.g:30:9: '\"regex\"'
            {
            match("\"regex\""); 


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
            // InternalJSchema.g:31:7: ( '.' )
            // InternalJSchema.g:31:9: '.'
            {
            match('.'); 

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
            // InternalJSchema.g:32:7: ( '{' )
            // InternalJSchema.g:32:9: '{'
            {
            match('{'); 

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
            // InternalJSchema.g:33:7: ( '}' )
            // InternalJSchema.g:33:9: '}'
            {
            match('}'); 

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
            // InternalJSchema.g:34:7: ( 'includes' )
            // InternalJSchema.g:34:9: 'includes'
            {
            match("includes"); 


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
            // InternalJSchema.g:35:7: ( ',' )
            // InternalJSchema.g:35:9: ','
            {
            match(','); 

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
            // InternalJSchema.g:36:7: ( 'with' )
            // InternalJSchema.g:36:9: 'with'
            {
            match("with"); 


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
            // InternalJSchema.g:37:7: ( ';' )
            // InternalJSchema.g:37:9: ';'
            {
            match(';'); 

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
            // InternalJSchema.g:38:7: ( 'num' )
            // InternalJSchema.g:38:9: 'num'
            {
            match("num"); 


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
            // InternalJSchema.g:39:7: ( 'length' )
            // InternalJSchema.g:39:9: 'length'
            {
            match("length"); 


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
            // InternalJSchema.g:40:7: ( 'pattern' )
            // InternalJSchema.g:40:9: 'pattern'
            {
            match("pattern"); 


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
            // InternalJSchema.g:41:7: ( 'format' )
            // InternalJSchema.g:41:9: 'format'
            {
            match("format"); 


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
            // InternalJSchema.g:42:7: ( '-' )
            // InternalJSchema.g:42:9: '-'
            {
            match('-'); 

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
            // InternalJSchema.g:43:7: ( '[' )
            // InternalJSchema.g:43:9: '['
            {
            match('['); 

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
            // InternalJSchema.g:44:7: ( ']' )
            // InternalJSchema.g:44:9: ']'
            {
            match(']'); 

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
            // InternalJSchema.g:45:7: ( 'root' )
            // InternalJSchema.g:45:9: 'root'
            {
            match("root"); 


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
            // InternalJSchema.g:2438:11: ( 'null' )
            // InternalJSchema.g:2438:13: 'null'
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
            // InternalJSchema.g:2440:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJSchema.g:2440:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJSchema.g:2440:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSchema.g:2440:11: '^'
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

            // InternalJSchema.g:2440:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalJSchema.g:2442:10: ( ( '0' .. '9' )+ )
            // InternalJSchema.g:2442:12: ( '0' .. '9' )+
            {
            // InternalJSchema.g:2442:12: ( '0' .. '9' )+
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
            	    // InternalJSchema.g:2442:13: '0' .. '9'
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
            // InternalJSchema.g:2444:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJSchema.g:2444:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJSchema.g:2444:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalJSchema.g:2444:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJSchema.g:2444:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalJSchema.g:2444:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:2444:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalJSchema.g:2444:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJSchema.g:2444:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalJSchema.g:2444:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:2444:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalJSchema.g:2446:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJSchema.g:2446:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJSchema.g:2446:24: ( options {greedy=false; } : . )*
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
            	    // InternalJSchema.g:2446:52: .
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
            // InternalJSchema.g:2448:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJSchema.g:2448:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJSchema.g:2448:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJSchema.g:2448:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalJSchema.g:2448:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJSchema.g:2448:41: ( '\\r' )? '\\n'
                    {
                    // InternalJSchema.g:2448:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalJSchema.g:2448:41: '\\r'
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
            // InternalJSchema.g:2450:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJSchema.g:2450:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJSchema.g:2450:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalJSchema.g:2452:16: ( . )
            // InternalJSchema.g:2452:18: .
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
        "\1\uffff\4\34\1\32\3\uffff\1\34\1\uffff\1\34\1\uffff\3\34\3\uffff\1\34\1\32\2\uffff\2\32\2\uffff\1\34\1\uffff\4\34\14\uffff\1\34\1\uffff\1\34\1\uffff\3\34\3\uffff\1\34\4\uffff\1\34\1\123\3\34\12\uffff\2\34\1\144\5\34\1\uffff\3\34\13\uffff\1\34\1\174\1\uffff\1\175\2\34\1\u0080\1\34\1\u0082\2\34\16\uffff\1\34\2\uffff\2\34\1\uffff\1\u0098\1\uffff\1\u0099\1\u009a\20\uffff\1\34\1\u00aa\1\34\21\uffff\1\34\1\uffff\1\u00b7\12\uffff\1\u00c0\73\uffff";
    static final String DFA12_eofS =
        "\u00f2\uffff";
    static final String DFA12_minS =
        "\1\0\1\164\1\156\1\154\1\157\1\0\3\uffff\1\156\1\uffff\1\151\1\uffff\1\165\1\145\1\141\3\uffff\1\157\1\101\2\uffff\1\0\1\52\2\uffff\1\162\1\uffff\1\164\1\157\1\162\1\165\10\0\4\uffff\1\143\1\uffff\1\164\1\uffff\1\154\1\156\1\164\3\uffff\1\157\4\uffff\1\151\1\60\1\141\1\155\1\142\12\0\1\154\1\150\1\60\1\154\1\147\2\164\1\156\1\uffff\1\164\1\141\1\154\13\0\1\165\1\60\1\uffff\1\60\1\164\1\145\1\60\1\147\1\60\1\164\1\145\6\0\1\uffff\2\0\1\uffff\4\0\1\144\2\uffff\1\150\1\162\1\uffff\1\60\1\uffff\2\60\1\0\2\uffff\2\0\3\uffff\2\0\1\uffff\5\0\1\145\1\60\1\156\3\uffff\1\0\3\uffff\1\0\2\uffff\6\0\1\uffff\1\163\1\uffff\1\60\1\0\1\uffff\7\0\1\uffff\1\60\1\uffff\10\0\1\uffff\3\0\1\uffff\4\0\2\uffff\1\0\1\uffff\4\0\2\uffff\14\0\2\uffff\1\0\4\uffff\1\0\2\uffff\7\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\164\1\156\2\157\1\uffff\3\uffff\1\156\1\uffff\1\151\1\uffff\1\165\1\145\1\141\3\uffff\1\157\1\172\2\uffff\1\uffff\1\57\2\uffff\1\162\1\uffff\1\164\1\157\1\162\1\165\10\uffff\4\uffff\1\143\1\uffff\1\164\1\uffff\1\155\1\156\1\164\3\uffff\1\157\4\uffff\1\151\1\172\1\141\1\155\1\142\12\uffff\1\154\1\150\1\172\1\154\1\147\2\164\1\156\1\uffff\1\164\1\141\1\154\13\uffff\1\165\1\172\1\uffff\1\172\1\164\1\145\1\172\1\147\1\172\1\164\1\145\6\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\144\2\uffff\1\150\1\162\1\uffff\1\172\1\uffff\2\172\1\uffff\2\uffff\2\uffff\3\uffff\2\uffff\1\uffff\5\uffff\1\145\1\172\1\156\3\uffff\1\uffff\3\uffff\1\uffff\2\uffff\6\uffff\1\uffff\1\163\1\uffff\1\172\1\uffff\1\uffff\7\uffff\1\uffff\1\172\1\uffff\10\uffff\1\uffff\3\uffff\1\uffff\4\uffff\2\uffff\1\uffff\1\uffff\4\uffff\2\uffff\14\uffff\2\uffff\1\uffff\4\uffff\1\uffff\2\uffff\7\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\25\1\26\1\27\1\uffff\1\31\1\uffff\1\33\3\uffff\1\40\1\41\1\42\2\uffff\1\45\1\46\2\uffff\1\52\1\53\1\uffff\1\45\14\uffff\1\47\1\25\1\26\1\27\1\uffff\1\31\1\uffff\1\33\3\uffff\1\40\1\41\1\42\1\uffff\1\46\1\50\1\51\1\52\27\uffff\1\2\20\uffff\1\34\16\uffff\1\17\2\uffff\1\15\5\uffff\1\32\1\44\2\uffff\1\43\1\uffff\1\3\3\uffff\1\7\1\6\2\uffff\1\13\1\14\1\17\2\uffff\1\15\10\uffff\1\1\1\37\1\4\1\uffff\1\7\1\6\1\10\1\uffff\1\13\1\14\6\uffff\1\24\1\uffff\1\35\2\uffff\1\10\7\uffff\1\24\1\uffff\1\36\10\uffff\1\30\3\uffff\1\12\4\uffff\1\5\1\11\1\uffff\1\12\4\uffff\1\5\1\11\14\uffff\1\21\1\22\1\uffff\1\20\1\16\1\21\1\22\1\uffff\1\20\1\16\7\uffff\2\23";
    static final String DFA12_specialS =
        "\1\0\4\uffff\1\66\21\uffff\1\11\11\uffff\1\104\1\17\1\23\1\6\1\41\1\40\1\115\1\7\30\uffff\1\107\1\20\1\24\1\30\1\1\1\3\1\42\1\43\1\116\1\10\14\uffff\1\112\1\21\1\25\1\31\1\2\1\4\1\44\1\47\1\117\1\131\1\154\13\uffff\1\114\1\22\1\26\1\32\1\53\1\54\1\uffff\1\67\1\45\1\uffff\1\5\1\120\1\132\1\155\12\uffff\1\12\2\uffff\1\27\1\33\3\uffff\1\70\1\46\1\uffff\1\55\1\101\1\121\1\133\1\156\6\uffff\1\13\3\uffff\1\34\2\uffff\1\71\1\50\1\56\1\102\1\122\1\134\4\uffff\1\14\1\uffff\1\35\1\72\1\51\1\57\1\103\1\123\1\135\3\uffff\1\15\1\36\1\73\1\52\1\60\1\105\1\124\1\136\1\uffff\1\16\1\37\1\74\1\uffff\1\61\1\106\1\125\1\137\2\uffff\1\75\1\uffff\1\62\1\110\1\126\1\140\2\uffff\1\76\1\63\1\111\1\127\1\141\1\77\1\64\1\113\1\130\1\142\1\100\1\65\2\uffff\1\143\4\uffff\1\144\2\uffff\1\145\1\146\1\147\1\150\1\151\1\152\1\153\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\5\4\32\1\27\4\32\1\12\1\20\1\6\1\30\12\26\1\32\1\14\5\32\10\25\1\2\11\25\1\1\7\25\1\21\1\32\1\22\1\24\1\25\1\32\3\25\1\4\1\25\1\3\2\25\1\11\2\25\1\16\1\25\1\15\1\25\1\17\1\25\1\23\4\25\1\13\3\25\1\7\1\32\1\10\uff82\32",
            "\1\33",
            "\1\35",
            "\1\36\2\uffff\1\37",
            "\1\40",
            "\144\51\1\41\1\43\2\51\1\45\1\44\1\47\7\51\1\50\1\51\1\42\1\46\uff8a\51",
            "",
            "",
            "",
            "\1\55",
            "",
            "\1\57",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\1\67",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\51",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\141\51\1\101\uff9e\51",
            "\151\51\1\102\uff96\51",
            "\155\51\1\103\uff92\51",
            "\144\51\1\104\13\51\1\105\1\51\1\106\uff8d\51",
            "\157\51\1\107\uff90\51",
            "\162\51\1\110\uff8d\51",
            "\163\51\1\111\uff8c\51",
            "\145\51\1\112\uff9a\51",
            "",
            "",
            "",
            "",
            "\1\113",
            "",
            "\1\114",
            "",
            "\1\116\1\115",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "\1\121",
            "",
            "",
            "",
            "",
            "\1\122",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\124",
            "\1\125",
            "\1\126",
            "\164\51\1\127\uff8b\51",
            "\155\51\1\130\uff92\51",
            "\141\51\1\131\uff9e\51",
            "\156\51\1\132\uff91\51",
            "\166\51\1\133\uff89\51",
            "\151\51\1\134\uff96\51",
            "\163\51\1\135\uff8c\51",
            "\151\51\1\136\uff96\51",
            "\157\51\1\137\uff90\51",
            "\147\51\1\141\4\51\1\140\uff93\51",
            "\1\142",
            "\1\143",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\145\51\1\155\uff9a\51",
            "\145\51\1\156\uff9a\51",
            "\151\51\1\157\uff96\51",
            "\55\51\1\160\uffd2\51",
            "\64\51\1\161\1\51\1\162\uffc9\51",
            "\42\51\1\163\12\51\1\164\uffd2\51",
            "\164\51\1\165\uff8b\51",
            "\42\51\1\166\12\51\1\167\uffd2\51",
            "\156\51\1\170\uff91\51",
            "\141\51\1\171\uff9e\51",
            "\145\51\1\172\uff9a\51",
            "\1\173",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\176",
            "\1\177",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0081",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0083",
            "\1\u0084",
            "\42\51\1\u0086\12\51\1\u0085\uffd2\51",
            "\42\51\1\u0087\uffdd\51",
            "\154\51\1\u0088\uff93\51",
            "\145\51\1\u0089\uff9a\51",
            "\42\51\1\u008a\uffdd\51",
            "\42\51\1\u008b\uffdd\51",
            "",
            "\162\51\1\u008d\uff8d\51",
            "\156\51\1\u008e\uff91\51",
            "",
            "\162\51\1\u0090\1\51\1\u0091\uff8b\51",
            "\55\51\1\u0092\uffd2\51",
            "\164\51\1\u0093\uff8b\51",
            "\170\51\1\u0094\uff87\51",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\164\51\1\u009b\uff8b\51",
            "",
            "",
            "\42\51\1\u009e\uffdd\51",
            "\155\51\1\u009f\uff92\51",
            "",
            "",
            "",
            "\145\51\1\u00a2\uff9a\51",
            "\141\51\1\u00a3\uff9e\51",
            "",
            "\145\51\1\u00a4\uff9a\51",
            "\145\51\1\u00a5\uff9a\51",
            "\160\51\1\u00a6\uff8f\51",
            "\151\51\1\u00a7\uff96\51",
            "\42\51\1\u00a8\uffdd\51",
            "\1\u00a9",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00ab",
            "",
            "",
            "",
            "\151\51\1\u00ac\uff96\51",
            "",
            "",
            "",
            "\141\51\1\u00ae\uff9e\51",
            "",
            "",
            "\146\51\1\u00af\uff99\51",
            "\155\51\1\u00b0\uff92\51",
            "\146\51\1\u00b1\uff99\51",
            "\155\51\1\u00b2\uff92\51",
            "\157\51\1\u00b3\uff90\51",
            "\166\51\1\u00b4\uff89\51",
            "",
            "\1\u00b6",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\155\51\1\u00b8\uff92\51",
            "",
            "\151\51\1\u00b9\uff96\51",
            "\145\51\1\u00ba\uff9a\51",
            "\145\51\1\u00bb\uff9a\51",
            "\145\51\1\u00bc\uff9a\51",
            "\160\51\1\u00bd\uff8f\51",
            "\151\51\1\u00be\uff96\51",
            "\145\51\1\u00bf\uff9a\51",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\145\51\1\u00c1\uff9a\51",
            "\154\51\1\u00c2\uff93\51",
            "\162\51\1\u00c3\uff8d\51",
            "\42\51\1\u00c4\uffdd\51",
            "\162\51\1\u00c5\uff8d\51",
            "\154\51\1\u00c6\uff93\51",
            "\156\51\1\u00c7\uff91\51",
            "\55\51\1\u00c8\uffd2\51",
            "",
            "\42\51\1\u00c9\uffdd\51",
            "\42\51\1\u00ca\uffdd\51",
            "\145\51\1\u00cb\uff9a\51",
            "",
            "\145\51\1\u00cd\uff9a\51",
            "\141\51\1\u00ce\uff9e\51",
            "\164\51\1\u00cf\uff8b\51",
            "\152\51\1\u00d0\uff95\51",
            "",
            "",
            "\156\51\1\u00d3\uff91\51",
            "",
            "\156\51\1\u00d4\uff91\51",
            "\164\51\1\u00d5\uff8b\51",
            "\145\51\1\u00d6\uff9a\51",
            "\163\51\1\u00d7\uff8c\51",
            "",
            "",
            "\143\51\1\u00d8\uff9c\51",
            "\143\51\1\u00d9\uff9c\51",
            "\145\51\1\u00da\uff9a\51",
            "\162\51\1\u00db\uff8d\51",
            "\157\51\1\u00dc\uff90\51",
            "\145\51\1\u00dd\uff9a\51",
            "\145\51\1\u00de\uff9a\51",
            "\42\51\1\u00df\uffdd\51",
            "\42\51\1\u00e0\uffdd\51",
            "\156\51\1\u00e1\uff91\51",
            "\42\51\1\u00e2\uffdd\51",
            "\42\51\1\u00e3\uffdd\51",
            "",
            "",
            "\55\51\1\u00e6\uffd2\51",
            "",
            "",
            "",
            "",
            "\160\51\1\u00e9\uff8f\51",
            "",
            "",
            "\157\51\1\u00ea\uff90\51",
            "\151\51\1\u00eb\uff96\51",
            "\156\51\1\u00ec\uff91\51",
            "\164\51\1\u00ed\uff8b\51",
            "\145\51\1\u00ee\uff9a\51",
            "\162\51\1\u00ef\uff8d\51",
            "\42\51\1\u00f0\uffdd\51",
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
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='I') ) {s = 2;}

                        else if ( (LA12_0=='f') ) {s = 3;}

                        else if ( (LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='\"') ) {s = 5;}

                        else if ( (LA12_0=='.') ) {s = 6;}

                        else if ( (LA12_0=='{') ) {s = 7;}

                        else if ( (LA12_0=='}') ) {s = 8;}

                        else if ( (LA12_0=='i') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='w') ) {s = 11;}

                        else if ( (LA12_0==';') ) {s = 12;}

                        else if ( (LA12_0=='n') ) {s = 13;}

                        else if ( (LA12_0=='l') ) {s = 14;}

                        else if ( (LA12_0=='p') ) {s = 15;}

                        else if ( (LA12_0=='-') ) {s = 16;}

                        else if ( (LA12_0=='[') ) {s = 17;}

                        else if ( (LA12_0==']') ) {s = 18;}

                        else if ( (LA12_0=='r') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||LA12_0=='e'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='o'||LA12_0=='q'||(LA12_0>='s' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 25;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='v') ) {s = 91;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='u')||(LA12_69>='w' && LA12_69<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_91 = input.LA(1);

                        s = -1;
                        if ( (LA12_91=='4') ) {s = 113;}

                        else if ( (LA12_91=='6') ) {s = 114;}

                        else if ( ((LA12_91>='\u0000' && LA12_91<='3')||LA12_91=='5'||(LA12_91>='7' && LA12_91<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_70 = input.LA(1);

                        s = -1;
                        if ( (LA12_70=='i') ) {s = 92;}

                        else if ( ((LA12_70>='\u0000' && LA12_70<='h')||(LA12_70>='j' && LA12_70<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='\"') ) {s = 115;}

                        else if ( (LA12_92=='-') ) {s = 116;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='!')||(LA12_92>='#' && LA12_92<=',')||(LA12_92>='.' && LA12_92<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='r') ) {s = 144;}

                        else if ( (LA12_119=='t') ) {s = 145;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='q')||LA12_119=='s'||(LA12_119>='u' && LA12_119<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( (LA12_36=='d') ) {s = 68;}

                        else if ( (LA12_36=='p') ) {s = 69;}

                        else if ( (LA12_36=='r') ) {s = 70;}

                        else if ( ((LA12_36>='\u0000' && LA12_36<='c')||(LA12_36>='e' && LA12_36<='o')||LA12_36=='q'||(LA12_36>='s' && LA12_36<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='e') ) {s = 74;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='d')||(LA12_40>='f' && LA12_40<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='l') ) {s = 96;}

                        else if ( (LA12_74=='g') ) {s = 97;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='f')||(LA12_74>='h' && LA12_74<='k')||(LA12_74>='m' && LA12_74<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 41;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='t') ) {s = 155;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='s')||(LA12_133>='u' && LA12_133<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_155 = input.LA(1);

                        s = -1;
                        if ( (LA12_155=='i') ) {s = 172;}

                        else if ( ((LA12_155>='\u0000' && LA12_155<='h')||(LA12_155>='j' && LA12_155<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_172 = input.LA(1);

                        s = -1;
                        if ( (LA12_172=='m') ) {s = 184;}

                        else if ( ((LA12_172>='\u0000' && LA12_172<='l')||(LA12_172>='n' && LA12_172<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_184 = input.LA(1);

                        s = -1;
                        if ( (LA12_184=='e') ) {s = 193;}

                        else if ( ((LA12_184>='\u0000' && LA12_184<='d')||(LA12_184>='f' && LA12_184<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_193 = input.LA(1);

                        s = -1;
                        if ( (LA12_193=='\"') ) {s = 201;}

                        else if ( ((LA12_193>='\u0000' && LA12_193<='!')||(LA12_193>='#' && LA12_193<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( (LA12_34=='i') ) {s = 66;}

                        else if ( ((LA12_34>='\u0000' && LA12_34<='h')||(LA12_34>='j' && LA12_34<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='m') ) {s = 88;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='l')||(LA12_66>='n' && LA12_66<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88=='e') ) {s = 110;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='d')||(LA12_88>='f' && LA12_88<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='\"') ) {s = 135;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='!')||(LA12_110>='#' && LA12_110<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( (LA12_35=='m') ) {s = 67;}

                        else if ( ((LA12_35>='\u0000' && LA12_35<='l')||(LA12_35>='n' && LA12_35<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='a') ) {s = 89;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='`')||(LA12_67>='b' && LA12_67<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='i') ) {s = 111;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='h')||(LA12_89>='j' && LA12_89<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='l') ) {s = 136;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='k')||(LA12_111>='m' && LA12_111<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='\"') ) {s = 158;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='!')||(LA12_136>='#' && LA12_136<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='n') ) {s = 90;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='m')||(LA12_68>='o' && LA12_68<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='-') ) {s = 112;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<=',')||(LA12_90>='.' && LA12_90<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='e') ) {s = 137;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='d')||(LA12_112>='f' && LA12_112<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='m') ) {s = 159;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='l')||(LA12_137>='n' && LA12_137<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_159 = input.LA(1);

                        s = -1;
                        if ( (LA12_159=='a') ) {s = 174;}

                        else if ( ((LA12_159>='\u0000' && LA12_159<='`')||(LA12_159>='b' && LA12_159<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='i') ) {s = 185;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='h')||(LA12_174>='j' && LA12_174<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_185 = input.LA(1);

                        s = -1;
                        if ( (LA12_185=='l') ) {s = 194;}

                        else if ( ((LA12_185>='\u0000' && LA12_185<='k')||(LA12_185>='m' && LA12_185<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='\"') ) {s = 202;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='!')||(LA12_194>='#' && LA12_194<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( (LA12_38=='r') ) {s = 72;}

                        else if ( ((LA12_38>='\u0000' && LA12_38<='q')||(LA12_38>='s' && LA12_38<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( (LA12_37=='o') ) {s = 71;}

                        else if ( ((LA12_37>='\u0000' && LA12_37<='n')||(LA12_37>='p' && LA12_37<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='s') ) {s = 93;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='r')||(LA12_71>='t' && LA12_71<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='i') ) {s = 94;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='h')||(LA12_72>='j' && LA12_72<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='t') ) {s = 117;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='s')||(LA12_93>='u' && LA12_93<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='n') ) {s = 142;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='m')||(LA12_117>='o' && LA12_117<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='a') ) {s = 163;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='`')||(LA12_142>='b' && LA12_142<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_94 = input.LA(1);

                        s = -1;
                        if ( (LA12_94=='\"') ) {s = 118;}

                        else if ( (LA12_94=='-') ) {s = 119;}

                        else if ( ((LA12_94>='\u0000' && LA12_94<='!')||(LA12_94>='#' && LA12_94<=',')||(LA12_94>='.' && LA12_94<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_163 = input.LA(1);

                        s = -1;
                        if ( (LA12_163=='m') ) {s = 176;}

                        else if ( ((LA12_163>='\u0000' && LA12_163<='l')||(LA12_163>='n' && LA12_163<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='e') ) {s = 187;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='d')||(LA12_176>='f' && LA12_176<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_187 = input.LA(1);

                        s = -1;
                        if ( (LA12_187=='\"') ) {s = 196;}

                        else if ( ((LA12_187>='\u0000' && LA12_187<='!')||(LA12_187>='#' && LA12_187<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='\"') ) {s = 138;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='!')||(LA12_113>='#' && LA12_113<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='\"') ) {s = 139;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='!')||(LA12_114>='#' && LA12_114<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='e') ) {s = 164;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='d')||(LA12_144>='f' && LA12_144<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_164 = input.LA(1);

                        s = -1;
                        if ( (LA12_164=='f') ) {s = 177;}

                        else if ( ((LA12_164>='\u0000' && LA12_164<='e')||(LA12_164>='g' && LA12_164<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_177 = input.LA(1);

                        s = -1;
                        if ( (LA12_177=='e') ) {s = 188;}

                        else if ( ((LA12_177>='\u0000' && LA12_177<='d')||(LA12_177>='f' && LA12_177<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='r') ) {s = 197;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='q')||(LA12_188>='s' && LA12_188<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='e') ) {s = 205;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='d')||(LA12_197>='f' && LA12_197<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_205 = input.LA(1);

                        s = -1;
                        if ( (LA12_205=='n') ) {s = 212;}

                        else if ( ((LA12_205>='\u0000' && LA12_205<='m')||(LA12_205>='o' && LA12_205<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_212 = input.LA(1);

                        s = -1;
                        if ( (LA12_212=='c') ) {s = 217;}

                        else if ( ((LA12_212>='\u0000' && LA12_212<='b')||(LA12_212>='d' && LA12_212<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_217 = input.LA(1);

                        s = -1;
                        if ( (LA12_217=='e') ) {s = 222;}

                        else if ( ((LA12_217>='\u0000' && LA12_217<='d')||(LA12_217>='f' && LA12_217<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_222 = input.LA(1);

                        s = -1;
                        if ( (LA12_222=='\"') ) {s = 227;}

                        else if ( ((LA12_222>='\u0000' && LA12_222<='!')||(LA12_222>='#' && LA12_222<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_5 = input.LA(1);

                        s = -1;
                        if ( (LA12_5=='d') ) {s = 33;}

                        else if ( (LA12_5=='t') ) {s = 34;}

                        else if ( (LA12_5=='e') ) {s = 35;}

                        else if ( (LA12_5=='i') ) {s = 36;}

                        else if ( (LA12_5=='h') ) {s = 37;}

                        else if ( (LA12_5=='u') ) {s = 38;}

                        else if ( (LA12_5=='j') ) {s = 39;}

                        else if ( (LA12_5=='r') ) {s = 40;}

                        else if ( ((LA12_5>='\u0000' && LA12_5<='c')||(LA12_5>='f' && LA12_5<='g')||(LA12_5>='k' && LA12_5<='q')||LA12_5=='s'||(LA12_5>='v' && LA12_5<='\uFFFF')) ) {s = 41;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='r') ) {s = 141;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='q')||(LA12_116>='s' && LA12_116<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_141 = input.LA(1);

                        s = -1;
                        if ( (LA12_141=='e') ) {s = 162;}

                        else if ( ((LA12_141>='\u0000' && LA12_141<='d')||(LA12_141>='f' && LA12_141<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_162 = input.LA(1);

                        s = -1;
                        if ( (LA12_162=='f') ) {s = 175;}

                        else if ( ((LA12_162>='\u0000' && LA12_162<='e')||(LA12_162>='g' && LA12_162<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='e') ) {s = 186;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='d')||(LA12_175>='f' && LA12_175<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_186 = input.LA(1);

                        s = -1;
                        if ( (LA12_186=='r') ) {s = 195;}

                        else if ( ((LA12_186>='\u0000' && LA12_186<='q')||(LA12_186>='s' && LA12_186<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='e') ) {s = 203;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='d')||(LA12_195>='f' && LA12_195<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_203 = input.LA(1);

                        s = -1;
                        if ( (LA12_203=='n') ) {s = 211;}

                        else if ( ((LA12_203>='\u0000' && LA12_203<='m')||(LA12_203>='o' && LA12_203<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_211 = input.LA(1);

                        s = -1;
                        if ( (LA12_211=='c') ) {s = 216;}

                        else if ( ((LA12_211>='\u0000' && LA12_211<='b')||(LA12_211>='d' && LA12_211<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_216 = input.LA(1);

                        s = -1;
                        if ( (LA12_216=='e') ) {s = 221;}

                        else if ( ((LA12_216>='\u0000' && LA12_216<='d')||(LA12_216>='f' && LA12_216<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_221 = input.LA(1);

                        s = -1;
                        if ( (LA12_221=='\"') ) {s = 226;}

                        else if ( ((LA12_221>='\u0000' && LA12_221<='!')||(LA12_221>='#' && LA12_221<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='e') ) {s = 165;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='d')||(LA12_145>='f' && LA12_145<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='m') ) {s = 178;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='l')||(LA12_165>='n' && LA12_165<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_178 = input.LA(1);

                        s = -1;
                        if ( (LA12_178=='p') ) {s = 189;}

                        else if ( ((LA12_178>='\u0000' && LA12_178<='o')||(LA12_178>='q' && LA12_178<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( (LA12_33=='a') ) {s = 65;}

                        else if ( ((LA12_33>='\u0000' && LA12_33<='`')||(LA12_33>='b' && LA12_33<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_189 = input.LA(1);

                        s = -1;
                        if ( (LA12_189=='l') ) {s = 198;}

                        else if ( ((LA12_189>='\u0000' && LA12_189<='k')||(LA12_189>='m' && LA12_189<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='a') ) {s = 206;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='`')||(LA12_198>='b' && LA12_198<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='t') ) {s = 87;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='s')||(LA12_65>='u' && LA12_65<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_206 = input.LA(1);

                        s = -1;
                        if ( (LA12_206=='t') ) {s = 213;}

                        else if ( ((LA12_206>='\u0000' && LA12_206<='s')||(LA12_206>='u' && LA12_206<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_213 = input.LA(1);

                        s = -1;
                        if ( (LA12_213=='e') ) {s = 218;}

                        else if ( ((LA12_213>='\u0000' && LA12_213<='d')||(LA12_213>='f' && LA12_213<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='e') ) {s = 109;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='d')||(LA12_87>='f' && LA12_87<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_218 = input.LA(1);

                        s = -1;
                        if ( (LA12_218=='\"') ) {s = 223;}

                        else if ( ((LA12_218>='\u0000' && LA12_218<='!')||(LA12_218>='#' && LA12_218<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_109 = input.LA(1);

                        s = -1;
                        if ( (LA12_109=='-') ) {s = 133;}

                        else if ( (LA12_109=='\"') ) {s = 134;}

                        else if ( ((LA12_109>='\u0000' && LA12_109<='!')||(LA12_109>='#' && LA12_109<=',')||(LA12_109>='.' && LA12_109<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( (LA12_39=='s') ) {s = 73;}

                        else if ( ((LA12_39>='\u0000' && LA12_39<='r')||(LA12_39>='t' && LA12_39<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='o') ) {s = 95;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<='n')||(LA12_73>='p' && LA12_73<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='n') ) {s = 120;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='m')||(LA12_95>='o' && LA12_95<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='-') ) {s = 146;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<=',')||(LA12_120>='.' && LA12_120<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_146 = input.LA(1);

                        s = -1;
                        if ( (LA12_146=='p') ) {s = 166;}

                        else if ( ((LA12_146>='\u0000' && LA12_146<='o')||(LA12_146>='q' && LA12_146<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_166 = input.LA(1);

                        s = -1;
                        if ( (LA12_166=='o') ) {s = 179;}

                        else if ( ((LA12_166>='\u0000' && LA12_166<='n')||(LA12_166>='p' && LA12_166<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='i') ) {s = 190;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='h')||(LA12_179>='j' && LA12_179<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='n') ) {s = 199;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='m')||(LA12_190>='o' && LA12_190<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_199 = input.LA(1);

                        s = -1;
                        if ( (LA12_199=='t') ) {s = 207;}

                        else if ( ((LA12_199>='\u0000' && LA12_199<='s')||(LA12_199>='u' && LA12_199<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_207 = input.LA(1);

                        s = -1;
                        if ( (LA12_207=='e') ) {s = 214;}

                        else if ( ((LA12_207>='\u0000' && LA12_207<='d')||(LA12_207>='f' && LA12_207<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_214 = input.LA(1);

                        s = -1;
                        if ( (LA12_214=='r') ) {s = 219;}

                        else if ( ((LA12_214>='\u0000' && LA12_214<='q')||(LA12_214>='s' && LA12_214<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_219 = input.LA(1);

                        s = -1;
                        if ( (LA12_219=='\"') ) {s = 224;}

                        else if ( ((LA12_219>='\u0000' && LA12_219<='!')||(LA12_219>='#' && LA12_219<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='a') ) {s = 121;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='`')||(LA12_96>='b' && LA12_96<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='t') ) {s = 147;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='s')||(LA12_121>='u' && LA12_121<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_147 = input.LA(1);

                        s = -1;
                        if ( (LA12_147=='i') ) {s = 167;}

                        else if ( ((LA12_147>='\u0000' && LA12_147<='h')||(LA12_147>='j' && LA12_147<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='v') ) {s = 180;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='u')||(LA12_167>='w' && LA12_167<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_180 = input.LA(1);

                        s = -1;
                        if ( (LA12_180=='e') ) {s = 191;}

                        else if ( ((LA12_180>='\u0000' && LA12_180<='d')||(LA12_180>='f' && LA12_180<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_191 = input.LA(1);

                        s = -1;
                        if ( (LA12_191=='-') ) {s = 200;}

                        else if ( ((LA12_191>='\u0000' && LA12_191<=',')||(LA12_191>='.' && LA12_191<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_200 = input.LA(1);

                        s = -1;
                        if ( (LA12_200=='j') ) {s = 208;}

                        else if ( ((LA12_200>='\u0000' && LA12_200<='i')||(LA12_200>='k' && LA12_200<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_208 = input.LA(1);

                        s = -1;
                        if ( (LA12_208=='s') ) {s = 215;}

                        else if ( ((LA12_208>='\u0000' && LA12_208<='r')||(LA12_208>='t' && LA12_208<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_215 = input.LA(1);

                        s = -1;
                        if ( (LA12_215=='o') ) {s = 220;}

                        else if ( ((LA12_215>='\u0000' && LA12_215<='n')||(LA12_215>='p' && LA12_215<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_220 = input.LA(1);

                        s = -1;
                        if ( (LA12_220=='n') ) {s = 225;}

                        else if ( ((LA12_220>='\u0000' && LA12_220<='m')||(LA12_220>='o' && LA12_220<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_225 = input.LA(1);

                        s = -1;
                        if ( (LA12_225=='-') ) {s = 230;}

                        else if ( ((LA12_225>='\u0000' && LA12_225<=',')||(LA12_225>='.' && LA12_225<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_230 = input.LA(1);

                        s = -1;
                        if ( (LA12_230=='p') ) {s = 233;}

                        else if ( ((LA12_230>='\u0000' && LA12_230<='o')||(LA12_230>='q' && LA12_230<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_233 = input.LA(1);

                        s = -1;
                        if ( (LA12_233=='o') ) {s = 234;}

                        else if ( ((LA12_233>='\u0000' && LA12_233<='n')||(LA12_233>='p' && LA12_233<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_234 = input.LA(1);

                        s = -1;
                        if ( (LA12_234=='i') ) {s = 235;}

                        else if ( ((LA12_234>='\u0000' && LA12_234<='h')||(LA12_234>='j' && LA12_234<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_235 = input.LA(1);

                        s = -1;
                        if ( (LA12_235=='n') ) {s = 236;}

                        else if ( ((LA12_235>='\u0000' && LA12_235<='m')||(LA12_235>='o' && LA12_235<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA12_236 = input.LA(1);

                        s = -1;
                        if ( (LA12_236=='t') ) {s = 237;}

                        else if ( ((LA12_236>='\u0000' && LA12_236<='s')||(LA12_236>='u' && LA12_236<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA12_237 = input.LA(1);

                        s = -1;
                        if ( (LA12_237=='e') ) {s = 238;}

                        else if ( ((LA12_237>='\u0000' && LA12_237<='d')||(LA12_237>='f' && LA12_237<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA12_238 = input.LA(1);

                        s = -1;
                        if ( (LA12_238=='r') ) {s = 239;}

                        else if ( ((LA12_238>='\u0000' && LA12_238<='q')||(LA12_238>='s' && LA12_238<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA12_239 = input.LA(1);

                        s = -1;
                        if ( (LA12_239=='\"') ) {s = 240;}

                        else if ( ((LA12_239>='\u0000' && LA12_239<='!')||(LA12_239>='#' && LA12_239<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='e') ) {s = 122;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='d')||(LA12_97>='f' && LA12_97<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA12_122 = input.LA(1);

                        s = -1;
                        if ( (LA12_122=='x') ) {s = 148;}

                        else if ( ((LA12_122>='\u0000' && LA12_122<='w')||(LA12_122>='y' && LA12_122<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA12_148 = input.LA(1);

                        s = -1;
                        if ( (LA12_148=='\"') ) {s = 168;}

                        else if ( ((LA12_148>='\u0000' && LA12_148<='!')||(LA12_148>='#' && LA12_148<='\uFFFF')) ) {s = 41;}

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