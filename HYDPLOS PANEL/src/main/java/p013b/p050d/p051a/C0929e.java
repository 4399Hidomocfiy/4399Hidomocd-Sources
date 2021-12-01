package p013b.p050d.p051a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import p013b.p050d.p051a.AbstractC0931g;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.e */
public class C0929e extends C0933h {

    /* renamed from: f */
    private float f2006f;

    /* renamed from: g */
    private float f2007g;

    /* renamed from: h */
    private float f2008h;

    /* renamed from: i */
    private boolean f2009i = true;

    public C0929e(AbstractC0931g.C0932a... aVarArr) {
        super(aVarArr);
    }

    @Override // p013b.p050d.p051a.C0933h
    /* renamed from: b */
    public Object mo9139b(float f) {
        return Float.valueOf(mo9142f(f));
    }

    /* renamed from: e */
    public C0929e clone() {
        ArrayList<AbstractC0931g> arrayList = this.f2017d;
        int size = arrayList.size();
        AbstractC0931g.C0932a[] aVarArr = new AbstractC0931g.C0932a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (AbstractC0931g.C0932a) arrayList.get(i).clone();
        }
        return new C0929e(aVarArr);
    }

    /* renamed from: f */
    public float mo9142f(float f) {
        Object d;
        int i = this.f2014a;
        if (i != 2) {
            if (f > 0.0f) {
                if (f < 1.0f) {
                    AbstractC0931g.C0932a aVar = (AbstractC0931g.C0932a) this.f2017d.get(0);
                    int i2 = 1;
                    while (true) {
                        int i3 = this.f2014a;
                        if (i2 >= i3) {
                            d = this.f2017d.get(i3 - 1).mo9148d();
                            break;
                        }
                        AbstractC0931g.C0932a aVar2 = (AbstractC0931g.C0932a) this.f2017d.get(i2);
                        if (f < aVar2.mo9145b()) {
                            Interpolator c = aVar2.mo9146c();
                            if (c != null) {
                                f = c.getInterpolation(f);
                            }
                            float b = (f - aVar.mo9145b()) / (aVar2.mo9145b() - aVar.mo9145b());
                            float k = aVar.mo9153k();
                            float k2 = aVar2.mo9153k();
                            AbstractC0953l lVar = this.f2018e;
                            return lVar == null ? k + (b * (k2 - k)) : ((Number) lVar.evaluate(b, Float.valueOf(k), Float.valueOf(k2))).floatValue();
                        }
                        i2++;
                        aVar = aVar2;
                    }
                } else {
                    AbstractC0931g.C0932a aVar3 = (AbstractC0931g.C0932a) this.f2017d.get(i - 2);
                    AbstractC0931g.C0932a aVar4 = (AbstractC0931g.C0932a) this.f2017d.get(this.f2014a - 1);
                    float k3 = aVar3.mo9153k();
                    float k4 = aVar4.mo9153k();
                    float b2 = aVar3.mo9145b();
                    float b3 = aVar4.mo9145b();
                    Interpolator c2 = aVar4.mo9146c();
                    if (c2 != null) {
                        f = c2.getInterpolation(f);
                    }
                    float f2 = (f - b2) / (b3 - b2);
                    AbstractC0953l lVar2 = this.f2018e;
                    return lVar2 == null ? k3 + (f2 * (k4 - k3)) : ((Number) lVar2.evaluate(f2, Float.valueOf(k3), Float.valueOf(k4))).floatValue();
                }
            } else {
                AbstractC0931g.C0932a aVar5 = (AbstractC0931g.C0932a) this.f2017d.get(0);
                AbstractC0931g.C0932a aVar6 = (AbstractC0931g.C0932a) this.f2017d.get(1);
                float k5 = aVar5.mo9153k();
                float k6 = aVar6.mo9153k();
                float b4 = aVar5.mo9145b();
                float b5 = aVar6.mo9145b();
                Interpolator c3 = aVar6.mo9146c();
                if (c3 != null) {
                    f = c3.getInterpolation(f);
                }
                float f3 = (f - b4) / (b5 - b4);
                AbstractC0953l lVar3 = this.f2018e;
                return lVar3 == null ? k5 + (f3 * (k6 - k5)) : ((Number) lVar3.evaluate(f3, Float.valueOf(k5), Float.valueOf(k6))).floatValue();
            }
        } else {
            if (this.f2009i) {
                this.f2009i = false;
                this.f2006f = ((AbstractC0931g.C0932a) this.f2017d.get(0)).mo9153k();
                float k7 = ((AbstractC0931g.C0932a) this.f2017d.get(1)).mo9153k();
                this.f2007g = k7;
                this.f2008h = k7 - this.f2006f;
            }
            Interpolator interpolator = this.f2016c;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            AbstractC0953l lVar4 = this.f2018e;
            if (lVar4 == null) {
                return this.f2006f + (f * this.f2008h);
            }
            d = lVar4.evaluate(f, Float.valueOf(this.f2006f), Float.valueOf(this.f2007g));
        }
        return ((Number) d).floatValue();
    }
}
