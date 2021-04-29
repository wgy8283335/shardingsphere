// Generated from TransferRule.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransferRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD_=1, IDENTIFIER_=2, WS=3, FOR_GENERATOR=4, LP_=5, RP_=6, LBE_=7, 
		RBE_=8, LBT_=9, RBT_=10, SEMI_=11, COLON_=12, MLT_=13, DOT_=14, VERTICAL_BAR_=15, 
		EQ_=16, COMMA_=17, SQ_=18, AT_=19;
	public static final int
		RULE_sentences = 0, RULE_rules = 1, RULE_identifiers = 2, RULE_keyWords = 3, 
		RULE_symbols = 4, RULE_rbtMulti = 5, RULE_rbeMulti = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentences", "rules", "identifiers", "keyWords", "symbols", "rbtMulti", 
			"rbeMulti"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", "'...'", "'.'", 
			"'|'", "'='", "','", "'''", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD_", "IDENTIFIER_", "WS", "FOR_GENERATOR", "LP_", "RP_", 
			"LBE_", "RBE_", "LBT_", "RBT_", "SEMI_", "COLON_", "MLT_", "DOT_", "VERTICAL_BAR_", 
			"EQ_", "COMMA_", "SQ_", "AT_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TransferRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TransferRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SentencesContext extends ParserRuleContext {
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode SEMI_() { return getToken(TransferRuleParser.SEMI_, 0); }
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitSentences(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				rules(0);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_) | (1L << IDENTIFIER_) | (1L << LP_) | (1L << LBE_) | (1L << LBT_) | (1L << VERTICAL_BAR_) | (1L << SQ_) | (1L << AT_))) != 0) );
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(19);
				match(SEMI_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
	 
		public RulesContext() { }
		public void copyFrom(RulesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KeywordsRuleContext extends RulesContext {
		public KeyWordsContext keyWords() {
			return getRuleContext(KeyWordsContext.class,0);
		}
		public KeywordsRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterKeywordsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitKeywordsRule(this);
		}
	}
	public static class SQRuleContext extends RulesContext {
		public List<TerminalNode> SQ_() { return getTokens(TransferRuleParser.SQ_); }
		public TerminalNode SQ_(int i) {
			return getToken(TransferRuleParser.SQ_, i);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public SQRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterSQRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitSQRule(this);
		}
	}
	public static class VERTICALRuleContext extends RulesContext {
		public TerminalNode VERTICAL_BAR_() { return getToken(TransferRuleParser.VERTICAL_BAR_, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public VERTICALRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterVERTICALRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitVERTICALRule(this);
		}
	}
	public static class LBERuleContext extends RulesContext {
		public TerminalNode LBE_() { return getToken(TransferRuleParser.LBE_, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode RBE_() { return getToken(TransferRuleParser.RBE_, 0); }
		public TerminalNode COMMA_() { return getToken(TransferRuleParser.COMMA_, 0); }
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(TransferRuleParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(TransferRuleParser.VERTICAL_BAR_, i);
		}
		public LBERuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterLBERule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitLBERule(this);
		}
	}
	public static class LBEMultiRuleContext extends RulesContext {
		public TerminalNode LBE_() { return getToken(TransferRuleParser.LBE_, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public RbeMultiContext rbeMulti() {
			return getRuleContext(RbeMultiContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(TransferRuleParser.COMMA_, 0); }
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(TransferRuleParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(TransferRuleParser.VERTICAL_BAR_, i);
		}
		public LBEMultiRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterLBEMultiRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitLBEMultiRule(this);
		}
	}
	public static class SymbolRuleContext extends RulesContext {
		public List<TerminalNode> SQ_() { return getTokens(TransferRuleParser.SQ_); }
		public TerminalNode SQ_(int i) {
			return getToken(TransferRuleParser.SQ_, i);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public SymbolRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterSymbolRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitSymbolRule(this);
		}
	}
	public static class LBTMultiRuleContext extends RulesContext {
		public TerminalNode LBT_() { return getToken(TransferRuleParser.LBT_, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public RbtMultiContext rbtMulti() {
			return getRuleContext(RbtMultiContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(TransferRuleParser.COMMA_, 0); }
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(TransferRuleParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(TransferRuleParser.VERTICAL_BAR_, i);
		}
		public LBTMultiRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterLBTMultiRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitLBTMultiRule(this);
		}
	}
	public static class LBTRuleContext extends RulesContext {
		public TerminalNode LBT_() { return getToken(TransferRuleParser.LBT_, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode RBT_() { return getToken(TransferRuleParser.RBT_, 0); }
		public TerminalNode COMMA_() { return getToken(TransferRuleParser.COMMA_, 0); }
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(TransferRuleParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(TransferRuleParser.VERTICAL_BAR_, i);
		}
		public LBTRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterLBTRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitLBTRule(this);
		}
	}
	public static class IdentifierRuleContext extends RulesContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public IdentifierRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterIdentifierRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitIdentifierRule(this);
		}
	}
	public static class LPRuleContext extends RulesContext {
		public TerminalNode LP_() { return getToken(TransferRuleParser.LP_, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public TerminalNode RP_() { return getToken(TransferRuleParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(TransferRuleParser.COMMA_, 0); }
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(TransferRuleParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(TransferRuleParser.VERTICAL_BAR_, i);
		}
		public LPRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterLPRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitLPRule(this);
		}
	}
	public static class ATRuleContext extends RulesContext {
		public TerminalNode AT_() { return getToken(TransferRuleParser.AT_, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public ATRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterATRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitATRule(this);
		}
	}
	public static class EqualRuleContext extends RulesContext {
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public List<TerminalNode> EQ_() { return getTokens(TransferRuleParser.EQ_); }
		public TerminalNode EQ_(int i) {
			return getToken(TransferRuleParser.EQ_, i);
		}
		public EqualRuleContext(RulesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterEqualRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitEqualRule(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		return rules(0);
	}

	private RulesContext rules(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RulesContext _localctx = new RulesContext(_ctx, _parentState);
		RulesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rules, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				identifiers();
				}
				break;
			case 2:
				{
				_localctx = new KeywordsRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				keyWords();
				}
				break;
			case 3:
				{
				_localctx = new LBEMultiRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(LBE_);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(26);
					match(COMMA_);
					}
				}

				setState(29);
				rules(0);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VERTICAL_BAR_) {
					{
					{
					setState(30);
					match(VERTICAL_BAR_);
					setState(31);
					rules(0);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				rbeMulti();
				}
				break;
			case 4:
				{
				_localctx = new LBERuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(LBE_);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(40);
					match(COMMA_);
					}
				}

				setState(43);
				rules(0);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VERTICAL_BAR_) {
					{
					{
					setState(44);
					match(VERTICAL_BAR_);
					setState(45);
					rules(0);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(RBE_);
				}
				break;
			case 5:
				{
				_localctx = new LBTMultiRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(LBT_);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(54);
					match(COMMA_);
					}
				}

				setState(57);
				rules(0);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VERTICAL_BAR_) {
					{
					{
					setState(58);
					match(VERTICAL_BAR_);
					setState(59);
					rules(0);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(65);
				rbtMulti();
				}
				break;
			case 6:
				{
				_localctx = new LBTRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(LBT_);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(68);
					match(COMMA_);
					}
				}

				setState(71);
				rules(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VERTICAL_BAR_) {
					{
					{
					setState(72);
					match(VERTICAL_BAR_);
					setState(73);
					rules(0);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(RBT_);
				}
				break;
			case 7:
				{
				_localctx = new LPRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(LP_);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(82);
					match(COMMA_);
					}
				}

				setState(85);
				rules(0);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VERTICAL_BAR_) {
					{
					{
					setState(86);
					match(VERTICAL_BAR_);
					setState(87);
					rules(0);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(RP_);
				}
				break;
			case 8:
				{
				_localctx = new SQRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(SQ_);
				setState(96);
				rules(0);
				setState(97);
				match(SQ_);
				}
				break;
			case 9:
				{
				_localctx = new ATRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(AT_);
				setState(100);
				rules(3);
				}
				break;
			case 10:
				{
				_localctx = new VERTICALRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(VERTICAL_BAR_);
				setState(102);
				rules(2);
				}
				break;
			case 11:
				{
				_localctx = new SymbolRuleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(SQ_);
				setState(104);
				symbols();
				setState(105);
				match(SQ_);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualRuleContext(new RulesContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_rules);
					setState(109);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(114); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(111);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==EQ_) {
								{
								setState(110);
								match(EQ_);
								}
							}

							setState(113);
							rules(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(116); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_() { return getTokens(TransferRuleParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(TransferRuleParser.IDENTIFIER_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(TransferRuleParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(TransferRuleParser.DOT_, i);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitIdentifiers(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123);
					match(IDENTIFIER_);
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(124);
						match(DOT_);
						}
						break;
					}
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(127);
						match(IDENTIFIER_);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyWordsContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD_() { return getTokens(TransferRuleParser.KEYWORD_); }
		public TerminalNode KEYWORD_(int i) {
			return getToken(TransferRuleParser.KEYWORD_, i);
		}
		public KeyWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterKeyWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitKeyWords(this);
		}
	}

	public final KeyWordsContext keyWords() throws RecognitionException {
		KeyWordsContext _localctx = new KeyWordsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyWords);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(134);
					match(KEYWORD_);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(TransferRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(TransferRuleParser.RP_, 0); }
		public TerminalNode LBE_() { return getToken(TransferRuleParser.LBE_, 0); }
		public TerminalNode RBE_() { return getToken(TransferRuleParser.RBE_, 0); }
		public TerminalNode LBT_() { return getToken(TransferRuleParser.LBT_, 0); }
		public TerminalNode RBT_() { return getToken(TransferRuleParser.RBT_, 0); }
		public TerminalNode SEMI_() { return getToken(TransferRuleParser.SEMI_, 0); }
		public TerminalNode COLON_() { return getToken(TransferRuleParser.COLON_, 0); }
		public TerminalNode MLT_() { return getToken(TransferRuleParser.MLT_, 0); }
		public TerminalNode DOT_() { return getToken(TransferRuleParser.DOT_, 0); }
		public TerminalNode VERTICAL_BAR_() { return getToken(TransferRuleParser.VERTICAL_BAR_, 0); }
		public TerminalNode EQ_() { return getToken(TransferRuleParser.EQ_, 0); }
		public TerminalNode COMMA_() { return getToken(TransferRuleParser.COMMA_, 0); }
		public TerminalNode SQ_() { return getToken(TransferRuleParser.SQ_, 0); }
		public TerminalNode AT_() { return getToken(TransferRuleParser.AT_, 0); }
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP_) | (1L << RP_) | (1L << LBE_) | (1L << RBE_) | (1L << LBT_) | (1L << RBT_) | (1L << SEMI_) | (1L << COLON_) | (1L << MLT_) | (1L << DOT_) | (1L << VERTICAL_BAR_) | (1L << EQ_) | (1L << COMMA_) | (1L << SQ_) | (1L << AT_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RbtMultiContext extends ParserRuleContext {
		public TerminalNode RBT_() { return getToken(TransferRuleParser.RBT_, 0); }
		public TerminalNode MLT_() { return getToken(TransferRuleParser.MLT_, 0); }
		public RbtMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbtMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterRbtMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitRbtMulti(this);
		}
	}

	public final RbtMultiContext rbtMulti() throws RecognitionException {
		RbtMultiContext _localctx = new RbtMultiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rbtMulti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(RBT_);
			setState(142);
			match(MLT_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RbeMultiContext extends ParserRuleContext {
		public TerminalNode RBE_() { return getToken(TransferRuleParser.RBE_, 0); }
		public TerminalNode MLT_() { return getToken(TransferRuleParser.MLT_, 0); }
		public RbeMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbeMulti; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).enterRbeMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransferRuleListener ) ((TransferRuleListener)listener).exitRbeMulti(this);
		}
	}

	public final RbeMultiContext rbeMulti() throws RecognitionException {
		RbeMultiContext _localctx = new RbeMultiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rbeMulti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(RBE_);
			setState(145);
			match(MLT_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rules_sempred((RulesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rules_sempred(RulesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\2\5\2\27\n\2\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\7\3#\n"+
		"\3\f\3\16\3&\13\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\3\7\3\61\n\3\f\3"+
		"\16\3\64\13\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B"+
		"\13\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\3"+
		"\3\3\3\3\3\3\5\3V\n\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\3\3\5\3r\n\3"+
		"\3\3\6\3u\n\3\r\3\16\3v\7\3y\n\3\f\3\16\3|\13\3\3\4\3\4\5\4\u0080\n\4"+
		"\3\4\5\4\u0083\n\4\6\4\u0085\n\4\r\4\16\4\u0086\3\5\6\5\u008a\n\5\r\5"+
		"\16\5\u008b\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\2\3\4\t\2\4\6\b\n\f\16"+
		"\2\3\3\2\7\25\2\u00ab\2\21\3\2\2\2\4m\3\2\2\2\6\u0084\3\2\2\2\b\u0089"+
		"\3\2\2\2\n\u008d\3\2\2\2\f\u008f\3\2\2\2\16\u0092\3\2\2\2\20\22\5\4\3"+
		"\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2"+
		"\2\25\27\7\r\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\3\3\2\2\2\30\31\b\3\1"+
		"\2\31n\5\6\4\2\32n\5\b\5\2\33\35\7\t\2\2\34\36\7\23\2\2\35\34\3\2\2\2"+
		"\35\36\3\2\2\2\36\37\3\2\2\2\37$\5\4\3\2 !\7\21\2\2!#\5\4\3\2\" \3\2\2"+
		"\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\5\16\b\2(n\3"+
		"\2\2\2)+\7\t\2\2*,\7\23\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-\62\5\4\3\2"+
		"./\7\21\2\2/\61\5\4\3\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\n\2\2\66n\3\2\2\2\679\7\13"+
		"\2\28:\7\23\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;@\5\4\3\2<=\7\21\2\2=?\5"+
		"\4\3\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\5"+
		"\f\7\2Dn\3\2\2\2EG\7\13\2\2FH\7\23\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2I"+
		"N\5\4\3\2JK\7\21\2\2KM\5\4\3\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OQ\3\2\2\2PN\3\2\2\2QR\7\f\2\2Rn\3\2\2\2SU\7\7\2\2TV\7\23\2\2UT\3\2\2"+
		"\2UV\3\2\2\2VW\3\2\2\2W\\\5\4\3\2XY\7\21\2\2Y[\5\4\3\2ZX\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\b\2\2`n\3\2\2\2ab"+
		"\7\24\2\2bc\5\4\3\2cd\7\24\2\2dn\3\2\2\2ef\7\25\2\2fn\5\4\3\5gh\7\21\2"+
		"\2hn\5\4\3\4ij\7\24\2\2jk\5\n\6\2kl\7\24\2\2ln\3\2\2\2m\30\3\2\2\2m\32"+
		"\3\2\2\2m\33\3\2\2\2m)\3\2\2\2m\67\3\2\2\2mE\3\2\2\2mS\3\2\2\2ma\3\2\2"+
		"\2me\3\2\2\2mg\3\2\2\2mi\3\2\2\2nz\3\2\2\2ot\f\f\2\2pr\7\22\2\2qp\3\2"+
		"\2\2qr\3\2\2\2rs\3\2\2\2su\5\4\3\2tq\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2wy\3\2\2\2xo\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|z\3"+
		"\2\2\2}\177\7\4\2\2~\u0080\7\20\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\u0083\7\4\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0085\3\2\2\2\u0084}\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\7\3\2\2\2\u0088\u008a\7\3\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\t\3\2\2\2\u008d\u008e\t\2\2\2\u008e\13\3\2\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\u0091\7\17\2\2\u0091\r\3\2\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0094\7\17\2\2\u0094\17\3\2\2\2\26\23\26\35$+\629@GNU\\mqvz\177\u0082"+
		"\u0086\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}