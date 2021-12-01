package android.support.p009v4.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p009v4.content.res.FontResourcesParserCompat;
import android.support.p009v4.graphics.TypefaceCompat;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.res.ResourcesCompat */
public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    private ResourcesCompat() {
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColorStateList(i, theme) : resources.getColorStateList(i);
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 21 ? resources.getDrawableForDensity(i, i2, theme) : i3 >= 15 ? resources.getDrawableForDensity(i, i2) : resources.getDrawable(i);
    }

    public static Typeface getFont(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null);
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, TextView textView) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, textView);
    }

    private static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, TextView textView) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, textView);
        if (loadFont != null) {
            return loadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i));
    }

    private static Typeface loadFont(Context context, Resources resources, TypedValue typedValue, int i, int i2, TextView textView) {
        String str;
        StringBuilder sb;
        Throwable e;
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                return null;
            }
            Typeface findFromCache = TypefaceCompat.findFromCache(resources, i, i2);
            if (findFromCache != null) {
                return findFromCache;
            }
            try {
                if (!charSequence2.toLowerCase().endsWith(".xml")) {
                    return TypefaceCompat.createFromResourcesFontFile(context, resources, i, charSequence2, i2);
                }
                FontResourcesParserCompat.FamilyResourceEntry parse = FontResourcesParserCompat.parse(resources.getXml(i), resources);
                if (parse != null) {
                    return TypefaceCompat.createFromResourcesFamilyXml(context, parse, resources, i, i2, textView);
                }
                Log.e(TAG, "Failed to find font-family tag");
                return null;
            } catch (XmlPullParserException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Failed to parse xml resource ";
                sb.append(str);
                sb.append(charSequence2);
                Log.e(TAG, sb.toString(), e);
                return null;
            } catch (IOException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Failed to read xml resource ";
                sb.append(str);
                sb.append(charSequence2);
                Log.e(TAG, sb.toString(), e);
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
    }
}
