package p013b.p014a.p015a.p016a0;

import java.util.Arrays;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0715o;
import p013b.p014a.p015a.AbstractC0719s;
import p013b.p014a.p015a.C0703d;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.EnumC0717q;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.x */
public abstract class AbstractC0631x extends AbstractC0624q {

    /* renamed from: d */
    static final int[] f1150d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f1151e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[][] f1152f;

    /* renamed from: g */
    static final int[][] f1153g;

    /* renamed from: a */
    private final StringBuilder f1154a = new StringBuilder(20);

    /* renamed from: b */
    private final C0630w f1155b = new C0630w();

    /* renamed from: c */
    private final C0619l f1156c = new C0619l();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f1152f = iArr;
        int[][] iArr2 = new int[20][];
        f1153g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f1152f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f1153g[i] = iArr4;
        }
    }

    protected AbstractC0631x() {
    }

    /* renamed from: i */
    static boolean m941i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C0707h.m1320a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C0707h.m1320a();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }

    /* renamed from: j */
    static int m942j(C0775a aVar, int[] iArr, int i, int[][] iArr2) {
        AbstractC0624q.m913f(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float e = AbstractC0624q.m912e(iArr, iArr2[i3], 0.7f);
            if (e < f) {
                i2 = i3;
                f = e;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: n */
    static int[] m943n(C0775a aVar, int i, boolean z, int[] iArr) {
        return m944o(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    private static int[] m944o(C0775a aVar, int i, boolean z, int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int k = aVar.mo8778k();
        int j = z ? aVar.mo8777j(i) : aVar.mo8776i(i);
        boolean z2 = z;
        int i2 = 0;
        int i3 = j;
        while (j < k) {
            if (aVar.mo8773g(j) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 != i4) {
                    i2++;
                } else if (AbstractC0624q.m912e(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, j};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            j++;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: p */
    static int[] m945p(C0775a aVar) {
        int[] iArr = new int[f1150d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f1150d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m944o(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo8780m(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        return mo8491m(i, aVar, m945p(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo8497h(String str) {
        return m941i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo8498k(C0775a aVar, int i) {
        return m943n(aVar, i, false, f1150d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo8484l(C0775a aVar, int[] iArr, StringBuilder sb);

    /* renamed from: m */
    public C0716p mo8491m(int i, C0775a aVar, int[] iArr, Map<EnumC0704e, ?> map) {
        int i2;
        String c;
        int[] iArr2 = null;
        AbstractC0719s sVar = map == null ? null : (AbstractC0719s) map.get(EnumC0704e.NEED_RESULT_POINT_CALLBACK);
        boolean z = true;
        if (sVar != null) {
            sVar.mo8705a(new C0718r(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f1154a;
        sb.setLength(0);
        int l = mo8484l(aVar, iArr, sb);
        if (sVar != null) {
            sVar.mo8705a(new C0718r((float) l, (float) i));
        }
        int[] k = mo8498k(aVar, l);
        if (sVar != null) {
            sVar.mo8705a(new C0718r(((float) (k[0] + k[1])) / 2.0f, (float) i));
        }
        int i3 = k[1];
        int i4 = (i3 - k[0]) + i3;
        if (i4 >= aVar.mo8778k() || !aVar.mo8780m(i3, i4, false)) {
            throw C0712l.m1333a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C0707h.m1320a();
        } else if (mo8497h(sb2)) {
            EnumC0577a q = mo8485q();
            float f = (float) i;
            C0716p pVar = new C0716p(sb2, null, new C0718r[]{new C0718r(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C0718r(((float) (k[1] + k[0])) / 2.0f, f)}, q);
            try {
                C0716p a = this.f1155b.mo8496a(i, aVar, k[1]);
                pVar.mo8698h(EnumC0717q.UPC_EAN_EXTENSION, a.mo8696f());
                pVar.mo8697g(a.mo8694d());
                pVar.mo8691a(a.mo8695e());
                i2 = a.mo8696f().length();
            } catch (AbstractC0715o unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(EnumC0704e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C0712l.m1333a();
                }
            }
            if ((q == EnumC0577a.EAN_13 || q == EnumC0577a.UPC_A) && (c = this.f1156c.mo8486c(sb2)) != null) {
                pVar.mo8698h(EnumC0717q.POSSIBLE_COUNTRY, c);
            }
            return pVar;
        } else {
            throw C0703d.m1317a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract EnumC0577a mo8485q();
}
