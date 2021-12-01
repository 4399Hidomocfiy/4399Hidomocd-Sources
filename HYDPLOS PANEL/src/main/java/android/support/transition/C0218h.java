package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.AbstractC0222i;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.h */
class C0218h implements AbstractC0222i {

    /* renamed from: b */
    private static Class<?> f915b;

    /* renamed from: c */
    private static boolean f916c;

    /* renamed from: d */
    private static Method f917d;

    /* renamed from: e */
    private static boolean f918e;

    /* renamed from: f */
    private static Method f919f;

    /* renamed from: g */
    private static boolean f920g;

    /* renamed from: a */
    private final View f921a;

    /* renamed from: android.support.transition.h$b */
    static class C0220b implements AbstractC0222i.AbstractC0223a {
        C0220b() {
        }

        @Override // android.support.transition.AbstractC0222i.AbstractC0223a
        /* renamed from: a */
        public AbstractC0222i mo1548a(View view, ViewGroup viewGroup, Matrix matrix) {
            C0218h.m615f();
            if (C0218h.f917d != null) {
                try {
                    return new C0218h((View) C0218h.f917d.invoke(null, view, viewGroup, matrix));
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            return null;
        }

        @Override // android.support.transition.AbstractC0222i.AbstractC0223a
        /* renamed from: b */
        public void mo1549b(View view) {
            C0218h.m617h();
            if (C0218h.f919f != null) {
                try {
                    C0218h.f919f.invoke(null, view);
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
    }

    private C0218h(View view) {
        this.f921a = view;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m615f() {
        if (!f918e) {
            try {
                m616g();
                Method declaredMethod = f915b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f917d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
            }
            f918e = true;
        }
    }

    /* renamed from: g */
    private static void m616g() {
        if (!f916c) {
            try {
                f915b = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
            }
            f916c = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m617h() {
        if (!f920g) {
            try {
                m616g();
                Method declaredMethod = f915b.getDeclaredMethod("removeGhost", View.class);
                f919f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
            }
            f920g = true;
        }
    }

    @Override // android.support.transition.AbstractC0222i
    /* renamed from: a */
    public void mo1542a(ViewGroup viewGroup, View view) {
    }

    @Override // android.support.transition.AbstractC0222i
    public void setVisibility(int i) {
        this.f921a.setVisibility(i);
    }
}
