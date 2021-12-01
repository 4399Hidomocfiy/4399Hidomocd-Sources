package p062cn.hugo.android.scanner.p064g;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;

/* renamed from: cn.hugo.android.scanner.g.b */
public class C1051b {
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m2957a(AsyncTask<?, ?, ?> asyncTask) {
        if (Build.VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        } else {
            asyncTask.execute(new Object[0]);
        }
    }
}
