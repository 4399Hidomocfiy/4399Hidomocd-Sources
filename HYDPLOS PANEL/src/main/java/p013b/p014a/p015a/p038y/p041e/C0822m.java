package p013b.p014a.p015a.p038y.p041e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.m */
public final class C0822m extends C0812c {
    C0822m() {
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p038y.p041e.C0812c
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
            } else if (c < 'a' || c > 'z') {
                if (c < 0 || c > 31) {
                    char c3 = '!';
                    if (c >= '!' && c <= '/') {
                        sb.append((char) 1);
                    } else if (c >= ':' && c <= '@') {
                        sb.append((char) 1);
                        i = (c - ':') + 15;
                        c = (char) i;
                    } else if (c < '[' || c > '_') {
                        c3 = '`';
                        if (c == '`') {
                            sb.append((char) 2);
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append((char) 2);
                            i = (c - 'A') + 1;
                            c = (char) i;
                        } else if (c >= '{' && c <= 127) {
                            sb.append((char) 2);
                            i = (c - '{') + 27;
                            c = (char) i;
                        } else if (c >= 128) {
                            sb.append("\u0001\u001e");
                            return mo8886c((char) (c - 128), sb) + 2;
                        } else {
                            C0819j.m1760e(c);
                            throw null;
                        }
                    } else {
                        sb.append((char) 1);
                        i = (c - '[') + 22;
                        c = (char) i;
                    }
                    i = c - c3;
                    c = (char) i;
                } else {
                    sb.append((char) 0);
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'a') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }

    @Override // p013b.p014a.p015a.p038y.p041e.C0812c
    /* renamed from: e */
    public int mo8887e() {
        return 2;
    }
}
