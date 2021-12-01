package p062cn.hugo.android.scanner.p063f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.f.b */
public final class C1044b {

    /* renamed from: a */
    private final Context f2290a;

    /* renamed from: b */
    private Point f2291b;

    /* renamed from: c */
    private Point f2292c;

    /* access modifiers changed from: package-private */
    /* renamed from: cn.hugo.android.scanner.f.b$a */
    public class C1045a implements Comparator<Camera.Size> {
        C1045a(C1044b bVar) {
        }

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    C1044b(Context context) {
        this.f2290a = context;
    }

    /* renamed from: a */
    private void m2925a(Camera.Parameters parameters, boolean z, boolean z2) {
        String str;
        if (z) {
            str = m2927c(parameters.getSupportedFlashModes(), "torch", "on");
        } else {
            str = m2927c(parameters.getSupportedFlashModes(), "off");
        }
        if (str != null) {
            parameters.setFlashMode(str);
        }
    }

    /* renamed from: b */
    private Point m2926b(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Log.w("CameraConfiguration", "Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            return new Point(previewSize.width, previewSize.height);
        }
        ArrayList<Camera.Size> arrayList = new ArrayList(supportedPreviewSizes);
        Collections.sort(arrayList, new C1045a(this));
        if (Log.isLoggable("CameraConfiguration", 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            Log.i("CameraConfiguration", "Supported preview sizes: " + ((Object) sb));
        }
        double d = (double) point.x;
        double d2 = (double) point.y;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i = size2.width;
                int i2 = size2.height;
                if (i * i2 >= 153600) {
                    if (i < i2) {
                        z = true;
                    }
                    int i3 = z ? i2 : i;
                    int i4 = z ? i : i2;
                    double d4 = (double) i3;
                    double d5 = (double) i4;
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    if (Math.abs((d4 / d5) - d3) <= 0.15d) {
                        if (i3 == point.x && i4 == point.y) {
                            Point point2 = new Point(i, i2);
                            Log.i("CameraConfiguration", "Found preview size exactly matching screen size: " + point2);
                            return point2;
                        }
                    }
                }
                it.remove();
            } else if (!arrayList.isEmpty()) {
                Camera.Size size3 = (Camera.Size) arrayList.get(0);
                Point point3 = new Point(size3.width, size3.height);
                Log.i("CameraConfiguration", "Using largest suitable preview size: " + point3);
                return point3;
            } else {
                Camera.Size previewSize2 = parameters.getPreviewSize();
                Point point4 = new Point(previewSize2.width, previewSize2.height);
                Log.i("CameraConfiguration", "No suitable preview sizes, using default: " + point4);
                return point4;
            }
        }
    }

    /* renamed from: c */
    private static String m2927c(Collection<String> collection, String... strArr) {
        String str;
        Log.i("CameraConfiguration", "Supported values: " + collection);
        if (collection != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                str = strArr[i];
                if (collection.contains(str)) {
                    break;
                }
                i++;
            }
        }
        str = null;
        Log.i("CameraConfiguration", "Settable value: " + str);
        return str;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    private Point m2928e(Display display) {
        Point point = new Point();
        try {
            display.getSize(point);
        } catch (NoSuchMethodError unused) {
            point.x = display.getWidth();
            point.y = display.getHeight();
        }
        return point;
    }

    /* renamed from: i */
    private void m2929i(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        m2925a(parameters, EnumC1047d.m2952b(sharedPreferences) == EnumC1047d.ON, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Point mo10079d() {
        return this.f2292c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Point mo10080f() {
        return this.f2291b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo10081g(Camera camera) {
        String flashMode;
        if (camera == null || camera.getParameters() == null || (flashMode = camera.getParameters().getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10082h(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f2290a.getSystemService("window")).getDefaultDisplay();
        new Point();
        this.f2291b = m2928e(defaultDisplay);
        Log.i("CameraConfiguration", "Screen resolution: " + this.f2291b);
        Point point = new Point();
        Point point2 = this.f2291b;
        point.x = point2.x;
        point.y = point2.y;
        int i = point2.x;
        int i2 = point2.y;
        if (i < i2) {
            point.x = i2;
            point.y = point2.x;
        }
        this.f2292c = m2926b(parameters, point);
        Log.i("CameraConfiguration", "Camera resolution: " + this.f2292c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10083j(Camera camera, boolean z) {
        String c;
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            Log.w("CameraConfiguration", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("CameraConfiguration", "Initial camera parameters: " + parameters.flatten());
        if (z) {
            Log.w("CameraConfiguration", "In camera config safe mode -- most settings will not be honored");
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f2290a);
        m2929i(parameters, defaultSharedPreferences, z);
        String c2 = m2927c(parameters.getSupportedFocusModes(), "auto");
        if (!z && c2 == null) {
            c2 = m2927c(parameters.getSupportedFocusModes(), "macro", "edof");
        }
        if (c2 != null) {
            parameters.setFocusMode(c2);
        }
        if (defaultSharedPreferences.getBoolean("preferences_invert_scan", false) && (c = m2927c(parameters.getSupportedColorEffects(), "negative")) != null) {
            parameters.setColorEffect(c);
        }
        Point point = this.f2292c;
        parameters.setPreviewSize(point.x, point.y);
        camera.setParameters(parameters);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.f2292c;
            if (!(point2.x == previewSize.width && point2.y == previewSize.height)) {
                Log.w("CameraConfiguration", "Camera said it supported preview size " + this.f2292c.x + 'x' + this.f2292c.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height);
                Point point3 = this.f2292c;
                point3.x = previewSize.width;
                point3.y = previewSize.height;
            }
        }
        camera.setDisplayOrientation(90);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo10084k(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        m2925a(parameters, z, false);
        camera.setParameters(parameters);
    }
}
