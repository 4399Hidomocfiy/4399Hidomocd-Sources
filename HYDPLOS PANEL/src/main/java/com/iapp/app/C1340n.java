package com.iapp.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Environment;
import android.util.DisplayMetrics;
import java.io.IOException;

@SuppressLint({"NewApi"})
/* renamed from: com.iapp.app.n */
public class C1340n {

    /* renamed from: n */
    public static C1340n f3148n;

    /* renamed from: a */
    private boolean f3149a = false;

    /* renamed from: b */
    private Activity f3150b;

    /* renamed from: c */
    private String f3151c = (Environment.getExternalStorageDirectory().toString() + "/iapp.mp4");

    /* renamed from: d */
    private int f3152d = 1280;

    /* renamed from: e */
    private int f3153e = 720;

    /* renamed from: f */
    private int f3154f = 1024000;

    /* renamed from: g */
    private int f3155g = 30;

    /* renamed from: h */
    private MediaProjectionManager f3156h;

    /* renamed from: i */
    private MediaProjection f3157i;

    /* renamed from: j */
    private VirtualDisplay f3158j;

    /* renamed from: k */
    private C1342b f3159k;

    /* renamed from: l */
    private int f3160l;

    /* renamed from: m */
    private MediaRecorder f3161m;

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.n$b */
    public final class C1342b extends MediaProjection.Callback {
        private C1342b() {
        }

        public void onStop() {
            super.onStop();
            if (C1340n.this.f3149a) {
                C1340n.this.f3149a = false;
                C1340n.this.m3927r();
                C1340n.this.f3158j.release();
                C1340n.this.f3157i.stop();
                C1340n.this.f3157i.unregisterCallback(C1340n.this.f3159k);
                C1340n.this.f3157i = null;
            }
        }
    }

    public C1340n(Activity activity) {
        this.f3150b = activity;
    }

    /* renamed from: h */
    private VirtualDisplay m3923h() {
        return this.f3157i.createVirtualDisplay("MainActivity", this.f3152d, this.f3153e, this.f3160l, 16, this.f3161m.getSurface(), null, null);
    }

    /* renamed from: k */
    private void m3924k() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f3150b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f3160l = displayMetrics.densityDpi;
    }

    /* renamed from: l */
    private void m3925l(String str) {
        this.f3161m.setAudioSource(1);
        this.f3161m.setVideoSource(2);
        this.f3161m.setOutputFormat(2);
        this.f3161m.setVideoEncoder(2);
        this.f3161m.setAudioEncoder(1);
        this.f3161m.setVideoEncodingBitRate(this.f3154f);
        this.f3161m.setVideoFrameRate(this.f3155g);
        this.f3161m.setVideoSize(this.f3152d, this.f3153e);
        this.f3161m.setOutputFile(str);
    }

    /* renamed from: q */
    private void m3926q() {
        try {
            this.f3161m.prepare();
        } catch (IOException e) {
            e.printStackTrace();
            this.f3150b.finish();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: r */
    private void m3927r() {
        this.f3161m.stop();
        this.f3161m.reset();
    }

    /* renamed from: i */
    public boolean mo11983i() {
        return this.f3149a;
    }

    /* renamed from: j */
    public void mo11984j(String str, int i, int i2, int i3, int i4) {
        this.f3151c = str;
        this.f3152d = i;
        this.f3153e = i2;
        this.f3154f = i3;
        this.f3155g = i4;
    }

    /* renamed from: m */
    public void mo11985m(int i, int i2, Intent intent) {
        if (i != 1103) {
            this.f3149a = false;
        } else if (i2 != -1) {
            this.f3149a = false;
        } else {
            MediaProjection mediaProjection = this.f3156h.getMediaProjection(i2, intent);
            this.f3157i = mediaProjection;
            mediaProjection.registerCallback(this.f3159k, null);
            this.f3158j = m3923h();
            this.f3161m.start();
        }
    }

    /* renamed from: n */
    public void mo11986n(String str, int i, int i2, int i3, int i4) {
        this.f3151c = str;
        this.f3152d = i;
        this.f3153e = i2;
        this.f3154f = i3;
        this.f3155g = i4;
        m3924k();
        this.f3156h = (MediaProjectionManager) this.f3150b.getSystemService("media_projection");
        this.f3161m = new MediaRecorder();
        this.f3159k = new C1342b();
    }

    /* renamed from: o */
    public void mo11987o() {
        if (this.f3149a) {
            this.f3149a = false;
        }
        MediaRecorder mediaRecorder = this.f3161m;
        if (mediaRecorder != null) {
            mediaRecorder.release();
            this.f3161m = null;
        }
        VirtualDisplay virtualDisplay = this.f3158j;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f3158j = null;
        }
        MediaProjection mediaProjection = this.f3157i;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this.f3159k);
            this.f3157i.stop();
            this.f3157i = null;
        }
    }

    /* renamed from: p */
    public void mo11988p(boolean z) {
        this.f3149a = z;
        if (z) {
            m3925l(this.f3151c);
            m3926q();
            if (this.f3157i == null) {
                this.f3150b.startActivityForResult(new Intent(this.f3156h.createScreenCaptureIntent()), 1103);
                return;
            }
            this.f3158j = m3923h();
            this.f3161m.start();
            return;
        }
        m3927r();
        this.f3158j.release();
    }
}
