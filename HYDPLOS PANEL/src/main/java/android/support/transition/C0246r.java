package android.support.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.r */
class C0246r implements AbstractC0249s {
    C0246r() {
    }

    @Override // android.support.transition.AbstractC0249s
    /* renamed from: a */
    public <T> ObjectAnimator mo1602a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
