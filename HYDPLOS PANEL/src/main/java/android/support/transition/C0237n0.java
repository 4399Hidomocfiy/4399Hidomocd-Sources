package android.support.transition;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.transition.n0 */
class C0237n0 {

    /* renamed from: a */
    private static final AbstractC0245q0 f944a = (Build.VERSION.SDK_INT >= 18 ? new C0243p0() : new C0240o0());

    /* renamed from: a */
    static AbstractC0235m0 m649a(ViewGroup viewGroup) {
        return f944a.mo1600b(viewGroup);
    }

    /* renamed from: b */
    static void m650b(ViewGroup viewGroup, boolean z) {
        f944a.mo1599a(viewGroup, z);
    }
}
