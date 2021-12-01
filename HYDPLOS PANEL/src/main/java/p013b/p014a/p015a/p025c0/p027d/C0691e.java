package p013b.p014a.p015a.p025c0.p027d;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0719s;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.c0.d.e */
public class C0691e {

    /* renamed from: a */
    private final C0776b f1311a;

    /* renamed from: b */
    private final List<C0690d> f1312b = new ArrayList();

    /* renamed from: c */
    private boolean f1313c;

    /* renamed from: d */
    private final int[] f1314d = new int[5];

    /* renamed from: e */
    private final AbstractC0719s f1315e;

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.c0.d.e$b */
    public static final class C0693b implements Comparator<C0690d>, Serializable {

        /* renamed from: a */
        private final float f1316a;

        private C0693b(float f) {
            this.f1316a = f;
        }

        /* renamed from: a */
        public int compare(C0690d dVar, C0690d dVar2) {
            if (dVar2.mo8645h() != dVar.mo8645h()) {
                return dVar2.mo8645h() - dVar.mo8645h();
            }
            float abs = Math.abs(dVar2.mo8646i() - this.f1316a);
            float abs2 = Math.abs(dVar.mo8646i() - this.f1316a);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.c0.d.e$c */
    public static final class C0694c implements Comparator<C0690d>, Serializable {

        /* renamed from: a */
        private final float f1317a;

        private C0694c(float f) {
            this.f1317a = f;
        }

        /* renamed from: a */
        public int compare(C0690d dVar, C0690d dVar2) {
            float abs = Math.abs(dVar2.mo8646i() - this.f1317a);
            float abs2 = Math.abs(dVar.mo8646i() - this.f1317a);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }
    }

    public C0691e(C0776b bVar, AbstractC0719s sVar) {
        this.f1311a = bVar;
        this.f1315e = sVar;
    }

    /* renamed from: a */
    private static float m1239a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: b */
    private boolean m1240b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] h = m1245h();
        int i10 = 0;
        while (i >= i10 && i2 >= i10 && this.f1311a.mo8791d(i2 - i10, i - i10)) {
            h[2] = h[2] + 1;
            i10++;
        }
        if (i < i10 || i2 < i10) {
            return false;
        }
        while (i >= i10 && i2 >= i10 && !this.f1311a.mo8791d(i2 - i10, i - i10) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i10++;
        }
        if (i < i10 || i2 < i10 || h[1] > i3) {
            return false;
        }
        while (i >= i10 && i2 >= i10 && this.f1311a.mo8791d(i2 - i10, i - i10) && h[0] <= i3) {
            h[0] = h[0] + 1;
            i10++;
        }
        if (h[0] > i3) {
            return false;
        }
        int g = this.f1311a.mo8795g();
        int j = this.f1311a.mo8799j();
        int i11 = 1;
        while (true) {
            i5 = i + i11;
            if (i5 < g && (i9 = i2 + i11) < j && this.f1311a.mo8791d(i9, i5)) {
                h[2] = h[2] + 1;
                i11++;
            } else if (i5 >= g && i2 + i11 < j) {
                while (true) {
                    i6 = i + i11;
                    if (i6 < g && (i8 = i2 + i11) < j && !this.f1311a.mo8791d(i8, i6) && h[3] < i3) {
                        h[3] = h[3] + 1;
                        i11++;
                    } else if (i6 < g || i2 + i11 >= j || h[3] >= i3) {
                        return false;
                    } else {
                        while (true) {
                            int i12 = i + i11;
                            if (i12 < g && (i7 = i2 + i11) < j && this.f1311a.mo8791d(i7, i12) && h[4] < i3) {
                                h[4] = h[4] + 1;
                                i11++;
                            }
                        }
                        return h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) < i4 * 2 && m1244g(h);
                    }
                }
                return i6 < g ? false : false;
            }
        }
        return i5 >= g ? false : false;
    }

    /* renamed from: c */
    private float m1241c(int i, int i2, int i3, int i4) {
        C0776b bVar = this.f1311a;
        int j = bVar.mo8799j();
        int[] h = m1245h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo8791d(i5, i2)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo8791d(i5, i2) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 < 0 || h[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && bVar.mo8791d(i5, i2) && h[0] <= i3) {
            h[0] = h[0] + 1;
            i5--;
        }
        if (h[0] > i3) {
            return Float.NaN;
        }
        int i6 = i + 1;
        while (i6 < j && bVar.mo8791d(i6, i2)) {
            h[2] = h[2] + 1;
            i6++;
        }
        if (i6 == j) {
            return Float.NaN;
        }
        while (i6 < j && !bVar.mo8791d(i6, i2) && h[3] < i3) {
            h[3] = h[3] + 1;
            i6++;
        }
        if (i6 == j || h[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < j && bVar.mo8791d(i6, i2) && h[4] < i3) {
            h[4] = h[4] + 1;
            i6++;
        }
        if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 && m1244g(h)) {
            return m1239a(h, i6);
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private float m1242d(int i, int i2, int i3, int i4) {
        C0776b bVar = this.f1311a;
        int g = bVar.mo8795g();
        int[] h = m1245h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo8791d(i2, i5)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo8791d(i2, i5) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 < 0 || h[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && bVar.mo8791d(i2, i5) && h[0] <= i3) {
            h[0] = h[0] + 1;
            i5--;
        }
        if (h[0] > i3) {
            return Float.NaN;
        }
        int i6 = i + 1;
        while (i6 < g && bVar.mo8791d(i2, i6)) {
            h[2] = h[2] + 1;
            i6++;
        }
        if (i6 == g) {
            return Float.NaN;
        }
        while (i6 < g && !bVar.mo8791d(i2, i6) && h[3] < i3) {
            h[3] = h[3] + 1;
            i6++;
        }
        if (i6 == g || h[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < g && bVar.mo8791d(i2, i6) && h[4] < i3) {
            h[4] = h[4] + 1;
            i6++;
        }
        if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 * 2 && m1244g(h)) {
            return m1239a(h, i6);
        }
        return Float.NaN;
    }

    /* renamed from: f */
    private int m1243f() {
        if (this.f1312b.size() <= 1) {
            return 0;
        }
        C0690d dVar = null;
        for (C0690d dVar2 : this.f1312b) {
            if (dVar2.mo8645h() >= 2) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    this.f1313c = true;
                    return ((int) (Math.abs(dVar.mo8700c() - dVar2.mo8700c()) - Math.abs(dVar.mo8701d() - dVar2.mo8701d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    protected static boolean m1244g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: h */
    private int[] m1245h() {
        int[] iArr = this.f1314d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    /* renamed from: j */
    private boolean m1246j() {
        int size = this.f1312b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C0690d dVar : this.f1312b) {
            if (dVar.mo8645h() >= 2) {
                i++;
                f2 += dVar.mo8646i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C0690d dVar2 : this.f1312b) {
            f += Math.abs(dVar2.mo8646i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* renamed from: k */
    private C0690d[] m1247k() {
        int size = this.f1312b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C0690d dVar : this.f1312b) {
                    float i = dVar.mo8646i();
                    f2 += i;
                    f3 += i * i;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f1312b, new C0694c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i2 = 0;
                while (i2 < this.f1312b.size() && this.f1312b.size() > 3) {
                    if (Math.abs(this.f1312b.get(i2).mo8646i() - f5) > max) {
                        this.f1312b.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            if (this.f1312b.size() > 3) {
                for (C0690d dVar2 : this.f1312b) {
                    f += dVar2.mo8646i();
                }
                Collections.sort(this.f1312b, new C0693b(f / ((float) this.f1312b.size())));
                List<C0690d> list = this.f1312b;
                list.subList(3, list.size()).clear();
            }
            return new C0690d[]{this.f1312b.get(0), this.f1312b.get(1), this.f1312b.get(2)};
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0695f mo8647e(Map<EnumC0704e, ?> map) {
        boolean z = map != null && map.containsKey(EnumC0704e.TRY_HARDER);
        boolean z2 = map != null && map.containsKey(EnumC0704e.PURE_BARCODE);
        int g = this.f1311a.mo8795g();
        int j = this.f1311a.mo8799j();
        int i = (g * 3) / 228;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z3 = false;
        while (i2 < g && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < j) {
                if (this.f1311a.mo8791d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m1244g(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (mo8648i(iArr, i2, i3, z2)) {
                        if (this.f1313c) {
                            z3 = m1246j();
                        } else {
                            int f = m1243f();
                            if (f > iArr[2]) {
                                i2 += (f - iArr[2]) - 2;
                                i3 = j - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i = 2;
                        i4 = 0;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m1244g(iArr) && mo8648i(iArr, i2, j, z2)) {
                i = iArr[0];
                if (this.f1313c) {
                    z3 = m1246j();
                }
            }
            i2 += i;
        }
        C0690d[] k = m1247k();
        C0718r.m1352e(k);
        return new C0695f(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo8648i(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m1239a(iArr, i2);
        float d = m1242d(i, a, iArr[2], i3);
        if (!Float.isNaN(d)) {
            int i4 = (int) d;
            float c = m1241c(a, i4, iArr[2], i3);
            if (!Float.isNaN(c) && (!z || m1240b(i4, (int) c, iArr[2], i3))) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f1312b.size()) {
                        break;
                    }
                    C0690d dVar = this.f1312b.get(i5);
                    if (dVar.mo8643f(f, d, c)) {
                        this.f1312b.set(i5, dVar.mo8644g(d, c, f));
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                if (!z2) {
                    C0690d dVar2 = new C0690d(c, d, f);
                    this.f1312b.add(dVar2);
                    AbstractC0719s sVar = this.f1315e;
                    if (sVar != null) {
                        sVar.mo8705a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
