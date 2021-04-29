// Generated from TransferRule.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransferRuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD_=1, IDENTIFIER_=2, WS=3, FOR_GENERATOR=4, LP_=5, RP_=6, LBE_=7, 
		RBE_=8, LBT_=9, RBT_=10, SEMI_=11, COLON_=12, MLT_=13, DOT_=14, VERTICAL_BAR_=15, 
		EQ_=16, COMMA_=17, SQ_=18, AT_=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD_", "IDENTIFIER_", "WS", "FOR_GENERATOR", "A", "B", "C", "D", 
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
			"S", "T", "U", "V", "W", "X", "Y", "Z", "UL_", "LP_", "RP_", "LBE_", 
			"RBE_", "LBT_", "RBT_", "SEMI_", "COLON_", "MLT_", "DOT_", "VERTICAL_BAR_", 
			"EQ_", "COMMA_", "SQ_", "AT_"
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


	public TransferRuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TransferRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\6\2a\n\2\r\2\16\2b\3\3\6\3f\n\3\r\3\16\3"+
		"g\3\4\6\4k\n\4\r\4\16\4l\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\2\2"+
		"\60\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\7C\bE\tG"+
		"\nI\13K\fM\rO\16Q\17S\20U\21W\22Y\23[\24]\25\3\2\37\4\2C\\aa\5\2C\\aa"+
		"c|\4\2\13\f\17\17\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2"+
		"IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\2\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3`\3\2\2\2\5e\3\2\2\2\7j\3\2\2\2\tp\3"+
		"\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2\2\2\17\u009f\3\2\2\2\21\u00a1\3\2"+
		"\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2"+
		"\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2\2#"+
		"\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bb\3"+
		"\2\2\2-\u00bd\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2"+
		"\65\u00c5\3\2\2\2\67\u00c7\3\2\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00cd"+
		"\3\2\2\2?\u00cf\3\2\2\2A\u00d1\3\2\2\2C\u00d3\3\2\2\2E\u00d5\3\2\2\2G"+
		"\u00d7\3\2\2\2I\u00d9\3\2\2\2K\u00db\3\2\2\2M\u00dd\3\2\2\2O\u00df\3\2"+
		"\2\2Q\u00e1\3\2\2\2S\u00e5\3\2\2\2U\u00e7\3\2\2\2W\u00e9\3\2\2\2Y\u00eb"+
		"\3\2\2\2[\u00ed\3\2\2\2]\u00ef\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b"+
		"`\3\2\2\2bc\3\2\2\2c\4\3\2\2\2df\t\3\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2"+
		"gh\3\2\2\2h\6\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mn\3\2\2\2no\b\4\2\2o\b\3\2\2\2pq\7F\2\2qr\7Q\2\2rs\7\"\2\2st\7P\2\2"+
		"tu\7Q\2\2uv\7V\2\2vw\7\"\2\2wx\7O\2\2xy\7C\2\2yz\7V\2\2z{\7E\2\2{|\7J"+
		"\2\2|}\7\"\2\2}~\7C\2\2~\177\7P\2\2\177\u0080\7[\2\2\u0080\u0081\7\"\2"+
		"\2\u0081\u0082\7V\2\2\u0082\u0083\7J\2\2\u0083\u0084\7K\2\2\u0084\u0085"+
		"\7P\2\2\u0085\u0086\7I\2\2\u0086\u0087\7.\2\2\u0087\u0088\7\"\2\2\u0088"+
		"\u0089\7L\2\2\u0089\u008a\7W\2\2\u008a\u008b\7U\2\2\u008b\u008c\7V\2\2"+
		"\u008c\u008d\7\"\2\2\u008d\u008e\7H\2\2\u008e\u008f\7Q\2\2\u008f\u0090"+
		"\7T\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7I\2\2\u0092\u0093\7G\2\2\u0093"+
		"\u0094\7P\2\2\u0094\u0095\7G\2\2\u0095\u0096\7T\2\2\u0096\u0097\7C\2\2"+
		"\u0097\u0098\7V\2\2\u0098\u0099\7Q\2\2\u0099\u009a\7T\2\2\u009a\n\3\2"+
		"\2\2\u009b\u009c\t\5\2\2\u009c\f\3\2\2\2\u009d\u009e\t\6\2\2\u009e\16"+
		"\3\2\2\2\u009f\u00a0\t\7\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\t\b\2\2\u00a2"+
		"\22\3\2\2\2\u00a3\u00a4\t\t\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\t\n\2\2\u00a6"+
		"\26\3\2\2\2\u00a7\u00a8\t\13\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\t\f\2\2"+
		"\u00aa\32\3\2\2\2\u00ab\u00ac\t\r\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\t\16"+
		"\2\2\u00ae\36\3\2\2\2\u00af\u00b0\t\17\2\2\u00b0 \3\2\2\2\u00b1\u00b2"+
		"\t\20\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\t\21\2\2\u00b4$\3\2\2\2\u00b5\u00b6"+
		"\t\22\2\2\u00b6&\3\2\2\2\u00b7\u00b8\t\23\2\2\u00b8(\3\2\2\2\u00b9\u00ba"+
		"\t\24\2\2\u00ba*\3\2\2\2\u00bb\u00bc\t\25\2\2\u00bc,\3\2\2\2\u00bd\u00be"+
		"\t\26\2\2\u00be.\3\2\2\2\u00bf\u00c0\t\27\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\t\30\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\t\31\2\2\u00c4\64\3\2\2\2\u00c5"+
		"\u00c6\t\32\2\2\u00c6\66\3\2\2\2\u00c7\u00c8\t\33\2\2\u00c88\3\2\2\2\u00c9"+
		"\u00ca\t\34\2\2\u00ca:\3\2\2\2\u00cb\u00cc\t\35\2\2\u00cc<\3\2\2\2\u00cd"+
		"\u00ce\t\36\2\2\u00ce>\3\2\2\2\u00cf\u00d0\7a\2\2\u00d0@\3\2\2\2\u00d1"+
		"\u00d2\7*\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4D\3\2\2\2\u00d5\u00d6"+
		"\7}\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7\177\2\2\u00d8H\3\2\2\2\u00d9\u00da"+
		"\7]\2\2\u00daJ\3\2\2\2\u00db\u00dc\7_\2\2\u00dcL\3\2\2\2\u00dd\u00de\7"+
		"=\2\2\u00deN\3\2\2\2\u00df\u00e0\7<\2\2\u00e0P\3\2\2\2\u00e1\u00e2\7\60"+
		"\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7\60\2\2\u00e4R\3\2\2\2\u00e5\u00e6"+
		"\7\60\2\2\u00e6T\3\2\2\2\u00e7\u00e8\7~\2\2\u00e8V\3\2\2\2\u00e9\u00ea"+
		"\7?\2\2\u00eaX\3\2\2\2\u00eb\u00ec\7.\2\2\u00ecZ\3\2\2\2\u00ed\u00ee\7"+
		")\2\2\u00ee\\\3\2\2\2\u00ef\u00f0\7B\2\2\u00f0^\3\2\2\2\6\2bgl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}