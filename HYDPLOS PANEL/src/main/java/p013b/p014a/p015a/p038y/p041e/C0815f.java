package p013b.p014a.p015a.p038y.p041e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.f */
public final class C0815f implements AbstractC0816g {
    C0815f() {
    }

    /* renamed from: b */
    private static void m1728b(char c, StringBuilder sb) {
        if (c < ' ' || c > '?') {
            if (c < '@' || c > '^') {
                C0819j.m1760e(c);
                throw null;
            }
            c = (char) (c - '@');
        }
        sb.append(c);
    }

    /* renamed from: c */
    private static String m1729c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << '\f') + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 8) & 255);
            char c3 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    /* renamed from: e */
    private static void m1730e(C0817h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo8910p();
                    int a = hVar.mo8902g().mo8914a() - hVar.mo8896a();
                    if (hVar.mo8901f() == 0 && a <= 2) {
                        hVar.mo8909o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String c = m1729c(charSequence, 0);
                    if (!(!hVar.mo8903i()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo8911q(hVar.mo8896a() + i);
                        if (hVar.mo8902g().mo8914a() - hVar.mo8896a() >= 3) {
                            hVar.mo8911q(hVar.mo8896a() + c.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo8905k();
                        hVar.f1679f -= i;
                    } else {
                        hVar.mo8913s(c);
                    }
                    hVar.mo8909o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo8909o(0);
        }
    }

    @Override // p013b.p014a.p015a.p038y.p041e.AbstractC0816g
    /* renamed from: a */
    public void mo8883a(C0817h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo8903i()) {
                break;
            }
            m1728b(hVar.mo8898c(), sb);
            hVar.f1679f++;
            if (sb.length() >= 4) {
                hVar.mo8913s(m1729c(sb, 0));
                sb.delete(0, 4);
                if (C0819j.m1769n(hVar.mo8899d(), hVar.f1679f, mo8895d()) != mo8895d()) {
                    hVar.mo8909o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        m1730e(hVar, sb);
    }

    /* renamed from: d */
    public int mo8895d() {
        return 4;
    }
}
