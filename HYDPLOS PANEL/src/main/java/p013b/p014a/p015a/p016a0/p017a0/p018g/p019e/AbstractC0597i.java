package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.a0.g.e.i */
public abstract class AbstractC0597i extends AbstractC0596h {
    AbstractC0597i(C0775a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo8451h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo8452i(int i);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo8456j(StringBuilder sb, int i, int i2) {
        int f = mo8457b().mo8481f(i, i2);
        mo8451h(sb, f);
        int i3 = mo8452i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
