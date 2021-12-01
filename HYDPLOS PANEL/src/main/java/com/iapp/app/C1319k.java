package com.iapp.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.iapp.app.run.mian;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.k */
public class C1319k {

    /* renamed from: a */
    private Activity f3088a = null;

    /* renamed from: b */
    private Context f3089b = null;

    /* renamed from: c */
    private SurfaceView f3090c;

    /* renamed from: d */
    private SurfaceHolder f3091d;

    /* renamed from: e */
    private int f3092e = -1;

    /* renamed from: f */
    private int f3093f = -1;

    /* renamed from: g */
    private Camera f3094g = null;

    /* renamed from: h */
    private boolean f3095h = false;

    /* renamed from: i */
    private boolean f3096i = false;

    /* renamed from: j */
    private boolean f3097j = false;

    /* renamed from: k */
    private int f3098k = 90;

    /* renamed from: l */
    private int f3099l = 90;

    /* renamed from: m */
    private int f3100m = 95;

    /* renamed from: n */
    private String f3101n = null;

    /* renamed from: o */
    private String f3102o;

    /* renamed from: p */
    Camera.AutoFocusCallback f3103p = new C1321b();

    /* renamed from: q */
    Camera.PictureCallback f3104q = new C1324c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.k$a */
    public class SurfaceHolder$CallbackC1320a implements SurfaceHolder.Callback {
        SurfaceHolder$CallbackC1320a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C1319k.this.m3872t();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C1319k.this.f3094g != null) {
                if (C1319k.this.f3095h) {
                    C1319k.this.f3094g.stopPreview();
                }
                C1319k.this.f3094g.release();
                C1319k.this.f3094g = null;
            }
            C1319k.this.f3095h = false;
        }
    }

    /* renamed from: com.iapp.app.k$b */
    class C1321b implements Camera.AutoFocusCallback {

        /* renamed from: com.iapp.app.k$b$a */
        class C1322a implements Camera.ShutterCallback {
            C1322a(C1321b bVar) {
            }

            public void onShutter() {
            }
        }

        /* renamed from: com.iapp.app.k$b$b */
        class C1323b implements Camera.PictureCallback {
            C1323b(C1321b bVar) {
            }

            public void onPictureTaken(byte[] bArr, Camera camera) {
            }
        }

        C1321b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            if (z) {
                camera.takePicture(new C1322a(this), new C1323b(this), C1319k.this.f3104q);
            }
        }
    }

    /* renamed from: com.iapp.app.k$c */
    class C1324c implements Camera.PictureCallback {
        C1324c() {
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            Bitmap bitmap;
            if (C1319k.this.f3099l != 0) {
                C1319k kVar = C1319k.this;
                bitmap = kVar.m3873v(kVar.f3099l, BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } else {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(C1319k.this.f3101n));
                bitmap.compress(Bitmap.CompressFormat.JPEG, C1319k.this.f3100m, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            boolean z = C1319k.this.f3096i;
            camera.stopPreview();
            if (z) {
                C1319k.this.f3095h = false;
            } else {
                camera.startPreview();
                C1319k.this.f3095h = true;
            }
            if (C1319k.this.f3101n != null && C1319k.this.f3102o != null) {
                if (mian.f3388sh) {
                    C0864v vVar = new C0864v(C1319k.this.f3089b, C1319k.this.f3088a);
                    vVar.mo8981T("st_vId", Integer.valueOf(C1319k.this.f3090c.getId()));
                    vVar.mo8981T("st_vW", C1319k.this.f3090c);
                    vVar.mo8981T("st_oS", this);
                    vVar.mo8981T("st_fN", C1319k.this.f3101n);
                    vVar.mo8985f(C1319k.this.f3102o);
                    return;
                }
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1319k.this.f3089b, C1319k.this.f3088a);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1319k.this.f3090c.getId()));
                aid_YuCodeX.dim("st_vW", C1319k.this.f3090c);
                aid_YuCodeX.dim("st_oS", this);
                aid_YuCodeX.dim("st_fN", C1319k.this.f3101n);
                aid_YuCodeX.YuGoX(C1319k.this.f3102o);
            }
        }
    }

    public C1319k(Context context, Activity activity, SurfaceView surfaceView, boolean z, int i) {
        this.f3089b = context;
        this.f3088a = activity;
        this.f3090c = surfaceView;
        this.f3097j = z;
        this.f3098k = i;
        this.f3102o = C0860r.m2044c(((Object[]) surfaceView.getTag())[2].toString(), "<eventItme type=\"onpicturecallback\">", "</eventItme>");
        m3871s();
    }

    public C1319k(Context context, Activity activity, SurfaceView surfaceView, boolean z, int i, int i2, int i3, int i4) {
        this.f3089b = context;
        this.f3088a = activity;
        this.f3090c = surfaceView;
        this.f3097j = z;
        this.f3098k = i;
        this.f3092e = i2;
        this.f3093f = i3;
        this.f3100m = i4;
        this.f3102o = C0860r.m2044c(((Object[]) surfaceView.getTag())[2].toString(), "<eventItme type=\"onpicturecallback\">", "</eventItme>");
        m3871s();
    }

    /* renamed from: A */
    private void m3853A(Camera camera) {
        Camera.Parameters parameters;
        if (camera != null && (parameters = camera.getParameters()) != null) {
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            String flashMode = parameters.getFlashMode();
            if (supportedFlashModes != null && !"off".equals(flashMode) && supportedFlashModes.contains("off")) {
                parameters.setFlashMode("off");
                camera.setParameters(parameters);
            }
        }
    }

    /* renamed from: B */
    private void m3854B(Camera camera) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        if (camera != null && (parameters = camera.getParameters()) != null && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && !"torch".equals(parameters.getFlashMode()) && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            camera.setParameters(parameters);
        }
    }

    @TargetApi(9)
    /* renamed from: a */
    private int m3855a() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                return i;
            }
        }
        return -1;
    }

    @TargetApi(9)
    /* renamed from: b */
    private int m3856b() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: s */
    private void m3871s() {
        SurfaceHolder holder = this.f3090c.getHolder();
        this.f3091d = holder;
        holder.addCallback(new SurfaceHolder$CallbackC1320a());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @TargetApi(9)
    /* renamed from: t */
    private void m3872t() {
        int i;
        int i2;
        if (!this.f3095h) {
            int b = this.f3097j ? m3856b() : m3855a();
            if (b != -1) {
                Camera open = Camera.open(b);
                this.f3094g = open;
                open.setDisplayOrientation(this.f3098k);
            } else {
                return;
            }
        }
        Camera camera = this.f3094g;
        if (camera != null && !this.f3095h) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                int i3 = this.f3092e;
                if (!(i3 == -1 || (i2 = this.f3093f) == -1)) {
                    parameters.setPreviewSize(i3, i2);
                }
                parameters.setPreviewFpsRange(4, 10);
                parameters.setPictureFormat(256);
                parameters.set("jpeg-quality", this.f3100m);
                int i4 = this.f3092e;
                if (!(i4 == -1 || (i = this.f3093f) == -1)) {
                    parameters.setPictureSize(i4, i);
                }
                this.f3094g.setPreviewDisplay(this.f3091d);
                this.f3094g.startPreview();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f3095h = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: v */
    private Bitmap m3873v(int i, Bitmap bitmap) {
        Bitmap bitmap2;
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        try {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            bitmap2 = bitmap;
        }
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    /* renamed from: q */
    public void mo11961q(String str, int i, boolean z) {
        if (this.f3094g != null) {
            C0835f.m1845b(str, false);
            this.f3101n = str;
            this.f3099l = i;
            this.f3096i = z;
            this.f3094g.autoFocus(this.f3103p);
        }
    }

    /* renamed from: r */
    public int mo11962r() {
        return this.f3098k;
    }

    /* renamed from: u */
    public void mo11963u() {
        Camera camera = this.f3094g;
        if (camera != null) {
            if (this.f3095h) {
                camera.stopPreview();
            }
            this.f3094g.release();
            this.f3094g = null;
        }
        this.f3095h = false;
    }

    /* renamed from: w */
    public void mo11964w(int i) {
        this.f3098k = i;
        this.f3094g.setDisplayOrientation(i);
    }

    /* renamed from: x */
    public void mo11965x(boolean z) {
        if (z) {
            m3854B(this.f3094g);
        } else {
            m3853A(this.f3094g);
        }
    }

    /* renamed from: y */
    public void mo11966y() {
        this.f3094g.startPreview();
        this.f3095h = true;
    }

    /* renamed from: z */
    public void mo11967z() {
        this.f3094g.stopPreview();
        this.f3095h = false;
    }
}
