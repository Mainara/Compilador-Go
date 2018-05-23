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
    public static final int RULE_STRING_LIT=5;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=16;
    public static final int RULE_MUL_OP=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int RULE_INTEGERLITERAL=11;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=17;
    public static final int RULE_EXPONENT_PART=12;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_DECIMAL_DIGITS=6;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ADD_OP=9;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_LETTER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_UNARY_OP=13;
    public static final int T__45=45;
    public static final int RULE_REL_OP=8;
    public static final int T__46=46;
    public static final int T__47=47;
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

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'fallthrough' )
            // InternalMyDsl.g:11:9: 'fallthrough'
            {
            match("fallthrough"); 


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
            // InternalMyDsl.g:12:7: ( '<-' )
            // InternalMyDsl.g:12:9: '<-'
            {
            match("<-"); 


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
            // InternalMyDsl.g:13:7: ( '||' )
            // InternalMyDsl.g:13:9: '||'
            {
            match("||"); 


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
            // InternalMyDsl.g:14:7: ( '&&' )
            // InternalMyDsl.g:14:9: '&&'
            {
            match("&&"); 


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
            // InternalMyDsl.g:15:7: ( ']' )
            // InternalMyDsl.g:15:9: ']'
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
            // InternalMyDsl.g:16:7: ( 'default' )
            // InternalMyDsl.g:16:9: 'default'
            {
            match("default"); 


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
            // InternalMyDsl.g:17:7: ( '++' )
            // InternalMyDsl.g:17:9: '++'
            {
            match("++"); 


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
            // InternalMyDsl.g:18:7: ( '--' )
            // InternalMyDsl.g:18:9: '--'
            {
            match("--"); 


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
            // InternalMyDsl.g:19:7: ( '.' )
            // InternalMyDsl.g:19:9: '.'
            {
            match('.'); 

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
            // InternalMyDsl.g:20:7: ( 'i' )
            // InternalMyDsl.g:20:9: 'i'
            {
            match('i'); 

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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'struct' )
            // InternalMyDsl.g:24:9: 'struct'
            {
            match("struct"); 


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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( ';' )
            // InternalMyDsl.g:27:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:28:7: ( '*' )
            // InternalMyDsl.g:28:9: '*'
            {
            match('*'); 

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
            // InternalMyDsl.g:29:7: ( 'func' )
            // InternalMyDsl.g:29:9: 'func'
            {
            match("func"); 


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
            // InternalMyDsl.g:30:7: ( ',' )
            // InternalMyDsl.g:30:9: ','
            {
            match(','); 

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
            // InternalMyDsl.g:31:7: ( '...' )
            // InternalMyDsl.g:31:9: '...'
            {
            match("..."); 


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
            // InternalMyDsl.g:32:7: ( 'interface' )
            // InternalMyDsl.g:32:9: 'interface'
            {
            match("interface"); 


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
            // InternalMyDsl.g:33:7: ( 'map' )
            // InternalMyDsl.g:33:9: 'map'
            {
            match("map"); 


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
            // InternalMyDsl.g:34:7: ( 'chan' )
            // InternalMyDsl.g:34:9: 'chan'
            {
            match("chan"); 


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
            // InternalMyDsl.g:35:7: ( ':' )
            // InternalMyDsl.g:35:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:36:7: ( 'defer' )
            // InternalMyDsl.g:36:9: 'defer'
            {
            match("defer"); 


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
            // InternalMyDsl.g:37:7: ( 'for' )
            // InternalMyDsl.g:37:9: 'for'
            {
            match("for"); 


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
            // InternalMyDsl.g:38:7: ( 'range' )
            // InternalMyDsl.g:38:9: 'range'
            {
            match("range"); 


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
            // InternalMyDsl.g:39:7: ( ':=' )
            // InternalMyDsl.g:39:9: ':='
            {
            match(":="); 


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
            // InternalMyDsl.g:40:7: ( '=' )
            // InternalMyDsl.g:40:9: '='
            {
            match('='); 

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
            // InternalMyDsl.g:41:7: ( 'select' )
            // InternalMyDsl.g:41:9: 'select'
            {
            match("select"); 


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
            // InternalMyDsl.g:42:7: ( 'case' )
            // InternalMyDsl.g:42:9: 'case'
            {
            match("case"); 


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
            // InternalMyDsl.g:43:7: ( 'switch' )
            // InternalMyDsl.g:43:9: 'switch'
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
            // InternalMyDsl.g:44:7: ( 'type' )
            // InternalMyDsl.g:44:9: 'type'
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
            // InternalMyDsl.g:45:7: ( 'if' )
            // InternalMyDsl.g:45:9: 'if'
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
            // InternalMyDsl.g:46:7: ( 'else' )
            // InternalMyDsl.g:46:9: 'else'
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
            // InternalMyDsl.g:47:7: ( 'goto' )
            // InternalMyDsl.g:47:9: 'goto'
            {
            match("goto"); 


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
            // InternalMyDsl.g:48:7: ( 'continue' )
            // InternalMyDsl.g:48:9: 'continue'
            {
            match("continue"); 


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
            // InternalMyDsl.g:49:7: ( 'break' )
            // InternalMyDsl.g:49:9: 'break'
            {
            match("break"); 


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
            // InternalMyDsl.g:50:7: ( 'return' )
            // InternalMyDsl.g:50:9: 'return'
            {
            match("return"); 


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
            // InternalMyDsl.g:51:7: ( 'go' )
            // InternalMyDsl.g:51:9: 'go'
            {
            match("go"); 


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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:15237:22: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:15237:24: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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

    // $ANTLR start "RULE_INTEGERLITERAL"
    public final void mRULE_INTEGERLITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGERLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15239:21: ( ( '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )* | '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ) )
            // InternalMyDsl.g:15239:23: ( '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )* | '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            {
            // InternalMyDsl.g:15239:23: ( '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )* | '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='0') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='X'||LA4_2=='x') ) {
                    alt4=3;
                }
                else {
                    alt4=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:15239:24: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // InternalMyDsl.g:15239:33: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:15239:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:15239:45: '0' ( '0' .. '7' )*
                    {
                    match('0'); 
                    // InternalMyDsl.g:15239:49: ( '0' .. '7' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='7')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:15239:50: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:15239:61: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:15239:75: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
    // $ANTLR end "RULE_INTEGERLITERAL"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15241:21: ( RULE_INT )
            // InternalMyDsl.g:15241:23: RULE_INT
            {
            mRULE_INT(); 

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
            // InternalMyDsl.g:15243:20: ( 'e' ( '+' | '-' ) RULE_DECIMAL_DIGITS )
            // InternalMyDsl.g:15243:22: 'e' ( '+' | '-' ) RULE_DECIMAL_DIGITS
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
            // InternalMyDsl.g:15245:17: ( 'oi' )
            // InternalMyDsl.g:15245:19: 'oi'
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

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            int _type = RULE_REL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15247:13: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // InternalMyDsl.g:15247:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // InternalMyDsl.g:15247:15: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt5=1;
                }
                break;
            case '!':
                {
                alt5=2;
                }
                break;
            case '<':
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3=='=') ) {
                    alt5=4;
                }
                else {
                    alt5=3;}
                }
                break;
            case '>':
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4=='=') ) {
                    alt5=6;
                }
                else {
                    alt5=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:15247:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:15247:21: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:15247:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:15247:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:15247:35: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:15247:39: '>='
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
            // InternalMyDsl.g:15249:13: ( ( '+' | '-' | '|' | '^' ) )
            // InternalMyDsl.g:15249:15: ( '+' | '-' | '|' | '^' )
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
            // InternalMyDsl.g:15251:13: ( ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' ) )
            // InternalMyDsl.g:15251:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            {
            // InternalMyDsl.g:15251:15: ( '*' | '/' | '%' | '<<' | '>>' | '&' | '&^' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case '*':
                {
                alt6=1;
                }
                break;
            case '/':
                {
                alt6=2;
                }
                break;
            case '%':
                {
                alt6=3;
                }
                break;
            case '<':
                {
                alt6=4;
                }
                break;
            case '>':
                {
                alt6=5;
                }
                break;
            case '&':
                {
                int LA6_6 = input.LA(2);

                if ( (LA6_6=='^') ) {
                    alt6=7;
                }
                else {
                    alt6=6;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:15251:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:15251:20: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:15251:24: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:15251:28: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:15251:33: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:15251:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:15251:42: '&^'
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
            // InternalMyDsl.g:15253:15: ( ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' ) )
            // InternalMyDsl.g:15253:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            {
            // InternalMyDsl.g:15253:17: ( '+' | '-' | '!' | '^' | '*' | '&' | '<-' )
            int alt7=7;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt7=1;
                }
                break;
            case '-':
                {
                alt7=2;
                }
                break;
            case '!':
                {
                alt7=3;
                }
                break;
            case '^':
                {
                alt7=4;
                }
                break;
            case '*':
                {
                alt7=5;
                }
                break;
            case '&':
                {
                alt7=6;
                }
                break;
            case '<':
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:15253:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:15253:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:15253:26: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:15253:30: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:15253:34: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:15253:38: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:15253:42: '<-'
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
            // InternalMyDsl.g:15255:17: ( RULE_LETTER ( RULE_LETTER | '0' .. '9' )* )
            // InternalMyDsl.g:15255:19: RULE_LETTER ( RULE_LETTER | '0' .. '9' )*
            {
            mRULE_LETTER(); 
            // InternalMyDsl.g:15255:31: ( RULE_LETTER | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            	    break loop8;
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
            // InternalMyDsl.g:15257:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:15257:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:15257:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:15257:11: '^'
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

            // InternalMyDsl.g:15257:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMyDsl.g:15259:19: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:15259:21: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:15259:21: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:15259:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalMyDsl.g:15261:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:15261:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:15261:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:15261:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:15261:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:15261:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:15261:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:15261:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:15261:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:15261:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:15261:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // InternalMyDsl.g:15263:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:15263:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:15263:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:15263:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // InternalMyDsl.g:15265:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:15265:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:15265:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:15265:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // InternalMyDsl.g:15265:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:15265:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:15265:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:15265:41: '\\r'
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
            // InternalMyDsl.g:15267:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:15267:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:15267:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // InternalMyDsl.g:15269:16: ( . )
            // InternalMyDsl.g:15269:18: .
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
        // InternalMyDsl.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_INTEGERLITERAL | RULE_DECIMAL_DIGITS | RULE_EXPONENT_PART | RULE_STRING_LIT | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_UNARY_OP | RULE_IDENTIFIER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=60;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalMyDsl.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__59
                {
                mT__59(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__60
                {
                mT__60(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__61
                {
                mT__61(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__62
                {
                mT__62(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__63
                {
                mT__63(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__64
                {
                mT__64(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__65
                {
                mT__65(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: RULE_INTEGERLITERAL
                {
                mRULE_INTEGERLITERAL(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:300: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:320: RULE_EXPONENT_PART
                {
                mRULE_EXPONENT_PART(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:339: RULE_STRING_LIT
                {
                mRULE_STRING_LIT(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:355: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:367: RULE_ADD_OP
                {
                mRULE_ADD_OP(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:379: RULE_MUL_OP
                {
                mRULE_MUL_OP(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:391: RULE_UNARY_OP
                {
                mRULE_UNARY_OP(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:405: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:421: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:429: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:441: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:457: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:473: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:481: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\1\57\1\62\1\65\1\63\1\uffff\1\57\2\65\1\74\1\100\3\uffff\1\57\5\uffff\2\57\1\121\1\57\1\124\6\57\2\134\1\57\1\141\1\62\1\65\1\63\1\uffff\1\57\2\53\2\uffff\3\57\1\uffff\1\57\7\uffff\1\57\4\uffff\1\57\1\155\1\57\4\uffff\3\57\5\uffff\4\57\2\uffff\2\57\1\uffff\2\57\1\uffff\1\173\3\57\1\uffff\2\134\1\uffff\1\177\6\uffff\2\57\1\u0082\1\uffff\2\57\1\uffff\4\57\1\u008a\10\57\1\uffff\1\57\1\u0095\1\57\1\uffff\1\57\1\u0098\1\uffff\7\57\1\uffff\1\u00a0\1\u00a1\4\57\1\u00a6\1\u00a7\1\u00a8\1\57\1\uffff\2\57\1\uffff\1\57\1\u00ad\5\57\2\uffff\1\57\1\u00b4\1\u00b5\1\57\3\uffff\1\u00b7\3\57\1\uffff\1\57\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\57\2\uffff\1\u00c1\1\uffff\2\57\1\u00c4\1\57\4\uffff\1\57\1\uffff\1\u00c7\1\57\1\uffff\1\57\1\u00ca\1\uffff\1\57\1\u00cc\1\uffff\1\57\1\uffff\1\u00ce\1\uffff";
    static final String DFA20_eofS =
        "\u00cf\uffff";
    static final String DFA20_minS =
        "\1\0\1\60\1\55\1\174\1\46\1\uffff\1\60\1\53\1\55\1\56\1\60\3\uffff\1\60\5\uffff\2\60\1\75\1\60\1\75\1\60\1\53\7\60\1\75\1\76\1\101\1\52\1\uffff\1\60\2\0\2\uffff\3\60\1\uffff\1\60\7\uffff\1\60\4\uffff\3\60\4\uffff\3\60\5\uffff\4\60\2\uffff\2\60\1\uffff\2\60\1\uffff\4\60\1\uffff\2\60\1\uffff\1\60\6\uffff\3\60\1\uffff\2\60\1\uffff\15\60\1\uffff\3\60\1\uffff\2\60\1\uffff\7\60\1\uffff\12\60\1\uffff\2\60\1\uffff\7\60\2\uffff\4\60\3\uffff\4\60\1\uffff\6\60\2\uffff\1\60\1\uffff\4\60\4\uffff\1\60\1\uffff\2\60\1\uffff\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\172\1\74\1\174\1\46\1\uffff\1\172\1\53\1\55\1\56\1\172\3\uffff\1\172\5\uffff\2\172\1\75\1\172\1\75\6\172\2\71\1\172\1\75\1\76\1\172\1\57\1\uffff\1\172\2\uffff\2\uffff\3\172\1\uffff\1\172\7\uffff\1\172\4\uffff\3\172\4\uffff\3\172\5\uffff\4\172\2\uffff\2\172\1\uffff\2\172\1\uffff\4\172\1\uffff\2\71\1\uffff\1\172\6\uffff\3\172\1\uffff\2\172\1\uffff\15\172\1\uffff\3\172\1\uffff\2\172\1\uffff\7\172\1\uffff\12\172\1\uffff\2\172\1\uffff\7\172\2\uffff\4\172\3\uffff\4\172\1\uffff\6\172\2\uffff\1\172\1\uffff\4\172\4\uffff\1\172\1\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\5\uffff\1\5\5\uffff\1\13\1\14\1\15\1\uffff\1\17\1\20\1\21\1\22\1\24\22\uffff\1\64\3\uffff\1\73\1\74\3\uffff\1\66\1\uffff\1\2\1\62\1\64\1\3\1\63\1\4\1\5\1\uffff\1\7\1\10\1\25\1\11\3\uffff\1\12\1\13\1\14\1\15\3\uffff\1\17\1\20\1\21\1\22\1\24\4\uffff\1\35\1\31\2\uffff\1\36\2\uffff\1\60\4\uffff\1\56\2\uffff\1\57\1\uffff\1\65\1\67\1\71\1\72\1\70\1\73\3\uffff\1\2\2\uffff\1\43\15\uffff\1\51\3\uffff\1\61\2\uffff\1\33\7\uffff\1\27\12\uffff\1\53\2\uffff\1\23\7\uffff\1\30\1\40\4\uffff\1\42\1\44\1\45\4\uffff\1\32\6\uffff\1\52\1\34\1\uffff\1\47\4\uffff\1\55\1\16\1\37\1\41\1\uffff\1\50\2\uffff\1\6\2\uffff\1\54\2\uffff\1\46\1\uffff\1\26\1\uffff\1\1";
    static final String DFA20_specialS =
        "\1\0\47\uffff\1\1\1\2\u00a5\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\42\1\50\2\53\1\46\1\4\1\51\1\13\1\14\1\22\1\7\1\23\1\10\1\11\1\45\1\40\11\37\1\26\1\21\1\2\1\30\1\43\2\53\32\47\1\15\1\53\1\5\1\44\1\47\1\53\1\47\1\34\1\25\1\6\1\32\1\1\1\33\1\47\1\12\3\47\1\24\1\47\1\41\1\36\1\47\1\27\1\16\1\31\1\47\1\35\4\47\1\17\1\3\1\20\uff82\53",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\54\15\60\1\56\5\60\1\55\5\60",
            "\1\61\16\uffff\1\63",
            "\1\64",
            "\1\66",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\70\25\60",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\76\6\60\1\77\1\75\14\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\105\16\60\1\104\2\60\1\106\3\60",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\114\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\116\6\60\1\115\6\60\1\117\13\60",
            "\1\120",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\122\3\60\1\123\25\60",
            "\1\62",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\125\1\60",
            "\1\127\1\uffff\1\127\2\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\126\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\130\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\131\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\132\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\133\31\60",
            "\12\135",
            "\10\136\2\137",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\140\21\60",
            "\1\62",
            "\1\63",
            "\32\142\4\uffff\1\142\1\uffff\32\142",
            "\1\143\4\uffff\1\144",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\0\145",
            "\0\145",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\147\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\150\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\151\10\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\153\24\60",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\154\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\156\12\60",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\157\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\160\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\161\21\60",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\162\12\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\163\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\164\7\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\165\14\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\166\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\167\6\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\170\12\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\171\7\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\172\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\174\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\175\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\176\27\60",
            "",
            "\12\135",
            "\10\136\2\137",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0080\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0081\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u0083\3\60\1\u0084\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0085\25\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0086\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u0087\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0088\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0089\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u008b\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u008c\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u008e\1\u008d\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u008f\23\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u0090\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0091\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0092\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0093\13\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u0094\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\12\60\1\u0096\17\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0097\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u0099\5\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u009a\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u009b\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u009c\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u009d\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u009e\27\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u009f\27\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00a2\21\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00a3\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00a4\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00a5\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\12\60\1\u00a9\17\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00aa\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00ab\22\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00ac\16\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u00ae\24\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00af\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b0\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00b1\6\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00b2\22\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00b3\14\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00b6\14\60",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u00b8\23\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00b9\10\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00ba\6\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00bb\31\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00c0\5\60",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c2\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u00c3\13\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00c5\27\60",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c6\25\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00c8\5\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00c9\25\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u00cb\23\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00cd\22\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | RULE_INTEGERLITERAL | RULE_DECIMAL_DIGITS | RULE_EXPONENT_PART | RULE_STRING_LIT | RULE_REL_OP | RULE_ADD_OP | RULE_MUL_OP | RULE_UNARY_OP | RULE_IDENTIFIER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='f') ) {s = 1;}

                        else if ( (LA20_0=='<') ) {s = 2;}

                        else if ( (LA20_0=='|') ) {s = 3;}

                        else if ( (LA20_0=='&') ) {s = 4;}

                        else if ( (LA20_0==']') ) {s = 5;}

                        else if ( (LA20_0=='d') ) {s = 6;}

                        else if ( (LA20_0=='+') ) {s = 7;}

                        else if ( (LA20_0=='-') ) {s = 8;}

                        else if ( (LA20_0=='.') ) {s = 9;}

                        else if ( (LA20_0=='i') ) {s = 10;}

                        else if ( (LA20_0=='(') ) {s = 11;}

                        else if ( (LA20_0==')') ) {s = 12;}

                        else if ( (LA20_0=='[') ) {s = 13;}

                        else if ( (LA20_0=='s') ) {s = 14;}

                        else if ( (LA20_0=='{') ) {s = 15;}

                        else if ( (LA20_0=='}') ) {s = 16;}

                        else if ( (LA20_0==';') ) {s = 17;}

                        else if ( (LA20_0=='*') ) {s = 18;}

                        else if ( (LA20_0==',') ) {s = 19;}

                        else if ( (LA20_0=='m') ) {s = 20;}

                        else if ( (LA20_0=='c') ) {s = 21;}

                        else if ( (LA20_0==':') ) {s = 22;}

                        else if ( (LA20_0=='r') ) {s = 23;}

                        else if ( (LA20_0=='=') ) {s = 24;}

                        else if ( (LA20_0=='t') ) {s = 25;}

                        else if ( (LA20_0=='e') ) {s = 26;}

                        else if ( (LA20_0=='g') ) {s = 27;}

                        else if ( (LA20_0=='b') ) {s = 28;}

                        else if ( (LA20_0=='v') ) {s = 29;}

                        else if ( (LA20_0=='p') ) {s = 30;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 31;}

                        else if ( (LA20_0=='0') ) {s = 32;}

                        else if ( (LA20_0=='o') ) {s = 33;}

                        else if ( (LA20_0=='!') ) {s = 34;}

                        else if ( (LA20_0=='>') ) {s = 35;}

                        else if ( (LA20_0=='^') ) {s = 36;}

                        else if ( (LA20_0=='/') ) {s = 37;}

                        else if ( (LA20_0=='%') ) {s = 38;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='a'||LA20_0=='h'||(LA20_0>='j' && LA20_0<='l')||LA20_0=='n'||LA20_0=='q'||LA20_0=='u'||(LA20_0>='w' && LA20_0<='z')) ) {s = 39;}

                        else if ( (LA20_0=='\"') ) {s = 40;}

                        else if ( (LA20_0=='\'') ) {s = 41;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 42;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='#' && LA20_0<='$')||(LA20_0>='?' && LA20_0<='@')||LA20_0=='\\'||LA20_0=='`'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_40 = input.LA(1);

                        s = -1;
                        if ( ((LA20_40>='\u0000' && LA20_40<='\uFFFF')) ) {s = 101;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_41 = input.LA(1);

                        s = -1;
                        if ( ((LA20_41>='\u0000' && LA20_41<='\uFFFF')) ) {s = 101;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}