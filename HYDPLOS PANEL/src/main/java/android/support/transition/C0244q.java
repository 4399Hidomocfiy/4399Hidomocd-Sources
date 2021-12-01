package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.q */
class C0244q implements AbstractC0249s {
    C0244q() {
    }

    @Override // android.support.transition.AbstractC0249s
    /* renamed from: a */
    public <T> ObjectAnimator mo1602a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new C0251t(property, path), 0.0f, 1.0f);
    }
}
