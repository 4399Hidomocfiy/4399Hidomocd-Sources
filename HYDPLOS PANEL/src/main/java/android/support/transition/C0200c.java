package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.transition.c */
class C0200c implements AbstractC0203d {
    C0200c() {
    }

    @Override // android.support.transition.AbstractC0203d
    /* renamed from: a */
    public void mo1523a(Animator animator) {
        animator.resume();
    }

    @Override // android.support.transition.AbstractC0203d
    /* renamed from: b */
    public void mo1524b(Animator animator) {
        animator.pause();
    }

    @Override // android.support.transition.AbstractC0203d
    /* renamed from: c */
    public void mo1525c(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }
}
