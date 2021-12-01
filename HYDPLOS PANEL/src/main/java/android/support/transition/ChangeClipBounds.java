package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {

    /* renamed from: a */
    private static final String[] f792a = {"android:clipBounds:clip"};

    /* renamed from: android.support.transition.ChangeClipBounds$a */
    class C0160a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f793a;

        C0160a(ChangeClipBounds changeClipBounds, View view) {
            this.f793a = view;
        }

        public void onAnimationEnd(Animator animator) {
            ViewCompat.setClipBounds(this.f793a, null);
        }
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void captureValues(C0221h0 h0Var) {
        View view = h0Var.f923b;
        if (view.getVisibility() != 8) {
            Rect clipBounds = ViewCompat.getClipBounds(view);
            h0Var.f922a.put("android:clipBounds:clip", clipBounds);
            if (clipBounds == null) {
                h0Var.f922a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(C0221h0 h0Var) {
        captureValues(h0Var);
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0221h0 h0Var, C0221h0 h0Var2) {
        ObjectAnimator objectAnimator = null;
        if (h0Var != null && h0Var2 != null && h0Var.f922a.containsKey("android:clipBounds:clip") && h0Var2.f922a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) h0Var.f922a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) h0Var2.f922a.get("android:clipBounds:clip");
            boolean z = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) h0Var.f922a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) h0Var2.f922a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            ViewCompat.setClipBounds(h0Var2.f923b, rect);
            objectAnimator = ObjectAnimator.ofObject(h0Var2.f923b, C0254u0.f971e, new C0265z(new Rect()), rect, rect2);
            if (z) {
                objectAnimator.addListener(new C0160a(this, h0Var2.f923b));
            }
        }
        return objectAnimator;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f792a;
    }
}
