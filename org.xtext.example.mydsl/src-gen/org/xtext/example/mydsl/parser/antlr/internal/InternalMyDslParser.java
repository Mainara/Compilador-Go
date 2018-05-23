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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMAL_DIGITS", "RULE_EXPONENT_PART", "RULE_IDENTIFIER", "RULE_ANY_OTHER", "RULE_STRING_LIT", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_INTEGERLITERAL", "RULE_LETTER", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'i'", "'('", "')'", "'['", "']'", "'struct'", "'{'", "';'", "'}'", "'*'", "'func'", "','", "'...'", "'interface'", "'map'", "'chan'", "'<-'", "'||'", "'&&'", "':'", "'defer'", "'for'", "':='", "'='", "'range'", "'select'", "'case'", "'default'", "'switch'", "'type'", "'if'", "'else'", "'fallthrough'", "'goto'", "'continue'", "'break'", "'return'", "'go'", "'++'", "'--'", "'const'", "'var'", "'package'", "'import'"
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
    public static final int RULE_ID=16;
    public static final int RULE_MUL_OP=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=15;
    public static final int T__29=29;
    public static final int RULE_INTEGERLITERAL=13;
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
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_STRING=17;
    public static final int RULE_EXPONENT_PART=5;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_DECIMAL_DIGITS=4;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ADD_OP=11;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
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

                if ( (LA1_0==64) ) {
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

                if ( (LA2_1==21) ) {
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
            else if ( (LA2_0==21) ) {
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
                    kw=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
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
                    kw=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
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

                if ( (LA3_1==22) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_EXPONENT_PART||LA3_1==21) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==21) ) {
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

            kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
            case 25:
            case 27:
            case 31:
            case 32:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt4=2;
                }
                break;
            case 23:
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
                    kw=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
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
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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

            if ( (LA5_0==21) ) {
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
                    kw=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
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
            case 25:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 35:
                {
                alt6=5;
                }
                break;
            case 36:
                {
                alt6=6;
                }
                break;
            case 37:
            case 38:
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
                    kw=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
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

            if ( (LA7_0==RULE_DECIMAL_DIGITS||LA7_0==RULE_IDENTIFIER||(LA7_0>=RULE_STRING_LIT && LA7_0<=RULE_UNARY_OP)||LA7_0==RULE_INTEGERLITERAL||LA7_0==21||LA7_0==23||LA7_0==25||LA7_0==27||(LA7_0>=31 && LA7_0<=32)||(LA7_0>=34 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
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
                    kw=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
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
                    kw=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
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
            kw=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getStructKeyword_0());
              		
            }
            kw=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:666:3: (this_FieldDecl_2= ruleFieldDecl kw= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_IDENTIFIER||LA8_0==31) ) {
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
            	    kw=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
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

            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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

                if ( (LA9_1==RULE_ANY_OTHER||LA9_1==21) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_IDENTIFIER||LA9_1==23||LA9_1==25||LA9_1==27||(LA9_1>=31 && LA9_1<=33)||(LA9_1>=35 && LA9_1<=38)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==31) ) {
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

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:774:4: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
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
            kw=(Token)match(input,31,FOLLOW_8); if (state.failed) return current;
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
            kw=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
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
            kw=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1018:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_IDENTIFIER||LA15_0==23||LA15_0==25||LA15_0==27||(LA15_0>=31 && LA15_0<=32)||(LA15_0>=34 && LA15_0<=38)) ) {
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

                    if ( (LA14_0==33) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:1030:5: kw= ','
                            {
                            kw=(Token)match(input,33,FOLLOW_9); if (state.failed) return current;
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

            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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

                if ( (LA16_0==33) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_IDENTIFIER||LA16_1==23||LA16_1==25||LA16_1==27||(LA16_1>=31 && LA16_1<=32)||(LA16_1>=34 && LA16_1<=38)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1072:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,33,FOLLOW_23); if (state.failed) return current;
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

                if ( (LA17_1==RULE_IDENTIFIER||LA17_1==23||LA17_1==25||LA17_1==27||(LA17_1>=31 && LA17_1<=38)) ) {
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

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1120:4: kw= '...'
                    {
                    kw=(Token)match(input,34,FOLLOW_8); if (state.failed) return current;
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
            kw=(Token)match(input,35,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getInterfaceKeyword_0());
              		
            }
            kw=(Token)match(input,28,FOLLOW_11); if (state.failed) return current;
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
            kw=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_2_1());
              			
            }

            }

            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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

                if ( (LA19_1==RULE_ANY_OTHER||LA19_1==21) ) {
                    alt19=2;
                }
                else if ( (LA19_1==23) ) {
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
            kw=(Token)match(input,36,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getMapKeyword_0());
              		
            }
            kw=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
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
            kw=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
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

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==38) ) {
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
                    kw=(Token)match(input,37,FOLLOW_26); if (state.failed) return current;
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
                    kw=(Token)match(input,38,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_0());
                      				
                    }
                    kw=(Token)match(input,37,FOLLOW_8); if (state.failed) return current;
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

            if ( (LA21_0==38) ) {
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
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1514:1: ruleExpression_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleExpression_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_3=null;
        AntlrDatatypeRuleToken this_binary_op_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1520:2: ( ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:1521:2: ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:1521:2: ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_REL_OP && LA22_0<=RULE_MUL_OP)||(LA22_0>=39 && LA22_0<=40)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:1522:3: (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
                    {
                    // InternalMyDsl.g:1522:3: (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
                    // InternalMyDsl.g:1523:4: this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression_LinhaAccess().getBinary_opParserRuleCall_0_0());
                      			
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

                      				newCompositeNode(grammarAccess.getExpression_LinhaAccess().getExpressionParserRuleCall_0_1());
                      			
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

                      				newCompositeNode(grammarAccess.getExpression_LinhaAccess().getExpression_LinhaParserRuleCall_0_2());
                      			
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
                    break;
                case 2 :
                    // InternalMyDsl.g:1555:3: this_ANY_OTHER_3= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_3=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_3, grammarAccess.getExpression_LinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleExpression_Linha"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMyDsl.g:1566:1: entryRuleUnaryExpr returns [String current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final String entryRuleUnaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpr = null;


        try {
            // InternalMyDsl.g:1566:49: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMyDsl.g:1567:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
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
    // InternalMyDsl.g:1573:1: ruleUnaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNARY_OP_1=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_0 = null;

        AntlrDatatypeRuleToken this_UnaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1579:2: ( (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) )
            // InternalMyDsl.g:1580:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            {
            // InternalMyDsl.g:1580:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DECIMAL_DIGITS||LA23_0==RULE_IDENTIFIER||LA23_0==RULE_STRING_LIT||LA23_0==RULE_INTEGERLITERAL||LA23_0==21||LA23_0==23||LA23_0==25||LA23_0==27||(LA23_0>=31 && LA23_0<=32)||(LA23_0>=34 && LA23_0<=38)) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_UNARY_OP) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1581:3: this_PrimaryExpr_0= rulePrimaryExpr
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
                    // InternalMyDsl.g:1592:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    {
                    // InternalMyDsl.g:1592:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    // InternalMyDsl.g:1593:4: this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr
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
    // InternalMyDsl.g:1615:1: entryRulebinary_op returns [String current=null] : iv_rulebinary_op= rulebinary_op EOF ;
    public final String entryRulebinary_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebinary_op = null;


        try {
            // InternalMyDsl.g:1615:49: (iv_rulebinary_op= rulebinary_op EOF )
            // InternalMyDsl.g:1616:2: iv_rulebinary_op= rulebinary_op EOF
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
    // InternalMyDsl.g:1622:1: rulebinary_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) ;
    public final AntlrDatatypeRuleToken rulebinary_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REL_OP_2=null;
        Token this_ADD_OP_3=null;
        Token this_MUL_OP_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1628:2: ( (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) )
            // InternalMyDsl.g:1629:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            {
            // InternalMyDsl.g:1629:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt24=1;
                }
                break;
            case 40:
                {
                alt24=2;
                }
                break;
            case RULE_REL_OP:
                {
                alt24=3;
                }
                break;
            case RULE_ADD_OP:
                {
                alt24=4;
                }
                break;
            case RULE_MUL_OP:
                {
                alt24=5;
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
                    // InternalMyDsl.g:1630:3: kw= '||'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1636:3: kw= '&&'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getAmpersandAmpersandKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1642:3: this_REL_OP_2= RULE_REL_OP
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
                    // InternalMyDsl.g:1650:3: this_ADD_OP_3= RULE_ADD_OP
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
                    // InternalMyDsl.g:1658:3: this_MUL_OP_4= RULE_MUL_OP
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
    // InternalMyDsl.g:1669:1: entryRulePrimaryExpr returns [String current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final String entryRulePrimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr = null;


        try {
            // InternalMyDsl.g:1669:51: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMyDsl.g:1670:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
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
    // InternalMyDsl.g:1676:1: rulePrimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) ) ;
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
            // InternalMyDsl.g:1682:2: ( ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:1683:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:1683:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) )
            int alt25=11;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL_DIGITS:
            case RULE_STRING_LIT:
            case RULE_INTEGERLITERAL:
            case 21:
                {
                alt25=1;
                }
                break;
            case 27:
                {
                alt25=2;
                }
                break;
            case 36:
                {
                alt25=3;
                }
                break;
            case 32:
                {
                alt25=4;
                }
                break;
            case 34:
                {
                alt25=5;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt25=6;
                }
                break;
            case 23:
                {
                alt25=7;
                }
                break;
            case 25:
                {
                alt25=8;
                }
                break;
            case 31:
                {
                alt25=9;
                }
                break;
            case 35:
                {
                alt25=10;
                }
                break;
            case 37:
            case 38:
                {
                alt25=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1684:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1684:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1685:4: this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha
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
                    // InternalMyDsl.g:1707:3: (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat )
                    {
                    // InternalMyDsl.g:1707:3: (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat )
                    // InternalMyDsl.g:1708:4: this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat
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
                    // InternalMyDsl.g:1730:3: (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat )
                    {
                    // InternalMyDsl.g:1730:3: (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat )
                    // InternalMyDsl.g:1731:4: this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat
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
                    // InternalMyDsl.g:1753:3: (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1753:3: (kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1754:4: kw= 'func' this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
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
                    // InternalMyDsl.g:1791:3: (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1791:3: (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1792:4: kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getFullStopFullStopFullStopKeyword_4_0());
                      			
                    }
                    kw=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
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
                    // InternalMyDsl.g:1834:3: (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1834:3: (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1835:4: this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha
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
                    // InternalMyDsl.g:1867:3: (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1867:3: (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1868:4: kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,23,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:1895:3: (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1895:3: (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1896:4: kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
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
                    // InternalMyDsl.g:1933:3: (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1933:3: (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1934:4: this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha
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
                    // InternalMyDsl.g:1966:3: (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1966:3: (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1967:4: this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha
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
                    // InternalMyDsl.g:1999:3: (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1999:3: (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2000:4: this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha
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
    // InternalMyDsl.g:2035:1: entryRulePrimaryExprFatFatFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2035:69: (iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF )
            // InternalMyDsl.g:2036:2: iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF
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
    // InternalMyDsl.g:2042:1: rulePrimaryExprFatFatFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2048:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2049:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2049:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            else if ( (LA26_0==21||LA26_0==23) ) {
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
                    // InternalMyDsl.g:2050:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalMyDsl.g:2061:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
    // InternalMyDsl.g:2075:1: entryRulePrimaryExprFatFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2075:66: (iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF )
            // InternalMyDsl.g:2076:2: iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF
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
    // InternalMyDsl.g:2082:1: rulePrimaryExprFatFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FunctionBody_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2088:2: ( (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2089:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2089:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            else if ( (LA27_0==21||LA27_0==23) ) {
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
                    // InternalMyDsl.g:2090:3: this_FunctionBody_0= ruleFunctionBody
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
                    // InternalMyDsl.g:2101:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
    // InternalMyDsl.g:2115:1: entryRulePrimaryExprFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2115:63: (iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF )
            // InternalMyDsl.g:2116:2: iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF
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
    // InternalMyDsl.g:2122:1: rulePrimaryExprFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2128:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2129:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2129:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            else if ( (LA28_0==21||LA28_0==23) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2130:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalMyDsl.g:2141:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
    // InternalMyDsl.g:2155:1: entryRulePrimaryExprFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFat = null;


        try {
            // InternalMyDsl.g:2155:60: (iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF )
            // InternalMyDsl.g:2156:2: iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF
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
    // InternalMyDsl.g:2162:1: rulePrimaryExprFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2168:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2169:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2169:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt29=1;
                }
                break;
            case 21:
            case 23:
                {
                alt29=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2170:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalMyDsl.g:2181:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
                    // InternalMyDsl.g:2192:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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
    // InternalMyDsl.g:2203:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMyDsl.g:2203:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:2204:2: iv_ruleName= ruleName EOF
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
    // InternalMyDsl.g:2210:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_NameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2216:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha ) )
            // InternalMyDsl.g:2217:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha )
            {
            // InternalMyDsl.g:2217:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha )
            // InternalMyDsl.g:2218:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha
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
    // InternalMyDsl.g:2239:1: entryRuleNameLinha returns [String current=null] : iv_ruleNameLinha= ruleNameLinha EOF ;
    public final String entryRuleNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameLinha = null;


        try {
            // InternalMyDsl.g:2239:49: (iv_ruleNameLinha= ruleNameLinha EOF )
            // InternalMyDsl.g:2240:2: iv_ruleNameLinha= ruleNameLinha EOF
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
    // InternalMyDsl.g:2246:1: ruleNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2252:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2253:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2253:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ANY_OTHER) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2254:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:2254:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:2255:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
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
                    // InternalMyDsl.g:2269:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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
    // InternalMyDsl.g:2280:1: entryRulePrimaryExprFatFat returns [String current=null] : iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF ;
    public final String entryRulePrimaryExprFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFat = null;


        try {
            // InternalMyDsl.g:2280:57: (iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF )
            // InternalMyDsl.g:2281:2: iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF
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
    // InternalMyDsl.g:2287:1: rulePrimaryExprFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2293:2: ( ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) ) )
            // InternalMyDsl.g:2294:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )
            {
            // InternalMyDsl.g:2294:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2295:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    {
                    // InternalMyDsl.g:2295:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    // InternalMyDsl.g:2296:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')'
                    {
                    // InternalMyDsl.g:2296:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression )
                    // InternalMyDsl.g:2297:5: ( ruleExpression )=>this_Expression_0= ruleExpression
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

                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatFatAccess().getRightParenthesisKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2316:3: (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat )
                    {
                    // InternalMyDsl.g:2316:3: (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat )
                    // InternalMyDsl.g:2317:4: this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat
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
                    kw=(Token)match(input,24,FOLLOW_31); if (state.failed) return current;
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
    // InternalMyDsl.g:2347:1: entryRulePrimaryExprFat returns [String current=null] : iv_rulePrimaryExprFat= rulePrimaryExprFat EOF ;
    public final String entryRulePrimaryExprFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFat = null;


        try {
            // InternalMyDsl.g:2347:54: (iv_rulePrimaryExprFat= rulePrimaryExprFat EOF )
            // InternalMyDsl.g:2348:2: iv_rulePrimaryExprFat= rulePrimaryExprFat EOF
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
    // InternalMyDsl.g:2354:1: rulePrimaryExprFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_MethodName_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2360:2: ( ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) )
            // InternalMyDsl.g:2361:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            {
            // InternalMyDsl.g:2361:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            else if ( (LA33_0==21) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2362:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    {
                    // InternalMyDsl.g:2362:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    // InternalMyDsl.g:2363:4: kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:2378:4: (kw= ',' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyDsl.g:2379:5: kw= ','
                            {
                            kw=(Token)match(input,33,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getCommaKeyword_0_2());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2392:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    {
                    // InternalMyDsl.g:2392:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    // InternalMyDsl.g:2393:4: kw= '.' this_MethodName_5= ruleMethodName
                    {
                    kw=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:2413:1: entryRulePrimaryExprLinha returns [String current=null] : iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF ;
    public final String entryRulePrimaryExprLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha = null;


        try {
            // InternalMyDsl.g:2413:56: (iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF )
            // InternalMyDsl.g:2414:2: iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF
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
    // InternalMyDsl.g:2420:1: rulePrimaryExprLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) ;
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
            // InternalMyDsl.g:2426:2: ( ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:2427:2: ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:2427:2: ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt34=1;
                }
                break;
            case 25:
                {
                alt34=2;
                }
                break;
            case 23:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2428:3: (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2428:3: (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2429:4: kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,21,FOLLOW_33); if (state.failed) return current;
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
                    // InternalMyDsl.g:2456:3: (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2456:3: (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2457:4: kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
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
                    // InternalMyDsl.g:2484:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2484:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2485:4: this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha
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
    // InternalMyDsl.g:2510:1: entryRulePrimaryExprLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinha = null;


        try {
            // InternalMyDsl.g:2510:61: (iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF )
            // InternalMyDsl.g:2511:2: iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF
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
    // InternalMyDsl.g:2517:1: rulePrimaryExprLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2523:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:2524:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:2524:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_IDENTIFIER) ) {
                alt35=1;
            }
            else if ( (LA35_0==23) ) {
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
                    // InternalMyDsl.g:2525:3: this_IDENTIFIER_0= RULE_IDENTIFIER
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
                    // InternalMyDsl.g:2533:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:2533:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    // InternalMyDsl.g:2534:4: kw= '(' this_Type_2= ruleType kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
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
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2559:1: entryRulePrimaryExprLinhaLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinhaLinha = null;


        try {
            // InternalMyDsl.g:2559:66: (iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF )
            // InternalMyDsl.g:2560:2: iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF
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
    // InternalMyDsl.g:2566:1: rulePrimaryExprLinhaLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinhaLinhaLinhaLinha_1 = null;

        AntlrDatatypeRuleToken this_SliceLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2572:2: ( ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) ) )
            // InternalMyDsl.g:2573:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) )
            {
            // InternalMyDsl.g:2573:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DECIMAL_DIGITS||LA36_0==RULE_IDENTIFIER||(LA36_0>=RULE_STRING_LIT && LA36_0<=RULE_UNARY_OP)||LA36_0==RULE_INTEGERLITERAL||LA36_0==21||LA36_0==23||LA36_0==25||LA36_0==27||(LA36_0>=31 && LA36_0<=32)||(LA36_0>=34 && LA36_0<=38)) ) {
                alt36=1;
            }
            else if ( (LA36_0==41) ) {
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
                    // InternalMyDsl.g:2574:3: (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha )
                    {
                    // InternalMyDsl.g:2574:3: (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha )
                    // InternalMyDsl.g:2575:4: this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha
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
                    // InternalMyDsl.g:2597:3: (kw= ':' this_SliceLinha_3= ruleSliceLinha )
                    {
                    // InternalMyDsl.g:2597:3: (kw= ':' this_SliceLinha_3= ruleSliceLinha )
                    // InternalMyDsl.g:2598:4: kw= ':' this_SliceLinha_3= ruleSliceLinha
                    {
                    kw=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
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
    // InternalMyDsl.g:2618:1: entryRulePrimaryExprLinhaLinhaLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinhaLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinhaLinhaLinha = null;


        try {
            // InternalMyDsl.g:2618:71: (iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF )
            // InternalMyDsl.g:2619:2: iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF
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
    // InternalMyDsl.g:2625:1: rulePrimaryExprLinhaLinhaLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinhaLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SliceLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2631:2: ( (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) ) )
            // InternalMyDsl.g:2632:2: (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) )
            {
            // InternalMyDsl.g:2632:2: (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            else if ( (LA37_0==41) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2633:3: kw= ']'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaLinhaLinhaAccess().getRightSquareBracketKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2639:3: (kw= ':' this_SliceLinha_2= ruleSliceLinha )
                    {
                    // InternalMyDsl.g:2639:3: (kw= ':' this_SliceLinha_2= ruleSliceLinha )
                    // InternalMyDsl.g:2640:4: kw= ':' this_SliceLinha_2= ruleSliceLinha
                    {
                    kw=(Token)match(input,41,FOLLOW_34); if (state.failed) return current;
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
    // InternalMyDsl.g:2660:1: entryRuleSliceLinha returns [String current=null] : iv_ruleSliceLinha= ruleSliceLinha EOF ;
    public final String entryRuleSliceLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSliceLinha = null;


        try {
            // InternalMyDsl.g:2660:50: (iv_ruleSliceLinha= ruleSliceLinha EOF )
            // InternalMyDsl.g:2661:2: iv_ruleSliceLinha= ruleSliceLinha EOF
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
    // InternalMyDsl.g:2667:1: ruleSliceLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleSliceLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2673:2: ( ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) ) )
            // InternalMyDsl.g:2674:2: ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) )
            {
            // InternalMyDsl.g:2674:2: ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_DECIMAL_DIGITS||LA39_0==RULE_IDENTIFIER||(LA39_0>=RULE_STRING_LIT && LA39_0<=RULE_UNARY_OP)||LA39_0==RULE_INTEGERLITERAL||LA39_0==21||LA39_0==23||LA39_0==25||LA39_0==27||(LA39_0>=31 && LA39_0<=32)||(LA39_0>=34 && LA39_0<=38)) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2675:3: (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' )
                    {
                    // InternalMyDsl.g:2675:3: (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' )
                    // InternalMyDsl.g:2676:4: kw= ':' (this_Expression_1= ruleExpression )? kw= ']'
                    {
                    kw=(Token)match(input,41,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getColonKeyword_0_0());
                      			
                    }
                    // InternalMyDsl.g:2681:4: (this_Expression_1= ruleExpression )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_DECIMAL_DIGITS||LA38_0==RULE_IDENTIFIER||(LA38_0>=RULE_STRING_LIT && LA38_0<=RULE_UNARY_OP)||LA38_0==RULE_INTEGERLITERAL||LA38_0==21||LA38_0==23||LA38_0==25||LA38_0==27||(LA38_0>=31 && LA38_0<=32)||(LA38_0>=34 && LA38_0<=38)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalMyDsl.g:2682:5: this_Expression_1= ruleExpression
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

                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2700:3: (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' )
                    {
                    // InternalMyDsl.g:2700:3: (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' )
                    // InternalMyDsl.g:2701:4: this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']'
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
                    kw=(Token)match(input,41,FOLLOW_29); if (state.failed) return current;
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
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2736:1: entryRuleArguments returns [String current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final String entryRuleArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArguments = null;


        try {
            // InternalMyDsl.g:2736:49: (iv_ruleArguments= ruleArguments EOF )
            // InternalMyDsl.g:2737:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalMyDsl.g:2743:1: ruleArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_ExpressionList_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2749:2: ( (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:2750:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:2750:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:2751:3: kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,23,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:2756:3: ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_DECIMAL_DIGITS||LA44_0==RULE_IDENTIFIER||(LA44_0>=RULE_STRING_LIT && LA44_0<=RULE_UNARY_OP)||LA44_0==RULE_INTEGERLITERAL||LA44_0==21||LA44_0==23||LA44_0==25||LA44_0==27||(LA44_0>=31 && LA44_0<=32)||(LA44_0>=34 && LA44_0<=38)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2757:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )?
                    {
                    // InternalMyDsl.g:2757:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )
                    int alt41=2;
                    alt41 = dfa41.predict(input);
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:2758:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            {
                            // InternalMyDsl.g:2758:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            // InternalMyDsl.g:2759:6: ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList
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
                            // InternalMyDsl.g:2772:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            {
                            // InternalMyDsl.g:2772:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            // InternalMyDsl.g:2773:6: this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )?
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
                            // InternalMyDsl.g:2783:6: (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==33) ) {
                                int LA40_1 = input.LA(2);

                                if ( (LA40_1==RULE_DECIMAL_DIGITS||LA40_1==RULE_IDENTIFIER||(LA40_1>=RULE_STRING_LIT && LA40_1<=RULE_UNARY_OP)||LA40_1==RULE_INTEGERLITERAL||LA40_1==21||LA40_1==23||LA40_1==25||LA40_1==27||(LA40_1>=31 && LA40_1<=32)||(LA40_1>=34 && LA40_1<=38)) ) {
                                    alt40=1;
                                }
                            }
                            switch (alt40) {
                                case 1 :
                                    // InternalMyDsl.g:2784:7: kw= ',' this_ExpressionList_4= ruleExpressionList
                                    {
                                    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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

                    // InternalMyDsl.g:2802:4: (kw= '...' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==34) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalMyDsl.g:2803:5: kw= '...'
                            {
                            kw=(Token)match(input,34,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyDsl.g:2809:4: (kw= ',' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==33) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDsl.g:2810:5: kw= ','
                            {
                            kw=(Token)match(input,33,FOLLOW_9); if (state.failed) return current;
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

            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2826:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            // InternalMyDsl.g:2826:54: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMyDsl.g:2827:2: iv_ruleExpressionList= ruleExpressionList EOF
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
    // InternalMyDsl.g:2833:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2839:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalMyDsl.g:2840:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalMyDsl.g:2840:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalMyDsl.g:2841:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
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
            // InternalMyDsl.g:2851:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    int LA45_2 = input.LA(2);

                    if ( (LA45_2==RULE_DECIMAL_DIGITS||LA45_2==RULE_IDENTIFIER||(LA45_2>=RULE_STRING_LIT && LA45_2<=RULE_UNARY_OP)||LA45_2==RULE_INTEGERLITERAL||LA45_2==21||LA45_2==23||LA45_2==25||LA45_2==27||(LA45_2>=31 && LA45_2<=32)||(LA45_2>=34 && LA45_2<=38)) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:2852:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleIdentifierList"
    // InternalMyDsl.g:2872:1: entryRuleIdentifierList returns [String current=null] : iv_ruleIdentifierList= ruleIdentifierList EOF ;
    public final String entryRuleIdentifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierList = null;


        try {
            // InternalMyDsl.g:2872:54: (iv_ruleIdentifierList= ruleIdentifierList EOF )
            // InternalMyDsl.g:2873:2: iv_ruleIdentifierList= ruleIdentifierList EOF
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
    // InternalMyDsl.g:2879:1: ruleIdentifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2885:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalMyDsl.g:2886:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalMyDsl.g:2886:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalMyDsl.g:2887:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:2894:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:2895:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
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
            	    break loop46;
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
    // InternalMyDsl.g:2912:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:2912:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:2913:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalMyDsl.g:2919:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StatementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2925:2: ( (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) )
            // InternalMyDsl.g:2926:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            {
            // InternalMyDsl.g:2926:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            // InternalMyDsl.g:2927:3: kw= '{' this_StatementList_1= ruleStatementList kw= '}'
            {
            kw=(Token)match(input,28,FOLLOW_39); if (state.failed) return current;
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
            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2951:1: entryRuleStatementList returns [String current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final String entryRuleStatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatementList = null;


        try {
            // InternalMyDsl.g:2951:53: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalMyDsl.g:2952:2: iv_ruleStatementList= ruleStatementList EOF
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
    // InternalMyDsl.g:2958:1: ruleStatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Statement_0= ruleStatement kw= ';' )* ;
    public final AntlrDatatypeRuleToken ruleStatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2964:2: ( (this_Statement_0= ruleStatement kw= ';' )* )
            // InternalMyDsl.g:2965:2: (this_Statement_0= ruleStatement kw= ';' )*
            {
            // InternalMyDsl.g:2965:2: (this_Statement_0= ruleStatement kw= ';' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_DECIMAL_DIGITS||LA47_0==RULE_IDENTIFIER||(LA47_0>=RULE_STRING_LIT && LA47_0<=RULE_UNARY_OP)||LA47_0==RULE_INTEGERLITERAL||LA47_0==21||LA47_0==23||LA47_0==25||(LA47_0>=27 && LA47_0<=28)||(LA47_0>=31 && LA47_0<=32)||(LA47_0>=34 && LA47_0<=38)||(LA47_0>=42 && LA47_0<=43)||LA47_0==47||(LA47_0>=50 && LA47_0<=52)||(LA47_0>=54 && LA47_0<=59)||(LA47_0>=62 && LA47_0<=63)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:2966:3: this_Statement_0= ruleStatement kw= ';'
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
            	    kw=(Token)match(input,29,FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalMyDsl.g:2985:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:2985:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:2986:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:2992:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) ;
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
            // InternalMyDsl.g:2998:2: ( (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) )
            // InternalMyDsl.g:2999:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            {
            // InternalMyDsl.g:2999:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            int alt48=15;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:3000:3: this_Declaration_0= ruleDeclaration
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
                    // InternalMyDsl.g:3011:3: this_LabeledStmt_1= ruleLabeledStmt
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
                    // InternalMyDsl.g:3022:3: this_SimpleStmt_2= ruleSimpleStmt
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
                    // InternalMyDsl.g:3033:3: this_GoStmt_3= ruleGoStmt
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
                    // InternalMyDsl.g:3044:3: this_ReturnStmt_4= ruleReturnStmt
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
                    // InternalMyDsl.g:3055:3: this_BreakStmt_5= ruleBreakStmt
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
                    // InternalMyDsl.g:3066:3: this_ContinueStmt_6= ruleContinueStmt
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
                    // InternalMyDsl.g:3077:3: this_GotoStmt_7= ruleGotoStmt
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
                    // InternalMyDsl.g:3088:3: this_FallthroughStmt_8= ruleFallthroughStmt
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
                    // InternalMyDsl.g:3099:3: this_Block_9= ruleBlock
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
                    // InternalMyDsl.g:3110:3: this_IfStmt_10= ruleIfStmt
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
                    // InternalMyDsl.g:3121:3: this_SwitchStmt_11= ruleSwitchStmt
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
                    // InternalMyDsl.g:3132:3: this_SelectStmt_12= ruleSelectStmt
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
                    // InternalMyDsl.g:3143:3: this_ForStmt_13= ruleForStmt
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
                    // InternalMyDsl.g:3154:3: this_DeferStmt_14= ruleDeferStmt
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
    // InternalMyDsl.g:3168:1: entryRuleDeferStmt returns [String current=null] : iv_ruleDeferStmt= ruleDeferStmt EOF ;
    public final String entryRuleDeferStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeferStmt = null;


        try {
            // InternalMyDsl.g:3168:49: (iv_ruleDeferStmt= ruleDeferStmt EOF )
            // InternalMyDsl.g:3169:2: iv_ruleDeferStmt= ruleDeferStmt EOF
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
    // InternalMyDsl.g:3175:1: ruleDeferStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'defer' this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeferStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3181:2: ( (kw= 'defer' this_Expression_1= ruleExpression ) )
            // InternalMyDsl.g:3182:2: (kw= 'defer' this_Expression_1= ruleExpression )
            {
            // InternalMyDsl.g:3182:2: (kw= 'defer' this_Expression_1= ruleExpression )
            // InternalMyDsl.g:3183:3: kw= 'defer' this_Expression_1= ruleExpression
            {
            kw=(Token)match(input,42,FOLLOW_29); if (state.failed) return current;
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
    // InternalMyDsl.g:3202:1: entryRuleForStmt returns [String current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final String entryRuleForStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmt = null;


        try {
            // InternalMyDsl.g:3202:47: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMyDsl.g:3203:2: iv_ruleForStmt= ruleForStmt EOF
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
    // InternalMyDsl.g:3209:1: ruleForStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleForStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_ForStmtLinha_2 = null;

        AntlrDatatypeRuleToken this_Block_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3215:2: ( (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock ) )
            // InternalMyDsl.g:3216:2: (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock )
            {
            // InternalMyDsl.g:3216:2: (kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock )
            // InternalMyDsl.g:3217:3: kw= 'for' (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock
            {
            kw=(Token)match(input,43,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getForStmtAccess().getForKeyword_0());
              		
            }
            // InternalMyDsl.g:3222:3: (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_DECIMAL_DIGITS||LA49_0==RULE_IDENTIFIER||(LA49_0>=RULE_STRING_LIT && LA49_0<=RULE_UNARY_OP)||LA49_0==RULE_INTEGERLITERAL||LA49_0==21||LA49_0==23||LA49_0==25||LA49_0==27||(LA49_0>=31 && LA49_0<=32)||(LA49_0>=34 && LA49_0<=38)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:3223:4: this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha
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
    // InternalMyDsl.g:3258:1: entryRuleForStmtLinha returns [String current=null] : iv_ruleForStmtLinha= ruleForStmtLinha EOF ;
    public final String entryRuleForStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmtLinha = null;


        try {
            // InternalMyDsl.g:3258:52: (iv_ruleForStmtLinha= ruleForStmtLinha EOF )
            // InternalMyDsl.g:3259:2: iv_ruleForStmtLinha= ruleForStmtLinha EOF
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
    // InternalMyDsl.g:3265:1: ruleForStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER ) ;
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
            // InternalMyDsl.g:3271:2: ( ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:3272:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:3272:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_IDENTIFIER||(LA57_0>=RULE_ADD_OP && LA57_0<=RULE_MUL_OP)||LA57_0==33||LA57_0==38||(LA57_0>=60 && LA57_0<=61)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ANY_OTHER) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:3273:3: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression )
                    {
                    // InternalMyDsl.g:3273:3: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression )
                    // InternalMyDsl.g:3274:4: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) kw= 'range' this_Expression_26= ruleExpression
                    {
                    // InternalMyDsl.g:3274:4: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=RULE_ADD_OP && LA52_0<=RULE_MUL_OP)||LA52_0==33||LA52_0==38||(LA52_0>=60 && LA52_0<=61)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_IDENTIFIER) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalMyDsl.g:3275:5: this_SimpleStmtLinha_0= ruleSimpleStmtLinha
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
                            // InternalMyDsl.g:3286:5: ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) )
                            {
                            // InternalMyDsl.g:3286:5: ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) )
                            // InternalMyDsl.g:3287:6: (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* )
                            {
                            // InternalMyDsl.g:3287:6: (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* )
                            // InternalMyDsl.g:3288:7: this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )*
                            {
                            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_IDENTIFIER_1);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newLeafNode(this_IDENTIFIER_1, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_0_1_0_0());
                              						
                            }
                            // InternalMyDsl.g:3295:7: (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==33) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalMyDsl.g:3296:8: kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER
                            	    {
                            	    kw=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
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
                            	    break loop50;
                                }
                            } while (true);


                            }

                            kw=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_0_1_1());
                              					
                            }
                            // InternalMyDsl.g:3315:6: (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* )
                            // InternalMyDsl.g:3316:7: this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )*
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
                            // InternalMyDsl.g:3326:7: (kw= ',' this_Expression_7= ruleExpression )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==33) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalMyDsl.g:3327:8: kw= ',' this_Expression_7= ruleExpression
                            	    {
                            	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                            	    break loop51;
                                }
                            } while (true);


                            }


                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
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
                    kw=(Token)match(input,29,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_0_3());
                      			
                    }
                    // InternalMyDsl.g:3366:4: ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) )
                    int alt56=4;
                    alt56 = dfa56.predict(input);
                    switch (alt56) {
                        case 1 :
                            // InternalMyDsl.g:3367:5: (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha )
                            {
                            // InternalMyDsl.g:3367:5: (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha )
                            // InternalMyDsl.g:3368:6: this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha
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
                            // InternalMyDsl.g:3390:5: ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) )
                            {
                            // InternalMyDsl.g:3390:5: ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) )
                            // InternalMyDsl.g:3391:6: (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* )
                            {
                            // InternalMyDsl.g:3391:6: (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* )
                            // InternalMyDsl.g:3392:7: this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )*
                            {
                            this_IDENTIFIER_13=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_IDENTIFIER_13);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newLeafNode(this_IDENTIFIER_13, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_4_1_0_0());
                              						
                            }
                            // InternalMyDsl.g:3399:7: (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==33) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalMyDsl.g:3400:8: kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER
                            	    {
                            	    kw=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
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
                            	    break loop53;
                                }
                            } while (true);


                            }

                            kw=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_4_1_1());
                              					
                            }
                            // InternalMyDsl.g:3419:6: (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* )
                            // InternalMyDsl.g:3420:7: this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )*
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
                            // InternalMyDsl.g:3430:7: (kw= ',' this_Expression_19= ruleExpression )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==33) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalMyDsl.g:3431:8: kw= ',' this_Expression_19= ruleExpression
                            	    {
                            	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                            	    break loop54;
                                }
                            } while (true);


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:3450:5: ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:3450:5: ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:3451:6: (kw= ',' this_Expression_21= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:3451:6: (kw= ',' this_Expression_21= ruleExpression )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==33) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalMyDsl.g:3452:7: kw= ',' this_Expression_21= ruleExpression
                            	    {
                            	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                            	    break loop55;
                                }
                            } while (true);

                            kw=(Token)match(input,45,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getEqualsSignKeyword_0_4_2_1());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:3475:5: (this_IdentifierList_23= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:3475:5: (this_IdentifierList_23= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:3476:6: this_IdentifierList_23= ruleIdentifierList kw= ':='
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
                            kw=(Token)match(input,44,FOLLOW_47); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_4_3_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,46,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:3510:3: this_ANY_OTHER_27= RULE_ANY_OTHER
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


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:3521:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:3521:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:3522:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:3528:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3534:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:3535:2: this_Expression_0= ruleExpression
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
    // InternalMyDsl.g:3548:1: entryRuleSelectStmt returns [String current=null] : iv_ruleSelectStmt= ruleSelectStmt EOF ;
    public final String entryRuleSelectStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStmt = null;


        try {
            // InternalMyDsl.g:3548:50: (iv_ruleSelectStmt= ruleSelectStmt EOF )
            // InternalMyDsl.g:3549:2: iv_ruleSelectStmt= ruleSelectStmt EOF
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
    // InternalMyDsl.g:3555:1: ruleSelectStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSelectStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CommClause_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3561:2: ( (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) )
            // InternalMyDsl.g:3562:2: (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            {
            // InternalMyDsl.g:3562:2: (kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            // InternalMyDsl.g:3563:3: kw= 'select' kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}'
            {
            kw=(Token)match(input,47,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getSelectKeyword_0());
              		
            }
            kw=(Token)match(input,28,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:3573:3: (this_CommClause_2= ruleCommClause )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=48 && LA58_0<=49)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:3574:4: this_CommClause_2= ruleCommClause
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
            	    break loop58;
                }
            } while (true);

            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:3594:1: entryRuleCommClause returns [String current=null] : iv_ruleCommClause= ruleCommClause EOF ;
    public final String entryRuleCommClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommClause = null;


        try {
            // InternalMyDsl.g:3594:50: (iv_ruleCommClause= ruleCommClause EOF )
            // InternalMyDsl.g:3595:2: iv_ruleCommClause= ruleCommClause EOF
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
    // InternalMyDsl.g:3601:1: ruleCommClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleCommClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CommCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3607:2: ( (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:3608:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:3608:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:3609:3: this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList
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
            kw=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
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
    // InternalMyDsl.g:3638:1: entryRuleCommCase returns [String current=null] : iv_ruleCommCase= ruleCommCase EOF ;
    public final String entryRuleCommCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCase = null;


        try {
            // InternalMyDsl.g:3638:48: (iv_ruleCommCase= ruleCommCase EOF )
            // InternalMyDsl.g:3639:2: iv_ruleCommCase= ruleCommCase EOF
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
    // InternalMyDsl.g:3645:1: ruleCommCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleCommCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_CommCaseLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3651:2: ( ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' ) )
            // InternalMyDsl.g:3652:2: ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' )
            {
            // InternalMyDsl.g:3652:2: ( (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | kw= 'default' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==48) ) {
                alt59=1;
            }
            else if ( (LA59_0==49) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:3653:3: (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    {
                    // InternalMyDsl.g:3653:3: (kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    // InternalMyDsl.g:3654:4: kw= 'case' (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    {
                    kw=(Token)match(input,48,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getCommCaseAccess().getCaseKeyword_0_0());
                      			
                    }
                    // InternalMyDsl.g:3659:4: (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    // InternalMyDsl.g:3660:5: this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha
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
                    // InternalMyDsl.g:3683:3: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:3692:1: entryRuleCommCaseLinha returns [String current=null] : iv_ruleCommCaseLinha= ruleCommCaseLinha EOF ;
    public final String entryRuleCommCaseLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCaseLinha = null;


        try {
            // InternalMyDsl.g:3692:53: (iv_ruleCommCaseLinha= ruleCommCaseLinha EOF )
            // InternalMyDsl.g:3693:2: iv_ruleCommCaseLinha= ruleCommCaseLinha EOF
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
    // InternalMyDsl.g:3699:1: ruleCommCaseLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleCommCaseLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_IdentifierList_5 = null;

        AntlrDatatypeRuleToken this_RecvExpr_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3705:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) )
            // InternalMyDsl.g:3706:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            {
            // InternalMyDsl.g:3706:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_IDENTIFIER||LA62_0==33||LA62_0==45) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:3707:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:3707:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:3708:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,38,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:3725:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    {
                    // InternalMyDsl.g:3725:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    // InternalMyDsl.g:3726:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr
                    {
                    // InternalMyDsl.g:3726:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==33||LA61_0==45) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==RULE_IDENTIFIER) ) {
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
                            // InternalMyDsl.g:3727:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:3727:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:3728:6: (kw= ',' this_Expression_3= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:3728:6: (kw= ',' this_Expression_3= ruleExpression )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==33) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // InternalMyDsl.g:3729:7: kw= ',' this_Expression_3= ruleExpression
                            	    {
                            	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                            	    break loop60;
                                }
                            } while (true);

                            kw=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3752:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:3752:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:3753:6: this_IdentifierList_5= ruleIdentifierList kw= ':='
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
                            kw=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
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
    // InternalMyDsl.g:3785:1: entryRuleRecvExpr returns [String current=null] : iv_ruleRecvExpr= ruleRecvExpr EOF ;
    public final String entryRuleRecvExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecvExpr = null;


        try {
            // InternalMyDsl.g:3785:48: (iv_ruleRecvExpr= ruleRecvExpr EOF )
            // InternalMyDsl.g:3786:2: iv_ruleRecvExpr= ruleRecvExpr EOF
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
    // InternalMyDsl.g:3792:1: ruleRecvExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleRecvExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3798:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:3799:2: this_Expression_0= ruleExpression
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
    // InternalMyDsl.g:3812:1: entryRuleSwitchStmt returns [String current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final String entryRuleSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmt = null;


        try {
            // InternalMyDsl.g:3812:50: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalMyDsl.g:3813:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
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
    // InternalMyDsl.g:3819:1: ruleSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleStmt_1 = null;

        AntlrDatatypeRuleToken this_SwitchStmtLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3825:2: ( (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) )
            // InternalMyDsl.g:3826:2: (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            {
            // InternalMyDsl.g:3826:2: (kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            // InternalMyDsl.g:3827:3: kw= 'switch' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha
            {
            kw=(Token)match(input,50,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getSwitchKeyword_0());
              		
            }
            // InternalMyDsl.g:3832:3: (this_SimpleStmt_1= ruleSimpleStmt kw= ';' )
            // InternalMyDsl.g:3833:4: this_SimpleStmt_1= ruleSimpleStmt kw= ';'
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
            kw=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
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
    // InternalMyDsl.g:3863:1: entryRuleSwitchStmtLinha returns [String current=null] : iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF ;
    public final String entryRuleSwitchStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmtLinha = null;


        try {
            // InternalMyDsl.g:3863:55: (iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF )
            // InternalMyDsl.g:3864:2: iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF
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
    // InternalMyDsl.g:3870:1: ruleSwitchStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ExprCaseClause_2 = null;

        AntlrDatatypeRuleToken this_TypeSwitchGuard_4 = null;

        AntlrDatatypeRuleToken this_TypeCaseClause_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3876:2: ( ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) ) )
            // InternalMyDsl.g:3877:2: ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) )
            {
            // InternalMyDsl.g:3877:2: ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_DECIMAL_DIGITS||(LA65_0>=RULE_STRING_LIT && LA65_0<=RULE_UNARY_OP)||LA65_0==RULE_INTEGERLITERAL||LA65_0==21||LA65_0==23||LA65_0==25||LA65_0==27||(LA65_0>=31 && LA65_0<=32)||(LA65_0>=34 && LA65_0<=38)) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_IDENTIFIER) ) {
                int LA65_2 = input.LA(2);

                if ( (LA65_2==44) ) {
                    alt65=2;
                }
                else if ( (LA65_2==RULE_ANY_OTHER||LA65_2==21) ) {
                    alt65=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:3878:3: (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:3878:3: (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' )
                    // InternalMyDsl.g:3879:4: this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}'
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
                    kw=(Token)match(input,28,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalMyDsl.g:3894:4: (this_ExprCaseClause_2= ruleExprCaseClause )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=48 && LA63_0<=49)) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalMyDsl.g:3895:5: this_ExprCaseClause_2= ruleExprCaseClause
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
                    	    break loop63;
                        }
                    } while (true);

                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getRightCurlyBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3913:3: (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:3913:3: (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' )
                    // InternalMyDsl.g:3914:4: this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}'
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
                    kw=(Token)match(input,28,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:3929:4: (this_TypeCaseClause_6= ruleTypeCaseClause )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=48 && LA64_0<=49)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalMyDsl.g:3930:5: this_TypeCaseClause_6= ruleTypeCaseClause
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
                    	    break loop64;
                        }
                    } while (true);

                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:3951:1: entryRuleTypeCaseClause returns [String current=null] : iv_ruleTypeCaseClause= ruleTypeCaseClause EOF ;
    public final String entryRuleTypeCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeCaseClause = null;


        try {
            // InternalMyDsl.g:3951:54: (iv_ruleTypeCaseClause= ruleTypeCaseClause EOF )
            // InternalMyDsl.g:3952:2: iv_ruleTypeCaseClause= ruleTypeCaseClause EOF
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
    // InternalMyDsl.g:3958:1: ruleTypeCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleTypeCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3964:2: ( (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:3965:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:3965:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:3966:3: this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList
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
            kw=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
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
    // InternalMyDsl.g:3995:1: entryRuleTypeSwitchCase returns [String current=null] : iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF ;
    public final String entryRuleTypeSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchCase = null;


        try {
            // InternalMyDsl.g:3995:54: (iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF )
            // InternalMyDsl.g:3996:2: iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF
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
    // InternalMyDsl.g:4002:1: ruleTypeSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4008:2: ( ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' ) )
            // InternalMyDsl.g:4009:2: ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' )
            {
            // InternalMyDsl.g:4009:2: ( (kw= 'case' this_TypeList_1= ruleTypeList ) | kw= 'default' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==48) ) {
                alt66=1;
            }
            else if ( (LA66_0==49) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalMyDsl.g:4010:3: (kw= 'case' this_TypeList_1= ruleTypeList )
                    {
                    // InternalMyDsl.g:4010:3: (kw= 'case' this_TypeList_1= ruleTypeList )
                    // InternalMyDsl.g:4011:4: kw= 'case' this_TypeList_1= ruleTypeList
                    {
                    kw=(Token)match(input,48,FOLLOW_8); if (state.failed) return current;
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
                    // InternalMyDsl.g:4028:3: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4037:1: entryRuleTypeList returns [String current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final String entryRuleTypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeList = null;


        try {
            // InternalMyDsl.g:4037:48: (iv_ruleTypeList= ruleTypeList EOF )
            // InternalMyDsl.g:4038:2: iv_ruleTypeList= ruleTypeList EOF
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
    // InternalMyDsl.g:4044:1: ruleTypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) ;
    public final AntlrDatatypeRuleToken ruleTypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4050:2: ( (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) )
            // InternalMyDsl.g:4051:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            {
            // InternalMyDsl.g:4051:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            // InternalMyDsl.g:4052:3: this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )*
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
            // InternalMyDsl.g:4062:3: (kw= ',' this_Type_2= ruleType )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==33) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalMyDsl.g:4063:4: kw= ',' this_Type_2= ruleType
            	    {
            	    kw=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
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
            	    break loop67;
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
    // InternalMyDsl.g:4083:1: entryRuleTypeSwitchGuard returns [String current=null] : iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF ;
    public final String entryRuleTypeSwitchGuard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchGuard = null;


        try {
            // InternalMyDsl.g:4083:55: (iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF )
            // InternalMyDsl.g:4084:2: iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF
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
    // InternalMyDsl.g:4090:1: ruleTypeSwitchGuard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchGuard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4096:2: ( ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' ) )
            // InternalMyDsl.g:4097:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' )
            {
            // InternalMyDsl.g:4097:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')' )
            // InternalMyDsl.g:4098:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' kw= 'type' kw= ')'
            {
            // InternalMyDsl.g:4098:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )
            // InternalMyDsl.g:4099:4: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':='
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_IDENTIFIER_0);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeSwitchGuardAccess().getIDENTIFIERTerminalRuleCall_0_0());
              			
            }
            kw=(Token)match(input,44,FOLLOW_54); if (state.failed) return current;
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
            kw=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getFullStopKeyword_2());
              		
            }
            kw=(Token)match(input,23,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getLeftParenthesisKeyword_3());
              		
            }
            kw=(Token)match(input,51,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getTypeKeyword_4());
              		
            }
            kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4146:1: entryRuleExprCaseClause returns [String current=null] : iv_ruleExprCaseClause= ruleExprCaseClause EOF ;
    public final String entryRuleExprCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprCaseClause = null;


        try {
            // InternalMyDsl.g:4146:54: (iv_ruleExprCaseClause= ruleExprCaseClause EOF )
            // InternalMyDsl.g:4147:2: iv_ruleExprCaseClause= ruleExprCaseClause EOF
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
    // InternalMyDsl.g:4153:1: ruleExprCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleExprCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4159:2: ( (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:4160:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:4160:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:4161:3: this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList
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
            kw=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
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
    // InternalMyDsl.g:4190:1: entryRuleExprSwitchCase returns [String current=null] : iv_ruleExprSwitchCase= ruleExprSwitchCase EOF ;
    public final String entryRuleExprSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSwitchCase = null;


        try {
            // InternalMyDsl.g:4190:54: (iv_ruleExprSwitchCase= ruleExprSwitchCase EOF )
            // InternalMyDsl.g:4191:2: iv_ruleExprSwitchCase= ruleExprSwitchCase EOF
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
    // InternalMyDsl.g:4197:1: ruleExprSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' ) ;
    public final AntlrDatatypeRuleToken ruleExprSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4203:2: ( ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' ) )
            // InternalMyDsl.g:4204:2: ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' )
            {
            // InternalMyDsl.g:4204:2: ( (kw= 'case' this_ExpressionList_1= ruleExpressionList ) | kw= 'default' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==48) ) {
                alt68=1;
            }
            else if ( (LA68_0==49) ) {
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
                    // InternalMyDsl.g:4205:3: (kw= 'case' this_ExpressionList_1= ruleExpressionList )
                    {
                    // InternalMyDsl.g:4205:3: (kw= 'case' this_ExpressionList_1= ruleExpressionList )
                    // InternalMyDsl.g:4206:4: kw= 'case' this_ExpressionList_1= ruleExpressionList
                    {
                    kw=(Token)match(input,48,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:4223:3: kw= 'default'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4232:1: entryRuleIfStmt returns [String current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final String entryRuleIfStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmt = null;


        try {
            // InternalMyDsl.g:4232:46: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMyDsl.g:4233:2: iv_ruleIfStmt= ruleIfStmt EOF
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
    // InternalMyDsl.g:4239:1: ruleIfStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) ) ;
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
            // InternalMyDsl.g:4245:2: ( (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) ) )
            // InternalMyDsl.g:4246:2: (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) )
            {
            // InternalMyDsl.g:4246:2: (kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) )
            // InternalMyDsl.g:4247:3: kw= 'if' (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) )
            {
            kw=(Token)match(input,52,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIfStmtAccess().getIfKeyword_0());
              		
            }
            // InternalMyDsl.g:4252:3: (this_SimpleStmt_1= ruleSimpleStmt kw= ';' )
            // InternalMyDsl.g:4253:4: this_SimpleStmt_1= ruleSimpleStmt kw= ';'
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
            kw=(Token)match(input,29,FOLLOW_29); if (state.failed) return current;
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
            // InternalMyDsl.g:4289:3: (kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) )
            // InternalMyDsl.g:4290:4: kw= 'else' (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock )
            {
            kw=(Token)match(input,53,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getIfStmtAccess().getElseKeyword_4_0());
              			
            }
            // InternalMyDsl.g:4295:4: (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==52) ) {
                alt69=1;
            }
            else if ( (LA69_0==28) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:4296:5: this_IfStmt_6= ruleIfStmt
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
                    // InternalMyDsl.g:4307:5: this_Block_7= ruleBlock
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
    // InternalMyDsl.g:4323:1: entryRuleFallthroughStmt returns [String current=null] : iv_ruleFallthroughStmt= ruleFallthroughStmt EOF ;
    public final String entryRuleFallthroughStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFallthroughStmt = null;


        try {
            // InternalMyDsl.g:4323:55: (iv_ruleFallthroughStmt= ruleFallthroughStmt EOF )
            // InternalMyDsl.g:4324:2: iv_ruleFallthroughStmt= ruleFallthroughStmt EOF
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
    // InternalMyDsl.g:4330:1: ruleFallthroughStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'fallthrough' ;
    public final AntlrDatatypeRuleToken ruleFallthroughStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4336:2: (kw= 'fallthrough' )
            // InternalMyDsl.g:4337:2: kw= 'fallthrough'
            {
            kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4345:1: entryRuleGotoStmt returns [String current=null] : iv_ruleGotoStmt= ruleGotoStmt EOF ;
    public final String entryRuleGotoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGotoStmt = null;


        try {
            // InternalMyDsl.g:4345:48: (iv_ruleGotoStmt= ruleGotoStmt EOF )
            // InternalMyDsl.g:4346:2: iv_ruleGotoStmt= ruleGotoStmt EOF
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
    // InternalMyDsl.g:4352:1: ruleGotoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goto' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGotoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4358:2: ( (kw= 'goto' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4359:2: (kw= 'goto' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4359:2: (kw= 'goto' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4360:3: kw= 'goto' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,55,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:4379:1: entryRuleContinueStmt returns [String current=null] : iv_ruleContinueStmt= ruleContinueStmt EOF ;
    public final String entryRuleContinueStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinueStmt = null;


        try {
            // InternalMyDsl.g:4379:52: (iv_ruleContinueStmt= ruleContinueStmt EOF )
            // InternalMyDsl.g:4380:2: iv_ruleContinueStmt= ruleContinueStmt EOF
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
    // InternalMyDsl.g:4386:1: ruleContinueStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'continue' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleContinueStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4392:2: ( (kw= 'continue' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4393:2: (kw= 'continue' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4393:2: (kw= 'continue' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4394:3: kw= 'continue' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,56,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:4413:1: entryRuleBreakStmt returns [String current=null] : iv_ruleBreakStmt= ruleBreakStmt EOF ;
    public final String entryRuleBreakStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStmt = null;


        try {
            // InternalMyDsl.g:4413:49: (iv_ruleBreakStmt= ruleBreakStmt EOF )
            // InternalMyDsl.g:4414:2: iv_ruleBreakStmt= ruleBreakStmt EOF
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
    // InternalMyDsl.g:4420:1: ruleBreakStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'break' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleBreakStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4426:2: ( (kw= 'break' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4427:2: (kw= 'break' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4427:2: (kw= 'break' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4428:3: kw= 'break' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,57,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:4447:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalMyDsl.g:4447:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalMyDsl.g:4448:2: iv_ruleReturnStmt= ruleReturnStmt EOF
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
    // InternalMyDsl.g:4454:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'return' this_ExpressionList_1= ruleExpressionList ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4460:2: ( (kw= 'return' this_ExpressionList_1= ruleExpressionList ) )
            // InternalMyDsl.g:4461:2: (kw= 'return' this_ExpressionList_1= ruleExpressionList )
            {
            // InternalMyDsl.g:4461:2: (kw= 'return' this_ExpressionList_1= ruleExpressionList )
            // InternalMyDsl.g:4462:3: kw= 'return' this_ExpressionList_1= ruleExpressionList
            {
            kw=(Token)match(input,58,FOLLOW_29); if (state.failed) return current;
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
    // InternalMyDsl.g:4481:1: entryRuleGoStmt returns [String current=null] : iv_ruleGoStmt= ruleGoStmt EOF ;
    public final String entryRuleGoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoStmt = null;


        try {
            // InternalMyDsl.g:4481:46: (iv_ruleGoStmt= ruleGoStmt EOF )
            // InternalMyDsl.g:4482:2: iv_ruleGoStmt= ruleGoStmt EOF
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
    // InternalMyDsl.g:4488:1: ruleGoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'go' this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4494:2: ( (kw= 'go' this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4495:2: (kw= 'go' this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4495:2: (kw= 'go' this_Label_1= ruleLabel )
            // InternalMyDsl.g:4496:3: kw= 'go' this_Label_1= ruleLabel
            {
            kw=(Token)match(input,59,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:4515:1: entryRuleSimpleStmt returns [String current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final String entryRuleSimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmt = null;


        try {
            // InternalMyDsl.g:4515:50: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalMyDsl.g:4516:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
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
    // InternalMyDsl.g:4522:1: ruleSimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) ) ;
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
            // InternalMyDsl.g:4528:2: ( ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) ) )
            // InternalMyDsl.g:4529:2: ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) )
            {
            // InternalMyDsl.g:4529:2: ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_DECIMAL_DIGITS||(LA72_0>=RULE_STRING_LIT && LA72_0<=RULE_UNARY_OP)||LA72_0==RULE_INTEGERLITERAL||LA72_0==21||LA72_0==23||LA72_0==25||LA72_0==27||(LA72_0>=31 && LA72_0<=32)||(LA72_0>=34 && LA72_0<=38)) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_IDENTIFIER) ) {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==RULE_ANY_OTHER||LA72_2==21) ) {
                    alt72=1;
                }
                else if ( (LA72_2==33||LA72_2==44) ) {
                    alt72=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalMyDsl.g:4530:3: (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha )
                    {
                    // InternalMyDsl.g:4530:3: (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha )
                    // InternalMyDsl.g:4531:4: this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha
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
                    // InternalMyDsl.g:4553:3: ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) )
                    {
                    // InternalMyDsl.g:4553:3: ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) )
                    // InternalMyDsl.g:4554:4: (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* )
                    {
                    // InternalMyDsl.g:4554:4: (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* )
                    // InternalMyDsl.g:4555:5: this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )*
                    {
                    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IDENTIFIER_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_IDENTIFIER_2, grammarAccess.getSimpleStmtAccess().getIDENTIFIERTerminalRuleCall_1_0_0());
                      				
                    }
                    // InternalMyDsl.g:4562:5: (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==33) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalMyDsl.g:4563:6: kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_11); if (state.failed) return current;
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
                    	    break loop70;
                        }
                    } while (true);


                    }

                    kw=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getColonEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:4582:4: (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* )
                    // InternalMyDsl.g:4583:5: this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )*
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
                    // InternalMyDsl.g:4593:5: (kw= ',' this_Expression_8= ruleExpression )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==33) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalMyDsl.g:4594:6: kw= ',' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                    	    break loop71;
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
    // InternalMyDsl.g:4616:1: entryRuleSimpleStmtLinha returns [String current=null] : iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF ;
    public final String entryRuleSimpleStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmtLinha = null;


        try {
            // InternalMyDsl.g:4616:55: (iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF )
            // InternalMyDsl.g:4617:2: iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF
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
    // InternalMyDsl.g:4623:1: ruleSimpleStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) ) ;
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
            // InternalMyDsl.g:4629:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) ) )
            // InternalMyDsl.g:4630:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) )
            {
            // InternalMyDsl.g:4630:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt76=1;
                }
                break;
            case 60:
            case 61:
                {
                alt76=2;
                }
                break;
            case RULE_ADD_OP:
            case RULE_MUL_OP:
            case 33:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:4631:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:4631:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:4632:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,38,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:4649:3: (kw= '++' | kw= '--' )
                    {
                    // InternalMyDsl.g:4649:3: (kw= '++' | kw= '--' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==60) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==61) ) {
                        alt73=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalMyDsl.g:4650:4: kw= '++'
                            {
                            kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getPlusSignPlusSignKeyword_1_0());
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4656:4: kw= '--'
                            {
                            kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
                    // InternalMyDsl.g:4663:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) )
                    {
                    // InternalMyDsl.g:4663:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) )
                    // InternalMyDsl.g:4664:4: (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* )
                    {
                    // InternalMyDsl.g:4664:4: (kw= ',' this_Expression_5= ruleExpression )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==33) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyDsl.g:4665:5: kw= ',' this_Expression_5= ruleExpression
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                    	    break loop74;
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
                    // InternalMyDsl.g:4691:4: (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* )
                    // InternalMyDsl.g:4692:5: this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )*
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
                    // InternalMyDsl.g:4702:5: (kw= ',' this_Expression_9= ruleExpression )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==33) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalMyDsl.g:4703:6: kw= ',' this_Expression_9= ruleExpression
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
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
                    	    break loop75;
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
    // InternalMyDsl.g:4725:1: entryRuleassign_op returns [String current=null] : iv_ruleassign_op= ruleassign_op EOF ;
    public final String entryRuleassign_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign_op = null;


        try {
            // InternalMyDsl.g:4725:49: (iv_ruleassign_op= ruleassign_op EOF )
            // InternalMyDsl.g:4726:2: iv_ruleassign_op= ruleassign_op EOF
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
    // InternalMyDsl.g:4732:1: ruleassign_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleassign_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADD_OP_0=null;
        Token this_MUL_OP_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4738:2: ( ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' ) )
            // InternalMyDsl.g:4739:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' )
            {
            // InternalMyDsl.g:4739:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' )
            // InternalMyDsl.g:4740:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '='
            {
            // InternalMyDsl.g:4740:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ADD_OP) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_MUL_OP) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:4741:4: this_ADD_OP_0= RULE_ADD_OP
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
                    // InternalMyDsl.g:4749:4: this_MUL_OP_1= RULE_MUL_OP
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

            kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLabeledStmt"
    // InternalMyDsl.g:4766:1: entryRuleLabeledStmt returns [String current=null] : iv_ruleLabeledStmt= ruleLabeledStmt EOF ;
    public final String entryRuleLabeledStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabeledStmt = null;


        try {
            // InternalMyDsl.g:4766:51: (iv_ruleLabeledStmt= ruleLabeledStmt EOF )
            // InternalMyDsl.g:4767:2: iv_ruleLabeledStmt= ruleLabeledStmt EOF
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
    // InternalMyDsl.g:4773:1: ruleLabeledStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) ;
    public final AntlrDatatypeRuleToken ruleLabeledStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_0 = null;

        AntlrDatatypeRuleToken this_Statement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4779:2: ( (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) )
            // InternalMyDsl.g:4780:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            {
            // InternalMyDsl.g:4780:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            // InternalMyDsl.g:4781:3: this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement
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
            kw=(Token)match(input,41,FOLLOW_52); if (state.failed) return current;
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
    // InternalMyDsl.g:4810:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:4810:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:4811:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalMyDsl.g:4817:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4823:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:4824:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:4834:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:4834:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:4835:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:4841:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDecl_1 = null;

        AntlrDatatypeRuleToken this_VarDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4847:2: ( (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) )
            // InternalMyDsl.g:4848:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            {
            // InternalMyDsl.g:4848:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt78=1;
                }
                break;
            case 51:
                {
                alt78=2;
                }
                break;
            case 63:
                {
                alt78=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:4849:3: this_ConstDecl_0= ruleConstDecl
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
                    // InternalMyDsl.g:4860:3: this_TypeDecl_1= ruleTypeDecl
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
                    // InternalMyDsl.g:4871:3: this_VarDecl_2= ruleVarDecl
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
    // InternalMyDsl.g:4885:1: entryRuleTopLevelDecl returns [String current=null] : iv_ruleTopLevelDecl= ruleTopLevelDecl EOF ;
    public final String entryRuleTopLevelDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelDecl = null;


        try {
            // InternalMyDsl.g:4885:52: (iv_ruleTopLevelDecl= ruleTopLevelDecl EOF )
            // InternalMyDsl.g:4886:2: iv_ruleTopLevelDecl= ruleTopLevelDecl EOF
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
    // InternalMyDsl.g:4892:1: ruleTopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;

        AntlrDatatypeRuleToken this_FunctionDecl_1 = null;

        AntlrDatatypeRuleToken this_MethodDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4898:2: ( (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) )
            // InternalMyDsl.g:4899:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            {
            // InternalMyDsl.g:4899:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==51||(LA79_0>=62 && LA79_0<=63)) ) {
                alt79=1;
            }
            else if ( (LA79_0==32) ) {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==RULE_IDENTIFIER) ) {
                    alt79=2;
                }
                else if ( (LA79_2==23) ) {
                    alt79=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:4900:3: this_Declaration_0= ruleDeclaration
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
                    // InternalMyDsl.g:4911:3: this_FunctionDecl_1= ruleFunctionDecl
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
                    // InternalMyDsl.g:4922:3: this_MethodDecl_2= ruleMethodDecl
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
    // InternalMyDsl.g:4936:1: entryRuleConstDecl returns [String current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final String entryRuleConstDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstDecl = null;


        try {
            // InternalMyDsl.g:4936:49: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalMyDsl.g:4937:2: iv_ruleConstDecl= ruleConstDecl EOF
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
    // InternalMyDsl.g:4943:1: ruleConstDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleConstDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstSpec_1 = null;

        AntlrDatatypeRuleToken this_ConstSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4949:2: ( (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:4950:2: (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:4950:2: (kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:4951:3: kw= 'const' (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,62,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getConstDeclAccess().getConstKeyword_0());
              		
            }
            // InternalMyDsl.g:4956:3: (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_IDENTIFIER) ) {
                alt81=1;
            }
            else if ( (LA81_0==23) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalMyDsl.g:4957:4: this_ConstSpec_1= ruleConstSpec
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
                    // InternalMyDsl.g:4968:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:4968:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:4969:5: kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:4974:5: (this_ConstSpec_3= ruleConstSpec kw= ';' )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_IDENTIFIER) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalMyDsl.g:4975:6: this_ConstSpec_3= ruleConstSpec kw= ';'
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
                    	    kw=(Token)match(input,29,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getConstDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5002:1: entryRuleConstSpec returns [String current=null] : iv_ruleConstSpec= ruleConstSpec EOF ;
    public final String entryRuleConstSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstSpec = null;


        try {
            // InternalMyDsl.g:5002:49: (iv_ruleConstSpec= ruleConstSpec EOF )
            // InternalMyDsl.g:5003:2: iv_ruleConstSpec= ruleConstSpec EOF
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
    // InternalMyDsl.g:5009:1: ruleConstSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) ;
    public final AntlrDatatypeRuleToken ruleConstSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5015:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) )
            // InternalMyDsl.g:5016:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            {
            // InternalMyDsl.g:5016:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            // InternalMyDsl.g:5017:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
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
            // InternalMyDsl.g:5027:3: ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_IDENTIFIER||LA83_0==23||LA83_0==25||LA83_0==27||(LA83_0>=31 && LA83_0<=32)||(LA83_0>=35 && LA83_0<=38)||LA83_0==45) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:5028:4: (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList
                    {
                    // InternalMyDsl.g:5028:4: (this_Type_1= ruleType )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==RULE_IDENTIFIER||LA82_0==23||LA82_0==25||LA82_0==27||(LA82_0>=31 && LA82_0<=32)||(LA82_0>=35 && LA82_0<=38)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalMyDsl.g:5029:5: this_Type_1= ruleType
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

                    kw=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
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
    // InternalMyDsl.g:5060:1: entryRuleTypeDecl returns [String current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final String entryRuleTypeDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDecl = null;


        try {
            // InternalMyDsl.g:5060:48: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalMyDsl.g:5061:2: iv_ruleTypeDecl= ruleTypeDecl EOF
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
    // InternalMyDsl.g:5067:1: ruleTypeDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpec_1 = null;

        AntlrDatatypeRuleToken this_TypeSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5073:2: ( (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5074:2: (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5074:2: (kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5075:3: kw= 'type' (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,51,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeDeclAccess().getTypeKeyword_0());
              		
            }
            // InternalMyDsl.g:5080:3: (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_IDENTIFIER) ) {
                alt85=1;
            }
            else if ( (LA85_0==23) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:5081:4: this_TypeSpec_1= ruleTypeSpec
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
                    // InternalMyDsl.g:5092:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5092:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5093:5: kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5098:5: (this_TypeSpec_3= ruleTypeSpec kw= ';' )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==RULE_IDENTIFIER) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalMyDsl.g:5099:6: this_TypeSpec_3= ruleTypeSpec kw= ';'
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
                    	    kw=(Token)match(input,29,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5126:1: entryRuleTypeSpec returns [String current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final String entryRuleTypeSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpec = null;


        try {
            // InternalMyDsl.g:5126:48: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalMyDsl.g:5127:2: iv_ruleTypeSpec= ruleTypeSpec EOF
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
    // InternalMyDsl.g:5133:1: ruleTypeSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AliasDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDef_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5139:2: ( (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) )
            // InternalMyDsl.g:5140:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            {
            // InternalMyDsl.g:5140:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_IDENTIFIER) ) {
                int LA86_1 = input.LA(2);

                if ( (LA86_1==RULE_IDENTIFIER||LA86_1==23||LA86_1==25||LA86_1==27||(LA86_1>=31 && LA86_1<=32)||(LA86_1>=35 && LA86_1<=38)) ) {
                    alt86=2;
                }
                else if ( (LA86_1==45) ) {
                    alt86=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:5141:3: this_AliasDecl_0= ruleAliasDecl
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
                    // InternalMyDsl.g:5152:3: this_TypeDef_1= ruleTypeDef
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
    // InternalMyDsl.g:5166:1: entryRuleAliasDecl returns [String current=null] : iv_ruleAliasDecl= ruleAliasDecl EOF ;
    public final String entryRuleAliasDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDecl = null;


        try {
            // InternalMyDsl.g:5166:49: (iv_ruleAliasDecl= ruleAliasDecl EOF )
            // InternalMyDsl.g:5167:2: iv_ruleAliasDecl= ruleAliasDecl EOF
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
    // InternalMyDsl.g:5173:1: ruleAliasDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleAliasDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5179:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) )
            // InternalMyDsl.g:5180:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            {
            // InternalMyDsl.g:5180:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            // InternalMyDsl.g:5181:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getAliasDeclAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
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
    // InternalMyDsl.g:5207:1: entryRuleTypeDef returns [String current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final String entryRuleTypeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDef = null;


        try {
            // InternalMyDsl.g:5207:47: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyDsl.g:5208:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalMyDsl.g:5214:1: ruleTypeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleTypeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5220:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) )
            // InternalMyDsl.g:5221:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            {
            // InternalMyDsl.g:5221:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            // InternalMyDsl.g:5222:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType
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
    // InternalMyDsl.g:5243:1: entryRuleVarDecl returns [String current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final String entryRuleVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarDecl = null;


        try {
            // InternalMyDsl.g:5243:47: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMyDsl.g:5244:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalMyDsl.g:5250:1: ruleVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_VarSpec_1 = null;

        AntlrDatatypeRuleToken this_VarSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5256:2: ( (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5257:2: (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5257:2: (kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5258:3: kw= 'var' (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,63,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVarDeclAccess().getVarKeyword_0());
              		
            }
            // InternalMyDsl.g:5263:3: (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_IDENTIFIER) ) {
                alt88=1;
            }
            else if ( (LA88_0==23) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalMyDsl.g:5264:4: this_VarSpec_1= ruleVarSpec
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
                    // InternalMyDsl.g:5275:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5275:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5276:5: kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5281:5: (this_VarSpec_3= ruleVarSpec kw= ';' )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==RULE_IDENTIFIER) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMyDsl.g:5282:6: this_VarSpec_3= ruleVarSpec kw= ';'
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
                    	    kw=(Token)match(input,29,FOLLOW_59); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getVarDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5309:1: entryRuleVarSpec returns [String current=null] : iv_ruleVarSpec= ruleVarSpec EOF ;
    public final String entryRuleVarSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarSpec = null;


        try {
            // InternalMyDsl.g:5309:47: (iv_ruleVarSpec= ruleVarSpec EOF )
            // InternalMyDsl.g:5310:2: iv_ruleVarSpec= ruleVarSpec EOF
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
    // InternalMyDsl.g:5316:1: ruleVarSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;

        AntlrDatatypeRuleToken this_ExpressionList_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5322:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) )
            // InternalMyDsl.g:5323:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            {
            // InternalMyDsl.g:5323:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            // InternalMyDsl.g:5324:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
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
            // InternalMyDsl.g:5334:3: ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_IDENTIFIER||LA90_0==23||LA90_0==25||LA90_0==27||(LA90_0>=31 && LA90_0<=32)||(LA90_0>=35 && LA90_0<=38)) ) {
                alt90=1;
            }
            else if ( (LA90_0==45) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalMyDsl.g:5335:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    {
                    // InternalMyDsl.g:5335:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    // InternalMyDsl.g:5336:5: this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )?
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
                    // InternalMyDsl.g:5346:5: (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==45) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalMyDsl.g:5347:6: kw= '=' this_ExpressionList_3= ruleExpressionList
                            {
                            kw=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
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
                    // InternalMyDsl.g:5365:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    {
                    // InternalMyDsl.g:5365:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    // InternalMyDsl.g:5366:5: kw= '=' this_ExpressionList_5= ruleExpressionList
                    {
                    kw=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
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
    // InternalMyDsl.g:5387:1: entryRuleFunctionDecl returns [String current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final String entryRuleFunctionDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:5387:52: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:5388:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalMyDsl.g:5394:1: ruleFunctionDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionName_1 = null;

        AntlrDatatypeRuleToken this_Signature_2 = null;

        AntlrDatatypeRuleToken this_FunctionBody_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5400:2: ( (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) )
            // InternalMyDsl.g:5401:2: (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:5401:2: (kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            // InternalMyDsl.g:5402:3: kw= 'func' this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )?
            {
            kw=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
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
            // InternalMyDsl.g:5427:3: (this_FunctionBody_3= ruleFunctionBody )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==28) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalMyDsl.g:5428:4: this_FunctionBody_3= ruleFunctionBody
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
    // InternalMyDsl.g:5443:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:5443:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:5444:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMyDsl.g:5450:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5456:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:5457:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:5467:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // InternalMyDsl.g:5467:52: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalMyDsl.g:5468:2: iv_ruleFunctionBody= ruleFunctionBody EOF
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
    // InternalMyDsl.g:5474:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Block_0= ruleBlock ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Block_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5480:2: (this_Block_0= ruleBlock )
            // InternalMyDsl.g:5481:2: this_Block_0= ruleBlock
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
    // InternalMyDsl.g:5494:1: entryRuleMethodDecl returns [String current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final String entryRuleMethodDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodDecl = null;


        try {
            // InternalMyDsl.g:5494:50: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalMyDsl.g:5495:2: iv_ruleMethodDecl= ruleMethodDecl EOF
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
    // InternalMyDsl.g:5501:1: ruleMethodDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Receiver_1 = null;

        AntlrDatatypeRuleToken this_MethodName_2 = null;

        AntlrDatatypeRuleToken this_Signature_3 = null;

        AntlrDatatypeRuleToken this_FunctionBody_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5507:2: ( (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) )
            // InternalMyDsl.g:5508:2: (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:5508:2: (kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            // InternalMyDsl.g:5509:3: kw= 'func' this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )?
            {
            kw=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
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
            // InternalMyDsl.g:5544:3: (this_FunctionBody_4= ruleFunctionBody )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==28) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalMyDsl.g:5545:4: this_FunctionBody_4= ruleFunctionBody
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
    // InternalMyDsl.g:5560:1: entryRuleReceiver returns [String current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final String entryRuleReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiver = null;


        try {
            // InternalMyDsl.g:5560:48: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalMyDsl.g:5561:2: iv_ruleReceiver= ruleReceiver EOF
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
    // InternalMyDsl.g:5567:1: ruleReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Parameters_0= ruleParameters ;
    public final AntlrDatatypeRuleToken ruleReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5573:2: (this_Parameters_0= ruleParameters )
            // InternalMyDsl.g:5574:2: this_Parameters_0= ruleParameters
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


    // $ANTLR start "entryRuleBasicLit"
    // InternalMyDsl.g:5587:1: entryRuleBasicLit returns [String current=null] : iv_ruleBasicLit= ruleBasicLit EOF ;
    public final String entryRuleBasicLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicLit = null;


        try {
            // InternalMyDsl.g:5587:48: (iv_ruleBasicLit= ruleBasicLit EOF )
            // InternalMyDsl.g:5588:2: iv_ruleBasicLit= ruleBasicLit EOF
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
    // InternalMyDsl.g:5594:1: ruleBasicLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGERLITERAL_0= RULE_INTEGERLITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit ) ;
    public final AntlrDatatypeRuleToken ruleBasicLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGERLITERAL_0=null;
        Token this_STRING_LIT_1=null;
        AntlrDatatypeRuleToken this_float_literal_2 = null;

        AntlrDatatypeRuleToken this_Imaginary_lit_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5600:2: ( (this_INTEGERLITERAL_0= RULE_INTEGERLITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit ) )
            // InternalMyDsl.g:5601:2: (this_INTEGERLITERAL_0= RULE_INTEGERLITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit )
            {
            // InternalMyDsl.g:5601:2: (this_INTEGERLITERAL_0= RULE_INTEGERLITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit )
            int alt93=4;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalMyDsl.g:5602:3: this_INTEGERLITERAL_0= RULE_INTEGERLITERAL
                    {
                    this_INTEGERLITERAL_0=(Token)match(input,RULE_INTEGERLITERAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INTEGERLITERAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INTEGERLITERAL_0, grammarAccess.getBasicLitAccess().getINTEGERLITERALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5610:3: this_STRING_LIT_1= RULE_STRING_LIT
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
                    // InternalMyDsl.g:5618:3: this_float_literal_2= rulefloat_literal
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
                    // InternalMyDsl.g:5629:3: this_Imaginary_lit_3= ruleImaginary_lit
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


    // $ANTLR start "entryRuleLiteralValue"
    // InternalMyDsl.g:5643:1: entryRuleLiteralValue returns [String current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final String entryRuleLiteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralValue = null;


        try {
            // InternalMyDsl.g:5643:52: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalMyDsl.g:5644:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalMyDsl.g:5650:1: ruleLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ElementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5656:2: ( (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) )
            // InternalMyDsl.g:5657:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            {
            // InternalMyDsl.g:5657:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            // InternalMyDsl.g:5658:3: kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,28,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyDsl.g:5663:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // InternalMyDsl.g:5664:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )?
                    {
                    // InternalMyDsl.g:5664:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList )
                    // InternalMyDsl.g:5665:5: ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList
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

                    // InternalMyDsl.g:5681:4: (kw= ',' )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==33) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // InternalMyDsl.g:5682:5: kw= ','
                            {
                            kw=(Token)match(input,33,FOLLOW_24); if (state.failed) return current;
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

            kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5698:1: entryRuleElementList returns [String current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final String entryRuleElementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementList = null;


        try {
            // InternalMyDsl.g:5698:51: (iv_ruleElementList= ruleElementList EOF )
            // InternalMyDsl.g:5699:2: iv_ruleElementList= ruleElementList EOF
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
    // InternalMyDsl.g:5705:1: ruleElementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) ;
    public final AntlrDatatypeRuleToken ruleElementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_KeyedElement_0 = null;

        AntlrDatatypeRuleToken this_KeyedElement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5711:2: ( ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) )
            // InternalMyDsl.g:5712:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            {
            // InternalMyDsl.g:5712:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            // InternalMyDsl.g:5713:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            {
            // InternalMyDsl.g:5713:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement )
            // InternalMyDsl.g:5714:4: ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement
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

            // InternalMyDsl.g:5730:3: (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==33) ) {
                    int LA96_1 = input.LA(2);

                    if ( (LA96_1==RULE_DECIMAL_DIGITS||LA96_1==RULE_IDENTIFIER||(LA96_1>=RULE_STRING_LIT && LA96_1<=RULE_UNARY_OP)||LA96_1==RULE_INTEGERLITERAL||LA96_1==21||LA96_1==23||LA96_1==25||(LA96_1>=27 && LA96_1<=28)||(LA96_1>=31 && LA96_1<=32)||(LA96_1>=34 && LA96_1<=38)) ) {
                        alt96=1;
                    }


                }


                switch (alt96) {
            	case 1 :
            	    // InternalMyDsl.g:5731:4: kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    {
            	    kw=(Token)match(input,33,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:5736:4: ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    // InternalMyDsl.g:5737:5: ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement
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
            	    break loop96;
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
    // InternalMyDsl.g:5758:1: entryRuleKeyedElement returns [String current=null] : iv_ruleKeyedElement= ruleKeyedElement EOF ;
    public final String entryRuleKeyedElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyedElement = null;


        try {
            // InternalMyDsl.g:5758:52: (iv_ruleKeyedElement= ruleKeyedElement EOF )
            // InternalMyDsl.g:5759:2: iv_ruleKeyedElement= ruleKeyedElement EOF
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
    // InternalMyDsl.g:5765:1: ruleKeyedElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) ;
    public final AntlrDatatypeRuleToken ruleKeyedElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_Element_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5771:2: ( ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) )
            // InternalMyDsl.g:5772:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            {
            // InternalMyDsl.g:5772:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            // InternalMyDsl.g:5773:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement
            {
            // InternalMyDsl.g:5773:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalMyDsl.g:5774:4: ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' )
                    {
                    // InternalMyDsl.g:5779:4: (this_Key_0= ruleKey kw= ':' )
                    // InternalMyDsl.g:5780:5: this_Key_0= ruleKey kw= ':'
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
                    kw=(Token)match(input,41,FOLLOW_41); if (state.failed) return current;
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
    // InternalMyDsl.g:5811:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalMyDsl.g:5811:43: (iv_ruleKey= ruleKey EOF )
            // InternalMyDsl.g:5812:2: iv_ruleKey= ruleKey EOF
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
    // InternalMyDsl.g:5818:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FieldName_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_LiteralValue_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5824:2: ( (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) )
            // InternalMyDsl.g:5825:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            {
            // InternalMyDsl.g:5825:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            int alt98=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==RULE_ANY_OTHER||LA98_1==21) ) {
                    alt98=2;
                }
                else if ( (LA98_1==EOF||LA98_1==41) ) {
                    alt98=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMAL_DIGITS:
            case RULE_STRING_LIT:
            case RULE_UNARY_OP:
            case RULE_INTEGERLITERAL:
            case 21:
            case 23:
            case 25:
            case 27:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt98=2;
                }
                break;
            case 28:
                {
                alt98=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalMyDsl.g:5826:3: this_FieldName_0= ruleFieldName
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
                    // InternalMyDsl.g:5837:3: this_Expression_1= ruleExpression
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
                    // InternalMyDsl.g:5848:3: this_LiteralValue_2= ruleLiteralValue
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
    // InternalMyDsl.g:5862:1: entryRuleFieldName returns [String current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final String entryRuleFieldName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldName = null;


        try {
            // InternalMyDsl.g:5862:49: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalMyDsl.g:5863:2: iv_ruleFieldName= ruleFieldName EOF
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
    // InternalMyDsl.g:5869:1: ruleFieldName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFieldName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5875:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:5876:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:5886:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalMyDsl.g:5886:47: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:5887:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:5893:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5899:2: ( (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) )
            // InternalMyDsl.g:5900:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalMyDsl.g:5900:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_DECIMAL_DIGITS||LA99_0==RULE_IDENTIFIER||(LA99_0>=RULE_STRING_LIT && LA99_0<=RULE_UNARY_OP)||LA99_0==RULE_INTEGERLITERAL||LA99_0==21||LA99_0==23||LA99_0==25||LA99_0==27||(LA99_0>=31 && LA99_0<=32)||(LA99_0>=34 && LA99_0<=38)) ) {
                alt99=1;
            }
            else if ( (LA99_0==28) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalMyDsl.g:5901:3: this_Expression_0= ruleExpression
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
                    // InternalMyDsl.g:5912:3: this_LiteralValue_1= ruleLiteralValue
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


    // $ANTLR start "entryRuleSourceFile"
    // InternalMyDsl.g:5926:1: entryRuleSourceFile returns [String current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final String entryRuleSourceFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSourceFile = null;


        try {
            // InternalMyDsl.g:5926:50: (iv_ruleSourceFile= ruleSourceFile EOF )
            // InternalMyDsl.g:5927:2: iv_ruleSourceFile= ruleSourceFile EOF
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
    // InternalMyDsl.g:5933:1: ruleSourceFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruleSourceFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageClause_0 = null;

        AntlrDatatypeRuleToken this_ImportDecl_2 = null;

        AntlrDatatypeRuleToken this_TopLevelDecl_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5939:2: ( (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) )
            // InternalMyDsl.g:5940:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            {
            // InternalMyDsl.g:5940:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            // InternalMyDsl.g:5941:3: this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
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
            kw=(Token)match(input,29,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1());
              		
            }
            // InternalMyDsl.g:5956:3: (this_ImportDecl_2= ruleImportDecl kw= ';' )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==65) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalMyDsl.g:5957:4: this_ImportDecl_2= ruleImportDecl kw= ';'
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
            	    kw=(Token)match(input,29,FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            // InternalMyDsl.g:5973:3: (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==32||LA101_0==51||(LA101_0>=62 && LA101_0<=63)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalMyDsl.g:5974:4: this_TopLevelDecl_4= ruleTopLevelDecl kw= ';'
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
            	    kw=(Token)match(input,29,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
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
    // InternalMyDsl.g:5994:1: entryRulePackageClause returns [String current=null] : iv_rulePackageClause= rulePackageClause EOF ;
    public final String entryRulePackageClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageClause = null;


        try {
            // InternalMyDsl.g:5994:53: (iv_rulePackageClause= rulePackageClause EOF )
            // InternalMyDsl.g:5995:2: iv_rulePackageClause= rulePackageClause EOF
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
    // InternalMyDsl.g:6001:1: rulePackageClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_PackageName_1= rulePackageName ) ;
    public final AntlrDatatypeRuleToken rulePackageClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6007:2: ( (kw= 'package' this_PackageName_1= rulePackageName ) )
            // InternalMyDsl.g:6008:2: (kw= 'package' this_PackageName_1= rulePackageName )
            {
            // InternalMyDsl.g:6008:2: (kw= 'package' this_PackageName_1= rulePackageName )
            // InternalMyDsl.g:6009:3: kw= 'package' this_PackageName_1= rulePackageName
            {
            kw=(Token)match(input,64,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:6028:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalMyDsl.g:6028:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalMyDsl.g:6029:2: iv_ruleImportDecl= ruleImportDecl EOF
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
    // InternalMyDsl.g:6035:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6041:2: ( (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:6042:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:6042:2: (kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:6043:3: kw= 'import' (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            {
            kw=(Token)match(input,65,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getImportDeclAccess().getImportKeyword_0());
              		
            }
            // InternalMyDsl.g:6048:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_IDENTIFIER||LA103_0==RULE_STRING_LIT||LA103_0==21) ) {
                alt103=1;
            }
            else if ( (LA103_0==23) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalMyDsl.g:6049:4: this_ImportSpec_1= ruleImportSpec
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
                    // InternalMyDsl.g:6060:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:6060:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:6061:5: kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,23,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:6066:5: (this_ImportSpec_3= ruleImportSpec kw= ';' )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==RULE_IDENTIFIER||LA102_0==RULE_STRING_LIT||LA102_0==21) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // InternalMyDsl.g:6067:6: this_ImportSpec_3= ruleImportSpec kw= ';'
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
                    	    kw=(Token)match(input,29,FOLLOW_69); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getImportDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:6094:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalMyDsl.g:6094:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalMyDsl.g:6095:2: iv_ruleImportSpec= ruleImportSpec EOF
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
    // InternalMyDsl.g:6101:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;

        AntlrDatatypeRuleToken this_ImportPath_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6107:2: ( ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) )
            // InternalMyDsl.g:6108:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            {
            // InternalMyDsl.g:6108:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            // InternalMyDsl.g:6109:3: (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath
            {
            // InternalMyDsl.g:6109:3: (kw= '.' | this_PackageName_1= rulePackageName )?
            int alt104=3;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==21) ) {
                alt104=1;
            }
            else if ( (LA104_0==RULE_IDENTIFIER) ) {
                alt104=2;
            }
            switch (alt104) {
                case 1 :
                    // InternalMyDsl.g:6110:4: kw= '.'
                    {
                    kw=(Token)match(input,21,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6116:4: this_PackageName_1= rulePackageName
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
    // InternalMyDsl.g:6141:1: entryRuleImportPath returns [String current=null] : iv_ruleImportPath= ruleImportPath EOF ;
    public final String entryRuleImportPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportPath = null;


        try {
            // InternalMyDsl.g:6141:50: (iv_ruleImportPath= ruleImportPath EOF )
            // InternalMyDsl.g:6142:2: iv_ruleImportPath= ruleImportPath EOF
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
    // InternalMyDsl.g:6148:1: ruleImportPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleImportPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6154:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:6155:2: this_STRING_LIT_0= RULE_STRING_LIT
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
        // InternalMyDsl.g:2297:5: ( ruleExpression )
        // InternalMyDsl.g:2297:6: ruleExpression
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
        // InternalMyDsl.g:2759:6: ( ruleExpressionList )
        // InternalMyDsl.g:2759:7: ruleExpressionList
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
        // InternalMyDsl.g:5665:5: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:5665:6: ( ruleKey ':' )
        {
        // InternalMyDsl.g:5665:6: ( ruleKey ':' )
        // InternalMyDsl.g:5666:6: ruleKey ':'
        {
        pushFollow(FOLLOW_36);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:5774:4: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:5774:5: ( ruleKey ':' )
        {
        // InternalMyDsl.g:5774:5: ( ruleKey ':' )
        // InternalMyDsl.g:5775:5: ruleKey ':'
        {
        pushFollow(FOLLOW_36);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // Delegated rules

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
    public final boolean synpred8_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA93 dfa93 = new DFA93(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA97 dfa97 = new DFA97(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\13\25\uffff";
    static final String dfa_3s = "\1\6\1\0\24\uffff";
    static final String dfa_4s = "\1\55\1\0\24\uffff";
    static final String dfa_5s = "\2\uffff\11\1\1\2\12\uffff";
    static final String dfa_6s = "\1\0\1\1\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\13\14\uffff\1\13\1\uffff\1\1\1\13\1\3\1\13\1\4\2\13\1\uffff\1\5\1\6\2\13\1\7\1\10\1\11\1\12\2\uffff\1\13\3\uffff\1\13",
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
                        if ( (LA12_0==23) ) {s = 1;}

                        else if ( (LA12_0==RULE_IDENTIFIER) && (synpred1_InternalMyDsl())) {s = 2;}

                        else if ( (LA12_0==25) && (synpred1_InternalMyDsl())) {s = 3;}

                        else if ( (LA12_0==27) && (synpred1_InternalMyDsl())) {s = 4;}

                        else if ( (LA12_0==31) && (synpred1_InternalMyDsl())) {s = 5;}

                        else if ( (LA12_0==32) && (synpred1_InternalMyDsl())) {s = 6;}

                        else if ( (LA12_0==35) && (synpred1_InternalMyDsl())) {s = 7;}

                        else if ( (LA12_0==36) && (synpred1_InternalMyDsl())) {s = 8;}

                        else if ( (LA12_0==37) && (synpred1_InternalMyDsl())) {s = 9;}

                        else if ( (LA12_0==38) && (synpred1_InternalMyDsl())) {s = 10;}

                        else if ( (LA12_0==EOF||LA12_0==RULE_STRING_LIT||LA12_0==21||LA12_0==24||LA12_0==26||(LA12_0>=28 && LA12_0<=29)||(LA12_0>=33 && LA12_0<=34)||LA12_0==41||LA12_0==45) ) {s = 11;}

                         
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
    static final String dfa_10s = "\1\46\1\0\12\uffff";
    static final String dfa_11s = "\2\uffff\1\2\10\uffff\1\1";
    static final String dfa_12s = "\1\uffff\1\0\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\20\uffff\1\1\1\uffff\1\2\1\uffff\1\2\3\uffff\2\2\2\uffff\4\2",
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
    static final String dfa_16s = "\1\46\4\uffff\3\0\1\uffff\7\0\2\uffff";
    static final String dfa_17s = "\1\uffff\4\1\3\uffff\1\1\7\uffff\1\1\1\2";
    static final String dfa_18s = "\1\0\4\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\1\uffff\1\11\1\uffff\1\2\1\20\3\uffff\1\1\7\uffff\1\4\1\uffff\1\12\1\uffff\1\13\1\uffff\1\5\3\uffff\1\14\1\7\1\uffff\1\10\1\15\1\6\1\16\1\17",
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

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2294:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_0==RULE_INTEGERLITERAL) && (synpred3_InternalMyDsl())) {s = 1;}

                        else if ( (LA31_0==RULE_STRING_LIT) && (synpred3_InternalMyDsl())) {s = 2;}

                        else if ( (LA31_0==RULE_DECIMAL_DIGITS) && (synpred3_InternalMyDsl())) {s = 3;}

                        else if ( (LA31_0==21) && (synpred3_InternalMyDsl())) {s = 4;}

                        else if ( (LA31_0==27) ) {s = 5;}

                        else if ( (LA31_0==36) ) {s = 6;}

                        else if ( (LA31_0==32) ) {s = 7;}

                        else if ( (LA31_0==34) && (synpred3_InternalMyDsl())) {s = 8;}

                        else if ( (LA31_0==RULE_IDENTIFIER) ) {s = 9;}

                        else if ( (LA31_0==23) ) {s = 10;}

                        else if ( (LA31_0==25) ) {s = 11;}

                        else if ( (LA31_0==31) ) {s = 12;}

                        else if ( (LA31_0==35) ) {s = 13;}

                        else if ( (LA31_0==37) ) {s = 14;}

                        else if ( (LA31_0==38) ) {s = 15;}

                        else if ( (LA31_0==RULE_UNARY_OP) && (synpred3_InternalMyDsl())) {s = 16;}

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2757:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==RULE_INTEGERLITERAL) && (synpred4_InternalMyDsl())) {s = 1;}

                        else if ( (LA41_0==RULE_STRING_LIT) && (synpred4_InternalMyDsl())) {s = 2;}

                        else if ( (LA41_0==RULE_DECIMAL_DIGITS) && (synpred4_InternalMyDsl())) {s = 3;}

                        else if ( (LA41_0==21) && (synpred4_InternalMyDsl())) {s = 4;}

                        else if ( (LA41_0==27) ) {s = 5;}

                        else if ( (LA41_0==36) ) {s = 6;}

                        else if ( (LA41_0==32) ) {s = 7;}

                        else if ( (LA41_0==34) && (synpred4_InternalMyDsl())) {s = 8;}

                        else if ( (LA41_0==RULE_IDENTIFIER) ) {s = 9;}

                        else if ( (LA41_0==23) ) {s = 10;}

                        else if ( (LA41_0==25) ) {s = 11;}

                        else if ( (LA41_0==31) ) {s = 12;}

                        else if ( (LA41_0==35) ) {s = 13;}

                        else if ( (LA41_0==37) ) {s = 14;}

                        else if ( (LA41_0==38) ) {s = 15;}

                        else if ( (LA41_0==RULE_UNARY_OP) && (synpred4_InternalMyDsl())) {s = 16;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_6 = input.LA(1);

                         
                        int index41_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_7 = input.LA(1);

                         
                        int index41_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA41_10 = input.LA(1);

                         
                        int index41_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA41_11 = input.LA(1);

                         
                        int index41_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA41_12 = input.LA(1);

                         
                        int index41_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA41_13 = input.LA(1);

                         
                        int index41_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA41_14 = input.LA(1);

                         
                        int index41_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA41_15 = input.LA(1);

                         
                        int index41_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index41_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\21\uffff";
    static final String dfa_21s = "\1\4\1\uffff\1\7\16\uffff";
    static final String dfa_22s = "\1\77\1\uffff\1\54\16\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\2";
    static final String dfa_24s = "\21\uffff}>";
    static final String[] dfa_25s = {
            "\1\3\1\uffff\1\2\1\uffff\2\3\3\uffff\1\3\7\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\12\2\uffff\2\3\1\uffff\5\3\3\uffff\1\17\1\16\3\uffff\1\15\2\uffff\1\14\1\1\1\13\1\uffff\1\11\1\10\1\7\1\6\1\5\1\4\2\uffff\2\1",
            "",
            "\1\3\15\uffff\1\3\13\uffff\1\3\7\uffff\1\20\2\uffff\1\3",
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

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2999:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )";
        }
    }
    static final String dfa_26s = "\11\uffff";
    static final String dfa_27s = "\1\4\1\uffff\1\7\1\uffff\1\6\1\4\1\41\2\uffff";
    static final String dfa_28s = "\1\55\1\uffff\1\54\1\uffff\1\6\1\56\1\54\2\uffff";
    static final String dfa_29s = "\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\1\4";
    static final String dfa_30s = "\11\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\1\uffff\1\2\1\uffff\2\1\3\uffff\1\1\7\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\2\1\1\3\5\1\6\uffff\1\3",
            "",
            "\1\1\15\uffff\1\1\13\uffff\1\4\12\uffff\1\5",
            "",
            "\1\6",
            "\1\7\1\uffff\1\7\1\uffff\2\7\3\uffff\1\7\7\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\3\uffff\2\7\1\uffff\5\7\7\uffff\1\10",
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

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3366:4: ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) )";
        }
    }
    static final String dfa_32s = "\15\uffff";
    static final String dfa_33s = "\6\uffff\1\12\4\uffff\2\12";
    static final String dfa_34s = "\1\4\2\uffff\1\5\2\4\1\25\1\uffff\2\5\1\uffff\2\25";
    static final String dfa_35s = "\1\25\2\uffff\1\26\2\4\1\31\1\uffff\2\5\1\uffff\2\31";
    static final String dfa_36s = "\1\uffff\1\1\1\2\4\uffff\1\4\2\uffff\1\3\2\uffff";
    static final String dfa_37s = "\15\uffff}>";
    static final String[] dfa_38s = {
            "\1\3\3\uffff\1\2\4\uffff\1\1\7\uffff\1\4",
            "",
            "",
            "\1\6\17\uffff\1\5\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\7\1\12\1\uffff\1\12",
            "",
            "\1\13",
            "\1\14",
            "",
            "\1\12\1\7\1\12\1\uffff\1\12",
            "\1\12\1\7\1\12\1\uffff\1\12"
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
            return "5601:2: (this_INTEGERLITERAL_0= RULE_INTEGERLITERAL | this_STRING_LIT_1= RULE_STRING_LIT | this_float_literal_2= rulefloat_literal | this_Imaginary_lit_3= ruleImaginary_lit )";
        }
    }
    static final String dfa_39s = "\23\uffff";
    static final String dfa_40s = "\1\4\22\uffff";
    static final String dfa_41s = "\1\46\22\uffff";
    static final String dfa_42s = "\1\uffff\21\1\1\2";
    static final String dfa_43s = "\1\0\22\uffff}>";
    static final String[] dfa_44s = {
            "\1\4\1\uffff\1\1\1\uffff\1\3\1\20\3\uffff\1\2\7\uffff\1\5\1\uffff\1\12\1\uffff\1\13\1\uffff\1\6\1\21\1\uffff\1\22\1\14\1\10\1\uffff\1\11\1\15\1\7\1\16\1\17",
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

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "5663:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_0 = input.LA(1);

                         
                        int index95_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA95_0==RULE_IDENTIFIER) && (synpred5_InternalMyDsl())) {s = 1;}

                        else if ( (LA95_0==RULE_INTEGERLITERAL) && (synpred5_InternalMyDsl())) {s = 2;}

                        else if ( (LA95_0==RULE_STRING_LIT) && (synpred5_InternalMyDsl())) {s = 3;}

                        else if ( (LA95_0==RULE_DECIMAL_DIGITS) && (synpred5_InternalMyDsl())) {s = 4;}

                        else if ( (LA95_0==21) && (synpred5_InternalMyDsl())) {s = 5;}

                        else if ( (LA95_0==27) && (synpred5_InternalMyDsl())) {s = 6;}

                        else if ( (LA95_0==36) && (synpred5_InternalMyDsl())) {s = 7;}

                        else if ( (LA95_0==32) && (synpred5_InternalMyDsl())) {s = 8;}

                        else if ( (LA95_0==34) && (synpred5_InternalMyDsl())) {s = 9;}

                        else if ( (LA95_0==23) && (synpred5_InternalMyDsl())) {s = 10;}

                        else if ( (LA95_0==25) && (synpred5_InternalMyDsl())) {s = 11;}

                        else if ( (LA95_0==31) && (synpred5_InternalMyDsl())) {s = 12;}

                        else if ( (LA95_0==35) && (synpred5_InternalMyDsl())) {s = 13;}

                        else if ( (LA95_0==37) && (synpred5_InternalMyDsl())) {s = 14;}

                        else if ( (LA95_0==38) && (synpred5_InternalMyDsl())) {s = 15;}

                        else if ( (LA95_0==RULE_UNARY_OP) && (synpred5_InternalMyDsl())) {s = 16;}

                        else if ( (LA95_0==28) && (synpred5_InternalMyDsl())) {s = 17;}

                        else if ( (LA95_0==30) ) {s = 18;}

                         
                        input.seek(index95_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\24\uffff";
    static final String dfa_46s = "\1\4\21\0\2\uffff";
    static final String dfa_47s = "\1\46\21\0\2\uffff";
    static final String dfa_48s = "\22\uffff\1\1\1\2";
    static final String dfa_49s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] dfa_50s = {
            "\1\4\1\uffff\1\1\1\uffff\1\3\1\20\3\uffff\1\2\7\uffff\1\5\1\uffff\1\12\1\uffff\1\13\1\uffff\1\6\1\21\2\uffff\1\14\1\10\1\uffff\1\11\1\15\1\7\1\16\1\17",
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

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_45;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "5773:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_1 = input.LA(1);

                         
                        int index97_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA97_2 = input.LA(1);

                         
                        int index97_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA97_3 = input.LA(1);

                         
                        int index97_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA97_4 = input.LA(1);

                         
                        int index97_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA97_5 = input.LA(1);

                         
                        int index97_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA97_6 = input.LA(1);

                         
                        int index97_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA97_7 = input.LA(1);

                         
                        int index97_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA97_8 = input.LA(1);

                         
                        int index97_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA97_9 = input.LA(1);

                         
                        int index97_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA97_10 = input.LA(1);

                         
                        int index97_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA97_11 = input.LA(1);

                         
                        int index97_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA97_12 = input.LA(1);

                         
                        int index97_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA97_13 = input.LA(1);

                         
                        int index97_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA97_14 = input.LA(1);

                         
                        int index97_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA97_15 = input.LA(1);

                         
                        int index97_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA97_16 = input.LA(1);

                         
                        int index97_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA97_17 = input.LA(1);

                         
                        int index97_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index97_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000798A800040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007D8EA02350L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000798A800042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000007D8B800040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007D8A800040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000018000001C80L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007D8AA02350L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010A00000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010A00080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000027D8AA02350L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000007D8BA02350L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000601000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xCFDC8C7DDAA02350L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xCFDC8C7D9AA02352L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000007D9AA02350L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x30000042000018C0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100200000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000207F8AA02350L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x3000004200001800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400200000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0003000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xCFDC8C7D9AA02350L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000204200000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000007D8AA02150L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000010000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x000020798A800042L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000020798A800040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000007DDAA02350L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0xC008000100000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xC008000100000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000A00140L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000001200140L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000200140L});

}