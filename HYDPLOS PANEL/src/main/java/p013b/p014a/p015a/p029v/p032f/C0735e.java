package p013b.p014a.p015a.p029v.p032f;

import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.v.f.e */
public final class C0735e extends AbstractC0737g {

    /* renamed from: c */
    private final short f1430c;

    /* renamed from: d */
    private final short f1431d;

    C0735e(AbstractC0737g gVar, int i, int i2) {
        super(gVar);
        this.f1430c = (short) i;
        this.f1431d = (short) i2;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p029v.p032f.AbstractC0737g
    /* renamed from: c */
    public void mo8722c(C0775a aVar, byte[] bArr) {
        aVar.mo8768c(this.f1430c, this.f1431d);
    }

    public String toString() {
        short s = this.f1430c;
        short s2 = this.f1431d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return '<' + Integer.toBinaryString(i | (1 << this.f1431d)).substring(1) + '>';
    }
}
