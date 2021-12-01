package android.support.p009v4.app;

import android.app.Service;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.app.ServiceCompat */
public final class ServiceCompat {
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.app.ServiceCompat$StopForegroundFlags */
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
    }

    public static void stopForeground(Service service, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            service.stopForeground(i);
            return;
        }
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        service.stopForeground(z);
    }
}
