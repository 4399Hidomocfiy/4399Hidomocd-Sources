package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class Fade extends Visibility {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.transition.Fade$a */
    public class C0170a extends C0204d0 {

        /* renamed from: a */
        final /* synthetic */ View f832a;

        C0170a(Fade fade, View view) {
            this.f832a = view;
        }

        @Override // android.support.transition.Transition.AbstractC0187g
        /* renamed from: b */
        public void mo1384b(Transition transition) {
            C0254u0.m689i(this.f832a, 1.0f);
            C0254u0.m681a(this.f832a);
            transition.removeListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.transition.Fade$b */
    public static class C0171b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f833a;

        /* renamed from: b */
        private boolean f834b = false;

        C0171b(View view) {
            this.f833a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C0254u0.m689i(this.f833a, 1.0f);
            if (this.f834b) {
                this.f833a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ViewCompat.hasOverlappingRendering(this.f833a) && this.f833a.getLayerType() == 0) {
                this.f834b = true;
                this.f833a.setLayerType(2, null);
            }
        }
    }

    public Fade() {
    }

    public Fade(int i) {
        mo1504g(i);
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f885d);
        mo1504g(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo1501a()));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    private Animator m480h(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0254u0.m689i(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0254u0.f970d, f2);
        ofFloat.addListener(new C0171b(view));
        addListener(new C0170a(this, view));
        return ofFloat;
    }

    /* renamed from: i */
    private static float m481i(C0221h0 h0Var, float f) {
        Float f2;
        return (h0Var == null || (f2 = (Float) h0Var.f922a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // android.support.transition.Transition, android.support.transition.Visibility
    public void captureStartValues(C0221h0 h0Var) {
        super.captureStartValues(h0Var);
        h0Var.f922a.put("android:fade:transitionAlpha", Float.valueOf(C0254u0.m684d(h0Var.f923b)));
    }

    @Override // android.support.transition.Visibility
    /* renamed from: d */
    public Animator mo1414d(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        float f = 0.0f;
        float i = m481i(h0Var, 0.0f);
        if (i != 1.0f) {
            f = i;
        }
        return m480h(view, f, 1.0f);
    }

    @Override // android.support.transition.Visibility
    /* renamed from: f */
    public Animator mo1415f(ViewGroup viewGroup, View view, C0221h0 h0Var, C0221h0 h0Var2) {
        C0254u0.m686f(view);
        return m480h(view, m481i(h0Var, 1.0f), 0.0f);
    }
}
