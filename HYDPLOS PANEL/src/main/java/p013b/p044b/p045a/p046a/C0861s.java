package p013b.p044b.p045a.p046a;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: b.b.a.a.s */
public class C0861s {

    /* renamed from: a */
    public static final String[] f1795a = new String[0];

    static {
        Pattern.compile("(?: |\\u00A0|\\s|[\\s&&[^ ]])\\s*");
    }

    /* renamed from: a */
    public static String[] m2068a(String str) {
        return m2070c(str, null, -1);
    }

    /* renamed from: b */
    public static String[] m2069b(String str, char c) {
        return m2074g(str, c, false);
    }

    /* renamed from: c */
    public static String[] m2070c(String str, String str2, int i) {
        return m2075h(str, str2, i, false);
    }

    /* renamed from: d */
    public static String[] m2071d(String str, String str2) {
        return m2073f(str, str2, -1, false);
    }

    /* renamed from: e */
    public static String[] m2072e(String str, String str2) {
        return m2073f(str, str2, -1, true);
    }

    /* renamed from: f */
    private static String[] m2073f(String str, String str2, int i, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return f1795a;
        }
        if (str2 == null || "".equals(str2)) {
            return m2075h(str, null, i, z);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            i2 = str.indexOf(str2, i3);
            if (i2 > -1) {
                if (i2 > i3) {
                    i4++;
                    if (i4 != i) {
                        arrayList.add(str.substring(i3, i2));
                    }
                } else if (z) {
                    i4++;
                    if (i4 == i) {
                        arrayList.add(str.substring(i3));
                        i2 = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i3 = i2 + length2;
            }
            arrayList.add(str.substring(i3));
            i2 = length;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: g */
    private static String[] m2074g(String str, char c, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return f1795a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (z2 || z) {
                    arrayList.add(str.substring(i2, i));
                    z2 = false;
                    z3 = true;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z2 = true;
                z3 = false;
            }
        }
        if (z2 || (z && z3)) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: h */
    private static String[] m2075h(String str, String str2, int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return f1795a;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i2 = 0;
            z3 = false;
            z2 = false;
            i3 = 0;
            int i6 = 1;
            while (i2 < length) {
                if (Character.isWhitespace(str.charAt(i2))) {
                    if (z3 || z) {
                        int i7 = i6 + 1;
                        if (i6 == i) {
                            i2 = length;
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        arrayList.add(str.substring(i3, i2));
                        i6 = i7;
                        z3 = false;
                    }
                    i3 = i2 + 1;
                    i2 = i3;
                } else {
                    i2++;
                    z3 = true;
                    z2 = false;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i5 = 0;
                z5 = false;
                z4 = false;
                i4 = 0;
                int i8 = 1;
                while (i5 < length) {
                    if (str.charAt(i5) == charAt) {
                        if (z5 || z) {
                            int i9 = i8 + 1;
                            if (i8 == i) {
                                i5 = length;
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            arrayList.add(str.substring(i4, i5));
                            i8 = i9;
                            z5 = false;
                        }
                        i4 = i5 + 1;
                        i5 = i4;
                    } else {
                        i5++;
                        z5 = true;
                        z4 = false;
                    }
                }
            } else {
                i5 = 0;
                z5 = false;
                z4 = false;
                i4 = 0;
                int i10 = 1;
                while (i5 < length) {
                    if (str2.indexOf(str.charAt(i5)) >= 0) {
                        if (z5 || z) {
                            int i11 = i10 + 1;
                            if (i10 == i) {
                                i5 = length;
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            arrayList.add(str.substring(i4, i5));
                            i10 = i11;
                            z5 = false;
                        }
                        i4 = i5 + 1;
                        i5 = i4;
                    } else {
                        i5++;
                        z5 = true;
                        z4 = false;
                    }
                }
            }
            i2 = i5;
            z3 = z5;
            z2 = z4;
            i3 = i4;
        }
        if (z3 || (z && z2)) {
            arrayList.add(str.substring(i3, i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
