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
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_LIT=8;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=18;
    public static final int RULE_NEW_LINE=15;
    public static final int RULE_MUL_OP=12;
    public static final int RULE_INT_LITERAL=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=19;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_STRING=20;
    public static final int RULE_EXPONENT_PART=5;
    public static final int RULE_SL_COMMENT=22;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int RULE_UNICODE_CHAR=16;
    public static final int T__34=34;
    public static final int RULE_DECIMAL_DIGITS=4;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ADD_OP=11;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=23;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_LETTER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=9;
    public static final int T__45=45;
    public static final int RULE_REL_OP=10;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_RUNE_LIT=17;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '.' )
            // InternalMyDsl.g:11:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:12:7: ( 'i' )
            // InternalMyDsl.g:12:9: 'i'
            {
            match('i'); 

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
            // InternalMyDsl.g:13:7: ( '(' )
            // InternalMyDsl.g:13:9: '('
            {
            match('('); 

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
            // InternalMyDsl.g:14:7: ( ')' )
            // InternalMyDsl.g:14:9: ')'
            {
            match(')'); 

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
            // InternalMyDsl.g:15:7: ( '[' )
            // InternalMyDsl.g:15:9: '['
            {
            match('['); 

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
            // InternalMyDsl.g:16:7: ( ']' )
            // InternalMyDsl.g:16:9: ']'
            {
            match(']'); 

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
            // InternalMyDsl.g:17:7: ( 'struct' )
            // InternalMyDsl.g:17:9: 'struct'
            {
            match("struct"); 


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
            // InternalMyDsl.g:18:7: ( '{' )
            // InternalMyDsl.g:18:9: '{'
            {
            match('{'); 

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
            // InternalMyDsl.g:19:7: ( ';' )
            // InternalMyDsl.g:19:9: ';'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
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
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'func' )
            // InternalMyDsl.g:22:9: 'func'
            {
            match("func"); 


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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
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
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'interface' )
            // InternalMyDsl.g:25:9: 'interface'
            {
            match("interface"); 


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
            // InternalMyDsl.g:26:7: ( 'map' )
            // InternalMyDsl.g:26:9: 'map'
            {
            match("map"); 


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
            // InternalMyDsl.g:27:7: ( 'chan' )
            // InternalMyDsl.g:27:9: 'chan'
            {
            match("chan"); 


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
            // InternalMyDsl.g:28:7: ( '<-' )
            // InternalMyDsl.g:28:9: '<-'
            {
            match("<-"); 


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
            // InternalMyDsl.g:29:7: ( '||' )
            // InternalMyDsl.g:29:9: '||'
            {
            match("||"); 


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
            // InternalMyDsl.g:30:7: ( '&&' )
            // InternalMyDsl.g:30:9: '&&'
            {
            match("&&"); 


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
            // InternalMyDsl.g:31:7: ( ':' )
            // InternalMyDsl.g:31:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:32:7: ( 'defer' )
            // InternalMyDsl.g:32:9: 'defer'
            {
            match("defer"); 


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
            // InternalMyDsl.g:33:7: ( 'for' )
            // InternalMyDsl.g:33:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( ':=' )
            // InternalMyDsl.g:34:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( '=' )
            // InternalMyDsl.g:35:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'range' )
            // InternalMyDsl.g:36:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'select' )
            // InternalMyDsl.g:37:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'case' )
            // InternalMyDsl.g:38:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'default' )
            // InternalMyDsl.g:39:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'switch' )
            // InternalMyDsl.g:40:9: 'switch'
            {
            match("switch"); 


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
            // InternalMyDsl.g:41:7: ( 'type' )
            // InternalMyDsl.g:41:9: 'type'
            {
            match("type"); 


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
            // InternalMyDsl.g:42:7: ( 'if' )
            // InternalMyDsl.g:42:9: 'if'
            {
            match("if"); 


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
            // InternalMyDsl.g:43:7: ( 'else' )
            // InternalMyDsl.g:43:9: 'else'
            {
            match("else"); 


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
            // InternalMyDsl.g:44:7: ( 'fallthrough' )
            // InternalMyDsl.g:44:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalMyDsl.g:45:7: ( 'goto' )
            // InternalMyDsl.g:45:9: 'goto'
            {
            match("goto"); 


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
            // InternalMyDsl.g:46:7: ( 'continue' )
            // InternalMyDsl.g:46:9: 'continue'
            {
            match("continue"); 


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
            // InternalMyDsl.g:47:7: ( 'break' )
            // InternalMyDsl.g:47:9: 'break'
            {
            match("break"); 


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
            // InternalMyDsl.g:48:7: ( 'return' )
            // InternalMyDsl.g:48:9: 'return'
            {
            match("return"); 


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
            // InternalMyDsl.g:49:7: ( 'go' )
            // InternalMyDsl.g:49:9: 'go'
            {
            match("go"); 


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
            // InternalMyDsl.g:50:7: ( '++' )
            // InternalMyDsl.g:50:9: '++'
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
            // InternalMyDsl.g:51:7: ( '--' )
            // InternalMyDsl.g:51:9: '--'
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
            // InternalMyDsl.g:52:7: ( 'const' )
            // InternalMyDsl.g:52:9: 'const'
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
            // InternalMyDsl.g:53:7: ( 'var' )
            // InternalMyDsl.g:53:9: 'var'
            {
            match("var"); 


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
            // InternalMyDsl.g:54:7: ( 'package' )
            // InternalMyDsl.g:54:9: 'package'
            {
            match("package"); 


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
            // InternalMyDsl.g:55:7: ( 'import' )
            // InternalMyDsl.g:55:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:6632:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:6632:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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

    // $ANTLR start "RULE_NEW_LINE"
    public final void mRULE_NEW_LINE() throws RecognitionException {
        try {
            // InternalMyDsl.g:6634:24: ( ( '\\n' | '\\r' | '\\n\\r' ) )
            // InternalMyDsl.g:6634:26: ( '\\n' | '\\r' | '\\n\\r' )
            {
            if ( input.LA(1)==' '||input.LA(1)=='\n'||input.LA(1)=='\r' ) {
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
    // $ANTLR end "RULE_NEW_LINE"

    // $ANTLR start "RULE_UNICODE_CHAR"
    public final void mRULE_UNICODE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_UNICODE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6636:19: (~ ( RULE_NEW_LINE ) )
            // InternalMyDsl.g:6636:21: ~ ( RULE_NEW_LINE )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_UNICODE_CHAR"

    // $ANTLR start "RULE_INT_LITERAL"
    public final void mRULE_INT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6638:18: ( ( '1' .. '9' ( '0' .. '9' )* | ( '0' .. '7' )* | '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ) )
            // InternalMyDsl.g:6638:20: ( '1' .. '9' ( '0' .. '9' )* | ( '0' .. '7' )* | '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            {
            // InternalMyDsl.g:6638:20: ( '1' .. '9' ( '0' .. '9' )* | ( '0' .. '7' )* | '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            int alt5=3;
            switch ( input.LA(1) ) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt5=1;
                }
                break;
            case '0':
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='X'||LA5_2=='x') ) {
                    alt5=3;
                }
                else {
                    alt5=2;}
                }
                break;
            default:
                alt5=2;}

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:6638:21: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:6638:30: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:6638:31: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6638:42: ( '0' .. '7' )*
                    {
                    // InternalMyDsl.g:6638:42: ( '0' .. '7' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='7')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:6638:43: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6638:54: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:6638:68: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
    // $ANTLR end "RULE_INT_LITERAL"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6640:21: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalMyDsl.g:6640:23: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalMyDsl.g:6640:32: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:6640:33: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_EXPONENT_PART"
    public final void mRULE_EXPONENT_PART() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6642:20: ( 'e' ( '+' | '-' ) RULE_DECIMAL_DIGITS )
            // InternalMyDsl.g:6642:22: 'e' ( '+' | '-' ) RULE_DECIMAL_DIGITS
            {
            match('e'); 
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_DECIMAL_DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT_PART"

    // $ANTLR start "RULE_STRING_LIT"
    public final void mRULE_STRING_LIT() throws RecognitionException {
        try {
            int _type = RULE_STRING_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6644:17: ( 'oi' )
            // InternalMyDsl.g:6644:19: 'oi'
            {
            match("oi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LIT"

    // $ANTLR start "RULE_RUNE_LIT"
    public final void mRULE_RUNE_LIT() throws RecognitionException {
        try {
            int _type = RULE_RUNE_LIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6646:15: ( 'oiiii' )
            // InternalMyDsl.g:6646:17: 'oiiii'
            {
            match("oiiii"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RUNE_LIT"

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            int _type = RULE_REL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6648:13: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:6648:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:6648:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt7=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt7=1;
                }
                break;
            case '!':
                {
                alt7=2;
                }
                break;
            case '<':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='=') ) {
                    alt7=4;
                }
                else {
                    alt7=3;}
                }
                break;
            case '>':
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4=='=') ) {
                    alt7=6;
                }
                else {
                    alt7=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:6648:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6648:21: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6648:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:6648:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:6648:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:6648:39: '>='
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
            // InternalMyDsl.g:6650:13: ( ( '+' | '-' | '|' | '^' ) )
            // InternalMyDsl.g:6650:15: ( '+' | '-' | '|' | '^' )
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
            // InternalMyDsl.g:6652:13: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:6652:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:6652:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt8=1;
                }
                break;
            case '/':
                {
                alt8=2;
                }
                break;
            case '%':
                {
                alt8=3;
                }
                break;
            case '<':
                {
                alt8=4;
                }
                break;
            case '>':
                {
                alt8=5;
                }
                break;
            case '&':
                {
                int LA8_6 = input.LA(2);

                if ( (LA8_6=='^') ) {
                    alt8=7;
                }
                else {
                    alt8=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:6652:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6652:20: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6652:24: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:6652:28: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:6652:33: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:6652:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:6652:42: '&^'
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
            // InternalMyDsl.g:6654:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalMyDsl.g:6654:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalMyDsl.g:6654:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt9=1;
                }
                break;
            case '-':
                {
                alt9=2;
                }
                break;
            case '!':
                {
                alt9=3;
                }
                break;
            case '^':
                {
                alt9=4;
                }
                break;
            case '*':
                {
                alt9=5;
                }
                break;
            case '&':
                {
                alt9=6;
                }
                break;
            case '<':
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:6654:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6654:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6654:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:6654:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:6654:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:6654:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:6654:42: '<-'
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

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6656:17: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalMyDsl.g:6656:19: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:6656:31: ( RULE_LETTER | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:6658:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:6658:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:6658:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:6658:11: '^'
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

            // InternalMyDsl.g:6658:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
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
            // InternalMyDsl.g:6660:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:6660:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:6660:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:6660:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalMyDsl.g:6662:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:6662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:6662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:6662:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:6662:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:6662:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:6662:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6662:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:6662:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:6662:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:6662:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalMyDsl.g:6664:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:6664:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:6664:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:6664:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // InternalMyDsl.g:6666:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:6666:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:6666:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:6666:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop18;
                }
            } while (true);

            // InternalMyDsl.g:6666:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:6666:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:6666:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:6666:41: '\\r'
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
            // InternalMyDsl.g:6668:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:6668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:6668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
            // InternalMyDsl.g:6670:16: ( . )
            // InternalMyDsl.g:6670:18: .
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
        // InternalMyDsl.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_UNICODE_CHAR | RULE_INT_LITERAL | RULE_DECIMAL_DIGITS | RULE_EXPONENT_PART | RULE_STRING_LIT | RULE_RUNE_LIT | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_UNARY_OP | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=63;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalMyDsl.g:1:10: T__24
                {
                mT__24(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__49
                {
                mT__49(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__50
                {
                mT__50(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__51
                {
                mT__51(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__52
                {
                mT__52(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__53
                {
                mT__53(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__54
                {
                mT__54(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__55
                {
                mT__55(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__56
                {
                mT__56(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__57
                {
                mT__57(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__58
                {
                mT__58(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__59
                {
                mT__59(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__60
                {
                mT__60(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__61
                {
                mT__61(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__62
                {
                mT__62(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__63
                {
                mT__63(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__64
                {
                mT__64(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__65
                {
                mT__65(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__66
                {
                mT__66(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__67
                {
                mT__67(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__68
                {
                mT__68(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: RULE_UNICODE_CHAR
                {
                mRULE_UNICODE_CHAR(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:298: RULE_INT_LITERAL
                {
                mRULE_INT_LITERAL(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:315: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:335: RULE_EXPONENT_PART
                {
                mRULE_EXPONENT_PART(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:354: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:370: RULE_RUNE_LIT
                {
                mRULE_RUNE_LIT(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:384: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:396: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:408: RULE_MUL_OP
                {
                mRULE_MUL_OP(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:420: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:434: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:450: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:458: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:467: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:479: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:495: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:511: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:519: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\43\1\60\1\64\4\uffff\1\75\4\uffff\1\75\1\uffff\5\75\1\120\1\75\1\122\15\75\1\uffff\4\75\1\uffff\4\75\4\uffff\1\151\1\152\1\151\1\uffff\1\151\4\uffff\3\151\5\uffff\3\151\1\uffff\4\151\7\uffff\1\151\1\uffff\4\151\1\uffff\1\175\1\151\2\uffff\2\151\3\43\1\u0081\1\u0083\5\uffff\1\151\2\uffff\5\151\1\u008a\1\151\1\u008c\3\151\1\uffff\6\151\1\uffff\1\151\1\u0099\1\151\1\uffff\1\151\1\uffff\5\151\1\u00a1\1\uffff\1\151\1\uffff\1\u00a3\1\u00a4\6\151\1\u00ab\1\u00ac\1\u00ad\1\151\1\uffff\7\151\1\uffff\1\151\2\uffff\1\151\1\u00b8\1\u00b9\1\151\1\u00bb\1\151\3\uffff\1\u00bd\1\151\1\u00bf\1\151\1\u00c1\1\u00c2\1\u00c3\1\u00c4\2\151\2\uffff\1\151\1\uffff\1\u00c8\1\uffff\1\151\1\uffff\1\151\4\uffff\2\151\1\u00cd\1\uffff\1\u00ce\2\151\1\u00d1\2\uffff\1\u00d2\1\151\2\uffff\1\151\1\u00d5\1\uffff";
    static final String DFA22_eofS =
        "\u00d6\uffff";
    static final String DFA22_minS =
        "\1\0\1\56\1\60\4\uffff\1\60\4\uffff\1\60\1\uffff\2\60\1\55\1\174\1\46\1\75\1\60\1\75\2\60\1\53\2\60\1\53\1\55\6\60\1\uffff\2\75\1\101\1\52\1\uffff\1\60\2\0\1\11\4\uffff\3\60\1\uffff\1\60\4\uffff\3\60\5\uffff\3\60\1\uffff\4\60\7\uffff\1\60\1\uffff\4\60\1\uffff\2\60\2\uffff\7\60\5\uffff\1\60\2\uffff\13\60\1\uffff\6\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\1\uffff\1\60\1\uffff\14\60\1\uffff\7\60\1\uffff\1\60\2\uffff\6\60\3\uffff\12\60\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\4\uffff\3\60\1\uffff\4\60\2\uffff\2\60\2\uffff\2\60\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\56\1\172\4\uffff\1\172\4\uffff\1\172\1\uffff\2\172\1\75\1\174\1\136\1\75\1\172\1\75\5\172\1\53\1\55\2\172\1\71\1\170\1\71\1\172\1\uffff\1\75\1\76\1\172\1\57\1\uffff\1\172\2\uffff\1\40\4\uffff\3\172\1\uffff\1\172\4\uffff\3\172\5\uffff\3\172\1\uffff\4\172\7\uffff\1\172\1\uffff\4\172\1\uffff\2\172\2\uffff\2\172\4\71\1\172\5\uffff\1\172\2\uffff\13\172\1\uffff\6\172\1\uffff\3\172\1\uffff\1\172\1\uffff\6\172\1\uffff\1\172\1\uffff\14\172\1\uffff\7\172\1\uffff\1\172\2\uffff\6\172\3\uffff\12\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\4\uffff\3\172\1\uffff\4\172\2\uffff\2\172\2\uffff\2\172\1\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\15\25\uffff\1\57\4\uffff\1\56\4\uffff\1\56\1\76\1\16\1\1\3\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\3\uffff\1\56\1\10\1\11\1\12\1\13\3\uffff\1\15\4\uffff\1\22\1\64\1\66\1\23\1\24\1\30\1\25\1\uffff\1\31\4\uffff\1\61\2\uffff\1\50\1\51\7\uffff\1\71\1\74\1\75\1\73\1\76\1\uffff\1\70\1\40\13\uffff\1\22\6\uffff\1\47\3\uffff\1\60\1\uffff\1\62\6\uffff\1\27\1\uffff\1\20\14\uffff\1\53\7\uffff\1\14\1\uffff\1\21\1\34\6\uffff\1\37\1\41\1\43\12\uffff\1\52\1\26\1\uffff\1\32\1\uffff\1\45\1\uffff\1\63\1\uffff\1\55\1\7\1\33\1\36\3\uffff\1\46\4\uffff\1\35\1\54\2\uffff\1\44\1\17\2\uffff\1\42";
    static final String DFA22_specialS =
        "\1\1\51\uffff\1\2\1\0\u00aa\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\55\1\54\1\56\2\55\1\56\22\55\1\54\1\44\1\52\2\55\1\50\1\22\1\53\1\3\1\4\1\13\1\33\1\15\1\34\1\1\1\47\1\40\7\37\2\41\1\23\1\11\1\20\1\25\1\45\2\55\32\51\1\5\1\55\1\6\1\46\1\51\1\55\1\51\1\32\1\17\1\24\1\30\1\14\1\31\1\51\1\2\3\51\1\16\1\51\1\42\1\36\1\51\1\26\1\7\1\27\1\51\1\35\4\51\1\10\1\21\1\12\uff82\55",
            "\1\57",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\62\6\65\1\63\1\61\14\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\73\16\65\1\72\2\65\1\74\3\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\104\15\65\1\103\5\65\1\102\5\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\106\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\110\6\65\1\107\6\65\1\111\13\65",
            "\1\112\16\uffff\1\114\1\113",
            "\1\115",
            "\1\116\67\uffff\1\114",
            "\1\117",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\121\25\65",
            "\1\113",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\123\3\65\1\124\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\30\65\1\125\1\65",
            "\1\127\1\uffff\1\127\2\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\126\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\130\13\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\131\10\65",
            "\1\132",
            "\1\133",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\134\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\135\31\65",
            "\10\136\2\137",
            "\10\140\2\141\36\uffff\1\43\37\uffff\1\43",
            "\12\137",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\142\21\65",
            "",
            "\1\113",
            "\1\113\1\114",
            "\32\143\4\uffff\1\143\1\uffff\32\143",
            "\1\144\4\uffff\1\145",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\0\146",
            "\0\146",
            "\2\147\2\uffff\1\147\22\uffff\1\147",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\150\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\153\12\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\154\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\155\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\156\21\65",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\157\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\160\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\161\16\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\162\12\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\163\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\164\7\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\165\14\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\167\24\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\170\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\171\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\17\65\1\172\12\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\173\7\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\174\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\176\25\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\177\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u0080\27\65",
            "\10\136\2\137",
            "\12\137",
            "\10\140\2\141",
            "\12\141",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0082\21\65",
            "",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0084\25\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0085\13\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u0086\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0087\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u0088\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u0089\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u008b\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u008d\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u008e\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0090\1\u008f\6\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u0092\3\65\1\u0091\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u0093\23\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u0094\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0095\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0096\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u0097\13\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u0098\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\12\65\1\u009a\17\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u009b\21\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u009c\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u009d\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u009e\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u009f\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00a0\27\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00a2\6\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00a5\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00a6\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00a7\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00a8\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00a9\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00aa\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\12\65\1\u00ae\17\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00af\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u00b0\21\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\5\65\1\u00b1\24\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b2\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b3\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00b4\6\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00b5\22\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00b6\22\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00b7\14\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00ba\16\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\15\65\1\u00bc\14\65",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00be\23\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\1\u00c0\31\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\21\65\1\u00c5\10\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00c6\5\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\23\65\1\u00c7\6\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00c9\25\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\2\65\1\u00ca\27\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\16\65\1\u00cb\13\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00cc\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00cf\25\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00d0\5\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\6\65\1\u00d3\23\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\7\65\1\u00d4\22\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_UNICODE_CHAR | RULE_INT_LITERAL | RULE_DECIMAL_DIGITS | RULE_EXPONENT_PART | RULE_STRING_LIT | RULE_RUNE_LIT | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_UNARY_OP | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_43 = input.LA(1);

                        s = -1;
                        if ( ((LA22_43>='\u0000' && LA22_43<='\uFFFF')) ) {s = 102;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='.') ) {s = 1;}

                        else if ( (LA22_0=='i') ) {s = 2;}

                        else if ( (LA22_0=='(') ) {s = 3;}

                        else if ( (LA22_0==')') ) {s = 4;}

                        else if ( (LA22_0=='[') ) {s = 5;}

                        else if ( (LA22_0==']') ) {s = 6;}

                        else if ( (LA22_0=='s') ) {s = 7;}

                        else if ( (LA22_0=='{') ) {s = 8;}

                        else if ( (LA22_0==';') ) {s = 9;}

                        else if ( (LA22_0=='}') ) {s = 10;}

                        else if ( (LA22_0=='*') ) {s = 11;}

                        else if ( (LA22_0=='f') ) {s = 12;}

                        else if ( (LA22_0==',') ) {s = 13;}

                        else if ( (LA22_0=='m') ) {s = 14;}

                        else if ( (LA22_0=='c') ) {s = 15;}

                        else if ( (LA22_0=='<') ) {s = 16;}

                        else if ( (LA22_0=='|') ) {s = 17;}

                        else if ( (LA22_0=='&') ) {s = 18;}

                        else if ( (LA22_0==':') ) {s = 19;}

                        else if ( (LA22_0=='d') ) {s = 20;}

                        else if ( (LA22_0=='=') ) {s = 21;}

                        else if ( (LA22_0=='r') ) {s = 22;}

                        else if ( (LA22_0=='t') ) {s = 23;}

                        else if ( (LA22_0=='e') ) {s = 24;}

                        else if ( (LA22_0=='g') ) {s = 25;}

                        else if ( (LA22_0=='b') ) {s = 26;}

                        else if ( (LA22_0=='+') ) {s = 27;}

                        else if ( (LA22_0=='-') ) {s = 28;}

                        else if ( (LA22_0=='v') ) {s = 29;}

                        else if ( (LA22_0=='p') ) {s = 30;}

                        else if ( ((LA22_0>='1' && LA22_0<='7')) ) {s = 31;}

                        else if ( (LA22_0=='0') ) {s = 32;}

                        else if ( ((LA22_0>='8' && LA22_0<='9')) ) {s = 33;}

                        else if ( (LA22_0=='o') ) {s = 34;}

                        else if ( (LA22_0=='!') ) {s = 36;}

                        else if ( (LA22_0=='>') ) {s = 37;}

                        else if ( (LA22_0=='^') ) {s = 38;}

                        else if ( (LA22_0=='/') ) {s = 39;}

                        else if ( (LA22_0=='%') ) {s = 40;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='a'||LA22_0=='h'||(LA22_0>='j' && LA22_0<='l')||LA22_0=='n'||LA22_0=='q'||LA22_0=='u'||(LA22_0>='w' && LA22_0<='z')) ) {s = 41;}

                        else if ( (LA22_0=='\"') ) {s = 42;}

                        else if ( (LA22_0=='\'') ) {s = 43;}

                        else if ( (LA22_0=='\t'||LA22_0==' ') ) {s = 44;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||(LA22_0>='#' && LA22_0<='$')||(LA22_0>='?' && LA22_0<='@')||LA22_0=='\\'||LA22_0=='`'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 45;}

                        else if ( (LA22_0=='\n'||LA22_0=='\r') ) {s = 46;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_42 = input.LA(1);

                        s = -1;
                        if ( ((LA22_42>='\u0000' && LA22_42<='\uFFFF')) ) {s = 102;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}