package p013b.p014a.p015a.p038y.p040d;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.p035x.AbstractC0783i;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0781g;
import p013b.p014a.p015a.p035x.p036m.C0787a;
import p013b.p014a.p015a.p035x.p036m.C0788b;

/* renamed from: b.a.a.y.d.a */
public final class C0806a {

    /* renamed from: a */
    private final C0776b f1665a;

    /* renamed from: b */
    private final C0788b f1666b;

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.y.d.a$b */
    public static final class C0808b {

        /* renamed from: a */
        private final C0718r f1667a;

        /* renamed from: b */
        private final C0718r f1668b;

        /* renamed from: c */
        private final int f1669c;

        private C0808b(C0718r rVar, C0718r rVar2, int i) {
            this.f1667a = rVar;
            this.f1668b = rVar2;
            this.f1669c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0718r mo8877a() {
            return this.f1667a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0718r mo8878b() {
            return this.f1668b;
        }

        /* renamed from: c */
        public int mo8879c() {
            return this.f1669c;
        }

        public String toString() {
            return this.f1667a + "/" + this.f1668b + '/' + this.f1669c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.a.y.d.a$c */
    public static final class C0809c implements Comparator<C0808b>, Serializable {
        private C0809c() {
        }

        /* renamed from: a */
        public int compare(C0808b bVar, C0808b bVar2) {
            return bVar.mo8879c() - bVar2.mo8879c();
        }
    }

    public C0806a(C0776b bVar) {
        this.f1665a = bVar;
        this.f1666b = new C0788b(bVar);
    }

    /* renamed from: a */
    private C0718r m1691a(C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4, int i) {
        float f = (float) i;
        float d = ((float) m1693d(rVar, rVar2)) / f;
        float d2 = (float) m1693d(rVar3, rVar4);
        C0718r rVar5 = new C0718r(rVar4.mo8700c() + (((rVar4.mo8700c() - rVar3.mo8700c()) / d2) * d), rVar4.mo8701d() + (d * ((rVar4.mo8701d() - rVar3.mo8701d()) / d2)));
        float d3 = ((float) m1693d(rVar, rVar3)) / f;
        float d4 = (float) m1693d(rVar2, rVar4);
        C0718r rVar6 = new C0718r(rVar4.mo8700c() + (((rVar4.mo8700c() - rVar2.mo8700c()) / d4) * d3), rVar4.mo8701d() + (d3 * ((rVar4.mo8701d() - rVar2.mo8701d()) / d4)));
        if (m1695f(rVar5)) {
            return (m1695f(rVar6) && Math.abs(m1697h(rVar3, rVar5).mo8879c() - m1697h(rVar2, rVar5).mo8879c()) > Math.abs(m1697h(rVar3, rVar6).mo8879c() - m1697h(rVar2, rVar6).mo8879c())) ? rVar6 : rVar5;
        }
        if (m1695f(rVar6)) {
            return rVar6;
        }
        return null;
    }

    /* renamed from: b */
    private C0718r m1692b(C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4, int i, int i2) {
        float d = ((float) m1693d(rVar, rVar2)) / ((float) i);
        float d2 = (float) m1693d(rVar3, rVar4);
        C0718r rVar5 = new C0718r(rVar4.mo8700c() + (((rVar4.mo8700c() - rVar3.mo8700c()) / d2) * d), rVar4.mo8701d() + (d * ((rVar4.mo8701d() - rVar3.mo8701d()) / d2)));
        float d3 = ((float) m1693d(rVar, rVar3)) / ((float) i2);
        float d4 = (float) m1693d(rVar2, rVar4);
        C0718r rVar6 = new C0718r(rVar4.mo8700c() + (((rVar4.mo8700c() - rVar2.mo8700c()) / d4) * d3), rVar4.mo8701d() + (d3 * ((rVar4.mo8701d() - rVar2.mo8701d()) / d4)));
        if (m1695f(rVar5)) {
            return (m1695f(rVar6) && Math.abs(i - m1697h(rVar3, rVar5).mo8879c()) + Math.abs(i2 - m1697h(rVar2, rVar5).mo8879c()) > Math.abs(i - m1697h(rVar3, rVar6).mo8879c()) + Math.abs(i2 - m1697h(rVar2, rVar6).mo8879c())) ? rVar6 : rVar5;
        }
        if (m1695f(rVar6)) {
            return rVar6;
        }
        return null;
    }

    /* renamed from: d */
    private static int m1693d(C0718r rVar, C0718r rVar2) {
        return C0787a.m1616c(C0718r.m1351b(rVar, rVar2));
    }

    /* renamed from: e */
    private static void m1694e(Map<C0718r, Integer> map, C0718r rVar) {
        Integer num = map.get(rVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(rVar, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m1695f(C0718r rVar) {
        return rVar.mo8700c() >= 0.0f && rVar.mo8700c() < ((float) this.f1665a.mo8799j()) && rVar.mo8701d() > 0.0f && rVar.mo8701d() < ((float) this.f1665a.mo8795g());
    }

    /* renamed from: g */
    private static C0776b m1696g(C0776b bVar, C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return AbstractC0783i.m1599b().mo8821c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, rVar.mo8700c(), rVar.mo8701d(), rVar4.mo8700c(), rVar4.mo8701d(), rVar3.mo8700c(), rVar3.mo8701d(), rVar2.mo8700c(), rVar2.mo8701d());
    }

    /* renamed from: h */
    private C0808b m1697h(C0718r rVar, C0718r rVar2) {
        int c = (int) rVar.mo8700c();
        int d = (int) rVar.mo8701d();
        int c2 = (int) rVar2.mo8700c();
        int d2 = (int) rVar2.mo8701d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            d = c;
            c = d;
            d2 = c2;
            c2 = d2;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i3 = (-abs) / 2;
        int i4 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean d3 = this.f1665a.mo8791d(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean d4 = this.f1665a.mo8791d(z ? d : c, z ? c : d);
            if (d4 != d3) {
                i++;
                d3 = d4;
            }
            i3 += abs2;
            if (i3 > 0) {
                if (d == d2) {
                    break;
                }
                d += i4;
                i3 -= abs;
            }
            c += i2;
        }
        return new C0808b(rVar, rVar2, i);
    }

    /* renamed from: c */
    public C0781g mo8876c() {
        C0718r rVar;
        C0776b bVar;
        C0718r[] c = this.f1666b.mo8828c();
        C0718r rVar2 = c[0];
        C0718r rVar3 = c[1];
        C0718r rVar4 = c[2];
        C0718r rVar5 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m1697h(rVar2, rVar3));
        arrayList.add(m1697h(rVar2, rVar4));
        arrayList.add(m1697h(rVar3, rVar5));
        arrayList.add(m1697h(rVar4, rVar5));
        C0718r rVar6 = null;
        Collections.sort(arrayList, new C0809c());
        C0808b bVar2 = (C0808b) arrayList.get(0);
        C0808b bVar3 = (C0808b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m1694e(hashMap, bVar2.mo8877a());
        m1694e(hashMap, bVar2.mo8878b());
        m1694e(hashMap, bVar3.mo8877a());
        m1694e(hashMap, bVar3.mo8878b());
        C0718r rVar7 = null;
        C0718r rVar8 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0718r rVar9 = (C0718r) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                rVar7 = rVar9;
            } else if (rVar6 == null) {
                rVar6 = rVar9;
            } else {
                rVar8 = rVar9;
            }
        }
        if (rVar6 == null || rVar7 == null || rVar8 == null) {
            throw C0712l.m1333a();
        }
        C0718r[] rVarArr = {rVar6, rVar7, rVar8};
        C0718r.m1352e(rVarArr);
        C0718r rVar10 = rVarArr[0];
        C0718r rVar11 = rVarArr[1];
        C0718r rVar12 = rVarArr[2];
        C0718r rVar13 = !hashMap.containsKey(rVar2) ? rVar2 : !hashMap.containsKey(rVar3) ? rVar3 : !hashMap.containsKey(rVar4) ? rVar4 : rVar5;
        int c2 = m1697h(rVar12, rVar13).mo8879c();
        int c3 = m1697h(rVar10, rVar13).mo8879c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            rVar = rVar12;
            C0718r b = m1692b(rVar11, rVar10, rVar12, rVar13, i, i2);
            if (b != null) {
                rVar13 = b;
            }
            int c4 = m1697h(rVar, rVar13).mo8879c();
            int c5 = m1697h(rVar10, rVar13).mo8879c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m1696g(this.f1665a, rVar, rVar11, rVar10, rVar13, c4, c5);
        } else {
            C0718r a = m1691a(rVar11, rVar10, rVar12, rVar13, Math.min(i2, i));
            if (a != null) {
                rVar13 = a;
            }
            int max = Math.max(m1697h(rVar12, rVar13).mo8879c(), m1697h(rVar10, rVar13).mo8879c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            bVar = m1696g(this.f1665a, rVar12, rVar11, rVar10, rVar13, max, max);
            rVar = rVar12;
        }
        return new C0781g(bVar, new C0718r[]{rVar, rVar11, rVar10, rVar13});
    }
}
