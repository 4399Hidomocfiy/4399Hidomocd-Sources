package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p012v7.appcompat.C0467R;

/* access modifiers changed from: package-private */
public class ThemeUtils {
    private static final int[] APPCOMPAT_CHECK_ATTRS = {C0467R.attr.colorPrimary};

    ThemeUtils() {
    }

    static void checkAppCompatTheme(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(APPCOMPAT_CHECK_ATTRS);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
