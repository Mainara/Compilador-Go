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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECIMALS", "RULE_EXPONENT", "RULE_IDENTIFIER", "RULE_ANY_OTHER", "RULE_STRUCT", "RULE_STRING_LIT", "RULE_FUNC", "RULE_INTERFACE", "RULE_MAP", "RULE_CHAN", "RULE_CONST", "RULE_TYPEKEYWORD", "RULE_VAR", "RULE_INT_LIT", "RULE_UNARY_OP", "RULE_REL_OP", "RULE_ADD_OP", "RULE_MUL_OP", "RULE_IF", "RULE_ELSE", "RULE_SWITCH", "RULE_CASE", "RULE_DEFAULT", "RULE_FOR", "RULE_RANGE", "RULE_GO", "RULE_SELECT", "RULE_RETURN", "RULE_BREAK", "RULE_CONTINUE", "RULE_GOTO", "RULE_FALLTHROUGH", "RULE_DEFER", "RULE_PACKAGE", "RULE_IMPORT", "RULE_NEWLINE", "RULE_LETTER", "RULE_DECIMAL_DIGIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_UNICODE_CHAR", "RULE_INT", "RULE_UNICODE_VALUE", "RULE_BYTE_VALUE", "RULE_RUNE_LIT", "RULE_LITTLE_U_VALUE", "RULE_BIG_U_VALUE", "RULE_ESCAPED_CHAR", "RULE_OCTAL_BYTE_VALUE", "RULE_HEX_BYTE_VALUE", "RULE_RAW_STRING_LIT", "RULE_INTERPRETED_STRING_LIT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'.'", "'i'", "'('", "')'", "'['", "']'", "'{'", "';'", "'}'", "'*'", "','", "'...'", "'<-'", "'='", "':='", "':'", "'||'", "'&&'", "'++'", "'--'"
    };
    public static final int RULE_TYPEKEYWORD=15;
    public static final int RULE_FUNC=10;
    public static final int RULE_STRUCT=8;
    public static final int RULE_DECIMAL_DIGIT=41;
    public static final int RULE_GO=29;
    public static final int RULE_CHAN=13;
    public static final int RULE_FALLTHROUGH=35;
    public static final int RULE_STRING_LIT=9;
    public static final int T__61=61;
    public static final int RULE_RETURN=31;
    public static final int RULE_ID=56;
    public static final int RULE_INTERPRETED_STRING_LIT=55;
    public static final int RULE_UNICODE_VALUE=46;
    public static final int RULE_INTERFACE=11;
    public static final int RULE_LITTLE_U_VALUE=49;
    public static final int RULE_HEX_BYTE_VALUE=53;
    public static final int RULE_CASE=25;
    public static final int RULE_OCTAL_BYTE_VALUE=52;
    public static final int RULE_MUL_OP=21;
    public static final int RULE_PACKAGE=37;
    public static final int RULE_INT=45;
    public static final int RULE_SELECT=30;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=58;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_ELSE=23;
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
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_STRING=57;
    public static final int RULE_BYTE_VALUE=47;
    public static final int RULE_SL_COMMENT=59;
    public static final int RULE_BREAK=32;
    public static final int T__77=77;
    public static final int RULE_CONST=14;
    public static final int RULE_UNICODE_CHAR=44;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_IF=22;
    public static final int RULE_DEFAULT=26;
    public static final int T__73=73;
    public static final int RULE_FOR=27;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int RULE_ADD_OP=20;
    public static final int RULE_OCTAL_DIGIT=42;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_GOTO=34;
    public static final int RULE_WS=60;
    public static final int RULE_CONTINUE=33;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_DEFER=36;
    public static final int RULE_LETTER=40;
    public static final int RULE_EXPONENT=5;
    public static final int RULE_SWITCH=24;
    public static final int RULE_INT_LIT=17;
    public static final int RULE_RAW_STRING_LIT=54;
    public static final int RULE_UNARY_OP=18;
    public static final int RULE_REL_OP=19;
    public static final int RULE_HEX_DIGIT=43;
    public static final int RULE_RUNE_LIT=48;
    public static final int RULE_VAR=16;
    public static final int RULE_RANGE=28;

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
    // InternalMyDsl.g:134:1: ruleFLOAT_LIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )? ) | (this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT ) | (kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT_LIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMALS_0=null;
        Token kw=null;
        Token this_DECIMALS_2=null;
        Token this_EXPONENT_3=null;
        Token this_DECIMALS_4=null;
        Token this_EXPONENT_5=null;
        Token this_DECIMALS_7=null;
        Token this_EXPONENT_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:140:2: ( ( (this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )? ) | (this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT ) | (kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )? ) ) )
            // InternalMyDsl.g:141:2: ( (this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )? ) | (this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT ) | (kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )? ) )
            {
            // InternalMyDsl.g:141:2: ( (this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )? ) | (this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT ) | (kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )? ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DECIMALS) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==61) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_EXPONENT) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==61) ) {
                alt5=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:142:3: (this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )? )
                    {
                    // InternalMyDsl.g:142:3: (this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )? )
                    // InternalMyDsl.g:143:4: this_DECIMALS_0= RULE_DECIMALS kw= '.' (this_DECIMALS_2= RULE_DECIMALS )? (this_EXPONENT_3= RULE_EXPONENT )?
                    {
                    this_DECIMALS_0=(Token)match(input,RULE_DECIMALS,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_0, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_0_0());
                      			
                    }
                    kw=(Token)match(input,61,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFLOAT_LITAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalMyDsl.g:155:4: (this_DECIMALS_2= RULE_DECIMALS )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_DECIMALS) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMyDsl.g:156:5: this_DECIMALS_2= RULE_DECIMALS
                            {
                            this_DECIMALS_2=(Token)match(input,RULE_DECIMALS,FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_DECIMALS_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_DECIMALS_2, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_0_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyDsl.g:164:4: (this_EXPONENT_3= RULE_EXPONENT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_EXPONENT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMyDsl.g:165:5: this_EXPONENT_3= RULE_EXPONENT
                            {
                            this_EXPONENT_3=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_EXPONENT_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_EXPONENT_3, grammarAccess.getFLOAT_LITAccess().getEXPONENTTerminalRuleCall_0_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:175:3: (this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT )
                    {
                    // InternalMyDsl.g:175:3: (this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT )
                    // InternalMyDsl.g:176:4: this_DECIMALS_4= RULE_DECIMALS this_EXPONENT_5= RULE_EXPONENT
                    {
                    this_DECIMALS_4=(Token)match(input,RULE_DECIMALS,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_4, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_1_0());
                      			
                    }
                    this_EXPONENT_5=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_EXPONENT_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXPONENT_5, grammarAccess.getFLOAT_LITAccess().getEXPONENTTerminalRuleCall_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:192:3: (kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )? )
                    {
                    // InternalMyDsl.g:192:3: (kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )? )
                    // InternalMyDsl.g:193:4: kw= '.' this_DECIMALS_7= RULE_DECIMALS (this_EXPONENT_8= RULE_EXPONENT )?
                    {
                    kw=(Token)match(input,61,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFLOAT_LITAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_DECIMALS_7=(Token)match(input,RULE_DECIMALS,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_7, grammarAccess.getFLOAT_LITAccess().getDECIMALSTerminalRuleCall_2_1());
                      			
                    }
                    // InternalMyDsl.g:205:4: (this_EXPONENT_8= RULE_EXPONENT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_EXPONENT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:206:5: this_EXPONENT_8= RULE_EXPONENT
                            {
                            this_EXPONENT_8=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_EXPONENT_8);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_EXPONENT_8, grammarAccess.getFLOAT_LITAccess().getEXPONENTTerminalRuleCall_2_2());
                              				
                            }

                            }
                            break;

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


    // $ANTLR start "entryRuleIMAGINARY_LIT"
    // InternalMyDsl.g:219:1: entryRuleIMAGINARY_LIT returns [String current=null] : iv_ruleIMAGINARY_LIT= ruleIMAGINARY_LIT EOF ;
    public final String entryRuleIMAGINARY_LIT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIMAGINARY_LIT = null;


        try {
            // InternalMyDsl.g:219:53: (iv_ruleIMAGINARY_LIT= ruleIMAGINARY_LIT EOF )
            // InternalMyDsl.g:220:2: iv_ruleIMAGINARY_LIT= ruleIMAGINARY_LIT EOF
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
    // InternalMyDsl.g:226:1: ruleIMAGINARY_LIT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' ) ;
    public final AntlrDatatypeRuleToken ruleIMAGINARY_LIT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECIMALS_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FLOAT_LIT_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:232:2: ( ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' ) )
            // InternalMyDsl.g:233:2: ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' )
            {
            // InternalMyDsl.g:233:2: ( (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i' )
            // InternalMyDsl.g:234:3: (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT ) kw= 'i'
            {
            // InternalMyDsl.g:234:3: (this_DECIMALS_0= RULE_DECIMALS | this_FLOAT_LIT_1= ruleFLOAT_LIT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DECIMALS) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_EXPONENT||LA6_1==61) ) {
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
                    // InternalMyDsl.g:235:4: this_DECIMALS_0= RULE_DECIMALS
                    {
                    this_DECIMALS_0=(Token)match(input,RULE_DECIMALS,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DECIMALS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DECIMALS_0, grammarAccess.getIMAGINARY_LITAccess().getDECIMALSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:243:4: this_FLOAT_LIT_1= ruleFLOAT_LIT
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIMAGINARY_LITAccess().getFLOAT_LITParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:263:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:263:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:264:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:270:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeLit_1 = null;

        AntlrDatatypeRuleToken this_Type_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:276:2: ( (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:277:2: (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:277:2: (this_TypeName_0= ruleTypeName | this_TypeLit_1= ruleTypeLit | (kw= '(' this_Type_3= ruleType kw= ')' ) )
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
                    // InternalMyDsl.g:278:3: this_TypeName_0= ruleTypeName
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
                    // InternalMyDsl.g:289:3: this_TypeLit_1= ruleTypeLit
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
                    // InternalMyDsl.g:300:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:300:3: (kw= '(' this_Type_3= ruleType kw= ')' )
                    // InternalMyDsl.g:301:4: kw= '(' this_Type_3= ruleType kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeAccess().getTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:326:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalMyDsl.g:326:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalMyDsl.g:327:2: iv_ruleTypeName= ruleTypeName EOF
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
    // InternalMyDsl.g:333:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_TypeNameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:339:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha ) )
            // InternalMyDsl.g:340:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha )
            {
            // InternalMyDsl.g:340:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha )
            // InternalMyDsl.g:341:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_TypeNameLinha_1= ruleTypeNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_12); if (state.failed) return current;
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
    // InternalMyDsl.g:362:1: entryRuleTypeNameLinha returns [String current=null] : iv_ruleTypeNameLinha= ruleTypeNameLinha EOF ;
    public final String entryRuleTypeNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeNameLinha = null;


        try {
            // InternalMyDsl.g:362:53: (iv_ruleTypeNameLinha= ruleTypeNameLinha EOF )
            // InternalMyDsl.g:363:2: iv_ruleTypeNameLinha= ruleTypeNameLinha EOF
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
    // InternalMyDsl.g:369:1: ruleTypeNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleTypeNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:376:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:376:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
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
                    // InternalMyDsl.g:377:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:377:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:378:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
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
                    // InternalMyDsl.g:392:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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


    // $ANTLR start "entryRuleTypeLit"
    // InternalMyDsl.g:403:1: entryRuleTypeLit returns [String current=null] : iv_ruleTypeLit= ruleTypeLit EOF ;
    public final String entryRuleTypeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLit = null;


        try {
            // InternalMyDsl.g:403:47: (iv_ruleTypeLit= ruleTypeLit EOF )
            // InternalMyDsl.g:404:2: iv_ruleTypeLit= ruleTypeLit EOF
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
    // InternalMyDsl.g:410:1: ruleTypeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) ;
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
            // InternalMyDsl.g:416:2: ( ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType ) )
            // InternalMyDsl.g:417:2: ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
            {
            // InternalMyDsl.g:417:2: ( (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha ) | this_StructType_2= ruleStructType | this_PointerType_3= rulePointerType | this_FunctionType_4= ruleFunctionType | this_InterfaceType_5= ruleInterfaceType | this_MapType_6= ruleMapType | this_ChannelType_7= ruleChannelType )
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
                    // InternalMyDsl.g:418:3: (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha )
                    {
                    // InternalMyDsl.g:418:3: (kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha )
                    // InternalMyDsl.g:419:4: kw= '[' this_TypeLitLinha_1= ruleTypeLitLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_14); if (state.failed) return current;
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
                    // InternalMyDsl.g:436:3: this_StructType_2= ruleStructType
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
                    // InternalMyDsl.g:447:3: this_PointerType_3= rulePointerType
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
                    // InternalMyDsl.g:458:3: this_FunctionType_4= ruleFunctionType
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
                    // InternalMyDsl.g:469:3: this_InterfaceType_5= ruleInterfaceType
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
                    // InternalMyDsl.g:480:3: this_MapType_6= ruleMapType
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
                    // InternalMyDsl.g:491:3: this_ChannelType_7= ruleChannelType
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
    // InternalMyDsl.g:505:1: entryRuleTypeLitLinha returns [String current=null] : iv_ruleTypeLitLinha= ruleTypeLitLinha EOF ;
    public final String entryRuleTypeLitLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeLitLinha = null;


        try {
            // InternalMyDsl.g:505:52: (iv_ruleTypeLitLinha= ruleTypeLitLinha EOF )
            // InternalMyDsl.g:506:2: iv_ruleTypeLitLinha= ruleTypeLitLinha EOF
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
    // InternalMyDsl.g:512:1: ruleTypeLitLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeLitLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_0 = null;

        AntlrDatatypeRuleToken this_ElementType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:518:2: ( ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) ) )
            // InternalMyDsl.g:519:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) )
            {
            // InternalMyDsl.g:519:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= ']' this_ElementType_4= ruleElementType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DECIMALS||LA10_0==RULE_IDENTIFIER||(LA10_0>=RULE_STRUCT && LA10_0<=RULE_CHAN)||(LA10_0>=RULE_INT_LIT && LA10_0<=RULE_UNARY_OP)||LA10_0==61||LA10_0==63||LA10_0==65||LA10_0==70||LA10_0==73) ) {
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
                    // InternalMyDsl.g:520:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    {
                    // InternalMyDsl.g:520:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    // InternalMyDsl.g:521:4: this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTypeLitLinhaAccess().getArrayLengthParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_ArrayLength_0=ruleArrayLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayLength_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
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
                    // InternalMyDsl.g:548:3: (kw= ']' this_ElementType_4= ruleElementType )
                    {
                    // InternalMyDsl.g:548:3: (kw= ']' this_ElementType_4= ruleElementType )
                    // InternalMyDsl.g:549:4: kw= ']' this_ElementType_4= ruleElementType
                    {
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:569:1: entryRuleArrayLength returns [String current=null] : iv_ruleArrayLength= ruleArrayLength EOF ;
    public final String entryRuleArrayLength() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayLength = null;


        try {
            // InternalMyDsl.g:569:51: (iv_ruleArrayLength= ruleArrayLength EOF )
            // InternalMyDsl.g:570:2: iv_ruleArrayLength= ruleArrayLength EOF
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
    // InternalMyDsl.g:576:1: ruleArrayLength returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleArrayLength() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:582:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:583:2: this_Expression_0= ruleExpression
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
    // InternalMyDsl.g:596:1: entryRuleElementType returns [String current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final String entryRuleElementType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementType = null;


        try {
            // InternalMyDsl.g:596:51: (iv_ruleElementType= ruleElementType EOF )
            // InternalMyDsl.g:597:2: iv_ruleElementType= ruleElementType EOF
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
    // InternalMyDsl.g:603:1: ruleElementType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleElementType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:609:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:610:2: this_Type_0= ruleType
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
    // InternalMyDsl.g:623:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // InternalMyDsl.g:623:50: (iv_ruleStructType= ruleStructType EOF )
            // InternalMyDsl.g:624:2: iv_ruleStructType= ruleStructType EOF
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
    // InternalMyDsl.g:630:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleStructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRUCT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:636:2: ( (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' ) )
            // InternalMyDsl.g:637:2: (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' )
            {
            // InternalMyDsl.g:637:2: (this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}' )
            // InternalMyDsl.g:638:3: this_STRUCT_0= RULE_STRUCT kw= '{' (this_FieldDecl_2= ruleFieldDecl kw= ';' )* kw= '}'
            {
            this_STRUCT_0=(Token)match(input,RULE_STRUCT,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_STRUCT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_STRUCT_0, grammarAccess.getStructTypeAccess().getSTRUCTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:650:3: (this_FieldDecl_2= ruleFieldDecl kw= ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_IDENTIFIER||LA11_0==70) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:651:4: this_FieldDecl_2= ruleFieldDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStructTypeAccess().getFieldDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_FieldDecl_2=ruleFieldDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_FieldDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_17); if (state.failed) return current;
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
    // InternalMyDsl.g:676:1: entryRuleFieldDecl returns [String current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final String entryRuleFieldDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDecl = null;


        try {
            // InternalMyDsl.g:676:49: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // InternalMyDsl.g:677:2: iv_ruleFieldDecl= ruleFieldDecl EOF
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
    // InternalMyDsl.g:683:1: ruleFieldDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? ) ;
    public final AntlrDatatypeRuleToken ruleFieldDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_EmbeddedField_2 = null;

        AntlrDatatypeRuleToken this_Tag_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:689:2: ( ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? ) )
            // InternalMyDsl.g:690:2: ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? )
            {
            // InternalMyDsl.g:690:2: ( ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )? )
            // InternalMyDsl.g:691:3: ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField ) (this_Tag_3= ruleTag )?
            {
            // InternalMyDsl.g:691:3: ( (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType ) | this_EmbeddedField_2= ruleEmbeddedField )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENTIFIER) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_IDENTIFIER||LA12_1==RULE_STRUCT||(LA12_1>=RULE_FUNC && LA12_1<=RULE_CHAN)||LA12_1==63||LA12_1==65||(LA12_1>=70 && LA12_1<=71)||LA12_1==73) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_ANY_OTHER||LA12_1==61) ) {
                    alt12=2;
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
                    // InternalMyDsl.g:692:4: (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType )
                    {
                    // InternalMyDsl.g:692:4: (this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType )
                    // InternalMyDsl.g:693:5: this_IdentifierList_0= ruleIdentifierList this_Type_1= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFieldDeclAccess().getIdentifierListParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
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
                    pushFollow(FOLLOW_19);
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
                    // InternalMyDsl.g:715:4: this_EmbeddedField_2= ruleEmbeddedField
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFieldDeclAccess().getEmbeddedFieldParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
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

            // InternalMyDsl.g:726:3: (this_Tag_3= ruleTag )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING_LIT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:727:4: this_Tag_3= ruleTag
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
    // InternalMyDsl.g:742:1: entryRuleEmbeddedField returns [String current=null] : iv_ruleEmbeddedField= ruleEmbeddedField EOF ;
    public final String entryRuleEmbeddedField() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmbeddedField = null;


        try {
            // InternalMyDsl.g:742:53: (iv_ruleEmbeddedField= ruleEmbeddedField EOF )
            // InternalMyDsl.g:743:2: iv_ruleEmbeddedField= ruleEmbeddedField EOF
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
    // InternalMyDsl.g:749:1: ruleEmbeddedField returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' )? this_TypeName_1= ruleTypeName ) ;
    public final AntlrDatatypeRuleToken ruleEmbeddedField() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:755:2: ( ( (kw= '*' )? this_TypeName_1= ruleTypeName ) )
            // InternalMyDsl.g:756:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            {
            // InternalMyDsl.g:756:2: ( (kw= '*' )? this_TypeName_1= ruleTypeName )
            // InternalMyDsl.g:757:3: (kw= '*' )? this_TypeName_1= ruleTypeName
            {
            // InternalMyDsl.g:757:3: (kw= '*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==70) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:758:4: kw= '*'
                    {
                    kw=(Token)match(input,70,FOLLOW_13); if (state.failed) return current;
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
    // InternalMyDsl.g:778:1: entryRuleTag returns [String current=null] : iv_ruleTag= ruleTag EOF ;
    public final String entryRuleTag() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTag = null;


        try {
            // InternalMyDsl.g:778:43: (iv_ruleTag= ruleTag EOF )
            // InternalMyDsl.g:779:2: iv_ruleTag= ruleTag EOF
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
    // InternalMyDsl.g:785:1: ruleTag returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleTag() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:791:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:792:2: this_STRING_LIT_0= RULE_STRING_LIT
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
    // InternalMyDsl.g:802:1: entryRulePointerType returns [String current=null] : iv_rulePointerType= rulePointerType EOF ;
    public final String entryRulePointerType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointerType = null;


        try {
            // InternalMyDsl.g:802:51: (iv_rulePointerType= rulePointerType EOF )
            // InternalMyDsl.g:803:2: iv_rulePointerType= rulePointerType EOF
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
    // InternalMyDsl.g:809:1: rulePointerType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' this_BaseType_1= ruleBaseType ) ;
    public final AntlrDatatypeRuleToken rulePointerType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:815:2: ( (kw= '*' this_BaseType_1= ruleBaseType ) )
            // InternalMyDsl.g:816:2: (kw= '*' this_BaseType_1= ruleBaseType )
            {
            // InternalMyDsl.g:816:2: (kw= '*' this_BaseType_1= ruleBaseType )
            // InternalMyDsl.g:817:3: kw= '*' this_BaseType_1= ruleBaseType
            {
            kw=(Token)match(input,70,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:836:1: entryRuleBaseType returns [String current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final String entryRuleBaseType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseType = null;


        try {
            // InternalMyDsl.g:836:48: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalMyDsl.g:837:2: iv_ruleBaseType= ruleBaseType EOF
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
    // InternalMyDsl.g:843:1: ruleBaseType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleBaseType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:849:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:850:2: this_Type_0= ruleType
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
    // InternalMyDsl.g:863:1: entryRuleFunctionType returns [String current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final String entryRuleFunctionType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionType = null;


        try {
            // InternalMyDsl.g:863:52: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalMyDsl.g:864:2: iv_ruleFunctionType= ruleFunctionType EOF
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
    // InternalMyDsl.g:870:1: ruleFunctionType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature ) ;
    public final AntlrDatatypeRuleToken ruleFunctionType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:876:2: ( (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature ) )
            // InternalMyDsl.g:877:2: (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature )
            {
            // InternalMyDsl.g:877:2: (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature )
            // InternalMyDsl.g:878:3: this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_20); if (state.failed) return current;
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
    // InternalMyDsl.g:899:1: entryRuleSignature returns [String current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final String entryRuleSignature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignature = null;


        try {
            // InternalMyDsl.g:899:49: (iv_ruleSignature= ruleSignature EOF )
            // InternalMyDsl.g:900:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalMyDsl.g:906:1: ruleSignature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? ) ;
    public final AntlrDatatypeRuleToken ruleSignature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Result_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:912:2: ( (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? ) )
            // InternalMyDsl.g:913:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? )
            {
            // InternalMyDsl.g:913:2: (this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )? )
            // InternalMyDsl.g:914:3: this_Parameters_0= ruleParameters ( ( ruleResult )=>this_Result_1= ruleResult )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSignatureAccess().getParametersParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_Parameters_0=ruleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Parameters_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:924:3: ( ( ruleResult )=>this_Result_1= ruleResult )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:925:4: ( ruleResult )=>this_Result_1= ruleResult
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
    // InternalMyDsl.g:941:1: entryRuleResult returns [String current=null] : iv_ruleResult= ruleResult EOF ;
    public final String entryRuleResult() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResult = null;


        try {
            // InternalMyDsl.g:941:46: (iv_ruleResult= ruleResult EOF )
            // InternalMyDsl.g:942:2: iv_ruleResult= ruleResult EOF
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
    // InternalMyDsl.g:948:1: ruleResult returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleResult() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:954:2: ( ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType ) )
            // InternalMyDsl.g:955:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )
            {
            // InternalMyDsl.g:955:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:956:3: ( ( ruleParameters )=>this_Parameters_0= ruleParameters )
                    {
                    // InternalMyDsl.g:956:3: ( ( ruleParameters )=>this_Parameters_0= ruleParameters )
                    // InternalMyDsl.g:957:4: ( ruleParameters )=>this_Parameters_0= ruleParameters
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
                    // InternalMyDsl.g:970:3: this_Type_1= ruleType
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
    // InternalMyDsl.g:984:1: entryRuleParameters returns [String current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final String entryRuleParameters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameters = null;


        try {
            // InternalMyDsl.g:984:50: (iv_ruleParameters= ruleParameters EOF )
            // InternalMyDsl.g:985:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalMyDsl.g:991:1: ruleParameters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:997:2: ( (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:998:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:998:2: (kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:999:3: kw= '(' (this_ParameterList_1= ruleParameterList (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,63,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getParametersAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:1004:3: (this_ParameterList_1= ruleParameterList (kw= ',' )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_IDENTIFIER||LA18_0==RULE_STRUCT||(LA18_0>=RULE_FUNC && LA18_0<=RULE_CHAN)||LA18_0==63||LA18_0==65||LA18_0==70||(LA18_0>=72 && LA18_0<=73)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1005:4: this_ParameterList_1= ruleParameterList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParametersAccess().getParameterListParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_ParameterList_1=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ParameterList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:1015:4: (kw= ',' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==71) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:1016:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_11); if (state.failed) return current;
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
    // InternalMyDsl.g:1032:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // InternalMyDsl.g:1032:53: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalMyDsl.g:1033:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalMyDsl.g:1039:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDecl_0 = null;

        AntlrDatatypeRuleToken this_ParameterDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1045:2: ( (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* ) )
            // InternalMyDsl.g:1046:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            {
            // InternalMyDsl.g:1046:2: (this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )* )
            // InternalMyDsl.g:1047:3: this_ParameterDecl_0= ruleParameterDecl (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_ParameterDecl_0=ruleParameterDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ParameterDecl_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1057:3: (kw= ',' this_ParameterDecl_2= ruleParameterDecl )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==71) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_IDENTIFIER||LA19_1==RULE_STRUCT||(LA19_1>=RULE_FUNC && LA19_1<=RULE_CHAN)||LA19_1==63||LA19_1==65||LA19_1==70||(LA19_1>=72 && LA19_1<=73)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1058:4: kw= ',' this_ParameterDecl_2= ruleParameterDecl
            	    {
            	    kw=(Token)match(input,71,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getParameterListAccess().getParameterDeclParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1078:1: entryRuleParameterDecl returns [String current=null] : iv_ruleParameterDecl= ruleParameterDecl EOF ;
    public final String entryRuleParameterDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDecl = null;


        try {
            // InternalMyDsl.g:1078:53: (iv_ruleParameterDecl= ruleParameterDecl EOF )
            // InternalMyDsl.g:1079:2: iv_ruleParameterDecl= ruleParameterDecl EOF
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
    // InternalMyDsl.g:1085:1: ruleParameterDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleParameterDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1091:2: ( ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType ) )
            // InternalMyDsl.g:1092:2: ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType )
            {
            // InternalMyDsl.g:1092:2: ( (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType )
            // InternalMyDsl.g:1093:3: (this_IdentifierList_0= ruleIdentifierList )? (kw= '...' )? this_Type_2= ruleType
            {
            // InternalMyDsl.g:1093:3: (this_IdentifierList_0= ruleIdentifierList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_IDENTIFIER) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_IDENTIFIER||LA20_1==RULE_STRUCT||(LA20_1>=RULE_FUNC && LA20_1<=RULE_CHAN)||LA20_1==63||LA20_1==65||(LA20_1>=70 && LA20_1<=73)) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1094:4: this_IdentifierList_0= ruleIdentifierList
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getParameterDeclAccess().getIdentifierListParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_25);
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

            // InternalMyDsl.g:1105:3: (kw= '...' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==72) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1106:4: kw= '...'
                    {
                    kw=(Token)match(input,72,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:1126:1: entryRuleInterfaceType returns [String current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final String entryRuleInterfaceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceType = null;


        try {
            // InternalMyDsl.g:1126:53: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalMyDsl.g:1127:2: iv_ruleInterfaceType= ruleInterfaceType EOF
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
    // InternalMyDsl.g:1133:1: ruleInterfaceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTERFACE_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_MethodSpec_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1139:2: ( (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' )* kw= '}' ) )
            // InternalMyDsl.g:1140:2: (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' )* kw= '}' )
            {
            // InternalMyDsl.g:1140:2: (this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' )* kw= '}' )
            // InternalMyDsl.g:1141:3: this_INTERFACE_0= RULE_INTERFACE kw= '{' (this_MethodSpec_2= ruleMethodSpec kw= ';' )* kw= '}'
            {
            this_INTERFACE_0=(Token)match(input,RULE_INTERFACE,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INTERFACE_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INTERFACE_0, grammarAccess.getInterfaceTypeAccess().getINTERFACETerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:1153:3: (this_MethodSpec_2= ruleMethodSpec kw= ';' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_IDENTIFIER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1154:4: this_MethodSpec_2= ruleMethodSpec kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getInterfaceTypeAccess().getMethodSpecParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_MethodSpec_2=ruleMethodSpec();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_MethodSpec_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

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
    // InternalMyDsl.g:1179:1: entryRuleMethodSpec returns [String current=null] : iv_ruleMethodSpec= ruleMethodSpec EOF ;
    public final String entryRuleMethodSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodSpec = null;


        try {
            // InternalMyDsl.g:1179:50: (iv_ruleMethodSpec= ruleMethodSpec EOF )
            // InternalMyDsl.g:1180:2: iv_ruleMethodSpec= ruleMethodSpec EOF
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
    // InternalMyDsl.g:1186:1: ruleMethodSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName ) ;
    public final AntlrDatatypeRuleToken ruleMethodSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MethodName_0 = null;

        AntlrDatatypeRuleToken this_Signature_1 = null;

        AntlrDatatypeRuleToken this_InterfaceTypeName_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1192:2: ( ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName ) )
            // InternalMyDsl.g:1193:2: ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName )
            {
            // InternalMyDsl.g:1193:2: ( (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature ) | this_InterfaceTypeName_2= ruleInterfaceTypeName )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_IDENTIFIER) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==63) ) {
                    alt23=1;
                }
                else if ( (LA23_1==RULE_ANY_OTHER||LA23_1==61) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1194:3: (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature )
                    {
                    // InternalMyDsl.g:1194:3: (this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature )
                    // InternalMyDsl.g:1195:4: this_MethodName_0= ruleMethodName this_Signature_1= ruleSignature
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMethodSpecAccess().getMethodNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_20);
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
                    // InternalMyDsl.g:1217:3: this_InterfaceTypeName_2= ruleInterfaceTypeName
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
    // InternalMyDsl.g:1231:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // InternalMyDsl.g:1231:50: (iv_ruleMethodName= ruleMethodName EOF )
            // InternalMyDsl.g:1232:2: iv_ruleMethodName= ruleMethodName EOF
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
    // InternalMyDsl.g:1238:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1244:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:1245:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:1255:1: entryRuleInterfaceTypeName returns [String current=null] : iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF ;
    public final String entryRuleInterfaceTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceTypeName = null;


        try {
            // InternalMyDsl.g:1255:57: (iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF )
            // InternalMyDsl.g:1256:2: iv_ruleInterfaceTypeName= ruleInterfaceTypeName EOF
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
    // InternalMyDsl.g:1262:1: ruleInterfaceTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_TypeName_0= ruleTypeName ;
    public final AntlrDatatypeRuleToken ruleInterfaceTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeName_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1268:2: (this_TypeName_0= ruleTypeName )
            // InternalMyDsl.g:1269:2: this_TypeName_0= ruleTypeName
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
    // InternalMyDsl.g:1282:1: entryRuleMapType returns [String current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final String entryRuleMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapType = null;


        try {
            // InternalMyDsl.g:1282:47: (iv_ruleMapType= ruleMapType EOF )
            // InternalMyDsl.g:1283:2: iv_ruleMapType= ruleMapType EOF
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
    // InternalMyDsl.g:1289:1: ruleMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType ) ;
    public final AntlrDatatypeRuleToken ruleMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MAP_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_KeyType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1295:2: ( (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType ) )
            // InternalMyDsl.g:1296:2: (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType )
            {
            // InternalMyDsl.g:1296:2: (this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType )
            // InternalMyDsl.g:1297:3: this_MAP_0= RULE_MAP kw= '[' this_KeyType_2= ruleKeyType kw= ']' this_ElementType_4= ruleElementType
            {
            this_MAP_0=(Token)match(input,RULE_MAP,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_MAP_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_MAP_0, grammarAccess.getMapTypeAccess().getMAPTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,65,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getMapTypeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMapTypeAccess().getKeyTypeParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_15);
            this_KeyType_2=ruleKeyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_KeyType_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:1338:1: entryRuleKeyType returns [String current=null] : iv_ruleKeyType= ruleKeyType EOF ;
    public final String entryRuleKeyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyType = null;


        try {
            // InternalMyDsl.g:1338:47: (iv_ruleKeyType= ruleKeyType EOF )
            // InternalMyDsl.g:1339:2: iv_ruleKeyType= ruleKeyType EOF
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
    // InternalMyDsl.g:1345:1: ruleKeyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleKeyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1351:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:1352:2: this_Type_0= ruleType
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
    // InternalMyDsl.g:1365:1: entryRuleChannelType returns [String current=null] : iv_ruleChannelType= ruleChannelType EOF ;
    public final String entryRuleChannelType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannelType = null;


        try {
            // InternalMyDsl.g:1365:51: (iv_ruleChannelType= ruleChannelType EOF )
            // InternalMyDsl.g:1366:2: iv_ruleChannelType= ruleChannelType EOF
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
    // InternalMyDsl.g:1372:1: ruleChannelType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType ) ;
    public final AntlrDatatypeRuleToken ruleChannelType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAN_0=null;
        Token kw=null;
        Token this_CHAN_3=null;
        AntlrDatatypeRuleToken this_ChannelTypeLinha_1 = null;

        AntlrDatatypeRuleToken this_ElementType_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1378:2: ( ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType ) )
            // InternalMyDsl.g:1379:2: ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType )
            {
            // InternalMyDsl.g:1379:2: ( ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType )
            // InternalMyDsl.g:1380:3: ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) ) this_ElementType_4= ruleElementType
            {
            // InternalMyDsl.g:1380:3: ( (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha ) | (kw= '<-' this_CHAN_3= RULE_CHAN ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_CHAN) ) {
                alt24=1;
            }
            else if ( (LA24_0==73) ) {
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
                    // InternalMyDsl.g:1381:4: (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha )
                    {
                    // InternalMyDsl.g:1381:4: (this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha )
                    // InternalMyDsl.g:1382:5: this_CHAN_0= RULE_CHAN this_ChannelTypeLinha_1= ruleChannelTypeLinha
                    {
                    this_CHAN_0=(Token)match(input,RULE_CHAN,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_CHAN_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_CHAN_0, grammarAccess.getChannelTypeAccess().getCHANTerminalRuleCall_0_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getChannelTypeAccess().getChannelTypeLinhaParserRuleCall_0_0_1());
                      				
                    }
                    pushFollow(FOLLOW_10);
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
                    // InternalMyDsl.g:1401:4: (kw= '<-' this_CHAN_3= RULE_CHAN )
                    {
                    // InternalMyDsl.g:1401:4: (kw= '<-' this_CHAN_3= RULE_CHAN )
                    // InternalMyDsl.g:1402:5: kw= '<-' this_CHAN_3= RULE_CHAN
                    {
                    kw=(Token)match(input,73,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_0());
                      				
                    }
                    this_CHAN_3=(Token)match(input,RULE_CHAN,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:1430:1: entryRuleChannelTypeLinha returns [String current=null] : iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF ;
    public final String entryRuleChannelTypeLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChannelTypeLinha = null;


        try {
            // InternalMyDsl.g:1430:56: (iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF )
            // InternalMyDsl.g:1431:2: iv_ruleChannelTypeLinha= ruleChannelTypeLinha EOF
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
    // InternalMyDsl.g:1437:1: ruleChannelTypeLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleChannelTypeLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ANY_OTHER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1443:2: ( (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:1444:2: (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:1444:2: (kw= '<-' | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==73) ) {
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
                    // InternalMyDsl.g:1445:3: kw= '<-'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getChannelTypeLinhaAccess().getLessThanSignHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1451:3: this_ANY_OTHER_1= RULE_ANY_OTHER
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


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:1462:1: entryRuleBlock returns [String current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final String entryRuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:1462:45: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:1463:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalMyDsl.g:1469:1: ruleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StatementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1475:2: ( (kw= '{' this_StatementList_1= ruleStatementList kw= '}' ) )
            // InternalMyDsl.g:1476:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            {
            // InternalMyDsl.g:1476:2: (kw= '{' this_StatementList_1= ruleStatementList kw= '}' )
            // InternalMyDsl.g:1477:3: kw= '{' this_StatementList_1= ruleStatementList kw= '}'
            {
            kw=(Token)match(input,67,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBlockAccess().getStatementListParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:1501:1: entryRuleStatementList returns [String current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final String entryRuleStatementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatementList = null;


        try {
            // InternalMyDsl.g:1501:53: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalMyDsl.g:1502:2: iv_ruleStatementList= ruleStatementList EOF
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
    // InternalMyDsl.g:1508:1: ruleStatementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Statement_0= ruleStatement kw= ';' )* ;
    public final AntlrDatatypeRuleToken ruleStatementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1514:2: ( (this_Statement_0= ruleStatement kw= ';' )* )
            // InternalMyDsl.g:1515:2: (this_Statement_0= ruleStatement kw= ';' )*
            {
            // InternalMyDsl.g:1515:2: (this_Statement_0= ruleStatement kw= ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DECIMALS||(LA26_0>=RULE_IDENTIFIER && LA26_0<=RULE_UNARY_OP)||LA26_0==RULE_IF||LA26_0==RULE_SWITCH||LA26_0==RULE_FOR||(LA26_0>=RULE_GO && LA26_0<=RULE_DEFER)||LA26_0==61||LA26_0==63||LA26_0==65||LA26_0==67||LA26_0==70||LA26_0==73) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:1516:3: this_Statement_0= ruleStatement kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getStatementListAccess().getStatementParserRuleCall_0());
            	      		
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_Statement_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_Statement_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }
            	    kw=(Token)match(input,68,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(kw);
            	      			newLeafNode(kw, grammarAccess.getStatementListAccess().getSemicolonKeyword_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:1535:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:1535:51: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:1536:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalMyDsl.g:1542:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDecl_1 = null;

        AntlrDatatypeRuleToken this_VarDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1548:2: ( (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl ) )
            // InternalMyDsl.g:1549:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            {
            // InternalMyDsl.g:1549:2: (this_ConstDecl_0= ruleConstDecl | this_TypeDecl_1= ruleTypeDecl | this_VarDecl_2= ruleVarDecl )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_CONST:
                {
                alt27=1;
                }
                break;
            case RULE_TYPEKEYWORD:
                {
                alt27=2;
                }
                break;
            case RULE_VAR:
                {
                alt27=3;
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
                    // InternalMyDsl.g:1550:3: this_ConstDecl_0= ruleConstDecl
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
                    // InternalMyDsl.g:1561:3: this_TypeDecl_1= ruleTypeDecl
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
                    // InternalMyDsl.g:1572:3: this_VarDecl_2= ruleVarDecl
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
    // InternalMyDsl.g:1586:1: entryRuleTopLevelDecl returns [String current=null] : iv_ruleTopLevelDecl= ruleTopLevelDecl EOF ;
    public final String entryRuleTopLevelDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelDecl = null;


        try {
            // InternalMyDsl.g:1586:52: (iv_ruleTopLevelDecl= ruleTopLevelDecl EOF )
            // InternalMyDsl.g:1587:2: iv_ruleTopLevelDecl= ruleTopLevelDecl EOF
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
    // InternalMyDsl.g:1593:1: ruleTopLevelDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;

        AntlrDatatypeRuleToken this_FunctionDecl_1 = null;

        AntlrDatatypeRuleToken this_MethodDecl_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1599:2: ( (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl ) )
            // InternalMyDsl.g:1600:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            {
            // InternalMyDsl.g:1600:2: (this_Declaration_0= ruleDeclaration | this_FunctionDecl_1= ruleFunctionDecl | this_MethodDecl_2= ruleMethodDecl )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_CONST && LA28_0<=RULE_VAR)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_FUNC) ) {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==63) ) {
                    alt28=3;
                }
                else if ( (LA28_2==RULE_IDENTIFIER) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1601:3: this_Declaration_0= ruleDeclaration
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
                    // InternalMyDsl.g:1612:3: this_FunctionDecl_1= ruleFunctionDecl
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
                    // InternalMyDsl.g:1623:3: this_MethodDecl_2= ruleMethodDecl
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
    // InternalMyDsl.g:1637:1: entryRuleConstDecl returns [String current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final String entryRuleConstDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstDecl = null;


        try {
            // InternalMyDsl.g:1637:49: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalMyDsl.g:1638:2: iv_ruleConstDecl= ruleConstDecl EOF
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
    // InternalMyDsl.g:1644:1: ruleConstDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleConstDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONST_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ConstSpec_1 = null;

        AntlrDatatypeRuleToken this_ConstSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1650:2: ( (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:1651:2: (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:1651:2: (this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:1652:3: this_CONST_0= RULE_CONST (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            {
            this_CONST_0=(Token)match(input,RULE_CONST,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CONST_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CONST_0, grammarAccess.getConstDeclAccess().getCONSTTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:1659:3: (this_ConstSpec_1= ruleConstSpec | (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_IDENTIFIER) ) {
                alt30=1;
            }
            else if ( (LA30_0==63) ) {
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
                    // InternalMyDsl.g:1660:4: this_ConstSpec_1= ruleConstSpec
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
                    // InternalMyDsl.g:1671:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:1671:4: (kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:1672:5: kw= '(' (this_ConstSpec_3= ruleConstSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getConstDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:1677:5: (this_ConstSpec_3= ruleConstSpec kw= ';' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_IDENTIFIER) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1678:6: this_ConstSpec_3= ruleConstSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getConstDeclAccess().getConstSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    this_ConstSpec_3=ruleConstSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ConstSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getConstDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
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
    // InternalMyDsl.g:1705:1: entryRuleConstSpec returns [String current=null] : iv_ruleConstSpec= ruleConstSpec EOF ;
    public final String entryRuleConstSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstSpec = null;


        try {
            // InternalMyDsl.g:1705:49: (iv_ruleConstSpec= ruleConstSpec EOF )
            // InternalMyDsl.g:1706:2: iv_ruleConstSpec= ruleConstSpec EOF
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
    // InternalMyDsl.g:1712:1: ruleConstSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) ;
    public final AntlrDatatypeRuleToken ruleConstSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1718:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? ) )
            // InternalMyDsl.g:1719:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            {
            // InternalMyDsl.g:1719:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )? )
            // InternalMyDsl.g:1720:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_IdentifierList_0=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdentifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1730:3: ( (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_IDENTIFIER||LA32_0==RULE_STRUCT||(LA32_0>=RULE_FUNC && LA32_0<=RULE_CHAN)||LA32_0==63||LA32_0==65||LA32_0==70||(LA32_0>=73 && LA32_0<=74)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1731:4: (this_Type_1= ruleType )? kw= '=' this_ExpressionList_3= ruleExpressionList
                    {
                    // InternalMyDsl.g:1731:4: (this_Type_1= ruleType )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_IDENTIFIER||LA31_0==RULE_STRUCT||(LA31_0>=RULE_FUNC && LA31_0<=RULE_CHAN)||LA31_0==63||LA31_0==65||LA31_0==70||LA31_0==73) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMyDsl.g:1732:5: this_Type_1= ruleType
                            {
                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getConstSpecAccess().getTypeParserRuleCall_1_0());
                              				
                            }
                            pushFollow(FOLLOW_36);
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

                    kw=(Token)match(input,74,FOLLOW_37); if (state.failed) return current;
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


    // $ANTLR start "entryRuleIdentifierList"
    // InternalMyDsl.g:1763:1: entryRuleIdentifierList returns [String current=null] : iv_ruleIdentifierList= ruleIdentifierList EOF ;
    public final String entryRuleIdentifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifierList = null;


        try {
            // InternalMyDsl.g:1763:54: (iv_ruleIdentifierList= ruleIdentifierList EOF )
            // InternalMyDsl.g:1764:2: iv_ruleIdentifierList= ruleIdentifierList EOF
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
    // InternalMyDsl.g:1770:1: ruleIdentifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        Token this_IDENTIFIER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1776:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* ) )
            // InternalMyDsl.g:1777:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            {
            // InternalMyDsl.g:1777:2: (this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )* )
            // InternalMyDsl.g:1778:3: this_IDENTIFIER_0= RULE_IDENTIFIER (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:1785:3: (kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==71) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1786:4: kw= ',' this_IDENTIFIER_2= RULE_IDENTIFIER
            	    {
            	    kw=(Token)match(input,71,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getIdentifierListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    this_IDENTIFIER_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_IDENTIFIER_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_IDENTIFIER_2, grammarAccess.getIdentifierListAccess().getIDENTIFIERTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
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


    // $ANTLR start "entryRuleExpressionList"
    // InternalMyDsl.g:1803:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            // InternalMyDsl.g:1803:54: (iv_ruleExpressionList= ruleExpressionList EOF )
            // InternalMyDsl.g:1804:2: iv_ruleExpressionList= ruleExpressionList EOF
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
    // InternalMyDsl.g:1810:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1816:2: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // InternalMyDsl.g:1817:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // InternalMyDsl.g:1817:2: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // InternalMyDsl.g:1818:3: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Expression_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:1828:3: (kw= ',' this_Expression_2= ruleExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==71) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_DECIMALS||LA34_2==RULE_IDENTIFIER||(LA34_2>=RULE_STRUCT && LA34_2<=RULE_CHAN)||(LA34_2>=RULE_INT_LIT && LA34_2<=RULE_UNARY_OP)||LA34_2==61||LA34_2==63||LA34_2==65||LA34_2==70||LA34_2==73) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:1829:4: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,71,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop34;
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


    // $ANTLR start "entryRuleTypeDecl"
    // InternalMyDsl.g:1849:1: entryRuleTypeDecl returns [String current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final String entryRuleTypeDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDecl = null;


        try {
            // InternalMyDsl.g:1849:48: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // InternalMyDsl.g:1850:2: iv_ruleTypeDecl= ruleTypeDecl EOF
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
    // InternalMyDsl.g:1856:1: ruleTypeDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPEKEYWORD_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpec_1 = null;

        AntlrDatatypeRuleToken this_TypeSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1862:2: ( (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:1863:2: (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:1863:2: (this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:1864:3: this_TYPEKEYWORD_0= RULE_TYPEKEYWORD (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            {
            this_TYPEKEYWORD_0=(Token)match(input,RULE_TYPEKEYWORD,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TYPEKEYWORD_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEKEYWORD_0, grammarAccess.getTypeDeclAccess().getTYPEKEYWORDTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:1871:3: (this_TypeSpec_1= ruleTypeSpec | (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_IDENTIFIER) ) {
                alt36=1;
            }
            else if ( (LA36_0==63) ) {
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
                    // InternalMyDsl.g:1872:4: this_TypeSpec_1= ruleTypeSpec
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
                    // InternalMyDsl.g:1883:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:1883:4: (kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:1884:5: kw= '(' (this_TypeSpec_3= ruleTypeSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getTypeDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:1889:5: (this_TypeSpec_3= ruleTypeSpec kw= ';' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_IDENTIFIER) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyDsl.g:1890:6: this_TypeSpec_3= ruleTypeSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTypeDeclAccess().getTypeSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    this_TypeSpec_3=ruleTypeSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_TypeSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getTypeDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
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
    // InternalMyDsl.g:1917:1: entryRuleTypeSpec returns [String current=null] : iv_ruleTypeSpec= ruleTypeSpec EOF ;
    public final String entryRuleTypeSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpec = null;


        try {
            // InternalMyDsl.g:1917:48: (iv_ruleTypeSpec= ruleTypeSpec EOF )
            // InternalMyDsl.g:1918:2: iv_ruleTypeSpec= ruleTypeSpec EOF
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
    // InternalMyDsl.g:1924:1: ruleTypeSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AliasDecl_0 = null;

        AntlrDatatypeRuleToken this_TypeDef_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1930:2: ( (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef ) )
            // InternalMyDsl.g:1931:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            {
            // InternalMyDsl.g:1931:2: (this_AliasDecl_0= ruleAliasDecl | this_TypeDef_1= ruleTypeDef )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_IDENTIFIER) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_IDENTIFIER||LA37_1==RULE_STRUCT||(LA37_1>=RULE_FUNC && LA37_1<=RULE_CHAN)||LA37_1==63||LA37_1==65||LA37_1==70||LA37_1==73) ) {
                    alt37=2;
                }
                else if ( (LA37_1==74) ) {
                    alt37=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1932:3: this_AliasDecl_0= ruleAliasDecl
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
                    // InternalMyDsl.g:1943:3: this_TypeDef_1= ruleTypeDef
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
    // InternalMyDsl.g:1957:1: entryRuleAliasDecl returns [String current=null] : iv_ruleAliasDecl= ruleAliasDecl EOF ;
    public final String entryRuleAliasDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDecl = null;


        try {
            // InternalMyDsl.g:1957:49: (iv_ruleAliasDecl= ruleAliasDecl EOF )
            // InternalMyDsl.g:1958:2: iv_ruleAliasDecl= ruleAliasDecl EOF
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
    // InternalMyDsl.g:1964:1: ruleAliasDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleAliasDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1970:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType ) )
            // InternalMyDsl.g:1971:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            {
            // InternalMyDsl.g:1971:2: (this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType )
            // InternalMyDsl.g:1972:3: this_IDENTIFIER_0= RULE_IDENTIFIER kw= '=' this_Type_2= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IDENTIFIER_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IDENTIFIER_0, grammarAccess.getAliasDeclAccess().getIDENTIFIERTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,74,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:1998:1: entryRuleTypeDef returns [String current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final String entryRuleTypeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeDef = null;


        try {
            // InternalMyDsl.g:1998:47: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyDsl.g:1999:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalMyDsl.g:2005:1: ruleTypeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) ;
    public final AntlrDatatypeRuleToken ruleTypeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_Type_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2011:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType ) )
            // InternalMyDsl.g:2012:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            {
            // InternalMyDsl.g:2012:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType )
            // InternalMyDsl.g:2013:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_Type_1= ruleType
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:2034:1: entryRuleVarDecl returns [String current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final String entryRuleVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarDecl = null;


        try {
            // InternalMyDsl.g:2034:47: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMyDsl.g:2035:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalMyDsl.g:2041:1: ruleVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_VarSpec_1 = null;

        AntlrDatatypeRuleToken this_VarSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2047:2: ( (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:2048:2: (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:2048:2: (this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:2049:3: this_VAR_0= RULE_VAR (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            {
            this_VAR_0=(Token)match(input,RULE_VAR,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_VAR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_VAR_0, grammarAccess.getVarDeclAccess().getVARTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:2056:3: (this_VarSpec_1= ruleVarSpec | (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_IDENTIFIER) ) {
                alt39=1;
            }
            else if ( (LA39_0==63) ) {
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
                    // InternalMyDsl.g:2057:4: this_VarSpec_1= ruleVarSpec
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
                    // InternalMyDsl.g:2068:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:2068:4: (kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:2069:5: kw= '(' (this_VarSpec_3= ruleVarSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getVarDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:2074:5: (this_VarSpec_3= ruleVarSpec kw= ';' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_IDENTIFIER) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDsl.g:2075:6: this_VarSpec_3= ruleVarSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getVarDeclAccess().getVarSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    this_VarSpec_3=ruleVarSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_VarSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getVarDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
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
    // InternalMyDsl.g:2102:1: entryRuleVarSpec returns [String current=null] : iv_ruleVarSpec= ruleVarSpec EOF ;
    public final String entryRuleVarSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVarSpec = null;


        try {
            // InternalMyDsl.g:2102:47: (iv_ruleVarSpec= ruleVarSpec EOF )
            // InternalMyDsl.g:2103:2: iv_ruleVarSpec= ruleVarSpec EOF
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
    // InternalMyDsl.g:2109:1: ruleVarSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) ;
    public final AntlrDatatypeRuleToken ruleVarSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_Type_1 = null;

        AntlrDatatypeRuleToken this_ExpressionList_3 = null;

        AntlrDatatypeRuleToken this_ExpressionList_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2115:2: ( (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) ) )
            // InternalMyDsl.g:2116:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            {
            // InternalMyDsl.g:2116:2: (this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) ) )
            // InternalMyDsl.g:2117:3: this_IdentifierList_0= ruleIdentifierList ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarSpecAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_IdentifierList_0=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdentifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:2127:3: ( (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? ) | (kw= '=' this_ExpressionList_5= ruleExpressionList ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_IDENTIFIER||LA41_0==RULE_STRUCT||(LA41_0>=RULE_FUNC && LA41_0<=RULE_CHAN)||LA41_0==63||LA41_0==65||LA41_0==70||LA41_0==73) ) {
                alt41=1;
            }
            else if ( (LA41_0==74) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2128:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    {
                    // InternalMyDsl.g:2128:4: (this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )? )
                    // InternalMyDsl.g:2129:5: this_Type_1= ruleType (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getVarSpecAccess().getTypeParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_39);
                    this_Type_1=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Type_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    // InternalMyDsl.g:2139:5: (kw= '=' this_ExpressionList_3= ruleExpressionList )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==74) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMyDsl.g:2140:6: kw= '=' this_ExpressionList_3= ruleExpressionList
                            {
                            kw=(Token)match(input,74,FOLLOW_37); if (state.failed) return current;
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
                    // InternalMyDsl.g:2158:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    {
                    // InternalMyDsl.g:2158:4: (kw= '=' this_ExpressionList_5= ruleExpressionList )
                    // InternalMyDsl.g:2159:5: kw= '=' this_ExpressionList_5= ruleExpressionList
                    {
                    kw=(Token)match(input,74,FOLLOW_37); if (state.failed) return current;
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


    // $ANTLR start "entryRuleShortVarDecl"
    // InternalMyDsl.g:2180:1: entryRuleShortVarDecl returns [String current=null] : iv_ruleShortVarDecl= ruleShortVarDecl EOF ;
    public final String entryRuleShortVarDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShortVarDecl = null;


        try {
            // InternalMyDsl.g:2180:52: (iv_ruleShortVarDecl= ruleShortVarDecl EOF )
            // InternalMyDsl.g:2181:2: iv_ruleShortVarDecl= ruleShortVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShortVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShortVarDecl=ruleShortVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShortVarDecl.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShortVarDecl"


    // $ANTLR start "ruleShortVarDecl"
    // InternalMyDsl.g:2187:1: ruleShortVarDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IdentifierList_0= ruleIdentifierList kw= ':=' this_ExpressionList_2= ruleExpressionList ) ;
    public final AntlrDatatypeRuleToken ruleShortVarDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdentifierList_0 = null;

        AntlrDatatypeRuleToken this_ExpressionList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2193:2: ( (this_IdentifierList_0= ruleIdentifierList kw= ':=' this_ExpressionList_2= ruleExpressionList ) )
            // InternalMyDsl.g:2194:2: (this_IdentifierList_0= ruleIdentifierList kw= ':=' this_ExpressionList_2= ruleExpressionList )
            {
            // InternalMyDsl.g:2194:2: (this_IdentifierList_0= ruleIdentifierList kw= ':=' this_ExpressionList_2= ruleExpressionList )
            // InternalMyDsl.g:2195:3: this_IdentifierList_0= ruleIdentifierList kw= ':=' this_ExpressionList_2= ruleExpressionList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getIdentifierListParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_IdentifierList_0=ruleIdentifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IdentifierList_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,75,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getShortVarDeclAccess().getColonEqualsSignKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShortVarDeclAccess().getExpressionListParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_ExpressionList_2=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExpressionList_2);
              		
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
    // $ANTLR end "ruleShortVarDecl"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalMyDsl.g:2224:1: entryRuleFunctionDecl returns [String current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final String entryRuleFunctionDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDecl = null;


        try {
            // InternalMyDsl.g:2224:52: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalMyDsl.g:2225:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalMyDsl.g:2231:1: ruleFunctionDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_FunctionName_1 = null;

        AntlrDatatypeRuleToken this_Signature_2 = null;

        AntlrDatatypeRuleToken this_FunctionBody_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2237:2: ( (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? ) )
            // InternalMyDsl.g:2238:2: (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:2238:2: (this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )? )
            // InternalMyDsl.g:2239:3: this_FUNC_0= RULE_FUNC this_FunctionName_1= ruleFunctionName this_Signature_2= ruleSignature (this_FunctionBody_3= ruleFunctionBody )?
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FUNC_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FUNC_0, grammarAccess.getFunctionDeclAccess().getFUNCTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionNameParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_20);
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
            pushFollow(FOLLOW_41);
            this_Signature_2=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:2266:3: (this_FunctionBody_3= ruleFunctionBody )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==67) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2267:4: this_FunctionBody_3= ruleFunctionBody
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
    // InternalMyDsl.g:2282:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalMyDsl.g:2282:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalMyDsl.g:2283:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalMyDsl.g:2289:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2295:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:2296:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:2306:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // InternalMyDsl.g:2306:52: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // InternalMyDsl.g:2307:2: iv_ruleFunctionBody= ruleFunctionBody EOF
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
    // InternalMyDsl.g:2313:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Block_0= ruleBlock ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Block_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2319:2: (this_Block_0= ruleBlock )
            // InternalMyDsl.g:2320:2: this_Block_0= ruleBlock
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
    // InternalMyDsl.g:2333:1: entryRuleMethodDecl returns [String current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final String entryRuleMethodDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodDecl = null;


        try {
            // InternalMyDsl.g:2333:50: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalMyDsl.g:2334:2: iv_ruleMethodDecl= ruleMethodDecl EOF
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
    // InternalMyDsl.g:2340:1: ruleMethodDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) ;
    public final AntlrDatatypeRuleToken ruleMethodDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_Receiver_1 = null;

        AntlrDatatypeRuleToken this_MethodName_2 = null;

        AntlrDatatypeRuleToken this_Signature_3 = null;

        AntlrDatatypeRuleToken this_FunctionBody_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2346:2: ( (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? ) )
            // InternalMyDsl.g:2347:2: (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            {
            // InternalMyDsl.g:2347:2: (this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )? )
            // InternalMyDsl.g:2348:3: this_FUNC_0= RULE_FUNC this_Receiver_1= ruleReceiver this_MethodName_2= ruleMethodName this_Signature_3= ruleSignature (this_FunctionBody_4= ruleFunctionBody )?
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FUNC_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FUNC_0, grammarAccess.getMethodDeclAccess().getFUNCTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMethodDeclAccess().getReceiverParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_13);
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
            pushFollow(FOLLOW_20);
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
            pushFollow(FOLLOW_41);
            this_Signature_3=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Signature_3);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:2385:3: (this_FunctionBody_4= ruleFunctionBody )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==67) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2386:4: this_FunctionBody_4= ruleFunctionBody
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
    // InternalMyDsl.g:2401:1: entryRuleReceiver returns [String current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final String entryRuleReceiver() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiver = null;


        try {
            // InternalMyDsl.g:2401:48: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalMyDsl.g:2402:2: iv_ruleReceiver= ruleReceiver EOF
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
    // InternalMyDsl.g:2408:1: ruleReceiver returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Parameters_0= ruleParameters ;
    public final AntlrDatatypeRuleToken ruleReceiver() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Parameters_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2414:2: (this_Parameters_0= ruleParameters )
            // InternalMyDsl.g:2415:2: this_Parameters_0= ruleParameters
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
    // InternalMyDsl.g:2428:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // InternalMyDsl.g:2428:47: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMyDsl.g:2429:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalMyDsl.g:2435:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicLit_0 = null;

        AntlrDatatypeRuleToken this_CompositeLit_1 = null;

        AntlrDatatypeRuleToken this_FunctionLit_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2441:2: ( (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit ) )
            // InternalMyDsl.g:2442:2: (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit )
            {
            // InternalMyDsl.g:2442:2: (this_BasicLit_0= ruleBasicLit | this_CompositeLit_1= ruleCompositeLit | this_FunctionLit_2= ruleFunctionLit )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMALS:
            case RULE_STRING_LIT:
            case RULE_INT_LIT:
            case 61:
                {
                alt44=1;
                }
                break;
            case RULE_IDENTIFIER:
            case RULE_STRUCT:
            case RULE_MAP:
            case 65:
                {
                alt44=2;
                }
                break;
            case RULE_FUNC:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2443:3: this_BasicLit_0= ruleBasicLit
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
                    // InternalMyDsl.g:2454:3: this_CompositeLit_1= ruleCompositeLit
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
                    // InternalMyDsl.g:2465:3: this_FunctionLit_2= ruleFunctionLit
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
    // InternalMyDsl.g:2479:1: entryRuleBasicLit returns [String current=null] : iv_ruleBasicLit= ruleBasicLit EOF ;
    public final String entryRuleBasicLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicLit = null;


        try {
            // InternalMyDsl.g:2479:48: (iv_ruleBasicLit= ruleBasicLit EOF )
            // InternalMyDsl.g:2480:2: iv_ruleBasicLit= ruleBasicLit EOF
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
    // InternalMyDsl.g:2486:1: ruleBasicLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= ruleFLOAT_LIT | this_IMAGINARY_LIT_2= ruleIMAGINARY_LIT | this_STRING_LIT_3= RULE_STRING_LIT ) ;
    public final AntlrDatatypeRuleToken ruleBasicLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_LIT_0=null;
        Token this_STRING_LIT_3=null;
        AntlrDatatypeRuleToken this_FLOAT_LIT_1 = null;

        AntlrDatatypeRuleToken this_IMAGINARY_LIT_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2492:2: ( (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= ruleFLOAT_LIT | this_IMAGINARY_LIT_2= ruleIMAGINARY_LIT | this_STRING_LIT_3= RULE_STRING_LIT ) )
            // InternalMyDsl.g:2493:2: (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= ruleFLOAT_LIT | this_IMAGINARY_LIT_2= ruleIMAGINARY_LIT | this_STRING_LIT_3= RULE_STRING_LIT )
            {
            // InternalMyDsl.g:2493:2: (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= ruleFLOAT_LIT | this_IMAGINARY_LIT_2= ruleIMAGINARY_LIT | this_STRING_LIT_3= RULE_STRING_LIT )
            int alt45=4;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2494:3: this_INT_LIT_0= RULE_INT_LIT
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
                    // InternalMyDsl.g:2502:3: this_FLOAT_LIT_1= ruleFLOAT_LIT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getFLOAT_LITParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
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
                case 3 :
                    // InternalMyDsl.g:2513:3: this_IMAGINARY_LIT_2= ruleIMAGINARY_LIT
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicLitAccess().getIMAGINARY_LITParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IMAGINARY_LIT_2=ruleIMAGINARY_LIT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IMAGINARY_LIT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2524:3: this_STRING_LIT_3= RULE_STRING_LIT
                    {
                    this_STRING_LIT_3=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_LIT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_LIT_3, grammarAccess.getBasicLitAccess().getSTRING_LITTerminalRuleCall_3());
                      		
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
    // InternalMyDsl.g:2535:1: entryRuleOperandName returns [String current=null] : iv_ruleOperandName= ruleOperandName EOF ;
    public final String entryRuleOperandName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperandName = null;


        try {
            // InternalMyDsl.g:2535:51: (iv_ruleOperandName= ruleOperandName EOF )
            // InternalMyDsl.g:2536:2: iv_ruleOperandName= ruleOperandName EOF
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
    // InternalMyDsl.g:2542:1: ruleOperandName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha ) ;
    public final AntlrDatatypeRuleToken ruleOperandName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        AntlrDatatypeRuleToken this_OperandNameLinha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2548:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha ) )
            // InternalMyDsl.g:2549:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha )
            {
            // InternalMyDsl.g:2549:2: (this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha )
            // InternalMyDsl.g:2550:3: this_IDENTIFIER_0= RULE_IDENTIFIER this_OperandNameLinha_1= ruleOperandNameLinha
            {
            this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_12); if (state.failed) return current;
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
    // InternalMyDsl.g:2571:1: entryRuleOperandNameLinha returns [String current=null] : iv_ruleOperandNameLinha= ruleOperandNameLinha EOF ;
    public final String entryRuleOperandNameLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperandNameLinha = null;


        try {
            // InternalMyDsl.g:2571:56: (iv_ruleOperandNameLinha= ruleOperandNameLinha EOF )
            // InternalMyDsl.g:2572:2: iv_ruleOperandNameLinha= ruleOperandNameLinha EOF
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
    // InternalMyDsl.g:2578:1: ruleOperandNameLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleOperandNameLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_1=null;
        Token this_ANY_OTHER_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2584:2: ( ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:2585:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:2585:2: ( (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER ) | this_ANY_OTHER_2= RULE_ANY_OTHER )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ANY_OTHER) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2586:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    {
                    // InternalMyDsl.g:2586:3: (kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER )
                    // InternalMyDsl.g:2587:4: kw= '.' this_IDENTIFIER_1= RULE_IDENTIFIER
                    {
                    kw=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
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
                    // InternalMyDsl.g:2601:3: this_ANY_OTHER_2= RULE_ANY_OTHER
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
    // InternalMyDsl.g:2612:1: entryRuleCompositeLit returns [String current=null] : iv_ruleCompositeLit= ruleCompositeLit EOF ;
    public final String entryRuleCompositeLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeLit = null;


        try {
            // InternalMyDsl.g:2612:52: (iv_ruleCompositeLit= ruleCompositeLit EOF )
            // InternalMyDsl.g:2613:2: iv_ruleCompositeLit= ruleCompositeLit EOF
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
    // InternalMyDsl.g:2619:1: ruleCompositeLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleCompositeLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralType_0 = null;

        AntlrDatatypeRuleToken this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2625:2: ( (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue ) )
            // InternalMyDsl.g:2626:2: (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalMyDsl.g:2626:2: (this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue )
            // InternalMyDsl.g:2627:3: this_LiteralType_0= ruleLiteralType this_LiteralValue_1= ruleLiteralValue
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompositeLitAccess().getLiteralTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2651:1: entryRuleLiteralType returns [String current=null] : iv_ruleLiteralType= ruleLiteralType EOF ;
    public final String entryRuleLiteralType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralType = null;


        try {
            // InternalMyDsl.g:2651:51: (iv_ruleLiteralType= ruleLiteralType EOF )
            // InternalMyDsl.g:2652:2: iv_ruleLiteralType= ruleLiteralType EOF
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
    // InternalMyDsl.g:2658:1: ruleLiteralType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteralType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StructType_0 = null;

        AntlrDatatypeRuleToken this_MapType_1 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;

        AntlrDatatypeRuleToken this_LiteralTypeLinha_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2664:2: ( (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) ) )
            // InternalMyDsl.g:2665:2: (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) )
            {
            // InternalMyDsl.g:2665:2: (this_StructType_0= ruleStructType | this_MapType_1= ruleMapType | this_TypeName_2= ruleTypeName | (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_STRUCT:
                {
                alt47=1;
                }
                break;
            case RULE_MAP:
                {
                alt47=2;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt47=3;
                }
                break;
            case 65:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2666:3: this_StructType_0= ruleStructType
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
                    // InternalMyDsl.g:2677:3: this_MapType_1= ruleMapType
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
                    // InternalMyDsl.g:2688:3: this_TypeName_2= ruleTypeName
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
                    // InternalMyDsl.g:2699:3: (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha )
                    {
                    // InternalMyDsl.g:2699:3: (kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha )
                    // InternalMyDsl.g:2700:4: kw= '[' this_LiteralTypeLinha_4= ruleLiteralTypeLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_42); if (state.failed) return current;
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
    // InternalMyDsl.g:2720:1: entryRuleLiteralTypeLinha returns [String current=null] : iv_ruleLiteralTypeLinha= ruleLiteralTypeLinha EOF ;
    public final String entryRuleLiteralTypeLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralTypeLinha = null;


        try {
            // InternalMyDsl.g:2720:56: (iv_ruleLiteralTypeLinha= ruleLiteralTypeLinha EOF )
            // InternalMyDsl.g:2721:2: iv_ruleLiteralTypeLinha= ruleLiteralTypeLinha EOF
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
    // InternalMyDsl.g:2727:1: ruleLiteralTypeLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteralTypeLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_0 = null;

        AntlrDatatypeRuleToken this_ElementType_2 = null;

        AntlrDatatypeRuleToken this_ElementType_5 = null;

        AntlrDatatypeRuleToken this_ElementType_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2733:2: ( ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) ) )
            // InternalMyDsl.g:2734:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) )
            {
            // InternalMyDsl.g:2734:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType ) | (kw= '...' kw= ']' this_ElementType_5= ruleElementType ) | (kw= ']' this_ElementType_7= ruleElementType ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMALS:
            case RULE_IDENTIFIER:
            case RULE_STRUCT:
            case RULE_STRING_LIT:
            case RULE_FUNC:
            case RULE_INTERFACE:
            case RULE_MAP:
            case RULE_CHAN:
            case RULE_INT_LIT:
            case RULE_UNARY_OP:
            case 61:
            case 63:
            case 65:
            case 70:
            case 73:
                {
                alt48=1;
                }
                break;
            case 72:
                {
                alt48=2;
                }
                break;
            case 66:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2735:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    {
                    // InternalMyDsl.g:2735:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType )
                    // InternalMyDsl.g:2736:4: this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getLiteralTypeLinhaAccess().getArrayLengthParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_ArrayLength_0=ruleArrayLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayLength_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
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
                    // InternalMyDsl.g:2763:3: (kw= '...' kw= ']' this_ElementType_5= ruleElementType )
                    {
                    // InternalMyDsl.g:2763:3: (kw= '...' kw= ']' this_ElementType_5= ruleElementType )
                    // InternalMyDsl.g:2764:4: kw= '...' kw= ']' this_ElementType_5= ruleElementType
                    {
                    kw=(Token)match(input,72,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getLiteralTypeLinhaAccess().getFullStopFullStopFullStopKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
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
                    // InternalMyDsl.g:2786:3: (kw= ']' this_ElementType_7= ruleElementType )
                    {
                    // InternalMyDsl.g:2786:3: (kw= ']' this_ElementType_7= ruleElementType )
                    // InternalMyDsl.g:2787:4: kw= ']' this_ElementType_7= ruleElementType
                    {
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
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
    // InternalMyDsl.g:2807:1: entryRuleLiteralValue returns [String current=null] : iv_ruleLiteralValue= ruleLiteralValue EOF ;
    public final String entryRuleLiteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralValue = null;


        try {
            // InternalMyDsl.g:2807:52: (iv_ruleLiteralValue= ruleLiteralValue EOF )
            // InternalMyDsl.g:2808:2: iv_ruleLiteralValue= ruleLiteralValue EOF
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
    // InternalMyDsl.g:2814:1: ruleLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ElementList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2820:2: ( (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' ) )
            // InternalMyDsl.g:2821:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            {
            // InternalMyDsl.g:2821:2: (kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}' )
            // InternalMyDsl.g:2822:3: kw= '{' ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,67,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyDsl.g:2827:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2828:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )?
                    {
                    // InternalMyDsl.g:2828:4: ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList )
                    // InternalMyDsl.g:2829:5: ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLiteralValueAccess().getElementListParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalMyDsl.g:2845:4: (kw= ',' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==71) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalMyDsl.g:2846:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_31); if (state.failed) return current;
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
    // InternalMyDsl.g:2862:1: entryRuleElementList returns [String current=null] : iv_ruleElementList= ruleElementList EOF ;
    public final String entryRuleElementList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementList = null;


        try {
            // InternalMyDsl.g:2862:51: (iv_ruleElementList= ruleElementList EOF )
            // InternalMyDsl.g:2863:2: iv_ruleElementList= ruleElementList EOF
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
    // InternalMyDsl.g:2869:1: ruleElementList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) ;
    public final AntlrDatatypeRuleToken ruleElementList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_KeyedElement_0 = null;

        AntlrDatatypeRuleToken this_KeyedElement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2875:2: ( ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* ) )
            // InternalMyDsl.g:2876:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            {
            // InternalMyDsl.g:2876:2: ( ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )* )
            // InternalMyDsl.g:2877:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement ) (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            {
            // InternalMyDsl.g:2877:3: ( ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement )
            // InternalMyDsl.g:2878:4: ( ( ruleKey ':' ) )=>this_KeyedElement_0= ruleKeyedElement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:2894:3: (kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==71) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==RULE_DECIMALS||LA51_1==RULE_IDENTIFIER||(LA51_1>=RULE_STRUCT && LA51_1<=RULE_CHAN)||(LA51_1>=RULE_INT_LIT && LA51_1<=RULE_UNARY_OP)||LA51_1==61||LA51_1==63||LA51_1==65||LA51_1==67||LA51_1==70||LA51_1==73) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalMyDsl.g:2895:4: kw= ',' ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    {
            	    kw=(Token)match(input,71,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getElementListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:2900:4: ( ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement )
            	    // InternalMyDsl.g:2901:5: ( ( ruleKey ':' ) )=>this_KeyedElement_2= ruleKeyedElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getElementListAccess().getKeyedElementParserRuleCall_1_1());
            	      				
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop51;
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
    // InternalMyDsl.g:2922:1: entryRuleKeyedElement returns [String current=null] : iv_ruleKeyedElement= ruleKeyedElement EOF ;
    public final String entryRuleKeyedElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyedElement = null;


        try {
            // InternalMyDsl.g:2922:52: (iv_ruleKeyedElement= ruleKeyedElement EOF )
            // InternalMyDsl.g:2923:2: iv_ruleKeyedElement= ruleKeyedElement EOF
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
    // InternalMyDsl.g:2929:1: ruleKeyedElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) ;
    public final AntlrDatatypeRuleToken ruleKeyedElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Key_0 = null;

        AntlrDatatypeRuleToken this_Element_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2935:2: ( ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement ) )
            // InternalMyDsl.g:2936:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            {
            // InternalMyDsl.g:2936:2: ( ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement )
            // InternalMyDsl.g:2937:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )? this_Element_2= ruleElement
            {
            // InternalMyDsl.g:2937:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2938:4: ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' )
                    {
                    // InternalMyDsl.g:2943:4: (this_Key_0= ruleKey kw= ':' )
                    // InternalMyDsl.g:2944:5: this_Key_0= ruleKey kw= ':'
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getKeyedElementAccess().getKeyParserRuleCall_0_0_0());
                      				
                    }
                    pushFollow(FOLLOW_46);
                    this_Key_0=ruleKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Key_0);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,76,FOLLOW_45); if (state.failed) return current;
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
    // InternalMyDsl.g:2975:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalMyDsl.g:2975:43: (iv_ruleKey= ruleKey EOF )
            // InternalMyDsl.g:2976:2: iv_ruleKey= ruleKey EOF
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
    // InternalMyDsl.g:2982:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FieldName_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_LiteralValue_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2988:2: ( (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue ) )
            // InternalMyDsl.g:2989:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            {
            // InternalMyDsl.g:2989:2: (this_FieldName_0= ruleFieldName | this_Expression_1= ruleExpression | this_LiteralValue_2= ruleLiteralValue )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==EOF||LA53_1==76) ) {
                    alt53=1;
                }
                else if ( (LA53_1==RULE_ANY_OTHER||LA53_1==61) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

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
            case RULE_INT_LIT:
            case RULE_UNARY_OP:
            case 61:
            case 63:
            case 65:
            case 70:
            case 73:
                {
                alt53=2;
                }
                break;
            case 67:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2990:3: this_FieldName_0= ruleFieldName
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
                    // InternalMyDsl.g:3001:3: this_Expression_1= ruleExpression
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
                    // InternalMyDsl.g:3012:3: this_LiteralValue_2= ruleLiteralValue
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
    // InternalMyDsl.g:3026:1: entryRuleFieldName returns [String current=null] : iv_ruleFieldName= ruleFieldName EOF ;
    public final String entryRuleFieldName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldName = null;


        try {
            // InternalMyDsl.g:3026:49: (iv_ruleFieldName= ruleFieldName EOF )
            // InternalMyDsl.g:3027:2: iv_ruleFieldName= ruleFieldName EOF
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
    // InternalMyDsl.g:3033:1: ruleFieldName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleFieldName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3039:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:3040:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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
    // InternalMyDsl.g:3050:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalMyDsl.g:3050:47: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:3051:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:3057:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_LiteralValue_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3063:2: ( (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue ) )
            // InternalMyDsl.g:3064:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            {
            // InternalMyDsl.g:3064:2: (this_Expression_0= ruleExpression | this_LiteralValue_1= ruleLiteralValue )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_DECIMALS||LA54_0==RULE_IDENTIFIER||(LA54_0>=RULE_STRUCT && LA54_0<=RULE_CHAN)||(LA54_0>=RULE_INT_LIT && LA54_0<=RULE_UNARY_OP)||LA54_0==61||LA54_0==63||LA54_0==65||LA54_0==70||LA54_0==73) ) {
                alt54=1;
            }
            else if ( (LA54_0==67) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:3065:3: this_Expression_0= ruleExpression
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
                    // InternalMyDsl.g:3076:3: this_LiteralValue_1= ruleLiteralValue
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
    // InternalMyDsl.g:3090:1: entryRuleFunctionLit returns [String current=null] : iv_ruleFunctionLit= ruleFunctionLit EOF ;
    public final String entryRuleFunctionLit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionLit = null;


        try {
            // InternalMyDsl.g:3090:51: (iv_ruleFunctionLit= ruleFunctionLit EOF )
            // InternalMyDsl.g:3091:2: iv_ruleFunctionLit= ruleFunctionLit EOF
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
    // InternalMyDsl.g:3097:1: ruleFunctionLit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody ) ;
    public final AntlrDatatypeRuleToken ruleFunctionLit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FUNC_0=null;
        AntlrDatatypeRuleToken this_Signature_1 = null;

        AntlrDatatypeRuleToken this_FunctionBody_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3103:2: ( (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody ) )
            // InternalMyDsl.g:3104:2: (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody )
            {
            // InternalMyDsl.g:3104:2: (this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody )
            // InternalMyDsl.g:3105:3: this_FUNC_0= RULE_FUNC this_Signature_1= ruleSignature this_FunctionBody_2= ruleFunctionBody
            {
            this_FUNC_0=(Token)match(input,RULE_FUNC,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FUNC_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FUNC_0, grammarAccess.getFunctionLitAccess().getFUNCTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFunctionLitAccess().getSignatureParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalMyDsl.g:3136:1: entryRulePrimaryExpr returns [String current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final String entryRulePrimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr = null;


        try {
            // InternalMyDsl.g:3136:51: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalMyDsl.g:3137:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
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
    // InternalMyDsl.g:3143:1: rulePrimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha ) | (this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha ) | (this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha ) | (this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_8=null;
        Token kw=null;
        Token this_FUNC_15=null;
        AntlrDatatypeRuleToken this_BasicLit_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_1 = null;

        AntlrDatatypeRuleToken this_StructType_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr4_3 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_4 = null;

        AntlrDatatypeRuleToken this_MapType_5 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr4_6 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_7 = null;

        AntlrDatatypeRuleToken this_TypeNameLinha_9 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr5_10 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_11 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr6_13 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_14 = null;

        AntlrDatatypeRuleToken this_Signature_16 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr7_17 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_18 = null;

        AntlrDatatypeRuleToken this_PointerType_19 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr1_20 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_21 = null;

        AntlrDatatypeRuleToken this_InterfaceType_22 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr1_23 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_24 = null;

        AntlrDatatypeRuleToken this_ChannelType_25 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr1_26 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_27 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr3_29 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_30 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3149:2: ( ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha ) | (this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha ) | (this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha ) | (this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:3150:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha ) | (this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha ) | (this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha ) | (this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:3150:2: ( (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha ) | (this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha ) | (this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha ) | (this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha ) | (this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha ) | (this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha ) | (this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha ) | (this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha ) | (kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha ) )
            int alt55=10;
            switch ( input.LA(1) ) {
            case RULE_DECIMALS:
            case RULE_STRING_LIT:
            case RULE_INT_LIT:
            case 61:
                {
                alt55=1;
                }
                break;
            case RULE_STRUCT:
                {
                alt55=2;
                }
                break;
            case RULE_MAP:
                {
                alt55=3;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt55=4;
                }
                break;
            case 65:
                {
                alt55=5;
                }
                break;
            case RULE_FUNC:
                {
                alt55=6;
                }
                break;
            case 70:
                {
                alt55=7;
                }
                break;
            case RULE_INTERFACE:
                {
                alt55=8;
                }
                break;
            case RULE_CHAN:
            case 73:
                {
                alt55=9;
                }
                break;
            case 63:
                {
                alt55=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:3151:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3151:3: (this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3152:4: this_BasicLit_0= ruleBasicLit this_PrimaryExprLinha_1= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getBasicLitParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_47);
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
                    // InternalMyDsl.g:3174:3: (this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3174:3: (this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3175:4: this_StructType_2= ruleStructType this_PrimaryExpr4_3= rulePrimaryExpr4 this_PrimaryExprLinha_4= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getStructTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_48);
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

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr4ParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr4_3=rulePrimaryExpr4();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr4_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_4=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3207:3: (this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3207:3: (this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3208:4: this_MapType_5= ruleMapType this_PrimaryExpr4_6= rulePrimaryExpr4 this_PrimaryExprLinha_7= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getMapTypeParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_MapType_5=ruleMapType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MapType_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr4ParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr4_6=rulePrimaryExpr4();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr4_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_2_2());
                      			
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
                case 4 :
                    // InternalMyDsl.g:3240:3: (this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3240:3: (this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3241:4: this_IDENTIFIER_8= RULE_IDENTIFIER this_TypeNameLinha_9= ruleTypeNameLinha this_PrimaryExpr5_10= rulePrimaryExpr5 this_PrimaryExprLinha_11= rulePrimaryExprLinha
                    {
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IDENTIFIER_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IDENTIFIER_8, grammarAccess.getPrimaryExprAccess().getIDENTIFIERTerminalRuleCall_3_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getTypeNameLinhaParserRuleCall_3_1());
                      			
                    }
                    pushFollow(FOLLOW_49);
                    this_TypeNameLinha_9=ruleTypeNameLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TypeNameLinha_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr5ParserRuleCall_3_2());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr5_10=rulePrimaryExpr5();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr5_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_11=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_11);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3280:3: (kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3280:3: (kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3281:4: kw= '[' this_PrimaryExpr6_13= rulePrimaryExpr6 this_PrimaryExprLinha_14= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr6ParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr6_13=rulePrimaryExpr6();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr6_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_4_2());
                      			
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
                    // InternalMyDsl.g:3308:3: (this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3308:3: (this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3309:4: this_FUNC_15= RULE_FUNC this_Signature_16= ruleSignature this_PrimaryExpr7_17= rulePrimaryExpr7 this_PrimaryExprLinha_18= rulePrimaryExprLinha
                    {
                    this_FUNC_15=(Token)match(input,RULE_FUNC,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_FUNC_15);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_FUNC_15, grammarAccess.getPrimaryExprAccess().getFUNCTerminalRuleCall_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getSignatureParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_Signature_16=ruleSignature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Signature_16);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr7ParserRuleCall_5_2());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr7_17=rulePrimaryExpr7();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr7_17);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_5_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_18=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_18);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3348:3: (this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3348:3: (this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3349:4: this_PointerType_19= rulePointerType this_PrimaryExpr1_20= rulePrimaryExpr1 this_PrimaryExprLinha_21= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPointerTypeParserRuleCall_6_0());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_PointerType_19=rulePointerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PointerType_19);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr1ParserRuleCall_6_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr1_20=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr1_20);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_6_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha_21=rulePrimaryExprLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha_21);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3381:3: (this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3381:3: (this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3382:4: this_InterfaceType_22= ruleInterfaceType this_PrimaryExpr1_23= rulePrimaryExpr1 this_PrimaryExprLinha_24= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getInterfaceTypeParserRuleCall_7_0());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_InterfaceType_22=ruleInterfaceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_InterfaceType_22);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr1ParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr1_23=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr1_23);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExprLinhaParserRuleCall_7_2());
                      			
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
                    // InternalMyDsl.g:3414:3: (this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3414:3: (this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3415:4: this_ChannelType_25= ruleChannelType this_PrimaryExpr1_26= rulePrimaryExpr1 this_PrimaryExprLinha_27= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getChannelTypeParserRuleCall_8_0());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_ChannelType_25=ruleChannelType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ChannelType_25);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr1ParserRuleCall_8_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr1_26=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr1_26);
                      			
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
                    // InternalMyDsl.g:3447:3: (kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3447:3: (kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3448:4: kw= '(' this_PrimaryExpr3_29= rulePrimaryExpr3 this_PrimaryExprLinha_30= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,63,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_9_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getPrimaryExpr3ParserRuleCall_9_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExpr3_29=rulePrimaryExpr3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr3_29);
                      			
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

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRulePrimaryExpr1"
    // InternalMyDsl.g:3478:1: entryRulePrimaryExpr1 returns [String current=null] : iv_rulePrimaryExpr1= rulePrimaryExpr1 EOF ;
    public final String entryRulePrimaryExpr1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr1 = null;


        try {
            // InternalMyDsl.g:3478:52: (iv_rulePrimaryExpr1= rulePrimaryExpr1 EOF )
            // InternalMyDsl.g:3479:2: iv_rulePrimaryExpr1= rulePrimaryExpr1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr1=rulePrimaryExpr1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr1.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr1"


    // $ANTLR start "rulePrimaryExpr1"
    // InternalMyDsl.g:3485:1: rulePrimaryExpr1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_MethodName_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3491:2: ( ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) ) )
            // InternalMyDsl.g:3492:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            {
            // InternalMyDsl.g:3492:2: ( (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' ) | (kw= '.' this_MethodName_5= ruleMethodName ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==63) ) {
                alt57=1;
            }
            else if ( (LA57_0==61) ) {
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
                    // InternalMyDsl.g:3493:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    {
                    // InternalMyDsl.g:3493:3: (kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')' )
                    // InternalMyDsl.g:3494:4: kw= '(' this_Expression_1= ruleExpression (kw= ',' )? kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr1Access().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr1Access().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:3509:4: (kw= ',' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==71) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalMyDsl.g:3510:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getPrimaryExpr1Access().getCommaKeyword_0_2());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr1Access().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3523:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    {
                    // InternalMyDsl.g:3523:3: (kw= '.' this_MethodName_5= ruleMethodName )
                    // InternalMyDsl.g:3524:4: kw= '.' this_MethodName_5= ruleMethodName
                    {
                    kw=(Token)match(input,61,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr1Access().getFullStopKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr1Access().getMethodNameParserRuleCall_1_1());
                      			
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
    // $ANTLR end "rulePrimaryExpr1"


    // $ANTLR start "entryRulePrimaryExpr2"
    // InternalMyDsl.g:3544:1: entryRulePrimaryExpr2 returns [String current=null] : iv_rulePrimaryExpr2= rulePrimaryExpr2 EOF ;
    public final String entryRulePrimaryExpr2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr2 = null;


        try {
            // InternalMyDsl.g:3544:52: (iv_rulePrimaryExpr2= rulePrimaryExpr2 EOF )
            // InternalMyDsl.g:3545:2: iv_rulePrimaryExpr2= rulePrimaryExpr2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr2=rulePrimaryExpr2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr2.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr2"


    // $ANTLR start "rulePrimaryExpr2"
    // InternalMyDsl.g:3551:1: rulePrimaryExpr2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimaryExpr1_0= rulePrimaryExpr1 | this_ANY_OTHER_1= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_1=null;
        AntlrDatatypeRuleToken this_PrimaryExpr1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3557:2: ( (this_PrimaryExpr1_0= rulePrimaryExpr1 | this_ANY_OTHER_1= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:3558:2: (this_PrimaryExpr1_0= rulePrimaryExpr1 | this_ANY_OTHER_1= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:3558:2: (this_PrimaryExpr1_0= rulePrimaryExpr1 | this_ANY_OTHER_1= RULE_ANY_OTHER )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==61||LA58_0==63) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:3559:3: this_PrimaryExpr1_0= rulePrimaryExpr1
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr2Access().getPrimaryExpr1ParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr1_0=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExpr1_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3570:3: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_1, grammarAccess.getPrimaryExpr2Access().getANY_OTHERTerminalRuleCall_1());
                      		
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
    // $ANTLR end "rulePrimaryExpr2"


    // $ANTLR start "entryRulePrimaryExpr3"
    // InternalMyDsl.g:3581:1: entryRulePrimaryExpr3 returns [String current=null] : iv_rulePrimaryExpr3= rulePrimaryExpr3 EOF ;
    public final String entryRulePrimaryExpr3() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr3 = null;


        try {
            // InternalMyDsl.g:3581:52: (iv_rulePrimaryExpr3= rulePrimaryExpr3 EOF )
            // InternalMyDsl.g:3582:2: iv_rulePrimaryExpr3= rulePrimaryExpr3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr3=rulePrimaryExpr3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr3.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr3"


    // $ANTLR start "rulePrimaryExpr3"
    // InternalMyDsl.g:3588:1: rulePrimaryExpr3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr3() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr1_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3594:2: ( ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 ) ) )
            // InternalMyDsl.g:3595:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 ) )
            {
            // InternalMyDsl.g:3595:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 ) )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:3596:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    {
                    // InternalMyDsl.g:3596:3: ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' )
                    // InternalMyDsl.g:3597:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')'
                    {
                    // InternalMyDsl.g:3597:4: ( ( ruleExpression )=>this_Expression_0= ruleExpression )
                    // InternalMyDsl.g:3598:5: ( ruleExpression )=>this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPrimaryExpr3Access().getExpressionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
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
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr3Access().getRightParenthesisKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3617:3: (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 )
                    {
                    // InternalMyDsl.g:3617:3: (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 )
                    // InternalMyDsl.g:3618:4: this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr3Access().getTypeParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_11);
                    this_Type_2=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Type_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr3Access().getRightParenthesisKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr3Access().getPrimaryExpr1ParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr1_4=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr1_4);
                      			
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
    // $ANTLR end "rulePrimaryExpr3"


    // $ANTLR start "entryRulePrimaryExpr4"
    // InternalMyDsl.g:3648:1: entryRulePrimaryExpr4 returns [String current=null] : iv_rulePrimaryExpr4= rulePrimaryExpr4 EOF ;
    public final String entryRulePrimaryExpr4() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr4 = null;


        try {
            // InternalMyDsl.g:3648:52: (iv_rulePrimaryExpr4= rulePrimaryExpr4 EOF )
            // InternalMyDsl.g:3649:2: iv_rulePrimaryExpr4= rulePrimaryExpr4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr4Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr4=rulePrimaryExpr4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr4.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr4"


    // $ANTLR start "rulePrimaryExpr4"
    // InternalMyDsl.g:3655:1: rulePrimaryExpr4 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr1_1= rulePrimaryExpr1 ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr4() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr1_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3661:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr1_1= rulePrimaryExpr1 ) )
            // InternalMyDsl.g:3662:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr1_1= rulePrimaryExpr1 )
            {
            // InternalMyDsl.g:3662:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr1_1= rulePrimaryExpr1 )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==67) ) {
                alt60=1;
            }
            else if ( (LA60_0==61||LA60_0==63) ) {
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
                    // InternalMyDsl.g:3663:3: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr4Access().getLiteralValueParserRuleCall_0());
                      		
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
                    // InternalMyDsl.g:3674:3: this_PrimaryExpr1_1= rulePrimaryExpr1
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr4Access().getPrimaryExpr1ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr1_1=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExpr1_1);
                      		
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
    // $ANTLR end "rulePrimaryExpr4"


    // $ANTLR start "entryRulePrimaryExpr5"
    // InternalMyDsl.g:3688:1: entryRulePrimaryExpr5 returns [String current=null] : iv_rulePrimaryExpr5= rulePrimaryExpr5 EOF ;
    public final String entryRulePrimaryExpr5() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr5 = null;


        try {
            // InternalMyDsl.g:3688:52: (iv_rulePrimaryExpr5= rulePrimaryExpr5 EOF )
            // InternalMyDsl.g:3689:2: iv_rulePrimaryExpr5= rulePrimaryExpr5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr5Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr5=rulePrimaryExpr5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr5.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr5"


    // $ANTLR start "rulePrimaryExpr5"
    // InternalMyDsl.g:3695:1: rulePrimaryExpr5 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr2_1= rulePrimaryExpr2 ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr5() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LiteralValue_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr2_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3701:2: ( (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr2_1= rulePrimaryExpr2 ) )
            // InternalMyDsl.g:3702:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr2_1= rulePrimaryExpr2 )
            {
            // InternalMyDsl.g:3702:2: (this_LiteralValue_0= ruleLiteralValue | this_PrimaryExpr2_1= rulePrimaryExpr2 )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ANY_OTHER||LA61_0==61||LA61_0==63) ) {
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
                    // InternalMyDsl.g:3703:3: this_LiteralValue_0= ruleLiteralValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr5Access().getLiteralValueParserRuleCall_0());
                      		
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
                    // InternalMyDsl.g:3714:3: this_PrimaryExpr2_1= rulePrimaryExpr2
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr5Access().getPrimaryExpr2ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr2_1=rulePrimaryExpr2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExpr2_1);
                      		
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
    // $ANTLR end "rulePrimaryExpr5"


    // $ANTLR start "entryRulePrimaryExpr6"
    // InternalMyDsl.g:3728:1: entryRulePrimaryExpr6 returns [String current=null] : iv_rulePrimaryExpr6= rulePrimaryExpr6 EOF ;
    public final String entryRulePrimaryExpr6() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr6 = null;


        try {
            // InternalMyDsl.g:3728:52: (iv_rulePrimaryExpr6= rulePrimaryExpr6 EOF )
            // InternalMyDsl.g:3729:2: iv_rulePrimaryExpr6= rulePrimaryExpr6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr6Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr6=rulePrimaryExpr6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr6.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr6"


    // $ANTLR start "rulePrimaryExpr6"
    // InternalMyDsl.g:3735:1: rulePrimaryExpr6 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4 ) | (kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue ) | (kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4 ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr6() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ArrayLength_0 = null;

        AntlrDatatypeRuleToken this_ElementType_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr4_3 = null;

        AntlrDatatypeRuleToken this_ElementType_6 = null;

        AntlrDatatypeRuleToken this_LiteralValue_7 = null;

        AntlrDatatypeRuleToken this_ElementType_9 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr4_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3741:2: ( ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4 ) | (kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue ) | (kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4 ) ) )
            // InternalMyDsl.g:3742:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4 ) | (kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue ) | (kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4 ) )
            {
            // InternalMyDsl.g:3742:2: ( (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4 ) | (kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue ) | (kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4 ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMALS:
            case RULE_IDENTIFIER:
            case RULE_STRUCT:
            case RULE_STRING_LIT:
            case RULE_FUNC:
            case RULE_INTERFACE:
            case RULE_MAP:
            case RULE_CHAN:
            case RULE_INT_LIT:
            case RULE_UNARY_OP:
            case 61:
            case 63:
            case 65:
            case 70:
            case 73:
                {
                alt62=1;
                }
                break;
            case 72:
                {
                alt62=2;
                }
                break;
            case 66:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:3743:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4 )
                    {
                    // InternalMyDsl.g:3743:3: (this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4 )
                    // InternalMyDsl.g:3744:4: this_ArrayLength_0= ruleArrayLength kw= ']' this_ElementType_2= ruleElementType this_PrimaryExpr4_3= rulePrimaryExpr4
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getArrayLengthParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_ArrayLength_0=ruleArrayLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ArrayLength_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr6Access().getRightSquareBracketKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getElementTypeParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_ElementType_2=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getPrimaryExpr4ParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr4_3=rulePrimaryExpr4();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr4_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3781:3: (kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue )
                    {
                    // InternalMyDsl.g:3781:3: (kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue )
                    // InternalMyDsl.g:3782:4: kw= '...' kw= ']' this_ElementType_6= ruleElementType this_LiteralValue_7= ruleLiteralValue
                    {
                    kw=(Token)match(input,72,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr6Access().getFullStopFullStopFullStopKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr6Access().getRightSquareBracketKeyword_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getElementTypeParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_ElementType_6=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getLiteralValueParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralValue_7=ruleLiteralValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_LiteralValue_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3814:3: (kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4 )
                    {
                    // InternalMyDsl.g:3814:3: (kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4 )
                    // InternalMyDsl.g:3815:4: kw= ']' this_ElementType_9= ruleElementType this_PrimaryExpr4_10= rulePrimaryExpr4
                    {
                    kw=(Token)match(input,66,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExpr6Access().getRightSquareBracketKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getElementTypeParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_48);
                    this_ElementType_9=ruleElementType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ElementType_9);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExpr6Access().getPrimaryExpr4ParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr4_10=rulePrimaryExpr4();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr4_10);
                      			
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
    // $ANTLR end "rulePrimaryExpr6"


    // $ANTLR start "entryRulePrimaryExpr7"
    // InternalMyDsl.g:3845:1: entryRulePrimaryExpr7 returns [String current=null] : iv_rulePrimaryExpr7= rulePrimaryExpr7 EOF ;
    public final String entryRulePrimaryExpr7() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr7 = null;


        try {
            // InternalMyDsl.g:3845:52: (iv_rulePrimaryExpr7= rulePrimaryExpr7 EOF )
            // InternalMyDsl.g:3846:2: iv_rulePrimaryExpr7= rulePrimaryExpr7 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpr7Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr7=rulePrimaryExpr7();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr7.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr7"


    // $ANTLR start "rulePrimaryExpr7"
    // InternalMyDsl.g:3852:1: rulePrimaryExpr7 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExpr1_1= rulePrimaryExpr1 ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr7() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FunctionBody_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr1_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3858:2: ( (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExpr1_1= rulePrimaryExpr1 ) )
            // InternalMyDsl.g:3859:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExpr1_1= rulePrimaryExpr1 )
            {
            // InternalMyDsl.g:3859:2: (this_FunctionBody_0= ruleFunctionBody | this_PrimaryExpr1_1= rulePrimaryExpr1 )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==67) ) {
                alt63=1;
            }
            else if ( (LA63_0==61||LA63_0==63) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalMyDsl.g:3860:3: this_FunctionBody_0= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr7Access().getFunctionBodyParserRuleCall_0());
                      		
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
                    // InternalMyDsl.g:3871:3: this_PrimaryExpr1_1= rulePrimaryExpr1
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpr7Access().getPrimaryExpr1ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpr1_1=rulePrimaryExpr1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimaryExpr1_1);
                      		
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
    // $ANTLR end "rulePrimaryExpr7"


    // $ANTLR start "entryRulePrimaryExprLinha"
    // InternalMyDsl.g:3885:1: entryRulePrimaryExprLinha returns [String current=null] : iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF ;
    public final String entryRulePrimaryExprLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha = null;


        try {
            // InternalMyDsl.g:3885:56: (iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF )
            // InternalMyDsl.g:3886:2: iv_rulePrimaryExprLinha= rulePrimaryExprLinha EOF
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
    // InternalMyDsl.g:3892:1: rulePrimaryExprLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PrimaryExprLinha1_1 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_2 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha2_4 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_5 = null;

        AntlrDatatypeRuleToken this_Arguments_6 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3898:2: ( ( (kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) ) )
            // InternalMyDsl.g:3899:2: ( (kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            {
            // InternalMyDsl.g:3899:2: ( (kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha ) | (kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha ) | (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt64=1;
                }
                break;
            case 65:
                {
                alt64=2;
                }
                break;
            case 63:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:3900:3: (kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3900:3: (kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3901:4: kw= '.' this_PrimaryExprLinha1_1= rulePrimaryExprLinha1 this_PrimaryExprLinha_2= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,61,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getFullStopKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinha1ParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExprLinha1_1=rulePrimaryExprLinha1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha1_1);
                      			
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
                    // InternalMyDsl.g:3928:3: (kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3928:3: (kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3929:4: kw= '[' this_PrimaryExprLinha2_4= rulePrimaryExprLinha2 this_PrimaryExprLinha_5= rulePrimaryExprLinha
                    {
                    kw=(Token)match(input,65,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinhaAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getPrimaryExprLinha2ParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
                    this_PrimaryExprLinha2_4=rulePrimaryExprLinha2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha2_4);
                      			
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
                    // InternalMyDsl.g:3956:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    {
                    // InternalMyDsl.g:3956:3: (this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha )
                    // InternalMyDsl.g:3957:4: this_Arguments_6= ruleArguments this_PrimaryExprLinha_7= rulePrimaryExprLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinhaAccess().getArgumentsParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_47);
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


    // $ANTLR start "entryRulePrimaryExprLinha1"
    // InternalMyDsl.g:3982:1: entryRulePrimaryExprLinha1 returns [String current=null] : iv_rulePrimaryExprLinha1= rulePrimaryExprLinha1 EOF ;
    public final String entryRulePrimaryExprLinha1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha1 = null;


        try {
            // InternalMyDsl.g:3982:57: (iv_rulePrimaryExprLinha1= rulePrimaryExprLinha1 EOF )
            // InternalMyDsl.g:3983:2: iv_rulePrimaryExprLinha1= rulePrimaryExprLinha1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha1=rulePrimaryExprLinha1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha1.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha1"


    // $ANTLR start "rulePrimaryExprLinha1"
    // InternalMyDsl.g:3989:1: rulePrimaryExprLinha1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3995:2: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) ) )
            // InternalMyDsl.g:3996:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            {
            // InternalMyDsl.g:3996:2: (this_IDENTIFIER_0= RULE_IDENTIFIER | (kw= '(' this_Type_2= ruleType kw= ')' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_IDENTIFIER) ) {
                alt65=1;
            }
            else if ( (LA65_0==63) ) {
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
                    // InternalMyDsl.g:3997:3: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_IDENTIFIER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_IDENTIFIER_0, grammarAccess.getPrimaryExprLinha1Access().getIDENTIFIERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4005:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    {
                    // InternalMyDsl.g:4005:3: (kw= '(' this_Type_2= ruleType kw= ')' )
                    // InternalMyDsl.g:4006:4: kw= '(' this_Type_2= ruleType kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha1Access().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha1Access().getTypeParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_11);
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
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha1Access().getRightParenthesisKeyword_1_2());
                      			
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
    // $ANTLR end "rulePrimaryExprLinha1"


    // $ANTLR start "entryRulePrimaryExprLinha2"
    // InternalMyDsl.g:4031:1: entryRulePrimaryExprLinha2 returns [String current=null] : iv_rulePrimaryExprLinha2= rulePrimaryExprLinha2 EOF ;
    public final String entryRulePrimaryExprLinha2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha2 = null;


        try {
            // InternalMyDsl.g:4031:57: (iv_rulePrimaryExprLinha2= rulePrimaryExprLinha2 EOF )
            // InternalMyDsl.g:4032:2: iv_rulePrimaryExprLinha2= rulePrimaryExprLinha2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha2=rulePrimaryExprLinha2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha2.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha2"


    // $ANTLR start "rulePrimaryExprLinha2"
    // InternalMyDsl.g:4038:1: rulePrimaryExprLinha2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21 ) | (kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22 ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha21_1 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha22_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4044:2: ( ( (this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21 ) | (kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22 ) ) )
            // InternalMyDsl.g:4045:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21 ) | (kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22 ) )
            {
            // InternalMyDsl.g:4045:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21 ) | (kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22 ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DECIMALS||LA66_0==RULE_IDENTIFIER||(LA66_0>=RULE_STRUCT && LA66_0<=RULE_CHAN)||(LA66_0>=RULE_INT_LIT && LA66_0<=RULE_UNARY_OP)||LA66_0==61||LA66_0==63||LA66_0==65||LA66_0==70||LA66_0==73) ) {
                alt66=1;
            }
            else if ( (LA66_0==76) ) {
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
                    // InternalMyDsl.g:4046:3: (this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21 )
                    {
                    // InternalMyDsl.g:4046:3: (this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21 )
                    // InternalMyDsl.g:4047:4: this_Expression_0= ruleExpression this_PrimaryExprLinha21_1= rulePrimaryExprLinha21
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha2Access().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_51);
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

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha2Access().getPrimaryExprLinha21ParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha21_1=rulePrimaryExprLinha21();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha21_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4069:3: (kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22 )
                    {
                    // InternalMyDsl.g:4069:3: (kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22 )
                    // InternalMyDsl.g:4070:4: kw= ':' this_PrimaryExprLinha22_3= rulePrimaryExprLinha22
                    {
                    kw=(Token)match(input,76,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha2Access().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha2Access().getPrimaryExprLinha22ParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha22_3=rulePrimaryExprLinha22();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha22_3);
                      			
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
    // $ANTLR end "rulePrimaryExprLinha2"


    // $ANTLR start "entryRulePrimaryExprLinha21"
    // InternalMyDsl.g:4090:1: entryRulePrimaryExprLinha21 returns [String current=null] : iv_rulePrimaryExprLinha21= rulePrimaryExprLinha21 EOF ;
    public final String entryRulePrimaryExprLinha21() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha21 = null;


        try {
            // InternalMyDsl.g:4090:58: (iv_rulePrimaryExprLinha21= rulePrimaryExprLinha21 EOF )
            // InternalMyDsl.g:4091:2: iv_rulePrimaryExprLinha21= rulePrimaryExprLinha21 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha21Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha21=rulePrimaryExprLinha21();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha21.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha21"


    // $ANTLR start "rulePrimaryExprLinha21"
    // InternalMyDsl.g:4097:1: rulePrimaryExprLinha21 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ']' | (kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211 ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha21() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PrimaryExprLinha211_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4103:2: ( (kw= ']' | (kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211 ) ) )
            // InternalMyDsl.g:4104:2: (kw= ']' | (kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211 ) )
            {
            // InternalMyDsl.g:4104:2: (kw= ']' | (kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211 ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==66) ) {
                alt67=1;
            }
            else if ( (LA67_0==76) ) {
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
                    // InternalMyDsl.g:4105:3: kw= ']'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinha21Access().getRightSquareBracketKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4111:3: (kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211 )
                    {
                    // InternalMyDsl.g:4111:3: (kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211 )
                    // InternalMyDsl.g:4112:4: kw= ':' this_PrimaryExprLinha211_2= rulePrimaryExprLinha211
                    {
                    kw=(Token)match(input,76,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha21Access().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha21Access().getPrimaryExprLinha211ParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha211_2=rulePrimaryExprLinha211();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha211_2);
                      			
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
    // $ANTLR end "rulePrimaryExprLinha21"


    // $ANTLR start "entryRulePrimaryExprLinha211"
    // InternalMyDsl.g:4132:1: entryRulePrimaryExprLinha211 returns [String current=null] : iv_rulePrimaryExprLinha211= rulePrimaryExprLinha211 EOF ;
    public final String entryRulePrimaryExprLinha211() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha211 = null;


        try {
            // InternalMyDsl.g:4132:59: (iv_rulePrimaryExprLinha211= rulePrimaryExprLinha211 EOF )
            // InternalMyDsl.g:4133:2: iv_rulePrimaryExprLinha211= rulePrimaryExprLinha211 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha211Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha211=rulePrimaryExprLinha211();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha211.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha211"


    // $ANTLR start "rulePrimaryExprLinha211"
    // InternalMyDsl.g:4139:1: rulePrimaryExprLinha211 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111 ) | kw= ']' ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha211() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha2111_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4145:2: ( ( (this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111 ) | kw= ']' ) )
            // InternalMyDsl.g:4146:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111 ) | kw= ']' )
            {
            // InternalMyDsl.g:4146:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111 ) | kw= ']' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_DECIMALS||LA68_0==RULE_IDENTIFIER||(LA68_0>=RULE_STRUCT && LA68_0<=RULE_CHAN)||(LA68_0>=RULE_INT_LIT && LA68_0<=RULE_UNARY_OP)||LA68_0==61||LA68_0==63||LA68_0==65||LA68_0==70||LA68_0==73) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
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
                    // InternalMyDsl.g:4147:3: (this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111 )
                    {
                    // InternalMyDsl.g:4147:3: (this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111 )
                    // InternalMyDsl.g:4148:4: this_Expression_0= ruleExpression this_PrimaryExprLinha2111_1= rulePrimaryExprLinha2111
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha211Access().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_51);
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

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha211Access().getPrimaryExprLinha2111ParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha2111_1=rulePrimaryExprLinha2111();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha2111_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4170:3: kw= ']'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinha211Access().getRightSquareBracketKeyword_1());
                      		
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
    // $ANTLR end "rulePrimaryExprLinha211"


    // $ANTLR start "entryRulePrimaryExprLinha2111"
    // InternalMyDsl.g:4179:1: entryRulePrimaryExprLinha2111 returns [String current=null] : iv_rulePrimaryExprLinha2111= rulePrimaryExprLinha2111 EOF ;
    public final String entryRulePrimaryExprLinha2111() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha2111 = null;


        try {
            // InternalMyDsl.g:4179:60: (iv_rulePrimaryExprLinha2111= rulePrimaryExprLinha2111 EOF )
            // InternalMyDsl.g:4180:2: iv_rulePrimaryExprLinha2111= rulePrimaryExprLinha2111 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha2111Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha2111=rulePrimaryExprLinha2111();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha2111.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha2111"


    // $ANTLR start "rulePrimaryExprLinha2111"
    // InternalMyDsl.g:4186:1: rulePrimaryExprLinha2111 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha2111() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4192:2: ( (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) ) )
            // InternalMyDsl.g:4193:2: (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) )
            {
            // InternalMyDsl.g:4193:2: (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==66) ) {
                alt69=1;
            }
            else if ( (LA69_0==76) ) {
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
                    // InternalMyDsl.g:4194:3: kw= ']'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinha2111Access().getRightSquareBracketKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4200:3: (kw= ':' this_Expression_2= ruleExpression kw= ']' )
                    {
                    // InternalMyDsl.g:4200:3: (kw= ':' this_Expression_2= ruleExpression kw= ']' )
                    // InternalMyDsl.g:4201:4: kw= ':' this_Expression_2= ruleExpression kw= ']'
                    {
                    kw=(Token)match(input,76,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha2111Access().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha2111Access().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha2111Access().getRightSquareBracketKeyword_1_2());
                      			
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
    // $ANTLR end "rulePrimaryExprLinha2111"


    // $ANTLR start "entryRulePrimaryExprLinha22"
    // InternalMyDsl.g:4226:1: entryRulePrimaryExprLinha22 returns [String current=null] : iv_rulePrimaryExprLinha22= rulePrimaryExprLinha22 EOF ;
    public final String entryRulePrimaryExprLinha22() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha22 = null;


        try {
            // InternalMyDsl.g:4226:58: (iv_rulePrimaryExprLinha22= rulePrimaryExprLinha22 EOF )
            // InternalMyDsl.g:4227:2: iv_rulePrimaryExprLinha22= rulePrimaryExprLinha22 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha22Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha22=rulePrimaryExprLinha22();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha22.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha22"


    // $ANTLR start "rulePrimaryExprLinha22"
    // InternalMyDsl.g:4233:1: rulePrimaryExprLinha22 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221 ) | kw= ']' ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha22() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExprLinha221_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4239:2: ( ( (this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221 ) | kw= ']' ) )
            // InternalMyDsl.g:4240:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221 ) | kw= ']' )
            {
            // InternalMyDsl.g:4240:2: ( (this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221 ) | kw= ']' )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_DECIMALS||LA70_0==RULE_IDENTIFIER||(LA70_0>=RULE_STRUCT && LA70_0<=RULE_CHAN)||(LA70_0>=RULE_INT_LIT && LA70_0<=RULE_UNARY_OP)||LA70_0==61||LA70_0==63||LA70_0==65||LA70_0==70||LA70_0==73) ) {
                alt70=1;
            }
            else if ( (LA70_0==66) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalMyDsl.g:4241:3: (this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221 )
                    {
                    // InternalMyDsl.g:4241:3: (this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221 )
                    // InternalMyDsl.g:4242:4: this_Expression_0= ruleExpression this_PrimaryExprLinha221_1= rulePrimaryExprLinha221
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha22Access().getExpressionParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_51);
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

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha22Access().getPrimaryExprLinha221ParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExprLinha221_1=rulePrimaryExprLinha221();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExprLinha221_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4264:3: kw= ']'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinha22Access().getRightSquareBracketKeyword_1());
                      		
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
    // $ANTLR end "rulePrimaryExprLinha22"


    // $ANTLR start "entryRulePrimaryExprLinha221"
    // InternalMyDsl.g:4273:1: entryRulePrimaryExprLinha221 returns [String current=null] : iv_rulePrimaryExprLinha221= rulePrimaryExprLinha221 EOF ;
    public final String entryRulePrimaryExprLinha221() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExprLinha221 = null;


        try {
            // InternalMyDsl.g:4273:59: (iv_rulePrimaryExprLinha221= rulePrimaryExprLinha221 EOF )
            // InternalMyDsl.g:4274:2: iv_rulePrimaryExprLinha221= rulePrimaryExprLinha221 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprLinha221Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExprLinha221=rulePrimaryExprLinha221();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExprLinha221.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExprLinha221"


    // $ANTLR start "rulePrimaryExprLinha221"
    // InternalMyDsl.g:4280:1: rulePrimaryExprLinha221 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExprLinha221() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4286:2: ( (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) ) )
            // InternalMyDsl.g:4287:2: (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) )
            {
            // InternalMyDsl.g:4287:2: (kw= ']' | (kw= ':' this_Expression_2= ruleExpression kw= ']' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==66) ) {
                alt71=1;
            }
            else if ( (LA71_0==76) ) {
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
                    // InternalMyDsl.g:4288:3: kw= ']'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimaryExprLinha221Access().getRightSquareBracketKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4294:3: (kw= ':' this_Expression_2= ruleExpression kw= ']' )
                    {
                    // InternalMyDsl.g:4294:3: (kw= ':' this_Expression_2= ruleExpression kw= ']' )
                    // InternalMyDsl.g:4295:4: kw= ':' this_Expression_2= ruleExpression kw= ']'
                    {
                    kw=(Token)match(input,76,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha221Access().getColonKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprLinha221Access().getExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_15);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getPrimaryExprLinha221Access().getRightSquareBracketKeyword_1_2());
                      			
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
    // $ANTLR end "rulePrimaryExprLinha221"


    // $ANTLR start "entryRuleArguments"
    // InternalMyDsl.g:4320:1: entryRuleArguments returns [String current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final String entryRuleArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArguments = null;


        try {
            // InternalMyDsl.g:4320:49: (iv_ruleArguments= ruleArguments EOF )
            // InternalMyDsl.g:4321:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalMyDsl.g:4327:1: ruleArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;

        AntlrDatatypeRuleToken this_ExpressionList_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4333:2: ( (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' ) )
            // InternalMyDsl.g:4334:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            {
            // InternalMyDsl.g:4334:2: (kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')' )
            // InternalMyDsl.g:4335:3: kw= '(' ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )? kw= ')'
            {
            kw=(Token)match(input,63,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalMyDsl.g:4340:3: ( ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )? )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_DECIMALS||LA76_0==RULE_IDENTIFIER||(LA76_0>=RULE_STRUCT && LA76_0<=RULE_CHAN)||(LA76_0>=RULE_INT_LIT && LA76_0<=RULE_UNARY_OP)||LA76_0==61||LA76_0==63||LA76_0==65||LA76_0==70||LA76_0==73) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMyDsl.g:4341:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) ) (kw= '...' )? (kw= ',' )?
                    {
                    // InternalMyDsl.g:4341:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // InternalMyDsl.g:4342:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            {
                            // InternalMyDsl.g:4342:5: ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList )
                            // InternalMyDsl.g:4343:6: ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_0());
                              					
                            }
                            pushFollow(FOLLOW_53);
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
                            // InternalMyDsl.g:4356:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            {
                            // InternalMyDsl.g:4356:5: (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? )
                            // InternalMyDsl.g:4357:6: this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getArgumentsAccess().getTypeParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_53);
                            this_Type_2=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_Type_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            // InternalMyDsl.g:4367:6: (kw= ',' this_ExpressionList_4= ruleExpressionList )?
                            int alt72=2;
                            int LA72_0 = input.LA(1);

                            if ( (LA72_0==71) ) {
                                int LA72_1 = input.LA(2);

                                if ( (LA72_1==RULE_DECIMALS||LA72_1==RULE_IDENTIFIER||(LA72_1>=RULE_STRUCT && LA72_1<=RULE_CHAN)||(LA72_1>=RULE_INT_LIT && LA72_1<=RULE_UNARY_OP)||LA72_1==61||LA72_1==63||LA72_1==65||LA72_1==70||LA72_1==73) ) {
                                    alt72=1;
                                }
                            }
                            switch (alt72) {
                                case 1 :
                                    // InternalMyDsl.g:4368:7: kw= ',' this_ExpressionList_4= ruleExpressionList
                                    {
                                    kw=(Token)match(input,71,FOLLOW_37); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							current.merge(kw);
                                      							newLeafNode(kw, grammarAccess.getArgumentsAccess().getCommaKeyword_1_0_1_1_0());
                                      						
                                    }
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getArgumentsAccess().getExpressionListParserRuleCall_1_0_1_1_1());
                                      						
                                    }
                                    pushFollow(FOLLOW_53);
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

                    // InternalMyDsl.g:4386:4: (kw= '...' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==72) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalMyDsl.g:4387:5: kw= '...'
                            {
                            kw=(Token)match(input,72,FOLLOW_23); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_1_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMyDsl.g:4393:4: (kw= ',' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==71) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalMyDsl.g:4394:5: kw= ','
                            {
                            kw=(Token)match(input,71,FOLLOW_11); if (state.failed) return current;
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


    // $ANTLR start "entryRuleReceiverType"
    // InternalMyDsl.g:4410:1: entryRuleReceiverType returns [String current=null] : iv_ruleReceiverType= ruleReceiverType EOF ;
    public final String entryRuleReceiverType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReceiverType = null;


        try {
            // InternalMyDsl.g:4410:52: (iv_ruleReceiverType= ruleReceiverType EOF )
            // InternalMyDsl.g:4411:2: iv_ruleReceiverType= ruleReceiverType EOF
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
    // InternalMyDsl.g:4417:1: ruleReceiverType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Type_0= ruleType ;
    public final AntlrDatatypeRuleToken ruleReceiverType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Type_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4423:2: (this_Type_0= ruleType )
            // InternalMyDsl.g:4424:2: this_Type_0= ruleType
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


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:4437:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:4437:50: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:4438:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:4444:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha ) ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_UnaryExpr_0 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4450:2: ( (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha ) )
            // InternalMyDsl.g:4451:2: (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha )
            {
            // InternalMyDsl.g:4451:2: (this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha )
            // InternalMyDsl.g:4452:3: this_UnaryExpr_0= ruleUnaryExpr this_Expression_Linha_1= ruleExpression_Linha
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:4476:1: entryRuleExpression_Linha returns [String current=null] : iv_ruleExpression_Linha= ruleExpression_Linha EOF ;
    public final String entryRuleExpression_Linha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression_Linha = null;


        try {
            // InternalMyDsl.g:4476:56: (iv_ruleExpression_Linha= ruleExpression_Linha EOF )
            // InternalMyDsl.g:4477:2: iv_ruleExpression_Linha= ruleExpression_Linha EOF
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
    // InternalMyDsl.g:4483:1: ruleExpression_Linha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleExpression_Linha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_3=null;
        AntlrDatatypeRuleToken this_BINARY_OP_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4489:2: ( ( (this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:4490:2: ( (this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:4490:2: ( (this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha ) | this_ANY_OTHER_3= RULE_ANY_OTHER )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_REL_OP && LA77_0<=RULE_MUL_OP)||(LA77_0>=77 && LA77_0<=78)) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ANY_OTHER) ) {
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
                    // InternalMyDsl.g:4491:3: (this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
                    {
                    // InternalMyDsl.g:4491:3: (this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha )
                    // InternalMyDsl.g:4492:4: this_BINARY_OP_0= ruleBINARY_OP this_Expression_1= ruleExpression this_Expression_Linha_2= ruleExpression_Linha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression_LinhaAccess().getBINARY_OPParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_BINARY_OP_0=ruleBINARY_OP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_BINARY_OP_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression_LinhaAccess().getExpressionParserRuleCall_0_1());
                      			
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
                    // InternalMyDsl.g:4524:3: this_ANY_OTHER_3= RULE_ANY_OTHER
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
    // InternalMyDsl.g:4535:1: entryRuleUnaryExpr returns [String current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final String entryRuleUnaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryExpr = null;


        try {
            // InternalMyDsl.g:4535:49: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMyDsl.g:4536:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
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
    // InternalMyDsl.g:4542:1: ruleUnaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleUnaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNARY_OP_1=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_0 = null;

        AntlrDatatypeRuleToken this_UnaryExpr_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4548:2: ( (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) ) )
            // InternalMyDsl.g:4549:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            {
            // InternalMyDsl.g:4549:2: (this_PrimaryExpr_0= rulePrimaryExpr | (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_DECIMALS||LA78_0==RULE_IDENTIFIER||(LA78_0>=RULE_STRUCT && LA78_0<=RULE_CHAN)||LA78_0==RULE_INT_LIT||LA78_0==61||LA78_0==63||LA78_0==65||LA78_0==70||LA78_0==73) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_UNARY_OP) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:4550:3: this_PrimaryExpr_0= rulePrimaryExpr
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
                    // InternalMyDsl.g:4561:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    {
                    // InternalMyDsl.g:4561:3: (this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr )
                    // InternalMyDsl.g:4562:4: this_UNARY_OP_1= RULE_UNARY_OP this_UnaryExpr_2= ruleUnaryExpr
                    {
                    this_UNARY_OP_1=(Token)match(input,RULE_UNARY_OP,FOLLOW_37); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBINARY_OP"
    // InternalMyDsl.g:4584:1: entryRuleBINARY_OP returns [String current=null] : iv_ruleBINARY_OP= ruleBINARY_OP EOF ;
    public final String entryRuleBINARY_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBINARY_OP = null;


        try {
            // InternalMyDsl.g:4584:49: (iv_ruleBINARY_OP= ruleBINARY_OP EOF )
            // InternalMyDsl.g:4585:2: iv_ruleBINARY_OP= ruleBINARY_OP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBINARY_OPRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBINARY_OP=ruleBINARY_OP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBINARY_OP.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBINARY_OP"


    // $ANTLR start "ruleBINARY_OP"
    // InternalMyDsl.g:4591:1: ruleBINARY_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) ;
    public final AntlrDatatypeRuleToken ruleBINARY_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REL_OP_2=null;
        Token this_ADD_OP_3=null;
        Token this_MUL_OP_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4597:2: ( (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP ) )
            // InternalMyDsl.g:4598:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            {
            // InternalMyDsl.g:4598:2: (kw= '||' | kw= '&&' | this_REL_OP_2= RULE_REL_OP | this_ADD_OP_3= RULE_ADD_OP | this_MUL_OP_4= RULE_MUL_OP )
            int alt79=5;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt79=1;
                }
                break;
            case 78:
                {
                alt79=2;
                }
                break;
            case RULE_REL_OP:
                {
                alt79=3;
                }
                break;
            case RULE_ADD_OP:
                {
                alt79=4;
                }
                break;
            case RULE_MUL_OP:
                {
                alt79=5;
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
                    // InternalMyDsl.g:4599:3: kw= '||'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBINARY_OPAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4605:3: kw= '&&'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBINARY_OPAccess().getAmpersandAmpersandKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4611:3: this_REL_OP_2= RULE_REL_OP
                    {
                    this_REL_OP_2=(Token)match(input,RULE_REL_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REL_OP_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REL_OP_2, grammarAccess.getBINARY_OPAccess().getREL_OPTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4619:3: this_ADD_OP_3= RULE_ADD_OP
                    {
                    this_ADD_OP_3=(Token)match(input,RULE_ADD_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ADD_OP_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ADD_OP_3, grammarAccess.getBINARY_OPAccess().getADD_OPTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:4627:3: this_MUL_OP_4= RULE_MUL_OP
                    {
                    this_MUL_OP_4=(Token)match(input,RULE_MUL_OP,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MUL_OP_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MUL_OP_4, grammarAccess.getBINARY_OPAccess().getMUL_OPTerminalRuleCall_4());
                      		
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
    // $ANTLR end "ruleBINARY_OP"


    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:4638:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:4638:49: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:4639:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyDsl.g:4645:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) ;
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
            // InternalMyDsl.g:4651:2: ( (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt ) )
            // InternalMyDsl.g:4652:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            {
            // InternalMyDsl.g:4652:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )
            int alt80=15;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:4653:3: this_Declaration_0= ruleDeclaration
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
                    // InternalMyDsl.g:4664:3: this_LabeledStmt_1= ruleLabeledStmt
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
                    // InternalMyDsl.g:4675:3: this_SimpleStmt_2= ruleSimpleStmt
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
                    // InternalMyDsl.g:4686:3: this_GoStmt_3= ruleGoStmt
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
                    // InternalMyDsl.g:4697:3: this_ReturnStmt_4= ruleReturnStmt
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
                    // InternalMyDsl.g:4708:3: this_BreakStmt_5= ruleBreakStmt
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
                    // InternalMyDsl.g:4719:3: this_ContinueStmt_6= ruleContinueStmt
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
                    // InternalMyDsl.g:4730:3: this_GotoStmt_7= ruleGotoStmt
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
                    // InternalMyDsl.g:4741:3: this_FallthroughStmt_8= ruleFallthroughStmt
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
                    // InternalMyDsl.g:4752:3: this_Block_9= ruleBlock
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
                    // InternalMyDsl.g:4763:3: this_IfStmt_10= ruleIfStmt
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
                    // InternalMyDsl.g:4774:3: this_SwitchStmt_11= ruleSwitchStmt
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
                    // InternalMyDsl.g:4785:3: this_SelectStmt_12= ruleSelectStmt
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
                    // InternalMyDsl.g:4796:3: this_ForStmt_13= ruleForStmt
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
                    // InternalMyDsl.g:4807:3: this_DeferStmt_14= ruleDeferStmt
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


    // $ANTLR start "entryRuleSimpleStmt"
    // InternalMyDsl.g:4821:1: entryRuleSimpleStmt returns [String current=null] : iv_ruleSimpleStmt= ruleSimpleStmt EOF ;
    public final String entryRuleSimpleStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmt = null;


        try {
            // InternalMyDsl.g:4821:50: (iv_ruleSimpleStmt= ruleSimpleStmt EOF )
            // InternalMyDsl.g:4822:2: iv_ruleSimpleStmt= ruleSimpleStmt EOF
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
    // InternalMyDsl.g:4828:1: ruleSimpleStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EmptyStmt_0= ruleEmptyStmt | (this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha ) | this_ShortVarDecl_3= ruleShortVarDecl ) ;
    public final AntlrDatatypeRuleToken ruleSimpleStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EmptyStmt_0 = null;

        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_SimpleStmtLinha_2 = null;

        AntlrDatatypeRuleToken this_ShortVarDecl_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4834:2: ( (this_EmptyStmt_0= ruleEmptyStmt | (this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha ) | this_ShortVarDecl_3= ruleShortVarDecl ) )
            // InternalMyDsl.g:4835:2: (this_EmptyStmt_0= ruleEmptyStmt | (this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha ) | this_ShortVarDecl_3= ruleShortVarDecl )
            {
            // InternalMyDsl.g:4835:2: (this_EmptyStmt_0= ruleEmptyStmt | (this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha ) | this_ShortVarDecl_3= ruleShortVarDecl )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt81=1;
                }
                break;
            case RULE_DECIMALS:
            case RULE_STRUCT:
            case RULE_STRING_LIT:
            case RULE_FUNC:
            case RULE_INTERFACE:
            case RULE_MAP:
            case RULE_CHAN:
            case RULE_INT_LIT:
            case RULE_UNARY_OP:
            case 61:
            case 63:
            case 65:
            case 70:
            case 73:
                {
                alt81=2;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA81_3 = input.LA(2);

                if ( (LA81_3==RULE_ANY_OTHER||LA81_3==61) ) {
                    alt81=2;
                }
                else if ( (LA81_3==71||LA81_3==75) ) {
                    alt81=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 3, input);

                    throw nvae;
                }
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
                    // InternalMyDsl.g:4836:3: this_EmptyStmt_0= ruleEmptyStmt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getEmptyStmtParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EmptyStmt_0=ruleEmptyStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EmptyStmt_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4847:3: (this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha )
                    {
                    // InternalMyDsl.g:4847:3: (this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha )
                    // InternalMyDsl.g:4848:4: this_Expression_1= ruleExpression this_SimpleStmtLinha_2= ruleSimpleStmtLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtAccess().getExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_55);
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

                      				newCompositeNode(grammarAccess.getSimpleStmtAccess().getSimpleStmtLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SimpleStmtLinha_2=ruleSimpleStmtLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SimpleStmtLinha_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:4870:3: this_ShortVarDecl_3= ruleShortVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSimpleStmtAccess().getShortVarDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShortVarDecl_3=ruleShortVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ShortVarDecl_3);
                      		
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
    // $ANTLR end "ruleSimpleStmt"


    // $ANTLR start "entryRuleSimpleStmtLinha"
    // InternalMyDsl.g:4884:1: entryRuleSimpleStmtLinha returns [String current=null] : iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF ;
    public final String entryRuleSimpleStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleStmtLinha = null;


        try {
            // InternalMyDsl.g:4884:55: (iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF )
            // InternalMyDsl.g:4885:2: iv_ruleSimpleStmtLinha= ruleSimpleStmtLinha EOF
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
    // InternalMyDsl.g:4891:1: ruleSimpleStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) ;
    public final AntlrDatatypeRuleToken ruleSimpleStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ANY_OTHER_8=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;

        AntlrDatatypeRuleToken this_assign_op_6 = null;

        AntlrDatatypeRuleToken this_ExpressionList_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4897:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) )
            // InternalMyDsl.g:4898:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList ) | this_ANY_OTHER_8= RULE_ANY_OTHER )
            {
            // InternalMyDsl.g:4898:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | (kw= '++' | kw= '--' ) | ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList ) | this_ANY_OTHER_8= RULE_ANY_OTHER )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt84=1;
                }
                break;
            case 79:
            case 80:
                {
                alt84=2;
                }
                break;
            case RULE_ADD_OP:
            case RULE_MUL_OP:
            case 71:
            case 74:
                {
                alt84=3;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt84=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:4899:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:4899:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:4900:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,73,FOLLOW_37); if (state.failed) return current;
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
                    // InternalMyDsl.g:4917:3: (kw= '++' | kw= '--' )
                    {
                    // InternalMyDsl.g:4917:3: (kw= '++' | kw= '--' )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==79) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==80) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalMyDsl.g:4918:4: kw= '++'
                            {
                            kw=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              				current.merge(kw);
                              				newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getPlusSignPlusSignKeyword_1_0());
                              			
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:4924:4: kw= '--'
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
                    // InternalMyDsl.g:4931:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList )
                    {
                    // InternalMyDsl.g:4931:3: ( (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList )
                    // InternalMyDsl.g:4932:4: (kw= ',' this_Expression_5= ruleExpression )* this_assign_op_6= ruleassign_op this_ExpressionList_7= ruleExpressionList
                    {
                    // InternalMyDsl.g:4932:4: (kw= ',' this_Expression_5= ruleExpression )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==71) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalMyDsl.g:4933:5: kw= ',' this_Expression_5= ruleExpression
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getSimpleStmtLinhaAccess().getCommaKeyword_2_0_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionParserRuleCall_2_0_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_56);
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
                    	    break loop83;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getAssign_opParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_assign_op_6=ruleassign_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_assign_op_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSimpleStmtLinhaAccess().getExpressionListParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionList_7=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionList_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:4971:3: this_ANY_OTHER_8= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_8=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_8, grammarAccess.getSimpleStmtLinhaAccess().getANY_OTHERTerminalRuleCall_3());
                      		
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


    // $ANTLR start "entryRuleEmptyStmt"
    // InternalMyDsl.g:4982:1: entryRuleEmptyStmt returns [String current=null] : iv_ruleEmptyStmt= ruleEmptyStmt EOF ;
    public final String entryRuleEmptyStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmptyStmt = null;


        try {
            // InternalMyDsl.g:4982:49: (iv_ruleEmptyStmt= ruleEmptyStmt EOF )
            // InternalMyDsl.g:4983:2: iv_ruleEmptyStmt= ruleEmptyStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmptyStmt=ruleEmptyStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyStmt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyStmt"


    // $ANTLR start "ruleEmptyStmt"
    // InternalMyDsl.g:4989:1: ruleEmptyStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ANY_OTHER_0= RULE_ANY_OTHER ;
    public final AntlrDatatypeRuleToken ruleEmptyStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4995:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )
            // InternalMyDsl.g:4996:2: this_ANY_OTHER_0= RULE_ANY_OTHER
            {
            this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ANY_OTHER_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ANY_OTHER_0, grammarAccess.getEmptyStmtAccess().getANY_OTHERTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyStmt"


    // $ANTLR start "entryRuleLabeledStmt"
    // InternalMyDsl.g:5006:1: entryRuleLabeledStmt returns [String current=null] : iv_ruleLabeledStmt= ruleLabeledStmt EOF ;
    public final String entryRuleLabeledStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabeledStmt = null;


        try {
            // InternalMyDsl.g:5006:51: (iv_ruleLabeledStmt= ruleLabeledStmt EOF )
            // InternalMyDsl.g:5007:2: iv_ruleLabeledStmt= ruleLabeledStmt EOF
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
    // InternalMyDsl.g:5013:1: ruleLabeledStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) ;
    public final AntlrDatatypeRuleToken ruleLabeledStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Label_0 = null;

        AntlrDatatypeRuleToken this_Statement_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5019:2: ( (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement ) )
            // InternalMyDsl.g:5020:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            {
            // InternalMyDsl.g:5020:2: (this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement )
            // InternalMyDsl.g:5021:3: this_Label_0= ruleLabel kw= ':' this_Statement_2= ruleStatement
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLabeledStmtAccess().getLabelParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_Label_0=ruleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Label_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_57); if (state.failed) return current;
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
    // InternalMyDsl.g:5050:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:5050:45: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:5051:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalMyDsl.g:5057:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5063:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:5064:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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


    // $ANTLR start "entryRuleassign_op"
    // InternalMyDsl.g:5074:1: entryRuleassign_op returns [String current=null] : iv_ruleassign_op= ruleassign_op EOF ;
    public final String entryRuleassign_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassign_op = null;


        try {
            // InternalMyDsl.g:5074:49: (iv_ruleassign_op= ruleassign_op EOF )
            // InternalMyDsl.g:5075:2: iv_ruleassign_op= ruleassign_op EOF
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
    // InternalMyDsl.g:5081:1: ruleassign_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )? kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleassign_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADD_OP_0=null;
        Token this_MUL_OP_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5087:2: ( ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )? kw= '=' ) )
            // InternalMyDsl.g:5088:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )? kw= '=' )
            {
            // InternalMyDsl.g:5088:2: ( (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )? kw= '=' )
            // InternalMyDsl.g:5089:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )? kw= '='
            {
            // InternalMyDsl.g:5089:3: (this_ADD_OP_0= RULE_ADD_OP | this_MUL_OP_1= RULE_MUL_OP )?
            int alt85=3;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ADD_OP) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_MUL_OP) ) {
                alt85=2;
            }
            switch (alt85) {
                case 1 :
                    // InternalMyDsl.g:5090:4: this_ADD_OP_0= RULE_ADD_OP
                    {
                    this_ADD_OP_0=(Token)match(input,RULE_ADD_OP,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ADD_OP_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ADD_OP_0, grammarAccess.getAssign_opAccess().getADD_OPTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5098:4: this_MUL_OP_1= RULE_MUL_OP
                    {
                    this_MUL_OP_1=(Token)match(input,RULE_MUL_OP,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MUL_OP_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MUL_OP_1, grammarAccess.getAssign_opAccess().getMUL_OPTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleIfStmt"
    // InternalMyDsl.g:5115:1: entryRuleIfStmt returns [String current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final String entryRuleIfStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmt = null;


        try {
            // InternalMyDsl.g:5115:46: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMyDsl.g:5116:2: iv_ruleIfStmt= ruleIfStmt EOF
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
    // InternalMyDsl.g:5122:1: ruleIfStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha ) | (this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleIfStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IF_0=null;
        Token this_IF_3=null;
        Token kw=null;
        Token this_ELSE_9=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_IfStmtLinha_2 = null;

        AntlrDatatypeRuleToken this_EmptyStmt_4 = null;

        AntlrDatatypeRuleToken this_ShortVarDecl_5 = null;

        AntlrDatatypeRuleToken this_Expression_7 = null;

        AntlrDatatypeRuleToken this_Block_8 = null;

        AntlrDatatypeRuleToken this_IfStmt_10 = null;

        AntlrDatatypeRuleToken this_Block_11 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5128:2: ( ( (this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha ) | (this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )? ) ) )
            // InternalMyDsl.g:5129:2: ( (this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha ) | (this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )? ) )
            {
            // InternalMyDsl.g:5129:2: ( (this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha ) | (this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )? ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_IF) ) {
                switch ( input.LA(2) ) {
                case RULE_ANY_OTHER:
                    {
                    alt89=2;
                    }
                    break;
                case RULE_IDENTIFIER:
                    {
                    int LA89_3 = input.LA(3);

                    if ( (LA89_3==71||LA89_3==75) ) {
                        alt89=2;
                    }
                    else if ( (LA89_3==RULE_ANY_OTHER||LA89_3==61) ) {
                        alt89=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 3, input);

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
                case RULE_INT_LIT:
                case RULE_UNARY_OP:
                case 61:
                case 63:
                case 65:
                case 70:
                case 73:
                    {
                    alt89=1;
                    }
                    break;
                default:
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
                    // InternalMyDsl.g:5130:3: (this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha )
                    {
                    // InternalMyDsl.g:5130:3: (this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha )
                    // InternalMyDsl.g:5131:4: this_IF_0= RULE_IF this_Expression_1= ruleExpression this_IfStmtLinha_2= ruleIfStmtLinha
                    {
                    this_IF_0=(Token)match(input,RULE_IF,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IF_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IF_0, grammarAccess.getIfStmtAccess().getIFTerminalRuleCall_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_58);
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

                      				newCompositeNode(grammarAccess.getIfStmtAccess().getIfStmtLinhaParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_IfStmtLinha_2=ruleIfStmtLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IfStmtLinha_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5160:3: (this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )? )
                    {
                    // InternalMyDsl.g:5160:3: (this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )? )
                    // InternalMyDsl.g:5161:4: this_IF_3= RULE_IF ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' ) this_Expression_7= ruleExpression this_Block_8= ruleBlock (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )?
                    {
                    this_IF_3=(Token)match(input,RULE_IF,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_IF_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_IF_3, grammarAccess.getIfStmtAccess().getIFTerminalRuleCall_1_0());
                      			
                    }
                    // InternalMyDsl.g:5168:4: ( (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';' )
                    // InternalMyDsl.g:5169:5: (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl ) kw= ';'
                    {
                    // InternalMyDsl.g:5169:5: (this_EmptyStmt_4= ruleEmptyStmt | this_ShortVarDecl_5= ruleShortVarDecl )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==RULE_ANY_OTHER) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==RULE_IDENTIFIER) ) {
                        alt86=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalMyDsl.g:5170:6: this_EmptyStmt_4= ruleEmptyStmt
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getIfStmtAccess().getEmptyStmtParserRuleCall_1_1_0_0());
                              					
                            }
                            pushFollow(FOLLOW_18);
                            this_EmptyStmt_4=ruleEmptyStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_EmptyStmt_4);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:5181:6: this_ShortVarDecl_5= ruleShortVarDecl
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getIfStmtAccess().getShortVarDeclParserRuleCall_1_1_0_1());
                              					
                            }
                            pushFollow(FOLLOW_18);
                            this_ShortVarDecl_5=ruleShortVarDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_ShortVarDecl_5);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getIfStmtAccess().getSemicolonKeyword_1_1_1());
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtAccess().getExpressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_Expression_7=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_1_3());
                      			
                    }
                    pushFollow(FOLLOW_60);
                    this_Block_8=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Block_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:5218:4: (this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_ELSE) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalMyDsl.g:5219:5: this_ELSE_9= RULE_ELSE (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock )
                            {
                            this_ELSE_9=(Token)match(input,RULE_ELSE,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ELSE_9);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_ELSE_9, grammarAccess.getIfStmtAccess().getELSETerminalRuleCall_1_4_0());
                              				
                            }
                            // InternalMyDsl.g:5226:5: (this_IfStmt_10= ruleIfStmt | this_Block_11= ruleBlock )
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==RULE_IF) ) {
                                alt87=1;
                            }
                            else if ( (LA87_0==67) ) {
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
                                    // InternalMyDsl.g:5227:6: this_IfStmt_10= ruleIfStmt
                                    {
                                    if ( state.backtracking==0 ) {

                                      						newCompositeNode(grammarAccess.getIfStmtAccess().getIfStmtParserRuleCall_1_4_1_0());
                                      					
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
                                case 2 :
                                    // InternalMyDsl.g:5238:6: this_Block_11= ruleBlock
                                    {
                                    if ( state.backtracking==0 ) {

                                      						newCompositeNode(grammarAccess.getIfStmtAccess().getBlockParserRuleCall_1_4_1_1());
                                      					
                                    }
                                    pushFollow(FOLLOW_2);
                                    this_Block_11=ruleBlock();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_Block_11);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						afterParserOrEnumRuleCall();
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleIfStmtLinha"
    // InternalMyDsl.g:5255:1: entryRuleIfStmtLinha returns [String current=null] : iv_ruleIfStmtLinha= ruleIfStmtLinha EOF ;
    public final String entryRuleIfStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIfStmtLinha = null;


        try {
            // InternalMyDsl.g:5255:51: (iv_ruleIfStmtLinha= ruleIfStmtLinha EOF )
            // InternalMyDsl.g:5256:2: iv_ruleIfStmtLinha= ruleIfStmtLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmtLinha=ruleIfStmtLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmtLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmtLinha"


    // $ANTLR start "ruleIfStmtLinha"
    // InternalMyDsl.g:5262:1: ruleIfStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) | (this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleIfStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ELSE_4=null;
        Token this_ELSE_8=null;
        AntlrDatatypeRuleToken this_SimpleStmtLinha_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;

        AntlrDatatypeRuleToken this_Block_3 = null;

        AntlrDatatypeRuleToken this_IfStmt_5 = null;

        AntlrDatatypeRuleToken this_Block_6 = null;

        AntlrDatatypeRuleToken this_Block_7 = null;

        AntlrDatatypeRuleToken this_IfStmt_9 = null;

        AntlrDatatypeRuleToken this_Block_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5268:2: ( ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) | (this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )? ) ) )
            // InternalMyDsl.g:5269:2: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) | (this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )? ) )
            {
            // InternalMyDsl.g:5269:2: ( (this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? ) | (this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )? ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_ANY_OTHER||(LA94_0>=RULE_ADD_OP && LA94_0<=RULE_MUL_OP)||LA94_0==71||(LA94_0>=73 && LA94_0<=74)||(LA94_0>=79 && LA94_0<=80)) ) {
                alt94=1;
            }
            else if ( (LA94_0==67) ) {
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
                    // InternalMyDsl.g:5270:3: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? )
                    {
                    // InternalMyDsl.g:5270:3: (this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )? )
                    // InternalMyDsl.g:5271:4: this_SimpleStmtLinha_0= ruleSimpleStmtLinha kw= ';' this_Expression_2= ruleExpression this_Block_3= ruleBlock (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getSimpleStmtLinhaParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_SimpleStmtLinha_0=ruleSimpleStmtLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SimpleStmtLinha_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIfStmtLinhaAccess().getSemicolonKeyword_0_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getExpressionParserRuleCall_0_2());
                      			
                    }
                    pushFollow(FOLLOW_16);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Expression_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getBlockParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_60);
                    this_Block_3=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Block_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:5306:4: (this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==RULE_ELSE) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalMyDsl.g:5307:5: this_ELSE_4= RULE_ELSE (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock )
                            {
                            this_ELSE_4=(Token)match(input,RULE_ELSE,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ELSE_4);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_ELSE_4, grammarAccess.getIfStmtLinhaAccess().getELSETerminalRuleCall_0_4_0());
                              				
                            }
                            // InternalMyDsl.g:5314:5: (this_IfStmt_5= ruleIfStmt | this_Block_6= ruleBlock )
                            int alt90=2;
                            int LA90_0 = input.LA(1);

                            if ( (LA90_0==RULE_IF) ) {
                                alt90=1;
                            }
                            else if ( (LA90_0==67) ) {
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
                                    // InternalMyDsl.g:5315:6: this_IfStmt_5= ruleIfStmt
                                    {
                                    if ( state.backtracking==0 ) {

                                      						newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getIfStmtParserRuleCall_0_4_1_0());
                                      					
                                    }
                                    pushFollow(FOLLOW_2);
                                    this_IfStmt_5=ruleIfStmt();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_IfStmt_5);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						afterParserOrEnumRuleCall();
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:5326:6: this_Block_6= ruleBlock
                                    {
                                    if ( state.backtracking==0 ) {

                                      						newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getBlockParserRuleCall_0_4_1_1());
                                      					
                                    }
                                    pushFollow(FOLLOW_2);
                                    this_Block_6=ruleBlock();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_Block_6);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						afterParserOrEnumRuleCall();
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5340:3: (this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )? )
                    {
                    // InternalMyDsl.g:5340:3: (this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )? )
                    // InternalMyDsl.g:5341:4: this_Block_7= ruleBlock (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getBlockParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_60);
                    this_Block_7=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Block_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalMyDsl.g:5351:4: (this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==RULE_ELSE) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalMyDsl.g:5352:5: this_ELSE_8= RULE_ELSE (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock )
                            {
                            this_ELSE_8=(Token)match(input,RULE_ELSE,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ELSE_8);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_ELSE_8, grammarAccess.getIfStmtLinhaAccess().getELSETerminalRuleCall_1_1_0());
                              				
                            }
                            // InternalMyDsl.g:5359:5: (this_IfStmt_9= ruleIfStmt | this_Block_10= ruleBlock )
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==RULE_IF) ) {
                                alt92=1;
                            }
                            else if ( (LA92_0==67) ) {
                                alt92=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 92, 0, input);

                                throw nvae;
                            }
                            switch (alt92) {
                                case 1 :
                                    // InternalMyDsl.g:5360:6: this_IfStmt_9= ruleIfStmt
                                    {
                                    if ( state.backtracking==0 ) {

                                      						newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getIfStmtParserRuleCall_1_1_1_0());
                                      					
                                    }
                                    pushFollow(FOLLOW_2);
                                    this_IfStmt_9=ruleIfStmt();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_IfStmt_9);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						afterParserOrEnumRuleCall();
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:5371:6: this_Block_10= ruleBlock
                                    {
                                    if ( state.backtracking==0 ) {

                                      						newCompositeNode(grammarAccess.getIfStmtLinhaAccess().getBlockParserRuleCall_1_1_1_1());
                                      					
                                    }
                                    pushFollow(FOLLOW_2);
                                    this_Block_10=ruleBlock();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(this_Block_10);
                                      					
                                    }
                                    if ( state.backtracking==0 ) {

                                      						afterParserOrEnumRuleCall();
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

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
    // $ANTLR end "ruleIfStmtLinha"


    // $ANTLR start "entryRuleSwitchStmt"
    // InternalMyDsl.g:5388:1: entryRuleSwitchStmt returns [String current=null] : iv_ruleSwitchStmt= ruleSwitchStmt EOF ;
    public final String entryRuleSwitchStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmt = null;


        try {
            // InternalMyDsl.g:5388:50: (iv_ruleSwitchStmt= ruleSwitchStmt EOF )
            // InternalMyDsl.g:5389:2: iv_ruleSwitchStmt= ruleSwitchStmt EOF
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
    // InternalMyDsl.g:5395:1: ruleSwitchStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SWITCH_0= RULE_SWITCH ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )? this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SWITCH_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_SimpleStmt_1 = null;

        AntlrDatatypeRuleToken this_SwitchStmtLinha_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5401:2: ( (this_SWITCH_0= RULE_SWITCH ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )? this_SwitchStmtLinha_3= ruleSwitchStmtLinha ) )
            // InternalMyDsl.g:5402:2: (this_SWITCH_0= RULE_SWITCH ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )? this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            {
            // InternalMyDsl.g:5402:2: (this_SWITCH_0= RULE_SWITCH ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )? this_SwitchStmtLinha_3= ruleSwitchStmtLinha )
            // InternalMyDsl.g:5403:3: this_SWITCH_0= RULE_SWITCH ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )? this_SwitchStmtLinha_3= ruleSwitchStmtLinha
            {
            this_SWITCH_0=(Token)match(input,RULE_SWITCH,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SWITCH_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SWITCH_0, grammarAccess.getSwitchStmtAccess().getSWITCHTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:5410:3: ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )?
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // InternalMyDsl.g:5411:4: ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';'
                    {
                    // InternalMyDsl.g:5411:4: ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt )
                    // InternalMyDsl.g:5412:5: ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSwitchStmtAccess().getSimpleStmtParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    this_SimpleStmt_1=ruleSimpleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_SimpleStmt_1);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }

                    kw=(Token)match(input,68,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtAccess().getSemicolonKeyword_1_1());
                      			
                    }

                    }
                    break;

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
    // InternalMyDsl.g:5444:1: entryRuleSwitchStmtLinha returns [String current=null] : iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF ;
    public final String entryRuleSwitchStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmtLinha = null;


        try {
            // InternalMyDsl.g:5444:55: (iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF )
            // InternalMyDsl.g:5445:2: iv_ruleSwitchStmtLinha= ruleSwitchStmtLinha EOF
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
    // InternalMyDsl.g:5451:1: ruleSwitchStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha ) | ( ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}' ) | ( (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNARY_OP_2=null;
        Token kw=null;
        Token this_IDENTIFIER_8=null;
        Token this_TYPEKEYWORD_13=null;
        AntlrDatatypeRuleToken this_PrimaryExpr_0 = null;

        AntlrDatatypeRuleToken this_SwitchStmtLinhaLinha_1 = null;

        AntlrDatatypeRuleToken this_UnaryExpr_3 = null;

        AntlrDatatypeRuleToken this_Expression_Linha_4 = null;

        AntlrDatatypeRuleToken this_ExprCaseClause_6 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_10 = null;

        AntlrDatatypeRuleToken this_TypeCaseClause_16 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5457:2: ( ( (this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha ) | ( ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}' ) | ( (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}' ) ) )
            // InternalMyDsl.g:5458:2: ( (this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha ) | ( ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}' ) | ( (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}' ) )
            {
            // InternalMyDsl.g:5458:2: ( (this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha ) | ( ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}' ) | ( (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}' ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case RULE_DECIMALS:
            case RULE_STRUCT:
            case RULE_STRING_LIT:
            case RULE_FUNC:
            case RULE_INTERFACE:
            case RULE_MAP:
            case RULE_CHAN:
            case RULE_INT_LIT:
            case 61:
            case 63:
            case 65:
            case 70:
            case 73:
                {
                alt99=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA99_2 = input.LA(2);

                if ( (LA99_2==RULE_ANY_OTHER||LA99_2==61) ) {
                    alt99=1;
                }
                else if ( (LA99_2==75) ) {
                    alt99=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_UNARY_OP:
            case 67:
                {
                alt99=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalMyDsl.g:5459:3: (this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha )
                    {
                    // InternalMyDsl.g:5459:3: (this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha )
                    // InternalMyDsl.g:5460:4: this_PrimaryExpr_0= rulePrimaryExpr this_SwitchStmtLinhaLinha_1= ruleSwitchStmtLinhaLinha
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getPrimaryExprParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_63);
                    this_PrimaryExpr_0=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getSwitchStmtLinhaLinhaParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchStmtLinhaLinha_1=ruleSwitchStmtLinhaLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_SwitchStmtLinhaLinha_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5482:3: ( ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:5482:3: ( ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}' )
                    // InternalMyDsl.g:5483:4: ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )? kw= '{' (this_ExprCaseClause_6= ruleExprCaseClause )* kw= '}'
                    {
                    // InternalMyDsl.g:5483:4: ( (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==RULE_UNARY_OP) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalMyDsl.g:5484:5: (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr ) this_Expression_Linha_4= ruleExpression_Linha
                            {
                            // InternalMyDsl.g:5484:5: (this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr )
                            // InternalMyDsl.g:5485:6: this_UNARY_OP_2= RULE_UNARY_OP this_UnaryExpr_3= ruleUnaryExpr
                            {
                            this_UNARY_OP_2=(Token)match(input,RULE_UNARY_OP,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_UNARY_OP_2);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_UNARY_OP_2, grammarAccess.getSwitchStmtLinhaAccess().getUNARY_OPTerminalRuleCall_1_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getUnaryExprParserRuleCall_1_0_0_1());
                              					
                            }
                            pushFollow(FOLLOW_54);
                            this_UnaryExpr_3=ruleUnaryExpr();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_UnaryExpr_3);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }

                            if ( state.backtracking==0 ) {

                              					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getExpression_LinhaParserRuleCall_1_0_1());
                              				
                            }
                            pushFollow(FOLLOW_16);
                            this_Expression_Linha_4=ruleExpression_Linha();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_Expression_Linha_4);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					afterParserOrEnumRuleCall();
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,67,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalMyDsl.g:5519:4: (this_ExprCaseClause_6= ruleExprCaseClause )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( ((LA97_0>=RULE_CASE && LA97_0<=RULE_DEFAULT)) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalMyDsl.g:5520:5: this_ExprCaseClause_6= ruleExprCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getExprCaseClauseParserRuleCall_1_2());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    this_ExprCaseClause_6=ruleExprCaseClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ExprCaseClause_6);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
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
                case 3 :
                    // InternalMyDsl.g:5538:3: ( (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:5538:3: ( (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}' )
                    // InternalMyDsl.g:5539:4: (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' ) this_PrimaryExpr_10= rulePrimaryExpr kw= '.' kw= '(' this_TYPEKEYWORD_13= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_16= ruleTypeCaseClause )* kw= '}'
                    {
                    // InternalMyDsl.g:5539:4: (this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':=' )
                    // InternalMyDsl.g:5540:5: this_IDENTIFIER_8= RULE_IDENTIFIER kw= ':='
                    {
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IDENTIFIER_8);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_IDENTIFIER_8, grammarAccess.getSwitchStmtLinhaAccess().getIDENTIFIERTerminalRuleCall_2_0_0());
                      				
                    }
                    kw=(Token)match(input,75,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getColonEqualsSignKeyword_2_0_1());
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getPrimaryExprParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_PrimaryExpr_10=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PrimaryExpr_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,61,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getFullStopKeyword_2_2());
                      			
                    }
                    kw=(Token)match(input,63,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftParenthesisKeyword_2_3());
                      			
                    }
                    this_TYPEKEYWORD_13=(Token)match(input,RULE_TYPEKEYWORD,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TYPEKEYWORD_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TYPEKEYWORD_13, grammarAccess.getSwitchStmtLinhaAccess().getTYPEKEYWORDTerminalRuleCall_2_4());
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getRightParenthesisKeyword_2_5());
                      			
                    }
                    kw=(Token)match(input,67,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getLeftCurlyBracketKeyword_2_6());
                      			
                    }
                    // InternalMyDsl.g:5590:4: (this_TypeCaseClause_16= ruleTypeCaseClause )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( ((LA98_0>=RULE_CASE && LA98_0<=RULE_DEFAULT)) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalMyDsl.g:5591:5: this_TypeCaseClause_16= ruleTypeCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaAccess().getTypeCaseClauseParserRuleCall_2_7());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    this_TypeCaseClause_16=ruleTypeCaseClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_TypeCaseClause_16);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaAccess().getRightCurlyBracketKeyword_2_8());
                      			
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


    // $ANTLR start "entryRuleSwitchStmtLinhaLinha"
    // InternalMyDsl.g:5612:1: entryRuleSwitchStmtLinhaLinha returns [String current=null] : iv_ruleSwitchStmtLinhaLinha= ruleSwitchStmtLinhaLinha EOF ;
    public final String entryRuleSwitchStmtLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwitchStmtLinhaLinha = null;


        try {
            // InternalMyDsl.g:5612:60: (iv_ruleSwitchStmtLinhaLinha= ruleSwitchStmtLinhaLinha EOF )
            // InternalMyDsl.g:5613:2: iv_ruleSwitchStmtLinhaLinha= ruleSwitchStmtLinhaLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchStmtLinhaLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchStmtLinhaLinha=ruleSwitchStmtLinhaLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchStmtLinhaLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchStmtLinhaLinha"


    // $ANTLR start "ruleSwitchStmtLinhaLinha"
    // InternalMyDsl.g:5619:1: ruleSwitchStmtLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}' ) | (kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleSwitchStmtLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TYPEKEYWORD_5=null;
        AntlrDatatypeRuleToken this_ExprCaseClause_1 = null;

        AntlrDatatypeRuleToken this_TypeCaseClause_8 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5625:2: ( ( (kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}' ) | (kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}' ) ) )
            // InternalMyDsl.g:5626:2: ( (kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}' ) | (kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}' ) )
            {
            // InternalMyDsl.g:5626:2: ( (kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}' ) | (kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==67) ) {
                alt102=1;
            }
            else if ( (LA102_0==61) ) {
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
                    // InternalMyDsl.g:5627:3: (kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:5627:3: (kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}' )
                    // InternalMyDsl.g:5628:4: kw= '{' (this_ExprCaseClause_1= ruleExprCaseClause )* kw= '}'
                    {
                    kw=(Token)match(input,67,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getLeftCurlyBracketKeyword_0_0());
                      			
                    }
                    // InternalMyDsl.g:5633:4: (this_ExprCaseClause_1= ruleExprCaseClause )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( ((LA100_0>=RULE_CASE && LA100_0<=RULE_DEFAULT)) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalMyDsl.g:5634:5: this_ExprCaseClause_1= ruleExprCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaLinhaAccess().getExprCaseClauseParserRuleCall_0_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    this_ExprCaseClause_1=ruleExprCaseClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ExprCaseClause_1);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getRightCurlyBracketKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5652:3: (kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}' )
                    {
                    // InternalMyDsl.g:5652:3: (kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}' )
                    // InternalMyDsl.g:5653:4: kw= '.' kw= '(' this_TYPEKEYWORD_5= RULE_TYPEKEYWORD kw= ')' kw= '{' (this_TypeCaseClause_8= ruleTypeCaseClause )* kw= '}'
                    {
                    kw=(Token)match(input,61,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getFullStopKeyword_1_0());
                      			
                    }
                    kw=(Token)match(input,63,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    this_TYPEKEYWORD_5=(Token)match(input,RULE_TYPEKEYWORD,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_TYPEKEYWORD_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_TYPEKEYWORD_5, grammarAccess.getSwitchStmtLinhaLinhaAccess().getTYPEKEYWORDTerminalRuleCall_1_2());
                      			
                    }
                    kw=(Token)match(input,64,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getRightParenthesisKeyword_1_3());
                      			
                    }
                    kw=(Token)match(input,67,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getLeftCurlyBracketKeyword_1_4());
                      			
                    }
                    // InternalMyDsl.g:5680:4: (this_TypeCaseClause_8= ruleTypeCaseClause )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( ((LA101_0>=RULE_CASE && LA101_0<=RULE_DEFAULT)) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalMyDsl.g:5681:5: this_TypeCaseClause_8= ruleTypeCaseClause
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getSwitchStmtLinhaLinhaAccess().getTypeCaseClauseParserRuleCall_1_5());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_64);
                    	    this_TypeCaseClause_8=ruleTypeCaseClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_TypeCaseClause_8);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					afterParserOrEnumRuleCall();
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getSwitchStmtLinhaLinhaAccess().getRightCurlyBracketKeyword_1_6());
                      			
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
    // $ANTLR end "ruleSwitchStmtLinhaLinha"


    // $ANTLR start "entryRuleExprCaseClause"
    // InternalMyDsl.g:5702:1: entryRuleExprCaseClause returns [String current=null] : iv_ruleExprCaseClause= ruleExprCaseClause EOF ;
    public final String entryRuleExprCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprCaseClause = null;


        try {
            // InternalMyDsl.g:5702:54: (iv_ruleExprCaseClause= ruleExprCaseClause EOF )
            // InternalMyDsl.g:5703:2: iv_ruleExprCaseClause= ruleExprCaseClause EOF
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
    // InternalMyDsl.g:5709:1: ruleExprCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleExprCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExprSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5715:2: ( (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:5716:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:5716:2: (this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:5717:3: this_ExprSwitchCase_0= ruleExprSwitchCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExprCaseClauseAccess().getExprSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_ExprSwitchCase_0=ruleExprSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ExprSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_57); if (state.failed) return current;
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
    // InternalMyDsl.g:5746:1: entryRuleExprSwitchCase returns [String current=null] : iv_ruleExprSwitchCase= ruleExprSwitchCase EOF ;
    public final String entryRuleExprSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSwitchCase = null;


        try {
            // InternalMyDsl.g:5746:54: (iv_ruleExprSwitchCase= ruleExprSwitchCase EOF )
            // InternalMyDsl.g:5747:2: iv_ruleExprSwitchCase= ruleExprSwitchCase EOF
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
    // InternalMyDsl.g:5753:1: ruleExprSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT ) ;
    public final AntlrDatatypeRuleToken ruleExprSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_0=null;
        Token this_DEFAULT_2=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5759:2: ( ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT ) )
            // InternalMyDsl.g:5760:2: ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT )
            {
            // InternalMyDsl.g:5760:2: ( (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList ) | this_DEFAULT_2= RULE_DEFAULT )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_CASE) ) {
                alt103=1;
            }
            else if ( (LA103_0==RULE_DEFAULT) ) {
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
                    // InternalMyDsl.g:5761:3: (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList )
                    {
                    // InternalMyDsl.g:5761:3: (this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList )
                    // InternalMyDsl.g:5762:4: this_CASE_0= RULE_CASE this_ExpressionList_1= ruleExpressionList
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_37); if (state.failed) return current;
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
                    // InternalMyDsl.g:5781:3: this_DEFAULT_2= RULE_DEFAULT
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


    // $ANTLR start "entryRuleTypeCaseClause"
    // InternalMyDsl.g:5792:1: entryRuleTypeCaseClause returns [String current=null] : iv_ruleTypeCaseClause= ruleTypeCaseClause EOF ;
    public final String entryRuleTypeCaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeCaseClause = null;


        try {
            // InternalMyDsl.g:5792:54: (iv_ruleTypeCaseClause= ruleTypeCaseClause EOF )
            // InternalMyDsl.g:5793:2: iv_ruleTypeCaseClause= ruleTypeCaseClause EOF
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
    // InternalMyDsl.g:5799:1: ruleTypeCaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleTypeCaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSwitchCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5805:2: ( (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:5806:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:5806:2: (this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:5807:3: this_TypeSwitchCase_0= ruleTypeSwitchCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeCaseClauseAccess().getTypeSwitchCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_TypeSwitchCase_0=ruleTypeSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_TypeSwitchCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_57); if (state.failed) return current;
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
    // InternalMyDsl.g:5836:1: entryRuleTypeSwitchCase returns [String current=null] : iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF ;
    public final String entryRuleTypeSwitchCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSwitchCase = null;


        try {
            // InternalMyDsl.g:5836:54: (iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF )
            // InternalMyDsl.g:5837:2: iv_ruleTypeSwitchCase= ruleTypeSwitchCase EOF
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
    // InternalMyDsl.g:5843:1: ruleTypeSwitchCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT ) ;
    public final AntlrDatatypeRuleToken ruleTypeSwitchCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_0=null;
        Token this_DEFAULT_2=null;
        AntlrDatatypeRuleToken this_TypeList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5849:2: ( ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT ) )
            // InternalMyDsl.g:5850:2: ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT )
            {
            // InternalMyDsl.g:5850:2: ( (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList ) | this_DEFAULT_2= RULE_DEFAULT )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_CASE) ) {
                alt104=1;
            }
            else if ( (LA104_0==RULE_DEFAULT) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalMyDsl.g:5851:3: (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList )
                    {
                    // InternalMyDsl.g:5851:3: (this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList )
                    // InternalMyDsl.g:5852:4: this_CASE_0= RULE_CASE this_TypeList_1= ruleTypeList
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_10); if (state.failed) return current;
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
                    // InternalMyDsl.g:5871:3: this_DEFAULT_2= RULE_DEFAULT
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
    // InternalMyDsl.g:5882:1: entryRuleTypeList returns [String current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final String entryRuleTypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeList = null;


        try {
            // InternalMyDsl.g:5882:48: (iv_ruleTypeList= ruleTypeList EOF )
            // InternalMyDsl.g:5883:2: iv_ruleTypeList= ruleTypeList EOF
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
    // InternalMyDsl.g:5889:1: ruleTypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) ;
    public final AntlrDatatypeRuleToken ruleTypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Type_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5895:2: ( (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* ) )
            // InternalMyDsl.g:5896:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            {
            // InternalMyDsl.g:5896:2: (this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )* )
            // InternalMyDsl.g:5897:3: this_Type_0= ruleType (kw= ',' this_Type_2= ruleType )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_Type_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Type_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:5907:3: (kw= ',' this_Type_2= ruleType )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==71) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalMyDsl.g:5908:4: kw= ',' this_Type_2= ruleType
            	    {
            	    kw=(Token)match(input,71,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getTypeListAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTypeListAccess().getTypeParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_24);
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
            	    break loop105;
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


    // $ANTLR start "entryRuleForStmt"
    // InternalMyDsl.g:5928:1: entryRuleForStmt returns [String current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final String entryRuleForStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmt = null;


        try {
            // InternalMyDsl.g:5928:47: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMyDsl.g:5929:2: iv_ruleForStmt= ruleForStmt EOF
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
    // InternalMyDsl.g:5935:1: ruleForStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FOR_0= RULE_FOR ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )? this_Block_13= ruleBlock ) ;
    public final AntlrDatatypeRuleToken ruleForStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FOR_0=null;
        Token kw=null;
        Token this_RANGE_11=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_ForStmtLinha_2 = null;

        AntlrDatatypeRuleToken this_EmptyStmt_3 = null;

        AntlrDatatypeRuleToken this_ShortVarDecl_4 = null;

        AntlrDatatypeRuleToken this_Condition_6 = null;

        AntlrDatatypeRuleToken this_PostStmt_8 = null;

        AntlrDatatypeRuleToken this_IdentifierList_9 = null;

        AntlrDatatypeRuleToken this_Expression_12 = null;

        AntlrDatatypeRuleToken this_Block_13 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5941:2: ( (this_FOR_0= RULE_FOR ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )? this_Block_13= ruleBlock ) )
            // InternalMyDsl.g:5942:2: (this_FOR_0= RULE_FOR ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )? this_Block_13= ruleBlock )
            {
            // InternalMyDsl.g:5942:2: (this_FOR_0= RULE_FOR ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )? this_Block_13= ruleBlock )
            // InternalMyDsl.g:5943:3: this_FOR_0= RULE_FOR ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )? this_Block_13= ruleBlock
            {
            this_FOR_0=(Token)match(input,RULE_FOR,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FOR_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FOR_0, grammarAccess.getForStmtAccess().getFORTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:5950:3: ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )?
            int alt107=4;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // InternalMyDsl.g:5951:4: (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )
                    {
                    // InternalMyDsl.g:5951:4: (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha )
                    // InternalMyDsl.g:5952:5: this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getExpressionParserRuleCall_1_0_0());
                      				
                    }
                    pushFollow(FOLLOW_55);
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

                      					newCompositeNode(grammarAccess.getForStmtAccess().getForStmtLinhaParserRuleCall_1_0_1());
                      				
                    }
                    pushFollow(FOLLOW_16);
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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5974:4: ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt )
                    {
                    // InternalMyDsl.g:5974:4: ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt )
                    // InternalMyDsl.g:5975:5: (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt
                    {
                    // InternalMyDsl.g:5975:5: (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl )
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==RULE_ANY_OTHER) ) {
                        alt106=1;
                    }
                    else if ( (LA106_0==RULE_IDENTIFIER) ) {
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
                            // InternalMyDsl.g:5976:6: this_EmptyStmt_3= ruleEmptyStmt
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtAccess().getEmptyStmtParserRuleCall_1_1_0_0());
                              					
                            }
                            pushFollow(FOLLOW_18);
                            this_EmptyStmt_3=ruleEmptyStmt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_EmptyStmt_3);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:5987:6: this_ShortVarDecl_4= ruleShortVarDecl
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtAccess().getShortVarDeclParserRuleCall_1_1_0_1());
                              					
                            }
                            pushFollow(FOLLOW_18);
                            this_ShortVarDecl_4=ruleShortVarDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_ShortVarDecl_4);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getForStmtAccess().getSemicolonKeyword_1_1_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getConditionParserRuleCall_1_1_2());
                      				
                    }
                    pushFollow(FOLLOW_18);
                    this_Condition_6=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Condition_6);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,68,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getForStmtAccess().getSemicolonKeyword_1_1_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getPostStmtParserRuleCall_1_1_4());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    this_PostStmt_8=rulePostStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_PostStmt_8);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6030:4: (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression )
                    {
                    // InternalMyDsl.g:6030:4: (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression )
                    // InternalMyDsl.g:6031:5: this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getIdentifierListParserRuleCall_1_2_0());
                      				
                    }
                    pushFollow(FOLLOW_40);
                    this_IdentifierList_9=ruleIdentifierList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_IdentifierList_9);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }
                    kw=(Token)match(input,75,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getForStmtAccess().getColonEqualsSignKeyword_1_2_1());
                      				
                    }
                    this_RANGE_11=(Token)match(input,RULE_RANGE,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_RANGE_11);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_RANGE_11, grammarAccess.getForStmtAccess().getRANGETerminalRuleCall_1_2_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getForStmtAccess().getExpressionParserRuleCall_1_2_3());
                      				
                    }
                    pushFollow(FOLLOW_16);
                    this_Expression_12=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_Expression_12);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getForStmtAccess().getBlockParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_Block_13=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Block_13);
              		
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
    // InternalMyDsl.g:6079:1: entryRuleForStmtLinha returns [String current=null] : iv_ruleForStmtLinha= ruleForStmtLinha EOF ;
    public final String entryRuleForStmtLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmtLinha = null;


        try {
            // InternalMyDsl.g:6079:52: (iv_ruleForStmtLinha= ruleForStmtLinha EOF )
            // InternalMyDsl.g:6080:2: iv_ruleForStmtLinha= ruleForStmtLinha EOF
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
    // InternalMyDsl.g:6086:1: ruleForStmtLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | ( (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha ) | ( ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt ) ) ;
    public final AntlrDatatypeRuleToken ruleForStmtLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token kw=null;
        Token this_ANY_OTHER_8=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;

        AntlrDatatypeRuleToken this_ForStmtLinhaLinha_3 = null;

        AntlrDatatypeRuleToken this_Expression_5 = null;

        AntlrDatatypeRuleToken this_Condition_10 = null;

        AntlrDatatypeRuleToken this_PostStmt_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6092:2: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | ( (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha ) | ( ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt ) ) )
            // InternalMyDsl.g:6093:2: (this_ANY_OTHER_0= RULE_ANY_OTHER | ( (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha ) | ( ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt ) )
            {
            // InternalMyDsl.g:6093:2: (this_ANY_OTHER_0= RULE_ANY_OTHER | ( (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha ) | ( ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==68) ) {
                    alt111=3;
                }
                else if ( (LA111_1==EOF||LA111_1==67) ) {
                    alt111=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ADD_OP:
            case RULE_MUL_OP:
            case 71:
            case 74:
                {
                alt111=2;
                }
                break;
            case 73:
            case 79:
            case 80:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalMyDsl.g:6094:3: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ANY_OTHER_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ANY_OTHER_0, grammarAccess.getForStmtLinhaAccess().getANY_OTHERTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6102:3: ( (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha )
                    {
                    // InternalMyDsl.g:6102:3: ( (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha )
                    // InternalMyDsl.g:6103:4: (kw= ',' this_Expression_2= ruleExpression )* this_ForStmtLinhaLinha_3= ruleForStmtLinhaLinha
                    {
                    // InternalMyDsl.g:6103:4: (kw= ',' this_Expression_2= ruleExpression )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==71) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalMyDsl.g:6104:5: kw= ',' this_Expression_2= ruleExpression
                    	    {
                    	    kw=(Token)match(input,71,FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(kw);
                    	      					newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getCommaKeyword_1_0_0());
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_1_0_1());
                    	      				
                    	    }
                    	    pushFollow(FOLLOW_56);
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
                    	    break loop108;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaAccess().getForStmtLinhaLinhaParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ForStmtLinhaLinha_3=ruleForStmtLinhaLinha();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ForStmtLinhaLinha_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:6132:3: ( ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt )
                    {
                    // InternalMyDsl.g:6132:3: ( ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt )
                    // InternalMyDsl.g:6133:4: ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER ) kw= ';' this_Condition_10= ruleCondition kw= ';' this_PostStmt_12= rulePostStmt
                    {
                    // InternalMyDsl.g:6133:4: ( (kw= '<-' this_Expression_5= ruleExpression ) | (kw= '++' | kw= '--' ) | this_ANY_OTHER_8= RULE_ANY_OTHER )
                    int alt110=3;
                    switch ( input.LA(1) ) {
                    case 73:
                        {
                        alt110=1;
                        }
                        break;
                    case 79:
                    case 80:
                        {
                        alt110=2;
                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        alt110=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }

                    switch (alt110) {
                        case 1 :
                            // InternalMyDsl.g:6134:5: (kw= '<-' this_Expression_5= ruleExpression )
                            {
                            // InternalMyDsl.g:6134:5: (kw= '<-' this_Expression_5= ruleExpression )
                            // InternalMyDsl.g:6135:6: kw= '<-' this_Expression_5= ruleExpression
                            {
                            kw=(Token)match(input,73,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getLessThanSignHyphenMinusKeyword_2_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getForStmtLinhaAccess().getExpressionParserRuleCall_2_0_0_1());
                              					
                            }
                            pushFollow(FOLLOW_18);
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


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:6152:5: (kw= '++' | kw= '--' )
                            {
                            // InternalMyDsl.g:6152:5: (kw= '++' | kw= '--' )
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==79) ) {
                                alt109=1;
                            }
                            else if ( (LA109_0==80) ) {
                                alt109=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 109, 0, input);

                                throw nvae;
                            }
                            switch (alt109) {
                                case 1 :
                                    // InternalMyDsl.g:6153:6: kw= '++'
                                    {
                                    kw=(Token)match(input,79,FOLLOW_18); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(kw);
                                      						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getPlusSignPlusSignKeyword_2_0_1_0());
                                      					
                                    }

                                    }
                                    break;
                                case 2 :
                                    // InternalMyDsl.g:6159:6: kw= '--'
                                    {
                                    kw=(Token)match(input,80,FOLLOW_18); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						current.merge(kw);
                                      						newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getHyphenMinusHyphenMinusKeyword_2_0_1_1());
                                      					
                                    }

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:6166:5: this_ANY_OTHER_8= RULE_ANY_OTHER
                            {
                            this_ANY_OTHER_8=(Token)match(input,RULE_ANY_OTHER,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_ANY_OTHER_8);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_ANY_OTHER_8, grammarAccess.getForStmtLinhaAccess().getANY_OTHERTerminalRuleCall_2_0_2());
                              				
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_2_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaAccess().getConditionParserRuleCall_2_2());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_Condition_10=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Condition_10);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaAccess().getSemicolonKeyword_2_3());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaAccess().getPostStmtParserRuleCall_2_4());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PostStmt_12=rulePostStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PostStmt_12);
                      			
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
    // $ANTLR end "ruleForStmtLinha"


    // $ANTLR start "entryRuleForStmtLinhaLinha"
    // InternalMyDsl.g:6209:1: entryRuleForStmtLinhaLinha returns [String current=null] : iv_ruleForStmtLinhaLinha= ruleForStmtLinhaLinha EOF ;
    public final String entryRuleForStmtLinhaLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForStmtLinhaLinha = null;


        try {
            // InternalMyDsl.g:6209:57: (iv_ruleForStmtLinhaLinha= ruleForStmtLinhaLinha EOF )
            // InternalMyDsl.g:6210:2: iv_ruleForStmtLinhaLinha= ruleForStmtLinhaLinha EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForStmtLinhaLinhaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForStmtLinhaLinha=ruleForStmtLinhaLinha();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForStmtLinhaLinha.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForStmtLinhaLinha"


    // $ANTLR start "ruleForStmtLinhaLinha"
    // InternalMyDsl.g:6216:1: ruleForStmtLinhaLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt ) | (kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression ) ) ;
    public final AntlrDatatypeRuleToken ruleForStmtLinhaLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_RANGE_7=null;
        AntlrDatatypeRuleToken this_assign_op_0 = null;

        AntlrDatatypeRuleToken this_ExpressionList_1 = null;

        AntlrDatatypeRuleToken this_Condition_3 = null;

        AntlrDatatypeRuleToken this_PostStmt_5 = null;

        AntlrDatatypeRuleToken this_Expression_8 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6222:2: ( ( (this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt ) | (kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression ) ) )
            // InternalMyDsl.g:6223:2: ( (this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt ) | (kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression ) )
            {
            // InternalMyDsl.g:6223:2: ( (this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt ) | (kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=RULE_ADD_OP && LA112_0<=RULE_MUL_OP)) ) {
                alt112=1;
            }
            else if ( (LA112_0==74) ) {
                int LA112_2 = input.LA(2);

                if ( (LA112_2==RULE_DECIMALS||LA112_2==RULE_IDENTIFIER||(LA112_2>=RULE_STRUCT && LA112_2<=RULE_CHAN)||(LA112_2>=RULE_INT_LIT && LA112_2<=RULE_UNARY_OP)||LA112_2==61||LA112_2==63||LA112_2==65||LA112_2==70||LA112_2==73) ) {
                    alt112=1;
                }
                else if ( (LA112_2==RULE_RANGE) ) {
                    alt112=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalMyDsl.g:6224:3: (this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt )
                    {
                    // InternalMyDsl.g:6224:3: (this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt )
                    // InternalMyDsl.g:6225:4: this_assign_op_0= ruleassign_op this_ExpressionList_1= ruleExpressionList kw= ';' this_Condition_3= ruleCondition kw= ';' this_PostStmt_5= rulePostStmt
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaLinhaAccess().getAssign_opParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_37);
                    this_assign_op_0=ruleassign_op();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_assign_op_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaLinhaAccess().getExpressionListParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_ExpressionList_1=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ExpressionList_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaLinhaAccess().getSemicolonKeyword_0_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaLinhaAccess().getConditionParserRuleCall_0_3());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_Condition_3=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_Condition_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,68,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaLinhaAccess().getSemicolonKeyword_0_4());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaLinhaAccess().getPostStmtParserRuleCall_0_5());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_PostStmt_5=rulePostStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PostStmt_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:6277:3: (kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression )
                    {
                    // InternalMyDsl.g:6277:3: (kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression )
                    // InternalMyDsl.g:6278:4: kw= '=' this_RANGE_7= RULE_RANGE this_Expression_8= ruleExpression
                    {
                    kw=(Token)match(input,74,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getForStmtLinhaLinhaAccess().getEqualsSignKeyword_1_0());
                      			
                    }
                    this_RANGE_7=(Token)match(input,RULE_RANGE,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_RANGE_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_RANGE_7, grammarAccess.getForStmtLinhaLinhaAccess().getRANGETerminalRuleCall_1_1());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getForStmtLinhaLinhaAccess().getExpressionParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_2);
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
    // $ANTLR end "ruleForStmtLinhaLinha"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:6305:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:6305:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:6306:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:6312:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6318:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:6319:2: this_Expression_0= ruleExpression
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


    // $ANTLR start "entryRulePostStmt"
    // InternalMyDsl.g:6332:1: entryRulePostStmt returns [String current=null] : iv_rulePostStmt= rulePostStmt EOF ;
    public final String entryRulePostStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePostStmt = null;


        try {
            // InternalMyDsl.g:6332:48: (iv_rulePostStmt= rulePostStmt EOF )
            // InternalMyDsl.g:6333:2: iv_rulePostStmt= rulePostStmt EOF
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
    // InternalMyDsl.g:6339:1: rulePostStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SimpleStmt_0= ruleSimpleStmt ;
    public final AntlrDatatypeRuleToken rulePostStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleStmt_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6345:2: (this_SimpleStmt_0= ruleSimpleStmt )
            // InternalMyDsl.g:6346:2: this_SimpleStmt_0= ruleSimpleStmt
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


    // $ANTLR start "entryRuleGoStmt"
    // InternalMyDsl.g:6359:1: entryRuleGoStmt returns [String current=null] : iv_ruleGoStmt= ruleGoStmt EOF ;
    public final String entryRuleGoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGoStmt = null;


        try {
            // InternalMyDsl.g:6359:46: (iv_ruleGoStmt= ruleGoStmt EOF )
            // InternalMyDsl.g:6360:2: iv_ruleGoStmt= ruleGoStmt EOF
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
    // InternalMyDsl.g:6366:1: ruleGoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GO_0= RULE_GO this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleGoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GO_0=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6372:2: ( (this_GO_0= RULE_GO this_Expression_1= ruleExpression ) )
            // InternalMyDsl.g:6373:2: (this_GO_0= RULE_GO this_Expression_1= ruleExpression )
            {
            // InternalMyDsl.g:6373:2: (this_GO_0= RULE_GO this_Expression_1= ruleExpression )
            // InternalMyDsl.g:6374:3: this_GO_0= RULE_GO this_Expression_1= ruleExpression
            {
            this_GO_0=(Token)match(input,RULE_GO,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_GO_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GO_0, grammarAccess.getGoStmtAccess().getGOTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getGoStmtAccess().getExpressionParserRuleCall_1());
              		
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
    // $ANTLR end "ruleGoStmt"


    // $ANTLR start "entryRuleSelectStmt"
    // InternalMyDsl.g:6395:1: entryRuleSelectStmt returns [String current=null] : iv_ruleSelectStmt= ruleSelectStmt EOF ;
    public final String entryRuleSelectStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectStmt = null;


        try {
            // InternalMyDsl.g:6395:50: (iv_ruleSelectStmt= ruleSelectStmt EOF )
            // InternalMyDsl.g:6396:2: iv_ruleSelectStmt= ruleSelectStmt EOF
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
    // InternalMyDsl.g:6402:1: ruleSelectStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleSelectStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SELECT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_CommClause_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6408:2: ( (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' ) )
            // InternalMyDsl.g:6409:2: (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            {
            // InternalMyDsl.g:6409:2: (this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}' )
            // InternalMyDsl.g:6410:3: this_SELECT_0= RULE_SELECT kw= '{' (this_CommClause_2= ruleCommClause )* kw= '}'
            {
            this_SELECT_0=(Token)match(input,RULE_SELECT,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_SELECT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SELECT_0, grammarAccess.getSelectStmtAccess().getSELECTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,67,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSelectStmtAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalMyDsl.g:6422:3: (this_CommClause_2= ruleCommClause )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=RULE_CASE && LA113_0<=RULE_DEFAULT)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // InternalMyDsl.g:6423:4: this_CommClause_2= ruleCommClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSelectStmtAccess().getCommClauseParserRuleCall_2());
            	      			
            	    }
            	    pushFollow(FOLLOW_64);
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
            	    break loop113;
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
    // InternalMyDsl.g:6443:1: entryRuleCommClause returns [String current=null] : iv_ruleCommClause= ruleCommClause EOF ;
    public final String entryRuleCommClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommClause = null;


        try {
            // InternalMyDsl.g:6443:50: (iv_ruleCommClause= ruleCommClause EOF )
            // InternalMyDsl.g:6444:2: iv_ruleCommClause= ruleCommClause EOF
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
    // InternalMyDsl.g:6450:1: ruleCommClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) ;
    public final AntlrDatatypeRuleToken ruleCommClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CommCase_0 = null;

        AntlrDatatypeRuleToken this_StatementList_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6456:2: ( (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList ) )
            // InternalMyDsl.g:6457:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            {
            // InternalMyDsl.g:6457:2: (this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList )
            // InternalMyDsl.g:6458:3: this_CommCase_0= ruleCommCase kw= ':' this_StatementList_2= ruleStatementList
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCommClauseAccess().getCommCaseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_46);
            this_CommCase_0=ruleCommCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_CommCase_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,76,FOLLOW_57); if (state.failed) return current;
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
    // InternalMyDsl.g:6487:1: entryRuleCommCase returns [String current=null] : iv_ruleCommCase= ruleCommCase EOF ;
    public final String entryRuleCommCase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCase = null;


        try {
            // InternalMyDsl.g:6487:48: (iv_ruleCommCase= ruleCommCase EOF )
            // InternalMyDsl.g:6488:2: iv_ruleCommCase= ruleCommCase EOF
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
    // InternalMyDsl.g:6494:1: ruleCommCase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT ) ;
    public final AntlrDatatypeRuleToken ruleCommCase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CASE_0=null;
        Token this_DEFAULT_3=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_CommCaseLinha_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6500:2: ( ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT ) )
            // InternalMyDsl.g:6501:2: ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT )
            {
            // InternalMyDsl.g:6501:2: ( (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) ) | this_DEFAULT_3= RULE_DEFAULT )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_CASE) ) {
                alt114=1;
            }
            else if ( (LA114_0==RULE_DEFAULT) ) {
                alt114=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalMyDsl.g:6502:3: (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    {
                    // InternalMyDsl.g:6502:3: (this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha ) )
                    // InternalMyDsl.g:6503:4: this_CASE_0= RULE_CASE (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CASE_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CASE_0, grammarAccess.getCommCaseAccess().getCASETerminalRuleCall_0_0());
                      			
                    }
                    // InternalMyDsl.g:6510:4: (this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha )
                    // InternalMyDsl.g:6511:5: this_Expression_1= ruleExpression this_CommCaseLinha_2= ruleCommCaseLinha
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommCaseAccess().getExpressionParserRuleCall_0_1_0());
                      				
                    }
                    pushFollow(FOLLOW_68);
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
                    // InternalMyDsl.g:6534:3: this_DEFAULT_3= RULE_DEFAULT
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
    // InternalMyDsl.g:6545:1: entryRuleCommCaseLinha returns [String current=null] : iv_ruleCommCaseLinha= ruleCommCaseLinha EOF ;
    public final String entryRuleCommCaseLinha() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommCaseLinha = null;


        try {
            // InternalMyDsl.g:6545:53: (iv_ruleCommCaseLinha= ruleCommCaseLinha EOF )
            // InternalMyDsl.g:6546:2: iv_ruleCommCaseLinha= ruleCommCaseLinha EOF
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
    // InternalMyDsl.g:6552:1: ruleCommCaseLinha returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) ;
    public final AntlrDatatypeRuleToken ruleCommCaseLinha() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;

        AntlrDatatypeRuleToken this_Expression_3 = null;

        AntlrDatatypeRuleToken this_IdentifierList_5 = null;

        AntlrDatatypeRuleToken this_RecvExpr_7 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6558:2: ( ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) ) )
            // InternalMyDsl.g:6559:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            {
            // InternalMyDsl.g:6559:2: ( (kw= '<-' this_Expression_1= ruleExpression ) | ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==73) ) {
                alt117=1;
            }
            else if ( (LA117_0==RULE_IDENTIFIER||LA117_0==71||LA117_0==74) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalMyDsl.g:6560:3: (kw= '<-' this_Expression_1= ruleExpression )
                    {
                    // InternalMyDsl.g:6560:3: (kw= '<-' this_Expression_1= ruleExpression )
                    // InternalMyDsl.g:6561:4: kw= '<-' this_Expression_1= ruleExpression
                    {
                    kw=(Token)match(input,73,FOLLOW_37); if (state.failed) return current;
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
                    // InternalMyDsl.g:6578:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    {
                    // InternalMyDsl.g:6578:3: ( ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr )
                    // InternalMyDsl.g:6579:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) ) this_RecvExpr_7= ruleRecvExpr
                    {
                    // InternalMyDsl.g:6579:4: ( ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' ) | (this_IdentifierList_5= ruleIdentifierList kw= ':=' ) )
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==71||LA116_0==74) ) {
                        alt116=1;
                    }
                    else if ( (LA116_0==RULE_IDENTIFIER) ) {
                        alt116=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 116, 0, input);

                        throw nvae;
                    }
                    switch (alt116) {
                        case 1 :
                            // InternalMyDsl.g:6580:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            {
                            // InternalMyDsl.g:6580:5: ( (kw= ',' this_Expression_3= ruleExpression )* kw= '=' )
                            // InternalMyDsl.g:6581:6: (kw= ',' this_Expression_3= ruleExpression )* kw= '='
                            {
                            // InternalMyDsl.g:6581:6: (kw= ',' this_Expression_3= ruleExpression )*
                            loop115:
                            do {
                                int alt115=2;
                                int LA115_0 = input.LA(1);

                                if ( (LA115_0==71) ) {
                                    alt115=1;
                                }


                                switch (alt115) {
                            	case 1 :
                            	    // InternalMyDsl.g:6582:7: kw= ',' this_Expression_3= ruleExpression
                            	    {
                            	    kw=(Token)match(input,71,FOLLOW_37); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							current.merge(kw);
                            	      							newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getCommaKeyword_1_0_0_0_0());
                            	      						
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      							newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getExpressionParserRuleCall_1_0_0_0_1());
                            	      						
                            	    }
                            	    pushFollow(FOLLOW_69);
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
                            	    break loop115;
                                }
                            } while (true);

                            kw=(Token)match(input,74,FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(kw);
                              						newLeafNode(kw, grammarAccess.getCommCaseLinhaAccess().getEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:6605:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            {
                            // InternalMyDsl.g:6605:5: (this_IdentifierList_5= ruleIdentifierList kw= ':=' )
                            // InternalMyDsl.g:6606:6: this_IdentifierList_5= ruleIdentifierList kw= ':='
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCommCaseLinhaAccess().getIdentifierListParserRuleCall_1_0_1_0());
                              					
                            }
                            pushFollow(FOLLOW_40);
                            this_IdentifierList_5=ruleIdentifierList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_IdentifierList_5);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						afterParserOrEnumRuleCall();
                              					
                            }
                            kw=(Token)match(input,75,FOLLOW_37); if (state.failed) return current;
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
    // InternalMyDsl.g:6638:1: entryRuleRecvExpr returns [String current=null] : iv_ruleRecvExpr= ruleRecvExpr EOF ;
    public final String entryRuleRecvExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRecvExpr = null;


        try {
            // InternalMyDsl.g:6638:48: (iv_ruleRecvExpr= ruleRecvExpr EOF )
            // InternalMyDsl.g:6639:2: iv_ruleRecvExpr= ruleRecvExpr EOF
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
    // InternalMyDsl.g:6645:1: ruleRecvExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Expression_0= ruleExpression ;
    public final AntlrDatatypeRuleToken ruleRecvExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6651:2: (this_Expression_0= ruleExpression )
            // InternalMyDsl.g:6652:2: this_Expression_0= ruleExpression
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


    // $ANTLR start "entryRuleReturnStmt"
    // InternalMyDsl.g:6665:1: entryRuleReturnStmt returns [String current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final String entryRuleReturnStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnStmt = null;


        try {
            // InternalMyDsl.g:6665:50: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // InternalMyDsl.g:6666:2: iv_ruleReturnStmt= ruleReturnStmt EOF
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
    // InternalMyDsl.g:6672:1: ruleReturnStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList ) ;
    public final AntlrDatatypeRuleToken ruleReturnStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_RETURN_0=null;
        AntlrDatatypeRuleToken this_ExpressionList_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6678:2: ( (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList ) )
            // InternalMyDsl.g:6679:2: (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList )
            {
            // InternalMyDsl.g:6679:2: (this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList )
            // InternalMyDsl.g:6680:3: this_RETURN_0= RULE_RETURN this_ExpressionList_1= ruleExpressionList
            {
            this_RETURN_0=(Token)match(input,RULE_RETURN,FOLLOW_37); if (state.failed) return current;
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


    // $ANTLR start "entryRuleBreakStmt"
    // InternalMyDsl.g:6701:1: entryRuleBreakStmt returns [String current=null] : iv_ruleBreakStmt= ruleBreakStmt EOF ;
    public final String entryRuleBreakStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBreakStmt = null;


        try {
            // InternalMyDsl.g:6701:49: (iv_ruleBreakStmt= ruleBreakStmt EOF )
            // InternalMyDsl.g:6702:2: iv_ruleBreakStmt= ruleBreakStmt EOF
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
    // InternalMyDsl.g:6708:1: ruleBreakStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleBreakStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BREAK_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6714:2: ( (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:6715:2: (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:6715:2: (this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel )
            // InternalMyDsl.g:6716:3: this_BREAK_0= RULE_BREAK this_Label_1= ruleLabel
            {
            this_BREAK_0=(Token)match(input,RULE_BREAK,FOLLOW_13); if (state.failed) return current;
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


    // $ANTLR start "entryRuleContinueStmt"
    // InternalMyDsl.g:6737:1: entryRuleContinueStmt returns [String current=null] : iv_ruleContinueStmt= ruleContinueStmt EOF ;
    public final String entryRuleContinueStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContinueStmt = null;


        try {
            // InternalMyDsl.g:6737:52: (iv_ruleContinueStmt= ruleContinueStmt EOF )
            // InternalMyDsl.g:6738:2: iv_ruleContinueStmt= ruleContinueStmt EOF
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
    // InternalMyDsl.g:6744:1: ruleContinueStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleContinueStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONTINUE_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6750:2: ( (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:6751:2: (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:6751:2: (this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel )
            // InternalMyDsl.g:6752:3: this_CONTINUE_0= RULE_CONTINUE this_Label_1= ruleLabel
            {
            this_CONTINUE_0=(Token)match(input,RULE_CONTINUE,FOLLOW_13); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGotoStmt"
    // InternalMyDsl.g:6773:1: entryRuleGotoStmt returns [String current=null] : iv_ruleGotoStmt= ruleGotoStmt EOF ;
    public final String entryRuleGotoStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGotoStmt = null;


        try {
            // InternalMyDsl.g:6773:48: (iv_ruleGotoStmt= ruleGotoStmt EOF )
            // InternalMyDsl.g:6774:2: iv_ruleGotoStmt= ruleGotoStmt EOF
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
    // InternalMyDsl.g:6780:1: ruleGotoStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel ) ;
    public final AntlrDatatypeRuleToken ruleGotoStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GOTO_0=null;
        AntlrDatatypeRuleToken this_Label_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6786:2: ( (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel ) )
            // InternalMyDsl.g:6787:2: (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel )
            {
            // InternalMyDsl.g:6787:2: (this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel )
            // InternalMyDsl.g:6788:3: this_GOTO_0= RULE_GOTO this_Label_1= ruleLabel
            {
            this_GOTO_0=(Token)match(input,RULE_GOTO,FOLLOW_13); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFallthroughStmt"
    // InternalMyDsl.g:6809:1: entryRuleFallthroughStmt returns [String current=null] : iv_ruleFallthroughStmt= ruleFallthroughStmt EOF ;
    public final String entryRuleFallthroughStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFallthroughStmt = null;


        try {
            // InternalMyDsl.g:6809:55: (iv_ruleFallthroughStmt= ruleFallthroughStmt EOF )
            // InternalMyDsl.g:6810:2: iv_ruleFallthroughStmt= ruleFallthroughStmt EOF
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
    // InternalMyDsl.g:6816:1: ruleFallthroughStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FALLTHROUGH_0= RULE_FALLTHROUGH ;
    public final AntlrDatatypeRuleToken ruleFallthroughStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FALLTHROUGH_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6822:2: (this_FALLTHROUGH_0= RULE_FALLTHROUGH )
            // InternalMyDsl.g:6823:2: this_FALLTHROUGH_0= RULE_FALLTHROUGH
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


    // $ANTLR start "entryRuleDeferStmt"
    // InternalMyDsl.g:6833:1: entryRuleDeferStmt returns [String current=null] : iv_ruleDeferStmt= ruleDeferStmt EOF ;
    public final String entryRuleDeferStmt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeferStmt = null;


        try {
            // InternalMyDsl.g:6833:49: (iv_ruleDeferStmt= ruleDeferStmt EOF )
            // InternalMyDsl.g:6834:2: iv_ruleDeferStmt= ruleDeferStmt EOF
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
    // InternalMyDsl.g:6840:1: ruleDeferStmt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeferStmt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DEFER_0=null;
        AntlrDatatypeRuleToken this_Expression_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6846:2: ( (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression ) )
            // InternalMyDsl.g:6847:2: (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression )
            {
            // InternalMyDsl.g:6847:2: (this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression )
            // InternalMyDsl.g:6848:3: this_DEFER_0= RULE_DEFER this_Expression_1= ruleExpression
            {
            this_DEFER_0=(Token)match(input,RULE_DEFER,FOLLOW_37); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSourceFile"
    // InternalMyDsl.g:6869:1: entryRuleSourceFile returns [String current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final String entryRuleSourceFile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSourceFile = null;


        try {
            // InternalMyDsl.g:6869:50: (iv_ruleSourceFile= ruleSourceFile EOF )
            // InternalMyDsl.g:6870:2: iv_ruleSourceFile= ruleSourceFile EOF
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
    // InternalMyDsl.g:6876:1: ruleSourceFile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) ;
    public final AntlrDatatypeRuleToken ruleSourceFile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageClause_0 = null;

        AntlrDatatypeRuleToken this_ImportDecl_2 = null;

        AntlrDatatypeRuleToken this_TopLevelDecl_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6882:2: ( (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* ) )
            // InternalMyDsl.g:6883:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            {
            // InternalMyDsl.g:6883:2: (this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )* )
            // InternalMyDsl.g:6884:3: this_PackageClause_0= rulePackageClause kw= ';' (this_ImportDecl_2= ruleImportDecl kw= ';' )* (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSourceFileAccess().getPackageClauseParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_PackageClause_0=rulePackageClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_PackageClause_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,68,FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1());
              		
            }
            // InternalMyDsl.g:6899:3: (this_ImportDecl_2= ruleImportDecl kw= ';' )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==RULE_IMPORT) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalMyDsl.g:6900:4: this_ImportDecl_2= ruleImportDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_2_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_ImportDecl_2=ruleImportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ImportDecl_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_70); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            // InternalMyDsl.g:6916:3: (this_TopLevelDecl_4= ruleTopLevelDecl kw= ';' )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==RULE_FUNC||(LA119_0>=RULE_CONST && LA119_0<=RULE_VAR)) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalMyDsl.g:6917:4: this_TopLevelDecl_4= ruleTopLevelDecl kw= ';'
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getSourceFileAccess().getTopLevelDeclParserRuleCall_3_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_18);
            	    this_TopLevelDecl_4=ruleTopLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_TopLevelDecl_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    kw=(Token)match(input,68,FOLLOW_71); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getSourceFileAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop119;
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
    // InternalMyDsl.g:6937:1: entryRulePackageClause returns [String current=null] : iv_rulePackageClause= rulePackageClause EOF ;
    public final String entryRulePackageClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageClause = null;


        try {
            // InternalMyDsl.g:6937:53: (iv_rulePackageClause= rulePackageClause EOF )
            // InternalMyDsl.g:6938:2: iv_rulePackageClause= rulePackageClause EOF
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
    // InternalMyDsl.g:6944:1: rulePackageClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName ) ;
    public final AntlrDatatypeRuleToken rulePackageClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PACKAGE_0=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:6950:2: ( (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName ) )
            // InternalMyDsl.g:6951:2: (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName )
            {
            // InternalMyDsl.g:6951:2: (this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName )
            // InternalMyDsl.g:6952:3: this_PACKAGE_0= RULE_PACKAGE this_PackageName_1= rulePackageName
            {
            this_PACKAGE_0=(Token)match(input,RULE_PACKAGE,FOLLOW_13); if (state.failed) return current;
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


    // $ANTLR start "entryRulePackageName"
    // InternalMyDsl.g:6973:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:6973:51: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:6974:2: iv_rulePackageName= rulePackageName EOF
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
    // InternalMyDsl.g:6980:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= RULE_IDENTIFIER ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:6986:2: (this_IDENTIFIER_0= RULE_IDENTIFIER )
            // InternalMyDsl.g:6987:2: this_IDENTIFIER_0= RULE_IDENTIFIER
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


    // $ANTLR start "entryRuleImportDecl"
    // InternalMyDsl.g:6997:1: entryRuleImportDecl returns [String current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final String entryRuleImportDecl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportDecl = null;


        try {
            // InternalMyDsl.g:6997:50: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalMyDsl.g:6998:2: iv_ruleImportDecl= ruleImportDecl EOF
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
    // InternalMyDsl.g:7004:1: ruleImportDecl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleImportDecl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IMPORT_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_ImportSpec_1 = null;

        AntlrDatatypeRuleToken this_ImportSpec_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:7010:2: ( (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) ) )
            // InternalMyDsl.g:7011:2: (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            {
            // InternalMyDsl.g:7011:2: (this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) ) )
            // InternalMyDsl.g:7012:3: this_IMPORT_0= RULE_IMPORT (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            {
            this_IMPORT_0=(Token)match(input,RULE_IMPORT,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_IMPORT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_IMPORT_0, grammarAccess.getImportDeclAccess().getIMPORTTerminalRuleCall_0());
              		
            }
            // InternalMyDsl.g:7019:3: (this_ImportSpec_1= ruleImportSpec | (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' ) )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_IDENTIFIER||LA121_0==RULE_STRING_LIT||LA121_0==61) ) {
                alt121=1;
            }
            else if ( (LA121_0==63) ) {
                alt121=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalMyDsl.g:7020:4: this_ImportSpec_1= ruleImportSpec
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
                    // InternalMyDsl.g:7031:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    {
                    // InternalMyDsl.g:7031:4: (kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')' )
                    // InternalMyDsl.g:7032:5: kw= '(' (this_ImportSpec_3= ruleImportSpec kw= ';' )* kw= ')'
                    {
                    kw=(Token)match(input,63,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(kw);
                      					newLeafNode(kw, grammarAccess.getImportDeclAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalMyDsl.g:7037:5: (this_ImportSpec_3= ruleImportSpec kw= ';' )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==RULE_IDENTIFIER||LA120_0==RULE_STRING_LIT||LA120_0==61) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalMyDsl.g:7038:6: this_ImportSpec_3= ruleImportSpec kw= ';'
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getImportDeclAccess().getImportSpecParserRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    this_ImportSpec_3=ruleImportSpec();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(this_ImportSpec_3);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }
                    	    kw=(Token)match(input,68,FOLLOW_73); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						current.merge(kw);
                    	      						newLeafNode(kw, grammarAccess.getImportDeclAccess().getSemicolonKeyword_1_1_1_1());
                    	      					
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop120;
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
    // InternalMyDsl.g:7065:1: entryRuleImportSpec returns [String current=null] : iv_ruleImportSpec= ruleImportSpec EOF ;
    public final String entryRuleImportSpec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportSpec = null;


        try {
            // InternalMyDsl.g:7065:50: (iv_ruleImportSpec= ruleImportSpec EOF )
            // InternalMyDsl.g:7066:2: iv_ruleImportSpec= ruleImportSpec EOF
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
    // InternalMyDsl.g:7072:1: ruleImportSpec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) ;
    public final AntlrDatatypeRuleToken ruleImportSpec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_1 = null;

        AntlrDatatypeRuleToken this_ImportPath_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:7078:2: ( ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath ) )
            // InternalMyDsl.g:7079:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            {
            // InternalMyDsl.g:7079:2: ( (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath )
            // InternalMyDsl.g:7080:3: (kw= '.' | this_PackageName_1= rulePackageName )? this_ImportPath_2= ruleImportPath
            {
            // InternalMyDsl.g:7080:3: (kw= '.' | this_PackageName_1= rulePackageName )?
            int alt122=3;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==61) ) {
                alt122=1;
            }
            else if ( (LA122_0==RULE_IDENTIFIER) ) {
                alt122=2;
            }
            switch (alt122) {
                case 1 :
                    // InternalMyDsl.g:7081:4: kw= '.'
                    {
                    kw=(Token)match(input,61,FOLLOW_74); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:7087:4: this_PackageName_1= rulePackageName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getImportSpecAccess().getPackageNameParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_74);
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
    // InternalMyDsl.g:7112:1: entryRuleImportPath returns [String current=null] : iv_ruleImportPath= ruleImportPath EOF ;
    public final String entryRuleImportPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportPath = null;


        try {
            // InternalMyDsl.g:7112:50: (iv_ruleImportPath= ruleImportPath EOF )
            // InternalMyDsl.g:7113:2: iv_ruleImportPath= ruleImportPath EOF
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
    // InternalMyDsl.g:7119:1: ruleImportPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_LIT_0= RULE_STRING_LIT ;
    public final AntlrDatatypeRuleToken ruleImportPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_LIT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:7125:2: (this_STRING_LIT_0= RULE_STRING_LIT )
            // InternalMyDsl.g:7126:2: this_STRING_LIT_0= RULE_STRING_LIT
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
        // InternalMyDsl.g:925:4: ( ruleResult )
        // InternalMyDsl.g:925:5: ruleResult
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
        // InternalMyDsl.g:957:4: ( ruleParameters )
        // InternalMyDsl.g:957:5: ruleParameters
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
        // InternalMyDsl.g:2829:5: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:2829:6: ( ruleKey ':' )
        {
        // InternalMyDsl.g:2829:6: ( ruleKey ':' )
        // InternalMyDsl.g:2830:6: ruleKey ':'
        {
        pushFollow(FOLLOW_46);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,76,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred6_InternalMyDsl
    public final void synpred6_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:2938:4: ( ( ruleKey ':' ) )
        // InternalMyDsl.g:2938:5: ( ruleKey ':' )
        {
        // InternalMyDsl.g:2938:5: ( ruleKey ':' )
        // InternalMyDsl.g:2939:5: ruleKey ':'
        {
        pushFollow(FOLLOW_46);
        ruleKey();

        state._fsp--;
        if (state.failed) return ;
        match(input,76,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalMyDsl

    // $ANTLR start synpred7_InternalMyDsl
    public final void synpred7_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:3598:5: ( ruleExpression )
        // InternalMyDsl.g:3598:6: ruleExpression
        {
        pushFollow(FOLLOW_2);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalMyDsl

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:4343:6: ( ruleExpressionList )
        // InternalMyDsl.g:4343:7: ruleExpressionList
        {
        pushFollow(FOLLOW_2);
        ruleExpressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:5412:5: ( ruleSimpleStmt )
        // InternalMyDsl.g:5412:6: ruleSimpleStmt
        {
        pushFollow(FOLLOW_2);
        ruleSimpleStmt();

        state._fsp--;
        if (state.failed) return ;

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
    public final boolean synpred7_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMyDsl_fragment(); // can never throw exception
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
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA107 dfa107 = new DFA107(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\13\25\uffff";
    static final String dfa_3s = "\1\6\1\0\24\uffff";
    static final String dfa_4s = "\1\114\1\0\24\uffff";
    static final String dfa_5s = "\2\uffff\11\1\1\2\12\uffff";
    static final String dfa_6s = "\1\0\1\1\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\uffff\1\4\1\13\1\6\1\7\1\10\1\11\57\uffff\1\13\1\uffff\1\1\1\13\1\3\3\13\1\uffff\1\5\2\13\1\12\1\13\1\uffff\1\13",
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
            return "924:3: ( ( ruleResult )=>this_Result_1= ruleResult )?";
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

                        else if ( (LA15_0==EOF||LA15_0==RULE_STRING_LIT||LA15_0==61||LA15_0==64||(LA15_0>=66 && LA15_0<=68)||(LA15_0>=71 && LA15_0<=72)||LA15_0==74||LA15_0==76) ) {s = 11;}

                         
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
    static final String dfa_9s = "\1\6\1\0\12\uffff";
    static final String dfa_10s = "\1\111\1\0\12\uffff";
    static final String dfa_11s = "\2\uffff\1\2\10\uffff\1\1";
    static final String dfa_12s = "\1\uffff\1\0\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\uffff\1\2\1\uffff\4\2\61\uffff\1\1\1\uffff\1\2\4\uffff\1\2\2\uffff\1\2",
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
            return "955:2: ( ( ( ruleParameters )=>this_Parameters_0= ruleParameters ) | this_Type_1= ruleType )";
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
    static final String dfa_14s = "\15\uffff";
    static final String dfa_15s = "\6\uffff\3\11\1\uffff\3\11";
    static final String dfa_16s = "\1\4\1\uffff\1\5\1\4\2\uffff\1\75\1\4\1\5\1\uffff\1\5\2\75";
    static final String dfa_17s = "\1\75\1\uffff\1\76\1\4\2\uffff\3\101\1\uffff\3\101";
    static final String dfa_18s = "\1\uffff\1\1\2\uffff\1\4\1\3\3\uffff\1\2\3\uffff";
    static final String dfa_19s = "\15\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\4\uffff\1\4\7\uffff\1\1\53\uffff\1\3",
            "",
            "\1\6\67\uffff\1\7\1\5",
            "\1\10",
            "",
            "",
            "\1\11\1\5\1\11\1\uffff\1\11",
            "\1\12\1\13\67\uffff\1\11\1\5\1\11\1\uffff\1\11",
            "\1\14\67\uffff\1\11\1\5\1\11\1\uffff\1\11",
            "",
            "\1\13\67\uffff\1\11\1\5\1\11\1\uffff\1\11",
            "\1\11\1\5\1\11\1\uffff\1\11",
            "\1\11\1\5\1\11\1\uffff\1\11"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2493:2: (this_INT_LIT_0= RULE_INT_LIT | this_FLOAT_LIT_1= ruleFLOAT_LIT | this_IMAGINARY_LIT_2= ruleIMAGINARY_LIT | this_STRING_LIT_3= RULE_STRING_LIT )";
        }
    }
    static final String dfa_21s = "\22\uffff";
    static final String dfa_22s = "\1\4\21\uffff";
    static final String dfa_23s = "\1\111\21\uffff";
    static final String dfa_24s = "\1\uffff\20\1\1\2";
    static final String dfa_25s = "\1\0\21\uffff}>";
    static final String[] dfa_26s = {
            "\1\3\1\uffff\1\1\1\uffff\1\6\1\5\1\11\1\13\1\7\1\14\3\uffff\1\2\1\17\52\uffff\1\4\1\uffff\1\16\1\uffff\1\10\1\uffff\1\20\1\uffff\1\21\1\12\2\uffff\1\15",
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

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2827:3: ( ( ( ( ruleKey ':' ) )=>this_ElementList_1= ruleElementList ) (kw= ',' )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_0==RULE_IDENTIFIER) && (synpred3_InternalMyDsl())) {s = 1;}

                        else if ( (LA50_0==RULE_INT_LIT) && (synpred3_InternalMyDsl())) {s = 2;}

                        else if ( (LA50_0==RULE_DECIMALS) && (synpred3_InternalMyDsl())) {s = 3;}

                        else if ( (LA50_0==61) && (synpred3_InternalMyDsl())) {s = 4;}

                        else if ( (LA50_0==RULE_STRING_LIT) && (synpred3_InternalMyDsl())) {s = 5;}

                        else if ( (LA50_0==RULE_STRUCT) && (synpred3_InternalMyDsl())) {s = 6;}

                        else if ( (LA50_0==RULE_MAP) && (synpred3_InternalMyDsl())) {s = 7;}

                        else if ( (LA50_0==65) && (synpred3_InternalMyDsl())) {s = 8;}

                        else if ( (LA50_0==RULE_FUNC) && (synpred3_InternalMyDsl())) {s = 9;}

                        else if ( (LA50_0==70) && (synpred3_InternalMyDsl())) {s = 10;}

                        else if ( (LA50_0==RULE_INTERFACE) && (synpred3_InternalMyDsl())) {s = 11;}

                        else if ( (LA50_0==RULE_CHAN) && (synpred3_InternalMyDsl())) {s = 12;}

                        else if ( (LA50_0==73) && (synpred3_InternalMyDsl())) {s = 13;}

                        else if ( (LA50_0==63) && (synpred3_InternalMyDsl())) {s = 14;}

                        else if ( (LA50_0==RULE_UNARY_OP) && (synpred3_InternalMyDsl())) {s = 15;}

                        else if ( (LA50_0==67) && (synpred3_InternalMyDsl())) {s = 16;}

                        else if ( (LA50_0==69) ) {s = 17;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\23\uffff";
    static final String dfa_28s = "\1\4\20\0\2\uffff";
    static final String dfa_29s = "\1\111\20\0\2\uffff";
    static final String dfa_30s = "\21\uffff\1\1\1\2";
    static final String dfa_31s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\2\uffff}>";
    static final String[] dfa_32s = {
            "\1\3\1\uffff\1\1\1\uffff\1\6\1\5\1\11\1\13\1\7\1\14\3\uffff\1\2\1\17\52\uffff\1\4\1\uffff\1\16\1\uffff\1\10\1\uffff\1\20\2\uffff\1\12\2\uffff\1\15",
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

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2937:3: ( ( ( ruleKey ':' ) )=> (this_Key_0= ruleKey kw= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA52_3 = input.LA(1);

                         
                        int index52_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA52_4 = input.LA(1);

                         
                        int index52_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA52_5 = input.LA(1);

                         
                        int index52_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA52_6 = input.LA(1);

                         
                        int index52_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA52_8 = input.LA(1);

                         
                        int index52_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA52_10 = input.LA(1);

                         
                        int index52_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA52_11 = input.LA(1);

                         
                        int index52_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA52_12 = input.LA(1);

                         
                        int index52_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA52_13 = input.LA(1);

                         
                        int index52_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA52_14 = input.LA(1);

                         
                        int index52_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA52_15 = input.LA(1);

                         
                        int index52_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA52_16 = input.LA(1);

                         
                        int index52_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalMyDsl()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index52_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\21\uffff";
    static final String dfa_34s = "\1\4\4\uffff\12\0\2\uffff";
    static final String dfa_35s = "\1\111\4\uffff\12\0\2\uffff";
    static final String dfa_36s = "\1\uffff\4\1\12\uffff\1\1\1\2";
    static final String dfa_37s = "\1\0\4\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\1\uffff\1\7\1\uffff\1\5\1\4\1\11\1\13\1\6\1\14\3\uffff\1\1\1\17\52\uffff\1\3\1\uffff\1\16\1\uffff\1\10\4\uffff\1\12\2\uffff\1\15",
            "",
            "",
            "",
            "",
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

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "3595:2: ( ( ( ( ruleExpression )=>this_Expression_0= ruleExpression ) kw= ')' ) | (this_Type_2= ruleType kw= ')' this_PrimaryExpr1_4= rulePrimaryExpr1 ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_INT_LIT) && (synpred7_InternalMyDsl())) {s = 1;}

                        else if ( (LA59_0==RULE_DECIMALS) && (synpred7_InternalMyDsl())) {s = 2;}

                        else if ( (LA59_0==61) && (synpred7_InternalMyDsl())) {s = 3;}

                        else if ( (LA59_0==RULE_STRING_LIT) && (synpred7_InternalMyDsl())) {s = 4;}

                        else if ( (LA59_0==RULE_STRUCT) ) {s = 5;}

                        else if ( (LA59_0==RULE_MAP) ) {s = 6;}

                        else if ( (LA59_0==RULE_IDENTIFIER) ) {s = 7;}

                        else if ( (LA59_0==65) ) {s = 8;}

                        else if ( (LA59_0==RULE_FUNC) ) {s = 9;}

                        else if ( (LA59_0==70) ) {s = 10;}

                        else if ( (LA59_0==RULE_INTERFACE) ) {s = 11;}

                        else if ( (LA59_0==RULE_CHAN) ) {s = 12;}

                        else if ( (LA59_0==73) ) {s = 13;}

                        else if ( (LA59_0==63) ) {s = 14;}

                        else if ( (LA59_0==RULE_UNARY_OP) && (synpred7_InternalMyDsl())) {s = 15;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_12 = input.LA(1);

                         
                        int index59_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_13 = input.LA(1);

                         
                        int index59_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_14 = input.LA(1);

                         
                        int index59_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index59_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "4341:4: ( ( ( ruleExpressionList )=>this_ExpressionList_1= ruleExpressionList ) | (this_Type_2= ruleType (kw= ',' this_ExpressionList_4= ruleExpressionList )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_0 = input.LA(1);

                         
                        int index73_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_0==RULE_INT_LIT) && (synpred8_InternalMyDsl())) {s = 1;}

                        else if ( (LA73_0==RULE_DECIMALS) && (synpred8_InternalMyDsl())) {s = 2;}

                        else if ( (LA73_0==61) && (synpred8_InternalMyDsl())) {s = 3;}

                        else if ( (LA73_0==RULE_STRING_LIT) && (synpred8_InternalMyDsl())) {s = 4;}

                        else if ( (LA73_0==RULE_STRUCT) ) {s = 5;}

                        else if ( (LA73_0==RULE_MAP) ) {s = 6;}

                        else if ( (LA73_0==RULE_IDENTIFIER) ) {s = 7;}

                        else if ( (LA73_0==65) ) {s = 8;}

                        else if ( (LA73_0==RULE_FUNC) ) {s = 9;}

                        else if ( (LA73_0==70) ) {s = 10;}

                        else if ( (LA73_0==RULE_INTERFACE) ) {s = 11;}

                        else if ( (LA73_0==RULE_CHAN) ) {s = 12;}

                        else if ( (LA73_0==73) ) {s = 13;}

                        else if ( (LA73_0==63) ) {s = 14;}

                        else if ( (LA73_0==RULE_UNARY_OP) && (synpred8_InternalMyDsl())) {s = 15;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\1\4\1\uffff\1\7\16\uffff";
    static final String dfa_40s = "\1\111\1\uffff\1\114\16\uffff";
    static final String dfa_41s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\2";
    static final String dfa_42s = "\21\uffff}>";
    static final String[] dfa_43s = {
            "\1\3\1\uffff\1\2\7\3\3\1\2\3\3\uffff\1\13\1\uffff\1\14\2\uffff\1\16\1\uffff\1\4\1\15\1\5\1\6\1\7\1\10\1\11\1\17\30\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\12\2\uffff\1\3\2\uffff\1\3",
            "",
            "\1\3\65\uffff\1\3\11\uffff\1\3\3\uffff\1\3\1\20",
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
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4652:2: (this_Declaration_0= ruleDeclaration | this_LabeledStmt_1= ruleLabeledStmt | this_SimpleStmt_2= ruleSimpleStmt | this_GoStmt_3= ruleGoStmt | this_ReturnStmt_4= ruleReturnStmt | this_BreakStmt_5= ruleBreakStmt | this_ContinueStmt_6= ruleContinueStmt | this_GotoStmt_7= ruleGotoStmt | this_FallthroughStmt_8= ruleFallthroughStmt | this_Block_9= ruleBlock | this_IfStmt_10= ruleIfStmt | this_SwitchStmt_11= ruleSwitchStmt | this_SelectStmt_12= ruleSelectStmt | this_ForStmt_13= ruleForStmt | this_DeferStmt_14= ruleDeferStmt )";
        }
    }
    static final String dfa_44s = "\1\4\1\uffff\17\0\1\uffff";
    static final String dfa_45s = "\1\111\1\uffff\17\0\1\uffff";
    static final String dfa_46s = "\1\uffff\1\1\17\uffff\1\2";
    static final String dfa_47s = "\1\0\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff}>";
    static final String[] dfa_48s = {
            "\1\3\1\uffff\1\10\1\1\1\6\1\5\1\12\1\14\1\7\1\15\3\uffff\1\2\1\20\52\uffff\1\4\1\uffff\1\17\1\uffff\1\11\1\uffff\1\21\2\uffff\1\13\2\uffff\1\16",
            "",
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
            ""
    };
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_44;
            this.max = dfa_45;
            this.accept = dfa_46;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "5410:3: ( ( ( ruleSimpleStmt )=>this_SimpleStmt_1= ruleSimpleStmt ) kw= ';' )?";
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
                        if ( (LA95_0==RULE_ANY_OTHER) && (synpred9_InternalMyDsl())) {s = 1;}

                        else if ( (LA95_0==RULE_INT_LIT) ) {s = 2;}

                        else if ( (LA95_0==RULE_DECIMALS) ) {s = 3;}

                        else if ( (LA95_0==61) ) {s = 4;}

                        else if ( (LA95_0==RULE_STRING_LIT) ) {s = 5;}

                        else if ( (LA95_0==RULE_STRUCT) ) {s = 6;}

                        else if ( (LA95_0==RULE_MAP) ) {s = 7;}

                        else if ( (LA95_0==RULE_IDENTIFIER) ) {s = 8;}

                        else if ( (LA95_0==65) ) {s = 9;}

                        else if ( (LA95_0==RULE_FUNC) ) {s = 10;}

                        else if ( (LA95_0==70) ) {s = 11;}

                        else if ( (LA95_0==RULE_INTERFACE) ) {s = 12;}

                        else if ( (LA95_0==RULE_CHAN) ) {s = 13;}

                        else if ( (LA95_0==73) ) {s = 14;}

                        else if ( (LA95_0==63) ) {s = 15;}

                        else if ( (LA95_0==RULE_UNARY_OP) ) {s = 16;}

                        else if ( (LA95_0==67) ) {s = 17;}

                         
                        input.seek(index95_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA95_2 = input.LA(1);

                         
                        int index95_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA95_3 = input.LA(1);

                         
                        int index95_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA95_4 = input.LA(1);

                         
                        int index95_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA95_5 = input.LA(1);

                         
                        int index95_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA95_6 = input.LA(1);

                         
                        int index95_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA95_7 = input.LA(1);

                         
                        int index95_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA95_8 = input.LA(1);

                         
                        int index95_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA95_9 = input.LA(1);

                         
                        int index95_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA95_10 = input.LA(1);

                         
                        int index95_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA95_11 = input.LA(1);

                         
                        int index95_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA95_12 = input.LA(1);

                         
                        int index95_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA95_13 = input.LA(1);

                         
                        int index95_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA95_14 = input.LA(1);

                         
                        int index95_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA95_15 = input.LA(1);

                         
                        int index95_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA95_16 = input.LA(1);

                         
                        int index95_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index95_16);
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
    static final String dfa_49s = "\11\uffff";
    static final String dfa_50s = "\1\4\1\uffff\1\7\2\uffff\1\6\1\4\1\107\1\uffff";
    static final String dfa_51s = "\1\111\1\uffff\1\113\2\uffff\1\6\1\111\1\113\1\uffff";
    static final String dfa_52s = "\1\uffff\1\1\1\uffff\1\2\1\4\3\uffff\1\3";
    static final String dfa_53s = "\11\uffff}>";
    static final String[] dfa_54s = {
            "\1\1\1\uffff\1\2\1\3\6\1\3\uffff\2\1\52\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\4\2\uffff\1\1\2\uffff\1\1",
            "",
            "\1\1\65\uffff\1\1\11\uffff\1\5\3\uffff\1\6",
            "",
            "",
            "\1\7",
            "\1\3\1\uffff\1\3\1\uffff\6\3\3\uffff\2\3\11\uffff\1\10\40\uffff\1\3\1\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\1\3",
            "\1\5\3\uffff\1\6",
            ""
    };

    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = dfa_49;
            this.eof = dfa_49;
            this.min = dfa_50;
            this.max = dfa_51;
            this.accept = dfa_52;
            this.special = dfa_53;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "5950:3: ( (this_Expression_1= ruleExpression this_ForStmtLinha_2= ruleForStmtLinha ) | ( (this_EmptyStmt_3= ruleEmptyStmt | this_ShortVarDecl_4= ruleShortVarDecl ) kw= ';' this_Condition_6= ruleCondition kw= ';' this_PostStmt_8= rulePostStmt ) | (this_IdentifierList_9= ruleIdentifierList kw= ':=' this_RANGE_11= RULE_RANGE this_Expression_12= ruleExpression ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x8000000000003D40L,0x0000000000000242L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x2000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xA000000000063F50L,0x0000000000000246L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8000000000003D42L,0x0000000000000242L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x8000000000003D40L,0x0000000000000343L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000000000003D40L,0x0000000000000342L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000200L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xA000001FE947FFD0L,0x000000000000026AL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xA000001FE947FFD2L,0x000000000000024AL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000003D42L,0x0000000000000642L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xA000000000063F50L,0x0000000000000242L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000000003D40L,0x0000000000000642L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xA000000000063F50L,0x0000000000000346L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xA000000000063F50L,0x000000000000026AL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xA000000000063F50L,0x000000000000024AL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0xA000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xA000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xA000000000000080L,0x0000000000000008L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xA000000000063F50L,0x0000000000001242L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xA000000000063F50L,0x0000000000000243L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000181L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000380080L,0x0000000000006000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000300080L,0x0000000000018680L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000300000L,0x0000000000000480L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xA000001FE947FFD0L,0x000000000000024AL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000300080L,0x0000000000018688L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xA000000000063FD0L,0x0000000000000242L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000008L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xA000000000063FD0L,0x000000000000024AL});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000006000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xA000000000023F50L,0x0000000000000242L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000680L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x000000400001C402L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x000000000001C402L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0xA000000000000240L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x2000000000000240L,0x0000000000000001L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2000000000000240L});

}