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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMALS", "RULE_EXPONENT", "RULE_ANY_OTHER", "RULE_IDENTIFIER", "RULE_STRUCT", "RULE_STRING_LIT", "RULE_FUNC", "RULE_INTERFACE", "RULE_MAP", "RULE_CHAN", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_DEFER", "RULE_FOR", "RULE_RANGE", "RULE_SELECT", "RULE_CASE", "RULE_DEFAULT", "RULE_SWITCH", "RULE_TYPEKEYWORD", "RULE_IF", "RULE_ELSE", "RULE_FALLTHROUGH", "RULE_GOTO", "RULE_CONTINUE", "RULE_BREAK", "RULE_RETURN", "RULE_GO", "RULE_CONST", "RULE_VAR", "RULE_INT_LIT", "RULE_PACKAGE", "RULE_IMPORT", "RULE_NEWLINE", "RULE_LETTER", "RULE_DECIMAL_DIGIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_UNICODE_CHAR", "RULE_INT", "RULE_UNICODE_VALUE", "RULE_BYTE_VALUE", "RULE_RUNE_LIT", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_INTERPRETED_STRING_LIT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'i'", "'('", "')'", "'['", "']'", "'{'", "';'", "'}'", "'*'", "','", "'...'", "'<-'", "'||'", "'&&'", "':'", "':='", "'='", "'++'", "'--'"
    };
    public static final int RULE_TYPEKEYWORD=25;
    public static final int RULE_FUNC=10;
    public static final int RULE_STRUCT=8;
    public static final int RULE_DECIMAL_DIGIT=41;
    public static final int RULE_GO=33;
    public static final int RULE_CHAN=13;
    public static final int RULE_FALLTHROUGH=28;
    public static final int RULE_STRING_LIT=9;
    public static final int T__61=61;
    public static final int RULE_RETURN=32;
    public static final int RULE_ID=56;
    public static final int RULE_INTERPRETED_STRING_LIT=55;
    public static final int RULE_UNICODE_VALUE=46;
    public static final int RULE_INTERFACE=11;
    public static final int RULE_LITTLE_U_VALUE=49;
    public static final int RULE_HEX_BYTE_VALUE=53;
    public static final int RULE_CASE=22;
    public static final int RULE_OCTAL_BYTE_VALUE=52;
    public static final int RULE_MUL_OP=17;
    public static final int RULE_PACKAGE=37;
    public static final int RULE_INT=45;
    public static final int RULE_SELECT=21;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=58;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_ELSE=27;
    public static final int T__65=65;
    public static final int RULE_DECIMALS=4;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_MAP=12;
    public static final int RULE_IMPORT=38;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=39;
    public static final int RULE_BIG_U_VALUE=50;
    public static final int RULE_ESCAPED_CHAR=51;
    public static final int RULE_IDENTIFIER=7;
    public static final int RULE_STRING=57;
    public static final int RULE_BYTE_VALUE=47;
    public static final int RULE_SL_COMMENT=59;
    public static final int RULE_BREAK=31;
    public static final int T__77=77;
    public static final int RULE_CONST=34;
    public static final int RULE_UNICODE_CHAR=44;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_DEFAULT=23;
    public static final int RULE_IF=26;
    public static final int T__73=73;
    public static final int RULE_FOR=19;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=16;
    public static final int RULE_OCTAL_DIGIT=42;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_GOTO=29;
    public static final int RULE_WS=60;
    public static final int RULE_CONTINUE=30;
    public static final int RULE_ANY_OTHER=6;
    public static final int RULE_DEFER=18;
    public static final int RULE_LETTER=40;
    public static final int RULE_EXPONENT=5;
    public static final int RULE_SWITCH=24;
    public static final int RULE_INT_LIT=36;
    public static final int RULE_RAW_STRING_LIT=54;
    public static final int RULE_UNARY_OP=14;
    public static final int RULE_REL_OP=15;
    public static final int RULE_HEX_DIGIT=43;
    public static final int RULE_RUNE_LIT=48;
    public static final int RULE_RANGE=20;
    public static final int RULE_VAR=35;

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

                if ( (LA1_0==RULE_PACKAGE) ) {
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


    // $ANTLR start "entryRuleFLOAT_LIT"
    // InternalMyDsl.g:127:1: entryRuleFLOAT_LIT returns [String current=null] : iv_ruleFLOAT_LIT= ruleFLOAT_LIT EOF ;
    public final String entryRuleFLOAT_LIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT_LIT = null;


        try {
            // InternalMyDsl.g:127:49: (iv_ruleFLOAT_LIT= ruleFLOAT_LIT EOF )
            // InternalMyDsl.g:128:2: iv_ruleFLOAT_LIT= ruleFLOAT_LIT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOAT_LITRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT_LIT=ruleFLOAT_LIT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT_LIT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT_LIT"


    // $ANTLR start "ruleFLOAT_LIT"
    // InternalMyDsl.g:134:1: ruleFLOAT_LIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha ) | (this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha ) | (this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha ) | (kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT ) ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_LIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMALS_0=null;
        Token this_DECIMALS_2=null;
        Token kw=null;
        Token this_DECIMALS_4=null;
        Token this_DECIMALS_6=null;
        Token this_DECIMALS_10=null;
        Token this_EXPONENT_11=null;
        AntlrDatatypeRuleToken this_FLOAT_LIT_Linha_1 = null;

        AntlrDatatypeRuleToken this_FLOAT_LIT_Linha_Linha_5 = null;

        AntlrDatatypeRuleToken this_FLOAT_LIT_Linha_Linha_Linha_8 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:140:2: ( ( (this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha ) | (this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha ) | (this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha ) | (kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT ) ) )
            // InternalMyDsl.g:141:2: ( (this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha ) | (this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha ) | (this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha ) | (kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT ) )
            {
            // InternalMyDsl.g:141:2: ( (this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha ) | (this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha ) | (this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha ) | (kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_DECIMALS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==61) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==RULE_DECIMALS) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_3>=RULE_EXPONENT && LA2_3<=RULE_ANY_OTHER)) ) {
                        alt2=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_1>=RULE_EXPONENT && LA2_1<=RULE_ANY_OTHER)) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==61) ) {
                alt2=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:142:3: (this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha )
                    {
                    // InternalMyDsl.g:142:3: (this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha )
                    // InternalMyDsl.g:143:4: this_DECIMALS_0= RULE_DECIMALS this_FLOAT_LIT_Linha_1= ruleFLOAT_LIT_Linha
                    {
                    this_DECIMALS_0=(Token)match(input,RULE_DECIMALS,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_0, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFLOAT_LITAccess().getFLOAT_LIT_LinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FLOAT_LIT_Linha_1=ruleFLOAT_LIT_Linha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FLOAT_LIT_Linha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:162:3: (this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha )
                    {
                    // InternalMyDsl.g:162:3: (this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha )
                    // InternalMyDsl.g:163:4: this_DECIMALS_2= RULE_DECIMALS kw= '.' this_DECIMALS_4= RULE_DECIMALS this_FLOAT_LIT_Linha_Linha_5= ruleFLOAT_LIT_Linha_Linha
                    {
                    this_DECIMALS_2=(Token)match(input,RULE_DECIMALS,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_2, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_1_0());
                      			
                    }
                    kw=(Token)match(input,61,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFLOAT_LITAccess().getFullStopKeyword_1_1());
                      			
                    }
                    this_DECIMALS_4=(Token)match(input,RULE_DECIMALS,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_4, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_1_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFLOAT_LITAccess().getFLOAT_LIT_Linha_LinhaParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FLOAT_LIT_Linha_Linha_5=ruleFLOAT_LIT_Linha_Linha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FLOAT_LIT_Linha_Linha_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:194:3: (this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha )
                    {
                    // InternalMyDsl.g:194:3: (this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha )
                    // InternalMyDsl.g:195:4: this_DECIMALS_6= RULE_DECIMALS kw= '.' this_FLOAT_LIT_Linha_Linha_Linha_8= ruleFLOAT_LIT_Linha_Linha_Linha
                    {
                    this_DECIMALS_6=(Token)match(input,RULE_DECIMALS,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_6, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_2_0());
                      			
                    }
                    kw=(Token)match(input,61,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFLOAT_LITAccess().getFullStopKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFLOAT_LITAccess().getFLOAT_LIT_Linha_Linha_LinhaParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_FLOAT_LIT_Linha_Linha_Linha_8=ruleFLOAT_LIT_Linha_Linha_Linha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FLOAT_LIT_Linha_Linha_Linha_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:219:3: (kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT )
                    {
                    // InternalMyDsl.g:219:3: (kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT )
                    // InternalMyDsl.g:220:4: kw= '.' this_DECIMALS_10= RULE_DECIMALS this_EXPONENT_11= RULE_EXPONENT
                    {
                    kw=(Token)match(input,61,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFLOAT_LITAccess().getFullStopKeyword_3_0());
                      			
                    }
                    this_DECIMALS_10=(Token)match(input,RULE_DECIMALS,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_10, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_3_1());
                      			
                    }
                    this_EXPONENT_11=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXPONENT_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXPONENT_11, grammarAccess.getFLOAT_LITAccess().getEXPONENTTerminalRuleCall_3_2());
                      			
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
    // $ANTLR end "ruleFLOAT_LIT"


    // $ANTLR start "entryRuleFLOAT_LIT_Linha_Linha_Linha"
    // InternalMyDsl.g:244:1: entryRuleFLOAT_LIT_Linha_Linha_Linha returns [String current=null] : iv_ruleFLOAT_LIT_Linha_Linha_Linha= ruleFLOAT_LIT_Linha_Linha_Linha EOF ;
    public final String entryRuleFLOAT_LIT_Linha_Linha_Linha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT_LIT_Linha_Linha_Linha = null;


        try {
            // InternalMyDsl.g:244:67: (iv_ruleFLOAT_LIT_Linha_Linha_Linha= ruleFLOAT_LIT_Linha_Linha_Linha EOF )
            // InternalMyDsl.g:245:2: iv_ruleFLOAT_LIT_Linha_Linha_Linha= ruleFLOAT_LIT_Linha_Linha_Linha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOAT_LIT_Linha_Linha_LinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT_LIT_Linha_Linha_Linha=ruleFLOAT_LIT_Linha_Linha_Linha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT_LIT_Linha_Linha_Linha.getText(); 
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
    // $ANTLR end "entryRuleFLOAT_LIT_Linha_Linha_Linha"


    // $ANTLR start "ruleFLOAT_LIT_Linha_Linha_Linha"
    // InternalMyDsl.g:251:1: ruleFLOAT_LIT_Linha_Linha_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_LIT_Linha_Linha_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXPONENT_0=null;
        Token this_ANY_OTHER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:257:2: ( (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:258:2: (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:258:2: (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_EXPONENT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:259:3: this_EXPONENT_0= RULE_EXPONENT
                    {
                    this_EXPONENT_0=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXPONENT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXPONENT_0, grammarAccess.getFLOAT_LIT_Linha_Linha_LinhaAccess().getEXPONENTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:267:3: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_1, grammarAccess.getFLOAT_LIT_Linha_Linha_LinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleFLOAT_LIT_Linha_Linha_Linha"


    // $ANTLR start "entryRuleFLOAT_LIT_Linha_Linha"
    // InternalMyDsl.g:278:1: entryRuleFLOAT_LIT_Linha_Linha returns [String current=null] : iv_ruleFLOAT_LIT_Linha_Linha= ruleFLOAT_LIT_Linha_Linha EOF ;
    public final String entryRuleFLOAT_LIT_Linha_Linha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT_LIT_Linha_Linha = null;


        try {
            // InternalMyDsl.g:278:61: (iv_ruleFLOAT_LIT_Linha_Linha= ruleFLOAT_LIT_Linha_Linha EOF )
            // InternalMyDsl.g:279:2: iv_ruleFLOAT_LIT_Linha_Linha= ruleFLOAT_LIT_Linha_Linha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOAT_LIT_Linha_LinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT_LIT_Linha_Linha=ruleFLOAT_LIT_Linha_Linha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT_LIT_Linha_Linha.getText(); 
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
    // $ANTLR end "entryRuleFLOAT_LIT_Linha_Linha"


    // $ANTLR start "ruleFLOAT_LIT_Linha_Linha"
    // InternalMyDsl.g:285:1: ruleFLOAT_LIT_Linha_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_LIT_Linha_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXPONENT_0=null;
        Token this_ANY_OTHER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:292:2: (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:292:2: (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_EXPONENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ANY_OTHER) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:293:3: this_EXPONENT_0= RULE_EXPONENT
                    {
                    this_EXPONENT_0=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXPONENT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXPONENT_0, grammarAccess.getFLOAT_LIT_Linha_LinhaAccess().getEXPONENTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:301:3: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_1, grammarAccess.getFLOAT_LIT_Linha_LinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleFLOAT_LIT_Linha_Linha"


    // $ANTLR start "entryRuleFLOAT_LIT_Linha"
    // InternalMyDsl.g:312:1: entryRuleFLOAT_LIT_Linha returns [String current=null] : iv_ruleFLOAT_LIT_Linha= ruleFLOAT_LIT_Linha EOF ;
    public final String entryRuleFLOAT_LIT_Linha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT_LIT_Linha = null;


        try {
            // InternalMyDsl.g:312:55: (iv_ruleFLOAT_LIT_Linha= ruleFLOAT_LIT_Linha EOF )
            // InternalMyDsl.g:313:2: iv_ruleFLOAT_LIT_Linha= ruleFLOAT_LIT_Linha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFLOAT_LIT_LinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT_LIT_Linha=ruleFLOAT_LIT_Linha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFLOAT_LIT_Linha.getText(); 
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
    // $ANTLR end "entryRuleFLOAT_LIT_Linha"


    // $ANTLR start "ruleFLOAT_LIT_Linha"
    // InternalMyDsl.g:319:1: ruleFLOAT_LIT_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_LIT_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXPONENT_0=null;
        Token this_ANY_OTHER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:325:2: ( (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:326:2: (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:326:2: (this_EXPONENT_0= RULE_EXPONENT | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_EXPONENT) ) {
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
                    // InternalMyDsl.g:327:3: this_EXPONENT_0= RULE_EXPONENT
                    {
                    this_EXPONENT_0=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXPONENT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXPONENT_0, grammarAccess.getFLOAT_LIT_LinhaAccess().getEXPONENTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:335:3: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_1, grammarAccess.getFLOAT_LIT_LinhaAccess().getANY_OTHERTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleFLOAT_LIT_Linha"


    // $ANTLR start "entryRuleIMAGINARY_LIT"
    // InternalMyDsl.g:346:1: entryRuleIMAGINARY_LIT returns [String current=null] : iv_ruleIMAGINARY_LIT= ruleIMAGINARY_LIT EOF ;
    public final String entryRuleIMAGINARY_LIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGINARY_LIT = null;


        try {
            // InternalMyDsl.g:346:53: (iv_ruleIMAGINARY_LIT= ruleIMAGINARY_LIT EOF )
            // InternalMyDsl.g:347:2: iv_ruleIMAGINARY_LIT= ruleIMAGINARY_LIT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIMAGINARY_LITRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIMAGINARY_LIT=ruleIMAGINARY_LIT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIMAGINARY_LIT.getText(); 
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
    // $ANTLR end "entryRuleIMAGINARY_LIT"


    // $ANTLR start "ruleIMAGINARY_LIT"
    // InternalMyDsl.g:353:1: ruleIMAGINARY_LIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' ) ;
    public final AntlrDatatypeRuleToken ruleIMAGINARY_LIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMALS_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FLOAT_LIT_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:359:2: ( ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' ) )
            // InternalMyDsl.g:360:2: ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' )
            {
            // InternalMyDsl.g:360:2: ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' )
            // InternalMyDsl.g:361:3: (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i'
            {
            // InternalMyDsl.g:361:3: (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DECIMALS) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_EXPONENT && LA6_1<=RULE_ANY_OTHER)||LA6_1==61) ) {
                    alt6=2;
                }
                else if ( (LA6_1==62) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==61) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:362:4: this_DECIMALS_0= RULE_DECIMALS
                    {
                    this_DECIMALS_0=(Token)match(input,RULE_DECIMALS,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_0, grammarAccess.getIMAGINARY_LITAccess().getDECIMALSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:370:4: this_FLOAT_LIT_1= ruleFLOAT_LIT
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIMAGINARY_LITAccess().getFLOAT_LITParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_FLOAT_LIT_1=ruleFLOAT_LIT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FLOAT_LIT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getIMAGINARY_LITAccess().getIKeyword_1());
              		
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
    // $ANTLR end "ruleIMAGINARY_LIT"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:390:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:390:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:391:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:397:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeLit_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:404:2: (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:404:2: (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt7=1;
                }
                break;
            case RULE_STRUCT:
            case RULE_FUNC:
            case RULE_INTERFACE:
            case RULE_MAP:
            case RULE_CHAN:
            case 65:
            case 70:
            case 73:
                {
                alt7=2;
                }
                break;
            case 63:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:405:3: this_TypeName_0= ruleTypeName
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
                    // InternalMyDsl.g:416:3: this_TypeLit_1= ruleTypeLit
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
                    // InternalMyDsl.g:427:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:427:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    // InternalMyDsl.g:428:4: kw= '(' this_Type_3= ruleType kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_Type_3=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:453:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:453:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:454:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalMyDsl.g:460:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_TypeNameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:466:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha ) )
            // InternalMyDsl.g:467:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha )
            {
            // InternalMyDsl.g:467:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha )
            // InternalMyDsl.g:468:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:489:1: entryRuleTypeNameLinha returns [String current=null] : iv_ruleTypeNameLinha= ruleTypeNameLinha EOF ;
    public final String entryRuleTypeNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeNameLinha = null;


        try {
            // InternalMyDsl.g:489:53: (iv_ruleTypeNameLinha= ruleTypeNameLinha EOF )
            // InternalMyDsl.g:490:2: iv_ruleTypeNameLinha= ruleTypeNameLinha EOF
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
    // InternalMyDsl.g:496:1: ruleTypeNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleTypeNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:502:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:503:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:503:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==61) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ANY_OTHER) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:504:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:504:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:505:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,61,FOLLOW_12); if (state.failed) return current;
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
                    // InternalMyDsl.g:519:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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
    // InternalMyDsl.g:530:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:530:51: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:531:2: iv_rulePackageName= rulePackageName EOF
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
    // InternalMyDsl.g:537:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:543:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:544:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:554:1: entryRuleTypeLit returns [String current=null] : iv_ruleTypeLit= ruleTypeLit EOF ;
    public final String entryRuleTypeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLit = null;


        try {
            // InternalMyDsl.g:554:47: (iv_ruleTypeLit= ruleTypeLit EOF )
            // InternalMyDsl.g:555:2: iv_ruleTypeLit= ruleTypeLit EOF
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
    // InternalMyDsl.g:561:1: ruleTypeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) ;
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
            // InternalMyDsl.g:567:2: ( ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) )
            // InternalMyDsl.g:568:2: ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            {
            // InternalMyDsl.g:568:2: ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt9=1;
                }
                break;
            case RULE_STRUCT:
                {
                alt9=2;
                }
                break;
            case 70:
                {
                alt9=3;
                }
                break;
            case RULE_FUNC:
                {
                alt9=4;
                }
                break;
            case RULE_INTERFACE:
                {
                alt9=5;
                }
                break;
            case RULE_MAP:
                {
                alt9=6;
                }
                break;
            case RULE_CHAN:
            case 73:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:569:3: (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha )
                    {
                    // InternalMyDsl.g:569:3: (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha )
                    // InternalMyDsl.g:570:4: kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_13); if (state.failed) return current;
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
                    // InternalMyDsl.g:587:3: this_StructType_2= ruleStructType
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
                    // InternalMyDsl.g:598:3: this_PointerType_3= rulePointerType
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
                    // InternalMyDsl.g:609:3: this_FunctionType_4= ruleFunctionType
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
                    // InternalMyDsl.g:620:3: this_InterfaceType_5= ruleInterfaceType
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
                    // InternalMyDsl.g:631:3: this_MapType_6= ruleMapType
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
                    // InternalMyDsl.g:642:3: this_ChannelType_7= ruleChannelType
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
    // InternalMyDsl.g:656:1: entryRuleTypeLitLinha returns [String current=null] : iv_ruleTypeLitLinha= ruleTypeLitLinha EOF ;
    public final String entryRuleTypeLitLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLitLinha = null;


        try {
            // InternalMyDsl.g:656:52: (iv_ruleTypeLitLinha= ruleTypeLitLinha EOF )
            // InternalMyDsl.g:657:2: iv_ruleTypeLitLinha= ruleTypeLitLinha EOF
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
    // InternalMyDsl.g:663:1: ruleTypeLitLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeLitLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_0 = null;

        AntlrDatatypeRuleToken this_ElementType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:669:2: ( ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) ) )
            // InternalMyDsl.g:670:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) )
            {
            // InternalMyDsl.g:670:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DECIMALS||(LA10_0>=RULE_IDENTIFIER && LA10_0<=RULE_UNARY_OP)||LA10_0==RULE_INT_LIT||LA10_0==61||LA10_0==63||LA10_0==65||LA10_0==70||(LA10_0>=72 && LA10_0<=73)) ) {
                alt10=1;
            }
            else if ( (LA10_0==66) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:671:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    {
                    // InternalMyDsl.g:671:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    // InternalMyDsl.g:672:4: this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLitLinhaAccess().getArrayLengthParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_ArrayLength_0=ruleArrayLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayLength_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_9); if (state.failed) return current;
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
                    // InternalMyDsl.g:699:3: (kw= ']' this_ElementType_4= ruleElementType )
                    {
                    // InternalMyDsl.g:699:3: (kw= ']' this_ElementType_4= ruleElementType )
                    // InternalMyDsl.g:700:4: kw= ']' this_ElementType_4= ruleElementType
                    {
                    kw=(Token)match(input,66,FOLLOW_9); if (state.failed) return current;
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
    // InternalMyDsl.g:720:1: entryRuleArrayLength returns [String current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final String entryRuleArrayLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayLength = null;


        try {
            // InternalMyDsl.g:720:51: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalMyDsl.g:721:2: iv_ruleArrayLength= ruleArrayLength EOF
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
    // InternalMyDsl.g:727:1: ruleArrayLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleArrayLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:733:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:734:2: this_Expression_0= ruleExpression
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
    // InternalMyDsl.g:747:1: entryRuleElementType returns [String current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final String entryRuleElementType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementType = null;


        try {
            // InternalMyDsl.g:747:51: (iv_ruleElementType= ruleElementType EOF )
            // InternalMyDsl.g:748:2: iv_ruleElementType= ruleElementType EOF
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
    // InternalMyDsl.g:754:1: ruleElementType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleElementType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:760:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:761:2: this_Type_0= ruleType
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
    // InternalMyDsl.g:774:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // InternalMyDsl.g:774:50: (iv_ruleStructType= ruleStructType EOF )
            // InternalMyDsl.g:775:2: iv_ruleStructType= ruleStructType EOF
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
    // InternalMyDsl.g:781:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRUCT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:787:2: ( (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' ) )
            // InternalMyDsl.g:788:2: (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' )
            {
            // InternalMyDsl.g:788:2: (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' )
            // InternalMyDsl.g:789:3: this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}'
            {
            this_STRUCT_0=(Token)match(input,RULE_STRUCT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRUCT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRUCT_0, grammarAccess.getStructTypeAccess().getSTRUCTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:801:3: (this_FieldDecl_2= ruleFieldDecl kw= ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_IDENTIFIER||LA11_0==70) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:802:4: this_FieldDecl_2= ruleFieldDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStructTypeAccess().getFieldDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    this_FieldDecl_2=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_FieldDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getStructTypeAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:827:1: entryRuleFieldDecl returns [String current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final String entryRuleFieldDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDecl = null;


        try {
            // InternalMyDsl.g:827:49: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalMyDsl.g:828:2: iv_ruleFieldDecl= ruleFieldDecl EOF
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
    // InternalMyDsl.g:834:1: ruleFieldDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? ) ;
    public final AntlrDatatypeRuleToken ruleFieldDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_EmbeddedField_2 = null;

        AntlrDatatypeRuleToken this_Tag_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:840:2: ( ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? ) )
            // InternalMyDsl.g:841:2: ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? )
            {
            // InternalMyDsl.g:841:2: ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? )
            // InternalMyDsl.g:842:3: ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )?
            {
            // InternalMyDsl.g:842:3: ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENTIFIER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ANY_OTHER||LA12_1==61) ) {
                    alt12=2;
                }
                else if ( ((LA12_1>=RULE_IDENTIFIER && LA12_1<=RULE_STRUCT)||(LA12_1>=RULE_FUNC && LA12_1<=RULE_CHAN)||LA12_1==63||LA12_1==65||(LA12_1>=70 && LA12_1<=71)||LA12_1==73) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==70) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:843:4: (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType )
                    {
                    // InternalMyDsl.g:843:4: (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType )
                    // InternalMyDsl.g:844:5: this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getIdentifierListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_9);
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
                    pushFollow(FOLLOW_18);
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
                    // InternalMyDsl.g:866:4: this_EmbeddedField_2= ruleEmbeddedField
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getEmbeddedFieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:877:3: (this_Tag_3= ruleTag )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING_LIT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:878:4: this_Tag_3= ruleTag
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
    // InternalMyDsl.g:893:1: entryRuleEmbeddedField returns [String current=null] : iv_ruleEmbeddedField= ruleEmbeddedField EOF ;
    public final String entryRuleEmbeddedField() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmbeddedField = null;


        try {
            // InternalMyDsl.g:893:53: (iv_ruleEmbeddedField= ruleEmbeddedField EOF )
            // InternalMyDsl.g:894:2: iv_ruleEmbeddedField= ruleEmbeddedField EOF
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
    // InternalMyDsl.g:900:1: ruleEmbeddedField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )? this_TypeName_1= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleEmbeddedField() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:906:2: ( ( (kw= '*' )? this_TypeName_1= ruleTypeName ) )
            // InternalMyDsl.g:907:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            {
            // InternalMyDsl.g:907:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            // InternalMyDsl.g:908:3: (kw= '*' )? this_TypeName_1= ruleTypeName
            {
            // InternalMyDsl.g:908:3: (kw= '*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==70) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:909:4: kw= '*'
                    {
                    kw=(Token)match(input,70,FOLLOW_12); if (state.failed) return current;
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
    // InternalMyDsl.g:929:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // InternalMyDsl.g:929:43: (iv_ruleTag= ruleTag EOF )
            // InternalMyDsl.g:930:2: iv_ruleTag= ruleTag EOF
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
    // InternalMyDsl.g:936:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:942:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:943:2: this_STRING_LIT_0= RULE_STRING_LIT
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
    // InternalMyDsl.g:953:1: entryRulePointerType returns [String current=null] : iv_rulePointerType= rulePointerType EOF ;
    public final String entryRulePointerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointerType = null;


        try {
            // InternalMyDsl.g:953:51: (iv_rulePointerType= rulePointerType EOF )
            // InternalMyDsl.g:954:2: iv_rulePointerType= rulePointerType EOF
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
    // InternalMyDsl.g:960:1: rulePointerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_BaseType_1= ruleBaseType ) ;
    public final AntlrDatatypeRuleToken rulePointerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:966:2: ( (kw= '*' this_BaseType_1= ruleBaseType ) )
            // InternalMyDsl.g:967:2: (kw= '*' this_BaseType_1= ruleBaseType )
            {
            // InternalMyDsl.g:967:2: (kw= '*' this_BaseType_1= ruleBaseType )
            // InternalMyDsl.g:968:3: kw= '*' this_BaseType_1= ruleBaseType
            {
            kw=(Token)match(input,70,FOLLOW_9); if (state.failed) return current;
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
    // InternalMyDsl.g:987:1: entryRuleBaseType returns [String current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final String entryRuleBaseType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseType = null;


        try {
            // InternalMyDsl.g:987:48: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalMyDsl.g:988:2: iv_ruleBaseType= ruleBaseType EOF
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
    // InternalMyDsl.g:994:1: ruleBaseType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleBaseType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1000:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:1001:2: this_Type_0= ruleType
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
    // InternalMyDsl.g:1014:1: entryRuleFunctionType returns [String current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final String entryRuleFunctionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionType = null;


        try {
            // InternalMyDsl.g:1014:52: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalMyDsl.g:1015:2: iv_ruleFunctionType= ruleFunctionType EOF
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
    // InternalMyDsl.g:1021:1: ruleFunctionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature ) ;
    public final AntlrDatatypeRuleToken ruleFunctionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1027:2: ( (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature ) )
            // InternalMyDsl.g:1028:2: (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature )
            {
            // InternalMyDsl.g:1028:2: (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature )
            // InternalMyDsl.g:1029:3: this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FUNC_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FUNC_0, grammarAccess.getFunctionTypeAccess().getFUNCTerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:1050:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalMyDsl.g:1050:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalMyDsl.g:1051:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalMyDsl.g:1057:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1063:2: ( (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? ) )
            // InternalMyDsl.g:1064:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? )
            {
            // InternalMyDsl.g:1064:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? )
            // InternalMyDsl.g:1065:3: this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1075:3: ( ( ruleResult )=>this_Result_1= ruleResult )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1076:4: ( ruleResult )=>this_Result_1= ruleResult
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
    // InternalMyDsl.g:1092:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalMyDsl.g:1092:46: (iv_ruleResult= ruleResult EOF )
            // InternalMyDsl.g:1093:2: iv_ruleResult= ruleResult EOF
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
    // InternalMyDsl.g:1099:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1105:2: ( ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType ) )
            // InternalMyDsl.g:1106:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )
            {
            // InternalMyDsl.g:1106:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1107:3: ( ( ruleParameters )=>this_Parameters_0= ruleParameters )
                    {
                    // InternalMyDsl.g:1107:3: ( ( ruleParameters )=>this_Parameters_0= ruleParameters )
                    // InternalMyDsl.g:1108:4: ( ruleParameters )=>this_Parameters_0= ruleParameters
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
                    // InternalMyDsl.g:1121:3: this_Type_1= ruleType
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
    // InternalMyDsl.g:1135:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalMyDsl.g:1135:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalMyDsl.g:1136:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalMyDsl.g:1142:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1148:2: ( (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:1149:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:1149:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:1150:3: kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,63,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1155:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_IDENTIFIER && LA18_0<=RULE_STRUCT)||(LA18_0>=RULE_FUNC && LA18_0<=RULE_CHAN)||LA18_0==63||LA18_0==65||LA18_0==70||(LA18_0>=72 && LA18_0<=73)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1156:4: this_ParameterList_1= ruleParameterList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ParameterList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:1166:4: (kw= ',' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==71) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:1167:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_10); if (state.failed) return current;
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

            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1183:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // InternalMyDsl.g:1183:53: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalMyDsl.g:1184:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalMyDsl.g:1190:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDecl_0 = null;

        AntlrDatatypeRuleToken this_ParameterDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1196:2: ( (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) )
            // InternalMyDsl.g:1197:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            {
            // InternalMyDsl.g:1197:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            // InternalMyDsl.g:1198:3: this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_ParameterDecl_0=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ParameterDecl_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1208:3: (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==71) ) {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>=RULE_IDENTIFIER && LA19_1<=RULE_STRUCT)||(LA19_1>=RULE_FUNC && LA19_1<=RULE_CHAN)||LA19_1==63||LA19_1==65||LA19_1==70||(LA19_1>=72 && LA19_1<=73)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1209:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,71,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop19;
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
    // InternalMyDsl.g:1229:1: entryRuleParameterDecl returns [String current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final String entryRuleParameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDecl = null;


        try {
            // InternalMyDsl.g:1229:53: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalMyDsl.g:1230:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalMyDsl.g:1236:1: ruleParameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleParameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1242:2: ( ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType ) )
            // InternalMyDsl.g:1243:2: ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType )
            {
            // InternalMyDsl.g:1243:2: ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType )
            // InternalMyDsl.g:1244:3: (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType
            {
            // InternalMyDsl.g:1244:3: (this_IdentifierList_0= ruleIdentifierList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=RULE_IDENTIFIER && LA20_1<=RULE_STRUCT)||(LA20_1>=RULE_FUNC && LA20_1<=RULE_CHAN)||LA20_1==63||LA20_1==65||(LA20_1>=70 && LA20_1<=73)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1245:4: this_IdentifierList_0= ruleIdentifierList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdentifierListParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:1256:3: (kw= '...' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==72) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1257:4: kw= '...'
                    {
                    kw=(Token)match(input,72,FOLLOW_9); if (state.failed) return current;
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
    // InternalMyDsl.g:1277:1: entryRuleInterfaceType returns [String current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final String entryRuleInterfaceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceType = null;


        try {
            // InternalMyDsl.g:1277:53: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalMyDsl.g:1278:2: iv_ruleInterfaceType= ruleInterfaceType EOF
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
    // InternalMyDsl.g:1284:1: ruleInterfaceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTERFACE_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_MethodSpec_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1290:2: ( (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' ) )
            // InternalMyDsl.g:1291:2: (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' )
            {
            // InternalMyDsl.g:1291:2: (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}' )
            // InternalMyDsl.g:1292:3: this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' ) kw= '}'
            {
            this_INTERFACE_0=(Token)match(input,RULE_INTERFACE,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INTERFACE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INTERFACE_0, grammarAccess.getInterfaceTypeAccess().getINTERFACETerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:1304:3: (this_MethodSpec_2= ruleMethodSpec kw= ';' )
            // InternalMyDsl.g:1305:4: this_MethodSpec_2= ruleMethodSpec kw= ';'
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getInterfaceTypeAccess().getMethodSpecParserRuleCall_2_0());
              			
            }
            pushFollow(FOLLOW_17);
            this_MethodSpec_2=ruleMethodSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_MethodSpec_2);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }
            kw=(Token)match(input,68,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_2_1());
              			
            }

            }

            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:1330:1: entryRuleMethodSpec returns [String current=null] : iv_ruleMethodSpec= ruleMethodSpec EOF ;
    public final String entryRuleMethodSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodSpec = null;


        try {
            // InternalMyDsl.g:1330:50: (iv_ruleMethodSpec= ruleMethodSpec EOF )
            // InternalMyDsl.g:1331:2: iv_ruleMethodSpec= ruleMethodSpec EOF
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
    // InternalMyDsl.g:1337:1: ruleMethodSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName ) ;
    public final AntlrDatatypeRuleToken ruleMethodSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MethodName_0 = null;

        AntlrDatatypeRuleToken this_Signature_1 = null;

        AntlrDatatypeRuleToken this_InterfaceTypeName_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1343:2: ( ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName ) )
            // InternalMyDsl.g:1344:2: ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName )
            {
            // InternalMyDsl.g:1344:2: ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_IDENTIFIER) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ANY_OTHER||LA22_1==61) ) {
                    alt22=2;
                }
                else if ( (LA22_1==63) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1345:3: (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature )
                    {
                    // InternalMyDsl.g:1345:3: (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature )
                    // InternalMyDsl.g:1346:4: this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getMethodNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_19);
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
                    // InternalMyDsl.g:1368:3: this_InterfaceTypeName_2= ruleInterfaceTypeName
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
    // InternalMyDsl.g:1382:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalMyDsl.g:1382:50: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalMyDsl.g:1383:2: iv_ruleMethodName= ruleMethodName EOF
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
    // InternalMyDsl.g:1389:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1395:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:1396:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:1406:1: entryRuleInterfaceTypeName returns [String current=null] : iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF ;
    public final String entryRuleInterfaceTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceTypeName = null;


        try {
            // InternalMyDsl.g:1406:57: (iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF )
            // InternalMyDsl.g:1407:2: iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF
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
    // InternalMyDsl.g:1413:1: ruleInterfaceTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypeName_0= ruleTypeName ;
    public final AntlrDatatypeRuleToken ruleInterfaceTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeName_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1419:2: (this_TypeName_0= ruleTypeName )
            // InternalMyDsl.g:1420:2: this_TypeName_0= ruleTypeName
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
    // InternalMyDsl.g:1433:1: entryRuleMapType returns [String current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final String entryRuleMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapType = null;


        try {
            // InternalMyDsl.g:1433:47: (iv_ruleMapType= ruleMapType EOF )
            // InternalMyDsl.g:1434:2: iv_ruleMapType= ruleMapType EOF
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
    // InternalMyDsl.g:1440:1: ruleMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType ) ;
    public final AntlrDatatypeRuleToken ruleMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAP_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KeyType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1446:2: ( (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType ) )
            // InternalMyDsl.g:1447:2: (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType )
            {
            // InternalMyDsl.g:1447:2: (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType )
            // InternalMyDsl.g:1448:3: this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType
            {
            this_MAP_0=(Token)match(input,RULE_MAP,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_MAP_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_MAP_0, grammarAccess.getMapTypeAccess().getMAPTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_KeyType_2=ruleKeyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_KeyType_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,66,FOLLOW_9); if (state.failed) return current;
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
    // InternalMyDsl.g:1489:1: entryRuleKeyType returns [String current=null] : iv_ruleKeyType= ruleKeyType EOF ;
    public final String entryRuleKeyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyType = null;


        try {
            // InternalMyDsl.g:1489:47: (iv_ruleKeyType= ruleKeyType EOF )
            // InternalMyDsl.g:1490:2: iv_ruleKeyType= ruleKeyType EOF
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
    // InternalMyDsl.g:1496:1: ruleKeyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleKeyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1502:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:1503:2: this_Type_0= ruleType
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
    // InternalMyDsl.g:1516:1: entryRuleChannelType returns [String current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final String entryRuleChannelType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannelType = null;


        try {
            // InternalMyDsl.g:1516:51: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalMyDsl.g:1517:2: iv_ruleChannelType= ruleChannelType EOF
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
    // InternalMyDsl.g:1523:1: ruleChannelType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType ) ;
    public final AntlrDatatypeRuleToken ruleChannelType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAN_0=null;
        Token kw=null;
        Token this_CHAN_3=null;
        AntlrDatatypeRuleToken this_ChannelTypeLinha_1 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1529:2: ( ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType ) )
            // InternalMyDsl.g:1530:2: ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType )
            {
            // InternalMyDsl.g:1530:2: ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType )
            // InternalMyDsl.g:1531:3: ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType
            {
            // InternalMyDsl.g:1531:3: ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_CHAN) ) {
                alt23=1;
            }
            else if ( (LA23_0==73) ) {
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
                    // InternalMyDsl.g:1532:4: (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha )
                    {
                    // InternalMyDsl.g:1532:4: (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha )
                    // InternalMyDsl.g:1533:5: this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha
                    {
                    this_CHAN_0=(Token)match(input,RULE_CHAN,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_CHAN_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_CHAN_0, grammarAccess.getChannelTypeAccess().getCHANTerminalRuleCall_0_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChannelTypeAccess().getChannelTypeLinhaParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_9);
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
                    // InternalMyDsl.g:1552:4: (kw= '<-' this_CHAN_3= RULE_CHAN )
                    {
                    // InternalMyDsl.g:1552:4: (kw= '<-' this_CHAN_3= RULE_CHAN )
                    // InternalMyDsl.g:1553:5: kw= '<-' this_CHAN_3= RULE_CHAN
                    {
                    kw=(Token)match(input,73,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_0());
                      				
                    }
                    this_CHAN_3=(Token)match(input,RULE_CHAN,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_CHAN_3);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_CHAN_3, grammarAccess.getChannelTypeAccess().getCHANTerminalRuleCall_0_1_1());
                      				
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
    // InternalMyDsl.g:1581:1: entryRuleChannelTypeLinha returns [String current=null] : iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF ;
    public final String entryRuleChannelTypeLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannelTypeLinha = null;


        try {
            // InternalMyDsl.g:1581:56: (iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF )
            // InternalMyDsl.g:1582:2: iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF
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
    // InternalMyDsl.g:1588:1: ruleChannelTypeLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleChannelTypeLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ANY_OTHER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1594:2: ( (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:1595:2: (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:1595:2: (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==73) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ANY_OTHER) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1596:3: kw= '<-'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getChannelTypeLinhaAccess().getLessThanSignHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1602:3: this_ANY_OTHER_1= RULE_ANY_OTHER
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
    // InternalMyDsl.g:1613:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:1613:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:1614:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:1620:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnaryExpr_0 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1626:2: ( (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha ) )
            // InternalMyDsl.g:1627:2: (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha )
            {
            // InternalMyDsl.g:1627:2: (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha )
            // InternalMyDsl.g:1628:3: this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:1652:1: entryRuleExpression_Linha returns [String current=null] : iv_ruleExpression_Linha= ruleExpression_Linha EOF ;
    public final String entryRuleExpression_Linha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_Linha = null;


        try {
            // InternalMyDsl.g:1652:56: (iv_ruleExpression_Linha= ruleExpression_Linha EOF )
            // InternalMyDsl.g:1653:2: iv_ruleExpression_Linha= ruleExpression_Linha EOF
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
    // InternalMyDsl.g:1659:1: ruleExpression_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleExpression_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_3=null;
        AntlrDatatypeRuleToken this_binary_op_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1665:2: ( ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:1666:2: ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:1666:2: ( (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_REL_OP && LA25_0<=RULE_MUL_OP)||(LA25_0>=74 && LA25_0<=75)) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:1667:3: (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
                    {
                    // InternalMyDsl.g:1667:3: (this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
                    // InternalMyDsl.g:1668:4: this_binary_op_0= rulebinary_op this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression_LinhaAccess().getBinary_opParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_30);
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
                    pushFollow(FOLLOW_29);
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
                    // InternalMyDsl.g:1700:3: this_ANY_OTHER_3= RULE_ANY_OTHER
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
    // InternalMyDsl.g:1711:1: entryRuleUnaryExpr returns [String current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final String entryRuleUnaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpr = null;


        try {
            // InternalMyDsl.g:1711:49: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMyDsl.g:1712:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
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
    // InternalMyDsl.g:1718:1: ruleUnaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNARY_OP_1=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_0 = null;

        AntlrDatatypeRuleToken this_UnaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1724:2: ( (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) )
            // InternalMyDsl.g:1725:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            {
            // InternalMyDsl.g:1725:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DECIMALS||(LA26_0>=RULE_IDENTIFIER && LA26_0<=RULE_CHAN)||LA26_0==RULE_INT_LIT||LA26_0==61||LA26_0==63||LA26_0==65||LA26_0==70||(LA26_0>=72 && LA26_0<=73)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_UNARY_OP) ) {
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
                    // InternalMyDsl.g:1726:3: this_PrimaryExpr_0= rulePrimaryExpr
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
                    // InternalMyDsl.g:1737:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    {
                    // InternalMyDsl.g:1737:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    // InternalMyDsl.g:1738:4: this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr
                    {
                    this_UNARY_OP_1=(Token)match(input,RULE_UNARY_OP,FOLLOW_30); if (state.failed) return current;
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
    // InternalMyDsl.g:1760:1: entryRulebinary_op returns [String current=null] : iv_rulebinary_op= rulebinary_op EOF ;
    public final String entryRulebinary_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebinary_op = null;


        try {
            // InternalMyDsl.g:1760:49: (iv_rulebinary_op= rulebinary_op EOF )
            // InternalMyDsl.g:1761:2: iv_rulebinary_op= rulebinary_op EOF
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
    // InternalMyDsl.g:1767:1: rulebinary_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) ;
    public final AntlrDatatypeRuleToken rulebinary_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REL_OP_2=null;
        Token this_ADD_OP_3=null;
        Token this_MUL_OP_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1773:2: ( (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) )
            // InternalMyDsl.g:1774:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            {
            // InternalMyDsl.g:1774:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt27=1;
                }
                break;
            case 75:
                {
                alt27=2;
                }
                break;
            case RULE_REL_OP:
                {
                alt27=3;
                }
                break;
            case RULE_ADD_OP:
                {
                alt27=4;
                }
                break;
            case RULE_MUL_OP:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1775:3: kw= '||'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1781:3: kw= '&&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBinary_opAccess().getAmpersandAmpersandKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1787:3: this_REL_OP_2= RULE_REL_OP
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
                    // InternalMyDsl.g:1795:3: this_ADD_OP_3= RULE_ADD_OP
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
                    // InternalMyDsl.g:1803:3: this_MUL_OP_4= RULE_MUL_OP
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
    // InternalMyDsl.g:1814:1: entryRulePrimaryExpr returns [String current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final String entryRulePrimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr = null;


        try {
            // InternalMyDsl.g:1814:51: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMyDsl.g:1815:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
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
    // InternalMyDsl.g:1821:1: rulePrimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_6=null;
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
            // InternalMyDsl.g:1827:2: ( ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:1828:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:1828:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat ) | (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat ) | (this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha ) | (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha ) | (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha ) | (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha ) )
            int alt28=11;
            switch ( input.LA(1) ) {
            case RULE_DECIMALS:
            case RULE_STRING_LIT:
            case RULE_INT_LIT:
            case 61:
                {
                alt28=1;
                }
                break;
            case RULE_STRUCT:
                {
                alt28=2;
                }
                break;
            case RULE_MAP:
                {
                alt28=3;
                }
                break;
            case RULE_FUNC:
                {
                alt28=4;
                }
                break;
            case 72:
                {
                alt28=5;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt28=6;
                }
                break;
            case 63:
                {
                alt28=7;
                }
                break;
            case 65:
                {
                alt28=8;
                }
                break;
            case 70:
                {
                alt28=9;
                }
                break;
            case RULE_INTERFACE:
                {
                alt28=10;
                }
                break;
            case RULE_CHAN:
            case 73:
                {
                alt28=11;
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
                    // InternalMyDsl.g:1829:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1829:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1830:4: this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getBasicLitParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:1852:3: (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat )
                    {
                    // InternalMyDsl.g:1852:3: (this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat )
                    // InternalMyDsl.g:1853:4: this_StructType_2= ruleStructType this_PrimaryExprFatFatFatFat_3= rulePrimaryExprFatFatFatFat
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getStructTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalMyDsl.g:1875:3: (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat )
                    {
                    // InternalMyDsl.g:1875:3: (this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat )
                    // InternalMyDsl.g:1876:4: this_MapType_4= ruleMapType this_PrimaryExprFatFatFatFat_5= rulePrimaryExprFatFatFatFat
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getMapTypeParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    // InternalMyDsl.g:1898:3: (this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1898:3: (this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1899:4: this_FUNC_6= RULE_FUNC this_Signature_7= ruleSignature this_PrimaryExprFatFatFatFatFat_8= rulePrimaryExprFatFatFatFatFat this_PrimaryExprLinha_9= rulePrimaryExprLinha
                    {
                    this_FUNC_6=(Token)match(input,RULE_FUNC,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FUNC_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_FUNC_6, grammarAccess.getPrimaryExprAccess().getFUNCTerminalRuleCall_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getSignatureParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:1938:3: (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1938:3: (kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1939:4: kw= '...' kw= ']' this_ElementType_12= ruleElementType this_LiteralValue_13= ruleLiteralValue this_PrimaryExprLinha_14= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,72,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getFullStopFullStopFullStopKeyword_4_0());
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getRightSquareBracketKeyword_4_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getElementTypeParserRuleCall_4_2());
                      			
                    }
                    pushFollow(FOLLOW_15);
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
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:1981:3: (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:1981:3: (this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha )
                    // InternalMyDsl.g:1982:4: this_Name_15= ruleName this_PrimaryExprFatFatFat_16= rulePrimaryExprFatFatFat this_PrimaryExprLinha_17= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getNameParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_33);
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
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2014:3: (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2014:3: (kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2015:4: kw= '(' this_PrimaryExprFatFat_19= rulePrimaryExprFatFat this_PrimaryExprLinha_20= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,63,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprFatFatParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2042:3: (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2042:3: (kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2043:4: kw= '[' this_TypeLitLinha_22= ruleTypeLitLinha this_PrimaryExprFatFatFatFatFatFat_23= rulePrimaryExprFatFatFatFatFatFat this_PrimaryExprLinha_24= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftSquareBracketKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getTypeLitLinhaParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2080:3: (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2080:3: (this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2081:4: this_PointerType_25= rulePointerType this_PrimaryExprFat_26= rulePrimaryExprFat this_PrimaryExprLinha_27= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPointerTypeParserRuleCall_8_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2113:3: (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2113:3: (this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2114:4: this_InterfaceType_28= ruleInterfaceType this_PrimaryExprFat_29= rulePrimaryExprFat this_PrimaryExprLinha_30= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getInterfaceTypeParserRuleCall_9_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2146:3: (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2146:3: (this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2147:4: this_ChannelType_31= ruleChannelType this_PrimaryExprFat_32= rulePrimaryExprFat this_PrimaryExprLinha_33= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getChannelTypeParserRuleCall_10_0());
                      			
                    }
                    pushFollow(FOLLOW_32);
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
                    pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2182:1: entryRulePrimaryExprFatFatFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2182:69: (iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF )
            // InternalMyDsl.g:2183:2: iv_rulePrimaryExprFatFatFatFatFatFat= rulePrimaryExprFatFatFatFatFatFat EOF
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
    // InternalMyDsl.g:2189:1: rulePrimaryExprFatFatFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2195:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2196:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2196:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==67) ) {
                alt29=1;
            }
            else if ( (LA29_0==61||LA29_0==63) ) {
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
                    // InternalMyDsl.g:2197:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalMyDsl.g:2208:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
    // InternalMyDsl.g:2222:1: entryRulePrimaryExprFatFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2222:66: (iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF )
            // InternalMyDsl.g:2223:2: iv_rulePrimaryExprFatFatFatFatFat= rulePrimaryExprFatFatFatFatFat EOF
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
    // InternalMyDsl.g:2229:1: rulePrimaryExprFatFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FunctionBody_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2235:2: ( (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2236:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2236:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==67) ) {
                alt30=1;
            }
            else if ( (LA30_0==61||LA30_0==63) ) {
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
                    // InternalMyDsl.g:2237:3: this_FunctionBody_0= ruleFunctionBody
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
                    // InternalMyDsl.g:2248:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
    // InternalMyDsl.g:2262:1: entryRulePrimaryExprFatFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFatFat = null;


        try {
            // InternalMyDsl.g:2262:63: (iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF )
            // InternalMyDsl.g:2263:2: iv_rulePrimaryExprFatFatFatFat= rulePrimaryExprFatFatFatFat EOF
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
    // InternalMyDsl.g:2269:1: rulePrimaryExprFatFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2275:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat ) )
            // InternalMyDsl.g:2276:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            {
            // InternalMyDsl.g:2276:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            else if ( (LA31_0==61||LA31_0==63) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2277:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalMyDsl.g:2288:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
    // InternalMyDsl.g:2302:1: entryRulePrimaryExprFatFatFat returns [String current=null] : iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF ;
    public final String entryRulePrimaryExprFatFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFatFat = null;


        try {
            // InternalMyDsl.g:2302:60: (iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF )
            // InternalMyDsl.g:2303:2: iv_rulePrimaryExprFatFatFat= rulePrimaryExprFatFatFat EOF
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
    // InternalMyDsl.g:2309:1: rulePrimaryExprFatFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2315:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2316:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2316:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExprFat_1= rulePrimaryExprFat | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt32=1;
                }
                break;
            case 61:
            case 63:
                {
                alt32=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2317:3: this_LiteralValue_0= ruleLiteralValue
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
                    // InternalMyDsl.g:2328:3: this_PrimaryExprFat_1= rulePrimaryExprFat
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
                    // InternalMyDsl.g:2339:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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
    // InternalMyDsl.g:2350:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalMyDsl.g:2350:44: (iv_ruleName= ruleName EOF )
            // InternalMyDsl.g:2351:2: iv_ruleName= ruleName EOF
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
    // InternalMyDsl.g:2357:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_NameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2363:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha ) )
            // InternalMyDsl.g:2364:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha )
            {
            // InternalMyDsl.g:2364:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha )
            // InternalMyDsl.g:2365:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_NameLinha_1= ruleNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:2386:1: entryRuleNameLinha returns [String current=null] : iv_ruleNameLinha= ruleNameLinha EOF ;
    public final String entryRuleNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNameLinha = null;


        try {
            // InternalMyDsl.g:2386:49: (iv_ruleNameLinha= ruleNameLinha EOF )
            // InternalMyDsl.g:2387:2: iv_ruleNameLinha= ruleNameLinha EOF
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
    // InternalMyDsl.g:2393:1: ruleNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2399:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2400:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2400:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:2401:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:2401:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:2402:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,61,FOLLOW_12); if (state.failed) return current;
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
                    // InternalMyDsl.g:2416:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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
    // InternalMyDsl.g:2427:1: entryRulePrimaryExprFatFat returns [String current=null] : iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF ;
    public final String entryRulePrimaryExprFatFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFatFat = null;


        try {
            // InternalMyDsl.g:2427:57: (iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF )
            // InternalMyDsl.g:2428:2: iv_rulePrimaryExprFatFat= rulePrimaryExprFatFat EOF
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
    // InternalMyDsl.g:2434:1: rulePrimaryExprFatFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFatFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExprFat_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2440:2: ( ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) ) )
            // InternalMyDsl.g:2441:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )
            {
            // InternalMyDsl.g:2441:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2442:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    {
                    // InternalMyDsl.g:2442:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    // InternalMyDsl.g:2443:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')'
                    {
                    // InternalMyDsl.g:2443:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression )
                    // InternalMyDsl.g:2444:5: ( ruleExpression )=>this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryExprFatFatAccess().getExpressionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
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

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatFatAccess().getRightParenthesisKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2463:3: (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat )
                    {
                    // InternalMyDsl.g:2463:3: (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat )
                    // InternalMyDsl.g:2464:4: this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprFatFatAccess().getTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_Type_2=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_32); if (state.failed) return current;
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
    // InternalMyDsl.g:2494:1: entryRulePrimaryExprFat returns [String current=null] : iv_rulePrimaryExprFat= rulePrimaryExprFat EOF ;
    public final String entryRulePrimaryExprFat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprFat = null;


        try {
            // InternalMyDsl.g:2494:54: (iv_rulePrimaryExprFat= rulePrimaryExprFat EOF )
            // InternalMyDsl.g:2495:2: iv_rulePrimaryExprFat= rulePrimaryExprFat EOF
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
    // InternalMyDsl.g:2501:1: rulePrimaryExprFat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprFat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_MethodName_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2507:2: ( ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) )
            // InternalMyDsl.g:2508:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            {
            // InternalMyDsl.g:2508:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==63) ) {
                alt36=1;
            }
            else if ( (LA36_0==61) ) {
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
                    // InternalMyDsl.g:2509:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    {
                    // InternalMyDsl.g:2509:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    // InternalMyDsl.g:2510:4: kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprFatAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_22);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:2525:4: (kw= ',' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==71) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyDsl.g:2526:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getCommaKeyword_0_2());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprFatAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2539:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    {
                    // InternalMyDsl.g:2539:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    // InternalMyDsl.g:2540:4: kw= '.' this_MethodName_5= ruleMethodName
                    {
                    kw=(Token)match(input,61,FOLLOW_12); if (state.failed) return current;
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
    // InternalMyDsl.g:2560:1: entryRulePrimaryExprLinha returns [String current=null] : iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF ;
    public final String entryRulePrimaryExprLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha = null;


        try {
            // InternalMyDsl.g:2560:56: (iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF )
            // InternalMyDsl.g:2561:2: iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF
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
    // InternalMyDsl.g:2567:1: rulePrimaryExprLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) ;
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
            // InternalMyDsl.g:2573:2: ( ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:2574:2: ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:2574:2: ( (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt37=1;
                }
                break;
            case 65:
                {
                alt37=2;
                }
                break;
            case 63:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2575:3: (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2575:3: (kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2576:4: kw= '.' this_PrimaryExprLinhaLinha_1= rulePrimaryExprLinhaLinha this_PrimaryExprLinha_2= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,61,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getFullStopKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2603:3: (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2603:3: (kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2604:4: kw= '[' this_PrimaryExprLinhaLinhaLinha_4= rulePrimaryExprLinhaLinhaLinha this_PrimaryExprLinha_5= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinhaLinhaLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
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
                    // InternalMyDsl.g:2631:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:2631:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    // InternalMyDsl.g:2632:4: this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getArgumentsParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2657:1: entryRulePrimaryExprLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinha = null;


        try {
            // InternalMyDsl.g:2657:61: (iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF )
            // InternalMyDsl.g:2658:2: iv_rulePrimaryExprLinhaLinha= rulePrimaryExprLinhaLinha EOF
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
    // InternalMyDsl.g:2664:1: rulePrimaryExprLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2670:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:2671:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:2671:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_IDENTIFIER) ) {
                alt38=1;
            }
            else if ( (LA38_0==63) ) {
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
                    // InternalMyDsl.g:2672:3: this_IDENTIFIER_0= RULE_IDENTIFIER
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
                    // InternalMyDsl.g:2680:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:2680:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    // InternalMyDsl.g:2681:4: kw= '(' this_Type_2= ruleType kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaAccess().getTypeParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_10);
                    this_Type_2=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2706:1: entryRulePrimaryExprLinhaLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinhaLinha = null;


        try {
            // InternalMyDsl.g:2706:66: (iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF )
            // InternalMyDsl.g:2707:2: iv_rulePrimaryExprLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinha EOF
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
    // InternalMyDsl.g:2713:1: rulePrimaryExprLinhaLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinhaLinhaLinhaLinha_1 = null;

        AntlrDatatypeRuleToken this_SliceLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2719:2: ( ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) ) )
            // InternalMyDsl.g:2720:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) )
            {
            // InternalMyDsl.g:2720:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha ) | (kw= ':' this_SliceLinha_3= ruleSliceLinha ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_DECIMALS||(LA39_0>=RULE_IDENTIFIER && LA39_0<=RULE_UNARY_OP)||LA39_0==RULE_INT_LIT||LA39_0==61||LA39_0==63||LA39_0==65||LA39_0==70||(LA39_0>=72 && LA39_0<=73)) ) {
                alt39=1;
            }
            else if ( (LA39_0==76) ) {
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
                    // InternalMyDsl.g:2721:3: (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha )
                    {
                    // InternalMyDsl.g:2721:3: (this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha )
                    // InternalMyDsl.g:2722:4: this_Expression_0= ruleExpression this_PrimaryExprLinhaLinhaLinhaLinha_1= rulePrimaryExprLinhaLinhaLinhaLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaLinhaLinhaAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_36);
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
                    // InternalMyDsl.g:2744:3: (kw= ':' this_SliceLinha_3= ruleSliceLinha )
                    {
                    // InternalMyDsl.g:2744:3: (kw= ':' this_SliceLinha_3= ruleSliceLinha )
                    // InternalMyDsl.g:2745:4: kw= ':' this_SliceLinha_3= ruleSliceLinha
                    {
                    kw=(Token)match(input,76,FOLLOW_35); if (state.failed) return current;
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
    // InternalMyDsl.g:2765:1: entryRulePrimaryExprLinhaLinhaLinhaLinha returns [String current=null] : iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF ;
    public final String entryRulePrimaryExprLinhaLinhaLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinhaLinhaLinhaLinha = null;


        try {
            // InternalMyDsl.g:2765:71: (iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF )
            // InternalMyDsl.g:2766:2: iv_rulePrimaryExprLinhaLinhaLinhaLinha= rulePrimaryExprLinhaLinhaLinhaLinha EOF
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
    // InternalMyDsl.g:2772:1: rulePrimaryExprLinhaLinhaLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinhaLinhaLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SliceLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2778:2: ( (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) ) )
            // InternalMyDsl.g:2779:2: (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) )
            {
            // InternalMyDsl.g:2779:2: (kw= ']' | (kw= ':' this_SliceLinha_2= ruleSliceLinha ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==66) ) {
                alt40=1;
            }
            else if ( (LA40_0==76) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2780:3: kw= ']'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinhaLinhaLinhaLinhaAccess().getRightSquareBracketKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2786:3: (kw= ':' this_SliceLinha_2= ruleSliceLinha )
                    {
                    // InternalMyDsl.g:2786:3: (kw= ':' this_SliceLinha_2= ruleSliceLinha )
                    // InternalMyDsl.g:2787:4: kw= ':' this_SliceLinha_2= ruleSliceLinha
                    {
                    kw=(Token)match(input,76,FOLLOW_35); if (state.failed) return current;
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
    // InternalMyDsl.g:2807:1: entryRuleSliceLinha returns [String current=null] : iv_ruleSliceLinha= ruleSliceLinha EOF ;
    public final String entryRuleSliceLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSliceLinha = null;


        try {
            // InternalMyDsl.g:2807:50: (iv_ruleSliceLinha= ruleSliceLinha EOF )
            // InternalMyDsl.g:2808:2: iv_ruleSliceLinha= ruleSliceLinha EOF
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
    // InternalMyDsl.g:2814:1: ruleSliceLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleSliceLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2820:2: ( ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) ) )
            // InternalMyDsl.g:2821:2: ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) )
            {
            // InternalMyDsl.g:2821:2: ( (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' ) | (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==76) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_DECIMALS||(LA42_0>=RULE_IDENTIFIER && LA42_0<=RULE_UNARY_OP)||LA42_0==RULE_INT_LIT||LA42_0==61||LA42_0==63||LA42_0==65||LA42_0==70||(LA42_0>=72 && LA42_0<=73)) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2822:3: (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' )
                    {
                    // InternalMyDsl.g:2822:3: (kw= ':' (this_Expression_1= ruleExpression )? kw= ']' )
                    // InternalMyDsl.g:2823:4: kw= ':' (this_Expression_1= ruleExpression )? kw= ']'
                    {
                    kw=(Token)match(input,76,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getColonKeyword_0_0());
                      			
                    }
                    // InternalMyDsl.g:2828:4: (this_Expression_1= ruleExpression )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_DECIMALS||(LA41_0>=RULE_IDENTIFIER && LA41_0<=RULE_UNARY_OP)||LA41_0==RULE_INT_LIT||LA41_0==61||LA41_0==63||LA41_0==65||LA41_0==70||(LA41_0>=72 && LA41_0<=73)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:2829:5: this_Expression_1= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getSliceLinhaAccess().getExpressionParserRuleCall_0_1());
                              				
                            }
                            pushFollow(FOLLOW_14);
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

                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2847:3: (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' )
                    {
                    // InternalMyDsl.g:2847:3: (this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']' )
                    // InternalMyDsl.g:2848:4: this_Expression_3= ruleExpression kw= ':' this_Expression_5= ruleExpression kw= ']'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSliceLinhaAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,76,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSliceLinhaAccess().getColonKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSliceLinhaAccess().getExpressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2883:1: entryRuleArguments returns [String current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final String entryRuleArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArguments = null;


        try {
            // InternalMyDsl.g:2883:49: (iv_ruleArguments= ruleArguments EOF )
            // InternalMyDsl.g:2884:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalMyDsl.g:2890:1: ruleArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_ExpressionList_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2896:2: ( (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:2897:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:2897:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:2898:3: kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,63,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:2903:3: ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DECIMALS||(LA47_0>=RULE_IDENTIFIER && LA47_0<=RULE_UNARY_OP)||LA47_0==RULE_INT_LIT||LA47_0==61||LA47_0==63||LA47_0==65||LA47_0==70||(LA47_0>=72 && LA47_0<=73)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2904:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )?
                    {
                    // InternalMyDsl.g:2904:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // InternalMyDsl.g:2905:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            {
                            // InternalMyDsl.g:2905:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            // InternalMyDsl.g:2906:6: ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_0());
                              					
                            }
                            pushFollow(FOLLOW_39);
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
                            // InternalMyDsl.g:2919:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            {
                            // InternalMyDsl.g:2919:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            // InternalMyDsl.g:2920:6: this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getTypeParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_39);
                            this_Type_2=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_Type_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalMyDsl.g:2930:6: (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==71) ) {
                                int LA43_1 = input.LA(2);

                                if ( (LA43_1==RULE_DECIMALS||(LA43_1>=RULE_IDENTIFIER && LA43_1<=RULE_UNARY_OP)||LA43_1==RULE_INT_LIT||LA43_1==61||LA43_1==63||LA43_1==65||LA43_1==70||(LA43_1>=72 && LA43_1<=73)) ) {
                                    alt43=1;
                                }
                            }
                            switch (alt43) {
                                case 1 :
                                    // InternalMyDsl.g:2931:7: kw= ',' this_ExpressionList_4= ruleExpressionList
                                    {
                                    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current.merge(kw);
                                      							newLeafNode(kw, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0_1_1_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_1_1_1());
                                      						
                                    }
                                    pushFollow(FOLLOW_39);
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

                    // InternalMyDsl.g:2949:4: (kw= '...' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==72) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalMyDsl.g:2950:5: kw= '...'
                            {
                            kw=(Token)match(input,72,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyDsl.g:2956:4: (kw= ',' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==71) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalMyDsl.g:2957:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_10); if (state.failed) return current;
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

            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:2973:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            // InternalMyDsl.g:2973:54: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMyDsl.g:2974:2: iv_ruleExpressionList= ruleExpressionList EOF
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
    // InternalMyDsl.g:2980:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2986:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalMyDsl.g:2987:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalMyDsl.g:2987:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalMyDsl.g:2988:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:2998:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==71) ) {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==RULE_DECIMALS||(LA48_2>=RULE_IDENTIFIER && LA48_2<=RULE_UNARY_OP)||LA48_2==RULE_INT_LIT||LA48_2==61||LA48_2==63||LA48_2==65||LA48_2==70||(LA48_2>=72 && LA48_2<=73)) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:2999:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop48;
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
    // InternalMyDsl.g:3019:1: entryRuleIdentifierList returns [String current=null] : iv_ruleIdentifierList= ruleIdentifierList EOF ;
    public final String entryRuleIdentifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierList = null;


        try {
            // InternalMyDsl.g:3019:54: (iv_ruleIdentifierList= ruleIdentifierList EOF )
            // InternalMyDsl.g:3020:2: iv_ruleIdentifierList= ruleIdentifierList EOF
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
    // InternalMyDsl.g:3026:1: ruleIdentifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3032:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalMyDsl.g:3033:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalMyDsl.g:3033:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalMyDsl.g:3034:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:3041:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==71) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:3042:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,71,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifierListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMyDsl.g:3059:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:3059:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:3060:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalMyDsl.g:3066:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StatementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3072:2: ( (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) )
            // InternalMyDsl.g:3073:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            {
            // InternalMyDsl.g:3073:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            // InternalMyDsl.g:3074:3: kw= '{' this_StatementList_1= ruleStatementList kw= '}'
            {
            kw=(Token)match(input,67,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBlockAccess().getStatementListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_25);
            this_StatementList_1=ruleStatementList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_StatementList_1);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:3098:1: entryRuleStatementList returns [String current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final String entryRuleStatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatementList = null;


        try {
            // InternalMyDsl.g:3098:53: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalMyDsl.g:3099:2: iv_ruleStatementList= ruleStatementList EOF
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
    // InternalMyDsl.g:3105:1: ruleStatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Statement_0= ruleStatement kw= ';' )* ;
    public final AntlrDatatypeRuleToken ruleStatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3111:2: ( (this_Statement_0= ruleStatement kw= ';' )* )
            // InternalMyDsl.g:3112:2: (this_Statement_0= ruleStatement kw= ';' )*
            {
            // InternalMyDsl.g:3112:2: (this_Statement_0= ruleStatement kw= ';' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_DECIMALS||(LA50_0>=RULE_IDENTIFIER && LA50_0<=RULE_UNARY_OP)||(LA50_0>=RULE_DEFER && LA50_0<=RULE_FOR)||LA50_0==RULE_SELECT||(LA50_0>=RULE_SWITCH && LA50_0<=RULE_IF)||(LA50_0>=RULE_FALLTHROUGH && LA50_0<=RULE_INT_LIT)||LA50_0==61||LA50_0==63||LA50_0==65||LA50_0==67||LA50_0==70||(LA50_0>=72 && LA50_0<=73)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:3113:3: this_Statement_0= ruleStatement kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStatementListAccess().getStatementParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_17);
            	    this_Statement_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Statement_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,68,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalMyDsl.g:3132:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:3132:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:3133:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:3139:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) ;
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
            // InternalMyDsl.g:3145:2: ( (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) )
            // InternalMyDsl.g:3146:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            {
            // InternalMyDsl.g:3146:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            int alt51=15;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:3147:3: this_Declaration_0= ruleDeclaration
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
                    // InternalMyDsl.g:3158:3: this_LabeledStmt_1= ruleLabeledStmt
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
                    // InternalMyDsl.g:3169:3: this_SimpleStmt_2= ruleSimpleStmt
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
                    // InternalMyDsl.g:3180:3: this_GoStmt_3= ruleGoStmt
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
                    // InternalMyDsl.g:3191:3: this_ReturnStmt_4= ruleReturnStmt
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
                    // InternalMyDsl.g:3202:3: this_BreakStmt_5= ruleBreakStmt
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
                    // InternalMyDsl.g:3213:3: this_ContinueStmt_6= ruleContinueStmt
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
                    // InternalMyDsl.g:3224:3: this_GotoStmt_7= ruleGotoStmt
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
                    // InternalMyDsl.g:3235:3: this_FallthroughStmt_8= ruleFallthroughStmt
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
                    // InternalMyDsl.g:3246:3: this_Block_9= ruleBlock
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
                    // InternalMyDsl.g:3257:3: this_IfStmt_10= ruleIfStmt
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
                    // InternalMyDsl.g:3268:3: this_SwitchStmt_11= ruleSwitchStmt
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
                    // InternalMyDsl.g:3279:3: this_SelectStmt_12= ruleSelectStmt
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
                    // InternalMyDsl.g:3290:3: this_ForStmt_13= ruleForStmt
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
                    // InternalMyDsl.g:3301:3: this_DeferStmt_14= ruleDeferStmt
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
    // InternalMyDsl.g:3315:1: entryRuleDeferStmt returns [String current=null] : iv_ruleDeferStmt= ruleDeferStmt EOF ;
    public final String entryRuleDeferStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeferStmt = null;


        try {
            // InternalMyDsl.g:3315:49: (iv_ruleDeferStmt= ruleDeferStmt EOF )
            // InternalMyDsl.g:3316:2: iv_ruleDeferStmt= ruleDeferStmt EOF
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
    // InternalMyDsl.g:3322:1: ruleDeferStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeferStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DEFER_0=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3328:2: ( (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression ) )
            // InternalMyDsl.g:3329:2: (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression )
            {
            // InternalMyDsl.g:3329:2: (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression )
            // InternalMyDsl.g:3330:3: this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression
            {
            this_DEFER_0=(Token)match(input,RULE_DEFER,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DEFER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFER_0, grammarAccess.getDeferStmtAccess().getDEFERTerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:3351:1: entryRuleForStmt returns [String current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final String entryRuleForStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmt = null;


        try {
            // InternalMyDsl.g:3351:47: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMyDsl.g:3352:2: iv_ruleForStmt= ruleForStmt EOF
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
    // InternalMyDsl.g:3358:1: ruleForStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FOR_0= RULE_FOR (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleForStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FOR_0=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_ForStmtLinha_2 = null;

        AntlrDatatypeRuleToken this_Block_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3364:2: ( (this_FOR_0= RULE_FOR (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock ) )
            // InternalMyDsl.g:3365:2: (this_FOR_0= RULE_FOR (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock )
            {
            // InternalMyDsl.g:3365:2: (this_FOR_0= RULE_FOR (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock )
            // InternalMyDsl.g:3366:3: this_FOR_0= RULE_FOR (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )? this_Block_3= ruleBlock
            {
            this_FOR_0=(Token)match(input,RULE_FOR,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FOR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FOR_0, grammarAccess.getForStmtAccess().getFORTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:3373:3: (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DECIMALS||(LA52_0>=RULE_IDENTIFIER && LA52_0<=RULE_UNARY_OP)||LA52_0==RULE_INT_LIT||LA52_0==61||LA52_0==63||LA52_0==65||LA52_0==70||(LA52_0>=72 && LA52_0<=73)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:3374:4: this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_43);
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
                    pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3409:1: entryRuleForStmtLinha returns [String current=null] : iv_ruleForStmtLinha= ruleForStmtLinha EOF ;
    public final String entryRuleForStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmtLinha = null;


        try {
            // InternalMyDsl.g:3409:52: (iv_ruleForStmtLinha= ruleForStmtLinha EOF )
            // InternalMyDsl.g:3410:2: iv_ruleForStmtLinha= ruleForStmtLinha EOF
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
    // InternalMyDsl.g:3416:1: ruleForStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleForStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_1=null;
        Token kw=null;
        Token this_IDENTIFIER_3=null;
        Token this_IDENTIFIER_13=null;
        Token this_IDENTIFIER_15=null;
        Token this_RANGE_25=null;
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
            // InternalMyDsl.g:3422:2: ( ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:3423:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:3423:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression ) | this_ANY_OTHER_27= RULE_ANY_OTHER )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_IDENTIFIER||(LA60_0>=RULE_ADD_OP && LA60_0<=RULE_MUL_OP)||LA60_0==71||LA60_0==73||(LA60_0>=79 && LA60_0<=80)) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:3424:3: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression )
                    {
                    // InternalMyDsl.g:3424:3: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression )
                    // InternalMyDsl.g:3425:4: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) ) kw= ';' this_Condition_9= ruleCondition kw= ';' ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) ) this_RANGE_25= RULE_RANGE this_Expression_26= ruleExpression
                    {
                    // InternalMyDsl.g:3425:4: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha | ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=RULE_ADD_OP && LA55_0<=RULE_MUL_OP)||LA55_0==71||LA55_0==73||(LA55_0>=79 && LA55_0<=80)) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_IDENTIFIER) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalMyDsl.g:3426:5: this_SimpleStmtLinha_0= ruleSimpleStmtLinha
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getForStmtLinhaAccess().getSimpleStmtLinhaParserRuleCall_0_0_0());
                              				
                            }
                            pushFollow(FOLLOW_17);
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
                            // InternalMyDsl.g:3437:5: ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) )
                            {
                            // InternalMyDsl.g:3437:5: ( (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* ) )
                            // InternalMyDsl.g:3438:6: (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* )
                            {
                            // InternalMyDsl.g:3438:6: (this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )* )
                            // InternalMyDsl.g:3439:7: this_IDENTIFIER_1= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )*
                            {
                            this_IDENTIFIER_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_IDENTIFIER_1);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newLeafNode(this_IDENTIFIER_1, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_0_1_0_0());
                              						
                            }
                            // InternalMyDsl.g:3446:7: (kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==71) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalMyDsl.g:3447:8: kw= ',' this_IDENTIFIER_3= RULE_IDENTIFIER
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_0_1_0_1_0());
                            	      							
                            	    }
                            	    this_IDENTIFIER_3=(Token)match(input,RULE_IDENTIFIER,FOLLOW_44); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(this_IDENTIFIER_3);
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(this_IDENTIFIER_3, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_0_1_0_1_1());
                            	      							
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }

                            kw=(Token)match(input,77,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_0_1_1());
                              					
                            }
                            // InternalMyDsl.g:3466:6: (this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )* )
                            // InternalMyDsl.g:3467:7: this_Expression_5= ruleExpression (kw= ',' this_Expression_7= ruleExpression )*
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_0_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_45);
                            this_Expression_5=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_Expression_5);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }
                            // InternalMyDsl.g:3477:7: (kw= ',' this_Expression_7= ruleExpression )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==71) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalMyDsl.g:3478:8: kw= ',' this_Expression_7= ruleExpression
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_0_1_2_1_0());
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_0_1_2_1_1());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_45);
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
                            	    break loop54;
                                }
                            } while (true);


                            }


                            }


                            }
                            break;

                    }

                    kw=(Token)match(input,68,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaAccess().getConditionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_17);
                    this_Condition_9=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Condition_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_0_3());
                      			
                    }
                    // InternalMyDsl.g:3517:4: ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) )
                    int alt59=4;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // InternalMyDsl.g:3518:5: (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha )
                            {
                            // InternalMyDsl.g:3518:5: (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha )
                            // InternalMyDsl.g:3519:6: this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_0_0());
                              					
                            }
                            pushFollow(FOLLOW_47);
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
                            pushFollow(FOLLOW_48);
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
                            // InternalMyDsl.g:3541:5: ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) )
                            {
                            // InternalMyDsl.g:3541:5: ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) )
                            // InternalMyDsl.g:3542:6: (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* )
                            {
                            // InternalMyDsl.g:3542:6: (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* )
                            // InternalMyDsl.g:3543:7: this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )*
                            {
                            this_IDENTIFIER_13=(Token)match(input,RULE_IDENTIFIER,FOLLOW_44); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_IDENTIFIER_13);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							newLeafNode(this_IDENTIFIER_13, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_4_1_0_0());
                              						
                            }
                            // InternalMyDsl.g:3550:7: (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )*
                            loop56:
                            do {
                                int alt56=2;
                                int LA56_0 = input.LA(1);

                                if ( (LA56_0==71) ) {
                                    alt56=1;
                                }


                                switch (alt56) {
                            	case 1 :
                            	    // InternalMyDsl.g:3551:8: kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_4_1_0_1_0());
                            	      							
                            	    }
                            	    this_IDENTIFIER_15=(Token)match(input,RULE_IDENTIFIER,FOLLOW_44); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(this_IDENTIFIER_15);
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newLeafNode(this_IDENTIFIER_15, grammarAccess.getForStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_0_4_1_0_1_1());
                            	      							
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);


                            }

                            kw=(Token)match(input,77,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_4_1_1());
                              					
                            }
                            // InternalMyDsl.g:3570:6: (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* )
                            // InternalMyDsl.g:3571:7: this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )*
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_49);
                            this_Expression_17=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							current.merge(this_Expression_17);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							afterParserOrEnumRuleCall();
                              						
                            }
                            // InternalMyDsl.g:3581:7: (kw= ',' this_Expression_19= ruleExpression )*
                            loop57:
                            do {
                                int alt57=2;
                                int LA57_0 = input.LA(1);

                                if ( (LA57_0==71) ) {
                                    alt57=1;
                                }


                                switch (alt57) {
                            	case 1 :
                            	    // InternalMyDsl.g:3582:8: kw= ',' this_Expression_19= ruleExpression
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								current.merge(kw);
                            	      								newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_4_1_2_1_0());
                            	      							
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_1_2_1_1());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_49);
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
                            	    break loop57;
                                }
                            } while (true);


                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:3601:5: ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:3601:5: ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:3602:6: (kw= ',' this_Expression_21= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:3602:6: (kw= ',' this_Expression_21= ruleExpression )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==71) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // InternalMyDsl.g:3603:7: kw= ',' this_Expression_21= ruleExpression
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(kw);
                            	      							newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_0_4_2_0_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_0_4_2_0_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_50);
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
                            	    break loop58;
                                }
                            } while (true);

                            kw=(Token)match(input,78,FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getEqualsSignKeyword_0_4_2_1());
                              					
                            }

                            }


                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:3626:5: (this_IdentifierList_23= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:3626:5: (this_IdentifierList_23= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:3627:6: this_IdentifierList_23= ruleIdentifierList kw= ':='
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtLinhaAccess().getIdentifierListParserRuleCall_0_4_3_0());
                              					
                            }
                            pushFollow(FOLLOW_51);
                            this_IdentifierList_23=ruleIdentifierList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_IdentifierList_23);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            kw=(Token)match(input,77,FOLLOW_48); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getColonEqualsSignKeyword_0_4_3_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    this_RANGE_25=(Token)match(input,RULE_RANGE,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_RANGE_25);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_RANGE_25, grammarAccess.getForStmtLinhaAccess().getRANGETerminalRuleCall_0_5());
                      			
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
                    // InternalMyDsl.g:3663:3: this_ANY_OTHER_27= RULE_ANY_OTHER
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
    // InternalMyDsl.g:3674:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:3674:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:3675:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:3681:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3687:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:3688:2: this_Expression_0= ruleExpression
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
    // InternalMyDsl.g:3701:1: entryRuleSelectStmt returns [String current=null] : iv_ruleSelectStmt= ruleSelectStmt EOF ;
    public final String entryRuleSelectStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStmt = null;


        try {
            // InternalMyDsl.g:3701:50: (iv_ruleSelectStmt= ruleSelectStmt EOF )
            // InternalMyDsl.g:3702:2: iv_ruleSelectStmt= ruleSelectStmt EOF
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
    // InternalMyDsl.g:3708:1: ruleSelectStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSelectStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SELECT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_CommClause_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3714:2: ( (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) )
            // InternalMyDsl.g:3715:2: (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            {
            // InternalMyDsl.g:3715:2: (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            // InternalMyDsl.g:3716:3: this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}'
            {
            this_SELECT_0=(Token)match(input,RULE_SELECT,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SELECT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SELECT_0, grammarAccess.getSelectStmtAccess().getSELECTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:3728:3: (this_CommClause_2= ruleCommClause )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_CASE && LA61_0<=RULE_DEFAULT)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMyDsl.g:3729:4: this_CommClause_2= ruleCommClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSelectStmtAccess().getCommClauseParserRuleCall_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_52);
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
            	    break loop61;
                }
            } while (true);

            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:3749:1: entryRuleCommClause returns [String current=null] : iv_ruleCommClause= ruleCommClause EOF ;
    public final String entryRuleCommClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommClause = null;


        try {
            // InternalMyDsl.g:3749:50: (iv_ruleCommClause= ruleCommClause EOF )
            // InternalMyDsl.g:3750:2: iv_ruleCommClause= ruleCommClause EOF
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
    // InternalMyDsl.g:3756:1: ruleCommClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleCommClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CommCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3762:2: ( (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:3763:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:3763:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:3764:3: this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getCommCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_CommCase_0=ruleCommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CommCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
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
    // InternalMyDsl.g:3793:1: entryRuleCommCase returns [String current=null] : iv_ruleCommCase= ruleCommCase EOF ;
    public final String entryRuleCommCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCase = null;


        try {
            // InternalMyDsl.g:3793:48: (iv_ruleCommCase= ruleCommCase EOF )
            // InternalMyDsl.g:3794:2: iv_ruleCommCase= ruleCommCase EOF
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
    // InternalMyDsl.g:3800:1: ruleCommCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT ) ;
    public final AntlrDatatypeRuleToken ruleCommCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_0=null;
        Token this_DEFAULT_3=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_CommCaseLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3806:2: ( ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT ) )
            // InternalMyDsl.g:3807:2: ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT )
            {
            // InternalMyDsl.g:3807:2: ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_CASE) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_DEFAULT) ) {
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
                    // InternalMyDsl.g:3808:3: (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    {
                    // InternalMyDsl.g:3808:3: (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    // InternalMyDsl.g:3809:4: this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CASE_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CASE_0, grammarAccess.getCommCaseAccess().getCASETerminalRuleCall_0_0());
                      			
                    }
                    // InternalMyDsl.g:3816:4: (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    // InternalMyDsl.g:3817:5: this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommCaseAccess().getExpressionParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_54);
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
                    // InternalMyDsl.g:3840:3: this_DEFAULT_3= RULE_DEFAULT
                    {
                    this_DEFAULT_3=(Token)match(input,RULE_DEFAULT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFAULT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFAULT_3, grammarAccess.getCommCaseAccess().getDEFAULTTerminalRuleCall_1());
                      		
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
    // InternalMyDsl.g:3851:1: entryRuleCommCaseLinha returns [String current=null] : iv_ruleCommCaseLinha= ruleCommCaseLinha EOF ;
    public final String entryRuleCommCaseLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCaseLinha = null;


        try {
            // InternalMyDsl.g:3851:53: (iv_ruleCommCaseLinha= ruleCommCaseLinha EOF )
            // InternalMyDsl.g:3852:2: iv_ruleCommCaseLinha= ruleCommCaseLinha EOF
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
    // InternalMyDsl.g:3858:1: ruleCommCaseLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleCommCaseLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_IdentifierList_5 = null;

        AntlrDatatypeRuleToken this_RecvExpr_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3864:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) )
            // InternalMyDsl.g:3865:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            {
            // InternalMyDsl.g:3865:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==73) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_IDENTIFIER||LA65_0==71||LA65_0==78) ) {
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
                    // InternalMyDsl.g:3866:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:3866:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:3867:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,73,FOLLOW_30); if (state.failed) return current;
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
                    // InternalMyDsl.g:3884:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    {
                    // InternalMyDsl.g:3884:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    // InternalMyDsl.g:3885:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr
                    {
                    // InternalMyDsl.g:3885:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==71||LA64_0==78) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==RULE_IDENTIFIER) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalMyDsl.g:3886:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:3886:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:3887:6: (kw= ',' this_Expression_3= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:3887:6: (kw= ',' this_Expression_3= ruleExpression )*
                            loop63:
                            do {
                                int alt63=2;
                                int LA63_0 = input.LA(1);

                                if ( (LA63_0==71) ) {
                                    alt63=1;
                                }


                                switch (alt63) {
                            	case 1 :
                            	    // InternalMyDsl.g:3888:7: kw= ',' this_Expression_3= ruleExpression
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(kw);
                            	      							newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getCommaKeyword_1_0_0_0_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getExpressionParserRuleCall_1_0_0_0_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_50);
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
                            	    break loop63;
                                }
                            } while (true);

                            kw=(Token)match(input,78,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:3911:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:3911:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:3912:6: this_IdentifierList_5= ruleIdentifierList kw= ':='
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getIdentifierListParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_51);
                            this_IdentifierList_5=ruleIdentifierList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_IdentifierList_5);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            kw=(Token)match(input,77,FOLLOW_30); if (state.failed) return current;
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
    // InternalMyDsl.g:3944:1: entryRuleRecvExpr returns [String current=null] : iv_ruleRecvExpr= ruleRecvExpr EOF ;
    public final String entryRuleRecvExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecvExpr = null;


        try {
            // InternalMyDsl.g:3944:48: (iv_ruleRecvExpr= ruleRecvExpr EOF )
            // InternalMyDsl.g:3945:2: iv_ruleRecvExpr= ruleRecvExpr EOF
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
    // InternalMyDsl.g:3951:1: ruleRecvExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleRecvExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3957:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:3958:2: this_Expression_0= ruleExpression
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
    // InternalMyDsl.g:3971:1: entryRuleSwitchStmt returns [String current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final String entryRuleSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmt = null;


        try {
            // InternalMyDsl.g:3971:50: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalMyDsl.g:3972:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
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
    // InternalMyDsl.g:3978:1: ruleSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SWITCH_0= RULE_SWITCH (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SWITCH_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleStmt_1 = null;

        AntlrDatatypeRuleToken this_SwitchStmtLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3984:2: ( (this_SWITCH_0= RULE_SWITCH (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) )
            // InternalMyDsl.g:3985:2: (this_SWITCH_0= RULE_SWITCH (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            {
            // InternalMyDsl.g:3985:2: (this_SWITCH_0= RULE_SWITCH (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            // InternalMyDsl.g:3986:3: this_SWITCH_0= RULE_SWITCH (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_SwitchStmtLinha_3= ruleSwitchStmtLinha
            {
            this_SWITCH_0=(Token)match(input,RULE_SWITCH,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SWITCH_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SWITCH_0, grammarAccess.getSwitchStmtAccess().getSWITCHTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:3993:3: (this_SimpleStmt_1= ruleSimpleStmt kw= ';' )
            // InternalMyDsl.g:3994:4: this_SimpleStmt_1= ruleSimpleStmt kw= ';'
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
              			
            }
            pushFollow(FOLLOW_17);
            this_SimpleStmt_1=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_SimpleStmt_1);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }
            kw=(Token)match(input,68,FOLLOW_30); if (state.failed) return current;
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
    // InternalMyDsl.g:4024:1: entryRuleSwitchStmtLinha returns [String current=null] : iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF ;
    public final String entryRuleSwitchStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmtLinha = null;


        try {
            // InternalMyDsl.g:4024:55: (iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF )
            // InternalMyDsl.g:4025:2: iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF
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
    // InternalMyDsl.g:4031:1: ruleSwitchStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_ExprCaseClause_2 = null;

        AntlrDatatypeRuleToken this_TypeSwitchGuard_4 = null;

        AntlrDatatypeRuleToken this_TypeCaseClause_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4037:2: ( ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) ) )
            // InternalMyDsl.g:4038:2: ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) )
            {
            // InternalMyDsl.g:4038:2: ( (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' ) | (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_DECIMALS||(LA68_0>=RULE_STRUCT && LA68_0<=RULE_UNARY_OP)||LA68_0==RULE_INT_LIT||LA68_0==61||LA68_0==63||LA68_0==65||LA68_0==70||(LA68_0>=72 && LA68_0<=73)) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_IDENTIFIER) ) {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==RULE_ANY_OTHER||LA68_2==61) ) {
                    alt68=1;
                }
                else if ( (LA68_2==77) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:4039:3: (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:4039:3: (this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}' )
                    // InternalMyDsl.g:4040:4: this_Expression_0= ruleExpression kw= '{' (this_ExprCaseClause_2= ruleExprCaseClause )* kw= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,67,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_0_1());
                      			
                    }
                    // InternalMyDsl.g:4055:4: (this_ExprCaseClause_2= ruleExprCaseClause )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( ((LA66_0>=RULE_CASE && LA66_0<=RULE_DEFAULT)) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalMyDsl.g:4056:5: this_ExprCaseClause_2= ruleExprCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getExprCaseClauseParserRuleCall_0_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_52);
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
                    	    break loop66;
                        }
                    } while (true);

                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getRightCurlyBracketKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4074:3: (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:4074:3: (this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}' )
                    // InternalMyDsl.g:4075:4: this_TypeSwitchGuard_4= ruleTypeSwitchGuard kw= '{' (this_TypeCaseClause_6= ruleTypeCaseClause )* kw= '}'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getTypeSwitchGuardParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_TypeSwitchGuard_4=ruleTypeSwitchGuard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeSwitchGuard_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,67,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:4090:4: (this_TypeCaseClause_6= ruleTypeCaseClause )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( ((LA67_0>=RULE_CASE && LA67_0<=RULE_DEFAULT)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalMyDsl.g:4091:5: this_TypeCaseClause_6= ruleTypeCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getTypeCaseClauseParserRuleCall_1_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_52);
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
                    	    break loop67;
                        }
                    } while (true);

                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4112:1: entryRuleTypeCaseClause returns [String current=null] : iv_ruleTypeCaseClause= ruleTypeCaseClause EOF ;
    public final String entryRuleTypeCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeCaseClause = null;


        try {
            // InternalMyDsl.g:4112:54: (iv_ruleTypeCaseClause= ruleTypeCaseClause EOF )
            // InternalMyDsl.g:4113:2: iv_ruleTypeCaseClause= ruleTypeCaseClause EOF
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
    // InternalMyDsl.g:4119:1: ruleTypeCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleTypeCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4125:2: ( (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:4126:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:4126:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:4127:3: this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeCaseClauseAccess().getTypeSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_TypeSwitchCase_0=ruleTypeSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
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
    // InternalMyDsl.g:4156:1: entryRuleTypeSwitchCase returns [String current=null] : iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF ;
    public final String entryRuleTypeSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchCase = null;


        try {
            // InternalMyDsl.g:4156:54: (iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF )
            // InternalMyDsl.g:4157:2: iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF
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
    // InternalMyDsl.g:4163:1: ruleTypeSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_0=null;
        Token this_DEFAULT_2=null;
        AntlrDatatypeRuleToken this_TypeList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4169:2: ( ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT ) )
            // InternalMyDsl.g:4170:2: ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT )
            {
            // InternalMyDsl.g:4170:2: ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_CASE) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_DEFAULT) ) {
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
                    // InternalMyDsl.g:4171:3: (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList )
                    {
                    // InternalMyDsl.g:4171:3: (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList )
                    // InternalMyDsl.g:4172:4: this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CASE_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CASE_0, grammarAccess.getTypeSwitchCaseAccess().getCASETerminalRuleCall_0_0());
                      			
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
                    // InternalMyDsl.g:4191:3: this_DEFAULT_2= RULE_DEFAULT
                    {
                    this_DEFAULT_2=(Token)match(input,RULE_DEFAULT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFAULT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFAULT_2, grammarAccess.getTypeSwitchCaseAccess().getDEFAULTTerminalRuleCall_1());
                      		
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
    // InternalMyDsl.g:4202:1: entryRuleTypeList returns [String current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final String entryRuleTypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeList = null;


        try {
            // InternalMyDsl.g:4202:48: (iv_ruleTypeList= ruleTypeList EOF )
            // InternalMyDsl.g:4203:2: iv_ruleTypeList= ruleTypeList EOF
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
    // InternalMyDsl.g:4209:1: ruleTypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) ;
    public final AntlrDatatypeRuleToken ruleTypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4215:2: ( (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) )
            // InternalMyDsl.g:4216:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            {
            // InternalMyDsl.g:4216:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            // InternalMyDsl.g:4217:3: this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:4227:3: (kw= ',' this_Type_2= ruleType )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==71) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalMyDsl.g:4228:4: kw= ',' this_Type_2= ruleType
            	    {
            	    kw=(Token)match(input,71,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTypeListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop70;
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
    // InternalMyDsl.g:4248:1: entryRuleTypeSwitchGuard returns [String current=null] : iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF ;
    public final String entryRuleTypeSwitchGuard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchGuard = null;


        try {
            // InternalMyDsl.g:4248:55: (iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF )
            // InternalMyDsl.g:4249:2: iv_ruleTypeSwitchGuard= ruleTypeSwitchGuard EOF
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
    // InternalMyDsl.g:4255:1: ruleTypeSwitchGuard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchGuard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_TYPEKEYWORD_5=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4261:2: ( ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' ) )
            // InternalMyDsl.g:4262:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' )
            {
            // InternalMyDsl.g:4262:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' )
            // InternalMyDsl.g:4263:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_2= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')'
            {
            // InternalMyDsl.g:4263:3: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':=' )
            // InternalMyDsl.g:4264:4: this_IDENTIFIER_0= RULE_IDENTIFIER kw= ':='
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_IDENTIFIER_0);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_IDENTIFIER_0, grammarAccess.getTypeSwitchGuardAccess().getIDENTIFIERTerminalRuleCall_0_0());
              			
            }
            kw=(Token)match(input,77,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getColonEqualsSignKeyword_0_1());
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeSwitchGuardAccess().getPrimaryExprParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_5);
            this_PrimaryExpr_2=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PrimaryExpr_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,61,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getFullStopKeyword_2());
              		
            }
            kw=(Token)match(input,63,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getTypeSwitchGuardAccess().getLeftParenthesisKeyword_3());
              		
            }
            this_TYPEKEYWORD_5=(Token)match(input,RULE_TYPEKEYWORD,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TYPEKEYWORD_5);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEKEYWORD_5, grammarAccess.getTypeSwitchGuardAccess().getTYPEKEYWORDTerminalRuleCall_4());
              		
            }
            kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4313:1: entryRuleExprCaseClause returns [String current=null] : iv_ruleExprCaseClause= ruleExprCaseClause EOF ;
    public final String entryRuleExprCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprCaseClause = null;


        try {
            // InternalMyDsl.g:4313:54: (iv_ruleExprCaseClause= ruleExprCaseClause EOF )
            // InternalMyDsl.g:4314:2: iv_ruleExprCaseClause= ruleExprCaseClause EOF
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
    // InternalMyDsl.g:4320:1: ruleExprCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleExprCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4326:2: ( (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:4327:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:4327:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:4328:3: this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprCaseClauseAccess().getExprSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_ExprSwitchCase_0=ruleExprSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExprSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
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
    // InternalMyDsl.g:4357:1: entryRuleExprSwitchCase returns [String current=null] : iv_ruleExprSwitchCase= ruleExprSwitchCase EOF ;
    public final String entryRuleExprSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSwitchCase = null;


        try {
            // InternalMyDsl.g:4357:54: (iv_ruleExprSwitchCase= ruleExprSwitchCase EOF )
            // InternalMyDsl.g:4358:2: iv_ruleExprSwitchCase= ruleExprSwitchCase EOF
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
    // InternalMyDsl.g:4364:1: ruleExprSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT ) ;
    public final AntlrDatatypeRuleToken ruleExprSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_0=null;
        Token this_DEFAULT_2=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4370:2: ( ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT ) )
            // InternalMyDsl.g:4371:2: ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT )
            {
            // InternalMyDsl.g:4371:2: ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_CASE) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_DEFAULT) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalMyDsl.g:4372:3: (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList )
                    {
                    // InternalMyDsl.g:4372:3: (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList )
                    // InternalMyDsl.g:4373:4: this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CASE_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CASE_0, grammarAccess.getExprSwitchCaseAccess().getCASETerminalRuleCall_0_0());
                      			
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
                    // InternalMyDsl.g:4392:3: this_DEFAULT_2= RULE_DEFAULT
                    {
                    this_DEFAULT_2=(Token)match(input,RULE_DEFAULT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFAULT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFAULT_2, grammarAccess.getExprSwitchCaseAccess().getDEFAULTTerminalRuleCall_1());
                      		
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
    // InternalMyDsl.g:4403:1: entryRuleIfStmt returns [String current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final String entryRuleIfStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmt = null;


        try {
            // InternalMyDsl.g:4403:46: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMyDsl.g:4404:2: iv_ruleIfStmt= ruleIfStmt EOF
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
    // InternalMyDsl.g:4410:1: ruleIfStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IF_0= RULE_IF (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) ) ;
    public final AntlrDatatypeRuleToken ruleIfStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IF_0=null;
        Token kw=null;
        Token this_ELSE_5=null;
        AntlrDatatypeRuleToken this_SimpleStmt_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_Block_4 = null;

        AntlrDatatypeRuleToken this_IfStmt_6 = null;

        AntlrDatatypeRuleToken this_Block_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4416:2: ( (this_IF_0= RULE_IF (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) ) )
            // InternalMyDsl.g:4417:2: (this_IF_0= RULE_IF (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) )
            {
            // InternalMyDsl.g:4417:2: (this_IF_0= RULE_IF (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) ) )
            // InternalMyDsl.g:4418:3: this_IF_0= RULE_IF (this_SimpleStmt_1= ruleSimpleStmt kw= ';' ) this_Expression_3= ruleExpression this_Block_4= ruleBlock (this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) )
            {
            this_IF_0=(Token)match(input,RULE_IF,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IF_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IF_0, grammarAccess.getIfStmtAccess().getIFTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:4425:3: (this_SimpleStmt_1= ruleSimpleStmt kw= ';' )
            // InternalMyDsl.g:4426:4: this_SimpleStmt_1= ruleSimpleStmt kw= ';'
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIfStmtAccess().getSimpleStmtParserRuleCall_1_0());
              			
            }
            pushFollow(FOLLOW_17);
            this_SimpleStmt_1=ruleSimpleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_SimpleStmt_1);
              			
            }
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }
            kw=(Token)match(input,68,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getIfStmtAccess().getSemicolonKeyword_1_1());
              			
            }

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIfStmtAccess().getExpressionParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_15);
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
            pushFollow(FOLLOW_57);
            this_Block_4=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_4);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:4462:3: (this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock ) )
            // InternalMyDsl.g:4463:4: this_ELSE_5= RULE_ELSE (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock )
            {
            this_ELSE_5=(Token)match(input,RULE_ELSE,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(this_ELSE_5);
              			
            }
            if ( state.backtracking==0 ) {

              				newLeafNode(this_ELSE_5, grammarAccess.getIfStmtAccess().getELSETerminalRuleCall_4_0());
              			
            }
            // InternalMyDsl.g:4470:4: (this_IfStmt_6= ruleIfStmt | this_Block_7= ruleBlock )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_IF) ) {
                alt72=1;
            }
            else if ( (LA72_0==67) ) {
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
                    // InternalMyDsl.g:4471:5: this_IfStmt_6= ruleIfStmt
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
                    // InternalMyDsl.g:4482:5: this_Block_7= ruleBlock
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
    // InternalMyDsl.g:4498:1: entryRuleFallthroughStmt returns [String current=null] : iv_ruleFallthroughStmt= ruleFallthroughStmt EOF ;
    public final String entryRuleFallthroughStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFallthroughStmt = null;


        try {
            // InternalMyDsl.g:4498:55: (iv_ruleFallthroughStmt= ruleFallthroughStmt EOF )
            // InternalMyDsl.g:4499:2: iv_ruleFallthroughStmt= ruleFallthroughStmt EOF
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
    // InternalMyDsl.g:4505:1: ruleFallthroughStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FALLTHROUGH_0= RULE_FALLTHROUGH ;
    public final AntlrDatatypeRuleToken ruleFallthroughStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FALLTHROUGH_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4511:2: (this_FALLTHROUGH_0= RULE_FALLTHROUGH )
            // InternalMyDsl.g:4512:2: this_FALLTHROUGH_0= RULE_FALLTHROUGH
            {
            this_FALLTHROUGH_0=(Token)match(input,RULE_FALLTHROUGH,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FALLTHROUGH_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_FALLTHROUGH_0, grammarAccess.getFallthroughStmtAccess().getFALLTHROUGHTerminalRuleCall());
              	
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
    // InternalMyDsl.g:4522:1: entryRuleGotoStmt returns [String current=null] : iv_ruleGotoStmt= ruleGotoStmt EOF ;
    public final String entryRuleGotoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGotoStmt = null;


        try {
            // InternalMyDsl.g:4522:48: (iv_ruleGotoStmt= ruleGotoStmt EOF )
            // InternalMyDsl.g:4523:2: iv_ruleGotoStmt= ruleGotoStmt EOF
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
    // InternalMyDsl.g:4529:1: ruleGotoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGotoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GOTO_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4535:2: ( (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4536:2: (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4536:2: (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel )
            // InternalMyDsl.g:4537:3: this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel
            {
            this_GOTO_0=(Token)match(input,RULE_GOTO,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_GOTO_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GOTO_0, grammarAccess.getGotoStmtAccess().getGOTOTerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:4558:1: entryRuleContinueStmt returns [String current=null] : iv_ruleContinueStmt= ruleContinueStmt EOF ;
    public final String entryRuleContinueStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinueStmt = null;


        try {
            // InternalMyDsl.g:4558:52: (iv_ruleContinueStmt= ruleContinueStmt EOF )
            // InternalMyDsl.g:4559:2: iv_ruleContinueStmt= ruleContinueStmt EOF
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
    // InternalMyDsl.g:4565:1: ruleContinueStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleContinueStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONTINUE_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4571:2: ( (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4572:2: (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4572:2: (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel )
            // InternalMyDsl.g:4573:3: this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel
            {
            this_CONTINUE_0=(Token)match(input,RULE_CONTINUE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CONTINUE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CONTINUE_0, grammarAccess.getContinueStmtAccess().getCONTINUETerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:4594:1: entryRuleBreakStmt returns [String current=null] : iv_ruleBreakStmt= ruleBreakStmt EOF ;
    public final String entryRuleBreakStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStmt = null;


        try {
            // InternalMyDsl.g:4594:49: (iv_ruleBreakStmt= ruleBreakStmt EOF )
            // InternalMyDsl.g:4595:2: iv_ruleBreakStmt= ruleBreakStmt EOF
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
    // InternalMyDsl.g:4601:1: ruleBreakStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleBreakStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BREAK_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4607:2: ( (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4608:2: (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4608:2: (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel )
            // InternalMyDsl.g:4609:3: this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel
            {
            this_BREAK_0=(Token)match(input,RULE_BREAK,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_BREAK_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BREAK_0, grammarAccess.getBreakStmtAccess().getBREAKTerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:4630:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalMyDsl.g:4630:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalMyDsl.g:4631:2: iv_ruleReturnStmt= ruleReturnStmt EOF
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
    // InternalMyDsl.g:4637:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RETURN_0=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4643:2: ( (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList ) )
            // InternalMyDsl.g:4644:2: (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList )
            {
            // InternalMyDsl.g:4644:2: (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList )
            // InternalMyDsl.g:4645:3: this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList
            {
            this_RETURN_0=(Token)match(input,RULE_RETURN,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_RETURN_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_RETURN_0, grammarAccess.getReturnStmtAccess().getRETURNTerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:4666:1: entryRuleGoStmt returns [String current=null] : iv_ruleGoStmt= ruleGoStmt EOF ;
    public final String entryRuleGoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoStmt = null;


        try {
            // InternalMyDsl.g:4666:46: (iv_ruleGoStmt= ruleGoStmt EOF )
            // InternalMyDsl.g:4667:2: iv_ruleGoStmt= ruleGoStmt EOF
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
    // InternalMyDsl.g:4673:1: ruleGoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GO_0= RULE_GO this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GO_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4679:2: ( (this_GO_0= RULE_GO this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:4680:2: (this_GO_0= RULE_GO this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:4680:2: (this_GO_0= RULE_GO this_Label_1= ruleLabel )
            // InternalMyDsl.g:4681:3: this_GO_0= RULE_GO this_Label_1= ruleLabel
            {
            this_GO_0=(Token)match(input,RULE_GO,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_GO_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GO_0, grammarAccess.getGoStmtAccess().getGOTerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:4702:1: entryRuleSimpleStmt returns [String current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final String entryRuleSimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmt = null;


        try {
            // InternalMyDsl.g:4702:50: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalMyDsl.g:4703:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
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
    // InternalMyDsl.g:4709:1: ruleSimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) ) ;
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
            // InternalMyDsl.g:4715:2: ( ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) ) )
            // InternalMyDsl.g:4716:2: ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) )
            {
            // InternalMyDsl.g:4716:2: ( (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_DECIMALS||(LA75_0>=RULE_STRUCT && LA75_0<=RULE_UNARY_OP)||LA75_0==RULE_INT_LIT||LA75_0==61||LA75_0==63||LA75_0==65||LA75_0==70||(LA75_0>=72 && LA75_0<=73)) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_IDENTIFIER) ) {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==RULE_ANY_OTHER||LA75_2==61) ) {
                    alt75=1;
                }
                else if ( (LA75_2==71||LA75_2==77) ) {
                    alt75=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:4717:3: (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha )
                    {
                    // InternalMyDsl.g:4717:3: (this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha )
                    // InternalMyDsl.g:4718:4: this_Expression_0= ruleExpression this_SimpleStmtLinha_1= ruleSimpleStmtLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_47);
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
                    // InternalMyDsl.g:4740:3: ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) )
                    {
                    // InternalMyDsl.g:4740:3: ( (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* ) )
                    // InternalMyDsl.g:4741:4: (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* )
                    {
                    // InternalMyDsl.g:4741:4: (this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )* )
                    // InternalMyDsl.g:4742:5: this_IDENTIFIER_2= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )*
                    {
                    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IDENTIFIER_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_IDENTIFIER_2, grammarAccess.getSimpleStmtAccess().getIDENTIFIERTerminalRuleCall_1_0_0());
                      				
                    }
                    // InternalMyDsl.g:4749:5: (kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==71) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalMyDsl.g:4750:6: kw= ',' this_IDENTIFIER_4= RULE_IDENTIFIER
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getCommaKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    this_IDENTIFIER_4=(Token)match(input,RULE_IDENTIFIER,FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_IDENTIFIER_4);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_IDENTIFIER_4, grammarAccess.getSimpleStmtAccess().getIDENTIFIERTerminalRuleCall_1_0_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }

                    kw=(Token)match(input,77,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getColonEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:4769:4: (this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )* )
                    // InternalMyDsl.g:4770:5: this_Expression_6= ruleExpression (kw= ',' this_Expression_8= ruleExpression )*
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_1_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    this_Expression_6=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:4780:5: (kw= ',' this_Expression_8= ruleExpression )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==71) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalMyDsl.g:4781:6: kw= ',' this_Expression_8= ruleExpression
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getSimpleStmtAccess().getCommaKeyword_1_2_1_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_1_2_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_23);
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
    // $ANTLR end "ruleSimpleStmt"


    // $ANTLR start "entryRuleSimpleStmtLinha"
    // InternalMyDsl.g:4803:1: entryRuleSimpleStmtLinha returns [String current=null] : iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF ;
    public final String entryRuleSimpleStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmtLinha = null;


        try {
            // InternalMyDsl.g:4803:55: (iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF )
            // InternalMyDsl.g:4804:2: iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF
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
    // InternalMyDsl.g:4810:1: ruleSimpleStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) ) ;
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
            // InternalMyDsl.g:4816:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) ) )
            // InternalMyDsl.g:4817:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) )
            {
            // InternalMyDsl.g:4817:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt79=1;
                }
                break;
            case 79:
            case 80:
                {
                alt79=2;
                }
                break;
            case RULE_ADD_OP:
            case RULE_MUL_OP:
            case 71:
                {
                alt79=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalMyDsl.g:4818:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:4818:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:4819:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,73,FOLLOW_30); if (state.failed) return current;
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
                    // InternalMyDsl.g:4836:3: (kw= '++' | kw= '--' )
                    {
                    // InternalMyDsl.g:4836:3: (kw= '++' | kw= '--' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==79) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==80) ) {
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
                            // InternalMyDsl.g:4837:4: kw= '++'
                            {
                            kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getPlusSignPlusSignKeyword_1_0());
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4843:4: kw= '--'
                            {
                            kw=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
                    // InternalMyDsl.g:4850:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) )
                    {
                    // InternalMyDsl.g:4850:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* ) )
                    // InternalMyDsl.g:4851:4: (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* )
                    {
                    // InternalMyDsl.g:4851:4: (kw= ',' this_Expression_5= ruleExpression )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==71) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalMyDsl.g:4852:5: kw= ',' this_Expression_5= ruleExpression
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getCommaKeyword_2_0_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_0_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop77;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getAssign_opParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_30);
                    this_assign_op_6=ruleassign_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_assign_op_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:4878:4: (this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )* )
                    // InternalMyDsl.g:4879:5: this_Expression_7= ruleExpression (kw= ',' this_Expression_9= ruleExpression )*
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_2_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    this_Expression_7=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_7);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:4889:5: (kw= ',' this_Expression_9= ruleExpression )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==71) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalMyDsl.g:4890:6: kw= ',' this_Expression_9= ruleExpression
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getCommaKeyword_2_2_1_0());
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_2_1_1());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop78;
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
    // InternalMyDsl.g:4912:1: entryRuleassign_op returns [String current=null] : iv_ruleassign_op= ruleassign_op EOF ;
    public final String entryRuleassign_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign_op = null;


        try {
            // InternalMyDsl.g:4912:49: (iv_ruleassign_op= ruleassign_op EOF )
            // InternalMyDsl.g:4913:2: iv_ruleassign_op= ruleassign_op EOF
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
    // InternalMyDsl.g:4919:1: ruleassign_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleassign_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADD_OP_0=null;
        Token this_MUL_OP_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4925:2: ( ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' ) )
            // InternalMyDsl.g:4926:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' )
            {
            // InternalMyDsl.g:4926:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '=' )
            // InternalMyDsl.g:4927:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP ) kw= '='
            {
            // InternalMyDsl.g:4927:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ADD_OP) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_MUL_OP) ) {
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
                    // InternalMyDsl.g:4928:4: this_ADD_OP_0= RULE_ADD_OP
                    {
                    this_ADD_OP_0=(Token)match(input,RULE_ADD_OP,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ADD_OP_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ADD_OP_0, grammarAccess.getAssign_opAccess().getADD_OPTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4936:4: this_MUL_OP_1= RULE_MUL_OP
                    {
                    this_MUL_OP_1=(Token)match(input,RULE_MUL_OP,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MUL_OP_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MUL_OP_1, grammarAccess.getAssign_opAccess().getMUL_OPTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:4953:1: entryRuleLabeledStmt returns [String current=null] : iv_ruleLabeledStmt= ruleLabeledStmt EOF ;
    public final String entryRuleLabeledStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabeledStmt = null;


        try {
            // InternalMyDsl.g:4953:51: (iv_ruleLabeledStmt= ruleLabeledStmt EOF )
            // InternalMyDsl.g:4954:2: iv_ruleLabeledStmt= ruleLabeledStmt EOF
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
    // InternalMyDsl.g:4960:1: ruleLabeledStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) ;
    public final AntlrDatatypeRuleToken ruleLabeledStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_0 = null;

        AntlrDatatypeRuleToken this_Statement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4966:2: ( (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) )
            // InternalMyDsl.g:4967:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            {
            // InternalMyDsl.g:4967:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            // InternalMyDsl.g:4968:3: this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeledStmtAccess().getLabelParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_Label_0=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_53); if (state.failed) return current;
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
    // InternalMyDsl.g:4997:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:4997:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:4998:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalMyDsl.g:5004:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5010:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:5011:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:5021:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:5021:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:5022:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:5028:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDecl_1 = null;

        AntlrDatatypeRuleToken this_VarDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5034:2: ( (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) )
            // InternalMyDsl.g:5035:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            {
            // InternalMyDsl.g:5035:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_CONST:
                {
                alt81=1;
                }
                break;
            case RULE_TYPEKEYWORD:
                {
                alt81=2;
                }
                break;
            case RULE_VAR:
                {
                alt81=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalMyDsl.g:5036:3: this_ConstDecl_0= ruleConstDecl
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
                    // InternalMyDsl.g:5047:3: this_TypeDecl_1= ruleTypeDecl
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
                    // InternalMyDsl.g:5058:3: this_VarDecl_2= ruleVarDecl
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
    // InternalMyDsl.g:5072:1: entryRuleTopLevelDecl returns [String current=null] : iv_ruleTopLevelDecl= ruleTopLevelDecl EOF ;
    public final String entryRuleTopLevelDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelDecl = null;


        try {
            // InternalMyDsl.g:5072:52: (iv_ruleTopLevelDecl= ruleTopLevelDecl EOF )
            // InternalMyDsl.g:5073:2: iv_ruleTopLevelDecl= ruleTopLevelDecl EOF
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
    // InternalMyDsl.g:5079:1: ruleTopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;

        AntlrDatatypeRuleToken this_FunctionDecl_1 = null;

        AntlrDatatypeRuleToken this_MethodDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5085:2: ( (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) )
            // InternalMyDsl.g:5086:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            {
            // InternalMyDsl.g:5086:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_TYPEKEYWORD||(LA82_0>=RULE_CONST && LA82_0<=RULE_VAR)) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_FUNC) ) {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==63) ) {
                    alt82=3;
                }
                else if ( (LA82_2==RULE_IDENTIFIER) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalMyDsl.g:5087:3: this_Declaration_0= ruleDeclaration
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
                    // InternalMyDsl.g:5098:3: this_FunctionDecl_1= ruleFunctionDecl
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
                    // InternalMyDsl.g:5109:3: this_MethodDecl_2= ruleMethodDecl
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
    // InternalMyDsl.g:5123:1: entryRuleConstDecl returns [String current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final String entryRuleConstDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstDecl = null;


        try {
            // InternalMyDsl.g:5123:49: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalMyDsl.g:5124:2: iv_ruleConstDecl= ruleConstDecl EOF
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
    // InternalMyDsl.g:5130:1: ruleConstDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleConstDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONST_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ConstSpec_1 = null;

        AntlrDatatypeRuleToken this_ConstSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5136:2: ( (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5137:2: (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5137:2: (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5138:3: this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            {
            this_CONST_0=(Token)match(input,RULE_CONST,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CONST_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CONST_0, grammarAccess.getConstDeclAccess().getCONSTTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:5145:3: (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_IDENTIFIER) ) {
                alt84=1;
            }
            else if ( (LA84_0==63) ) {
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
                    // InternalMyDsl.g:5146:4: this_ConstSpec_1= ruleConstSpec
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
                    // InternalMyDsl.g:5157:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5157:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5158:5: kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5163:5: (this_ConstSpec_3= ruleConstSpec kw= ';' )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==RULE_IDENTIFIER) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalMyDsl.g:5164:6: this_ConstSpec_3= ruleConstSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    this_ConstSpec_3=ruleConstSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ConstSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getConstDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5191:1: entryRuleConstSpec returns [String current=null] : iv_ruleConstSpec= ruleConstSpec EOF ;
    public final String entryRuleConstSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstSpec = null;


        try {
            // InternalMyDsl.g:5191:49: (iv_ruleConstSpec= ruleConstSpec EOF )
            // InternalMyDsl.g:5192:2: iv_ruleConstSpec= ruleConstSpec EOF
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
    // InternalMyDsl.g:5198:1: ruleConstSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) ;
    public final AntlrDatatypeRuleToken ruleConstSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5204:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) )
            // InternalMyDsl.g:5205:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            {
            // InternalMyDsl.g:5205:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            // InternalMyDsl.g:5206:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstSpecAccess().getIdentifierListParserRuleCall_0());
              		
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
            // InternalMyDsl.g:5216:3: ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_IDENTIFIER && LA86_0<=RULE_STRUCT)||(LA86_0>=RULE_FUNC && LA86_0<=RULE_CHAN)||LA86_0==63||LA86_0==65||LA86_0==70||LA86_0==73||LA86_0==78) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:5217:4: (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList
                    {
                    // InternalMyDsl.g:5217:4: (this_Type_1= ruleType )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( ((LA85_0>=RULE_IDENTIFIER && LA85_0<=RULE_STRUCT)||(LA85_0>=RULE_FUNC && LA85_0<=RULE_CHAN)||LA85_0==63||LA85_0==65||LA85_0==70||LA85_0==73) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalMyDsl.g:5218:5: this_Type_1= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConstSpecAccess().getTypeParserRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_59);
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

                    kw=(Token)match(input,78,FOLLOW_30); if (state.failed) return current;
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
    // InternalMyDsl.g:5249:1: entryRuleTypeDecl returns [String current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final String entryRuleTypeDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDecl = null;


        try {
            // InternalMyDsl.g:5249:48: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalMyDsl.g:5250:2: iv_ruleTypeDecl= ruleTypeDecl EOF
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
    // InternalMyDsl.g:5256:1: ruleTypeDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPEKEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpec_1 = null;

        AntlrDatatypeRuleToken this_TypeSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5262:2: ( (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5263:2: (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5263:2: (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5264:3: this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            {
            this_TYPEKEYWORD_0=(Token)match(input,RULE_TYPEKEYWORD,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TYPEKEYWORD_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEKEYWORD_0, grammarAccess.getTypeDeclAccess().getTYPEKEYWORDTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:5271:3: (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_IDENTIFIER) ) {
                alt88=1;
            }
            else if ( (LA88_0==63) ) {
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
                    // InternalMyDsl.g:5272:4: this_TypeSpec_1= ruleTypeSpec
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
                    // InternalMyDsl.g:5283:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5283:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5284:5: kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5289:5: (this_TypeSpec_3= ruleTypeSpec kw= ';' )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==RULE_IDENTIFIER) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalMyDsl.g:5290:6: this_TypeSpec_3= ruleTypeSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    this_TypeSpec_3=ruleTypeSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_TypeSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5317:1: entryRuleTypeSpec returns [String current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final String entryRuleTypeSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpec = null;


        try {
            // InternalMyDsl.g:5317:48: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalMyDsl.g:5318:2: iv_ruleTypeSpec= ruleTypeSpec EOF
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
    // InternalMyDsl.g:5324:1: ruleTypeSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AliasDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDef_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5330:2: ( (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) )
            // InternalMyDsl.g:5331:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            {
            // InternalMyDsl.g:5331:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_IDENTIFIER) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==78) ) {
                    alt89=1;
                }
                else if ( ((LA89_1>=RULE_IDENTIFIER && LA89_1<=RULE_STRUCT)||(LA89_1>=RULE_FUNC && LA89_1<=RULE_CHAN)||LA89_1==63||LA89_1==65||LA89_1==70||LA89_1==73) ) {
                    alt89=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalMyDsl.g:5332:3: this_AliasDecl_0= ruleAliasDecl
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
                    // InternalMyDsl.g:5343:3: this_TypeDef_1= ruleTypeDef
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
    // InternalMyDsl.g:5357:1: entryRuleAliasDecl returns [String current=null] : iv_ruleAliasDecl= ruleAliasDecl EOF ;
    public final String entryRuleAliasDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDecl = null;


        try {
            // InternalMyDsl.g:5357:49: (iv_ruleAliasDecl= ruleAliasDecl EOF )
            // InternalMyDsl.g:5358:2: iv_ruleAliasDecl= ruleAliasDecl EOF
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
    // InternalMyDsl.g:5364:1: ruleAliasDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleAliasDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5370:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) )
            // InternalMyDsl.g:5371:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            {
            // InternalMyDsl.g:5371:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            // InternalMyDsl.g:5372:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getAliasDeclAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,78,FOLLOW_9); if (state.failed) return current;
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
    // InternalMyDsl.g:5398:1: entryRuleTypeDef returns [String current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final String entryRuleTypeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDef = null;


        try {
            // InternalMyDsl.g:5398:47: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyDsl.g:5399:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalMyDsl.g:5405:1: ruleTypeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleTypeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5411:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) )
            // InternalMyDsl.g:5412:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            {
            // InternalMyDsl.g:5412:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            // InternalMyDsl.g:5413:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_9); if (state.failed) return current;
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
    // InternalMyDsl.g:5434:1: entryRuleVarDecl returns [String current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final String entryRuleVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarDecl = null;


        try {
            // InternalMyDsl.g:5434:47: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMyDsl.g:5435:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalMyDsl.g:5441:1: ruleVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_VarSpec_1 = null;

        AntlrDatatypeRuleToken this_VarSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5447:2: ( (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:5448:2: (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:5448:2: (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:5449:3: this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_VAR_0, grammarAccess.getVarDeclAccess().getVARTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:5456:3: (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_IDENTIFIER) ) {
                alt91=1;
            }
            else if ( (LA91_0==63) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalMyDsl.g:5457:4: this_VarSpec_1= ruleVarSpec
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
                    // InternalMyDsl.g:5468:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:5468:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:5469:5: kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:5474:5: (this_VarSpec_3= ruleVarSpec kw= ';' )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==RULE_IDENTIFIER) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalMyDsl.g:5475:6: this_VarSpec_3= ruleVarSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    this_VarSpec_3=ruleVarSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_VarSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_60); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getVarDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5502:1: entryRuleVarSpec returns [String current=null] : iv_ruleVarSpec= ruleVarSpec EOF ;
    public final String entryRuleVarSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarSpec = null;


        try {
            // InternalMyDsl.g:5502:47: (iv_ruleVarSpec= ruleVarSpec EOF )
            // InternalMyDsl.g:5503:2: iv_ruleVarSpec= ruleVarSpec EOF
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
    // InternalMyDsl.g:5509:1: ruleVarSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;

        AntlrDatatypeRuleToken this_ExpressionList_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5515:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) )
            // InternalMyDsl.g:5516:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            {
            // InternalMyDsl.g:5516:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            // InternalMyDsl.g:5517:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_62);
            this_IdentifierList_0=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdentifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5527:3: ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=RULE_IDENTIFIER && LA93_0<=RULE_STRUCT)||(LA93_0>=RULE_FUNC && LA93_0<=RULE_CHAN)||LA93_0==63||LA93_0==65||LA93_0==70||LA93_0==73) ) {
                alt93=1;
            }
            else if ( (LA93_0==78) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalMyDsl.g:5528:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    {
                    // InternalMyDsl.g:5528:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    // InternalMyDsl.g:5529:5: this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getTypeParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_63);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:5539:5: (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==78) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalMyDsl.g:5540:6: kw= '=' this_ExpressionList_3= ruleExpressionList
                            {
                            kw=(Token)match(input,78,FOLLOW_30); if (state.failed) return current;
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
                    // InternalMyDsl.g:5558:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    {
                    // InternalMyDsl.g:5558:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    // InternalMyDsl.g:5559:5: kw= '=' this_ExpressionList_5= ruleExpressionList
                    {
                    kw=(Token)match(input,78,FOLLOW_30); if (state.failed) return current;
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
    // InternalMyDsl.g:5580:1: entryRuleFunctionDecl returns [String current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final String entryRuleFunctionDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:5580:52: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:5581:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalMyDsl.g:5587:1: ruleFunctionDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_FunctionName_1 = null;

        AntlrDatatypeRuleToken this_Signature_2 = null;

        AntlrDatatypeRuleToken this_FunctionBody_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5593:2: ( (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) )
            // InternalMyDsl.g:5594:2: (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:5594:2: (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            // InternalMyDsl.g:5595:3: this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )?
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FUNC_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FUNC_0, grammarAccess.getFunctionDeclAccess().getFUNCTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_19);
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
            pushFollow(FOLLOW_64);
            this_Signature_2=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5622:3: (this_FunctionBody_3= ruleFunctionBody )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==67) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMyDsl.g:5623:4: this_FunctionBody_3= ruleFunctionBody
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
    // InternalMyDsl.g:5638:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:5638:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:5639:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMyDsl.g:5645:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5651:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:5652:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:5662:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // InternalMyDsl.g:5662:52: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalMyDsl.g:5663:2: iv_ruleFunctionBody= ruleFunctionBody EOF
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
    // InternalMyDsl.g:5669:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Block_0= ruleBlock ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Block_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5675:2: (this_Block_0= ruleBlock )
            // InternalMyDsl.g:5676:2: this_Block_0= ruleBlock
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
    // InternalMyDsl.g:5689:1: entryRuleMethodDecl returns [String current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final String entryRuleMethodDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodDecl = null;


        try {
            // InternalMyDsl.g:5689:50: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalMyDsl.g:5690:2: iv_ruleMethodDecl= ruleMethodDecl EOF
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
    // InternalMyDsl.g:5696:1: ruleMethodDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_Receiver_1 = null;

        AntlrDatatypeRuleToken this_MethodName_2 = null;

        AntlrDatatypeRuleToken this_Signature_3 = null;

        AntlrDatatypeRuleToken this_FunctionBody_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5702:2: ( (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) )
            // InternalMyDsl.g:5703:2: (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:5703:2: (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            // InternalMyDsl.g:5704:3: this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )?
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FUNC_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FUNC_0, grammarAccess.getMethodDeclAccess().getFUNCTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getReceiverParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_12);
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
            pushFollow(FOLLOW_19);
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
            pushFollow(FOLLOW_64);
            this_Signature_3=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5741:3: (this_FunctionBody_4= ruleFunctionBody )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==67) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalMyDsl.g:5742:4: this_FunctionBody_4= ruleFunctionBody
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
    // InternalMyDsl.g:5757:1: entryRuleReceiver returns [String current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final String entryRuleReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiver = null;


        try {
            // InternalMyDsl.g:5757:48: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalMyDsl.g:5758:2: iv_ruleReceiver= ruleReceiver EOF
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
    // InternalMyDsl.g:5764:1: ruleReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Parameters_0= ruleParameters ;
    public final AntlrDatatypeRuleToken ruleReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5770:2: (this_Parameters_0= ruleParameters )
            // InternalMyDsl.g:5771:2: this_Parameters_0= ruleParameters
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
    // InternalMyDsl.g:5784:1: entryRuleBasicLit returns [String current=null] : iv_ruleBasicLit= ruleBasicLit EOF ;
    public final String entryRuleBasicLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicLit = null;


        try {
            // InternalMyDsl.g:5784:48: (iv_ruleBasicLit= ruleBasicLit EOF )
            // InternalMyDsl.g:5785:2: iv_ruleBasicLit= ruleBasicLit EOF
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
    // InternalMyDsl.g:5791:1: ruleBasicLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_LIT_0= RULE_INT_LIT | this_STRING_LIT_1= RULE_STRING_LIT | this_FLOAT_LIT_2= ruleFLOAT_LIT | this_IMAGINARY_LIT_3= ruleIMAGINARY_LIT ) ;
    public final AntlrDatatypeRuleToken ruleBasicLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_LIT_0=null;
        Token this_STRING_LIT_1=null;
        AntlrDatatypeRuleToken this_FLOAT_LIT_2 = null;

        AntlrDatatypeRuleToken this_IMAGINARY_LIT_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5797:2: ( (this_INT_LIT_0= RULE_INT_LIT | this_STRING_LIT_1= RULE_STRING_LIT | this_FLOAT_LIT_2= ruleFLOAT_LIT | this_IMAGINARY_LIT_3= ruleIMAGINARY_LIT ) )
            // InternalMyDsl.g:5798:2: (this_INT_LIT_0= RULE_INT_LIT | this_STRING_LIT_1= RULE_STRING_LIT | this_FLOAT_LIT_2= ruleFLOAT_LIT | this_IMAGINARY_LIT_3= ruleIMAGINARY_LIT )
            {
            // InternalMyDsl.g:5798:2: (this_INT_LIT_0= RULE_INT_LIT | this_STRING_LIT_1= RULE_STRING_LIT | this_FLOAT_LIT_2= ruleFLOAT_LIT | this_IMAGINARY_LIT_3= ruleIMAGINARY_LIT )
            int alt96=4;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // InternalMyDsl.g:5799:3: this_INT_LIT_0= RULE_INT_LIT
                    {
                    this_INT_LIT_0=(Token)match(input,RULE_INT_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_LIT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_LIT_0, grammarAccess.getBasicLitAccess().getINT_LITTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5807:3: this_STRING_LIT_1= RULE_STRING_LIT
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
                    // InternalMyDsl.g:5815:3: this_FLOAT_LIT_2= ruleFLOAT_LIT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getFLOAT_LITParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FLOAT_LIT_2=ruleFLOAT_LIT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FLOAT_LIT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:5826:3: this_IMAGINARY_LIT_3= ruleIMAGINARY_LIT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getIMAGINARY_LITParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IMAGINARY_LIT_3=ruleIMAGINARY_LIT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IMAGINARY_LIT_3);
                      		
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
    // InternalMyDsl.g:5840:1: entryRuleLiteralValue returns [String current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final String entryRuleLiteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralValue = null;


        try {
            // InternalMyDsl.g:5840:52: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalMyDsl.g:5841:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalMyDsl.g:5847:1: ruleLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ElementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5853:2: ( (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) )
            // InternalMyDsl.g:5854:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            {
            // InternalMyDsl.g:5854:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            // InternalMyDsl.g:5855:3: kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,67,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyDsl.g:5860:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?
            int alt98=2;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // InternalMyDsl.g:5861:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )?
                    {
                    // InternalMyDsl.g:5861:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList )
                    // InternalMyDsl.g:5862:5: ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralValueAccess().getElementListParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_66);
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

                    // InternalMyDsl.g:5878:4: (kw= ',' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==71) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalMyDsl.g:5879:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_25); if (state.failed) return current;
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

            kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:5895:1: entryRuleElementList returns [String current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final String entryRuleElementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementList = null;


        try {
            // InternalMyDsl.g:5895:51: (iv_ruleElementList= ruleElementList EOF )
            // InternalMyDsl.g:5896:2: iv_ruleElementList= ruleElementList EOF
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
    // InternalMyDsl.g:5902:1: ruleElementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) ;
    public final AntlrDatatypeRuleToken ruleElementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_KeyedElement_0 = null;

        AntlrDatatypeRuleToken this_KeyedElement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5908:2: ( ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) )
            // InternalMyDsl.g:5909:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            {
            // InternalMyDsl.g:5909:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            // InternalMyDsl.g:5910:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            {
            // InternalMyDsl.g:5910:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement )
            // InternalMyDsl.g:5911:4: ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:5927:3: (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==71) ) {
                    int LA99_1 = input.LA(2);

                    if ( (LA99_1==RULE_DECIMALS||(LA99_1>=RULE_IDENTIFIER && LA99_1<=RULE_UNARY_OP)||LA99_1==RULE_INT_LIT||LA99_1==61||LA99_1==63||LA99_1==65||LA99_1==67||LA99_1==70||(LA99_1>=72 && LA99_1<=73)) ) {
                        alt99=1;
                    }


                }


                switch (alt99) {
            	case 1 :
            	    // InternalMyDsl.g:5928:4: kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    {
            	    kw=(Token)match(input,71,FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:5933:4: ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    // InternalMyDsl.g:5934:5: ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_1_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5955:1: entryRuleKeyedElement returns [String current=null] : iv_ruleKeyedElement= ruleKeyedElement EOF ;
    public final String entryRuleKeyedElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyedElement = null;


        try {
            // InternalMyDsl.g:5955:52: (iv_ruleKeyedElement= ruleKeyedElement EOF )
            // InternalMyDsl.g:5956:2: iv_ruleKeyedElement= ruleKeyedElement EOF
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
    // InternalMyDsl.g:5962:1: ruleKeyedElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) ;
    public final AntlrDatatypeRuleToken ruleKeyedElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_Element_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5968:2: ( ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) )
            // InternalMyDsl.g:5969:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            {
            // InternalMyDsl.g:5969:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            // InternalMyDsl.g:5970:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement
            {
            // InternalMyDsl.g:5970:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalMyDsl.g:5971:4: ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' )
                    {
                    // InternalMyDsl.g:5976:4: (this_Key_0= ruleKey kw= ':' )
                    // InternalMyDsl.g:5977:5: this_Key_0= ruleKey kw= ':'
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKeyedElementAccess().getKeyParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_37);
                    this_Key_0=ruleKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Key_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,76,FOLLOW_42); if (state.failed) return current;
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
    // InternalMyDsl.g:6008:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalMyDsl.g:6008:43: (iv_ruleKey= ruleKey EOF )
            // InternalMyDsl.g:6009:2: iv_ruleKey= ruleKey EOF
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
    // InternalMyDsl.g:6015:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FieldName_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_LiteralValue_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6021:2: ( (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) )
            // InternalMyDsl.g:6022:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            {
            // InternalMyDsl.g:6022:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            int alt101=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==RULE_ANY_OTHER||LA101_1==61) ) {
                    alt101=2;
                }
                else if ( (LA101_1==EOF||LA101_1==76) ) {
                    alt101=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DECIMALS:
            case RULE_STRUCT:
            case RULE_STRING_LIT:
            case RULE_FUNC:
            case RULE_INTERFACE:
            case RULE_MAP:
            case RULE_CHAN:
            case RULE_UNARY_OP:
            case RULE_INT_LIT:
            case 61:
            case 63:
            case 65:
            case 70:
            case 72:
            case 73:
                {
                alt101=2;
                }
                break;
            case 67:
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
                    // InternalMyDsl.g:6023:3: this_FieldName_0= ruleFieldName
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
                    // InternalMyDsl.g:6034:3: this_Expression_1= ruleExpression
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
                    // InternalMyDsl.g:6045:3: this_LiteralValue_2= ruleLiteralValue
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
    // InternalMyDsl.g:6059:1: entryRuleFieldName returns [String current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final String entryRuleFieldName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldName = null;


        try {
            // InternalMyDsl.g:6059:49: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalMyDsl.g:6060:2: iv_ruleFieldName= ruleFieldName EOF
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
    // InternalMyDsl.g:6066:1: ruleFieldName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFieldName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6072:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:6073:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:6083:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalMyDsl.g:6083:47: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:6084:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:6090:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6096:2: ( (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) )
            // InternalMyDsl.g:6097:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalMyDsl.g:6097:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_DECIMALS||(LA102_0>=RULE_IDENTIFIER && LA102_0<=RULE_UNARY_OP)||LA102_0==RULE_INT_LIT||LA102_0==61||LA102_0==63||LA102_0==65||LA102_0==70||(LA102_0>=72 && LA102_0<=73)) ) {
                alt102=1;
            }
            else if ( (LA102_0==67) ) {
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
                    // InternalMyDsl.g:6098:3: this_Expression_0= ruleExpression
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
                    // InternalMyDsl.g:6109:3: this_LiteralValue_1= ruleLiteralValue
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
    // InternalMyDsl.g:6123:1: entryRuleSourceFile returns [String current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final String entryRuleSourceFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSourceFile = null;


        try {
            // InternalMyDsl.g:6123:50: (iv_ruleSourceFile= ruleSourceFile EOF )
            // InternalMyDsl.g:6124:2: iv_ruleSourceFile= ruleSourceFile EOF
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
    // InternalMyDsl.g:6130:1: ruleSourceFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruleSourceFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageClause_0 = null;

        AntlrDatatypeRuleToken this_ImportDecl_2 = null;

        AntlrDatatypeRuleToken this_TopLevelDecl_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6136:2: ( (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) )
            // InternalMyDsl.g:6137:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            {
            // InternalMyDsl.g:6137:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            // InternalMyDsl.g:6138:3: this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSourceFileAccess().getPackageClauseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_PackageClause_0=rulePackageClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PackageClause_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,68,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1());
              		
            }
            // InternalMyDsl.g:6153:3: (this_ImportDecl_2= ruleImportDecl kw= ';' )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==RULE_IMPORT) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalMyDsl.g:6154:4: this_ImportDecl_2= ruleImportDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    this_ImportDecl_2=ruleImportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ImportDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_67); if (state.failed) return current;
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

            // InternalMyDsl.g:6170:3: (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==RULE_FUNC||LA104_0==RULE_TYPEKEYWORD||(LA104_0>=RULE_CONST && LA104_0<=RULE_VAR)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalMyDsl.g:6171:4: this_TopLevelDecl_4= ruleTopLevelDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getTopLevelDeclParserRuleCall_3_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_17);
            	    this_TopLevelDecl_4=ruleTopLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TopLevelDecl_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_68); if (state.failed) return current;
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
    // InternalMyDsl.g:6191:1: entryRulePackageClause returns [String current=null] : iv_rulePackageClause= rulePackageClause EOF ;
    public final String entryRulePackageClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageClause = null;


        try {
            // InternalMyDsl.g:6191:53: (iv_rulePackageClause= rulePackageClause EOF )
            // InternalMyDsl.g:6192:2: iv_rulePackageClause= rulePackageClause EOF
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
    // InternalMyDsl.g:6198:1: rulePackageClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName ) ;
    public final AntlrDatatypeRuleToken rulePackageClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKAGE_0=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6204:2: ( (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName ) )
            // InternalMyDsl.g:6205:2: (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName )
            {
            // InternalMyDsl.g:6205:2: (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName )
            // InternalMyDsl.g:6206:3: this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName
            {
            this_PACKAGE_0=(Token)match(input,RULE_PACKAGE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PACKAGE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PACKAGE_0, grammarAccess.getPackageClauseAccess().getPACKAGETerminalRuleCall_0());
              		
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
    // InternalMyDsl.g:6227:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalMyDsl.g:6227:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalMyDsl.g:6228:2: iv_ruleImportDecl= ruleImportDecl EOF
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
    // InternalMyDsl.g:6234:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IMPORT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6240:2: ( (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:6241:2: (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:6241:2: (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:6242:3: this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            {
            this_IMPORT_0=(Token)match(input,RULE_IMPORT,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IMPORT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IMPORT_0, grammarAccess.getImportDeclAccess().getIMPORTTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:6249:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_IDENTIFIER||LA106_0==RULE_STRING_LIT||LA106_0==61) ) {
                alt106=1;
            }
            else if ( (LA106_0==63) ) {
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
                    // InternalMyDsl.g:6250:4: this_ImportSpec_1= ruleImportSpec
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
                    // InternalMyDsl.g:6261:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:6261:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:6262:5: kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:6267:5: (this_ImportSpec_3= ruleImportSpec kw= ';' )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==RULE_IDENTIFIER||LA105_0==RULE_STRING_LIT||LA105_0==61) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalMyDsl.g:6268:6: this_ImportSpec_3= ruleImportSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    this_ImportSpec_3=ruleImportSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ImportSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_70); if (state.failed) return current;
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

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:6295:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalMyDsl.g:6295:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalMyDsl.g:6296:2: iv_ruleImportSpec= ruleImportSpec EOF
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
    // InternalMyDsl.g:6302:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;

        AntlrDatatypeRuleToken this_ImportPath_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6308:2: ( ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) )
            // InternalMyDsl.g:6309:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            {
            // InternalMyDsl.g:6309:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            // InternalMyDsl.g:6310:3: (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath
            {
            // InternalMyDsl.g:6310:3: (kw= '.' | this_PackageName_1= rulePackageName )?
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==61) ) {
                alt107=1;
            }
            else if ( (LA107_0==RULE_IDENTIFIER) ) {
                alt107=2;
            }
            switch (alt107) {
                case 1 :
                    // InternalMyDsl.g:6311:4: kw= '.'
                    {
                    kw=(Token)match(input,61,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6317:4: this_PackageName_1= rulePackageName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImportSpecAccess().getPackageNameParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_71);
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
    // InternalMyDsl.g:6342:1: entryRuleImportPath returns [String current=null] : iv_ruleImportPath= ruleImportPath EOF ;
    public final String entryRuleImportPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportPath = null;


        try {
            // InternalMyDsl.g:6342:50: (iv_ruleImportPath= ruleImportPath EOF )
            // InternalMyDsl.g:6343:2: iv_ruleImportPath= ruleImportPath EOF
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
    // InternalMyDsl.g:6349:1: ruleImportPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleImportPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6355:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:6356:2: this_STRING_LIT_0= RULE_STRING_LIT
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
        // InternalMyDsl.g:1076:4: ( ruleResult )
        // InternalMyDsl.g:1076:5: ruleResult
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
        // InternalMyDsl.g:1108:4: ( ruleParameters )
        // InternalMyDsl.g:1108:5: ruleParameters
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
        // InternalMyDsl.g:2444:5: ( ruleExpression )
        // InternalMyDsl.g:2444:6: ruleExpression
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
        // InternalMyDsl.g:2906:6: ( ruleExpressionList )
        // InternalMyDsl.g:2906:7: ruleExpressionList
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
        // InternalMyDsl.g:5862:5: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:5862:6: ( ruleKey ':' )
        {
        // InternalMyDsl.g:5862:6: ( ruleKey ':' )
        // InternalMyDsl.g:5863:6: ruleKey ':'
        {
        pushFollow(FOLLOW_37);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,76,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:5971:4: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:5971:5: ( ruleKey ':' )
        {
        // InternalMyDsl.g:5971:5: ( ruleKey ':' )
        // InternalMyDsl.g:5972:5: ruleKey ':'
        {
        pushFollow(FOLLOW_37);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,76,FOLLOW_2); if (state.failed) return ;

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


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA98 dfa98 = new DFA98(this);
    protected DFA100 dfa100 = new DFA100(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\13\25\uffff";
    static final String dfa_3s = "\1\7\1\0\24\uffff";
    static final String dfa_4s = "\1\116\1\0\24\uffff";
    static final String dfa_5s = "\2\uffff\11\1\1\2\12\uffff";
    static final String dfa_6s = "\1\0\1\1\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\4\1\13\1\6\1\7\1\10\1\11\57\uffff\1\13\1\uffff\1\1\1\13\1\3\3\13\1\uffff\1\5\2\13\1\12\2\uffff\1\13\1\uffff\1\13",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1075:3: ( ( ruleResult )=>this_Result_1= ruleResult )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0==63) ) {s = 1;}

                        else if ( (LA15_0==RULE_IDENTIFIER) && (synpred1_InternalMyDsl())) {s = 2;}

                        else if ( (LA15_0==65) && (synpred1_InternalMyDsl())) {s = 3;}

                        else if ( (LA15_0==RULE_STRUCT) && (synpred1_InternalMyDsl())) {s = 4;}

                        else if ( (LA15_0==70) && (synpred1_InternalMyDsl())) {s = 5;}

                        else if ( (LA15_0==RULE_FUNC) && (synpred1_InternalMyDsl())) {s = 6;}

                        else if ( (LA15_0==RULE_INTERFACE) && (synpred1_InternalMyDsl())) {s = 7;}

                        else if ( (LA15_0==RULE_MAP) && (synpred1_InternalMyDsl())) {s = 8;}

                        else if ( (LA15_0==RULE_CHAN) && (synpred1_InternalMyDsl())) {s = 9;}

                        else if ( (LA15_0==73) && (synpred1_InternalMyDsl())) {s = 10;}

                        else if ( (LA15_0==EOF||LA15_0==RULE_STRING_LIT||LA15_0==61||LA15_0==64||(LA15_0>=66 && LA15_0<=68)||(LA15_0>=71 && LA15_0<=72)||LA15_0==76||LA15_0==78) ) {s = 11;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMyDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\7\1\0\12\uffff";
    static final String dfa_10s = "\1\111\1\0\12\uffff";
    static final String dfa_11s = "\2\uffff\1\2\10\uffff\1\1";
    static final String dfa_12s = "\1\uffff\1\0\12\uffff}>";
    static final String[] dfa_13s = {
            "\2\2\1\uffff\4\2\61\uffff\1\1\1\uffff\1\2\4\uffff\1\2\2\uffff\1\2",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1106:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMyDsl()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\22\uffff";
    static final String dfa_15s = "\1\4\4\uffff\3\0\1\uffff\7\0\2\uffff";
    static final String dfa_16s = "\1\111\4\uffff\3\0\1\uffff\7\0\2\uffff";
    static final String dfa_17s = "\1\uffff\4\1\3\uffff\1\1\7\uffff\1\1\1\2";
    static final String dfa_18s = "\1\0\4\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_19s = {
            "\1\3\2\uffff\1\11\1\5\1\2\1\7\1\15\1\6\1\16\1\20\25\uffff\1\1\30\uffff\1\4\1\uffff\1\12\1\uffff\1\13\4\uffff\1\14\1\uffff\1\10\1\17",
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

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2441:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExprFat_4= rulePrimaryExprFat ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==RULE_INT_LIT) && (synpred3_InternalMyDsl())) {s = 1;}

                        else if ( (LA34_0==RULE_STRING_LIT) && (synpred3_InternalMyDsl())) {s = 2;}

                        else if ( (LA34_0==RULE_DECIMALS) && (synpred3_InternalMyDsl())) {s = 3;}

                        else if ( (LA34_0==61) && (synpred3_InternalMyDsl())) {s = 4;}

                        else if ( (LA34_0==RULE_STRUCT) ) {s = 5;}

                        else if ( (LA34_0==RULE_MAP) ) {s = 6;}

                        else if ( (LA34_0==RULE_FUNC) ) {s = 7;}

                        else if ( (LA34_0==72) && (synpred3_InternalMyDsl())) {s = 8;}

                        else if ( (LA34_0==RULE_IDENTIFIER) ) {s = 9;}

                        else if ( (LA34_0==63) ) {s = 10;}

                        else if ( (LA34_0==65) ) {s = 11;}

                        else if ( (LA34_0==70) ) {s = 12;}

                        else if ( (LA34_0==RULE_INTERFACE) ) {s = 13;}

                        else if ( (LA34_0==RULE_CHAN) ) {s = 14;}

                        else if ( (LA34_0==73) ) {s = 15;}

                        else if ( (LA34_0==RULE_UNARY_OP) && (synpred3_InternalMyDsl())) {s = 16;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_10 = input.LA(1);

                         
                        int index34_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_11 = input.LA(1);

                         
                        int index34_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_12 = input.LA(1);

                         
                        int index34_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_13 = input.LA(1);

                         
                        int index34_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA34_14 = input.LA(1);

                         
                        int index34_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA34_15 = input.LA(1);

                         
                        int index34_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index34_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2904:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==RULE_INT_LIT) && (synpred4_InternalMyDsl())) {s = 1;}

                        else if ( (LA44_0==RULE_STRING_LIT) && (synpred4_InternalMyDsl())) {s = 2;}

                        else if ( (LA44_0==RULE_DECIMALS) && (synpred4_InternalMyDsl())) {s = 3;}

                        else if ( (LA44_0==61) && (synpred4_InternalMyDsl())) {s = 4;}

                        else if ( (LA44_0==RULE_STRUCT) ) {s = 5;}

                        else if ( (LA44_0==RULE_MAP) ) {s = 6;}

                        else if ( (LA44_0==RULE_FUNC) ) {s = 7;}

                        else if ( (LA44_0==72) && (synpred4_InternalMyDsl())) {s = 8;}

                        else if ( (LA44_0==RULE_IDENTIFIER) ) {s = 9;}

                        else if ( (LA44_0==63) ) {s = 10;}

                        else if ( (LA44_0==65) ) {s = 11;}

                        else if ( (LA44_0==70) ) {s = 12;}

                        else if ( (LA44_0==RULE_INTERFACE) ) {s = 13;}

                        else if ( (LA44_0==RULE_CHAN) ) {s = 14;}

                        else if ( (LA44_0==73) ) {s = 15;}

                        else if ( (LA44_0==RULE_UNARY_OP) && (synpred4_InternalMyDsl())) {s = 16;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMyDsl()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\21\uffff";
    static final String dfa_21s = "\1\4\1\uffff\1\6\16\uffff";
    static final String dfa_22s = "\1\111\1\uffff\1\115\16\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\2";
    static final String dfa_24s = "\21\uffff}>";
    static final String[] dfa_25s = {
            "\1\3\2\uffff\1\2\7\3\3\uffff\1\17\1\16\1\uffff\1\15\2\uffff\1\14\1\1\1\13\1\uffff\1\11\1\10\1\7\1\6\1\5\1\4\2\1\1\3\30\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\12\2\uffff\1\3\1\uffff\2\3",
            "",
            "\1\3\66\uffff\1\3\11\uffff\1\3\4\uffff\1\20\1\3",
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

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3146:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )";
        }
    }
    static final String dfa_26s = "\11\uffff";
    static final String dfa_27s = "\1\4\1\uffff\1\6\1\uffff\1\7\1\4\1\107\2\uffff";
    static final String dfa_28s = "\1\116\1\uffff\1\115\1\uffff\1\7\1\111\1\115\2\uffff";
    static final String dfa_29s = "\1\uffff\1\1\1\uffff\1\3\3\uffff\1\2\1\4";
    static final String dfa_30s = "\11\uffff}>";
    static final String[] dfa_31s = {
            "\1\1\2\uffff\1\2\7\1\25\uffff\1\1\30\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\1\1\1\3\2\1\4\uffff\1\3",
            "",
            "\1\1\66\uffff\1\1\11\uffff\1\4\5\uffff\1\5",
            "",
            "\1\6",
            "\1\7\2\uffff\10\7\5\uffff\1\10\17\uffff\1\7\30\uffff\1\7\1\uffff\1\7\1\uffff\1\7\4\uffff\1\7\1\uffff\2\7",
            "\1\4\5\uffff\1\5",
            "",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3517:4: ( (this_Expression_11= ruleExpression this_SimpleStmtLinha_12= ruleSimpleStmtLinha ) | ( (this_IDENTIFIER_13= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_15= RULE_IDENTIFIER )* ) kw= ':=' (this_Expression_17= ruleExpression (kw= ',' this_Expression_19= ruleExpression )* ) ) | ( (kw= ',' this_Expression_21= ruleExpression )* kw= '=' ) | (this_IdentifierList_23= ruleIdentifierList kw= ':=' ) )";
        }
    }
    static final String dfa_32s = "\7\uffff\2\15\2\uffff\2\15\1\uffff\3\15";
    static final String dfa_33s = "\1\4\2\uffff\1\5\1\4\1\uffff\1\4\2\75\2\5\2\75\1\uffff\3\75";
    static final String dfa_34s = "\1\75\2\uffff\1\76\1\4\1\uffff\1\6\2\101\1\5\1\6\2\101\1\uffff\3\101";
    static final String dfa_35s = "\1\uffff\1\1\1\2\2\uffff\1\4\7\uffff\1\3\3\uffff";
    static final String[] dfa_36s = {
            "\1\3\4\uffff\1\2\32\uffff\1\1\30\uffff\1\4",
            "",
            "",
            "\1\7\1\10\66\uffff\1\6\1\5",
            "\1\11",
            "",
            "\1\12\1\13\1\14",
            "\1\15\1\5\1\15\1\uffff\1\15",
            "\1\15\1\5\1\15\1\uffff\1\15",
            "\1\16",
            "\1\17\1\20",
            "\1\15\1\5\1\15\1\uffff\1\15",
            "\1\15\1\5\1\15\1\uffff\1\15",
            "",
            "\1\15\1\5\1\15\1\uffff\1\15",
            "\1\15\1\5\1\15\1\uffff\1\15",
            "\1\15\1\5\1\15\1\uffff\1\15"
    };
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_20;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_24;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "5798:2: (this_INT_LIT_0= RULE_INT_LIT | this_STRING_LIT_1= RULE_STRING_LIT | this_FLOAT_LIT_2= ruleFLOAT_LIT | this_IMAGINARY_LIT_3= ruleIMAGINARY_LIT )";
        }
    }
    static final String dfa_37s = "\23\uffff";
    static final String dfa_38s = "\1\4\22\uffff";
    static final String dfa_39s = "\1\111\22\uffff";
    static final String dfa_40s = "\1\uffff\21\1\1\2";
    static final String dfa_41s = "\1\0\22\uffff}>";
    static final String[] dfa_42s = {
            "\1\4\2\uffff\1\1\1\6\1\3\1\10\1\15\1\7\1\16\1\20\25\uffff\1\2\30\uffff\1\5\1\uffff\1\12\1\uffff\1\13\1\uffff\1\21\1\uffff\1\22\1\14\1\uffff\1\11\1\17",
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

    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = dfa_37;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "5860:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?";
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
                        if ( (LA98_0==RULE_IDENTIFIER) && (synpred5_InternalMyDsl())) {s = 1;}

                        else if ( (LA98_0==RULE_INT_LIT) && (synpred5_InternalMyDsl())) {s = 2;}

                        else if ( (LA98_0==RULE_STRING_LIT) && (synpred5_InternalMyDsl())) {s = 3;}

                        else if ( (LA98_0==RULE_DECIMALS) && (synpred5_InternalMyDsl())) {s = 4;}

                        else if ( (LA98_0==61) && (synpred5_InternalMyDsl())) {s = 5;}

                        else if ( (LA98_0==RULE_STRUCT) && (synpred5_InternalMyDsl())) {s = 6;}

                        else if ( (LA98_0==RULE_MAP) && (synpred5_InternalMyDsl())) {s = 7;}

                        else if ( (LA98_0==RULE_FUNC) && (synpred5_InternalMyDsl())) {s = 8;}

                        else if ( (LA98_0==72) && (synpred5_InternalMyDsl())) {s = 9;}

                        else if ( (LA98_0==63) && (synpred5_InternalMyDsl())) {s = 10;}

                        else if ( (LA98_0==65) && (synpred5_InternalMyDsl())) {s = 11;}

                        else if ( (LA98_0==70) && (synpred5_InternalMyDsl())) {s = 12;}

                        else if ( (LA98_0==RULE_INTERFACE) && (synpred5_InternalMyDsl())) {s = 13;}

                        else if ( (LA98_0==RULE_CHAN) && (synpred5_InternalMyDsl())) {s = 14;}

                        else if ( (LA98_0==73) && (synpred5_InternalMyDsl())) {s = 15;}

                        else if ( (LA98_0==RULE_UNARY_OP) && (synpred5_InternalMyDsl())) {s = 16;}

                        else if ( (LA98_0==67) && (synpred5_InternalMyDsl())) {s = 17;}

                        else if ( (LA98_0==69) ) {s = 18;}

                         
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
    static final String dfa_43s = "\24\uffff";
    static final String dfa_44s = "\1\4\21\0\2\uffff";
    static final String dfa_45s = "\1\111\21\0\2\uffff";
    static final String dfa_46s = "\22\uffff\1\1\1\2";
    static final String dfa_47s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff}>";
    static final String[] dfa_48s = {
            "\1\4\2\uffff\1\1\1\6\1\3\1\10\1\15\1\7\1\16\1\20\25\uffff\1\2\30\uffff\1\5\1\uffff\1\12\1\uffff\1\13\1\uffff\1\21\2\uffff\1\14\1\uffff\1\11\1\17",
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

    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_43;
            this.eof = dfa_43;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "5970:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?";
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
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA100_2 = input.LA(1);

                         
                        int index100_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA100_3 = input.LA(1);

                         
                        int index100_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA100_4 = input.LA(1);

                         
                        int index100_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA100_5 = input.LA(1);

                         
                        int index100_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA100_6 = input.LA(1);

                         
                        int index100_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA100_7 = input.LA(1);

                         
                        int index100_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA100_8 = input.LA(1);

                         
                        int index100_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA100_9 = input.LA(1);

                         
                        int index100_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA100_10 = input.LA(1);

                         
                        int index100_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA100_11 = input.LA(1);

                         
                        int index100_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA100_12 = input.LA(1);

                         
                        int index100_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA100_13 = input.LA(1);

                         
                        int index100_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA100_14 = input.LA(1);

                         
                        int index100_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA100_15 = input.LA(1);

                         
                        int index100_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA100_16 = input.LA(1);

                         
                        int index100_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index100_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA100_17 = input.LA(1);

                         
                        int index100_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 18;}

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x8000000000003D80L,0x0000000000000242L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xA000001000007F90L,0x0000000000000346L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000003D82L,0x0000000000000242L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000000003D80L,0x0000000000000343L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8000000000003D80L,0x0000000000000342L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000038040L,0x0000000000000C00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xA000001000007F90L,0x0000000000000342L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xA000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xA000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xA000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xA000001000007F90L,0x0000000000001342L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xA000001000007F90L,0x0000000000000343L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000181L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xA000001FF72C7F90L,0x000000000000036AL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xA000001FF72C7F92L,0x000000000000034AL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xA000001000007F90L,0x000000000000034AL});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000300C0L,0x0000000000018280L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xA000001000007F90L,0x00000000000043C2L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000030000L,0x0000000000018280L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000C00000L,0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xA000001FF72C7F90L,0x000000000000034AL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000080L,0x0000000000004280L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xA000001000003F90L,0x0000000000000342L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000003D82L,0x0000000000004242L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000003D80L,0x0000000000004242L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xA000001000007F90L,0x000000000000036AL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000004C02000402L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000C02000402L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0xA000000000000280L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000000280L,0x0000000000000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000000280L});

}