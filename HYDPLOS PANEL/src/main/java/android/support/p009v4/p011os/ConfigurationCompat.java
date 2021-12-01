package android.support.p009v4.p011os;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: android.support.v4.os.ConfigurationCompat */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    public static LocaleListCompat getLocales(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleListCompat.wrap(configuration.getLocales());
        }
        return LocaleListCompat.create(configuration.locale);
    }
}
