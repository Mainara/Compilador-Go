package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRUCT=5;
    public static final int RULE_DECIMAL_DIGIT=33;
    public static final int RULE_GO=22;
    public static final int T__59=59;
    public static final int RULE_CHAN=9;
    public static final int RULE_FALLTHROUGH=28;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__53=53;
    public static final int RULE_IMAGINARY_LIT=13;
    public static final int T__54=54;
    public static final int RULE_STRING_LIT=6;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_RETURN=24;
    public static final int RULE_ID=48;
    public static final int RULE_INTERPRETED_STRING_LIT=47;
    public static final int RULE_UNICODE_VALUE=39;
    public static final int RULE_INTERFACE=7;
    public static final int RULE_LITTLE_U_VALUE=41;
    public static final int RULE_HEX_BYTE_VALUE=45;
    public static final int RULE_OCTAL_BYTE_VALUE=44;
    public static final int RULE_MUL_OP=17;
    public static final int RULE_INT=38;
    public static final int RULE_SELECT=23;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=50;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_ELSE=19;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=36;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_MAP=8;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=30;
    public static final int RULE_BIG_U_VALUE=42;
    public static final int RULE_ESCAPED_CHAR=43;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=49;
    public static final int RULE_BYTE_VALUE=40;
    public static final int RULE_SL_COMMENT=51;
    public static final int RULE_BREAK=25;
    public static final int T__77=77;
    public static final int RULE_UNICODE_CHAR=32;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_IF=18;
    public static final int T__73=73;
    public static final int RULE_FOR=20;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=16;
    public static final int RULE_OCTAL_DIGIT=34;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_GOTO=27;
    public static final int RULE_WS=52;
    public static final int RULE_CONTINUE=26;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_DEFER=29;
    public static final int RULE_FLOAT_LIT=12;
    public static final int RULE_LETTER=31;
    public static final int RULE_EXPONENT=37;
    public static final int RULE_INT_LIT=11;
    public static final int RULE_RAW_STRING_LIT=46;
    public static final int RULE_REL_OP=15;
    public static final int RULE_HEX_DIGIT=35;
    public static final int RULE_RUNE_LIT=14;
    public static final int RULE_RANGE=21;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '(' )
            // InternalMyDsl.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ')' )
            // InternalMyDsl.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '[' )
            // InternalMyDsl.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( ']' )
            // InternalMyDsl.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '{' )
            // InternalMyDsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( '}' )
            // InternalMyDsl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '*' )
            // InternalMyDsl.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'func' )
            // InternalMyDsl.g:18:9: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( ',' )
            // InternalMyDsl.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '...' )
            // InternalMyDsl.g:20:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( '<-' )
            // InternalMyDsl.g:21:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( ';' )
            // InternalMyDsl.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'const' )
            // InternalMyDsl.g:23:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( '=' )
            // InternalMyDsl.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'type' )
            // InternalMyDsl.g:25:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'var' )
            // InternalMyDsl.g:26:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( ':=' )
            // InternalMyDsl.g:27:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( ':' )
            // InternalMyDsl.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( '.' )
            // InternalMyDsl.g:29:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( '||' )
            // InternalMyDsl.g:30:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( '&&' )
            // InternalMyDsl.g:31:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '++' )
            // InternalMyDsl.g:32:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '--' )
            // InternalMyDsl.g:33:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'switch' )
            // InternalMyDsl.g:34:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'case' )
            // InternalMyDsl.g:35:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'default' )
            // InternalMyDsl.g:36:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'package' )
            // InternalMyDsl.g:37:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'import' )
            // InternalMyDsl.g:38:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9005:23: ( ( '\\n' | '\\r' | '\\n\\r' ) )
            // InternalMyDsl.g:9005:25: ( '\\n' | '\\r' | '\\n\\r' )
            {
            // InternalMyDsl.g:9005:25: ( '\\n' | '\\r' | '\\n\\r' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\r') ) {
                    alt1=3;
                }
                else {
                    alt1=1;}
            }
            else if ( (LA1_0=='\r') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:9005:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9005:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:9005:36: '\\n\\r'
                    {
                    match("\n\r"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_UNICODE_CHAR"
    public final void mRULE_UNICODE_CHAR() throws RecognitionException {
        try {
            // InternalMyDsl.g:9007:28: ( RULE_LETTER )
            // InternalMyDsl.g:9007:30: RULE_LETTER
            {
            mRULE_LETTER(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_CHAR"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:9009:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:9009:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_DECIMAL_DIGIT"
    public final void mRULE_DECIMAL_DIGIT() throws RecognitionException {
        try {
            // InternalMyDsl.g:9011:29: ( '0' .. '9' )
            // InternalMyDsl.g:9011:31: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalMyDsl.g:9013:27: ( '0' .. '7' )
            // InternalMyDsl.g:9013:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalMyDsl.g:9015:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalMyDsl.g:9015:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_BREAK"
    public final void mRULE_BREAK() throws RecognitionException {
        try {
            int _type = RULE_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9017:12: ( 'break' )
            // InternalMyDsl.g:9017:14: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BREAK"

    // $ANTLR start "RULE_INTERFACE"
    public final void mRULE_INTERFACE() throws RecognitionException {
        try {
            int _type = RULE_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9019:16: ( 'interface' )
            // InternalMyDsl.g:9019:18: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERFACE"

    // $ANTLR start "RULE_SELECT"
    public final void mRULE_SELECT() throws RecognitionException {
        try {
            int _type = RULE_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9021:13: ( 'select' )
            // InternalMyDsl.g:9021:15: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SELECT"

    // $ANTLR start "RULE_DEFER"
    public final void mRULE_DEFER() throws RecognitionException {
        try {
            int _type = RULE_DEFER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9023:12: ( 'defer' )
            // InternalMyDsl.g:9023:14: 'defer'
            {
            match("defer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFER"

    // $ANTLR start "RULE_GO"
    public final void mRULE_GO() throws RecognitionException {
        try {
            int _type = RULE_GO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9025:9: ( 'go' )
            // InternalMyDsl.g:9025:11: 'go'
            {
            match("go"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GO"

    // $ANTLR start "RULE_MAP"
    public final void mRULE_MAP() throws RecognitionException {
        try {
            int _type = RULE_MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9027:10: ( 'map' )
            // InternalMyDsl.g:9027:12: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAP"

    // $ANTLR start "RULE_STRUCT"
    public final void mRULE_STRUCT() throws RecognitionException {
        try {
            int _type = RULE_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9029:13: ( 'struct' )
            // InternalMyDsl.g:9029:15: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRUCT"

    // $ANTLR start "RULE_CHAN"
    public final void mRULE_CHAN() throws RecognitionException {
        try {
            int _type = RULE_CHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9031:11: ( 'chan' )
            // InternalMyDsl.g:9031:13: 'chan'
            {
            match("chan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAN"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9033:11: ( 'else' )
            // InternalMyDsl.g:9033:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_GOTO"
    public final void mRULE_GOTO() throws RecognitionException {
        try {
            int _type = RULE_GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9035:11: ( 'goto' )
            // InternalMyDsl.g:9035:13: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GOTO"

    // $ANTLR start "RULE_FALLTHROUGH"
    public final void mRULE_FALLTHROUGH() throws RecognitionException {
        try {
            int _type = RULE_FALLTHROUGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9037:18: ( 'fallthrough' )
            // InternalMyDsl.g:9037:20: 'fallthrough'
            {
            match("fallthrough"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALLTHROUGH"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9039:9: ( 'if' )
            // InternalMyDsl.g:9039:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_RANGE"
    public final void mRULE_RANGE() throws RecognitionException {
        try {
            int _type = RULE_RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9041:12: ( 'range' )
            // InternalMyDsl.g:9041:14: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RANGE"

    // $ANTLR start "RULE_CONTINUE"
    public final void mRULE_CONTINUE() throws RecognitionException {
        try {
            int _type = RULE_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9043:15: ( 'continue' )
            // InternalMyDsl.g:9043:17: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTINUE"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9045:10: ( 'for' )
            // InternalMyDsl.g:9045:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9047:13: ( 'return' )
            // InternalMyDsl.g:9047:15: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9049:17: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalMyDsl.g:9049:19: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:9049:31: ( RULE_LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
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
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_INT_LIT"
    public final void mRULE_INT_LIT() throws RecognitionException {
        try {
            int _type = RULE_INT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9051:14: ( ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ) )
            // InternalMyDsl.g:9051:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
            {
            // InternalMyDsl.g:9051:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='0') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='X'||LA6_2=='x') ) {
                    alt6=3;
                }
                else {
                    alt6=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:9051:17: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:9051:26: ( RULE_DECIMAL_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:9051:26: RULE_DECIMAL_DIGIT
                    	    {
                    	    mRULE_DECIMAL_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9051:46: '0' ( RULE_OCTAL_DIGIT )*
                    {
                    match('0'); 
                    // InternalMyDsl.g:9051:50: ( RULE_OCTAL_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='7')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:9051:50: RULE_OCTAL_DIGIT
                    	    {
                    	    mRULE_OCTAL_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:9051:68: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:9051:82: ( RULE_HEX_DIGIT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')||(LA5_0>='a' && LA5_0<='f')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:9051:82: RULE_HEX_DIGIT
                    	    {
                    	    mRULE_HEX_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
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
    // $ANTLR end "RULE_INT_LIT"

    // $ANTLR start "RULE_FLOAT_LIT"
    public final void mRULE_FLOAT_LIT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9053:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalMyDsl.g:9053:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalMyDsl.g:9053:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:9053:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalMyDsl.g:9053:37: ( RULE_DECIMALS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:9053:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:9053:52: ( RULE_EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:9053:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9053:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:9053:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalMyDsl.g:9053:113: ( RULE_EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:9053:113: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


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
    // $ANTLR end "RULE_FLOAT_LIT"

    // $ANTLR start "RULE_DECIMALS"
    public final void mRULE_DECIMALS() throws RecognitionException {
        try {
            // InternalMyDsl.g:9055:24: ( RULE_INT )
            // InternalMyDsl.g:9055:26: RULE_INT
            {
            mRULE_INT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMALS"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // InternalMyDsl.g:9057:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalMyDsl.g:9057:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:9057:36: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_DECIMALS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_IMAGINARY_LIT"
    public final void mRULE_IMAGINARY_LIT() throws RecognitionException {
        try {
            int _type = RULE_IMAGINARY_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9059:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalMyDsl.g:9059:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalMyDsl.g:9059:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:9059:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9059:37: RULE_FLOAT_LIT
                    {
                    mRULE_FLOAT_LIT(); 

                    }
                    break;

            }

            match('i'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMAGINARY_LIT"

    // $ANTLR start "RULE_RUNE_LIT"
    public final void mRULE_RUNE_LIT() throws RecognitionException {
        try {
            int _type = RULE_RUNE_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9061:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalMyDsl.g:9061:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalMyDsl.g:9061:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                alt13=1;
            }
            else if ( (LA13_0=='\\') ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2=='\"'||LA13_2=='\''||LA13_2=='U'||LA13_2=='\\'||(LA13_2>='a' && LA13_2<='b')||LA13_2=='f'||LA13_2=='n'||LA13_2=='r'||(LA13_2>='t' && LA13_2<='v')) ) {
                    alt13=1;
                }
                else if ( ((LA13_2>='0' && LA13_2<='7')||LA13_2=='x') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:9061:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9061:42: RULE_BYTE_VALUE
                    {
                    mRULE_BYTE_VALUE(); 

                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RUNE_LIT"

    // $ANTLR start "RULE_UNICODE_VALUE"
    public final void mRULE_UNICODE_VALUE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9063:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalMyDsl.g:9063:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalMyDsl.g:9063:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt14=2;
                    }
                    break;
                case 'U':
                    {
                    alt14=3;
                    }
                    break;
                case '\"':
                case '\'':
                case '\\':
                case 'a':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                case 'v':
                    {
                    alt14=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:9063:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9063:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:9063:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:9063:87: RULE_ESCAPED_CHAR
                    {
                    mRULE_ESCAPED_CHAR(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_VALUE"

    // $ANTLR start "RULE_BYTE_VALUE"
    public final void mRULE_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9065:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalMyDsl.g:9065:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalMyDsl.g:9065:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='x') ) {
                    alt15=2;
                }
                else if ( ((LA15_1>='0' && LA15_1<='7')) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:9065:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9065:51: RULE_HEX_BYTE_VALUE
                    {
                    mRULE_HEX_BYTE_VALUE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE_VALUE"

    // $ANTLR start "RULE_OCTAL_BYTE_VALUE"
    public final void mRULE_OCTAL_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9067:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalMyDsl.g:9067:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
            {
            match('\\'); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_BYTE_VALUE"

    // $ANTLR start "RULE_HEX_BYTE_VALUE"
    public final void mRULE_HEX_BYTE_VALUE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9069:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:9069:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('x'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_BYTE_VALUE"

    // $ANTLR start "RULE_LITTLE_U_VALUE"
    public final void mRULE_LITTLE_U_VALUE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9071:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:9071:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITTLE_U_VALUE"

    // $ANTLR start "RULE_BIG_U_VALUE"
    public final void mRULE_BIG_U_VALUE() throws RecognitionException {
        try {
            // InternalMyDsl.g:9073:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:9073:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
            {
            match('\\'); 
            match('U'); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 
            mRULE_HEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIG_U_VALUE"

    // $ANTLR start "RULE_ESCAPED_CHAR"
    public final void mRULE_ESCAPED_CHAR() throws RecognitionException {
        try {
            // InternalMyDsl.g:9075:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalMyDsl.g:9075:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHAR"

    // $ANTLR start "RULE_STRING_LIT"
    public final void mRULE_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9077:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalMyDsl.g:9077:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalMyDsl.g:9077:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\'') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\"') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:9077:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9077:40: RULE_INTERPRETED_STRING_LIT
                    {
                    mRULE_INTERPRETED_STRING_LIT(); 

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
    // $ANTLR end "RULE_STRING_LIT"

    // $ANTLR start "RULE_RAW_STRING_LIT"
    public final void mRULE_RAW_STRING_LIT() throws RecognitionException {
        try {
            // InternalMyDsl.g:9079:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalMyDsl.g:9079:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalMyDsl.g:9079:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }
                else if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:9079:38: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:9079:56: RULE_NEWLINE
            	    {
            	    mRULE_NEWLINE(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RAW_STRING_LIT"

    // $ANTLR start "RULE_INTERPRETED_STRING_LIT"
    public final void mRULE_INTERPRETED_STRING_LIT() throws RecognitionException {
        try {
            // InternalMyDsl.g:9081:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalMyDsl.g:9081:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalMyDsl.g:9081:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    int LA18_3 = input.LA(2);

                    if ( (LA18_3=='\"'||LA18_3=='\''||LA18_3=='U'||LA18_3=='\\'||(LA18_3>='a' && LA18_3<='b')||LA18_3=='f'||LA18_3=='n'||LA18_3=='r'||(LA18_3>='t' && LA18_3<='v')) ) {
                        alt18=1;
                    }
                    else if ( ((LA18_3>='0' && LA18_3<='7')||LA18_3=='x') ) {
                        alt18=2;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:9081:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:9081:64: RULE_BYTE_VALUE
            	    {
            	    mRULE_BYTE_VALUE(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERPRETED_STRING_LIT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9083:16: ( '#' )
            // InternalMyDsl.g:9083:18: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            int _type = RULE_REL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9085:13: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:9085:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:9085:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt19=1;
                }
                break;
            case '!':
                {
                alt19=2;
                }
                break;
            case '<':
                {
                int LA19_3 = input.LA(2);

                if ( (LA19_3=='=') ) {
                    alt19=4;
                }
                else {
                    alt19=3;}
                }
                break;
            case '>':
                {
                int LA19_4 = input.LA(2);

                if ( (LA19_4=='=') ) {
                    alt19=6;
                }
                else {
                    alt19=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:9085:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9085:21: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:9085:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:9085:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:9085:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:9085:39: '>='
                    {
                    match(">="); 


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
    // $ANTLR end "RULE_REL_OP"

    // $ANTLR start "RULE_ADD_OP"
    public final void mRULE_ADD_OP() throws RecognitionException {
        try {
            int _type = RULE_ADD_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9087:13: ( ( '+' | '-' | '|' | '^' ) )
            // InternalMyDsl.g:9087:15: ( '+' | '-' | '|' | '^' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='^'||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_OP"

    // $ANTLR start "RULE_MUL_OP"
    public final void mRULE_MUL_OP() throws RecognitionException {
        try {
            int _type = RULE_MUL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9089:13: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:9089:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:9089:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt20=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt20=1;
                }
                break;
            case '/':
                {
                alt20=2;
                }
                break;
            case '%':
                {
                alt20=3;
                }
                break;
            case '<':
                {
                alt20=4;
                }
                break;
            case '>':
                {
                alt20=5;
                }
                break;
            case '&':
                {
                int LA20_6 = input.LA(2);

                if ( (LA20_6=='^') ) {
                    alt20=7;
                }
                else {
                    alt20=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:9089:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9089:20: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:9089:24: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:9089:28: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:9089:33: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:9089:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:9089:42: '&^'
                    {
                    match("&^"); 


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
    // $ANTLR end "RULE_MUL_OP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:9091:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:9091:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:9091:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:9091:11: '^'
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

            // InternalMyDsl.g:9091:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    break loop22;
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
            // InternalMyDsl.g:9093:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:9093:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:9093:21: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:9093:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

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
            // InternalMyDsl.g:9095:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:9095:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:9095:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\"') ) {
                alt26=1;
            }
            else if ( (LA26_0=='\'') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:9095:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:9095:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:9095:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:9095:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop24;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:9095:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:9095:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:9095:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:9095:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop25;
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
            // InternalMyDsl.g:9097:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:9097:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:9097:24: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='*') ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1=='/') ) {
                        alt27=2;
                    }
                    else if ( ((LA27_1>='\u0000' && LA27_1<='.')||(LA27_1>='0' && LA27_1<='\uFFFF')) ) {
                        alt27=1;
                    }


                }
                else if ( ((LA27_0>='\u0000' && LA27_0<=')')||(LA27_0>='+' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:9097:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // InternalMyDsl.g:9099:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:9099:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:9099:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:9099:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop28;
                }
            } while (true);

            // InternalMyDsl.g:9099:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:9099:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:9099:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyDsl.g:9099:41: '\\r'
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
            // InternalMyDsl.g:9101:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:9101:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:9101:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BREAK | RULE_INTERFACE | RULE_SELECT | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_RETURN | RULE_IDENTIFIER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt32=59;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalMyDsl.g:1:10: T__53
                {
                mT__53(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__54
                {
                mT__54(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__55
                {
                mT__55(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__56
                {
                mT__56(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__57
                {
                mT__57(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__58
                {
                mT__58(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__59
                {
                mT__59(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__60
                {
                mT__60(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__61
                {
                mT__61(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__62
                {
                mT__62(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__63
                {
                mT__63(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__64
                {
                mT__64(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__65
                {
                mT__65(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__66
                {
                mT__66(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__67
                {
                mT__67(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__68
                {
                mT__68(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__69
                {
                mT__69(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__70
                {
                mT__70(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__71
                {
                mT__71(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__72
                {
                mT__72(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__73
                {
                mT__73(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__74
                {
                mT__74(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__75
                {
                mT__75(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__76
                {
                mT__76(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__77
                {
                mT__77(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__78
                {
                mT__78(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__79
                {
                mT__79(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__80
                {
                mT__80(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:189: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:204: RULE_SELECT
                {
                mRULE_SELECT(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:216: RULE_DEFER
                {
                mRULE_DEFER(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:227: RULE_GO
                {
                mRULE_GO(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:235: RULE_MAP
                {
                mRULE_MAP(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:244: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:256: RULE_CHAN
                {
                mRULE_CHAN(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:266: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:276: RULE_GOTO
                {
                mRULE_GOTO(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:286: RULE_FALLTHROUGH
                {
                mRULE_FALLTHROUGH(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:303: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:311: RULE_RANGE
                {
                mRULE_RANGE(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:322: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:336: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:345: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:357: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:373: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:386: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:401: RULE_IMAGINARY_LIT
                {
                mRULE_IMAGINARY_LIT(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:420: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:434: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:450: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:465: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:477: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:489: RULE_MUL_OP
                {
                mRULE_MUL_OP(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:501: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:509: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:521: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:537: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:553: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\3\1\2\1\1";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "9053:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
        }
    }
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\2\56\2\uffff";
    static final String DFA12_maxS =
        "\1\71\1\151\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\37\uffff\1\2\3\uffff\1\3",
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
            return "9059:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA32_eotS =
        "\10\uffff\1\57\1\uffff\1\63\1\45\1\uffff\1\57\1\70\2\57\1\74\1\76\1\51\2\76\12\57\2\120\4\uffff\1\45\1\76\1\51\3\uffff\3\57\1\uffff\1\57\1\uffff\1\146\2\uffff\3\57\1\uffff\2\57\7\uffff\7\57\1\164\1\57\1\167\4\57\2\uffff\1\120\1\146\1\uffff\1\120\15\uffff\2\57\1\u0090\2\uffff\4\57\1\u0098\7\57\1\uffff\2\57\1\uffff\1\u00a3\3\57\1\uffff\2\146\17\uffff\1\u00b3\1\57\2\uffff\1\146\2\57\1\u00b7\1\u00b8\1\u00b9\1\uffff\11\57\1\u00c3\1\uffff\1\u00c4\2\57\1\uffff\1\146\13\uffff\1\57\1\u00d0\1\57\3\uffff\4\57\1\u00d6\3\57\1\u00da\2\uffff\1\u00db\1\57\10\uffff\1\57\1\uffff\1\57\1\u00e3\1\u00e4\1\u00e5\1\57\1\uffff\1\57\1\u00e8\1\57\2\uffff\1\u00ea\4\uffff\2\57\3\uffff\1\u00f1\1\u00f2\1\uffff\1\57\5\uffff\1\57\1\u00f7\2\uffff\1\57\2\uffff\1\57\1\uffff\1\u00fc\2\uffff\1\57\3\uffff\1\u0102\3\uffff";
    static final String DFA32_eofS =
        "\u0103\uffff";
    static final String DFA32_minS =
        "\1\11\7\uffff\1\60\1\uffff\1\56\1\55\1\uffff\1\60\1\75\2\60\1\75\1\174\1\46\1\53\1\55\12\60\2\56\2\0\2\uffff\1\76\1\101\1\52\3\uffff\3\60\1\uffff\1\60\1\uffff\1\60\2\uffff\3\60\1\uffff\2\60\7\uffff\16\60\1\uffff\1\53\1\56\1\60\1\uffff\2\56\2\0\1\uffff\2\0\1\uffff\2\0\4\uffff\3\60\1\uffff\1\53\14\60\1\uffff\2\60\1\uffff\7\60\1\53\5\0\1\uffff\1\0\1\uffff\6\0\2\60\1\uffff\7\60\1\uffff\12\60\1\uffff\5\60\2\0\1\uffff\2\0\1\uffff\4\0\1\uffff\3\60\3\uffff\11\60\2\uffff\2\60\10\0\1\60\1\uffff\5\60\1\uffff\3\60\2\uffff\1\60\4\0\2\60\3\uffff\2\60\1\uffff\1\60\1\uffff\4\0\2\60\2\uffff\1\60\2\0\1\60\1\uffff\1\60\2\0\1\60\1\uffff\2\0\1\60\2\0\1\uffff";
    static final String DFA32_maxS =
        "\1\175\7\uffff\1\172\1\uffff\1\71\1\74\1\uffff\1\172\1\75\2\172\1\75\1\174\1\46\1\53\1\55\12\172\2\151\2\uffff\2\uffff\1\76\1\172\1\57\3\uffff\3\172\1\uffff\1\172\1\uffff\1\151\2\uffff\3\172\1\uffff\2\172\7\uffff\16\172\1\uffff\1\71\2\151\1\uffff\2\151\2\uffff\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff\3\172\1\uffff\1\71\14\172\1\uffff\2\172\1\uffff\4\172\1\71\2\151\1\71\5\uffff\1\uffff\1\uffff\1\uffff\6\uffff\2\172\1\uffff\1\71\1\151\5\172\1\uffff\12\172\1\uffff\3\172\1\71\1\151\2\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\uffff\3\172\3\uffff\11\172\2\uffff\2\172\10\uffff\1\172\1\uffff\5\172\1\uffff\3\172\2\uffff\1\172\4\uffff\2\172\3\uffff\2\172\1\uffff\1\172\1\uffff\4\uffff\2\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\2\uffff\1\172\2\uffff\1\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\2\uffff\1\14\27\uffff\1\63\1\64\3\uffff\1\66\1\73\1\7\3\uffff\1\55\1\uffff\1\12\1\uffff\1\23\1\13\3\uffff\1\16\2\uffff\1\21\1\22\1\24\1\65\1\25\1\26\1\27\16\uffff\1\56\3\uffff\1\60\4\uffff\1\62\2\uffff\1\70\2\uffff\1\62\1\67\1\71\1\72\3\uffff\1\57\15\uffff\1\50\2\uffff\1\41\15\uffff\1\61\1\uffff\1\62\10\uffff\1\53\7\uffff\1\20\12\uffff\1\42\7\uffff\1\61\2\uffff\1\61\4\uffff\1\10\3\uffff\1\31\1\44\1\17\11\uffff\1\46\1\45\13\uffff\1\15\5\uffff\1\40\3\uffff\1\35\1\51\7\uffff\1\30\1\37\1\43\2\uffff\1\34\1\uffff\1\54\6\uffff\1\32\1\33\4\uffff\1\52\4\uffff\1\36\5\uffff\1\47";
    static final String DFA32_specialS =
        "\42\uffff\1\1\1\5\63\uffff\1\4\1\44\1\uffff\1\14\1\62\1\uffff\1\50\1\3\41\uffff\1\63\1\0\1\20\1\56\1\42\1\uffff\1\2\1\uffff\1\16\1\37\1\40\1\41\1\31\1\12\33\uffff\1\46\1\52\1\uffff\1\45\1\43\1\uffff\1\22\1\26\1\17\1\13\24\uffff\1\47\1\53\1\10\1\6\1\23\1\27\1\25\1\15\16\uffff\1\51\1\54\1\24\1\30\12\uffff\1\7\1\55\1\21\1\32\5\uffff\1\57\1\34\3\uffff\1\60\1\35\2\uffff\1\61\1\36\1\uffff\1\11\1\33\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\45\1\43\1\44\1\uffff\1\51\1\23\1\42\1\1\1\2\1\7\1\24\1\11\1\25\1\12\1\50\1\41\11\40\1\21\1\14\1\13\1\16\1\46\2\uffff\32\37\1\3\1\uffff\1\4\1\47\1\37\1\uffff\1\37\1\32\1\15\1\27\1\35\1\10\1\33\1\37\1\31\3\37\1\34\2\37\1\30\1\37\1\36\1\26\1\17\1\37\1\20\4\37\1\5\1\22\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\55\15\60\1\56\5\60\1\54\5\60",
            "",
            "\1\61\1\uffff\12\62",
            "\1\64\16\uffff\1\51",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\66\6\60\1\67\6\60\1\65\13\60",
            "\1\45",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\71\1\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\72\31\60",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\103\16\60\1\104\2\60\1\102\3\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\105\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\106\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\111\6\60\1\107\1\110\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\112\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\113\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\114\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\115\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\116\3\60\1\117\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\123\1\uffff\12\122\13\uffff\1\121\37\uffff\1\121\3\uffff\1\124",
            "\1\123\1\uffff\10\125\2\126\13\uffff\1\121\37\uffff\1\121\3\uffff\1\124",
            "\12\134\1\132\2\134\1\133\31\134\1\131\31\134\32\130\1\134\1\127\2\134\1\130\1\134\32\130\uff85\134",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            "",
            "",
            "\1\51",
            "\32\140\4\uffff\1\140\1\uffff\32\140",
            "\1\141\4\uffff\1\142",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\143\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\144\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\145\10\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\62\13\uffff\1\147\37\uffff\1\147\3\uffff\1\124",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\150\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\151\7\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\152\31\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\153\12\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\154\10\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\155\21\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\156\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\157\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\160\24\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\161\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\162\12\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\163\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\165\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\166\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\170\12\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\171\7\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\172\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\173\6\60",
            "",
            "\1\174\1\uffff\1\174\2\uffff\12\175",
            "\1\123\1\uffff\12\122\13\uffff\1\121\37\uffff\1\121\3\uffff\1\124",
            "\12\176\13\uffff\1\177\37\uffff\1\177\3\uffff\1\124",
            "",
            "\1\123\1\uffff\10\125\2\126\13\uffff\1\121\37\uffff\1\121\3\uffff\1\124",
            "\1\123\1\uffff\12\126\13\uffff\1\121\37\uffff\1\121\3\uffff\1\124",
            "\42\134\1\u0082\4\134\1\u0082\10\134\10\u0084\35\134\1\u0081\6\134\1\u0082\4\134\2\u0082\3\134\1\u0082\7\134\1\u0082\3\134\1\u0082\1\134\1\u0082\1\u0080\1\u0082\1\134\1\u0083\uff87\134",
            "\12\134\1\132\2\134\1\133\31\134\1\u0085\31\134\32\u0086\4\134\1\u0086\1\134\32\u0086\uff85\134",
            "",
            "\12\134\1\132\2\134\1\u0088\31\134\1\131\31\134\32\u0086\4\134\1\u0086\1\134\32\u0086\uff85\134",
            "\12\134\1\132\2\134\1\133\31\134\1\131\31\134\32\u0086\4\134\1\u0086\1\134\32\u0086\uff85\134",
            "",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            "\42\134\1\u008b\4\134\1\u008b\10\134\10\u008d\35\134\1\u008a\6\134\1\u008b\4\134\2\u008b\3\134\1\u008b\7\134\1\u008b\3\134\1\u008b\1\134\1\u008b\1\u0089\1\u008b\1\134\1\u008c\uff87\134",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u008e\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u008f\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0091\1\uffff\1\u0091\2\uffff\12\u0092",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0093\1\u0094\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0095\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0096\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0097\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0099\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u009a\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u009b\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u009c\3\60\1\u009d\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\12\60\1\u009e\17\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u009f\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00a0\25\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00a1\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u00a2\13\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00a4\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u00a5\23\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00a6\5\60",
            "\12\175",
            "\12\175\57\uffff\1\124",
            "\12\176\13\uffff\1\177\37\uffff\1\177\3\uffff\1\124",
            "\1\u00a7\1\uffff\1\u00a7\2\uffff\12\u00a8",
            "\60\134\12\u00a9\7\134\6\u00a9\32\134\6\u00a9\uff99\134",
            "\60\134\12\u00aa\7\134\6\u00aa\32\134\6\u00aa\uff99\134",
            "\47\134\1\u00ab\uffd8\134",
            "\60\134\12\u00ac\7\134\6\u00ac\32\134\6\u00ac\uff99\134",
            "\60\134\10\u00ad\uffc8\134",
            "",
            "\12\134\1\132\2\134\1\133\31\134\1\131\31\134\32\u0086\4\134\1\u0086\1\134\32\u0086\uff85\134",
            "",
            "\12\134\1\132\2\134\1\133\31\134\1\131\31\134\32\u0086\4\134\1\u0086\1\134\32\u0086\uff85\134",
            "\60\134\12\u00af\7\134\6\u00af\32\134\6\u00af\uff99\134",
            "\60\134\12\u00b0\7\134\6\u00b0\32\134\6\u00b0\uff99\134",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            "\60\134\12\u00b1\7\134\6\u00b1\32\134\6\u00b1\uff99\134",
            "\60\134\10\u00b2\uffc8\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b4\6\60",
            "",
            "\12\u0092",
            "\12\u0092\57\uffff\1\124",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b5\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00b6\21\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00ba\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00bb\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00bc\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00bd\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00be\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00bf\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00c0\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00c1\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\12\60\1\u00c2\17\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c5\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00c6\10\60",
            "\12\u00a8",
            "\12\u00a8\57\uffff\1\124",
            "\60\134\12\u00c7\7\134\6\u00c7\32\134\6\u00c7\uff99\134",
            "\60\134\12\u00c8\7\134\6\u00c8\32\134\6\u00c8\uff99\134",
            "",
            "\60\134\12\u00c9\7\134\6\u00c9\32\134\6\u00c9\uff99\134",
            "\60\134\10\u00ca\uffc8\134",
            "",
            "\60\134\12\u00cb\7\134\6\u00cb\32\134\6\u00cb\uff99\134",
            "\60\134\12\u00cc\7\134\6\u00cc\32\134\6\u00cc\uff99\134",
            "\60\134\12\u00cd\7\134\6\u00cd\32\134\6\u00cd\uff99\134",
            "\60\134\10\u00ce\uffc8\134",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00cf\22\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00d1\14\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00d2\22\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00d3\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00d4\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00d5\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u00d7\23\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00d8\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u00d9\24\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00dc\14\60",
            "\60\134\12\u00dd\7\134\6\u00dd\32\134\6\u00dd\uff99\134",
            "\60\134\12\u00de\7\134\6\u00de\32\134\6\u00de\uff99\134",
            "\47\134\1\u00ab\uffd8\134",
            "\47\134\1\u00ab\uffd8\134",
            "\60\134\12\u00df\7\134\6\u00df\32\134\6\u00df\uff99\134",
            "\60\134\12\u00e0\7\134\6\u00e0\32\134\6\u00e0\uff99\134",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00e1\10\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00e2\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00e6\6\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00e7\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00e9\31\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\60\134\12\u00eb\7\134\6\u00eb\32\134\6\u00eb\uff99\134",
            "\60\134\12\u00ec\7\134\6\u00ec\32\134\6\u00ec\uff99\134",
            "\60\134\12\u00ed\7\134\6\u00ed\32\134\6\u00ed\uff99\134",
            "\60\134\12\u00ee\7\134\6\u00ee\32\134\6\u00ee\uff99\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u00ef\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00f0\25\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00f3\27\60",
            "",
            "\47\134\1\u00ab\uffd8\134",
            "\60\134\12\u00f4\7\134\6\u00f4\32\134\6\u00f4\uff99\134",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            "\60\134\12\u00f5\7\134\6\u00f5\32\134\6\u00f5\uff99\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00f6\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00f8\25\60",
            "\60\134\12\u00f9\7\134\6\u00f9\32\134\6\u00f9\uff99\134",
            "\60\134\12\u00fa\7\134\6\u00fa\32\134\6\u00fa\uff99\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u00fb\23\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\60\134\12\u00fd\7\134\6\u00fd\32\134\6\u00fd\uff99\134",
            "\60\134\12\u00fe\7\134\6\u00fe\32\134\6\u00fe\uff99\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00ff\22\60",
            "",
            "\60\134\12\u0100\7\134\6\u0100\32\134\6\u0100\uff99\134",
            "\60\134\12\u0101\7\134\6\u0101\32\134\6\u0101\uff99\134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\47\134\1\u00ab\uffd8\134",
            "\42\134\1\137\36\134\32\135\1\134\1\136\2\134\1\135\1\134\32\135\uff85\134",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BREAK | RULE_INTERFACE | RULE_SELECT | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_RETURN | RULE_IDENTIFIER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_129 = input.LA(1);

                        s = -1;
                        if ( ((LA32_129>='\u0000' && LA32_129<='/')||(LA32_129>=':' && LA32_129<='@')||(LA32_129>='G' && LA32_129<='`')||(LA32_129>='g' && LA32_129<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_129>='0' && LA32_129<='9')||(LA32_129>='A' && LA32_129<='F')||(LA32_129>='a' && LA32_129<='f')) ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_34 = input.LA(1);

                        s = -1;
                        if ( (LA32_34=='\\') ) {s = 87;}

                        else if ( ((LA32_34>='A' && LA32_34<='Z')||LA32_34=='_'||(LA32_34>='a' && LA32_34<='z')) ) {s = 88;}

                        else if ( (LA32_34=='\'') ) {s = 89;}

                        else if ( (LA32_34=='\n') ) {s = 90;}

                        else if ( (LA32_34=='\r') ) {s = 91;}

                        else if ( ((LA32_34>='\u0000' && LA32_34<='\t')||(LA32_34>='\u000B' && LA32_34<='\f')||(LA32_34>='\u000E' && LA32_34<='&')||(LA32_34>='(' && LA32_34<='@')||LA32_34=='['||(LA32_34>=']' && LA32_34<='^')||LA32_34=='`'||(LA32_34>='{' && LA32_34<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_134 = input.LA(1);

                        s = -1;
                        if ( (LA32_134=='\'') ) {s = 89;}

                        else if ( ((LA32_134>='\u0000' && LA32_134<='\t')||(LA32_134>='\u000B' && LA32_134<='\f')||(LA32_134>='\u000E' && LA32_134<='&')||(LA32_134>='(' && LA32_134<='@')||(LA32_134>='[' && LA32_134<='^')||LA32_134=='`'||(LA32_134>='{' && LA32_134<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_134>='A' && LA32_134<='Z')||LA32_134=='_'||(LA32_134>='a' && LA32_134<='z')) ) {s = 134;}

                        else if ( (LA32_134=='\n') ) {s = 90;}

                        else if ( (LA32_134=='\r') ) {s = 91;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_94 = input.LA(1);

                        s = -1;
                        if ( (LA32_94=='u') ) {s = 137;}

                        else if ( (LA32_94=='U') ) {s = 138;}

                        else if ( (LA32_94=='\"'||LA32_94=='\''||LA32_94=='\\'||(LA32_94>='a' && LA32_94<='b')||LA32_94=='f'||LA32_94=='n'||LA32_94=='r'||LA32_94=='t'||LA32_94=='v') ) {s = 139;}

                        else if ( (LA32_94=='x') ) {s = 140;}

                        else if ( ((LA32_94>='0' && LA32_94<='7')) ) {s = 141;}

                        else if ( ((LA32_94>='\u0000' && LA32_94<='!')||(LA32_94>='#' && LA32_94<='&')||(LA32_94>='(' && LA32_94<='/')||(LA32_94>='8' && LA32_94<='T')||(LA32_94>='V' && LA32_94<='[')||(LA32_94>=']' && LA32_94<='`')||(LA32_94>='c' && LA32_94<='e')||(LA32_94>='g' && LA32_94<='m')||(LA32_94>='o' && LA32_94<='q')||LA32_94=='s'||LA32_94=='w'||(LA32_94>='y' && LA32_94<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_87 = input.LA(1);

                        s = -1;
                        if ( (LA32_87=='u') ) {s = 128;}

                        else if ( (LA32_87=='U') ) {s = 129;}

                        else if ( (LA32_87=='\"'||LA32_87=='\''||LA32_87=='\\'||(LA32_87>='a' && LA32_87<='b')||LA32_87=='f'||LA32_87=='n'||LA32_87=='r'||LA32_87=='t'||LA32_87=='v') ) {s = 130;}

                        else if ( (LA32_87=='x') ) {s = 131;}

                        else if ( ((LA32_87>='0' && LA32_87<='7')) ) {s = 132;}

                        else if ( ((LA32_87>='\u0000' && LA32_87<='!')||(LA32_87>='#' && LA32_87<='&')||(LA32_87>='(' && LA32_87<='/')||(LA32_87>='8' && LA32_87<='T')||(LA32_87>='V' && LA32_87<='[')||(LA32_87>=']' && LA32_87<='`')||(LA32_87>='c' && LA32_87<='e')||(LA32_87>='g' && LA32_87<='m')||(LA32_87>='o' && LA32_87<='q')||LA32_87=='s'||LA32_87=='w'||(LA32_87>='y' && LA32_87<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_35 = input.LA(1);

                        s = -1;
                        if ( ((LA32_35>='A' && LA32_35<='Z')||LA32_35=='_'||(LA32_35>='a' && LA32_35<='z')) ) {s = 93;}

                        else if ( (LA32_35=='\\') ) {s = 94;}

                        else if ( (LA32_35=='\"') ) {s = 95;}

                        else if ( ((LA32_35>='\u0000' && LA32_35<='!')||(LA32_35>='#' && LA32_35<='@')||LA32_35=='['||(LA32_35>=']' && LA32_35<='^')||LA32_35=='`'||(LA32_35>='{' && LA32_35<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_202 = input.LA(1);

                        s = -1;
                        if ( (LA32_202=='\'') ) {s = 171;}

                        else if ( ((LA32_202>='\u0000' && LA32_202<='&')||(LA32_202>='(' && LA32_202<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_235 = input.LA(1);

                        s = -1;
                        if ( (LA32_235=='\'') ) {s = 171;}

                        else if ( ((LA32_235>='\u0000' && LA32_235<='&')||(LA32_235>='(' && LA32_235<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_201 = input.LA(1);

                        s = -1;
                        if ( (LA32_201=='\'') ) {s = 171;}

                        else if ( ((LA32_201>='\u0000' && LA32_201<='&')||(LA32_201>='(' && LA32_201<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_256 = input.LA(1);

                        s = -1;
                        if ( (LA32_256=='\'') ) {s = 171;}

                        else if ( ((LA32_256>='\u0000' && LA32_256<='&')||(LA32_256>='(' && LA32_256<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_141 = input.LA(1);

                        s = -1;
                        if ( ((LA32_141>='\u0000' && LA32_141<='/')||(LA32_141>='8' && LA32_141<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_141>='0' && LA32_141<='7')) ) {s = 178;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_178 = input.LA(1);

                        s = -1;
                        if ( ((LA32_178>='0' && LA32_178<='7')) ) {s = 206;}

                        else if ( ((LA32_178>='\u0000' && LA32_178<='/')||(LA32_178>='8' && LA32_178<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_90 = input.LA(1);

                        s = -1;
                        if ( (LA32_90=='\r') ) {s = 136;}

                        else if ( (LA32_90=='\'') ) {s = 89;}

                        else if ( ((LA32_90>='A' && LA32_90<='Z')||LA32_90=='_'||(LA32_90>='a' && LA32_90<='z')) ) {s = 134;}

                        else if ( (LA32_90=='\n') ) {s = 90;}

                        else if ( ((LA32_90>='\u0000' && LA32_90<='\t')||(LA32_90>='\u000B' && LA32_90<='\f')||(LA32_90>='\u000E' && LA32_90<='&')||(LA32_90>='(' && LA32_90<='@')||(LA32_90>='[' && LA32_90<='^')||LA32_90=='`'||(LA32_90>='{' && LA32_90<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_206 = input.LA(1);

                        s = -1;
                        if ( (LA32_206=='\"') ) {s = 95;}

                        else if ( ((LA32_206>='A' && LA32_206<='Z')||LA32_206=='_'||(LA32_206>='a' && LA32_206<='z')) ) {s = 93;}

                        else if ( (LA32_206=='\\') ) {s = 94;}

                        else if ( ((LA32_206>='\u0000' && LA32_206<='!')||(LA32_206>='#' && LA32_206<='@')||LA32_206=='['||(LA32_206>=']' && LA32_206<='^')||LA32_206=='`'||(LA32_206>='{' && LA32_206<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_136 = input.LA(1);

                        s = -1;
                        if ( (LA32_136=='\'') ) {s = 89;}

                        else if ( ((LA32_136>='A' && LA32_136<='Z')||LA32_136=='_'||(LA32_136>='a' && LA32_136<='z')) ) {s = 134;}

                        else if ( (LA32_136=='\n') ) {s = 90;}

                        else if ( (LA32_136=='\r') ) {s = 91;}

                        else if ( ((LA32_136>='\u0000' && LA32_136<='\t')||(LA32_136>='\u000B' && LA32_136<='\f')||(LA32_136>='\u000E' && LA32_136<='&')||(LA32_136>='(' && LA32_136<='@')||(LA32_136>='[' && LA32_136<='^')||LA32_136=='`'||(LA32_136>='{' && LA32_136<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_177 = input.LA(1);

                        s = -1;
                        if ( ((LA32_177>='0' && LA32_177<='9')||(LA32_177>='A' && LA32_177<='F')||(LA32_177>='a' && LA32_177<='f')) ) {s = 205;}

                        else if ( ((LA32_177>='\u0000' && LA32_177<='/')||(LA32_177>=':' && LA32_177<='@')||(LA32_177>='G' && LA32_177<='`')||(LA32_177>='g' && LA32_177<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_130 = input.LA(1);

                        s = -1;
                        if ( (LA32_130=='\'') ) {s = 171;}

                        else if ( ((LA32_130>='\u0000' && LA32_130<='&')||(LA32_130>='(' && LA32_130<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_237 = input.LA(1);

                        s = -1;
                        if ( (LA32_237=='\"') ) {s = 95;}

                        else if ( ((LA32_237>='A' && LA32_237<='Z')||LA32_237=='_'||(LA32_237>='a' && LA32_237<='z')) ) {s = 93;}

                        else if ( (LA32_237=='\\') ) {s = 94;}

                        else if ( ((LA32_237>='\u0000' && LA32_237<='!')||(LA32_237>='#' && LA32_237<='@')||LA32_237=='['||(LA32_237>=']' && LA32_237<='^')||LA32_237=='`'||(LA32_237>='{' && LA32_237<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_175 = input.LA(1);

                        s = -1;
                        if ( ((LA32_175>='\u0000' && LA32_175<='/')||(LA32_175>=':' && LA32_175<='@')||(LA32_175>='G' && LA32_175<='`')||(LA32_175>='g' && LA32_175<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_175>='0' && LA32_175<='9')||(LA32_175>='A' && LA32_175<='F')||(LA32_175>='a' && LA32_175<='f')) ) {s = 203;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_203 = input.LA(1);

                        s = -1;
                        if ( ((LA32_203>='\u0000' && LA32_203<='/')||(LA32_203>=':' && LA32_203<='@')||(LA32_203>='G' && LA32_203<='`')||(LA32_203>='g' && LA32_203<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_203>='0' && LA32_203<='9')||(LA32_203>='A' && LA32_203<='F')||(LA32_203>='a' && LA32_203<='f')) ) {s = 223;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_223 = input.LA(1);

                        s = -1;
                        if ( ((LA32_223>='\u0000' && LA32_223<='/')||(LA32_223>=':' && LA32_223<='@')||(LA32_223>='G' && LA32_223<='`')||(LA32_223>='g' && LA32_223<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_223>='0' && LA32_223<='9')||(LA32_223>='A' && LA32_223<='F')||(LA32_223>='a' && LA32_223<='f')) ) {s = 237;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_205 = input.LA(1);

                        s = -1;
                        if ( (LA32_205=='\"') ) {s = 95;}

                        else if ( ((LA32_205>='A' && LA32_205<='Z')||LA32_205=='_'||(LA32_205>='a' && LA32_205<='z')) ) {s = 93;}

                        else if ( (LA32_205=='\\') ) {s = 94;}

                        else if ( ((LA32_205>='\u0000' && LA32_205<='!')||(LA32_205>='#' && LA32_205<='@')||LA32_205=='['||(LA32_205>=']' && LA32_205<='^')||LA32_205=='`'||(LA32_205>='{' && LA32_205<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_176 = input.LA(1);

                        s = -1;
                        if ( ((LA32_176>='\u0000' && LA32_176<='/')||(LA32_176>=':' && LA32_176<='@')||(LA32_176>='G' && LA32_176<='`')||(LA32_176>='g' && LA32_176<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_176>='0' && LA32_176<='9')||(LA32_176>='A' && LA32_176<='F')||(LA32_176>='a' && LA32_176<='f')) ) {s = 204;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_204 = input.LA(1);

                        s = -1;
                        if ( ((LA32_204>='\u0000' && LA32_204<='/')||(LA32_204>=':' && LA32_204<='@')||(LA32_204>='G' && LA32_204<='`')||(LA32_204>='g' && LA32_204<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_204>='0' && LA32_204<='9')||(LA32_204>='A' && LA32_204<='F')||(LA32_204>='a' && LA32_204<='f')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_224 = input.LA(1);

                        s = -1;
                        if ( ((LA32_224>='\u0000' && LA32_224<='/')||(LA32_224>=':' && LA32_224<='@')||(LA32_224>='G' && LA32_224<='`')||(LA32_224>='g' && LA32_224<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_224>='0' && LA32_224<='9')||(LA32_224>='A' && LA32_224<='F')||(LA32_224>='a' && LA32_224<='f')) ) {s = 238;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_140 = input.LA(1);

                        s = -1;
                        if ( ((LA32_140>='\u0000' && LA32_140<='/')||(LA32_140>=':' && LA32_140<='@')||(LA32_140>='G' && LA32_140<='`')||(LA32_140>='g' && LA32_140<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_140>='0' && LA32_140<='9')||(LA32_140>='A' && LA32_140<='F')||(LA32_140>='a' && LA32_140<='f')) ) {s = 177;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_238 = input.LA(1);

                        s = -1;
                        if ( ((LA32_238>='0' && LA32_238<='9')||(LA32_238>='A' && LA32_238<='F')||(LA32_238>='a' && LA32_238<='f')) ) {s = 245;}

                        else if ( ((LA32_238>='\u0000' && LA32_238<='/')||(LA32_238>=':' && LA32_238<='@')||(LA32_238>='G' && LA32_238<='`')||(LA32_238>='g' && LA32_238<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_257 = input.LA(1);

                        s = -1;
                        if ( (LA32_257=='\"') ) {s = 95;}

                        else if ( ((LA32_257>='A' && LA32_257<='Z')||LA32_257=='_'||(LA32_257>='a' && LA32_257<='z')) ) {s = 93;}

                        else if ( (LA32_257=='\\') ) {s = 94;}

                        else if ( ((LA32_257>='\u0000' && LA32_257<='!')||(LA32_257>='#' && LA32_257<='@')||LA32_257=='['||(LA32_257>=']' && LA32_257<='^')||LA32_257=='`'||(LA32_257>='{' && LA32_257<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_245 = input.LA(1);

                        s = -1;
                        if ( ((LA32_245>='0' && LA32_245<='9')||(LA32_245>='A' && LA32_245<='F')||(LA32_245>='a' && LA32_245<='f')) ) {s = 250;}

                        else if ( ((LA32_245>='\u0000' && LA32_245<='/')||(LA32_245>=':' && LA32_245<='@')||(LA32_245>='G' && LA32_245<='`')||(LA32_245>='g' && LA32_245<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_250 = input.LA(1);

                        s = -1;
                        if ( ((LA32_250>='0' && LA32_250<='9')||(LA32_250>='A' && LA32_250<='F')||(LA32_250>='a' && LA32_250<='f')) ) {s = 254;}

                        else if ( ((LA32_250>='\u0000' && LA32_250<='/')||(LA32_250>=':' && LA32_250<='@')||(LA32_250>='G' && LA32_250<='`')||(LA32_250>='g' && LA32_250<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_254 = input.LA(1);

                        s = -1;
                        if ( ((LA32_254>='0' && LA32_254<='9')||(LA32_254>='A' && LA32_254<='F')||(LA32_254>='a' && LA32_254<='f')) ) {s = 257;}

                        else if ( ((LA32_254>='\u0000' && LA32_254<='/')||(LA32_254>=':' && LA32_254<='@')||(LA32_254>='G' && LA32_254<='`')||(LA32_254>='g' && LA32_254<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_137 = input.LA(1);

                        s = -1;
                        if ( ((LA32_137>='\u0000' && LA32_137<='/')||(LA32_137>=':' && LA32_137<='@')||(LA32_137>='G' && LA32_137<='`')||(LA32_137>='g' && LA32_137<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_137>='0' && LA32_137<='9')||(LA32_137>='A' && LA32_137<='F')||(LA32_137>='a' && LA32_137<='f')) ) {s = 175;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_138 = input.LA(1);

                        s = -1;
                        if ( ((LA32_138>='\u0000' && LA32_138<='/')||(LA32_138>=':' && LA32_138<='@')||(LA32_138>='G' && LA32_138<='`')||(LA32_138>='g' && LA32_138<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_138>='0' && LA32_138<='9')||(LA32_138>='A' && LA32_138<='F')||(LA32_138>='a' && LA32_138<='f')) ) {s = 176;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_139 = input.LA(1);

                        s = -1;
                        if ( (LA32_139=='\"') ) {s = 95;}

                        else if ( (LA32_139=='\\') ) {s = 94;}

                        else if ( ((LA32_139>='A' && LA32_139<='Z')||LA32_139=='_'||(LA32_139>='a' && LA32_139<='z')) ) {s = 93;}

                        else if ( ((LA32_139>='\u0000' && LA32_139<='!')||(LA32_139>='#' && LA32_139<='@')||LA32_139=='['||(LA32_139>=']' && LA32_139<='^')||LA32_139=='`'||(LA32_139>='{' && LA32_139<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_132 = input.LA(1);

                        s = -1;
                        if ( ((LA32_132>='0' && LA32_132<='7')) ) {s = 173;}

                        else if ( ((LA32_132>='\u0000' && LA32_132<='/')||(LA32_132>='8' && LA32_132<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_173 = input.LA(1);

                        s = -1;
                        if ( ((LA32_173>='0' && LA32_173<='7')) ) {s = 202;}

                        else if ( ((LA32_173>='\u0000' && LA32_173<='/')||(LA32_173>='8' && LA32_173<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_88 = input.LA(1);

                        s = -1;
                        if ( (LA32_88=='\'') ) {s = 133;}

                        else if ( ((LA32_88>='\u0000' && LA32_88<='\t')||(LA32_88>='\u000B' && LA32_88<='\f')||(LA32_88>='\u000E' && LA32_88<='&')||(LA32_88>='(' && LA32_88<='@')||(LA32_88>='[' && LA32_88<='^')||LA32_88=='`'||(LA32_88>='{' && LA32_88<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_88>='A' && LA32_88<='Z')||LA32_88=='_'||(LA32_88>='a' && LA32_88<='z')) ) {s = 134;}

                        else if ( (LA32_88=='\n') ) {s = 90;}

                        else if ( (LA32_88=='\r') ) {s = 91;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_172 = input.LA(1);

                        s = -1;
                        if ( ((LA32_172>='0' && LA32_172<='9')||(LA32_172>='A' && LA32_172<='F')||(LA32_172>='a' && LA32_172<='f')) ) {s = 201;}

                        else if ( ((LA32_172>='\u0000' && LA32_172<='/')||(LA32_172>=':' && LA32_172<='@')||(LA32_172>='G' && LA32_172<='`')||(LA32_172>='g' && LA32_172<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_169 = input.LA(1);

                        s = -1;
                        if ( ((LA32_169>='\u0000' && LA32_169<='/')||(LA32_169>=':' && LA32_169<='@')||(LA32_169>='G' && LA32_169<='`')||(LA32_169>='g' && LA32_169<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_169>='0' && LA32_169<='9')||(LA32_169>='A' && LA32_169<='F')||(LA32_169>='a' && LA32_169<='f')) ) {s = 199;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_199 = input.LA(1);

                        s = -1;
                        if ( ((LA32_199>='0' && LA32_199<='9')||(LA32_199>='A' && LA32_199<='F')||(LA32_199>='a' && LA32_199<='f')) ) {s = 221;}

                        else if ( ((LA32_199>='\u0000' && LA32_199<='/')||(LA32_199>=':' && LA32_199<='@')||(LA32_199>='G' && LA32_199<='`')||(LA32_199>='g' && LA32_199<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_93 = input.LA(1);

                        s = -1;
                        if ( (LA32_93=='\"') ) {s = 95;}

                        else if ( ((LA32_93>='A' && LA32_93<='Z')||LA32_93=='_'||(LA32_93>='a' && LA32_93<='z')) ) {s = 93;}

                        else if ( (LA32_93=='\\') ) {s = 94;}

                        else if ( ((LA32_93>='\u0000' && LA32_93<='!')||(LA32_93>='#' && LA32_93<='@')||LA32_93=='['||(LA32_93>=']' && LA32_93<='^')||LA32_93=='`'||(LA32_93>='{' && LA32_93<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_221 = input.LA(1);

                        s = -1;
                        if ( ((LA32_221>='0' && LA32_221<='9')||(LA32_221>='A' && LA32_221<='F')||(LA32_221>='a' && LA32_221<='f')) ) {s = 235;}

                        else if ( ((LA32_221>='\u0000' && LA32_221<='/')||(LA32_221>=':' && LA32_221<='@')||(LA32_221>='G' && LA32_221<='`')||(LA32_221>='g' && LA32_221<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_170 = input.LA(1);

                        s = -1;
                        if ( ((LA32_170>='\u0000' && LA32_170<='/')||(LA32_170>=':' && LA32_170<='@')||(LA32_170>='G' && LA32_170<='`')||(LA32_170>='g' && LA32_170<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_170>='0' && LA32_170<='9')||(LA32_170>='A' && LA32_170<='F')||(LA32_170>='a' && LA32_170<='f')) ) {s = 200;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_200 = input.LA(1);

                        s = -1;
                        if ( ((LA32_200>='\u0000' && LA32_200<='/')||(LA32_200>=':' && LA32_200<='@')||(LA32_200>='G' && LA32_200<='`')||(LA32_200>='g' && LA32_200<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_200>='0' && LA32_200<='9')||(LA32_200>='A' && LA32_200<='F')||(LA32_200>='a' && LA32_200<='f')) ) {s = 222;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_222 = input.LA(1);

                        s = -1;
                        if ( ((LA32_222>='0' && LA32_222<='9')||(LA32_222>='A' && LA32_222<='F')||(LA32_222>='a' && LA32_222<='f')) ) {s = 236;}

                        else if ( ((LA32_222>='\u0000' && LA32_222<='/')||(LA32_222>=':' && LA32_222<='@')||(LA32_222>='G' && LA32_222<='`')||(LA32_222>='g' && LA32_222<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_236 = input.LA(1);

                        s = -1;
                        if ( ((LA32_236>='0' && LA32_236<='9')||(LA32_236>='A' && LA32_236<='F')||(LA32_236>='a' && LA32_236<='f')) ) {s = 244;}

                        else if ( ((LA32_236>='\u0000' && LA32_236<='/')||(LA32_236>=':' && LA32_236<='@')||(LA32_236>='G' && LA32_236<='`')||(LA32_236>='g' && LA32_236<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_131 = input.LA(1);

                        s = -1;
                        if ( ((LA32_131>='\u0000' && LA32_131<='/')||(LA32_131>=':' && LA32_131<='@')||(LA32_131>='G' && LA32_131<='`')||(LA32_131>='g' && LA32_131<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_131>='0' && LA32_131<='9')||(LA32_131>='A' && LA32_131<='F')||(LA32_131>='a' && LA32_131<='f')) ) {s = 172;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_244 = input.LA(1);

                        s = -1;
                        if ( ((LA32_244>='0' && LA32_244<='9')||(LA32_244>='A' && LA32_244<='F')||(LA32_244>='a' && LA32_244<='f')) ) {s = 249;}

                        else if ( ((LA32_244>='\u0000' && LA32_244<='/')||(LA32_244>=':' && LA32_244<='@')||(LA32_244>='G' && LA32_244<='`')||(LA32_244>='g' && LA32_244<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_249 = input.LA(1);

                        s = -1;
                        if ( ((LA32_249>='0' && LA32_249<='9')||(LA32_249>='A' && LA32_249<='F')||(LA32_249>='a' && LA32_249<='f')) ) {s = 253;}

                        else if ( ((LA32_249>='\u0000' && LA32_249<='/')||(LA32_249>=':' && LA32_249<='@')||(LA32_249>='G' && LA32_249<='`')||(LA32_249>='g' && LA32_249<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_253 = input.LA(1);

                        s = -1;
                        if ( ((LA32_253>='0' && LA32_253<='9')||(LA32_253>='A' && LA32_253<='F')||(LA32_253>='a' && LA32_253<='f')) ) {s = 256;}

                        else if ( ((LA32_253>='\u0000' && LA32_253<='/')||(LA32_253>=':' && LA32_253<='@')||(LA32_253>='G' && LA32_253<='`')||(LA32_253>='g' && LA32_253<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_91 = input.LA(1);

                        s = -1;
                        if ( (LA32_91=='\'') ) {s = 89;}

                        else if ( ((LA32_91>='A' && LA32_91<='Z')||LA32_91=='_'||(LA32_91>='a' && LA32_91<='z')) ) {s = 134;}

                        else if ( (LA32_91=='\n') ) {s = 90;}

                        else if ( (LA32_91=='\r') ) {s = 91;}

                        else if ( ((LA32_91>='\u0000' && LA32_91<='\t')||(LA32_91>='\u000B' && LA32_91<='\f')||(LA32_91>='\u000E' && LA32_91<='&')||(LA32_91>='(' && LA32_91<='@')||(LA32_91>='[' && LA32_91<='^')||LA32_91=='`'||(LA32_91>='{' && LA32_91<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_128 = input.LA(1);

                        s = -1;
                        if ( ((LA32_128>='\u0000' && LA32_128<='/')||(LA32_128>=':' && LA32_128<='@')||(LA32_128>='G' && LA32_128<='`')||(LA32_128>='g' && LA32_128<='\uFFFF')) ) {s = 92;}

                        else if ( ((LA32_128>='0' && LA32_128<='9')||(LA32_128>='A' && LA32_128<='F')||(LA32_128>='a' && LA32_128<='f')) ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}