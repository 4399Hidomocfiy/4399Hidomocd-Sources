package android.support.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.z0 */
class C0266z0 extends C0264y0 {

    /* renamed from: l */
    private static Method f993l;

    /* renamed from: m */
    private static boolean f994m;

    C0266z0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: p */
    private void m725p() {
        if (!f994m) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", cls, cls, cls, cls);
                f993l = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f994m = true;
        }
    }

    @Override // android.support.transition.AbstractC0195a1, android.support.transition.C0258v0
    /* renamed from: h */
    public void mo1520h(View view, int i, int i2, int i3, int i4) {
        m725p();
        Method method = f993l;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
