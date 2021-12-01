package p013b.p014a.p015a.p016a0.p017a0;

import bsh.org.objectweb.asm.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013b.p014a.p015a.AbstractC0719s;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p016a0.AbstractC0624q;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.a0.e */
public final class C0583e extends AbstractC0579a {

    /* renamed from: i */
    private static final int[] f1058i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f1059j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f1060k = {0, Constants.IF_ICMPLT, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f1061l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f1062m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f1063n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f1064o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C0582d> f1065g = new ArrayList();

    /* renamed from: h */
    private final List<C0582d> f1066h = new ArrayList();

    /* renamed from: s */
    private static void m759s(Collection<C0582d> collection, C0582d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C0582d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0582d next = it.next();
                if (next.mo8422b() == dVar.mo8422b()) {
                    next.mo8433e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r1 < 4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        if (r1 < 4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r10 = false;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m760t(boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.p016a0.p017a0.C0583e.m760t(boolean, int):void");
    }

    /* renamed from: u */
    private static boolean m761u(C0582d dVar, C0582d dVar2) {
        int a = (dVar.mo8421a() + (dVar2.mo8421a() * 16)) % 79;
        int c = (dVar.mo8432d().mo8428c() * 9) + dVar2.mo8432d().mo8428c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: v */
    private static C0716p m762v(C0582d dVar, C0582d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo8422b()) * 4537077) + ((long) dVar2.mo8422b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C0718r[] a = dVar.mo8432d().mo8426a();
        C0718r[] a2 = dVar2.mo8432d().mo8426a();
        return new C0716p(String.valueOf(sb.toString()), null, new C0718r[]{a[0], a[1], a2[0], a2[1]}, EnumC0577a.RSS_14);
    }

    /* renamed from: w */
    private C0580b m763w(C0775a aVar, C0581c cVar, boolean z) {
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
        if (z) {
            AbstractC0624q.m914g(aVar, b[0], j);
        } else {
            AbstractC0624q.m913f(aVar, b[1] + 1, j);
            int i = 0;
            for (int length = j.length - 1; i < length; length--) {
                int i2 = j[i];
                j[i] = j[length];
                j[length] = i2;
                i++;
            }
        }
        int i3 = z ? 16 : 15;
        float h = ((float) AbstractC0579a.m740h(j)) / ((float) i3);
        int[] n = mo8419n();
        int[] l = mo8417l();
        float[] o = mo8420o();
        float[] m = mo8418m();
        for (int i4 = 0; i4 < j.length; i4++) {
            float f = ((float) j[i4]) / h;
            int i5 = (int) (0.5f + f);
            if (i5 < 1) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                n[i6] = i5;
                o[i6] = f - ((float) i5);
            } else {
                l[i6] = i5;
                m[i6] = f - ((float) i5);
            }
        }
        m760t(z, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = n.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + n[length2];
            i8 += n[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = l.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + l[length3];
            i10 += l[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (z) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw C0712l.m1333a();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f1062m[i12];
            return new C0580b((C0584f.m770b(n, i13, false) * f1058i[i12]) + C0584f.m770b(l, 9 - i13, true) + f1060k[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw C0712l.m1333a();
        } else {
            int i14 = (10 - i10) / 2;
            int i15 = f1063n[i14];
            return new C0580b((C0584f.m770b(l, 9 - i15, false) * f1059j[i14]) + C0584f.m770b(n, i15, true) + f1061l[i14], i11);
        }
    }

    /* renamed from: x */
    private C0582d m764x(C0775a aVar, boolean z, int i, Map<EnumC0704e, ?> map) {
        try {
            int[] y = m765y(aVar, 0, z);
            C0581c z2 = m766z(aVar, i, z, y);
            AbstractC0719s sVar = map == null ? null : (AbstractC0719s) map.get(EnumC0704e.NEED_RESULT_POINT_CALLBACK);
            if (sVar != null) {
                float f = ((float) (y[0] + y[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo8778k() - 1)) - f;
                }
                sVar.mo8705a(new C0718r(f, (float) i));
            }
            C0580b w = m763w(aVar, z2, true);
            C0580b w2 = m763w(aVar, z2, false);
            return new C0582d((w.mo8422b() * 1597) + w2.mo8422b(), w.mo8421a() + (w2.mo8421a() * 4), z2);
        } catch (C0712l unused) {
            return null;
        }
    }

    /* renamed from: y */
    private int[] m765y(C0775a aVar, int i, boolean z) {
        int[] k = mo8416k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int k2 = aVar.mo8778k();
        boolean z2 = false;
        while (i < k2) {
            z2 = !aVar.mo8773g(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < k2) {
            if (aVar.mo8773g(i) ^ z2) {
                k[i3] = k[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (AbstractC0579a.m743q(k)) {
                    return new int[]{i2, i};
                } else {
                    i2 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i3--;
                }
                k[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: z */
    private C0581c m766z(C0775a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean g = aVar.mo8773g(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo8773g(i4) ^ g)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] k = mo8416k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = iArr[0] - i5;
        int r = AbstractC0579a.m744r(k, f1064o);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo8778k() - 1) - i6;
            i3 = (aVar.mo8778k() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C0581c(r, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    @Override // p013b.p014a.p015a.AbstractC0714n, p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: b */
    public void mo8434b() {
        this.f1065g.clear();
        this.f1066h.clear();
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        m759s(this.f1065g, m764x(aVar, false, i, map));
        aVar.mo8781o();
        m759s(this.f1066h, m764x(aVar, true, i, map));
        aVar.mo8781o();
        int size = this.f1065g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0582d dVar = this.f1065g.get(i2);
            if (dVar.mo8431c() > 1) {
                int size2 = this.f1066h.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0582d dVar2 = this.f1066h.get(i3);
                    if (dVar2.mo8431c() > 1 && m761u(dVar, dVar2)) {
                        return m762v(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw C0712l.m1333a();
    }
}
