package p069pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.m */
public class C1508m extends AbstractRunnableC1509n {
    C1508m(C1488c cVar) {
        super(cVar);
    }

    @Override // p069pl.droidsonroids.gif.AbstractRunnableC1509n
    /* renamed from: a */
    public void mo12614a() {
        C1488c cVar = this.f3700a;
        long s = cVar.f3639g.mo12524s(cVar.f3638f);
        if (s >= 0) {
            this.f3700a.f3635c = SystemClock.uptimeMillis() + s;
            if (this.f3700a.isVisible() && this.f3700a.f3634b) {
                C1488c cVar2 = this.f3700a;
                if (!cVar2.f3644l) {
                    cVar2.f3633a.remove(this);
                    C1488c cVar3 = this.f3700a;
                    cVar3.f3648p = cVar3.f3633a.schedule(this, s, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f3700a.f3640h.isEmpty() && this.f3700a.mo12576b() == this.f3700a.f3639g.mo12517j() - 1) {
                C1488c cVar4 = this.f3700a;
                cVar4.f3645m.sendEmptyMessageAtTime(cVar4.mo12577c(), this.f3700a.f3635c);
            }
        } else {
            C1488c cVar5 = this.f3700a;
            cVar5.f3635c = Long.MIN_VALUE;
            cVar5.f3634b = false;
        }
        if (this.f3700a.isVisible() && !this.f3700a.f3645m.hasMessages(-1)) {
            this.f3700a.f3645m.sendEmptyMessageAtTime(-1, 0);
        }
    }
}
