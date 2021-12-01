package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.a0.g.e.d */
public final class C0592d extends AbstractC0596h {
    C0592d(C0775a aVar) {
        super(aVar);
    }

    @Override // p013b.p014a.p015a.p016a0.p017a0.p018g.p019e.AbstractC0598j
    /* renamed from: d */
    public String mo8453d() {
        if (mo8458c().mo8778k() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo8454f(sb, 8);
            int f = mo8457b().mo8481f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo8457b().mo8481f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo8457b().mo8480c(60, null).mo8471b());
            return sb.toString();
        }
        throw C0712l.m1333a();
    }
}
