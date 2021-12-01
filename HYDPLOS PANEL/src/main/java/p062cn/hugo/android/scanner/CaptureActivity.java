package p062cn.hugo.android.scanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Toast;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p033w.p034a.AbstractC0769u;
import p062cn.hugo.android.scanner.p063f.C1046c;
import p062cn.hugo.android.scanner.p065h.HandlerC1054c;
import p062cn.hugo.android.scanner.view.ViewfinderView;

/* renamed from: cn.hugo.android.scanner.CaptureActivity */
public final class CaptureActivity extends Activity implements SurfaceHolder.Callback, View.OnClickListener {

    /* renamed from: o */
    private static final String f2246o = CaptureActivity.class.getSimpleName();

    /* renamed from: a */
    private boolean f2247a;

    /* renamed from: b */
    private C1036d f2248b;

    /* renamed from: c */
    private C1034b f2249c;

    /* renamed from: d */
    private C1033a f2250d;

    /* renamed from: e */
    private C1046c f2251e;

    /* renamed from: f */
    private ViewfinderView f2252f;

    /* renamed from: g */
    private HandlerC1054c f2253g;

    /* renamed from: h */
    private C0716p f2254h;

    /* renamed from: i */
    private boolean f2255i;

    /* renamed from: j */
    private Collection<EnumC0577a> f2256j;

    /* renamed from: k */
    private Map<EnumC0704e, ?> f2257k;

    /* renamed from: l */
    private String f2258l;

    /* renamed from: m */
    private C0716p f2259m;

    /* renamed from: n */
    private EnumC1040e f2260n;

    /* renamed from: cn.hugo.android.scanner.CaptureActivity$a */
    static class HandlerC1032a extends Handler {

        /* renamed from: a */
        private WeakReference<Activity> f2261a;

        public HandlerC1032a(Activity activity) {
            this.f2261a = new WeakReference<>(activity);
        }

        public void handleMessage(Message message) {
            String str;
            Activity activity;
            int i = message.what;
            if (i != 200) {
                if (i == 300) {
                    activity = this.f2261a.get();
                    str = "解析图片失败";
                }
                super.handleMessage(message);
            }
            activity = this.f2261a.get();
            str = "解析成功，结果为：" + message.obj;
            Toast.makeText(activity, str, 0).show();
            super.handleMessage(message);
        }
    }

    public CaptureActivity() {
        new HandlerC1032a(this);
    }

    /* renamed from: a */
    private void m2902a(Bitmap bitmap, C0716p pVar) {
        HandlerC1054c cVar = this.f2253g;
        if (cVar == null) {
            this.f2259m = pVar;
            return;
        }
        if (pVar != null) {
            this.f2259m = pVar;
        }
        C0716p pVar2 = this.f2259m;
        if (pVar2 != null) {
            this.f2253g.sendMessage(Message.obtain(cVar, 2131230781, pVar2));
        }
        this.f2259m = null;
    }

    /* renamed from: b */
    private void m2903b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(2131558431));
        builder.setMessage("抱歉，Android相机出现问题。您可能需要重启设备。");
        builder.setPositiveButton("确定", new DialogInterface$OnClickListenerC1035c(this));
        builder.setOnCancelListener(new DialogInterface$OnClickListenerC1035c(this));
        builder.show();
    }

    /* renamed from: c */
    private void m2904c(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        } else if (this.f2251e.mo10091f()) {
            Log.w(f2246o, "initCamera() while already open -- late SurfaceView callback?");
        } else {
            try {
                this.f2251e.mo10092g(surfaceHolder);
                if (this.f2253g == null) {
                    this.f2253g = new HandlerC1054c(this, this.f2256j, this.f2257k, this.f2258l, this.f2251e);
                }
                m2902a(null, null);
            } catch (IOException e) {
                Log.w(f2246o, e);
                m2903b();
            } catch (RuntimeException e2) {
                Log.w(f2246o, "Unexpected error initializing camera", e2);
                m2903b();
            }
        }
    }

    /* renamed from: d */
    private void m2905d() {
        this.f2252f.setVisibility(0);
        this.f2254h = null;
    }

    public void drawViewfinder() {
        this.f2252f.mo10110f();
    }

    public C1046c getCameraManager() {
        return this.f2251e;
    }

    public Handler getHandler() {
        return this.f2253g;
    }

    public ViewfinderView getViewfinderView() {
        return this.f2252f;
    }

    public void handleDecode(C0716p pVar, Bitmap bitmap, float f) {
        this.f2248b.mo10069e();
        this.f2254h = pVar;
        this.f2249c.mo10063c();
        String qVar = AbstractC0769u.m1526k(pVar).toString();
        if (qVar.equals("")) {
            Toast.makeText(this, "扫描失败!", 0).show();
        } else {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("result", qVar);
            intent.putExtras(bundle);
            setResult(-1, intent);
        }
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onClick(View view) {
        C1046c cVar;
        boolean z;
        int id = view.getId();
        if (id == 2131230759) {
            if (this.f2255i) {
                cVar = this.f2251e;
                z = false;
            } else {
                cVar = this.f2251e;
                z = true;
            }
            cVar.mo10095j(z);
            this.f2255i = z;
        } else if (id == 2131230762) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(2131361854);
        this.f2247a = false;
        this.f2248b = new C1036d(this);
        this.f2249c = new C1034b(this);
        this.f2250d = new C1033a(this);
        findViewById(2131230762).setOnClickListener(this);
        findViewById(2131230759).setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f2248b.mo10072h();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (!(i == 27 || i == 80)) {
                if (i == 24) {
                    this.f2251e.mo10098m();
                } else if (i == 25) {
                    this.f2251e.mo10099n();
                    return true;
                }
            }
            return true;
        } else if (this.f2260n == EnumC1040e.NONE && this.f2254h != null) {
            restartPreviewAfterDelay(0);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        HandlerC1054c cVar = this.f2253g;
        if (cVar != null) {
            cVar.mo10103a();
            this.f2253g = null;
        }
        this.f2248b.mo10070f();
        this.f2250d.mo10059b();
        this.f2249c.mo10062b();
        this.f2251e.mo10088b();
        if (!this.f2247a) {
            ((SurfaceView) findViewById(2131230761)).getHolder().removeCallback(this);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2251e = new C1046c(getApplication());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(2131230764);
        this.f2252f = viewfinderView;
        viewfinderView.setCameraManager(this.f2251e);
        this.f2253g = null;
        this.f2254h = null;
        SurfaceHolder holder = ((SurfaceView) findViewById(2131230761)).getHolder();
        if (this.f2247a) {
            m2904c(holder);
        } else {
            holder.setType(3);
            holder.addCallback(this);
        }
        this.f2249c.mo10064e();
        this.f2250d.mo10058a(this.f2251e);
        this.f2248b.mo10071g();
        this.f2260n = EnumC1040e.NONE;
        this.f2256j = null;
        this.f2258l = null;
    }

    public void restartPreviewAfterDelay(long j) {
        HandlerC1054c cVar = this.f2253g;
        if (cVar != null) {
            cVar.sendEmptyMessageDelayed(2131230850, j);
        }
        m2905d();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            Log.e(f2246o, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        if (!this.f2247a) {
            this.f2247a = true;
            m2904c(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f2247a = false;
    }
}
