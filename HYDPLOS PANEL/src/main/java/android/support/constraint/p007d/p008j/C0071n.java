package android.support.constraint.p007d.p008j;

import android.support.constraint.p007d.C0041c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.d.j.n */
public class C0071n extends C0058e {

    /* renamed from: e0 */
    protected ArrayList<C0058e> f658e0 = new ArrayList<>();

    /* renamed from: A0 */
    public C0061f mo320A0() {
        C0058e s = mo256s();
        C0061f fVar = this instanceof C0061f ? (C0061f) this : null;
        while (s != null) {
            C0058e s2 = s.mo256s();
            if (s instanceof C0061f) {
                fVar = (C0061f) s;
            }
            s = s2;
        }
        return fVar;
    }

    /* renamed from: B0 */
    public void mo272B0() {
        mo266w0();
        ArrayList<C0058e> arrayList = this.f658e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0058e eVar = this.f658e0.get(i);
                if (eVar instanceof C0071n) {
                    ((C0071n) eVar).mo272B0();
                }
            }
        }
    }

    /* renamed from: C0 */
    public void mo321C0(C0058e eVar) {
        this.f658e0.remove(eVar);
        eVar.mo235h0(null);
    }

    /* renamed from: D0 */
    public void mo322D0() {
        this.f658e0.clear();
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: J */
    public void mo210J() {
        this.f658e0.clear();
        super.mo210J();
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: M */
    public void mo212M(C0041c cVar) {
        super.mo212M(cVar);
        int size = this.f658e0.size();
        for (int i = 0; i < size; i++) {
            this.f658e0.get(i).mo212M(cVar);
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: f0 */
    public void mo231f0(int i, int i2) {
        super.mo231f0(i, i2);
        int size = this.f658e0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f658e0.get(i3).mo231f0(mo265w(), mo267x());
        }
    }

    @Override // android.support.constraint.p007d.p008j.C0058e
    /* renamed from: w0 */
    public void mo266w0() {
        super.mo266w0();
        ArrayList<C0058e> arrayList = this.f658e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0058e eVar = this.f658e0.get(i);
                eVar.mo231f0(mo246n(), mo248o());
                if (!(eVar instanceof C0061f)) {
                    eVar.mo266w0();
                }
            }
        }
    }

    /* renamed from: z0 */
    public void mo323z0(C0058e eVar) {
        this.f658e0.add(eVar);
        if (eVar.mo256s() != null) {
            ((C0071n) eVar.mo256s()).mo321C0(eVar);
        }
        eVar.mo235h0(this);
    }
}
