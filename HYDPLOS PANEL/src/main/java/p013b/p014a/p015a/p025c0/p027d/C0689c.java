package p013b.p014a.p015a.p025c0.p027d;

import java.util.Map;
import p013b.p014a.p015a.AbstractC0719s;
import p013b.p014a.p015a.C0712l;
import p013b.p014a.p015a.C0718r;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p025c0.p026c.C0684j;
import p013b.p014a.p015a.p035x.AbstractC0783i;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p035x.C0781g;
import p013b.p014a.p015a.p035x.C0785k;
import p013b.p014a.p015a.p035x.p036m.C0787a;

/* renamed from: b.a.a.c0.d.c */
public class C0689c {

    /* renamed from: a */
    private final C0776b f1307a;

    /* renamed from: b */
    private AbstractC0719s f1308b;

    public C0689c(C0776b bVar) {
        this.f1307a = bVar;
    }

    /* renamed from: b */
    private float m1225b(C0718r rVar, C0718r rVar2) {
        float j = m1230j((int) rVar.mo8700c(), (int) rVar.mo8701d(), (int) rVar2.mo8700c(), (int) rVar2.mo8701d());
        float j2 = m1230j((int) rVar2.mo8700c(), (int) rVar2.mo8701d(), (int) rVar.mo8700c(), (int) rVar.mo8701d());
        return Float.isNaN(j) ? j2 / 7.0f : Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m1226c(C0718r rVar, C0718r rVar2, C0718r rVar3, float f) {
        int c = ((C0787a.m1616c(C0718r.m1351b(rVar, rVar2) / f) + C0787a.m1616c(C0718r.m1351b(rVar, rVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C0712l.m1333a();
    }

    /* renamed from: d */
    private static C0785k m1227d(C0718r rVar, C0718r rVar2, C0718r rVar3, C0718r rVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (rVar4 != null) {
            f2 = rVar4.mo8700c();
            f = rVar4.mo8701d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (rVar2.mo8700c() - rVar.mo8700c()) + rVar3.mo8700c();
            f = (rVar2.mo8701d() - rVar.mo8701d()) + rVar3.mo8701d();
            f3 = f4;
        }
        return C0785k.m1607b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, rVar.mo8700c(), rVar.mo8701d(), rVar2.mo8700c(), rVar2.mo8701d(), f2, f, rVar3.mo8700c(), rVar3.mo8701d());
    }

    /* renamed from: h */
    private static C0776b m1228h(C0776b bVar, C0785k kVar, int i) {
        return AbstractC0783i.m1599b().mo8822d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m1229i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C0689c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f1307a.mo8791d(i18, i19)) {
                if (i17 == 2) {
                    return C0787a.m1615b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C0787a.m1615b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m1230j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m1229i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f1307a.mo8799j()) {
            f = ((float) ((this.f1307a.mo8799j() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f1307a.mo8799j() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f1307a.mo8795g()) {
            f2 = ((float) ((this.f1307a.mo8795g() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f1307a.mo8795g() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m1229i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo8639a(C0718r rVar, C0718r rVar2, C0718r rVar3) {
        return (m1225b(rVar, rVar2) + m1225b(rVar, rVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C0781g mo8640e(Map<EnumC0704e, ?> map) {
        AbstractC0719s sVar = map == null ? null : (AbstractC0719s) map.get(EnumC0704e.NEED_RESULT_POINT_CALLBACK);
        this.f1308b = sVar;
        return mo8642g(new C0691e(this.f1307a, sVar).mo8647e(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C0687a mo8641f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f1307a.mo8799j() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f1307a.mo8795g() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C0688b(this.f1307a, max, max2, min, min2, f, this.f1308b).mo8638c();
            }
            throw C0712l.m1333a();
        }
        throw C0712l.m1333a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C0781g mo8642g(C0695f fVar) {
        C0690d b = fVar.mo8654b();
        C0690d c = fVar.mo8655c();
        C0690d a = fVar.mo8653a();
        float a2 = mo8639a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m1226c(b, c, a, a2);
            C0684j g = C0684j.m1204g(c2);
            int e = g.mo8625e() - 7;
            C0687a aVar = null;
            if (g.mo8624d().length > 0) {
                float c3 = (c.mo8700c() - b.mo8700c()) + a.mo8700c();
                float d = (c.mo8701d() - b.mo8701d()) + a.mo8701d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo8700c() + ((c3 - b.mo8700c()) * f));
                int d2 = (int) (b.mo8701d() + (f * (d - b.mo8701d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        aVar = mo8641f(a2, c4, d2, (float) i);
                        break;
                    } catch (C0712l unused) {
                    }
                }
            }
            return new C0781g(m1228h(this.f1307a, m1227d(b, c, a, aVar, c2), c2), aVar == null ? new C0718r[]{a, b, c} : new C0718r[]{a, b, c, aVar});
        }
        throw C0712l.m1333a();
    }
}
