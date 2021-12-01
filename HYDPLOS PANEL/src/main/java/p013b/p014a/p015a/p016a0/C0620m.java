package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.m */
public final class C0620m extends AbstractC0624q {

    /* renamed from: b */
    private static final int[] f1131b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f1132c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[] f1133d = {1, 1, 3};

    /* renamed from: e */
    static final int[][] f1134e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f1135a = -1;

    /* renamed from: h */
    private static int m897h(int[] iArr) {
        int length = f1134e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float e = AbstractC0624q.m912e(iArr, f1134e[i2], 0.78f);
            if (e < f) {
                i = i2;
                f = e;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: j */
    private static void m898j(C0775a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            AbstractC0624q.m913f(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m897h(iArr2) + 48));
            sb.append((char) (m897h(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    private static int[] m899l(C0775a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int k = aVar.mo8778k();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < k) {
            if (aVar.mo8773g(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (AbstractC0624q.m912e(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: m */
    private static int m900m(C0775a aVar) {
        int k = aVar.mo8778k();
        int i = aVar.mo8776i(0);
        if (i != k) {
            return i;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: n */
    private void m901n(C0775a aVar, int i) {
        int i2 = this.f1135a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo8773g(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw C0712l.m1333a();
        }
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        boolean z;
        int[] k = mo8488k(aVar);
        int[] i2 = mo8487i(aVar);
        StringBuilder sb = new StringBuilder(20);
        m898j(aVar, k[1], i2[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC0704e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f1131b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C0716p(sb2, null, new C0718r[]{new C0718r((float) k[1], f), new C0718r((float) i2[0], f)}, EnumC0577a.ITF);
        }
        throw C0707h.m1320a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int[] mo8487i(C0775a aVar) {
        aVar.mo8781o();
        try {
            int[] l = m899l(aVar, m900m(aVar), f1133d);
            m901n(aVar, l[0]);
            int i = l[0];
            l[0] = aVar.mo8778k() - l[1];
            l[1] = aVar.mo8778k() - i;
            return l;
        } finally {
            aVar.mo8781o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo8488k(C0775a aVar) {
        int[] l = m899l(aVar, m900m(aVar), f1132c);
        this.f1135a = (l[1] - l[0]) / 4;
        m901n(aVar, l[0]);
        return l;
    }
}
