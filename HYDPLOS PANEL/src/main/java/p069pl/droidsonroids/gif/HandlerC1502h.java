package p069pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.h */
public class HandlerC1502h extends Handler {

    /* renamed from: a */
    private final WeakReference<C1488c> f3689a;

    public HandlerC1502h(C1488c cVar) {
        super(Looper.getMainLooper());
        this.f3689a = new WeakReference<>(cVar);
    }

    public void handleMessage(Message message) {
        C1488c cVar = this.f3689a.get();
        if (cVar != null) {
            if (message.what == -1) {
                cVar.invalidateSelf();
                return;
            }
            Iterator<AbstractC1486a> it = cVar.f3640h.iterator();
            while (it.hasNext()) {
                it.next().mo12571a(message.what);
            }
        }
    }
}
