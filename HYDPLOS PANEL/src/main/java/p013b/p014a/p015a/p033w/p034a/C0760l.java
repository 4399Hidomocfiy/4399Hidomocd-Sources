package p013b.p014a.p015a.p033w.p034a;

/* renamed from: b.a.a.w.a.l */
public final class C0760l extends AbstractC0769u {
    /* renamed from: n */
    private static String m1501n(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: o */
    private static String m1502o(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (m1501n(i2, substring) != null) {
                    break;
                }
                sb.append('(');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x020e, code lost:
        if (r1.equals("10") == false) goto L_0x0052;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p013b.p014a.p015a.p033w.p034a.C0758k mo8741h(p013b.p014a.p015a.C0716p r24) {
        /*
        // Method dump skipped, instructions count: 870
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p033w.p034a.C0760l.mo8741h(b.a.a.p):b.a.a.w.a.k");
    }
}
