package android.support.p009v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p009v4.provider.FontRequest;
import android.util.Base64;
import android.util.Xml;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p004b.p005a.C0015h;

/* renamed from: android.support.v4.content.res.FontResourcesParserCompat */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry */
    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FetchStrategy */
    public @interface FetchStrategy {
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry */
    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry */
    public static final class FontFileResourceEntry {
        private final String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mWeight;

        public FontFileResourceEntry(String str, int i, boolean z, int i2) {
            this.mFileName = str;
            this.mWeight = i;
            this.mItalic = z;
            this.mResourceId = i2;
        }

        public String getFileName() {
            return this.mFileName;
        }

        public int getResourceId() {
            return this.mResourceId;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry */
    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        private final FontRequest mRequest;
        private final int mStrategy;
        private final int mTimeoutMs;

        public ProviderResourceEntry(FontRequest fontRequest, int i, int i2) {
            this.mRequest = fontRequest;
            this.mStrategy = i;
            this.mTimeoutMs = i2;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public FontRequest getRequest() {
            return this.mRequest;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }
    }

    public static FamilyResourceEntry parse(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return readFamilies(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> readCerts(Resources resources, int i) {
        ArrayList arrayList = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(toByteArrayList(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(toByteArrayList(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    private static FamilyResourceEntry readFamilies(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    private static FamilyResourceEntry readFamily(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0015h.f50a);
        String string = obtainAttributes.getString(C0015h.f51b);
        String string2 = obtainAttributes.getString(C0015h.f55f);
        String string3 = obtainAttributes.getString(C0015h.f56g);
        int resourceId = obtainAttributes.getResourceId(C0015h.f52c, 0);
        int integer = obtainAttributes.getInteger(C0015h.f53d, 1);
        int integer2 = obtainAttributes.getInteger(C0015h.f54e, DEFAULT_TIMEOUT_MILLIS);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(readFont(xmlPullParser, resources));
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new ProviderResourceEntry(new FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2);
    }

    private static FontFileResourceEntry readFont(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0015h.f57h);
        int i = obtainAttributes.getInt(C0015h.f60k, NORMAL_WEIGHT);
        boolean z = true;
        if (1 != obtainAttributes.getInt(C0015h.f59j, 0)) {
            z = false;
        }
        int i2 = C0015h.f58i;
        int resourceId = obtainAttributes.getResourceId(i2, 0);
        String string = obtainAttributes.getString(i2);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new FontFileResourceEntry(string, i, z, resourceId);
    }

    private static void skip(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> toByteArrayList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
