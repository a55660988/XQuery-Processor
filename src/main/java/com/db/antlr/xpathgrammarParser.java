// Generated from /Users/Danny/Desktop/CSE 232B/232/src/main/java/com/db/xpathgrammar.g4 by ANTLR 4.7.2
package com.db.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xpathgrammarParser extends Parser {
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
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_filename = 3, RULE_tagName = 4, 
		RULE_attName = 5, RULE_xq = 6, RULE_var = 7, RULE_stringConstant = 8, 
		RULE_forClause = 9, RULE_letClause = 10, RULE_whereClause = 11, RULE_returnClause = 12, 
		RULE_cond = 13, RULE_joinClause = 14, RULE_joinAtt = 15, RULE_varName = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f", "filename", "tagName", "attName", "xq", "var", "stringConstant", 
			"forClause", "letClause", "whereClause", "returnClause", "cond", "joinClause", 
			"joinAtt", "varName"
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

	@Override
	public String getGrammarFileName() { return "xpathgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xpathgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ap_apContext extends ApContext {
		public TerminalNode DOC() { return getToken(xpathgrammarParser.DOC, 0); }
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public List<TerminalNode> SLASH() { return getTokens(xpathgrammarParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(xpathgrammarParser.SLASH, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Ap_apContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitAp_ap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		int _la;
		try {
			_localctx = new Ap_apContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DOC);
			setState(35);
			match(LPAREN);
			setState(36);
			filename();
			setState(37);
			match(RPAREN);
			setState(38);
			match(SLASH);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(39);
				match(SLASH);
				}
			}

			setState(42);
			rp(0);
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rp_slash_rpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(xpathgrammarParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(xpathgrammarParser.SLASH, i);
		}
		public Rp_slash_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_slash_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_rpContext extends RpContext {
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public Rp_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_starContext extends RpContext {
		public TerminalNode STAR() { return getToken(xpathgrammarParser.STAR, 0); }
		public Rp_starContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_star(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_textContext extends RpContext {
		public TerminalNode TEXT() { return getToken(xpathgrammarParser.TEXT, 0); }
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public Rp_textContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_text(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_tagNameContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public Rp_tagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_tagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_filterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(xpathgrammarParser.LBRACKET, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(xpathgrammarParser.RBRACKET, 0); }
		public Rp_filterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_filter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_comma_rpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(xpathgrammarParser.COMMA, 0); }
		public Rp_comma_rpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_comma_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_atContext extends RpContext {
		public TerminalNode AT() { return getToken(xpathgrammarParser.AT, 0); }
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public Rp_atContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_at(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rp_dot_dotContext extends RpContext {
		public List<TerminalNode> DOT() { return getTokens(xpathgrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(xpathgrammarParser.DOT, i);
		}
		public Rp_dot_dotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitRp_dot_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new Rp_tagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				tagName();
				}
				break;
			case STAR:
				{
				_localctx = new Rp_starContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(STAR);
				}
				break;
			case DOT:
				{
				_localctx = new Rp_dot_dotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(DOT);
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(48);
					match(DOT);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				_localctx = new Rp_textContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(TEXT);
				setState(52);
				match(LPAREN);
				setState(53);
				match(RPAREN);
				}
				break;
			case AT:
				{
				_localctx = new Rp_atContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(AT);
				setState(55);
				attName();
				}
				break;
			case LPAREN:
				{
				_localctx = new Rp_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(LPAREN);
				setState(57);
				rp(0);
				setState(58);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Rp_slash_rpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						match(SLASH);
						setState(65);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SLASH) {
							{
							setState(64);
							match(SLASH);
							}
						}

						setState(67);
						rp(4);
						}
						break;
					case 2:
						{
						_localctx = new Rp_comma_rpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(68);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(69);
						match(COMMA);
						setState(70);
						rp(2);
						}
						break;
					case 3:
						{
						_localctx = new Rp_filterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(LBRACKET);
						setState(73);
						f(0);
						setState(74);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class F_and_fContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode AND() { return getToken(xpathgrammarParser.AND, 0); }
		public F_and_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_and_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_rpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public F_rpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_eqContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(xpathgrammarParser.EQUAL, 0); }
		public TerminalNode EQ() { return getToken(xpathgrammarParser.EQ, 0); }
		public F_eqContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_not_fContext extends FContext {
		public TerminalNode NOT() { return getToken(xpathgrammarParser.NOT, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public F_not_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_not_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_isContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(xpathgrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(xpathgrammarParser.EQUAL, i);
		}
		public TerminalNode IS() { return getToken(xpathgrammarParser.IS, 0); }
		public F_isContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_fContext extends FContext {
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public F_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_f(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_or_fContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode OR() { return getToken(xpathgrammarParser.OR, 0); }
		public F_or_fContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitF_or_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new F_rpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new F_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				rp(0);
				setState(84);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(85);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new F_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				rp(0);
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(88);
					match(EQUAL);
					setState(89);
					match(EQUAL);
					}
					break;
				case IS:
					{
					setState(90);
					match(IS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new F_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(LPAREN);
				setState(96);
				f(0);
				setState(97);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new F_not_fContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(NOT);
				setState(100);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new F_and_fContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104);
						match(AND);
						setState(105);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new F_or_fContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107);
						match(OR);
						setState(108);
						f(3);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode FILEPATHNAME() { return getToken(xpathgrammarParser.FILEPATHNAME, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FILEPATHNAME);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xpathgrammarParser.NAME, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NAME);
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

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xpathgrammarParser.NAME, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NAME);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Xq_xqContext extends XqContext {
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public Xq_xqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_xq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_comma_xqContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(xpathgrammarParser.COMMA, 0); }
		public Xq_comma_xqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_comma_xq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_slash_rpContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> SLASH() { return getTokens(xpathgrammarParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(xpathgrammarParser.SLASH, i);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public Xq_slash_rpContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_slash_rp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_t_xq_tContext extends XqContext {
		public List<TerminalNode> LESS() { return getTokens(xpathgrammarParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(xpathgrammarParser.LESS, i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> GREAT() { return getTokens(xpathgrammarParser.GREAT); }
		public TerminalNode GREAT(int i) {
			return getToken(xpathgrammarParser.GREAT, i);
		}
		public TerminalNode LCBRACKET() { return getToken(xpathgrammarParser.LCBRACKET, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(xpathgrammarParser.RCBRACKET, 0); }
		public TerminalNode SLASH() { return getToken(xpathgrammarParser.SLASH, 0); }
		public Xq_t_xq_tContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_t_xq_t(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_stringconContext extends XqContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public Xq_stringconContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_stringcon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_apContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public Xq_apContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_ap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_varContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Xq_varContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_for_let_where_returnContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Xq_for_let_where_returnContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_for_let_where_return(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_joinContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public Xq_joinContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_join(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_t_xq_t_no_bracketContext extends XqContext {
		public List<TerminalNode> LESS() { return getTokens(xpathgrammarParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(xpathgrammarParser.LESS, i);
		}
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> GREAT() { return getTokens(xpathgrammarParser.GREAT); }
		public TerminalNode GREAT(int i) {
			return getToken(xpathgrammarParser.GREAT, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(xpathgrammarParser.SLASH, 0); }
		public Xq_t_xq_t_no_bracketContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_t_xq_t_no_bracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xq_letContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public Xq_letContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitXq_let(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new Xq_varContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				var();
				}
				break;
			case 2:
				{
				_localctx = new Xq_stringconContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				stringConstant();
				}
				break;
			case 3:
				{
				_localctx = new Xq_apContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				ap();
				}
				break;
			case 4:
				{
				_localctx = new Xq_xqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LPAREN);
				setState(125);
				xq(0);
				setState(126);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new Xq_t_xq_tContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(LESS);
				setState(129);
				tagName();
				setState(130);
				match(GREAT);
				setState(131);
				match(LCBRACKET);
				setState(132);
				xq(0);
				setState(133);
				match(RCBRACKET);
				setState(134);
				match(LESS);
				setState(135);
				match(SLASH);
				setState(136);
				tagName();
				setState(137);
				match(GREAT);
				}
				break;
			case 6:
				{
				_localctx = new Xq_t_xq_t_no_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(LESS);
				setState(140);
				tagName();
				setState(141);
				match(GREAT);
				setState(142);
				xq(0);
				setState(143);
				match(LESS);
				setState(144);
				match(SLASH);
				setState(145);
				tagName();
				setState(146);
				match(GREAT);
				}
				break;
			case 7:
				{
				_localctx = new Xq_for_let_where_returnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				forClause();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(149);
					letClause();
					}
				}

				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(152);
					whereClause();
					}
				}

				setState(155);
				returnClause();
				}
				break;
			case 8:
				{
				_localctx = new Xq_letContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				letClause();
				setState(158);
				xq(2);
				}
				break;
			case 9:
				{
				_localctx = new Xq_joinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				joinClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Xq_comma_xqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(163);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(164);
						match(COMMA);
						setState(165);
						xq(8);
						}
						break;
					case 2:
						{
						_localctx = new Xq_slash_rpContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(166);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						match(SLASH);
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SLASH) {
							{
							setState(168);
							match(SLASH);
							}
						}

						setState(171);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(176);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xpathgrammarParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__0);
			setState(178);
			match(NAME);
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

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(xpathgrammarParser.STRING, 0); }
		public TerminalNode FILEPATHNAME() { return getToken(xpathgrammarParser.FILEPATHNAME, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==FILEPATHNAME || _la==STRING) ) {
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

	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(xpathgrammarParser.FOR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(xpathgrammarParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(xpathgrammarParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(xpathgrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xpathgrammarParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(FOR);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					var();
					setState(184);
					match(IN);
					setState(185);
					xq(0);
					setState(186);
					match(COMMA);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(193);
			var();
			setState(194);
			match(IN);
			setState(195);
			xq(0);
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

	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(xpathgrammarParser.LET, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(xpathgrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(xpathgrammarParser.ASSIGN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(xpathgrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xpathgrammarParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LET);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198);
					var();
					setState(199);
					match(ASSIGN);
					setState(200);
					xq(0);
					setState(201);
					match(COMMA);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(208);
			var();
			setState(209);
			match(ASSIGN);
			setState(210);
			xq(0);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(xpathgrammarParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(WHERE);
			setState(213);
			cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(xpathgrammarParser.RETURN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(RETURN);
			setState(216);
			xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_emptyContext extends CondContext {
		public TerminalNode EMPTY() { return getToken(xpathgrammarParser.EMPTY, 0); }
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public Cond_emptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_empty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_eqContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(xpathgrammarParser.EQUAL, 0); }
		public TerminalNode EQ() { return getToken(xpathgrammarParser.EQ, 0); }
		public Cond_eqContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_eq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_not_condContext extends CondContext {
		public TerminalNode NOT() { return getToken(xpathgrammarParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Cond_not_condContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_not_cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_isContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(xpathgrammarParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(xpathgrammarParser.EQUAL, i);
		}
		public TerminalNode IS() { return getToken(xpathgrammarParser.IS, 0); }
		public Cond_isContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_is(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_or_condContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode OR() { return getToken(xpathgrammarParser.OR, 0); }
		public Cond_or_condContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_or_cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_condContext extends CondContext {
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public Cond_condContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_cond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_someContext extends CondContext {
		public TerminalNode SOME() { return getToken(xpathgrammarParser.SOME, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(xpathgrammarParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(xpathgrammarParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(xpathgrammarParser.SATISFIES, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(xpathgrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xpathgrammarParser.COMMA, i);
		}
		public Cond_someContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_some(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_and_condContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode AND() { return getToken(xpathgrammarParser.AND, 0); }
		public Cond_and_condContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitCond_and_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new Cond_eqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				xq(0);
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(221);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new Cond_isContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				xq(0);
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(224);
					match(EQUAL);
					setState(225);
					match(EQUAL);
					}
					break;
				case IS:
					{
					setState(226);
					match(IS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new Cond_emptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(EMPTY);
				setState(232);
				match(LPAREN);
				setState(233);
				xq(0);
				setState(234);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new Cond_someContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(SOME);
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						var();
						setState(238);
						match(IN);
						setState(239);
						xq(0);
						setState(240);
						match(COMMA);
						}
						} 
					}
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(247);
				var();
				setState(248);
				match(IN);
				setState(249);
				xq(0);
				setState(250);
				match(SATISFIES);
				setState(251);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new Cond_condContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(LPAREN);
				setState(254);
				cond(0);
				setState(255);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new Cond_not_condContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(NOT);
				setState(258);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Cond_and_condContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						match(AND);
						setState(263);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new Cond_or_condContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						match(OR);
						setState(266);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	 
		public JoinClauseContext() { }
		public void copyFrom(JoinClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Join_clauseContext extends JoinClauseContext {
		public TerminalNode JOIN() { return getToken(xpathgrammarParser.JOIN, 0); }
		public TerminalNode LPAREN() { return getToken(xpathgrammarParser.LPAREN, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(xpathgrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xpathgrammarParser.COMMA, i);
		}
		public List<JoinAttContext> joinAtt() {
			return getRuleContexts(JoinAttContext.class);
		}
		public JoinAttContext joinAtt(int i) {
			return getRuleContext(JoinAttContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(xpathgrammarParser.RPAREN, 0); }
		public Join_clauseContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_joinClause);
		try {
			_localctx = new Join_clauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(JOIN);
			setState(273);
			match(LPAREN);
			setState(274);
			xq(0);
			setState(275);
			match(COMMA);
			setState(276);
			xq(0);
			setState(277);
			match(COMMA);
			setState(278);
			joinAtt();
			setState(279);
			match(COMMA);
			setState(280);
			joinAtt();
			setState(281);
			match(RPAREN);
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

	public static class JoinAttContext extends ParserRuleContext {
		public JoinAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinAtt; }
	 
		public JoinAttContext() { }
		public void copyFrom(JoinAttContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Join_attrContext extends JoinAttContext {
		public TerminalNode LBRACKET() { return getToken(xpathgrammarParser.LBRACKET, 0); }
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(xpathgrammarParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(xpathgrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xpathgrammarParser.COMMA, i);
		}
		public Join_attrContext(JoinAttContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitJoin_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinAttContext joinAtt() throws RecognitionException {
		JoinAttContext _localctx = new JoinAttContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_joinAtt);
		try {
			int _alt;
			_localctx = new Join_attrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LBRACKET);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					varName();
					setState(285);
					match(COMMA);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(292);
			varName();
			setState(293);
			match(RBRACKET);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(xpathgrammarParser.NAME, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xpathgrammarVisitor ) return ((xpathgrammarVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(NAME);
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
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return f_sempred((FContext)_localctx, predIndex);
		case 6:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 13:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3\3\3\5\3D\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4h\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0099"+
		"\n\b\3\b\5\b\u009c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16"+
		"\13\u00c2\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ce"+
		"\n\f\f\f\16\f\u00d1\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f5\n\17"+
		"\f\17\16\17\u00f8\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0106\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u010e"+
		"\n\17\f\17\16\17\u0111\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0122\n\21\f\21\16\21\u0125\13"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\2\6\4\6\16\34\23\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"\2\4\4\2\6\6\"\"\3\2%&\2\u0145\2$\3\2\2\2\4>\3\2"+
		"\2\2\6g\3\2\2\2\bt\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16\u00a3\3\2\2\2\20\u00b3"+
		"\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26\u00c7\3\2\2\2\30\u00d6\3"+
		"\2\2\2\32\u00d9\3\2\2\2\34\u0105\3\2\2\2\36\u0112\3\2\2\2 \u011d\3\2\2"+
		"\2\"\u0129\3\2\2\2$%\7\4\2\2%&\7\26\2\2&\'\5\b\5\2\'(\7\27\2\2(*\7\30"+
		"\2\2)+\7\30\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\5\4\3\2-\3\3\2\2\2./\b"+
		"\3\1\2/?\5\n\6\2\60?\7\31\2\2\61\63\7\32\2\2\62\64\7\32\2\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\64?\3\2\2\2\65\66\7\n\2\2\66\67\7\26\2\2\67?\7\27\2"+
		"\289\7\25\2\29?\5\f\7\2:;\7\26\2\2;<\5\4\3\2<=\7\27\2\2=?\3\2\2\2>.\3"+
		"\2\2\2>\60\3\2\2\2>\61\3\2\2\2>\65\3\2\2\2>8\3\2\2\2>:\3\2\2\2?P\3\2\2"+
		"\2@A\f\5\2\2AC\7\30\2\2BD\7\30\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EO\5\4"+
		"\3\6FG\f\3\2\2GH\7!\2\2HO\5\4\3\4IJ\f\4\2\2JK\7\33\2\2KL\5\6\4\2LM\7\34"+
		"\2\2MO\3\2\2\2N@\3\2\2\2NF\3\2\2\2NI\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2"+
		"\2\2Q\5\3\2\2\2RP\3\2\2\2ST\b\4\1\2Th\5\4\3\2UV\5\4\3\2VW\t\2\2\2WX\5"+
		"\4\3\2Xh\3\2\2\2Y]\5\4\3\2Z[\7\"\2\2[^\7\"\2\2\\^\7\5\2\2]Z\3\2\2\2]\\"+
		"\3\2\2\2^_\3\2\2\2_`\5\4\3\2`h\3\2\2\2ab\7\26\2\2bc\5\6\4\2cd\7\27\2\2"+
		"dh\3\2\2\2ef\7\t\2\2fh\5\6\4\3gS\3\2\2\2gU\3\2\2\2gY\3\2\2\2ga\3\2\2\2"+
		"ge\3\2\2\2hq\3\2\2\2ij\f\5\2\2jk\7\7\2\2kp\5\6\4\6lm\f\4\2\2mn\7\b\2\2"+
		"np\5\6\4\5oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\7\3\2\2"+
		"\2sq\3\2\2\2tu\7%\2\2u\t\3\2\2\2vw\7$\2\2w\13\3\2\2\2xy\7$\2\2y\r\3\2"+
		"\2\2z{\b\b\1\2{\u00a4\5\20\t\2|\u00a4\5\22\n\2}\u00a4\5\2\2\2~\177\7\26"+
		"\2\2\177\u0080\5\16\b\2\u0080\u0081\7\27\2\2\u0081\u00a4\3\2\2\2\u0082"+
		"\u0083\7\37\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7 \2\2\u0085\u0086\7\35"+
		"\2\2\u0086\u0087\5\16\b\2\u0087\u0088\7\36\2\2\u0088\u0089\7\37\2\2\u0089"+
		"\u008a\7\30\2\2\u008a\u008b\5\n\6\2\u008b\u008c\7 \2\2\u008c\u00a4\3\2"+
		"\2\2\u008d\u008e\7\37\2\2\u008e\u008f\5\n\6\2\u008f\u0090\7 \2\2\u0090"+
		"\u0091\5\16\b\2\u0091\u0092\7\37\2\2\u0092\u0093\7\30\2\2\u0093\u0094"+
		"\5\n\6\2\u0094\u0095\7 \2\2\u0095\u00a4\3\2\2\2\u0096\u0098\5\24\13\2"+
		"\u0097\u0099\5\26\f\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u009c\5\30\r\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\5\32\16\2\u009e\u00a4\3\2\2\2\u009f\u00a0"+
		"\5\26\f\2\u00a0\u00a1\5\16\b\4\u00a1\u00a4\3\2\2\2\u00a2\u00a4\5\36\20"+
		"\2\u00a3z\3\2\2\2\u00a3|\3\2\2\2\u00a3}\3\2\2\2\u00a3~\3\2\2\2\u00a3\u0082"+
		"\3\2\2\2\u00a3\u008d\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\f\t\2\2\u00a6\u00a7\7!"+
		"\2\2\u00a7\u00af\5\16\b\n\u00a8\u00a9\f\b\2\2\u00a9\u00ab\7\30\2\2\u00aa"+
		"\u00ac\7\30\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3"+
		"\2\2\2\u00ad\u00af\5\4\3\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\17\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b5\7$\2\2\u00b5\21"+
		"\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\23\3\2\2\2\u00b8\u00c0\7\13\2\2\u00b9"+
		"\u00ba\5\20\t\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\7"+
		"!\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\5\16\b\2\u00c6"+
		"\25\3\2\2\2\u00c7\u00cf\7\r\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7\24"+
		"\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7!\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5\20\t\2\u00d3"+
		"\u00d4\7\24\2\2\u00d4\u00d5\5\16\b\2\u00d5\27\3\2\2\2\u00d6\u00d7\7\16"+
		"\2\2\u00d7\u00d8\5\34\17\2\u00d8\31\3\2\2\2\u00d9\u00da\7\17\2\2\u00da"+
		"\u00db\5\16\b\2\u00db\33\3\2\2\2\u00dc\u00dd\b\17\1\2\u00dd\u00de\5\16"+
		"\b\2\u00de\u00df\t\2\2\2\u00df\u00e0\5\16\b\2\u00e0\u0106\3\2\2\2\u00e1"+
		"\u00e5\5\16\b\2\u00e2\u00e3\7\"\2\2\u00e3\u00e6\7\"\2\2\u00e4\u00e6\7"+
		"\5\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\5\16\b\2\u00e8\u0106\3\2\2\2\u00e9\u00ea\7\20\2\2\u00ea\u00eb\7"+
		"\26\2\2\u00eb\u00ec\5\16\b\2\u00ec\u00ed\7\27\2\2\u00ed\u0106\3\2\2\2"+
		"\u00ee\u00f6\7\21\2\2\u00ef\u00f0\5\20\t\2\u00f0\u00f1\7\f\2\2\u00f1\u00f2"+
		"\5\16\b\2\u00f2\u00f3\7!\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5\20\t\2\u00fa\u00fb\7\f\2\2\u00fb"+
		"\u00fc\5\16\b\2\u00fc\u00fd\7\22\2\2\u00fd\u00fe\5\34\17\7\u00fe\u0106"+
		"\3\2\2\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\34\17\2\u0101\u0102\7\27\2"+
		"\2\u0102\u0106\3\2\2\2\u0103\u0104\7\t\2\2\u0104\u0106\5\34\17\3\u0105"+
		"\u00dc\3\2\2\2\u0105\u00e1\3\2\2\2\u0105\u00e9\3\2\2\2\u0105\u00ee\3\2"+
		"\2\2\u0105\u00ff\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010f\3\2\2\2\u0107"+
		"\u0108\f\5\2\2\u0108\u0109\7\7\2\2\u0109\u010e\5\34\17\6\u010a\u010b\f"+
		"\4\2\2\u010b\u010c\7\b\2\2\u010c\u010e\5\34\17\5\u010d\u0107\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\35\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\23\2\2\u0113\u0114"+
		"\7\26\2\2\u0114\u0115\5\16\b\2\u0115\u0116\7!\2\2\u0116\u0117\5\16\b\2"+
		"\u0117\u0118\7!\2\2\u0118\u0119\5 \21\2\u0119\u011a\7!\2\2\u011a\u011b"+
		"\5 \21\2\u011b\u011c\7\27\2\2\u011c\37\3\2\2\2\u011d\u0123\7\33\2\2\u011e"+
		"\u011f\5\"\22\2\u011f\u0120\7!\2\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\5\"\22\2\u0127\u0128\7"+
		"\34\2\2\u0128!\3\2\2\2\u0129\u012a\7$\2\2\u012a#\3\2\2\2\32*\63>CNP]g"+
		"oq\u0098\u009b\u00a3\u00ab\u00ae\u00b0\u00c0\u00cf\u00e5\u00f6\u0105\u010d"+
		"\u010f\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}