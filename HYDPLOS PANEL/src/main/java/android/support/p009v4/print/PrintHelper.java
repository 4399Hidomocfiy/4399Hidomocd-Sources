package android.support.p009v4.print;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.print.PrintHelper */
public final class PrintHelper {
    public static final int COLOR_MODE_COLOR = 2;
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    private final PrintHelperVersionImpl mImpl;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.print.PrintHelper$ColorMode */
    private @interface ColorMode {
    }

    /* renamed from: android.support.v4.print.PrintHelper$OnPrintFinishCallback */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.print.PrintHelper$Orientation */
    private @interface Orientation {
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperApi19 */
    public static class PrintHelperApi19 implements PrintHelperVersionImpl {
        private static final String LOG_TAG = "PrintHelperApi19";
        private static final int MAX_PRINT_SIZE = 3500;
        int mColorMode = 2;
        final Context mContext;
        BitmapFactory.Options mDecodeOptions = null;
        protected boolean mIsMinMarginsHandlingCorrect = true;
        private final Object mLock = new Object();
        int mOrientation;
        protected boolean mPrintActivityRespectsOrientation = true;
        int mScaleMode = 2;

        PrintHelperApi19(Context context) {
            this.mContext = context;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private Bitmap convertBitmapForColorMode(Bitmap bitmap, int i) {
            if (i != 1) {
                return bitmap;
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            canvas.setBitmap(null);
            return createBitmap;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private Matrix getMatrix(int i, int i2, RectF rectF, int i3) {
            Matrix matrix = new Matrix();
            float f = (float) i;
            float width = rectF.width() / f;
            float max = i3 == 2 ? Math.max(width, rectF.height() / ((float) i2)) : Math.min(width, rectF.height() / ((float) i2));
            matrix.postScale(max, max);
            matrix.postTranslate((rectF.width() - (f * max)) / 2.0f, (rectF.height() - (((float) i2) * max)) / 2.0f);
            return matrix;
        }

        /* access modifiers changed from: private */
        public static boolean isPortrait(Bitmap bitmap) {
            return bitmap.getWidth() <= bitmap.getHeight();
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Bitmap loadBitmap(android.net.Uri r5, android.graphics.BitmapFactory.Options r6) {
            /*
                r4 = this;
                java.lang.String r0 = "close fail "
                java.lang.String r1 = "PrintHelperApi19"
                if (r5 == 0) goto L_0x0031
                android.content.Context r2 = r4.mContext
                if (r2 == 0) goto L_0x0031
                r3 = 0
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0025 }
                java.io.InputStream r5 = r2.openInputStream(r5)     // Catch:{ all -> 0x0025 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6)     // Catch:{ all -> 0x0022 }
                if (r5 == 0) goto L_0x0021
                r5.close()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                r5 = move-exception
                android.util.Log.w(r1, r0, r5)
            L_0x0021:
                return r6
            L_0x0022:
                r6 = move-exception
                r3 = r5
                goto L_0x0026
            L_0x0025:
                r6 = move-exception
            L_0x0026:
                if (r3 == 0) goto L_0x0030
                r3.close()     // Catch:{ IOException -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r5 = move-exception
                android.util.Log.w(r1, r0, r5)
            L_0x0030:
                throw r6
            L_0x0031:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "bad argument to loadBitmap"
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.print.PrintHelper.PrintHelperApi19.loadBitmap(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private Bitmap loadConstrainedBitmap(Uri uri) {
            BitmapFactory.Options options;
            if (uri == null || this.mContext == null) {
                throw new IllegalArgumentException("bad argument to getScaledBitmap");
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            loadBitmap(uri, options2);
            int i = options2.outWidth;
            int i2 = options2.outHeight;
            if (i > 0 && i2 > 0) {
                int max = Math.max(i, i2);
                int i3 = 1;
                while (max > MAX_PRINT_SIZE) {
                    max >>>= 1;
                    i3 <<= 1;
                }
                if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                    synchronized (this.mLock) {
                        options = new BitmapFactory.Options();
                        this.mDecodeOptions = options;
                        options.inMutable = true;
                        options.inSampleSize = i3;
                    }
                    try {
                        Bitmap loadBitmap = loadBitmap(uri, options);
                        synchronized (this.mLock) {
                            this.mDecodeOptions = null;
                        }
                        return loadBitmap;
                    } catch (Throwable th) {
                        synchronized (this.mLock) {
                            this.mDecodeOptions = null;
                            throw th;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void writeBitmap(final PrintAttributes printAttributes, final int i, final Bitmap bitmap, final ParcelFileDescriptor parcelFileDescriptor, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            final PrintAttributes build = this.mIsMinMarginsHandlingCorrect ? printAttributes : copyAttributes(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
            new AsyncTask<Void, Void, Throwable>() {
                /* class android.support.p009v4.print.PrintHelper.PrintHelperApi19.AsyncTaskC03712 */

                /* access modifiers changed from: protected */
                public Throwable doInBackground(Void... voidArr) {
                    RectF rectF;
                    try {
                        if (cancellationSignal.isCanceled()) {
                            return null;
                        }
                        PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(PrintHelperApi19.this.mContext, build);
                        Bitmap convertBitmapForColorMode = PrintHelperApi19.this.convertBitmapForColorMode(bitmap, build.getColorMode());
                        if (cancellationSignal.isCanceled()) {
                            return null;
                        }
                        try {
                            PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                            if (PrintHelperApi19.this.mIsMinMarginsHandlingCorrect) {
                                rectF = new RectF(startPage.getInfo().getContentRect());
                            } else {
                                PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(PrintHelperApi19.this.mContext, printAttributes);
                                PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                                RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                                printedPdfDocument2.finishPage(startPage2);
                                printedPdfDocument2.close();
                                rectF = rectF2;
                            }
                            Matrix matrix = PrintHelperApi19.this.getMatrix(convertBitmapForColorMode.getWidth(), convertBitmapForColorMode.getHeight(), rectF, i);
                            if (!PrintHelperApi19.this.mIsMinMarginsHandlingCorrect) {
                                matrix.postTranslate(rectF.left, rectF.top);
                                startPage.getCanvas().clipRect(rectF);
                            }
                            startPage.getCanvas().drawBitmap(convertBitmapForColorMode, matrix, null);
                            printedPdfDocument.finishPage(startPage);
                            if (cancellationSignal.isCanceled()) {
                                return null;
                            }
                            printedPdfDocument.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                            printedPdfDocument.close();
                            ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptor;
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                } catch (IOException unused) {
                                }
                            }
                            if (convertBitmapForColorMode != bitmap) {
                                convertBitmapForColorMode.recycle();
                            }
                            return null;
                        } finally {
                            printedPdfDocument.close();
                            ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                            if (parcelFileDescriptor2 != null) {
                                try {
                                    parcelFileDescriptor2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (convertBitmapForColorMode != bitmap) {
                                convertBitmapForColorMode.recycle();
                            }
                        }
                    } catch (Throwable th) {
                        return th;
                    }
                }

                /* access modifiers changed from: protected */
                public void onPostExecute(Throwable th) {
                    if (cancellationSignal.isCanceled()) {
                        writeResultCallback.onWriteCancelled();
                    } else if (th == null) {
                        writeResultCallback.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                    } else {
                        Log.e(PrintHelperApi19.LOG_TAG, "Error writing printed content", th);
                        writeResultCallback.onWriteFailed(null);
                    }
                }
            }.execute(new Void[0]);
        }

        /* access modifiers changed from: protected */
        public PrintAttributes.Builder copyAttributes(PrintAttributes printAttributes) {
            PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
            if (printAttributes.getColorMode() != 0) {
                minMargins.setColorMode(printAttributes.getColorMode());
            }
            return minMargins;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public int getColorMode() {
            return this.mColorMode;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public int getOrientation() {
            int i = this.mOrientation;
            if (i == 0) {
                return 1;
            }
            return i;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public int getScaleMode() {
            return this.mScaleMode;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void printBitmap(final String str, final Bitmap bitmap, final OnPrintFinishCallback onPrintFinishCallback) {
            if (bitmap != null) {
                final int i = this.mScaleMode;
                ((PrintManager) this.mContext.getSystemService("print")).print(str, new PrintDocumentAdapter() {
                    /* class android.support.p009v4.print.PrintHelper.PrintHelperApi19.C03701 */
                    private PrintAttributes mAttributes;

                    public void onFinish() {
                        OnPrintFinishCallback onPrintFinishCallback = onPrintFinishCallback;
                        if (onPrintFinishCallback != null) {
                            onPrintFinishCallback.onFinish();
                        }
                    }

                    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                        this.mAttributes = printAttributes2;
                        layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(str).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
                    }

                    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
                        PrintHelperApi19.this.writeBitmap(this.mAttributes, i, bitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
                    }
                }, new PrintAttributes.Builder().setMediaSize(isPortrait(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.mColorMode).build());
            }
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void printBitmap(final String str, final Uri uri, final OnPrintFinishCallback onPrintFinishCallback) {
            PrintAttributes.MediaSize mediaSize;
            final int i = this.mScaleMode;
            C03723 r6 = new PrintDocumentAdapter() {
                /* class android.support.p009v4.print.PrintHelper.PrintHelperApi19.C03723 */
                private PrintAttributes mAttributes;
                Bitmap mBitmap = null;
                AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                private void cancelLoad() {
                    synchronized (PrintHelperApi19.this.mLock) {
                        BitmapFactory.Options options = PrintHelperApi19.this.mDecodeOptions;
                        if (options != null) {
                            options.requestCancelDecode();
                            PrintHelperApi19.this.mDecodeOptions = null;
                        }
                    }
                }

                public void onFinish() {
                    super.onFinish();
                    cancelLoad();
                    AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.mLoadBitmap;
                    if (asyncTask != null) {
                        asyncTask.cancel(true);
                    }
                    OnPrintFinishCallback onPrintFinishCallback = onPrintFinishCallback;
                    if (onPrintFinishCallback != null) {
                        onPrintFinishCallback.onFinish();
                    }
                    Bitmap bitmap = this.mBitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                        this.mBitmap = null;
                    }
                }

                public void onLayout(final PrintAttributes printAttributes, final PrintAttributes printAttributes2, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                    synchronized (this) {
                        this.mAttributes = printAttributes2;
                    }
                    if (cancellationSignal.isCanceled()) {
                        layoutResultCallback.onLayoutCancelled();
                    } else if (this.mBitmap != null) {
                        layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(str).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
                    } else {
                        this.mLoadBitmap = new AsyncTask<Uri, Boolean, Bitmap>() {
                            /* class android.support.p009v4.print.PrintHelper.PrintHelperApi19.C03723.AsyncTaskC03731 */

                            /* access modifiers changed from: protected */
                            public Bitmap doInBackground(Uri... uriArr) {
                                try {
                                    C03723 r2 = C03723.this;
                                    return PrintHelperApi19.this.loadConstrainedBitmap(uri);
                                } catch (FileNotFoundException unused) {
                                    return null;
                                }
                            }

                            /* access modifiers changed from: protected */
                            public void onCancelled(Bitmap bitmap) {
                                layoutResultCallback.onLayoutCancelled();
                                C03723.this.mLoadBitmap = null;
                            }

                            /* access modifiers changed from: protected */
                            public void onPostExecute(Bitmap bitmap) {
                                PrintAttributes.MediaSize mediaSize;
                                super.onPostExecute((Object) bitmap);
                                if (bitmap != null) {
                                    PrintHelperApi19 printHelperApi19 = PrintHelperApi19.this;
                                    if (!printHelperApi19.mPrintActivityRespectsOrientation || printHelperApi19.mOrientation == 0) {
                                        synchronized (this) {
                                            mediaSize = C03723.this.mAttributes.getMediaSize();
                                        }
                                        if (!(mediaSize == null || mediaSize.isPortrait() == PrintHelperApi19.isPortrait(bitmap))) {
                                            Matrix matrix = new Matrix();
                                            matrix.postRotate(90.0f);
                                            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                        }
                                    }
                                }
                                C03723.this.mBitmap = bitmap;
                                if (bitmap != null) {
                                    layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(str).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
                                } else {
                                    layoutResultCallback.onLayoutFailed(null);
                                }
                                C03723.this.mLoadBitmap = null;
                            }

                            /* access modifiers changed from: protected */
                            public void onPreExecute() {
                                cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() {
                                    /* class android.support.p009v4.print.PrintHelper.PrintHelperApi19.C03723.AsyncTaskC03731.C03741 */

                                    public void onCancel() {
                                        C03723.this.cancelLoad();
                                        AsyncTaskC03731.this.cancel(false);
                                    }
                                });
                            }
                        }.execute(new Uri[0]);
                    }
                }

                public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
                    PrintHelperApi19.this.writeBitmap(this.mAttributes, i, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
                }
            };
            PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
            PrintAttributes.Builder builder = new PrintAttributes.Builder();
            builder.setColorMode(this.mColorMode);
            int i2 = this.mOrientation;
            if (i2 == 1 || i2 == 0) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
            } else {
                if (i2 == 2) {
                    mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
                }
                printManager.print(str, r6, builder.build());
            }
            builder.setMediaSize(mediaSize);
            printManager.print(str, r6, builder.build());
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void setColorMode(int i) {
            this.mColorMode = i;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void setOrientation(int i) {
            this.mOrientation = i;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void setScaleMode(int i) {
            this.mScaleMode = i;
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperApi20 */
    private static class PrintHelperApi20 extends PrintHelperApi19 {
        PrintHelperApi20(Context context) {
            super(context);
            this.mPrintActivityRespectsOrientation = false;
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperApi23 */
    private static class PrintHelperApi23 extends PrintHelperApi20 {
        PrintHelperApi23(Context context) {
            super(context);
            this.mIsMinMarginsHandlingCorrect = false;
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p009v4.print.PrintHelper.PrintHelperApi19
        public PrintAttributes.Builder copyAttributes(PrintAttributes printAttributes) {
            PrintAttributes.Builder copyAttributes = super.copyAttributes(printAttributes);
            if (printAttributes.getDuplexMode() != 0) {
                copyAttributes.setDuplexMode(printAttributes.getDuplexMode());
            }
            return copyAttributes;
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperApi24 */
    private static class PrintHelperApi24 extends PrintHelperApi23 {
        PrintHelperApi24(Context context) {
            super(context);
            this.mIsMinMarginsHandlingCorrect = true;
            this.mPrintActivityRespectsOrientation = true;
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperStub */
    private static final class PrintHelperStub implements PrintHelperVersionImpl {
        int mColorMode;
        int mOrientation;
        int mScaleMode;

        private PrintHelperStub() {
            this.mScaleMode = 2;
            this.mColorMode = 2;
            this.mOrientation = 1;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public int getColorMode() {
            return this.mColorMode;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public int getOrientation() {
            return this.mOrientation;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public int getScaleMode() {
            return this.mScaleMode;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void setColorMode(int i) {
            this.mColorMode = i;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void setOrientation(int i) {
            this.mOrientation = i;
        }

        @Override // android.support.p009v4.print.PrintHelper.PrintHelperVersionImpl
        public void setScaleMode(int i) {
            this.mScaleMode = i;
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintHelperVersionImpl */
    interface PrintHelperVersionImpl {
        int getColorMode();

        int getOrientation();

        int getScaleMode();

        void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback);

        void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback);

        void setColorMode(int i);

        void setOrientation(int i);

        void setScaleMode(int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.print.PrintHelper$ScaleMode */
    private @interface ScaleMode {
    }

    public PrintHelper(Context context) {
        PrintHelperVersionImpl printHelperApi19;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            printHelperApi19 = new PrintHelperApi24(context);
        } else if (i >= 23) {
            printHelperApi19 = new PrintHelperApi23(context);
        } else if (i >= 20) {
            printHelperApi19 = new PrintHelperApi20(context);
        } else if (i >= 19) {
            printHelperApi19 = new PrintHelperApi19(context);
        } else {
            this.mImpl = new PrintHelperStub();
            return;
        }
        this.mImpl = printHelperApi19;
    }

    public static boolean systemSupportsPrint() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public int getColorMode() {
        return this.mImpl.getColorMode();
    }

    public int getOrientation() {
        return this.mImpl.getOrientation();
    }

    public int getScaleMode() {
        return this.mImpl.getScaleMode();
    }

    public void printBitmap(String str, Bitmap bitmap) {
        this.mImpl.printBitmap(str, bitmap, (OnPrintFinishCallback) null);
    }

    public void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        this.mImpl.printBitmap(str, bitmap, onPrintFinishCallback);
    }

    public void printBitmap(String str, Uri uri) {
        this.mImpl.printBitmap(str, uri, (OnPrintFinishCallback) null);
    }

    public void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        this.mImpl.printBitmap(str, uri, onPrintFinishCallback);
    }

    public void setColorMode(int i) {
        this.mImpl.setColorMode(i);
    }

    public void setOrientation(int i) {
        this.mImpl.setOrientation(i);
    }

    public void setScaleMode(int i) {
        this.mImpl.setScaleMode(i);
    }
}
