package p013b.p014a.p015a.p038y.p041e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.a */
public final class C0810a implements AbstractC0816g {
    C0810a() {
    }

    /* renamed from: b */
    private static char m1703b(char c, char c2) {
        if (C0819j.m1761f(c) && C0819j.m1761f(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // p013b.p014a.p015a.p038y.p041e.AbstractC0816g
    /* renamed from: a */
    public void mo8883a(C0817h hVar) {
        int i;
        char c;
        if (C0819j.m1756a(hVar.mo8899d(), hVar.f1679f) >= 2) {
            hVar.mo8912r(m1703b(hVar.mo8899d().charAt(hVar.f1679f), hVar.mo8899d().charAt(hVar.f1679f + 1)));
            i = hVar.f1679f + 2;
        } else {
            char c2 = hVar.mo8898c();
            int n = C0819j.m1769n(hVar.mo8899d(), hVar.f1679f, mo8884c());
            if (n == mo8884c()) {
                boolean g = C0819j.m1762g(c2);
                int i2 = c2;
                if (g) {
                    hVar.mo8912r(235);
                    i2 = c2 - 128;
                }
                hVar.mo8912r((char) ((i2 == 1 ? 1 : 0) + 1));
                i = hVar.f1679f + 1;
            } else if (n == 1) {
                hVar.mo8912r(230);
                hVar.mo8909o(1);
                return;
            } else if (n != 2) {
                int i3 = 3;
                if (n != 3) {
                    i3 = 4;
                    if (n == 4) {
                        c = 240;
                    } else if (n == 5) {
                        hVar.mo8912r(231);
                        hVar.mo8909o(5);
                        return;
                    } else {
                        throw new IllegalStateException("Illegal mode: " + n);
                    }
                } else {
                    c = 238;
                }
                hVar.mo8912r(c);
                hVar.mo8909o(i3);
                return;
            } else {
                hVar.mo8912r(239);
                hVar.mo8909o(2);
                return;
            }
        }
        hVar.f1679f = i;
    }

    /* renamed from: c */
    public int mo8884c() {
        return 0;
    }
}
