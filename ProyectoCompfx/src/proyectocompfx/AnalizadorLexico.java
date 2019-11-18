/* The following code was generated by JFlex 1.7.0 */

/* -----ANALIZADOR LEXICO, PROYECTO COMPILADORES----- */
package proyectocompfx;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/analizadores/lexico.jflex</tt>
 */
class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\7\1\63\1\10\1\6\22\0\1\10\1\57\1\53"+
    "\2\0\1\61\2\0\1\43\1\44\1\12\1\60\1\51\1\4\1\3"+
    "\1\11\1\1\11\2\1\0\1\52\1\55\1\54\1\56\2\0\1\36"+
    "\2\5\1\40\11\5\1\37\1\34\2\5\1\35\10\5\1\47\1\0"+
    "\1\50\1\62\2\0\1\21\1\30\1\23\1\20\1\17\1\42\1\32"+
    "\1\41\1\16\2\5\1\24\1\25\1\33\1\15\1\13\1\5\1\14"+
    "\1\22\1\26\1\27\1\31\4\5\1\45\1\0\1\46\7\0\1\63"+
    "\u1fa2\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\1\2\4\1\5\1\6"+
    "\20\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\1\1\23\1\24"+
    "\1\25\1\26\1\27\1\0\7\27\1\30\10\27\1\31"+
    "\3\27\1\32\1\33\2\0\24\27\1\34\2\27\1\0"+
    "\4\27\1\35\10\27\1\36\2\27\1\37\4\27\1\40"+
    "\13\27\1\41\3\27\1\42\4\27\1\43\1\44\10\27"+
    "\1\45\2\27\1\46\20\27\1\47\1\50\3\27\1\51"+
    "\1\52\1\53\2\27\1\54\1\55\1\27\1\56\1\57"+
    "\6\27\1\60\1\27\1\61\1\62\2\27\1\63\1\64"+
    "\1\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\64\0\64\0\234\0\320\0\64"+
    "\0\u0104\0\64\0\u0138\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c"+
    "\0\u0270\0\u02a4\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc"+
    "\0\u0410\0\u0444\0\64\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\u0478\0\64\0\64\0\u04ac\0\64"+
    "\0\64\0\64\0\150\0\234\0\u04e0\0\u0514\0\u0548\0\u057c"+
    "\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c"+
    "\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\234\0\u0854\0\u0888"+
    "\0\u08bc\0\64\0\64\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0"+
    "\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60"+
    "\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00"+
    "\0\u0d34\0\234\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0e6c"+
    "\0\u0ea0\0\234\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8"+
    "\0\u100c\0\u1040\0\234\0\u1074\0\u10a8\0\234\0\u10dc\0\u1110"+
    "\0\u1144\0\u1178\0\234\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c"+
    "\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\234\0\u13e8"+
    "\0\u141c\0\u1450\0\234\0\u1484\0\u14b8\0\u14ec\0\u1520\0\234"+
    "\0\234\0\u1554\0\u1588\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c"+
    "\0\u16c0\0\234\0\u16f4\0\u1728\0\234\0\u175c\0\u1790\0\u17c4"+
    "\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8\0\u18fc\0\u1930\0\u1964"+
    "\0\u1998\0\u19cc\0\u1a00\0\u1a34\0\u1a68\0\234\0\234\0\u1a9c"+
    "\0\u1ad0\0\u1b04\0\234\0\234\0\234\0\u1b38\0\u1b6c\0\234"+
    "\0\234\0\u1ba0\0\234\0\234\0\u1bd4\0\u1c08\0\u1c3c\0\u1c70"+
    "\0\u1ca4\0\u1cd8\0\234\0\u1d0c\0\234\0\234\0\u1d40\0\u1d74"+
    "\0\234\0\234\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\2\10\1\11"+
    "\1\12\1\13\1\14\1\6\1\15\1\16\1\17\1\6"+
    "\1\20\1\21\1\22\1\23\2\6\1\24\1\25\1\6"+
    "\1\26\1\27\1\6\1\30\2\6\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\66\0"+
    "\2\53\62\0\2\54\2\0\1\54\5\0\30\54\30\0"+
    "\1\10\66\0\1\55\52\0\2\54\2\0\1\54\5\0"+
    "\1\54\1\56\12\54\1\57\13\54\22\0\2\54\2\0"+
    "\1\54\5\0\4\54\1\60\23\54\22\0\2\54\2\0"+
    "\1\54\5\0\20\54\1\61\7\54\22\0\2\54\2\0"+
    "\1\54\5\0\7\54\1\62\10\54\1\63\7\54\22\0"+
    "\2\54\2\0\1\54\5\0\4\54\1\64\23\54\22\0"+
    "\2\54\2\0\1\54\5\0\3\54\1\65\24\54\22\0"+
    "\2\54\2\0\1\54\5\0\6\54\1\66\2\54\1\67"+
    "\16\54\22\0\2\54\2\0\1\54\5\0\4\54\1\70"+
    "\23\54\22\0\2\54\2\0\1\54\5\0\3\54\1\71"+
    "\1\72\23\54\22\0\2\54\2\0\1\54\5\0\2\54"+
    "\1\73\25\54\22\0\2\54\2\0\1\54\5\0\4\54"+
    "\1\74\23\54\22\0\2\54\2\0\1\54\5\0\14\54"+
    "\1\75\13\54\22\0\2\54\2\0\1\54\5\0\22\54"+
    "\1\76\5\54\22\0\2\54\2\0\1\54\5\0\24\54"+
    "\1\77\3\54\22\0\2\54\2\0\1\54\5\0\6\54"+
    "\1\100\21\54\22\0\2\54\2\0\1\54\5\0\6\54"+
    "\1\101\21\54\75\0\1\102\63\0\1\103\7\0\12\104"+
    "\1\105\51\104\1\0\2\54\2\0\1\54\5\0\2\54"+
    "\1\106\1\107\24\54\22\0\2\54\2\0\1\54\5\0"+
    "\15\54\1\110\12\54\22\0\2\54\2\0\1\54\5\0"+
    "\6\54\1\111\21\54\22\0\2\54\2\0\1\54\5\0"+
    "\7\54\1\112\1\113\17\54\22\0\2\54\2\0\1\54"+
    "\5\0\10\54\1\114\17\54\22\0\2\54\2\0\1\54"+
    "\5\0\13\54\1\115\14\54\22\0\2\54\2\0\1\54"+
    "\5\0\7\54\1\116\1\117\5\54\1\120\11\54\22\0"+
    "\2\54\2\0\1\54\5\0\20\54\1\121\7\54\22\0"+
    "\2\54\2\0\1\54\5\0\5\54\1\122\22\54\22\0"+
    "\2\54\2\0\1\54\5\0\6\54\1\123\21\54\22\0"+
    "\2\54\2\0\1\54\5\0\4\54\1\124\23\54\22\0"+
    "\2\54\2\0\1\54\5\0\4\54\1\125\23\54\22\0"+
    "\2\54\2\0\1\54\5\0\13\54\1\126\14\54\22\0"+
    "\2\54\2\0\1\54\5\0\11\54\1\127\16\54\22\0"+
    "\2\54\2\0\1\54\5\0\1\54\1\130\26\54\22\0"+
    "\2\54\2\0\1\54\5\0\11\54\1\131\16\54\22\0"+
    "\2\54\2\0\1\54\5\0\25\54\1\132\2\54\22\0"+
    "\2\54\2\0\1\54\5\0\10\54\1\133\17\54\22\0"+
    "\2\54\2\0\1\54\5\0\11\54\1\134\16\54\21\0"+
    "\12\104\1\135\51\104\11\0\1\10\1\105\52\0\2\54"+
    "\2\0\1\54\5\0\1\136\12\54\1\137\14\54\22\0"+
    "\2\54\2\0\1\54\5\0\16\54\1\140\11\54\22\0"+
    "\2\54\2\0\1\54\5\0\11\54\1\141\16\54\22\0"+
    "\2\54\2\0\1\54\5\0\11\54\1\142\16\54\22\0"+
    "\2\54\2\0\1\54\5\0\13\54\1\143\14\54\22\0"+
    "\2\54\2\0\1\54\5\0\1\54\1\144\26\54\22\0"+
    "\2\54\2\0\1\54\5\0\1\54\1\145\26\54\22\0"+
    "\2\54\2\0\1\54\5\0\2\54\1\146\1\54\1\147"+
    "\23\54\22\0\2\54\2\0\1\54\5\0\5\54\1\150"+
    "\22\54\22\0\2\54\2\0\1\54\5\0\1\54\1\151"+
    "\26\54\22\0\2\54\2\0\1\54\5\0\2\54\1\152"+
    "\25\54\22\0\2\54\2\0\1\54\5\0\2\54\1\153"+
    "\25\54\22\0\2\54\2\0\1\54\5\0\4\54\1\154"+
    "\23\54\22\0\2\54\2\0\1\54\5\0\7\54\1\155"+
    "\20\54\22\0\2\54\2\0\1\54\5\0\1\54\1\156"+
    "\26\54\22\0\2\54\2\0\1\54\5\0\20\54\1\157"+
    "\7\54\22\0\2\54\2\0\1\54\5\0\2\54\1\160"+
    "\25\54\22\0\2\54\2\0\1\54\5\0\4\54\1\161"+
    "\23\54\22\0\2\54\2\0\1\54\5\0\5\54\1\162"+
    "\22\54\22\0\2\54\2\0\1\54\5\0\2\54\1\163"+
    "\25\54\22\0\2\54\2\0\1\54\5\0\4\54\1\164"+
    "\23\54\22\0\2\54\2\0\1\54\5\0\7\54\1\165"+
    "\20\54\21\0\11\104\1\10\1\135\51\104\1\0\2\54"+
    "\2\0\1\54\5\0\3\54\1\166\24\54\22\0\2\54"+
    "\2\0\1\54\5\0\4\54\1\167\23\54\22\0\2\54"+
    "\2\0\1\54\5\0\6\54\1\170\21\54\22\0\2\54"+
    "\2\0\1\54\5\0\3\54\1\171\24\54\22\0\2\54"+
    "\2\0\1\54\5\0\6\54\1\172\21\54\22\0\2\54"+
    "\2\0\1\54\5\0\4\54\1\173\23\54\22\0\2\54"+
    "\2\0\1\54\5\0\3\54\1\174\24\54\22\0\2\54"+
    "\2\0\1\54\5\0\20\54\1\175\7\54\22\0\2\54"+
    "\2\0\1\54\5\0\1\54\1\176\26\54\22\0\2\54"+
    "\2\0\1\54\5\0\4\54\1\177\23\54\22\0\2\54"+
    "\2\0\1\54\5\0\4\54\1\200\23\54\22\0\2\54"+
    "\2\0\1\54\5\0\11\54\1\201\16\54\22\0\2\54"+
    "\2\0\1\54\5\0\20\54\1\202\7\54\22\0\2\54"+
    "\2\0\1\54\5\0\4\54\1\203\23\54\22\0\2\54"+
    "\2\0\1\54\5\0\13\54\1\204\14\54\22\0\2\54"+
    "\2\0\1\54\5\0\5\54\1\205\22\54\22\0\2\54"+
    "\2\0\1\54\5\0\6\54\1\206\21\54\22\0\2\54"+
    "\2\0\1\54\5\0\6\54\1\207\21\54\22\0\2\54"+
    "\2\0\1\54\5\0\1\54\1\210\26\54\22\0\2\54"+
    "\2\0\1\54\5\0\2\54\1\211\25\54\22\0\2\54"+
    "\2\0\1\54\5\0\4\54\1\212\23\54\22\0\2\54"+
    "\2\0\1\54\5\0\17\54\1\213\10\54\22\0\2\54"+
    "\2\0\1\54\5\0\5\54\1\214\22\54\22\0\2\54"+
    "\2\0\1\54\5\0\10\54\1\215\17\54\22\0\2\54"+
    "\2\0\1\54\5\0\20\54\1\216\7\54\22\0\2\54"+
    "\2\0\1\54\5\0\12\54\1\217\15\54\22\0\2\54"+
    "\2\0\1\54\5\0\15\54\1\220\12\54\22\0\2\54"+
    "\2\0\1\54\5\0\10\54\1\221\17\54\22\0\2\54"+
    "\2\0\1\54\5\0\2\54\1\222\25\54\22\0\2\54"+
    "\2\0\1\54\5\0\12\54\1\223\15\54\22\0\2\54"+
    "\2\0\1\54\5\0\16\54\1\224\11\54\22\0\2\54"+
    "\2\0\1\54\5\0\6\54\1\225\21\54\22\0\2\54"+
    "\2\0\1\54\5\0\1\54\1\226\26\54\22\0\2\54"+
    "\2\0\1\54\5\0\2\54\1\227\25\54\22\0\2\54"+
    "\2\0\1\54\5\0\20\54\1\230\7\54\22\0\2\54"+
    "\2\0\1\54\5\0\5\54\1\231\22\54\22\0\2\54"+
    "\2\0\1\54\5\0\5\54\1\232\22\54\22\0\2\54"+
    "\2\0\1\54\5\0\3\54\1\233\24\54\22\0\2\54"+
    "\2\0\1\54\5\0\6\54\1\234\21\54\22\0\2\54"+
    "\2\0\1\54\5\0\2\54\1\235\3\54\1\236\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\10\54\1\237\17\54"+
    "\22\0\2\54\2\0\1\54\5\0\4\54\1\240\23\54"+
    "\22\0\2\54\2\0\1\54\5\0\3\54\1\241\24\54"+
    "\22\0\2\54\2\0\1\54\5\0\4\54\1\242\23\54"+
    "\22\0\2\54\2\0\1\54\5\0\4\54\1\243\23\54"+
    "\22\0\2\54\2\0\1\54\5\0\4\54\1\244\23\54"+
    "\22\0\2\54\2\0\1\54\5\0\6\54\1\245\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\246\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\2\54\1\247\25\54"+
    "\22\0\2\54\2\0\1\54\5\0\4\54\1\250\23\54"+
    "\22\0\2\54\2\0\1\54\5\0\6\54\1\251\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\5\54\1\252\22\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\253\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\254\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\255\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\3\54\1\256\24\54"+
    "\22\0\2\54\2\0\1\54\5\0\20\54\1\257\7\54"+
    "\22\0\2\54\2\0\1\54\5\0\1\54\1\260\26\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\261\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\20\54\1\262\7\54"+
    "\22\0\2\54\2\0\1\54\5\0\1\54\1\263\26\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\264\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\1\54\1\265\26\54"+
    "\22\0\2\54\2\0\1\54\5\0\5\54\1\266\22\54"+
    "\22\0\2\54\2\0\1\54\5\0\6\54\1\267\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\6\54\1\270\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\13\54\1\271\14\54"+
    "\22\0\2\54\2\0\1\54\5\0\13\54\1\272\14\54"+
    "\22\0\2\54\2\0\1\54\5\0\2\54\1\273\25\54"+
    "\22\0\2\54\2\0\1\54\5\0\4\54\1\274\23\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\275\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\1\54\1\276\26\54"+
    "\22\0\2\54\2\0\1\54\5\0\6\54\1\277\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\6\54\1\300\21\54"+
    "\22\0\2\54\2\0\1\54\5\0\7\54\1\301\20\54"+
    "\22\0\2\54\2\0\1\54\5\0\1\54\1\302\26\54"+
    "\22\0\2\54\2\0\1\54\5\0\1\54\1\303\26\54"+
    "\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7592];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\2\1\1\11\1\1\1\11"+
    "\20\1\11\11\1\1\2\11\1\1\3\11\2\1\1\0"+
    "\24\1\2\11\2\0\27\1\1\0\146\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {   System.out.println("Fin de archivo encontrado");
  return new Symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.err.println("caracter invalido \"" + yytext() + "\" ["+ (yyline+1) + ":"+ (yycolumn+1) + ":"+ yychar + "]");
    return new Symbol(sym.error);
            } 
            // fall through
          case 54: break;
          case 2: 
            { return new Symbol(sym.PUNTO,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 55: break;
          case 3: 
            { return new Symbol(sym.RESTA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 56: break;
          case 4: 
            { /* ignorar */
            } 
            // fall through
          case 57: break;
          case 5: 
            { return new Symbol(sym.DIVI,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 58: break;
          case 6: 
            { return new Symbol(sym.MULTI,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 59: break;
          case 7: 
            { return new Symbol(sym.PARENTL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 60: break;
          case 8: 
            { return new Symbol(sym.PARENTR,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 61: break;
          case 9: 
            { return new Symbol(sym.LLAVEL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 62: break;
          case 10: 
            { return new Symbol(sym.LLAVER,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 63: break;
          case 11: 
            { return new Symbol(sym.CORCHL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 64: break;
          case 12: 
            { return new Symbol(sym.CORCHR,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 65: break;
          case 13: 
            { return new Symbol(sym.COMA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 66: break;
          case 14: 
            { return new Symbol(sym.PUNTOCOMA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 67: break;
          case 15: 
            { return new Symbol(sym.COMILLA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 68: break;
          case 16: 
            { return new Symbol(sym.IGUAL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 69: break;
          case 17: 
            { return new Symbol(sym.MENQ,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 70: break;
          case 18: 
            { return new Symbol(sym.MAYQ,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 71: break;
          case 19: 
            { return new Symbol(sym.SUMA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 72: break;
          case 20: 
            { return new Symbol(sym.MODULO,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 73: break;
          case 21: 
            { return new Symbol(sym.EXP,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 74: break;
          case 22: 
            { return new Symbol(sym.NUMERO, new token(yycolumn, yyline, yytext(), true));
            } 
            // fall through
          case 75: break;
          case 23: 
            { return new Symbol(sym.ID, new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 76: break;
          case 24: 
            { return new Symbol(sym.IF,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 77: break;
          case 25: 
            { return new Symbol(sym.OR,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 78: break;
          case 26: 
            { return new Symbol(sym.EQUAL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 79: break;
          case 27: 
            { return new Symbol(sym.DIFERENTE,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 80: break;
          case 28: 
            { return new Symbol(sym.AND,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 81: break;
          case 29: 
            { return new Symbol(sym.REAL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 82: break;
          case 30: 
            { return new Symbol(sym.ELIF,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 83: break;
          case 31: 
            { return new Symbol(sym.GET,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 84: break;
          case 32: 
            { return new Symbol(sym.NULL,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 85: break;
          case 33: 
            { return new Symbol(sym.FROM,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 86: break;
          case 34: 
            { return new Symbol(sym.CLASE,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 87: break;
          case 35: 
            { return new Symbol(sym.DO,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 88: break;
          case 36: 
            { return new Symbol(sym.FALSE,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 89: break;
          case 37: 
            { return new Symbol(sym.INT,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 90: break;
          case 38: 
            { return new Symbol(sym.STRING,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 91: break;
          case 39: 
            { return new Symbol(sym.METODO,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 92: break;
          case 40: 
            { return new Symbol(sym.BOOLEAN,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 93: break;
          case 41: 
            { return new Symbol(sym.PRIVADA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 94: break;
          case 42: 
            { return new Symbol(sym.PUBLICO,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 95: break;
          case 43: 
            { return new Symbol(sym.PUBLICA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 96: break;
          case 44: 
            { return new Symbol(sym.PRINT,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 97: break;
          case 45: 
            { return new Symbol(sym.ELSE,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 98: break;
          case 46: 
            { return new Symbol(sym.RETURN,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 99: break;
          case 47: 
            { return new Symbol(sym.WHILE,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 100: break;
          case 48: 
            { return new Symbol(sym.TRUE,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 101: break;
          case 49: 
            { return new Symbol(sym.PROTEGIDA,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 102: break;
          case 50: 
            { return new Symbol(sym.INSTANCIAR,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 103: break;
          case 51: 
            { return new Symbol(sym.PROPIEDADES,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 104: break;
          case 52: 
            { return new Symbol(sym.INC,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 105: break;
          case 53: 
            { return new Symbol(sym.DEC,new token(yycolumn, yyline, yytext()));
            } 
            // fall through
          case 106: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}