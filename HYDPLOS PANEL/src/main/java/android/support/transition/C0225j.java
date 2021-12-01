package android.support.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.support.transition.AbstractC0222i;
import android.support.transition.C0213g;
import android.support.transition.C0218h;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.j */
class C0225j {

    /* renamed from: a */
    private static final AbstractC0222i.AbstractC0223a f929a = (Build.VERSION.SDK_INT >= 21 ? new C0218h.C0220b() : new C0213g.C0215b());

    /* renamed from: a */
    static AbstractC0222i m624a(View view, ViewGroup viewGroup, Matrix matrix) {
        return f929a.mo1548a(view, viewGroup, matrix);
    }

    /* renamed from: b */
    static void m625b(View view) {
        f929a.mo1549b(view);
    }
}
