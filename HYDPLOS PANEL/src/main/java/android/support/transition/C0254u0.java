package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.support.p009v4.view.ViewCompat;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: android.support.transition.u0 */
public class C0254u0 {

    /* renamed from: a */
    private static final AbstractC0195a1 f967a;

    /* renamed from: b */
    private static Field f968b;

    /* renamed from: c */
    private static boolean f969c;

    /* renamed from: d */
    static final Property<View, Float> f970d = new C0255a(Float.class, "translationAlpha");

    /* renamed from: e */
    static final Property<View, Rect> f971e = new C0256b(Rect.class, "clipBounds");

    /* renamed from: android.support.transition.u0$a */
    static class C0255a extends Property<View, Float> {
        C0255a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0254u0.m684d(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C0254u0.m689i(view, f.floatValue());
        }
    }

    /* renamed from: android.support.transition.u0$b */
    static class C0256b extends Property<View, Rect> {
        C0256b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return ViewCompat.getClipBounds(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            ViewCompat.setClipBounds(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f967a = i >= 22 ? new C0266z0() : i >= 21 ? new C0264y0() : i >= 19 ? new C0262x0() : i >= 18 ? new C0260w0() : new C0258v0();
    }

    /* renamed from: a */
    static void m681a(View view) {
        f967a.mo1517e(view);
    }

    /* renamed from: b */
    private static void m682b() {
        if (!f969c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f968b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f969c = true;
        }
    }

    /* renamed from: c */
    static AbstractC0252t0 m683c(View view) {
        return f967a.mo1522j(view);
    }

    /* renamed from: d */
    static float m684d(View view) {
        return f967a.mo1518f(view);
    }

    /* renamed from: e */
    static AbstractC0210e1 m685e(View view) {
        return f967a.mo1514b(view);
    }

    /* renamed from: f */
    static void m686f(View view) {
        f967a.mo1516d(view);
    }

    /* renamed from: g */
    static void m687g(View view, Matrix matrix) {
        f967a.mo1515c(view, matrix);
    }

    /* renamed from: h */
    static void m688h(View view, int i, int i2, int i3, int i4) {
        f967a.mo1520h(view, i, i2, i3, i4);
    }

    /* renamed from: i */
    static void m689i(View view, float f) {
        f967a.mo1521i(view, f);
    }

    /* renamed from: j */
    static void m690j(View view, int i) {
        m682b();
        Field field = f968b;
        if (field != null) {
            try {
                f968b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    /* renamed from: k */
    static void m691k(View view, Matrix matrix) {
        f967a.mo1513a(view, matrix);
    }

    /* renamed from: l */
    static void m692l(View view, Matrix matrix) {
        f967a.mo1519g(view, matrix);
    }
}
