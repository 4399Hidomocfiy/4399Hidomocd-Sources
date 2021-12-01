package android.support.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: android.support.transition.d1 */
class C0205d1 implements AbstractC0210e1 {

    /* renamed from: a */
    private final WindowId f892a;

    C0205d1(View view) {
        this.f892a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0205d1) && ((C0205d1) obj).f892a.equals(this.f892a);
    }

    public int hashCode() {
        return this.f892a.hashCode();
    }
}
