package p013b.p014a.p015a.p033w.p034a;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.u */
public abstract class AbstractC0769u {

    /* renamed from: a */
    private static final AbstractC0769u[] f1530a = {new C0748f(), new C0742c(), new C0756j(), new C0740b(), new C0749f0(), new C0746e(), new C0751g0(), new C0754i(), new C0773y(), new C0739a0(), new C0770v(), new C0772x(), new C0762n(), new C0759k0(), new C0747e0(), new C0745d0(), new C0764p(), new C0768t(), new C0760l(), new C0755i0()};

    /* renamed from: b */
    private static final Pattern f1531b = Pattern.compile("\\d+");

    /* renamed from: c */
    private static final Pattern f1532c = Pattern.compile("&");

    /* renamed from: d */
    private static final Pattern f1533d = Pattern.compile("=");

    /* renamed from: a */
    private static void m1517a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f1533d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], m1528m(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    protected static String m1518b(C0716p pVar) {
        String f = pVar.mo8696f();
        return f.startsWith("﻿") ? f.substring(1) : f;
    }

    /* renamed from: c */
    protected static boolean m1519c(CharSequence charSequence, int i) {
        return charSequence != null && i > 0 && i == charSequence.length() && f1531b.matcher(charSequence).matches();
    }

    /* renamed from: d */
    protected static boolean m1520d(CharSequence charSequence, int i, int i2) {
        int i3;
        return charSequence != null && i2 > 0 && charSequence.length() >= (i3 = i2 + i) && f1531b.matcher(charSequence.subSequence(i, i3)).matches();
    }

    /* renamed from: e */
    static String[] m1521e(String str, String str2, char c, boolean z) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            ArrayList arrayList2 = arrayList;
            boolean z2 = true;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (str2.charAt(indexOf2 - 1) == '\\') {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String l = m1527l(str2.substring(length2, indexOf2));
                    if (z) {
                        l = l.trim();
                    }
                    if (!l.isEmpty()) {
                        arrayList2.add(l);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: f */
    static String m1522f(String str, String str2, char c, boolean z) {
        String[] e = m1521e(str, str2, c, z);
        if (e == null) {
            return null;
        }
        return e[0];
    }

    /* renamed from: g */
    protected static String[] m1523g(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: i */
    protected static int m1524i(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: j */
    static Map<String, String> m1525j(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : f1532c.split(str.substring(indexOf + 1))) {
            m1517a(str2, hashMap);
        }
        return hashMap;
    }

    /* renamed from: k */
    public static AbstractC0765q m1526k(C0716p pVar) {
        for (AbstractC0769u uVar : f1530a) {
            AbstractC0765q h = uVar.mo8741h(pVar);
            if (h != null) {
                return h;
            }
        }
        return new C0741b0(pVar.mo8696f(), null);
    }

    /* renamed from: l */
    protected static String m1527l(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    /* renamed from: m */
    static String m1528m(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: h */
    public abstract AbstractC0765q mo8741h(C0716p pVar);
}
