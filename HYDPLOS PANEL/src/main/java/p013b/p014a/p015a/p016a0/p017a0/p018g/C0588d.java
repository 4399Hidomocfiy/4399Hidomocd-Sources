package p013b.p014a.p015a.p016a0.p017a0.p018g;

import android.support.p012v7.widget.helper.ItemTouchHelper;
import bsh.org.objectweb.asm.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p016a0.AbstractC0624q;
import p013b.p014a.p015a.p016a0.p017a0.AbstractC0579a;
import p013b.p014a.p015a.p016a0.p017a0.C0580b;
import p013b.p014a.p015a.p016a0.p017a0.C0581c;
import p013b.p014a.p015a.p016a0.p017a0.C0584f;
import p013b.p014a.p015a.p016a0.p017a0.p018g.p019e.AbstractC0598j;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.a0.g.d */
public final class C0588d extends AbstractC0579a {

    /* renamed from: k */
    private static final int[] f1073k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f1074l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    private static final int[] f1075m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f1076n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f1077o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, Constants.GETFIELD, 118, Constants.D2L, 7, 21, 63}, new int[]{Constants.ANEWARRAY, Constants.I2B, 13, 39, 117, Constants.F2L, 209, 205}, new int[]{Constants.INSTANCEOF, Constants.IFGT, 49, Constants.I2S, 19, 57, Constants.LOOKUPSWITCH, 91}, new int[]{62, 186, Constants.L2I, Constants.MULTIANEWARRAY, Constants.RET, 85, 44, 132}, new int[]{Constants.INVOKEINTERFACE, 133, Constants.NEWARRAY, Constants.D2I, 4, 12, 36, 108}, new int[]{113, 128, Constants.LRETURN, 97, 80, 29, 87, 50}, new int[]{Constants.FCMPG, 28, 84, 41, 123, Constants.IFLE, 52, Constants.IFGE}, new int[]{46, Constants.L2D, 203, Constants.NEW, Constants.F2I, 206, 196, Constants.IF_ACMPNE}, new int[]{76, 17, 51, Constants.IFEQ, 37, 111, 122, Constants.IFLT}, new int[]{43, 129, Constants.ARETURN, 106, 107, 110, 119, Constants.I2C}, new int[]{16, 48, Constants.D2F, 10, 30, 90, 59, Constants.RETURN}, new int[]{109, 116, Constants.L2F, ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION, Constants.GETSTATIC, 112, 125, Constants.IF_ICMPLE}, new int[]{70, 210, 208, 202, Constants.INVOKESTATIC, 130, Constants.PUTSTATIC, 115}, new int[]{Constants.I2F, Constants.ATHROW, Constants.DCMPL, 31, 93, 68, 204, Constants.ARRAYLENGTH}, new int[]{Constants.LCMP, 22, 66, Constants.IFNULL, Constants.IRETURN, 94, 71, 2}, new int[]{6, 18, 54, Constants.IF_ICMPGE, 64, Constants.CHECKCAST, Constants.IFNE, 40}, new int[]{120, Constants.FCMPL, 25, 75, 14, 42, 126, Constants.GOTO}, new int[]{79, 26, 78, 23, 69, 207, Constants.IFNONNULL, Constants.DRETURN}, new int[]{103, 98, 83, 38, 114, 131, Constants.INVOKEVIRTUAL, 124}, new int[]{Constants.IF_ICMPLT, 61, Constants.INVOKESPECIAL, 127, Constants.TABLESWITCH, 88, 53, Constants.IF_ICMPEQ}, new int[]{55, Constants.IF_ACMPEQ, 73, 8, 24, 72, 5, 15}, new int[]{45, Constants.I2D, Constants.MONITORENTER, Constants.IF_ICMPNE, 58, Constants.FRETURN, 100, 89}};

    /* renamed from: p */
    private static final int[][] f1078p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C0586b> f1079g = new ArrayList(11);

    /* renamed from: h */
    private final List<C0587c> f1080h = new ArrayList();

    /* renamed from: i */
    private final int[] f1081i = new int[2];

    /* renamed from: j */
    private boolean f1082j = false;

    /* renamed from: A */
    private static int m781A(C0775a aVar, int i) {
        return aVar.mo8773g(i) ? aVar.mo8776i(aVar.mo8777j(i)) : aVar.mo8777j(aVar.mo8776i(i));
    }

    /* renamed from: B */
    private static boolean m782B(C0581c cVar, boolean z, boolean z2) {
        return cVar.mo8428c() != 0 || !z || !z2;
    }

    /* renamed from: C */
    private static boolean m783C(Iterable<C0586b> iterable, Iterable<C0587c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C0587c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C0587c next = it.next();
                Iterator<C0586b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C0586b next2 = it2.next();
                    Iterator<C0586b> it3 = next.mo8442a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: D */
    private static boolean m784D(List<C0586b> list) {
        boolean z;
        int[][] iArr = f1078p;
        for (int[] iArr2 : iArr) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo8435b().mo8428c() != iArr2[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    private C0581c m785E(C0775a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f1081i[0] - 1;
            while (i5 >= 0 && !aVar.mo8773g(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f1081i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f1081i;
            int i7 = iArr2[0];
            int j = aVar.mo8777j(iArr2[1] + 1);
            i2 = j;
            i3 = i7;
            i4 = j - this.f1081i[1];
        }
        int[] k = mo8416k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = i4;
        try {
            return new C0581c(AbstractC0579a.m744r(k, f1076n), new int[]{i3, i2}, i3, i2, i);
        } catch (C0712l unused) {
            return null;
        }
    }

    /* renamed from: F */
    private static void m786F(List<C0586b> list, List<C0587c> list2) {
        boolean z;
        Iterator<C0587c> it = list2.iterator();
        while (it.hasNext()) {
            C0587c next = it.next();
            if (next.mo8442a().size() != list.size()) {
                Iterator<C0586b> it2 = next.mo8442a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C0586b next2 = it2.next();
                    Iterator<C0586b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: H */
    private static void m787H(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: I */
    private void m788I(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f1080h.size()) {
                break;
            }
            C0587c cVar = this.f1080h.get(i2);
            if (cVar.mo8443b() > i) {
                z2 = cVar.mo8444c(this.f1079g);
                break;
            } else {
                z3 = cVar.mo8444c(this.f1079g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m783C(this.f1079g, this.f1080h)) {
            this.f1080h.add(i2, new C0587c(this.f1079g, i, z));
            m786F(this.f1079g, this.f1080h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m789s(int r11) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p016a0.p017a0.p018g.C0588d.m789s(int):void");
    }

    /* renamed from: t */
    private boolean m790t() {
        C0586b bVar = this.f1079g.get(0);
        C0580b c = bVar.mo8436c();
        C0580b d = bVar.mo8437d();
        if (d == null) {
            return false;
        }
        int a = d.mo8421a();
        int i = 2;
        for (int i2 = 1; i2 < this.f1079g.size(); i2++) {
            C0586b bVar2 = this.f1079g.get(i2);
            a += bVar2.mo8436c().mo8421a();
            i++;
            C0580b d2 = bVar2.mo8437d();
            if (d2 != null) {
                a += d2.mo8421a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == c.mo8422b();
    }

    /* renamed from: u */
    private List<C0586b> m791u(List<C0587c> list, int i) {
        while (i < this.f1080h.size()) {
            C0587c cVar = this.f1080h.get(i);
            this.f1079g.clear();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1079g.addAll(list.get(i2).mo8442a());
            }
            this.f1079g.addAll(cVar.mo8442a());
            if (m784D(this.f1079g)) {
                if (m790t()) {
                    return this.f1079g;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return m791u(arrayList, i + 1);
                } catch (C0712l unused) {
                    continue;
                }
            }
            i++;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: v */
    private List<C0586b> m792v(boolean z) {
        List<C0586b> list = null;
        if (this.f1080h.size() > 25) {
            this.f1080h.clear();
            return null;
        }
        this.f1079g.clear();
        if (z) {
            Collections.reverse(this.f1080h);
        }
        try {
            list = m791u(new ArrayList(), 0);
        } catch (C0712l unused) {
        }
        if (z) {
            Collections.reverse(this.f1080h);
        }
        return list;
    }

    /* renamed from: w */
    static C0716p m793w(List<C0586b> list) {
        String d = AbstractC0598j.m818a(C0585a.m771a(list)).mo8453d();
        C0718r[] a = list.get(0).mo8435b().mo8426a();
        C0718r[] a2 = list.get(list.size() - 1).mo8435b().mo8426a();
        return new C0716p(d, null, new C0718r[]{a[0], a[1], a2[0], a2[1]}, EnumC0577a.RSS_EXPANDED);
    }

    /* renamed from: z */
    private void m794z(C0775a aVar, List<C0586b> list, int i) {
        int[] k = mo8416k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int k2 = aVar.mo8778k();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo8435b().mo8427b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f1082j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < k2) {
            z2 = !aVar.mo8773g(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < k2) {
            if (aVar.mo8773g(i) ^ z3) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m787H(k);
                    }
                    if (AbstractC0579a.m743q(k)) {
                        int[] iArr = this.f1081i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m787H(k);
                    }
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                k[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public C0586b mo8448G(C0775a aVar, List<C0586b> list, int i) {
        C0581c E;
        C0580b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f1082j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m794z(aVar, list, i2);
            E = m785E(aVar, i, z);
            if (E == null) {
                i2 = m781A(aVar, this.f1081i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C0580b x = mo8449x(aVar, E, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo8439f()) {
            try {
                bVar = mo8449x(aVar, E, z, false);
            } catch (C0712l unused) {
                bVar = null;
            }
            return new C0586b(x, bVar, E, true);
        }
        throw C0712l.m1333a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n, p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: b */
    public void mo8434b() {
        this.f1079g.clear();
        this.f1080h.clear();
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        this.f1079g.clear();
        this.f1082j = false;
        try {
            return m793w(mo8450y(i, aVar));
        } catch (C0712l unused) {
            this.f1079g.clear();
            this.f1082j = true;
            return m793w(mo8450y(i, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C0580b mo8449x(C0775a aVar, C0581c cVar, boolean z, boolean z2) {
        int[] j = mo8415j();
        j[0] = 0;
        j[1] = 0;
        j[2] = 0;
        j[3] = 0;
        j[4] = 0;
        j[5] = 0;
        j[6] = 0;
        j[7] = 0;
        int[] b = cVar.mo8427b();
        if (z2) {
            AbstractC0624q.m914g(aVar, b[0], j);
        } else {
            AbstractC0624q.m913f(aVar, b[1], j);
            int i = 0;
            for (int length = j.length - 1; i < length; length--) {
                int i2 = j[i];
                j[i] = j[length];
                j[length] = i2;
                i++;
            }
        }
        float h = ((float) AbstractC0579a.m740h(j)) / ((float) 17);
        float f = ((float) (cVar.mo8427b()[1] - cVar.mo8427b()[0])) / 15.0f;
        if (Math.abs(h - f) / f <= 0.3f) {
            int[] n = mo8419n();
            int[] l = mo8417l();
            float[] o = mo8420o();
            float[] m = mo8418m();
            for (int i3 = 0; i3 < j.length; i3++) {
                float f2 = (((float) j[i3]) * 1.0f) / h;
                int i4 = (int) (0.5f + f2);
                if (i4 < 1) {
                    if (f2 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw C0712l.m1333a();
                    }
                } else if (i4 > 8) {
                    if (f2 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw C0712l.m1333a();
                    }
                }
                int i5 = i3 / 2;
                if ((i3 & 1) == 0) {
                    n[i5] = i4;
                    o[i5] = f2 - ((float) i4);
                } else {
                    l[i5] = i4;
                    m[i5] = f2 - ((float) i4);
                }
            }
            m789s(17);
            int c = (((cVar.mo8428c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = n.length - 1; length2 >= 0; length2--) {
                if (m782B(cVar, z, z2)) {
                    i6 += n[length2] * f1077o[c][length2 * 2];
                }
                i7 += n[length2];
            }
            int i8 = 0;
            for (int length3 = l.length - 1; length3 >= 0; length3--) {
                if (m782B(cVar, z, z2)) {
                    i8 += l[length3] * f1077o[c][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw C0712l.m1333a();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f1073k[i10];
            return new C0580b((C0584f.m770b(n, i11, true) * f1074l[i10]) + C0584f.m770b(l, 9 - i11, false) + f1075m[i10], i9);
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public List<C0586b> mo8450y(int i, C0775a aVar) {
        while (true) {
            try {
                this.f1079g.add(mo8448G(aVar, this.f1079g, i));
            } catch (C0712l e) {
                if (this.f1079g.isEmpty()) {
                    throw e;
                } else if (m790t()) {
                    return this.f1079g;
                } else {
                    boolean z = !this.f1080h.isEmpty();
                    m788I(i, false);
                    if (z) {
                        List<C0586b> v = m792v(false);
                        if (v != null) {
                            return v;
                        }
                        List<C0586b> v2 = m792v(true);
                        if (v2 != null) {
                            return v2;
                        }
                    }
                    throw C0712l.m1333a();
                }
            }
        }
    }
}
