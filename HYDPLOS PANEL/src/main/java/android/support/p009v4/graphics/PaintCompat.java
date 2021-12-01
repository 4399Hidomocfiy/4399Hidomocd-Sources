package android.support.p009v4.graphics;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: android.support.v4.graphics.PaintCompat */
public final class PaintCompat {
    private PaintCompat() {
    }

    public static boolean hasGlyph(Paint paint, String str) {
        return Build.VERSION.SDK_INT >= 23 ? paint.hasGlyph(str) : PaintCompatApi14.hasGlyph(paint, str);
    }
}
