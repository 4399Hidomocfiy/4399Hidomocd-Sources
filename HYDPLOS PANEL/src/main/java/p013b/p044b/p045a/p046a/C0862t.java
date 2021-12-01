package p013b.p044b.p045a.p046a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.support.p009v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import p013b.p055e.p056a.C0966a;

/* renamed from: b.b.a.a.t */
public class C0862t {

    /* renamed from: a */
    private static CameraManager f1796a;

    /* renamed from: b */
    private static String f1797b;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[SYNTHETIC, Splitter:B:25:0x0057] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2076a(android.app.Activity r4, java.lang.String r5, int r6) {
        /*
            android.view.Window r4 = r4.getWindow()
            android.view.View r4 = r4.getDecorView()
            r0 = 1
            r4.setDrawingCacheEnabled(r0)
            r4.buildDrawingCache()
            android.graphics.Bitmap r0 = r4.getDrawingCache()
            r1 = 0
            p013b.p044b.p045a.p046a.C0835f.m1845b(r5, r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0043 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0043 }
            boolean r5 = r3.exists()     // Catch:{ Exception -> 0x0043 }
            if (r5 == 0) goto L_0x0026
            r3.delete()     // Catch:{ Exception -> 0x0043 }
        L_0x0026:
            r3.createNewFile()     // Catch:{ Exception -> 0x0043 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0043 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0043 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r0.compress(r2, r6, r5)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r5.flush()     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r5.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x0051
        L_0x003a:
            r4 = move-exception
            r2 = r5
            goto L_0x0055
        L_0x003d:
            r6 = move-exception
            r2 = r5
            r5 = r6
            goto L_0x0044
        L_0x0041:
            r4 = move-exception
            goto L_0x0055
        L_0x0043:
            r5 = move-exception
        L_0x0044:
            r5.printStackTrace()     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0051
            r2.close()
            goto L_0x0051
        L_0x004d:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0051:
            r4.setDrawingCacheEnabled(r1)
            return
        L_0x0055:
            if (r2 == 0) goto L_0x005f
            r2.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r5 = move-exception
            r5.printStackTrace()
        L_0x005f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0862t.m2076a(android.app.Activity, java.lang.String, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2077b(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Object r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0862t.m2077b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.content.Intent):void");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m2078c(Activity activity, int i, boolean z, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            if (!z) {
                if (view != null) {
                    view.setBackgroundColor(i);
                }
                i = 0;
            } else if (view != null) {
                view.setFitsSystemWindows(true);
            }
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1792);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
            window.setNavigationBarColor(i);
            View childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.setFitsSystemWindows(childAt, z);
            }
        } else if (i2 >= 19) {
            if (!z) {
                if (view != null) {
                    view.setBackgroundColor(i);
                }
                i = 0;
            } else if (view != null) {
                view.setFitsSystemWindows(true);
            }
            m2083h(activity, true);
            C0966a aVar = new C0966a(activity);
            aVar.mo9258e(true);
            aVar.mo9256c(true);
            aVar.mo9259f(i);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m2079d(Activity activity, int i, boolean z, View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            if (!z) {
                if (view != null) {
                    view.setBackgroundColor(i);
                }
                i = 0;
            } else if (view != null) {
                view.setFitsSystemWindows(true);
            }
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1792);
            if (i2 == 0) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
            } else if (i2 == 1) {
                window.setNavigationBarColor(i);
            }
            View childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.setFitsSystemWindows(childAt, z);
            }
        } else if (i3 >= 19) {
            if (!z) {
                if (view != null) {
                    view.setBackgroundColor(i);
                }
                i = 0;
            } else if (view != null) {
                view.setFitsSystemWindows(true);
            }
            m2083h(activity, true);
            C0966a aVar = new C0966a(activity);
            if (i2 == 0) {
                aVar.mo9258e(true);
            } else if (i2 == 1) {
                aVar.mo9256c(true);
            } else {
                return;
            }
            aVar.mo9259f(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2080e(android.content.Context r1, android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r0.x = r3
            r0.y = r4
            r3 = -2
            if (r5 != 0) goto L_0x001b
            r0.width = r3
            goto L_0x001d
        L_0x001b:
            r0.width = r5
        L_0x001d:
            if (r6 != 0) goto L_0x0022
            r0.height = r3
            goto L_0x0024
        L_0x0022:
            r0.height = r6
        L_0x0024:
            if (r7 != 0) goto L_0x002d
            int r3 = m2081f()
            r0.type = r3
            goto L_0x002f
        L_0x002d:
            r0.type = r7
        L_0x002f:
            if (r8 != 0) goto L_0x0036
            r3 = 51
            r0.gravity = r3
            goto L_0x0038
        L_0x0036:
            r0.gravity = r8
        L_0x0038:
            if (r9 != 0) goto L_0x003f
            r3 = 40
        L_0x003c:
            r0.flags = r3
            goto L_0x0047
        L_0x003f:
            r3 = 1
            if (r9 != r3) goto L_0x0045
            r3 = 32
            goto L_0x003c
        L_0x0045:
            r0.flags = r9
        L_0x0047:
            if (r10 != 0) goto L_0x004d
            r3 = -3
            r0.format = r3
            goto L_0x004f
        L_0x004d:
            r0.format = r10
        L_0x004f:
            r1.addView(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0862t.m2080e(android.content.Context, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    /* renamed from: f */
    public static int m2081f() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return 2038;
        }
        return (i < 25 && i >= 23) ? 2005 : 2003;
    }

    /* renamed from: g */
    public static String m2082g(CameraManager cameraManager, int i) {
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (bool != null && bool.booleanValue() && num != null && num.intValue() == i) {
                    return str;
                }
            }
            return null;
        } catch (CameraAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @TargetApi(19)
    /* renamed from: h */
    private static void m2083h(Activity activity, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.flags = z ? attributes.flags | 67108864 : attributes.flags & -67108865;
        window.setAttributes(attributes);
    }

    /* renamed from: i */
    public static CameraManager m2084i(Context context, boolean z) {
        if (f1796a == null) {
            f1796a = (CameraManager) context.getSystemService("camera");
        }
        if (f1797b == null) {
            f1797b = m2082g(f1796a, 1);
        }
        String str = f1797b;
        if (str != null) {
            try {
                f1796a.setTorchMode(str, z);
                return f1796a;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f1796a;
    }
}
