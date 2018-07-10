package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRUCT=9;
    public static final int RULE_DECIMAL_DIGIT=38;
    public static final int RULE_GO=27;
    public static final int T__59=59;
    public static final int RULE_CHAN=13;
    public static final int RULE_FALLTHROUGH=33;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_STRING_LIT=10;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_RETURN=29;
    public static final int RULE_ID=51;
    public static final int RULE_INTERPRETED_STRING_LIT=50;
    public static final int RULE_UNICODE_VALUE=42;
    public static final int RULE_INTERFACE=11;
    public static final int RULE_LITTLE_U_VALUE=44;
    public static final int RULE_HEX_BYTE_VALUE=48;
    public static final int RULE_CASE=23;
    public static final int RULE_OCTAL_BYTE_VALUE=47;
    public static final int RULE_MUL_OP=19;
    public static final int RULE_INT=41;
    public static final int RULE_SELECT=28;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=53;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_ELSE=21;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=6;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_MAP=12;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=35;
    public static final int RULE_BIG_U_VALUE=45;
    public static final int RULE_ESCAPED_CHAR=46;
    public static final int RULE_IDENTIFIER=8;
    public static final int RULE_STRING=52;
    public static final int RULE_BYTE_VALUE=43;
    public static final int RULE_SL_COMMENT=54;
    public static final int RULE_BREAK=30;
    public static final int T__77=77;
    public static final int RULE_UNICODE_CHAR=36;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_IF=20;
    public static final int RULE_DEFAULT=24;
    public static final int T__73=73;
    public static final int RULE_FOR=25;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=18;
    public static final int RULE_OCTAL_DIGIT=39;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_GOTO=32;
    public static final int RULE_WS=55;
    public static final int RULE_CONTINUE=31;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DEFER=34;
    public static final int RULE_LETTER=37;
    public static final int RULE_EXPONENT=7;
    public static final int RULE_SWITCH=22;
    public static final int RULE_INT_LIT=15;
    public static final int RULE_RAW_STRING_LIT=49;
    public static final int RULE_UNARY_OP=5;
    public static final int RULE_REL_OP=17;
    public static final int RULE_HEX_DIGIT=40;
    public static final int RULE_RUNE_LIT=16;
    public static final int RULE_VAR=4;
    public static final int RULE_RANGE=26;

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

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '<-' )
            // InternalMyDsl.g:11:9: '<-'
            {
            match("<-"); 


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
            // InternalMyDsl.g:12:7: ( '++' )
            // InternalMyDsl.g:12:9: '++'
            {
            match("++"); 


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
            // InternalMyDsl.g:13:7: ( '--' )
            // InternalMyDsl.g:13:9: '--'
            {
            match("--"); 


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
            // InternalMyDsl.g:14:7: ( '.' )
            // InternalMyDsl.g:14:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:15:7: ( 'i' )
            // InternalMyDsl.g:15:9: 'i'
            {
            match('i'); 

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
            // InternalMyDsl.g:16:7: ( '(' )
            // InternalMyDsl.g:16:9: '('
            {
            match('('); 

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
            // InternalMyDsl.g:17:7: ( ')' )
            // InternalMyDsl.g:17:9: ')'
            {
            match(')'); 

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
            // InternalMyDsl.g:18:7: ( '[' )
            // InternalMyDsl.g:18:9: '['
            {
            match('['); 

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
            // InternalMyDsl.g:19:7: ( ']' )
            // InternalMyDsl.g:19:9: ']'
            {
            match(']'); 

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
            // InternalMyDsl.g:20:7: ( '{' )
            // InternalMyDsl.g:20:9: '{'
            {
            match('{'); 

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
            // InternalMyDsl.g:21:7: ( '}' )
            // InternalMyDsl.g:21:9: '}'
            {
            match('}'); 

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
            // InternalMyDsl.g:22:7: ( '*' )
            // InternalMyDsl.g:22:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:23:7: ( ',' )
            // InternalMyDsl.g:23:9: ','
            {
            match(','); 

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
            // InternalMyDsl.g:24:7: ( '...' )
            // InternalMyDsl.g:24:9: '...'
            {
            match("..."); 


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
            // InternalMyDsl.g:25:7: ( ';' )
            // InternalMyDsl.g:25:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:26:7: ( '=' )
            // InternalMyDsl.g:26:9: '='
            {
            match('='); 

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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'func' )
            // InternalMyDsl.g:28:9: 'func'
            {
            match("func"); 


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
            // InternalMyDsl.g:29:7: ( ':' )
            // InternalMyDsl.g:29:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:30:7: ( 'const' )
            // InternalMyDsl.g:30:9: 'const'
            {
            match("const"); 


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
            // InternalMyDsl.g:31:7: ( 'type' )
            // InternalMyDsl.g:31:9: 'type'
            {
            match("type"); 


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
            // InternalMyDsl.g:32:7: ( '||' )
            // InternalMyDsl.g:32:9: '||'
            {
            match("||"); 


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
            // InternalMyDsl.g:33:7: ( '&&' )
            // InternalMyDsl.g:33:9: '&&'
            {
            match("&&"); 


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
            // InternalMyDsl.g:34:7: ( 'package' )
            // InternalMyDsl.g:34:9: 'package'
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
            // InternalMyDsl.g:35:7: ( 'import' )
            // InternalMyDsl.g:35:9: 'import'
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
            // InternalMyDsl.g:20000:23: ( ( '\\n' | '\\r' | '\\n\\r' ) )
            // InternalMyDsl.g:20000:25: ( '\\n' | '\\r' | '\\n\\r' )
            {
            // InternalMyDsl.g:20000:25: ( '\\n' | '\\r' | '\\n\\r' )
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
                    // InternalMyDsl.g:20000:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20000:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:20000:36: '\\n\\r'
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
            // InternalMyDsl.g:20002:28: ( 'nao seei' )
            // InternalMyDsl.g:20002:30: 'nao seei'
            {
            match("nao seei"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNICODE_CHAR"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:20004:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:20004:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // InternalMyDsl.g:20006:29: ( '0' .. '9' )
            // InternalMyDsl.g:20006:31: '0' .. '9'
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
            // InternalMyDsl.g:20008:27: ( '0' .. '7' )
            // InternalMyDsl.g:20008:29: '0' .. '7'
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
            // InternalMyDsl.g:20010:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalMyDsl.g:20010:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalMyDsl.g:20012:12: ( 'break' )
            // InternalMyDsl.g:20012:14: 'break'
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

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20014:14: ( 'default' )
            // InternalMyDsl.g:20014:16: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_INTERFACE"
    public final void mRULE_INTERFACE() throws RecognitionException {
        try {
            int _type = RULE_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20016:16: ( 'interface' )
            // InternalMyDsl.g:20016:18: 'interface'
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
            // InternalMyDsl.g:20018:13: ( 'select' )
            // InternalMyDsl.g:20018:15: 'select'
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

    // $ANTLR start "RULE_CASE"
    public final void mRULE_CASE() throws RecognitionException {
        try {
            int _type = RULE_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20020:11: ( 'case' )
            // InternalMyDsl.g:20020:13: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE"

    // $ANTLR start "RULE_DEFER"
    public final void mRULE_DEFER() throws RecognitionException {
        try {
            int _type = RULE_DEFER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20022:12: ( 'defer' )
            // InternalMyDsl.g:20022:14: 'defer'
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
            // InternalMyDsl.g:20024:9: ( 'go' )
            // InternalMyDsl.g:20024:11: 'go'
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
            // InternalMyDsl.g:20026:10: ( 'map' )
            // InternalMyDsl.g:20026:12: 'map'
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
            // InternalMyDsl.g:20028:13: ( 'struct' )
            // InternalMyDsl.g:20028:15: 'struct'
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
            // InternalMyDsl.g:20030:11: ( 'chan' )
            // InternalMyDsl.g:20030:13: 'chan'
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
            // InternalMyDsl.g:20032:11: ( 'else' )
            // InternalMyDsl.g:20032:13: 'else'
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
            // InternalMyDsl.g:20034:11: ( 'goto' )
            // InternalMyDsl.g:20034:13: 'goto'
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

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20036:13: ( 'switch' )
            // InternalMyDsl.g:20036:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_FALLTHROUGH"
    public final void mRULE_FALLTHROUGH() throws RecognitionException {
        try {
            int _type = RULE_FALLTHROUGH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20038:18: ( 'fallthrough' )
            // InternalMyDsl.g:20038:20: 'fallthrough'
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
            // InternalMyDsl.g:20040:9: ( 'if' )
            // InternalMyDsl.g:20040:11: 'if'
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
            // InternalMyDsl.g:20042:12: ( 'range' )
            // InternalMyDsl.g:20042:14: 'range'
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
            // InternalMyDsl.g:20044:15: ( 'continue' )
            // InternalMyDsl.g:20044:17: 'continue'
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
            // InternalMyDsl.g:20046:10: ( 'for' )
            // InternalMyDsl.g:20046:12: 'for'
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
            // InternalMyDsl.g:20048:13: ( 'return' )
            // InternalMyDsl.g:20048:15: 'return'
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

    // $ANTLR start "RULE_VAR"
    public final void mRULE_VAR() throws RecognitionException {
        try {
            int _type = RULE_VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20050:10: ( 'var' )
            // InternalMyDsl.g:20050:12: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAR"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20052:17: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalMyDsl.g:20052:19: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:20052:31: ( RULE_LETTER | '0' .. '9' )*
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
            // InternalMyDsl.g:20054:14: ( ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ) )
            // InternalMyDsl.g:20054:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
            {
            // InternalMyDsl.g:20054:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
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
                    // InternalMyDsl.g:20054:17: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:20054:26: ( RULE_DECIMAL_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:20054:26: RULE_DECIMAL_DIGIT
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
                    // InternalMyDsl.g:20054:46: '0' ( RULE_OCTAL_DIGIT )*
                    {
                    match('0'); 
                    // InternalMyDsl.g:20054:50: ( RULE_OCTAL_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='7')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:20054:50: RULE_OCTAL_DIGIT
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
                    // InternalMyDsl.g:20054:68: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:20054:82: ( RULE_HEX_DIGIT )+
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
                    	    // InternalMyDsl.g:20054:82: RULE_HEX_DIGIT
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

    // $ANTLR start "RULE_DECIMALS"
    public final void mRULE_DECIMALS() throws RecognitionException {
        try {
            int _type = RULE_DECIMALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20056:15: ( RULE_INT )
            // InternalMyDsl.g:20056:17: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMALS"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20058:15: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalMyDsl.g:20058:17: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:20058:27: ( '+' | '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_RUNE_LIT"
    public final void mRULE_RUNE_LIT() throws RecognitionException {
        try {
            int _type = RULE_RUNE_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20060:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalMyDsl.g:20060:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalMyDsl.g:20060:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='n') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\\') ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2=='\"'||LA8_2=='\''||LA8_2=='U'||LA8_2=='\\'||(LA8_2>='a' && LA8_2<='b')||LA8_2=='f'||LA8_2=='n'||LA8_2=='r'||(LA8_2>='t' && LA8_2<='v')) ) {
                    alt8=1;
                }
                else if ( ((LA8_2>='0' && LA8_2<='7')||LA8_2=='x') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:20060:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20060:42: RULE_BYTE_VALUE
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
            // InternalMyDsl.g:20062:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalMyDsl.g:20062:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalMyDsl.g:20062:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='n') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt9=2;
                    }
                    break;
                case 'U':
                    {
                    alt9=3;
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
                    alt9=4;
                    }
                    break;
                default:
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
                    // InternalMyDsl.g:20062:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20062:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:20062:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:20062:87: RULE_ESCAPED_CHAR
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
            // InternalMyDsl.g:20064:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalMyDsl.g:20064:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalMyDsl.g:20064:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='x') ) {
                    alt10=2;
                }
                else if ( ((LA10_1>='0' && LA10_1<='7')) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:20064:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20064:51: RULE_HEX_BYTE_VALUE
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
            // InternalMyDsl.g:20066:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalMyDsl.g:20066:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalMyDsl.g:20068:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:20068:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:20070:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:20070:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:20072:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:20072:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:20074:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalMyDsl.g:20074:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalMyDsl.g:20076:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalMyDsl.g:20076:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalMyDsl.g:20076:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\'') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\"') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:20076:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20076:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalMyDsl.g:20078:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalMyDsl.g:20078:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalMyDsl.g:20078:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='n') ) {
                    alt12=1;
                }
                else if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:20078:38: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:20078:56: RULE_NEWLINE
            	    {
            	    mRULE_NEWLINE(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalMyDsl.g:20080:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalMyDsl.g:20080:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalMyDsl.g:20080:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='n') ) {
                    alt13=1;
                }
                else if ( (LA13_0=='\\') ) {
                    int LA13_3 = input.LA(2);

                    if ( (LA13_3=='\"'||LA13_3=='\''||LA13_3=='U'||LA13_3=='\\'||(LA13_3>='a' && LA13_3<='b')||LA13_3=='f'||LA13_3=='n'||LA13_3=='r'||(LA13_3>='t' && LA13_3<='v')) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_3>='0' && LA13_3<='7')||LA13_3=='x') ) {
                        alt13=2;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:20080:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:20080:64: RULE_BYTE_VALUE
            	    {
            	    mRULE_BYTE_VALUE(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalMyDsl.g:20082:16: ( '#' )
            // InternalMyDsl.g:20082:18: '#'
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
            // InternalMyDsl.g:20084:13: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:20084:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:20084:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt14=1;
                }
                break;
            case '!':
                {
                alt14=2;
                }
                break;
            case '<':
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3=='=') ) {
                    alt14=4;
                }
                else {
                    alt14=3;}
                }
                break;
            case '>':
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4=='=') ) {
                    alt14=6;
                }
                else {
                    alt14=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:20084:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20084:21: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:20084:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:20084:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:20084:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:20084:39: '>='
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
            // InternalMyDsl.g:20086:13: ( ( '+' | '-' | '|' | '^' ) )
            // InternalMyDsl.g:20086:15: ( '+' | '-' | '|' | '^' )
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
            // InternalMyDsl.g:20088:13: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:20088:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:20088:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt15=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt15=1;
                }
                break;
            case '/':
                {
                alt15=2;
                }
                break;
            case '%':
                {
                alt15=3;
                }
                break;
            case '<':
                {
                alt15=4;
                }
                break;
            case '>':
                {
                alt15=5;
                }
                break;
            case '&':
                {
                int LA15_6 = input.LA(2);

                if ( (LA15_6=='^') ) {
                    alt15=7;
                }
                else {
                    alt15=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:20088:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20088:20: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:20088:24: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:20088:28: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:20088:33: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:20088:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:20088:42: '&^'
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

    // $ANTLR start "RULE_UNARY_OP"
    public final void mRULE_UNARY_OP() throws RecognitionException {
        try {
            int _type = RULE_UNARY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20090:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalMyDsl.g:20090:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalMyDsl.g:20090:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt16=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt16=1;
                }
                break;
            case '-':
                {
                alt16=2;
                }
                break;
            case '!':
                {
                alt16=3;
                }
                break;
            case '^':
                {
                alt16=4;
                }
                break;
            case '*':
                {
                alt16=5;
                }
                break;
            case '&':
                {
                alt16=6;
                }
                break;
            case '<':
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:20090:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20090:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:20090:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:20090:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:20090:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:20090:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:20090:42: '<-'
                    {
                    match("<-"); 


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
    // $ANTLR end "RULE_UNARY_OP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20092:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:20092:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:20092:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:20092:11: '^'
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

            // InternalMyDsl.g:20092:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    break loop18;
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
            // InternalMyDsl.g:20094:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:20094:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:20094:21: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:20094:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalMyDsl.g:20096:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:20096:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:20096:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\'') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:20096:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:20096:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:20096:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:20096:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:20096:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:20096:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:20096:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:20096:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop21;
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
            // InternalMyDsl.g:20098:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:20098:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:20098:24: ( options {greedy=false; } : . )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='*') ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1=='/') ) {
                        alt23=2;
                    }
                    else if ( ((LA23_1>='\u0000' && LA23_1<='.')||(LA23_1>='0' && LA23_1<='\uFFFF')) ) {
                        alt23=1;
                    }


                }
                else if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:20098:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // InternalMyDsl.g:20100:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:20100:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:20100:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\u0000' && LA24_0<='\t')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:20100:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop24;
                }
            } while (true);

            // InternalMyDsl.g:20100:40: ( ( '\\r' )? '\\n' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\n'||LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:20100:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:20100:41: ( '\\r' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='\r') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalMyDsl.g:20100:41: '\\r'
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
            // InternalMyDsl.g:20102:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:20102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:20102:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
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
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
        // InternalMyDsl.g:1:8: ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BREAK | RULE_DEFAULT | RULE_INTERFACE | RULE_SELECT | RULE_CASE | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_SWITCH | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_RETURN | RULE_VAR | RULE_IDENTIFIER | RULE_INT_LIT | RULE_DECIMALS | RULE_EXPONENT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_UNARY_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt28=61;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalMyDsl.g:1:10: T__56
                {
                mT__56(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__57
                {
                mT__57(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__58
                {
                mT__58(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__59
                {
                mT__59(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__60
                {
                mT__60(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__61
                {
                mT__61(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__62
                {
                mT__62(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__63
                {
                mT__63(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__64
                {
                mT__64(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__65
                {
                mT__65(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__66
                {
                mT__66(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__67
                {
                mT__67(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__68
                {
                mT__68(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__69
                {
                mT__69(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__70
                {
                mT__70(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__71
                {
                mT__71(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__72
                {
                mT__72(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__73
                {
                mT__73(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__74
                {
                mT__74(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__75
                {
                mT__75(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__76
                {
                mT__76(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__77
                {
                mT__77(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__78
                {
                mT__78(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__79
                {
                mT__79(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__80
                {
                mT__80(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:171: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:184: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:199: RULE_SELECT
                {
                mRULE_SELECT(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:211: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:221: RULE_DEFER
                {
                mRULE_DEFER(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:232: RULE_GO
                {
                mRULE_GO(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:240: RULE_MAP
                {
                mRULE_MAP(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:249: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:261: RULE_CHAN
                {
                mRULE_CHAN(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:271: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:281: RULE_GOTO
                {
                mRULE_GOTO(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:291: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:303: RULE_FALLTHROUGH
                {
                mRULE_FALLTHROUGH(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:320: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:328: RULE_RANGE
                {
                mRULE_RANGE(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:339: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:353: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:362: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:374: RULE_VAR
                {
                mRULE_VAR(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:383: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:399: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:412: RULE_DECIMALS
                {
                mRULE_DECIMALS(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:426: RULE_EXPONENT
                {
                mRULE_EXPONENT(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:440: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:454: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:470: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:485: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:497: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:509: RULE_MUL_OP
                {
                mRULE_MUL_OP(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:521: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:535: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:543: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:555: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:571: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:587: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\1\uffff\1\55\2\57\1\62\1\66\11\uffff\1\71\1\73\3\77\1\57\1\52\12\77\2\125\1\77\3\uffff\1\141\1\55\1\57\1\52\11\uffff\2\77\1\150\1\uffff\1\77\4\uffff\3\77\1\uffff\4\77\2\uffff\6\77\1\167\3\77\1\uffff\3\77\1\125\1\uffff\1\125\17\uffff\2\77\1\uffff\2\77\1\u0090\13\77\1\uffff\1\u009e\3\77\1\u00a2\17\uffff\2\77\1\u00b1\1\77\1\uffff\2\77\1\u00b5\1\u00b6\1\u00b7\7\77\1\u00bf\1\uffff\1\u00c0\2\77\15\uffff\2\77\1\uffff\1\77\1\u00d2\1\77\3\uffff\1\77\1\u00d5\1\77\1\u00d7\3\77\2\uffff\1\u00db\1\77\14\uffff\1\u00e4\2\77\1\uffff\2\77\1\uffff\1\77\1\uffff\1\u00ea\1\u00eb\1\u00ec\1\uffff\1\u00ed\10\uffff\3\77\1\u00f8\1\u00f9\13\uffff\2\77\1\u0101\7\uffff\1\u0107\1\77\7\uffff\1\77\4\uffff\1\u0110\3\uffff";
    static final String DFA28_eofS =
        "\u0111\uffff";
    static final String DFA28_minS =
        "\1\11\1\55\1\53\1\55\1\56\1\60\11\uffff\2\75\3\60\1\174\1\46\6\60\1\53\2\60\1\53\3\60\2\0\1\uffff\1\75\1\76\1\101\1\52\11\uffff\3\60\1\uffff\1\60\4\uffff\3\60\1\uffff\4\60\2\uffff\12\60\1\uffff\4\60\1\uffff\1\60\1\uffff\3\0\1\uffff\1\0\1\uffff\2\0\6\uffff\2\60\1\uffff\16\60\1\uffff\5\60\3\0\1\uffff\13\0\4\60\1\uffff\15\60\1\uffff\3\60\1\uffff\4\0\1\uffff\7\0\2\60\1\uffff\3\60\3\uffff\7\60\2\uffff\2\60\4\0\1\uffff\7\0\3\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\7\0\1\uffff\5\60\4\uffff\7\0\3\60\2\uffff\5\0\2\60\1\uffff\5\0\1\uffff\1\60\1\uffff\3\0\1\60\2\0\1\uffff";
    static final String DFA28_maxS =
        "\1\175\1\74\1\53\1\55\1\56\1\172\11\uffff\2\75\3\172\1\174\1\46\12\172\2\71\1\172\2\uffff\1\uffff\1\75\1\76\1\172\1\57\11\uffff\3\172\1\uffff\1\172\4\uffff\3\172\1\uffff\4\172\2\uffff\12\172\1\uffff\3\172\1\71\1\uffff\1\71\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\2\uffff\6\uffff\2\172\1\uffff\16\172\1\uffff\5\172\3\uffff\1\uffff\13\uffff\4\172\1\uffff\15\172\1\uffff\3\172\1\uffff\4\uffff\1\uffff\7\uffff\2\172\1\uffff\3\172\3\uffff\7\172\2\uffff\2\172\4\uffff\1\uffff\7\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\7\uffff\1\uffff\5\172\4\uffff\7\uffff\3\172\2\uffff\5\uffff\2\172\1\uffff\5\uffff\1\uffff\1\172\1\uffff\3\uffff\1\172\2\uffff\1\uffff";
    static final String DFA28_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\17\26\uffff\1\64\4\uffff\1\67\1\75\1\1\1\65\1\2\1\66\1\3\1\16\1\4\3\uffff\1\5\1\uffff\1\14\1\20\1\21\1\23\3\uffff\1\56\4\uffff\1\26\1\27\12\uffff\1\61\4\uffff\1\57\1\uffff\1\60\3\uffff\1\63\1\uffff\1\72\2\uffff\1\63\1\70\1\71\1\73\1\74\1\1\2\uffff\1\50\16\uffff\1\40\10\uffff\1\63\17\uffff\1\53\15\uffff\1\41\3\uffff\1\55\4\uffff\1\62\11\uffff\1\22\3\uffff\1\36\1\43\1\25\7\uffff\1\45\1\44\6\uffff\1\62\12\uffff\1\24\2\uffff\1\32\1\uffff\1\37\3\uffff\1\51\10\uffff\1\31\5\uffff\1\35\1\42\1\46\1\54\12\uffff\1\30\1\33\7\uffff\1\52\5\uffff\1\34\1\uffff\1\62\6\uffff\1\47";
    static final String DFA28_specialS =
        "\43\uffff\1\0\1\66\63\uffff\1\10\1\107\1\21\1\uffff\1\105\1\uffff\1\26\1\104\35\uffff\1\12\1\110\1\56\1\uffff\1\75\1\101\1\7\1\74\1\47\1\27\1\45\1\46\1\106\1\44\1\11\27\uffff\1\13\1\60\1\52\1\55\1\uffff\1\51\1\50\1\30\1\23\1\32\1\22\1\16\24\uffff\1\14\1\61\1\53\1\57\1\uffff\1\3\1\1\1\31\1\24\1\35\1\102\1\76\16\uffff\1\15\1\63\1\54\1\62\1\33\1\25\1\37\12\uffff\1\17\1\64\1\2\1\65\1\34\1\100\1\40\5\uffff\1\20\1\67\1\70\1\36\1\41\3\uffff\1\6\1\71\1\72\1\5\1\42\3\uffff\1\77\1\73\1\43\1\uffff\1\4\1\103\1\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\46\1\44\1\45\1\uffff\1\52\1\25\1\43\1\6\1\7\1\14\1\2\1\15\1\3\1\4\1\51\1\41\11\40\1\20\1\16\1\1\1\17\1\47\2\uffff\4\42\1\37\25\42\1\10\1\uffff\1\11\1\50\1\42\1\uffff\1\42\1\27\1\22\1\30\1\34\1\21\1\32\1\42\1\5\3\42\1\33\2\42\1\26\1\42\1\35\1\31\1\23\1\42\1\36\4\42\1\12\1\24\1\13",
            "\1\54\16\uffff\1\52",
            "\1\56",
            "\1\60",
            "\1\61",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\5\67\1\65\6\67\1\63\1\64\14\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\72",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\75\15\67\1\76\5\67\1\74\5\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\101\6\67\1\102\6\67\1\100\13\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\30\67\1\103\1\67",
            "\1\104",
            "\1\105",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\106\31\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\107\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\110\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\111\16\67\1\112\2\67\1\113\3\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\114\13\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\115\31\67",
            "\1\120\1\uffff\1\120\2\uffff\12\117\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\116\16\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\121\3\67\1\122\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\123\31\67",
            "\1\120\1\uffff\1\120\2\uffff\12\117\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\124",
            "\10\126\2\127",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\135\1\131\2\135\1\132\31\135\1\133\64\135\1\134\21\135\1\130\uff91\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            "",
            "\1\55",
            "\1\52",
            "\32\142\4\uffff\1\142\1\uffff\32\142",
            "\1\143\4\uffff\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\17\67\1\146\12\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\147\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\151\14\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\152\16\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\153\10\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\154\14\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\155\7\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\156\31\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\17\67\1\157\12\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\160\27\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\161\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\5\67\1\162\24\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\163\16\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\164\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\10\67\1\165\21\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\166\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\17\67\1\170\12\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\171\7\67",
            "\12\117\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\172\14\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\173\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\174\10\67",
            "\12\124",
            "",
            "\10\126\2\127",
            "",
            "\141\135\1\175\uff9e\135",
            "\12\135\1\131\2\135\1\176\31\135\1\133\106\135\1\177\uff91\135",
            "\12\135\1\131\2\135\1\132\31\135\1\133\106\135\1\177\uff91\135",
            "",
            "\42\135\1\u0083\4\135\1\u0083\10\135\10\u0085\35\135\1\u0082\6\135\1\u0083\4\135\2\u0083\3\135\1\u0083\7\135\1\u0083\3\135\1\u0083\1\135\1\u0083\1\u0081\1\u0083\1\135\1\u0084\uff87\135",
            "",
            "\141\135\1\u0086\uff9e\135",
            "\42\135\1\u0089\4\135\1\u0089\10\135\10\u008b\35\135\1\u0088\6\135\1\u0089\4\135\2\u0089\3\135\1\u0089\7\135\1\u0089\3\135\1\u0089\1\135\1\u0089\1\u0087\1\u0089\1\135\1\u008a\uff87\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\u008c\13\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u008d\25\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\u008e\27\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u008f\16\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\22\67\1\u0091\1\u0092\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u0093\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\u0094\14\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u0095\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\12\67\1\u0096\17\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\u0097\31\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\u0098\3\67\1\u0099\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u009a\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\u009b\5\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u009c\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\u009d\13\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u009f\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\6\67\1\u00a0\23\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\u00a1\5\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\157\135\1\u00a3\uff90\135",
            "\12\135\1\131\2\135\1\132\31\135\1\133\106\135\1\177\uff91\135",
            "\141\135\1\u00a4\uff9e\135",
            "",
            "\60\135\12\u00a5\7\135\6\u00a5\32\135\6\u00a5\uff99\135",
            "\60\135\12\u00a6\7\135\6\u00a6\32\135\6\u00a6\uff99\135",
            "\47\135\1\u00a7\uffd8\135",
            "\60\135\12\u00a8\7\135\6\u00a8\32\135\6\u00a8\uff99\135",
            "\60\135\10\u00a9\uffc8\135",
            "\157\135\1\u00aa\uff90\135",
            "\60\135\12\u00ab\7\135\6\u00ab\32\135\6\u00ab\uff99\135",
            "\60\135\12\u00ac\7\135\6\u00ac\32\135\6\u00ac\uff99\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            "\60\135\12\u00ad\7\135\6\u00ad\32\135\6\u00ad\uff99\135",
            "\60\135\10\u00ae\uffc8\135",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\u00af\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\u00b0\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u00b2\6\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u00b3\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\10\67\1\u00b4\21\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\u00b8\31\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\12\67\1\u00b9\17\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\u00ba\5\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\u00bb\10\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\u00bc\27\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\u00bd\27\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\u00be\27\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u00c1\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\u00c2\10\67",
            "",
            "\40\135\1\u00c3\uffdf\135",
            "\157\135\1\u00c4\uff90\135",
            "\60\135\12\u00c5\7\135\6\u00c5\32\135\6\u00c5\uff99\135",
            "\60\135\12\u00c6\7\135\6\u00c6\32\135\6\u00c6\uff99\135",
            "",
            "\60\135\12\u00c8\7\135\6\u00c8\32\135\6\u00c8\uff99\135",
            "\60\135\10\u00c9\uffc8\135",
            "\40\135\1\u00ca\uffdf\135",
            "\60\135\12\u00cb\7\135\6\u00cb\32\135\6\u00cb\uff99\135",
            "\60\135\12\u00cc\7\135\6\u00cc\32\135\6\u00cc\uff99\135",
            "\60\135\12\u00cd\7\135\6\u00cd\32\135\6\u00cd\uff99\135",
            "\60\135\10\u00ce\uffc8\135",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u00cf\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\5\67\1\u00d0\24\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\7\67\1\u00d1\22\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\u00d3\14\67",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\6\67\1\u00d4\23\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\13\67\1\u00d6\16\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u00d8\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u00d9\6\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\7\67\1\u00da\22\67",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\15\67\1\u00dc\14\67",
            "\163\135\1\u00dd\uff8c\135",
            "\40\135\1\u00de\uffdf\135",
            "\60\135\12\u00df\7\135\6\u00df\32\135\6\u00df\uff99\135",
            "\60\135\12\u00e0\7\135\6\u00e0\32\135\6\u00e0\uff99\135",
            "",
            "\47\135\1\u00a7\uffd8\135",
            "\47\135\1\u00a7\uffd8\135",
            "\163\135\1\u00e1\uff8c\135",
            "\60\135\12\u00e2\7\135\6\u00e2\32\135\6\u00e2\uff99\135",
            "\60\135\12\u00e3\7\135\6\u00e3\32\135\6\u00e3\uff99\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\1\u00e5\31\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\21\67\1\u00e6\10\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\u00e7\5\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u00e8\25\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\23\67\1\u00e9\6\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\145\135\1\u00ee\uff9a\135",
            "\163\135\1\u00ef\uff8c\135",
            "\60\135\12\u00f0\7\135\6\u00f0\32\135\6\u00f0\uff99\135",
            "\60\135\12\u00f1\7\135\6\u00f1\32\135\6\u00f1\uff99\135",
            "\145\135\1\u00f2\uff9a\135",
            "\60\135\12\u00f3\7\135\6\u00f3\32\135\6\u00f3\uff99\135",
            "\60\135\12\u00f4\7\135\6\u00f4\32\135\6\u00f4\uff99\135",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\2\67\1\u00f5\27\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\16\67\1\u00f6\13\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u00f7\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\145\135\1\u00fa\uff9a\135",
            "\145\135\1\u00fb\uff9a\135",
            "\47\135\1\u00a7\uffd8\135",
            "\60\135\12\u00fc\7\135\6\u00fc\32\135\6\u00fc\uff99\135",
            "\145\135\1\u00fd\uff9a\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            "\60\135\12\u00fe\7\135\6\u00fe\32\135\6\u00fe\uff99\135",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\4\67\1\u00ff\25\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\24\67\1\u0100\5\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\151\135\1\u0102\uff96\135",
            "\145\135\1\u0103\uff9a\135",
            "\60\135\12\u0104\7\135\6\u0104\32\135\6\u0104\uff99\135",
            "\151\135\1\u0105\uff96\135",
            "\60\135\12\u0106\7\135\6\u0106\32\135\6\u0106\uff99\135",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\6\67\1\u0108\23\67",
            "",
            "\12\135\1\131\2\135\1\132\31\135\1\u0109\106\135\1\177\uff91\135",
            "\151\135\1\u010a\uff96\135",
            "\60\135\12\u010b\7\135\6\u010b\32\135\6\u010b\uff99\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            "\60\135\12\u010c\7\135\6\u010c\32\135\6\u010c\uff99\135",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\7\67\1\u010d\22\67",
            "",
            "\12\135\1\131\2\135\1\132\31\135\1\133\106\135\1\177\uff91\135",
            "\60\135\12\u010e\7\135\6\u010e\32\135\6\u010e\uff99\135",
            "\60\135\12\u010f\7\135\6\u010f\32\135\6\u010f\uff99\135",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\47\135\1\u00a7\uffd8\135",
            "\42\135\1\140\71\135\1\137\21\135\1\136\uff91\135",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_BREAK | RULE_DEFAULT | RULE_INTERFACE | RULE_SELECT | RULE_CASE | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_SWITCH | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_RETURN | RULE_VAR | RULE_IDENTIFIER | RULE_INT_LIT | RULE_DECIMALS | RULE_EXPONENT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_UNARY_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_35 = input.LA(1);

                        s = -1;
                        if ( (LA28_35=='n') ) {s = 88;}

                        else if ( (LA28_35=='\n') ) {s = 89;}

                        else if ( (LA28_35=='\r') ) {s = 90;}

                        else if ( (LA28_35=='\'') ) {s = 91;}

                        else if ( (LA28_35=='\\') ) {s = 92;}

                        else if ( ((LA28_35>='\u0000' && LA28_35<='\t')||(LA28_35>='\u000B' && LA28_35<='\f')||(LA28_35>='\u000E' && LA28_35<='&')||(LA28_35>='(' && LA28_35<='[')||(LA28_35>=']' && LA28_35<='m')||(LA28_35>='o' && LA28_35<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_201 = input.LA(1);

                        s = -1;
                        if ( (LA28_201=='\'') ) {s = 167;}

                        else if ( ((LA28_201>='\u0000' && LA28_201<='&')||(LA28_201>='(' && LA28_201<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_240 = input.LA(1);

                        s = -1;
                        if ( (LA28_240=='\'') ) {s = 167;}

                        else if ( ((LA28_240>='\u0000' && LA28_240<='&')||(LA28_240>='(' && LA28_240<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_200 = input.LA(1);

                        s = -1;
                        if ( (LA28_200=='\'') ) {s = 167;}

                        else if ( ((LA28_200>='\u0000' && LA28_200<='&')||(LA28_200>='(' && LA28_200<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_270 = input.LA(1);

                        s = -1;
                        if ( (LA28_270=='\'') ) {s = 167;}

                        else if ( ((LA28_270>='\u0000' && LA28_270<='&')||(LA28_270>='(' && LA28_270<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_261 = input.LA(1);

                        s = -1;
                        if ( (LA28_261=='\"') ) {s = 96;}

                        else if ( (LA28_261=='n') ) {s = 94;}

                        else if ( (LA28_261=='\\') ) {s = 95;}

                        else if ( ((LA28_261>='\u0000' && LA28_261<='!')||(LA28_261>='#' && LA28_261<='[')||(LA28_261>=']' && LA28_261<='m')||(LA28_261>='o' && LA28_261<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_258 = input.LA(1);

                        s = -1;
                        if ( (LA28_258=='\'') ) {s = 265;}

                        else if ( ((LA28_258>='\u0000' && LA28_258<='\t')||(LA28_258>='\u000B' && LA28_258<='\f')||(LA28_258>='\u000E' && LA28_258<='&')||(LA28_258>='(' && LA28_258<='m')||(LA28_258>='o' && LA28_258<='\uFFFF')) ) {s = 93;}

                        else if ( (LA28_258=='n') ) {s = 127;}

                        else if ( (LA28_258=='\n') ) {s = 89;}

                        else if ( (LA28_258=='\r') ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_131 = input.LA(1);

                        s = -1;
                        if ( (LA28_131=='\'') ) {s = 167;}

                        else if ( ((LA28_131>='\u0000' && LA28_131<='&')||(LA28_131>='(' && LA28_131<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_88 = input.LA(1);

                        s = -1;
                        if ( (LA28_88=='a') ) {s = 125;}

                        else if ( ((LA28_88>='\u0000' && LA28_88<='`')||(LA28_88>='b' && LA28_88<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA28_139 = input.LA(1);

                        s = -1;
                        if ( ((LA28_139>='\u0000' && LA28_139<='/')||(LA28_139>='8' && LA28_139<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_139>='0' && LA28_139<='7')) ) {s = 174;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA28_125 = input.LA(1);

                        s = -1;
                        if ( (LA28_125=='o') ) {s = 163;}

                        else if ( ((LA28_125>='\u0000' && LA28_125<='n')||(LA28_125>='p' && LA28_125<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA28_163 = input.LA(1);

                        s = -1;
                        if ( (LA28_163==' ') ) {s = 195;}

                        else if ( ((LA28_163>='\u0000' && LA28_163<='\u001F')||(LA28_163>='!' && LA28_163<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA28_195 = input.LA(1);

                        s = -1;
                        if ( (LA28_195=='s') ) {s = 221;}

                        else if ( ((LA28_195>='\u0000' && LA28_195<='r')||(LA28_195>='t' && LA28_195<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA28_221 = input.LA(1);

                        s = -1;
                        if ( (LA28_221=='e') ) {s = 238;}

                        else if ( ((LA28_221>='\u0000' && LA28_221<='d')||(LA28_221>='f' && LA28_221<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA28_174 = input.LA(1);

                        s = -1;
                        if ( ((LA28_174>='0' && LA28_174<='7')) ) {s = 206;}

                        else if ( ((LA28_174>='\u0000' && LA28_174<='/')||(LA28_174>='8' && LA28_174<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA28_238 = input.LA(1);

                        s = -1;
                        if ( (LA28_238=='e') ) {s = 250;}

                        else if ( ((LA28_238>='\u0000' && LA28_238<='d')||(LA28_238>='f' && LA28_238<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA28_250 = input.LA(1);

                        s = -1;
                        if ( (LA28_250=='i') ) {s = 258;}

                        else if ( ((LA28_250>='\u0000' && LA28_250<='h')||(LA28_250>='j' && LA28_250<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA28_90 = input.LA(1);

                        s = -1;
                        if ( (LA28_90=='\'') ) {s = 91;}

                        else if ( ((LA28_90>='\u0000' && LA28_90<='\t')||(LA28_90>='\u000B' && LA28_90<='\f')||(LA28_90>='\u000E' && LA28_90<='&')||(LA28_90>='(' && LA28_90<='m')||(LA28_90>='o' && LA28_90<='\uFFFF')) ) {s = 93;}

                        else if ( (LA28_90=='n') ) {s = 127;}

                        else if ( (LA28_90=='\n') ) {s = 89;}

                        else if ( (LA28_90=='\r') ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA28_173 = input.LA(1);

                        s = -1;
                        if ( ((LA28_173>='0' && LA28_173<='9')||(LA28_173>='A' && LA28_173<='F')||(LA28_173>='a' && LA28_173<='f')) ) {s = 205;}

                        else if ( ((LA28_173>='\u0000' && LA28_173<='/')||(LA28_173>=':' && LA28_173<='@')||(LA28_173>='G' && LA28_173<='`')||(LA28_173>='g' && LA28_173<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA28_171 = input.LA(1);

                        s = -1;
                        if ( ((LA28_171>='0' && LA28_171<='9')||(LA28_171>='A' && LA28_171<='F')||(LA28_171>='a' && LA28_171<='f')) ) {s = 203;}

                        else if ( ((LA28_171>='\u0000' && LA28_171<='/')||(LA28_171>=':' && LA28_171<='@')||(LA28_171>='G' && LA28_171<='`')||(LA28_171>='g' && LA28_171<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA28_203 = input.LA(1);

                        s = -1;
                        if ( ((LA28_203>='0' && LA28_203<='9')||(LA28_203>='A' && LA28_203<='F')||(LA28_203>='a' && LA28_203<='f')) ) {s = 226;}

                        else if ( ((LA28_203>='\u0000' && LA28_203<='/')||(LA28_203>=':' && LA28_203<='@')||(LA28_203>='G' && LA28_203<='`')||(LA28_203>='g' && LA28_203<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA28_226 = input.LA(1);

                        s = -1;
                        if ( ((LA28_226>='0' && LA28_226<='9')||(LA28_226>='A' && LA28_226<='F')||(LA28_226>='a' && LA28_226<='f')) ) {s = 243;}

                        else if ( ((LA28_226>='\u0000' && LA28_226<='/')||(LA28_226>=':' && LA28_226<='@')||(LA28_226>='G' && LA28_226<='`')||(LA28_226>='g' && LA28_226<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA28_94 = input.LA(1);

                        s = -1;
                        if ( (LA28_94=='a') ) {s = 134;}

                        else if ( ((LA28_94>='\u0000' && LA28_94<='`')||(LA28_94>='b' && LA28_94<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA28_134 = input.LA(1);

                        s = -1;
                        if ( (LA28_134=='o') ) {s = 170;}

                        else if ( ((LA28_134>='\u0000' && LA28_134<='n')||(LA28_134>='p' && LA28_134<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA28_170 = input.LA(1);

                        s = -1;
                        if ( (LA28_170==' ') ) {s = 202;}

                        else if ( ((LA28_170>='\u0000' && LA28_170<='\u001F')||(LA28_170>='!' && LA28_170<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA28_202 = input.LA(1);

                        s = -1;
                        if ( (LA28_202=='s') ) {s = 225;}

                        else if ( ((LA28_202>='\u0000' && LA28_202<='r')||(LA28_202>='t' && LA28_202<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA28_172 = input.LA(1);

                        s = -1;
                        if ( ((LA28_172>='0' && LA28_172<='9')||(LA28_172>='A' && LA28_172<='F')||(LA28_172>='a' && LA28_172<='f')) ) {s = 204;}

                        else if ( ((LA28_172>='\u0000' && LA28_172<='/')||(LA28_172>=':' && LA28_172<='@')||(LA28_172>='G' && LA28_172<='`')||(LA28_172>='g' && LA28_172<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA28_225 = input.LA(1);

                        s = -1;
                        if ( (LA28_225=='e') ) {s = 242;}

                        else if ( ((LA28_225>='\u0000' && LA28_225<='d')||(LA28_225>='f' && LA28_225<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA28_242 = input.LA(1);

                        s = -1;
                        if ( (LA28_242=='e') ) {s = 253;}

                        else if ( ((LA28_242>='\u0000' && LA28_242<='d')||(LA28_242>='f' && LA28_242<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA28_204 = input.LA(1);

                        s = -1;
                        if ( ((LA28_204>='0' && LA28_204<='9')||(LA28_204>='A' && LA28_204<='F')||(LA28_204>='a' && LA28_204<='f')) ) {s = 227;}

                        else if ( ((LA28_204>='\u0000' && LA28_204<='/')||(LA28_204>=':' && LA28_204<='@')||(LA28_204>='G' && LA28_204<='`')||(LA28_204>='g' && LA28_204<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA28_253 = input.LA(1);

                        s = -1;
                        if ( (LA28_253=='i') ) {s = 261;}

                        else if ( ((LA28_253>='\u0000' && LA28_253<='h')||(LA28_253>='j' && LA28_253<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA28_227 = input.LA(1);

                        s = -1;
                        if ( ((LA28_227>='0' && LA28_227<='9')||(LA28_227>='A' && LA28_227<='F')||(LA28_227>='a' && LA28_227<='f')) ) {s = 244;}

                        else if ( ((LA28_227>='\u0000' && LA28_227<='/')||(LA28_227>=':' && LA28_227<='@')||(LA28_227>='G' && LA28_227<='`')||(LA28_227>='g' && LA28_227<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA28_244 = input.LA(1);

                        s = -1;
                        if ( ((LA28_244>='0' && LA28_244<='9')||(LA28_244>='A' && LA28_244<='F')||(LA28_244>='a' && LA28_244<='f')) ) {s = 254;}

                        else if ( ((LA28_244>='\u0000' && LA28_244<='/')||(LA28_244>=':' && LA28_244<='@')||(LA28_244>='G' && LA28_244<='`')||(LA28_244>='g' && LA28_244<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA28_254 = input.LA(1);

                        s = -1;
                        if ( ((LA28_254>='0' && LA28_254<='9')||(LA28_254>='A' && LA28_254<='F')||(LA28_254>='a' && LA28_254<='f')) ) {s = 262;}

                        else if ( ((LA28_254>='\u0000' && LA28_254<='/')||(LA28_254>=':' && LA28_254<='@')||(LA28_254>='G' && LA28_254<='`')||(LA28_254>='g' && LA28_254<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA28_262 = input.LA(1);

                        s = -1;
                        if ( ((LA28_262>='0' && LA28_262<='9')||(LA28_262>='A' && LA28_262<='F')||(LA28_262>='a' && LA28_262<='f')) ) {s = 268;}

                        else if ( ((LA28_262>='\u0000' && LA28_262<='/')||(LA28_262>=':' && LA28_262<='@')||(LA28_262>='G' && LA28_262<='`')||(LA28_262>='g' && LA28_262<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA28_268 = input.LA(1);

                        s = -1;
                        if ( ((LA28_268>='\u0000' && LA28_268<='/')||(LA28_268>=':' && LA28_268<='@')||(LA28_268>='G' && LA28_268<='`')||(LA28_268>='g' && LA28_268<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_268>='0' && LA28_268<='9')||(LA28_268>='A' && LA28_268<='F')||(LA28_268>='a' && LA28_268<='f')) ) {s = 271;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA28_138 = input.LA(1);

                        s = -1;
                        if ( ((LA28_138>='0' && LA28_138<='9')||(LA28_138>='A' && LA28_138<='F')||(LA28_138>='a' && LA28_138<='f')) ) {s = 173;}

                        else if ( ((LA28_138>='\u0000' && LA28_138<='/')||(LA28_138>=':' && LA28_138<='@')||(LA28_138>='G' && LA28_138<='`')||(LA28_138>='g' && LA28_138<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA28_135 = input.LA(1);

                        s = -1;
                        if ( ((LA28_135>='0' && LA28_135<='9')||(LA28_135>='A' && LA28_135<='F')||(LA28_135>='a' && LA28_135<='f')) ) {s = 171;}

                        else if ( ((LA28_135>='\u0000' && LA28_135<='/')||(LA28_135>=':' && LA28_135<='@')||(LA28_135>='G' && LA28_135<='`')||(LA28_135>='g' && LA28_135<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA28_136 = input.LA(1);

                        s = -1;
                        if ( ((LA28_136>='\u0000' && LA28_136<='/')||(LA28_136>=':' && LA28_136<='@')||(LA28_136>='G' && LA28_136<='`')||(LA28_136>='g' && LA28_136<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_136>='0' && LA28_136<='9')||(LA28_136>='A' && LA28_136<='F')||(LA28_136>='a' && LA28_136<='f')) ) {s = 172;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA28_133 = input.LA(1);

                        s = -1;
                        if ( ((LA28_133>='\u0000' && LA28_133<='/')||(LA28_133>='8' && LA28_133<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_133>='0' && LA28_133<='7')) ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA28_169 = input.LA(1);

                        s = -1;
                        if ( ((LA28_169>='0' && LA28_169<='7')) ) {s = 201;}

                        else if ( ((LA28_169>='\u0000' && LA28_169<='/')||(LA28_169>='8' && LA28_169<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA28_168 = input.LA(1);

                        s = -1;
                        if ( ((LA28_168>='\u0000' && LA28_168<='/')||(LA28_168>=':' && LA28_168<='@')||(LA28_168>='G' && LA28_168<='`')||(LA28_168>='g' && LA28_168<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_168>='0' && LA28_168<='9')||(LA28_168>='A' && LA28_168<='F')||(LA28_168>='a' && LA28_168<='f')) ) {s = 200;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA28_165 = input.LA(1);

                        s = -1;
                        if ( ((LA28_165>='\u0000' && LA28_165<='/')||(LA28_165>=':' && LA28_165<='@')||(LA28_165>='G' && LA28_165<='`')||(LA28_165>='g' && LA28_165<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_165>='0' && LA28_165<='9')||(LA28_165>='A' && LA28_165<='F')||(LA28_165>='a' && LA28_165<='f')) ) {s = 197;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA28_197 = input.LA(1);

                        s = -1;
                        if ( ((LA28_197>='\u0000' && LA28_197<='/')||(LA28_197>=':' && LA28_197<='@')||(LA28_197>='G' && LA28_197<='`')||(LA28_197>='g' && LA28_197<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_197>='0' && LA28_197<='9')||(LA28_197>='A' && LA28_197<='F')||(LA28_197>='a' && LA28_197<='f')) ) {s = 223;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA28_223 = input.LA(1);

                        s = -1;
                        if ( ((LA28_223>='\u0000' && LA28_223<='/')||(LA28_223>=':' && LA28_223<='@')||(LA28_223>='G' && LA28_223<='`')||(LA28_223>='g' && LA28_223<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_223>='0' && LA28_223<='9')||(LA28_223>='A' && LA28_223<='F')||(LA28_223>='a' && LA28_223<='f')) ) {s = 240;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA28_166 = input.LA(1);

                        s = -1;
                        if ( ((LA28_166>='\u0000' && LA28_166<='/')||(LA28_166>=':' && LA28_166<='@')||(LA28_166>='G' && LA28_166<='`')||(LA28_166>='g' && LA28_166<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_166>='0' && LA28_166<='9')||(LA28_166>='A' && LA28_166<='F')||(LA28_166>='a' && LA28_166<='f')) ) {s = 198;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA28_127 = input.LA(1);

                        s = -1;
                        if ( (LA28_127=='a') ) {s = 164;}

                        else if ( ((LA28_127>='\u0000' && LA28_127<='`')||(LA28_127>='b' && LA28_127<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA28_198 = input.LA(1);

                        s = -1;
                        if ( ((LA28_198>='\u0000' && LA28_198<='/')||(LA28_198>=':' && LA28_198<='@')||(LA28_198>='G' && LA28_198<='`')||(LA28_198>='g' && LA28_198<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_198>='0' && LA28_198<='9')||(LA28_198>='A' && LA28_198<='F')||(LA28_198>='a' && LA28_198<='f')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA28_164 = input.LA(1);

                        s = -1;
                        if ( (LA28_164=='o') ) {s = 196;}

                        else if ( ((LA28_164>='\u0000' && LA28_164<='n')||(LA28_164>='p' && LA28_164<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA28_196 = input.LA(1);

                        s = -1;
                        if ( (LA28_196==' ') ) {s = 222;}

                        else if ( ((LA28_196>='\u0000' && LA28_196<='\u001F')||(LA28_196>='!' && LA28_196<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA28_224 = input.LA(1);

                        s = -1;
                        if ( ((LA28_224>='\u0000' && LA28_224<='/')||(LA28_224>=':' && LA28_224<='@')||(LA28_224>='G' && LA28_224<='`')||(LA28_224>='g' && LA28_224<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_224>='0' && LA28_224<='9')||(LA28_224>='A' && LA28_224<='F')||(LA28_224>='a' && LA28_224<='f')) ) {s = 241;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA28_222 = input.LA(1);

                        s = -1;
                        if ( (LA28_222=='s') ) {s = 239;}

                        else if ( ((LA28_222>='\u0000' && LA28_222<='r')||(LA28_222>='t' && LA28_222<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA28_239 = input.LA(1);

                        s = -1;
                        if ( (LA28_239=='e') ) {s = 251;}

                        else if ( ((LA28_239>='\u0000' && LA28_239<='d')||(LA28_239>='f' && LA28_239<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA28_241 = input.LA(1);

                        s = -1;
                        if ( ((LA28_241>='\u0000' && LA28_241<='/')||(LA28_241>=':' && LA28_241<='@')||(LA28_241>='G' && LA28_241<='`')||(LA28_241>='g' && LA28_241<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_241>='0' && LA28_241<='9')||(LA28_241>='A' && LA28_241<='F')||(LA28_241>='a' && LA28_241<='f')) ) {s = 252;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( (LA28_36=='n') ) {s = 94;}

                        else if ( (LA28_36=='\\') ) {s = 95;}

                        else if ( (LA28_36=='\"') ) {s = 96;}

                        else if ( ((LA28_36>='\u0000' && LA28_36<='!')||(LA28_36>='#' && LA28_36<='[')||(LA28_36>=']' && LA28_36<='m')||(LA28_36>='o' && LA28_36<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA28_251 = input.LA(1);

                        s = -1;
                        if ( (LA28_251=='e') ) {s = 259;}

                        else if ( ((LA28_251>='\u0000' && LA28_251<='d')||(LA28_251>='f' && LA28_251<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA28_252 = input.LA(1);

                        s = -1;
                        if ( ((LA28_252>='\u0000' && LA28_252<='/')||(LA28_252>=':' && LA28_252<='@')||(LA28_252>='G' && LA28_252<='`')||(LA28_252>='g' && LA28_252<='\uFFFF')) ) {s = 93;}

                        else if ( ((LA28_252>='0' && LA28_252<='9')||(LA28_252>='A' && LA28_252<='F')||(LA28_252>='a' && LA28_252<='f')) ) {s = 260;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA28_259 = input.LA(1);

                        s = -1;
                        if ( (LA28_259=='i') ) {s = 266;}

                        else if ( ((LA28_259>='\u0000' && LA28_259<='h')||(LA28_259>='j' && LA28_259<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA28_260 = input.LA(1);

                        s = -1;
                        if ( ((LA28_260>='0' && LA28_260<='9')||(LA28_260>='A' && LA28_260<='F')||(LA28_260>='a' && LA28_260<='f')) ) {s = 267;}

                        else if ( ((LA28_260>='\u0000' && LA28_260<='/')||(LA28_260>=':' && LA28_260<='@')||(LA28_260>='G' && LA28_260<='`')||(LA28_260>='g' && LA28_260<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA28_267 = input.LA(1);

                        s = -1;
                        if ( ((LA28_267>='0' && LA28_267<='9')||(LA28_267>='A' && LA28_267<='F')||(LA28_267>='a' && LA28_267<='f')) ) {s = 270;}

                        else if ( ((LA28_267>='\u0000' && LA28_267<='/')||(LA28_267>=':' && LA28_267<='@')||(LA28_267>='G' && LA28_267<='`')||(LA28_267>='g' && LA28_267<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA28_132 = input.LA(1);

                        s = -1;
                        if ( ((LA28_132>='0' && LA28_132<='9')||(LA28_132>='A' && LA28_132<='F')||(LA28_132>='a' && LA28_132<='f')) ) {s = 168;}

                        else if ( ((LA28_132>='\u0000' && LA28_132<='/')||(LA28_132>=':' && LA28_132<='@')||(LA28_132>='G' && LA28_132<='`')||(LA28_132>='g' && LA28_132<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA28_129 = input.LA(1);

                        s = -1;
                        if ( ((LA28_129>='0' && LA28_129<='9')||(LA28_129>='A' && LA28_129<='F')||(LA28_129>='a' && LA28_129<='f')) ) {s = 165;}

                        else if ( ((LA28_129>='\u0000' && LA28_129<='/')||(LA28_129>=':' && LA28_129<='@')||(LA28_129>='G' && LA28_129<='`')||(LA28_129>='g' && LA28_129<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA28_206 = input.LA(1);

                        s = -1;
                        if ( (LA28_206=='\"') ) {s = 96;}

                        else if ( (LA28_206=='\\') ) {s = 95;}

                        else if ( (LA28_206=='n') ) {s = 94;}

                        else if ( ((LA28_206>='\u0000' && LA28_206<='!')||(LA28_206>='#' && LA28_206<='[')||(LA28_206>=']' && LA28_206<='m')||(LA28_206>='o' && LA28_206<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA28_266 = input.LA(1);

                        s = -1;
                        if ( (LA28_266=='\'') ) {s = 91;}

                        else if ( ((LA28_266>='\u0000' && LA28_266<='\t')||(LA28_266>='\u000B' && LA28_266<='\f')||(LA28_266>='\u000E' && LA28_266<='&')||(LA28_266>='(' && LA28_266<='m')||(LA28_266>='o' && LA28_266<='\uFFFF')) ) {s = 93;}

                        else if ( (LA28_266=='n') ) {s = 127;}

                        else if ( (LA28_266=='\n') ) {s = 89;}

                        else if ( (LA28_266=='\r') ) {s = 90;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA28_243 = input.LA(1);

                        s = -1;
                        if ( (LA28_243=='\"') ) {s = 96;}

                        else if ( (LA28_243=='n') ) {s = 94;}

                        else if ( (LA28_243=='\\') ) {s = 95;}

                        else if ( ((LA28_243>='\u0000' && LA28_243<='!')||(LA28_243>='#' && LA28_243<='[')||(LA28_243>=']' && LA28_243<='m')||(LA28_243>='o' && LA28_243<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA28_130 = input.LA(1);

                        s = -1;
                        if ( ((LA28_130>='0' && LA28_130<='9')||(LA28_130>='A' && LA28_130<='F')||(LA28_130>='a' && LA28_130<='f')) ) {s = 166;}

                        else if ( ((LA28_130>='\u0000' && LA28_130<='/')||(LA28_130>=':' && LA28_130<='@')||(LA28_130>='G' && LA28_130<='`')||(LA28_130>='g' && LA28_130<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA28_205 = input.LA(1);

                        s = -1;
                        if ( (LA28_205=='\"') ) {s = 96;}

                        else if ( (LA28_205=='n') ) {s = 94;}

                        else if ( (LA28_205=='\\') ) {s = 95;}

                        else if ( ((LA28_205>='\u0000' && LA28_205<='!')||(LA28_205>='#' && LA28_205<='[')||(LA28_205>=']' && LA28_205<='m')||(LA28_205>='o' && LA28_205<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA28_271 = input.LA(1);

                        s = -1;
                        if ( (LA28_271=='\"') ) {s = 96;}

                        else if ( (LA28_271=='n') ) {s = 94;}

                        else if ( (LA28_271=='\\') ) {s = 95;}

                        else if ( ((LA28_271>='\u0000' && LA28_271<='!')||(LA28_271>='#' && LA28_271<='[')||(LA28_271>=']' && LA28_271<='m')||(LA28_271>='o' && LA28_271<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA28_95 = input.LA(1);

                        s = -1;
                        if ( (LA28_95=='u') ) {s = 135;}

                        else if ( (LA28_95=='U') ) {s = 136;}

                        else if ( (LA28_95=='\"'||LA28_95=='\''||LA28_95=='\\'||(LA28_95>='a' && LA28_95<='b')||LA28_95=='f'||LA28_95=='n'||LA28_95=='r'||LA28_95=='t'||LA28_95=='v') ) {s = 137;}

                        else if ( (LA28_95=='x') ) {s = 138;}

                        else if ( ((LA28_95>='0' && LA28_95<='7')) ) {s = 139;}

                        else if ( ((LA28_95>='\u0000' && LA28_95<='!')||(LA28_95>='#' && LA28_95<='&')||(LA28_95>='(' && LA28_95<='/')||(LA28_95>='8' && LA28_95<='T')||(LA28_95>='V' && LA28_95<='[')||(LA28_95>=']' && LA28_95<='`')||(LA28_95>='c' && LA28_95<='e')||(LA28_95>='g' && LA28_95<='m')||(LA28_95>='o' && LA28_95<='q')||LA28_95=='s'||LA28_95=='w'||(LA28_95>='y' && LA28_95<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA28_92 = input.LA(1);

                        s = -1;
                        if ( (LA28_92=='u') ) {s = 129;}

                        else if ( (LA28_92=='U') ) {s = 130;}

                        else if ( (LA28_92=='\"'||LA28_92=='\''||LA28_92=='\\'||(LA28_92>='a' && LA28_92<='b')||LA28_92=='f'||LA28_92=='n'||LA28_92=='r'||LA28_92=='t'||LA28_92=='v') ) {s = 131;}

                        else if ( (LA28_92=='x') ) {s = 132;}

                        else if ( ((LA28_92>='0' && LA28_92<='7')) ) {s = 133;}

                        else if ( ((LA28_92>='\u0000' && LA28_92<='!')||(LA28_92>='#' && LA28_92<='&')||(LA28_92>='(' && LA28_92<='/')||(LA28_92>='8' && LA28_92<='T')||(LA28_92>='V' && LA28_92<='[')||(LA28_92>=']' && LA28_92<='`')||(LA28_92>='c' && LA28_92<='e')||(LA28_92>='g' && LA28_92<='m')||(LA28_92>='o' && LA28_92<='q')||LA28_92=='s'||LA28_92=='w'||(LA28_92>='y' && LA28_92<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA28_137 = input.LA(1);

                        s = -1;
                        if ( (LA28_137=='\"') ) {s = 96;}

                        else if ( (LA28_137=='n') ) {s = 94;}

                        else if ( (LA28_137=='\\') ) {s = 95;}

                        else if ( ((LA28_137>='\u0000' && LA28_137<='!')||(LA28_137>='#' && LA28_137<='[')||(LA28_137>=']' && LA28_137<='m')||(LA28_137>='o' && LA28_137<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA28_89 = input.LA(1);

                        s = -1;
                        if ( (LA28_89=='\r') ) {s = 126;}

                        else if ( (LA28_89=='\'') ) {s = 91;}

                        else if ( ((LA28_89>='\u0000' && LA28_89<='\t')||(LA28_89>='\u000B' && LA28_89<='\f')||(LA28_89>='\u000E' && LA28_89<='&')||(LA28_89>='(' && LA28_89<='m')||(LA28_89>='o' && LA28_89<='\uFFFF')) ) {s = 93;}

                        else if ( (LA28_89=='n') ) {s = 127;}

                        else if ( (LA28_89=='\n') ) {s = 89;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA28_126 = input.LA(1);

                        s = -1;
                        if ( (LA28_126=='\'') ) {s = 91;}

                        else if ( (LA28_126=='n') ) {s = 127;}

                        else if ( (LA28_126=='\n') ) {s = 89;}

                        else if ( (LA28_126=='\r') ) {s = 90;}

                        else if ( ((LA28_126>='\u0000' && LA28_126<='\t')||(LA28_126>='\u000B' && LA28_126<='\f')||(LA28_126>='\u000E' && LA28_126<='&')||(LA28_126>='(' && LA28_126<='m')||(LA28_126>='o' && LA28_126<='\uFFFF')) ) {s = 93;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}