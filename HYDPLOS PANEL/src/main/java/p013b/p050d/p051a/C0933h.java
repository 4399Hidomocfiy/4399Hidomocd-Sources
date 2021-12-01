package p013b.p050d.p051a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import p013b.p050d.p051a.AbstractC0931g;

/* access modifiers changed from: package-private */
/* renamed from: b.d.a.h */
public class C0933h {

    /* renamed from: a */
    int f2014a;

    /* renamed from: b */
    AbstractC0931g f2015b;

    /* renamed from: c */
    Interpolator f2016c;

    /* renamed from: d */
    ArrayList<AbstractC0931g> f2017d;

    /* renamed from: e */
    AbstractC0953l f2018e;

    public C0933h(AbstractC0931g... gVarArr) {
        this.f2014a = gVarArr.length;
        ArrayList<AbstractC0931g> arrayList = new ArrayList<>();
        this.f2017d = arrayList;
        arrayList.addAll(Arrays.asList(gVarArr));
        this.f2017d.get(0);
        AbstractC0931g gVar = this.f2017d.get(this.f2014a - 1);
        this.f2015b = gVar;
        this.f2016c = gVar.mo9146c();
    }

    /* renamed from: c */
    public static C0933h m2546c(float... fArr) {
        int length = fArr.length;
        AbstractC0931g.C0932a[] aVarArr = new AbstractC0931g.C0932a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (AbstractC0931g.C0932a) AbstractC0931g.m2532f(0.0f);
            aVarArr[1] = (AbstractC0931g.C0932a) AbstractC0931g.m2533g(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (AbstractC0931g.C0932a) AbstractC0931g.m2533g(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (AbstractC0931g.C0932a) AbstractC0931g.m2533g(((float) i) / ((float) (length - 1)), fArr[i]);
            }
        }
        return new C0929e(aVarArr);
    }

    /* renamed from: a */
    public C0933h mo9138a() {
        throw null;
    }

    /* renamed from: b */
    public Object mo9139b(float f) {
        throw null;
    }

    /* renamed from: d */
    public void mo9154d(AbstractC0953l lVar) {
        this.f2018e = lVar;
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f2014a; i++) {
            str = str + this.f2017d.get(i).mo9148d() + "  ";
        }
        return str;
    }
}
