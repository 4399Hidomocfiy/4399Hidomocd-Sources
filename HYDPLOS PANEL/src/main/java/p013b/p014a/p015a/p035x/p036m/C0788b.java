package p013b.p014a.p015a.p035x.p036m;

import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.x.m.b */
public final class C0788b {

    /* renamed from: a */
    private final C0776b f1605a;

    /* renamed from: b */
    private final int f1606b;

    /* renamed from: c */
    private final int f1607c;

    /* renamed from: d */
    private final int f1608d;

    /* renamed from: e */
    private final int f1609e;

    /* renamed from: f */
    private final int f1610f;

    /* renamed from: g */
    private final int f1611g;

    public C0788b(C0776b bVar) {
        this(bVar, 10, bVar.mo8799j() / 2, bVar.mo8795g() / 2);
    }

    public C0788b(C0776b bVar, int i, int i2, int i3) {
        this.f1605a = bVar;
        int g = bVar.mo8795g();
        this.f1606b = g;
        int j = bVar.mo8799j();
        this.f1607c = j;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f1608d = i5;
        int i6 = i2 + i4;
        this.f1609e = i6;
        int i7 = i3 - i4;
        this.f1611g = i7;
        int i8 = i3 + i4;
        this.f1610f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= g || i6 >= j) {
            throw C0712l.m1333a();
        }
    }

    /* renamed from: a */
    private C0718r[] m1617a(C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4) {
        float c = rVar.mo8700c();
        float d = rVar.mo8701d();
        float c2 = rVar2.mo8700c();
        float d2 = rVar2.mo8701d();
        float c3 = rVar3.mo8700c();
        float d3 = rVar3.mo8701d();
        float c4 = rVar4.mo8700c();
        float d4 = rVar4.mo8701d();
        if (c < ((float) this.f1607c) / 2.0f) {
            return new C0718r[]{new C0718r(c4 - 1.0f, d4 + 1.0f), new C0718r(c2 + 1.0f, d2 + 1.0f), new C0718r(c3 - 1.0f, d3 - 1.0f), new C0718r(c + 1.0f, d - 1.0f)};
        }
        return new C0718r[]{new C0718r(c4 + 1.0f, d4 + 1.0f), new C0718r(c2 + 1.0f, d2 - 1.0f), new C0718r(c3 - 1.0f, d3 + 1.0f), new C0718r(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m1618b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f1605a.mo8791d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f1605a.mo8791d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C0718r m1619d(float f, float f2, float f3, float f4) {
        int c = C0787a.m1616c(C0787a.m1614a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C0787a.m1616c((f8 * f6) + f);
            int c3 = C0787a.m1616c((f8 * f7) + f2);
            if (this.f1605a.mo8791d(c2, c3)) {
                return new C0718r((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C0718r[] mo8828c() {
        int i = this.f1608d;
        int i2 = this.f1609e;
        int i3 = this.f1611g;
        int i4 = this.f1610f;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f1607c) {
                    z8 = m1618b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f1607c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f1606b) {
                    z10 = m1618b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f1606b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = m1618b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z2 = z9;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = m1618b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z2 = true;
                        z7 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z2) {
                z6 = true;
            }
        }
        z = true;
        if (z || !z6) {
            throw C0712l.m1333a();
        }
        int i5 = i2 - i;
        C0718r rVar = null;
        C0718r rVar2 = null;
        for (int i6 = 1; i6 < i5; i6++) {
            rVar2 = m1619d((float) i, (float) (i4 - i6), (float) (i + i6), (float) i4);
            if (rVar2 != null) {
                break;
            }
        }
        if (rVar2 != null) {
            C0718r rVar3 = null;
            for (int i7 = 1; i7 < i5; i7++) {
                rVar3 = m1619d((float) i, (float) (i3 + i7), (float) (i + i7), (float) i3);
                if (rVar3 != null) {
                    break;
                }
            }
            if (rVar3 != null) {
                C0718r rVar4 = null;
                for (int i8 = 1; i8 < i5; i8++) {
                    rVar4 = m1619d((float) i2, (float) (i3 + i8), (float) (i2 - i8), (float) i3);
                    if (rVar4 != null) {
                        break;
                    }
                }
                if (rVar4 != null) {
                    for (int i9 = 1; i9 < i5; i9++) {
                        rVar = m1619d((float) i2, (float) (i4 - i9), (float) (i2 - i9), (float) i4);
                        if (rVar != null) {
                            break;
                        }
                    }
                    if (rVar != null) {
                        return m1617a(rVar, rVar2, rVar4, rVar3);
                    }
                    throw C0712l.m1333a();
                }
                throw C0712l.m1333a();
            }
            throw C0712l.m1333a();
        }
        throw C0712l.m1333a();
    }
}
