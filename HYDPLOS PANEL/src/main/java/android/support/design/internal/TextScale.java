package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.transition.C0221h0;
import android.support.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public class TextScale extends Transition {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(C0221h0 h0Var) {
        View view = h0Var.f923b;
        if (view instanceof TextView) {
            h0Var.f922a.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
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
        if (h0Var == null || h0Var2 == null || !(h0Var.f923b instanceof TextView)) {
            return null;
        }
        View view = h0Var2.f923b;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        Map<String, Object> map = h0Var.f922a;
        Map<String, Object> map2 = h0Var2.f922a;
        float f = 1.0f;
        float floatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (map2.get(PROPNAME_SCALE) != null) {
            f = ((Float) map2.get(PROPNAME_SCALE)).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class android.support.design.internal.TextScale.C00811 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
