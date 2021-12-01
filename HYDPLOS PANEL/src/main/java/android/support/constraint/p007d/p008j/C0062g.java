package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0043e;
import android.support.constraint.p007d.C0048i;
import android.support.constraint.p007d.p008j.C0053d;
import android.support.constraint.p007d.p008j.C0058e;
import java.util.ArrayList;

/* renamed from: android.support.constraint.d.j.g */
public class C0062g extends C0058e {

    /* renamed from: e0 */
    protected float f624e0 = -1.0f;

    /* renamed from: f0 */
    protected int f625f0 = -1;

    /* renamed from: g0 */
    protected int f626g0 = -1;

    /* renamed from: h0 */
    private C0053d f627h0 = this.f595s;

    /* renamed from: i0 */
    private int f628i0;

    /* renamed from: j0 */
    private boolean f629j0;

    /* renamed from: android.support.constraint.d.j.g$a */
    static /* synthetic */ class C0063a {

        /* renamed from: a */
        static final /* synthetic */ int[] f630a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0062g.C0063a.<clinit>():void");
        }
    }

    public C0062g() {
        this.f628i0 = 0;
        this.f629j0 = false;
        this.f548A.clear();
        this.f548A.add(this.f627h0);
        int length = this.f602z.length;
        for (int i = 0; i < length; i++) {
            this.f602z[i] = this.f627h0;
        }
    }

    /* renamed from: A0 */
    public void mo289A0(int i) {
        if (i > -1) {
            this.f624e0 = -1.0f;
            this.f625f0 = i;
            this.f626g0 = -1;
        }
    }

    /* renamed from: B0 */
    public void mo290B0(int i) {
        if (i > -1) {
            this.f624e0 = -1.0f;
            this.f625f0 = -1;
            this.f626g0 = i;
        }
    }

    /* renamed from: C0 */
    public void mo291C0(float f) {
        if (f > -1.0f) {
            this.f624e0 = f;
            this.f625f0 = -1;
            this.f626g0 = -1;
        }
    }

    /* renamed from: D0 */
    public void mo292D0(int i) {
        if (this.f628i0 != i) {
            this.f628i0 = i;
            this.f548A.clear();
            this.f627h0 = this.f628i0 == 1 ? this.f594r : this.f595s;
            this.f548A.add(this.f627h0);
            int length = this.f602z.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f602z[i2] = this.f627h0;
            }
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: b */
    public void mo182b(C0043e eVar) {
        C0061f fVar = (C0061f) mo256s();
        if (fVar != null) {
            C0053d h = fVar.mo234h(C0053d.EnumC0057d.LEFT);
            C0053d h2 = fVar.mo234h(C0053d.EnumC0057d.RIGHT);
            C0058e eVar2 = this.f550C;
            boolean z = true;
            boolean z2 = eVar2 != null && eVar2.f549B[0] == C0058e.EnumC0060b.WRAP_CONTENT;
            if (this.f628i0 == 0) {
                h = fVar.mo234h(C0053d.EnumC0057d.TOP);
                h2 = fVar.mo234h(C0053d.EnumC0057d.BOTTOM);
                C0058e eVar3 = this.f550C;
                if (eVar3 == null || eVar3.f549B[1] != C0058e.EnumC0060b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f625f0 != -1) {
                C0048i r = eVar.mo164r(this.f627h0);
                eVar.mo154e(r, eVar.mo164r(h), this.f625f0, 6);
                if (z2) {
                    eVar.mo157i(eVar.mo164r(h2), r, 0, 5);
                }
            } else if (this.f626g0 != -1) {
                C0048i r2 = eVar.mo164r(this.f627h0);
                C0048i r3 = eVar.mo164r(h2);
                eVar.mo154e(r2, r3, -this.f626g0, 6);
                if (z2) {
                    eVar.mo157i(r2, eVar.mo164r(h), 0, 5);
                    eVar.mo157i(r3, r2, 0, 5);
                }
            } else if (this.f624e0 != -1.0f) {
                eVar.mo153d(C0043e.m131t(eVar, eVar.mo164r(this.f627h0), eVar.mo164r(h), eVar.mo164r(h2), this.f624e0, this.f629j0));
            }
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: c */
    public boolean mo183c() {
        return true;
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: d */
    public void mo184d(int i) {
        C0053d dVar;
        C0066j jVar;
        int i2;
        C0053d dVar2;
        C0066j jVar2;
        C0066j f;
        int i3;
        C0053d dVar3;
        C0058e s = mo256s();
        if (s != null) {
            if (mo293z0() == 1) {
                this.f595s.mo191f().mo299h(1, s.f595s.mo191f(), 0);
                this.f597u.mo191f().mo299h(1, s.f595s.mo191f(), 0);
                if (this.f625f0 != -1) {
                    this.f594r.mo191f().mo299h(1, s.f594r.mo191f(), this.f625f0);
                    jVar2 = this.f596t.mo191f();
                    dVar3 = s.f594r;
                } else if (this.f626g0 != -1) {
                    this.f594r.mo191f().mo299h(1, s.f596t.mo191f(), -this.f626g0);
                    jVar2 = this.f596t.mo191f();
                    dVar2 = s.f596t;
                    f = dVar2.mo191f();
                    i3 = -this.f626g0;
                    jVar2.mo299h(1, f, i3);
                } else if (this.f624e0 != -1.0f && s.mo254r() == C0058e.EnumC0060b.FIXED) {
                    i2 = (int) (((float) s.f551D) * this.f624e0);
                    this.f594r.mo191f().mo299h(1, s.f594r.mo191f(), i2);
                    jVar = this.f596t.mo191f();
                    dVar = s.f594r;
                    jVar.mo299h(1, dVar.mo191f(), i2);
                    return;
                } else {
                    return;
                }
            } else {
                this.f594r.mo191f().mo299h(1, s.f594r.mo191f(), 0);
                this.f596t.mo191f().mo299h(1, s.f594r.mo191f(), 0);
                if (this.f625f0 != -1) {
                    this.f595s.mo191f().mo299h(1, s.f595s.mo191f(), this.f625f0);
                    jVar2 = this.f597u.mo191f();
                    dVar3 = s.f595s;
                } else if (this.f626g0 != -1) {
                    this.f595s.mo191f().mo299h(1, s.f597u.mo191f(), -this.f626g0);
                    jVar2 = this.f597u.mo191f();
                    dVar2 = s.f597u;
                    f = dVar2.mo191f();
                    i3 = -this.f626g0;
                    jVar2.mo299h(1, f, i3);
                } else if (this.f624e0 != -1.0f && s.mo269y() == C0058e.EnumC0060b.FIXED) {
                    i2 = (int) (((float) s.f552E) * this.f624e0);
                    this.f595s.mo191f().mo299h(1, s.f595s.mo191f(), i2);
                    jVar = this.f597u.mo191f();
                    dVar = s.f595s;
                    jVar.mo299h(1, dVar.mo191f(), i2);
                    return;
                } else {
                    return;
                }
            }
            f = dVar3.mo191f();
            i3 = this.f625f0;
            jVar2.mo299h(1, f, i3);
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: h */
    public C0053d mo234h(C0053d.EnumC0057d dVar) {
        switch (C0063a.f630a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f628i0 == 1) {
                    return this.f627h0;
                }
                break;
            case 3:
            case 4:
                if (this.f628i0 == 0) {
                    return this.f627h0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: i */
    public ArrayList<C0053d> mo236i() {
        return this.f548A;
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: x0 */
    public void mo268x0(C0043e eVar) {
        if (mo256s() != null) {
            int y = eVar.mo168y(this.f627h0);
            if (this.f628i0 == 1) {
                mo259t0(y);
                mo262u0(0);
                mo218T(mo256s().mo250p());
                mo251p0(0);
                return;
            }
            mo259t0(0);
            mo262u0(y);
            mo251p0(mo256s().mo201A());
            mo218T(0);
        }
    }

    /* renamed from: z0 */
    public int mo293z0() {
        return this.f628i0;
    }
}
