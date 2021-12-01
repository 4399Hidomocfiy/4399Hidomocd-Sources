package p062cn.hugo.android.scanner.p065h;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import p013b.p014a.p015a.C0709j;
import p013b.p014a.p015a.C0713m;
import p013b.p014a.p015a.EnumC0704e;
import p062cn.hugo.android.scanner.CaptureActivity;

/* renamed from: cn.hugo.android.scanner.h.e */
final class HandlerC1057e extends Handler {

    /* renamed from: d */
    private static final String f2329d = HandlerC1057e.class.getSimpleName();

    /* renamed from: a */
    private final CaptureActivity f2330a;

    /* renamed from: b */
    private final C0709j f2331b;

    /* renamed from: c */
    private boolean f2332c = true;

    HandlerC1057e(CaptureActivity captureActivity, Map<EnumC0704e, Object> map) {
        C0709j jVar = new C0709j();
        this.f2331b = jVar;
        jVar.mo8686e(map);
        this.f2330a = captureActivity;
    }

    /* renamed from: a */
    private static void m2963a(C0713m mVar, Bundle bundle) {
        int[] i = mVar.mo8689i();
        int h = mVar.mo8688h();
        Bitmap createBitmap = Bitmap.createBitmap(i, 0, h, h, mVar.mo8687g(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", ((float) h) / ((float) mVar.mo8681d()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2964b(byte[] r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: p062cn.hugo.android.scanner.p065h.HandlerC1057e.m2964b(byte[], int, int):void");
    }

    public void handleMessage(Message message) {
        if (this.f2332c) {
            int i = message.what;
            if (i == 2131230779) {
                m2964b((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == 2131230848) {
                this.f2332c = false;
                Looper.myLooper().quit();
            }
        }
    }
}
