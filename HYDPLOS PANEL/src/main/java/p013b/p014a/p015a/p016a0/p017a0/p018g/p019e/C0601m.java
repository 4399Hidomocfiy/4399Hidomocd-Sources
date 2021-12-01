package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.a0.g.e.m */
public final class C0601m {

    /* renamed from: a */
    private int f1089a = 0;

    /* renamed from: b */
    private EnumC0602a f1090b = EnumC0602a.NUMERIC;

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.a0.a0.g.e.m$a */
    public enum EnumC0602a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    C0601m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8461a() {
        return this.f1089a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8462b(int i) {
        this.f1089a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8463c() {
        return this.f1090b == EnumC0602a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo8464d() {
        return this.f1090b == EnumC0602a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8465e() {
        this.f1090b = EnumC0602a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8466f() {
        this.f1090b = EnumC0602a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8467g() {
        this.f1090b = EnumC0602a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8468h(int i) {
        this.f1089a = i;
    }
}
