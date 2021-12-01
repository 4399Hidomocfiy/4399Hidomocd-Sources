package p062cn.hugo.android.scanner.p065h;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p013b.p014a.p015a.AbstractC0719s;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p062cn.hugo.android.scanner.CaptureActivity;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.h.f */
public final class C1058f extends Thread {

    /* renamed from: a */
    private final CaptureActivity f2333a;

    /* renamed from: b */
    private final Map<EnumC0704e, Object> f2334b;

    /* renamed from: c */
    private Handler f2335c;

    /* renamed from: d */
    private final CountDownLatch f2336d = new CountDownLatch(1);

    C1058f(CaptureActivity captureActivity, Collection<EnumC0577a> collection, Map<EnumC0704e, ?> map, String str, AbstractC0719s sVar) {
        this.f2333a = captureActivity;
        EnumMap enumMap = new EnumMap(EnumC0704e.class);
        this.f2334b = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(captureActivity);
            collection = EnumSet.noneOf(EnumC0577a.class);
            if (defaultSharedPreferences.getBoolean("preferences_decode_1D", false)) {
                collection.addAll(C1056d.f2326b);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_QR", false)) {
                collection.addAll(C1056d.f2327c);
            }
            if (defaultSharedPreferences.getBoolean("preferences_decode_Data_Matrix", false)) {
                collection.addAll(C1056d.f2328d);
            }
        }
        enumMap.put((Object) EnumC0704e.POSSIBLE_FORMATS, (Object) collection);
        if (str != null) {
            enumMap.put((Object) EnumC0704e.CHARACTER_SET, (Object) str);
        }
        enumMap.put((Object) EnumC0704e.NEED_RESULT_POINT_CALLBACK, (Object) sVar);
        Log.i("DecodeThread", "Hints: " + enumMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Handler mo10106a() {
        try {
            this.f2336d.await();
        } catch (InterruptedException unused) {
        }
        return this.f2335c;
    }

    public void run() {
        Looper.prepare();
        this.f2335c = new HandlerC1057e(this.f2333a, this.f2334b);
        this.f2336d.countDown();
        Looper.loop();
    }
}
