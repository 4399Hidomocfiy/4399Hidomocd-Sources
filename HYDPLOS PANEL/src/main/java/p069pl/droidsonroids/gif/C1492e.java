package p069pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.e */
public final class C1492e extends ScheduledThreadPoolExecutor {

    /* access modifiers changed from: private */
    /* renamed from: pl.droidsonroids.gif.e$b */
    public static final class C1494b {

        /* renamed from: a */
        private static final C1492e f3679a = new C1492e();
    }

    private C1492e() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: a */
    static C1492e m4182a() {
        return C1494b.f3679a;
    }
}
