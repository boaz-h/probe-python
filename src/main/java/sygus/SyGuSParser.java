// Generated from C:/Users/boazy/Desktop/project/probe/src/main/java/sygus\SyGuS.g4 by ANTLR 4.10.1
package sygus;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyGuSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		LineComment=32, WS=33, Numeral=34, Decimal=35, BoolConst=36, HexConst=37, 
		BinConst=38, StringConst=39, Symbol=40;
	public static final int
		RULE_syGuS = 0, RULE_sort = 1, RULE_bfTerm = 2, RULE_term = 3, RULE_sortedVar = 4, 
		RULE_varBinding = 5, RULE_feature = 6, RULE_cmd = 7, RULE_smtCmd = 8, 
		RULE_sortDecl = 9, RULE_dTDec = 10, RULE_dtConsDec = 11, RULE_grammarDef = 12, 
		RULE_groupedRuleList = 13, RULE_gTerm = 14, RULE_identifier = 15, RULE_index = 16, 
		RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"syGuS", "sort", "bfTerm", "term", "sortedVar", "varBinding", "feature", 
			"cmd", "smtCmd", "sortDecl", "dTDec", "dtConsDec", "grammarDef", "groupedRuleList", 
			"gTerm", "identifier", "index", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Bool'", "'Real'", "'('", "'BitVec'", "')'", "'exists'", 
			"'forall'", "'let'", "'grammars'", "'fwd-decls'", "'recursion'", "'check-synth'", 
			"'constraint'", "'declare-var'", "'inv-constraint'", "'set-feature'", 
			"':'", "'synth-fun'", "'synth-inv'", "'declare-datatype'", "'declare-datatypes'", 
			"'declare-sort'", "'define-fun'", "'define-sort'", "'set-info'", "'set-logic'", 
			"'set-option'", "'Constant'", "'Variable'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LineComment", "WS", 
			"Numeral", "Decimal", "BoolConst", "HexConst", "BinConst", "StringConst", 
			"Symbol"
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
	public String getGrammarFileName() { return "SyGuS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyGuSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SyGuSContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public SyGuSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syGuS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterSyGuS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitSyGuS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitSyGuS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyGuSContext syGuS() throws RecognitionException {
		SyGuSContext _localctx = new SyGuSContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syGuS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(36);
				cmd();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SortContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sort);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(T__3);
				setState(46);
				match(T__4);
				setState(47);
				index();
				setState(48);
				match(T__5);
				}
				break;
			case Symbol:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(Symbol);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BfTermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<BfTermContext> bfTerm() {
			return getRuleContexts(BfTermContext.class);
		}
		public BfTermContext bfTerm(int i) {
			return getRuleContext(BfTermContext.class,i);
		}
		public BfTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterBfTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitBfTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitBfTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfTermContext bfTerm() throws RecognitionException {
		BfTermContext _localctx = new BfTermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bfTerm);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(T__3);
				setState(56);
				identifier();
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					bfTerm();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << Numeral) | (1L << Decimal) | (1L << BoolConst) | (1L << HexConst) | (1L << BinConst) | (1L << StringConst) | (1L << Symbol))) != 0) );
				setState(62);
				match(T__5);
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<SortedVarContext> sortedVar() {
			return getRuleContexts(SortedVarContext.class);
		}
		public SortedVarContext sortedVar(int i) {
			return getRuleContext(SortedVarContext.class,i);
		}
		public List<VarBindingContext> varBinding() {
			return getRuleContexts(VarBindingContext.class);
		}
		public VarBindingContext varBinding(int i) {
			return getRuleContext(VarBindingContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term);
		int _la;
		try {
			int _alt;
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__3);
				setState(69);
				identifier();
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					term();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << Numeral) | (1L << Decimal) | (1L << BoolConst) | (1L << HexConst) | (1L << BinConst) | (1L << StringConst) | (1L << Symbol))) != 0) );
				setState(75);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__3);
				setState(78);
				match(T__6);
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(79);
						sortedVar();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(84);
				term();
				setState(85);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__3);
				setState(88);
				match(T__7);
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(89);
						sortedVar();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(94);
				term();
				setState(95);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(T__3);
				setState(98);
				match(T__8);
				setState(99);
				match(T__3);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					varBinding();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(105);
				match(T__5);
				setState(106);
				term();
				setState(107);
				match(T__5);
				}
				break;
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

	public static class SortedVarContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public SortedVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortedVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterSortedVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitSortedVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitSortedVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortedVarContext sortedVar() throws RecognitionException {
		SortedVarContext _localctx = new SortedVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sortedVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__3);
			setState(112);
			match(Symbol);
			setState(113);
			sort();
			setState(114);
			match(T__5);
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

	public static class VarBindingContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public VarBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterVarBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitVarBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitVarBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBindingContext varBinding() throws RecognitionException {
		VarBindingContext _localctx = new VarBindingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__3);
			setState(117);
			match(Symbol);
			setState(118);
			term();
			setState(119);
			match(T__5);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_feature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class CmdContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<TerminalNode> Symbol() { return getTokens(SyGuSParser.Symbol); }
		public TerminalNode Symbol(int i) {
			return getToken(SyGuSParser.Symbol, i);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public FeatureContext feature() {
			return getRuleContext(FeatureContext.class,0);
		}
		public TerminalNode BoolConst() { return getToken(SyGuSParser.BoolConst, 0); }
		public List<SortedVarContext> sortedVar() {
			return getRuleContexts(SortedVarContext.class);
		}
		public SortedVarContext sortedVar(int i) {
			return getRuleContext(SortedVarContext.class,i);
		}
		public GrammarDefContext grammarDef() {
			return getRuleContext(GrammarDefContext.class,0);
		}
		public SmtCmdContext smtCmd() {
			return getRuleContext(SmtCmdContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__3);
				setState(124);
				match(T__12);
				setState(125);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__3);
				setState(127);
				match(T__13);
				setState(128);
				term();
				setState(129);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__3);
				setState(132);
				match(T__14);
				setState(133);
				match(Symbol);
				setState(134);
				sort();
				setState(135);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__3);
				setState(138);
				match(T__15);
				setState(139);
				match(Symbol);
				setState(140);
				match(Symbol);
				setState(141);
				match(Symbol);
				setState(142);
				match(Symbol);
				setState(143);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(T__3);
				setState(145);
				match(T__16);
				setState(146);
				match(T__17);
				setState(147);
				feature();
				setState(148);
				match(BoolConst);
				setState(149);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(T__3);
				setState(152);
				match(T__18);
				setState(153);
				match(Symbol);
				setState(154);
				match(T__3);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(155);
					sortedVar();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__5);
				setState(162);
				sort();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(163);
					grammarDef();
					}
				}

				setState(166);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				match(T__3);
				setState(169);
				match(T__19);
				setState(170);
				match(Symbol);
				setState(171);
				match(T__3);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(172);
					sortedVar();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__5);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(179);
					grammarDef();
					}
				}

				setState(182);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				smtCmd();
				}
				break;
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

	public static class SmtCmdContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public List<DTDecContext> dTDec() {
			return getRuleContexts(DTDecContext.class);
		}
		public DTDecContext dTDec(int i) {
			return getRuleContext(DTDecContext.class,i);
		}
		public SortDeclContext sortDecl() {
			return getRuleContext(SortDeclContext.class,0);
		}
		public TerminalNode Numeral() { return getToken(SyGuSParser.Numeral, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<SortedVarContext> sortedVar() {
			return getRuleContexts(SortedVarContext.class);
		}
		public SortedVarContext sortedVar(int i) {
			return getRuleContext(SortedVarContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SmtCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smtCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterSmtCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitSmtCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitSmtCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmtCmdContext smtCmd() throws RecognitionException {
		SmtCmdContext _localctx = new SmtCmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_smtCmd);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__3);
				setState(187);
				match(T__20);
				setState(188);
				match(Symbol);
				setState(189);
				dTDec();
				setState(190);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__3);
				setState(193);
				match(T__21);
				setState(194);
				match(T__3);
				setState(195);
				sortDecl();
				setState(196);
				match(T__5);
				setState(197);
				match(T__3);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					dTDec();
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(203);
				match(T__5);
				setState(204);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__3);
				setState(207);
				match(T__22);
				setState(208);
				match(Symbol);
				setState(209);
				match(Numeral);
				setState(210);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(T__3);
				setState(212);
				match(T__23);
				setState(213);
				match(Symbol);
				setState(214);
				match(T__3);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(215);
					sortedVar();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(T__5);
				setState(222);
				sort();
				setState(223);
				term();
				setState(224);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(T__3);
				setState(227);
				match(T__24);
				setState(228);
				match(Symbol);
				setState(229);
				sort();
				setState(230);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(T__3);
				setState(233);
				match(T__25);
				setState(234);
				match(T__17);
				setState(235);
				match(Symbol);
				setState(236);
				literal();
				setState(237);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				match(T__3);
				setState(240);
				match(T__26);
				setState(241);
				match(Symbol);
				setState(242);
				match(T__5);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(T__3);
				setState(244);
				match(T__27);
				setState(245);
				match(T__17);
				setState(246);
				match(Symbol);
				setState(247);
				literal();
				setState(248);
				match(T__5);
				}
				break;
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

	public static class SortDeclContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public TerminalNode Numeral() { return getToken(SyGuSParser.Numeral, 0); }
		public SortDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterSortDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitSortDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitSortDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortDeclContext sortDecl() throws RecognitionException {
		SortDeclContext _localctx = new SortDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sortDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__3);
			setState(253);
			match(Symbol);
			setState(254);
			match(Numeral);
			setState(255);
			match(T__5);
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

	public static class DTDecContext extends ParserRuleContext {
		public List<DtConsDecContext> dtConsDec() {
			return getRuleContexts(DtConsDecContext.class);
		}
		public DtConsDecContext dtConsDec(int i) {
			return getRuleContext(DtConsDecContext.class,i);
		}
		public DTDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dTDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterDTDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitDTDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitDTDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DTDecContext dTDec() throws RecognitionException {
		DTDecContext _localctx = new DTDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dTDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__3);
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				dtConsDec();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(263);
			match(T__5);
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

	public static class DtConsDecContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public List<SortedVarContext> sortedVar() {
			return getRuleContexts(SortedVarContext.class);
		}
		public SortedVarContext sortedVar(int i) {
			return getRuleContext(SortedVarContext.class,i);
		}
		public DtConsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtConsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterDtConsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitDtConsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitDtConsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtConsDecContext dtConsDec() throws RecognitionException {
		DtConsDecContext _localctx = new DtConsDecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dtConsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__3);
			setState(266);
			match(Symbol);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(267);
				sortedVar();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__5);
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

	public static class GrammarDefContext extends ParserRuleContext {
		public List<GroupedRuleListContext> groupedRuleList() {
			return getRuleContexts(GroupedRuleListContext.class);
		}
		public GroupedRuleListContext groupedRuleList(int i) {
			return getRuleContext(GroupedRuleListContext.class,i);
		}
		public GrammarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterGrammarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitGrammarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitGrammarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarDefContext grammarDef() throws RecognitionException {
		GrammarDefContext _localctx = new GrammarDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_grammarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__3);
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				groupedRuleList();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(281);
			match(T__5);
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

	public static class GroupedRuleListContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public List<GTermContext> gTerm() {
			return getRuleContexts(GTermContext.class);
		}
		public GTermContext gTerm(int i) {
			return getRuleContext(GTermContext.class,i);
		}
		public GroupedRuleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupedRuleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterGroupedRuleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitGroupedRuleList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitGroupedRuleList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupedRuleListContext groupedRuleList() throws RecognitionException {
		GroupedRuleListContext _localctx = new GroupedRuleListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupedRuleList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__3);
			setState(284);
			match(Symbol);
			setState(285);
			sort();
			setState(286);
			match(T__3);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				gTerm();
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << Numeral) | (1L << Decimal) | (1L << BoolConst) | (1L << HexConst) | (1L << BinConst) | (1L << StringConst) | (1L << Symbol))) != 0) );
			setState(292);
			match(T__5);
			setState(293);
			match(T__5);
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

	public static class GTermContext extends ParserRuleContext {
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public BfTermContext bfTerm() {
			return getRuleContext(BfTermContext.class,0);
		}
		public GTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterGTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitGTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitGTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GTermContext gTerm() throws RecognitionException {
		GTermContext _localctx = new GTermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_gTerm);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__3);
				setState(296);
				match(T__28);
				setState(297);
				sort();
				setState(298);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(T__3);
				setState(301);
				match(T__29);
				setState(302);
				sort();
				setState(303);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				bfTerm();
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Symbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(Symbol);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__3);
				setState(310);
				match(T__30);
				setState(311);
				match(Symbol);
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(312);
					index();
					}
					}
					setState(315); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Numeral || _la==Symbol );
				setState(317);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode Numeral() { return getToken(SyGuSParser.Numeral, 0); }
		public TerminalNode Symbol() { return getToken(SyGuSParser.Symbol, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==Numeral || _la==Symbol) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Numeral() { return getToken(SyGuSParser.Numeral, 0); }
		public TerminalNode Decimal() { return getToken(SyGuSParser.Decimal, 0); }
		public TerminalNode BoolConst() { return getToken(SyGuSParser.BoolConst, 0); }
		public TerminalNode HexConst() { return getToken(SyGuSParser.HexConst, 0); }
		public TerminalNode BinConst() { return getToken(SyGuSParser.BinConst, 0); }
		public TerminalNode StringConst() { return getToken(SyGuSParser.StringConst, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyGuSListener ) ((SyGuSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyGuSVisitor ) return ((SyGuSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Numeral) | (1L << Decimal) | (1L << BoolConst) | (1L << HexConst) | (1L << BinConst) | (1L << StringConst))) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001(\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002;\b\u0002\u000b\u0002\f\u0002<\u0001\u0002\u0001"+
		"\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003H\b\u0003\u000b\u0003\f\u0003I\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003Q\b\u0003"+
		"\u000b\u0003\f\u0003R\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003[\b\u0003\u000b\u0003\f\u0003\\\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003f\b\u0003\u000b\u0003\f\u0003g\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003n\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u009d\b\u0007\n\u0007\f\u0007\u00a0\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00ae\b\u0007\n\u0007\f\u0007\u00b1\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b5\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b9\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00c8\b\b\u000b\b\f\b"+
		"\u00c9\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d9\b\b\n\b\f\b\u00dc"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00fb\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0004\n\u0104\b\n\u000b\n\f\n\u0105\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010d\b\u000b\n\u000b"+
		"\f\u000b\u0110\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004\f"+
		"\u0116\b\f\u000b\f\f\f\u0117\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u0121\b\r\u000b\r\f\r\u0122\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0133\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0004\u000f\u013a\b\u000f\u000b\u000f\f\u000f\u013b\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0140\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0003\u0001"+
		"\u0000\n\f\u0002\u0000\"\"((\u0001\u0000\"\'\u0160\u0000\'\u0001\u0000"+
		"\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000"+
		"\u0006m\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\nt\u0001\u0000"+
		"\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e\u00b8\u0001\u0000\u0000"+
		"\u0000\u0010\u00fa\u0001\u0000\u0000\u0000\u0012\u00fc\u0001\u0000\u0000"+
		"\u0000\u0014\u0101\u0001\u0000\u0000\u0000\u0016\u0109\u0001\u0000\u0000"+
		"\u0000\u0018\u0113\u0001\u0000\u0000\u0000\u001a\u011b\u0001\u0000\u0000"+
		"\u0000\u001c\u0132\u0001\u0000\u0000\u0000\u001e\u013f\u0001\u0000\u0000"+
		"\u0000 \u0141\u0001\u0000\u0000\u0000\"\u0143\u0001\u0000\u0000\u0000"+
		"$&\u0003\u000e\u0007\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0001\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*4\u0005\u0001\u0000\u0000"+
		"+4\u0005\u0002\u0000\u0000,4\u0005\u0003\u0000\u0000-.\u0005\u0004\u0000"+
		"\u0000./\u0005\u0005\u0000\u0000/0\u0003 \u0010\u000001\u0005\u0006\u0000"+
		"\u000014\u0001\u0000\u0000\u000024\u0005(\u0000\u00003*\u0001\u0000\u0000"+
		"\u00003+\u0001\u0000\u0000\u00003,\u0001\u0000\u0000\u00003-\u0001\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"5A\u0003\u001e\u000f\u00006A\u0003\"\u0011\u000078\u0005\u0004\u0000\u0000"+
		"8:\u0003\u001e\u000f\u00009;\u0003\u0004\u0002\u0000:9\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000?A\u0001"+
		"\u0000\u0000\u0000@5\u0001\u0000\u0000\u0000@6\u0001\u0000\u0000\u0000"+
		"@7\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000Bn\u0003\u001e"+
		"\u000f\u0000Cn\u0003\"\u0011\u0000DE\u0005\u0004\u0000\u0000EG\u0003\u001e"+
		"\u000f\u0000FH\u0003\u0006\u0003\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0005\u0006\u0000\u0000Ln\u0001\u0000\u0000"+
		"\u0000MN\u0005\u0004\u0000\u0000NP\u0005\u0007\u0000\u0000OQ\u0003\b\u0004"+
		"\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003"+
		"\u0006\u0003\u0000UV\u0005\u0006\u0000\u0000Vn\u0001\u0000\u0000\u0000"+
		"WX\u0005\u0004\u0000\u0000XZ\u0005\b\u0000\u0000Y[\u0003\b\u0004\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0003\u0006"+
		"\u0003\u0000_`\u0005\u0006\u0000\u0000`n\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0004\u0000\u0000bc\u0005\t\u0000\u0000ce\u0005\u0004\u0000\u0000df\u0003"+
		"\n\u0005\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0006\u0000\u0000jk\u0003\u0006\u0003\u0000kl\u0005\u0006\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mB\u0001\u0000\u0000\u0000mC\u0001\u0000"+
		"\u0000\u0000mD\u0001\u0000\u0000\u0000mM\u0001\u0000\u0000\u0000mW\u0001"+
		"\u0000\u0000\u0000ma\u0001\u0000\u0000\u0000n\u0007\u0001\u0000\u0000"+
		"\u0000op\u0005\u0004\u0000\u0000pq\u0005(\u0000\u0000qr\u0003\u0002\u0001"+
		"\u0000rs\u0005\u0006\u0000\u0000s\t\u0001\u0000\u0000\u0000tu\u0005\u0004"+
		"\u0000\u0000uv\u0005(\u0000\u0000vw\u0003\u0006\u0003\u0000wx\u0005\u0006"+
		"\u0000\u0000x\u000b\u0001\u0000\u0000\u0000yz\u0007\u0000\u0000\u0000"+
		"z\r\u0001\u0000\u0000\u0000{|\u0005\u0004\u0000\u0000|}\u0005\r\u0000"+
		"\u0000}\u00b9\u0005\u0006\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f"+
		"\u0080\u0005\u000e\u0000\u0000\u0080\u0081\u0003\u0006\u0003\u0000\u0081"+
		"\u0082\u0005\u0006\u0000\u0000\u0082\u00b9\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085"+
		"\u0086\u0005(\u0000\u0000\u0086\u0087\u0003\u0002\u0001\u0000\u0087\u0088"+
		"\u0005\u0006\u0000\u0000\u0088\u00b9\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0004\u0000\u0000\u008a\u008b\u0005\u0010\u0000\u0000\u008b\u008c"+
		"\u0005(\u0000\u0000\u008c\u008d\u0005(\u0000\u0000\u008d\u008e\u0005("+
		"\u0000\u0000\u008e\u008f\u0005(\u0000\u0000\u008f\u00b9\u0005\u0006\u0000"+
		"\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092\u0005\u0011\u0000"+
		"\u0000\u0092\u0093\u0005\u0012\u0000\u0000\u0093\u0094\u0003\f\u0006\u0000"+
		"\u0094\u0095\u0005$\u0000\u0000\u0095\u0096\u0005\u0006\u0000\u0000\u0096"+
		"\u00b9\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0004\u0000\u0000\u0098"+
		"\u0099\u0005\u0013\u0000\u0000\u0099\u009a\u0005(\u0000\u0000\u009a\u009e"+
		"\u0005\u0004\u0000\u0000\u009b\u009d\u0003\b\u0004\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0006\u0000\u0000\u00a2\u00a4\u0003\u0002\u0001\u0000\u00a3\u00a5\u0003"+
		"\u0018\f\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006"+
		"\u0000\u0000\u00a7\u00b9\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0004"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000\u00aa\u00ab\u0005(\u0000"+
		"\u0000\u00ab\u00af\u0005\u0004\u0000\u0000\u00ac\u00ae\u0003\b\u0004\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0005\u0006\u0000\u0000\u00b3\u00b5\u0003\u0018\f\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0005\u0006\u0000\u0000\u00b7"+
		"\u00b9\u0003\u0010\b\u0000\u00b8{\u0001\u0000\u0000\u0000\u00b8~\u0001"+
		"\u0000\u0000\u0000\u00b8\u0083\u0001\u0000\u0000\u0000\u00b8\u0089\u0001"+
		"\u0000\u0000\u0000\u00b8\u0090\u0001\u0000\u0000\u0000\u00b8\u0097\u0001"+
		"\u0000\u0000\u0000\u00b8\u00a8\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0004\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bd\u0005"+
		"(\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be\u00bf\u0005\u0006"+
		"\u0000\u0000\u00bf\u00fb\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0004"+
		"\u0000\u0000\u00c1\u00c2\u0005\u0016\u0000\u0000\u00c2\u00c3\u0005\u0004"+
		"\u0000\u0000\u00c3\u00c4\u0003\u0012\t\u0000\u00c4\u00c5\u0005\u0006\u0000"+
		"\u0000\u00c5\u00c7\u0005\u0004\u0000\u0000\u00c6\u00c8\u0003\u0014\n\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0006\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0006\u0000\u0000\u00cd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0004\u0000\u0000\u00cf\u00d0\u0005\u0017\u0000\u0000"+
		"\u00d0\u00d1\u0005(\u0000\u0000\u00d1\u00d2\u0005\"\u0000\u0000\u00d2"+
		"\u00fb\u0005\u0006\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4"+
		"\u00d5\u0005\u0018\u0000\u0000\u00d5\u00d6\u0005(\u0000\u0000\u00d6\u00da"+
		"\u0005\u0004\u0000\u0000\u00d7\u00d9\u0003\b\u0004\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u0006\u0000\u0000\u00de\u00df\u0003\u0002\u0001\u0000\u00df\u00e0\u0003"+
		"\u0006\u0003\u0000\u00e0\u00e1\u0005\u0006\u0000\u0000\u00e1\u00fb\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e4\u0005"+
		"\u0019\u0000\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5\u00e6\u0003\u0002"+
		"\u0001\u0000\u00e6\u00e7\u0005\u0006\u0000\u0000\u00e7\u00fb\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9\u00ea\u0005\u001a"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0012\u0000\u0000\u00eb\u00ec\u0005(\u0000"+
		"\u0000\u00ec\u00ed\u0003\"\u0011\u0000\u00ed\u00ee\u0005\u0006\u0000\u0000"+
		"\u00ee\u00fb\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000"+
		"\u00f0\u00f1\u0005\u001b\u0000\u0000\u00f1\u00f2\u0005(\u0000\u0000\u00f2"+
		"\u00fb\u0005\u0006\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4"+
		"\u00f5\u0005\u001c\u0000\u0000\u00f5\u00f6\u0005\u0012\u0000\u0000\u00f6"+
		"\u00f7\u0005(\u0000\u0000\u00f7\u00f8\u0003\"\u0011\u0000\u00f8\u00f9"+
		"\u0005\u0006\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00ba"+
		"\u0001\u0000\u0000\u0000\u00fa\u00c0\u0001\u0000\u0000\u0000\u00fa\u00ce"+
		"\u0001\u0000\u0000\u0000\u00fa\u00d3\u0001\u0000\u0000\u0000\u00fa\u00e2"+
		"\u0001\u0000\u0000\u0000\u00fa\u00e8\u0001\u0000\u0000\u0000\u00fa\u00ef"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f3\u0001\u0000\u0000\u0000\u00fb\u0011"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd\u00fe"+
		"\u0005(\u0000\u0000\u00fe\u00ff\u0005\"\u0000\u0000\u00ff\u0100\u0005"+
		"\u0006\u0000\u0000\u0100\u0013\u0001\u0000\u0000\u0000\u0101\u0103\u0005"+
		"\u0004\u0000\u0000\u0102\u0104\u0003\u0016\u000b\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\u0006\u0000\u0000\u0108\u0015\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005\u0004\u0000\u0000\u010a\u010e\u0005"+
		"(\u0000\u0000\u010b\u010d\u0003\b\u0004\u0000\u010c\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0006"+
		"\u0000\u0000\u0112\u0017\u0001\u0000\u0000\u0000\u0113\u0115\u0005\u0004"+
		"\u0000\u0000\u0114\u0116\u0003\u001a\r\u0000\u0115\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u0006\u0000\u0000\u011a\u0019\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005\u0004\u0000\u0000\u011c\u011d\u0005(\u0000\u0000"+
		"\u011d\u011e\u0003\u0002\u0001\u0000\u011e\u0120\u0005\u0004\u0000\u0000"+
		"\u011f\u0121\u0003\u001c\u000e\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u0006\u0000\u0000\u0125\u0126\u0005\u0006\u0000\u0000"+
		"\u0126\u001b\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0004\u0000\u0000"+
		"\u0128\u0129\u0005\u001d\u0000\u0000\u0129\u012a\u0003\u0002\u0001\u0000"+
		"\u012a\u012b\u0005\u0006\u0000\u0000\u012b\u0133\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0005\u0004\u0000\u0000\u012d\u012e\u0005\u001e\u0000\u0000"+
		"\u012e\u012f\u0003\u0002\u0001\u0000\u012f\u0130\u0005\u0006\u0000\u0000"+
		"\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u0133\u0003\u0004\u0002\u0000"+
		"\u0132\u0127\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u001d\u0001\u0000\u0000\u0000"+
		"\u0134\u0140\u0005(\u0000\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136"+
		"\u0137\u0005\u001f\u0000\u0000\u0137\u0139\u0005(\u0000\u0000\u0138\u013a"+
		"\u0003 \u0010\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"\u0006\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0134\u0001"+
		"\u0000\u0000\u0000\u013f\u0135\u0001\u0000\u0000\u0000\u0140\u001f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0007\u0001\u0000\u0000\u0142!\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0007\u0002\u0000\u0000\u0144#\u0001\u0000\u0000"+
		"\u0000\u0018\'3<@IR\\gm\u009e\u00a4\u00af\u00b4\u00b8\u00c9\u00da\u00fa"+
		"\u0105\u010e\u0117\u0122\u0132\u013b\u013f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}