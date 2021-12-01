package android.support.p009v4.content.res;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: android.support.v4.content.res.ConfigurationHelper */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
    }

    public static int getDensityDpi(Resources resources) {
        return Build.VERSION.SDK_INT >= 17 ? resources.getConfiguration().densityDpi : resources.getDisplayMetrics().densityDpi;
    }

    @Deprecated
    public static int getScreenHeightDp(Resources resources) {
        return resources.getConfiguration().screenHeightDp;
    }

    @Deprecated
    public static int getScreenWidthDp(Resources resources) {
        return resources.getConfiguration().screenWidthDp;
    }

    @Deprecated
    public static int getSmallestScreenWidthDp(Resources resources) {
        return resources.getConfiguration().smallestScreenWidthDp;
    }
}
