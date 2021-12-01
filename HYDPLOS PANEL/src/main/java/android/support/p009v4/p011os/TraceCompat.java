package android.support.p009v4.p011os;

import android.os.Build;
import android.os.Trace;

/* renamed from: android.support.v4.os.TraceCompat */
public final class TraceCompat {
    private TraceCompat() {
    }

    public static void beginSection(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
