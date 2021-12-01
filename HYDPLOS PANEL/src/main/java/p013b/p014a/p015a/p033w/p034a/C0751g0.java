package p013b.p014a.p015a.p033w.p034a;

import java.util.List;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.g0 */
public final class C0751g0 extends AbstractC0769u {
    /* renamed from: n */
    private static String m1475n(CharSequence charSequence, String str, boolean z) {
        List<String> q = C0749f0.m1460q(charSequence, str, z, false);
        if (q == null || q.isEmpty()) {
            return null;
        }
        return q.get(0);
    }

    /* renamed from: o */
    private static String[] m1476o(CharSequence charSequence, String str, boolean z) {
        List<List<String>> r = C0749f0.m1461r(charSequence, str, z, false);
        if (r == null || r.isEmpty()) {
            return null;
        }
        int size = r.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = r.get(i).get(0);
        }
        return strArr;
    }

    /* renamed from: q */
    private static String m1477q(String str) {
        return str != null ? (str.startsWith("mailto:") || str.startsWith("MAILTO:")) ? str.substring(7) : str : str;
    }

    /* renamed from: p */
    public C0750g mo8741h(C0716p pVar) {
        double d;
        String b = AbstractC0769u.m1518b(pVar);
        if (b.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        String n = m1475n("SUMMARY", b, true);
        String n2 = m1475n("DTSTART", b, true);
        if (n2 == null) {
            return null;
        }
        String n3 = m1475n("DTEND", b, true);
        String n4 = m1475n("DURATION", b, true);
        String n5 = m1475n("LOCATION", b, true);
        String q = m1477q(m1475n("ORGANIZER", b, true));
        String[] o = m1476o("ATTENDEE", b, true);
        if (o != null) {
            for (int i = 0; i < o.length; i++) {
                o[i] = m1477q(o[i]);
            }
        }
        String n6 = m1475n("DESCRIPTION", b, true);
        String n7 = m1475n("GEO", b, true);
        double d2 = Double.NaN;
        if (n7 == null) {
            d = Double.NaN;
        } else {
            int indexOf = n7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                d2 = Double.parseDouble(n7.substring(0, indexOf));
                d = Double.parseDouble(n7.substring(indexOf + 1));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return new C0750g(n, n2, n3, n4, n5, q, o, n6, d2, d);
    }
}
