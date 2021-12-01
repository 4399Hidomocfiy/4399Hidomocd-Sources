package p013b.p014a.p015a.p033w.p034a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.f0 */
public final class C0749f0 extends AbstractC0769u {

    /* renamed from: e */
    private static final Pattern f1457e = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: f */
    private static final Pattern f1458f = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: g */
    private static final Pattern f1459g = Pattern.compile("\r\n[ \t]");

    /* renamed from: h */
    private static final Pattern f1460h = Pattern.compile("\\\\[nN]");

    /* renamed from: i */
    private static final Pattern f1461i = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: j */
    private static final Pattern f1462j = Pattern.compile("=");

    /* renamed from: k */
    private static final Pattern f1463k = Pattern.compile(";");

    /* renamed from: l */
    private static final Pattern f1464l = Pattern.compile("(?<!\\\\);+");

    /* renamed from: m */
    private static final Pattern f1465m = Pattern.compile(",");

    /* renamed from: n */
    private static final Pattern f1466n = Pattern.compile("[;,]");

    /* renamed from: n */
    private static String m1457n(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (!(charAt2 == '\n' || charAt2 == '\r')) {
                if (charAt2 != '=') {
                    m1463t(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (!(i >= length - 2 || (charAt = charSequence.charAt(i + 1)) == '\r' || charAt == '\n')) {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int i2 = AbstractC0769u.m1524i(charAt);
                    int i3 = AbstractC0769u.m1524i(charAt3);
                    if (i2 >= 0 && i3 >= 0) {
                        byteArrayOutputStream.write((i2 << 4) + i3);
                    }
                }
            }
            i++;
        }
        m1463t(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: o */
    private static void m1458o(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb = new StringBuilder(100);
                m1462s(strArr, 3, sb);
                m1462s(strArr, 1, sb);
                m1462s(strArr, 2, sb);
                m1462s(strArr, 0, sb);
                m1462s(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: p */
    private static boolean m1459p(CharSequence charSequence) {
        return charSequence == null || f1458f.matcher(charSequence).matches();
    }

    /* renamed from: q */
    static List<String> m1460q(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> r = m1461r(charSequence, str, z, z2);
        if (r == null || r.isEmpty()) {
            return null;
        }
        return r.get(0);
    }

    /* renamed from: r */
    static List<List<String>> m1461r(CharSequence charSequence, String str, boolean z, boolean z2) {
        String str2;
        boolean z3;
        ArrayList arrayList;
        int indexOf;
        int i;
        String str3;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList2 = null;
        while (i3 < length) {
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) charSequence) + "(?:;([^:]*))?:", 2).matcher(str);
            if (i3 > 0) {
                i3--;
            }
            if (!matcher.find(i3)) {
                break;
            }
            int end = matcher.end(i2);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f1463k.split(group);
                int length2 = split.length;
                int i4 = 0;
                arrayList = null;
                z3 = false;
                str2 = null;
                while (i4 < length2) {
                    String str4 = split[i4];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str4);
                    String[] split2 = f1462j.split(str4, 2);
                    if (split2.length > 1) {
                        String str5 = split2[i2];
                        String str6 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str5) && "QUOTED-PRINTABLE".equalsIgnoreCase(str6)) {
                            z3 = true;
                        } else if ("CHARSET".equalsIgnoreCase(str5)) {
                            str2 = str6;
                        }
                    }
                    i4++;
                    i2 = 0;
                }
            } else {
                arrayList = null;
                z3 = false;
                str2 = null;
            }
            int i5 = end;
            while (true) {
                indexOf = str.indexOf(10, i5);
                if (indexOf >= 0) {
                    if (indexOf < str.length() - 1) {
                        int i6 = indexOf + 1;
                        if (str.charAt(i6) == ' ' || str.charAt(i6) == '\t') {
                            i5 = indexOf + 2;
                        }
                    }
                    if (!z3 || ((indexOf < 1 || str.charAt(indexOf - 1) != '=') && (indexOf < 2 || str.charAt(indexOf - 2) != '='))) {
                        break;
                    }
                    i5 = indexOf + 1;
                } else {
                    break;
                }
            }
            if (indexOf < 0) {
                i = length;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (indexOf >= 1 && str.charAt(indexOf - 1) == '\r') {
                        indexOf--;
                    }
                    String substring = str.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    if (z3) {
                        str3 = m1457n(substring, str2);
                        if (z2) {
                            str3 = f1464l.matcher(str3).replaceAll("\n").trim();
                        }
                    } else {
                        if (z2) {
                            substring = f1464l.matcher(substring).replaceAll("\n").trim();
                        }
                        str3 = f1461i.matcher(f1460h.matcher(f1459g.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(str3);
                        arrayList2.add(arrayList3);
                    } else {
                        arrayList.add(0, str3);
                        arrayList2.add(arrayList);
                        i = indexOf + 1;
                    }
                }
                i = indexOf + 1;
            }
            i3 = i;
            i2 = 0;
        }
        return arrayList2;
    }

    /* renamed from: s */
    private static void m1462s(String[] strArr, int i, StringBuilder sb) {
        if (strArr[i] != null && !strArr[i].isEmpty()) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i]);
        }
    }

    /* renamed from: t */
    private static void m1463t(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, Charset.forName("UTF-8"));
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, Charset.forName("UTF-8"));
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: v */
    private static String m1464v(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: w */
    private static String[] m1465w(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* renamed from: x */
    private static String[] m1466x(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    str = null;
                    break;
                }
                str = list.get(i);
                int indexOf = str.indexOf(61);
                if (indexOf < 0) {
                    break;
                } else if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                    str = str.substring(indexOf + 1);
                    break;
                } else {
                    i++;
                }
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[collection.size()]);
    }

    /* renamed from: u */
    public C0744d mo8741h(C0716p pVar) {
        String b = AbstractC0769u.m1518b(pVar);
        Matcher matcher = f1457e.matcher(b);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> r = m1461r("FN", b, true, false);
        if (r == null) {
            r = m1461r("N", b, true, false);
            m1458o(r);
        }
        List<String> q = m1460q("NICKNAME", b, true, false);
        String[] split = q == null ? null : f1465m.split(q.get(0));
        List<List<String>> r2 = m1461r("TEL", b, true, false);
        List<List<String>> r3 = m1461r("EMAIL", b, true, false);
        List<String> q2 = m1460q("NOTE", b, false, false);
        List<List<String>> r4 = m1461r("ADR", b, true, true);
        List<String> q3 = m1460q("ORG", b, true, true);
        List<String> q4 = m1460q("BDAY", b, true, false);
        List<String> list = (q4 == null || m1459p(q4.get(0))) ? q4 : null;
        List<String> q5 = m1460q("TITLE", b, true, false);
        List<List<String>> r5 = m1461r("URL", b, true, false);
        List<String> q6 = m1460q("IMPP", b, true, false);
        List<String> q7 = m1460q("GEO", b, true, false);
        String[] split2 = q7 == null ? null : f1466n.split(q7.get(0));
        return new C0744d(m1465w(r), split, null, m1465w(r2), m1466x(r2), m1465w(r3), m1466x(r3), m1464v(q6), m1464v(q2), m1465w(r4), m1466x(r4), m1464v(q3), m1464v(list), m1464v(q5), m1465w(r5), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
