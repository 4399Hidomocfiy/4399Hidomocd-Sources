package android.support.constraint.p007d.p008j;

import java.util.Arrays;

/* renamed from: android.support.constraint.d.j.h */
public class C0064h extends C0058e {

    /* renamed from: e0 */
    protected C0058e[] f631e0 = new C0058e[4];

    /* renamed from: f0 */
    protected int f632f0 = 0;

    /* renamed from: A0 */
    public void mo294A0() {
        this.f632f0 = 0;
    }

    /* renamed from: z0 */
    public void mo295z0(C0058e eVar) {
        int i = this.f632f0 + 1;
        C0058e[] eVarArr = this.f631e0;
        if (i > eVarArr.length) {
            this.f631e0 = (C0058e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        C0058e[] eVarArr2 = this.f631e0;
        int i2 = this.f632f0;
        eVarArr2[i2] = eVar;
        this.f632f0 = i2 + 1;
    }
}
