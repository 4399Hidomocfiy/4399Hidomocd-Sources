package p013b.p014a.p015a.p016a0;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.h */
public final class C0615h extends AbstractC0631x {

    /* renamed from: i */
    static final int[] f1126i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h */
    private final int[] f1127h = new int[4];

    /* renamed from: r */
    private static void m885r(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f1126i[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: l */
    public int mo8484l(C0775a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f1127h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k = aVar.mo8778k();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < k; i3++) {
            int j = AbstractC0631x.m942j(aVar, iArr2, i, AbstractC0631x.f1153g);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m885r(sb, i2);
        int i5 = AbstractC0631x.m943n(aVar, i, true, AbstractC0631x.f1151e)[1];
        for (int i6 = 0; i6 < 6 && i5 < k; i6++) {
            sb.append((char) (AbstractC0631x.m942j(aVar, iArr2, i5, AbstractC0631x.f1152f) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: q */
    public EnumC0577a mo8485q() {
        return EnumC0577a.EAN_13;
    }
}
