package p062cn.hugo.android.scanner;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.util.Log;
import p062cn.hugo.android.scanner.p064g.C1051b;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.d */
public final class C1036d {

    /* renamed from: e */
    private static final String f2271e = "d";

    /* renamed from: a */
    private final Activity f2272a;

    /* renamed from: b */
    private final BroadcastReceiver f2273b = new C1039c();

    /* renamed from: c */
    private boolean f2274c = false;

    /* renamed from: d */
    private AsyncTask<?, ?, ?> f2275d;

    /* access modifiers changed from: private */
    /* renamed from: cn.hugo.android.scanner.d$b */
    public final class AsyncTaskC1038b extends AsyncTask<Object, Object, Object> {
        private AsyncTaskC1038b() {
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(300000);
                Log.i(C1036d.f2271e, "Finishing activity due to inactivity");
                C1036d.this.f2272a.finish();
                return null;
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    /* renamed from: cn.hugo.android.scanner.d$c */
    private final class C1039c extends BroadcastReceiver {
        private C1039c() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                if (intent.getIntExtra("plugged", -1) <= 0) {
                    C1036d.this.mo10069e();
                } else {
                    C1036d.this.m2917d();
                }
            }
        }
    }

    C1036d(Activity activity) {
        this.f2272a = activity;
        mo10069e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private synchronized void m2917d() {
        AsyncTask<?, ?, ?> asyncTask = this.f2275d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f2275d = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo10069e() {
        m2917d();
        AsyncTaskC1038b bVar = new AsyncTaskC1038b();
        this.f2275d = bVar;
        C1051b.m2957a(bVar);
    }

    /* renamed from: f */
    public synchronized void mo10070f() {
        m2917d();
        if (this.f2274c) {
            this.f2272a.unregisterReceiver(this.f2273b);
            this.f2274c = false;
        } else {
            Log.w(f2271e, "PowerStatusReceiver was never registered?");
        }
    }

    /* renamed from: g */
    public synchronized void mo10071g() {
        if (this.f2274c) {
            Log.w(f2271e, "PowerStatusReceiver was already registered?");
        } else {
            this.f2272a.registerReceiver(this.f2273b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.f2274c = true;
        }
        mo10069e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10072h() {
        m2917d();
    }
}
