package android.support.p009v4.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.net.ConnectivityManagerCompat */
public final class ConnectivityManagerCompat {
    private static final ConnectivityManagerCompatImpl IMPL;
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    /* renamed from: android.support.v4.net.ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl */
    static class ConnectivityManagerCompatApi16Impl extends ConnectivityManagerCompatBaseImpl {
        ConnectivityManagerCompatApi16Impl() {
        }

        @Override // android.support.p009v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatImpl, android.support.p009v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatBaseImpl
        public boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: android.support.v4.net.ConnectivityManagerCompat$ConnectivityManagerCompatApi24Impl */
    static class ConnectivityManagerCompatApi24Impl extends ConnectivityManagerCompatApi16Impl {
        ConnectivityManagerCompatApi24Impl() {
        }

        @Override // android.support.p009v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatImpl, android.support.p009v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatBaseImpl
        public int getRestrictBackgroundStatus(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* renamed from: android.support.v4.net.ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl */
    static class ConnectivityManagerCompatBaseImpl implements ConnectivityManagerCompatImpl {
        ConnectivityManagerCompatBaseImpl() {
        }

        @Override // android.support.p009v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatImpl
        public int getRestrictBackgroundStatus(ConnectivityManager connectivityManager) {
            return 3;
        }

        @Override // android.support.p009v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatImpl
        public boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return true;
            }
            int type = activeNetworkInfo.getType();
            return (type == 1 || type == 7 || type == 9) ? false : true;
        }
    }

    /* renamed from: android.support.v4.net.ConnectivityManagerCompat$ConnectivityManagerCompatImpl */
    interface ConnectivityManagerCompatImpl {
        int getRestrictBackgroundStatus(ConnectivityManager connectivityManager);

        boolean isActiveNetworkMetered(ConnectivityManager connectivityManager);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.net.ConnectivityManagerCompat$RestrictBackgroundStatus */
    public @interface RestrictBackgroundStatus {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 24 ? new ConnectivityManagerCompatApi24Impl() : i >= 16 ? new ConnectivityManagerCompatApi16Impl() : new ConnectivityManagerCompatBaseImpl();
    }

    private ConnectivityManagerCompat() {
    }

    public static NetworkInfo getNetworkInfoFromBroadcast(ConnectivityManager connectivityManager, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int getRestrictBackgroundStatus(ConnectivityManager connectivityManager) {
        return IMPL.getRestrictBackgroundStatus(connectivityManager);
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
        return IMPL.isActiveNetworkMetered(connectivityManager);
    }
}
