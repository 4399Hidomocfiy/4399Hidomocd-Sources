package bsh;

import android.support.p012v7.widget.ActivityChooserView;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class Parser implements ParserTreeConstants, ParserConstants {
    JavaCharStream jj_input_stream;
    private int jj_la;
    private Token jj_lastpos;
    private final LookaheadSuccess jj_ls = new LookaheadSuccess(null);
    public Token jj_nt;
    private int jj_ntk;
    private Token jj_scanpos;
    private boolean jj_semLA;
    protected JJTParserState jjtree = new JJTParserState();
    public boolean lookingAhead = false;
    boolean retainComments = false;
    public Token token;
    public ParserTokenManager token_source;

    /* renamed from: bsh.Parser$1 */
    class C09741 {
    }

    /* access modifiers changed from: private */
    public static final class LookaheadSuccess extends Error {
        private LookaheadSuccess() {
        }

        /* synthetic */ LookaheadSuccess(C09741 r1) {
            this();
        }
    }

    public Parser(ParserTokenManager parserTokenManager) {
        this.token_source = parserTokenManager;
        this.token = new Token();
        this.jj_ntk = -1;
    }

    public Parser(InputStream inputStream) {
        this.jj_input_stream = new JavaCharStream(inputStream, 1, 1);
        this.token_source = new ParserTokenManager(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
    }

    public Parser(Reader reader) {
        this.jj_input_stream = new JavaCharStream(reader, 1, 1);
        this.token_source = new ParserTokenManager(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
    }

    private final boolean jj_2_1(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_1();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_10(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_10();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_11(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_11();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_12(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_12();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_13(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_13();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_14(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_14();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_15(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_15();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_16(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_16();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_17(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_17();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_18(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_18();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_19(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_19();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_2(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_2();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_20(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_20();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_21(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_21();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_22(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_22();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_23(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_23();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_24(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_24();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_25(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_25();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_26(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_26();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_27(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_27();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_28(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_28();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_29(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_29();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_3(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_3();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_30(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_30();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_31(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_31();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_4(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_4();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_5(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_5();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_6(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_6();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_7(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_7();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_8(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_8();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_2_9(int i) {
        this.jj_la = i;
        Token token2 = this.token;
        this.jj_scanpos = token2;
        this.jj_lastpos = token2;
        try {
            return true ^ jj_3_9();
        } catch (LookaheadSuccess unused) {
            return true;
        }
    }

    private final boolean jj_3R_100() {
        return jj_3R_130();
    }

    private final boolean jj_3R_101() {
        return jj_3R_37();
    }

    private final boolean jj_3R_102() {
        return jj_3R_32();
    }

    private final boolean jj_3R_103() {
        return jj_3R_29();
    }

    private final boolean jj_3R_104() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_16()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_131()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_132()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_133();
    }

    private final boolean jj_3R_105() {
        return jj_3R_129();
    }

    private final boolean jj_3R_106() {
        return jj_3R_134();
    }

    private final boolean jj_3R_107() {
        return jj_3R_33() || jj_3R_34() || jj_3R_39();
    }

    private final boolean jj_3R_108() {
        if (jj_3R_135()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_156()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_109() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_5()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_136();
    }

    private final boolean jj_3R_110() {
        return jj_scan_token(79) || jj_3R_109();
    }

    private final boolean jj_3R_111() {
        return jj_scan_token(79) || jj_3R_29();
    }

    private final boolean jj_3R_112() {
        return jj_3R_39();
    }

    private final boolean jj_3R_113() {
        Token token2;
        if (jj_scan_token(50) || jj_scan_token(72) || jj_3R_39() || jj_scan_token(73) || jj_scan_token(74)) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_183());
        this.jj_scanpos = token2;
        return jj_scan_token(75);
    }

    private final boolean jj_3R_114() {
        if (jj_scan_token(32) || jj_scan_token(72) || jj_3R_39() || jj_scan_token(73) || jj_3R_45()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_184()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_115() {
        return jj_scan_token(59) || jj_scan_token(72) || jj_3R_39() || jj_scan_token(73) || jj_3R_45();
    }

    private final boolean jj_3R_116() {
        return jj_scan_token(21) || jj_3R_45() || jj_scan_token(59) || jj_scan_token(72) || jj_3R_39() || jj_scan_token(73) || jj_scan_token(78);
    }

    private final boolean jj_3R_117() {
        if (jj_scan_token(30) || jj_scan_token(72)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_185()) {
            this.jj_scanpos = token2;
        }
        if (jj_scan_token(78)) {
            return true;
        }
        Token token3 = this.jj_scanpos;
        if (jj_3R_186()) {
            this.jj_scanpos = token3;
        }
        if (jj_scan_token(78)) {
            return true;
        }
        Token token4 = this.jj_scanpos;
        if (jj_3R_187()) {
            this.jj_scanpos = token4;
        }
        return jj_scan_token(73) || jj_3R_45();
    }

    private final boolean jj_3R_118() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_30()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_137();
    }

    private final boolean jj_3R_119() {
        if (jj_scan_token(12)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(69)) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(78);
    }

    private final boolean jj_3R_120() {
        if (jj_scan_token(19)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(69)) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(78);
    }

    private final boolean jj_3R_121() {
        if (jj_scan_token(46)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_188()) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(78);
    }

    private final boolean jj_3R_122() {
        return jj_scan_token(51) || jj_scan_token(72) || jj_3R_39() || jj_scan_token(73) || jj_3R_38();
    }

    private final boolean jj_3R_123() {
        return jj_scan_token(53) || jj_3R_39() || jj_scan_token(78);
    }

    private final boolean jj_3R_124() {
        Token token2;
        if (jj_scan_token(56) || jj_3R_38()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_189());
        this.jj_scanpos = token2;
        if (!jj_3R_190()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_125() {
        return jj_scan_token(37);
    }

    private final boolean jj_3R_126() {
        return jj_scan_token(69);
    }

    private final boolean jj_3R_127() {
        return jj_3R_42() || jj_scan_token(69);
    }

    private final boolean jj_3R_128() {
        return jj_scan_token(34) || jj_scan_token(104) || jj_scan_token(78);
    }

    private final boolean jj_3R_129() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_138()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_139()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_140()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_141()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_142()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_143()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_144();
    }

    private final boolean jj_3R_130() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_18()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_145();
    }

    private final boolean jj_3R_131() {
        return jj_scan_token(76) || jj_3R_39() || jj_scan_token(77);
    }

    private final boolean jj_3R_132() {
        if (jj_scan_token(80) || jj_scan_token(69)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_146()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_133() {
        return jj_scan_token(74) || jj_3R_39() || jj_scan_token(75);
    }

    private final boolean jj_3R_134() {
        Token token2;
        if (jj_3R_39()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_147());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_135() {
        Token token2;
        if (jj_3R_148()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_159());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_136() {
        return jj_scan_token(69);
    }

    private final boolean jj_3R_137() {
        return jj_scan_token(30) || jj_scan_token(72) || jj_3R_32() || jj_scan_token(69) || jj_scan_token(89) || jj_3R_39() || jj_scan_token(73) || jj_3R_45();
    }

    private final boolean jj_3R_138() {
        return jj_scan_token(60);
    }

    private final boolean jj_3R_139() {
        return jj_scan_token(64);
    }

    private final boolean jj_3R_140() {
        return jj_scan_token(66);
    }

    private final boolean jj_3R_141() {
        return jj_scan_token(67);
    }

    private final boolean jj_3R_142() {
        return jj_3R_149();
    }

    private final boolean jj_3R_143() {
        return jj_scan_token(41);
    }

    private final boolean jj_3R_144() {
        return jj_scan_token(57);
    }

    private final boolean jj_3R_145() {
        if (jj_scan_token(40) || jj_3R_29()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_151()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_152();
    }

    private final boolean jj_3R_146() {
        return jj_3R_69();
    }

    private final boolean jj_3R_147() {
        return jj_scan_token(79) || jj_3R_39();
    }

    private final boolean jj_3R_148() {
        Token token2;
        if (jj_3R_153()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_162());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_149() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_154()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_155();
    }

    private final boolean jj_3R_150() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_21()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_157();
    }

    private final boolean jj_3R_151() {
        return jj_3R_150();
    }

    private final boolean jj_3R_152() {
        if (jj_3R_69()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3_17()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_153() {
        Token token2;
        if (jj_3R_158()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_165());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_154() {
        return jj_scan_token(55);
    }

    private final boolean jj_3R_155() {
        return jj_scan_token(26);
    }

    private final boolean jj_3R_156() {
        return jj_scan_token(88) || jj_3R_39() || jj_scan_token(89) || jj_3R_108();
    }

    private final boolean jj_3R_157() {
        Token token2;
        if (jj_3R_160()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_160());
        this.jj_scanpos = token2;
        return jj_3R_97();
    }

    private final boolean jj_3R_158() {
        Token token2;
        if (jj_3R_161()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_167());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_159() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(96)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(97)) {
                return true;
            }
        }
        return jj_3R_148();
    }

    private final boolean jj_3R_160() {
        return jj_scan_token(76) || jj_scan_token(77);
    }

    private final boolean jj_3R_161() {
        Token token2;
        if (jj_3R_164()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_169());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_162() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(98)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(99)) {
                return true;
            }
        }
        return jj_3R_153();
    }

    private final boolean jj_3R_163() {
        Token token2;
        if (jj_3R_31()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_4());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_164() {
        Token token2;
        if (jj_3R_166()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_171());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_165() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(108)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(109)) {
                return true;
            }
        }
        return jj_3R_158();
    }

    private final boolean jj_3R_166() {
        if (jj_3R_168()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_179()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_167() {
        return jj_scan_token(110) || jj_3R_161();
    }

    private final boolean jj_3R_168() {
        Token token2;
        if (jj_3R_170()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_182());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_169() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(106)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(107)) {
                return true;
            }
        }
        return jj_3R_164();
    }

    private final boolean jj_3R_170() {
        Token token2;
        if (jj_3R_178()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_192());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_171() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(90)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(95)) {
                return true;
            }
        }
        return jj_3R_166();
    }

    private final boolean jj_3R_172() {
        return jj_scan_token(25) || jj_3R_29();
    }

    private final boolean jj_3R_173() {
        return jj_scan_token(33) || jj_3R_76();
    }

    private final boolean jj_3R_174() {
        return jj_scan_token(54) || jj_3R_76();
    }

    private final boolean jj_3R_175() {
        return jj_3R_38();
    }

    private final boolean jj_3R_176() {
        if (jj_scan_token(69)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_3R_180()) {
            return false;
        }
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_177() {
        return jj_scan_token(79) || jj_3R_176();
    }

    private final boolean jj_3R_178() {
        Token token2;
        if (jj_3R_181()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_200());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_179() {
        return jj_scan_token(35) || jj_3R_32();
    }

    private final boolean jj_3R_180() {
        return jj_scan_token(81) || jj_3R_31();
    }

    private final boolean jj_3R_181() {
        Token token2;
        if (jj_3R_191()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_209());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_182() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(84)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(85)) {
                this.jj_scanpos = token2;
                if (jj_scan_token(82)) {
                    this.jj_scanpos = token2;
                    if (jj_scan_token(83)) {
                        this.jj_scanpos = token2;
                        if (jj_scan_token(91)) {
                            this.jj_scanpos = token2;
                            if (jj_scan_token(92)) {
                                this.jj_scanpos = token2;
                                if (jj_scan_token(93)) {
                                    this.jj_scanpos = token2;
                                    if (jj_scan_token(94)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return jj_3R_170();
    }

    private final boolean jj_3R_183() {
        Token token2;
        if (jj_3R_193()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_29());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_184() {
        return jj_scan_token(23) || jj_3R_45();
    }

    private final boolean jj_3R_185() {
        return jj_3R_194();
    }

    private final boolean jj_3R_186() {
        return jj_3R_39();
    }

    private final boolean jj_3R_187() {
        return jj_3R_195();
    }

    private final boolean jj_3R_188() {
        return jj_3R_39();
    }

    private final boolean jj_3R_189() {
        return jj_scan_token(16) || jj_scan_token(72) || jj_3R_109() || jj_scan_token(73) || jj_3R_38();
    }

    private final boolean jj_3R_190() {
        return jj_scan_token(28) || jj_3R_38();
    }

    private final boolean jj_3R_191() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_196()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_197()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_198()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_199();
    }

    private final boolean jj_3R_192() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(112)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(113)) {
                this.jj_scanpos = token2;
                if (jj_scan_token(114)) {
                    this.jj_scanpos = token2;
                    if (jj_scan_token(115)) {
                        this.jj_scanpos = token2;
                        if (jj_scan_token(116)) {
                            this.jj_scanpos = token2;
                            if (jj_scan_token(117)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return jj_3R_178();
    }

    private final boolean jj_3R_193() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_201()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_202();
    }

    private final boolean jj_3R_194() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_203()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_204();
    }

    private final boolean jj_3R_195() {
        return jj_3R_205();
    }

    private final boolean jj_3R_196() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(102)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(103)) {
                return true;
            }
        }
        return jj_3R_191();
    }

    private final boolean jj_3R_197() {
        return jj_3R_206();
    }

    private final boolean jj_3R_198() {
        return jj_3R_207();
    }

    private final boolean jj_3R_199() {
        return jj_3R_208();
    }

    private final boolean jj_3R_200() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(102)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(103)) {
                return true;
            }
        }
        return jj_3R_181();
    }

    private final boolean jj_3R_201() {
        return jj_scan_token(15) || jj_3R_39() || jj_scan_token(89);
    }

    private final boolean jj_3R_202() {
        return jj_scan_token(20) || jj_scan_token(89);
    }

    private final boolean jj_3R_203() {
        return jj_3R_93();
    }

    private final boolean jj_3R_204() {
        return jj_3R_205();
    }

    private final boolean jj_3R_205() {
        Token token2;
        if (jj_3R_112()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_210());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_206() {
        return jj_scan_token(100) || jj_3R_33();
    }

    private final boolean jj_3R_207() {
        return jj_scan_token(101) || jj_3R_33();
    }

    private final boolean jj_3R_208() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_211()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_212()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_213();
    }

    private final boolean jj_3R_209() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(104)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(105)) {
                this.jj_scanpos = token2;
                if (jj_scan_token(111)) {
                    return true;
                }
            }
        }
        return jj_3R_191();
    }

    private final boolean jj_3R_210() {
        return jj_scan_token(79) || jj_3R_112();
    }

    private final boolean jj_3R_211() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(87)) {
            this.jj_scanpos = token2;
            if (jj_scan_token(86)) {
                return true;
            }
        }
        return jj_3R_191();
    }

    private final boolean jj_3R_212() {
        return jj_3R_214();
    }

    private final boolean jj_3R_213() {
        return jj_3R_215();
    }

    private final boolean jj_3R_214() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_216()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_217();
    }

    private final boolean jj_3R_215() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_218()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_219();
    }

    private final boolean jj_3R_216() {
        return jj_scan_token(72) || jj_3R_32() || jj_scan_token(73) || jj_3R_191();
    }

    private final boolean jj_3R_217() {
        return jj_scan_token(72) || jj_3R_32() || jj_scan_token(73) || jj_3R_208();
    }

    private final boolean jj_3R_218() {
        if (jj_3R_33()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_scan_token(100)) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_scan_token(101);
    }

    private final boolean jj_3R_219() {
        return jj_3R_33();
    }

    private final boolean jj_3R_28() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_46()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_47()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_48()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_49()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3_28()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_50()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_51()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_52();
    }

    private final boolean jj_3R_29() {
        Token token2;
        if (jj_scan_token(69)) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_7());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_30() {
        return jj_scan_token(80) || jj_scan_token(104);
    }

    private final boolean jj_3R_31() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_53()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_54();
    }

    private final boolean jj_3R_32() {
        Token token2;
        Token token3 = this.jj_scanpos;
        if (jj_3R_55()) {
            this.jj_scanpos = token3;
            if (jj_3R_56()) {
                return true;
            }
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_6());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_33() {
        Token token2;
        if (jj_3R_57()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_58());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_34() {
        Token token2 = this.jj_scanpos;
        if (!jj_scan_token(81)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(120)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(121)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(127)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(118)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(119)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(122)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(126)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(124)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(128)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(129)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(130)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(131)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(132)) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_scan_token(133);
    }

    private final boolean jj_3R_35() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_10()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_59()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_60();
    }

    private final boolean jj_3R_36() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_61()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_62()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_63()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_64()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_65()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_66()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_67()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_68();
    }

    private final boolean jj_3R_37() {
        return jj_3R_29() || jj_3R_69();
    }

    private final boolean jj_3R_38() {
        Token token2;
        if (jj_scan_token(74)) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_23());
        this.jj_scanpos = token2;
        return jj_scan_token(75);
    }

    private final boolean jj_3R_39() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_70()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_71();
    }

    private final boolean jj_3R_40() {
        return jj_scan_token(69) || jj_scan_token(89) || jj_3R_45();
    }

    private final boolean jj_3R_41() {
        Token token2;
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_72());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_42() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_73()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_74();
    }

    private final boolean jj_3R_43() {
        if (jj_scan_token(72)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_75()) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(73);
    }

    private final boolean jj_3R_44() {
        return jj_scan_token(54) || jj_3R_76();
    }

    private final boolean jj_3R_45() {
        Token token2 = this.jj_scanpos;
        if (jj_3_22()) {
            this.jj_scanpos = token2;
            if (jj_3R_77()) {
                this.jj_scanpos = token2;
                if (jj_scan_token(78)) {
                    this.jj_scanpos = token2;
                    if (jj_3R_78()) {
                        this.jj_scanpos = token2;
                        if (jj_3R_79()) {
                            this.jj_scanpos = token2;
                            if (jj_3R_80()) {
                                this.jj_scanpos = token2;
                                if (jj_3R_81()) {
                                    this.jj_scanpos = token2;
                                    if (jj_3R_82()) {
                                        this.jj_scanpos = token2;
                                        this.lookingAhead = true;
                                        boolean isRegularForStatement = isRegularForStatement();
                                        this.jj_semLA = isRegularForStatement;
                                        this.lookingAhead = false;
                                        if (!isRegularForStatement || jj_3R_83()) {
                                            this.jj_scanpos = token2;
                                            if (jj_3R_84()) {
                                                this.jj_scanpos = token2;
                                                if (jj_3R_85()) {
                                                    this.jj_scanpos = token2;
                                                    if (jj_3R_86()) {
                                                        this.jj_scanpos = token2;
                                                        if (jj_3R_87()) {
                                                            this.jj_scanpos = token2;
                                                            if (jj_3R_88()) {
                                                                this.jj_scanpos = token2;
                                                                if (jj_3R_89()) {
                                                                    this.jj_scanpos = token2;
                                                                    if (jj_3R_90()) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean jj_3R_46() {
        return jj_3R_91();
    }

    private final boolean jj_3R_47() {
        return jj_3R_92();
    }

    private final boolean jj_3R_48() {
        return jj_3R_92();
    }

    private final boolean jj_3R_49() {
        return jj_3R_93() || jj_scan_token(78);
    }

    private final boolean jj_3R_50() {
        return jj_3R_94();
    }

    private final boolean jj_3R_51() {
        return jj_3R_95();
    }

    private final boolean jj_3R_52() {
        return jj_3R_96();
    }

    private final boolean jj_3R_53() {
        return jj_3R_97();
    }

    private final boolean jj_3R_54() {
        return jj_3R_39();
    }

    private final boolean jj_3R_55() {
        return jj_3R_36();
    }

    private final boolean jj_3R_56() {
        return jj_3R_29();
    }

    private final boolean jj_3R_57() {
        Token token2 = this.jj_scanpos;
        if (!jj_3R_98()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_99()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_100()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_101()) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_3R_102()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_103();
    }

    private final boolean jj_3R_58() {
        return jj_3R_104();
    }

    private final boolean jj_3R_59() {
        return jj_scan_token(72) || jj_3R_29() || jj_scan_token(76) || jj_scan_token(77);
    }

    private final boolean jj_3R_60() {
        if (jj_scan_token(72) || jj_3R_29() || jj_scan_token(73)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_scan_token(87)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(86)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(72)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(69)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(40)) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_105();
    }

    private final boolean jj_3R_61() {
        return jj_scan_token(11);
    }

    private final boolean jj_3R_62() {
        return jj_scan_token(17);
    }

    private final boolean jj_3R_63() {
        return jj_scan_token(14);
    }

    private final boolean jj_3R_64() {
        return jj_scan_token(47);
    }

    private final boolean jj_3R_65() {
        return jj_scan_token(36);
    }

    private final boolean jj_3R_66() {
        return jj_scan_token(38);
    }

    private final boolean jj_3R_67() {
        return jj_scan_token(29);
    }

    private final boolean jj_3R_68() {
        return jj_scan_token(22);
    }

    private final boolean jj_3R_69() {
        if (jj_scan_token(72)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_106()) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(73);
    }

    private final boolean jj_3R_70() {
        return jj_3R_107();
    }

    private final boolean jj_3R_71() {
        return jj_3R_108();
    }

    private final boolean jj_3R_72() {
        Token token2 = this.jj_scanpos;
        if (!jj_scan_token(43)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(44)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(45)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(51)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(27)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(39)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(52)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(58)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(10)) {
            return false;
        }
        this.jj_scanpos = token2;
        if (!jj_scan_token(48)) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_scan_token(49);
    }

    private final boolean jj_3R_73() {
        return jj_scan_token(57);
    }

    private final boolean jj_3R_74() {
        return jj_3R_32();
    }

    private final boolean jj_3R_75() {
        Token token2;
        if (jj_3R_109()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_110());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_76() {
        Token token2;
        if (jj_3R_29()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_111());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_77() {
        return jj_3R_38();
    }

    private final boolean jj_3R_78() {
        return jj_3R_112() || jj_scan_token(78);
    }

    private final boolean jj_3R_79() {
        return jj_3R_113();
    }

    private final boolean jj_3R_80() {
        return jj_3R_114();
    }

    private final boolean jj_3R_81() {
        return jj_3R_115();
    }

    private final boolean jj_3R_82() {
        return jj_3R_116();
    }

    private final boolean jj_3R_83() {
        return jj_3R_117();
    }

    private final boolean jj_3R_84() {
        return jj_3R_118();
    }

    private final boolean jj_3R_85() {
        return jj_3R_119();
    }

    private final boolean jj_3R_86() {
        return jj_3R_120();
    }

    private final boolean jj_3R_87() {
        return jj_3R_121();
    }

    private final boolean jj_3R_88() {
        return jj_3R_122();
    }

    private final boolean jj_3R_89() {
        return jj_3R_123();
    }

    private final boolean jj_3R_90() {
        return jj_3R_124();
    }

    private final boolean jj_3R_91() {
        if (jj_3R_41()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(13)) {
            this.jj_scanpos = token2;
            if (jj_3R_125()) {
                return true;
            }
        }
        if (jj_scan_token(69)) {
            return true;
        }
        Token token3 = this.jj_scanpos;
        if (jj_3R_172()) {
            this.jj_scanpos = token3;
        }
        Token token4 = this.jj_scanpos;
        if (jj_3R_173()) {
            this.jj_scanpos = token4;
        }
        return jj_3R_38();
    }

    private final boolean jj_3R_92() {
        if (jj_3R_41()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_126()) {
            this.jj_scanpos = token2;
            if (jj_3R_127()) {
                return true;
            }
        }
        if (jj_3R_43()) {
            return true;
        }
        Token token3 = this.jj_scanpos;
        if (jj_3R_174()) {
            this.jj_scanpos = token3;
        }
        Token token4 = this.jj_scanpos;
        if (!jj_3R_175()) {
            return false;
        }
        this.jj_scanpos = token4;
        return jj_scan_token(78);
    }

    private final boolean jj_3R_93() {
        Token token2;
        if (jj_3R_41() || jj_3R_32() || jj_3R_176()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3R_177());
        this.jj_scanpos = token2;
        return false;
    }

    private final boolean jj_3R_94() {
        Token token2 = this.jj_scanpos;
        if (!jj_3_3()) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_3R_128();
    }

    private final boolean jj_3R_95() {
        return jj_scan_token(42) || jj_3R_29();
    }

    private final boolean jj_3R_96() {
        return jj_scan_token(68);
    }

    private final boolean jj_3R_97() {
        if (jj_scan_token(74)) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_163()) {
            this.jj_scanpos = token2;
        }
        Token token3 = this.jj_scanpos;
        if (jj_scan_token(79)) {
            this.jj_scanpos = token3;
        }
        return jj_scan_token(75);
    }

    private final boolean jj_3R_98() {
        return jj_3R_129();
    }

    private final boolean jj_3R_99() {
        return jj_scan_token(72) || jj_3R_39() || jj_scan_token(73);
    }

    private final boolean jj_3_1() {
        return jj_3R_28();
    }

    private final boolean jj_3_10() {
        return jj_scan_token(72) || jj_3R_36();
    }

    private final boolean jj_3_11() {
        return jj_scan_token(72) || jj_3R_29() || jj_scan_token(76);
    }

    private final boolean jj_3_12() {
        if (jj_3R_33()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_scan_token(100)) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_scan_token(101);
    }

    private final boolean jj_3_13() {
        return jj_scan_token(72) || jj_3R_36();
    }

    private final boolean jj_3_14() {
        return jj_3R_37();
    }

    private final boolean jj_3_15() {
        return jj_3R_32() || jj_scan_token(80) || jj_scan_token(13);
    }

    private final boolean jj_3_16() {
        return jj_scan_token(80) || jj_scan_token(13);
    }

    private final boolean jj_3_17() {
        return jj_3R_38();
    }

    private final boolean jj_3_18() {
        return jj_scan_token(40) || jj_3R_36() || jj_3R_150();
    }

    private final boolean jj_3_19() {
        return jj_scan_token(76) || jj_3R_39() || jj_scan_token(77);
    }

    private final boolean jj_3_2() {
        return jj_scan_token(69) || jj_scan_token(72);
    }

    private final boolean jj_3_20() {
        return jj_scan_token(76) || jj_scan_token(77);
    }

    private final boolean jj_3_21() {
        Token token2;
        Token token3;
        if (jj_3_19()) {
            return true;
        }
        do {
            token2 = this.jj_scanpos;
        } while (!jj_3_19());
        this.jj_scanpos = token2;
        do {
            token3 = this.jj_scanpos;
        } while (!jj_3_20());
        this.jj_scanpos = token3;
        return false;
    }

    private final boolean jj_3_22() {
        return jj_3R_40();
    }

    private final boolean jj_3_23() {
        return jj_3R_28();
    }

    private final boolean jj_3_24() {
        if (jj_3R_41()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (!jj_scan_token(13)) {
            return false;
        }
        this.jj_scanpos = token2;
        return jj_scan_token(37);
    }

    private final boolean jj_3_25() {
        return jj_3R_41() || jj_3R_42() || jj_scan_token(69) || jj_scan_token(72);
    }

    private final boolean jj_3_26() {
        if (jj_3R_41() || jj_scan_token(69) || jj_3R_43()) {
            return true;
        }
        Token token2 = this.jj_scanpos;
        if (jj_3R_44()) {
            this.jj_scanpos = token2;
        }
        return jj_scan_token(74);
    }

    private final boolean jj_3_27() {
        return jj_3R_41() || jj_3R_32() || jj_scan_token(69);
    }

    private final boolean jj_3_28() {
        return jj_3R_45();
    }

    private final boolean jj_3_29() {
        return jj_3R_28();
    }

    private final boolean jj_3_3() {
        Token token2 = this.jj_scanpos;
        if (jj_scan_token(48)) {
            this.jj_scanpos = token2;
        }
        if (jj_scan_token(34) || jj_3R_29()) {
            return true;
        }
        Token token3 = this.jj_scanpos;
        if (jj_3R_30()) {
            this.jj_scanpos = token3;
        }
        return jj_scan_token(78);
    }

    private final boolean jj_3_30() {
        return jj_scan_token(30) || jj_scan_token(72) || jj_scan_token(69) || jj_scan_token(89) || jj_3R_39() || jj_scan_token(73) || jj_3R_45();
    }

    private final boolean jj_3_31() {
        return jj_3R_41() || jj_3R_32() || jj_scan_token(69);
    }

    private final boolean jj_3_4() {
        return jj_scan_token(79) || jj_3R_31();
    }

    private final boolean jj_3_5() {
        return jj_3R_32() || jj_scan_token(69);
    }

    private final boolean jj_3_6() {
        return jj_scan_token(76) || jj_scan_token(77);
    }

    private final boolean jj_3_7() {
        return jj_scan_token(80) || jj_scan_token(69);
    }

    private final boolean jj_3_8() {
        return jj_3R_33() || jj_3R_34();
    }

    private final boolean jj_3_9() {
        return jj_3R_35();
    }

    private final Token jj_consume_token(int i) {
        Token token2 = this.token;
        Token token3 = token2.next;
        if (token3 == null) {
            token3 = this.token_source.getNextToken();
            token2.next = token3;
        }
        this.token = token3;
        this.jj_ntk = -1;
        Token token4 = this.token;
        if (token4.kind == i) {
            return token4;
        }
        this.token = token2;
        throw generateParseException();
    }

    private final int jj_ntk() {
        Token token2 = this.token;
        Token token3 = token2.next;
        this.jj_nt = token3;
        if (token3 == null) {
            token3 = this.token_source.getNextToken();
            token2.next = token3;
        }
        int i = token3.kind;
        this.jj_ntk = i;
        return i;
    }

    private final boolean jj_scan_token(int i) {
        Token token2 = this.jj_scanpos;
        if (token2 == this.jj_lastpos) {
            this.jj_la--;
            Token token3 = token2.next;
            if (token3 == null) {
                token3 = this.token_source.getNextToken();
                token2.next = token3;
            }
            this.jj_scanpos = token3;
            this.jj_lastpos = token3;
        } else {
            this.jj_scanpos = token2.next;
        }
        Token token4 = this.jj_scanpos;
        if (token4.kind != i) {
            return true;
        }
        if (this.jj_la != 0 || token4 != this.jj_lastpos) {
            return false;
        }
        throw this.jj_ls;
    }

    public static void main(String[] strArr) {
        boolean z;
        int i = 0;
        if (strArr[0].equals("-p")) {
            i = 1;
            z = true;
        } else {
            z = false;
        }
        while (i < strArr.length) {
            Parser parser = new Parser(new FileReader(strArr[i]));
            parser.setRetainComments(true);
            while (!parser.Line()) {
                if (z) {
                    System.out.println(parser.popNode());
                }
            }
            i++;
        }
    }

    public final void AdditiveExpression() {
        Token token2;
        MultiplicativeExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 102 || i == 103) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 102) {
                    token2 = jj_consume_token(102);
                } else if (i2 == 103) {
                    token2 = jj_consume_token(103);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                MultiplicativeExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AllocationExpression() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.AllocationExpression():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AmbiguousName() {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.AmbiguousName():void");
    }

    public final void AndExpression() {
        Token token2;
        EqualityExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 106 || i == 107) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 106) {
                    token2 = jj_consume_token(106);
                } else if (i2 == 107) {
                    token2 = jj_consume_token(107);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                EqualityExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final void ArgumentList() {
        while (true) {
            Expression();
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 79) {
                jj_consume_token(79);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Arguments() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.Arguments():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ArrayDimensions() {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ArrayDimensions():void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ArrayInitializer() {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ArrayInitializer():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Assignment() {
        /*
            r5 = this;
            bsh.BSHAssignment r0 = new bsh.BSHAssignment
            r1 = 13
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 1
            r5.PrimaryExpression()     // Catch:{ all -> 0x0025 }
            int r2 = r5.AssignmentOperator()     // Catch:{ all -> 0x0025 }
            r0.operator = r2     // Catch:{ all -> 0x0025 }
            r5.Expression()     // Catch:{ all -> 0x0025 }
            bsh.JJTParserState r2 = r5.jjtree
            r2.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x0025:
            r2 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x003f }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x003f }
            r3 = 0
            boolean r4 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x003d }
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2 instanceof bsh.ParseException     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x0037
            bsh.ParseException r2 = (bsh.ParseException) r2     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0037:
            java.lang.Error r2 = (java.lang.Error) r2     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003a:
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r2 = move-exception
            goto L_0x0041
        L_0x003f:
            r2 = move-exception
            r3 = 1
        L_0x0041:
            if (r3 == 0) goto L_0x004b
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
        L_0x004b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.Assignment():void");
    }

    public final int AssignmentOperator() {
        int i;
        int i2 = this.jj_ntk;
        if (i2 == -1) {
            i2 = jj_ntk();
        }
        int i3 = 81;
        if (i2 != 81) {
            i3 = 124;
            if (i2 != 124) {
                switch (i2) {
                    case 118:
                        i = 118;
                        break;
                    case 119:
                        i = 119;
                        break;
                    case 120:
                        i = 120;
                        break;
                    case 121:
                        i = 121;
                        break;
                    case 122:
                        i = 122;
                        break;
                    default:
                        switch (i2) {
                            case 126:
                                i = 126;
                                break;
                            case 127:
                                i = 127;
                                break;
                            case 128:
                                i = 128;
                                break;
                            case 129:
                                i = 129;
                                break;
                            case 130:
                                i = 130;
                                break;
                            case 131:
                                i = 131;
                                break;
                            case 132:
                                i = 132;
                                break;
                            case 133:
                                i = 133;
                                break;
                            default:
                                jj_consume_token(-1);
                                throw new ParseException();
                        }
                }
                jj_consume_token(i);
                return getToken(0).kind;
            }
        }
        jj_consume_token(i3);
        return getToken(0).kind;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Block() {
        /*
            r5 = this;
            bsh.BSHBlock r0 = new bsh.BSHBlock
            r1 = 25
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 74
            r2 = 1
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x002d }
        L_0x0015:
            boolean r1 = r5.jj_2_23(r2)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x001f
            r5.BlockStatement()     // Catch:{ all -> 0x002d }
            goto L_0x0015
        L_0x001f:
            r1 = 75
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x002d }
            bsh.JJTParserState r1 = r5.jjtree
            r1.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x002d:
            r1 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x0047 }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x0047 }
            r3 = 0
            boolean r4 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0045 }
            if (r4 != 0) goto L_0x0042
            boolean r4 = r1 instanceof bsh.ParseException     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x003f
            bsh.ParseException r1 = (bsh.ParseException) r1     // Catch:{ all -> 0x0045 }
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x003f:
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x0045 }
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0042:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x0045 }
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            goto L_0x0049
        L_0x0047:
            r1 = move-exception
            r3 = 1
        L_0x0049:
            if (r3 == 0) goto L_0x0053
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0053:
            goto L_0x0055
        L_0x0054:
            throw r1
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.Block():void");
    }

    public final void BlockStatement() {
        if (jj_2_24(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            ClassDeclaration();
        } else if (jj_2_25(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) || jj_2_26(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            MethodDeclaration();
        } else if (jj_2_27(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            TypedVariableDeclaration();
            jj_consume_token(78);
        } else if (jj_2_28(1)) {
            Statement();
        } else {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i != 34) {
                if (i == 42) {
                    PackageDeclaration();
                    return;
                } else if (i != 48) {
                    if (i == 68) {
                        FormalComment();
                        return;
                    } else {
                        jj_consume_token(-1);
                        throw new ParseException();
                    }
                }
            }
            ImportDeclaration();
        }
    }

    public final boolean BooleanLiteral() {
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        if (i == 26) {
            jj_consume_token(26);
            return false;
        } else if (i == 55) {
            jj_consume_token(55);
            return true;
        } else {
            jj_consume_token(-1);
            throw new ParseException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BreakStatement() {
        /*
            r5 = this;
            bsh.BSHReturnStatement r0 = new bsh.BSHReturnStatement
            r1 = 35
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 12
            r2 = 1
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x0039 }
            int r3 = r5.jj_ntk     // Catch:{ all -> 0x0039 }
            r4 = -1
            if (r3 != r4) goto L_0x001e
            int r3 = r5.jj_ntk()     // Catch:{ all -> 0x0039 }
        L_0x001e:
            r4 = 69
            if (r3 == r4) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r5.jj_consume_token(r4)     // Catch:{ all -> 0x0039 }
        L_0x0026:
            r3 = 78
            r5.jj_consume_token(r3)     // Catch:{ all -> 0x0039 }
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x0039 }
            r3.closeNodeScope(r0, r2)     // Catch:{ all -> 0x0039 }
            r3 = 0
            r5.jjtreeCloseNodeScope(r0)     // Catch:{ all -> 0x0037 }
            r0.kind = r1     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r1 = move-exception
            goto L_0x003b
        L_0x0039:
            r1 = move-exception
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x0045
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0045:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.BreakStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CastExpression() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.CastExpression():void");
    }

    public final void CastLookahead() {
        int i = 72;
        if (jj_2_10(2)) {
            jj_consume_token(72);
            PrimitiveType();
        } else if (jj_2_11(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            jj_consume_token(72);
            AmbiguousName();
            jj_consume_token(76);
            jj_consume_token(77);
        } else {
            int i2 = this.jj_ntk;
            if (i2 == -1) {
                i2 = jj_ntk();
            }
            if (i2 == 72) {
                jj_consume_token(72);
                AmbiguousName();
                jj_consume_token(73);
                int i3 = this.jj_ntk;
                if (i3 == -1) {
                    i3 = jj_ntk();
                }
                if (!(i3 == 26 || i3 == 55 || i3 == 57 || i3 == 60 || i3 == 64)) {
                    if (i3 != 69) {
                        if (i3 != 72) {
                            i = 40;
                            if (i3 != 40) {
                                if (!(i3 == 41 || i3 == 66 || i3 == 67)) {
                                    i = 86;
                                    if (i3 != 86) {
                                        i = 87;
                                        if (i3 != 87) {
                                            jj_consume_token(-1);
                                            throw new ParseException();
                                        }
                                    }
                                }
                            }
                        }
                        jj_consume_token(i);
                        return;
                    }
                    jj_consume_token(69);
                    return;
                }
                Literal();
                return;
            }
            jj_consume_token(-1);
            throw new ParseException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0080 A[SYNTHETIC, Splitter:B:36:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009a A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ClassDeclaration() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ClassDeclaration():void");
    }

    public final void ConditionalAndExpression() {
        Token token2;
        InclusiveOrExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 98 || i == 99) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 98) {
                    token2 = jj_consume_token(98);
                } else if (i2 == 99) {
                    token2 = jj_consume_token(99);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                InclusiveOrExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final void ConditionalExpression() {
        ConditionalOrExpression();
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        if (i == 88) {
            jj_consume_token(88);
            Expression();
            jj_consume_token(89);
            BSHTernaryExpression bSHTernaryExpression = new BSHTernaryExpression(14);
            this.jjtree.openNodeScope(bSHTernaryExpression);
            jjtreeOpenNodeScope(bSHTernaryExpression);
            try {
                ConditionalExpression();
                this.jjtree.closeNodeScope(bSHTernaryExpression, 3);
                jjtreeCloseNodeScope(bSHTernaryExpression);
            } catch (Throwable th) {
                if (1 != 0) {
                    this.jjtree.closeNodeScope(bSHTernaryExpression, 3);
                    jjtreeCloseNodeScope(bSHTernaryExpression);
                }
                throw th;
            }
        }
    }

    public final void ConditionalOrExpression() {
        Token token2;
        ConditionalAndExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 96 || i == 97) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 96) {
                    token2 = jj_consume_token(96);
                } else if (i2 == 97) {
                    token2 = jj_consume_token(97);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                ConditionalAndExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ContinueStatement() {
        /*
            r5 = this;
            bsh.BSHReturnStatement r0 = new bsh.BSHReturnStatement
            r1 = 35
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 19
            r2 = 1
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x0039 }
            int r3 = r5.jj_ntk     // Catch:{ all -> 0x0039 }
            r4 = -1
            if (r3 != r4) goto L_0x001e
            int r3 = r5.jj_ntk()     // Catch:{ all -> 0x0039 }
        L_0x001e:
            r4 = 69
            if (r3 == r4) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r5.jj_consume_token(r4)     // Catch:{ all -> 0x0039 }
        L_0x0026:
            r3 = 78
            r5.jj_consume_token(r3)     // Catch:{ all -> 0x0039 }
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x0039 }
            r3.closeNodeScope(r0, r2)     // Catch:{ all -> 0x0039 }
            r3 = 0
            r5.jjtreeCloseNodeScope(r0)     // Catch:{ all -> 0x0037 }
            r0.kind = r1     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r1 = move-exception
            goto L_0x003b
        L_0x0039:
            r1 = move-exception
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x0045
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0045:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ContinueStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042 A[SYNTHETIC, Splitter:B:11:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DoStatement() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.DoStatement():void");
    }

    public final void EmptyStatement() {
        jj_consume_token(78);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[SYNTHETIC, Splitter:B:21:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EnhancedForStatement() {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.EnhancedForStatement():void");
    }

    public final void EqualityExpression() {
        Token token2;
        InstanceOfExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 90 || i == 95) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 90) {
                    token2 = jj_consume_token(90);
                } else if (i2 == 95) {
                    token2 = jj_consume_token(95);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                InstanceOfExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final void ExclusiveOrExpression() {
        AndExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 110) {
                Token jj_consume_token = jj_consume_token(110);
                AndExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = jj_consume_token.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final void Expression() {
        if (jj_2_8(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            Assignment();
            return;
        }
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        switch (i) {
            case 11:
            case 14:
            case 17:
            case 22:
            case 26:
            case 29:
            case 36:
            case 38:
            case 40:
            case 41:
            case 47:
            case 55:
            case 57:
            case 60:
            case 64:
            case 66:
            case 67:
            case 69:
            case 72:
            case 86:
            case 87:
            case 100:
            case 101:
            case 102:
            case 103:
                ConditionalExpression();
                return;
            default:
                jj_consume_token(-1);
                throw new ParseException();
        }
    }

    public final void ForInit() {
        if (jj_2_31(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            TypedVariableDeclaration();
            return;
        }
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        switch (i) {
            case 11:
            case 14:
            case 17:
            case 22:
            case 26:
            case 29:
            case 36:
            case 38:
            case 40:
            case 41:
            case 47:
            case 55:
            case 57:
            case 60:
            case 64:
            case 66:
            case 67:
            case 69:
            case 72:
            case 86:
            case 87:
            case 100:
            case 101:
            case 102:
            case 103:
                StatementExpressionList();
                return;
            default:
                jj_consume_token(-1);
                throw new ParseException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ForStatement() {
        /*
        // Method dump skipped, instructions count: 492
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ForStatement():void");
    }

    public final void ForUpdate() {
        StatementExpressionList();
    }

    public final void FormalComment() {
        BSHFormalComment bSHFormalComment = new BSHFormalComment(26);
        this.jjtree.openNodeScope(bSHFormalComment);
        jjtreeOpenNodeScope(bSHFormalComment);
        boolean z = true;
        try {
            Token jj_consume_token = jj_consume_token(68);
            this.jjtree.closeNodeScope(bSHFormalComment, this.retainComments);
            z = false;
            jjtreeCloseNodeScope(bSHFormalComment);
            bSHFormalComment.text = jj_consume_token.image;
        } catch (Throwable th) {
            if (z) {
                this.jjtree.closeNodeScope(bSHFormalComment, this.retainComments);
                jjtreeCloseNodeScope(bSHFormalComment);
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC, Splitter:B:21:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[Catch:{ all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FormalParameter() {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.FormalParameter():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FormalParameters() {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.FormalParameters():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IfStatement() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.IfStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A[SYNTHETIC, Splitter:B:37:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ImportDeclaration() {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ImportDeclaration():void");
    }

    public final void InclusiveOrExpression() {
        Token token2;
        ExclusiveOrExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 108 || i == 109) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 108) {
                    token2 = jj_consume_token(108);
                } else if (i2 == 109) {
                    token2 = jj_consume_token(109);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                ExclusiveOrExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final void InstanceOfExpression() {
        RelationalExpression();
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        if (i == 35) {
            Token jj_consume_token = jj_consume_token(35);
            Type();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
            boolean z = true;
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z = false;
                jjtreeCloseNodeScope(bSHBinaryExpression);
                bSHBinaryExpression.kind = jj_consume_token.kind;
            } catch (Throwable th) {
                if (z) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                throw th;
            }
        }
    }

    public final void LabeledStatement() {
        jj_consume_token(69);
        jj_consume_token(89);
        Statement();
    }

    public final boolean Line() {
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        if (i == 0) {
            jj_consume_token(0);
            Interpreter.debug("End of File!");
            return true;
        } else if (jj_2_1(1)) {
            BlockStatement();
            return false;
        } else {
            jj_consume_token(-1);
            throw new ParseException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x019d A[SYNTHETIC, Splitter:B:68:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3 A[Catch:{ all -> 0x01be }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ad A[Catch:{ all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b7 A[Catch:{ all -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Literal() {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.Literal():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MethodDeclaration() {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.MethodDeclaration():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MethodInvocation() {
        /*
            r5 = this;
            bsh.BSHMethodInvocation r0 = new bsh.BSHMethodInvocation
            r1 = 19
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 1
            r5.AmbiguousName()     // Catch:{ all -> 0x001f }
            r5.Arguments()     // Catch:{ all -> 0x001f }
            bsh.JJTParserState r2 = r5.jjtree
            r2.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x001f:
            r2 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x0039 }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x0039 }
            r3 = 0
            boolean r4 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0037 }
            if (r4 != 0) goto L_0x0034
            boolean r4 = r2 instanceof bsh.ParseException     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x0031
            bsh.ParseException r2 = (bsh.ParseException) r2     // Catch:{ all -> 0x0037 }
            throw r2     // Catch:{ all -> 0x0037 }
        L_0x0031:
            java.lang.Error r2 = (java.lang.Error) r2     // Catch:{ all -> 0x0037 }
            throw r2     // Catch:{ all -> 0x0037 }
        L_0x0034:
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2     // Catch:{ all -> 0x0037 }
            throw r2     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            goto L_0x003b
        L_0x0039:
            r2 = move-exception
            r3 = 1
        L_0x003b:
            if (r3 == 0) goto L_0x0045
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0045:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.MethodInvocation():void");
    }

    public final Modifiers Modifiers(int i, boolean z) {
        int i2;
        Modifiers modifiers = null;
        while (true) {
            int i3 = this.jj_ntk;
            if (i3 == -1) {
                i3 = jj_ntk();
            }
            if (!(i3 == 10 || i3 == 27 || i3 == 39 || i3 == 58 || i3 == 48 || i3 == 49 || i3 == 51 || i3 == 52)) {
                switch (i3) {
                    case 43:
                    case 44:
                    case 45:
                        break;
                    default:
                        return modifiers;
                }
            }
            int i4 = this.jj_ntk;
            if (i4 == -1) {
                i4 = jj_ntk();
            }
            if (i4 == 10) {
                jj_consume_token(10);
            } else if (i4 == 27) {
                jj_consume_token(27);
            } else if (i4 == 39) {
                jj_consume_token(39);
            } else if (i4 == 58) {
                jj_consume_token(58);
            } else if (i4 == 48) {
                jj_consume_token(48);
            } else if (i4 == 49) {
                jj_consume_token(49);
            } else if (i4 == 51) {
                jj_consume_token(51);
            } else if (i4 != 52) {
                switch (i4) {
                    case 43:
                        i2 = 43;
                        break;
                    case 44:
                        i2 = 44;
                        break;
                    case 45:
                        i2 = 45;
                        break;
                    default:
                        jj_consume_token(-1);
                        throw new ParseException();
                }
                jj_consume_token(i2);
            } else {
                jj_consume_token(52);
            }
            if (!z) {
                if (modifiers == null) {
                    try {
                        modifiers = new Modifiers();
                    } catch (IllegalStateException e) {
                        throw createParseException(e.getMessage());
                    }
                }
                modifiers.addModifier(i, getToken(0).image);
            }
        }
    }

    public final void MultiplicativeExpression() {
        Token token2;
        UnaryExpression();
        while (true) {
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            if (i == 104 || i == 105 || i == 111) {
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 104) {
                    token2 = jj_consume_token(104);
                } else if (i2 == 105) {
                    token2 = jj_consume_token(105);
                } else if (i2 == 111) {
                    token2 = jj_consume_token(111);
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
                UnaryExpression();
                BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                boolean z = true;
                this.jjtree.openNodeScope(bSHBinaryExpression);
                jjtreeOpenNodeScope(bSHBinaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    z = false;
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                    bSHBinaryExpression.kind = token2.kind;
                } catch (Throwable th) {
                    if (z) {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    public final int NameList() {
        AmbiguousName();
        int i = 1;
        while (true) {
            int i2 = this.jj_ntk;
            if (i2 == -1) {
                i2 = jj_ntk();
            }
            if (i2 != 79) {
                return i;
            }
            jj_consume_token(79);
            AmbiguousName();
            i++;
        }
    }

    public final void NullLiteral() {
        jj_consume_token(41);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void PackageDeclaration() {
        /*
            r5 = this;
            bsh.BSHPackageDeclaration r0 = new bsh.BSHPackageDeclaration
            r1 = 3
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 42
            r2 = 1
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x0020 }
            r5.AmbiguousName()     // Catch:{ all -> 0x0020 }
            bsh.JJTParserState r1 = r5.jjtree
            r1.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x0020:
            r1 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x003a }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x003a }
            r3 = 0
            boolean r4 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0038 }
            if (r4 != 0) goto L_0x0035
            boolean r4 = r1 instanceof bsh.ParseException     // Catch:{ all -> 0x0038 }
            if (r4 == 0) goto L_0x0032
            bsh.ParseException r1 = (bsh.ParseException) r1     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0032:
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0035:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x0038 }
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            goto L_0x003c
        L_0x003a:
            r1 = move-exception
            r3 = 1
        L_0x003c:
            if (r3 == 0) goto L_0x0046
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0046:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.PackageDeclaration():void");
    }

    public final void PostfixExpression() {
        boolean z;
        Throwable th;
        if (jj_2_12(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            PrimaryExpression();
            int i = this.jj_ntk;
            if (i == -1) {
                i = jj_ntk();
            }
            int i2 = 100;
            if (i != 100) {
                i2 = 101;
                if (i != 101) {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
            }
            Token jj_consume_token = jj_consume_token(i2);
            BSHUnaryExpression bSHUnaryExpression = new BSHUnaryExpression(16);
            this.jjtree.openNodeScope(bSHUnaryExpression);
            jjtreeOpenNodeScope(bSHUnaryExpression);
            try {
                this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                z = false;
                try {
                    jjtreeCloseNodeScope(bSHUnaryExpression);
                    bSHUnaryExpression.kind = jj_consume_token.kind;
                    bSHUnaryExpression.postfix = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z = true;
                if (z) {
                    this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                    jjtreeCloseNodeScope(bSHUnaryExpression);
                }
                throw th;
            }
        } else {
            int i3 = this.jj_ntk;
            if (i3 == -1) {
                i3 = jj_ntk();
            }
            switch (i3) {
                case 11:
                case 14:
                case 17:
                case 22:
                case 26:
                case 29:
                case 36:
                case 38:
                case 40:
                case 41:
                case 47:
                case 55:
                case 57:
                case 60:
                case 64:
                case 66:
                case 67:
                case 69:
                case 72:
                    PrimaryExpression();
                    return;
                default:
                    jj_consume_token(-1);
                    throw new ParseException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void PreDecrementExpression() {
        /*
            r4 = this;
            r0 = 101(0x65, float:1.42E-43)
            bsh.Token r0 = r4.jj_consume_token(r0)
            r4.PrimaryExpression()
            bsh.BSHUnaryExpression r1 = new bsh.BSHUnaryExpression
            r2 = 16
            r1.<init>(r2)
            bsh.JJTParserState r2 = r4.jjtree
            r2.openNodeScope(r1)
            r4.jjtreeOpenNodeScope(r1)
            r2 = 1
            bsh.JJTParserState r3 = r4.jjtree     // Catch:{ all -> 0x0029 }
            r3.closeNodeScope(r1, r2)     // Catch:{ all -> 0x0029 }
            r3 = 0
            r4.jjtreeCloseNodeScope(r1)     // Catch:{ all -> 0x0027 }
            int r0 = r0.kind     // Catch:{ all -> 0x0027 }
            r1.kind = r0     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r0 = move-exception
            goto L_0x002b
        L_0x0029:
            r0 = move-exception
            r3 = 1
        L_0x002b:
            if (r3 == 0) goto L_0x0035
            bsh.JJTParserState r3 = r4.jjtree
            r3.closeNodeScope(r1, r2)
            r4.jjtreeCloseNodeScope(r1)
        L_0x0035:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.PreDecrementExpression():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void PreIncrementExpression() {
        /*
            r4 = this;
            r0 = 100
            bsh.Token r0 = r4.jj_consume_token(r0)
            r4.PrimaryExpression()
            bsh.BSHUnaryExpression r1 = new bsh.BSHUnaryExpression
            r2 = 16
            r1.<init>(r2)
            bsh.JJTParserState r2 = r4.jjtree
            r2.openNodeScope(r1)
            r4.jjtreeOpenNodeScope(r1)
            r2 = 1
            bsh.JJTParserState r3 = r4.jjtree     // Catch:{ all -> 0x0029 }
            r3.closeNodeScope(r1, r2)     // Catch:{ all -> 0x0029 }
            r3 = 0
            r4.jjtreeCloseNodeScope(r1)     // Catch:{ all -> 0x0027 }
            int r0 = r0.kind     // Catch:{ all -> 0x0027 }
            r1.kind = r0     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r0 = move-exception
            goto L_0x002b
        L_0x0029:
            r0 = move-exception
            r3 = 1
        L_0x002b:
            if (r3 == 0) goto L_0x0035
            bsh.JJTParserState r3 = r4.jjtree
            r3.closeNodeScope(r1, r2)
            r4.jjtreeCloseNodeScope(r1)
        L_0x0035:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.PreIncrementExpression():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void PrimaryExpression() {
        /*
            r5 = this;
            bsh.BSHPrimaryExpression r0 = new bsh.BSHPrimaryExpression
            r1 = 18
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 1
            r5.PrimaryPrefix()     // Catch:{ all -> 0x0035 }
        L_0x0013:
            int r2 = r5.jj_ntk     // Catch:{ all -> 0x0035 }
            r3 = -1
            if (r2 != r3) goto L_0x001c
            int r2 = r5.jj_ntk()     // Catch:{ all -> 0x0035 }
        L_0x001c:
            r3 = 74
            if (r2 == r3) goto L_0x0031
            r3 = 76
            if (r2 == r3) goto L_0x0031
            r3 = 80
            if (r2 == r3) goto L_0x0031
            bsh.JJTParserState r2 = r5.jjtree
            r2.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x0031:
            r5.PrimarySuffix()
            goto L_0x0013
        L_0x0035:
            r2 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x004f }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x004f }
            r3 = 0
            boolean r4 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x004d }
            if (r4 != 0) goto L_0x004a
            boolean r4 = r2 instanceof bsh.ParseException     // Catch:{ all -> 0x004d }
            if (r4 == 0) goto L_0x0047
            bsh.ParseException r2 = (bsh.ParseException) r2     // Catch:{ all -> 0x004d }
            throw r2     // Catch:{ all -> 0x004d }
        L_0x0047:
            java.lang.Error r2 = (java.lang.Error) r2     // Catch:{ all -> 0x004d }
            throw r2     // Catch:{ all -> 0x004d }
        L_0x004a:
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2     // Catch:{ all -> 0x004d }
            throw r2     // Catch:{ all -> 0x004d }
        L_0x004d:
            r2 = move-exception
            goto L_0x0051
        L_0x004f:
            r2 = move-exception
            r3 = 1
        L_0x0051:
            if (r3 == 0) goto L_0x005b
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
        L_0x005b:
            goto L_0x005d
        L_0x005c:
            throw r2
        L_0x005d:
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.PrimaryExpression():void");
    }

    public final void PrimaryPrefix() {
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        if (!(i == 26 || i == 55 || i == 57 || i == 60 || i == 64)) {
            if (i == 72) {
                jj_consume_token(72);
                Expression();
                jj_consume_token(73);
                return;
            } else if (i == 40) {
                AllocationExpression();
                return;
            } else if (!(i == 41 || i == 66 || i == 67)) {
                if (jj_2_14(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                    MethodInvocation();
                    return;
                } else if (jj_2_15(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
                    Type();
                    return;
                } else {
                    int i2 = this.jj_ntk;
                    if (i2 == -1) {
                        i2 = jj_ntk();
                    }
                    if (i2 == 69) {
                        AmbiguousName();
                        return;
                    } else {
                        jj_consume_token(-1);
                        throw new ParseException();
                    }
                }
            }
        }
        Literal();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void PrimarySuffix() {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.PrimarySuffix():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void PrimitiveType() {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.PrimitiveType():void");
    }

    public void ReInit(ParserTokenManager parserTokenManager) {
        this.token_source = parserTokenManager;
        this.token = new Token();
        this.jj_ntk = -1;
        this.jjtree.reset();
    }

    public void ReInit(InputStream inputStream) {
        this.jj_input_stream.ReInit(inputStream, 1, 1);
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jjtree.reset();
    }

    public void ReInit(Reader reader) {
        this.jj_input_stream.ReInit(reader, 1, 1);
        this.token_source.ReInit(this.jj_input_stream);
        this.token = new Token();
        this.jj_ntk = -1;
        this.jjtree.reset();
    }

    public final void RelationalExpression() {
        int i;
        ShiftExpression();
        while (true) {
            int i2 = this.jj_ntk;
            if (i2 == -1) {
                i2 = jj_ntk();
            }
            switch (i2) {
                case 82:
                case 83:
                case 84:
                case 85:
                    break;
                default:
                    switch (i2) {
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                            break;
                        default:
                            return;
                    }
            }
            int i3 = this.jj_ntk;
            if (i3 == -1) {
                i3 = jj_ntk();
            }
            switch (i3) {
                case 82:
                    i = 82;
                    break;
                case 83:
                    i = 83;
                    break;
                case 84:
                    i = 84;
                    break;
                case 85:
                    i = 85;
                    break;
                default:
                    switch (i3) {
                        case 91:
                            i = 91;
                            break;
                        case 92:
                            i = 92;
                            break;
                        case 93:
                            i = 93;
                            break;
                        case 94:
                            i = 94;
                            break;
                        default:
                            jj_consume_token(-1);
                            throw new ParseException();
                    }
            }
            Token jj_consume_token = jj_consume_token(i);
            ShiftExpression();
            BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
            boolean z = true;
            this.jjtree.openNodeScope(bSHBinaryExpression);
            jjtreeOpenNodeScope(bSHBinaryExpression);
            try {
                this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                z = false;
                jjtreeCloseNodeScope(bSHBinaryExpression);
                bSHBinaryExpression.kind = jj_consume_token.kind;
            } catch (Throwable th) {
                if (z) {
                    this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                    jjtreeCloseNodeScope(bSHBinaryExpression);
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[Catch:{ all -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ReturnStatement() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ReturnStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ReturnType() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ReturnType():void");
    }

    public final void ShiftExpression() {
        int i;
        AdditiveExpression();
        while (true) {
            int i2 = this.jj_ntk;
            if (i2 == -1) {
                i2 = jj_ntk();
            }
            switch (i2) {
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                    int i3 = this.jj_ntk;
                    if (i3 == -1) {
                        i3 = jj_ntk();
                    }
                    switch (i3) {
                        case 112:
                            i = 112;
                            break;
                        case 113:
                            i = 113;
                            break;
                        case 114:
                            i = 114;
                            break;
                        case 115:
                            i = 115;
                            break;
                        case 116:
                            i = 116;
                            break;
                        case 117:
                            i = 117;
                            break;
                        default:
                            jj_consume_token(-1);
                            throw new ParseException();
                    }
                    Token jj_consume_token = jj_consume_token(i);
                    AdditiveExpression();
                    BSHBinaryExpression bSHBinaryExpression = new BSHBinaryExpression(15);
                    boolean z = true;
                    this.jjtree.openNodeScope(bSHBinaryExpression);
                    jjtreeOpenNodeScope(bSHBinaryExpression);
                    try {
                        this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                        z = false;
                        jjtreeCloseNodeScope(bSHBinaryExpression);
                        bSHBinaryExpression.kind = jj_consume_token.kind;
                    } catch (Throwable th) {
                        if (z) {
                            this.jjtree.closeNodeScope(bSHBinaryExpression, 2);
                            jjtreeCloseNodeScope(bSHBinaryExpression);
                        }
                        throw th;
                    }
                default:
                    return;
            }
        }
    }

    public final void Statement() {
        if (jj_2_22(2)) {
            LabeledStatement();
            return;
        }
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        switch (i) {
            case 11:
            case 14:
            case 17:
            case 22:
            case 26:
            case 29:
            case 36:
            case 38:
            case 40:
            case 41:
            case 47:
            case 55:
            case 57:
            case 60:
            case 64:
            case 66:
            case 67:
            case 69:
            case 72:
            case 86:
            case 87:
            case 100:
            case 101:
            case 102:
            case 103:
                StatementExpression();
                jj_consume_token(78);
                return;
            case 21:
                DoStatement();
                return;
            case 32:
                IfStatement();
                return;
            case 50:
                SwitchStatement();
                return;
            case 59:
                WhileStatement();
                return;
            case 74:
                Block();
                return;
            case 78:
                EmptyStatement();
                return;
            default:
                if (isRegularForStatement()) {
                    ForStatement();
                    return;
                }
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                if (i2 == 12) {
                    BreakStatement();
                    return;
                } else if (i2 == 19) {
                    ContinueStatement();
                    return;
                } else if (i2 == 30) {
                    EnhancedForStatement();
                    return;
                } else if (i2 == 46) {
                    ReturnStatement();
                    return;
                } else if (i2 == 51) {
                    SynchronizedStatement();
                    return;
                } else if (i2 == 53) {
                    ThrowStatement();
                    return;
                } else if (i2 == 56) {
                    TryStatement();
                    return;
                } else {
                    jj_consume_token(-1);
                    throw new ParseException();
                }
        }
    }

    public final void StatementExpression() {
        Expression();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void StatementExpressionList() {
        /*
            r5 = this;
            bsh.BSHStatementExpressionList r0 = new bsh.BSHStatementExpressionList
            r1 = 34
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 1
            r5.StatementExpression()     // Catch:{ all -> 0x0030 }
        L_0x0013:
            int r2 = r5.jj_ntk     // Catch:{ all -> 0x0030 }
            r3 = -1
            if (r2 != r3) goto L_0x001c
            int r2 = r5.jj_ntk()     // Catch:{ all -> 0x0030 }
        L_0x001c:
            r3 = 79
            if (r2 == r3) goto L_0x0029
            bsh.JJTParserState r2 = r5.jjtree
            r2.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x0029:
            r5.jj_consume_token(r3)
            r5.StatementExpression()
            goto L_0x0013
        L_0x0030:
            r2 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x004a }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x004a }
            r3 = 0
            boolean r4 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x0045
            boolean r4 = r2 instanceof bsh.ParseException     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0042
            bsh.ParseException r2 = (bsh.ParseException) r2     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0042:
            java.lang.Error r2 = (java.lang.Error) r2     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0045:
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r2 = move-exception
            goto L_0x004c
        L_0x004a:
            r2 = move-exception
            r3 = 1
        L_0x004c:
            if (r3 == 0) goto L_0x0056
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r1)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0056:
            goto L_0x0058
        L_0x0057:
            throw r2
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.StatementExpressionList():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void SwitchLabel() {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.SwitchLabel():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void SwitchStatement() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.SwitchStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC, Splitter:B:11:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e A[Catch:{ all -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void SynchronizedStatement() {
        /*
            r6 = this;
            bsh.BSHBlock r0 = new bsh.BSHBlock
            r1 = 25
            r0.<init>(r1)
            bsh.JJTParserState r1 = r6.jjtree
            r1.openNodeScope(r0)
            r6.jjtreeOpenNodeScope(r0)
            r1 = 51
            r2 = 0
            r3 = 1
            r6.jj_consume_token(r1)     // Catch:{ all -> 0x0034 }
            r1 = 72
            r6.jj_consume_token(r1)     // Catch:{ all -> 0x0034 }
            r6.Expression()     // Catch:{ all -> 0x0034 }
            r1 = 73
            r6.jj_consume_token(r1)     // Catch:{ all -> 0x0034 }
            r6.Block()     // Catch:{ all -> 0x0034 }
            bsh.JJTParserState r1 = r6.jjtree     // Catch:{ all -> 0x0034 }
            r1.closeNodeScope(r0, r3)     // Catch:{ all -> 0x0034 }
            r6.jjtreeCloseNodeScope(r0)     // Catch:{ all -> 0x0031 }
            r0.isSynchronized = r3     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r1 = move-exception
            r4 = 0
            goto L_0x0036
        L_0x0034:
            r1 = move-exception
            r4 = 1
        L_0x0036:
            if (r4 == 0) goto L_0x003e
            bsh.JJTParserState r5 = r6.jjtree     // Catch:{ all -> 0x0058 }
            r5.clearNodeScope(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0044
        L_0x003e:
            bsh.JJTParserState r2 = r6.jjtree     // Catch:{ all -> 0x0058 }
            r2.popNode()     // Catch:{ all -> 0x0058 }
            r2 = r4
        L_0x0044:
            boolean r4 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0055 }
            if (r4 != 0) goto L_0x0052
            boolean r4 = r1 instanceof bsh.ParseException     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x004f
            bsh.ParseException r1 = (bsh.ParseException) r1     // Catch:{ all -> 0x0055 }
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x004f:
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x0055 }
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0052:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x0055 }
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            r4 = r2
            goto L_0x0059
        L_0x0058:
            r1 = move-exception
        L_0x0059:
            if (r4 == 0) goto L_0x0063
            bsh.JJTParserState r2 = r6.jjtree
            r2.closeNodeScope(r0, r3)
            r6.jjtreeCloseNodeScope(r0)
        L_0x0063:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.SynchronizedStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ThrowStatement() {
        /*
            r5 = this;
            bsh.BSHThrowStatement r0 = new bsh.BSHThrowStatement
            r1 = 36
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 53
            r2 = 1
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x0026 }
            r5.Expression()     // Catch:{ all -> 0x0026 }
            r1 = 78
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x0026 }
            bsh.JJTParserState r1 = r5.jjtree
            r1.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x0026:
            r1 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x0040 }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x0040 }
            r3 = 0
            boolean r4 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x003b
            boolean r4 = r1 instanceof bsh.ParseException     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x0038
            bsh.ParseException r1 = (bsh.ParseException) r1     // Catch:{ all -> 0x003e }
            throw r1     // Catch:{ all -> 0x003e }
        L_0x0038:
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x003e }
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003b:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x003e }
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            goto L_0x0042
        L_0x0040:
            r1 = move-exception
            r3 = 1
        L_0x0042:
            if (r3 == 0) goto L_0x004c
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
        L_0x004c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.ThrowStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[SYNTHETIC, Splitter:B:28:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006d A[Catch:{ all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void TryStatement() {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.TryStatement():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Type() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.Type():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[SYNTHETIC, Splitter:B:18:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void TypedVariableDeclaration() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.TypedVariableDeclaration():void");
    }

    public final void UnaryExpression() {
        boolean z;
        Throwable th;
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        switch (i) {
            case 11:
            case 14:
            case 17:
            case 22:
            case 26:
            case 29:
            case 36:
            case 38:
            case 40:
            case 41:
            case 47:
            case 55:
            case 57:
            case 60:
            case 64:
            case 66:
            case 67:
            case 69:
            case 72:
            case 86:
            case 87:
                UnaryExpressionNotPlusMinus();
                return;
            case 100:
                PreIncrementExpression();
                return;
            case 101:
                PreDecrementExpression();
                return;
            case 102:
            case 103:
                int i2 = this.jj_ntk;
                if (i2 == -1) {
                    i2 = jj_ntk();
                }
                int i3 = 102;
                if (i2 != 102) {
                    i3 = 103;
                    if (i2 != 103) {
                        jj_consume_token(-1);
                        throw new ParseException();
                    }
                }
                Token jj_consume_token = jj_consume_token(i3);
                UnaryExpression();
                BSHUnaryExpression bSHUnaryExpression = new BSHUnaryExpression(16);
                this.jjtree.openNodeScope(bSHUnaryExpression);
                jjtreeOpenNodeScope(bSHUnaryExpression);
                try {
                    this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                    z = false;
                    try {
                        jjtreeCloseNodeScope(bSHUnaryExpression);
                        bSHUnaryExpression.kind = jj_consume_token.kind;
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    if (z) {
                        this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                        jjtreeCloseNodeScope(bSHUnaryExpression);
                    }
                    throw th;
                }
            default:
                jj_consume_token(-1);
                throw new ParseException();
        }
    }

    public final void UnaryExpressionNotPlusMinus() {
        Token token2;
        boolean z;
        Throwable th;
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        if (i == 86 || i == 87) {
            int i2 = this.jj_ntk;
            if (i2 == -1) {
                i2 = jj_ntk();
            }
            if (i2 == 86) {
                token2 = jj_consume_token(86);
            } else if (i2 == 87) {
                token2 = jj_consume_token(87);
            } else {
                jj_consume_token(-1);
                throw new ParseException();
            }
            UnaryExpression();
            BSHUnaryExpression bSHUnaryExpression = new BSHUnaryExpression(16);
            this.jjtree.openNodeScope(bSHUnaryExpression);
            jjtreeOpenNodeScope(bSHUnaryExpression);
            try {
                this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                z = false;
                try {
                    jjtreeCloseNodeScope(bSHUnaryExpression);
                    bSHUnaryExpression.kind = token2.kind;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                z = true;
                if (z) {
                    this.jjtree.closeNodeScope(bSHUnaryExpression, 1);
                    jjtreeCloseNodeScope(bSHUnaryExpression);
                }
                throw th;
            }
        } else if (jj_2_9(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            CastExpression();
        } else {
            int i3 = this.jj_ntk;
            if (i3 == -1) {
                i3 = jj_ntk();
            }
            switch (i3) {
                case 11:
                case 14:
                case 17:
                case 22:
                case 26:
                case 29:
                case 36:
                case 38:
                case 40:
                case 41:
                case 47:
                case 55:
                case 57:
                case 60:
                case 64:
                case 66:
                case 67:
                case 69:
                case 72:
                    PostfixExpression();
                    return;
                default:
                    jj_consume_token(-1);
                    throw new ParseException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[SYNTHETIC, Splitter:B:18:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[Catch:{ all -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0058 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void VariableDeclarator() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.VariableDeclarator():void");
    }

    public final void VariableInitializer() {
        int i = this.jj_ntk;
        if (i == -1) {
            i = jj_ntk();
        }
        switch (i) {
            case 11:
            case 14:
            case 17:
            case 22:
            case 26:
            case 29:
            case 36:
            case 38:
            case 40:
            case 41:
            case 47:
            case 55:
            case 57:
            case 60:
            case 64:
            case 66:
            case 67:
            case 69:
            case 72:
            case 86:
            case 87:
            case 100:
            case 101:
            case 102:
            case 103:
                Expression();
                return;
            case 74:
                ArrayInitializer();
                return;
            default:
                jj_consume_token(-1);
                throw new ParseException();
        }
    }

    public final void VoidLiteral() {
        jj_consume_token(57);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void WhileStatement() {
        /*
            r5 = this;
            bsh.BSHWhileStatement r0 = new bsh.BSHWhileStatement
            r1 = 30
            r0.<init>(r1)
            bsh.JJTParserState r1 = r5.jjtree
            r1.openNodeScope(r0)
            r5.jjtreeOpenNodeScope(r0)
            r1 = 59
            r2 = 1
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x002e }
            r1 = 72
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x002e }
            r5.Expression()     // Catch:{ all -> 0x002e }
            r1 = 73
            r5.jj_consume_token(r1)     // Catch:{ all -> 0x002e }
            r5.Statement()     // Catch:{ all -> 0x002e }
            bsh.JJTParserState r1 = r5.jjtree
            r1.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
            return
        L_0x002e:
            r1 = move-exception
            bsh.JJTParserState r3 = r5.jjtree     // Catch:{ all -> 0x0048 }
            r3.clearNodeScope(r0)     // Catch:{ all -> 0x0048 }
            r3 = 0
            boolean r4 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0046 }
            if (r4 != 0) goto L_0x0043
            boolean r4 = r1 instanceof bsh.ParseException     // Catch:{ all -> 0x0046 }
            if (r4 == 0) goto L_0x0040
            bsh.ParseException r1 = (bsh.ParseException) r1     // Catch:{ all -> 0x0046 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0040:
            java.lang.Error r1 = (java.lang.Error) r1     // Catch:{ all -> 0x0046 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0043:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1     // Catch:{ all -> 0x0046 }
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            goto L_0x004a
        L_0x0048:
            r1 = move-exception
            r3 = 1
        L_0x004a:
            if (r3 == 0) goto L_0x0054
            bsh.JJTParserState r3 = r5.jjtree
            r3.closeNodeScope(r0, r2)
            r5.jjtreeCloseNodeScope(r0)
        L_0x0054:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Parser.WhileStatement():void");
    }

    /* access modifiers changed from: package-private */
    public ParseException createParseException(String str) {
        Token token2 = this.token;
        int i = token2.beginLine;
        int i2 = token2.beginColumn;
        if (token2.kind == 0) {
            String str2 = ParserConstants.tokenImage[0];
        } else {
            String str3 = token2.image;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Parse error at line ");
        stringBuffer.append(i);
        stringBuffer.append(", column ");
        stringBuffer.append(i2);
        stringBuffer.append(" : ");
        stringBuffer.append(str);
        return new ParseException(stringBuffer.toString());
    }

    public final void disable_tracing() {
    }

    public final void enable_tracing() {
    }

    public ParseException generateParseException() {
        Token token2 = this.token.next;
        int i = token2.beginLine;
        int i2 = token2.beginColumn;
        String str = token2.kind == 0 ? ParserConstants.tokenImage[0] : token2.image;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Parse error at line ");
        stringBuffer.append(i);
        stringBuffer.append(", column ");
        stringBuffer.append(i2);
        stringBuffer.append(".  Encountered: ");
        stringBuffer.append(str);
        return new ParseException(stringBuffer.toString());
    }

    public final Token getNextToken() {
        Token token2 = this.token;
        Token token3 = token2.next;
        if (token3 == null) {
            token3 = this.token_source.getNextToken();
            token2.next = token3;
        }
        this.token = token3;
        this.jj_ntk = -1;
        return this.token;
    }

    public final Token getToken(int i) {
        Token token2 = this.lookingAhead ? this.jj_scanpos : this.token;
        for (int i2 = 0; i2 < i; i2++) {
            Token token3 = token2.next;
            if (token3 == null) {
                token3 = this.token_source.getNextToken();
                token2.next = token3;
            }
            token2 = token3;
        }
        return token2;
    }

    /* access modifiers changed from: package-private */
    public boolean isRegularForStatement() {
        if (getToken(1).kind != 30) {
            return false;
        }
        int i = 3;
        if (getToken(2).kind != 72) {
            return false;
        }
        while (true) {
            int i2 = i + 1;
            int i3 = getToken(i).kind;
            if (i3 == 0) {
                return false;
            }
            if (i3 == 78) {
                return true;
            }
            if (i3 == 89) {
                return false;
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void jjtreeCloseNodeScope(Node node) {
        ((SimpleNode) node).lastToken = getToken(0);
    }

    /* access modifiers changed from: package-private */
    public void jjtreeOpenNodeScope(Node node) {
        ((SimpleNode) node).firstToken = getToken(1);
    }

    public SimpleNode popNode() {
        if (this.jjtree.nodeArity() > 0) {
            return (SimpleNode) this.jjtree.popNode();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void reInitInput(Reader reader) {
        ReInit(reader);
    }

    /* access modifiers changed from: package-private */
    public void reInitTokenInput(Reader reader) {
        JavaCharStream javaCharStream = this.jj_input_stream;
        javaCharStream.ReInit(reader, javaCharStream.getEndLine(), this.jj_input_stream.getEndColumn());
    }

    public void setRetainComments(boolean z) {
        this.retainComments = z;
    }
}
