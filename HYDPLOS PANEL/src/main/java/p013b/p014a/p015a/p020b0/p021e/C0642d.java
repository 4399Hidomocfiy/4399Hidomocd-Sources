package p013b.p014a.p015a.p020b0.p021e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.d */
public final class C0642d {

    /* renamed from: a */
    private final int f1179a;

    /* renamed from: b */
    private final int f1180b;

    /* renamed from: c */
    private final int f1181c;

    /* renamed from: d */
    private final int f1182d;

    /* renamed from: e */
    private int f1183e = -1;

    C0642d(int i, int i2, int i3, int i4) {
        this.f1179a = i;
        this.f1180b = i2;
        this.f1181c = i3;
        this.f1182d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8524a() {
        return this.f1181c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8525b() {
        return this.f1180b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8526c() {
        return this.f1183e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8527d() {
        return this.f1179a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8528e() {
        return this.f1182d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo8529f() {
        return this.f1180b - this.f1179a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo8530g() {
        return mo8531h(this.f1183e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo8531h(int i) {
        return i != -1 && this.f1181c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8532i(int i) {
        this.f1183e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8533j() {
        this.f1183e = ((this.f1182d / 30) * 3) + (this.f1181c / 3);
    }

    public String toString() {
        return this.f1183e + "|" + this.f1182d;
    }
}
