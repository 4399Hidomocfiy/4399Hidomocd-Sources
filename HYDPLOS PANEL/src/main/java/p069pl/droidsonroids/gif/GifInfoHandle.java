package p069pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.Os;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.GifInfoHandle */
public final class GifInfoHandle {

    /* renamed from: a */
    private volatile long f3614a;

    static {
        C1503i.m4194b();
    }

    GifInfoHandle() {
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f3614a = m4116o(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset());
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    GifInfoHandle(String str) {
        this.f3614a = openFile(str);
    }

    private static native void bindSurface(long j, Surface surface, long[] jArr);

    static native int createTempNativeFileDescriptor();

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor);

    private static native void free(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native int getWidth(long j);

    /* renamed from: i */
    private static int m4115i(FileDescriptor fileDescriptor) {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            Os.close(fileDescriptor);
        }
    }

    private static native boolean isOpaque(long j);

    /* renamed from: o */
    private static long m4116o(FileDescriptor fileDescriptor, long j) {
        int i;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                i = m4115i(fileDescriptor);
            } catch (Exception e) {
                throw new GifIOException(EnumC1491d.OPEN_FAILED.f3678b, e.getMessage());
            }
        } else {
            i = extractNativeFileDescriptor(fileDescriptor);
        }
        return openNativeFileDescriptor(i, j);
    }

    static native long openFile(String str);

    static native long openNativeFileDescriptor(int i, long j);

    /* renamed from: p */
    static GifInfoHandle m4117p(ContentResolver contentResolver, Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    private static native void postUnbindSurface(long j);

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    private static native void setOptions(long j, char c, boolean z);

    private static native void setSpeedFactor(long j, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo12507A(float f) {
        if (f <= 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f < 4.656613E-10f) {
            f = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f3614a, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12508a(Surface surface, long[] jArr) {
        bindSurface(this.f3614a, surface, jArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized int mo12509b() {
        return getCurrentFrameIndex(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized int mo12510c() {
        return getCurrentLoop(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int mo12511d() {
        return getCurrentPosition(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized int mo12512e() {
        return getDuration(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized int mo12513f() {
        return getHeight(this.f3614a);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            mo12523r();
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized int mo12515g() {
        return getLoopCount(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized int mo12516h() {
        return getNativeErrorCode(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized int mo12517j() {
        return getNumberOfFrames(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized long[] mo12518k() {
        return getSavedState(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized int mo12519l() {
        return getWidth(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized boolean mo12520m() {
        return isOpaque(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public synchronized boolean mo12521n() {
        return this.f3614a == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized void mo12522q() {
        postUnbindSurface(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void mo12523r() {
        free(this.f3614a);
        this.f3614a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized long mo12524s(Bitmap bitmap) {
        return renderFrame(this.f3614a, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized boolean mo12525t() {
        return reset(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public synchronized long mo12526u() {
        return restoreRemainder(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public synchronized int mo12527v(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f3614a, jArr, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public synchronized void mo12528w() {
        saveRemainder(this.f3614a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public synchronized void mo12529x(int i, Bitmap bitmap) {
        seekToTime(this.f3614a, i, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo12530y(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f3614a, (char) i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo12531z(char c, boolean z) {
        setOptions(this.f3614a, c, z);
    }
}
