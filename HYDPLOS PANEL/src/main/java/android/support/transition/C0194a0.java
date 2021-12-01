package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.a0 */
public class C0194a0 {

    /* renamed from: a */
    private ViewGroup f877a;

    /* renamed from: b */
    private Runnable f878b;

    /* renamed from: b */
    static C0194a0 m552b(View view) {
        return (C0194a0) view.getTag(C0263y.f982f);
    }

    /* renamed from: c */
    static void m553c(View view, C0194a0 a0Var) {
        view.setTag(C0263y.f982f, a0Var);
    }

    /* renamed from: a */
    public void mo1512a() {
        Runnable runnable;
        if (m552b(this.f877a) == this && (runnable = this.f878b) != null) {
            runnable.run();
        }
    }
}
