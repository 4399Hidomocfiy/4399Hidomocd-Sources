package p013b.p014a.p015a.p038y.p041e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.c */
public class C0812c implements AbstractC0816g {
    C0812c() {
    }

    /* renamed from: b */
    private int m1709b(C0817h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f1679f--;
        int c = mo8886c(hVar.mo8898c(), sb2);
        hVar.mo8905k();
        return c;
    }

    /* renamed from: d */
    private static String m1710d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* renamed from: g */
    static void m1711g(C0817h hVar, StringBuilder sb) {
        hVar.mo8913s(m1710d(sb, 0));
        sb.delete(0, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r2 != 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r1 > 3) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r2 > 2) goto L_0x0049;
     */
    @Override // p013b.p014a.p015a.p038y.p041e.AbstractC0816g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8883a(p013b.p014a.p015a.p038y.p041e.C0817h r9) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p038y.p041e.C0812c.mo8883a(b.a.a.y.e.h):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8886c(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                if (c < 0 || c > 31) {
                    if (c >= '!' && c <= '/') {
                        sb.append((char) 1);
                        i = c - '!';
                    } else if (c >= ':' && c <= '@') {
                        sb.append((char) 1);
                        i = (c - ':') + 15;
                    } else if (c >= '[' && c <= '_') {
                        sb.append((char) 1);
                        i = (c - '[') + 22;
                    } else if (c >= '`' && c <= 127) {
                        sb.append((char) 2);
                        i = c - '`';
                    } else if (c >= 128) {
                        sb.append("\u0001\u001e");
                        return mo8886c((char) (c - 128), sb) + 2;
                    } else {
                        throw new IllegalArgumentException("Illegal character: " + c);
                    }
                    c = (char) i;
                } else {
                    sb.append((char) 0);
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }

    /* renamed from: e */
    public int mo8887e() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r7.mo8903i() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r7.mo8903i() != false) goto L_0x0037;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8888f(p013b.p014a.p015a.p038y.p041e.C0817h r7, java.lang.StringBuilder r8) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p038y.p041e.C0812c.mo8888f(b.a.a.y.e.h, java.lang.StringBuilder):void");
    }
}
