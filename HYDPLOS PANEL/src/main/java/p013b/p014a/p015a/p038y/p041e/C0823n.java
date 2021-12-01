package p013b.p014a.p015a.p038y.p041e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.n */
public final class C0823n extends C0812c {
    C0823n() {
    }

    @Override // p013b.p014a.p015a.p038y.p041e.C0812c, p013b.p014a.p015a.p038y.p041e.AbstractC0816g
    /* renamed from: a */
    public void mo8883a(C0817h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo8903i()) {
                break;
            }
            char c = hVar.mo8898c();
            hVar.f1679f++;
            mo8886c(c, sb);
            if (sb.length() % 3 == 0) {
                C0812c.m1711g(hVar, sb);
                int n = C0819j.m1769n(hVar.mo8899d(), hVar.f1679f, mo8887e());
                if (n != mo8887e()) {
                    hVar.mo8909o(n);
                    break;
                }
            }
        }
        mo8888f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p038y.p041e.C0812c
    /* renamed from: c */
    public int mo8886c(char c, StringBuilder sb) {
        int i;
        char c2;
        if (c == '\r') {
            c2 = 0;
        } else if (c == '*') {
            sb.append((char) 1);
            return 1;
        } else if (c == '>') {
            c2 = 2;
        } else if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                C0819j.m1760e(c);
                throw null;
            } else {
                i = (c - 'A') + 14;
            }
            c2 = (char) i;
        }
        sb.append(c2);
        return 1;
    }

    @Override // p013b.p014a.p015a.p038y.p041e.C0812c
    /* renamed from: e */
    public int mo8887e() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p038y.p041e.C0812c
    /* renamed from: f */
    public void mo8888f(C0817h hVar, StringBuilder sb) {
        hVar.mo8910p();
        int a = hVar.mo8902g().mo8914a() - hVar.mo8896a();
        int length = sb.length();
        if (length == 2) {
            hVar.mo8912r(254);
            hVar.f1679f -= 2;
        } else if (length == 1) {
            hVar.f1679f--;
            if (a > 1) {
                hVar.mo8912r(254);
            }
        } else {
            return;
        }
        hVar.mo8909o(0);
    }
}
