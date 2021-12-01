package android.support.p009v4.graphics;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: android.support.v4.graphics.BitmapCompat */
public final class BitmapCompat {
    static final BitmapCompatBaseImpl IMPL;

    /* renamed from: android.support.v4.graphics.BitmapCompat$BitmapCompatApi18Impl */
    static class BitmapCompatApi18Impl extends BitmapCompatBaseImpl {
        BitmapCompatApi18Impl() {
        }

        @Override // android.support.p009v4.graphics.BitmapCompat.BitmapCompatBaseImpl
        public boolean hasMipMap(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @Override // android.support.p009v4.graphics.BitmapCompat.BitmapCompatBaseImpl
        public void setHasMipMap(Bitmap bitmap, boolean z) {
            bitmap.setHasMipMap(z);
        }
    }

    /* renamed from: android.support.v4.graphics.BitmapCompat$BitmapCompatApi19Impl */
    static class BitmapCompatApi19Impl extends BitmapCompatApi18Impl {
        BitmapCompatApi19Impl() {
        }

        @Override // android.support.p009v4.graphics.BitmapCompat.BitmapCompatBaseImpl
        public int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    /* renamed from: android.support.v4.graphics.BitmapCompat$BitmapCompatBaseImpl */
    static class BitmapCompatBaseImpl {
        BitmapCompatBaseImpl() {
        }

        public int getAllocationByteCount(Bitmap bitmap) {
            return bitmap.getByteCount();
        }

        public boolean hasMipMap(Bitmap bitmap) {
            return false;
        }

        public void setHasMipMap(Bitmap bitmap, boolean z) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 19 ? new BitmapCompatApi19Impl() : i >= 18 ? new BitmapCompatApi18Impl() : new BitmapCompatBaseImpl();
    }

    private BitmapCompat() {
    }

    public static int getAllocationByteCount(Bitmap bitmap) {
        return IMPL.getAllocationByteCount(bitmap);
    }

    public static boolean hasMipMap(Bitmap bitmap) {
        return IMPL.hasMipMap(bitmap);
    }

    public static void setHasMipMap(Bitmap bitmap, boolean z) {
        IMPL.setHasMipMap(bitmap, z);
    }
}
