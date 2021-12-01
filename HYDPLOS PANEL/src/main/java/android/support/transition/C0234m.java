package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.m */
class C0234m implements AbstractC0236n {

    /* renamed from: a */
    private static Method f942a;

    /* renamed from: b */
    private static boolean f943b;

    C0234m() {
    }

    /* renamed from: d */
    private void m640d() {
        if (!f943b) {
            try {
                Method declaredMethod = ImageView.class.getDeclaredMethod("animateTransform", Matrix.class);
                f942a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ImageViewUtilsApi21", "Failed to retrieve animateTransform method", e);
            }
            f943b = true;
        }
    }

    @Override // android.support.transition.AbstractC0236n
    /* renamed from: a */
    public void mo1561a(ImageView imageView, Matrix matrix) {
        m640d();
        Method method = f942a;
        if (method != null) {
            try {
                method.invoke(imageView, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // android.support.transition.AbstractC0236n
    /* renamed from: b */
    public void mo1562b(ImageView imageView) {
    }

    @Override // android.support.transition.AbstractC0236n
    /* renamed from: c */
    public void mo1563c(ImageView imageView, Animator animator) {
    }
}
