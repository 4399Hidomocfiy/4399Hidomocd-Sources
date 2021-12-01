package p013b.p014a.p015a.p025c0.p027d;

import java.util.ArrayList;
import java.util.List;
import p013b.p014a.p015a.AbstractC0719s;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.p035x.C0776b;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.c0.d.b */
public final class C0688b {

    /* renamed from: a */
    private final C0776b f1298a;

    /* renamed from: b */
    private final List<C0687a> f1299b = new ArrayList(5);

    /* renamed from: c */
    private final int f1300c;

    /* renamed from: d */
    private final int f1301d;

    /* renamed from: e */
    private final int f1302e;

    /* renamed from: f */
    private final int f1303f;

    /* renamed from: g */
    private final float f1304g;

    /* renamed from: h */
    private final int[] f1305h;

    /* renamed from: i */
    private final AbstractC0719s f1306i;

    C0688b(C0776b bVar, int i, int i2, int i3, int i4, float f, AbstractC0719s sVar) {
        this.f1298a = bVar;
        this.f1300c = i;
        this.f1301d = i2;
        this.f1302e = i3;
        this.f1303f = i4;
        this.f1304g = f;
        this.f1305h = new int[3];
        this.f1306i = sVar;
    }

    /* renamed from: a */
    private static float m1220a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m1221b(int i, int i2, int i3, int i4) {
        C0776b bVar = this.f1298a;
        int g = bVar.mo8795g();
        int[] iArr = this.f1305h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo8791d(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 < 0 || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo8791d(i2, i5) && iArr[0] <= i3) {
            iArr[0] = iArr[0] + 1;
            i5--;
        }
        if (iArr[0] > i3) {
            return Float.NaN;
        }
        int i6 = i + 1;
        while (i6 < g && bVar.mo8791d(i2, i6) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i6++;
        }
        if (i6 == g || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i6 < g && !bVar.mo8791d(i2, i6) && iArr[2] <= i3) {
            iArr[2] = iArr[2] + 1;
            i6++;
        }
        if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m1222d(iArr)) {
            return m1220a(iArr, i6);
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m1222d(int[] iArr) {
        float f = this.f1304g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C0687a m1223e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m1220a(iArr, i2);
        float b = m1221b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C0687a aVar : this.f1299b) {
            if (aVar.mo8636f(f, b, a)) {
                return aVar.mo8637g(b, a, f);
            }
        }
        C0687a aVar2 = new C0687a(a, b, f);
        this.f1299b.add(aVar2);
        AbstractC0719s sVar = this.f1306i;
        if (sVar == null) {
            return null;
        }
        sVar.mo8705a(aVar2);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0687a mo8638c() {
        C0687a e;
        C0687a e2;
        int i = this.f1300c;
        int i2 = this.f1303f;
        int i3 = this.f1302e + i;
        int i4 = this.f1301d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f1298a.mo8791d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f1298a.mo8791d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m1222d(iArr) && (e2 = m1223e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m1222d(iArr) && (e = m1223e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f1299b.isEmpty()) {
            return this.f1299b.get(0);
        }
        throw C0712l.m1333a();
    }
}
