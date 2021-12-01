package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.graphics.PathParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    private final Path f835a;

    /* renamed from: b */
    private final Matrix f836b;

    public PatternPathMotion() {
        Path path = new Path();
        this.f835a = path;
        this.f836b = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f835a = new Path();
        this.f836b = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0201c0.f890i);
        try {
            String namedString = TypedArrayUtils.getNamedString(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString != null) {
                mo1418c(PathParser.createPathFromPathData(namedString));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private static float m486b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    @Override // android.support.transition.PathMotion
    /* renamed from: a */
    public Path mo1350a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m486b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f836b.setScale(b, b);
        this.f836b.postRotate((float) Math.toDegrees(atan2));
        this.f836b.postTranslate(f, f2);
        Path path = new Path();
        this.f835a.transform(this.f836b, path);
        return path;
    }

    /* renamed from: c */
    public void mo1418c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f836b.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m486b(f5, f6);
        this.f836b.postScale(b, b);
        this.f836b.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f836b, this.f835a);
    }
}
