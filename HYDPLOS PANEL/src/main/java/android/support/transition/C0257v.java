package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.v */
class C0257v implements AbstractC0261x {
    C0257v() {
    }

    @Override // android.support.transition.AbstractC0261x
    /* renamed from: a */
    public PropertyValuesHolder mo1626a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new C0251t(property, path), 0.0f, 1.0f);
    }
}
