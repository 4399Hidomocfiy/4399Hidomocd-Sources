package android.support.p009v4.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import android.support.p009v4.content.res.FontResourcesParserCompat;
import android.support.p009v4.graphics.TypefaceCompat;
import android.support.p009v4.graphics.TypefaceCompatUtil;
import android.support.p009v4.provider.SelfDestructiveThread;
import android.support.p009v4.util.LruCache;
import android.support.p009v4.util.Preconditions;
import android.support.p009v4.util.SimpleArrayMap;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.provider.FontsContractCompat */
public class FontsContractCompat {
    private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
    public static final String PARCEL_FONT_RESULTS = "font_results";
    public static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
    public static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
    private static final String TAG = "FontsContractCompat";
    private static final SelfDestructiveThread sBackgroundThread = new SelfDestructiveThread("fonts", 10, BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS);
    private static final Comparator<byte[]> sByteArrayComparator = new Comparator<byte[]>() {
        /* class android.support.p009v4.provider.FontsContractCompat.C03885 */

        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    };
    private static final Object sLock = new Object();
    private static final SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<Typeface>>> sPendingReplies = new SimpleArrayMap<>();
    private static final LruCache<String, Typeface> sTypefaceCache = new LruCache<>(16);

    /* renamed from: android.support.v4.provider.FontsContractCompat$Columns */
    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    /* renamed from: android.support.v4.provider.FontsContractCompat$FontFamilyResult */
    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final FontInfo[] mFonts;
        private final int mStatusCode;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.provider.FontsContractCompat$FontFamilyResult$FontResultStatus */
        @interface FontResultStatus {
        }

        public FontFamilyResult(int i, FontInfo[] fontInfoArr) {
            this.mStatusCode = i;
            this.mFonts = fontInfoArr;
        }

        public FontInfo[] getFonts() {
            return this.mFonts;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }
    }

    /* renamed from: android.support.v4.provider.FontsContractCompat$FontInfo */
    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        public FontInfo(Uri uri, int i, int i2, boolean z, int i3) {
            this.mUri = (Uri) Preconditions.checkNotNull(uri);
            this.mTtcIndex = i;
            this.mWeight = i2;
            this.mItalic = z;
            this.mResultCode = i3;
        }

        public int getResultCode() {
            return this.mResultCode;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public Uri getUri() {
            return this.mUri;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }
    }

    /* renamed from: android.support.v4.provider.FontsContractCompat$FontRequestCallback */
    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.provider.FontsContractCompat$FontRequestCallback$FontRequestFailReason */
        @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    private FontsContractCompat() {
    }

    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static FontFamilyResult fetchFonts(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) {
        ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        return provider == null ? new FontFamilyResult(1, null) : new FontFamilyResult(0, getFontFromProvider(context, fontRequest, provider.authority, cancellationSignal));
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
        return fontRequest.getCertificates() != null ? fontRequest.getCertificates() : FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.support.p009v4.provider.FontsContractCompat.FontInfo[] getFontFromProvider(android.content.Context r23, android.support.p009v4.provider.FontRequest r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.provider.FontsContractCompat.getFontFromProvider(android.content.Context, android.support.v4.provider.FontRequest, java.lang.String, android.os.CancellationSignal):android.support.v4.provider.FontsContractCompat$FontInfo[]");
    }

    /* access modifiers changed from: private */
    public static Typeface getFontInternal(Context context, FontRequest fontRequest, int i) {
        try {
            FontFamilyResult fetchFonts = fetchFonts(context, null, fontRequest);
            if (fetchFonts.getStatusCode() == 0) {
                return TypefaceCompat.createFromFontInfo(context, null, fetchFonts.getFonts(), i);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static Typeface getFontSync(final Context context, final FontRequest fontRequest, final TextView textView, int i, int i2, final int i3) {
        final String str = fontRequest.getIdentifier() + "-" + i3;
        Typeface typeface = sTypefaceCache.get(str);
        if (typeface != null) {
            return typeface;
        }
        boolean z = i == 0;
        if (z && i2 == -1) {
            return getFontInternal(context, fontRequest, i3);
        }
        CallableC03751 r1 = new Callable<Typeface>() {
            /* class android.support.p009v4.provider.FontsContractCompat.CallableC03751 */

            @Override // java.util.concurrent.Callable
            public Typeface call() {
                Typeface fontInternal = FontsContractCompat.getFontInternal(context, fontRequest, i3);
                if (fontInternal != null) {
                    FontsContractCompat.sTypefaceCache.put(str, fontInternal);
                }
                return fontInternal;
            }
        };
        if (z) {
            try {
                return (Typeface) sBackgroundThread.postAndWait(r1, i2);
            } catch (InterruptedException unused) {
                return null;
            }
        } else {
            final WeakReference weakReference = new WeakReference(textView);
            C03762 r5 = new SelfDestructiveThread.ReplyCallback<Typeface>() {
                /* class android.support.p009v4.provider.FontsContractCompat.C03762 */

                public void onReply(Typeface typeface) {
                    if (((TextView) weakReference.get()) != null) {
                        textView.setTypeface(typeface, i3);
                    }
                }
            };
            synchronized (sLock) {
                SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<Typeface>>> simpleArrayMap = sPendingReplies;
                if (simpleArrayMap.containsKey(str)) {
                    simpleArrayMap.get(str).add(r5);
                    return null;
                }
                ArrayList<SelfDestructiveThread.ReplyCallback<Typeface>> arrayList = new ArrayList<>();
                arrayList.add(r5);
                simpleArrayMap.put(str, arrayList);
                sBackgroundThread.postAndReply(r1, new SelfDestructiveThread.ReplyCallback<Typeface>() {
                    /* class android.support.p009v4.provider.FontsContractCompat.C03773 */

                    public void onReply(Typeface typeface) {
                        ArrayList arrayList;
                        synchronized (FontsContractCompat.sLock) {
                            arrayList = (ArrayList) FontsContractCompat.sPendingReplies.get(str);
                            FontsContractCompat.sPendingReplies.remove(str);
                        }
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((SelfDestructiveThread.ReplyCallback) arrayList.get(i)).onReply(typeface);
                        }
                    }
                });
                return null;
            }
        }
    }

    public static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            List<byte[]> convertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(convertToByteArrayList, sByteArrayComparator);
            List<List<byte[]>> certificates = getCertificates(fontRequest, resources);
            for (int i = 0; i < certificates.size(); i++) {
                ArrayList arrayList = new ArrayList(certificates.get(i));
                Collections.sort(arrayList, sByteArrayComparator);
                if (equalsByteArrayList(convertToByteArrayList, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
    }

    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (FontInfo fontInfo : fontInfoArr) {
            if (fontInfo.getResultCode() == 0) {
                Uri uri = fontInfo.getUri();
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, TypefaceCompatUtil.mmap(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static void requestFont(final Context context, final FontRequest fontRequest, final FontRequestCallback fontRequestCallback, Handler handler) {
        final Handler handler2 = new Handler();
        handler.post(new Runnable() {
            /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784 */

            public void run() {
                try {
                    FontFamilyResult fetchFonts = FontsContractCompat.fetchFonts(context, null, fontRequest);
                    if (fetchFonts.getStatusCode() != 0) {
                        int statusCode = fetchFonts.getStatusCode();
                        if (statusCode == 1) {
                            handler2.post(new Runnable() {
                                /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03802 */

                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-2);
                                }
                            });
                        } else if (statusCode != 2) {
                            handler2.post(new Runnable() {
                                /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03824 */

                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                        } else {
                            handler2.post(new Runnable() {
                                /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03813 */

                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                        }
                    } else {
                        FontInfo[] fonts = fetchFonts.getFonts();
                        if (fonts == null || fonts.length == 0) {
                            handler2.post(new Runnable() {
                                /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03835 */

                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(1);
                                }
                            });
                            return;
                        }
                        for (FontInfo fontInfo : fonts) {
                            if (fontInfo.getResultCode() != 0) {
                                final int resultCode = fontInfo.getResultCode();
                                if (resultCode < 0) {
                                    handler2.post(new Runnable() {
                                        /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03846 */

                                        public void run() {
                                            fontRequestCallback.onTypefaceRequestFailed(-3);
                                        }
                                    });
                                    return;
                                } else {
                                    handler2.post(new Runnable() {
                                        /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03857 */

                                        public void run() {
                                            fontRequestCallback.onTypefaceRequestFailed(resultCode);
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                        final Typeface buildTypeface = FontsContractCompat.buildTypeface(context, null, fonts);
                        if (buildTypeface == null) {
                            handler2.post(new Runnable() {
                                /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03868 */

                                public void run() {
                                    fontRequestCallback.onTypefaceRequestFailed(-3);
                                }
                            });
                        } else {
                            handler2.post(new Runnable() {
                                /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03879 */

                                public void run() {
                                    fontRequestCallback.onTypefaceRetrieved(buildTypeface);
                                }
                            });
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    handler2.post(new Runnable() {
                        /* class android.support.p009v4.provider.FontsContractCompat.RunnableC03784.RunnableC03791 */

                        public void run() {
                            fontRequestCallback.onTypefaceRequestFailed(-1);
                        }
                    });
                }
            }
        });
    }
}
