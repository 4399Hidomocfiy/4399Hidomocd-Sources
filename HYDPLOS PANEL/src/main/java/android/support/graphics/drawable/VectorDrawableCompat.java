package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.p009v4.content.res.TypedArrayUtils;
import android.support.p009v4.graphics.PathParser;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.support.p009v4.util.ArrayMap;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VectorDrawableCompat extends AbstractC0148f {

    /* renamed from: j */
    static final PorterDuff.Mode f671j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private C0139f f672b;

    /* renamed from: c */
    private PorterDuffColorFilter f673c;

    /* renamed from: d */
    private ColorFilter f674d;

    /* renamed from: e */
    private boolean f675e;

    /* renamed from: f */
    private boolean f676f;

    /* renamed from: g */
    private final float[] f677g;

    /* renamed from: h */
    private final Matrix f678h;

    /* renamed from: i */
    private final Rect f679i;

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$a */
    public static class C0134a extends C0137d {
        public C0134a() {
        }

        public C0134a(C0134a aVar) {
            super(aVar);
        }

        /* renamed from: d */
        private void m360d(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f707b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f706a = PathParser.createNodesFromPathData(string2);
            }
        }

        @Override // android.support.graphics.drawable.VectorDrawableCompat.C0137d
        /* renamed from: a */
        public boolean mo1270a() {
            return true;
        }

        /* renamed from: c */
        public void mo1271c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0141a.f741d);
                m360d(obtainAttributes);
                obtainAttributes.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$b */
    public static class C0135b extends C0137d {

        /* renamed from: d */
        private int[] f680d;

        /* renamed from: e */
        int f681e = 0;

        /* renamed from: f */
        float f682f = 0.0f;

        /* renamed from: g */
        int f683g = 0;

        /* renamed from: h */
        float f684h = 1.0f;

        /* renamed from: i */
        int f685i = 0;

        /* renamed from: j */
        float f686j = 1.0f;

        /* renamed from: k */
        float f687k = 0.0f;

        /* renamed from: l */
        float f688l = 1.0f;

        /* renamed from: m */
        float f689m = 0.0f;

        /* renamed from: n */
        Paint.Cap f690n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f691o = Paint.Join.MITER;

        /* renamed from: p */
        float f692p = 4.0f;

        public C0135b() {
        }

        public C0135b(C0135b bVar) {
            super(bVar);
            this.f680d = bVar.f680d;
            this.f681e = bVar.f681e;
            this.f682f = bVar.f682f;
            this.f684h = bVar.f684h;
            this.f683g = bVar.f683g;
            this.f685i = bVar.f685i;
            this.f686j = bVar.f686j;
            this.f687k = bVar.f687k;
            this.f688l = bVar.f688l;
            this.f689m = bVar.f689m;
            this.f690n = bVar.f690n;
            this.f691o = bVar.f691o;
            this.f692p = bVar.f692p;
        }

        /* renamed from: c */
        private Paint.Cap m363c(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: d */
        private Paint.Join m364d(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: f */
        private void m365f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f680d = null;
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f707b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f706a = PathParser.createNodesFromPathData(string2);
                }
                this.f683g = TypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "fillColor", 1, this.f683g);
                this.f686j = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.f686j);
                this.f690n = m363c(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f690n);
                this.f691o = m364d(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f691o);
                this.f692p = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f692p);
                this.f681e = TypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "strokeColor", 3, this.f681e);
                this.f684h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.f684h);
                this.f682f = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.f682f);
                this.f688l = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.f688l);
                this.f689m = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.f689m);
                this.f687k = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.f687k);
                this.f685i = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.f685i);
            }
        }

        /* renamed from: e */
        public void mo1272e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0141a.f740c);
            m365f(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f686j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f683g;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f684h;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f681e;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f682f;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f688l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f689m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f687k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f686j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f683g = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f684h = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f681e = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f682f = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f688l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f689m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f687k = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$c */
    public static class C0136c {

        /* renamed from: a */
        private final Matrix f693a;

        /* renamed from: b */
        final ArrayList<Object> f694b;

        /* renamed from: c */
        float f695c;

        /* renamed from: d */
        private float f696d;

        /* renamed from: e */
        private float f697e;

        /* renamed from: f */
        private float f698f;

        /* renamed from: g */
        private float f699g;

        /* renamed from: h */
        private float f700h;

        /* renamed from: i */
        private float f701i;

        /* renamed from: j */
        private final Matrix f702j;

        /* renamed from: k */
        int f703k;

        /* renamed from: l */
        private int[] f704l;

        /* renamed from: m */
        private String f705m;

        public C0136c() {
            this.f693a = new Matrix();
            this.f694b = new ArrayList<>();
            this.f695c = 0.0f;
            this.f696d = 0.0f;
            this.f697e = 0.0f;
            this.f698f = 1.0f;
            this.f699g = 1.0f;
            this.f700h = 0.0f;
            this.f701i = 0.0f;
            this.f702j = new Matrix();
            this.f705m = null;
        }

        public C0136c(C0136c cVar, ArrayMap<String, Object> arrayMap) {
            C0137d dVar;
            this.f693a = new Matrix();
            this.f694b = new ArrayList<>();
            this.f695c = 0.0f;
            this.f696d = 0.0f;
            this.f697e = 0.0f;
            this.f698f = 1.0f;
            this.f699g = 1.0f;
            this.f700h = 0.0f;
            this.f701i = 0.0f;
            Matrix matrix = new Matrix();
            this.f702j = matrix;
            this.f705m = null;
            this.f695c = cVar.f695c;
            this.f696d = cVar.f696d;
            this.f697e = cVar.f697e;
            this.f698f = cVar.f698f;
            this.f699g = cVar.f699g;
            this.f700h = cVar.f700h;
            this.f701i = cVar.f701i;
            this.f704l = cVar.f704l;
            String str = cVar.f705m;
            this.f705m = str;
            this.f703k = cVar.f703k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(cVar.f702j);
            ArrayList<Object> arrayList = cVar.f694b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0136c) {
                    this.f694b.add(new C0136c((C0136c) obj, arrayMap));
                } else {
                    if (obj instanceof C0135b) {
                        dVar = new C0135b((C0135b) obj);
                    } else if (obj instanceof C0134a) {
                        dVar = new C0134a((C0134a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f694b.add(dVar);
                    String str2 = dVar.f707b;
                    if (str2 != null) {
                        arrayMap.put(str2, dVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m369d() {
            this.f702j.reset();
            this.f702j.postTranslate(-this.f696d, -this.f697e);
            this.f702j.postScale(this.f698f, this.f699g);
            this.f702j.postRotate(this.f695c, 0.0f, 0.0f);
            this.f702j.postTranslate(this.f700h + this.f696d, this.f701i + this.f697e);
        }

        /* renamed from: e */
        private void m370e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f704l = null;
            this.f695c = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "rotation", 5, this.f695c);
            this.f696d = typedArray.getFloat(1, this.f696d);
            this.f697e = typedArray.getFloat(2, this.f697e);
            this.f698f = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.f698f);
            this.f699g = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.f699g);
            this.f700h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.f700h);
            this.f701i = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.f701i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f705m = string;
            }
            m369d();
        }

        /* renamed from: c */
        public void mo1289c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0141a.f739b);
            m370e(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        public String getGroupName() {
            return this.f705m;
        }

        public Matrix getLocalMatrix() {
            return this.f702j;
        }

        public float getPivotX() {
            return this.f696d;
        }

        public float getPivotY() {
            return this.f697e;
        }

        public float getRotation() {
            return this.f695c;
        }

        public float getScaleX() {
            return this.f698f;
        }

        public float getScaleY() {
            return this.f699g;
        }

        public float getTranslateX() {
            return this.f700h;
        }

        public float getTranslateY() {
            return this.f701i;
        }

        public void setPivotX(float f) {
            if (f != this.f696d) {
                this.f696d = f;
                m369d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f697e) {
                this.f697e = f;
                m369d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f695c) {
                this.f695c = f;
                m369d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f698f) {
                this.f698f = f;
                m369d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f699g) {
                this.f699g = f;
                m369d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f700h) {
                this.f700h = f;
                m369d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f701i) {
                this.f701i = f;
                m369d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$d */
    public static class C0137d {

        /* renamed from: a */
        protected PathParser.PathDataNode[] f706a = null;

        /* renamed from: b */
        String f707b;

        /* renamed from: c */
        int f708c;

        public C0137d() {
        }

        public C0137d(C0137d dVar) {
            this.f707b = dVar.f707b;
            this.f708c = dVar.f708c;
            this.f706a = PathParser.deepCopyNodes(dVar.f706a);
        }

        /* renamed from: a */
        public boolean mo1270a() {
            return false;
        }

        /* renamed from: b */
        public void mo1306b(Path path) {
            path.reset();
            PathParser.PathDataNode[] pathDataNodeArr = this.f706a;
            if (pathDataNodeArr != null) {
                PathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
            }
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f706a;
        }

        public String getPathName() {
            return this.f707b;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.canMorph(this.f706a, pathDataNodeArr)) {
                this.f706a = PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                PathParser.updateNodes(this.f706a, pathDataNodeArr);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$e */
    public static class C0138e {

        /* renamed from: p */
        private static final Matrix f709p = new Matrix();

        /* renamed from: a */
        private final Path f710a;

        /* renamed from: b */
        private final Path f711b;

        /* renamed from: c */
        private final Matrix f712c;

        /* renamed from: d */
        private Paint f713d;

        /* renamed from: e */
        private Paint f714e;

        /* renamed from: f */
        private PathMeasure f715f;

        /* renamed from: g */
        private int f716g;

        /* renamed from: h */
        final C0136c f717h;

        /* renamed from: i */
        float f718i;

        /* renamed from: j */
        float f719j;

        /* renamed from: k */
        float f720k;

        /* renamed from: l */
        float f721l;

        /* renamed from: m */
        int f722m;

        /* renamed from: n */
        String f723n;

        /* renamed from: o */
        final ArrayMap<String, Object> f724o;

        public C0138e() {
            this.f712c = new Matrix();
            this.f718i = 0.0f;
            this.f719j = 0.0f;
            this.f720k = 0.0f;
            this.f721l = 0.0f;
            this.f722m = 255;
            this.f723n = null;
            this.f724o = new ArrayMap<>();
            this.f717h = new C0136c();
            this.f710a = new Path();
            this.f711b = new Path();
        }

        public C0138e(C0138e eVar) {
            this.f712c = new Matrix();
            this.f718i = 0.0f;
            this.f719j = 0.0f;
            this.f720k = 0.0f;
            this.f721l = 0.0f;
            this.f722m = 255;
            this.f723n = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.f724o = arrayMap;
            this.f717h = new C0136c(eVar.f717h, arrayMap);
            this.f710a = new Path(eVar.f710a);
            this.f711b = new Path(eVar.f711b);
            this.f718i = eVar.f718i;
            this.f719j = eVar.f719j;
            this.f720k = eVar.f720k;
            this.f721l = eVar.f721l;
            this.f716g = eVar.f716g;
            this.f722m = eVar.f722m;
            this.f723n = eVar.f723n;
            String str = eVar.f723n;
            if (str != null) {
                arrayMap.put(str, this);
            }
        }

        /* renamed from: e */
        private static float m378e(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: g */
        private void m379g(C0136c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f693a.set(matrix);
            cVar.f693a.preConcat(cVar.f702j);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f694b.size(); i3++) {
                Object obj = cVar.f694b.get(i3);
                if (obj instanceof C0136c) {
                    m379g((C0136c) obj, cVar.f693a, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0137d) {
                    m380h(cVar, (C0137d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: h */
        private void m380h(C0136c cVar, C0137d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f720k;
            float f2 = ((float) i2) / this.f721l;
            float min = Math.min(f, f2);
            Matrix matrix = cVar.f693a;
            this.f712c.set(matrix);
            this.f712c.postScale(f, f2);
            float i3 = m381i(matrix);
            if (i3 != 0.0f) {
                dVar.mo1306b(this.f710a);
                Path path = this.f710a;
                this.f711b.reset();
                if (dVar.mo1270a()) {
                    this.f711b.addPath(path, this.f712c);
                    canvas.clipPath(this.f711b);
                    return;
                }
                C0135b bVar = (C0135b) dVar;
                float f3 = bVar.f687k;
                if (!(f3 == 0.0f && bVar.f688l == 1.0f)) {
                    float f4 = bVar.f689m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (bVar.f688l + f4) % 1.0f;
                    if (this.f715f == null) {
                        this.f715f = new PathMeasure();
                    }
                    this.f715f.setPath(this.f710a, false);
                    float length = this.f715f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f715f.getSegment(f7, length, path, true);
                        this.f715f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f715f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f711b.addPath(path, this.f712c);
                if (bVar.f683g != 0) {
                    if (this.f714e == null) {
                        Paint paint = new Paint();
                        this.f714e = paint;
                        paint.setStyle(Paint.Style.FILL);
                        this.f714e.setAntiAlias(true);
                    }
                    Paint paint2 = this.f714e;
                    paint2.setColor(VectorDrawableCompat.m350a(bVar.f683g, bVar.f686j));
                    paint2.setColorFilter(colorFilter);
                    this.f711b.setFillType(bVar.f685i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f711b, paint2);
                }
                if (bVar.f681e != 0) {
                    if (this.f713d == null) {
                        Paint paint3 = new Paint();
                        this.f713d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                        this.f713d.setAntiAlias(true);
                    }
                    Paint paint4 = this.f713d;
                    Paint.Join join = bVar.f691o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = bVar.f690n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(bVar.f692p);
                    paint4.setColor(VectorDrawableCompat.m350a(bVar.f681e, bVar.f684h));
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(bVar.f682f * min * i3);
                    canvas.drawPath(this.f711b, paint4);
                }
            }
        }

        /* renamed from: i */
        private float m381i(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float e = m378e(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(e) / max;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public void mo1310f(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m379g(this.f717h, f709p, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f722m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f722m = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$f */
    public static class C0139f extends Drawable.ConstantState {

        /* renamed from: a */
        int f725a;

        /* renamed from: b */
        C0138e f726b;

        /* renamed from: c */
        ColorStateList f727c;

        /* renamed from: d */
        PorterDuff.Mode f728d;

        /* renamed from: e */
        boolean f729e;

        /* renamed from: f */
        Bitmap f730f;

        /* renamed from: g */
        ColorStateList f731g;

        /* renamed from: h */
        PorterDuff.Mode f732h;

        /* renamed from: i */
        int f733i;

        /* renamed from: j */
        boolean f734j;

        /* renamed from: k */
        boolean f735k;

        /* renamed from: l */
        Paint f736l;

        public C0139f() {
            this.f727c = null;
            this.f728d = VectorDrawableCompat.f671j;
            this.f726b = new C0138e();
        }

        public C0139f(C0139f fVar) {
            this.f727c = null;
            this.f728d = VectorDrawableCompat.f671j;
            if (fVar != null) {
                this.f725a = fVar.f725a;
                this.f726b = new C0138e(fVar.f726b);
                if (fVar.f726b.f714e != null) {
                    this.f726b.f714e = new Paint(fVar.f726b.f714e);
                }
                if (fVar.f726b.f713d != null) {
                    this.f726b.f713d = new Paint(fVar.f726b.f713d);
                }
                this.f727c = fVar.f727c;
                this.f728d = fVar.f728d;
                this.f729e = fVar.f729e;
            }
        }

        /* renamed from: a */
        public boolean mo1315a(int i, int i2) {
            return i == this.f730f.getWidth() && i2 == this.f730f.getHeight();
        }

        /* renamed from: b */
        public boolean mo1316b() {
            return !this.f735k && this.f731g == this.f727c && this.f732h == this.f728d && this.f734j == this.f729e && this.f733i == this.f726b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo1317c(int i, int i2) {
            if (this.f730f == null || !mo1315a(i, i2)) {
                this.f730f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f735k = true;
            }
        }

        /* renamed from: d */
        public void mo1318d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f730f, (Rect) null, rect, mo1319e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo1319e(ColorFilter colorFilter) {
            if (!mo1320f() && colorFilter == null) {
                return null;
            }
            if (this.f736l == null) {
                Paint paint = new Paint();
                this.f736l = paint;
                paint.setFilterBitmap(true);
            }
            this.f736l.setAlpha(this.f726b.getRootAlpha());
            this.f736l.setColorFilter(colorFilter);
            return this.f736l;
        }

        /* renamed from: f */
        public boolean mo1320f() {
            return this.f726b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public void mo1321g() {
            this.f731g = this.f727c;
            this.f732h = this.f728d;
            this.f733i = this.f726b.getRootAlpha();
            this.f734j = this.f729e;
            this.f735k = false;
        }

        public int getChangingConfigurations() {
            return this.f725a;
        }

        /* renamed from: h */
        public void mo1323h(int i, int i2) {
            this.f730f.eraseColor(0);
            this.f726b.mo1310f(new Canvas(this.f730f), i, i2, null);
        }

        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }
    }

    /* renamed from: android.support.graphics.drawable.VectorDrawableCompat$g */
    private static class C0140g extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f737a;

        public C0140g(Drawable.ConstantState constantState) {
            this.f737a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f737a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f737a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f754a = (VectorDrawable) this.f737a.newDrawable();
            return vectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f754a = (VectorDrawable) this.f737a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f754a = (VectorDrawable) this.f737a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    VectorDrawableCompat() {
        this.f676f = true;
        this.f677g = new float[9];
        this.f678h = new Matrix();
        this.f679i = new Rect();
        this.f672b = new C0139f();
    }

    VectorDrawableCompat(C0139f fVar) {
        this.f676f = true;
        this.f677g = new float[9];
        this.f678h = new Matrix();
        this.f679i = new Rect();
        this.f672b = fVar;
        this.f673c = mo1260j(this.f673c, fVar.f727c, fVar.f728d);
    }

    /* renamed from: a */
    static int m350a(int i, float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.graphics.drawable.VectorDrawableCompat m351b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            android.support.graphics.drawable.VectorDrawableCompat r0 = new android.support.graphics.drawable.VectorDrawableCompat
            r0.<init>()
            android.graphics.drawable.Drawable r6 = android.support.p009v4.content.res.ResourcesCompat.getDrawable(r6, r7, r8)
            r0.f754a = r6
            android.support.graphics.drawable.VectorDrawableCompat$g r6 = new android.support.graphics.drawable.VectorDrawableCompat$g
            android.graphics.drawable.Drawable r7 = r0.f754a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            android.support.graphics.drawable.VectorDrawableCompat r6 = m352c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            goto L_0x0046
        L_0x0045:
            r6 = move-exception
        L_0x0046:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.VectorDrawableCompat.m351b(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.graphics.drawable.VectorDrawableCompat");
    }

    /* renamed from: c */
    public static VectorDrawableCompat m352c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: android.support.graphics.drawable.VectorDrawableCompat$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m353e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C0134a aVar;
        C0139f fVar = this.f672b;
        C0138e eVar = fVar.f726b;
        Stack stack = new Stack();
        stack.push(eVar.f717h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0136c cVar = (C0136c) stack.peek();
                if ("path".equals(name)) {
                    C0135b bVar = new C0135b();
                    bVar.mo1272e(resources, attributeSet, theme, xmlPullParser);
                    cVar.f694b.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.f724o.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    aVar = bVar;
                } else if ("clip-path".equals(name)) {
                    C0134a aVar2 = new C0134a();
                    aVar2.mo1271c(resources, attributeSet, theme, xmlPullParser);
                    cVar.f694b.add(aVar2);
                    String pathName = aVar2.getPathName();
                    aVar = aVar2;
                    if (pathName != null) {
                        eVar.f724o.put(aVar2.getPathName(), aVar2);
                        aVar = aVar2;
                    }
                } else if ("group".equals(name)) {
                    C0136c cVar2 = new C0136c();
                    cVar2.mo1289c(resources, attributeSet, theme, xmlPullParser);
                    cVar.f694b.add(cVar2);
                    stack.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.f724o.put(cVar2.getGroupName(), cVar2);
                    }
                    i = fVar.f725a;
                    i2 = cVar2.f703k;
                    fVar.f725a = i2 | i;
                }
                i = fVar.f725a;
                i2 = aVar.f708c;
                fVar.f725a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + ((Object) stringBuffer) + " defined");
        }
    }

    /* renamed from: f */
    private boolean m354f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m355g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.ADD : mode;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m356i(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0139f fVar = this.f672b;
        C0138e eVar = fVar.f726b;
        fVar.f728d = m355g(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f727c = colorStateList;
        }
        fVar.f729e = TypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f729e);
        eVar.f720k = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f720k);
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f721l);
        eVar.f721l = namedFloat;
        if (eVar.f720k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (namedFloat > 0.0f) {
            eVar.f718i = typedArray.getDimension(3, eVar.f718i);
            float dimension = typedArray.getDimension(2, eVar.f719j);
            eVar.f719j = dimension;
            if (eVar.f718i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                eVar.setAlpha(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    eVar.f723n = string;
                    eVar.f724o.put(string, eVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f754a;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo1246d(String str) {
        return this.f672b.f726b.f724o.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f679i);
        if (this.f679i.width() > 0 && this.f679i.height() > 0) {
            ColorFilter colorFilter = this.f674d;
            if (colorFilter == null) {
                colorFilter = this.f673c;
            }
            canvas.getMatrix(this.f678h);
            this.f678h.getValues(this.f677g);
            float abs = Math.abs(this.f677g[0]);
            float abs2 = Math.abs(this.f677g[4]);
            float abs3 = Math.abs(this.f677g[1]);
            float abs4 = Math.abs(this.f677g[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f679i.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f679i.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f679i;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m354f()) {
                    canvas.translate((float) this.f679i.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f679i.offsetTo(0, 0);
                this.f672b.mo1317c(min, min2);
                if (!this.f676f) {
                    this.f672b.mo1323h(min, min2);
                } else if (!this.f672b.mo1316b()) {
                    this.f672b.mo1323h(min, min2);
                    this.f672b.mo1321g();
                }
                this.f672b.mo1318d(canvas, colorFilter, this.f679i);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f754a;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f672b.f726b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f672b.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f754a != null && Build.VERSION.SDK_INT >= 24) {
            return new C0140g(this.f754a.getConstantState());
        }
        this.f672b.f725a = getChangingConfigurations();
        return this.f672b;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f672b.f726b.f719j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f672b.f726b.f718i;
    }

    public int getOpacity() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1254h(boolean z) {
        this.f676f = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0139f fVar = this.f672b;
        fVar.f726b = new C0138e();
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0141a.f738a);
        m356i(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
        fVar.f725a = getChangingConfigurations();
        fVar.f735k = true;
        m353e(resources, xmlPullParser, attributeSet, theme);
        this.f673c = mo1260j(this.f673c, fVar.f727c, fVar.f728d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f754a;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f672b.f729e;
    }

    public boolean isStateful() {
        C0139f fVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || !((fVar = this.f672b) == null || (colorStateList = fVar.f727c) == null || !colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo1260j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f675e && super.mutate() == this) {
            this.f672b = new C0139f(this.f672b);
            this.f675e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f754a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0139f fVar = this.f672b;
        ColorStateList colorStateList = fVar.f727c;
        if (colorStateList == null || (mode = fVar.f728d) == null) {
            return false;
        }
        this.f673c = mo1260j(this.f673c, colorStateList, mode);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f672b.f726b.getRootAlpha() != i) {
            this.f672b.f726b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f672b.f729e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f674d = colorFilter;
        invalidateSelf();
    }

    @Override // android.support.p009v4.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.support.p009v4.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        C0139f fVar = this.f672b;
        if (fVar.f727c != colorStateList) {
            fVar.f727c = colorStateList;
            this.f673c = mo1260j(this.f673c, colorStateList, fVar.f728d);
            invalidateSelf();
        }
    }

    @Override // android.support.p009v4.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        C0139f fVar = this.f672b;
        if (fVar.f728d != mode) {
            fVar.f728d = mode;
            this.f673c = mo1260j(this.f673c, fVar.f727c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f754a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f754a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
