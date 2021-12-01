package android.support.constraint.p007d;

import android.support.constraint.p007d.C0048i;
import android.support.constraint.p007d.p008j.C0053d;
import android.support.constraint.p007d.p008j.C0058e;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.d.e */
public class C0043e {

    /* renamed from: p */
    private static int f437p = 1000;

    /* renamed from: q */
    public static C0045f f438q;

    /* renamed from: a */
    int f439a;

    /* renamed from: b */
    private HashMap<String, C0048i> f440b;

    /* renamed from: c */
    private AbstractC0044a f441c;

    /* renamed from: d */
    private int f442d;

    /* renamed from: e */
    private int f443e;

    /* renamed from: f */
    C0040b[] f444f;

    /* renamed from: g */
    public boolean f445g;

    /* renamed from: h */
    private boolean[] f446h;

    /* renamed from: i */
    int f447i;

    /* renamed from: j */
    int f448j;

    /* renamed from: k */
    private int f449k;

    /* renamed from: l */
    final C0041c f450l;

    /* renamed from: m */
    private C0048i[] f451m;

    /* renamed from: n */
    private int f452n;

    /* renamed from: o */
    private final AbstractC0044a f453o;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.d.e$a */
    public interface AbstractC0044a {
        /* renamed from: a */
        void mo121a(AbstractC0044a aVar);

        /* renamed from: b */
        C0048i mo122b(C0043e eVar, boolean[] zArr);

        /* renamed from: c */
        void mo123c(C0048i iVar);

        void clear();

        C0048i getKey();
    }

    public C0043e() {
        this.f439a = 0;
        this.f440b = null;
        this.f442d = 32;
        this.f443e = 32;
        this.f444f = null;
        this.f445g = false;
        this.f446h = new boolean[32];
        this.f447i = 1;
        this.f448j = 0;
        this.f449k = 32;
        this.f451m = new C0048i[f437p];
        this.f452n = 0;
        this.f444f = new C0040b[32];
        m125D();
        C0041c cVar = new C0041c();
        this.f450l = cVar;
        this.f441c = new C0042d(cVar);
        this.f453o = new C0040b(cVar);
    }

    /* renamed from: C */
    private final int m124C(AbstractC0044a aVar, boolean z) {
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f462h++;
        }
        for (int i = 0; i < this.f447i; i++) {
            this.f446h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0045f fVar2 = f438q;
            if (fVar2 != null) {
                fVar2.f463i++;
            }
            i2++;
            if (i2 >= this.f447i * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f446h[aVar.getKey().f485b] = true;
            }
            C0048i b = aVar.mo122b(this, this.f446h);
            if (b != null) {
                boolean[] zArr = this.f446h;
                int i3 = b.f485b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f448j; i5++) {
                    C0040b bVar = this.f444f[i5];
                    if (bVar.f429a.f490g != C0048i.EnumC0049a.UNRESTRICTED && !bVar.f433e && bVar.mo141s(b)) {
                        float f2 = bVar.f432d.mo111f(b);
                        if (f2 < 0.0f) {
                            float f3 = (-bVar.f430b) / f2;
                            if (f3 < f) {
                                i4 = i5;
                                f = f3;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0040b bVar2 = this.f444f[i4];
                    bVar2.f429a.f486c = -1;
                    C0045f fVar3 = f438q;
                    if (fVar3 != null) {
                        fVar3.f464j++;
                    }
                    bVar2.mo145v(b);
                    C0048i iVar = bVar2.f429a;
                    iVar.f486c = i4;
                    iVar.mo176f(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: D */
    private void m125D() {
        int i = 0;
        while (true) {
            C0040b[] bVarArr = this.f444f;
            if (i < bVarArr.length) {
                C0040b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f450l.f434a.release(bVar);
                }
                this.f444f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    private final void m126F(C0040b bVar) {
        if (this.f448j > 0) {
            bVar.f432d.mo119o(bVar, this.f444f);
            if (bVar.f432d.f418a == 0) {
                bVar.f433e = true;
            }
        }
    }

    /* renamed from: a */
    private C0048i m127a(C0048i.EnumC0049a aVar, String str) {
        C0048i acquire = this.f450l.f435b.acquire();
        if (acquire == null) {
            acquire = new C0048i(aVar, str);
        } else {
            acquire.mo174d();
        }
        acquire.mo175e(aVar, str);
        int i = this.f452n;
        int i2 = f437p;
        if (i >= i2) {
            int i3 = i2 * 2;
            f437p = i3;
            this.f451m = (C0048i[]) Arrays.copyOf(this.f451m, i3);
        }
        C0048i[] iVarArr = this.f451m;
        int i4 = this.f452n;
        this.f452n = i4 + 1;
        iVarArr[i4] = acquire;
        return acquire;
    }

    /* renamed from: g */
    private void m128g(C0040b bVar) {
        bVar.mo125d(this, 0);
    }

    /* renamed from: m */
    private final void m129m(C0040b bVar) {
        C0040b[] bVarArr = this.f444f;
        int i = this.f448j;
        if (bVarArr[i] != null) {
            this.f450l.f434a.release(bVarArr[i]);
        }
        C0040b[] bVarArr2 = this.f444f;
        int i2 = this.f448j;
        bVarArr2[i2] = bVar;
        C0048i iVar = bVar.f429a;
        iVar.f486c = i2;
        this.f448j = i2 + 1;
        iVar.mo176f(bVar);
    }

    /* renamed from: o */
    private void m130o() {
        for (int i = 0; i < this.f448j; i++) {
            C0040b bVar = this.f444f[i];
            bVar.f429a.f488e = bVar.f430b;
        }
    }

    /* renamed from: t */
    public static C0040b m131t(C0043e eVar, C0048i iVar, C0048i iVar2, C0048i iVar3, float f, boolean z) {
        C0040b s = eVar.mo165s();
        if (z) {
            eVar.m128g(s);
        }
        s.mo131i(iVar, iVar2, iVar3, f);
        return s;
    }

    /* renamed from: v */
    private int m132v(AbstractC0044a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f448j) {
                z = false;
                break;
            }
            C0040b[] bVarArr = this.f444f;
            if (bVarArr[i].f429a.f490g != C0048i.EnumC0049a.UNRESTRICTED && bVarArr[i].f430b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C0045f fVar = f438q;
            if (fVar != null) {
                fVar.f465k++;
            }
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.f448j) {
                C0040b bVar = this.f444f[i3];
                if (bVar.f429a.f490g != C0048i.EnumC0049a.UNRESTRICTED && !bVar.f433e && bVar.f430b < f) {
                    int i7 = 1;
                    while (i7 < this.f447i) {
                        C0048i iVar = this.f450l.f436c[i7];
                        float f3 = bVar.f432d.mo111f(iVar);
                        if (f3 > f) {
                            for (int i8 = 0; i8 < 7; i8++) {
                                float f4 = iVar.f489f[i8] / f3;
                                if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                    i5 = i7;
                                    i6 = i8;
                                    f2 = f4;
                                    i4 = i3;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C0040b bVar2 = this.f444f[i4];
                bVar2.f429a.f486c = -1;
                C0045f fVar2 = f438q;
                if (fVar2 != null) {
                    fVar2.f464j++;
                }
                bVar2.mo145v(this.f450l.f436c[i5]);
                C0048i iVar2 = bVar2.f429a;
                iVar2.f486c = i4;
                iVar2.mo176f(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f447i / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: x */
    public static C0045f m133x() {
        return f438q;
    }

    /* renamed from: z */
    private void m134z() {
        int i = this.f442d * 2;
        this.f442d = i;
        this.f444f = (C0040b[]) Arrays.copyOf(this.f444f, i);
        C0041c cVar = this.f450l;
        cVar.f436c = (C0048i[]) Arrays.copyOf(cVar.f436c, this.f442d);
        int i2 = this.f442d;
        this.f446h = new boolean[i2];
        this.f443e = i2;
        this.f449k = i2;
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f458d++;
            fVar.f469o = Math.max(fVar.f469o, (long) i2);
            C0045f fVar2 = f438q;
            fVar2.f454A = fVar2.f469o;
        }
    }

    /* renamed from: A */
    public void mo148A() {
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f459e++;
        }
        if (this.f445g) {
            if (fVar != null) {
                fVar.f471q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f448j) {
                    z = true;
                    break;
                } else if (!this.f444f[i].f433e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                C0045f fVar2 = f438q;
                if (fVar2 != null) {
                    fVar2.f470p++;
                }
                m130o();
                return;
            }
        }
        mo149B(this.f441c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo149B(AbstractC0044a aVar) {
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f473s++;
            fVar.f474t = Math.max(fVar.f474t, (long) this.f447i);
            C0045f fVar2 = f438q;
            fVar2.f475u = Math.max(fVar2.f475u, (long) this.f448j);
        }
        m126F((C0040b) aVar);
        m132v(aVar);
        m124C(aVar, false);
        m130o();
    }

    /* renamed from: E */
    public void mo150E() {
        C0041c cVar;
        int i = 0;
        while (true) {
            cVar = this.f450l;
            C0048i[] iVarArr = cVar.f436c;
            if (i >= iVarArr.length) {
                break;
            }
            C0048i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo174d();
            }
            i++;
        }
        cVar.f435b.mo169a(this.f451m, this.f452n);
        this.f452n = 0;
        Arrays.fill(this.f450l.f436c, (Object) null);
        HashMap<String, C0048i> hashMap = this.f440b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f439a = 0;
        this.f441c.clear();
        this.f447i = 1;
        for (int i2 = 0; i2 < this.f448j; i2++) {
            this.f444f[i2].f431c = false;
        }
        m125D();
        this.f448j = 0;
    }

    /* renamed from: b */
    public void mo151b(C0058e eVar, C0058e eVar2, float f, int i) {
        C0053d.EnumC0057d dVar = C0053d.EnumC0057d.LEFT;
        C0048i r = mo164r(eVar.mo234h(dVar));
        C0053d.EnumC0057d dVar2 = C0053d.EnumC0057d.TOP;
        C0048i r2 = mo164r(eVar.mo234h(dVar2));
        C0053d.EnumC0057d dVar3 = C0053d.EnumC0057d.RIGHT;
        C0048i r3 = mo164r(eVar.mo234h(dVar3));
        C0053d.EnumC0057d dVar4 = C0053d.EnumC0057d.BOTTOM;
        C0048i r4 = mo164r(eVar.mo234h(dVar4));
        C0048i r5 = mo164r(eVar2.mo234h(dVar));
        C0048i r6 = mo164r(eVar2.mo234h(dVar2));
        C0048i r7 = mo164r(eVar2.mo234h(dVar3));
        C0048i r8 = mo164r(eVar2.mo234h(dVar4));
        C0040b s = mo165s();
        double d = (double) f;
        double sin = Math.sin(d);
        double d2 = (double) i;
        Double.isNaN(d2);
        s.mo138p(r2, r4, r6, r8, (float) (sin * d2));
        mo153d(s);
        C0040b s2 = mo165s();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        s2.mo138p(r, r3, r5, r7, (float) (cos * d2));
        mo153d(s2);
    }

    /* renamed from: c */
    public void mo152c(C0048i iVar, C0048i iVar2, int i, float f, C0048i iVar3, C0048i iVar4, int i2, int i3) {
        C0040b s = mo165s();
        s.mo128g(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 6) {
            s.mo125d(this, i3);
        }
        mo153d(s);
    }

    /* renamed from: d */
    public void mo153d(C0040b bVar) {
        C0048i u;
        if (bVar != null) {
            C0045f fVar = f438q;
            if (fVar != null) {
                fVar.f460f++;
                if (bVar.f433e) {
                    fVar.f461g++;
                }
            }
            boolean z = true;
            if (this.f448j + 1 >= this.f449k || this.f447i + 1 >= this.f443e) {
                m134z();
            }
            boolean z2 = false;
            if (!bVar.f433e) {
                m126F(bVar);
                if (!bVar.mo142t()) {
                    bVar.mo139q();
                    if (bVar.mo127f(this)) {
                        C0048i q = mo163q();
                        bVar.f429a = q;
                        m129m(bVar);
                        this.f453o.mo121a(bVar);
                        m124C(this.f453o, true);
                        if (q.f486c == -1) {
                            if (bVar.f429a == q && (u = bVar.mo144u(q)) != null) {
                                C0045f fVar2 = f438q;
                                if (fVar2 != null) {
                                    fVar2.f464j++;
                                }
                                bVar.mo145v(u);
                            }
                            if (!bVar.f433e) {
                                bVar.f429a.mo176f(bVar);
                            }
                            this.f448j--;
                        }
                    } else {
                        z = false;
                    }
                    if (bVar.mo140r()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                m129m(bVar);
            }
        }
    }

    /* renamed from: e */
    public C0040b mo154e(C0048i iVar, C0048i iVar2, int i, int i2) {
        C0040b s = mo165s();
        s.mo135m(iVar, iVar2, i);
        if (i2 != 6) {
            s.mo125d(this, i2);
        }
        mo153d(s);
        return s;
    }

    /* renamed from: f */
    public void mo155f(C0048i iVar, int i) {
        C0040b bVar;
        int i2 = iVar.f486c;
        if (i2 != -1) {
            C0040b bVar2 = this.f444f[i2];
            if (!bVar2.f433e) {
                if (bVar2.f432d.f418a == 0) {
                    bVar2.f433e = true;
                } else {
                    bVar = mo165s();
                    bVar.mo134l(iVar, i);
                }
            }
            bVar2.f430b = (float) i;
            return;
        }
        bVar = mo165s();
        bVar.mo130h(iVar, i);
        mo153d(bVar);
    }

    /* renamed from: h */
    public void mo156h(C0048i iVar, C0048i iVar2, boolean z) {
        C0040b s = mo165s();
        C0048i u = mo166u();
        u.f487d = 0;
        s.mo136n(iVar, iVar2, u, 0);
        if (z) {
            mo161n(s, (int) (s.f432d.mo111f(u) * -1.0f), 1);
        }
        mo153d(s);
    }

    /* renamed from: i */
    public void mo157i(C0048i iVar, C0048i iVar2, int i, int i2) {
        C0040b s = mo165s();
        C0048i u = mo166u();
        u.f487d = 0;
        s.mo136n(iVar, iVar2, u, i);
        if (i2 != 6) {
            mo161n(s, (int) (s.f432d.mo111f(u) * -1.0f), i2);
        }
        mo153d(s);
    }

    /* renamed from: j */
    public void mo158j(C0048i iVar, C0048i iVar2, boolean z) {
        C0040b s = mo165s();
        C0048i u = mo166u();
        u.f487d = 0;
        s.mo137o(iVar, iVar2, u, 0);
        if (z) {
            mo161n(s, (int) (s.f432d.mo111f(u) * -1.0f), 1);
        }
        mo153d(s);
    }

    /* renamed from: k */
    public void mo159k(C0048i iVar, C0048i iVar2, int i, int i2) {
        C0040b s = mo165s();
        C0048i u = mo166u();
        u.f487d = 0;
        s.mo137o(iVar, iVar2, u, i);
        if (i2 != 6) {
            mo161n(s, (int) (s.f432d.mo111f(u) * -1.0f), i2);
        }
        mo153d(s);
    }

    /* renamed from: l */
    public void mo160l(C0048i iVar, C0048i iVar2, C0048i iVar3, C0048i iVar4, float f, int i) {
        C0040b s = mo165s();
        s.mo132j(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            s.mo125d(this, i);
        }
        mo153d(s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo161n(C0040b bVar, int i, int i2) {
        bVar.mo126e(mo162p(i2, null), i);
    }

    /* renamed from: p */
    public C0048i mo162p(int i, String str) {
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f466l++;
        }
        if (this.f447i + 1 >= this.f443e) {
            m134z();
        }
        C0048i a = m127a(C0048i.EnumC0049a.ERROR, str);
        int i2 = this.f439a + 1;
        this.f439a = i2;
        this.f447i++;
        a.f485b = i2;
        a.f487d = i;
        this.f450l.f436c[i2] = a;
        this.f441c.mo123c(a);
        return a;
    }

    /* renamed from: q */
    public C0048i mo163q() {
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f468n++;
        }
        if (this.f447i + 1 >= this.f443e) {
            m134z();
        }
        C0048i a = m127a(C0048i.EnumC0049a.SLACK, null);
        int i = this.f439a + 1;
        this.f439a = i;
        this.f447i++;
        a.f485b = i;
        this.f450l.f436c[i] = a;
        return a;
    }

    /* renamed from: r */
    public C0048i mo164r(Object obj) {
        C0048i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f447i + 1 >= this.f443e) {
            m134z();
        }
        if (obj instanceof C0053d) {
            C0053d dVar = (C0053d) obj;
            iVar = dVar.mo192g();
            if (iVar == null) {
                dVar.mo199n(this.f450l);
                iVar = dVar.mo192g();
            }
            int i = iVar.f485b;
            if (i == -1 || i > this.f439a || this.f450l.f436c[i] == null) {
                if (i != -1) {
                    iVar.mo174d();
                }
                int i2 = this.f439a + 1;
                this.f439a = i2;
                this.f447i++;
                iVar.f485b = i2;
                iVar.f490g = C0048i.EnumC0049a.UNRESTRICTED;
                this.f450l.f436c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: s */
    public C0040b mo165s() {
        C0040b acquire = this.f450l.f434a.acquire();
        if (acquire == null) {
            acquire = new C0040b(this.f450l);
        } else {
            acquire.mo146w();
        }
        C0048i.m161b();
        return acquire;
    }

    /* renamed from: u */
    public C0048i mo166u() {
        C0045f fVar = f438q;
        if (fVar != null) {
            fVar.f467m++;
        }
        if (this.f447i + 1 >= this.f443e) {
            m134z();
        }
        C0048i a = m127a(C0048i.EnumC0049a.SLACK, null);
        int i = this.f439a + 1;
        this.f439a = i;
        this.f447i++;
        a.f485b = i;
        this.f450l.f436c[i] = a;
        return a;
    }

    /* renamed from: w */
    public C0041c mo167w() {
        return this.f450l;
    }

    /* renamed from: y */
    public int mo168y(Object obj) {
        C0048i g = ((C0053d) obj).mo192g();
        if (g != null) {
            return (int) (g.f488e + 0.5f);
        }
        return 0;
    }
}
