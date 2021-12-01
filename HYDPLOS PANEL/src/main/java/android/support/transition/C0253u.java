package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: android.support.transition.u */
class C0253u {

    /* renamed from: a */
    private static final AbstractC0261x f966a = (Build.VERSION.SDK_INT >= 21 ? new C0259w() : new C0257v());

    /* renamed from: a */
    static PropertyValuesHolder m680a(Property<?, PointF> property, Path path) {
        return f966a.mo1626a(property, path);
    }
}
