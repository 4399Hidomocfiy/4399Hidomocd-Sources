package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: android.support.transition.b */
class C0196b implements AbstractC0203d {

    /* renamed from: android.support.transition.b$a */
    interface AbstractC0197a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    C0196b() {
    }

    @Override // android.support.transition.AbstractC0203d
    /* renamed from: a */
    public void mo1523a(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof AbstractC0197a) {
                    ((AbstractC0197a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    @Override // android.support.transition.AbstractC0203d
    /* renamed from: b */
    public void mo1524b(Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof AbstractC0197a) {
                    ((AbstractC0197a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    @Override // android.support.transition.AbstractC0203d
    /* renamed from: c */
    public void mo1525c(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }
}
