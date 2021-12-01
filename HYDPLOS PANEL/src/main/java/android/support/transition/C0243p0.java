package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.p0 */
class C0243p0 extends C0240o0 {

    /* renamed from: f */
    private static Method f952f;

    /* renamed from: g */
    private static boolean f953g;

    C0243p0() {
    }

    /* renamed from: d */
    private void m656d() {
        if (!f953g) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f952f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f953g = true;
        }
    }

    @Override // android.support.transition.AbstractC0245q0, android.support.transition.C0240o0
    /* renamed from: a */
    public void mo1599a(ViewGroup viewGroup, boolean z) {
        String str;
        Throwable e;
        m656d();
        Method method = f952f;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
                return;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "Failed to invoke suppressLayout method";
            } catch (InvocationTargetException e3) {
                e = e3;
                str = "Error invoking suppressLayout method";
            }
        } else {
            return;
        }
        Log.i("ViewUtilsApi18", str, e);
    }

    @Override // android.support.transition.AbstractC0245q0, android.support.transition.C0240o0
    /* renamed from: b */
    public AbstractC0235m0 mo1600b(ViewGroup viewGroup) {
        return new C0233l0(viewGroup);
    }
}
