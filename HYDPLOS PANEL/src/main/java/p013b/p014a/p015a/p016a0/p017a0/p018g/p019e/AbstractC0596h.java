package p013b.p014a.p015a.p016a0.p017a0.p018g.p019e;

import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.a0.g.e.h */
abstract class AbstractC0596h extends AbstractC0598j {
    AbstractC0596h(C0775a aVar) {
        super(aVar);
    }

    /* renamed from: e */
    private static void m812e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8454f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo8455g(sb, i, length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo8455g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = mo8457b().mo8481f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        m812e(sb, i2);
    }
}
