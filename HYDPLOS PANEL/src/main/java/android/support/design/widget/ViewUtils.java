package android.support.design.widget;

import android.graphics.PorterDuff;

class ViewUtils {
    ViewUtils() {
    }

    static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        return i != 3 ? i != 5 ? i != 9 ? i != 14 ? i != 15 ? mode : PorterDuff.Mode.SCREEN : PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_ATOP : PorterDuff.Mode.SRC_IN : PorterDuff.Mode.SRC_OVER;
    }
}
