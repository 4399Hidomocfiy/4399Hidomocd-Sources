package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.p008j.C0058e;
import java.util.ArrayList;

/* renamed from: android.support.constraint.d.j.c */
public class C0052c {

    /* renamed from: a */
    protected C0058e f503a;

    /* renamed from: b */
    protected C0058e f504b;

    /* renamed from: c */
    protected C0058e f505c;

    /* renamed from: d */
    protected C0058e f506d;

    /* renamed from: e */
    protected C0058e f507e;

    /* renamed from: f */
    protected C0058e f508f;

    /* renamed from: g */
    protected C0058e f509g;

    /* renamed from: h */
    protected ArrayList<C0058e> f510h;

    /* renamed from: i */
    protected int f511i;

    /* renamed from: j */
    protected int f512j;

    /* renamed from: k */
    protected float f513k = 0.0f;

    /* renamed from: l */
    private int f514l;

    /* renamed from: m */
    private boolean f515m = false;

    /* renamed from: n */
    protected boolean f516n;

    /* renamed from: o */
    protected boolean f517o;

    /* renamed from: p */
    protected boolean f518p;

    /* renamed from: q */
    private boolean f519q;

    public C0052c(C0058e eVar, int i, boolean z) {
        this.f503a = eVar;
        this.f514l = i;
        this.f515m = z;
    }

    /* renamed from: b */
    private void m176b() {
        int i = this.f514l * 2;
        C0058e eVar = this.f503a;
        boolean z = false;
        boolean z2 = false;
        while (!z2) {
            this.f511i++;
            C0058e[] eVarArr = eVar.f579c0;
            int i2 = this.f514l;
            C0058e eVar2 = null;
            eVarArr[i2] = null;
            eVar.f577b0[i2] = null;
            if (eVar.mo271z() != 8) {
                if (this.f504b == null) {
                    this.f504b = eVar;
                }
                C0058e eVar3 = this.f506d;
                if (eVar3 != null) {
                    eVar3.f579c0[this.f514l] = eVar;
                }
                this.f506d = eVar;
                C0058e.EnumC0060b[] bVarArr = eVar.f549B;
                int i3 = this.f514l;
                if (bVarArr[i3] == C0058e.EnumC0060b.MATCH_CONSTRAINT) {
                    int[] iArr = eVar.f583g;
                    if (iArr[i3] == 0 || iArr[i3] == 3 || iArr[i3] == 2) {
                        this.f512j++;
                        float[] fArr = eVar.f575a0;
                        float f = fArr[i3];
                        if (f > 0.0f) {
                            this.f513k += fArr[i3];
                        }
                        if (m177c(eVar, i3)) {
                            if (f < 0.0f) {
                                this.f516n = true;
                            } else {
                                this.f517o = true;
                            }
                            if (this.f510h == null) {
                                this.f510h = new ArrayList<>();
                            }
                            this.f510h.add(eVar);
                        }
                        if (this.f508f == null) {
                            this.f508f = eVar;
                        }
                        C0058e eVar4 = this.f509g;
                        if (eVar4 != null) {
                            eVar4.f577b0[this.f514l] = eVar;
                        }
                        this.f509g = eVar;
                    }
                }
            }
            C0053d dVar = eVar.f602z[i + 1].f523d;
            if (dVar != null) {
                C0058e eVar5 = dVar.f521b;
                C0053d[] dVarArr = eVar5.f602z;
                if (dVarArr[i].f523d != null && dVarArr[i].f523d.f521b == eVar) {
                    eVar2 = eVar5;
                }
            }
            if (eVar2 != null) {
                eVar = eVar2;
            } else {
                z2 = true;
            }
        }
        this.f505c = eVar;
        if (this.f514l != 0 || !this.f515m) {
            this.f507e = this.f503a;
        } else {
            this.f507e = eVar;
        }
        if (this.f517o && this.f516n) {
            z = true;
        }
        this.f518p = z;
    }

    /* renamed from: c */
    private static boolean m177c(C0058e eVar, int i) {
        if (eVar.mo271z() != 8 && eVar.f549B[i] == C0058e.EnumC0060b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f583g;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo185a() {
        if (!this.f519q) {
            m176b();
        }
        this.f519q = true;
    }
}
