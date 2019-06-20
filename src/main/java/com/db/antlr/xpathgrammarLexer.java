// Generated from /Users/Danny/Desktop/CSE 232B/232/src/main/java/com/db/xpathgrammar.g4 by ANTLR 4.7.2
package com.db.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DOC=2, IS=3, EQ=4, AND=5, OR=6, NOT=7, TEXT=8, FOR=9, IN=10, LET=11, 
		WHERE=12, RETURN=13, EMPTY=14, SOME=15, SATISFIES=16, JOIN=17, ASSIGN=18, 
		AT=19, LPAREN=20, RPAREN=21, SLASH=22, STAR=23, DOT=24, LBRACKET=25, RBRACKET=26, 
		LCBRACKET=27, RCBRACKET=28, LESS=29, GREAT=30, COMMA=31, EQUAL=32, WS=33, 
		NAME=34, FILEPATHNAME=35, STRING=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DOC", "IS", "EQ", "AND", "OR", "NOT", "TEXT", "FOR", "IN", "LET", 
			"WHERE", "RETURN", "EMPTY", "SOME", "SATISFIES", "JOIN", "ASSIGN", "AT", 
			"LPAREN", "RPAREN", "SLASH", "STAR", "DOT", "LBRACKET", "RBRACKET", "LCBRACKET", 
			"RCBRACKET", "LESS", "GREAT", "COMMA", "EQUAL", "WS", "NAME", "FILEPATHNAME", 
			"STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'doc'", "'is'", "'eq'", "'and'", "'or'", "'not'", "'text'", 
			"'for'", "'in'", "'let'", "'where'", "'return'", "'empty'", "'some'", 
			"'satisfies'", "'join'", "':='", "'@'", "'('", "')'", "'/'", "'*'", "'.'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'", "','", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DOC", "IS", "EQ", "AND", "OR", "NOT", "TEXT", "FOR", "IN", 
			"LET", "WHERE", "RETURN", "EMPTY", "SOME", "SATISFIES", "JOIN", "ASSIGN", 
			"AT", "LPAREN", "RPAREN", "SLASH", "STAR", "DOT", "LBRACKET", "RBRACKET", 
			"LCBRACKET", "RCBRACKET", "LESS", "GREAT", "COMMA", "EQUAL", "WS", "NAME", 
			"FILEPATHNAME", "STRING"
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


	public xpathgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xpathgrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00d5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00ba\n\"\r\"\16\"\u00bb"+
		"\3\"\3\"\3#\6#\u00c1\n#\r#\16#\u00c2\3$\3$\6$\u00c7\n$\r$\16$\u00c8\3"+
		"$\3$\3%\3%\7%\u00cf\n%\f%\16%\u00d2\13%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2"+
		"\6\5\2\13\f\17\17\"\"\6\2\62;C\\aac|\6\2\60;C\\aac|\5\2\f\f\17\17$$\2"+
		"\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7Q\3\2\2\2\tT\3\2\2\2\13W\3"+
		"\2\2\2\r[\3\2\2\2\17^\3\2\2\2\21b\3\2\2\2\23g\3\2\2\2\25k\3\2\2\2\27n"+
		"\3\2\2\2\31r\3\2\2\2\33x\3\2\2\2\35\177\3\2\2\2\37\u0085\3\2\2\2!\u008a"+
		"\3\2\2\2#\u0094\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2"+
		"+\u00a0\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00aa\3\2\2\2\67\u00ac\3\2\2\29\u00ae\3\2\2\2;\u00b0\3\2\2"+
		"\2=\u00b2\3\2\2\2?\u00b4\3\2\2\2A\u00b6\3\2\2\2C\u00b9\3\2\2\2E\u00c0"+
		"\3\2\2\2G\u00c4\3\2\2\2I\u00cc\3\2\2\2KL\7&\2\2L\4\3\2\2\2MN\7f\2\2NO"+
		"\7q\2\2OP\7e\2\2P\6\3\2\2\2QR\7k\2\2RS\7u\2\2S\b\3\2\2\2TU\7g\2\2UV\7"+
		"s\2\2V\n\3\2\2\2WX\7c\2\2XY\7p\2\2YZ\7f\2\2Z\f\3\2\2\2[\\\7q\2\2\\]\7"+
		"t\2\2]\16\3\2\2\2^_\7p\2\2_`\7q\2\2`a\7v\2\2a\20\3\2\2\2bc\7v\2\2cd\7"+
		"g\2\2de\7z\2\2ef\7v\2\2f\22\3\2\2\2gh\7h\2\2hi\7q\2\2ij\7t\2\2j\24\3\2"+
		"\2\2kl\7k\2\2lm\7p\2\2m\26\3\2\2\2no\7n\2\2op\7g\2\2pq\7v\2\2q\30\3\2"+
		"\2\2rs\7y\2\2st\7j\2\2tu\7g\2\2uv\7t\2\2vw\7g\2\2w\32\3\2\2\2xy\7t\2\2"+
		"yz\7g\2\2z{\7v\2\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~\34\3\2\2\2\177\u0080\7"+
		"g\2\2\u0080\u0081\7o\2\2\u0081\u0082\7r\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7{\2\2\u0084\36\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7o\2\2\u0088\u0089\7g\2\2\u0089 \3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7c\2\2\u008c\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7h\2\2\u0090\u0091\7k\2\2\u0091\u0092\7g\2\2\u0092\u0093\7u\2\2"+
		"\u0093\"\3\2\2\2\u0094\u0095\7l\2\2\u0095\u0096\7q\2\2\u0096\u0097\7k"+
		"\2\2\u0097\u0098\7p\2\2\u0098$\3\2\2\2\u0099\u009a\7<\2\2\u009a\u009b"+
		"\7?\2\2\u009b&\3\2\2\2\u009c\u009d\7B\2\2\u009d(\3\2\2\2\u009e\u009f\7"+
		"*\2\2\u009f*\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7\61"+
		"\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7"+
		"\60\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7]\2\2\u00a9\64\3\2\2\2\u00aa\u00ab"+
		"\7_\2\2\u00ab\66\3\2\2\2\u00ac\u00ad\7}\2\2\u00ad8\3\2\2\2\u00ae\u00af"+
		"\7\177\2\2\u00af:\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1<\3\2\2\2\u00b2\u00b3"+
		"\7@\2\2\u00b3>\3\2\2\2\u00b4\u00b5\7.\2\2\u00b5@\3\2\2\2\u00b6\u00b7\7"+
		"?\2\2\u00b7B\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\"\2\2\u00beD\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3F\3"+
		"\2\2\2\u00c4\u00c6\7$\2\2\u00c5\u00c7\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7$\2\2\u00cbH\3\2\2\2\u00cc\u00d0\7$\2\2\u00cd\u00cf"+
		"\n\5\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7$"+
		"\2\2\u00d4J\3\2\2\2\7\2\u00bb\u00c2\u00c8\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}