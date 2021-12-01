package p013b.p014a.p015a.p038y.p041e;

import java.nio.charset.Charset;
import p013b.p014a.p015a.C0705f;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.h */
public final class C0817h {

    /* renamed from: a */
    private final String f1674a;

    /* renamed from: b */
    private EnumC0821l f1675b;

    /* renamed from: c */
    private C0705f f1676c;

    /* renamed from: d */
    private C0705f f1677d;

    /* renamed from: e */
    private final StringBuilder f1678e;

    /* renamed from: f */
    int f1679f;

    /* renamed from: g */
    private int f1680g;

    /* renamed from: h */
    private C0820k f1681h;

    /* renamed from: i */
    private int f1682i;

    C0817h(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f1674a = sb.toString();
        this.f1675b = EnumC0821l.FORCE_NONE;
        this.f1678e = new StringBuilder(str.length());
        this.f1680g = -1;
    }

    /* renamed from: h */
    private int m1734h() {
        return this.f1674a.length() - this.f1682i;
    }

    /* renamed from: a */
    public int mo8896a() {
        return this.f1678e.length();
    }

    /* renamed from: b */
    public StringBuilder mo8897b() {
        return this.f1678e;
    }

    /* renamed from: c */
    public char mo8898c() {
        return this.f1674a.charAt(this.f1679f);
    }

    /* renamed from: d */
    public String mo8899d() {
        return this.f1674a;
    }

    /* renamed from: e */
    public int mo8900e() {
        return this.f1680g;
    }

    /* renamed from: f */
    public int mo8901f() {
        return m1734h() - this.f1679f;
    }

    /* renamed from: g */
    public C0820k mo8902g() {
        return this.f1681h;
    }

    /* renamed from: i */
    public boolean mo8903i() {
        return this.f1679f < m1734h();
    }

    /* renamed from: j */
    public void mo8904j() {
        this.f1680g = -1;
    }

    /* renamed from: k */
    public void mo8905k() {
        this.f1681h = null;
    }

    /* renamed from: l */
    public void mo8906l(C0705f fVar, C0705f fVar2) {
        this.f1676c = fVar;
        this.f1677d = fVar2;
    }

    /* renamed from: m */
    public void mo8907m(int i) {
        this.f1682i = i;
    }

    /* renamed from: n */
    public void mo8908n(EnumC0821l lVar) {
        this.f1675b = lVar;
    }

    /* renamed from: o */
    public void mo8909o(int i) {
        this.f1680g = i;
    }

    /* renamed from: p */
    public void mo8910p() {
        mo8911q(mo8896a());
    }

    /* renamed from: q */
    public void mo8911q(int i) {
        C0820k kVar = this.f1681h;
        if (kVar == null || i > kVar.mo8914a()) {
            this.f1681h = C0820k.m1771l(i, this.f1675b, this.f1676c, this.f1677d, true);
        }
    }

    /* renamed from: r */
    public void mo8912r(char c) {
        this.f1678e.append(c);
    }

    /* renamed from: s */
    public void mo8913s(String str) {
        this.f1678e.append(str);
    }
}
