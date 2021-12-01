package p013b.p044b.p045a.p046a;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.b.a.a.w */
public class C0906w {
    /* renamed from: a */
    static String m2349a(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* renamed from: b */
    private static String m2350b(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    /* renamed from: c */
    private static int m2351c(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: d */
    private static int m2352d(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    private static int m2353e(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: f */
    private static List<String> m2354f(String str, String str2) {
        int indexOf = str.indexOf(47, str2.length() + 3);
        int e = m2353e(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < e) {
            int i = indexOf + 1;
            int d = m2352d(str, i, e, '/');
            arrayList.add(str.substring(i, d));
            indexOf = d;
        }
        return arrayList;
    }

    /* renamed from: g */
    private static boolean m2355g(String str) {
        return str.equals(".") || str.equalsIgnoreCase("%2e");
    }

    /* renamed from: h */
    private static boolean m2356h(String str) {
        return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
    }

    /* renamed from: i */
    public static String m2357i(URI uri, String str) {
        String str2;
        int i;
        String str3;
        int e;
        String str4;
        String scheme = uri.getScheme();
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("");
        int q = m2365q(str, 0, str.length());
        int r = m2366r(str, q, str.length());
        int p = m2364p(str, q, r);
        if (p != -1) {
            if (str.regionMatches(true, q, "https:", 0, 6)) {
                q += 6;
                str2 = "https";
            } else if (str.regionMatches(true, q, "http:", 0, 5)) {
                q += 5;
                str2 = "http";
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, p) + "'");
            }
        } else if (scheme != 0) {
            str2 = scheme;
        } else {
            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
        }
        int s = m2367s(str, q, r);
        if (s >= 2 || !scheme.equals(str2)) {
            int i2 = q + s;
            while (true) {
                e = m2353e(str, i2, r, "@/\\?#");
                char charAt = e != r ? str.charAt(e) : 65535;
                if (charAt == 65535 || charAt == '#' || charAt == '/' || charAt == '\\' || charAt == '?') {
                    int l = m2360l(str, i2, e);
                    int i3 = l + 1;
                } else if (charAt == '@') {
                    i2 = e + 1;
                }
            }
            int l2 = m2360l(str, i2, e);
            int i32 = l2 + 1;
            if (i32 < e) {
                str4 = m2350b(str, i2, l2);
                int j = m2358j(str, i32, e);
                if (j != -1) {
                    i = j;
                } else {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i32, e) + '\"');
                }
            } else {
                String b = m2350b(str, i2, l2);
                i = m2351c(str2);
                str4 = b;
            }
            if (str4 != null) {
                q = e;
                str3 = str4;
            } else {
                throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, l2) + '\"');
            }
        } else {
            str3 = uri.getHost();
            i = uri.getPort();
            if (i == -1) {
                i = m2351c(str2);
            }
            arrayList.clear();
            arrayList.addAll(m2354f(uri.toString(), scheme));
        }
        int e2 = m2353e(str, q, r, "?#");
        m2363o(arrayList, str, q, e2);
        List<String> list = null;
        if (e2 < r && str.charAt(e2) == '?') {
            list = m2362n(m2349a(str, e2 + 1, m2352d(str, e2, r, '#')));
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append("://");
        stringBuffer.append(str3);
        if ((i != 80 || !str2.equals("http")) && (i != 443 || !str2.equals("https"))) {
            stringBuffer.append(':');
            stringBuffer.append(i);
        }
        for (String str5 : arrayList) {
            stringBuffer.append('/');
            stringBuffer.append(str5);
        }
        if (list != null) {
            char c = 0;
            for (String str6 : list) {
                if (c == 0) {
                    stringBuffer.append('?');
                    stringBuffer.append(str6);
                    c = 1;
                } else if (c == 1) {
                    stringBuffer.append('=');
                    stringBuffer.append(str6);
                    c = 2;
                } else if (c == 2) {
                    stringBuffer.append('&');
                    stringBuffer.append(str6);
                    c = 1;
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: j */
    private static int m2358j(String str, int i, int i2) {
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: k */
    private static void m2359k(List<String> list) {
        if (!list.remove(list.size() - 1).isEmpty() || list.isEmpty()) {
            list.add("");
        } else {
            list.set(list.size() - 1, "");
        }
    }

    /* renamed from: l */
    private static int m2360l(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == ':') {
                return i;
            }
            if (charAt == '[') {
                do {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } while (str.charAt(i) != ']');
            }
            i++;
        }
        return i2;
    }

    /* renamed from: m */
    private static void m2361m(List<String> list, String str, int i, int i2, boolean z, boolean z2) {
        String a = m2349a(str, i, i2);
        if (!m2355g(a)) {
            if (m2356h(a)) {
                m2359k(list);
                return;
            }
            if (list.get(list.size() - 1).isEmpty()) {
                list.set(list.size() - 1, a);
            } else {
                list.add(a);
            }
            if (z) {
                list.add("");
            }
        }
    }

    /* renamed from: n */
    static List<String> m2362n(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[SYNTHETIC] */
    /* renamed from: o */
    private static void m2363o(java.util.List<java.lang.String> r10, java.lang.String r11, int r12, int r13) {
        /*
            if (r12 != r13) goto L_0x0003
            return
        L_0x0003:
            char r0 = r11.charAt(r12)
            r1 = 47
            java.lang.String r2 = ""
            r3 = 1
            if (r0 == r1) goto L_0x001c
            r1 = 92
            if (r0 != r1) goto L_0x0013
            goto L_0x001c
        L_0x0013:
            int r0 = r10.size()
            int r0 = r0 - r3
            r10.set(r0, r2)
            goto L_0x0023
        L_0x001c:
            r10.clear()
            r10.add(r2)
            goto L_0x003b
        L_0x0023:
            r6 = r12
            if (r6 >= r13) goto L_0x003e
            java.lang.String r12 = "/\\"
            int r12 = m2353e(r11, r6, r13, r12)
            if (r12 >= r13) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r9 = 1
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r0
            m2361m(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0023
        L_0x003b:
            int r12 = r12 + 1
            goto L_0x0023
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0906w.m2363o(java.util.List, java.lang.String, int, int):void");
    }

    /* renamed from: p */
    private static int m2364p(String str, int i, int i2) {
        if (i2 - i < 2) {
            return -1;
        }
        char charAt = str.charAt(i);
        if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
            while (true) {
                i++;
                if (i >= i2) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                    if (charAt2 == ':') {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: q */
    private static int m2365q(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: r */
    private static int m2366r(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: s */
    private static int m2367s(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            i3++;
            i++;
        }
        return i3;
    }
}
