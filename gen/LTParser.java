// Generated from C:/Users/Melissa/IdeaProjects/Projet_compil/src\LT.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, COMPIL=9, 
		START=10, SCAN=11, PRINT=12, IF=13, THEN=14, ELSE=15, DO=16, WHILE=17, 
		INT=18, FLOAT=19, STRING=20, PLUS=21, MOIN=22, MUL=23, DIV=24, AFCT=25, 
		EGAL=26, DIFF=27, GREATER=28, LESS=29, SPACE=30, COMMLINE=31, COMMMUL=32, 
		NOMPROG=33, ID=34, INTVAL=35, FLOATVAL=36, STRINGVAL=37;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_dec = 2, RULE_type = 3, RULE_var = 4, 
		RULE_aff = 5, RULE_exp = 6, RULE_complicated = 7, RULE_pm = 8, RULE_md = 9, 
		RULE_fex = 10, RULE_val = 11, RULE_listeinst = 12, RULE_inst = 13, RULE_read = 14, 
		RULE_write = 15, RULE_listeid = 16, RULE_instif = 17, RULE_cond = 18, 
		RULE_op = 19, RULE_instdo = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "dec", "type", "var", "aff", "exp", "complicated", 
			"pm", "md", "fex", "val", "listeinst", "inst", "read", "write", "listeid", 
			"instif", "cond", "op", "instdo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "', '", "');'", "','", "'compil'", 
			"'start'", "'scanCompil'", "'printCompil'", "'if'", "'then'", "'else'", 
			"'do'", "'while'", "'intCompil'", "'floatCompil '", "'stringCompil'", 
			"'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "COMPIL", "START", 
			"SCAN", "PRINT", "IF", "THEN", "ELSE", "DO", "WHILE", "INT", "FLOAT", 
			"STRING", "PLUS", "MOIN", "MUL", "DIV", "AFCT", "EGAL", "DIFF", "GREATER", 
			"LESS", "SPACE", "COMMLINE", "COMMMUL", "NOMPROG", "ID", "INTVAL", "FLOATVAL", 
			"STRINGVAL"
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
	public String getGrammarFileName() { return "LT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode COMPIL() { return getToken(LTParser.COMPIL, 0); }
		public TerminalNode NOMPROG() { return getToken(LTParser.NOMPROG, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode START() { return getToken(LTParser.START, 0); }
		public ListeinstContext listeinst() {
			return getRuleContext(ListeinstContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(COMPIL);
			setState(43);
			match(NOMPROG);
			setState(44);
			match(T__0);
			setState(45);
			match(T__1);
			setState(46);
			match(T__2);
			setState(47);
			declaration();
			setState(48);
			match(START);
			setState(49);
			listeinst();
			setState(50);
			match(T__3);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				dec();
				setState(53);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				dec();
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			type();
			setState(59);
			var();
			setState(60);
			match(T__4);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LTParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LTParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LTParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LTParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ID);
				setState(65);
				match(T__5);
				setState(66);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(ID);
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

	public static class AffContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LTParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LTParser.ID, i);
		}
		public TerminalNode AFCT() { return getToken(LTParser.AFCT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitAff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitAff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffContext aff() throws RecognitionException {
		AffContext _localctx = new AffContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aff);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(ID);
				setState(71);
				match(AFCT);
				setState(72);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(ID);
				setState(74);
				match(AFCT);
				setState(75);
				exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ComplicatedContext complicated() {
			return getRuleContext(ComplicatedContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PmContext pm() {
			return getRuleContext(PmContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(79);
			complicated(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(81);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(82);
					pm();
					setState(83);
					complicated(0);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ComplicatedContext extends ParserRuleContext {
		public FexContext fex() {
			return getRuleContext(FexContext.class,0);
		}
		public ComplicatedContext complicated() {
			return getRuleContext(ComplicatedContext.class,0);
		}
		public MdContext md() {
			return getRuleContext(MdContext.class,0);
		}
		public ComplicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterComplicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitComplicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitComplicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplicatedContext complicated() throws RecognitionException {
		return complicated(0);
	}

	private ComplicatedContext complicated(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComplicatedContext _localctx = new ComplicatedContext(_ctx, _parentState);
		ComplicatedContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_complicated, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			fex();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComplicatedContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_complicated);
					setState(93);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(94);
					md();
					setState(95);
					fex();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class PmContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LTParser.PLUS, 0); }
		public TerminalNode MOIN() { return getToken(LTParser.MOIN, 0); }
		public PmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterPm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitPm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitPm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PmContext pm() throws RecognitionException {
		PmContext _localctx = new PmContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MOIN) ) {
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

	public static class MdContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(LTParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LTParser.DIV, 0); }
		public MdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdContext md() throws RecognitionException {
		MdContext _localctx = new MdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_md);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
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

	public static class FexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LTParser.ID, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterFex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitFex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitFex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FexContext fex() throws RecognitionException {
		FexContext _localctx = new FexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fex);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(ID);
				}
				break;
			case INTVAL:
			case FLOATVAL:
			case STRINGVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				val();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__0);
				setState(109);
				exp(0);
				setState(110);
				match(T__1);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode INTVAL() { return getToken(LTParser.INTVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(LTParser.FLOATVAL, 0); }
		public TerminalNode STRINGVAL() { return getToken(LTParser.STRINGVAL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTVAL) | (1L << FLOATVAL) | (1L << STRINGVAL))) != 0)) ) {
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

	public static class ListeinstContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public ListeinstContext listeinst() {
			return getRuleContext(ListeinstContext.class,0);
		}
		public ListeinstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listeinst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterListeinst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitListeinst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitListeinst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListeinstContext listeinst() throws RecognitionException {
		ListeinstContext _localctx = new ListeinstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listeinst);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(116);
				inst();
				setState(117);
				match(T__4);
				setState(118);
				listeinst();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				inst();
				setState(121);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				inst();
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

	public static class InstContext extends ParserRuleContext {
		public AffContext aff() {
			return getRuleContext(AffContext.class,0);
		}
		public InstifContext instif() {
			return getRuleContext(InstifContext.class,0);
		}
		public InstdoContext instdo() {
			return getRuleContext(InstdoContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inst);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				aff();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				instif();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				instdo();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				read();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				write();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(LTParser.SCAN, 0); }
		public ListeidContext listeid() {
			return getRuleContext(ListeidContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SCAN);
			setState(134);
			match(T__0);
			setState(135);
			listeid();
			setState(136);
			match(T__6);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LTParser.PRINT, 0); }
		public ListeidContext listeid() {
			return getRuleContext(ListeidContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(PRINT);
			setState(139);
			match(T__0);
			setState(140);
			listeid();
			setState(141);
			match(T__6);
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

	public static class ListeidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LTParser.ID, 0); }
		public ListeidContext listeid() {
			return getRuleContext(ListeidContext.class,0);
		}
		public ListeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterListeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitListeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitListeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListeidContext listeid() throws RecognitionException {
		ListeidContext _localctx = new ListeidContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listeid);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__7);
				setState(145);
				listeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(ID);
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

	public static class InstifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LTParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LTParser.THEN, 0); }
		public List<ListeinstContext> listeinst() {
			return getRuleContexts(ListeinstContext.class);
		}
		public ListeinstContext listeinst(int i) {
			return getRuleContext(ListeinstContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LTParser.ELSE, 0); }
		public InstifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterInstif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitInstif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitInstif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstifContext instif() throws RecognitionException {
		InstifContext _localctx = new InstifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_instif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IF);
			setState(150);
			match(T__0);
			setState(151);
			cond();
			setState(152);
			match(T__1);
			setState(153);
			match(THEN);
			setState(154);
			match(T__2);
			setState(155);
			listeinst();
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				}
				break;
			case ELSE:
				{
				setState(157);
				match(ELSE);
				setState(158);
				listeinst();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			match(T__3);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			exp(0);
			setState(164);
			op();
			setState(165);
			exp(0);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode EGAL() { return getToken(LTParser.EGAL, 0); }
		public TerminalNode DIFF() { return getToken(LTParser.DIFF, 0); }
		public TerminalNode GREATER() { return getToken(LTParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(LTParser.LESS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EGAL) | (1L << DIFF) | (1L << GREATER) | (1L << LESS))) != 0)) ) {
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

	public static class InstdoContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(LTParser.DO, 0); }
		public ListeinstContext listeinst() {
			return getRuleContext(ListeinstContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LTParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public InstdoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instdo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).enterInstdo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTListener ) ((LTListener)listener).exitInstdo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LTVisitor ) return ((LTVisitor<? extends T>)visitor).visitInstdo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstdoContext instdo() throws RecognitionException {
		InstdoContext _localctx = new InstdoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instdo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DO);
			setState(170);
			match(T__2);
			setState(171);
			listeinst();
			setState(172);
			match(T__3);
			setState(173);
			match(WHILE);
			setState(174);
			match(T__0);
			setState(175);
			cond();
			setState(176);
			match(T__1);
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
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 7:
			return complicated_sempred((ComplicatedContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean complicated_sempred(ComplicatedContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\5\6G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\bX\n\b\f\b\16\b[\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\td\n\t\f"+
		"\t\16\tg\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22\u0096\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00a2\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2\4\16\20\27\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2\24\26\3\2\27\30\3"+
		"\2\31\32\3\2%\'\3\2\34\37\2\u00ae\2,\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2\b@"+
		"\3\2\2\2\nF\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20\\\3\2\2\2\22h\3\2\2\2\24"+
		"j\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2\32~\3\2\2\2\34\u0085\3\2\2\2\36\u0087"+
		"\3\2\2\2 \u008c\3\2\2\2\"\u0095\3\2\2\2$\u0097\3\2\2\2&\u00a5\3\2\2\2"+
		"(\u00a9\3\2\2\2*\u00ab\3\2\2\2,-\7\13\2\2-.\7#\2\2./\7\3\2\2/\60\7\4\2"+
		"\2\60\61\7\5\2\2\61\62\5\4\3\2\62\63\7\f\2\2\63\64\5\32\16\2\64\65\7\6"+
		"\2\2\65\3\3\2\2\2\66\67\5\6\4\2\678\5\4\3\28;\3\2\2\29;\5\6\4\2:\66\3"+
		"\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\5\b\5\2=>\5\n\6\2>?\7\7\2\2?\7\3\2\2\2@"+
		"A\t\2\2\2A\t\3\2\2\2BC\7$\2\2CD\7\b\2\2DG\5\n\6\2EG\7$\2\2FB\3\2\2\2F"+
		"E\3\2\2\2G\13\3\2\2\2HI\7$\2\2IJ\7\33\2\2JO\7$\2\2KL\7$\2\2LM\7\33\2\2"+
		"MO\5\16\b\2NH\3\2\2\2NK\3\2\2\2O\r\3\2\2\2PQ\b\b\1\2QR\5\20\t\2RY\3\2"+
		"\2\2ST\f\4\2\2TU\5\22\n\2UV\5\20\t\2VX\3\2\2\2WS\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\17\3\2\2\2[Y\3\2\2\2\\]\b\t\1\2]^\5\26\f\2^e\3\2\2\2"+
		"_`\f\4\2\2`a\5\24\13\2ab\5\26\f\2bd\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\21\3\2\2\2ge\3\2\2\2hi\t\3\2\2i\23\3\2\2\2jk\t\4\2\2k"+
		"\25\3\2\2\2ls\7$\2\2ms\5\30\r\2no\7\3\2\2op\5\16\b\2pq\7\4\2\2qs\3\2\2"+
		"\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2s\27\3\2\2\2tu\t\5\2\2u\31\3\2\2\2vw\5"+
		"\34\17\2wx\7\7\2\2xy\5\32\16\2y\177\3\2\2\2z{\5\34\17\2{|\7\7\2\2|\177"+
		"\3\2\2\2}\177\5\34\17\2~v\3\2\2\2~z\3\2\2\2~}\3\2\2\2\177\33\3\2\2\2\u0080"+
		"\u0086\5\f\7\2\u0081\u0086\5$\23\2\u0082\u0086\5*\26\2\u0083\u0086\5\36"+
		"\20\2\u0084\u0086\5 \21\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\35\3\2\2"+
		"\2\u0087\u0088\7\r\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\"\22\2\u008a"+
		"\u008b\7\t\2\2\u008b\37\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\7\3\2"+
		"\2\u008e\u008f\5\"\22\2\u008f\u0090\7\t\2\2\u0090!\3\2\2\2\u0091\u0092"+
		"\7$\2\2\u0092\u0093\7\n\2\2\u0093\u0096\5\"\22\2\u0094\u0096\7$\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0094\3\2\2\2\u0096#\3\2\2\2\u0097\u0098\7\17\2\2"+
		"\u0098\u0099\7\3\2\2\u0099\u009a\5&\24\2\u009a\u009b\7\4\2\2\u009b\u009c"+
		"\7\20\2\2\u009c\u009d\7\5\2\2\u009d\u00a1\5\32\16\2\u009e\u00a2\3\2\2"+
		"\2\u009f\u00a0\7\21\2\2\u00a0\u00a2\5\32\16\2\u00a1\u009e\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\6\2\2\u00a4%\3\2\2\2"+
		"\u00a5\u00a6\5\16\b\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\5\16\b\2\u00a8\'"+
		"\3\2\2\2\u00a9\u00aa\t\6\2\2\u00aa)\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac"+
		"\u00ad\7\5\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7\6\2\2\u00af\u00b0\7"+
		"\23\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\7\4\2\2\u00b3"+
		"+\3\2\2\2\f:FNYer~\u0085\u0095\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}