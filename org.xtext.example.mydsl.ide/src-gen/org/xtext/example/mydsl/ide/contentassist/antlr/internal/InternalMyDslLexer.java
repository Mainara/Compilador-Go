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
    public static final int RULE_STRUCT=6;
    public static final int RULE_DECIMAL_DIGIT=36;
    public static final int RULE_GO=25;
    public static final int T__59=59;
    public static final int RULE_CHAN=10;
    public static final int RULE_FALLTHROUGH=31;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_IMAGINARY_LIT=14;
    public static final int RULE_STRING_LIT=7;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_RETURN=27;
    public static final int RULE_ID=51;
    public static final int RULE_INTERPRETED_STRING_LIT=50;
    public static final int RULE_UNICODE_VALUE=42;
    public static final int RULE_INTERFACE=8;
    public static final int RULE_LITTLE_U_VALUE=44;
    public static final int RULE_HEX_BYTE_VALUE=48;
    public static final int RULE_CASE=21;
    public static final int RULE_OCTAL_BYTE_VALUE=47;
    public static final int RULE_MUL_OP=18;
    public static final int RULE_INT=41;
    public static final int RULE_SELECT=26;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=53;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_ELSE=20;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=39;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_MAP=9;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=33;
    public static final int RULE_BIG_U_VALUE=45;
    public static final int RULE_ESCAPED_CHAR=46;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_STRING=52;
    public static final int RULE_BYTE_VALUE=43;
    public static final int RULE_SL_COMMENT=54;
    public static final int RULE_BREAK=28;
    public static final int T__77=77;
    public static final int RULE_UNICODE_CHAR=34;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_IF=19;
    public static final int RULE_DEFAULT=22;
    public static final int T__73=73;
    public static final int RULE_FOR=23;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=17;
    public static final int RULE_OCTAL_DIGIT=37;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_GOTO=30;
    public static final int RULE_WS=55;
    public static final int RULE_CONTINUE=29;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DEFER=32;
    public static final int RULE_FLOAT_LIT=13;
    public static final int RULE_LETTER=35;
    public static final int RULE_EXPONENT=40;
    public static final int RULE_SWITCH=4;
    public static final int RULE_INT_LIT=12;
    public static final int RULE_RAW_STRING_LIT=49;
    public static final int RULE_REL_OP=16;
    public static final int RULE_HEX_DIGIT=38;
    public static final int RULE_RUNE_LIT=15;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int RULE_RANGE=24;

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
            // InternalMyDsl.g:12:7: ( '+' )
            // InternalMyDsl.g:12:9: '+'
            {
            match('+'); 

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
            // InternalMyDsl.g:13:7: ( '-' )
            // InternalMyDsl.g:13:9: '-'
            {
            match('-'); 

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
            // InternalMyDsl.g:14:7: ( '!' )
            // InternalMyDsl.g:14:9: '!'
            {
            match('!'); 

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
            // InternalMyDsl.g:15:7: ( '^' )
            // InternalMyDsl.g:15:9: '^'
            {
            match('^'); 

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
            // InternalMyDsl.g:16:7: ( '*' )
            // InternalMyDsl.g:16:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:17:7: ( '&' )
            // InternalMyDsl.g:17:9: '&'
            {
            match('&'); 

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
            // InternalMyDsl.g:18:7: ( '++' )
            // InternalMyDsl.g:18:9: '++'
            {
            match("++"); 


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
            // InternalMyDsl.g:19:7: ( '--' )
            // InternalMyDsl.g:19:9: '--'
            {
            match("--"); 


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
            // InternalMyDsl.g:20:7: ( '.' )
            // InternalMyDsl.g:20:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:21:7: ( '(' )
            // InternalMyDsl.g:21:9: '('
            {
            match('('); 

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
            // InternalMyDsl.g:22:7: ( ')' )
            // InternalMyDsl.g:22:9: ')'
            {
            match(')'); 

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
            // InternalMyDsl.g:23:7: ( '[' )
            // InternalMyDsl.g:23:9: '['
            {
            match('['); 

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
            // InternalMyDsl.g:24:7: ( ']' )
            // InternalMyDsl.g:24:9: ']'
            {
            match(']'); 

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
            // InternalMyDsl.g:25:7: ( '{' )
            // InternalMyDsl.g:25:9: '{'
            {
            match('{'); 

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
            // InternalMyDsl.g:26:7: ( '}' )
            // InternalMyDsl.g:26:9: '}'
            {
            match('}'); 

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
            // InternalMyDsl.g:27:7: ( ',' )
            // InternalMyDsl.g:27:9: ','
            {
            match(','); 

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
            // InternalMyDsl.g:28:7: ( '...' )
            // InternalMyDsl.g:28:9: '...'
            {
            match("..."); 


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
            // InternalMyDsl.g:29:7: ( ';' )
            // InternalMyDsl.g:29:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:30:7: ( '=' )
            // InternalMyDsl.g:30:9: '='
            {
            match('='); 

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
            // InternalMyDsl.g:31:7: ( ':=' )
            // InternalMyDsl.g:31:9: ':='
            {
            match(":="); 


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
            // InternalMyDsl.g:32:7: ( 'func' )
            // InternalMyDsl.g:32:9: 'func'
            {
            match("func"); 


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
            // InternalMyDsl.g:33:7: ( ':' )
            // InternalMyDsl.g:33:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:34:7: ( 'const' )
            // InternalMyDsl.g:34:9: 'const'
            {
            match("const"); 


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
            // InternalMyDsl.g:35:7: ( 'type' )
            // InternalMyDsl.g:35:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'var' )
            // InternalMyDsl.g:36:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '||' )
            // InternalMyDsl.g:37:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( '&&' )
            // InternalMyDsl.g:38:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'package' )
            // InternalMyDsl.g:39:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'import' )
            // InternalMyDsl.g:40:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalMyDsl.g:19172:23: ( ( '\\n' | '\\r' | '\\n\\r' ) )
            // InternalMyDsl.g:19172:25: ( '\\n' | '\\r' | '\\n\\r' )
            {
            // InternalMyDsl.g:19172:25: ( '\\n' | '\\r' | '\\n\\r' )
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
                    // InternalMyDsl.g:19172:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19172:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19172:36: '\\n\\r'
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
            // InternalMyDsl.g:19174:28: ( 'nao seei' )
            // InternalMyDsl.g:19174:30: 'nao seei'
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
            // InternalMyDsl.g:19176:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:19176:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // InternalMyDsl.g:19178:29: ( '0' .. '9' )
            // InternalMyDsl.g:19178:31: '0' .. '9'
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
            // InternalMyDsl.g:19180:27: ( '0' .. '7' )
            // InternalMyDsl.g:19180:29: '0' .. '7'
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
            // InternalMyDsl.g:19182:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalMyDsl.g:19182:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalMyDsl.g:19184:12: ( 'break' )
            // InternalMyDsl.g:19184:14: 'break'
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
            // InternalMyDsl.g:19186:14: ( 'default' )
            // InternalMyDsl.g:19186:16: 'default'
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
            // InternalMyDsl.g:19188:16: ( 'interface' )
            // InternalMyDsl.g:19188:18: 'interface'
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
            // InternalMyDsl.g:19190:13: ( 'select' )
            // InternalMyDsl.g:19190:15: 'select'
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
            // InternalMyDsl.g:19192:11: ( 'case' )
            // InternalMyDsl.g:19192:13: 'case'
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
            // InternalMyDsl.g:19194:12: ( 'defer' )
            // InternalMyDsl.g:19194:14: 'defer'
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
            // InternalMyDsl.g:19196:9: ( 'go' )
            // InternalMyDsl.g:19196:11: 'go'
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
            // InternalMyDsl.g:19198:10: ( 'map' )
            // InternalMyDsl.g:19198:12: 'map'
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
            // InternalMyDsl.g:19200:13: ( 'struct' )
            // InternalMyDsl.g:19200:15: 'struct'
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
            // InternalMyDsl.g:19202:11: ( 'chan' )
            // InternalMyDsl.g:19202:13: 'chan'
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
            // InternalMyDsl.g:19204:11: ( 'else' )
            // InternalMyDsl.g:19204:13: 'else'
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
            // InternalMyDsl.g:19206:11: ( 'goto' )
            // InternalMyDsl.g:19206:13: 'goto'
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
            // InternalMyDsl.g:19208:13: ( 'switch' )
            // InternalMyDsl.g:19208:15: 'switch'
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
            // InternalMyDsl.g:19210:18: ( 'fallthrough' )
            // InternalMyDsl.g:19210:20: 'fallthrough'
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
            // InternalMyDsl.g:19212:9: ( 'if' )
            // InternalMyDsl.g:19212:11: 'if'
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
            // InternalMyDsl.g:19214:12: ( 'range' )
            // InternalMyDsl.g:19214:14: 'range'
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
            // InternalMyDsl.g:19216:15: ( 'continue' )
            // InternalMyDsl.g:19216:17: 'continue'
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
            // InternalMyDsl.g:19218:10: ( 'for' )
            // InternalMyDsl.g:19218:12: 'for'
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
            // InternalMyDsl.g:19220:13: ( 'return' )
            // InternalMyDsl.g:19220:15: 'return'
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
            // InternalMyDsl.g:19222:17: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalMyDsl.g:19222:19: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:19222:31: ( RULE_LETTER | '0' .. '9' )*
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
            // InternalMyDsl.g:19224:14: ( ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ) )
            // InternalMyDsl.g:19224:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
            {
            // InternalMyDsl.g:19224:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
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
                    // InternalMyDsl.g:19224:17: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:19224:26: ( RULE_DECIMAL_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:19224:26: RULE_DECIMAL_DIGIT
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
                    // InternalMyDsl.g:19224:46: '0' ( RULE_OCTAL_DIGIT )*
                    {
                    match('0'); 
                    // InternalMyDsl.g:19224:50: ( RULE_OCTAL_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='7')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:19224:50: RULE_OCTAL_DIGIT
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
                    // InternalMyDsl.g:19224:68: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:19224:82: ( RULE_HEX_DIGIT )+
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
                    	    // InternalMyDsl.g:19224:82: RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19226:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalMyDsl.g:19226:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalMyDsl.g:19226:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:19226:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalMyDsl.g:19226:37: ( RULE_DECIMALS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:19226:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:19226:52: ( RULE_EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:19226:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19226:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19226:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalMyDsl.g:19226:113: ( RULE_EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:19226:113: RULE_EXPONENT
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
            // InternalMyDsl.g:19228:24: ( RULE_INT )
            // InternalMyDsl.g:19228:26: RULE_INT
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
            // InternalMyDsl.g:19230:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalMyDsl.g:19230:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:19230:36: ( '+' | '-' )?
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
            // InternalMyDsl.g:19232:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalMyDsl.g:19232:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalMyDsl.g:19232:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:19232:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19232:37: RULE_FLOAT_LIT
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
            // InternalMyDsl.g:19234:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalMyDsl.g:19234:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalMyDsl.g:19234:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='n') ) {
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
                    // InternalMyDsl.g:19234:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19234:42: RULE_BYTE_VALUE
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
            // InternalMyDsl.g:19236:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalMyDsl.g:19236:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalMyDsl.g:19236:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='n') ) {
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
                    // InternalMyDsl.g:19236:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19236:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19236:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:19236:87: RULE_ESCAPED_CHAR
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
            // InternalMyDsl.g:19238:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalMyDsl.g:19238:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalMyDsl.g:19238:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
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
                    // InternalMyDsl.g:19238:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19238:51: RULE_HEX_BYTE_VALUE
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
            // InternalMyDsl.g:19240:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalMyDsl.g:19240:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalMyDsl.g:19242:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:19242:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19244:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:19244:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19246:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:19246:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19248:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalMyDsl.g:19248:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalMyDsl.g:19250:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalMyDsl.g:19250:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalMyDsl.g:19250:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
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
                    // InternalMyDsl.g:19250:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19250:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalMyDsl.g:19252:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalMyDsl.g:19252:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalMyDsl.g:19252:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='n') ) {
                    alt17=1;
                }
                else if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:19252:38: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:19252:56: RULE_NEWLINE
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
            // InternalMyDsl.g:19254:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalMyDsl.g:19254:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalMyDsl.g:19254:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='n') ) {
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
            	    // InternalMyDsl.g:19254:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:19254:64: RULE_BYTE_VALUE
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
            // InternalMyDsl.g:19256:16: ( '#' )
            // InternalMyDsl.g:19256:18: '#'
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
            // InternalMyDsl.g:19258:13: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:19258:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:19258:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
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
                    // InternalMyDsl.g:19258:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19258:21: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19258:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:19258:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:19258:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:19258:39: '>='
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
            // InternalMyDsl.g:19260:13: ( ( '+' | '-' | '|' | '^' ) )
            // InternalMyDsl.g:19260:15: ( '+' | '-' | '|' | '^' )
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
            // InternalMyDsl.g:19262:13: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:19262:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:19262:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
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
                    // InternalMyDsl.g:19262:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19262:20: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19262:24: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:19262:28: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:19262:33: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:19262:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:19262:42: '&^'
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
            // InternalMyDsl.g:19264:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:19264:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:19264:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:19264:11: '^'
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

            // InternalMyDsl.g:19264:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMyDsl.g:19266:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:19266:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:19266:21: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:19266:22: '0' .. '9'
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
            // InternalMyDsl.g:19268:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:19268:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:19268:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMyDsl.g:19268:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:19268:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyDsl.g:19268:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:19268:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMyDsl.g:19268:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:19268:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyDsl.g:19268:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:19268:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMyDsl.g:19270:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:19270:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:19270:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyDsl.g:19270:52: .
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
            // InternalMyDsl.g:19272:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:19272:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:19272:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:19272:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyDsl.g:19272:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:19272:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:19272:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyDsl.g:19272:41: '\\r'
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
            // InternalMyDsl.g:19274:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:19274:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:19274:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalMyDsl.g:1:8: ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_BREAK | RULE_DEFAULT | RULE_INTERFACE | RULE_SELECT | RULE_CASE | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_SWITCH | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_RETURN | RULE_IDENTIFIER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt32=64;
        alt32 = dfa32.predict(input);
        switch (alt32) {
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
                // InternalMyDsl.g:1:160: T__81
                {
                mT__81(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__82
                {
                mT__82(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__83
                {
                mT__83(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__84
                {
                mT__84(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__85
                {
                mT__85(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:201: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:214: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:229: RULE_SELECT
                {
                mRULE_SELECT(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:241: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:251: RULE_DEFER
                {
                mRULE_DEFER(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:262: RULE_GO
                {
                mRULE_GO(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:270: RULE_MAP
                {
                mRULE_MAP(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:279: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:291: RULE_CHAN
                {
                mRULE_CHAN(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:301: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:311: RULE_GOTO
                {
                mRULE_GOTO(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:321: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:333: RULE_FALLTHROUGH
                {
                mRULE_FALLTHROUGH(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:350: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:358: RULE_RANGE
                {
                mRULE_RANGE(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:369: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:383: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:392: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:404: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:420: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:433: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:448: RULE_IMAGINARY_LIT
                {
                mRULE_IMAGINARY_LIT(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:467: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:481: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:497: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:512: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:524: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:536: RULE_MUL_OP
                {
                mRULE_MUL_OP(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:548: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:556: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:568: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:584: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:600: RULE_WS
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
            return "19226:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
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
            return "19232:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\1\54\1\56\1\60\1\61\1\62\1\uffff\1\66\1\70\10\uffff\1\72\1\74\4\100\1\110\12\100\2\127\3\uffff\1\54\1\51\20\uffff\1\151\3\uffff\3\100\1\uffff\6\100\2\uffff\3\100\1\166\5\100\1\175\4\100\2\uffff\1\127\1\151\1\uffff\1\127\16\uffff\2\100\1\u0099\4\100\1\u009f\3\100\1\uffff\6\100\1\uffff\1\u00aa\3\100\1\uffff\2\151\21\uffff\1\151\1\u00bc\1\100\1\uffff\2\100\1\u00c0\1\u00c1\1\u00c2\1\uffff\11\100\1\u00cc\1\uffff\1\u00cd\2\100\1\uffff\1\151\15\uffff\1\100\1\u00dd\1\100\3\uffff\3\100\1\u00e2\1\100\1\u00e4\3\100\2\uffff\1\u00e8\1\100\14\uffff\1\100\1\uffff\2\100\1\u00f4\1\100\1\uffff\1\100\1\uffff\1\u00f7\1\u00f8\1\u00f9\1\uffff\1\u00fa\7\uffff\2\100\1\u0104\1\uffff\1\100\1\u0106\13\uffff\1\100\1\u010d\1\uffff\1\100\6\uffff\1\100\1\uffff\1\u0115\5\uffff\1\100\5\uffff\1\u011d\3\uffff";
    static final String DFA32_eofS =
        "\u011e\uffff";
    static final String DFA32_minS =
        "\1\11\1\55\1\53\1\55\1\75\1\101\1\uffff\1\46\1\56\10\uffff\2\75\4\60\1\174\12\60\2\56\2\0\1\uffff\1\76\1\52\20\uffff\1\60\3\uffff\3\60\1\uffff\6\60\2\uffff\16\60\1\uffff\1\53\1\56\1\60\1\uffff\2\56\2\0\1\uffff\2\0\1\uffff\2\0\4\uffff\1\53\13\60\1\uffff\6\60\1\uffff\7\60\1\53\6\0\1\uffff\10\0\4\60\1\uffff\5\60\1\uffff\12\60\1\uffff\5\60\2\0\1\uffff\11\0\1\uffff\3\60\3\uffff\11\60\2\uffff\2\60\2\0\1\uffff\11\0\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\7\0\3\60\1\uffff\2\60\4\uffff\7\0\2\60\1\uffff\1\60\1\uffff\5\0\1\60\1\uffff\1\60\5\0\1\60\1\uffff\1\0\1\uffff\2\0\1\60\2\0\1\uffff";
    static final String DFA32_maxS =
        "\1\175\1\74\1\53\1\55\1\75\1\172\1\uffff\1\136\1\71\10\uffff\2\75\4\172\1\174\12\172\2\151\2\uffff\1\uffff\1\76\1\57\20\uffff\1\151\3\uffff\3\172\1\uffff\6\172\2\uffff\16\172\1\uffff\1\71\2\151\1\uffff\2\151\2\uffff\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff\1\71\13\172\1\uffff\6\172\1\uffff\4\172\1\71\2\151\1\71\6\uffff\1\uffff\10\uffff\1\71\1\151\2\172\1\uffff\5\172\1\uffff\12\172\1\uffff\3\172\1\71\1\151\2\uffff\1\uffff\11\uffff\1\uffff\3\172\3\uffff\11\172\2\uffff\2\172\2\uffff\1\uffff\11\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\7\uffff\3\172\1\uffff\2\172\4\uffff\7\uffff\2\172\1\uffff\1\172\1\uffff\5\uffff\1\172\1\uffff\1\172\5\uffff\1\172\1\uffff\1\uffff\1\uffff\2\uffff\1\172\2\uffff\1\uffff";
    static final String DFA32_acceptS =
        "\6\uffff\1\6\2\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\23\25\uffff\1\70\2\uffff\1\73\1\100\1\1\1\71\1\10\1\2\1\11\1\3\1\4\1\5\1\74\1\6\1\34\1\7\1\22\1\12\1\uffff\1\24\1\25\1\27\3\uffff\1\62\6\uffff\1\33\1\72\16\uffff\1\63\3\uffff\1\65\4\uffff\1\67\2\uffff\1\75\2\uffff\1\67\1\76\1\77\1\64\14\uffff\1\55\6\uffff\1\45\16\uffff\1\67\14\uffff\1\60\5\uffff\1\32\12\uffff\1\46\7\uffff\1\66\11\uffff\1\26\3\uffff\1\43\1\50\1\31\11\uffff\1\52\1\51\4\uffff\1\66\12\uffff\1\30\4\uffff\1\37\1\uffff\1\44\3\uffff\1\56\13\uffff\1\36\2\uffff\1\42\1\47\1\53\1\61\11\uffff\1\35\1\uffff\1\40\6\uffff\1\57\7\uffff\1\41\1\uffff\1\66\5\uffff\1\54";
    static final String DFA32_specialS =
        "\44\uffff\1\65\1\110\70\uffff\1\106\1\0\1\uffff\1\20\1\70\1\uffff\1\7\1\105\40\uffff\1\73\1\77\1\63\1\66\1\61\1\1\1\uffff\1\22\1\23\1\10\1\36\1\43\1\54\1\30\1\17\33\uffff\1\67\1\74\1\uffff\1\64\1\62\1\2\1\25\1\11\1\34\1\40\1\24\1\21\24\uffff\1\71\1\75\1\uffff\1\57\1\55\1\3\1\26\1\12\1\35\1\42\1\52\1\41\16\uffff\1\72\1\76\1\4\1\27\1\13\1\37\1\44\12\uffff\1\56\1\100\1\5\1\31\1\14\1\45\1\46\5\uffff\1\101\1\6\1\32\1\15\1\47\3\uffff\1\102\1\16\1\33\1\104\1\50\2\uffff\1\103\1\uffff\1\107\1\51\1\uffff\1\60\1\53\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\4\1\45\1\46\1\uffff\1\51\1\7\1\44\1\11\1\12\1\6\1\2\1\17\1\3\1\10\1\50\1\43\11\42\1\22\1\20\1\1\1\21\1\47\2\uffff\32\41\1\13\1\uffff\1\14\1\5\1\41\1\uffff\1\41\1\32\1\24\1\33\1\37\1\23\1\35\1\41\1\31\3\41\1\36\2\41\1\30\1\41\1\40\1\34\1\25\1\41\1\26\4\41\1\15\1\27\1\16",
            "\1\53\16\uffff\1\51",
            "\1\55",
            "\1\57",
            "\1\54",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\65\67\uffff\1\51",
            "\1\67\1\uffff\12\71",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\73",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\76\15\101\1\77\5\101\1\75\5\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\103\6\101\1\104\6\101\1\102\13\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\30\101\1\105\1\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\106\31\101",
            "\1\107",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\111\31\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\5\101\1\114\6\101\1\112\1\113\14\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\115\10\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\116\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\117\16\101\1\120\2\101\1\121\3\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\16\101\1\122\13\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\123\31\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\13\101\1\124\16\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\125\3\101\1\126\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\1\132\1\uffff\12\131\13\uffff\1\130\37\uffff\1\130\3\uffff\1\133",
            "\1\132\1\uffff\10\134\2\135\13\uffff\1\130\37\uffff\1\130\3\uffff\1\133",
            "\12\143\1\141\2\143\1\142\31\143\1\140\64\143\1\136\21\143\1\137\uff91\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
            "",
            "\1\51",
            "\1\147\4\uffff\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\71\13\uffff\1\152\37\uffff\1\152\3\uffff\1\133",
            "",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\15\101\1\153\14\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\13\101\1\154\16\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\155\10\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\15\101\1\156\14\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\22\101\1\157\7\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\160\31\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\17\101\1\161\12\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\162\10\101",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\163\27\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\17\101\1\164\12\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\165\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\167\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\5\101\1\170\24\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\13\101\1\171\16\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\172\10\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\10\101\1\173\21\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\174\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\17\101\1\176\12\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\22\101\1\177\7\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\15\101\1\u0080\14\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u0081\6\101",
            "",
            "\1\u0082\1\uffff\1\u0082\2\uffff\12\u0083",
            "\1\132\1\uffff\12\131\13\uffff\1\130\37\uffff\1\130\3\uffff\1\133",
            "\12\u0084\13\uffff\1\u0085\37\uffff\1\u0085\3\uffff\1\133",
            "",
            "\1\132\1\uffff\10\134\2\135\13\uffff\1\130\37\uffff\1\130\3\uffff\1\133",
            "\1\132\1\uffff\12\135\13\uffff\1\130\37\uffff\1\130\3\uffff\1\133",
            "\42\143\1\u0088\4\143\1\u0088\10\143\10\u008a\35\143\1\u0087\6\143\1\u0088\4\143\2\u0088\3\143\1\u0088\7\143\1\u0088\3\143\1\u0088\1\143\1\u0088\1\u0086\1\u0088\1\143\1\u0089\uff87\143",
            "\141\143\1\u008b\uff9e\143",
            "",
            "\12\143\1\141\2\143\1\u008d\31\143\1\140\106\143\1\u008e\uff91\143",
            "\12\143\1\141\2\143\1\142\31\143\1\140\106\143\1\u008e\uff91\143",
            "",
            "\141\143\1\u008f\uff9e\143",
            "\42\143\1\u0092\4\143\1\u0092\10\143\10\u0094\35\143\1\u0091\6\143\1\u0092\4\143\2\u0092\3\143\1\u0092\7\143\1\u0092\3\143\1\u0092\1\143\1\u0092\1\u0090\1\u0092\1\143\1\u0093\uff87\143",
            "",
            "",
            "",
            "",
            "\1\u0095\1\uffff\1\u0095\2\uffff\12\u0096",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\u0097\27\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\13\101\1\u0098\16\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\22\101\1\u009a\1\u009b\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u009c\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\15\101\1\u009d\14\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u009e\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\12\101\1\u00a0\17\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\16\101\1\u00a1\13\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u00a2\25\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\u00a3\31\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\u00a4\3\101\1\u00a5\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u00a6\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\24\101\1\u00a7\5\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00a8\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\16\101\1\u00a9\13\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u00ab\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\6\101\1\u00ac\23\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\24\101\1\u00ad\5\101",
            "\12\u0083",
            "\12\u0083\57\uffff\1\133",
            "\12\u0084\13\uffff\1\u0085\37\uffff\1\u0085\3\uffff\1\133",
            "\1\u00ae\1\uffff\1\u00ae\2\uffff\12\u00af",
            "\60\143\12\u00b0\7\143\6\u00b0\32\143\6\u00b0\uff99\143",
            "\60\143\12\u00b1\7\143\6\u00b1\32\143\6\u00b1\uff99\143",
            "\47\143\1\u00b2\uffd8\143",
            "\60\143\12\u00b3\7\143\6\u00b3\32\143\6\u00b3\uff99\143",
            "\60\143\10\u00b4\uffc8\143",
            "\157\143\1\u00b5\uff90\143",
            "",
            "\12\143\1\141\2\143\1\142\31\143\1\140\106\143\1\u008e\uff91\143",
            "\141\143\1\u00b6\uff9e\143",
            "\157\143\1\u00b7\uff90\143",
            "\60\143\12\u00b8\7\143\6\u00b8\32\143\6\u00b8\uff99\143",
            "\60\143\12\u00b9\7\143\6\u00b9\32\143\6\u00b9\uff99\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
            "\60\143\12\u00ba\7\143\6\u00ba\32\143\6\u00ba\uff99\143",
            "\60\143\10\u00bb\uffc8\143",
            "\12\u0096",
            "\12\u0096\57\uffff\1\133",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00bd\6\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00be\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\10\101\1\u00bf\21\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\u00c3\31\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\u00c4\10\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\u00c5\10\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\12\101\1\u00c6\17\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\24\101\1\u00c7\5\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\u00c8\10\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\u00c9\27\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\u00ca\27\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\u00cb\27\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u00ce\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\u00cf\10\101",
            "\12\u00af",
            "\12\u00af\57\uffff\1\133",
            "\60\143\12\u00d0\7\143\6\u00d0\32\143\6\u00d0\uff99\143",
            "\60\143\12\u00d1\7\143\6\u00d1\32\143\6\u00d1\uff99\143",
            "",
            "\60\143\12\u00d3\7\143\6\u00d3\32\143\6\u00d3\uff99\143",
            "\60\143\10\u00d4\uffc8\143",
            "\40\143\1\u00d5\uffdf\143",
            "\157\143\1\u00d6\uff90\143",
            "\40\143\1\u00d7\uffdf\143",
            "\60\143\12\u00d8\7\143\6\u00d8\32\143\6\u00d8\uff99\143",
            "\60\143\12\u00d9\7\143\6\u00d9\32\143\6\u00d9\uff99\143",
            "\60\143\12\u00da\7\143\6\u00da\32\143\6\u00da\uff99\143",
            "\60\143\10\u00db\uffc8\143",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\7\101\1\u00dc\22\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\15\101\1\u00de\14\101",
            "",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\6\101\1\u00df\23\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00e0\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\5\101\1\u00e1\24\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\13\101\1\u00e3\16\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00e5\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00e6\6\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\7\101\1\u00e7\22\101",
            "",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\15\101\1\u00e9\14\101",
            "\60\143\12\u00ea\7\143\6\u00ea\32\143\6\u00ea\uff99\143",
            "\60\143\12\u00eb\7\143\6\u00eb\32\143\6\u00eb\uff99\143",
            "",
            "\47\143\1\u00b2\uffd8\143",
            "\47\143\1\u00b2\uffd8\143",
            "\163\143\1\u00ec\uff8c\143",
            "\40\143\1\u00ed\uffdf\143",
            "\163\143\1\u00ee\uff8c\143",
            "\60\143\12\u00ef\7\143\6\u00ef\32\143\6\u00ef\uff99\143",
            "\60\143\12\u00f0\7\143\6\u00f0\32\143\6\u00f0\uff99\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\21\101\1\u00f1\10\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\24\101\1\u00f2\5\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u00f3\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\1\u00f5\31\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\23\101\1\u00f6\6\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\60\143\12\u00fb\7\143\6\u00fb\32\143\6\u00fb\uff99\143",
            "\60\143\12\u00fc\7\143\6\u00fc\32\143\6\u00fc\uff99\143",
            "\145\143\1\u00fd\uff9a\143",
            "\163\143\1\u00fe\uff8c\143",
            "\145\143\1\u00ff\uff9a\143",
            "\60\143\12\u0100\7\143\6\u0100\32\143\6\u0100\uff99\143",
            "\60\143\12\u0101\7\143\6\u0101\32\143\6\u0101\uff99\143",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\16\101\1\u0102\13\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u0103\25\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\2\101\1\u0105\27\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "",
            "",
            "",
            "\47\143\1\u00b2\uffd8\143",
            "\60\143\12\u0107\7\143\6\u0107\32\143\6\u0107\uff99\143",
            "\145\143\1\u0108\uff9a\143",
            "\145\143\1\u0109\uff9a\143",
            "\145\143\1\u010a\uff9a\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
            "\60\143\12\u010b\7\143\6\u010b\32\143\6\u010b\uff99\143",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\24\101\1\u010c\5\101",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\4\101\1\u010e\25\101",
            "",
            "\60\143\12\u010f\7\143\6\u010f\32\143\6\u010f\uff99\143",
            "\151\143\1\u0110\uff96\143",
            "\145\143\1\u0111\uff9a\143",
            "\151\143\1\u0112\uff96\143",
            "\60\143\12\u0113\7\143\6\u0113\32\143\6\u0113\uff99\143",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\6\101\1\u0114\23\101",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\60\143\12\u0116\7\143\6\u0116\32\143\6\u0116\uff99\143",
            "\12\143\1\141\2\143\1\142\31\143\1\u0117\106\143\1\u008e\uff91\143",
            "\151\143\1\u0118\uff96\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
            "\60\143\12\u0119\7\143\6\u0119\32\143\6\u0119\uff99\143",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\7\101\1\u011a\22\101",
            "",
            "\60\143\12\u011b\7\143\6\u011b\32\143\6\u011b\uff99\143",
            "",
            "\12\143\1\141\2\143\1\142\31\143\1\140\106\143\1\u008e\uff91\143",
            "\60\143\12\u011c\7\143\6\u011c\32\143\6\u011c\uff99\143",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\47\143\1\u00b2\uffd8\143",
            "\42\143\1\146\71\143\1\145\21\143\1\144\uff91\143",
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
            return "1:1: Tokens : ( T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_BREAK | RULE_DEFAULT | RULE_INTERFACE | RULE_SELECT | RULE_CASE | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_SWITCH | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_RETURN | RULE_IDENTIFIER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_95 = input.LA(1);

                        s = -1;
                        if ( (LA32_95=='a') ) {s = 139;}

                        else if ( ((LA32_95>='\u0000' && LA32_95<='`')||(LA32_95>='b' && LA32_95<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_139 = input.LA(1);

                        s = -1;
                        if ( (LA32_139=='o') ) {s = 181;}

                        else if ( ((LA32_139>='\u0000' && LA32_139<='n')||(LA32_139>='p' && LA32_139<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_181 = input.LA(1);

                        s = -1;
                        if ( (LA32_181==' ') ) {s = 213;}

                        else if ( ((LA32_181>='\u0000' && LA32_181<='\u001F')||(LA32_181>='!' && LA32_181<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_213 = input.LA(1);

                        s = -1;
                        if ( (LA32_213=='s') ) {s = 236;}

                        else if ( ((LA32_213>='\u0000' && LA32_213<='r')||(LA32_213>='t' && LA32_213<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_236 = input.LA(1);

                        s = -1;
                        if ( (LA32_236=='e') ) {s = 253;}

                        else if ( ((LA32_236>='\u0000' && LA32_236<='d')||(LA32_236>='f' && LA32_236<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_253 = input.LA(1);

                        s = -1;
                        if ( (LA32_253=='e') ) {s = 264;}

                        else if ( ((LA32_253>='\u0000' && LA32_253<='d')||(LA32_253>='f' && LA32_253<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_264 = input.LA(1);

                        s = -1;
                        if ( (LA32_264=='i') ) {s = 272;}

                        else if ( ((LA32_264>='\u0000' && LA32_264<='h')||(LA32_264>='j' && LA32_264<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_100 = input.LA(1);

                        s = -1;
                        if ( (LA32_100=='a') ) {s = 143;}

                        else if ( ((LA32_100>='\u0000' && LA32_100<='`')||(LA32_100>='b' && LA32_100<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_143 = input.LA(1);

                        s = -1;
                        if ( (LA32_143=='o') ) {s = 183;}

                        else if ( ((LA32_143>='\u0000' && LA32_143<='n')||(LA32_143>='p' && LA32_143<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_183 = input.LA(1);

                        s = -1;
                        if ( (LA32_183==' ') ) {s = 215;}

                        else if ( ((LA32_183>='\u0000' && LA32_183<='\u001F')||(LA32_183>='!' && LA32_183<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_215 = input.LA(1);

                        s = -1;
                        if ( (LA32_215=='s') ) {s = 238;}

                        else if ( ((LA32_215>='\u0000' && LA32_215<='r')||(LA32_215>='t' && LA32_215<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_238 = input.LA(1);

                        s = -1;
                        if ( (LA32_238=='e') ) {s = 255;}

                        else if ( ((LA32_238>='\u0000' && LA32_238<='d')||(LA32_238>='f' && LA32_238<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_255 = input.LA(1);

                        s = -1;
                        if ( (LA32_255=='e') ) {s = 266;}

                        else if ( ((LA32_255>='\u0000' && LA32_255<='d')||(LA32_255>='f' && LA32_255<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_266 = input.LA(1);

                        s = -1;
                        if ( (LA32_266=='i') ) {s = 274;}

                        else if ( ((LA32_266>='\u0000' && LA32_266<='h')||(LA32_266>='j' && LA32_266<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_272 = input.LA(1);

                        s = -1;
                        if ( (LA32_272=='\'') ) {s = 279;}

                        else if ( (LA32_272=='n') ) {s = 142;}

                        else if ( (LA32_272=='\n') ) {s = 97;}

                        else if ( (LA32_272=='\r') ) {s = 98;}

                        else if ( ((LA32_272>='\u0000' && LA32_272<='\t')||(LA32_272>='\u000B' && LA32_272<='\f')||(LA32_272>='\u000E' && LA32_272<='&')||(LA32_272>='(' && LA32_272<='m')||(LA32_272>='o' && LA32_272<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_148 = input.LA(1);

                        s = -1;
                        if ( ((LA32_148>='\u0000' && LA32_148<='/')||(LA32_148>='8' && LA32_148<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_148>='0' && LA32_148<='7')) ) {s = 187;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_97 = input.LA(1);

                        s = -1;
                        if ( (LA32_97=='\r') ) {s = 141;}

                        else if ( (LA32_97=='\'') ) {s = 96;}

                        else if ( (LA32_97=='n') ) {s = 142;}

                        else if ( (LA32_97=='\n') ) {s = 97;}

                        else if ( ((LA32_97>='\u0000' && LA32_97<='\t')||(LA32_97>='\u000B' && LA32_97<='\f')||(LA32_97>='\u000E' && LA32_97<='&')||(LA32_97>='(' && LA32_97<='m')||(LA32_97>='o' && LA32_97<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_187 = input.LA(1);

                        s = -1;
                        if ( ((LA32_187>='\u0000' && LA32_187<='/')||(LA32_187>='8' && LA32_187<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_187>='0' && LA32_187<='7')) ) {s = 219;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_141 = input.LA(1);

                        s = -1;
                        if ( (LA32_141=='\'') ) {s = 96;}

                        else if ( ((LA32_141>='\u0000' && LA32_141<='\t')||(LA32_141>='\u000B' && LA32_141<='\f')||(LA32_141>='\u000E' && LA32_141<='&')||(LA32_141>='(' && LA32_141<='m')||(LA32_141>='o' && LA32_141<='\uFFFF')) ) {s = 99;}

                        else if ( (LA32_141=='n') ) {s = 142;}

                        else if ( (LA32_141=='\n') ) {s = 97;}

                        else if ( (LA32_141=='\r') ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_142 = input.LA(1);

                        s = -1;
                        if ( (LA32_142=='a') ) {s = 182;}

                        else if ( ((LA32_142>='\u0000' && LA32_142<='`')||(LA32_142>='b' && LA32_142<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_186 = input.LA(1);

                        s = -1;
                        if ( ((LA32_186>='\u0000' && LA32_186<='/')||(LA32_186>=':' && LA32_186<='@')||(LA32_186>='G' && LA32_186<='`')||(LA32_186>='g' && LA32_186<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_186>='0' && LA32_186<='9')||(LA32_186>='A' && LA32_186<='F')||(LA32_186>='a' && LA32_186<='f')) ) {s = 218;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_182 = input.LA(1);

                        s = -1;
                        if ( (LA32_182=='o') ) {s = 214;}

                        else if ( ((LA32_182>='\u0000' && LA32_182<='n')||(LA32_182>='p' && LA32_182<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_214 = input.LA(1);

                        s = -1;
                        if ( (LA32_214==' ') ) {s = 237;}

                        else if ( ((LA32_214>='\u0000' && LA32_214<='\u001F')||(LA32_214>='!' && LA32_214<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_237 = input.LA(1);

                        s = -1;
                        if ( (LA32_237=='s') ) {s = 254;}

                        else if ( ((LA32_237>='\u0000' && LA32_237<='r')||(LA32_237>='t' && LA32_237<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_147 = input.LA(1);

                        s = -1;
                        if ( ((LA32_147>='\u0000' && LA32_147<='/')||(LA32_147>=':' && LA32_147<='@')||(LA32_147>='G' && LA32_147<='`')||(LA32_147>='g' && LA32_147<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_147>='0' && LA32_147<='9')||(LA32_147>='A' && LA32_147<='F')||(LA32_147>='a' && LA32_147<='f')) ) {s = 186;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_254 = input.LA(1);

                        s = -1;
                        if ( (LA32_254=='e') ) {s = 265;}

                        else if ( ((LA32_254>='\u0000' && LA32_254<='d')||(LA32_254>='f' && LA32_254<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_265 = input.LA(1);

                        s = -1;
                        if ( (LA32_265=='e') ) {s = 273;}

                        else if ( ((LA32_265>='\u0000' && LA32_265<='d')||(LA32_265>='f' && LA32_265<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_273 = input.LA(1);

                        s = -1;
                        if ( (LA32_273=='i') ) {s = 280;}

                        else if ( ((LA32_273>='\u0000' && LA32_273<='h')||(LA32_273>='j' && LA32_273<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_184 = input.LA(1);

                        s = -1;
                        if ( ((LA32_184>='0' && LA32_184<='9')||(LA32_184>='A' && LA32_184<='F')||(LA32_184>='a' && LA32_184<='f')) ) {s = 216;}

                        else if ( ((LA32_184>='\u0000' && LA32_184<='/')||(LA32_184>=':' && LA32_184<='@')||(LA32_184>='G' && LA32_184<='`')||(LA32_184>='g' && LA32_184<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_216 = input.LA(1);

                        s = -1;
                        if ( ((LA32_216>='0' && LA32_216<='9')||(LA32_216>='A' && LA32_216<='F')||(LA32_216>='a' && LA32_216<='f')) ) {s = 239;}

                        else if ( ((LA32_216>='\u0000' && LA32_216<='/')||(LA32_216>=':' && LA32_216<='@')||(LA32_216>='G' && LA32_216<='`')||(LA32_216>='g' && LA32_216<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_144 = input.LA(1);

                        s = -1;
                        if ( ((LA32_144>='\u0000' && LA32_144<='/')||(LA32_144>=':' && LA32_144<='@')||(LA32_144>='G' && LA32_144<='`')||(LA32_144>='g' && LA32_144<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_144>='0' && LA32_144<='9')||(LA32_144>='A' && LA32_144<='F')||(LA32_144>='a' && LA32_144<='f')) ) {s = 184;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_239 = input.LA(1);

                        s = -1;
                        if ( ((LA32_239>='0' && LA32_239<='9')||(LA32_239>='A' && LA32_239<='F')||(LA32_239>='a' && LA32_239<='f')) ) {s = 256;}

                        else if ( ((LA32_239>='\u0000' && LA32_239<='/')||(LA32_239>=':' && LA32_239<='@')||(LA32_239>='G' && LA32_239<='`')||(LA32_239>='g' && LA32_239<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_185 = input.LA(1);

                        s = -1;
                        if ( ((LA32_185>='0' && LA32_185<='9')||(LA32_185>='A' && LA32_185<='F')||(LA32_185>='a' && LA32_185<='f')) ) {s = 217;}

                        else if ( ((LA32_185>='\u0000' && LA32_185<='/')||(LA32_185>=':' && LA32_185<='@')||(LA32_185>='G' && LA32_185<='`')||(LA32_185>='g' && LA32_185<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_219 = input.LA(1);

                        s = -1;
                        if ( (LA32_219=='\"') ) {s = 102;}

                        else if ( (LA32_219=='\\') ) {s = 101;}

                        else if ( (LA32_219=='n') ) {s = 100;}

                        else if ( ((LA32_219>='\u0000' && LA32_219<='!')||(LA32_219>='#' && LA32_219<='[')||(LA32_219>=']' && LA32_219<='m')||(LA32_219>='o' && LA32_219<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_217 = input.LA(1);

                        s = -1;
                        if ( ((LA32_217>='0' && LA32_217<='9')||(LA32_217>='A' && LA32_217<='F')||(LA32_217>='a' && LA32_217<='f')) ) {s = 240;}

                        else if ( ((LA32_217>='\u0000' && LA32_217<='/')||(LA32_217>=':' && LA32_217<='@')||(LA32_217>='G' && LA32_217<='`')||(LA32_217>='g' && LA32_217<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_145 = input.LA(1);

                        s = -1;
                        if ( ((LA32_145>='\u0000' && LA32_145<='/')||(LA32_145>=':' && LA32_145<='@')||(LA32_145>='G' && LA32_145<='`')||(LA32_145>='g' && LA32_145<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_145>='0' && LA32_145<='9')||(LA32_145>='A' && LA32_145<='F')||(LA32_145>='a' && LA32_145<='f')) ) {s = 185;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_240 = input.LA(1);

                        s = -1;
                        if ( ((LA32_240>='0' && LA32_240<='9')||(LA32_240>='A' && LA32_240<='F')||(LA32_240>='a' && LA32_240<='f')) ) {s = 257;}

                        else if ( ((LA32_240>='\u0000' && LA32_240<='/')||(LA32_240>=':' && LA32_240<='@')||(LA32_240>='G' && LA32_240<='`')||(LA32_240>='g' && LA32_240<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_256 = input.LA(1);

                        s = -1;
                        if ( (LA32_256=='\"') ) {s = 102;}

                        else if ( (LA32_256=='\\') ) {s = 101;}

                        else if ( (LA32_256=='n') ) {s = 100;}

                        else if ( ((LA32_256>='\u0000' && LA32_256<='!')||(LA32_256>='#' && LA32_256<='[')||(LA32_256>=']' && LA32_256<='m')||(LA32_256>='o' && LA32_256<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_257 = input.LA(1);

                        s = -1;
                        if ( ((LA32_257>='\u0000' && LA32_257<='/')||(LA32_257>=':' && LA32_257<='@')||(LA32_257>='G' && LA32_257<='`')||(LA32_257>='g' && LA32_257<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_257>='0' && LA32_257<='9')||(LA32_257>='A' && LA32_257<='F')||(LA32_257>='a' && LA32_257<='f')) ) {s = 267;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_267 = input.LA(1);

                        s = -1;
                        if ( ((LA32_267>='\u0000' && LA32_267<='/')||(LA32_267>=':' && LA32_267<='@')||(LA32_267>='G' && LA32_267<='`')||(LA32_267>='g' && LA32_267<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_267>='0' && LA32_267<='9')||(LA32_267>='A' && LA32_267<='F')||(LA32_267>='a' && LA32_267<='f')) ) {s = 275;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_275 = input.LA(1);

                        s = -1;
                        if ( ((LA32_275>='\u0000' && LA32_275<='/')||(LA32_275>=':' && LA32_275<='@')||(LA32_275>='G' && LA32_275<='`')||(LA32_275>='g' && LA32_275<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_275>='0' && LA32_275<='9')||(LA32_275>='A' && LA32_275<='F')||(LA32_275>='a' && LA32_275<='f')) ) {s = 281;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_281 = input.LA(1);

                        s = -1;
                        if ( ((LA32_281>='\u0000' && LA32_281<='/')||(LA32_281>=':' && LA32_281<='@')||(LA32_281>='G' && LA32_281<='`')||(LA32_281>='g' && LA32_281<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_281>='0' && LA32_281<='9')||(LA32_281>='A' && LA32_281<='F')||(LA32_281>='a' && LA32_281<='f')) ) {s = 284;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_218 = input.LA(1);

                        s = -1;
                        if ( (LA32_218=='\"') ) {s = 102;}

                        else if ( (LA32_218=='\\') ) {s = 101;}

                        else if ( (LA32_218=='n') ) {s = 100;}

                        else if ( ((LA32_218>='\u0000' && LA32_218<='!')||(LA32_218>='#' && LA32_218<='[')||(LA32_218>=']' && LA32_218<='m')||(LA32_218>='o' && LA32_218<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_284 = input.LA(1);

                        s = -1;
                        if ( (LA32_284=='\"') ) {s = 102;}

                        else if ( (LA32_284=='n') ) {s = 100;}

                        else if ( (LA32_284=='\\') ) {s = 101;}

                        else if ( ((LA32_284>='\u0000' && LA32_284<='!')||(LA32_284>='#' && LA32_284<='[')||(LA32_284>=']' && LA32_284<='m')||(LA32_284>='o' && LA32_284<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_146 = input.LA(1);

                        s = -1;
                        if ( (LA32_146=='\"') ) {s = 102;}

                        else if ( (LA32_146=='\\') ) {s = 101;}

                        else if ( (LA32_146=='n') ) {s = 100;}

                        else if ( ((LA32_146>='\u0000' && LA32_146<='!')||(LA32_146>='#' && LA32_146<='[')||(LA32_146>=']' && LA32_146<='m')||(LA32_146>='o' && LA32_146<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_212 = input.LA(1);

                        s = -1;
                        if ( (LA32_212=='\'') ) {s = 178;}

                        else if ( ((LA32_212>='\u0000' && LA32_212<='&')||(LA32_212>='(' && LA32_212<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_251 = input.LA(1);

                        s = -1;
                        if ( (LA32_251=='\'') ) {s = 178;}

                        else if ( ((LA32_251>='\u0000' && LA32_251<='&')||(LA32_251>='(' && LA32_251<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_211 = input.LA(1);

                        s = -1;
                        if ( (LA32_211=='\'') ) {s = 178;}

                        else if ( ((LA32_211>='\u0000' && LA32_211<='&')||(LA32_211>='(' && LA32_211<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_283 = input.LA(1);

                        s = -1;
                        if ( (LA32_283=='\'') ) {s = 178;}

                        else if ( ((LA32_283>='\u0000' && LA32_283<='&')||(LA32_283>='(' && LA32_283<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_138 = input.LA(1);

                        s = -1;
                        if ( ((LA32_138>='\u0000' && LA32_138<='/')||(LA32_138>='8' && LA32_138<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_138>='0' && LA32_138<='7')) ) {s = 180;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_180 = input.LA(1);

                        s = -1;
                        if ( ((LA32_180>='\u0000' && LA32_180<='/')||(LA32_180>='8' && LA32_180<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_180>='0' && LA32_180<='7')) ) {s = 212;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_136 = input.LA(1);

                        s = -1;
                        if ( (LA32_136=='\'') ) {s = 178;}

                        else if ( ((LA32_136>='\u0000' && LA32_136<='&')||(LA32_136>='(' && LA32_136<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA32_179 = input.LA(1);

                        s = -1;
                        if ( ((LA32_179>='\u0000' && LA32_179<='/')||(LA32_179>=':' && LA32_179<='@')||(LA32_179>='G' && LA32_179<='`')||(LA32_179>='g' && LA32_179<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_179>='0' && LA32_179<='9')||(LA32_179>='A' && LA32_179<='F')||(LA32_179>='a' && LA32_179<='f')) ) {s = 211;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA32_36 = input.LA(1);

                        s = -1;
                        if ( (LA32_36=='\\') ) {s = 94;}

                        else if ( (LA32_36=='n') ) {s = 95;}

                        else if ( (LA32_36=='\'') ) {s = 96;}

                        else if ( (LA32_36=='\n') ) {s = 97;}

                        else if ( (LA32_36=='\r') ) {s = 98;}

                        else if ( ((LA32_36>='\u0000' && LA32_36<='\t')||(LA32_36>='\u000B' && LA32_36<='\f')||(LA32_36>='\u000E' && LA32_36<='&')||(LA32_36>='(' && LA32_36<='[')||(LA32_36>=']' && LA32_36<='m')||(LA32_36>='o' && LA32_36<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA32_137 = input.LA(1);

                        s = -1;
                        if ( ((LA32_137>='\u0000' && LA32_137<='/')||(LA32_137>=':' && LA32_137<='@')||(LA32_137>='G' && LA32_137<='`')||(LA32_137>='g' && LA32_137<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_137>='0' && LA32_137<='9')||(LA32_137>='A' && LA32_137<='F')||(LA32_137>='a' && LA32_137<='f')) ) {s = 179;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA32_176 = input.LA(1);

                        s = -1;
                        if ( ((LA32_176>='0' && LA32_176<='9')||(LA32_176>='A' && LA32_176<='F')||(LA32_176>='a' && LA32_176<='f')) ) {s = 208;}

                        else if ( ((LA32_176>='\u0000' && LA32_176<='/')||(LA32_176>=':' && LA32_176<='@')||(LA32_176>='G' && LA32_176<='`')||(LA32_176>='g' && LA32_176<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA32_98 = input.LA(1);

                        s = -1;
                        if ( (LA32_98=='\'') ) {s = 96;}

                        else if ( ((LA32_98>='\u0000' && LA32_98<='\t')||(LA32_98>='\u000B' && LA32_98<='\f')||(LA32_98>='\u000E' && LA32_98<='&')||(LA32_98>='(' && LA32_98<='m')||(LA32_98>='o' && LA32_98<='\uFFFF')) ) {s = 99;}

                        else if ( (LA32_98=='n') ) {s = 142;}

                        else if ( (LA32_98=='\n') ) {s = 97;}

                        else if ( (LA32_98=='\r') ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA32_208 = input.LA(1);

                        s = -1;
                        if ( ((LA32_208>='0' && LA32_208<='9')||(LA32_208>='A' && LA32_208<='F')||(LA32_208>='a' && LA32_208<='f')) ) {s = 234;}

                        else if ( ((LA32_208>='\u0000' && LA32_208<='/')||(LA32_208>=':' && LA32_208<='@')||(LA32_208>='G' && LA32_208<='`')||(LA32_208>='g' && LA32_208<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA32_234 = input.LA(1);

                        s = -1;
                        if ( ((LA32_234>='0' && LA32_234<='9')||(LA32_234>='A' && LA32_234<='F')||(LA32_234>='a' && LA32_234<='f')) ) {s = 251;}

                        else if ( ((LA32_234>='\u0000' && LA32_234<='/')||(LA32_234>=':' && LA32_234<='@')||(LA32_234>='G' && LA32_234<='`')||(LA32_234>='g' && LA32_234<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA32_134 = input.LA(1);

                        s = -1;
                        if ( ((LA32_134>='\u0000' && LA32_134<='/')||(LA32_134>=':' && LA32_134<='@')||(LA32_134>='G' && LA32_134<='`')||(LA32_134>='g' && LA32_134<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_134>='0' && LA32_134<='9')||(LA32_134>='A' && LA32_134<='F')||(LA32_134>='a' && LA32_134<='f')) ) {s = 176;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA32_177 = input.LA(1);

                        s = -1;
                        if ( ((LA32_177>='0' && LA32_177<='9')||(LA32_177>='A' && LA32_177<='F')||(LA32_177>='a' && LA32_177<='f')) ) {s = 209;}

                        else if ( ((LA32_177>='\u0000' && LA32_177<='/')||(LA32_177>=':' && LA32_177<='@')||(LA32_177>='G' && LA32_177<='`')||(LA32_177>='g' && LA32_177<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA32_209 = input.LA(1);

                        s = -1;
                        if ( ((LA32_209>='0' && LA32_209<='9')||(LA32_209>='A' && LA32_209<='F')||(LA32_209>='a' && LA32_209<='f')) ) {s = 235;}

                        else if ( ((LA32_209>='\u0000' && LA32_209<='/')||(LA32_209>=':' && LA32_209<='@')||(LA32_209>='G' && LA32_209<='`')||(LA32_209>='g' && LA32_209<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA32_235 = input.LA(1);

                        s = -1;
                        if ( ((LA32_235>='0' && LA32_235<='9')||(LA32_235>='A' && LA32_235<='F')||(LA32_235>='a' && LA32_235<='f')) ) {s = 252;}

                        else if ( ((LA32_235>='\u0000' && LA32_235<='/')||(LA32_235>=':' && LA32_235<='@')||(LA32_235>='G' && LA32_235<='`')||(LA32_235>='g' && LA32_235<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA32_135 = input.LA(1);

                        s = -1;
                        if ( ((LA32_135>='\u0000' && LA32_135<='/')||(LA32_135>=':' && LA32_135<='@')||(LA32_135>='G' && LA32_135<='`')||(LA32_135>='g' && LA32_135<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_135>='0' && LA32_135<='9')||(LA32_135>='A' && LA32_135<='F')||(LA32_135>='a' && LA32_135<='f')) ) {s = 177;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA32_252 = input.LA(1);

                        s = -1;
                        if ( ((LA32_252>='0' && LA32_252<='9')||(LA32_252>='A' && LA32_252<='F')||(LA32_252>='a' && LA32_252<='f')) ) {s = 263;}

                        else if ( ((LA32_252>='\u0000' && LA32_252<='/')||(LA32_252>=':' && LA32_252<='@')||(LA32_252>='G' && LA32_252<='`')||(LA32_252>='g' && LA32_252<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA32_263 = input.LA(1);

                        s = -1;
                        if ( ((LA32_263>='\u0000' && LA32_263<='/')||(LA32_263>=':' && LA32_263<='@')||(LA32_263>='G' && LA32_263<='`')||(LA32_263>='g' && LA32_263<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_263>='0' && LA32_263<='9')||(LA32_263>='A' && LA32_263<='F')||(LA32_263>='a' && LA32_263<='f')) ) {s = 271;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA32_271 = input.LA(1);

                        s = -1;
                        if ( ((LA32_271>='\u0000' && LA32_271<='/')||(LA32_271>=':' && LA32_271<='@')||(LA32_271>='G' && LA32_271<='`')||(LA32_271>='g' && LA32_271<='\uFFFF')) ) {s = 99;}

                        else if ( ((LA32_271>='0' && LA32_271<='9')||(LA32_271>='A' && LA32_271<='F')||(LA32_271>='a' && LA32_271<='f')) ) {s = 278;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA32_278 = input.LA(1);

                        s = -1;
                        if ( ((LA32_278>='0' && LA32_278<='9')||(LA32_278>='A' && LA32_278<='F')||(LA32_278>='a' && LA32_278<='f')) ) {s = 283;}

                        else if ( ((LA32_278>='\u0000' && LA32_278<='/')||(LA32_278>=':' && LA32_278<='@')||(LA32_278>='G' && LA32_278<='`')||(LA32_278>='g' && LA32_278<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA32_274 = input.LA(1);

                        s = -1;
                        if ( (LA32_274=='\"') ) {s = 102;}

                        else if ( (LA32_274=='n') ) {s = 100;}

                        else if ( (LA32_274=='\\') ) {s = 101;}

                        else if ( ((LA32_274>='\u0000' && LA32_274<='!')||(LA32_274>='#' && LA32_274<='[')||(LA32_274>=']' && LA32_274<='m')||(LA32_274>='o' && LA32_274<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA32_101 = input.LA(1);

                        s = -1;
                        if ( (LA32_101=='u') ) {s = 144;}

                        else if ( (LA32_101=='U') ) {s = 145;}

                        else if ( (LA32_101=='\"'||LA32_101=='\''||LA32_101=='\\'||(LA32_101>='a' && LA32_101<='b')||LA32_101=='f'||LA32_101=='n'||LA32_101=='r'||LA32_101=='t'||LA32_101=='v') ) {s = 146;}

                        else if ( (LA32_101=='x') ) {s = 147;}

                        else if ( ((LA32_101>='0' && LA32_101<='7')) ) {s = 148;}

                        else if ( ((LA32_101>='\u0000' && LA32_101<='!')||(LA32_101>='#' && LA32_101<='&')||(LA32_101>='(' && LA32_101<='/')||(LA32_101>='8' && LA32_101<='T')||(LA32_101>='V' && LA32_101<='[')||(LA32_101>=']' && LA32_101<='`')||(LA32_101>='c' && LA32_101<='e')||(LA32_101>='g' && LA32_101<='m')||(LA32_101>='o' && LA32_101<='q')||LA32_101=='s'||LA32_101=='w'||(LA32_101>='y' && LA32_101<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA32_94 = input.LA(1);

                        s = -1;
                        if ( (LA32_94=='u') ) {s = 134;}

                        else if ( (LA32_94=='U') ) {s = 135;}

                        else if ( (LA32_94=='\"'||LA32_94=='\''||LA32_94=='\\'||(LA32_94>='a' && LA32_94<='b')||LA32_94=='f'||LA32_94=='n'||LA32_94=='r'||LA32_94=='t'||LA32_94=='v') ) {s = 136;}

                        else if ( (LA32_94=='x') ) {s = 137;}

                        else if ( ((LA32_94>='0' && LA32_94<='7')) ) {s = 138;}

                        else if ( ((LA32_94>='\u0000' && LA32_94<='!')||(LA32_94>='#' && LA32_94<='&')||(LA32_94>='(' && LA32_94<='/')||(LA32_94>='8' && LA32_94<='T')||(LA32_94>='V' && LA32_94<='[')||(LA32_94>=']' && LA32_94<='`')||(LA32_94>='c' && LA32_94<='e')||(LA32_94>='g' && LA32_94<='m')||(LA32_94>='o' && LA32_94<='q')||LA32_94=='s'||LA32_94=='w'||(LA32_94>='y' && LA32_94<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA32_280 = input.LA(1);

                        s = -1;
                        if ( (LA32_280=='\'') ) {s = 96;}

                        else if ( (LA32_280=='n') ) {s = 142;}

                        else if ( (LA32_280=='\n') ) {s = 97;}

                        else if ( (LA32_280=='\r') ) {s = 98;}

                        else if ( ((LA32_280>='\u0000' && LA32_280<='\t')||(LA32_280>='\u000B' && LA32_280<='\f')||(LA32_280>='\u000E' && LA32_280<='&')||(LA32_280>='(' && LA32_280<='m')||(LA32_280>='o' && LA32_280<='\uFFFF')) ) {s = 99;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA32_37 = input.LA(1);

                        s = -1;
                        if ( (LA32_37=='n') ) {s = 100;}

                        else if ( (LA32_37=='\\') ) {s = 101;}

                        else if ( (LA32_37=='\"') ) {s = 102;}

                        else if ( ((LA32_37>='\u0000' && LA32_37<='!')||(LA32_37>='#' && LA32_37<='[')||(LA32_37>=']' && LA32_37<='m')||(LA32_37>='o' && LA32_37<='\uFFFF')) ) {s = 99;}

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