package android.support.transition;

import android.os.IBinder;

/* renamed from: android.support.transition.c1 */
class C0202c1 implements AbstractC0210e1 {

    /* renamed from: a */
    private final IBinder f891a;

    C0202c1(IBinder iBinder) {
        this.f891a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0202c1) && ((C0202c1) obj).f891a.equals(this.f891a);
    }

    public int hashCode() {
        return this.f891a.hashCode();
    }
}
