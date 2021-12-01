package android.support.p009v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.CompoundButtonCompat */
public final class CompoundButtonCompat {
    private static final CompoundButtonCompatBaseImpl IMPL;

    /* renamed from: android.support.v4.widget.CompoundButtonCompat$CompoundButtonCompatApi21Impl */
    static class CompoundButtonCompatApi21Impl extends CompoundButtonCompatBaseImpl {
        CompoundButtonCompatApi21Impl() {
        }

        @Override // android.support.p009v4.widget.CompoundButtonCompat.CompoundButtonCompatBaseImpl
        public ColorStateList getButtonTintList(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @Override // android.support.p009v4.widget.CompoundButtonCompat.CompoundButtonCompatBaseImpl
        public PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @Override // android.support.p009v4.widget.CompoundButtonCompat.CompoundButtonCompatBaseImpl
        public void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @Override // android.support.p009v4.widget.CompoundButtonCompat.CompoundButtonCompatBaseImpl
        public void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.CompoundButtonCompat$CompoundButtonCompatApi23Impl */
    static class CompoundButtonCompatApi23Impl extends CompoundButtonCompatApi21Impl {
        CompoundButtonCompatApi23Impl() {
        }

        @Override // android.support.p009v4.widget.CompoundButtonCompat.CompoundButtonCompatBaseImpl
        public Drawable getButtonDrawable(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: android.support.v4.widget.CompoundButtonCompat$CompoundButtonCompatBaseImpl */
    static class CompoundButtonCompatBaseImpl {
        private static final String TAG = "CompoundButtonCompat";
        private static Field sButtonDrawableField;
        private static boolean sButtonDrawableFieldFetched;

        CompoundButtonCompatBaseImpl() {
        }

        public Drawable getButtonDrawable(CompoundButton compoundButton) {
            if (!sButtonDrawableFieldFetched) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    sButtonDrawableField = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(TAG, "Failed to retrieve mButtonDrawable field", e);
                }
                sButtonDrawableFieldFetched = true;
            }
            Field field = sButtonDrawableField;
            if (field != null) {
                try {
                    return (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i(TAG, "Failed to get button drawable via reflection", e2);
                    sButtonDrawableField = null;
                }
            }
            return null;
        }

        public ColorStateList getButtonTintList(CompoundButton compoundButton) {
            if (compoundButton instanceof TintableCompoundButton) {
                return ((TintableCompoundButton) compoundButton).getSupportButtonTintList();
            }
            return null;
        }

        public PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
            if (compoundButton instanceof TintableCompoundButton) {
                return ((TintableCompoundButton) compoundButton).getSupportButtonTintMode();
            }
            return null;
        }

        public void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof TintableCompoundButton) {
                ((TintableCompoundButton) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        public void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
            if (compoundButton instanceof TintableCompoundButton) {
                ((TintableCompoundButton) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 23 ? new CompoundButtonCompatApi23Impl() : i >= 21 ? new CompoundButtonCompatApi21Impl() : new CompoundButtonCompatBaseImpl();
    }

    private CompoundButtonCompat() {
    }

    public static Drawable getButtonDrawable(CompoundButton compoundButton) {
        return IMPL.getButtonDrawable(compoundButton);
    }

    public static ColorStateList getButtonTintList(CompoundButton compoundButton) {
        return IMPL.getButtonTintList(compoundButton);
    }

    public static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
        return IMPL.getButtonTintMode(compoundButton);
    }

    public static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
        IMPL.setButtonTintList(compoundButton, colorStateList);
    }

    public static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
        IMPL.setButtonTintMode(compoundButton, mode);
    }
}
