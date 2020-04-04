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
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:11:7: ( 'minimum' )
            // InternalJSchema.g:11:9: 'minimum'
            {
            match("minimum"); 


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
            // InternalJSchema.g:12:7: ( 'maximum' )
            // InternalJSchema.g:12:9: 'maximum'
            {
            match("maximum"); 


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
            // InternalJSchema.g:13:7: ( 'num' )
            // InternalJSchema.g:13:9: 'num'
            {
            match("num"); 


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
            // InternalJSchema.g:14:7: ( 'object' )
            // InternalJSchema.g:14:9: 'object'
            {
            match("object"); 


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
            // InternalJSchema.g:15:7: ( 'require' )
            // InternalJSchema.g:15:9: 'require'
            {
            match("require"); 


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
            // InternalJSchema.g:16:7: ( 'properties' )
            // InternalJSchema.g:16:9: 'properties'
            {
            match("properties"); 


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
            // InternalJSchema.g:17:7: ( 'string' )
            // InternalJSchema.g:17:9: 'string'
            {
            match("string"); 


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
            // InternalJSchema.g:18:7: ( 'number' )
            // InternalJSchema.g:18:9: 'number'
            {
            match("number"); 


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
            // InternalJSchema.g:19:7: ( 'array' )
            // InternalJSchema.g:19:9: 'array'
            {
            match("array"); 


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
            // InternalJSchema.g:20:7: ( 'boolean' )
            // InternalJSchema.g:20:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalJSchema.g:21:7: ( 'null' )
            // InternalJSchema.g:21:9: 'null'
            {
            match("null"); 


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
            // InternalJSchema.g:22:7: ( 'name' )
            // InternalJSchema.g:22:9: 'name'
            {
            match("name"); 


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
            // InternalJSchema.g:23:7: ( 'type' )
            // InternalJSchema.g:23:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:1118:14: ( ( 'true' | 'false' ) )
            // InternalJSchema.g:1118:16: ( 'true' | 'false' )
            {
            // InternalJSchema.g:1118:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJSchema.g:1118:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalJSchema.g:1118:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:1120:13: ( RULE_INT ( '.' ( RULE_INT )+ )? )
            // InternalJSchema.g:1120:15: RULE_INT ( '.' ( RULE_INT )+ )?
            {
            mRULE_INT(); 
            // InternalJSchema.g:1120:24: ( '.' ( RULE_INT )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJSchema.g:1120:25: '.' ( RULE_INT )+
                    {
                    match('.'); 
                    // InternalJSchema.g:1120:29: ( RULE_INT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalJSchema.g:1120:29: RULE_INT
                    	    {
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJSchema.g:1122:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJSchema.g:1122:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJSchema.g:1122:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJSchema.g:1122:11: '^'
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

            // InternalJSchema.g:1122:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            	    break loop5;
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
            // InternalJSchema.g:1124:10: ( ( '0' .. '9' )+ )
            // InternalJSchema.g:1124:12: ( '0' .. '9' )+
            {
            // InternalJSchema.g:1124:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJSchema.g:1124:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalJSchema.g:1126:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJSchema.g:1126:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJSchema.g:1126:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJSchema.g:1126:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJSchema.g:1126:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalJSchema.g:1126:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:1126:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJSchema.g:1126:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJSchema.g:1126:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJSchema.g:1126:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJSchema.g:1126:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalJSchema.g:1128:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJSchema.g:1128:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJSchema.g:1128:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJSchema.g:1128:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalJSchema.g:1130:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJSchema.g:1130:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJSchema.g:1130:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJSchema.g:1130:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalJSchema.g:1130:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJSchema.g:1130:41: ( '\\r' )? '\\n'
                    {
                    // InternalJSchema.g:1130:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalJSchema.g:1130:41: '\\r'
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
            // InternalJSchema.g:1132:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJSchema.g:1132:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJSchema.g:1132:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalJSchema.g:1134:16: ( . )
            // InternalJSchema.g:1134:18: .
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
        // InternalJSchema.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_BOOLEAN | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=22;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalJSchema.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalJSchema.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalJSchema.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalJSchema.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalJSchema.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalJSchema.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalJSchema.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalJSchema.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalJSchema.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalJSchema.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalJSchema.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalJSchema.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalJSchema.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalJSchema.g:1:88: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 15 :
                // InternalJSchema.g:1:101: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 16 :
                // InternalJSchema.g:1:113: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalJSchema.g:1:121: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalJSchema.g:1:130: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalJSchema.g:1:142: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalJSchema.g:1:158: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalJSchema.g:1:174: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalJSchema.g:1:182: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\12\25\1\41\1\22\1\uffff\3\22\2\uffff\2\25\1\uffff\13\25\1\uffff\1\41\4\uffff\2\25\1\70\16\25\1\uffff\1\107\1\110\6\25\1\117\1\120\4\25\2\uffff\4\25\1\131\1\25\2\uffff\1\120\2\25\1\135\1\136\2\25\1\141\1\uffff\1\25\1\143\1\144\2\uffff\1\145\1\25\1\uffff\1\147\3\uffff\1\25\1\uffff\1\25\1\152\1\uffff";
    static final String DFA15_eofS =
        "\153\uffff";
    static final String DFA15_minS =
        "\1\0\2\141\1\142\1\145\1\162\1\164\1\162\1\157\1\162\1\141\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\156\1\170\1\uffff\1\154\1\155\1\152\1\161\1\157\2\162\1\157\1\160\1\165\1\154\1\uffff\1\60\4\uffff\2\151\1\60\1\154\2\145\1\165\1\160\1\151\1\141\1\154\2\145\1\163\2\155\1\145\1\uffff\2\60\1\143\1\151\1\145\1\156\1\171\1\145\2\60\1\145\2\165\1\162\2\uffff\1\164\2\162\1\147\1\60\1\141\2\uffff\1\60\2\155\2\60\1\145\1\164\1\60\1\uffff\1\156\2\60\2\uffff\1\60\1\151\1\uffff\1\60\3\uffff\1\145\1\uffff\1\163\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\151\1\165\1\142\1\145\1\162\1\164\1\162\1\157\1\171\1\141\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\156\1\170\1\uffff\2\155\1\152\1\161\1\157\2\162\1\157\1\160\1\165\1\154\1\uffff\1\71\4\uffff\2\151\1\172\1\154\2\145\1\165\1\160\1\151\1\141\1\154\2\145\1\163\2\155\1\145\1\uffff\2\172\1\143\1\151\1\145\1\156\1\171\1\145\2\172\1\145\2\165\1\162\2\uffff\1\164\2\162\1\147\1\172\1\141\2\uffff\1\172\2\155\2\172\1\145\1\164\1\172\1\uffff\1\156\2\172\2\uffff\1\172\1\151\1\uffff\1\172\3\uffff\1\145\1\uffff\1\163\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\15\uffff\1\20\3\uffff\1\25\1\26\2\uffff\1\20\13\uffff\1\17\1\uffff\1\22\1\23\1\24\1\25\21\uffff\1\3\16\uffff\1\13\1\14\6\uffff\1\15\1\16\10\uffff\1\11\3\uffff\1\10\1\4\2\uffff\1\7\1\uffff\1\1\1\2\1\5\1\uffff\1\12\2\uffff\1\6";
    static final String DFA15_specialS =
        "\1\1\15\uffff\1\2\1\0\133\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\7\22\1\20\12\13\7\22\32\15\3\22\1\14\1\15\1\22\1\7\1\10\3\15\1\12\6\15\1\1\1\2\1\3\1\5\1\15\1\4\1\6\1\11\6\15\uff85\22",
            "\1\24\7\uffff\1\23",
            "\1\27\23\uffff\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\37\6\uffff\1\36",
            "\1\40",
            "\12\42",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\43",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "\1\52\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\12\42",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\25\1\67\30\25",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\132",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\133",
            "\1\134",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\137",
            "\1\140",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\142",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\146",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "\1\150",
            "",
            "\1\151",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_BOOLEAN | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='m') ) {s = 1;}

                        else if ( (LA15_0=='n') ) {s = 2;}

                        else if ( (LA15_0=='o') ) {s = 3;}

                        else if ( (LA15_0=='r') ) {s = 4;}

                        else if ( (LA15_0=='p') ) {s = 5;}

                        else if ( (LA15_0=='s') ) {s = 6;}

                        else if ( (LA15_0=='a') ) {s = 7;}

                        else if ( (LA15_0=='b') ) {s = 8;}

                        else if ( (LA15_0=='t') ) {s = 9;}

                        else if ( (LA15_0=='f') ) {s = 10;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 11;}

                        else if ( (LA15_0=='^') ) {s = 12;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='c' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='l')||LA15_0=='q'||(LA15_0>='u' && LA15_0<='z')) ) {s = 13;}

                        else if ( (LA15_0=='\"') ) {s = 14;}

                        else if ( (LA15_0=='\'') ) {s = 15;}

                        else if ( (LA15_0=='/') ) {s = 16;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 17;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_14 = input.LA(1);

                        s = -1;
                        if ( ((LA15_14>='\u0000' && LA15_14<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}