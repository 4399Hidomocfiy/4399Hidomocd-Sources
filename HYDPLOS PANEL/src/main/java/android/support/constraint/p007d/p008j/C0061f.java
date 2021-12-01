package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0043e;
import android.support.constraint.p007d.p008j.C0053d;
import android.support.constraint.p007d.p008j.C0058e;
import java.util.Arrays;

/* renamed from: android.support.constraint.d.j.f */
public class C0061f extends C0071n {

    /* renamed from: f0 */
    private boolean f610f0 = false;

    /* renamed from: g0 */
    protected C0043e f611g0 = new C0043e();

    /* renamed from: h0 */
    private C0069m f612h0;

    /* renamed from: i0 */
    int f613i0;

    /* renamed from: j0 */
    int f614j0;

    /* renamed from: k0 */
    int f615k0;

    /* renamed from: l0 */
    int f616l0;

    /* renamed from: m0 */
    int f617m0 = 0;

    /* renamed from: n0 */
    int f618n0 = 0;

    /* renamed from: o0 */
    C0052c[] f619o0 = new C0052c[4];

    /* renamed from: p0 */
    C0052c[] f620p0 = new C0052c[4];

    /* renamed from: q0 */
    private int f621q0 = 3;

    /* renamed from: r0 */
    private boolean f622r0 = false;

    /* renamed from: s0 */
    private boolean f623s0 = false;

    /* renamed from: G0 */
    private void m270G0(C0058e eVar) {
        int i = this.f617m0 + 1;
        C0052c[] cVarArr = this.f620p0;
        if (i >= cVarArr.length) {
            this.f620p0 = (C0052c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f620p0[this.f617m0] = new C0052c(eVar, 0, mo278L0());
        this.f617m0++;
    }

    /* renamed from: H0 */
    private void m271H0(C0058e eVar) {
        int i = this.f618n0 + 1;
        C0052c[] cVarArr = this.f619o0;
        if (i >= cVarArr.length) {
            this.f619o0 = (C0052c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f619o0[this.f618n0] = new C0052c(eVar, 1, mo278L0());
        this.f618n0++;
    }

    /* renamed from: S0 */
    private void m272S0() {
        this.f617m0 = 0;
        this.f618n0 = 0;
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // android.support.constraint.p007d.p008j.C0071n
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo272B0() {
        /*
        // Method dump skipped, instructions count: 605
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0061f.mo272B0():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo273E0(C0058e eVar, int i) {
        if (i == 0) {
            m270G0(eVar);
        } else if (i == 1) {
            m271H0(eVar);
        }
    }

    /* renamed from: F0 */
    public boolean mo274F0(C0043e eVar) {
        mo182b(eVar);
        int size = this.f658e0.size();
        for (int i = 0; i < size; i++) {
            C0058e eVar2 = this.f658e0.get(i);
            if (eVar2 instanceof C0061f) {
                C0058e.EnumC0060b[] bVarArr = eVar2.f549B;
                C0058e.EnumC0060b bVar = bVarArr[0];
                C0058e.EnumC0060b bVar2 = bVarArr[1];
                C0058e.EnumC0060b bVar3 = C0058e.EnumC0060b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar2.mo223Y(C0058e.EnumC0060b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar2.mo243l0(C0058e.EnumC0060b.FIXED);
                }
                eVar2.mo182b(eVar);
                if (bVar == bVar3) {
                    eVar2.mo223Y(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar2.mo243l0(bVar2);
                }
            } else {
                C0065i.m307c(this, eVar, eVar2);
                eVar2.mo182b(eVar);
            }
        }
        if (this.f617m0 > 0) {
            C0051b.m174a(this, eVar, 0);
        }
        if (this.f618n0 > 0) {
            C0051b.m174a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: I0 */
    public int mo275I0() {
        return this.f621q0;
    }

    @Override // android.support.constraint.p007d.p008j.C0071n, android.support.constraint.p007d.p008j.C0058e
    /* renamed from: J */
    public void mo210J() {
        this.f611g0.mo150E();
        this.f613i0 = 0;
        this.f615k0 = 0;
        this.f614j0 = 0;
        this.f616l0 = 0;
        super.mo210J();
    }

    /* renamed from: J0 */
    public boolean mo276J0() {
        return false;
    }

    /* renamed from: K0 */
    public boolean mo277K0() {
        return this.f623s0;
    }

    /* renamed from: L0 */
    public boolean mo278L0() {
        return this.f610f0;
    }

    /* renamed from: M0 */
    public boolean mo279M0() {
        return this.f622r0;
    }

    /* renamed from: N0 */
    public void mo280N0() {
        if (!mo281O0(8)) {
            mo184d(this.f621q0);
        }
        mo287V0();
    }

    /* renamed from: O0 */
    public boolean mo281O0(int i) {
        return (this.f621q0 & i) == i;
    }

    /* renamed from: P0 */
    public void mo282P0(int i, int i2) {
        C0067k kVar;
        C0067k kVar2;
        C0058e.EnumC0060b bVar = this.f549B[0];
        C0058e.EnumC0060b bVar2 = C0058e.EnumC0060b.WRAP_CONTENT;
        if (!(bVar == bVar2 || (kVar2 = this.f578c) == null)) {
            kVar2.mo311h(i);
        }
        if (this.f549B[1] != bVar2 && (kVar = this.f580d) != null) {
            kVar.mo311h(i2);
        }
    }

    /* renamed from: Q0 */
    public void mo283Q0() {
        int size = this.f658e0.size();
        mo180L();
        for (int i = 0; i < size; i++) {
            this.f658e0.get(i).mo180L();
        }
    }

    /* renamed from: R0 */
    public void mo284R0() {
        mo283Q0();
        mo184d(this.f621q0);
    }

    /* renamed from: T0 */
    public void mo285T0(int i) {
        this.f621q0 = i;
    }

    /* renamed from: U0 */
    public void mo286U0(boolean z) {
        this.f610f0 = z;
    }

    /* renamed from: V0 */
    public void mo287V0() {
        C0066j f = mo234h(C0053d.EnumC0057d.LEFT).mo191f();
        C0066j f2 = mo234h(C0053d.EnumC0057d.TOP).mo191f();
        f.mo303l(null, 0.0f);
        f2.mo303l(null, 0.0f);
    }

    /* renamed from: W0 */
    public void mo288W0(C0043e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo268x0(eVar);
        int size = this.f658e0.size();
        for (int i = 0; i < size; i++) {
            C0058e eVar2 = this.f658e0.get(i);
            eVar2.mo268x0(eVar);
            C0058e.EnumC0060b bVar = eVar2.f549B[0];
            C0058e.EnumC0060b bVar2 = C0058e.EnumC0060b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && eVar2.mo201A() < eVar2.mo203C()) {
                zArr[2] = true;
            }
            if (eVar2.f549B[1] == bVar2 && eVar2.mo250p() < eVar2.mo202B()) {
                zArr[2] = true;
            }
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: d */
    public void mo184d(int i) {
        super.mo184d(i);
        int size = this.f658e0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f658e0.get(i2).mo184d(i);
        }
    }
}
