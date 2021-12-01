package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0043e;
import android.support.constraint.p007d.C0048i;
import android.support.constraint.p007d.p008j.C0058e;
import java.util.ArrayList;

/* renamed from: android.support.constraint.d.j.a */
public class C0050a extends C0064h {

    /* renamed from: g0 */
    private int f500g0 = 0;

    /* renamed from: h0 */
    private ArrayList<C0066j> f501h0 = new ArrayList<>(4);

    /* renamed from: i0 */
    private boolean f502i0 = true;

    /* renamed from: B0 */
    public void mo178B0(boolean z) {
        this.f502i0 = z;
    }

    /* renamed from: C0 */
    public void mo179C0(int i) {
        this.f500g0 = i;
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: L */
    public void mo180L() {
        super.mo180L();
        this.f501h0.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo181N() {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0050a.mo181N():void");
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: b */
    public void mo182b(C0043e eVar) {
        Object[] objArr;
        boolean z;
        C0048i iVar;
        C0053d dVar;
        int i;
        int i2;
        C0053d[] dVarArr = this.f602z;
        dVarArr[0] = this.f594r;
        dVarArr[2] = this.f595s;
        dVarArr[1] = this.f596t;
        dVarArr[3] = this.f597u;
        int i3 = 0;
        while (true) {
            objArr = this.f602z;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].f528i = eVar.mo164r(objArr[i3]);
            i3++;
        }
        int i4 = this.f500g0;
        if (i4 >= 0 && i4 < 4) {
            C0053d dVar2 = objArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.f632f0) {
                    z = false;
                    break;
                }
                C0058e eVar2 = this.f631e0[i5];
                if ((this.f502i0 || eVar2.mo183c()) && ((((i = this.f500g0) == 0 || i == 1) && eVar2.mo254r() == C0058e.EnumC0060b.MATCH_CONSTRAINT) || (((i2 = this.f500g0) == 2 || i2 == 3) && eVar2.mo269y() == C0058e.EnumC0060b.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            int i6 = this.f500g0;
            if (i6 == 0 || i6 == 1 ? mo256s().mo254r() == C0058e.EnumC0060b.WRAP_CONTENT : mo256s().mo269y() == C0058e.EnumC0060b.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.f632f0; i7++) {
                C0058e eVar3 = this.f631e0[i7];
                if (this.f502i0 || eVar3.mo183c()) {
                    C0048i r = eVar.mo164r(eVar3.f602z[this.f500g0]);
                    C0053d[] dVarArr2 = eVar3.f602z;
                    int i8 = this.f500g0;
                    dVarArr2[i8].f528i = r;
                    if (i8 == 0 || i8 == 2) {
                        eVar.mo158j(dVar2.f528i, r, z);
                    } else {
                        eVar.mo156h(dVar2.f528i, r, z);
                    }
                }
            }
            int i9 = this.f500g0;
            if (i9 == 0) {
                eVar.mo154e(this.f596t.f528i, this.f594r.f528i, 0, 6);
                if (!z) {
                    iVar = this.f594r.f528i;
                    dVar = this.f550C.f596t;
                } else {
                    return;
                }
            } else if (i9 == 1) {
                eVar.mo154e(this.f594r.f528i, this.f596t.f528i, 0, 6);
                if (!z) {
                    iVar = this.f594r.f528i;
                    dVar = this.f550C.f594r;
                } else {
                    return;
                }
            } else if (i9 == 2) {
                eVar.mo154e(this.f597u.f528i, this.f595s.f528i, 0, 6);
                if (!z) {
                    iVar = this.f595s.f528i;
                    dVar = this.f550C.f597u;
                } else {
                    return;
                }
            } else if (i9 == 3) {
                eVar.mo154e(this.f595s.f528i, this.f597u.f528i, 0, 6);
                if (!z) {
                    iVar = this.f595s.f528i;
                    dVar = this.f550C.f595s;
                } else {
                    return;
                }
            } else {
                return;
            }
            eVar.mo154e(iVar, dVar.f528i, 0, 5);
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: c */
    public boolean mo183c() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo184d(int r8) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p007d.p008j.C0050a.mo184d(int):void");
    }
}
