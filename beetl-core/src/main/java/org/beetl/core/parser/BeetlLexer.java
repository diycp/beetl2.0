// Generated from BeetlLexer.g4 by ANTLR 4.2.2
package org.beetl.core.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BeetlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, For=2, Elsefor=3, Else=4, While=5, Switch=6, Select=7, Return=8, 
		Break=9, Continue=10, Var=11, Directive=12, Case=13, Default=14, Try=15, 
		Catch=16, Ajax=17, Fragment=18, LEFT_BRACE=19, RIGHT_BRACE=20, LEFT_PAR=21, 
		RIGHT_PAR=22, LEFT_SQBR=23, RIGHT_SQBR=24, INCREASE=25, DECREASE=26, VIRTUAL=27, 
		ADD=28, MIN=29, MUlTIP=30, DIV=31, MOD=32, EQUAL=33, NOT_EQUAL=34, ASSIN=35, 
		LARGE_EQUAL=36, LARGE=37, LESS_EQUAL=38, LESS=39, NOT=40, AND=41, OR=42, 
		QUESTOIN=43, AT=44, NULL=45, TRUE=46, FALSE=47, END=48, COMMA=49, COLON=50, 
		PERIOD=51, FOR_IN=52, LEFT_TOKEN=53, RIGHT_TOKEN=54, LEFT_TEXT_TOKEN=55, 
		HexLiteral=56, DecimalLiteral=57, OctalLiteral=58, FloatingPointLiteral=59, 
		StringLiteral=60, Identifier=61, WS=62, LINE_COMMENT=63, COMMENT_OPEN=64, 
		COMMENT_TAG=65, COMMENT_END=66, ALL_COMMENT_CHAR=67, Identifier1=68, PERIOD1=69, 
		LEFT_PAR1=70, RIGHT_PAR1=71, COMMA1=72, LEFT_ANGULAR=73, RIGHT_ANGULAR=74, 
		WS1=75, TYPE_END=76;
	public static final int MODE_COMMENT = 1;
	public static final int MODE_COMMENT_TYPE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "MODE_COMMENT", "MODE_COMMENT_TYPE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'if'", "'for'", "'elsefor'", "'else'", "'while'", "'switch'", "'select'", 
		"'return'", "'break'", "'continue'", "'var'", "Directive", "'case'", "'default'", 
		"'try'", "'catch'", "'#ajax'", "'#fragment'", "'{'", "'}'", "LEFT_PAR", 
		"RIGHT_PAR", "'['", "']'", "'++'", "'--'", "'.~'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'=='", "'!='", "'='", "'>='", "LARGE", "'<='", "LESS", 
		"'!'", "'&&'", "'||'", "'?'", "'@'", "'null'", "'true'", "'false'", "';'", 
		"COMMA", "':'", "PERIOD", "'in'", "'<<'", "'>>'", "'<$'", "HexLiteral", 
		"DecimalLiteral", "OctalLiteral", "FloatingPointLiteral", "StringLiteral", 
		"Identifier", "WS", "LINE_COMMENT", "COMMENT_OPEN", "COMMENT_TAG", "COMMENT_END", 
		"ALL_COMMENT_CHAR", "Identifier1", "PERIOD1", "LEFT_PAR1", "RIGHT_PAR1", 
		"COMMA1", "LEFT_ANGULAR", "RIGHT_ANGULAR", "WS1", "TYPE_END"
	};
	public static final String[] ruleNames = {
		"If", "For", "Elsefor", "Else", "While", "Switch", "Select", "Return", 
		"Break", "Continue", "Var", "Directive", "Case", "Default", "Try", "Catch", 
		"Ajax", "Fragment", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAR", "RIGHT_PAR", 
		"LEFT_SQBR", "RIGHT_SQBR", "INCREASE", "DECREASE", "VIRTUAL", "ADD", "MIN", 
		"MUlTIP", "DIV", "MOD", "EQUAL", "NOT_EQUAL", "ASSIN", "LARGE_EQUAL", 
		"LARGE", "LESS_EQUAL", "LESS", "NOT", "AND", "OR", "QUESTOIN", "AT", "NULL", 
		"TRUE", "FALSE", "END", "COMMA", "COLON", "PERIOD", "FOR_IN", "LEFT_TOKEN", 
		"RIGHT_TOKEN", "LEFT_TEXT_TOKEN", "HexLiteral", "DecimalLiteral", "OctalLiteral", 
		"HexDigit", "IntegerTypeSuffix", "FloatingPointLiteral", "Exponent", "FloatTypeSuffix", 
		"StringLiteral", "EscapeSequence", "OctalEscape", "UnicodeEscape", "Identifier", 
		"Letter", "JavaIDDigit", "WS", "LINE_COMMENT", "COMMENT_OPEN", "COMMENT_TAG", 
		"COMMENT_END", "COMMENT_END_CHAR", "TYPE_CHAR", "ALL_COMMENT_CHAR", "Identifier1", 
		"PERIOD1", "LEFT_PAR1", "RIGHT_PAR1", "COMMA1", "LEFT_ANGULAR", "RIGHT_ANGULAR", 
		"WS1", "TYPE_END"
	};


		public void notifyListeners(LexerNoViableAltException e) {
			String text = _input.getText(Interval.of(_tokenStartCharIndex, _input.index()));		
			ANTLRErrorListener listener = getErrorListenerDispatch();
			listener.syntaxError(this, null, _tokenStartLine, _tokenStartCharPositionInLine, text, e);
		}


	public BeetlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BeetlLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2N\u0297\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0108\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3"+
		"%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"8\38\38\39\39\39\69\u0195\n9\r9\169\u0196\39\59\u019a\n9\3:\3:\3:\7:\u019f"+
		"\n:\f:\16:\u01a2\13:\5:\u01a4\n:\3:\5:\u01a7\n:\3;\3;\6;\u01ab\n;\r;\16"+
		";\u01ac\3;\5;\u01b0\n;\3<\3<\3=\3=\3>\6>\u01b7\n>\r>\16>\u01b8\3>\3>\7"+
		">\u01bd\n>\f>\16>\u01c0\13>\3>\5>\u01c3\n>\3>\5>\u01c6\n>\3>\3>\6>\u01ca"+
		"\n>\r>\16>\u01cb\3>\5>\u01cf\n>\3>\5>\u01d2\n>\3>\6>\u01d5\n>\r>\16>\u01d6"+
		"\3>\3>\5>\u01db\n>\3>\6>\u01de\n>\r>\16>\u01df\3>\3>\3>\3>\3>\5>\u01e7"+
		"\n>\3>\7>\u01ea\n>\f>\16>\u01ed\13>\3>\3>\7>\u01f1\n>\f>\16>\u01f4\13"+
		">\5>\u01f6\n>\3>\3>\5>\u01fa\n>\3>\6>\u01fd\n>\r>\16>\u01fe\3>\5>\u0202"+
		"\n>\5>\u0204\n>\3?\3?\5?\u0208\n?\3?\6?\u020b\n?\r?\16?\u020c\3@\3@\3"+
		"A\3A\3A\7A\u0214\nA\fA\16A\u0217\13A\3A\3A\3A\3A\7A\u021d\nA\fA\16A\u0220"+
		"\13A\3A\5A\u0223\nA\3B\3B\3B\3B\5B\u0229\nB\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\5C\u0234\nC\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\7E\u0240\nE\fE\16E\u0243\13"+
		"E\3F\3F\3G\3G\3H\6H\u024a\nH\rH\16H\u024b\3H\3H\3I\3I\3I\3I\7I\u0254\n"+
		"I\fI\16I\u0257\13I\3I\5I\u025a\nI\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K"+
		"\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3Q"+
		"\3Q\3R\3R\3S\3S\3S\3S\3T\3T\3U\3U\3V\3V\3W\6W\u028d\nW\rW\16W\u028e\3"+
		"W\3W\3X\3X\3X\3X\3X\2\2Y\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8q9s:u;w<y\2{\2}=\177\2\u0081\2\u0083>\u0085\2\u0087"+
		"\2\u0089\2\u008b?\u008d\2\u008f\2\u0091@\u0093A\u0095B\u0097C\u0099D\u009b"+
		"\2\u009d\2\u009fE\u00a1F\u00a3G\u00a5H\u00a7I\u00a9J\u00abK\u00adL\u00af"+
		"M\u00b1N\5\2\3\4\20\4\2ZZzz\5\2\62;CHch\4\2JJjj\4\2RRrr\4\2--//\4\2GG"+
		"gg\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\n\2$$))^^ddhhppttvv\16\2&&C\\a"+
		"ac|\u00c2\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402"+
		"\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968"+
		"\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68"+
		"\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\5\2\13\13\16\17\"\"\u02b7\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2}\3\2\2\2\2\u0083\3\2\2\2\2\u008b\3\2"+
		"\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\3"+
		"\u0099\3\2\2\2\3\u009f\3\2\2\2\4\u00a1\3\2\2\2\4\u00a3\3\2\2\2\4\u00a5"+
		"\3\2\2\2\4\u00a7\3\2\2\2\4\u00a9\3\2\2\2\4\u00ab\3\2\2\2\4\u00ad\3\2\2"+
		"\2\4\u00af\3\2\2\2\4\u00b1\3\2\2\2\5\u00b3\3\2\2\2\7\u00b6\3\2\2\2\t\u00ba"+
		"\3\2\2\2\13\u00c2\3\2\2\2\r\u00c7\3\2\2\2\17\u00cd\3\2\2\2\21\u00d4\3"+
		"\2\2\2\23\u00db\3\2\2\2\25\u00e2\3\2\2\2\27\u00e8\3\2\2\2\31\u00f1\3\2"+
		"\2\2\33\u0107\3\2\2\2\35\u0109\3\2\2\2\37\u010e\3\2\2\2!\u0116\3\2\2\2"+
		"#\u011a\3\2\2\2%\u0120\3\2\2\2\'\u0126\3\2\2\2)\u0130\3\2\2\2+\u0132\3"+
		"\2\2\2-\u0134\3\2\2\2/\u0136\3\2\2\2\61\u0138\3\2\2\2\63\u013a\3\2\2\2"+
		"\65\u013c\3\2\2\2\67\u013f\3\2\2\29\u0142\3\2\2\2;\u0145\3\2\2\2=\u0147"+
		"\3\2\2\2?\u0149\3\2\2\2A\u014b\3\2\2\2C\u014d\3\2\2\2E\u014f\3\2\2\2G"+
		"\u0152\3\2\2\2I\u0155\3\2\2\2K\u0157\3\2\2\2M\u015a\3\2\2\2O\u015c\3\2"+
		"\2\2Q\u015f\3\2\2\2S\u0161\3\2\2\2U\u0163\3\2\2\2W\u0166\3\2\2\2Y\u0169"+
		"\3\2\2\2[\u016b\3\2\2\2]\u016d\3\2\2\2_\u0172\3\2\2\2a\u0177\3\2\2\2c"+
		"\u017d\3\2\2\2e\u017f\3\2\2\2g\u0181\3\2\2\2i\u0183\3\2\2\2k\u0185\3\2"+
		"\2\2m\u0188\3\2\2\2o\u018b\3\2\2\2q\u018e\3\2\2\2s\u0191\3\2\2\2u\u01a3"+
		"\3\2\2\2w\u01a8\3\2\2\2y\u01b1\3\2\2\2{\u01b3\3\2\2\2}\u0203\3\2\2\2\177"+
		"\u0205\3\2\2\2\u0081\u020e\3\2\2\2\u0083\u0222\3\2\2\2\u0085\u0228\3\2"+
		"\2\2\u0087\u0233\3\2\2\2\u0089\u0235\3\2\2\2\u008b\u023c\3\2\2\2\u008d"+
		"\u0244\3\2\2\2\u008f\u0246\3\2\2\2\u0091\u0249\3\2\2\2\u0093\u024f\3\2"+
		"\2\2\u0095\u025f\3\2\2\2\u0097\u0265\3\2\2\2\u0099\u0269\3\2\2\2\u009b"+
		"\u026e\3\2\2\2\u009d\u0271\3\2\2\2\u009f\u0277\3\2\2\2\u00a1\u027b\3\2"+
		"\2\2\u00a3\u027d\3\2\2\2\u00a5\u027f\3\2\2\2\u00a7\u0281\3\2\2\2\u00a9"+
		"\u0285\3\2\2\2\u00ab\u0287\3\2\2\2\u00ad\u0289\3\2\2\2\u00af\u028c\3\2"+
		"\2\2\u00b1\u0292\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7h\2\2\u00b5\6"+
		"\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\b\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\n\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7u"+
		"\2\2\u00c5\u00c6\7g\2\2\u00c6\f\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9"+
		"\7j\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\16\3\2\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7k\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7j\2\2\u00d3\20\3\2\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7e\2\2\u00d9\u00da\7v\2\2\u00da\22\3\2\2\2\u00db\u00dc\7"+
		"t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7w\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7p\2\2\u00e1\24\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7m\2\2\u00e7"+
		"\26\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7w\2\2"+
		"\u00ef\u00f0\7g\2\2\u00f0\30\3\2\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7"+
		"c\2\2\u00f3\u00f4\7t\2\2\u00f4\32\3\2\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7"+
		"\7K\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7E\2\2\u00fa"+
		"\u00fb\7V\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fd\7X\2\2\u00fd\u0108\7G\2\2"+
		"\u00fe\u00ff\7f\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7t\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7e\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7x\2\2\u0106\u0108\7g\2\2\u0107\u00f5\3\2\2\2\u0107\u00fe\3\2\2"+
		"\2\u0108\34\3\2\2\2\u0109\u010a\7e\2\2\u010a\u010b\7c\2\2\u010b\u010c"+
		"\7u\2\2\u010c\u010d\7g\2\2\u010d\36\3\2\2\2\u010e\u010f\7f\2\2\u010f\u0110"+
		"\7g\2\2\u0110\u0111\7h\2\2\u0111\u0112\7c\2\2\u0112\u0113\7w\2\2\u0113"+
		"\u0114\7n\2\2\u0114\u0115\7v\2\2\u0115 \3\2\2\2\u0116\u0117\7v\2\2\u0117"+
		"\u0118\7t\2\2\u0118\u0119\7{\2\2\u0119\"\3\2\2\2\u011a\u011b\7e\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7v\2\2\u011d\u011e\7e\2\2\u011e\u011f\7j\2\2"+
		"\u011f$\3\2\2\2\u0120\u0121\7%\2\2\u0121\u0122\7c\2\2\u0122\u0123\7l\2"+
		"\2\u0123\u0124\7c\2\2\u0124\u0125\7z\2\2\u0125&\3\2\2\2\u0126\u0127\7"+
		"%\2\2\u0127\u0128\7h\2\2\u0128\u0129\7t\2\2\u0129\u012a\7c\2\2\u012a\u012b"+
		"\7i\2\2\u012b\u012c\7o\2\2\u012c\u012d\7g\2\2\u012d\u012e\7p\2\2\u012e"+
		"\u012f\7v\2\2\u012f(\3\2\2\2\u0130\u0131\7}\2\2\u0131*\3\2\2\2\u0132\u0133"+
		"\7\177\2\2\u0133,\3\2\2\2\u0134\u0135\7*\2\2\u0135.\3\2\2\2\u0136\u0137"+
		"\7+\2\2\u0137\60\3\2\2\2\u0138\u0139\7]\2\2\u0139\62\3\2\2\2\u013a\u013b"+
		"\7_\2\2\u013b\64\3\2\2\2\u013c\u013d\7-\2\2\u013d\u013e\7-\2\2\u013e\66"+
		"\3\2\2\2\u013f\u0140\7/\2\2\u0140\u0141\7/\2\2\u01418\3\2\2\2\u0142\u0143"+
		"\7\60\2\2\u0143\u0144\7\u0080\2\2\u0144:\3\2\2\2\u0145\u0146\7-\2\2\u0146"+
		"<\3\2\2\2\u0147\u0148\7/\2\2\u0148>\3\2\2\2\u0149\u014a\7,\2\2\u014a@"+
		"\3\2\2\2\u014b\u014c\7\61\2\2\u014cB\3\2\2\2\u014d\u014e\7\'\2\2\u014e"+
		"D\3\2\2\2\u014f\u0150\7?\2\2\u0150\u0151\7?\2\2\u0151F\3\2\2\2\u0152\u0153"+
		"\7#\2\2\u0153\u0154\7?\2\2\u0154H\3\2\2\2\u0155\u0156\7?\2\2\u0156J\3"+
		"\2\2\2\u0157\u0158\7@\2\2\u0158\u0159\7?\2\2\u0159L\3\2\2\2\u015a\u015b"+
		"\7@\2\2\u015bN\3\2\2\2\u015c\u015d\7>\2\2\u015d\u015e\7?\2\2\u015eP\3"+
		"\2\2\2\u015f\u0160\7>\2\2\u0160R\3\2\2\2\u0161\u0162\7#\2\2\u0162T\3\2"+
		"\2\2\u0163\u0164\7(\2\2\u0164\u0165\7(\2\2\u0165V\3\2\2\2\u0166\u0167"+
		"\7~\2\2\u0167\u0168\7~\2\2\u0168X\3\2\2\2\u0169\u016a\7A\2\2\u016aZ\3"+
		"\2\2\2\u016b\u016c\7B\2\2\u016c\\\3\2\2\2\u016d\u016e\7p\2\2\u016e\u016f"+
		"\7w\2\2\u016f\u0170\7n\2\2\u0170\u0171\7n\2\2\u0171^\3\2\2\2\u0172\u0173"+
		"\7v\2\2\u0173\u0174\7t\2\2\u0174\u0175\7w\2\2\u0175\u0176\7g\2\2\u0176"+
		"`\3\2\2\2\u0177\u0178\7h\2\2\u0178\u0179\7c\2\2\u0179\u017a\7n\2\2\u017a"+
		"\u017b\7u\2\2\u017b\u017c\7g\2\2\u017cb\3\2\2\2\u017d\u017e\7=\2\2\u017e"+
		"d\3\2\2\2\u017f\u0180\7.\2\2\u0180f\3\2\2\2\u0181\u0182\7<\2\2\u0182h"+
		"\3\2\2\2\u0183\u0184\7\60\2\2\u0184j\3\2\2\2\u0185\u0186\7k\2\2\u0186"+
		"\u0187\7p\2\2\u0187l\3\2\2\2\u0188\u0189\7>\2\2\u0189\u018a\7>\2\2\u018a"+
		"n\3\2\2\2\u018b\u018c\7@\2\2\u018c\u018d\7@\2\2\u018dp\3\2\2\2\u018e\u018f"+
		"\7>\2\2\u018f\u0190\7&\2\2\u0190r\3\2\2\2\u0191\u0192\7\62\2\2\u0192\u0194"+
		"\t\2\2\2\u0193\u0195\5y<\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\5{"+
		"=\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019at\3\2\2\2\u019b\u01a4"+
		"\7\62\2\2\u019c\u01a0\4\63;\2\u019d\u019f\4\62;\2\u019e\u019d\3\2\2\2"+
		"\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a7\5{=\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2"+
		"\2\u01a7v\3\2\2\2\u01a8\u01aa\7\62\2\2\u01a9\u01ab\4\629\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01b0\5{=\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2"+
		"\2\u01b0x\3\2\2\2\u01b1\u01b2\t\3\2\2\u01b2z\3\2\2\2\u01b3\u01b4\t\4\2"+
		"\2\u01b4|\3\2\2\2\u01b5\u01b7\4\62;\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01be\7\60\2\2\u01bb\u01bd\4\62;\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3"+
		"\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\u01c3\5\177?\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3"+
		"\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5\u0081@\2\u01c5\u01c4\3\2\2\2"+
		"\u01c5\u01c6\3\2\2\2\u01c6\u0204\3\2\2\2\u01c7\u01c9\7\60\2\2\u01c8\u01ca"+
		"\4\62;\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\5\177?\2\u01ce\u01cd\3"+
		"\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\5\u0081@\2"+
		"\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u0204\3\2\2\2\u01d3\u01d5"+
		"\4\62;\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\5\177?\2\u01d9\u01db\5"+
		"\u0081@\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u0204\3\2\2\2"+
		"\u01dc\u01de\4\62;\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u0204\5\u0081@"+
		"\2\u01e2\u01e3\7\62\2\2\u01e3\u01e7\7z\2\2\u01e4\u01e5\7\62\2\2\u01e5"+
		"\u01e7\7Z\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01eb\3\2"+
		"\2\2\u01e8\u01ea\5y<\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f5\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01f2\7\60\2\2\u01ef\u01f1\5y<\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01f9\t\5\2\2\u01f8\u01fa\t\6\2\2\u01f9\u01f8\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\4\62;\2\u01fc\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u0202\5\u0081@\2\u0201\u0200\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01b6\3\2\2\2\u0203\u01c7\3\2\2\2\u0203"+
		"\u01d4\3\2\2\2\u0203\u01dd\3\2\2\2\u0203\u01e6\3\2\2\2\u0204~\3\2\2\2"+
		"\u0205\u0207\t\7\2\2\u0206\u0208\t\6\2\2\u0207\u0206\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u020b\4\62;\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0080\3\2"+
		"\2\2\u020e\u020f\t\4\2\2\u020f\u0082\3\2\2\2\u0210\u0215\7$\2\2\u0211"+
		"\u0214\5\u0085B\2\u0212\u0214\n\b\2\2\u0213\u0211\3\2\2\2\u0213\u0212"+
		"\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0223\7$\2\2\u0219\u021e\7)\2"+
		"\2\u021a\u021d\5\u0085B\2\u021b\u021d\n\t\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0223\7)\2\2\u0222"+
		"\u0210\3\2\2\2\u0222\u0219\3\2\2\2\u0223\u0084\3\2\2\2\u0224\u0225\7^"+
		"\2\2\u0225\u0229\t\n\2\2\u0226\u0229\5\u0089D\2\u0227\u0229\5\u0087C\2"+
		"\u0228\u0224\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\u0086"+
		"\3\2\2\2\u022a\u022b\7^\2\2\u022b\u022c\4\62\65\2\u022c\u022d\4\629\2"+
		"\u022d\u0234\4\629\2\u022e\u022f\7^\2\2\u022f\u0230\4\629\2\u0230\u0234"+
		"\4\629\2\u0231\u0232\7^\2\2\u0232\u0234\4\629\2\u0233\u022a\3\2\2\2\u0233"+
		"\u022e\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0088\3\2\2\2\u0235\u0236\7^"+
		"\2\2\u0236\u0237\7w\2\2\u0237\u0238\5y<\2\u0238\u0239\5y<\2\u0239\u023a"+
		"\5y<\2\u023a\u023b\5y<\2\u023b\u008a\3\2\2\2\u023c\u0241\5\u008dF\2\u023d"+
		"\u0240\5\u008dF\2\u023e\u0240\5\u008fG\2\u023f\u023d\3\2\2\2\u023f\u023e"+
		"\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u008c\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\t\13\2\2\u0245\u008e\3"+
		"\2\2\2\u0246\u0247\t\f\2\2\u0247\u0090\3\2\2\2\u0248\u024a\t\r\2\2\u0249"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024d\u024e\bH\2\2\u024e\u0092\3\2\2\2\u024f"+
		"\u0250\7\61\2\2\u0250\u0251\7\61\2\2\u0251\u0255\3\2\2\2\u0252\u0254\n"+
		"\16\2\2\u0253\u0252\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025a\7\17"+
		"\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\7\f\2\2\u025c\u025d\3\2\2\2\u025d\u025e\bI\2\2\u025e\u0094\3\2"+
		"\2\2\u025f\u0260\7\61\2\2\u0260\u0261\7,\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\bJ\3\2\u0263\u0264\bJ\2\2\u0264\u0096\3\2\2\2\u0265\u0266\5\u009d"+
		"N\2\u0266\u0267\3\2\2\2\u0267\u0268\bK\4\2\u0268\u0098\3\2\2\2\u0269\u026a"+
		"\5\u009bM\2\u026a\u026b\3\2\2\2\u026b\u026c\bL\5\2\u026c\u026d\bL\2\2"+
		"\u026d\u009a\3\2\2\2\u026e\u026f\7,\2\2\u026f\u0270\7\61\2\2\u0270\u009c"+
		"\3\2\2\2\u0271\u0272\7B\2\2\u0272\u0273\7v\2\2\u0273\u0274\7{\2\2\u0274"+
		"\u0275\7r\2\2\u0275\u0276\7g\2\2\u0276\u009e\3\2\2\2\u0277\u0278\13\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027a\bO\2\2\u027a\u00a0\3\2\2\2\u027b"+
		"\u027c\5\u008bE\2\u027c\u00a2\3\2\2\2\u027d\u027e\7\60\2\2\u027e\u00a4"+
		"\3\2\2\2\u027f\u0280\7*\2\2\u0280\u00a6\3\2\2\2\u0281\u0282\7+\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0284\bS\5\2\u0284\u00a8\3\2\2\2\u0285\u0286\7.\2"+
		"\2\u0286\u00aa\3\2\2\2\u0287\u0288\7>\2\2\u0288\u00ac\3\2\2\2\u0289\u028a"+
		"\7@\2\2\u028a\u00ae\3\2\2\2\u028b\u028d\t\17\2\2\u028c\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u0291\bW\2\2\u0291\u00b0\3\2\2\2\u0292\u0293\t\16\2\2\u0293"+
		"\u0294\3\2\2\2\u0294\u0295\bX\5\2\u0295\u0296\bX\2\2\u0296\u00b2\3\2\2"+
		"\2.\2\3\4\u0107\u0196\u0199\u01a0\u01a3\u01a6\u01ac\u01af\u01b8\u01be"+
		"\u01c2\u01c5\u01cb\u01ce\u01d1\u01d6\u01da\u01df\u01e6\u01eb\u01f2\u01f5"+
		"\u01f9\u01fe\u0201\u0203\u0207\u020c\u0213\u0215\u021c\u021e\u0222\u0228"+
		"\u0233\u023f\u0241\u024b\u0255\u0259\u028e\6\2\3\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}