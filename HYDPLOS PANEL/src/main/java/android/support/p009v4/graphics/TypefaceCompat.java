package android.support.p009v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.support.p009v4.content.res.FontResourcesParserCompat;
import android.support.p009v4.provider.FontsContractCompat;
import android.support.p009v4.util.LruCache;
import android.widget.TextView;

/* renamed from: android.support.v4.graphics.TypefaceCompat */
public class TypefaceCompat {
    private static final String TAG = "TypefaceCompat";
    private static final LruCache<String, Typeface> sTypefaceCache = new LruCache<>(16);
    private static final TypefaceCompatImpl sTypefaceCompatImpl;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.graphics.TypefaceCompat$TypefaceCompatImpl */
    public interface TypefaceCompatImpl {
        Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i);

        Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i);

        Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        sTypefaceCompatImpl = i >= 26 ? new TypefaceCompatApi26Impl() : (i < 24 || !TypefaceCompatApi24Impl.isUsable()) ? i >= 21 ? new TypefaceCompatApi21Impl() : new TypefaceCompatBaseImpl() : new TypefaceCompatApi24Impl();
    }

    private TypefaceCompat() {
    }

    public static Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fontInfoArr, i);
    }

    public static Typeface createFromResourcesFamilyXml(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i, int i2, TextView textView) {
        Typeface typeface;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            typeface = FontsContractCompat.getFontSync(context, providerResourceEntry.getRequest(), textView, providerResourceEntry.getFetchStrategy(), providerResourceEntry.getTimeout(), i2);
        } else {
            typeface = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i2);
        }
        if (typeface != null) {
            sTypefaceCache.put(createResourceUid(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        Typeface createFromResourcesFontFile = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, i, str, i2);
        if (createFromResourcesFontFile != null) {
            sTypefaceCache.put(createResourceUid(resources, i, i2), createFromResourcesFontFile);
        }
        return createFromResourcesFontFile;
    }

    private static String createResourceUid(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface findFromCache(Resources resources, int i, int i2) {
        return sTypefaceCache.get(createResourceUid(resources, i, i2));
    }
}
