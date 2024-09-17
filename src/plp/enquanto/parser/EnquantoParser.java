// Generated from ./src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, BOOLEANO=42, INT=43, ID=44, TEXTO=45, Comentario=46, 
		Espaco=47;
	public static final int
		RULE_programa = 0, RULE_seqComando = 1, RULE_comando = 2, RULE_expressao = 3, 
		RULE_booleano = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seqComando", "comando", "expressao", "booleano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':='", "'skip'", "'se'", "'entao'", "'senaose'", 
			"'senao'", "'enquanto'", "'faca'", "'exiba'", "'escreva'", "'{'", "'}'", 
			"'para'", "'de'", "'ate'", "'repita'", "'vezes'", "'escolha'", "'caso'", 
			"':'", "'outro'", "'leia'", "'^'", "'*'", "'/'", "'+'", "'-'", "'('", 
			"')'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "'nao'", "'e'", "'xou'", 
			"'ou'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEANO", "INT", "ID", "TEXTO", 
			"Comentario", "Espaco"
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
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			seqComando();
			setState(11);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeqComandoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqComando(this);
		}
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seqComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			comando();
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(14);
				match(T__1);
				setState(15);
				comando();
				}
				}
				setState(20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ComandoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExibaContext extends ComandoContext {
		public TerminalNode TEXTO() { return getToken(EnquantoParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExibaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExiba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExiba(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscolhaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public EscolhaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscolha(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ComandoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEnquanto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPara(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepitaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public RepitaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitRepita(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBloco(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscreva(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSkip(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			int _alt;
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(ID);
				setState(22);
				match(T__2);
				setState(23);
				expressao(0);
				}
				break;
			case T__3:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(T__4);
				setState(26);
				booleano(0);
				setState(27);
				match(T__5);
				setState(28);
				comando();
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(29);
						match(T__6);
						setState(30);
						booleano(0);
						setState(31);
						match(T__5);
						setState(32);
						comando();
						}
						} 
					}
					setState(38);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(39);
				match(T__7);
				setState(40);
				comando();
				}
				break;
			case T__8:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(T__8);
				setState(43);
				booleano(0);
				setState(44);
				match(T__9);
				setState(45);
				comando();
				}
				break;
			case T__10:
				_localctx = new ExibaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(T__10);
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXTO:
					{
					setState(48);
					match(TEXTO);
					}
					break;
				case T__23:
				case T__29:
				case INT:
				case ID:
					{
					setState(49);
					expressao(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__11:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(T__11);
				setState(53);
				expressao(0);
				}
				break;
			case T__12:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(T__12);
				setState(55);
				seqComando();
				setState(56);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new ParaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				match(T__14);
				setState(59);
				match(ID);
				setState(60);
				match(T__15);
				setState(61);
				expressao(0);
				setState(62);
				match(T__16);
				setState(63);
				expressao(0);
				setState(64);
				match(T__9);
				setState(65);
				comando();
				}
				break;
			case T__17:
				_localctx = new RepitaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				match(T__17);
				setState(68);
				expressao(0);
				setState(69);
				match(T__18);
				setState(70);
				comando();
				}
				break;
			case T__19:
				_localctx = new EscolhaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(72);
				match(T__19);
				setState(73);
				match(ID);
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(74);
						match(T__20);
						setState(75);
						expressao(0);
						setState(76);
						match(T__21);
						setState(77);
						comando();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(84);
				match(T__22);
				setState(85);
				match(T__21);
				setState(86);
				comando();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLeia(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInteiro(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpBin(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExpPar(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				match(INT);
				}
				break;
			case T__23:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__23);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(ID);
				}
				break;
			case T__29:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(T__29);
				setState(94);
				expressao(0);
				setState(95);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						match(T__24);
						setState(101);
						expressao(6);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(102);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(103);
						match(T__25);
						setState(104);
						expressao(5);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(105);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(106);
						match(T__26);
						setState(107);
						expressao(4);
						}
						break;
					case 4:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expressao(3);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XouLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public XouLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterXouLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitXouLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends BooleanoContext {
		public TerminalNode BOOLEANO() { return getToken(EnquantoParser.BOOLEANO, 0); }
		public BoolContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ELogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public ELogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterELogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitELogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaoLogicoContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public NaoLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterNaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitNaoLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends BooleanoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpRel(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolParContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBoolPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OuLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public OuLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOuLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOuLogico(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		return booleano(0);
	}

	private BooleanoContext booleano(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanoContext _localctx = new BooleanoContext(_ctx, _parentState);
		BooleanoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_booleano, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117);
				match(BOOLEANO);
				}
				break;
			case 2:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				expressao(0);
				setState(119);
				match(T__31);
				setState(120);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				expressao(0);
				setState(123);
				match(T__32);
				setState(124);
				expressao(0);
				}
				break;
			case 4:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				expressao(0);
				setState(127);
				match(T__33);
				setState(128);
				expressao(0);
				}
				break;
			case 5:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				expressao(0);
				setState(131);
				match(T__34);
				setState(132);
				expressao(0);
				}
				break;
			case 6:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				expressao(0);
				setState(135);
				match(T__35);
				setState(136);
				expressao(0);
				}
				break;
			case 7:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				expressao(0);
				setState(139);
				match(T__36);
				setState(140);
				expressao(0);
				}
				break;
			case 8:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(T__37);
				setState(143);
				booleano(5);
				}
				break;
			case 9:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(T__29);
				setState(145);
				booleano(0);
				setState(146);
				match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(150);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(151);
						match(T__38);
						setState(152);
						booleano(5);
						}
						break;
					case 2:
						{
						_localctx = new XouLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(153);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(154);
						match(T__39);
						setState(155);
						booleano(4);
						}
						break;
					case 3:
						{
						_localctx = new OuLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(156);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(157);
						match(T__40);
						setState(158);
						booleano(3);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 4:
			return booleano_sempred((BooleanoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleano_sempred(BooleanoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0011\b\u0001\n\u0001\f\u0001\u0014\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002S\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002X\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003b\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003p\b\u0003\n\u0003\f\u0003s\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0095\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00a0\b\u0004\n\u0004\f\u0004\u00a3\t\u0004\u0001"+
		"\u0004\u0002$Q\u0002\u0006\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001"+
		"\u0001\u0000\u001c\u001d\u00be\u0000\n\u0001\u0000\u0000\u0000\u0002\r"+
		"\u0001\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000\u0006a\u0001\u0000"+
		"\u0000\u0000\b\u0094\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\f\u0005\u0001\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u0012\u0003\u0004\u0002\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f"+
		"\u0011\u0003\u0004\u0002\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011"+
		"\u0014\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0001\u0000\u0000\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014"+
		"\u0012\u0001\u0000\u0000\u0000\u0015\u0016\u0005,\u0000\u0000\u0016\u0017"+
		"\u0005\u0003\u0000\u0000\u0017X\u0003\u0006\u0003\u0000\u0018X\u0005\u0004"+
		"\u0000\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001b\u0003\b\u0004"+
		"\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c$\u0003\u0004\u0002\u0000"+
		"\u001d\u001e\u0005\u0007\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f"+
		" \u0005\u0006\u0000\u0000 !\u0003\u0004\u0002\u0000!#\u0001\u0000\u0000"+
		"\u0000\"\u001d\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000\'(\u0005\b\u0000\u0000()\u0003\u0004\u0002"+
		"\u0000)X\u0001\u0000\u0000\u0000*+\u0005\t\u0000\u0000+,\u0003\b\u0004"+
		"\u0000,-\u0005\n\u0000\u0000-.\u0003\u0004\u0002\u0000.X\u0001\u0000\u0000"+
		"\u0000/2\u0005\u000b\u0000\u000003\u0005-\u0000\u000013\u0003\u0006\u0003"+
		"\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u00003X\u0001\u0000"+
		"\u0000\u000045\u0005\f\u0000\u00005X\u0003\u0006\u0003\u000067\u0005\r"+
		"\u0000\u000078\u0003\u0002\u0001\u000089\u0005\u000e\u0000\u00009X\u0001"+
		"\u0000\u0000\u0000:;\u0005\u000f\u0000\u0000;<\u0005,\u0000\u0000<=\u0005"+
		"\u0010\u0000\u0000=>\u0003\u0006\u0003\u0000>?\u0005\u0011\u0000\u0000"+
		"?@\u0003\u0006\u0003\u0000@A\u0005\n\u0000\u0000AB\u0003\u0004\u0002\u0000"+
		"BX\u0001\u0000\u0000\u0000CD\u0005\u0012\u0000\u0000DE\u0003\u0006\u0003"+
		"\u0000EF\u0005\u0013\u0000\u0000FG\u0003\u0004\u0002\u0000GX\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0014\u0000\u0000IQ\u0005,\u0000\u0000JK\u0005\u0015"+
		"\u0000\u0000KL\u0003\u0006\u0003\u0000LM\u0005\u0016\u0000\u0000MN\u0003"+
		"\u0004\u0002\u0000NP\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0017"+
		"\u0000\u0000UV\u0005\u0016\u0000\u0000VX\u0003\u0004\u0002\u0000W\u0015"+
		"\u0001\u0000\u0000\u0000W\u0018\u0001\u0000\u0000\u0000W\u0019\u0001\u0000"+
		"\u0000\u0000W*\u0001\u0000\u0000\u0000W/\u0001\u0000\u0000\u0000W4\u0001"+
		"\u0000\u0000\u0000W6\u0001\u0000\u0000\u0000W:\u0001\u0000\u0000\u0000"+
		"WC\u0001\u0000\u0000\u0000WH\u0001\u0000\u0000\u0000X\u0005\u0001\u0000"+
		"\u0000\u0000YZ\u0006\u0003\uffff\uffff\u0000Zb\u0005+\u0000\u0000[b\u0005"+
		"\u0018\u0000\u0000\\b\u0005,\u0000\u0000]^\u0005\u001e\u0000\u0000^_\u0003"+
		"\u0006\u0003\u0000_`\u0005\u001f\u0000\u0000`b\u0001\u0000\u0000\u0000"+
		"aY\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a\\\u0001\u0000\u0000"+
		"\u0000a]\u0001\u0000\u0000\u0000bq\u0001\u0000\u0000\u0000cd\n\u0005\u0000"+
		"\u0000de\u0005\u0019\u0000\u0000ep\u0003\u0006\u0003\u0006fg\n\u0004\u0000"+
		"\u0000gh\u0005\u001a\u0000\u0000hp\u0003\u0006\u0003\u0005ij\n\u0003\u0000"+
		"\u0000jk\u0005\u001b\u0000\u0000kp\u0003\u0006\u0003\u0004lm\n\u0002\u0000"+
		"\u0000mn\u0007\u0000\u0000\u0000np\u0003\u0006\u0003\u0003oc\u0001\u0000"+
		"\u0000\u0000of\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000ol\u0001"+
		"\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u0007\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tu\u0006\u0004\uffff\uffff\u0000u\u0095\u0005*\u0000\u0000"+
		"vw\u0003\u0006\u0003\u0000wx\u0005 \u0000\u0000xy\u0003\u0006\u0003\u0000"+
		"y\u0095\u0001\u0000\u0000\u0000z{\u0003\u0006\u0003\u0000{|\u0005!\u0000"+
		"\u0000|}\u0003\u0006\u0003\u0000}\u0095\u0001\u0000\u0000\u0000~\u007f"+
		"\u0003\u0006\u0003\u0000\u007f\u0080\u0005\"\u0000\u0000\u0080\u0081\u0003"+
		"\u0006\u0003\u0000\u0081\u0095\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"\u0006\u0003\u0000\u0083\u0084\u0005#\u0000\u0000\u0084\u0085\u0003\u0006"+
		"\u0003\u0000\u0085\u0095\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0006"+
		"\u0003\u0000\u0087\u0088\u0005$\u0000\u0000\u0088\u0089\u0003\u0006\u0003"+
		"\u0000\u0089\u0095\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0006\u0003"+
		"\u0000\u008b\u008c\u0005%\u0000\u0000\u008c\u008d\u0003\u0006\u0003\u0000"+
		"\u008d\u0095\u0001\u0000\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f"+
		"\u0095\u0003\b\u0004\u0005\u0090\u0091\u0005\u001e\u0000\u0000\u0091\u0092"+
		"\u0003\b\u0004\u0000\u0092\u0093\u0005\u001f\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094t\u0001\u0000\u0000\u0000\u0094v\u0001\u0000\u0000"+
		"\u0000\u0094z\u0001\u0000\u0000\u0000\u0094~\u0001\u0000\u0000\u0000\u0094"+
		"\u0082\u0001\u0000\u0000\u0000\u0094\u0086\u0001\u0000\u0000\u0000\u0094"+
		"\u008a\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0094"+
		"\u0090\u0001\u0000\u0000\u0000\u0095\u00a1\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\n\u0004\u0000\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098\u00a0"+
		"\u0003\b\u0004\u0005\u0099\u009a\n\u0003\u0000\u0000\u009a\u009b\u0005"+
		"(\u0000\u0000\u009b\u00a0\u0003\b\u0004\u0004\u009c\u009d\n\u0002\u0000"+
		"\u0000\u009d\u009e\u0005)\u0000\u0000\u009e\u00a0\u0003\b\u0004\u0003"+
		"\u009f\u0096\u0001\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000"+
		"\u009f\u009c\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\t\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u000b"+
		"\u0012$2QWaoq\u0094\u009f\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}