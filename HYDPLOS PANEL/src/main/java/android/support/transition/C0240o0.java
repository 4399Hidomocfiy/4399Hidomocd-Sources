package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.o0 */
class C0240o0 implements AbstractC0245q0 {

    /* renamed from: a */
    private static LayoutTransition f946a;

    /* renamed from: b */
    private static Field f947b;

    /* renamed from: c */
    private static boolean f948c;

    /* renamed from: d */
    private static Method f949d;

    /* renamed from: e */
    private static boolean f950e;

    /* renamed from: android.support.transition.o0$a */
    class C0241a extends LayoutTransition {
        C0241a(C0240o0 o0Var) {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    C0240o0() {
    }

    /* renamed from: c */
    private static void m652c(LayoutTransition layoutTransition) {
        if (!f950e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f949d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f950e = true;
        }
        Method method = f949d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // android.support.transition.AbstractC0245q0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1599a(android.view.ViewGroup r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0240o0.mo1599a(android.view.ViewGroup, boolean):void");
    }

    @Override // android.support.transition.AbstractC0245q0
    /* renamed from: b */
    public AbstractC0235m0 mo1600b(ViewGroup viewGroup) {
        return C0230k0.m630g(viewGroup);
    }
}
