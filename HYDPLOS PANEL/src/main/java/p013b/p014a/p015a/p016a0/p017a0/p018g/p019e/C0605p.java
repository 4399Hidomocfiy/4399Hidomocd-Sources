package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import p013b.p014a.p015a.C0707h;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.a0.g.e.p */
public final class C0605p extends AbstractC0606q {

    /* renamed from: b */
    private final int f1099b;

    /* renamed from: c */
    private final int f1100c;

    C0605p(int i, int i2, int i3) {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C0707h.m1320a();
        }
        this.f1099b = i2;
        this.f1100c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8474b() {
        return this.f1099b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8475c() {
        return this.f1100c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo8476d() {
        return this.f1099b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8477e() {
        return this.f1100c == 10;
    }
}
