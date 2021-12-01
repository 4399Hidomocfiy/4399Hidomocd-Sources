package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.a0.g.e.e */
public final class C0593e extends AbstractC0597i {

    /* renamed from: c */
    private final String f1083c;

    /* renamed from: d */
    private final String f1084d;

    C0593e(C0775a aVar, String str, String str2) {
        super(aVar);
        this.f1083c = str2;
        this.f1084d = str;
    }

    /* renamed from: k */
    private void m806k(StringBuilder sb, int i) {
        int f = mo8457b().mo8481f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f1083c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    @Override // p013b.p014a.p015a.p016a0.p017a0.p018g.p019e.AbstractC0598j
    /* renamed from: d */
    public String mo8453d() {
        if (mo8458c().mo8778k() == 84) {
            StringBuilder sb = new StringBuilder();
            mo8454f(sb, 8);
            mo8456j(sb, 48, 20);
            m806k(sb, 68);
            return sb.toString();
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.p017a0.p018g.p019e.AbstractC0597i
    /* renamed from: h */
    public void mo8451h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f1084d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.p017a0.p018g.p019e.AbstractC0597i
    /* renamed from: i */
    public int mo8452i(int i) {
        return i % 100000;
    }
}
