package p062cn.hugo.android.scanner.p063f;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: cn.hugo.android.scanner.f.e */
public final class C1048e {

    /* renamed from: a */
    private static final String f2309a = "cn.hugo.android.scanner.f.e";

    /* renamed from: a */
    public static Camera m2953a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f2309a, "No cameras!");
            return null;
        }
        int i = 0;
        while (i < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            }
            i++;
        }
        if (i < numberOfCameras) {
            String str = f2309a;
            Log.i(str, "Opening camera #" + i);
            return Camera.open(i);
        }
        Log.i(f2309a, "No camera facing back; returning camera #0");
        return Camera.open(0);
    }
}
