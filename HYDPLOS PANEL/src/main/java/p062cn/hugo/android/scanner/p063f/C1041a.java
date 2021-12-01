package p062cn.hugo.android.scanner.p063f;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p062cn.hugo.android.scanner.p064g.C1051b;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.f.a */
public final class C1041a implements Camera.AutoFocusCallback {

    /* renamed from: e */
    private static final String f2283e = C1041a.class.getSimpleName();

    /* renamed from: f */
    private static final Collection<String> f2284f;

    /* renamed from: a */
    private boolean f2285a;

    /* renamed from: b */
    private final boolean f2286b;

    /* renamed from: c */
    private final Camera f2287c;

    /* renamed from: d */
    private AsyncTask<?, ?, ?> f2288d;

    /* renamed from: cn.hugo.android.scanner.f.a$b */
    private final class AsyncTaskC1043b extends AsyncTask<Object, Object, Object> {
        private AsyncTaskC1043b() {
        }

        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException unused) {
            }
            synchronized (C1041a.this) {
                if (C1041a.this.f2285a) {
                    C1041a.this.mo10075b();
                }
            }
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f2284f = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    C1041a(Context context, Camera camera) {
        this.f2287c = camera;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        boolean z = true;
        z = (!defaultSharedPreferences.getBoolean("preferences_auto_focus", true) || !f2284f.contains(focusMode)) ? false : z;
        this.f2286b = z;
        String str = f2283e;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + z);
        mo10075b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo10075b() {
        if (this.f2286b) {
            this.f2285a = true;
            try {
                this.f2287c.autoFocus(this);
            } catch (RuntimeException e) {
                Log.w(f2283e, "Unexpected exception while focusing", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo10076c() {
        if (this.f2286b) {
            try {
                this.f2287c.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f2283e, "Unexpected exception while cancelling focusing", e);
            }
        }
        AsyncTask<?, ?, ?> asyncTask = this.f2288d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f2288d = null;
        }
        this.f2285a = false;
    }

    public synchronized void onAutoFocus(boolean z, Camera camera) {
        if (this.f2285a) {
            AsyncTaskC1043b bVar = new AsyncTaskC1043b();
            this.f2288d = bVar;
            C1051b.m2957a(bVar);
        }
    }
}
