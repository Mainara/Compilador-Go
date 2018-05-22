package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMAL_DIGITS", "RULE_EXPONENT_PART", "RULE_IDENTIFIER", "RULE_ANY_OTHER", "RULE_STRING_LIT", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_INT_LITERAL", "RULE_LETTER", "RULE_NEW_LINE", "RULE_UNICODE_CHAR", "RULE_RUNE_LIT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'i'", "'('", "')'", "'['", "']'", "'struct'", "'{'", "';'", "'}'", "'*'", "'func'", "','", "'...'", "'interface'", "'map'", "'chan'", "'<-'", "'||'", "'&&'", "':'", "'defer'", "'for'", "':='", "'='", "'range'", "'select'", "'case'", "'default'", "'switch'", "'type'", "'if'", "'else'", "'fallthrough'", "'goto'", "'continue'", "'break'", "'return'", "'go'", "'++'", "'--'", "'const'", "'var'", "'package'", "'import'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==67) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"greetings",
            	      					lv_greetings_0_0,
            	      					"org.xtext.example.mydsl.MyDsl.Greeting");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:100:1: entryRuleGreeting returns [String current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final String entryRuleGreeting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:107:1: ruleGreeting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SourceFile_0= ruleSourceFile ;
    public final AntlrDatatypeRuleToken ruleGreeting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SourceFile_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: (this_SourceFile_0= ruleSourceFile )
            // InternalMyDsl.g:114:2: this_SourceFile_0= ruleSourceFile
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getGreetingAccess().getSourceFileParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SourceFile_0=ruleSourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SourceFile_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRulefloat_literal"
    // InternalMyDsl.g:127:1: entryRulefloat_literal returns [String current=null] : iv_rulefloat_literal= rulefloat_literal EOF ;
    public final String entryRulefloat_literal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulefloat_literal = null;


        try {
            // InternalMyDsl.g:127:53: (iv_rulefloat_literal= rulefloat_literal EOF )
            // InternalMyDsl.g:128:2: iv_rulefloat_literal= rulefloat_literal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat_literalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat_literal=rulefloat_literal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat_literal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat_literal"


    // $ANTLR start "rulefloat_literal"
    // InternalMyDsl.g:134:1: rulefloat_literal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART ) | (kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART ) | (this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART ) ) ;
    public final AntlrDatatypeRuleToken rulefloat_literal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_DIGITS_0=null;
        Token kw=null;
        Token this_DECIMAL_DIGITS_2=null;
        Token this_EXPONENT_PART_3=null;
        Token this_DECIMAL_DIGITS_5=null;
        Token this_EXPONENT_PART_6=null;
        Token this_DECIMAL_DIGITS_7=null;
        Token this_EXPONENT_PART_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:140:2: ( ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART ) | (kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART ) | (this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART ) ) )
            // InternalMyDsl.g:141:2: ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART ) | (kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART ) | (this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART ) )
            {
            // InternalMyDsl.g:141:2: ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART ) | (kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART ) | (this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DECIMAL_DIGITS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==24) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_EXPONENT_PART) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:142:3: (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART )
                    {
                    // InternalMyDsl.g:142:3: (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART )
                    // InternalMyDsl.g:143:4: this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS kw= '.' this_DECIMAL_DIGITS_2= RULE_DECIMAL_DIGITS this_EXPONENT_PART_3= RULE_EXPONENT_PART
                    {
                    this_DECIMAL_DIGITS_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMAL_DIGITS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMAL_DIGITS_0, grammarAccess.getFloat_literalAccess().getDECIMAL_DIGITSTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloat_literalAccess().getFullStopKeyword_0_1());
                      			
                    }
                    this_DECIMAL_DIGITS_2=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMAL_DIGITS_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMAL_DIGITS_2, grammarAccess.getFloat_literalAccess().getDECIMAL_DIGITSTerminalRuleCall_0_2());
                      			
                    }
                    this_EXPONENT_PART_3=(Token)match(input,RULE_EXPONENT_PART,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXPONENT_PART_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXPONENT_PART_3, grammarAccess.getFloat_literalAccess().getEXPONENT_PARTTerminalRuleCall_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:171:3: (kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART )
                    {
                    // InternalMyDsl.g:171:3: (kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART )
                    // InternalMyDsl.g:172:4: kw= '.' this_DECIMAL_DIGITS_5= RULE_DECIMAL_DIGITS this_EXPONENT_PART_6= RULE_EXPONENT_PART
                    {
                    kw=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloat_literalAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_DECIMAL_DIGITS_5=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMAL_DIGITS_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMAL_DIGITS_5, grammarAccess.getFloat_literalAccess().getDECIMAL_DIGITSTerminalRuleCall_1_1());
                      			
                    }
                    this_EXPONENT_PART_6=(Token)match(input,RULE_EXPONENT_PART,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXPONENT_PART_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXPONENT_PART_6, grammarAccess.getFloat_literalAccess().getEXPONENT_PARTTerminalRuleCall_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:193:3: (this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART )
                    {
                    // InternalMyDsl.g:193:3: (this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART )
                    // InternalMyDsl.g:194:4: this_DECIMAL_DIGITS_7= RULE_DECIMAL_DIGITS this_EXPONENT_PART_8= RULE_EXPONENT_PART
                    {
                    this_DECIMAL_DIGITS_7=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMAL_DIGITS_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMAL_DIGITS_7, grammarAccess.getFloat_literalAccess().getDECIMAL_DIGITSTerminalRuleCall_2_0());
                      			
                    }
                    this_EXPONENT_PART_8=(Token)match(input,RULE_EXPONENT_PART,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXPONENT_PART_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXPONENT_PART_8, grammarAccess.getFloat_literalAccess().getEXPONENT_PARTTerminalRuleCall_2_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat_literal"


    // $ANTLR start "entryRuleImaginary_lit"
    // InternalMyDsl.g:213:1: entryRuleImaginary_lit returns [String current=null] : iv_ruleImaginary_lit= ruleImaginary_lit EOF ;
    public final String entryRuleImaginary_lit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImaginary_lit = null;


        try {
            // InternalMyDsl.g:213:53: (iv_ruleImaginary_lit= ruleImaginary_lit EOF )
            // InternalMyDsl.g:214:2: iv_ruleImaginary_lit= ruleImaginary_lit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImaginary_litRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImaginary_lit=ruleImaginary_lit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImaginary_lit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImaginary_lit"


    // $ANTLR start "ruleImaginary_lit"
    // InternalMyDsl.g:220:1: ruleImaginary_lit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS | this_float_literal_1= rulefloat_literal ) kw= 'i' ) ;
    public final AntlrDatatypeRuleToken ruleImaginary_lit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMAL_DIGITS_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_float_literal_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:226:2: ( ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS | this_float_literal_1= rulefloat_literal ) kw= 'i' ) )
            // InternalMyDsl.g:227:2: ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS | this_float_literal_1= rulefloat_literal ) kw= 'i' )
            {
            // InternalMyDsl.g:227:2: ( (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS | this_float_literal_1= rulefloat_literal ) kw= 'i' )
            // InternalMyDsl.g:228:3: (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS | this_float_literal_1= rulefloat_literal ) kw= 'i'
            {
            // InternalMyDsl.g:228:3: (this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS | this_float_literal_1= rulefloat_literal )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_DECIMAL_DIGITS) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_EXPONENT_PART||LA3_1==24) ) {
                    alt3=2;
                }
                else if ( (LA3_1==25) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:229:4: this_DECIMAL_DIGITS_0= RULE_DECIMAL_DIGITS
                    {
                    this_DECIMAL_DIGITS_0=(Token)match(input,RULE_DECIMAL_DIGITS,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMAL_DIGITS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMAL_DIGITS_0, grammarAccess.getImaginary_litAccess().getDECIMAL_DIGITSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:237:4: this_float_literal_1= rulefloat_literal
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImaginary_litAccess().getFloat_literalParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_7);
                    this_float_literal_1=rulefloat_literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_float_literal_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImaginary_litAccess().getIKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImaginary_lit"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:257:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:257:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:258:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:264:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeLit_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:270:2: ( (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:271:2: (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:271:2: (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt4=1;
                }
                break;
            case 28:
            case 30:
            case 34:
            case 35:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:272:3: this_TypeName_0= ruleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTypeNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeName_0=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:283:3: this_TypeLit_1= ruleTypeLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getTypeLitParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLit_1=ruleTypeLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeLit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:294:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    // InternalMyDsl.g:295:4: kw= '(' this_Type_3= ruleType kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Type_3=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeName"
    // InternalMyDsl.g:320:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:320:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:321:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalMyDsl.g:327:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_TypeNameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:333:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha ) )
            // InternalMyDsl.g:334:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha )
            {
            // InternalMyDsl.g:334:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha )
            // InternalMyDsl.g:335:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeNameAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeNameAccess().getTypeNameLinhaParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_TypeNameLinha_1=ruleTypeNameLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeNameLinha_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleTypeNameLinha"
    // InternalMyDsl.g:356:1: entryRuleTypeNameLinha returns [String current=null] : iv_ruleTypeNameLinha= ruleTypeNameLinha EOF ;
    public final String entryRuleTypeNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeNameLinha = null;


        try {
            // InternalMyDsl.g:356:53: (iv_ruleTypeNameLinha= ruleTypeNameLinha EOF )
            // InternalMyDsl.g:357:2: iv_ruleTypeNameLinha= ruleTypeNameLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeNameLinha=ruleTypeNameLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameLinha"


    // $ANTLR start "ruleTypeNameLinha"
    // InternalMyDsl.g:363:1: ruleTypeNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleTypeNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:369:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:370:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:370:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ANY_OTHER) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:371:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:371:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:372:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeNameLinhaAccess().getFullStopKeyword_0_0());
                      			
                    }
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getTypeNameLinhaAccess().getIDENTIFIERTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:386:3: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_2, grammarAccess.getTypeNameLinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNameLinha"


    // $ANTLR start "entryRulePackageName"
    // InternalMyDsl.g:397:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:397:51: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:398:2: iv_rulePackageName= rulePackageName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageName=rulePackageName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalMyDsl.g:404:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:410:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:411:2: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_IDENTIFIER_0, grammarAccess.getPackageNameAccess().getIDENTIFIERTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleTypeLit"
    // InternalMyDsl.g:421:1: entryRuleTypeLit returns [String current=null] : iv_ruleTypeLit= ruleTypeLit EOF ;
    public final String entryRuleTypeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLit = null;


        try {
            // InternalMyDsl.g:421:47: (iv_ruleTypeLit= ruleTypeLit EOF )
            // InternalMyDsl.g:422:2: iv_ruleTypeLit= ruleTypeLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLit=ruleTypeLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLit"


    // $ANTLR start "ruleTypeLit"
    // InternalMyDsl.g:428:1: ruleTypeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) ;
    public final AntlrDatatypeRuleToken ruleTypeLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeLitLinha_1 = null;

        AntlrDatatypeRuleToken this_StructType_2 = null;

        AntlrDatatypeRuleToken this_PointerType_3 = null;

        AntlrDatatypeRuleToken this_FunctionType_4 = null;

        AntlrDatatypeRuleToken this_InterfaceType_5 = null;

        AntlrDatatypeRuleToken this_MapType_6 = null;

        AntlrDatatypeRuleToken this_ChannelType_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:434:2: ( ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) )
            // InternalMyDsl.g:435:2: ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            {
            // InternalMyDsl.g:435:2: ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 35:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            case 39:
                {
                alt6=6;
                }
                break;
            case 40:
            case 41:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:436:3: (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha )
                    {
                    // InternalMyDsl.g:436:3: (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha )
                    // InternalMyDsl.g:437:4: kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha
                    {
                    kw=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLitAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLitAccess().getTypeLitLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLitLinha_1=ruleTypeLitLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeLitLinha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:454:3: this_StructType_2= ruleStructType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getStructTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructType_2=ruleStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_StructType_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:465:3: this_PointerType_3= rulePointerType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getPointerTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PointerType_3=rulePointerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PointerType_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:476:3: this_FunctionType_4= ruleFunctionType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getFunctionTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionType_4=ruleFunctionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FunctionType_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:487:3: this_InterfaceType_5= ruleInterfaceType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getInterfaceTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceType_5=ruleInterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_InterfaceType_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:498:3: this_MapType_6= ruleMapType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getMapTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapType_6=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MapType_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:509:3: this_ChannelType_7= ruleChannelType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLitAccess().getChannelTypeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChannelType_7=ruleChannelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ChannelType_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLit"


    // $ANTLR start "entryRuleTypeLitLinha"
    // InternalMyDsl.g:523:1: entryRuleTypeLitLinha returns [String current=null] : iv_ruleTypeLitLinha= ruleTypeLitLinha EOF ;
    public final String entryRuleTypeLitLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLitLinha = null;


        try {
            // InternalMyDsl.g:523:52: (iv_ruleTypeLitLinha= ruleTypeLitLinha EOF )
            // InternalMyDsl.g:524:2: iv_ruleTypeLitLinha= ruleTypeLitLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLitLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLitLinha=ruleTypeLitLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLitLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLitLinha"


    // $ANTLR start "ruleTypeLitLinha"
    // InternalMyDsl.g:530:1: ruleTypeLitLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeLitLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_0 = null;

        AntlrDatatypeRuleToken this_ElementType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:536:2: ( ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) ) )
            // InternalMyDsl.g:537:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) )
            {
            // InternalMyDsl.g:537:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DECIMAL_DIGITS||LA7_0==RULE_IDENTIFIER||(LA7_0>=RULE_STRING_LIT && LA7_0<=RULE_UNARY_OP)||LA7_0==RULE_INT_LITERAL||LA7_0==24||LA7_0==26||LA7_0==28||LA7_0==30||(LA7_0>=34 && LA7_0<=35)||(LA7_0>=37 && LA7_0<=41)) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:538:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    {
                    // InternalMyDsl.g:538:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    // InternalMyDsl.g:539:4: this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLitLinhaAccess().getArrayLengthParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_ArrayLength_0=ruleArrayLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayLength_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLitLinhaAccess().getRightSquareBracketKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLitLinhaAccess().getElementTypeParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementType_2=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:566:3: (kw= ']' this_ElementType_4= ruleElementType )
                    {
                    // InternalMyDsl.g:566:3: (kw= ']' this_ElementType_4= ruleElementType )
                    // InternalMyDsl.g:567:4: kw= ']' this_ElementType_4= ruleElementType
                    {
                    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeLitLinhaAccess().getRightSquareBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLitLinhaAccess().getElementTypeParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementType_4=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLitLinha"


    // $ANTLR start "entryRuleArrayLength"
    // InternalMyDsl.g:587:1: entryRuleArrayLength returns [String current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final String entryRuleArrayLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayLength = null;


        try {
            // InternalMyDsl.g:587:51: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalMyDsl.g:588:2: iv_ruleArrayLength= ruleArrayLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLengthRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayLength=ruleArrayLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLength.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLength"


    // $ANTLR start "ruleArrayLength"
    // InternalMyDsl.g:594:1: ruleArrayLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleArrayLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:600:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:601:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getArrayLengthAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLength"


    // $ANTLR start "entryRuleElementType"
    // InternalMyDsl.g:614:1: entryRuleElementType returns [String current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final String entryRuleElementType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementType = null;


        try {
            // InternalMyDsl.g:614:51: (iv_ruleElementType= ruleElementType EOF )
            // InternalMyDsl.g:615:2: iv_ruleElementType= ruleElementType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalMyDsl.g:621:1: ruleElementType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleElementType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:627:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:628:2: this_Type_0= ruleType
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getElementTypeAccess().getTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Type_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleStructType"
    // InternalMyDsl.g:641:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // InternalMyDsl.g:641:50: (iv_ruleStructType= ruleStructType EOF )
            // InternalMyDsl.g:642:2: iv_ruleStructType= ruleStructType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStructType=ruleStructType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructType"


    // $ANTLR start "ruleStructType"
    // InternalMyDsl.g:648:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:654:2: ( (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' ) )
            // InternalMyDsl.g:655:2: (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' )
            {
            // InternalMyDsl.g:655:2: (kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' )
            // InternalMyDsl.g:656:3: kw= 'struct' kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}'
            {
            kw=(Token)match(input,30,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:666:3: (this_FieldDecl_2= ruleFieldDecl kw= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENTIFIER||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:667:4: this_FieldDecl_2= ruleFieldDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStructTypeAccess().getFieldDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    this_FieldDecl_2=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_FieldDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getStructTypeAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructType"


    // $ANTLR start "entryRuleFieldDecl"
    // InternalMyDsl.g:692:1: entryRuleFieldDecl returns [String current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final String entryRuleFieldDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDecl = null;


        try {
            // InternalMyDsl.g:692:49: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalMyDsl.g:693:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // InternalMyDsl.g:699:1: ruleFieldDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? ) ;
    public final AntlrDatatypeRuleToken ruleFieldDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_EmbeddedField_2 = null;

        AntlrDatatypeRuleToken this_Tag_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:705:2: ( ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? ) )
            // InternalMyDsl.g:706:2: ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? )
            {
            // InternalMyDsl.g:706:2: ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? )
            // InternalMyDsl.g:707:3: ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )?
            {
            // InternalMyDsl.g:707:3: ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENTIFIER) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ANY_OTHER||LA9_1==24) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_IDENTIFIER||LA9_1==26||LA9_1==28||LA9_1==30||(LA9_1>=34 && LA9_1<=36)||(LA9_1>=38 && LA9_1<=41)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:708:4: (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType )
                    {
                    // InternalMyDsl.g:708:4: (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType )
                    // InternalMyDsl.g:709:5: this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getIdentifierListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    this_IdentifierList_0=ruleIdentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IdentifierList_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getTypeParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:731:4: this_EmbeddedField_2= ruleEmbeddedField
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getEmbeddedFieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_EmbeddedField_2=ruleEmbeddedField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EmbeddedField_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:742:3: (this_Tag_3= ruleTag )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING_LIT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:743:4: this_Tag_3= ruleTag
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getTagParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Tag_3=ruleTag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Tag_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleEmbeddedField"
    // InternalMyDsl.g:758:1: entryRuleEmbeddedField returns [String current=null] : iv_ruleEmbeddedField= ruleEmbeddedField EOF ;
    public final String entryRuleEmbeddedField() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmbeddedField = null;


        try {
            // InternalMyDsl.g:758:53: (iv_ruleEmbeddedField= ruleEmbeddedField EOF )
            // InternalMyDsl.g:759:2: iv_ruleEmbeddedField= ruleEmbeddedField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmbeddedFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmbeddedField=ruleEmbeddedField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmbeddedField.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmbeddedField"


    // $ANTLR start "ruleEmbeddedField"
    // InternalMyDsl.g:765:1: ruleEmbeddedField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )? this_TypeName_1= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleEmbeddedField() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:771:2: ( ( (kw= '*' )? this_TypeName_1= ruleTypeName ) )
            // InternalMyDsl.g:772:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            {
            // InternalMyDsl.g:772:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            // InternalMyDsl.g:773:3: (kw= '*' )? this_TypeName_1= ruleTypeName
            {
            // InternalMyDsl.g:773:3: (kw= '*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:774:4: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEmbeddedFieldAccess().getAsteriskKeyword_0());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEmbeddedFieldAccess().getTypeNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_TypeName_1=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmbeddedField"


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:794:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // InternalMyDsl.g:794:43: (iv_ruleTag= ruleTag EOF )
            // InternalMyDsl.g:795:2: iv_ruleTag= ruleTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTag.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalMyDsl.g:801:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:807:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:808:2: this_STRING_LIT_0= RULE_STRING_LIT
            {
            this_STRING_LIT_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_LIT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_LIT_0, grammarAccess.getTagAccess().getSTRING_LITTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRulePointerType"
    // InternalMyDsl.g:818:1: entryRulePointerType returns [String current=null] : iv_rulePointerType= rulePointerType EOF ;
    public final String entryRulePointerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointerType = null;


        try {
            // InternalMyDsl.g:818:51: (iv_rulePointerType= rulePointerType EOF )
            // InternalMyDsl.g:819:2: iv_rulePointerType= rulePointerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePointerType=rulePointerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointerType"


    // $ANTLR start "rulePointerType"
    // InternalMyDsl.g:825:1: rulePointerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_BaseType_1= ruleBaseType ) ;
    public final AntlrDatatypeRuleToken rulePointerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:831:2: ( (kw= '*' this_BaseType_1= ruleBaseType ) )
            // InternalMyDsl.g:832:2: (kw= '*' this_BaseType_1= ruleBaseType )
            {
            // InternalMyDsl.g:832:2: (kw= '*' this_BaseType_1= ruleBaseType )
            // InternalMyDsl.g:833:3: kw= '*' this_BaseType_1= ruleBaseType
            {
            kw=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPointerTypeAccess().getAsteriskKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPointerTypeAccess().getBaseTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_BaseType_1=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BaseType_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePointerType"


    // $ANTLR start "entryRuleBaseType"
    // InternalMyDsl.g:852:1: entryRuleBaseType returns [String current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final String entryRuleBaseType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseType = null;


        try {
            // InternalMyDsl.g:852:48: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalMyDsl.g:853:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // InternalMyDsl.g:859:1: ruleBaseType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleBaseType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:865:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:866:2: this_Type_0= ruleType
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBaseTypeAccess().getTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Type_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleFunctionType"
    // InternalMyDsl.g:879:1: entryRuleFunctionType returns [String current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final String entryRuleFunctionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionType = null;


        try {
            // InternalMyDsl.g:879:52: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalMyDsl.g:880:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalMyDsl.g:886:1: ruleFunctionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_Signature_1= ruleSignature ) ;
    public final AntlrDatatypeRuleToken ruleFunctionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:892:2: ( (kw= 'func' this_Signature_1= ruleSignature ) )
            // InternalMyDsl.g:893:2: (kw= 'func' this_Signature_1= ruleSignature )
            {
            // InternalMyDsl.g:893:2: (kw= 'func' this_Signature_1= ruleSignature )
            // InternalMyDsl.g:894:3: kw= 'func' this_Signature_1= ruleSignature
            {
            kw=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionTypeAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionTypeAccess().getSignatureParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Signature_1=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleSignature"
    // InternalMyDsl.g:913:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalMyDsl.g:913:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalMyDsl.g:914:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalMyDsl.g:920:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:926:2: ( (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? ) )
            // InternalMyDsl.g:927:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? )
            {
            // InternalMyDsl.g:927:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? )
            // InternalMyDsl.g:928:3: this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:938:3: ( ( ruleResult )=>this_Result_1= ruleResult )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:939:4: ( ruleResult )=>this_Result_1= ruleResult
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSignatureAccess().getResultParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Result_1=ruleResult();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Result_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleResult"
    // InternalMyDsl.g:955:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalMyDsl.g:955:46: (iv_ruleResult= ruleResult EOF )
            // InternalMyDsl.g:956:2: iv_ruleResult= ruleResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResultRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleResult=ruleResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResult.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalMyDsl.g:962:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:968:2: ( ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType ) )
            // InternalMyDsl.g:969:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )
            {
            // InternalMyDsl.g:969:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:970:3: ( ( ruleParameters )=>this_Parameters_0= ruleParameters )
                    {
                    // InternalMyDsl.g:970:3: ( ( ruleParameters )=>this_Parameters_0= ruleParameters )
                    // InternalMyDsl.g:971:4: ( ruleParameters )=>this_Parameters_0= ruleParameters
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getResultAccess().getParametersParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameters_0=ruleParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Parameters_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:984:3: this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getResultAccess().getTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Type_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleParameters"
    // InternalMyDsl.g:998:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalMyDsl.g:998:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalMyDsl.g:999:2: iv_ruleParameters= ruleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameters.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMyDsl.g:1005:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1011:2: ( (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:1012:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:1012:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:1013:3: kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1018:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENTIFIER||LA15_0==26||LA15_0==28||LA15_0==30||(LA15_0>=34 && LA15_0<=35)||(LA15_0>=37 && LA15_0<=41)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1019:4: this_ParameterList_1= ruleParameterList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ParameterList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:1029:4: (kw= ',' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==36) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:1030:5: kw= ','
                            {
                            kw=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameterList"
    // InternalMyDsl.g:1046:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // InternalMyDsl.g:1046:53: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalMyDsl.g:1047:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalMyDsl.g:1053:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDecl_0 = null;

        AntlrDatatypeRuleToken this_ParameterDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1059:2: ( (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) )
            // InternalMyDsl.g:1060:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            {
            // InternalMyDsl.g:1060:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            // InternalMyDsl.g:1061:3: this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_ParameterDecl_0=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ParameterDecl_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1071:3: (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_IDENTIFIER||LA16_1==26||LA16_1==28||LA16_1==30||(LA16_1>=34 && LA16_1<=35)||(LA16_1>=37 && LA16_1<=41)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1072:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,36,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_22);
            	    this_ParameterDecl_2=ruleParameterDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ParameterDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterDecl"
    // InternalMyDsl.g:1092:1: entryRuleParameterDecl returns [String current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final String entryRuleParameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDecl = null;


        try {
            // InternalMyDsl.g:1092:53: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalMyDsl.g:1093:2: iv_ruleParameterDecl= ruleParameterDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDecl=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDecl"


    // $ANTLR start "ruleParameterDecl"
    // InternalMyDsl.g:1099:1: ruleParameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleParameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1105:2: ( ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType ) )
            // InternalMyDsl.g:1106:2: ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType )
            {
            // InternalMyDsl.g:1106:2: ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType )
            // InternalMyDsl.g:1107:3: (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType
            {
            // InternalMyDsl.g:1107:3: (this_IdentifierList_0= ruleIdentifierList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENTIFIER) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_IDENTIFIER||LA17_1==26||LA17_1==28||LA17_1==30||(LA17_1>=34 && LA17_1<=41)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1108:4: this_IdentifierList_0= ruleIdentifierList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdentifierListParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_IdentifierList_0=ruleIdentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IdentifierList_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalMyDsl.g:1119:3: (kw= '...' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1120:4: kw= '...'
                    {
                    kw=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterDeclAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_2=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDecl"


    // $ANTLR start "entryRuleInterfaceType"
    // InternalMyDsl.g:1140:1: entryRuleInterfaceType returns [String current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final String entryRuleInterfaceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceType = null;


        try {
            // InternalMyDsl.g:1140:53: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalMyDsl.g:1141:2: iv_ruleInterfaceType= ruleInterfaceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceType=ruleInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // InternalMyDsl.g:1147:1: ruleInterfaceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'interface' kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MethodSpec_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1153:2: ( (kw= 'interface' kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' ) )
            // InternalMyDsl.g:1154:2: (kw= 'interface' kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' )
            {
            // InternalMyDsl.g:1154:2: (kw= 'interface' kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' )
            // InternalMyDsl.g:1155:3: kw= 'interface' kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}'
            {
            kw=(Token)match(input,38,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getInterfaceKeyword_0());
              		
            }
            kw=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:1165:3: (this_MethodSpec_2= ruleMethodSpec kw= ';' )
            // InternalMyDsl.g:1166:4: this_MethodSpec_2= ruleMethodSpec kw= ';'
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInterfaceTypeAccess().getMethodSpecParserRuleCall_2_0());
              			
            }
            pushFollow(FOLLOW_16);
            this_MethodSpec_2=ruleMethodSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_MethodSpec_2);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }
            kw=(Token)match(input,32,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_2_1());
              			
            }

            }

            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleMethodSpec"
    // InternalMyDsl.g:1191:1: entryRuleMethodSpec returns [String current=null] : iv_ruleMethodSpec= ruleMethodSpec EOF ;
    public final String entryRuleMethodSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodSpec = null;


        try {
            // InternalMyDsl.g:1191:50: (iv_ruleMethodSpec= ruleMethodSpec EOF )
            // InternalMyDsl.g:1192:2: iv_ruleMethodSpec= ruleMethodSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodSpec=ruleMethodSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodSpec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodSpec"


    // $ANTLR start "ruleMethodSpec"
    // InternalMyDsl.g:1198:1: ruleMethodSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName ) ;
    public final AntlrDatatypeRuleToken ruleMethodSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MethodName_0 = null;

        AntlrDatatypeRuleToken this_Signature_1 = null;

        AntlrDatatypeRuleToken this_InterfaceTypeName_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1204:2: ( ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName ) )
            // InternalMyDsl.g:1205:2: ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName )
            {
            // InternalMyDsl.g:1205:2: ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ANY_OTHER||LA19_1==24) ) {
                    alt19=2;
                }
                else if ( (LA19_1==26) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1206:3: (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature )
                    {
                    // InternalMyDsl.g:1206:3: (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature )
                    // InternalMyDsl.g:1207:4: this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getMethodNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_MethodName_0=ruleMethodName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MethodName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getSignatureParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Signature_1=ruleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Signature_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1229:3: this_InterfaceTypeName_2= ruleInterfaceTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMethodSpecAccess().getInterfaceTypeNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InterfaceTypeName_2=ruleInterfaceTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_InterfaceTypeName_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodSpec"


    // $ANTLR start "entryRuleMethodName"
    // InternalMyDsl.g:1243:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalMyDsl.g:1243:50: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalMyDsl.g:1244:2: iv_ruleMethodName= ruleMethodName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // InternalMyDsl.g:1250:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1256:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:1257:2: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_IDENTIFIER_0, grammarAccess.getMethodNameAccess().getIDENTIFIERTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleInterfaceTypeName"
    // InternalMyDsl.g:1267:1: entryRuleInterfaceTypeName returns [String current=null] : iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF ;
    public final String entryRuleInterfaceTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceTypeName = null;


        try {
            // InternalMyDsl.g:1267:57: (iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF )
            // InternalMyDsl.g:1268:2: iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceTypeNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceTypeName=ruleInterfaceTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceTypeName"


    // $ANTLR start "ruleInterfaceTypeName"
    // InternalMyDsl.g:1274:1: ruleInterfaceTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypeName_0= ruleTypeName ;
    public final AntlrDatatypeRuleToken ruleInterfaceTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeName_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1280:2: (this_TypeName_0= ruleTypeName )
            // InternalMyDsl.g:1281:2: this_TypeName_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInterfaceTypeNameAccess().getTypeNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_TypeName_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceTypeName"


    // $ANTLR start "entryRuleMapType"
    // InternalMyDsl.g:1294:1: entryRuleMapType returns [String current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final String entryRuleMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapType = null;


        try {
            // InternalMyDsl.g:1294:47: (iv_ruleMapType= ruleMapType EOF )
            // InternalMyDsl.g:1295:2: iv_ruleMapType= ruleMapType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapType=ruleMapType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // InternalMyDsl.g:1301:1: ruleMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'map' kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType ) ;
    public final AntlrDatatypeRuleToken ruleMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_KeyType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1307:2: ( (kw= 'map' kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType ) )
            // InternalMyDsl.g:1308:2: (kw= 'map' kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType )
            {
            // InternalMyDsl.g:1308:2: (kw= 'map' kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType )
            // InternalMyDsl.g:1309:3: kw= 'map' kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType
            {
            kw=(Token)match(input,39,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getMapKeyword_0());
              		
            }
            kw=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_13);
            this_KeyType_2=ruleKeyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_KeyType_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getRightSquareBracketKeyword_3());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getElementTypeParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_ElementType_4=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ElementType_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleKeyType"
    // InternalMyDsl.g:1348:1: entryRuleKeyType returns [String current=null] : iv_ruleKeyType= ruleKeyType EOF ;
    public final String entryRuleKeyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyType = null;


        try {
            // InternalMyDsl.g:1348:47: (iv_ruleKeyType= ruleKeyType EOF )
            // InternalMyDsl.g:1349:2: iv_ruleKeyType= ruleKeyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyType=ruleKeyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyType"


    // $ANTLR start "ruleKeyType"
    // InternalMyDsl.g:1355:1: ruleKeyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleKeyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1361:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:1362:2: this_Type_0= ruleType
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getKeyTypeAccess().getTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Type_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyType"


    // $ANTLR start "entryRuleChannelType"
    // InternalMyDsl.g:1375:1: entryRuleChannelType returns [String current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final String entryRuleChannelType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannelType = null;


        try {
            // InternalMyDsl.g:1375:51: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalMyDsl.g:1376:2: iv_ruleChannelType= ruleChannelType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannelType=ruleChannelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannelType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannelType"


    // $ANTLR start "ruleChannelType"
    // InternalMyDsl.g:1382:1: ruleChannelType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' kw= 'chan' ) ) this_ElementType_4= ruleElementType ) ;
    public final AntlrDatatypeRuleToken ruleChannelType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ChannelTypeLinha_1 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1388:2: ( ( ( (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' kw= 'chan' ) ) this_ElementType_4= ruleElementType ) )
            // InternalMyDsl.g:1389:2: ( ( (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' kw= 'chan' ) ) this_ElementType_4= ruleElementType )
            {
            // InternalMyDsl.g:1389:2: ( ( (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' kw= 'chan' ) ) this_ElementType_4= ruleElementType )
            // InternalMyDsl.g:1390:3: ( (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' kw= 'chan' ) ) this_ElementType_4= ruleElementType
            {
            // InternalMyDsl.g:1390:3: ( (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' kw= 'chan' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1391:4: (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha )
                    {
                    // InternalMyDsl.g:1391:4: (kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha )
                    // InternalMyDsl.g:1392:5: kw= 'chan' this_ChannelTypeLinha_1= ruleChannelTypeLinha
                    {
                    kw=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getChanKeyword_0_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChannelTypeAccess().getChannelTypeLinhaParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    this_ChannelTypeLinha_1=ruleChannelTypeLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ChannelTypeLinha_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1409:4: (kw= '<-' kw= 'chan' )
                    {
                    // InternalMyDsl.g:1409:4: (kw= '<-' kw= 'chan' )
                    // InternalMyDsl.g:1410:5: kw= '<-' kw= 'chan'
                    {
                    kw=(Token)match(input,41,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_0());
                      				
                    }
                    kw=(Token)match(input,40,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getChanKeyword_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getChannelTypeAccess().getElementTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_ElementType_4=ruleElementType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ElementType_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelType"


    // $ANTLR start "entryRuleChannelTypeLinha"
    // InternalMyDsl.g:1436:1: entryRuleChannelTypeLinha returns [String current=null] : iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF ;
    public final String entryRuleChannelTypeLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannelTypeLinha = null;


        try {
            // InternalMyDsl.g:1436:56: (iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF )
            // InternalMyDsl.g:1437:2: iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelTypeLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannelTypeLinha=ruleChannelTypeLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannelTypeLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannelTypeLinha"


    // $ANTLR start "ruleChannelTypeLinha"
    // InternalMyDsl.g:1443:1: ruleChannelTypeLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleChannelTypeLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ANY_OTHER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1449:2: ( (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:1450:2: (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:1450:2: (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ANY_OTHER) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1451:3: kw= '<-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getChannelTypeLinhaAccess().getLessThanSignHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1457:3: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_1, grammarAccess.getChannelTypeLinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannelTypeLinha"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:1468:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:1468:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1469:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:1475:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnaryExpr_0 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1481:2: ( (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha ) )
            // InternalMyDsl.g:1482:2: (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha )
            {
            // InternalMyDsl.g:1482:2: (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha )
            // InternalMyDsl.g:1483:3: this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_28);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_UnaryExpr_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getExpression_LinhaParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_Linha_1=ruleExpression_Linha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_Linha_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_Linha"
    // InternalMyDsl.g:1507:1: entryRuleExpression_Linha returns [String current=null] : iv_ruleExpression_Linha= ruleExpression_Linha EOF ;
    public final String entryRuleExpression_Linha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_Linha = null;


        try {
            // InternalMyDsl.g:1507:56: (iv_ruleExpression_Linha= ruleExpression_Linha EOF )
            // InternalMyDsl.g:1508:2: iv_ruleExpression_Linha= ruleExpression_Linha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_LinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Linha=ruleExpression_Linha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Linha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Linha"


    // $ANTLR start "ruleExpression_Linha"
    // InternalMyDsl.g:1514:1: ruleExpression_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) ;
    public final AntlrDatatypeRuleToken ruleExpression_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_binary_op_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1520:2: ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) )
            // InternalMyDsl.g:1521:2: (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
            {
            // InternalMyDsl.g:1521:2: (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
            // InternalMyDsl.g:1522:3: this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression_LinhaAccess().getBinary_opParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
            this_binary_op_0=rulebinary_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_binary_op_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression_LinhaAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_28);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression_LinhaAccess().getExpression_LinhaParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_Linha_2=ruleExpression_Linha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_Linha_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Linha"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMyDsl.g:1556:1: entryRuleUnaryExpr returns [String current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final String entryRuleUnaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpr = null;


        try {
            // InternalMyDsl.g:1556:49: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMyDsl.g:1557:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalMyDsl.g:1563:1: ruleUnaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNARY_OP_1=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_0 = null;

        AntlrDatatypeRuleToken this_UnaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1569:2: ( (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) )
            // InternalMyDsl.g:1570:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            {
            // InternalMyDsl.g:1570:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DECIMAL_DIGITS||LA22_0==RULE_IDENTIFIER||LA22_0==RULE_STRING_LIT||LA22_0==RULE_INT_LITERAL||LA22_0==24||LA22_0==26||LA22_0==28||LA22_0==30||(LA22_0>=34 && LA22_0<=35)||(LA22_0>=37 && LA22_0<=41)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_UNARY_OP) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1571:3: this_PrimaryExpr_0= rulePrimaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryExprAccess().getPrimaryExprParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr_0=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExpr_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1582:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    {
                    // InternalMyDsl.g:1582:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    // InternalMyDsl.g:1583:4: this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr
                    {
                    this_UNARY_OP_1=(Token)match(input,RULE_UNARY_OP,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UNARY_OP_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_UNARY_OP_1, grammarAccess.getUnaryExprAccess().getUNARY_OPTerminalRuleCall_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnaryExprAccess().getUnaryExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_UnaryExpr_2=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UnaryExpr_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulebinary_op"
    // InternalMyDsl.g:1605:1: entryRulebinary_op returns [String current=null] : iv_rulebinary_op= rulebinary_op EOF ;
    public final String entryRulebinary_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebinary_op = null;


        try {
            // InternalMyDsl.g:1605:49: (iv_rulebinary_op= rulebinary_op EOF )
            // InternalMyDsl.g:1606:2: iv_rulebinary_op= rulebinary_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinary_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebinary_op=rulebinary_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebinary_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebinary_op"


    // $ANTLR start "rulebinary_op"
    // InternalMyDsl.g:1612:1: rulebinary_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) ;
    public final AntlrDatatypeRuleToken rulebinary_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REL_OP_2=null;
        Token this_ADD_OP_3=null;
        Token this_MUL_OP_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1618:2: ( (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) )
            // InternalMyDsl.g:1619:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            {
            // InternalMyDsl.g:1619:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case RULE_REL_OP:
                {
                alt23=3;
                }
                break;
            case RULE_ADD_OP:
                {
                alt23=4;
                }
                break;
            case RULE_MUL_OP:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1620:3: kw= '||'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1626:3: kw= '&&'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getAmpersandAmpersandKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1632:3: this_REL_OP_2= RULE_REL_OP
                    {
                    this_REL_OP_2=(Token)match(input,RULE_REL_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REL_OP_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REL_OP_2, grammarAccess.getBinary_opAccess().getREL_OPTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1640:3: this_ADD_OP_3= RULE_ADD_OP
                    {
                    this_ADD_OP_3=(Token)match(input,RULE_ADD_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ADD_OP_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ADD_OP_3, grammarAccess.getBinary_opAccess().getADD_OPTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1648:3: this_MUL_OP_4= RULE_MUL_OP
                    {
                    this_MUL_OP_4=(Token)match(input,RULE_MUL_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MUL_OP_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MUL_OP_4, grammarAccess.getBinary_opAccess().getMUL_OPTerminalRuleCall_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebinary_op"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalMyDsl.g:1659:1: entryRulePrimaryExpr returns [String current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final String entryRulePrimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr = null;


        try {
            // InternalMyDsl.g:1659:51: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMyDsl.g:1660:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalMyDsl.g:1666:1: rulePrimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BasicLit_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_1 = null;

        AntlrDatatypeRuleToken this_StructType_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFatFatFatFat_3 = null;

        AntlrDatatypeRuleToken this_MapType_4 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFatFatFatFat_5 = null;

        AntlrDatatypeRuleToken this_Signature_7 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFatFatFatFatFat_8 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_9 = null;

        AntlrDatatypeRuleToken this_ElementType_12 = null;

        AntlrDatatypeRuleToken this_LiteralValue_13 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_14 = null;

        AntlrDatatypeRuleToken this_Name_15 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFatFatFat_16 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_17 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFatFat_19 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_20 = null;

        AntlrDatatypeRuleToken this_TypeLitLinha_22 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFatFatFatFatFatFat_23 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_24 = null;

        AntlrDatatypeRuleToken this_PointerType_25 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_26 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_27 = null;

        AntlrDatatypeRuleToken this_InterfaceType_28 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_29 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_30 = null;

        AntlrDatatypeRuleToken this_ChannelType_31 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_32 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_33 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1672:2: ( ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:1673:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:1673:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) )
            int alt24=11;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGITS:
            case RULE_STRING_LIT:
            case RULE_INT_LITERAL:
            case 24:
                {
                alt24=1;
                }
                break;
            case 30:
                {
                alt24=2;
                }
                break;
            case 39:
                {
                alt24=3;
                }
                break;
            case 35:
                {
                alt24=4;
                }
                break;
            case 37:
                {
                alt24=5;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt24=6;
                }
                break;
            case 26:
                {
                alt24=7;
                }
                break;
            case 28:
                {
                alt24=8;
                }
                break;
            case 34:
                {
                alt24=9;
                }
                break;
            case 38:
                {
                alt24=10;
                }
                break;
            case 40:
            case 41:
                {
                alt24=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1674:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1674:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1675:4: this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getBasicLitParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_BasicLit_0=ruleBasicLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BasicLit_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_1=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1697:3: (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat )
                    {
                    // InternalMyDsl.g:1697:3: (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat )
                    // InternalMyDsl.g:1698:4: this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getStructTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_StructType_2=ruleStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_StructType_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatFatFatParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFatFatFatFat_3=rulePrimaryExprFatFatFatFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFatFatFatFat_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1720:3: (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat )
                    {
                    // InternalMyDsl.g:1720:3: (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat )
                    // InternalMyDsl.g:1721:4: this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getMapTypeParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_MapType_4=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MapType_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatFatFatParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFatFatFatFat_5=rulePrimaryExprFatFatFatFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFatFatFatFat_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1743:3: (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1743:3: (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1744:4: kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getFuncKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getSignatureParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_Signature_7=ruleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Signature_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatFatFatFatParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFatFatFatFatFat_8=rulePrimaryExprFatFatFatFatFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFatFatFatFatFat_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_9=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1781:3: (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1781:3: (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1782:4: kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getFullStopFullStopFullStopKeyword_4_0());
                      			
                    }
                    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getRightSquareBracketKeyword_4_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getElementTypeParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_ElementType_12=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_12);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getLiteralValueParserRuleCall_4_3());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_LiteralValue_13=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LiteralValue_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_4_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_14=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_14);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1824:3: (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1824:3: (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1825:4: this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getNameParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
                    this_Name_15=ruleName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Name_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatFatParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFatFatFat_16=rulePrimaryExprFatFatFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFatFatFat_16);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_5_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_17=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1857:3: (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1857:3: (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1858:4: kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,26,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFatFat_19=rulePrimaryExprFatFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFatFat_19);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_6_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_20=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_20);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1885:3: (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1885:3: (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1886:4: kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftSquareBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getTypeLitLinhaParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_TypeLitLinha_22=ruleTypeLitLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeLitLinha_22);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatFatFatFatFatParserRuleCall_7_2());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFatFatFatFatFatFat_23=rulePrimaryExprFatFatFatFatFatFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFatFatFatFatFatFat_23);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_7_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_24=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_24);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1923:3: (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1923:3: (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1924:4: this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPointerTypeParserRuleCall_8_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_PointerType_25=rulePointerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PointerType_25);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFat_26=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFat_26);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_8_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_27=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_27);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1956:3: (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1956:3: (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1957:4: this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getInterfaceTypeParserRuleCall_9_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_InterfaceType_28=ruleInterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_InterfaceType_28);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatParserRuleCall_9_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFat_29=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFat_29);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_9_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_30=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_30);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1989:3: (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1989:3: (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1990:4: this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getChannelTypeParserRuleCall_10_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_ChannelType_31=ruleChannelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ChannelType_31);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatParserRuleCall_10_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprFat_32=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFat_32);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_10_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_33=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_33);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRulePrimaryExprFatFatFatFatFatFat"
    // InternalMyDsl.g:2025:1: entryRulePrimaryExprFatFatFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2025:69: (iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF )
            // InternalMyDsl.g:2026:2: iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatFatFatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprFatFatFatFatFatFat=rulePrimaryExprFatFatFatFatFatFat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprFatFatFatFatFatFat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprFatFatFatFatFatFat"


    // $ANTLR start "rulePrimaryExprFatFatFatFatFatFat"
    // InternalMyDsl.g:2032:1: rulePrimaryExprFatFatFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2038:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2039:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2039:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            else if ( (LA25_0==24||LA25_0==26) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2040:3: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatFatFatAccess().getLiteralValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralValue_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2051:3: this_PrimaryExprFat_1= rulePrimaryExprFat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatFatFatAccess().getPrimaryExprFatParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFat_1=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExprFat_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprFatFatFatFatFatFat"


    // $ANTLR start "entryRulePrimaryExprFatFatFatFatFat"
    // InternalMyDsl.g:2065:1: entryRulePrimaryExprFatFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2065:66: (iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF )
            // InternalMyDsl.g:2066:2: iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatFatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprFatFatFatFatFat=rulePrimaryExprFatFatFatFatFat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprFatFatFatFatFat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprFatFatFatFatFat"


    // $ANTLR start "rulePrimaryExprFatFatFatFatFat"
    // InternalMyDsl.g:2072:1: rulePrimaryExprFatFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FunctionBody_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2078:2: ( (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2079:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2079:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            else if ( (LA26_0==24||LA26_0==26) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2080:3: this_FunctionBody_0= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatFatAccess().getFunctionBodyParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionBody_0=ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FunctionBody_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2091:3: this_PrimaryExprFat_1= rulePrimaryExprFat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatFatAccess().getPrimaryExprFatParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFat_1=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExprFat_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprFatFatFatFatFat"


    // $ANTLR start "entryRulePrimaryExprFatFatFatFat"
    // InternalMyDsl.g:2105:1: entryRulePrimaryExprFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2105:63: (iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF )
            // InternalMyDsl.g:2106:2: iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprFatFatFatFat=rulePrimaryExprFatFatFatFat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprFatFatFatFat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprFatFatFatFat"


    // $ANTLR start "rulePrimaryExprFatFatFatFat"
    // InternalMyDsl.g:2112:1: rulePrimaryExprFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2118:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2119:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2119:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            else if ( (LA27_0==24||LA27_0==26) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2120:3: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatAccess().getLiteralValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralValue_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2131:3: this_PrimaryExprFat_1= rulePrimaryExprFat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatFatAccess().getPrimaryExprFatParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFat_1=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExprFat_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprFatFatFatFat"


    // $ANTLR start "entryRulePrimaryExprFatFatFat"
    // InternalMyDsl.g:2145:1: entryRulePrimaryExprFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFat = null;


        try {
            // InternalMyDsl.g:2145:60: (iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF )
            // InternalMyDsl.g:2146:2: iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprFatFatFatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprFatFatFat=rulePrimaryExprFatFatFat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprFatFatFat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprFatFatFat"


    // $ANTLR start "rulePrimaryExprFatFatFat"
    // InternalMyDsl.g:2152:1: rulePrimaryExprFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2158:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2159:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2159:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt28=1;
                }
                break;
            case 24:
            case 26:
                {
                alt28=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2160:3: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatAccess().getLiteralValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_0=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralValue_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2171:3: this_PrimaryExprFat_1= rulePrimaryExprFat
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprFatFatFatAccess().getPrimaryExprFatParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFat_1=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExprFat_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2182:3: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_2, grammarAccess.getPrimaryExprFatFatFatAccess().getANY_OTHERTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprFatFatFat"


    // $ANTLR start "entryRuleName"
    // InternalMyDsl.g:2193:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMyDsl.g:2193:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:2194:2: iv_ruleName= ruleName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalMyDsl.g:2200:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_NameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2206:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha ) )
            // InternalMyDsl.g:2207:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha )
            {
            // InternalMyDsl.g:2207:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha )
            // InternalMyDsl.g:2208:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getNameAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNameAccess().getNameLinhaParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_NameLinha_1=ruleNameLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NameLinha_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleNameLinha"
    // InternalMyDsl.g:2229:1: entryRuleNameLinha returns [String current=null] : iv_ruleNameLinha= ruleNameLinha EOF ;
    public final String entryRuleNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameLinha = null;


        try {
            // InternalMyDsl.g:2229:49: (iv_ruleNameLinha= ruleNameLinha EOF )
            // InternalMyDsl.g:2230:2: iv_ruleNameLinha= ruleNameLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameLinha=ruleNameLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameLinha"


    // $ANTLR start "ruleNameLinha"
    // InternalMyDsl.g:2236:1: ruleNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2242:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2243:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2243:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ANY_OTHER) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2244:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:2244:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:2245:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNameLinhaAccess().getFullStopKeyword_0_0());
                      			
                    }
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getNameLinhaAccess().getIDENTIFIERTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2259:3: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_2, grammarAccess.getNameLinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameLinha"


    // $ANTLR start "entryRulePrimaryExprFatFat"
    // InternalMyDsl.g:2270:1: entryRulePrimaryExprFatFat returns [String current=null] : iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF ;
    public final String entryRulePrimaryExprFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFat = null;


        try {
            // InternalMyDsl.g:2270:57: (iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF )
            // InternalMyDsl.g:2271:2: iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprFatFatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprFatFat=rulePrimaryExprFatFat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprFatFat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprFatFat"


    // $ANTLR start "rulePrimaryExprFatFat"
    // InternalMyDsl.g:2277:1: rulePrimaryExprFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2283:2: ( ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) ) )
            // InternalMyDsl.g:2284:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )
            {
            // InternalMyDsl.g:2284:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2285:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    {
                    // InternalMyDsl.g:2285:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    // InternalMyDsl.g:2286:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')'
                    {
                    // InternalMyDsl.g:2286:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression )
                    // InternalMyDsl.g:2287:5: ( ruleExpression )=>this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryExprFatFatAccess().getExpressionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatFatAccess().getRightParenthesisKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2306:3: (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat )
                    {
                    // InternalMyDsl.g:2306:3: (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat )
                    // InternalMyDsl.g:2307:4: this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprFatFatAccess().getTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Type_2=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,27,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatFatAccess().getRightParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprFatFatAccess().getPrimaryExprFatParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprFat_4=rulePrimaryExprFat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprFat_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprFatFat"


    // $ANTLR start "entryRulePrimaryExprFat"
    // InternalMyDsl.g:2337:1: entryRulePrimaryExprFat returns [String current=null] : iv_rulePrimaryExprFat= rulePrimaryExprFat EOF ;
    public final String entryRulePrimaryExprFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFat = null;


        try {
            // InternalMyDsl.g:2337:54: (iv_rulePrimaryExprFat= rulePrimaryExprFat EOF )
            // InternalMyDsl.g:2338:2: iv_rulePrimaryExprFat= rulePrimaryExprFat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprFatRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprFat=rulePrimaryExprFat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprFat.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprFat"


    // $ANTLR start "rulePrimaryExprFat"
    // InternalMyDsl.g:2344:1: rulePrimaryExprFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_MethodName_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2350:2: ( ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) )
            // InternalMyDsl.g:2351:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            {
            // InternalMyDsl.g:2351:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            else if ( (LA32_0==24) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2352:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    {
                    // InternalMyDsl.g:2352:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    // InternalMyDsl.g:2353:4: kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprFatAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_21);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:2368:4: (kw= ',' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==36) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyDsl.g:2369:5: kw= ','
                            {
                            kw=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getCommaKeyword_0_2());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2382:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    {
                    // InternalMyDsl.g:2382:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    // InternalMyDsl.g:2383:4: kw= '.' this_MethodName_5= ruleMethodName
                    {
                    kw=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getFullStopKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprFatAccess().getMethodNameParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodName_5=ruleMethodName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MethodName_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprFat"


    // $ANTLR start "entryRulePrimaryExprLinha"
    // InternalMyDsl.g:2403:1: entryRulePrimaryExprLinha returns [String current=null] : iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF ;
    public final String entryRulePrimaryExprLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha = null;


        try {
            // InternalMyDsl.g:2403:56: (iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF )
            // InternalMyDsl.g:2404:2: iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha=rulePrimaryExprLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha"


    // $ANTLR start "rulePrimaryExprLinha"
    // InternalMyDsl.g:2410:1: rulePrimaryExprLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PrimaryExprLinhaLinha_1 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinhaLinhaLinha_4 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_5 = null;

        AntlrDatatypeRuleToken this_Arguments_6 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2416:2: ( ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:2417:2: ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:2417:2: ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt33=1;
                }
                break;
            case 28:
                {
                alt33=2;
                }
                break;
            case 26:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2418:3: (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2418:3: (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2419:4: kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,24,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getFullStopKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprLinhaLinha_1=rulePrimaryExprLinhaLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinhaLinha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_2=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2446:3: (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2446:3: (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2447:4: kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,28,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaLinhaLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_PrimaryExprLinhaLinhaLinha_4=rulePrimaryExprLinhaLinhaLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinhaLinhaLinha_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_5=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2474:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2474:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2475:4: this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getArgumentsParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_Arguments_6=ruleArguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Arguments_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_7=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprLinha"


    // $ANTLR start "entryRulePrimaryExprLinhaLinha"
    // InternalMyDsl.g:2500:1: entryRulePrimaryExprLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinha = null;


        try {
            // InternalMyDsl.g:2500:61: (iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF )
            // InternalMyDsl.g:2501:2: iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinhaLinha=rulePrimaryExprLinhaLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinhaLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinhaLinha"


    // $ANTLR start "rulePrimaryExprLinhaLinha"
    // InternalMyDsl.g:2507:1: rulePrimaryExprLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2513:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:2514:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:2514:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_IDENTIFIER) ) {
                alt34=1;
            }
            else if ( (LA34_0==26) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2515:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getPrimaryExprLinhaLinhaAccess().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2523:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:2523:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    // InternalMyDsl.g:2524:4: kw= '(' this_Type_2= ruleType kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaAccess().getTypeParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
                    this_Type_2=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprLinhaLinha"


    // $ANTLR start "entryRulePrimaryExprLinhaLinhaLinha"
    // InternalMyDsl.g:2549:1: entryRulePrimaryExprLinhaLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinhaLinha = null;


        try {
            // InternalMyDsl.g:2549:66: (iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF )
            // InternalMyDsl.g:2550:2: iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinhaLinhaLinha=rulePrimaryExprLinhaLinhaLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinhaLinhaLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinhaLinhaLinha"


    // $ANTLR start "rulePrimaryExprLinhaLinhaLinha"
    // InternalMyDsl.g:2556:1: rulePrimaryExprLinhaLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinhaLinhaLinhaLinha_1 = null;

        AntlrDatatypeRuleToken this_SliceLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2562:2: ( ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) ) )
            // InternalMyDsl.g:2563:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) )
            {
            // InternalMyDsl.g:2563:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DECIMAL_DIGITS||LA35_0==RULE_IDENTIFIER||(LA35_0>=RULE_STRING_LIT && LA35_0<=RULE_UNARY_OP)||LA35_0==RULE_INT_LITERAL||LA35_0==24||LA35_0==26||LA35_0==28||LA35_0==30||(LA35_0>=34 && LA35_0<=35)||(LA35_0>=37 && LA35_0<=41)) ) {
                alt35=1;
            }
            else if ( (LA35_0==44) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2564:3: (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha )
                    {
                    // InternalMyDsl.g:2564:3: (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha )
                    // InternalMyDsl.g:2565:4: this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_35);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaAccess().getPrimaryExprLinhaLinhaLinhaLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinhaLinhaLinhaLinha_1=rulePrimaryExprLinhaLinhaLinhaLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinhaLinhaLinhaLinha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2587:3: (kw= ':' this_SliceLinha_3= ruleSliceLinha )
                    {
                    // InternalMyDsl.g:2587:3: (kw= ':' this_SliceLinha_3= ruleSliceLinha )
                    // InternalMyDsl.g:2588:4: kw= ':' this_SliceLinha_3= ruleSliceLinha
                    {
                    kw=(Token)match(input,44,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaLinhaAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaAccess().getSliceLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SliceLinha_3=ruleSliceLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SliceLinha_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprLinhaLinhaLinha"


    // $ANTLR start "entryRulePrimaryExprLinhaLinhaLinhaLinha"
    // InternalMyDsl.g:2608:1: entryRulePrimaryExprLinhaLinhaLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinhaLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinhaLinhaLinha = null;


        try {
            // InternalMyDsl.g:2608:71: (iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF )
            // InternalMyDsl.g:2609:2: iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinhaLinhaLinhaLinha=rulePrimaryExprLinhaLinhaLinhaLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinhaLinhaLinhaLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinhaLinhaLinhaLinha"


    // $ANTLR start "rulePrimaryExprLinhaLinhaLinhaLinha"
    // InternalMyDsl.g:2615:1: rulePrimaryExprLinhaLinhaLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinhaLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SliceLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2621:2: ( (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) ) )
            // InternalMyDsl.g:2622:2: (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) )
            {
            // InternalMyDsl.g:2622:2: (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2623:3: kw= ']'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaLinhaLinhaAccess().getRightSquareBracketKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2629:3: (kw= ':' this_SliceLinha_2= ruleSliceLinha )
                    {
                    // InternalMyDsl.g:2629:3: (kw= ':' this_SliceLinha_2= ruleSliceLinha )
                    // InternalMyDsl.g:2630:4: kw= ':' this_SliceLinha_2= ruleSliceLinha
                    {
                    kw=(Token)match(input,44,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaLinhaLinhaAccess().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaLinhaAccess().getSliceLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SliceLinha_2=ruleSliceLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SliceLinha_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExprLinhaLinhaLinhaLinha"


    // $ANTLR start "entryRuleSliceLinha"
    // InternalMyDsl.g:2650:1: entryRuleSliceLinha returns [String current=null] : iv_ruleSliceLinha= ruleSliceLinha EOF ;
    public final String entryRuleSliceLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSliceLinha = null;


        try {
            // InternalMyDsl.g:2650:50: (iv_ruleSliceLinha= ruleSliceLinha EOF )
            // InternalMyDsl.g:2651:2: iv_ruleSliceLinha= ruleSliceLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSliceLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSliceLinha=ruleSliceLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSliceLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSliceLinha"


    // $ANTLR start "ruleSliceLinha"
    // InternalMyDsl.g:2657:1: ruleSliceLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleSliceLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2663:2: ( ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) ) )
            // InternalMyDsl.g:2664:2: ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) )
            {
            // InternalMyDsl.g:2664:2: ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_DECIMAL_DIGITS||LA38_0==RULE_IDENTIFIER||(LA38_0>=RULE_STRING_LIT && LA38_0<=RULE_UNARY_OP)||LA38_0==RULE_INT_LITERAL||LA38_0==24||LA38_0==26||LA38_0==28||LA38_0==30||(LA38_0>=34 && LA38_0<=35)||(LA38_0>=37 && LA38_0<=41)) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2665:3: (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' )
                    {
                    // InternalMyDsl.g:2665:3: (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' )
                    // InternalMyDsl.g:2666:4: kw= ':' (this_Expression_1= ruleExpression )? kw= ']'
                    {
                    kw=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getColonKeyword_0_0());
                      			
                    }
                    // InternalMyDsl.g:2671:4: (this_Expression_1= ruleExpression )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_DECIMAL_DIGITS||LA37_0==RULE_IDENTIFIER||(LA37_0>=RULE_STRING_LIT && LA37_0<=RULE_UNARY_OP)||LA37_0==RULE_INT_LITERAL||LA37_0==24||LA37_0==26||LA37_0==28||LA37_0==30||(LA37_0>=34 && LA37_0<=35)||(LA37_0>=37 && LA37_0<=41)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMyDsl.g:2672:5: this_Expression_1= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getSliceLinhaAccess().getExpressionParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_13);
                            this_Expression_1=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Expression_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2690:3: (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' )
                    {
                    // InternalMyDsl.g:2690:3: (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' )
                    // InternalMyDsl.g:2691:4: this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSliceLinhaAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_36);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getColonKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSliceLinhaAccess().getExpressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_13);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSliceLinha"


    // $ANTLR start "entryRuleArguments"
    // InternalMyDsl.g:2726:1: entryRuleArguments returns [String current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final String entryRuleArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArguments = null;


        try {
            // InternalMyDsl.g:2726:49: (iv_ruleArguments= ruleArguments EOF )
            // InternalMyDsl.g:2727:2: iv_ruleArguments= ruleArguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArguments.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalMyDsl.g:2733:1: ruleArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_ExpressionList_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2739:2: ( (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:2740:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:2740:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:2741:3: kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,26,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:2746:3: ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DECIMAL_DIGITS||LA43_0==RULE_IDENTIFIER||(LA43_0>=RULE_STRING_LIT && LA43_0<=RULE_UNARY_OP)||LA43_0==RULE_INT_LITERAL||LA43_0==24||LA43_0==26||LA43_0==28||LA43_0==30||(LA43_0>=34 && LA43_0<=35)||(LA43_0>=37 && LA43_0<=41)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2747:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )?
                    {
                    // InternalMyDsl.g:2747:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )
                    int alt40=2;
                    alt40 = dfa40.predict(input);
                    switch (alt40) {
                        case 1 :
                            // InternalMyDsl.g:2748:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            {
                            // InternalMyDsl.g:2748:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            // InternalMyDsl.g:2749:6: ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_0());
                              					
                            }
                            pushFollow(FOLLOW_38);
                            this_ExpressionList_1=ruleExpressionList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_ExpressionList_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:2762:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            {
                            // InternalMyDsl.g:2762:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            // InternalMyDsl.g:2763:6: this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getTypeParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_38);
                            this_Type_2=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_Type_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalMyDsl.g:2773:6: (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==36) ) {
                                int LA39_1 = input.LA(2);

                                if ( (LA39_1==RULE_DECIMAL_DIGITS||LA39_1==RULE_IDENTIFIER||(LA39_1>=RULE_STRING_LIT && LA39_1<=RULE_UNARY_OP)||LA39_1==RULE_INT_LITERAL||LA39_1==24||LA39_1==26||LA39_1==28||LA39_1==30||(LA39_1>=34 && LA39_1<=35)||(LA39_1>=37 && LA39_1<=41)) ) {
                                    alt39=1;
                                }
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalMyDsl.g:2774:7: kw= ',' this_ExpressionList_4= ruleExpressionList
                                    {
                                    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current.merge(kw);
                                      							newLeafNode(kw, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0_1_1_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_1_1_1());
                                      						
                                    }
                                    pushFollow(FOLLOW_38);
                                    this_ExpressionList_4=ruleExpressionList();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current.merge(this_ExpressionList_4);
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							afterParserOrEnumRuleCall();
                                      						
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:2792:4: (kw= '...' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==37) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:2793:5: kw= '...'
                            {
                            kw=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyDsl.g:2799:4: (kw= ',' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==36) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMyDsl.g:2800:5: kw= ','
                            {
                            kw=(Token)match(input,36,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getCommaKeyword_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpressionList"
    // InternalMyDsl.g:2816:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            // InternalMyDsl.g:2816:54: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMyDsl.g:2817:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // InternalMyDsl.g:2823:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2829:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalMyDsl.g:2830:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalMyDsl.g:2830:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalMyDsl.g:2831:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:2841:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==36) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==RULE_DECIMAL_DIGITS||LA44_2==RULE_IDENTIFIER||(LA44_2>=RULE_STRING_LIT && LA44_2<=RULE_UNARY_OP)||LA44_2==RULE_INT_LITERAL||LA44_2==24||LA44_2==26||LA44_2==28||LA44_2==30||(LA44_2>=34 && LA44_2<=35)||(LA44_2>=37 && LA44_2<=41)) ) {
                        alt44=1;
                    }


                }


                switch (alt44) {
            	case 1 :
            	    // InternalMyDsl.g:2842:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_22);
            	    this_Expression_2=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Expression_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleIdentifierList"
    // InternalMyDsl.g:2862:1: entryRuleIdentifierList returns [String current=null] : iv_ruleIdentifierList= ruleIdentifierList EOF ;
    public final String entryRuleIdentifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierList = null;


        try {
            // InternalMyDsl.g:2862:54: (iv_ruleIdentifierList= ruleIdentifierList EOF )
            // InternalMyDsl.g:2863:2: iv_ruleIdentifierList= ruleIdentifierList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifierList=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifierList"


    // $ANTLR start "ruleIdentifierList"
    // InternalMyDsl.g:2869:1: ruleIdentifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2875:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalMyDsl.g:2876:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalMyDsl.g:2876:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalMyDsl.g:2877:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:2884:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==36) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:2885:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifierListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifierList"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:2902:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:2902:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:2903:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:2909:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StatementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2915:2: ( (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) )
            // InternalMyDsl.g:2916:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            {
            // InternalMyDsl.g:2916:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            // InternalMyDsl.g:2917:3: kw= '{' this_StatementList_1= ruleStatementList kw= '}'
            {
            kw=(Token)match(input,31,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBlockAccess().getStatementListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_24);
            this_StatementList_1=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_StatementList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatementList"
    // InternalMyDsl.g:2941:1: entryRuleStatementList returns [String current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final String entryRuleStatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatementList = null;


        try {
            // InternalMyDsl.g:2941:53: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalMyDsl.g:2942:2: iv_ruleStatementList= ruleStatementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // InternalMyDsl.g:2948:1: ruleStatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Statement_0= ruleStatement kw= ';' )* ;
    public final AntlrDatatypeRuleToken ruleStatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2954:2: ( (this_Statement_0= ruleStatement kw= ';' )* )
            // InternalMyDsl.g:2955:2: (this_Statement_0= ruleStatement kw= ';' )*
            {
            // InternalMyDsl.g:2955:2: (this_Statement_0= ruleStatement kw= ';' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_DECIMAL_DIGITS||LA46_0==RULE_IDENTIFIER||(LA46_0>=RULE_STRING_LIT && LA46_0<=RULE_UNARY_OP)||LA46_0==RULE_INT_LITERAL||LA46_0==24||LA46_0==26||LA46_0==28||(LA46_0>=30 && LA46_0<=31)||(LA46_0>=34 && LA46_0<=35)||(LA46_0>=37 && LA46_0<=41)||(LA46_0>=45 && LA46_0<=46)||LA46_0==50||(LA46_0>=53 && LA46_0<=55)||(LA46_0>=57 && LA46_0<=62)||(LA46_0>=65 && LA46_0<=66)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:2956:3: this_Statement_0= ruleStatement kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStatementListAccess().getStatementParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_16);
            	    this_Statement_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Statement_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,32,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:2975:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:2975:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:2976:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:2982:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;

        AntlrDatatypeRuleToken this_LabeledStmt_1 = null;

        AntlrDatatypeRuleToken this_SimpleStmt_2 = null;

        AntlrDatatypeRuleToken this_GoStmt_3 = null;

        AntlrDatatypeRuleToken this_ReturnStmt_4 = null;

        AntlrDatatypeRuleToken this_BreakStmt_5 = null;

        AntlrDatatypeRuleToken this_ContinueStmt_6 = null;

        AntlrDatatypeRuleToken this_GotoStmt_7 = null;

        AntlrDatatypeRuleToken this_FallthroughStmt_8 = null;

        AntlrDatatypeRuleToken this_Block_9 = null;

        AntlrDatatypeRuleToken this_IfStmt_10 = null;

        AntlrDatatypeRuleToken this_SwitchStmt_11 = null;

        AntlrDatatypeRuleToken this_SelectStmt_12 = null;

        AntlrDatatypeRuleToken this_ForStmt_13 = null;

        AntlrDatatypeRuleToken this_DeferStmt_14 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2988:2: ( (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) )
            // InternalMyDsl.g:2989:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            {
            // InternalMyDsl.g:2989:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            int alt47=15;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2990:3: this_Declaration_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Declaration_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3001:3: this_LabeledStmt_1= ruleLabeledStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getLabeledStmtParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LabeledStmt_1=ruleLabeledStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LabeledStmt_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3012:3: this_SimpleStmt_2= ruleSimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSimpleStmtParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmt_2=ruleSimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SimpleStmt_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3023:3: this_GoStmt_3= ruleGoStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGoStmtParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GoStmt_3=ruleGoStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GoStmt_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3034:3: this_ReturnStmt_4= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getReturnStmtParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnStmt_4=ruleReturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ReturnStmt_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3045:3: this_BreakStmt_5= ruleBreakStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBreakStmtParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BreakStmt_5=ruleBreakStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BreakStmt_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3056:3: this_ContinueStmt_6= ruleContinueStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getContinueStmtParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ContinueStmt_6=ruleContinueStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ContinueStmt_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3067:3: this_GotoStmt_7= ruleGotoStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getGotoStmtParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GotoStmt_7=ruleGotoStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GotoStmt_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:3078:3: this_FallthroughStmt_8= ruleFallthroughStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getFallthroughStmtParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FallthroughStmt_8=ruleFallthroughStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FallthroughStmt_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:3089:3: this_Block_9= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_9=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Block_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:3100:3: this_IfStmt_10= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getIfStmtParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmt_10=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IfStmt_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:3111:3: this_SwitchStmt_11= ruleSwitchStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSwitchStmtParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchStmt_11=ruleSwitchStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SwitchStmt_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:3122:3: this_SelectStmt_12= ruleSelectStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getSelectStmtParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SelectStmt_12=ruleSelectStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SelectStmt_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:3133:3: this_ForStmt_13= ruleForStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getForStmtParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStmt_13=ruleForStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ForStmt_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:3144:3: this_DeferStmt_14= ruleDeferStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getDeferStmtParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DeferStmt_14=ruleDeferStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DeferStmt_14);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDeferStmt"
    // InternalMyDsl.g:3158:1: entryRuleDeferStmt returns [String current=null] : iv_ruleDeferStmt= ruleDeferStmt EOF ;
    public final String entryRuleDeferStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeferStmt = null;


        try {
            // InternalMyDsl.g:3158:49: (iv_ruleDeferStmt= ruleDeferStmt EOF )
            // InternalMyDsl.g:3159:2: iv_ruleDeferStmt= ruleDeferStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeferStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeferStmt=ruleDeferStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeferStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeferStmt"


    // $ANTLR start "ruleDeferStmt"
    // InternalMyDsl.g:3165:1: ruleDeferStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'defer' this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeferStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3171:2: ( (kw= 'defer' this_Expression_1= ruleExpression ) )
            // InternalMyDsl.g:3172:2: (kw= 'defer' this_Expression_1= ruleExpression )
            {
            // InternalMyDsl.g:3172:2: (kw= 'defer' this_Expression_1= ruleExpression )
            // InternalMyDsl.g:3173:3: kw= 'defer' this_Expression_1= ruleExpression
            {
            kw=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDeferStmtAccess().getDeferKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDeferStmtAccess().getExpressionParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeferStmt"


    // $ANTLR start "entryRuleForStmt"
    // InternalMyDsl.g:3192:1: entryRuleForStmt returns [String current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final String entryRuleForStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmt = null;


        try {
            // InternalMyDsl.g:3192:47: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMyDsl.g:3193:2: iv_ruleForStmt= ruleForStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalMyDsl.g:3199:1: ruleForStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleForStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_ForStmtLinha_2 = null;

        AntlrDatatypeRuleToken this_Block_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3205:2: ( (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock ) )
            // InternalMyDsl.g:3206:2: (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock )
            {
            // InternalMyDsl.g:3206:2: (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock )
            // InternalMyDsl.g:3207:3: kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock
            {
            kw=(Token)match(input,46,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            // InternalMyDsl.g:3212:3: (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DECIMAL_DIGITS||LA48_0==RULE_IDENTIFIER||(LA48_0>=RULE_STRING_LIT && LA48_0<=RULE_UNARY_OP)||LA48_0==RULE_INT_LITERAL||LA48_0==24||LA48_0==26||LA48_0==28||LA48_0==30||(LA48_0>=34 && LA48_0<=35)||(LA48_0>=37 && LA48_0<=41)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:3213:4: this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_42);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getForStmtLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_ForStmtLinha_2=ruleForStmtLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ForStmtLinha_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForStmtAccess().getBlockParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Block_3=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleForStmtLinha"
    // InternalMyDsl.g:3248:1: entryRuleForStmtLinha returns [String current=null] : iv_ruleForStmtLinha= ruleForStmtLinha EOF ;
    public final String entryRuleForStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmtLinha = null;


        try {
            // InternalMyDsl.g:3248:52: (iv_ruleForStmtLinha= ruleForStmtLinha EOF )
            // InternalMyDsl.g:3249:2: iv_ruleForStmtLinha= ruleForStmtLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStmtLinha=ruleForStmtLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStmtLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStmtLinha"


    // $ANTLR start "ruleForStmtLinha"
    // InternalMyDsl.g:3255:1: ruleForStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleForStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_1=null;
        Token kw=null;
        Token this_IDENTIFIER_3=null;
        Token this_IDENTIFIER_13=null;
        Token this_IDENTIFIER_15=null;
        Token this_ANY_OTHER_27=null;
        AntlrDatatypeRuleToken this_SimpleStmtLinha_0 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;

        AntlrDatatypeRuleToken this_Expression_7 = null;

        AntlrDatatypeRuleToken this_Condition_9 = null;

        AntlrDatatypeRuleToken this_Expression_11 = null;

        AntlrDatatypeRuleToken this_SimpleStmtLinha_12 = null;

        AntlrDatatypeRuleToken this_Expression_17 = null;

        AntlrDatatypeRuleToken this_Expression_19 = null;

        AntlrDatatypeRuleToken this_Expression_21 = null;

        AntlrDatatypeRuleToken this_IdentifierList_23 = null;

        AntlrDatatypeRuleToken this_Expression_26 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3261:2: ( ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:3262:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:3262:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_IDENTIFIER||(LA56_0>=RULE_ADD_OP && LA56_0<=RULE_MUL_OP)||LA56_0==36||LA56_0==41||(LA56_0>=63 && LA56_0<=64)) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_ANY_OTHER) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:3263:3: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression )
                    {
                    // InternalMyDsl.g:3263:3: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression )
                    // InternalMyDsl.g:3264:4: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression
                    {
                    // InternalMyDsl.g:3264:4: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=RULE_ADD_OP && LA51_0<=RULE_MUL_OP)||LA51_0==36||LA51_0==41||(LA51_0>=63 && LA51_0<=64)) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==RULE_IDENTIFIER) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalMyDsl.g:3265:5: this_SimpleStmtLinha_0= ruleSimpleStmtLinha
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getForStmtLinhaAccess().getSimpleStmtLinhaParserRuleCall_0_0_0());
                              				
                            }
                            pushFollow(FOLLOW_16);
                            this_SimpleStmtLinha_0=ruleSimpleStmtLinha();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_SimpleStmtLinha_0);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3276:5: ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) )
                            {
                            // InternalMyDsl.g:3276:5: ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) )
                            // InternalMyDsl.g:3277:6: (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* )
                            {
                            // InternalMyDsl.g:3277:6: (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* )
                            // InternalMyDsl.g:3278:7: this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )*
                            {
                            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_IDENTIFIER_1);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newLeafNode(this_IDENTIFIER_1, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_0_1_0_0());
                              						
                            }
                            // InternalMyDsl.g:3285:7: (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==36) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalMyDsl.g:3286:8: kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER
                            	    {
                            	    kw=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_0_1_0_1_0());
                            	      							
                            	    }
                            	    this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(this_IDENTIFIER_3);
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(this_IDENTIFIER_3, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_0_1_0_1_1());
                            	      							
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);


                            }

                            kw=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_0_1_1());
                              					
                            }
                            // InternalMyDsl.g:3305:6: (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* )
                            // InternalMyDsl.g:3306:7: this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )*
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_0_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_44);
                            this_Expression_5=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_Expression_5);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }
                            // InternalMyDsl.g:3316:7: (kw= ',' this_Expression_7= ruleExpression )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==36) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalMyDsl.g:3317:8: kw= ',' this_Expression_7= ruleExpression
                            	    {
                            	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_0_1_2_1_0());
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_0_1_2_1_1());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_44);
                            	    this_Expression_7=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(this_Expression_7);
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }


                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaAccess().getConditionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_Condition_9=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Condition_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,32,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_0_3());
                      			
                    }
                    // InternalMyDsl.g:3356:4: ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) )
                    int alt55=4;
                    alt55 = dfa55.predict(input);
                    switch (alt55) {
                        case 1 :
                            // InternalMyDsl.g:3357:5: (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha )
                            {
                            // InternalMyDsl.g:3357:5: (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha )
                            // InternalMyDsl.g:3358:6: this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_0_0());
                              					
                            }
                            pushFollow(FOLLOW_46);
                            this_Expression_11=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_Expression_11);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtLinhaAccess().getSimpleStmtLinhaParserRuleCall_0_4_0_1());
                              					
                            }
                            pushFollow(FOLLOW_47);
                            this_SimpleStmtLinha_12=ruleSimpleStmtLinha();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_SimpleStmtLinha_12);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3380:5: ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) )
                            {
                            // InternalMyDsl.g:3380:5: ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) )
                            // InternalMyDsl.g:3381:6: (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* )
                            {
                            // InternalMyDsl.g:3381:6: (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* )
                            // InternalMyDsl.g:3382:7: this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )*
                            {
                            this_IDENTIFIER_13=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_IDENTIFIER_13);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newLeafNode(this_IDENTIFIER_13, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_4_1_0_0());
                              						
                            }
                            // InternalMyDsl.g:3389:7: (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==36) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalMyDsl.g:3390:8: kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER
                            	    {
                            	    kw=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_4_1_0_1_0());
                            	      							
                            	    }
                            	    this_IDENTIFIER_15=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(this_IDENTIFIER_15);
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(this_IDENTIFIER_15, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_4_1_0_1_1());
                            	      							
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }

                            kw=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_4_1_1());
                              					
                            }
                            // InternalMyDsl.g:3409:6: (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* )
                            // InternalMyDsl.g:3410:7: this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )*
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_48);
                            this_Expression_17=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_Expression_17);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }
                            // InternalMyDsl.g:3420:7: (kw= ',' this_Expression_19= ruleExpression )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==36) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalMyDsl.g:3421:8: kw= ',' this_Expression_19= ruleExpression
                            	    {
                            	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_4_1_2_1_0());
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_1_2_1_1());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_48);
                            	    this_Expression_19=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(this_Expression_19);
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:3440:5: ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:3440:5: ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:3441:6: (kw= ',' this_Expression_21= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:3441:6: (kw= ',' this_Expression_21= ruleExpression )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==36) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalMyDsl.g:3442:7: kw= ',' this_Expression_21= ruleExpression
                            	    {
                            	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(kw);
                            	      							newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_4_2_0_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_2_0_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_49);
                            	    this_Expression_21=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(this_Expression_21);
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            kw=(Token)match(input,48,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getEqualsSignKeyword_0_4_2_1());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:3465:5: (this_IdentifierList_23= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:3465:5: (this_IdentifierList_23= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:3466:6: this_IdentifierList_23= ruleIdentifierList kw= ':='
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtLinhaAccess().getIdentifierListParserRuleCall_0_4_3_0());
                              					
                            }
                            pushFollow(FOLLOW_50);
                            this_IdentifierList_23=ruleIdentifierList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_IdentifierList_23);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            kw=(Token)match(input,47,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_4_3_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,49,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getRangeKeyword_0_5());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_6());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_26=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_26);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3500:3: this_ANY_OTHER_27= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_27=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_27);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_27, grammarAccess.getForStmtLinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForStmtLinha"


    // $ANTLR start "entryRulePostStmt"
    // InternalMyDsl.g:3511:1: entryRulePostStmt returns [String current=null] : iv_rulePostStmt= rulePostStmt EOF ;
    public final String entryRulePostStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostStmt = null;


        try {
            // InternalMyDsl.g:3511:48: (iv_rulePostStmt= rulePostStmt EOF )
            // InternalMyDsl.g:3512:2: iv_rulePostStmt= rulePostStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostStmt=rulePostStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostStmt"


    // $ANTLR start "rulePostStmt"
    // InternalMyDsl.g:3518:1: rulePostStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SimpleStmt_0= ruleSimpleStmt ;
    public final AntlrDatatypeRuleToken rulePostStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleStmt_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3524:2: (this_SimpleStmt_0= ruleSimpleStmt )
            // InternalMyDsl.g:3525:2: this_SimpleStmt_0= ruleSimpleStmt
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getPostStmtAccess().getSimpleStmtParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SimpleStmt_0=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SimpleStmt_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostStmt"


    // $ANTLR start "entryRuleInitStmt"
    // InternalMyDsl.g:3538:1: entryRuleInitStmt returns [String current=null] : iv_ruleInitStmt= ruleInitStmt EOF ;
    public final String entryRuleInitStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitStmt = null;


        try {
            // InternalMyDsl.g:3538:48: (iv_ruleInitStmt= ruleInitStmt EOF )
            // InternalMyDsl.g:3539:2: iv_ruleInitStmt= ruleInitStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitStmt=ruleInitStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitStmt"


    // $ANTLR start "ruleInitStmt"
    // InternalMyDsl.g:3545:1: ruleInitStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SimpleStmt_0= ruleSimpleStmt ;
    public final AntlrDatatypeRuleToken ruleInitStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleStmt_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3551:2: (this_SimpleStmt_0= ruleSimpleStmt )
            // InternalMyDsl.g:3552:2: this_SimpleStmt_0= ruleSimpleStmt
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInitStmtAccess().getSimpleStmtParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_SimpleStmt_0=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SimpleStmt_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitStmt"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:3565:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:3565:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:3566:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:3572:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3578:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:3579:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getConditionAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSelectStmt"
    // InternalMyDsl.g:3592:1: entryRuleSelectStmt returns [String current=null] : iv_ruleSelectStmt= ruleSelectStmt EOF ;
    public final String entryRuleSelectStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStmt = null;


        try {
            // InternalMyDsl.g:3592:50: (iv_ruleSelectStmt= ruleSelectStmt EOF )
            // InternalMyDsl.g:3593:2: iv_ruleSelectStmt= ruleSelectStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSelectStmt=ruleSelectStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStmt"


    // $ANTLR start "ruleSelectStmt"
    // InternalMyDsl.g:3599:1: ruleSelectStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSelectStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CommClause_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3605:2: ( (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) )
            // InternalMyDsl.g:3606:2: (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            {
            // InternalMyDsl.g:3606:2: (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            // InternalMyDsl.g:3607:3: kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}'
            {
            kw=(Token)match(input,50,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getSelectKeyword_0());
              		
            }
            kw=(Token)match(input,31,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:3617:3: (this_CommClause_2= ruleCommClause )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=51 && LA57_0<=52)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:3618:4: this_CommClause_2= ruleCommClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSelectStmtAccess().getCommClauseParserRuleCall_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_51);
            	    this_CommClause_2=ruleCommClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_CommClause_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStmt"


    // $ANTLR start "entryRuleCommClause"
    // InternalMyDsl.g:3638:1: entryRuleCommClause returns [String current=null] : iv_ruleCommClause= ruleCommClause EOF ;
    public final String entryRuleCommClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommClause = null;


        try {
            // InternalMyDsl.g:3638:50: (iv_ruleCommClause= ruleCommClause EOF )
            // InternalMyDsl.g:3639:2: iv_ruleCommClause= ruleCommClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommClause=ruleCommClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommClause.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommClause"


    // $ANTLR start "ruleCommClause"
    // InternalMyDsl.g:3645:1: ruleCommClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleCommClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CommCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3651:2: ( (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:3652:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:3652:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:3653:3: this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getCommCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_CommCase_0=ruleCommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CommCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,44,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getCommClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_StatementList_2=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_StatementList_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommClause"


    // $ANTLR start "entryRuleCommCase"
    // InternalMyDsl.g:3682:1: entryRuleCommCase returns [String current=null] : iv_ruleCommCase= ruleCommCase EOF ;
    public final String entryRuleCommCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCase = null;


        try {
            // InternalMyDsl.g:3682:48: (iv_ruleCommCase= ruleCommCase EOF )
            // InternalMyDsl.g:3683:2: iv_ruleCommCase= ruleCommCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommCase=ruleCommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommCase.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommCase"


    // $ANTLR start "ruleCommCase"
    // InternalMyDsl.g:3689:1: ruleCommCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleCommCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_CommCaseLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3695:2: ( ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' ) )
            // InternalMyDsl.g:3696:2: ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' )
            {
            // InternalMyDsl.g:3696:2: ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==51) ) {
                alt58=1;
            }
            else if ( (LA58_0==52) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:3697:3: (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    {
                    // InternalMyDsl.g:3697:3: (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    // InternalMyDsl.g:3698:4: kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    {
                    kw=(Token)match(input,51,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    // InternalMyDsl.g:3703:4: (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    // InternalMyDsl.g:3704:5: this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommCaseAccess().getExpressionParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_53);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommCaseAccess().getCommCaseLinhaParserRuleCall_0_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_CommCaseLinha_2=ruleCommCaseLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_CommCaseLinha_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3727:3: kw= 'default'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCommCaseAccess().getDefaultKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommCase"


    // $ANTLR start "entryRuleCommCaseLinha"
    // InternalMyDsl.g:3736:1: entryRuleCommCaseLinha returns [String current=null] : iv_ruleCommCaseLinha= ruleCommCaseLinha EOF ;
    public final String entryRuleCommCaseLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCaseLinha = null;


        try {
            // InternalMyDsl.g:3736:53: (iv_ruleCommCaseLinha= ruleCommCaseLinha EOF )
            // InternalMyDsl.g:3737:2: iv_ruleCommCaseLinha= ruleCommCaseLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommCaseLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommCaseLinha=ruleCommCaseLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommCaseLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommCaseLinha"


    // $ANTLR start "ruleCommCaseLinha"
    // InternalMyDsl.g:3743:1: ruleCommCaseLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleCommCaseLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_IdentifierList_5 = null;

        AntlrDatatypeRuleToken this_RecvExpr_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3749:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) )
            // InternalMyDsl.g:3750:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            {
            // InternalMyDsl.g:3750:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==41) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_IDENTIFIER||LA61_0==36||LA61_0==48) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:3751:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:3751:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:3752:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,41,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getLessThanSignHyphenMinusKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3769:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    {
                    // InternalMyDsl.g:3769:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    // InternalMyDsl.g:3770:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr
                    {
                    // InternalMyDsl.g:3770:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==36||LA60_0==48) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==RULE_IDENTIFIER) ) {
                        alt60=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalMyDsl.g:3771:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:3771:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:3772:6: (kw= ',' this_Expression_3= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:3772:6: (kw= ',' this_Expression_3= ruleExpression )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==36) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // InternalMyDsl.g:3773:7: kw= ',' this_Expression_3= ruleExpression
                            	    {
                            	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(kw);
                            	      							newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getCommaKeyword_1_0_0_0_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getExpressionParserRuleCall_1_0_0_0_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_49);
                            	    this_Expression_3=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(this_Expression_3);
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							afterParserOrEnumRuleCall();
                            	      						
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);

                            kw=(Token)match(input,48,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3796:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:3796:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:3797:6: this_IdentifierList_5= ruleIdentifierList kw= ':='
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getIdentifierListParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_50);
                            this_IdentifierList_5=ruleIdentifierList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_IdentifierList_5);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            kw=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getColonEqualsSignKeyword_1_0_1_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getRecvExprParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RecvExpr_7=ruleRecvExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_RecvExpr_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommCaseLinha"


    // $ANTLR start "entryRuleRecvExpr"
    // InternalMyDsl.g:3829:1: entryRuleRecvExpr returns [String current=null] : iv_ruleRecvExpr= ruleRecvExpr EOF ;
    public final String entryRuleRecvExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecvExpr = null;


        try {
            // InternalMyDsl.g:3829:48: (iv_ruleRecvExpr= ruleRecvExpr EOF )
            // InternalMyDsl.g:3830:2: iv_ruleRecvExpr= ruleRecvExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecvExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRecvExpr=ruleRecvExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecvExpr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecvExpr"


    // $ANTLR start "ruleRecvExpr"
    // InternalMyDsl.g:3836:1: ruleRecvExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleRecvExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3842:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:3843:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRecvExprAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecvExpr"


    // $ANTLR start "entryRuleSwitchStmt"
    // InternalMyDsl.g:3856:1: entryRuleSwitchStmt returns [String current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final String entryRuleSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmt = null;


        try {
            // InternalMyDsl.g:3856:50: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalMyDsl.g:3857:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStmt=ruleSwitchStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStmt"


    // $ANTLR start "ruleSwitchStmt"
    // InternalMyDsl.g:3863:1: ruleSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleStmt_1 = null;

        AntlrDatatypeRuleToken this_SwitchStmtLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3869:2: ( (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) )
            // InternalMyDsl.g:3870:2: (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            {
            // InternalMyDsl.g:3870:2: (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            // InternalMyDsl.g:3871:3: kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha
            {
            kw=(Token)match(input,53,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            // InternalMyDsl.g:3876:3: (this_SimpleStmt_1= ruleSimpleStmt kw= ';' )
            // InternalMyDsl.g:3877:4: this_SimpleStmt_1= ruleSimpleStmt kw= ';'
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
              			
            }
            pushFollow(FOLLOW_16);
            this_SimpleStmt_1=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_SimpleStmt_1);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }
            kw=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getSemicolonKeyword_1_1());
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSwitchStmtAccess().getSwitchStmtLinhaParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_SwitchStmtLinha_3=ruleSwitchStmtLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SwitchStmtLinha_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStmt"


    // $ANTLR start "entryRuleSwitchStmtLinha"
    // InternalMyDsl.g:3907:1: entryRuleSwitchStmtLinha returns [String current=null] : iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF ;
    public final String entryRuleSwitchStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmtLinha = null;


        try {
            // InternalMyDsl.g:3907:55: (iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF )
            // InternalMyDsl.g:3908:2: iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStmtLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStmtLinha=ruleSwitchStmtLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStmtLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStmtLinha"


    // $ANTLR start "ruleSwitchStmtLinha"
    // InternalMyDsl.g:3914:1: ruleSwitchStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ExprCaseClause_2 = null;

        AntlrDatatypeRuleToken this_TypeSwitchGuard_4 = null;

        AntlrDatatypeRuleToken this_TypeCaseClause_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3920:2: ( ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) ) )
            // InternalMyDsl.g:3921:2: ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) )
            {
            // InternalMyDsl.g:3921:2: ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_DECIMAL_DIGITS||(LA64_0>=RULE_STRING_LIT && LA64_0<=RULE_UNARY_OP)||LA64_0==RULE_INT_LITERAL||LA64_0==24||LA64_0==26||LA64_0==28||LA64_0==30||(LA64_0>=34 && LA64_0<=35)||(LA64_0>=37 && LA64_0<=41)) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_IDENTIFIER) ) {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==RULE_ANY_OTHER||LA64_2==24) ) {
                    alt64=1;
                }
                else if ( (LA64_2==47) ) {
                    alt64=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:3922:3: (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:3922:3: (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' )
                    // InternalMyDsl.g:3923:4: this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,31,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalMyDsl.g:3938:4: (this_ExprCaseClause_2= ruleExprCaseClause )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=51 && LA62_0<=52)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalMyDsl.g:3939:5: this_ExprCaseClause_2= ruleExprCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getExprCaseClauseParserRuleCall_0_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_51);
                    	    this_ExprCaseClause_2=ruleExprCaseClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ExprCaseClause_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getRightCurlyBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3957:3: (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:3957:3: (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' )
                    // InternalMyDsl.g:3958:4: this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getTypeSwitchGuardParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_TypeSwitchGuard_4=ruleTypeSwitchGuard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeSwitchGuard_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,31,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:3973:4: (this_TypeCaseClause_6= ruleTypeCaseClause )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=51 && LA63_0<=52)) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalMyDsl.g:3974:5: this_TypeCaseClause_6= ruleTypeCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getTypeCaseClauseParserRuleCall_1_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_51);
                    	    this_TypeCaseClause_6=ruleTypeCaseClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_TypeCaseClause_6);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchStmtLinha"


    // $ANTLR start "entryRuleTypeCaseClause"
    // InternalMyDsl.g:3995:1: entryRuleTypeCaseClause returns [String current=null] : iv_ruleTypeCaseClause= ruleTypeCaseClause EOF ;
    public final String entryRuleTypeCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeCaseClause = null;


        try {
            // InternalMyDsl.g:3995:54: (iv_ruleTypeCaseClause= ruleTypeCaseClause EOF )
            // InternalMyDsl.g:3996:2: iv_ruleTypeCaseClause= ruleTypeCaseClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCaseClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeCaseClause=ruleTypeCaseClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeCaseClause.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeCaseClause"


    // $ANTLR start "ruleTypeCaseClause"
    // InternalMyDsl.g:4002:1: ruleTypeCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleTypeCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4008:2: ( (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:4009:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:4009:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:4010:3: this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeCaseClauseAccess().getTypeSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_TypeSwitchCase_0=ruleTypeSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,44,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeCaseClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeCaseClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_StatementList_2=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_StatementList_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeCaseClause"


    // $ANTLR start "entryRuleTypeSwitchCase"
    // InternalMyDsl.g:4039:1: entryRuleTypeSwitchCase returns [String current=null] : iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF ;
    public final String entryRuleTypeSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchCase = null;


        try {
            // InternalMyDsl.g:4039:54: (iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF )
            // InternalMyDsl.g:4040:2: iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSwitchCase=ruleTypeSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSwitchCase.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSwitchCase"


    // $ANTLR start "ruleTypeSwitchCase"
    // InternalMyDsl.g:4046:1: ruleTypeSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4052:2: ( ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' ) )
            // InternalMyDsl.g:4053:2: ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' )
            {
            // InternalMyDsl.g:4053:2: ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            else if ( (LA65_0==52) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:4054:3: (kw= 'case' this_TypeList_1= ruleTypeList )
                    {
                    // InternalMyDsl.g:4054:3: (kw= 'case' this_TypeList_1= ruleTypeList )
                    // InternalMyDsl.g:4055:4: kw= 'case' this_TypeList_1= ruleTypeList
                    {
                    kw=(Token)match(input,51,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeSwitchCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeSwitchCaseAccess().getTypeListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeList_1=ruleTypeList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4072:3: kw= 'default'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTypeSwitchCaseAccess().getDefaultKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSwitchCase"


    // $ANTLR start "entryRuleTypeList"
    // InternalMyDsl.g:4081:1: entryRuleTypeList returns [String current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final String entryRuleTypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeList = null;


        try {
            // InternalMyDsl.g:4081:48: (iv_ruleTypeList= ruleTypeList EOF )
            // InternalMyDsl.g:4082:2: iv_ruleTypeList= ruleTypeList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeList=ruleTypeList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeList"


    // $ANTLR start "ruleTypeList"
    // InternalMyDsl.g:4088:1: ruleTypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) ;
    public final AntlrDatatypeRuleToken ruleTypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4094:2: ( (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) )
            // InternalMyDsl.g:4095:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            {
            // InternalMyDsl.g:4095:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            // InternalMyDsl.g:4096:3: this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:4106:3: (kw= ',' this_Type_2= ruleType )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==36) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalMyDsl.g:4107:4: kw= ',' this_Type_2= ruleType
            	    {
            	    kw=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTypeListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_22);
            	    this_Type_2=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_Type_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeList"


    // $ANTLR start "entryRuleTypeSwitchGuard"
    // InternalMyDsl.g:4127:1: entryRuleTypeSwitchGuard returns [String current=null] : iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF ;
    public final String entryRuleTypeSwitchGuard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchGuard = null;


        try {
            // InternalMyDsl.g:4127:55: (iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF )
            // InternalMyDsl.g:4128:2: iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSwitchGuardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSwitchGuard=ruleTypeSwitchGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSwitchGuard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSwitchGuard"


    // $ANTLR start "ruleTypeSwitchGuard"
    // InternalMyDsl.g:4134:1: ruleTypeSwitchGuard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchGuard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4140:2: ( ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' ) )
            // InternalMyDsl.g:4141:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' )
            {
            // InternalMyDsl.g:4141:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' )
            // InternalMyDsl.g:4142:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')'
            {
            // InternalMyDsl.g:4142:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )
            // InternalMyDsl.g:4143:4: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':='
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_IDENTIFIER_0);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeSwitchGuardAccess().getIDENTIFIERTerminalRuleCall_0_0());
              			
            }
            kw=(Token)match(input,47,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getColonEqualsSignKeyword_0_1());
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeSwitchGuardAccess().getPrimaryExprParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_4);
            this_PrimaryExpr_2=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PrimaryExpr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getFullStopKeyword_2());
              		
            }
            kw=(Token)match(input,26,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getLeftParenthesisKeyword_3());
              		
            }
            kw=(Token)match(input,54,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getTypeKeyword_4());
              		
            }
            kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSwitchGuard"


    // $ANTLR start "entryRuleExprCaseClause"
    // InternalMyDsl.g:4190:1: entryRuleExprCaseClause returns [String current=null] : iv_ruleExprCaseClause= ruleExprCaseClause EOF ;
    public final String entryRuleExprCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprCaseClause = null;


        try {
            // InternalMyDsl.g:4190:54: (iv_ruleExprCaseClause= ruleExprCaseClause EOF )
            // InternalMyDsl.g:4191:2: iv_ruleExprCaseClause= ruleExprCaseClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprCaseClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprCaseClause=ruleExprCaseClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprCaseClause.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprCaseClause"


    // $ANTLR start "ruleExprCaseClause"
    // InternalMyDsl.g:4197:1: ruleExprCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleExprCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4203:2: ( (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:4204:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:4204:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:4205:3: this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprCaseClauseAccess().getExprSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_ExprSwitchCase_0=ruleExprSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExprSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,44,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getExprCaseClauseAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprCaseClauseAccess().getStatementListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_StatementList_2=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_StatementList_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprCaseClause"


    // $ANTLR start "entryRuleExprSwitchCase"
    // InternalMyDsl.g:4234:1: entryRuleExprSwitchCase returns [String current=null] : iv_ruleExprSwitchCase= ruleExprSwitchCase EOF ;
    public final String entryRuleExprSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSwitchCase = null;


        try {
            // InternalMyDsl.g:4234:54: (iv_ruleExprSwitchCase= ruleExprSwitchCase EOF )
            // InternalMyDsl.g:4235:2: iv_ruleExprSwitchCase= ruleExprSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSwitchCase=ruleExprSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSwitchCase.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSwitchCase"


    // $ANTLR start "ruleExprSwitchCase"
    // InternalMyDsl.g:4241:1: ruleExprSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleExprSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4247:2: ( ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' ) )
            // InternalMyDsl.g:4248:2: ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' )
            {
            // InternalMyDsl.g:4248:2: ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            else if ( (LA67_0==52) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:4249:3: (kw= 'case' this_ExpressionList_1= ruleExpressionList )
                    {
                    // InternalMyDsl.g:4249:3: (kw= 'case' this_ExpressionList_1= ruleExpressionList )
                    // InternalMyDsl.g:4250:4: kw= 'case' this_ExpressionList_1= ruleExpressionList
                    {
                    kw=(Token)match(input,51,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExprSwitchCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprSwitchCaseAccess().getExpressionListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionList_1=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4267:3: kw= 'default'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getExprSwitchCaseAccess().getDefaultKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSwitchCase"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMyDsl.g:4276:1: entryRuleIfStmt returns [String current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final String entryRuleIfStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmt = null;


        try {
            // InternalMyDsl.g:4276:46: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMyDsl.g:4277:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMyDsl.g:4283:1: ruleIfStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) ) ;
    public final AntlrDatatypeRuleToken ruleIfStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleStmt_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Block_4 = null;

        AntlrDatatypeRuleToken this_IfStmt_6 = null;

        AntlrDatatypeRuleToken this_Block_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4289:2: ( (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) ) )
            // InternalMyDsl.g:4290:2: (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) )
            {
            // InternalMyDsl.g:4290:2: (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) )
            // InternalMyDsl.g:4291:3: kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) )
            {
            kw=(Token)match(input,55,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            // InternalMyDsl.g:4296:3: (this_SimpleStmt_1= ruleSimpleStmt kw= ';' )
            // InternalMyDsl.g:4297:4: this_SimpleStmt_1= ruleSimpleStmt kw= ';'
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIfStmtAccess().getSimpleStmtParserRuleCall_1_0());
              			
            }
            pushFollow(FOLLOW_16);
            this_SimpleStmt_1=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_SimpleStmt_1);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }
            kw=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getIfStmtAccess().getSemicolonKeyword_1_1());
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_Expression_3=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_56);
            this_Block_4=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:4333:3: (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) )
            // InternalMyDsl.g:4334:4: kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock )
            {
            kw=(Token)match(input,56,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getIfStmtAccess().getElseKeyword_4_0());
              			
            }
            // InternalMyDsl.g:4339:4: (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==55) ) {
                alt68=1;
            }
            else if ( (LA68_0==31) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:4340:5: this_IfStmt_6= ruleIfStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIfStmtAccess().getIfStmtParserRuleCall_4_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmt_6=ruleIfStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IfStmt_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4351:5: this_Block_7= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_4_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_Block_7=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Block_7);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleFallthroughStmt"
    // InternalMyDsl.g:4367:1: entryRuleFallthroughStmt returns [String current=null] : iv_ruleFallthroughStmt= ruleFallthroughStmt EOF ;
    public final String entryRuleFallthroughStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFallthroughStmt = null;


        try {
            // InternalMyDsl.g:4367:55: (iv_ruleFallthroughStmt= ruleFallthroughStmt EOF )
            // InternalMyDsl.g:4368:2: iv_ruleFallthroughStmt= ruleFallthroughStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFallthroughStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFallthroughStmt=ruleFallthroughStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFallthroughStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFallthroughStmt"


    // $ANTLR start "ruleFallthroughStmt"
    // InternalMyDsl.g:4374:1: ruleFallthroughStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fallthrough' ;
    public final AntlrDatatypeRuleToken ruleFallthroughStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4380:2: (kw= 'fallthrough' )
            // InternalMyDsl.g:4381:2: kw= 'fallthrough'
            {
            kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getFallthroughStmtAccess().getFallthroughKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFallthroughStmt"


    // $ANTLR start "entryRuleGotoStmt"
    // InternalMyDsl.g:4389:1: entryRuleGotoStmt returns [String current=null] : iv_ruleGotoStmt= ruleGotoStmt EOF ;
    public final String entryRuleGotoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGotoStmt = null;


        try {
            // InternalMyDsl.g:4389:48: (iv_ruleGotoStmt= ruleGotoStmt EOF )
            // InternalMyDsl.g:4390:2: iv_ruleGotoStmt= ruleGotoStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGotoStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGotoStmt=ruleGotoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGotoStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGotoStmt"


    // $ANTLR start "ruleGotoStmt"
    // InternalMyDsl.g:4396:1: ruleGotoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goto' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGotoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4402:2: ( (kw= 'goto' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4403:2: (kw= 'goto' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4403:2: (kw= 'goto' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4404:3: kw= 'goto' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,58,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGotoStmtAccess().getGotoKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGotoStmtAccess().getLabelParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Label_1=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGotoStmt"


    // $ANTLR start "entryRuleContinueStmt"
    // InternalMyDsl.g:4423:1: entryRuleContinueStmt returns [String current=null] : iv_ruleContinueStmt= ruleContinueStmt EOF ;
    public final String entryRuleContinueStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinueStmt = null;


        try {
            // InternalMyDsl.g:4423:52: (iv_ruleContinueStmt= ruleContinueStmt EOF )
            // InternalMyDsl.g:4424:2: iv_ruleContinueStmt= ruleContinueStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContinueStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContinueStmt=ruleContinueStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContinueStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinueStmt"


    // $ANTLR start "ruleContinueStmt"
    // InternalMyDsl.g:4430:1: ruleContinueStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'continue' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleContinueStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4436:2: ( (kw= 'continue' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4437:2: (kw= 'continue' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4437:2: (kw= 'continue' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4438:3: kw= 'continue' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,59,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getContinueStmtAccess().getContinueKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getContinueStmtAccess().getLabelParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Label_1=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinueStmt"


    // $ANTLR start "entryRuleBreakStmt"
    // InternalMyDsl.g:4457:1: entryRuleBreakStmt returns [String current=null] : iv_ruleBreakStmt= ruleBreakStmt EOF ;
    public final String entryRuleBreakStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStmt = null;


        try {
            // InternalMyDsl.g:4457:49: (iv_ruleBreakStmt= ruleBreakStmt EOF )
            // InternalMyDsl.g:4458:2: iv_ruleBreakStmt= ruleBreakStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBreakStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBreakStmt=ruleBreakStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBreakStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreakStmt"


    // $ANTLR start "ruleBreakStmt"
    // InternalMyDsl.g:4464:1: ruleBreakStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'break' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleBreakStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4470:2: ( (kw= 'break' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4471:2: (kw= 'break' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4471:2: (kw= 'break' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4472:3: kw= 'break' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,60,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBreakStmtAccess().getBreakKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBreakStmtAccess().getLabelParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Label_1=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakStmt"


    // $ANTLR start "entryRuleReturnStmt"
    // InternalMyDsl.g:4491:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalMyDsl.g:4491:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalMyDsl.g:4492:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStmt"


    // $ANTLR start "ruleReturnStmt"
    // InternalMyDsl.g:4498:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' this_ExpressionList_1= ruleExpressionList ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4504:2: ( (kw= 'return' this_ExpressionList_1= ruleExpressionList ) )
            // InternalMyDsl.g:4505:2: (kw= 'return' this_ExpressionList_1= ruleExpressionList )
            {
            // InternalMyDsl.g:4505:2: (kw= 'return' this_ExpressionList_1= ruleExpressionList )
            // InternalMyDsl.g:4506:3: kw= 'return' this_ExpressionList_1= ruleExpressionList
            {
            kw=(Token)match(input,61,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getReturnStmtAccess().getReturnKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getReturnStmtAccess().getExpressionListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_ExpressionList_1=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExpressionList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStmt"


    // $ANTLR start "entryRuleGoStmt"
    // InternalMyDsl.g:4525:1: entryRuleGoStmt returns [String current=null] : iv_ruleGoStmt= ruleGoStmt EOF ;
    public final String entryRuleGoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoStmt = null;


        try {
            // InternalMyDsl.g:4525:46: (iv_ruleGoStmt= ruleGoStmt EOF )
            // InternalMyDsl.g:4526:2: iv_ruleGoStmt= ruleGoStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGoStmt=ruleGoStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoStmt"


    // $ANTLR start "ruleGoStmt"
    // InternalMyDsl.g:4532:1: ruleGoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4538:2: ( (kw= 'go' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4539:2: (kw= 'go' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4539:2: (kw= 'go' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4540:3: kw= 'go' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,62,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getGoStmtAccess().getGoKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGoStmtAccess().getLabelParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Label_1=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoStmt"


    // $ANTLR start "entryRuleSimpleStmt"
    // InternalMyDsl.g:4559:1: entryRuleSimpleStmt returns [String current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final String entryRuleSimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmt = null;


        try {
            // InternalMyDsl.g:4559:50: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalMyDsl.g:4560:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStmt=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleStmt"


    // $ANTLR start "ruleSimpleStmt"
    // InternalMyDsl.g:4566:1: ruleSimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSimpleStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_2=null;
        Token kw=null;
        Token this_IDENTIFIER_4=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_SimpleStmtLinha_1 = null;

        AntlrDatatypeRuleToken this_Expression_6 = null;

        AntlrDatatypeRuleToken this_Expression_8 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4572:2: ( ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) ) )
            // InternalMyDsl.g:4573:2: ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) )
            {
            // InternalMyDsl.g:4573:2: ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_DECIMAL_DIGITS||(LA71_0>=RULE_STRING_LIT && LA71_0<=RULE_UNARY_OP)||LA71_0==RULE_INT_LITERAL||LA71_0==24||LA71_0==26||LA71_0==28||LA71_0==30||(LA71_0>=34 && LA71_0<=35)||(LA71_0>=37 && LA71_0<=41)) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_IDENTIFIER) ) {
                int LA71_2 = input.LA(2);

                if ( (LA71_2==RULE_ANY_OTHER||LA71_2==24) ) {
                    alt71=1;
                }
                else if ( (LA71_2==36||LA71_2==47) ) {
                    alt71=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:4574:3: (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha )
                    {
                    // InternalMyDsl.g:4574:3: (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha )
                    // InternalMyDsl.g:4575:4: this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_46);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtAccess().getSimpleStmtLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmtLinha_1=ruleSimpleStmtLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SimpleStmtLinha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4597:3: ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) )
                    {
                    // InternalMyDsl.g:4597:3: ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) )
                    // InternalMyDsl.g:4598:4: (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* )
                    {
                    // InternalMyDsl.g:4598:4: (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* )
                    // InternalMyDsl.g:4599:5: this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )*
                    {
                    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IDENTIFIER_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_IDENTIFIER_2, grammarAccess.getSimpleStmtAccess().getIDENTIFIERTerminalRuleCall_1_0_0());
                      				
                    }
                    // InternalMyDsl.g:4606:5: (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==36) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalMyDsl.g:4607:6: kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER
                    	    {
                    	    kw=(Token)match(input,36,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getCommaKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    this_IDENTIFIER_4=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_IDENTIFIER_4);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_IDENTIFIER_4, grammarAccess.getSimpleStmtAccess().getIDENTIFIERTerminalRuleCall_1_0_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }

                    kw=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getColonEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:4626:4: (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* )
                    // InternalMyDsl.g:4627:5: this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )*
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_1_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    this_Expression_6=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:4637:5: (kw= ',' this_Expression_8= ruleExpression )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==36) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalMyDsl.g:4638:6: kw= ',' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getCommaKeyword_1_2_1_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_1_2_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    this_Expression_8=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_Expression_8);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleStmt"


    // $ANTLR start "entryRuleSimpleStmtLinha"
    // InternalMyDsl.g:4660:1: entryRuleSimpleStmtLinha returns [String current=null] : iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF ;
    public final String entryRuleSimpleStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmtLinha = null;


        try {
            // InternalMyDsl.g:4660:55: (iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF )
            // InternalMyDsl.g:4661:2: iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStmtLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStmtLinha=ruleSimpleStmtLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStmtLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleStmtLinha"


    // $ANTLR start "ruleSimpleStmtLinha"
    // InternalMyDsl.g:4667:1: ruleSimpleStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSimpleStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;

        AntlrDatatypeRuleToken this_assign_op_6 = null;

        AntlrDatatypeRuleToken this_Expression_7 = null;

        AntlrDatatypeRuleToken this_Expression_9 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4673:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) ) )
            // InternalMyDsl.g:4674:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) )
            {
            // InternalMyDsl.g:4674:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt75=1;
                }
                break;
            case 63:
            case 64:
                {
                alt75=2;
                }
                break;
            case RULE_ADD_OP:
            case RULE_MUL_OP:
            case 36:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:4675:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:4675:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:4676:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,41,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getLessThanSignHyphenMinusKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4693:3: (kw= '++' | kw= '--' )
                    {
                    // InternalMyDsl.g:4693:3: (kw= '++' | kw= '--' )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==63) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==64) ) {
                        alt72=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalMyDsl.g:4694:4: kw= '++'
                            {
                            kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getPlusSignPlusSignKeyword_1_0());
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4700:4: kw= '--'
                            {
                            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getHyphenMinusHyphenMinusKeyword_1_1());
                              			
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4707:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) )
                    {
                    // InternalMyDsl.g:4707:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) )
                    // InternalMyDsl.g:4708:4: (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* )
                    {
                    // InternalMyDsl.g:4708:4: (kw= ',' this_Expression_5= ruleExpression )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==36) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalMyDsl.g:4709:5: kw= ',' this_Expression_5= ruleExpression
                    	    {
                    	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getCommaKeyword_2_0_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_0_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    this_Expression_5=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_Expression_5);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getAssign_opParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_29);
                    this_assign_op_6=ruleassign_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_assign_op_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:4735:4: (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* )
                    // InternalMyDsl.g:4736:5: this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )*
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_2_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    this_Expression_7=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_7);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:4746:5: (kw= ',' this_Expression_9= ruleExpression )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==36) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyDsl.g:4747:6: kw= ',' this_Expression_9= ruleExpression
                    	    {
                    	    kw=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getCommaKeyword_2_2_1_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_2_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    this_Expression_9=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_Expression_9);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleStmtLinha"


    // $ANTLR start "entryRuleassign_op"
    // InternalMyDsl.g:4769:1: entryRuleassign_op returns [String current=null] : iv_ruleassign_op= ruleassign_op EOF ;
    public final String entryRuleassign_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign_op = null;


        try {
            // InternalMyDsl.g:4769:49: (iv_ruleassign_op= ruleassign_op EOF )
            // InternalMyDsl.g:4770:2: iv_ruleassign_op= ruleassign_op EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssign_opRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleassign_op=ruleassign_op();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleassign_op.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassign_op"


    // $ANTLR start "ruleassign_op"
    // InternalMyDsl.g:4776:1: ruleassign_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleassign_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADD_OP_0=null;
        Token this_MUL_OP_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4782:2: ( ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' ) )
            // InternalMyDsl.g:4783:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' )
            {
            // InternalMyDsl.g:4783:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' )
            // InternalMyDsl.g:4784:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '='
            {
            // InternalMyDsl.g:4784:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ADD_OP) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_MUL_OP) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:4785:4: this_ADD_OP_0= RULE_ADD_OP
                    {
                    this_ADD_OP_0=(Token)match(input,RULE_ADD_OP,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ADD_OP_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ADD_OP_0, grammarAccess.getAssign_opAccess().getADD_OPTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4793:4: this_MUL_OP_1= RULE_MUL_OP
                    {
                    this_MUL_OP_1=(Token)match(input,RULE_MUL_OP,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MUL_OP_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MUL_OP_1, grammarAccess.getAssign_opAccess().getMUL_OPTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAssign_opAccess().getEqualsSignKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassign_op"


    // $ANTLR start "entryRuleChannel"
    // InternalMyDsl.g:4810:1: entryRuleChannel returns [String current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final String entryRuleChannel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannel = null;


        try {
            // InternalMyDsl.g:4810:47: (iv_ruleChannel= ruleChannel EOF )
            // InternalMyDsl.g:4811:2: iv_ruleChannel= ruleChannel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannel.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalMyDsl.g:4817:1: ruleChannel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleChannel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4823:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:4824:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getChannelAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleLabeledStmt"
    // InternalMyDsl.g:4837:1: entryRuleLabeledStmt returns [String current=null] : iv_ruleLabeledStmt= ruleLabeledStmt EOF ;
    public final String entryRuleLabeledStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabeledStmt = null;


        try {
            // InternalMyDsl.g:4837:51: (iv_ruleLabeledStmt= ruleLabeledStmt EOF )
            // InternalMyDsl.g:4838:2: iv_ruleLabeledStmt= ruleLabeledStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabeledStmt=ruleLabeledStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeledStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabeledStmt"


    // $ANTLR start "ruleLabeledStmt"
    // InternalMyDsl.g:4844:1: ruleLabeledStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) ;
    public final AntlrDatatypeRuleToken ruleLabeledStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_0 = null;

        AntlrDatatypeRuleToken this_Statement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4850:2: ( (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) )
            // InternalMyDsl.g:4851:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            {
            // InternalMyDsl.g:4851:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            // InternalMyDsl.g:4852:3: this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeledStmtAccess().getLabelParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_Label_0=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,44,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLabeledStmtAccess().getColonKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeledStmtAccess().getStatementParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Statement_2=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Statement_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledStmt"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:4881:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:4881:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:4882:2: iv_ruleLabel= ruleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabel.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:4888:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4894:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:4895:2: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_IDENTIFIER_0, grammarAccess.getLabelAccess().getIDENTIFIERTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:4905:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:4905:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:4906:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMyDsl.g:4912:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDecl_1 = null;

        AntlrDatatypeRuleToken this_VarDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4918:2: ( (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) )
            // InternalMyDsl.g:4919:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            {
            // InternalMyDsl.g:4919:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt77=1;
                }
                break;
            case 54:
                {
                alt77=2;
                }
                break;
            case 66:
                {
                alt77=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:4920:3: this_ConstDecl_0= ruleConstDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getConstDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstDecl_0=ruleConstDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ConstDecl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4931:3: this_TypeDecl_1= ruleTypeDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDecl_1=ruleTypeDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeDecl_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4942:3: this_VarDecl_2= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclarationAccess().getVarDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarDecl_2=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VarDecl_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleTopLevelDecl"
    // InternalMyDsl.g:4956:1: entryRuleTopLevelDecl returns [String current=null] : iv_ruleTopLevelDecl= ruleTopLevelDecl EOF ;
    public final String entryRuleTopLevelDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelDecl = null;


        try {
            // InternalMyDsl.g:4956:52: (iv_ruleTopLevelDecl= ruleTopLevelDecl EOF )
            // InternalMyDsl.g:4957:2: iv_ruleTopLevelDecl= ruleTopLevelDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelDecl=ruleTopLevelDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelDecl"


    // $ANTLR start "ruleTopLevelDecl"
    // InternalMyDsl.g:4963:1: ruleTopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;

        AntlrDatatypeRuleToken this_FunctionDecl_1 = null;

        AntlrDatatypeRuleToken this_MethodDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4969:2: ( (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) )
            // InternalMyDsl.g:4970:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            {
            // InternalMyDsl.g:4970:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==54||(LA78_0>=65 && LA78_0<=66)) ) {
                alt78=1;
            }
            else if ( (LA78_0==35) ) {
                int LA78_2 = input.LA(2);

                if ( (LA78_2==26) ) {
                    alt78=3;
                }
                else if ( (LA78_2==RULE_IDENTIFIER) ) {
                    alt78=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:4971:3: this_Declaration_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Declaration_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Declaration_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4982:3: this_FunctionDecl_1= ruleFunctionDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getFunctionDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionDecl_1=ruleFunctionDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FunctionDecl_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4993:3: this_MethodDecl_2= ruleMethodDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelDeclAccess().getMethodDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MethodDecl_2=ruleMethodDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MethodDecl_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelDecl"


    // $ANTLR start "entryRuleConstDecl"
    // InternalMyDsl.g:5007:1: entryRuleConstDecl returns [String current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final String entryRuleConstDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstDecl = null;


        try {
            // InternalMyDsl.g:5007:49: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalMyDsl.g:5008:2: iv_ruleConstDecl= ruleConstDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstDecl=ruleConstDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstDecl"


    // $ANTLR start "ruleConstDecl"
    // InternalMyDsl.g:5014:1: ruleConstDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleConstDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstSpec_1 = null;

        AntlrDatatypeRuleToken this_ConstSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5020:2: ( (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5021:2: (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5021:2: (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5022:3: kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,65,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getConstDeclAccess().getConstKeyword_0());
              		
            }
            // InternalMyDsl.g:5027:3: (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_IDENTIFIER) ) {
                alt80=1;
            }
            else if ( (LA80_0==26) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:5028:4: this_ConstSpec_1= ruleConstSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstSpec_1=ruleConstSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ConstSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5039:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5039:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5040:5: kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5045:5: (this_ConstSpec_3= ruleConstSpec kw= ';' )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_IDENTIFIER) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalMyDsl.g:5046:6: this_ConstSpec_3= ruleConstSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    this_ConstSpec_3=ruleConstSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ConstSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,32,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getConstDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstDecl"


    // $ANTLR start "entryRuleConstSpec"
    // InternalMyDsl.g:5073:1: entryRuleConstSpec returns [String current=null] : iv_ruleConstSpec= ruleConstSpec EOF ;
    public final String entryRuleConstSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstSpec = null;


        try {
            // InternalMyDsl.g:5073:49: (iv_ruleConstSpec= ruleConstSpec EOF )
            // InternalMyDsl.g:5074:2: iv_ruleConstSpec= ruleConstSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstSpec=ruleConstSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstSpec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstSpec"


    // $ANTLR start "ruleConstSpec"
    // InternalMyDsl.g:5080:1: ruleConstSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) ;
    public final AntlrDatatypeRuleToken ruleConstSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5086:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) )
            // InternalMyDsl.g:5087:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            {
            // InternalMyDsl.g:5087:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            // InternalMyDsl.g:5088:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_IdentifierList_0=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdentifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5098:3: ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_IDENTIFIER||LA82_0==26||LA82_0==28||LA82_0==30||(LA82_0>=34 && LA82_0<=35)||(LA82_0>=38 && LA82_0<=41)||LA82_0==48) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyDsl.g:5099:4: (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList
                    {
                    // InternalMyDsl.g:5099:4: (this_Type_1= ruleType )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_IDENTIFIER||LA81_0==26||LA81_0==28||LA81_0==30||(LA81_0>=34 && LA81_0<=35)||(LA81_0>=38 && LA81_0<=41)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalMyDsl.g:5100:5: this_Type_1= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConstSpecAccess().getTypeParserRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_58);
                            this_Type_1=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Type_1);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,48,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getConstSpecAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConstSpecAccess().getExpressionListParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionList_3=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionList_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstSpec"


    // $ANTLR start "entryRuleTypeDecl"
    // InternalMyDsl.g:5131:1: entryRuleTypeDecl returns [String current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final String entryRuleTypeDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDecl = null;


        try {
            // InternalMyDsl.g:5131:48: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalMyDsl.g:5132:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // InternalMyDsl.g:5138:1: ruleTypeDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpec_1 = null;

        AntlrDatatypeRuleToken this_TypeSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5144:2: ( (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5145:2: (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5145:2: (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5146:3: kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,54,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
              		
            }
            // InternalMyDsl.g:5151:3: (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_IDENTIFIER) ) {
                alt84=1;
            }
            else if ( (LA84_0==26) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:5152:4: this_TypeSpec_1= ruleTypeSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeSpec_1=ruleTypeSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5163:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5163:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5164:5: kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5169:5: (this_TypeSpec_3= ruleTypeSpec kw= ';' )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==RULE_IDENTIFIER) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalMyDsl.g:5170:6: this_TypeSpec_3= ruleTypeSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    this_TypeSpec_3=ruleTypeSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_TypeSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,32,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleTypeSpec"
    // InternalMyDsl.g:5197:1: entryRuleTypeSpec returns [String current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final String entryRuleTypeSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpec = null;


        try {
            // InternalMyDsl.g:5197:48: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalMyDsl.g:5198:2: iv_ruleTypeSpec= ruleTypeSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpec=ruleTypeSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpec"


    // $ANTLR start "ruleTypeSpec"
    // InternalMyDsl.g:5204:1: ruleTypeSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AliasDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDef_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5210:2: ( (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) )
            // InternalMyDsl.g:5211:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            {
            // InternalMyDsl.g:5211:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_IDENTIFIER) ) {
                int LA85_1 = input.LA(2);

                if ( (LA85_1==RULE_IDENTIFIER||LA85_1==26||LA85_1==28||LA85_1==30||(LA85_1>=34 && LA85_1<=35)||(LA85_1>=38 && LA85_1<=41)) ) {
                    alt85=2;
                }
                else if ( (LA85_1==48) ) {
                    alt85=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:5212:3: this_AliasDecl_0= ruleAliasDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeSpecAccess().getAliasDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AliasDecl_0=ruleAliasDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_AliasDecl_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5223:3: this_TypeDef_1= ruleTypeDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeSpecAccess().getTypeDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDef_1=ruleTypeDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeDef_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpec"


    // $ANTLR start "entryRuleAliasDecl"
    // InternalMyDsl.g:5237:1: entryRuleAliasDecl returns [String current=null] : iv_ruleAliasDecl= ruleAliasDecl EOF ;
    public final String entryRuleAliasDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDecl = null;


        try {
            // InternalMyDsl.g:5237:49: (iv_ruleAliasDecl= ruleAliasDecl EOF )
            // InternalMyDsl.g:5238:2: iv_ruleAliasDecl= ruleAliasDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAliasDecl=ruleAliasDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDecl"


    // $ANTLR start "ruleAliasDecl"
    // InternalMyDsl.g:5244:1: ruleAliasDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleAliasDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5250:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) )
            // InternalMyDsl.g:5251:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            {
            // InternalMyDsl.g:5251:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            // InternalMyDsl.g:5252:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getAliasDeclAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,48,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getAliasDeclAccess().getEqualsSignKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAliasDeclAccess().getTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_2=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasDecl"


    // $ANTLR start "entryRuleTypeDef"
    // InternalMyDsl.g:5278:1: entryRuleTypeDef returns [String current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final String entryRuleTypeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDef = null;


        try {
            // InternalMyDsl.g:5278:47: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyDsl.g:5279:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalMyDsl.g:5285:1: ruleTypeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleTypeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5291:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) )
            // InternalMyDsl.g:5292:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            {
            // InternalMyDsl.g:5292:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            // InternalMyDsl.g:5293:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeDefAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeDefAccess().getTypeParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Type_1=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleVarDecl"
    // InternalMyDsl.g:5314:1: entryRuleVarDecl returns [String current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final String entryRuleVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarDecl = null;


        try {
            // InternalMyDsl.g:5314:47: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMyDsl.g:5315:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalMyDsl.g:5321:1: ruleVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VarSpec_1 = null;

        AntlrDatatypeRuleToken this_VarSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5327:2: ( (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5328:2: (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5328:2: (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5329:3: kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,66,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVarDeclAccess().getVarKeyword_0());
              		
            }
            // InternalMyDsl.g:5334:3: (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_IDENTIFIER) ) {
                alt87=1;
            }
            else if ( (LA87_0==26) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalMyDsl.g:5335:4: this_VarSpec_1= ruleVarSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_VarSpec_1=ruleVarSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_VarSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5346:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5346:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5347:5: kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5352:5: (this_VarSpec_3= ruleVarSpec kw= ';' )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==RULE_IDENTIFIER) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalMyDsl.g:5353:6: this_VarSpec_3= ruleVarSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    this_VarSpec_3=ruleVarSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_VarSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,32,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getVarDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleVarSpec"
    // InternalMyDsl.g:5380:1: entryRuleVarSpec returns [String current=null] : iv_ruleVarSpec= ruleVarSpec EOF ;
    public final String entryRuleVarSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarSpec = null;


        try {
            // InternalMyDsl.g:5380:47: (iv_ruleVarSpec= ruleVarSpec EOF )
            // InternalMyDsl.g:5381:2: iv_ruleVarSpec= ruleVarSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarSpec=ruleVarSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarSpec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarSpec"


    // $ANTLR start "ruleVarSpec"
    // InternalMyDsl.g:5387:1: ruleVarSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;

        AntlrDatatypeRuleToken this_ExpressionList_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5393:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) )
            // InternalMyDsl.g:5394:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            {
            // InternalMyDsl.g:5394:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            // InternalMyDsl.g:5395:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_61);
            this_IdentifierList_0=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdentifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5405:3: ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_IDENTIFIER||LA89_0==26||LA89_0==28||LA89_0==30||(LA89_0>=34 && LA89_0<=35)||(LA89_0>=38 && LA89_0<=41)) ) {
                alt89=1;
            }
            else if ( (LA89_0==48) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalMyDsl.g:5406:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    {
                    // InternalMyDsl.g:5406:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    // InternalMyDsl.g:5407:5: this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getTypeParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_62);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:5417:5: (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==48) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalMyDsl.g:5418:6: kw= '=' this_ExpressionList_3= ruleExpressionList
                            {
                            kw=(Token)match(input,48,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getVarSpecAccess().getEqualsSignKeyword_1_0_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getVarSpecAccess().getExpressionListParserRuleCall_1_0_1_1());
                              					
                            }
                            pushFollow(FOLLOW_2);
                            this_ExpressionList_3=ruleExpressionList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_ExpressionList_3);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5436:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    {
                    // InternalMyDsl.g:5436:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    // InternalMyDsl.g:5437:5: kw= '=' this_ExpressionList_5= ruleExpressionList
                    {
                    kw=(Token)match(input,48,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarSpecAccess().getEqualsSignKeyword_1_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getExpressionListParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionList_5=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ExpressionList_5);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarSpec"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalMyDsl.g:5458:1: entryRuleFunctionDecl returns [String current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final String entryRuleFunctionDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:5458:52: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:5459:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDecl=ruleFunctionDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDecl"


    // $ANTLR start "ruleFunctionDecl"
    // InternalMyDsl.g:5465:1: ruleFunctionDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionName_1 = null;

        AntlrDatatypeRuleToken this_Signature_2 = null;

        AntlrDatatypeRuleToken this_FunctionBody_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5471:2: ( (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) )
            // InternalMyDsl.g:5472:2: (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:5472:2: (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            // InternalMyDsl.g:5473:3: kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )?
            {
            kw=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionDeclAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_18);
            this_FunctionName_1=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FunctionName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionDeclAccess().getSignatureParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_63);
            this_Signature_2=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5498:3: (this_FunctionBody_3= ruleFunctionBody )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==31) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyDsl.g:5499:4: this_FunctionBody_3= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionBodyParserRuleCall_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionBody_3=ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionBody_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDecl"


    // $ANTLR start "entryRuleFunctionName"
    // InternalMyDsl.g:5514:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:5514:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:5515:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalMyDsl.g:5521:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5527:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:5528:2: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_IDENTIFIER_0, grammarAccess.getFunctionNameAccess().getIDENTIFIERTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionBody"
    // InternalMyDsl.g:5538:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // InternalMyDsl.g:5538:52: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalMyDsl.g:5539:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBody.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // InternalMyDsl.g:5545:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Block_0= ruleBlock ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Block_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5551:2: (this_Block_0= ruleBlock )
            // InternalMyDsl.g:5552:2: this_Block_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlockParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Block_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Block_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleMethodDecl"
    // InternalMyDsl.g:5565:1: entryRuleMethodDecl returns [String current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final String entryRuleMethodDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodDecl = null;


        try {
            // InternalMyDsl.g:5565:50: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalMyDsl.g:5566:2: iv_ruleMethodDecl= ruleMethodDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodDecl=ruleMethodDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // InternalMyDsl.g:5572:1: ruleMethodDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Receiver_1 = null;

        AntlrDatatypeRuleToken this_MethodName_2 = null;

        AntlrDatatypeRuleToken this_Signature_3 = null;

        AntlrDatatypeRuleToken this_FunctionBody_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5578:2: ( (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) )
            // InternalMyDsl.g:5579:2: (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:5579:2: (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            // InternalMyDsl.g:5580:3: kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )?
            {
            kw=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMethodDeclAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getReceiverParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_11);
            this_Receiver_1=ruleReceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Receiver_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getMethodNameParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_18);
            this_MethodName_2=ruleMethodName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_MethodName_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getSignatureParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_63);
            this_Signature_3=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5615:3: (this_FunctionBody_4= ruleFunctionBody )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==31) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalMyDsl.g:5616:4: this_FunctionBody_4= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodDeclAccess().getFunctionBodyParserRuleCall_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionBody_4=ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FunctionBody_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleReceiver"
    // InternalMyDsl.g:5631:1: entryRuleReceiver returns [String current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final String entryRuleReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiver = null;


        try {
            // InternalMyDsl.g:5631:48: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalMyDsl.g:5632:2: iv_ruleReceiver= ruleReceiver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReceiver=ruleReceiver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReceiver.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiver"


    // $ANTLR start "ruleReceiver"
    // InternalMyDsl.g:5638:1: ruleReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Parameters_0= ruleParameters ;
    public final AntlrDatatypeRuleToken ruleReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5644:2: (this_Parameters_0= ruleParameters )
            // InternalMyDsl.g:5645:2: this_Parameters_0= ruleParameters
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getReceiverAccess().getParametersParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Parameters_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiver"


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:5658:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalMyDsl.g:5658:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMyDsl.g:5659:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:5665:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicLit_0 = null;

        AntlrDatatypeRuleToken this_CompositeLit_1 = null;

        AntlrDatatypeRuleToken this_FunctionLit_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5671:2: ( (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit ) )
            // InternalMyDsl.g:5672:2: (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit )
            {
            // InternalMyDsl.g:5672:2: (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit )
            int alt92=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGITS:
            case RULE_STRING_LIT:
            case RULE_INT_LITERAL:
            case 24:
                {
                alt92=1;
                }
                break;
            case RULE_IDENTIFIER:
            case 28:
            case 30:
            case 39:
                {
                alt92=2;
                }
                break;
            case 35:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalMyDsl.g:5673:3: this_BasicLit_0= ruleBasicLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBasicLitParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BasicLit_0=ruleBasicLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BasicLit_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5684:3: this_CompositeLit_1= ruleCompositeLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getCompositeLitParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CompositeLit_1=ruleCompositeLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CompositeLit_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5695:3: this_FunctionLit_2= ruleFunctionLit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getFunctionLitParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionLit_2=ruleFunctionLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FunctionLit_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBasicLit"
    // InternalMyDsl.g:5709:1: entryRuleBasicLit returns [String current=null] : iv_ruleBasicLit= ruleBasicLit EOF ;
    public final String entryRuleBasicLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicLit = null;


        try {
            // InternalMyDsl.g:5709:48: (iv_ruleBasicLit= ruleBasicLit EOF )
            // InternalMyDsl.g:5710:2: iv_ruleBasicLit= ruleBasicLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicLit=ruleBasicLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicLit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicLit"


    // $ANTLR start "ruleBasicLit"
    // InternalMyDsl.g:5716:1: ruleBasicLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_LITERAL_0= RULE_INT_LITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit ) ;
    public final AntlrDatatypeRuleToken ruleBasicLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_LITERAL_0=null;
        Token this_STRING_LIT_1=null;
        AntlrDatatypeRuleToken this_float_literal_2 = null;

        AntlrDatatypeRuleToken this_Imaginary_lit_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5722:2: ( (this_INT_LITERAL_0= RULE_INT_LITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit ) )
            // InternalMyDsl.g:5723:2: (this_INT_LITERAL_0= RULE_INT_LITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit )
            {
            // InternalMyDsl.g:5723:2: (this_INT_LITERAL_0= RULE_INT_LITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit )
            int alt93=4;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalMyDsl.g:5724:3: this_INT_LITERAL_0= RULE_INT_LITERAL
                    {
                    this_INT_LITERAL_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_LITERAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_LITERAL_0, grammarAccess.getBasicLitAccess().getINT_LITERALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5732:3: this_STRING_LIT_1= RULE_STRING_LIT
                    {
                    this_STRING_LIT_1=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_LIT_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_LIT_1, grammarAccess.getBasicLitAccess().getSTRING_LITTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5740:3: this_float_literal_2= rulefloat_literal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getFloat_literalParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float_literal_2=rulefloat_literal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_float_literal_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5751:3: this_Imaginary_lit_3= ruleImaginary_lit
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getImaginary_litParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Imaginary_lit_3=ruleImaginary_lit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Imaginary_lit_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicLit"


    // $ANTLR start "entryRuleOperandName"
    // InternalMyDsl.g:5765:1: entryRuleOperandName returns [String current=null] : iv_ruleOperandName= ruleOperandName EOF ;
    public final String entryRuleOperandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperandName = null;


        try {
            // InternalMyDsl.g:5765:51: (iv_ruleOperandName= ruleOperandName EOF )
            // InternalMyDsl.g:5766:2: iv_ruleOperandName= ruleOperandName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandName=ruleOperandName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandName"


    // $ANTLR start "ruleOperandName"
    // InternalMyDsl.g:5772:1: ruleOperandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleOperandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_OperandNameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5778:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha ) )
            // InternalMyDsl.g:5779:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha )
            {
            // InternalMyDsl.g:5779:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha )
            // InternalMyDsl.g:5780:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getOperandNameAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOperandNameAccess().getOperandNameLinhaParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_OperandNameLinha_1=ruleOperandNameLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_OperandNameLinha_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandName"


    // $ANTLR start "entryRuleOperandNameLinha"
    // InternalMyDsl.g:5801:1: entryRuleOperandNameLinha returns [String current=null] : iv_ruleOperandNameLinha= ruleOperandNameLinha EOF ;
    public final String entryRuleOperandNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperandNameLinha = null;


        try {
            // InternalMyDsl.g:5801:56: (iv_ruleOperandNameLinha= ruleOperandNameLinha EOF )
            // InternalMyDsl.g:5802:2: iv_ruleOperandNameLinha= ruleOperandNameLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandNameLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperandNameLinha=ruleOperandNameLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperandNameLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperandNameLinha"


    // $ANTLR start "ruleOperandNameLinha"
    // InternalMyDsl.g:5808:1: ruleOperandNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleOperandNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5814:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:5815:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:5815:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==24) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ANY_OTHER) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalMyDsl.g:5816:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:5816:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:5817:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getOperandNameLinhaAccess().getFullStopKeyword_0_0());
                      			
                    }
                    this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_1, grammarAccess.getOperandNameLinhaAccess().getIDENTIFIERTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5831:3: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_2, grammarAccess.getOperandNameLinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperandNameLinha"


    // $ANTLR start "entryRuleCompositeLit"
    // InternalMyDsl.g:5842:1: entryRuleCompositeLit returns [String current=null] : iv_ruleCompositeLit= ruleCompositeLit EOF ;
    public final String entryRuleCompositeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeLit = null;


        try {
            // InternalMyDsl.g:5842:52: (iv_ruleCompositeLit= ruleCompositeLit EOF )
            // InternalMyDsl.g:5843:2: iv_ruleCompositeLit= ruleCompositeLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompositeLit=ruleCompositeLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeLit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeLit"


    // $ANTLR start "ruleCompositeLit"
    // InternalMyDsl.g:5849:1: ruleCompositeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleCompositeLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralType_0 = null;

        AntlrDatatypeRuleToken this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5855:2: ( (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue ) )
            // InternalMyDsl.g:5856:2: (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalMyDsl.g:5856:2: (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue )
            // InternalMyDsl.g:5857:3: this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_LiteralType_0=ruleLiteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LiteralType_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralValueParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_LiteralValue_1=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_LiteralValue_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeLit"


    // $ANTLR start "entryRuleLiteralType"
    // InternalMyDsl.g:5881:1: entryRuleLiteralType returns [String current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final String entryRuleLiteralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralType = null;


        try {
            // InternalMyDsl.g:5881:51: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalMyDsl.g:5882:2: iv_ruleLiteralType= ruleLiteralType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralType=ruleLiteralType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralType"


    // $ANTLR start "ruleLiteralType"
    // InternalMyDsl.g:5888:1: ruleLiteralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StructType_0 = null;

        AntlrDatatypeRuleToken this_MapType_1 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;

        AntlrDatatypeRuleToken this_LiteralTypeLinha_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5894:2: ( (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) ) )
            // InternalMyDsl.g:5895:2: (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) )
            {
            // InternalMyDsl.g:5895:2: (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt95=1;
                }
                break;
            case 39:
                {
                alt95=2;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt95=3;
                }
                break;
            case 28:
                {
                alt95=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalMyDsl.g:5896:3: this_StructType_0= ruleStructType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getStructTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StructType_0=ruleStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_StructType_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5907:3: this_MapType_1= ruleMapType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getMapTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapType_1=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MapType_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:5918:3: this_TypeName_2= ruleTypeName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralTypeAccess().getTypeNameParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeName_2=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TypeName_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5929:3: (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha )
                    {
                    // InternalMyDsl.g:5929:3: (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha )
                    // InternalMyDsl.g:5930:4: kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha
                    {
                    kw=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeAccess().getLiteralTypeLinhaParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralTypeLinha_4=ruleLiteralTypeLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LiteralTypeLinha_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralType"


    // $ANTLR start "entryRuleLiteralTypeLinha"
    // InternalMyDsl.g:5950:1: entryRuleLiteralTypeLinha returns [String current=null] : iv_ruleLiteralTypeLinha= ruleLiteralTypeLinha EOF ;
    public final String entryRuleLiteralTypeLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralTypeLinha = null;


        try {
            // InternalMyDsl.g:5950:56: (iv_ruleLiteralTypeLinha= ruleLiteralTypeLinha EOF )
            // InternalMyDsl.g:5951:2: iv_ruleLiteralTypeLinha= ruleLiteralTypeLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralTypeLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralTypeLinha=ruleLiteralTypeLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralTypeLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralTypeLinha"


    // $ANTLR start "ruleLiteralTypeLinha"
    // InternalMyDsl.g:5957:1: ruleLiteralTypeLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteralTypeLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_0 = null;

        AntlrDatatypeRuleToken this_ElementType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_5 = null;

        AntlrDatatypeRuleToken this_ElementType_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5963:2: ( ( ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) ) )
            // InternalMyDsl.g:5964:2: ( ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) )
            {
            // InternalMyDsl.g:5964:2: ( ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) )
            int alt96=3;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // InternalMyDsl.g:5965:3: ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType )
                    {
                    // InternalMyDsl.g:5965:3: ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType )
                    // InternalMyDsl.g:5966:4: ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType
                    {
                    // InternalMyDsl.g:5966:4: ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength )
                    // InternalMyDsl.g:5967:5: ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralTypeLinhaAccess().getArrayLengthParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    this_ArrayLength_0=ruleArrayLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ArrayLength_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeLinhaAccess().getRightSquareBracketKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeLinhaAccess().getElementTypeParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementType_2=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5996:3: (kw= '...' kw= ']' this_ElementType_5= ruleElementType )
                    {
                    // InternalMyDsl.g:5996:3: (kw= '...' kw= ']' this_ElementType_5= ruleElementType )
                    // InternalMyDsl.g:5997:4: kw= '...' kw= ']' this_ElementType_5= ruleElementType
                    {
                    kw=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeLinhaAccess().getFullStopFullStopFullStopKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeLinhaAccess().getRightSquareBracketKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeLinhaAccess().getElementTypeParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementType_5=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6019:3: (kw= ']' this_ElementType_7= ruleElementType )
                    {
                    // InternalMyDsl.g:6019:3: (kw= ']' this_ElementType_7= ruleElementType )
                    // InternalMyDsl.g:6020:4: kw= ']' this_ElementType_7= ruleElementType
                    {
                    kw=(Token)match(input,29,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeLinhaAccess().getRightSquareBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeLinhaAccess().getElementTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ElementType_7=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralTypeLinha"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalMyDsl.g:6040:1: entryRuleLiteralValue returns [String current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final String entryRuleLiteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralValue = null;


        try {
            // InternalMyDsl.g:6040:52: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalMyDsl.g:6041:2: iv_ruleLiteralValue= ruleLiteralValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralValue=ruleLiteralValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValue.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalMyDsl.g:6047:1: ruleLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ElementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6053:2: ( (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) )
            // InternalMyDsl.g:6054:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            {
            // InternalMyDsl.g:6054:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            // InternalMyDsl.g:6055:3: kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,31,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyDsl.g:6060:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?
            int alt98=2;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // InternalMyDsl.g:6061:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )?
                    {
                    // InternalMyDsl.g:6061:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList )
                    // InternalMyDsl.g:6062:5: ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralValueAccess().getElementListParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_65);
                    this_ElementList_1=ruleElementList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ElementList_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    // InternalMyDsl.g:6078:4: (kw= ',' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==36) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalMyDsl.g:6079:5: kw= ','
                            {
                            kw=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getLiteralValueAccess().getCommaKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleElementList"
    // InternalMyDsl.g:6095:1: entryRuleElementList returns [String current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final String entryRuleElementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementList = null;


        try {
            // InternalMyDsl.g:6095:51: (iv_ruleElementList= ruleElementList EOF )
            // InternalMyDsl.g:6096:2: iv_ruleElementList= ruleElementList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElementList=ruleElementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementList"


    // $ANTLR start "ruleElementList"
    // InternalMyDsl.g:6102:1: ruleElementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) ;
    public final AntlrDatatypeRuleToken ruleElementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_KeyedElement_0 = null;

        AntlrDatatypeRuleToken this_KeyedElement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6108:2: ( ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) )
            // InternalMyDsl.g:6109:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            {
            // InternalMyDsl.g:6109:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            // InternalMyDsl.g:6110:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            {
            // InternalMyDsl.g:6110:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement )
            // InternalMyDsl.g:6111:4: ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_22);
            this_KeyedElement_0=ruleKeyedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_KeyedElement_0);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }

            // InternalMyDsl.g:6127:3: (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==36) ) {
                    int LA99_1 = input.LA(2);

                    if ( (LA99_1==RULE_DECIMAL_DIGITS||LA99_1==RULE_IDENTIFIER||(LA99_1>=RULE_STRING_LIT && LA99_1<=RULE_UNARY_OP)||LA99_1==RULE_INT_LITERAL||LA99_1==24||LA99_1==26||LA99_1==28||(LA99_1>=30 && LA99_1<=31)||(LA99_1>=34 && LA99_1<=35)||(LA99_1>=37 && LA99_1<=41)) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // InternalMyDsl.g:6128:4: kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    {
            	    kw=(Token)match(input,36,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:6133:4: ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    // InternalMyDsl.g:6134:5: ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_1_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    this_KeyedElement_2=ruleKeyedElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(this_KeyedElement_2);
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementList"


    // $ANTLR start "entryRuleKeyedElement"
    // InternalMyDsl.g:6155:1: entryRuleKeyedElement returns [String current=null] : iv_ruleKeyedElement= ruleKeyedElement EOF ;
    public final String entryRuleKeyedElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyedElement = null;


        try {
            // InternalMyDsl.g:6155:52: (iv_ruleKeyedElement= ruleKeyedElement EOF )
            // InternalMyDsl.g:6156:2: iv_ruleKeyedElement= ruleKeyedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyedElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKeyedElement=ruleKeyedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyedElement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyedElement"


    // $ANTLR start "ruleKeyedElement"
    // InternalMyDsl.g:6162:1: ruleKeyedElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) ;
    public final AntlrDatatypeRuleToken ruleKeyedElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_Element_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6168:2: ( ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) )
            // InternalMyDsl.g:6169:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            {
            // InternalMyDsl.g:6169:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            // InternalMyDsl.g:6170:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement
            {
            // InternalMyDsl.g:6170:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalMyDsl.g:6171:4: ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' )
                    {
                    // InternalMyDsl.g:6176:4: (this_Key_0= ruleKey kw= ':' )
                    // InternalMyDsl.g:6177:5: this_Key_0= ruleKey kw= ':'
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKeyedElementAccess().getKeyParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_36);
                    this_Key_0=ruleKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Key_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,44,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getKeyedElementAccess().getColonKeyword_0_0_1());
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getKeyedElementAccess().getElementParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_Element_2=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Element_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyedElement"


    // $ANTLR start "entryRuleKey"
    // InternalMyDsl.g:6208:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalMyDsl.g:6208:43: (iv_ruleKey= ruleKey EOF )
            // InternalMyDsl.g:6209:2: iv_ruleKey= ruleKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKey.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalMyDsl.g:6215:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FieldName_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_LiteralValue_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6221:2: ( (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) )
            // InternalMyDsl.g:6222:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            {
            // InternalMyDsl.g:6222:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            int alt101=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==EOF||LA101_1==44) ) {
                    alt101=1;
                }
                else if ( (LA101_1==RULE_ANY_OTHER||LA101_1==24) ) {
                    alt101=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMAL_DIGITS:
            case RULE_STRING_LIT:
            case RULE_UNARY_OP:
            case RULE_INT_LITERAL:
            case 24:
            case 26:
            case 28:
            case 30:
            case 34:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt101=2;
                }
                break;
            case 31:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalMyDsl.g:6223:3: this_FieldName_0= ruleFieldName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getFieldNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FieldName_0=ruleFieldName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FieldName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6234:3: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Expression_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6245:3: this_LiteralValue_2= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getKeyAccess().getLiteralValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_2=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralValue_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleFieldName"
    // InternalMyDsl.g:6259:1: entryRuleFieldName returns [String current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final String entryRuleFieldName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldName = null;


        try {
            // InternalMyDsl.g:6259:49: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalMyDsl.g:6260:2: iv_ruleFieldName= ruleFieldName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFieldName=ruleFieldName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldName"


    // $ANTLR start "ruleFieldName"
    // InternalMyDsl.g:6266:1: ruleFieldName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFieldName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6272:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:6273:2: this_IDENTIFIER_0= RULE_IDENTIFIER
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IDENTIFIER_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_IDENTIFIER_0, grammarAccess.getFieldNameAccess().getIDENTIFIERTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldName"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:6283:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalMyDsl.g:6283:47: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:6284:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:6290:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6296:2: ( (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) )
            // InternalMyDsl.g:6297:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalMyDsl.g:6297:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_DECIMAL_DIGITS||LA102_0==RULE_IDENTIFIER||(LA102_0>=RULE_STRING_LIT && LA102_0<=RULE_UNARY_OP)||LA102_0==RULE_INT_LITERAL||LA102_0==24||LA102_0==26||LA102_0==28||LA102_0==30||(LA102_0>=34 && LA102_0<=35)||(LA102_0>=37 && LA102_0<=41)) ) {
                alt102=1;
            }
            else if ( (LA102_0==31) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalMyDsl.g:6298:3: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Expression_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6309:3: this_LiteralValue_1= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getElementAccess().getLiteralValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_1=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LiteralValue_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFunctionLit"
    // InternalMyDsl.g:6323:1: entryRuleFunctionLit returns [String current=null] : iv_ruleFunctionLit= ruleFunctionLit EOF ;
    public final String entryRuleFunctionLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionLit = null;


        try {
            // InternalMyDsl.g:6323:51: (iv_ruleFunctionLit= ruleFunctionLit EOF )
            // InternalMyDsl.g:6324:2: iv_ruleFunctionLit= ruleFunctionLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionLit=ruleFunctionLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionLit"


    // $ANTLR start "ruleFunctionLit"
    // InternalMyDsl.g:6330:1: ruleFunctionLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody ) ;
    public final AntlrDatatypeRuleToken ruleFunctionLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;

        AntlrDatatypeRuleToken this_FunctionBody_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6336:2: ( (kw= 'func' this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody ) )
            // InternalMyDsl.g:6337:2: (kw= 'func' this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody )
            {
            // InternalMyDsl.g:6337:2: (kw= 'func' this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody )
            // InternalMyDsl.g:6338:3: kw= 'func' this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody
            {
            kw=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getFunctionLitAccess().getFuncKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionLitAccess().getSignatureParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_14);
            this_Signature_1=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionLitAccess().getFunctionBodyParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_FunctionBody_2=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FunctionBody_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionLit"


    // $ANTLR start "entryRuleReceiverType"
    // InternalMyDsl.g:6367:1: entryRuleReceiverType returns [String current=null] : iv_ruleReceiverType= ruleReceiverType EOF ;
    public final String entryRuleReceiverType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiverType = null;


        try {
            // InternalMyDsl.g:6367:52: (iv_ruleReceiverType= ruleReceiverType EOF )
            // InternalMyDsl.g:6368:2: iv_ruleReceiverType= ruleReceiverType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReceiverTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReceiverType=ruleReceiverType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReceiverType.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiverType"


    // $ANTLR start "ruleReceiverType"
    // InternalMyDsl.g:6374:1: ruleReceiverType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleReceiverType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6380:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:6381:2: this_Type_0= ruleType
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getReceiverTypeAccess().getTypeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Type_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiverType"


    // $ANTLR start "entryRuleSourceFile"
    // InternalMyDsl.g:6394:1: entryRuleSourceFile returns [String current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final String entryRuleSourceFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSourceFile = null;


        try {
            // InternalMyDsl.g:6394:50: (iv_ruleSourceFile= ruleSourceFile EOF )
            // InternalMyDsl.g:6395:2: iv_ruleSourceFile= ruleSourceFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSourceFile=ruleSourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFile.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceFile"


    // $ANTLR start "ruleSourceFile"
    // InternalMyDsl.g:6401:1: ruleSourceFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruleSourceFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageClause_0 = null;

        AntlrDatatypeRuleToken this_ImportDecl_2 = null;

        AntlrDatatypeRuleToken this_TopLevelDecl_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6407:2: ( (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) )
            // InternalMyDsl.g:6408:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            {
            // InternalMyDsl.g:6408:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            // InternalMyDsl.g:6409:3: this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSourceFileAccess().getPackageClauseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_PackageClause_0=rulePackageClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PackageClause_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,32,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1());
              		
            }
            // InternalMyDsl.g:6424:3: (this_ImportDecl_2= ruleImportDecl kw= ';' )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==68) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalMyDsl.g:6425:4: this_ImportDecl_2= ruleImportDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    this_ImportDecl_2=ruleImportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ImportDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,32,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // InternalMyDsl.g:6441:3: (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==35||LA104_0==54||(LA104_0>=65 && LA104_0<=66)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalMyDsl.g:6442:4: this_TopLevelDecl_4= ruleTopLevelDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getTopLevelDeclParserRuleCall_3_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_16);
            	    this_TopLevelDecl_4=ruleTopLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TopLevelDecl_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,32,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceFile"


    // $ANTLR start "entryRulePackageClause"
    // InternalMyDsl.g:6462:1: entryRulePackageClause returns [String current=null] : iv_rulePackageClause= rulePackageClause EOF ;
    public final String entryRulePackageClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageClause = null;


        try {
            // InternalMyDsl.g:6462:53: (iv_rulePackageClause= rulePackageClause EOF )
            // InternalMyDsl.g:6463:2: iv_rulePackageClause= rulePackageClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageClauseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageClause=rulePackageClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageClause.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageClause"


    // $ANTLR start "rulePackageClause"
    // InternalMyDsl.g:6469:1: rulePackageClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_PackageName_1= rulePackageName ) ;
    public final AntlrDatatypeRuleToken rulePackageClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6475:2: ( (kw= 'package' this_PackageName_1= rulePackageName ) )
            // InternalMyDsl.g:6476:2: (kw= 'package' this_PackageName_1= rulePackageName )
            {
            // InternalMyDsl.g:6476:2: (kw= 'package' this_PackageName_1= rulePackageName )
            // InternalMyDsl.g:6477:3: kw= 'package' this_PackageName_1= rulePackageName
            {
            kw=(Token)match(input,67,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getPackageClauseAccess().getPackageKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPackageClauseAccess().getPackageNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_PackageName_1=rulePackageName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PackageName_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageClause"


    // $ANTLR start "entryRuleImportDecl"
    // InternalMyDsl.g:6496:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalMyDsl.g:6496:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalMyDsl.g:6497:2: iv_ruleImportDecl= ruleImportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportDecl=ruleImportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // InternalMyDsl.g:6503:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6509:2: ( (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:6510:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:6510:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:6511:3: kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,68,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
              		
            }
            // InternalMyDsl.g:6516:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_IDENTIFIER||LA106_0==RULE_STRING_LIT||LA106_0==24) ) {
                alt106=1;
            }
            else if ( (LA106_0==26) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalMyDsl.g:6517:4: this_ImportSpec_1= ruleImportSpec
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ImportSpec_1=ruleImportSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ImportSpec_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6528:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:6528:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:6529:5: kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,26,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:6534:5: (this_ImportSpec_3= ruleImportSpec kw= ';' )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==RULE_IDENTIFIER||LA105_0==RULE_STRING_LIT||LA105_0==24) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalMyDsl.g:6535:6: this_ImportSpec_3= ruleImportSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    this_ImportSpec_3=ruleImportSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ImportSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,32,FOLLOW_69); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getImportDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleImportSpec"
    // InternalMyDsl.g:6562:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalMyDsl.g:6562:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalMyDsl.g:6563:2: iv_ruleImportSpec= ruleImportSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportSpec=ruleImportSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportSpec.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportSpec"


    // $ANTLR start "ruleImportSpec"
    // InternalMyDsl.g:6569:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;

        AntlrDatatypeRuleToken this_ImportPath_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6575:2: ( ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) )
            // InternalMyDsl.g:6576:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            {
            // InternalMyDsl.g:6576:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            // InternalMyDsl.g:6577:3: (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath
            {
            // InternalMyDsl.g:6577:3: (kw= '.' | this_PackageName_1= rulePackageName )?
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==24) ) {
                alt107=1;
            }
            else if ( (LA107_0==RULE_IDENTIFIER) ) {
                alt107=2;
            }
            switch (alt107) {
                case 1 :
                    // InternalMyDsl.g:6578:4: kw= '.'
                    {
                    kw=(Token)match(input,24,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6584:4: this_PackageName_1= rulePackageName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImportSpecAccess().getPackageNameParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_70);
                    this_PackageName_1=rulePackageName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PackageName_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImportSpecAccess().getImportPathParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_2);
            this_ImportPath_2=ruleImportPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ImportPath_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportSpec"


    // $ANTLR start "entryRuleImportPath"
    // InternalMyDsl.g:6609:1: entryRuleImportPath returns [String current=null] : iv_ruleImportPath= ruleImportPath EOF ;
    public final String entryRuleImportPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportPath = null;


        try {
            // InternalMyDsl.g:6609:50: (iv_ruleImportPath= ruleImportPath EOF )
            // InternalMyDsl.g:6610:2: iv_ruleImportPath= ruleImportPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportPathRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImportPath=ruleImportPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportPath.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportPath"


    // $ANTLR start "ruleImportPath"
    // InternalMyDsl.g:6616:1: ruleImportPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleImportPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6622:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:6623:2: this_STRING_LIT_0= RULE_STRING_LIT
            {
            this_STRING_LIT_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_LIT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_LIT_0, grammarAccess.getImportPathAccess().getSTRING_LITTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportPath"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:939:4: ( ruleResult )
        // InternalMyDsl.g:939:5: ruleResult
        {
        pushFollow(FOLLOW_2);
        ruleResult();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:971:4: ( ruleParameters )
        // InternalMyDsl.g:971:5: ruleParameters
        {
        pushFollow(FOLLOW_2);
        ruleParameters();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2287:5: ( ruleExpression )
        // InternalMyDsl.g:2287:6: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2749:6: ( ruleExpressionList )
        // InternalMyDsl.g:2749:7: ruleExpressionList
        {
        pushFollow(FOLLOW_2);
        ruleExpressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMyDsl

    // $ANTLR start synpred5_InternalMyDsl
    public final void synpred5_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:5967:5: ( ruleArrayLength )
        // InternalMyDsl.g:5967:6: ruleArrayLength
        {
        pushFollow(FOLLOW_2);
        ruleArrayLength();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred6_InternalMyDsl
    public final void synpred6_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:6062:5: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:6062:6: ( ruleKey ':' )
        {
        // InternalMyDsl.g:6062:6: ( ruleKey ':' )
        // InternalMyDsl.g:6063:6: ruleKey ':'
        {
        pushFollow(FOLLOW_36);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:6171:4: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:6171:5: ( ruleKey ':' )
        {
        // InternalMyDsl.g:6171:5: ( ruleKey ':' )
        // InternalMyDsl.g:6172:5: ruleKey ':'
        {
        pushFollow(FOLLOW_36);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // Delegated rules

    public final boolean synpred9_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA98 dfa98 = new DFA98(this);
    protected DFA100 dfa100 = new DFA100(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\13\25\uffff";
    static final String dfa_3s = "\1\6\1\0\24\uffff";
    static final String dfa_4s = "\1\60\1\0\24\uffff";
    static final String dfa_5s = "\2\uffff\11\1\1\2\12\uffff";
    static final String dfa_6s = "\1\0\1\1\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\13\17\uffff\1\13\1\uffff\1\1\1\13\1\3\1\13\1\4\2\13\1\uffff\1\5\1\6\2\13\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\13",
            "\1\uffff",
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
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "938:3: ( ( ruleResult )=>this_Result_1= ruleResult )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==26) ) {s = 1;}

                        else if ( (LA12_0==RULE_IDENTIFIER) && (synpred1_InternalMyDsl())) {s = 2;}

                        else if ( (LA12_0==28) && (synpred1_InternalMyDsl())) {s = 3;}

                        else if ( (LA12_0==30) && (synpred1_InternalMyDsl())) {s = 4;}

                        else if ( (LA12_0==34) && (synpred1_InternalMyDsl())) {s = 5;}

                        else if ( (LA12_0==35) && (synpred1_InternalMyDsl())) {s = 6;}

                        else if ( (LA12_0==38) && (synpred1_InternalMyDsl())) {s = 7;}

                        else if ( (LA12_0==39) && (synpred1_InternalMyDsl())) {s = 8;}

                        else if ( (LA12_0==40) && (synpred1_InternalMyDsl())) {s = 9;}

                        else if ( (LA12_0==41) && (synpred1_InternalMyDsl())) {s = 10;}

                        else if ( (LA12_0==EOF||LA12_0==RULE_STRING_LIT||LA12_0==24||LA12_0==27||LA12_0==29||(LA12_0>=31 && LA12_0<=32)||(LA12_0>=36 && LA12_0<=37)||LA12_0==44||LA12_0==48) ) {s = 11;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\6\1\0\12\uffff";
    static final String dfa_10s = "\1\51\1\0\12\uffff";
    static final String dfa_11s = "\2\uffff\1\2\10\uffff\1\1";
    static final String dfa_12s = "\1\uffff\1\0\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\23\uffff\1\1\1\uffff\1\2\1\uffff\1\2\3\uffff\2\2\2\uffff\4\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "969:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\22\uffff";
    static final String dfa_15s = "\1\4\4\uffff\3\0\1\uffff\7\0\2\uffff";
    static final String dfa_16s = "\1\51\4\uffff\3\0\1\uffff\7\0\2\uffff";
    static final String dfa_17s = "\1\uffff\4\1\3\uffff\1\1\7\uffff\1\1\1\2";
    static final String dfa_18s = "\1\0\4\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\1\uffff\1\11\1\uffff\1\2\1\20\3\uffff\1\1\12\uffff\1\4\1\uffff\1\12\1\uffff\1\13\1\uffff\1\5\3\uffff\1\14\1\7\1\uffff\1\10\1\15\1\6\1\16\1\17",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2284:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==RULE_INT_LITERAL) && (synpred3_InternalMyDsl())) {s = 1;}

                        else if ( (LA30_0==RULE_STRING_LIT) && (synpred3_InternalMyDsl())) {s = 2;}

                        else if ( (LA30_0==RULE_DECIMAL_DIGITS) && (synpred3_InternalMyDsl())) {s = 3;}

                        else if ( (LA30_0==24) && (synpred3_InternalMyDsl())) {s = 4;}

                        else if ( (LA30_0==30) ) {s = 5;}

                        else if ( (LA30_0==39) ) {s = 6;}

                        else if ( (LA30_0==35) ) {s = 7;}

                        else if ( (LA30_0==37) && (synpred3_InternalMyDsl())) {s = 8;}

                        else if ( (LA30_0==RULE_IDENTIFIER) ) {s = 9;}

                        else if ( (LA30_0==26) ) {s = 10;}

                        else if ( (LA30_0==28) ) {s = 11;}

                        else if ( (LA30_0==34) ) {s = 12;}

                        else if ( (LA30_0==38) ) {s = 13;}

                        else if ( (LA30_0==40) ) {s = 14;}

                        else if ( (LA30_0==41) ) {s = 15;}

                        else if ( (LA30_0==RULE_UNARY_OP) && (synpred3_InternalMyDsl())) {s = 16;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_10 = input.LA(1);

                         
                        int index30_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_11 = input.LA(1);

                         
                        int index30_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_12 = input.LA(1);

                         
                        int index30_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_13 = input.LA(1);

                         
                        int index30_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_14 = input.LA(1);

                         
                        int index30_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA30_15 = input.LA(1);

                         
                        int index30_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index30_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2747:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==RULE_INT_LITERAL) && (synpred4_InternalMyDsl())) {s = 1;}

                        else if ( (LA40_0==RULE_STRING_LIT) && (synpred4_InternalMyDsl())) {s = 2;}

                        else if ( (LA40_0==RULE_DECIMAL_DIGITS) && (synpred4_InternalMyDsl())) {s = 3;}

                        else if ( (LA40_0==24) && (synpred4_InternalMyDsl())) {s = 4;}

                        else if ( (LA40_0==30) ) {s = 5;}

                        else if ( (LA40_0==39) ) {s = 6;}

                        else if ( (LA40_0==35) ) {s = 7;}

                        else if ( (LA40_0==37) && (synpred4_InternalMyDsl())) {s = 8;}

                        else if ( (LA40_0==RULE_IDENTIFIER) ) {s = 9;}

                        else if ( (LA40_0==26) ) {s = 10;}

                        else if ( (LA40_0==28) ) {s = 11;}

                        else if ( (LA40_0==34) ) {s = 12;}

                        else if ( (LA40_0==38) ) {s = 13;}

                        else if ( (LA40_0==40) ) {s = 14;}

                        else if ( (LA40_0==41) ) {s = 15;}

                        else if ( (LA40_0==RULE_UNARY_OP) && (synpred4_InternalMyDsl())) {s = 16;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_6 = input.LA(1);

                         
                        int index40_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_7 = input.LA(1);

                         
                        int index40_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_9 = input.LA(1);

                         
                        int index40_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_10 = input.LA(1);

                         
                        int index40_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_11 = input.LA(1);

                         
                        int index40_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA40_12 = input.LA(1);

                         
                        int index40_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA40_13 = input.LA(1);

                         
                        int index40_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA40_14 = input.LA(1);

                         
                        int index40_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA40_15 = input.LA(1);

                         
                        int index40_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index40_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\21\uffff";
    static final String dfa_21s = "\1\4\1\uffff\1\7\16\uffff";
    static final String dfa_22s = "\1\102\1\uffff\1\57\16\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\2";
    static final String dfa_24s = "\21\uffff}>";
    static final String[] dfa_25s = {
            "\1\3\1\uffff\1\2\1\uffff\2\3\3\uffff\1\3\12\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\12\2\uffff\2\3\1\uffff\5\3\3\uffff\1\17\1\16\3\uffff\1\15\2\uffff\1\14\1\1\1\13\1\uffff\1\11\1\10\1\7\1\6\1\5\1\4\2\uffff\2\1",
            "",
            "\1\3\20\uffff\1\3\13\uffff\1\3\7\uffff\1\20\2\uffff\1\3",
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
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2989:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )";
        }
    }
    static final String dfa_26s = "\11\uffff";
    static final String dfa_27s = "\1\4\1\uffff\1\7\1\uffff\1\6\1\4\1\44\2\uffff";
    static final String dfa_28s = "\1\60\1\uffff\1\57\1\uffff\1\6\1\61\1\57\2\uffff";
    static final String dfa_29s = "\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\1\4";
    static final String dfa_30s = "\11\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\1\uffff\1\2\1\uffff\2\1\3\uffff\1\1\12\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\2\1\1\3\5\1\6\uffff\1\3",
            "",
            "\1\1\20\uffff\1\1\13\uffff\1\4\12\uffff\1\5",
            "",
            "\1\6",
            "\1\7\1\uffff\1\7\1\uffff\2\7\3\uffff\1\7\12\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\5\7\7\uffff\1\10",
            "\1\4\12\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3356:4: ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) )";
        }
    }
    static final String dfa_32s = "\15\uffff";
    static final String dfa_33s = "\7\uffff\1\12\3\uffff\2\12";
    static final String dfa_34s = "\1\4\2\uffff\1\5\1\4\1\uffff\1\4\1\30\2\5\1\uffff\2\30";
    static final String dfa_35s = "\1\30\2\uffff\1\31\1\4\1\uffff\1\4\1\34\2\5\1\uffff\2\34";
    static final String dfa_36s = "\1\uffff\1\1\1\2\2\uffff\1\4\4\uffff\1\3\2\uffff";
    static final String dfa_37s = "\15\uffff}>";
    static final String[] dfa_38s = {
            "\1\3\3\uffff\1\2\4\uffff\1\1\12\uffff\1\4",
            "",
            "",
            "\1\7\22\uffff\1\6\1\5",
            "\1\10",
            "",
            "\1\11",
            "\1\12\1\5\1\12\1\uffff\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\12\1\5\1\12\1\uffff\1\12",
            "\1\12\1\5\1\12\1\uffff\1\12"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "5723:2: (this_INT_LITERAL_0= RULE_INT_LITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit )";
        }
    }
    static final String dfa_39s = "\23\uffff";
    static final String dfa_40s = "\1\4\7\uffff\1\0\12\uffff";
    static final String dfa_41s = "\1\51\7\uffff\1\0\12\uffff";
    static final String dfa_42s = "\1\uffff\7\1\1\uffff\10\1\1\3\1\2";
    static final String dfa_43s = "\1\0\7\uffff\1\1\12\uffff}>";
    static final String[] dfa_44s = {
            "\1\3\1\uffff\1\11\1\uffff\1\2\1\20\3\uffff\1\1\12\uffff\1\4\1\uffff\1\12\1\uffff\1\13\1\21\1\5\3\uffff\1\14\1\7\1\uffff\1\10\1\15\1\6\1\16\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "5964:2: ( ( ( ( ruleArrayLength )=>this_ArrayLength_0= ruleArrayLength ) kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_0 = input.LA(1);

                         
                        int index96_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA96_0==RULE_INT_LITERAL) && (synpred5_InternalMyDsl())) {s = 1;}

                        else if ( (LA96_0==RULE_STRING_LIT) && (synpred5_InternalMyDsl())) {s = 2;}

                        else if ( (LA96_0==RULE_DECIMAL_DIGITS) && (synpred5_InternalMyDsl())) {s = 3;}

                        else if ( (LA96_0==24) && (synpred5_InternalMyDsl())) {s = 4;}

                        else if ( (LA96_0==30) && (synpred5_InternalMyDsl())) {s = 5;}

                        else if ( (LA96_0==39) && (synpred5_InternalMyDsl())) {s = 6;}

                        else if ( (LA96_0==35) && (synpred5_InternalMyDsl())) {s = 7;}

                        else if ( (LA96_0==37) ) {s = 8;}

                        else if ( (LA96_0==RULE_IDENTIFIER) && (synpred5_InternalMyDsl())) {s = 9;}

                        else if ( (LA96_0==26) && (synpred5_InternalMyDsl())) {s = 10;}

                        else if ( (LA96_0==28) && (synpred5_InternalMyDsl())) {s = 11;}

                        else if ( (LA96_0==34) && (synpred5_InternalMyDsl())) {s = 12;}

                        else if ( (LA96_0==38) && (synpred5_InternalMyDsl())) {s = 13;}

                        else if ( (LA96_0==40) && (synpred5_InternalMyDsl())) {s = 14;}

                        else if ( (LA96_0==41) && (synpred5_InternalMyDsl())) {s = 15;}

                        else if ( (LA96_0==RULE_UNARY_OP) && (synpred5_InternalMyDsl())) {s = 16;}

                        else if ( (LA96_0==29) ) {s = 17;}

                         
                        input.seek(index96_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA96_8 = input.LA(1);

                         
                        int index96_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index96_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\1\4\22\uffff";
    static final String dfa_46s = "\1\51\22\uffff";
    static final String dfa_47s = "\1\uffff\21\1\1\2";
    static final String dfa_48s = "\1\0\22\uffff}>";
    static final String[] dfa_49s = {
            "\1\4\1\uffff\1\1\1\uffff\1\3\1\20\3\uffff\1\2\12\uffff\1\5\1\uffff\1\12\1\uffff\1\13\1\uffff\1\6\1\21\1\uffff\1\22\1\14\1\10\1\uffff\1\11\1\15\1\7\1\16\1\17",
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
            "",
            ""
    };
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "6060:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA98_0 = input.LA(1);

                         
                        int index98_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA98_0==RULE_IDENTIFIER) && (synpred6_InternalMyDsl())) {s = 1;}

                        else if ( (LA98_0==RULE_INT_LITERAL) && (synpred6_InternalMyDsl())) {s = 2;}

                        else if ( (LA98_0==RULE_STRING_LIT) && (synpred6_InternalMyDsl())) {s = 3;}

                        else if ( (LA98_0==RULE_DECIMAL_DIGITS) && (synpred6_InternalMyDsl())) {s = 4;}

                        else if ( (LA98_0==24) && (synpred6_InternalMyDsl())) {s = 5;}

                        else if ( (LA98_0==30) && (synpred6_InternalMyDsl())) {s = 6;}

                        else if ( (LA98_0==39) && (synpred6_InternalMyDsl())) {s = 7;}

                        else if ( (LA98_0==35) && (synpred6_InternalMyDsl())) {s = 8;}

                        else if ( (LA98_0==37) && (synpred6_InternalMyDsl())) {s = 9;}

                        else if ( (LA98_0==26) && (synpred6_InternalMyDsl())) {s = 10;}

                        else if ( (LA98_0==28) && (synpred6_InternalMyDsl())) {s = 11;}

                        else if ( (LA98_0==34) && (synpred6_InternalMyDsl())) {s = 12;}

                        else if ( (LA98_0==38) && (synpred6_InternalMyDsl())) {s = 13;}

                        else if ( (LA98_0==40) && (synpred6_InternalMyDsl())) {s = 14;}

                        else if ( (LA98_0==41) && (synpred6_InternalMyDsl())) {s = 15;}

                        else if ( (LA98_0==RULE_UNARY_OP) && (synpred6_InternalMyDsl())) {s = 16;}

                        else if ( (LA98_0==31) && (synpred6_InternalMyDsl())) {s = 17;}

                        else if ( (LA98_0==33) ) {s = 18;}

                         
                        input.seek(index98_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 98, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_50s = "\24\uffff";
    static final String dfa_51s = "\1\4\21\0\2\uffff";
    static final String dfa_52s = "\1\51\21\0\2\uffff";
    static final String dfa_53s = "\22\uffff\1\1\1\2";
    static final String dfa_54s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] dfa_55s = {
            "\1\4\1\uffff\1\1\1\uffff\1\3\1\20\3\uffff\1\2\12\uffff\1\5\1\uffff\1\12\1\uffff\1\13\1\uffff\1\6\1\21\2\uffff\1\14\1\10\1\uffff\1\11\1\15\1\7\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_50;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "6170:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_1 = input.LA(1);

                         
                        int index100_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA100_2 = input.LA(1);

                         
                        int index100_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA100_3 = input.LA(1);

                         
                        int index100_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA100_4 = input.LA(1);

                         
                        int index100_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA100_5 = input.LA(1);

                         
                        int index100_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA100_6 = input.LA(1);

                         
                        int index100_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA100_7 = input.LA(1);

                         
                        int index100_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA100_8 = input.LA(1);

                         
                        int index100_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA100_9 = input.LA(1);

                         
                        int index100_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA100_10 = input.LA(1);

                         
                        int index100_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA100_11 = input.LA(1);

                         
                        int index100_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA100_12 = input.LA(1);

                         
                        int index100_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA100_13 = input.LA(1);

                         
                        int index100_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA100_14 = input.LA(1);

                         
                        int index100_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA100_15 = input.LA(1);

                         
                        int index100_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA100_16 = input.LA(1);

                         
                        int index100_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA100_17 = input.LA(1);

                         
                        int index100_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000003CC54000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000003EC75002350L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003CC54000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003EC5C000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000003EC54000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C0000001C00L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003EC55002350L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000085000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000085000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000013EC55002350L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000003EC5D002350L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000003008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x7EE463EED5002350L,0x0000000000000006L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x7EE463ECD5002352L,0x0000000000000006L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000003ECD5002350L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x80000210000018C0L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000103FC55002350L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000021000001800L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002001000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0018000200000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x7EE463ECD5002350L,0x0000000000000006L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001021000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000003EC55002150L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000080000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000103CC54000042L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000103CC54000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000003EED5002350L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0040000800000002L,0x0000000000000016L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0040000800000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000005000140L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000009000140L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000001000140L});

}