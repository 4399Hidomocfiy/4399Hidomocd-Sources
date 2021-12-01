package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: android.support.transition.k */
class C0229k {

    /* renamed from: a */
    private static final AbstractC0236n f939a = (Build.VERSION.SDK_INT >= 21 ? new C0234m() : new C0231l());

    /* renamed from: a */
    static void m627a(ImageView imageView, Matrix matrix) {
        f939a.mo1561a(imageView, matrix);
    }

    /* renamed from: b */
    static void m628b(ImageView imageView, Animator animator) {
        f939a.mo1563c(imageView, animator);
    }

    /* renamed from: c */
    static void m629c(ImageView imageView) {
        f939a.mo1562b(imageView);
    }
}
