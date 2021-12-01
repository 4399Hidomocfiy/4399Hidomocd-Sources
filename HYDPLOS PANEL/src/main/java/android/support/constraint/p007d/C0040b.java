package android.support.constraint.p007d;

import android.support.constraint.p007d.C0043e;
import android.support.constraint.p007d.C0048i;

/* renamed from: android.support.constraint.d.b */
public class C0040b implements C0043e.AbstractC0044a {

    /* renamed from: a */
    C0048i f429a = null;

    /* renamed from: b */
    float f430b = 0.0f;

    /* renamed from: c */
    boolean f431c;

    /* renamed from: d */
    public final C0039a f432d;

    /* renamed from: e */
    boolean f433e = false;

    public C0040b(C0041c cVar) {
        this.f432d = new C0039a(this, cVar);
    }

    @Override // android.support.constraint.p007d.C0043e.AbstractC0044a
    /* renamed from: a */
    public void mo121a(C0043e.AbstractC0044a aVar) {
        if (aVar instanceof C0040b) {
            C0040b bVar = (C0040b) aVar;
            this.f429a = null;
            this.f432d.mo108c();
            int i = 0;
            while (true) {
                C0039a aVar2 = bVar.f432d;
                if (i < aVar2.f418a) {
                    this.f432d.mo106a(aVar2.mo113h(i), bVar.f432d.mo114i(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.support.constraint.p007d.C0043e.AbstractC0044a
    /* renamed from: b */
    public C0048i mo122b(C0043e eVar, boolean[] zArr) {
        return this.f432d.mo112g(zArr, null);
    }

    @Override // android.support.constraint.p007d.C0043e.AbstractC0044a
    /* renamed from: c */
    public void mo123c(C0048i iVar) {
        int i = iVar.f487d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f432d.mo116l(iVar, f);
    }

    @Override // android.support.constraint.p007d.C0043e.AbstractC0044a
    public void clear() {
        this.f432d.mo108c();
        this.f429a = null;
        this.f430b = 0.0f;
    }

    /* renamed from: d */
    public C0040b mo125d(C0043e eVar, int i) {
        this.f432d.mo116l(eVar.mo162p(i, "ep"), 1.0f);
        this.f432d.mo116l(eVar.mo162p(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0040b mo126e(C0048i iVar, int i) {
        this.f432d.mo116l(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo127f(C0043e eVar) {
        boolean z;
        C0048i b = this.f432d.mo107b(eVar);
        if (b == null) {
            z = true;
        } else {
            mo145v(b);
            z = false;
        }
        if (this.f432d.f418a == 0) {
            this.f433e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0040b mo128g(C0048i iVar, C0048i iVar2, int i, float f, C0048i iVar3, C0048i iVar4, int i2) {
        float f2;
        if (iVar2 == iVar3) {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar4, 1.0f);
            this.f432d.mo116l(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
            this.f432d.mo116l(iVar3, -1.0f);
            this.f432d.mo116l(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (float) ((-i) + i2);
            }
            return this;
        } else if (f <= 0.0f) {
            this.f432d.mo116l(iVar, -1.0f);
            this.f432d.mo116l(iVar2, 1.0f);
            f2 = (float) i;
        } else if (f >= 1.0f) {
            this.f432d.mo116l(iVar3, -1.0f);
            this.f432d.mo116l(iVar4, 1.0f);
            f2 = (float) i2;
        } else {
            float f3 = 1.0f - f;
            this.f432d.mo116l(iVar, f3 * 1.0f);
            this.f432d.mo116l(iVar2, f3 * -1.0f);
            this.f432d.mo116l(iVar3, -1.0f * f);
            this.f432d.mo116l(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                f2 = (((float) (-i)) * f3) + (((float) i2) * f);
            }
            return this;
        }
        this.f430b = f2;
        return this;
    }

    @Override // android.support.constraint.p007d.C0043e.AbstractC0044a
    public C0048i getKey() {
        return this.f429a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0040b mo130h(C0048i iVar, int i) {
        this.f429a = iVar;
        float f = (float) i;
        iVar.f488e = f;
        this.f430b = f;
        this.f433e = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0040b mo131i(C0048i iVar, C0048i iVar2, C0048i iVar3, float f) {
        this.f432d.mo116l(iVar, -1.0f);
        this.f432d.mo116l(iVar2, 1.0f - f);
        this.f432d.mo116l(iVar3, f);
        return this;
    }

    /* renamed from: j */
    public C0040b mo132j(C0048i iVar, C0048i iVar2, C0048i iVar3, C0048i iVar4, float f) {
        this.f432d.mo116l(iVar, -1.0f);
        this.f432d.mo116l(iVar2, 1.0f);
        this.f432d.mo116l(iVar3, f);
        this.f432d.mo116l(iVar4, -f);
        return this;
    }

    /* renamed from: k */
    public C0040b mo133k(float f, float f2, float f3, C0048i iVar, C0048i iVar2, C0048i iVar3, C0048i iVar4) {
        this.f430b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
            this.f432d.mo116l(iVar4, 1.0f);
            this.f432d.mo116l(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f432d.mo116l(iVar3, 1.0f);
            this.f432d.mo116l(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
            this.f432d.mo116l(iVar4, f4);
            this.f432d.mo116l(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: l */
    public C0040b mo134l(C0048i iVar, int i) {
        C0039a aVar;
        float f;
        if (i < 0) {
            this.f430b = (float) (i * -1);
            aVar = this.f432d;
            f = 1.0f;
        } else {
            this.f430b = (float) i;
            aVar = this.f432d;
            f = -1.0f;
        }
        aVar.mo116l(iVar, f);
        return this;
    }

    /* renamed from: m */
    public C0040b mo135m(C0048i iVar, C0048i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f430b = (float) i;
        }
        if (!z) {
            this.f432d.mo116l(iVar, -1.0f);
            this.f432d.mo116l(iVar2, 1.0f);
        } else {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C0040b mo136n(C0048i iVar, C0048i iVar2, C0048i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f430b = (float) i;
        }
        if (!z) {
            this.f432d.mo116l(iVar, -1.0f);
            this.f432d.mo116l(iVar2, 1.0f);
            this.f432d.mo116l(iVar3, 1.0f);
        } else {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
            this.f432d.mo116l(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0040b mo137o(C0048i iVar, C0048i iVar2, C0048i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f430b = (float) i;
        }
        if (!z) {
            this.f432d.mo116l(iVar, -1.0f);
            this.f432d.mo116l(iVar2, 1.0f);
            this.f432d.mo116l(iVar3, -1.0f);
        } else {
            this.f432d.mo116l(iVar, 1.0f);
            this.f432d.mo116l(iVar2, -1.0f);
            this.f432d.mo116l(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C0040b mo138p(C0048i iVar, C0048i iVar2, C0048i iVar3, C0048i iVar4, float f) {
        this.f432d.mo116l(iVar3, 0.5f);
        this.f432d.mo116l(iVar4, 0.5f);
        this.f432d.mo116l(iVar, -0.5f);
        this.f432d.mo116l(iVar2, -0.5f);
        this.f430b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo139q() {
        float f = this.f430b;
        if (f < 0.0f) {
            this.f430b = f * -1.0f;
            this.f432d.mo115j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo140r() {
        C0048i iVar = this.f429a;
        return iVar != null && (iVar.f490g == C0048i.EnumC0049a.UNRESTRICTED || this.f430b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo141s(C0048i iVar) {
        return this.f432d.mo109d(iVar);
    }

    /* renamed from: t */
    public boolean mo142t() {
        return this.f429a == null && this.f430b == 0.0f && this.f432d.f418a == 0;
    }

    public String toString() {
        return mo147x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C0048i mo144u(C0048i iVar) {
        return this.f432d.mo112g(null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo145v(C0048i iVar) {
        C0048i iVar2 = this.f429a;
        if (iVar2 != null) {
            this.f432d.mo116l(iVar2, -1.0f);
            this.f429a = null;
        }
        float m = this.f432d.mo117m(iVar, true) * -1.0f;
        this.f429a = iVar;
        if (m != 1.0f) {
            this.f430b /= m;
            this.f432d.mo110e(m);
        }
    }

    /* renamed from: w */
    public void mo146w() {
        this.f429a = null;
        this.f432d.mo108c();
        this.f430b = 0.0f;
        this.f433e = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo147x() {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.C0040b.mo147x():java.lang.String");
    }
}
