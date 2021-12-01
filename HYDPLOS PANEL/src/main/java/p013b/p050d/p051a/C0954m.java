package p013b.p050d.p051a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p013b.p050d.p051a.AbstractC0918a;

/* renamed from: b.d.a.m */
public class C0954m extends AbstractC0918a {

    /* renamed from: s */
    private static ThreadLocal<HandlerC0960f> f2057s = new ThreadLocal<>();

    /* renamed from: t */
    private static final ThreadLocal<ArrayList<C0954m>> f2058t = new C0955a();

    /* renamed from: u */
    private static final ThreadLocal<ArrayList<C0954m>> f2059u = new C0956b();

    /* renamed from: v */
    private static final ThreadLocal<ArrayList<C0954m>> f2060v = new C0957c();

    /* renamed from: w */
    private static final ThreadLocal<ArrayList<C0954m>> f2061w = new C0958d();

    /* renamed from: x */
    private static final ThreadLocal<ArrayList<C0954m>> f2062x = new C0959e();

    /* renamed from: y */
    private static final Interpolator f2063y = new AccelerateDecelerateInterpolator();

    /* renamed from: z */
    private static long f2064z = 10;

    /* renamed from: b */
    long f2065b;

    /* renamed from: c */
    long f2066c = -1;

    /* renamed from: d */
    private boolean f2067d = false;

    /* renamed from: e */
    private int f2068e = 0;

    /* renamed from: f */
    private boolean f2069f = false;

    /* renamed from: g */
    private long f2070g;

    /* renamed from: h */
    int f2071h = 0;

    /* renamed from: i */
    private boolean f2072i = false;

    /* renamed from: j */
    boolean f2073j = false;

    /* renamed from: k */
    private long f2074k = 300;

    /* renamed from: l */
    private long f2075l = 0;

    /* renamed from: m */
    private int f2076m = 0;

    /* renamed from: n */
    private int f2077n = 1;

    /* renamed from: o */
    private Interpolator f2078o = f2063y;

    /* renamed from: p */
    private ArrayList<AbstractC0961g> f2079p = null;

    /* renamed from: q */
    C0950k[] f2080q;

    /* renamed from: r */
    HashMap<String, C0950k> f2081r;

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.m$a */
    public static class C0955a extends ThreadLocal<ArrayList<C0954m>> {
        C0955a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C0954m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.d.a.m$b */
    static class C0956b extends ThreadLocal<ArrayList<C0954m>> {
        C0956b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C0954m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.d.a.m$c */
    static class C0957c extends ThreadLocal<ArrayList<C0954m>> {
        C0957c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C0954m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.d.a.m$d */
    static class C0958d extends ThreadLocal<ArrayList<C0954m>> {
        C0958d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C0954m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: b.d.a.m$e */
    static class C0959e extends ThreadLocal<ArrayList<C0954m>> {
        C0959e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C0954m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.d.a.m$f */
    public static class HandlerC0960f extends Handler {
        private HandlerC0960f() {
        }

        /* synthetic */ HandlerC0960f(C0955a aVar) {
            this();
        }

        public void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) C0954m.f2058t.get();
            ArrayList arrayList2 = (ArrayList) C0954m.f2060v.get();
            int i = message.what;
            if (i == 0) {
                ArrayList arrayList3 = (ArrayList) C0954m.f2059u.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C0954m mVar = (C0954m) arrayList4.get(i2);
                        if (mVar.f2075l == 0) {
                            mVar.m2642I();
                        } else {
                            arrayList2.add(mVar);
                        }
                    }
                }
            } else if (i == 1) {
                z = true;
            } else {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) C0954m.f2062x.get();
            ArrayList arrayList6 = (ArrayList) C0954m.f2061w.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0954m mVar2 = (C0954m) arrayList2.get(i3);
                if (mVar2.m2654y(currentAnimationTimeMillis)) {
                    arrayList5.add(mVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    C0954m mVar3 = (C0954m) arrayList5.get(i4);
                    mVar3.m2642I();
                    mVar3.f2072i = true;
                    arrayList2.remove(mVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                C0954m mVar4 = (C0954m) arrayList.get(i5);
                if (mVar4.mo9211w(currentAnimationTimeMillis)) {
                    arrayList6.add(mVar4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(mVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    ((C0954m) arrayList6.get(i6)).m2655z();
                }
                arrayList6.clear();
            }
            if (!z) {
                return;
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0L, C0954m.f2064z - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    /* renamed from: b.d.a.m$g */
    public interface AbstractC0961g {
        /* renamed from: a */
        void mo9223a(C0954m mVar);
    }

    /* renamed from: C */
    public static C0954m m2640C(float... fArr) {
        C0954m mVar = new C0954m();
        mVar.mo9158F(fArr);
        return mVar;
    }

    /* renamed from: H */
    private void m2641H(boolean z) {
        if (Looper.myLooper() != null) {
            this.f2067d = z;
            this.f2068e = 0;
            this.f2071h = 0;
            this.f2069f = false;
            f2059u.get().add(this);
            if (this.f2075l == 0) {
                mo9209D(mo9208A());
                this.f2071h = 0;
                this.f2072i = true;
                ArrayList<AbstractC0918a.AbstractC0919a> arrayList = this.f1977a;
                if (arrayList != null) {
                    ArrayList arrayList2 = (ArrayList) arrayList.clone();
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC0918a.AbstractC0919a) arrayList2.get(i)).mo9123c(this);
                    }
                }
            }
            HandlerC0960f fVar = f2057s.get();
            if (fVar == null) {
                fVar = new HandlerC0960f(null);
                f2057s.set(fVar);
            }
            fVar.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: I */
    private void m2642I() {
        ArrayList<AbstractC0918a.AbstractC0919a> arrayList;
        mo9156B();
        f2058t.get().add(this);
        if (this.f2075l > 0 && (arrayList = this.f1977a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0918a.AbstractC0919a) arrayList2.get(i)).mo9123c(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: y */
    private boolean m2654y(long j) {
        if (!this.f2069f) {
            this.f2069f = true;
            this.f2070g = j;
            return false;
        }
        long j2 = j - this.f2070g;
        long j3 = this.f2075l;
        if (j2 <= j3) {
            return false;
        }
        this.f2065b = j - (j2 - j3);
        this.f2071h = 1;
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private void m2655z() {
        ArrayList<AbstractC0918a.AbstractC0919a> arrayList;
        f2058t.get().remove(this);
        f2059u.get().remove(this);
        f2060v.get().remove(this);
        this.f2071h = 0;
        if (this.f2072i && (arrayList = this.f1977a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0918a.AbstractC0919a) arrayList2.get(i)).mo9121a(this);
            }
        }
        this.f2072i = false;
    }

    /* renamed from: A */
    public long mo9208A() {
        if (!this.f2073j || this.f2071h == 0) {
            return 0;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f2065b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo9156B() {
        if (!this.f2073j) {
            int length = this.f2080q.length;
            for (int i = 0; i < length; i++) {
                this.f2080q[i].mo9199g();
            }
            this.f2073j = true;
        }
    }

    /* renamed from: D */
    public void mo9209D(long j) {
        mo9156B();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f2071h != 1) {
            this.f2066c = j;
            this.f2071h = 2;
        }
        this.f2065b = currentAnimationTimeMillis - j;
        mo9211w(currentAnimationTimeMillis);
    }

    /* renamed from: E */
    public C0954m mo9117g(long j) {
        if (j >= 0) {
            this.f2074k = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: F */
    public void mo9158F(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            C0950k[] kVarArr = this.f2080q;
            if (kVarArr == null || kVarArr.length == 0) {
                mo9210G(C0950k.m2619i("", fArr));
            } else {
                kVarArr[0].mo9201k(fArr);
            }
            this.f2073j = false;
        }
    }

    /* renamed from: G */
    public void mo9210G(C0950k... kVarArr) {
        int length = kVarArr.length;
        this.f2080q = kVarArr;
        this.f2081r = new HashMap<>(length);
        for (C0950k kVar : kVarArr) {
            this.f2081r.put(kVar.mo9198f(), kVar);
        }
        this.f2073j = false;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: b */
    public void mo9111b() {
        ArrayList<AbstractC0918a.AbstractC0919a> arrayList;
        if (this.f2071h != 0 || f2059u.get().contains(this) || f2060v.get().contains(this)) {
            if (this.f2072i && (arrayList = this.f1977a) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((AbstractC0918a.AbstractC0919a) it.next()).mo9124d(this);
                }
            }
            m2655z();
        }
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: e */
    public boolean mo9115e() {
        return this.f2071h == 1 || this.f2072i;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: h */
    public void mo9118h(long j) {
        this.f2075l = j;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: j */
    public void mo9120j() {
        m2641H(false);
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f2080q != null) {
            for (int i = 0; i < this.f2080q.length; i++) {
                str = str + "\n    " + this.f2080q[i].toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo9164v(float f) {
        float interpolation = this.f2078o.getInterpolation(f);
        int length = this.f2080q.length;
        for (int i = 0; i < length; i++) {
            this.f2080q[i].mo9194a(interpolation);
        }
        ArrayList<AbstractC0961g> arrayList = this.f2079p;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2079p.get(i2).mo9223a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9211w(long r10) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p050d.p051a.C0954m.mo9211w(long):boolean");
    }

    /* renamed from: x */
    public C0954m clone() {
        C0954m mVar = (C0954m) super.clone();
        ArrayList<AbstractC0961g> arrayList = this.f2079p;
        if (arrayList != null) {
            mVar.f2079p = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mVar.f2079p.add(arrayList.get(i));
            }
        }
        mVar.f2066c = -1;
        mVar.f2067d = false;
        mVar.f2068e = 0;
        mVar.f2073j = false;
        mVar.f2071h = 0;
        mVar.f2069f = false;
        C0950k[] kVarArr = this.f2080q;
        if (kVarArr != null) {
            int length = kVarArr.length;
            mVar.f2080q = new C0950k[length];
            mVar.f2081r = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                C0950k b = kVarArr[i2].clone();
                mVar.f2080q[i2] = b;
                mVar.f2081r.put(b.mo9198f(), b);
            }
        }
        return mVar;
    }
}
