package android.support.p009v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.graphics.drawable.DrawableCompat */
public final class DrawableCompat {
    static final DrawableCompatBaseImpl IMPL;

    /* renamed from: android.support.v4.graphics.drawable.DrawableCompat$DrawableCompatApi17Impl */
    static class DrawableCompatApi17Impl extends DrawableCompatBaseImpl {
        private static final String TAG = "DrawableCompatApi17";
        private static Method sGetLayoutDirectionMethod;
        private static boolean sGetLayoutDirectionMethodFetched;
        private static Method sSetLayoutDirectionMethod;
        private static boolean sSetLayoutDirectionMethodFetched;

        DrawableCompatApi17Impl() {
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public int getLayoutDirection(Drawable drawable) {
            if (!sGetLayoutDirectionMethodFetched) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    sGetLayoutDirectionMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(TAG, "Failed to retrieve getLayoutDirection() method", e);
                }
                sGetLayoutDirectionMethodFetched = true;
            }
            Method method = sGetLayoutDirectionMethod;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i(TAG, "Failed to invoke getLayoutDirection() via reflection", e2);
                    sGetLayoutDirectionMethod = null;
                }
            }
            return 0;
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public boolean setLayoutDirection(Drawable drawable, int i) {
            if (!sSetLayoutDirectionMethodFetched) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    sSetLayoutDirectionMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(TAG, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                sSetLayoutDirectionMethodFetched = true;
            }
            Method method = sSetLayoutDirectionMethod;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i(TAG, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    sSetLayoutDirectionMethod = null;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.DrawableCompat$DrawableCompatApi19Impl */
    static class DrawableCompatApi19Impl extends DrawableCompatApi17Impl {
        DrawableCompatApi19Impl() {
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public int getAlpha(Drawable drawable) {
            return drawable.getAlpha();
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public boolean isAutoMirrored(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void setAutoMirrored(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public Drawable wrap(Drawable drawable) {
            return !(drawable instanceof TintAwareDrawable) ? new DrawableWrapperApi19(drawable) : drawable;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.DrawableCompat$DrawableCompatApi21Impl */
    static class DrawableCompatApi21Impl extends DrawableCompatApi19Impl {
        DrawableCompatApi21Impl() {
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void applyTheme(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public boolean canApplyTheme(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void clearColorFilter(Drawable drawable) {
            DrawableContainer.DrawableContainerState drawableContainerState;
            Drawable wrappedDrawable;
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                wrappedDrawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof DrawableWrapper) {
                wrappedDrawable = ((DrawableWrapper) drawable).getWrappedDrawable();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        clearColorFilter(child);
                    }
                }
                return;
            } else {
                return;
            }
            clearColorFilter(wrappedDrawable);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public ColorFilter getColorFilter(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void setHotspot(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void setTint(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void setTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl, android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatApi19Impl
        public Drawable wrap(Drawable drawable) {
            return !(drawable instanceof TintAwareDrawable) ? new DrawableWrapperApi21(drawable) : drawable;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.DrawableCompat$DrawableCompatApi23Impl */
    static class DrawableCompatApi23Impl extends DrawableCompatApi21Impl {
        DrawableCompatApi23Impl() {
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatApi21Impl, android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl
        public void clearColorFilter(Drawable drawable) {
            drawable.clearColorFilter();
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl, android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatApi17Impl
        public int getLayoutDirection(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl, android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatApi17Impl
        public boolean setLayoutDirection(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatApi21Impl, android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatBaseImpl, android.support.p009v4.graphics.drawable.DrawableCompat.DrawableCompatApi19Impl
        public Drawable wrap(Drawable drawable) {
            return drawable;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.DrawableCompat$DrawableCompatBaseImpl */
    static class DrawableCompatBaseImpl {
        DrawableCompatBaseImpl() {
        }

        public void applyTheme(Drawable drawable, Resources.Theme theme) {
        }

        public boolean canApplyTheme(Drawable drawable) {
            return false;
        }

        public void clearColorFilter(Drawable drawable) {
            drawable.clearColorFilter();
        }

        public int getAlpha(Drawable drawable) {
            return 0;
        }

        public ColorFilter getColorFilter(Drawable drawable) {
            return null;
        }

        public int getLayoutDirection(Drawable drawable) {
            return 0;
        }

        public void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }

        public boolean isAutoMirrored(Drawable drawable) {
            return false;
        }

        public void jumpToCurrentState(Drawable drawable) {
            drawable.jumpToCurrentState();
        }

        public void setAutoMirrored(Drawable drawable, boolean z) {
        }

        public void setHotspot(Drawable drawable, float f, float f2) {
        }

        public void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        public boolean setLayoutDirection(Drawable drawable, int i) {
            return false;
        }

        public void setTint(Drawable drawable, int i) {
            if (drawable instanceof TintAwareDrawable) {
                ((TintAwareDrawable) drawable).setTint(i);
            }
        }

        public void setTintList(Drawable drawable, ColorStateList colorStateList) {
            if (drawable instanceof TintAwareDrawable) {
                ((TintAwareDrawable) drawable).setTintList(colorStateList);
            }
        }

        public void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            if (drawable instanceof TintAwareDrawable) {
                ((TintAwareDrawable) drawable).setTintMode(mode);
            }
        }

        public Drawable wrap(Drawable drawable) {
            return !(drawable instanceof TintAwareDrawable) ? new DrawableWrapperApi14(drawable) : drawable;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 23 ? new DrawableCompatApi23Impl() : i >= 21 ? new DrawableCompatApi21Impl() : i >= 19 ? new DrawableCompatApi19Impl() : i >= 17 ? new DrawableCompatApi17Impl() : new DrawableCompatBaseImpl();
    }

    private DrawableCompat() {
    }

    public static void applyTheme(Drawable drawable, Resources.Theme theme) {
        IMPL.applyTheme(drawable, theme);
    }

    public static boolean canApplyTheme(Drawable drawable) {
        return IMPL.canApplyTheme(drawable);
    }

    public static void clearColorFilter(Drawable drawable) {
        IMPL.clearColorFilter(drawable);
    }

    public static int getAlpha(Drawable drawable) {
        return IMPL.getAlpha(drawable);
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        return IMPL.getColorFilter(drawable);
    }

    public static int getLayoutDirection(Drawable drawable) {
        return IMPL.getLayoutDirection(drawable);
    }

    public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        IMPL.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(Drawable drawable) {
        return IMPL.isAutoMirrored(drawable);
    }

    public static void jumpToCurrentState(Drawable drawable) {
        IMPL.jumpToCurrentState(drawable);
    }

    public static void setAutoMirrored(Drawable drawable, boolean z) {
        IMPL.setAutoMirrored(drawable, z);
    }

    public static void setHotspot(Drawable drawable, float f, float f2) {
        IMPL.setHotspot(drawable, f, f2);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        IMPL.setHotspotBounds(drawable, i, i2, i3, i4);
    }

    public static boolean setLayoutDirection(Drawable drawable, int i) {
        return IMPL.setLayoutDirection(drawable, i);
    }

    public static void setTint(Drawable drawable, int i) {
        IMPL.setTint(drawable, i);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        IMPL.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        IMPL.setTintMode(drawable, mode);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(Drawable drawable) {
        return drawable instanceof DrawableWrapper ? (T) ((DrawableWrapper) drawable).getWrappedDrawable() : drawable;
    }

    public static Drawable wrap(Drawable drawable) {
        return IMPL.wrap(drawable);
    }
}
