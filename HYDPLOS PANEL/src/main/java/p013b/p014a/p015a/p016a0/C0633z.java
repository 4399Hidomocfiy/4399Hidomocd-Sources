package p013b.p014a.p015a.p016a0;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.z */
public final class C0633z extends AbstractC0631x {

    /* renamed from: i */
    private static final int[] f1157i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j */
    private static final int[][] f1158j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h */
    private final int[] f1159h = new int[4];

    /* renamed from: r */
    public static String m953r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* renamed from: s */
    private static void m954s(StringBuilder sb, int i) {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f1158j[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: h */
    public boolean mo8497h(String str) {
        return super.mo8497h(m953r(str));
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: k */
    public int[] mo8498k(C0775a aVar, int i) {
        return AbstractC0631x.m943n(aVar, i, true, f1157i);
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: l */
    public int mo8484l(C0775a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f1159h;
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
        m954s(sb, i2);
        return i;
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: q */
    public EnumC0577a mo8485q() {
        return EnumC0577a.UPC_E;
    }
}
