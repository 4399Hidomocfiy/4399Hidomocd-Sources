package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: android.support.transition.p */
class C0242p {

    /* renamed from: a */
    private static final AbstractC0249s f951a = (Build.VERSION.SDK_INT >= 21 ? new C0246r() : new C0244q());

    /* renamed from: a */
    static <T> ObjectAnimator m655a(T t, Property<T, PointF> property, Path path) {
        return f951a.mo1602a(t, property, path);
    }
}
