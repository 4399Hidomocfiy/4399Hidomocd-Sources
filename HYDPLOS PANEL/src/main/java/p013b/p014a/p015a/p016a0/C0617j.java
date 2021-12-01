package p013b.p014a.p015a.p016a0;

import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.j */
public final class C0617j extends AbstractC0631x {

    /* renamed from: h */
    private final int[] f1128h = new int[4];

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: l */
    public int mo8484l(C0775a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f1128h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k = aVar.mo8778k();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < k; i2++) {
            sb.append((char) (AbstractC0631x.m942j(aVar, iArr2, i, AbstractC0631x.f1152f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = AbstractC0631x.m943n(aVar, i, true, AbstractC0631x.f1151e)[1];
        for (int i5 = 0; i5 < 4 && i4 < k; i5++) {
            sb.append((char) (AbstractC0631x.m942j(aVar, iArr2, i4, AbstractC0631x.f1152f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: q */
    public EnumC0577a mo8485q() {
        return EnumC0577a.EAN_8;
    }
}
