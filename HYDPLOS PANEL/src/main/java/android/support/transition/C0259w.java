package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.w */
class C0259w implements AbstractC0261x {
    C0259w() {
    }

    @Override // android.support.transition.AbstractC0261x
    /* renamed from: a */
    public PropertyValuesHolder mo1626a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
