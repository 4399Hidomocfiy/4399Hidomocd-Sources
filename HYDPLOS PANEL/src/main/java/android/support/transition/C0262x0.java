package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.x0 */
class C0262x0 extends C0260w0 {

    /* renamed from: b */
    private static Method f973b;

    /* renamed from: c */
    private static boolean f974c;

    /* renamed from: d */
    private static Method f975d;

    /* renamed from: e */
    private static boolean f976e;

    C0262x0() {
    }

    /* renamed from: k */
    private void m712k() {
        if (!f976e) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f975d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f976e = true;
        }
    }

    /* renamed from: l */
    private void m713l() {
        if (!f974c) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f973b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f974c = true;
        }
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: d */
    public void mo1516d(View view) {
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: e */
    public void mo1517e(View view) {
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: f */
    public float mo1518f(View view) {
        m712k();
        Method method = f975d;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo1518f(view);
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: i */
    public void mo1521i(View view, float f) {
        m713l();
        Method method = f973b;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }
}
