package p062cn.hugo.android.scanner.p065h;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p044b.p045a.p046a.C0851m;
import p062cn.hugo.android.scanner.CaptureActivity;
import p062cn.hugo.android.scanner.p063f.C1046c;
import p062cn.hugo.android.scanner.view.C1059a;

/* renamed from: cn.hugo.android.scanner.h.c */
public final class HandlerC1054c extends Handler {

    /* renamed from: e */
    private static final String f2316e = HandlerC1054c.class.getSimpleName();

    /* renamed from: a */
    private final CaptureActivity f2317a;

    /* renamed from: b */
    private final C1058f f2318b;

    /* renamed from: c */
    private EnumC1055a f2319c = EnumC1055a.SUCCESS;

    /* renamed from: d */
    private final C1046c f2320d;

    /* access modifiers changed from: private */
    /* renamed from: cn.hugo.android.scanner.h.c$a */
    public enum EnumC1055a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public HandlerC1054c(CaptureActivity captureActivity, Collection<EnumC0577a> collection, Map<EnumC0704e, ?> map, String str, C1046c cVar) {
        this.f2317a = captureActivity;
        C1058f fVar = new C1058f(captureActivity, collection, map, str, new C1059a(captureActivity.getViewfinderView()));
        this.f2318b = fVar;
        fVar.start();
        this.f2320d = cVar;
        cVar.mo10096k();
        m2961b();
    }

    /* renamed from: b */
    private void m2961b() {
        if (this.f2319c == EnumC1055a.SUCCESS) {
            this.f2319c = EnumC1055a.PREVIEW;
            this.f2320d.mo10093h(this.f2318b.mo10106a(), 2131230779);
            this.f2317a.drawViewfinder();
        }
    }

    /* renamed from: a */
    public void mo10103a() {
        this.f2319c = EnumC1055a.DONE;
        this.f2320d.mo10097l();
        Message.obtain(this.f2318b.mo10106a(), 2131230848).sendToTarget();
        try {
            this.f2318b.join(500);
        } catch (InterruptedException unused) {
        }
        removeMessages(2131230781);
        removeMessages(2131230780);
    }

    public void handleMessage(Message message) {
        ActivityInfo activityInfo;
        Bitmap bitmap = null;
        r1 = null;
        String str = null;
        bitmap = null;
        switch (message.what) {
            case 2131230780:
                this.f2319c = EnumC1055a.PREVIEW;
                this.f2320d.mo10093h(this.f2318b.mo10106a(), 2131230779);
                return;
            case 2131230781:
                Log.d(f2316e, "Got decode succeeded message");
                this.f2319c = EnumC1055a.SUCCESS;
                Bundle data = message.getData();
                float f = 1.0f;
                if (data != null) {
                    byte[] byteArray = data.getByteArray("barcode_bitmap");
                    if (byteArray != null) {
                        bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true);
                    }
                    f = data.getFloat("barcode_scaled_factor");
                }
                this.f2317a.handleDecode((C0716p) message.obj, bitmap, f);
                return;
            case 2131230820:
                String str2 = f2316e;
                Log.d(str2, "Got product query message");
                String str3 = (String) message.obj;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(524288);
                intent.setData(C0851m.m1977c(this.f2317a, str3));
                ResolveInfo resolveActivity = this.f2317a.getPackageManager().resolveActivity(intent, 65536);
                if (!(resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null)) {
                    str = activityInfo.packageName;
                    Log.d(str2, "Using browser in package " + str);
                }
                if ("com.android.browser".equals(str) || "com.android.chrome".equals(str)) {
                    intent.setPackage(str);
                    intent.addFlags(268435456);
                    intent.putExtra("com.android.browser.application_id", str);
                }
                try {
                    this.f2317a.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    String str4 = f2316e;
                    Log.w(str4, "Can't find anything to handle VIEW of URI " + str3);
                    return;
                }
            case 2131230850:
                Log.d(f2316e, "Got restart preview message");
                m2961b();
                return;
            case 2131230851:
                Log.d(f2316e, "Got return scan result message");
                this.f2317a.setResult(-1, (Intent) message.obj);
                this.f2317a.finish();
                return;
            default:
                return;
        }
    }
}
