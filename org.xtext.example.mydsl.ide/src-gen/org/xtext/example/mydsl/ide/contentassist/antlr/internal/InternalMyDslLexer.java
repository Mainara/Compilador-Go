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
    public static final int RULE_STRUCT=5;
    public static final int RULE_DECIMAL_DIGIT=32;
    public static final int RULE_GO=22;
    public static final int T__59=59;
    public static final int RULE_CHAN=9;
    public static final int RULE_FALLTHROUGH=27;
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
    public static final int RULE_A_D_D__O_P__LINHA=47;
    public static final int RULE_ID=48;
    public static final int RULE_INTERPRETED_STRING_LIT=46;
    public static final int RULE_UNICODE_VALUE=38;
    public static final int RULE_INTERFACE=7;
    public static final int RULE_LITTLE_U_VALUE=40;
    public static final int RULE_HEX_BYTE_VALUE=44;
    public static final int RULE_OCTAL_BYTE_VALUE=43;
    public static final int RULE_MUL_OP=17;
    public static final int RULE_INT=37;
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
    public static final int RULE_DECIMALS=35;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_MAP=8;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=29;
    public static final int RULE_BIG_U_VALUE=41;
    public static final int RULE_ESCAPED_CHAR=42;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=49;
    public static final int RULE_BYTE_VALUE=39;
    public static final int RULE_SL_COMMENT=51;
    public static final int RULE_BREAK=24;
    public static final int T__77=77;
    public static final int RULE_UNICODE_CHAR=31;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_IF=18;
    public static final int T__73=73;
    public static final int RULE_FOR=20;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=16;
    public static final int RULE_OCTAL_DIGIT=33;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int RULE_GOTO=26;
    public static final int RULE_WS=52;
    public static final int RULE_CONTINUE=25;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_DEFER=28;
    public static final int RULE_FLOAT_LIT=12;
    public static final int RULE_LETTER=30;
    public static final int RULE_EXPONENT=36;
    public static final int RULE_INT_LIT=11;
    public static final int RULE_RAW_STRING_LIT=45;
    public static final int RULE_REL_OP=15;
    public static final int RULE_HEX_DIGIT=34;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '(' )
            // InternalMyDsl.g:15:9: '('
            {
            match('('); 

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
            // InternalMyDsl.g:16:7: ( ')' )
            // InternalMyDsl.g:16:9: ')'
            {
            match(')'); 

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
            // InternalMyDsl.g:17:7: ( '[' )
            // InternalMyDsl.g:17:9: '['
            {
            match('['); 

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
            // InternalMyDsl.g:18:7: ( ']' )
            // InternalMyDsl.g:18:9: ']'
            {
            match(']'); 

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
            // InternalMyDsl.g:19:7: ( '{' )
            // InternalMyDsl.g:19:9: '{'
            {
            match('{'); 

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
            // InternalMyDsl.g:20:7: ( '}' )
            // InternalMyDsl.g:20:9: '}'
            {
            match('}'); 

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
            // InternalMyDsl.g:21:7: ( '*' )
            // InternalMyDsl.g:21:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:22:7: ( ',' )
            // InternalMyDsl.g:22:9: ','
            {
            match(','); 

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
            // InternalMyDsl.g:23:7: ( '...' )
            // InternalMyDsl.g:23:9: '...'
            {
            match("..."); 


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
            // InternalMyDsl.g:24:7: ( ';' )
            // InternalMyDsl.g:24:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:25:7: ( '=' )
            // InternalMyDsl.g:25:9: '='
            {
            match('='); 

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
            // InternalMyDsl.g:26:7: ( ':=' )
            // InternalMyDsl.g:26:9: ':='
            {
            match(":="); 


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
            // InternalMyDsl.g:27:7: ( 'func' )
            // InternalMyDsl.g:27:9: 'func'
            {
            match("func"); 


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
            // InternalMyDsl.g:29:7: ( 'const' )
            // InternalMyDsl.g:29:9: 'const'
            {
            match("const"); 


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
            // InternalMyDsl.g:30:7: ( 'type' )
            // InternalMyDsl.g:30:9: 'type'
            {
            match("type"); 


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
            // InternalMyDsl.g:31:7: ( 'var' )
            // InternalMyDsl.g:31:9: 'var'
            {
            match("var"); 


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
            // InternalMyDsl.g:32:7: ( 'switch' )
            // InternalMyDsl.g:32:9: 'switch'
            {
            match("switch"); 


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
            // InternalMyDsl.g:33:7: ( 'case' )
            // InternalMyDsl.g:33:9: 'case'
            {
            match("case"); 


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
            // InternalMyDsl.g:34:7: ( 'default' )
            // InternalMyDsl.g:34:9: 'default'
            {
            match("default"); 


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
            // InternalMyDsl.g:35:7: ( 'return' )
            // InternalMyDsl.g:35:9: 'return'
            {
            match("return"); 


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
            // InternalMyDsl.g:36:7: ( 'package' )
            // InternalMyDsl.g:36:9: 'package'
            {
            match("package"); 


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
            // InternalMyDsl.g:37:7: ( 'import' )
            // InternalMyDsl.g:37:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            // InternalMyDsl.g:19044:23: ( ( '\\n' | '\\r' | '\\n\\r' ) )
            // InternalMyDsl.g:19044:25: ( '\\n' | '\\r' | '\\n\\r' )
            {
            // InternalMyDsl.g:19044:25: ( '\\n' | '\\r' | '\\n\\r' )
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
                    // InternalMyDsl.g:19044:26: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19044:31: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19044:36: '\\n\\r'
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
            // InternalMyDsl.g:19046:28: ( RULE_LETTER )
            // InternalMyDsl.g:19046:30: RULE_LETTER
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
            // InternalMyDsl.g:19048:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:19048:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // InternalMyDsl.g:19050:29: ( '0' .. '9' )
            // InternalMyDsl.g:19050:31: '0' .. '9'
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
            // InternalMyDsl.g:19052:27: ( '0' .. '7' )
            // InternalMyDsl.g:19052:29: '0' .. '7'
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
            // InternalMyDsl.g:19054:25: ( ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) )
            // InternalMyDsl.g:19054:27: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // InternalMyDsl.g:19056:12: ( 'break' )
            // InternalMyDsl.g:19056:14: 'break'
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
            // InternalMyDsl.g:19058:16: ( 'interface' )
            // InternalMyDsl.g:19058:18: 'interface'
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
            // InternalMyDsl.g:19060:13: ( 'select' )
            // InternalMyDsl.g:19060:15: 'select'
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
            // InternalMyDsl.g:19062:12: ( 'defer' )
            // InternalMyDsl.g:19062:14: 'defer'
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
            // InternalMyDsl.g:19064:9: ( 'go' )
            // InternalMyDsl.g:19064:11: 'go'
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
            // InternalMyDsl.g:19066:10: ( 'map' )
            // InternalMyDsl.g:19066:12: 'map'
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
            // InternalMyDsl.g:19068:13: ( 'struct' )
            // InternalMyDsl.g:19068:15: 'struct'
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
            // InternalMyDsl.g:19070:11: ( 'chan' )
            // InternalMyDsl.g:19070:13: 'chan'
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
            // InternalMyDsl.g:19072:11: ( 'else' )
            // InternalMyDsl.g:19072:13: 'else'
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
            // InternalMyDsl.g:19074:11: ( 'goto' )
            // InternalMyDsl.g:19074:13: 'goto'
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
            // InternalMyDsl.g:19076:18: ( 'fallthrough' )
            // InternalMyDsl.g:19076:20: 'fallthrough'
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
            // InternalMyDsl.g:19078:9: ( 'if' )
            // InternalMyDsl.g:19078:11: 'if'
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
            // InternalMyDsl.g:19080:12: ( 'range' )
            // InternalMyDsl.g:19080:14: 'range'
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
            // InternalMyDsl.g:19082:15: ( 'continue' )
            // InternalMyDsl.g:19082:17: 'continue'
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
            // InternalMyDsl.g:19084:10: ( 'for' )
            // InternalMyDsl.g:19084:12: 'for'
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

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19086:17: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalMyDsl.g:19086:19: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:19086:31: ( RULE_LETTER | '0' .. '9' )*
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
            // InternalMyDsl.g:19088:14: ( ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ ) )
            // InternalMyDsl.g:19088:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
            {
            // InternalMyDsl.g:19088:16: ( '1' .. '9' ( RULE_DECIMAL_DIGIT )* | '0' ( RULE_OCTAL_DIGIT )* | '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+ )
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
                    // InternalMyDsl.g:19088:17: '1' .. '9' ( RULE_DECIMAL_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:19088:26: ( RULE_DECIMAL_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:19088:26: RULE_DECIMAL_DIGIT
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
                    // InternalMyDsl.g:19088:46: '0' ( RULE_OCTAL_DIGIT )*
                    {
                    match('0'); 
                    // InternalMyDsl.g:19088:50: ( RULE_OCTAL_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='7')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:19088:50: RULE_OCTAL_DIGIT
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
                    // InternalMyDsl.g:19088:68: '0' ( 'x' | 'X' ) ( RULE_HEX_DIGIT )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:19088:82: ( RULE_HEX_DIGIT )+
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
                    	    // InternalMyDsl.g:19088:82: RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19090:16: ( ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? ) )
            // InternalMyDsl.g:19090:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            {
            // InternalMyDsl.g:19090:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:19090:19: RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )?
                    {
                    mRULE_DECIMALS(); 
                    match('.'); 
                    // InternalMyDsl.g:19090:37: ( RULE_DECIMALS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:19090:37: RULE_DECIMALS
                            {
                            mRULE_DECIMALS(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:19090:52: ( RULE_EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:19090:52: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19090:67: RULE_DECIMALS RULE_EXPONENT
                    {
                    mRULE_DECIMALS(); 
                    mRULE_EXPONENT(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19090:95: '.' RULE_DECIMALS ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    mRULE_DECIMALS(); 
                    // InternalMyDsl.g:19090:113: ( RULE_EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:19090:113: RULE_EXPONENT
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
            // InternalMyDsl.g:19092:24: ( RULE_INT )
            // InternalMyDsl.g:19092:26: RULE_INT
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
            // InternalMyDsl.g:19094:24: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS )
            // InternalMyDsl.g:19094:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_DECIMALS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:19094:36: ( '+' | '-' )?
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
            // InternalMyDsl.g:19096:20: ( ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i' )
            // InternalMyDsl.g:19096:22: ( RULE_DECIMALS | RULE_FLOAT_LIT ) 'i'
            {
            // InternalMyDsl.g:19096:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:19096:23: RULE_DECIMALS
                    {
                    mRULE_DECIMALS(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19096:37: RULE_FLOAT_LIT
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
            // InternalMyDsl.g:19098:15: ( '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\'' )
            // InternalMyDsl.g:19098:17: '\\'' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE ) '\\''
            {
            match('\''); 
            // InternalMyDsl.g:19098:22: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )
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
                    // InternalMyDsl.g:19098:23: RULE_UNICODE_VALUE
                    {
                    mRULE_UNICODE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19098:42: RULE_BYTE_VALUE
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
            // InternalMyDsl.g:19100:29: ( ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR ) )
            // InternalMyDsl.g:19100:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
            {
            // InternalMyDsl.g:19100:31: ( RULE_UNICODE_CHAR | RULE_LITTLE_U_VALUE | RULE_BIG_U_VALUE | RULE_ESCAPED_CHAR )
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
                    // InternalMyDsl.g:19100:32: RULE_UNICODE_CHAR
                    {
                    mRULE_UNICODE_CHAR(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19100:50: RULE_LITTLE_U_VALUE
                    {
                    mRULE_LITTLE_U_VALUE(); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19100:70: RULE_BIG_U_VALUE
                    {
                    mRULE_BIG_U_VALUE(); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:19100:87: RULE_ESCAPED_CHAR
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
            // InternalMyDsl.g:19102:26: ( ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE ) )
            // InternalMyDsl.g:19102:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
            {
            // InternalMyDsl.g:19102:28: ( RULE_OCTAL_BYTE_VALUE | RULE_HEX_BYTE_VALUE )
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
                    // InternalMyDsl.g:19102:29: RULE_OCTAL_BYTE_VALUE
                    {
                    mRULE_OCTAL_BYTE_VALUE(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19102:51: RULE_HEX_BYTE_VALUE
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
            // InternalMyDsl.g:19104:32: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // InternalMyDsl.g:19104:34: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // InternalMyDsl.g:19106:30: ( '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:19106:32: '\\\\' 'x' RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19108:30: ( '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:19108:32: '\\\\' 'u' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19110:27: ( '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT )
            // InternalMyDsl.g:19110:29: '\\\\' 'U' RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT RULE_HEX_DIGIT
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
            // InternalMyDsl.g:19112:28: ( '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' ) )
            // InternalMyDsl.g:19112:30: '\\\\' ( 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' | '\\\\' | '\\'' | '\"' )
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
            // InternalMyDsl.g:19114:17: ( ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT ) )
            // InternalMyDsl.g:19114:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
            {
            // InternalMyDsl.g:19114:19: ( RULE_RAW_STRING_LIT | RULE_INTERPRETED_STRING_LIT )
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
                    // InternalMyDsl.g:19114:20: RULE_RAW_STRING_LIT
                    {
                    mRULE_RAW_STRING_LIT(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19114:40: RULE_INTERPRETED_STRING_LIT
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
            // InternalMyDsl.g:19116:30: ( '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\'' )
            // InternalMyDsl.g:19116:32: '\\'' ( RULE_UNICODE_CHAR | RULE_NEWLINE )* '\\''
            {
            match('\''); 
            // InternalMyDsl.g:19116:37: ( RULE_UNICODE_CHAR | RULE_NEWLINE )*
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
            	    // InternalMyDsl.g:19116:38: RULE_UNICODE_CHAR
            	    {
            	    mRULE_UNICODE_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:19116:56: RULE_NEWLINE
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
            // InternalMyDsl.g:19118:38: ( '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"' )
            // InternalMyDsl.g:19118:40: '\"' ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )* '\"'
            {
            match('\"'); 
            // InternalMyDsl.g:19118:44: ( RULE_UNICODE_VALUE | RULE_BYTE_VALUE )*
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
            	    // InternalMyDsl.g:19118:45: RULE_UNICODE_VALUE
            	    {
            	    mRULE_UNICODE_VALUE(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:19118:64: RULE_BYTE_VALUE
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
            // InternalMyDsl.g:19120:16: ( '#' )
            // InternalMyDsl.g:19120:18: '#'
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
            // InternalMyDsl.g:19122:13: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:19122:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:19122:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
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
                    // InternalMyDsl.g:19122:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19122:21: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19122:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:19122:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:19122:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:19122:39: '>='
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
            // InternalMyDsl.g:19124:13: ( ( '*' | '/' | RULE_A_D_D__O_P__LINHA ) )
            // InternalMyDsl.g:19124:15: ( '*' | '/' | RULE_A_D_D__O_P__LINHA )
            {
            if ( (input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
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

    // $ANTLR start "RULE_A_D_D__O_P__LINHA"
    public final void mRULE_A_D_D__O_P__LINHA() throws RecognitionException {
        try {
            // InternalMyDsl.g:19126:33: ( ( '+' | '-' ) )
            // InternalMyDsl.g:19126:35: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
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
    // $ANTLR end "RULE_A_D_D__O_P__LINHA"

    // $ANTLR start "RULE_MUL_OP"
    public final void mRULE_MUL_OP() throws RecognitionException {
        try {
            int _type = RULE_MUL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19128:13: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:19128:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:19128:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
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
                    // InternalMyDsl.g:19128:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:19128:20: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:19128:24: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:19128:28: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:19128:33: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:19128:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:19128:42: '&^'
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
            // InternalMyDsl.g:19130:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:19130:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:19130:11: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='^') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:19130:11: '^'
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

            // InternalMyDsl.g:19130:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMyDsl.g:19132:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:19132:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:19132:21: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:19132:22: '0' .. '9'
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
            // InternalMyDsl.g:19134:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:19134:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:19134:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMyDsl.g:19134:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:19134:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyDsl.g:19134:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:19134:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMyDsl.g:19134:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:19134:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyDsl.g:19134:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:19134:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMyDsl.g:19136:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:19136:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:19136:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyDsl.g:19136:52: .
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
            // InternalMyDsl.g:19138:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:19138:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:19138:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:19138:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyDsl.g:19138:40: ( ( '\\r' )? '\\n' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\n'||LA30_0=='\r') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:19138:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:19138:41: ( '\\r' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='\r') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyDsl.g:19138:41: '\\r'
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
            // InternalMyDsl.g:19140:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:19140:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:19140:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalMyDsl.g:1:8: ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_BREAK | RULE_INTERFACE | RULE_SELECT | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_IDENTIFIER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt32=57;
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
                // InternalMyDsl.g:1:172: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:183: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:198: RULE_SELECT
                {
                mRULE_SELECT(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:210: RULE_DEFER
                {
                mRULE_DEFER(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:221: RULE_GO
                {
                mRULE_GO(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:229: RULE_MAP
                {
                mRULE_MAP(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:238: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:250: RULE_CHAN
                {
                mRULE_CHAN(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:260: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:270: RULE_GOTO
                {
                mRULE_GOTO(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:280: RULE_FALLTHROUGH
                {
                mRULE_FALLTHROUGH(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:297: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:305: RULE_RANGE
                {
                mRULE_RANGE(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:316: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:330: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:339: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:355: RULE_INT_LIT
                {
                mRULE_INT_LIT(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:368: RULE_FLOAT_LIT
                {
                mRULE_FLOAT_LIT(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:383: RULE_IMAGINARY_LIT
                {
                mRULE_IMAGINARY_LIT(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:402: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:416: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:432: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:447: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:459: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:471: RULE_MUL_OP
                {
                mRULE_MUL_OP(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:483: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:491: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:503: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:519: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:535: RULE_WS
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
            return "19090:18: ( RULE_DECIMALS '.' ( RULE_DECIMALS )? ( RULE_EXPONENT )? | RULE_DECIMALS RULE_EXPONENT | '.' RULE_DECIMALS ( RULE_EXPONENT )? )";
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
            return "19096:22: ( RULE_DECIMALS | RULE_FLOAT_LIT )";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\1\43\2\53\1\57\11\uffff\1\61\1\63\16\67\2\114\4\uffff\1\43\1\53\10\uffff\1\136\5\uffff\3\67\1\uffff\17\67\1\161\1\67\1\164\2\67\1\uffff\1\136\1\114\2\uffff\1\114\16\uffff\2\67\1\u008d\4\67\1\u0093\11\67\1\uffff\2\67\1\uffff\1\u00a0\1\67\1\136\2\uffff\1\136\17\uffff\1\136\1\u00ae\1\67\1\uffff\2\67\1\u00b2\1\u00b3\1\u00b4\1\uffff\13\67\1\u00c0\1\uffff\1\u00c1\1\uffff\1\136\13\uffff\1\67\1\u00cb\1\67\3\uffff\4\67\1\u00d1\1\67\1\u00d3\3\67\1\u00d7\12\uffff\1\67\1\uffff\1\67\1\u00de\1\u00df\1\u00e0\1\67\1\uffff\1\u00e2\1\uffff\1\67\1\u00e4\1\67\5\uffff\2\67\3\uffff\1\u00ec\1\uffff\1\u00ed\1\uffff\1\67\4\uffff\1\67\1\u00f2\2\uffff\1\67\2\uffff\1\67\1\uffff\1\u00f7\2\uffff\1\67\3\uffff\1\u00fd\3\uffff";
    static final String DFA32_eofS =
        "\u00fe\uffff";
    static final String DFA32_minS =
        "\1\11\1\55\1\53\1\55\1\56\11\uffff\2\75\16\60\2\56\2\0\2\uffff\1\76\1\52\10\uffff\1\60\5\uffff\3\60\1\uffff\24\60\1\uffff\1\60\1\56\1\uffff\1\53\2\56\2\0\1\uffff\2\0\1\uffff\2\0\4\uffff\1\53\21\60\1\uffff\2\60\1\uffff\3\60\1\53\2\60\5\0\1\uffff\1\0\1\uffff\6\0\4\60\1\uffff\5\60\1\uffff\14\60\1\uffff\3\60\2\0\1\uffff\2\0\1\uffff\4\0\1\uffff\3\60\3\uffff\13\60\2\uffff\10\0\1\60\1\uffff\5\60\1\uffff\1\60\1\uffff\3\60\1\uffff\4\0\2\60\3\uffff\1\60\1\uffff\1\60\1\uffff\1\60\4\0\2\60\2\uffff\1\60\2\0\1\60\1\uffff\1\60\2\0\1\60\1\uffff\2\0\1\60\2\0\1\uffff";
    static final String DFA32_maxS =
        "\1\175\1\74\1\53\1\55\1\71\11\uffff\2\75\16\172\2\151\2\uffff\2\uffff\1\76\1\57\10\uffff\1\151\5\uffff\3\172\1\uffff\24\172\1\uffff\2\151\1\uffff\1\71\2\151\2\uffff\1\uffff\2\uffff\1\uffff\2\uffff\4\uffff\1\71\21\172\1\uffff\2\172\1\uffff\2\172\1\151\2\71\1\151\5\uffff\1\uffff\1\uffff\1\uffff\6\uffff\1\71\1\151\2\172\1\uffff\5\172\1\uffff\14\172\1\uffff\1\172\1\71\1\151\2\uffff\1\uffff\2\uffff\1\uffff\4\uffff\1\uffff\3\172\3\uffff\13\172\2\uffff\10\uffff\1\172\1\uffff\5\172\1\uffff\1\172\1\uffff\3\172\1\uffff\4\uffff\2\172\3\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff\2\172\2\uffff\1\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\uffff\2\uffff\1\172\2\uffff\1\uffff";
    static final String DFA32_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\24\uffff\1\61\1\62\2\uffff\1\64\1\65\1\71\1\1\1\2\1\63\1\3\1\15\1\uffff\1\4\1\13\1\17\1\20\1\22\3\uffff\1\53\24\uffff\1\54\2\uffff\1\56\5\uffff\1\60\2\uffff\1\66\2\uffff\1\60\1\67\1\70\1\55\22\uffff\1\47\2\uffff\1\40\13\uffff\1\57\1\uffff\1\60\12\uffff\1\52\5\uffff\1\25\14\uffff\1\41\5\uffff\1\57\2\uffff\1\57\4\uffff\1\21\3\uffff\1\27\1\43\1\24\13\uffff\1\45\1\44\11\uffff\1\23\5\uffff\1\37\1\uffff\1\50\3\uffff\1\34\6\uffff\1\26\1\36\1\42\1\uffff\1\31\1\uffff\1\33\7\uffff\1\30\1\32\4\uffff\1\51\4\uffff\1\35\5\uffff\1\46";
    static final String DFA32_specialS =
        "\40\uffff\1\62\1\13\61\uffff\1\1\1\10\1\uffff\1\2\1\33\1\uffff\1\63\1\0\40\uffff\1\60\1\61\1\11\1\56\1\40\1\uffff\1\57\1\uffff\1\3\1\31\1\35\1\42\1\30\1\12\33\uffff\1\44\1\47\1\uffff\1\43\1\41\1\uffff\1\16\1\21\1\15\1\14\24\uffff\1\45\1\50\1\6\1\4\1\17\1\22\1\36\1\32\16\uffff\1\46\1\51\1\20\1\23\12\uffff\1\5\1\52\1\34\1\24\5\uffff\1\53\1\25\3\uffff\1\54\1\26\2\uffff\1\55\1\27\1\uffff\1\7\1\37\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\43\1\41\1\42\1\uffff\2\46\1\40\1\5\1\6\1\13\1\2\1\14\1\3\1\4\1\45\1\37\11\36\1\17\1\15\1\1\1\16\1\44\2\uffff\32\35\1\7\1\uffff\1\10\1\47\1\35\1\uffff\1\35\1\31\1\21\1\25\1\34\1\20\1\32\1\35\1\30\3\35\1\33\2\35\1\27\1\35\1\26\1\24\1\22\1\35\1\23\4\35\1\11\1\uffff\1\12",
            "\1\51\16\uffff\1\46",
            "\1\52",
            "\1\54",
            "\1\55\1\uffff\12\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\62",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\65\15\70\1\66\5\70\1\64\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\72\6\70\1\73\6\70\1\71\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\30\70\1\74\1\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\75\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\77\16\70\1\100\2\70\1\76\3\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\101\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\103\3\70\1\102\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\104\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\107\6\70\1\105\1\106\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\110\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\111\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\112\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\113\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\115\1\uffff\12\116\13\uffff\1\120\37\uffff\1\120\3\uffff\1\117",
            "\1\115\1\uffff\10\121\2\122\13\uffff\1\120\37\uffff\1\120\3\uffff\1\117",
            "\12\130\1\126\2\130\1\127\31\130\1\125\31\130\32\124\1\130\1\123\2\130\1\124\1\130\32\124\uff85\130",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
            "",
            "",
            "\1\46",
            "\1\134\4\uffff\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\13\uffff\1\137\37\uffff\1\137\3\uffff\1\117",
            "",
            "",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\140\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\141\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\142\10\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\143\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\144\7\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\145\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\146\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\147\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\150\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\151\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\152\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\153\24\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\154\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\155\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\156\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\157\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\160\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\162\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\163\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\17\70\1\165\12\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\166\7\70",
            "",
            "\12\167\13\uffff\1\170\37\uffff\1\170\3\uffff\1\117",
            "\1\115\1\uffff\12\116\13\uffff\1\120\37\uffff\1\120\3\uffff\1\117",
            "",
            "\1\171\1\uffff\1\171\2\uffff\12\172",
            "\1\115\1\uffff\10\121\2\122\13\uffff\1\120\37\uffff\1\120\3\uffff\1\117",
            "\1\115\1\uffff\12\122\13\uffff\1\120\37\uffff\1\120\3\uffff\1\117",
            "\42\130\1\175\4\130\1\175\10\130\10\177\35\130\1\174\6\130\1\175\4\130\2\175\3\130\1\175\7\130\1\175\3\130\1\175\1\130\1\175\1\173\1\175\1\130\1\176\uff87\130",
            "\12\130\1\126\2\130\1\127\31\130\1\u0080\31\130\32\u0081\4\130\1\u0081\1\130\32\u0081\uff85\130",
            "",
            "\12\130\1\126\2\130\1\u0083\31\130\1\125\31\130\32\u0081\4\130\1\u0081\1\130\32\u0081\uff85\130",
            "\12\130\1\126\2\130\1\127\31\130\1\125\31\130\32\u0081\4\130\1\u0081\1\130\32\u0081\uff85\130",
            "",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
            "\42\130\1\u0086\4\130\1\u0086\10\130\10\u0088\35\130\1\u0085\6\130\1\u0086\4\130\2\u0086\3\130\1\u0086\7\130\1\u0086\3\130\1\u0086\1\130\1\u0086\1\u0084\1\u0086\1\130\1\u0087\uff87\130",
            "",
            "",
            "",
            "",
            "\1\u0089\1\uffff\1\u0089\2\uffff\12\u008a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u008b\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u008c\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\22\70\1\u008e\1\u008f\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0090\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u0091\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0092\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u0094\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u0095\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u0096\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u0097\3\70\1\u0098\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u0099\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u009a\23\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u009b\17\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u009c\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u009d\25\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u009e\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u009f\13\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00a1\25\70",
            "\12\167\13\uffff\1\170\37\uffff\1\170\3\uffff\1\117",
            "\1\u00a2\1\uffff\1\u00a2\2\uffff\12\u00a3",
            "\12\172",
            "\12\172\57\uffff\1\117",
            "\60\130\12\u00a4\7\130\6\u00a4\32\130\6\u00a4\uff99\130",
            "\60\130\12\u00a5\7\130\6\u00a5\32\130\6\u00a5\uff99\130",
            "\47\130\1\u00a6\uffd8\130",
            "\60\130\12\u00a7\7\130\6\u00a7\32\130\6\u00a7\uff99\130",
            "\60\130\10\u00a8\uffc8\130",
            "",
            "\12\130\1\126\2\130\1\127\31\130\1\125\31\130\32\u0081\4\130\1\u0081\1\130\32\u0081\uff85\130",
            "",
            "\12\130\1\126\2\130\1\127\31\130\1\125\31\130\32\u0081\4\130\1\u0081\1\130\32\u0081\uff85\130",
            "\60\130\12\u00aa\7\130\6\u00aa\32\130\6\u00aa\uff99\130",
            "\60\130\12\u00ab\7\130\6\u00ab\32\130\6\u00ab\uff99\130",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
            "\60\130\12\u00ac\7\130\6\u00ac\32\130\6\u00ac\uff99\130",
            "\60\130\10\u00ad\uffc8\130",
            "\12\u008a",
            "\12\u008a\57\uffff\1\117",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00af\6\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00b0\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\10\70\1\u00b1\21\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00b5\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00b6\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00b7\27\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00b8\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00b9\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00ba\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00bb\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00bc\31\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00bd\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00be\10\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\12\70\1\u00bf\17\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\u00a3",
            "\12\u00a3\57\uffff\1\117",
            "\60\130\12\u00c2\7\130\6\u00c2\32\130\6\u00c2\uff99\130",
            "\60\130\12\u00c3\7\130\6\u00c3\32\130\6\u00c3\uff99\130",
            "",
            "\60\130\12\u00c4\7\130\6\u00c4\32\130\6\u00c4\uff99\130",
            "\60\130\10\u00c5\uffc8\130",
            "",
            "\60\130\12\u00c6\7\130\6\u00c6\32\130\6\u00c6\uff99\130",
            "\60\130\12\u00c7\7\130\6\u00c7\32\130\6\u00c7\uff99\130",
            "\60\130\12\u00c8\7\130\6\u00c8\32\130\6\u00c8\uff99\130",
            "\60\130\10\u00c9\uffc8\130",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00ca\22\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00cc\14\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00cd\22\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00ce\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00cf\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\13\70\1\u00d0\16\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\15\70\1\u00d2\14\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00d4\23\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00d5\6\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\5\70\1\u00d6\24\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\60\130\12\u00d8\7\130\6\u00d8\32\130\6\u00d8\uff99\130",
            "\60\130\12\u00d9\7\130\6\u00d9\32\130\6\u00d9\uff99\130",
            "\47\130\1\u00a6\uffd8\130",
            "\47\130\1\u00a6\uffd8\130",
            "\60\130\12\u00da\7\130\6\u00da\32\130\6\u00da\uff99\130",
            "\60\130\12\u00db\7\130\6\u00db\32\130\6\u00db\uff99\130",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\21\70\1\u00dc\10\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00dd\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\23\70\1\u00e1\6\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00e3\25\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\1\u00e5\31\70",
            "",
            "\60\130\12\u00e6\7\130\6\u00e6\32\130\6\u00e6\uff99\130",
            "\60\130\12\u00e7\7\130\6\u00e7\32\130\6\u00e7\uff99\130",
            "\60\130\12\u00e8\7\130\6\u00e8\32\130\6\u00e8\uff99\130",
            "\60\130\12\u00e9\7\130\6\u00e9\32\130\6\u00e9\uff99\130",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u00ea\13\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00eb\25\70",
            "",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00ee\27\70",
            "\47\130\1\u00a6\uffd8\130",
            "\60\130\12\u00ef\7\130\6\u00ef\32\130\6\u00ef\uff99\130",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
            "\60\130\12\u00f0\7\130\6\u00f0\32\130\6\u00f0\uff99\130",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\24\70\1\u00f1\5\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\4\70\1\u00f3\25\70",
            "\60\130\12\u00f4\7\130\6\u00f4\32\130\6\u00f4\uff99\130",
            "\60\130\12\u00f5\7\130\6\u00f5\32\130\6\u00f5\uff99\130",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\6\70\1\u00f6\23\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\60\130\12\u00f8\7\130\6\u00f8\32\130\6\u00f8\uff99\130",
            "\60\130\12\u00f9\7\130\6\u00f9\32\130\6\u00f9\uff99\130",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\7\70\1\u00fa\22\70",
            "",
            "\60\130\12\u00fb\7\130\6\u00fb\32\130\6\u00fb\uff99\130",
            "\60\130\12\u00fc\7\130\6\u00fc\32\130\6\u00fc\uff99\130",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\47\130\1\u00a6\uffd8\130",
            "\42\130\1\133\36\130\32\131\1\130\1\132\2\130\1\131\1\130\32\131\uff85\130",
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
            return "1:1: Tokens : ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_BREAK | RULE_INTERFACE | RULE_SELECT | RULE_DEFER | RULE_GO | RULE_MAP | RULE_STRUCT | RULE_CHAN | RULE_ELSE | RULE_GOTO | RULE_FALLTHROUGH | RULE_IF | RULE_RANGE | RULE_CONTINUE | RULE_FOR | RULE_IDENTIFIER | RULE_INT_LIT | RULE_FLOAT_LIT | RULE_IMAGINARY_LIT | RULE_RUNE_LIT | RULE_STRING_LIT | RULE_ANY_OTHER | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_90 = input.LA(1);

                        s = -1;
                        if ( (LA32_90=='u') ) {s = 132;}

                        else if ( (LA32_90=='U') ) {s = 133;}

                        else if ( (LA32_90=='\"'||LA32_90=='\''||LA32_90=='\\'||(LA32_90>='a' && LA32_90<='b')||LA32_90=='f'||LA32_90=='n'||LA32_90=='r'||LA32_90=='t'||LA32_90=='v') ) {s = 134;}

                        else if ( (LA32_90=='x') ) {s = 135;}

                        else if ( ((LA32_90>='0' && LA32_90<='7')) ) {s = 136;}

                        else if ( ((LA32_90>='\u0000' && LA32_90<='!')||(LA32_90>='#' && LA32_90<='&')||(LA32_90>='(' && LA32_90<='/')||(LA32_90>='8' && LA32_90<='T')||(LA32_90>='V' && LA32_90<='[')||(LA32_90>=']' && LA32_90<='`')||(LA32_90>='c' && LA32_90<='e')||(LA32_90>='g' && LA32_90<='m')||(LA32_90>='o' && LA32_90<='q')||LA32_90=='s'||LA32_90=='w'||(LA32_90>='y' && LA32_90<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_83 = input.LA(1);

                        s = -1;
                        if ( (LA32_83=='u') ) {s = 123;}

                        else if ( (LA32_83=='U') ) {s = 124;}

                        else if ( (LA32_83=='\"'||LA32_83=='\''||LA32_83=='\\'||(LA32_83>='a' && LA32_83<='b')||LA32_83=='f'||LA32_83=='n'||LA32_83=='r'||LA32_83=='t'||LA32_83=='v') ) {s = 125;}

                        else if ( (LA32_83=='x') ) {s = 126;}

                        else if ( ((LA32_83>='0' && LA32_83<='7')) ) {s = 127;}

                        else if ( ((LA32_83>='\u0000' && LA32_83<='!')||(LA32_83>='#' && LA32_83<='&')||(LA32_83>='(' && LA32_83<='/')||(LA32_83>='8' && LA32_83<='T')||(LA32_83>='V' && LA32_83<='[')||(LA32_83>=']' && LA32_83<='`')||(LA32_83>='c' && LA32_83<='e')||(LA32_83>='g' && LA32_83<='m')||(LA32_83>='o' && LA32_83<='q')||LA32_83=='s'||LA32_83=='w'||(LA32_83>='y' && LA32_83<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_86 = input.LA(1);

                        s = -1;
                        if ( (LA32_86=='\r') ) {s = 131;}

                        else if ( (LA32_86=='\'') ) {s = 85;}

                        else if ( ((LA32_86>='A' && LA32_86<='Z')||LA32_86=='_'||(LA32_86>='a' && LA32_86<='z')) ) {s = 129;}

                        else if ( (LA32_86=='\n') ) {s = 86;}

                        else if ( ((LA32_86>='\u0000' && LA32_86<='\t')||(LA32_86>='\u000B' && LA32_86<='\f')||(LA32_86>='\u000E' && LA32_86<='&')||(LA32_86>='(' && LA32_86<='@')||(LA32_86>='[' && LA32_86<='^')||LA32_86=='`'||(LA32_86>='{' && LA32_86<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_131 = input.LA(1);

                        s = -1;
                        if ( (LA32_131=='\'') ) {s = 85;}

                        else if ( ((LA32_131>='A' && LA32_131<='Z')||LA32_131=='_'||(LA32_131>='a' && LA32_131<='z')) ) {s = 129;}

                        else if ( (LA32_131=='\n') ) {s = 86;}

                        else if ( (LA32_131=='\r') ) {s = 87;}

                        else if ( ((LA32_131>='\u0000' && LA32_131<='\t')||(LA32_131>='\u000B' && LA32_131<='\f')||(LA32_131>='\u000E' && LA32_131<='&')||(LA32_131>='(' && LA32_131<='@')||(LA32_131>='[' && LA32_131<='^')||LA32_131=='`'||(LA32_131>='{' && LA32_131<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_197 = input.LA(1);

                        s = -1;
                        if ( (LA32_197=='\'') ) {s = 166;}

                        else if ( ((LA32_197>='\u0000' && LA32_197<='&')||(LA32_197>='(' && LA32_197<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_230 = input.LA(1);

                        s = -1;
                        if ( (LA32_230=='\'') ) {s = 166;}

                        else if ( ((LA32_230>='\u0000' && LA32_230<='&')||(LA32_230>='(' && LA32_230<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_196 = input.LA(1);

                        s = -1;
                        if ( (LA32_196=='\'') ) {s = 166;}

                        else if ( ((LA32_196>='\u0000' && LA32_196<='&')||(LA32_196>='(' && LA32_196<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_251 = input.LA(1);

                        s = -1;
                        if ( (LA32_251=='\'') ) {s = 166;}

                        else if ( ((LA32_251>='\u0000' && LA32_251<='&')||(LA32_251>='(' && LA32_251<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_84 = input.LA(1);

                        s = -1;
                        if ( (LA32_84=='\'') ) {s = 128;}

                        else if ( ((LA32_84>='\u0000' && LA32_84<='\t')||(LA32_84>='\u000B' && LA32_84<='\f')||(LA32_84>='\u000E' && LA32_84<='&')||(LA32_84>='(' && LA32_84<='@')||(LA32_84>='[' && LA32_84<='^')||LA32_84=='`'||(LA32_84>='{' && LA32_84<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_84>='A' && LA32_84<='Z')||LA32_84=='_'||(LA32_84>='a' && LA32_84<='z')) ) {s = 129;}

                        else if ( (LA32_84=='\n') ) {s = 86;}

                        else if ( (LA32_84=='\r') ) {s = 87;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_125 = input.LA(1);

                        s = -1;
                        if ( (LA32_125=='\'') ) {s = 166;}

                        else if ( ((LA32_125>='\u0000' && LA32_125<='&')||(LA32_125>='(' && LA32_125<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_136 = input.LA(1);

                        s = -1;
                        if ( ((LA32_136>='\u0000' && LA32_136<='/')||(LA32_136>='8' && LA32_136<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_136>='0' && LA32_136<='7')) ) {s = 173;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_33 = input.LA(1);

                        s = -1;
                        if ( ((LA32_33>='A' && LA32_33<='Z')||LA32_33=='_'||(LA32_33>='a' && LA32_33<='z')) ) {s = 89;}

                        else if ( (LA32_33=='\\') ) {s = 90;}

                        else if ( (LA32_33=='\"') ) {s = 91;}

                        else if ( ((LA32_33>='\u0000' && LA32_33<='!')||(LA32_33>='#' && LA32_33<='@')||LA32_33=='['||(LA32_33>=']' && LA32_33<='^')||LA32_33=='`'||(LA32_33>='{' && LA32_33<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_173 = input.LA(1);

                        s = -1;
                        if ( ((LA32_173>='\u0000' && LA32_173<='/')||(LA32_173>='8' && LA32_173<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_173>='0' && LA32_173<='7')) ) {s = 201;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_172 = input.LA(1);

                        s = -1;
                        if ( ((LA32_172>='\u0000' && LA32_172<='/')||(LA32_172>=':' && LA32_172<='@')||(LA32_172>='G' && LA32_172<='`')||(LA32_172>='g' && LA32_172<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_172>='0' && LA32_172<='9')||(LA32_172>='A' && LA32_172<='F')||(LA32_172>='a' && LA32_172<='f')) ) {s = 200;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_170 = input.LA(1);

                        s = -1;
                        if ( ((LA32_170>='0' && LA32_170<='9')||(LA32_170>='A' && LA32_170<='F')||(LA32_170>='a' && LA32_170<='f')) ) {s = 198;}

                        else if ( ((LA32_170>='\u0000' && LA32_170<='/')||(LA32_170>=':' && LA32_170<='@')||(LA32_170>='G' && LA32_170<='`')||(LA32_170>='g' && LA32_170<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_198 = input.LA(1);

                        s = -1;
                        if ( ((LA32_198>='0' && LA32_198<='9')||(LA32_198>='A' && LA32_198<='F')||(LA32_198>='a' && LA32_198<='f')) ) {s = 218;}

                        else if ( ((LA32_198>='\u0000' && LA32_198<='/')||(LA32_198>=':' && LA32_198<='@')||(LA32_198>='G' && LA32_198<='`')||(LA32_198>='g' && LA32_198<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_218 = input.LA(1);

                        s = -1;
                        if ( ((LA32_218>='\u0000' && LA32_218<='/')||(LA32_218>=':' && LA32_218<='@')||(LA32_218>='G' && LA32_218<='`')||(LA32_218>='g' && LA32_218<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_218>='0' && LA32_218<='9')||(LA32_218>='A' && LA32_218<='F')||(LA32_218>='a' && LA32_218<='f')) ) {s = 232;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_171 = input.LA(1);

                        s = -1;
                        if ( ((LA32_171>='0' && LA32_171<='9')||(LA32_171>='A' && LA32_171<='F')||(LA32_171>='a' && LA32_171<='f')) ) {s = 199;}

                        else if ( ((LA32_171>='\u0000' && LA32_171<='/')||(LA32_171>=':' && LA32_171<='@')||(LA32_171>='G' && LA32_171<='`')||(LA32_171>='g' && LA32_171<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_199 = input.LA(1);

                        s = -1;
                        if ( ((LA32_199>='0' && LA32_199<='9')||(LA32_199>='A' && LA32_199<='F')||(LA32_199>='a' && LA32_199<='f')) ) {s = 219;}

                        else if ( ((LA32_199>='\u0000' && LA32_199<='/')||(LA32_199>=':' && LA32_199<='@')||(LA32_199>='G' && LA32_199<='`')||(LA32_199>='g' && LA32_199<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_219 = input.LA(1);

                        s = -1;
                        if ( ((LA32_219>='\u0000' && LA32_219<='/')||(LA32_219>=':' && LA32_219<='@')||(LA32_219>='G' && LA32_219<='`')||(LA32_219>='g' && LA32_219<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_219>='0' && LA32_219<='9')||(LA32_219>='A' && LA32_219<='F')||(LA32_219>='a' && LA32_219<='f')) ) {s = 233;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_233 = input.LA(1);

                        s = -1;
                        if ( ((LA32_233>='\u0000' && LA32_233<='/')||(LA32_233>=':' && LA32_233<='@')||(LA32_233>='G' && LA32_233<='`')||(LA32_233>='g' && LA32_233<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_233>='0' && LA32_233<='9')||(LA32_233>='A' && LA32_233<='F')||(LA32_233>='a' && LA32_233<='f')) ) {s = 240;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_240 = input.LA(1);

                        s = -1;
                        if ( ((LA32_240>='\u0000' && LA32_240<='/')||(LA32_240>=':' && LA32_240<='@')||(LA32_240>='G' && LA32_240<='`')||(LA32_240>='g' && LA32_240<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_240>='0' && LA32_240<='9')||(LA32_240>='A' && LA32_240<='F')||(LA32_240>='a' && LA32_240<='f')) ) {s = 245;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_245 = input.LA(1);

                        s = -1;
                        if ( ((LA32_245>='\u0000' && LA32_245<='/')||(LA32_245>=':' && LA32_245<='@')||(LA32_245>='G' && LA32_245<='`')||(LA32_245>='g' && LA32_245<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_245>='0' && LA32_245<='9')||(LA32_245>='A' && LA32_245<='F')||(LA32_245>='a' && LA32_245<='f')) ) {s = 249;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_249 = input.LA(1);

                        s = -1;
                        if ( ((LA32_249>='0' && LA32_249<='9')||(LA32_249>='A' && LA32_249<='F')||(LA32_249>='a' && LA32_249<='f')) ) {s = 252;}

                        else if ( ((LA32_249>='\u0000' && LA32_249<='/')||(LA32_249>=':' && LA32_249<='@')||(LA32_249>='G' && LA32_249<='`')||(LA32_249>='g' && LA32_249<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_135 = input.LA(1);

                        s = -1;
                        if ( ((LA32_135>='\u0000' && LA32_135<='/')||(LA32_135>=':' && LA32_135<='@')||(LA32_135>='G' && LA32_135<='`')||(LA32_135>='g' && LA32_135<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_135>='0' && LA32_135<='9')||(LA32_135>='A' && LA32_135<='F')||(LA32_135>='a' && LA32_135<='f')) ) {s = 172;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_132 = input.LA(1);

                        s = -1;
                        if ( ((LA32_132>='0' && LA32_132<='9')||(LA32_132>='A' && LA32_132<='F')||(LA32_132>='a' && LA32_132<='f')) ) {s = 170;}

                        else if ( ((LA32_132>='\u0000' && LA32_132<='/')||(LA32_132>=':' && LA32_132<='@')||(LA32_132>='G' && LA32_132<='`')||(LA32_132>='g' && LA32_132<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_201 = input.LA(1);

                        s = -1;
                        if ( (LA32_201=='\"') ) {s = 91;}

                        else if ( ((LA32_201>='A' && LA32_201<='Z')||LA32_201=='_'||(LA32_201>='a' && LA32_201<='z')) ) {s = 89;}

                        else if ( (LA32_201=='\\') ) {s = 90;}

                        else if ( ((LA32_201>='\u0000' && LA32_201<='!')||(LA32_201>='#' && LA32_201<='@')||LA32_201=='['||(LA32_201>=']' && LA32_201<='^')||LA32_201=='`'||(LA32_201>='{' && LA32_201<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_87 = input.LA(1);

                        s = -1;
                        if ( (LA32_87=='\'') ) {s = 85;}

                        else if ( ((LA32_87>='A' && LA32_87<='Z')||LA32_87=='_'||(LA32_87>='a' && LA32_87<='z')) ) {s = 129;}

                        else if ( (LA32_87=='\n') ) {s = 86;}

                        else if ( (LA32_87=='\r') ) {s = 87;}

                        else if ( ((LA32_87>='\u0000' && LA32_87<='\t')||(LA32_87>='\u000B' && LA32_87<='\f')||(LA32_87>='\u000E' && LA32_87<='&')||(LA32_87>='(' && LA32_87<='@')||(LA32_87>='[' && LA32_87<='^')||LA32_87=='`'||(LA32_87>='{' && LA32_87<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_232 = input.LA(1);

                        s = -1;
                        if ( (LA32_232=='\"') ) {s = 91;}

                        else if ( (LA32_232=='\\') ) {s = 90;}

                        else if ( ((LA32_232>='A' && LA32_232<='Z')||LA32_232=='_'||(LA32_232>='a' && LA32_232<='z')) ) {s = 89;}

                        else if ( ((LA32_232>='\u0000' && LA32_232<='!')||(LA32_232>='#' && LA32_232<='@')||LA32_232=='['||(LA32_232>=']' && LA32_232<='^')||LA32_232=='`'||(LA32_232>='{' && LA32_232<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_133 = input.LA(1);

                        s = -1;
                        if ( ((LA32_133>='0' && LA32_133<='9')||(LA32_133>='A' && LA32_133<='F')||(LA32_133>='a' && LA32_133<='f')) ) {s = 171;}

                        else if ( ((LA32_133>='\u0000' && LA32_133<='/')||(LA32_133>=':' && LA32_133<='@')||(LA32_133>='G' && LA32_133<='`')||(LA32_133>='g' && LA32_133<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_200 = input.LA(1);

                        s = -1;
                        if ( (LA32_200=='\"') ) {s = 91;}

                        else if ( (LA32_200=='\\') ) {s = 90;}

                        else if ( ((LA32_200>='A' && LA32_200<='Z')||LA32_200=='_'||(LA32_200>='a' && LA32_200<='z')) ) {s = 89;}

                        else if ( ((LA32_200>='\u0000' && LA32_200<='!')||(LA32_200>='#' && LA32_200<='@')||LA32_200=='['||(LA32_200>=']' && LA32_200<='^')||LA32_200=='`'||(LA32_200>='{' && LA32_200<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_252 = input.LA(1);

                        s = -1;
                        if ( (LA32_252=='\"') ) {s = 91;}

                        else if ( ((LA32_252>='A' && LA32_252<='Z')||LA32_252=='_'||(LA32_252>='a' && LA32_252<='z')) ) {s = 89;}

                        else if ( (LA32_252=='\\') ) {s = 90;}

                        else if ( ((LA32_252>='\u0000' && LA32_252<='!')||(LA32_252>='#' && LA32_252<='@')||LA32_252=='['||(LA32_252>=']' && LA32_252<='^')||LA32_252=='`'||(LA32_252>='{' && LA32_252<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_127 = input.LA(1);

                        s = -1;
                        if ( ((LA32_127>='\u0000' && LA32_127<='/')||(LA32_127>='8' && LA32_127<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_127>='0' && LA32_127<='7')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_168 = input.LA(1);

                        s = -1;
                        if ( ((LA32_168>='\u0000' && LA32_168<='/')||(LA32_168>='8' && LA32_168<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_168>='0' && LA32_168<='7')) ) {s = 197;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_134 = input.LA(1);

                        s = -1;
                        if ( (LA32_134=='\"') ) {s = 91;}

                        else if ( (LA32_134=='\\') ) {s = 90;}

                        else if ( ((LA32_134>='A' && LA32_134<='Z')||LA32_134=='_'||(LA32_134>='a' && LA32_134<='z')) ) {s = 89;}

                        else if ( ((LA32_134>='\u0000' && LA32_134<='!')||(LA32_134>='#' && LA32_134<='@')||LA32_134=='['||(LA32_134>=']' && LA32_134<='^')||LA32_134=='`'||(LA32_134>='{' && LA32_134<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_167 = input.LA(1);

                        s = -1;
                        if ( ((LA32_167>='0' && LA32_167<='9')||(LA32_167>='A' && LA32_167<='F')||(LA32_167>='a' && LA32_167<='f')) ) {s = 196;}

                        else if ( ((LA32_167>='\u0000' && LA32_167<='/')||(LA32_167>=':' && LA32_167<='@')||(LA32_167>='G' && LA32_167<='`')||(LA32_167>='g' && LA32_167<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_164 = input.LA(1);

                        s = -1;
                        if ( ((LA32_164>='0' && LA32_164<='9')||(LA32_164>='A' && LA32_164<='F')||(LA32_164>='a' && LA32_164<='f')) ) {s = 194;}

                        else if ( ((LA32_164>='\u0000' && LA32_164<='/')||(LA32_164>=':' && LA32_164<='@')||(LA32_164>='G' && LA32_164<='`')||(LA32_164>='g' && LA32_164<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_194 = input.LA(1);

                        s = -1;
                        if ( ((LA32_194>='0' && LA32_194<='9')||(LA32_194>='A' && LA32_194<='F')||(LA32_194>='a' && LA32_194<='f')) ) {s = 216;}

                        else if ( ((LA32_194>='\u0000' && LA32_194<='/')||(LA32_194>=':' && LA32_194<='@')||(LA32_194>='G' && LA32_194<='`')||(LA32_194>='g' && LA32_194<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_216 = input.LA(1);

                        s = -1;
                        if ( ((LA32_216>='0' && LA32_216<='9')||(LA32_216>='A' && LA32_216<='F')||(LA32_216>='a' && LA32_216<='f')) ) {s = 230;}

                        else if ( ((LA32_216>='\u0000' && LA32_216<='/')||(LA32_216>=':' && LA32_216<='@')||(LA32_216>='G' && LA32_216<='`')||(LA32_216>='g' && LA32_216<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_165 = input.LA(1);

                        s = -1;
                        if ( ((LA32_165>='0' && LA32_165<='9')||(LA32_165>='A' && LA32_165<='F')||(LA32_165>='a' && LA32_165<='f')) ) {s = 195;}

                        else if ( ((LA32_165>='\u0000' && LA32_165<='/')||(LA32_165>=':' && LA32_165<='@')||(LA32_165>='G' && LA32_165<='`')||(LA32_165>='g' && LA32_165<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_195 = input.LA(1);

                        s = -1;
                        if ( ((LA32_195>='0' && LA32_195<='9')||(LA32_195>='A' && LA32_195<='F')||(LA32_195>='a' && LA32_195<='f')) ) {s = 217;}

                        else if ( ((LA32_195>='\u0000' && LA32_195<='/')||(LA32_195>=':' && LA32_195<='@')||(LA32_195>='G' && LA32_195<='`')||(LA32_195>='g' && LA32_195<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_217 = input.LA(1);

                        s = -1;
                        if ( ((LA32_217>='0' && LA32_217<='9')||(LA32_217>='A' && LA32_217<='F')||(LA32_217>='a' && LA32_217<='f')) ) {s = 231;}

                        else if ( ((LA32_217>='\u0000' && LA32_217<='/')||(LA32_217>=':' && LA32_217<='@')||(LA32_217>='G' && LA32_217<='`')||(LA32_217>='g' && LA32_217<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_231 = input.LA(1);

                        s = -1;
                        if ( ((LA32_231>='0' && LA32_231<='9')||(LA32_231>='A' && LA32_231<='F')||(LA32_231>='a' && LA32_231<='f')) ) {s = 239;}

                        else if ( ((LA32_231>='\u0000' && LA32_231<='/')||(LA32_231>=':' && LA32_231<='@')||(LA32_231>='G' && LA32_231<='`')||(LA32_231>='g' && LA32_231<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_239 = input.LA(1);

                        s = -1;
                        if ( ((LA32_239>='0' && LA32_239<='9')||(LA32_239>='A' && LA32_239<='F')||(LA32_239>='a' && LA32_239<='f')) ) {s = 244;}

                        else if ( ((LA32_239>='\u0000' && LA32_239<='/')||(LA32_239>=':' && LA32_239<='@')||(LA32_239>='G' && LA32_239<='`')||(LA32_239>='g' && LA32_239<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_244 = input.LA(1);

                        s = -1;
                        if ( ((LA32_244>='0' && LA32_244<='9')||(LA32_244>='A' && LA32_244<='F')||(LA32_244>='a' && LA32_244<='f')) ) {s = 248;}

                        else if ( ((LA32_244>='\u0000' && LA32_244<='/')||(LA32_244>=':' && LA32_244<='@')||(LA32_244>='G' && LA32_244<='`')||(LA32_244>='g' && LA32_244<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_248 = input.LA(1);

                        s = -1;
                        if ( ((LA32_248>='\u0000' && LA32_248<='/')||(LA32_248>=':' && LA32_248<='@')||(LA32_248>='G' && LA32_248<='`')||(LA32_248>='g' && LA32_248<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_248>='0' && LA32_248<='9')||(LA32_248>='A' && LA32_248<='F')||(LA32_248>='a' && LA32_248<='f')) ) {s = 251;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_126 = input.LA(1);

                        s = -1;
                        if ( ((LA32_126>='\u0000' && LA32_126<='/')||(LA32_126>=':' && LA32_126<='@')||(LA32_126>='G' && LA32_126<='`')||(LA32_126>='g' && LA32_126<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_126>='0' && LA32_126<='9')||(LA32_126>='A' && LA32_126<='F')||(LA32_126>='a' && LA32_126<='f')) ) {s = 167;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_129 = input.LA(1);

                        s = -1;
                        if ( (LA32_129=='\'') ) {s = 85;}

                        else if ( ((LA32_129>='\u0000' && LA32_129<='\t')||(LA32_129>='\u000B' && LA32_129<='\f')||(LA32_129>='\u000E' && LA32_129<='&')||(LA32_129>='(' && LA32_129<='@')||(LA32_129>='[' && LA32_129<='^')||LA32_129=='`'||(LA32_129>='{' && LA32_129<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_129>='A' && LA32_129<='Z')||LA32_129=='_'||(LA32_129>='a' && LA32_129<='z')) ) {s = 129;}

                        else if ( (LA32_129=='\n') ) {s = 86;}

                        else if ( (LA32_129=='\r') ) {s = 87;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_123 = input.LA(1);

                        s = -1;
                        if ( ((LA32_123>='\u0000' && LA32_123<='/')||(LA32_123>=':' && LA32_123<='@')||(LA32_123>='G' && LA32_123<='`')||(LA32_123>='g' && LA32_123<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_123>='0' && LA32_123<='9')||(LA32_123>='A' && LA32_123<='F')||(LA32_123>='a' && LA32_123<='f')) ) {s = 164;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_124 = input.LA(1);

                        s = -1;
                        if ( ((LA32_124>='\u0000' && LA32_124<='/')||(LA32_124>=':' && LA32_124<='@')||(LA32_124>='G' && LA32_124<='`')||(LA32_124>='g' && LA32_124<='\uFFFF')) ) {s = 88;}

                        else if ( ((LA32_124>='0' && LA32_124<='9')||(LA32_124>='A' && LA32_124<='F')||(LA32_124>='a' && LA32_124<='f')) ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_32 = input.LA(1);

                        s = -1;
                        if ( (LA32_32=='\\') ) {s = 83;}

                        else if ( ((LA32_32>='A' && LA32_32<='Z')||LA32_32=='_'||(LA32_32>='a' && LA32_32<='z')) ) {s = 84;}

                        else if ( (LA32_32=='\'') ) {s = 85;}

                        else if ( (LA32_32=='\n') ) {s = 86;}

                        else if ( (LA32_32=='\r') ) {s = 87;}

                        else if ( ((LA32_32>='\u0000' && LA32_32<='\t')||(LA32_32>='\u000B' && LA32_32<='\f')||(LA32_32>='\u000E' && LA32_32<='&')||(LA32_32>='(' && LA32_32<='@')||LA32_32=='['||(LA32_32>=']' && LA32_32<='^')||LA32_32=='`'||(LA32_32>='{' && LA32_32<='\uFFFF')) ) {s = 88;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_89 = input.LA(1);

                        s = -1;
                        if ( (LA32_89=='\"') ) {s = 91;}

                        else if ( (LA32_89=='\\') ) {s = 90;}

                        else if ( ((LA32_89>='A' && LA32_89<='Z')||LA32_89=='_'||(LA32_89>='a' && LA32_89<='z')) ) {s = 89;}

                        else if ( ((LA32_89>='\u0000' && LA32_89<='!')||(LA32_89>='#' && LA32_89<='@')||LA32_89=='['||(LA32_89>=']' && LA32_89<='^')||LA32_89=='`'||(LA32_89>='{' && LA32_89<='\uFFFF')) ) {s = 88;}

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