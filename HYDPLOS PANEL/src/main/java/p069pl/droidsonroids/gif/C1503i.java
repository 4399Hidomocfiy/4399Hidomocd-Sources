package p069pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: pl.droidsonroids.gif.i */
public class C1503i {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static Context f3690a;

    /* renamed from: a */
    private static Context m4193a() {
        if (f3690a == null) {
            try {
                f3690a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
            }
        }
        return f3690a;
    }

    /* renamed from: b */
    static void m4194b() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            C1506l.m4202h(m4193a());
        }
    }
}
