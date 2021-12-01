package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {

    /* renamed from: d */
    private static final float f755d = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    private float f756a = 0.0f;

    /* renamed from: b */
    private float f757b = 0.0f;

    /* renamed from: c */
    private float f758c = f755d;

    public ArcMotion() {
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f889h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo1353d(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        mo1352c(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        mo1351b(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    private static float m418e(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @Override // android.support.transition.PathMotion
    /* renamed from: a */
    public Path mo1350a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f757b;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f7 = f2;
                f6 = f14 + f;
            } else {
                f6 = f3 - f14;
                f7 = f4;
            }
            f5 = this.f756a;
        }
        float f15 = f13 * f5 * f5;
        float f16 = f11 - f6;
        float f17 = f12 - f7;
        float f18 = (f16 * f16) + (f17 * f17);
        float f19 = this.f758c;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f15 / f18));
            f6 = ((f6 - f11) * sqrt) + f11;
            f7 = f12 + (sqrt * (f7 - f12));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public void mo1351b(float f) {
        this.f758c = m418e(f);
    }

    /* renamed from: c */
    public void mo1352c(float f) {
        this.f756a = m418e(f);
    }

    /* renamed from: d */
    public void mo1353d(float f) {
        this.f757b = m418e(f);
    }
}
