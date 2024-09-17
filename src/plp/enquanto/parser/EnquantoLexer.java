// Generated from ./src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EnquantoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, BOOLEANO=28, INT=29, ID=30, TEXTO=31, Comentario=32, 
		Espaco=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "BOOLEANO", "INT", "ID", "TEXTO", "Comentario", "Espaco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'skip'", "'se'", "'entao'", "'senao'", "'enquanto'", 
			"'faca'", "'exiba'", "'escreva'", "'{'", "'}'", "'leia'", "'^'", "'*'", 
			"'/'", "'+'", "'-'", "'('", "')'", "'='", "'<>'", "'<='", "'nao'", "'e'", 
			"'xou'", "'ou'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOLEANO", "INT", "ID", "TEXTO", "Comentario", 
			"Espaco"
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


	public EnquantoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Enquanto.g4"; }

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
		"\u0004\u0000!\u00d7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u00b4\b\u001b\u0001\u001c\u0004\u001c\u00b7\b"+
		"\u001c\u000b\u001c\f\u001c\u00b8\u0001\u001d\u0004\u001d\u00bc\b\u001d"+
		"\u000b\u001d\f\u001d\u00bd\u0001\u001e\u0001\u001e\u0005\u001e\u00c2\b"+
		"\u001e\n\u001e\f\u001e\u00c5\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u00cb\b\u001f\n\u001f\f\u001f\u00ce\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0002\u00c3\u00cc\u0000!\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!\u0001\u0000\u0001\u0003\u0000\t\n\r\r  \u00db\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003E\u0001\u0000\u0000\u0000"+
		"\u0005H\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tP\u0001"+
		"\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\r\\\u0001\u0000\u0000"+
		"\u0000\u000fe\u0001\u0000\u0000\u0000\u0011j\u0001\u0000\u0000\u0000\u0013"+
		"p\u0001\u0000\u0000\u0000\u0015x\u0001\u0000\u0000\u0000\u0017z\u0001"+
		"\u0000\u0000\u0000\u0019|\u0001\u0000\u0000\u0000\u001b\u0081\u0001\u0000"+
		"\u0000\u0000\u001d\u0083\u0001\u0000\u0000\u0000\u001f\u0085\u0001\u0000"+
		"\u0000\u0000!\u0087\u0001\u0000\u0000\u0000#\u0089\u0001\u0000\u0000\u0000"+
		"%\u008b\u0001\u0000\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)\u008f"+
		"\u0001\u0000\u0000\u0000+\u0091\u0001\u0000\u0000\u0000-\u0094\u0001\u0000"+
		"\u0000\u0000/\u0097\u0001\u0000\u0000\u00001\u009b\u0001\u0000\u0000\u0000"+
		"3\u009d\u0001\u0000\u0000\u00005\u00a1\u0001\u0000\u0000\u00007\u00b3"+
		"\u0001\u0000\u0000\u00009\u00b6\u0001\u0000\u0000\u0000;\u00bb\u0001\u0000"+
		"\u0000\u0000=\u00bf\u0001\u0000\u0000\u0000?\u00c8\u0001\u0000\u0000\u0000"+
		"A\u00d3\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u0002\u0001\u0000"+
		"\u0000\u0000EF\u0005:\u0000\u0000FG\u0005=\u0000\u0000G\u0004\u0001\u0000"+
		"\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005k\u0000\u0000JK\u0005i\u0000"+
		"\u0000KL\u0005p\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005s\u0000"+
		"\u0000NO\u0005e\u0000\u0000O\b\u0001\u0000\u0000\u0000PQ\u0005e\u0000"+
		"\u0000QR\u0005n\u0000\u0000RS\u0005t\u0000\u0000ST\u0005a\u0000\u0000"+
		"TU\u0005o\u0000\u0000U\n\u0001\u0000\u0000\u0000VW\u0005s\u0000\u0000"+
		"WX\u0005e\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005a\u0000\u0000Z[\u0005"+
		"o\u0000\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005"+
		"n\u0000\u0000^_\u0005q\u0000\u0000_`\u0005u\u0000\u0000`a\u0005a\u0000"+
		"\u0000ab\u0005n\u0000\u0000bc\u0005t\u0000\u0000cd\u0005o\u0000\u0000"+
		"d\u000e\u0001\u0000\u0000\u0000ef\u0005f\u0000\u0000fg\u0005a\u0000\u0000"+
		"gh\u0005c\u0000\u0000hi\u0005a\u0000\u0000i\u0010\u0001\u0000\u0000\u0000"+
		"jk\u0005e\u0000\u0000kl\u0005x\u0000\u0000lm\u0005i\u0000\u0000mn\u0005"+
		"b\u0000\u0000no\u0005a\u0000\u0000o\u0012\u0001\u0000\u0000\u0000pq\u0005"+
		"e\u0000\u0000qr\u0005s\u0000\u0000rs\u0005c\u0000\u0000st\u0005r\u0000"+
		"\u0000tu\u0005e\u0000\u0000uv\u0005v\u0000\u0000vw\u0005a\u0000\u0000"+
		"w\u0014\u0001\u0000\u0000\u0000xy\u0005{\u0000\u0000y\u0016\u0001\u0000"+
		"\u0000\u0000z{\u0005}\u0000\u0000{\u0018\u0001\u0000\u0000\u0000|}\u0005"+
		"l\u0000\u0000}~\u0005e\u0000\u0000~\u007f\u0005i\u0000\u0000\u007f\u0080"+
		"\u0005a\u0000\u0000\u0080\u001a\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"^\u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000\u0083\u0084\u0005*\u0000"+
		"\u0000\u0084\u001e\u0001\u0000\u0000\u0000\u0085\u0086\u0005/\u0000\u0000"+
		"\u0086 \u0001\u0000\u0000\u0000\u0087\u0088\u0005+\u0000\u0000\u0088\""+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005-\u0000\u0000\u008a$\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005(\u0000\u0000\u008c&\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005)\u0000\u0000\u008e(\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005=\u0000\u0000\u0090*\u0001\u0000\u0000\u0000\u0091\u0092\u0005<"+
		"\u0000\u0000\u0092\u0093\u0005>\u0000\u0000\u0093,\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005<\u0000\u0000\u0095\u0096\u0005=\u0000\u0000\u0096."+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098\u0099\u0005"+
		"a\u0000\u0000\u0099\u009a\u0005o\u0000\u0000\u009a0\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005e\u0000\u0000\u009c2\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005x\u0000\u0000\u009e\u009f\u0005o\u0000\u0000\u009f\u00a0\u0005"+
		"u\u0000\u0000\u00a04\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005o\u0000"+
		"\u0000\u00a2\u00a3\u0005u\u0000\u0000\u00a36\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005v\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7\u0005"+
		"r\u0000\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\u00a9\u0005a\u0000"+
		"\u0000\u00a9\u00aa\u0005d\u0000\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab"+
		"\u00ac\u0005i\u0000\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad\u00b4\u0005"+
		"o\u0000\u0000\u00ae\u00af\u0005f\u0000\u0000\u00af\u00b0\u0005a\u0000"+
		"\u0000\u00b0\u00b1\u0005l\u0000\u0000\u00b1\u00b2\u0005s\u0000\u0000\u00b2"+
		"\u00b4\u0005o\u0000\u0000\u00b3\u00a4\u0001\u0000\u0000\u0000\u00b3\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b48\u0001\u0000\u0000\u0000\u00b5\u00b7\u0002"+
		"09\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9:\u0001\u0000\u0000\u0000\u00ba\u00bc\u0002az\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"<\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005\"\u0000\u0000\u00c0\u00c2"+
		"\t\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\"\u0000\u0000\u00c7>\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cc\u0005#\u0000\u0000\u00c9\u00cb\t\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\n\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0006\u001f\u0000\u0000\u00d2@\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0007\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0006 \u0000\u0000\u00d6B\u0001\u0000\u0000\u0000\u0006\u0000\u00b3"+
		"\u00b8\u00bd\u00c3\u00cc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}