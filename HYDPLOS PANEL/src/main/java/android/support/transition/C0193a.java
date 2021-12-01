package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;

/* access modifiers changed from: package-private */
/* renamed from: android.support.transition.a */
public class C0193a {

    /* renamed from: a */
    private static final AbstractC0203d f876a = (Build.VERSION.SDK_INT >= 19 ? new C0200c() : new C0196b());

    /* renamed from: a */
    static void m549a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        f876a.mo1525c(animator, animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m550b(Animator animator) {
        f876a.mo1524b(animator);
    }

    /* renamed from: c */
    static void m551c(Animator animator) {
        f876a.mo1523a(animator);
    }
}
