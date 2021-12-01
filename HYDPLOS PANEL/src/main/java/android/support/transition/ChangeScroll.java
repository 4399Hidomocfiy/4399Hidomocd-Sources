package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {

    /* renamed from: a */
    private static final String[] f798a = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void captureValues(C0221h0 h0Var) {
        h0Var.f922a.put("android:changeScroll:x", Integer.valueOf(h0Var.f923b.getScrollX()));
        h0Var.f922a.put("android:changeScroll:y", Integer.valueOf(h0Var.f923b.getScrollY()));
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
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (h0Var == null || h0Var2 == null) {
            return null;
        }
        View view = h0Var2.f923b;
        int intValue = ((Integer) h0Var.f922a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) h0Var2.f922a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) h0Var.f922a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) h0Var2.f922a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return C0216g0.m609c(objectAnimator, objectAnimator2);
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f798a;
    }
}
