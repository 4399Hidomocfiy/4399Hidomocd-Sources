package android.support.p009v4.text;

import android.os.Build;
import java.util.Locale;

/* renamed from: android.support.v4.text.ICUCompat */
public final class ICUCompat {
    private static final ICUCompatBaseImpl IMPL = (Build.VERSION.SDK_INT >= 21 ? new ICUCompatApi21Impl() : new ICUCompatBaseImpl());

    /* renamed from: android.support.v4.text.ICUCompat$ICUCompatApi21Impl */
    static class ICUCompatApi21Impl extends ICUCompatBaseImpl {
        ICUCompatApi21Impl() {
        }

        @Override // android.support.p009v4.text.ICUCompat.ICUCompatBaseImpl
        public String maximizeAndGetScript(Locale locale) {
            return ICUCompatApi21.maximizeAndGetScript(locale);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.text.ICUCompat$ICUCompatBaseImpl */
    public static class ICUCompatBaseImpl {
        ICUCompatBaseImpl() {
        }

        public String maximizeAndGetScript(Locale locale) {
            return ICUCompatIcs.maximizeAndGetScript(locale);
        }
    }

    private ICUCompat() {
    }

    public static String maximizeAndGetScript(Locale locale) {
        return IMPL.maximizeAndGetScript(locale);
    }
}
