package p062cn.hugo.android.scanner.p063f;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.f.f */
public final class C1049f implements Camera.PreviewCallback {

    /* renamed from: d */
    private static final String f2310d = C1049f.class.getSimpleName();

    /* renamed from: a */
    private final C1044b f2311a;

    /* renamed from: b */
    private Handler f2312b;

    /* renamed from: c */
    private int f2313c;

    C1049f(C1044b bVar) {
        this.f2311a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10100a(Handler handler, int i) {
        this.f2312b = handler;
        this.f2313c = i;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point d = this.f2311a.mo10079d();
        Handler handler = this.f2312b;
        if (d == null || handler == null) {
            Log.d(f2310d, "Got preview callback, but no handler or resolution available");
            return;
        }
        handler.obtainMessage(this.f2313c, d.x, d.y, bArr).sendToTarget();
        this.f2312b = null;
    }
}
