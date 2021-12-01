package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: android.support.transition.t */
class C0251t<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f960a;

    /* renamed from: b */
    private final PathMeasure f961b;

    /* renamed from: c */
    private final float f962c;

    /* renamed from: d */
    private final float[] f963d = new float[2];

    /* renamed from: e */
    private final PointF f964e = new PointF();

    /* renamed from: f */
    private float f965f;

    C0251t(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f960a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f961b = pathMeasure;
        this.f962c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f965f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f965f = f.floatValue();
        this.f961b.getPosTan(this.f962c * f.floatValue(), this.f963d, null);
        PointF pointF = this.f964e;
        float[] fArr = this.f963d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f960a.set(t, pointF);
    }
}
