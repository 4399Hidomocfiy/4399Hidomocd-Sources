package p013b.p014a.p015a.p035x;

import bsh.org.objectweb.asm.Constants;
import java.util.HashMap;
import java.util.Map;
import p013b.p014a.p015a.C0707h;

/* renamed from: b.a.a.x.d */
public enum EnumC0778d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, Constants.TABLESWITCH}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    

    /* renamed from: D */
    private static final Map<Integer, EnumC0778d> f1551D = new HashMap();

    /* renamed from: E */
    private static final Map<String, EnumC0778d> f1552E = new HashMap();

    /* renamed from: a */
    private final int[] f1578a;

    /* renamed from: b */
    private final String[] f1579b;

    static {
        EnumC0778d[] values = values();
        for (EnumC0778d dVar : values) {
            for (int i : dVar.f1578a) {
                f1551D.put(Integer.valueOf(i), dVar);
            }
            f1552E.put(dVar.name(), dVar);
            for (String str : dVar.f1579b) {
                f1552E.put(str, dVar);
            }
        }
    }

    private EnumC0778d(int i) {
        this(new int[]{i}, new String[0]);
    }

    private EnumC0778d(int i, String... strArr) {
        this.f1578a = new int[]{i};
        this.f1579b = strArr;
    }

    private EnumC0778d(int[] iArr, String... strArr) {
        this.f1578a = iArr;
        this.f1579b = strArr;
    }

    /* renamed from: a */
    public static EnumC0778d m1576a(String str) {
        return f1552E.get(str);
    }

    /* renamed from: b */
    public static EnumC0778d m1577b(int i) {
        if (i >= 0 && i < 900) {
            return f1551D.get(Integer.valueOf(i));
        }
        throw C0707h.m1320a();
    }

    /* renamed from: c */
    public int mo8809c() {
        return this.f1578a[0];
    }
}
