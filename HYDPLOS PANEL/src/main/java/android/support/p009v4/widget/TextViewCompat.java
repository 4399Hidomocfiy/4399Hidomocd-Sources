package android.support.p009v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.TextViewCompat */
public final class TextViewCompat {
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    static final TextViewCompatBaseImpl IMPL;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.widget.TextViewCompat$AutoSizeTextType */
    public @interface AutoSizeTextType {
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$TextViewCompatApi16Impl */
    static class TextViewCompatApi16Impl extends TextViewCompatBaseImpl {
        TextViewCompatApi16Impl() {
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getMaxLines(TextView textView) {
            return textView.getMaxLines();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getMinLines(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$TextViewCompatApi17Impl */
    static class TextViewCompatApi17Impl extends TextViewCompatApi16Impl {
        TextViewCompatApi17Impl() {
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public Drawable[] getCompoundDrawablesRelative(TextView textView) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            int i5 = z ? i3 : i;
            if (!z) {
                i = i3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(i5, i2, i, i4);
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        }
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$TextViewCompatApi18Impl */
    static class TextViewCompatApi18Impl extends TextViewCompatApi17Impl {
        TextViewCompatApi18Impl() {
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl, android.support.p009v4.widget.TextViewCompat.TextViewCompatApi17Impl
        public Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl, android.support.p009v4.widget.TextViewCompat.TextViewCompatApi17Impl
        public void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl, android.support.p009v4.widget.TextViewCompat.TextViewCompatApi17Impl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl, android.support.p009v4.widget.TextViewCompat.TextViewCompatApi17Impl
        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$TextViewCompatApi23Impl */
    static class TextViewCompatApi23Impl extends TextViewCompatApi18Impl {
        TextViewCompatApi23Impl() {
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setTextAppearance(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$TextViewCompatApi26Impl */
    static class TextViewCompatApi26Impl extends TextViewCompatApi23Impl {
        TextViewCompatApi26Impl() {
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeMaxTextSize(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeMinTextSize(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int[] getAutoSizeTextAvailableSizes(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public int getAutoSizeTextType(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // android.support.p009v4.widget.TextViewCompat.TextViewCompatBaseImpl
        public void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: android.support.v4.widget.TextViewCompat$TextViewCompatBaseImpl */
    static class TextViewCompatBaseImpl {
        private static final int LINES = 1;
        private static final String LOG_TAG = "TextViewCompatBase";
        private static Field sMaxModeField;
        private static boolean sMaxModeFieldFetched;
        private static Field sMaximumField;
        private static boolean sMaximumFieldFetched;
        private static Field sMinModeField;
        private static boolean sMinModeFieldFetched;
        private static Field sMinimumField;
        private static boolean sMinimumFieldFetched;

        TextViewCompatBaseImpl() {
        }

        private static Field retrieveField(String str) {
            Field field = null;
            try {
                field = TextView.class.getDeclaredField(str);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException unused) {
                Log.e(LOG_TAG, "Could not retrieve " + str + " field.");
                return field;
            }
        }

        private static int retrieveIntFromField(Field field, TextView textView) {
            try {
                return field.getInt(textView);
            } catch (IllegalAccessException unused) {
                Log.d(LOG_TAG, "Could not retrieve value of " + field.getName() + " field.");
                return -1;
            }
        }

        public int getAutoSizeMaxTextSize(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeMaxTextSize();
            }
            return -1;
        }

        public int getAutoSizeMinTextSize(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeMinTextSize();
            }
            return -1;
        }

        public int getAutoSizeStepGranularity(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeStepGranularity();
            }
            return -1;
        }

        public int[] getAutoSizeTextAvailableSizes(TextView textView) {
            return textView instanceof AutoSizeableTextView ? ((AutoSizeableTextView) textView).getAutoSizeTextAvailableSizes() : new int[0];
        }

        public int getAutoSizeTextType(TextView textView) {
            if (textView instanceof AutoSizeableTextView) {
                return ((AutoSizeableTextView) textView).getAutoSizeTextType();
            }
            return 0;
        }

        public Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawables();
        }

        public int getMaxLines(TextView textView) {
            if (!sMaxModeFieldFetched) {
                sMaxModeField = retrieveField("mMaxMode");
                sMaxModeFieldFetched = true;
            }
            Field field = sMaxModeField;
            if (field == null || retrieveIntFromField(field, textView) != 1) {
                return -1;
            }
            if (!sMaximumFieldFetched) {
                sMaximumField = retrieveField("mMaximum");
                sMaximumFieldFetched = true;
            }
            Field field2 = sMaximumField;
            if (field2 != null) {
                return retrieveIntFromField(field2, textView);
            }
            return -1;
        }

        public int getMinLines(TextView textView) {
            if (!sMinModeFieldFetched) {
                sMinModeField = retrieveField("mMinMode");
                sMinModeFieldFetched = true;
            }
            Field field = sMinModeField;
            if (field == null || retrieveIntFromField(field, textView) != 1) {
                return -1;
            }
            if (!sMinimumFieldFetched) {
                sMinimumField = retrieveField("mMinimum");
                sMinimumFieldFetched = true;
            }
            Field field2 = sMinimumField;
            if (field2 != null) {
                return retrieveIntFromField(field2, textView);
            }
            return -1;
        }

        public void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            if (textView instanceof AutoSizeableTextView) {
                ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            }
        }

        public void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            if (textView instanceof AutoSizeableTextView) {
                ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            }
        }

        public void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
            if (textView instanceof AutoSizeableTextView) {
                ((AutoSizeableTextView) textView).setAutoSizeTextTypeWithDefaults(i);
            }
        }

        public void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }

        public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public void setTextAppearance(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 26 ? new TextViewCompatApi26Impl() : i >= 23 ? new TextViewCompatApi23Impl() : i >= 18 ? new TextViewCompatApi18Impl() : i >= 17 ? new TextViewCompatApi17Impl() : i >= 16 ? new TextViewCompatApi16Impl() : new TextViewCompatBaseImpl();
    }

    private TextViewCompat() {
    }

    public static int getAutoSizeMaxTextSize(TextView textView) {
        return IMPL.getAutoSizeMaxTextSize(textView);
    }

    public static int getAutoSizeMinTextSize(TextView textView) {
        return IMPL.getAutoSizeMinTextSize(textView);
    }

    public static int getAutoSizeStepGranularity(TextView textView) {
        return IMPL.getAutoSizeStepGranularity(textView);
    }

    public static int[] getAutoSizeTextAvailableSizes(TextView textView) {
        return IMPL.getAutoSizeTextAvailableSizes(textView);
    }

    public static int getAutoSizeTextType(TextView textView) {
        return IMPL.getAutoSizeTextType(textView);
    }

    public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
        return IMPL.getCompoundDrawablesRelative(textView);
    }

    public static int getMaxLines(TextView textView) {
        return IMPL.getMaxLines(textView);
    }

    public static int getMinLines(TextView textView) {
        return IMPL.getMinLines(textView);
    }

    public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
        IMPL.setAutoSizeTextTypeUniformWithConfiguration(textView, i, i2, i3, i4);
    }

    public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
        IMPL.setAutoSizeTextTypeUniformWithPresetSizes(textView, iArr, i);
    }

    public static void setAutoSizeTextTypeWithDefaults(TextView textView, int i) {
        IMPL.setAutoSizeTextTypeWithDefaults(textView, i);
    }

    public static void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IMPL.setCompoundDrawablesRelative(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
        IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, i, i2, i3, i4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        IMPL.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void setTextAppearance(TextView textView, int i) {
        IMPL.setTextAppearance(textView, i);
    }
}
