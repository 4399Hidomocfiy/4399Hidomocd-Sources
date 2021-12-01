package p069pl.droidsonroids.gif;

import java.lang.Thread;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.n */
public abstract class AbstractRunnableC1509n implements Runnable {

    /* renamed from: a */
    final C1488c f3700a;

    AbstractRunnableC1509n(C1488c cVar) {
        this.f3700a = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12614a();

    public final void run() {
        try {
            if (!this.f3700a.mo12583e()) {
                mo12614a();
            }
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
