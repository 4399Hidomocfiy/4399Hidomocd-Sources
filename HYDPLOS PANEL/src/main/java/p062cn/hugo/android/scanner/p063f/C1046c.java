package p062cn.hugo.android.scanner.p063f;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import p013b.p014a.p015a.C0713m;

/* renamed from: cn.hugo.android.scanner.f.c */
public final class C1046c {

    /* renamed from: l */
    private static final String f2293l = "c";

    /* renamed from: a */
    private final Context f2294a;

    /* renamed from: b */
    private final C1044b f2295b;

    /* renamed from: c */
    private Camera f2296c;

    /* renamed from: d */
    private C1041a f2297d;

    /* renamed from: e */
    private Rect f2298e;

    /* renamed from: f */
    private Rect f2299f;

    /* renamed from: g */
    private boolean f2300g;

    /* renamed from: h */
    private boolean f2301h;

    /* renamed from: i */
    private int f2302i;

    /* renamed from: j */
    private int f2303j;

    /* renamed from: k */
    private final C1049f f2304k;

    public C1046c(Context context) {
        this.f2294a = context;
        C1044b bVar = new C1044b(context);
        this.f2295b = bVar;
        this.f2304k = new C1049f(bVar);
    }

    /* renamed from: c */
    private static int m2937c(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    /* renamed from: a */
    public C0713m mo10087a(byte[] bArr, int i, int i2) {
        Rect e = mo10090e();
        if (e == null) {
            return null;
        }
        return new C0713m(bArr, i, i2, e.left, e.top, e.width(), e.height(), false);
    }

    /* renamed from: b */
    public synchronized void mo10088b() {
        Camera camera = this.f2296c;
        if (camera != null) {
            camera.release();
            this.f2296c = null;
            this.f2298e = null;
            this.f2299f = null;
        }
    }

    /* renamed from: d */
    public synchronized Rect mo10089d() {
        if (this.f2298e == null) {
            if (this.f2296c == null) {
                return null;
            }
            Point f = this.f2295b.mo10080f();
            if (f == null) {
                return null;
            }
            int c = m2937c(f.x, 240, 1200);
            int i = (f.x - c) / 2;
            int i2 = (f.y - c) / 2;
            this.f2298e = new Rect(i, i2, i + c, c + i2);
            String str = f2293l;
            Log.d(str, "Calculated framing rect: " + this.f2298e);
        }
        return this.f2298e;
    }

    /* renamed from: e */
    public synchronized Rect mo10090e() {
        if (this.f2299f == null) {
            Rect d = mo10089d();
            if (d == null) {
                return null;
            }
            Rect rect = new Rect(d);
            Point d2 = this.f2295b.mo10079d();
            Point f = this.f2295b.mo10080f();
            if (d2 == null || f == null) {
                return null;
            }
            int i = rect.left;
            int i2 = d2.y;
            int i3 = f.x;
            rect.left = (i * i2) / i3;
            rect.right = (rect.right * i2) / i3;
            int i4 = rect.top;
            int i5 = d2.x;
            int i6 = f.y;
            rect.top = (i4 * i5) / i6;
            rect.bottom = (rect.bottom * i5) / i6;
            this.f2299f = rect;
            String str = f2293l;
            Log.d(str, "Calculated framingRectInPreview rect: " + this.f2299f);
            Log.d(str, "cameraResolution: " + d2);
            Log.d(str, "screenResolution: " + f);
        }
        return this.f2299f;
    }

    /* renamed from: f */
    public synchronized boolean mo10091f() {
        return this.f2296c != null;
    }

    /* renamed from: g */
    public synchronized void mo10092g(SurfaceHolder surfaceHolder) {
        int i;
        Camera camera = this.f2296c;
        if (camera == null) {
            camera = C1048e.m2953a();
            if (camera != null) {
                this.f2296c = camera;
            } else {
                throw new IOException();
            }
        }
        camera.setPreviewDisplay(surfaceHolder);
        if (!this.f2300g) {
            this.f2300g = true;
            this.f2295b.mo10082h(camera);
            int i2 = this.f2302i;
            if (i2 > 0 && (i = this.f2303j) > 0) {
                mo10094i(i2, i);
                this.f2302i = 0;
                this.f2303j = 0;
            }
        }
        Camera.Parameters parameters = camera.getParameters();
        String flatten = parameters == null ? null : parameters.flatten();
        try {
            this.f2295b.mo10083j(camera, false);
        } catch (RuntimeException unused) {
            String str = f2293l;
            Log.w(str, "Camera rejected parameters. Setting only minimal safe-mode parameters");
            Log.i(str, "Resetting to saved camera params: " + flatten);
            if (flatten != null) {
                Camera.Parameters parameters2 = camera.getParameters();
                parameters2.unflatten(flatten);
                try {
                    camera.setParameters(parameters2);
                    this.f2295b.mo10083j(camera, true);
                } catch (RuntimeException unused2) {
                    Log.w(f2293l, "Camera rejected even safe-mode parameters! No configuration");
                }
            }
        }
    }

    /* renamed from: h */
    public synchronized void mo10093h(Handler handler, int i) {
        Camera camera = this.f2296c;
        if (camera != null && this.f2301h) {
            this.f2304k.mo10100a(handler, i);
            camera.setOneShotPreviewCallback(this.f2304k);
        }
    }

    /* renamed from: i */
    public synchronized void mo10094i(int i, int i2) {
        if (this.f2300g) {
            Point f = this.f2295b.mo10080f();
            int i3 = f.x;
            if (i > i3) {
                i = i3;
            }
            int i4 = f.y;
            if (i2 > i4) {
                i2 = i4;
            }
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            this.f2298e = new Rect(i5, i6, i + i5, i2 + i6);
            String str = f2293l;
            Log.d(str, "Calculated manual framing rect: " + this.f2298e);
            this.f2299f = null;
        } else {
            this.f2302i = i;
            this.f2303j = i2;
        }
    }

    /* renamed from: j */
    public synchronized void mo10095j(boolean z) {
        if (!(z == this.f2295b.mo10081g(this.f2296c) || this.f2296c == null)) {
            C1041a aVar = this.f2297d;
            if (aVar != null) {
                aVar.mo10076c();
            }
            this.f2295b.mo10084k(this.f2296c, z);
            C1041a aVar2 = this.f2297d;
            if (aVar2 != null) {
                aVar2.mo10075b();
            }
        }
    }

    /* renamed from: k */
    public synchronized void mo10096k() {
        Camera camera = this.f2296c;
        if (camera != null && !this.f2301h) {
            camera.startPreview();
            this.f2301h = true;
            this.f2297d = new C1041a(this.f2294a, this.f2296c);
        }
    }

    /* renamed from: l */
    public synchronized void mo10097l() {
        C1041a aVar = this.f2297d;
        if (aVar != null) {
            aVar.mo10076c();
            this.f2297d = null;
        }
        Camera camera = this.f2296c;
        if (camera != null && this.f2301h) {
            camera.stopPreview();
            this.f2304k.mo10100a(null, 0);
            this.f2301h = false;
        }
    }

    /* renamed from: m */
    public void mo10098m() {
        Camera camera = this.f2296c;
        if (camera != null && camera.getParameters().isZoomSupported()) {
            Camera.Parameters parameters = this.f2296c.getParameters();
            if (parameters.getZoom() < parameters.getMaxZoom()) {
                parameters.setZoom(parameters.getZoom() + 1);
                this.f2296c.setParameters(parameters);
            }
        }
    }

    /* renamed from: n */
    public void mo10099n() {
        Camera camera = this.f2296c;
        if (camera != null && camera.getParameters().isZoomSupported()) {
            Camera.Parameters parameters = this.f2296c.getParameters();
            if (parameters.getZoom() > 0) {
                parameters.setZoom(parameters.getZoom() - 1);
                this.f2296c.setParameters(parameters);
            }
        }
    }
}
