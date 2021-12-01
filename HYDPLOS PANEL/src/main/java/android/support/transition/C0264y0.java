package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.y0 */
class C0264y0 extends C0262x0 {

    /* renamed from: f */
    private static Method f986f;

    /* renamed from: g */
    private static boolean f987g;

    /* renamed from: h */
    private static Method f988h;

    /* renamed from: i */
    private static boolean f989i;

    /* renamed from: j */
    private static Method f990j;

    /* renamed from: k */
    private static boolean f991k;

    C0264y0() {
    }

    /* renamed from: m */
    private void m718m() {
        if (!f991k) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", Matrix.class);
                f990j = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve setAnimationMatrix method", e);
            }
            f991k = true;
        }
    }

    /* renamed from: n */
    private void m719n() {
        if (!f987g) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f986f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f987g = true;
        }
    }

    /* renamed from: o */
    private void m720o() {
        if (!f989i) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f988h = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f989i = true;
        }
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: a */
    public void mo1513a(View view, Matrix matrix) {
        m719n();
        Method method = f986f;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: c */
    public void mo1515c(View view, Matrix matrix) {
        m718m();
        Method method = f990j;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (InvocationTargetException unused) {
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: g */
    public void mo1519g(View view, Matrix matrix) {
        m720o();
        Method method = f988h;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
