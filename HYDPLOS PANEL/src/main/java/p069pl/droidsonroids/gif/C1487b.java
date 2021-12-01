package p069pl.droidsonroids.gif;

/* renamed from: pl.droidsonroids.gif.b */
class C1487b {

    /* renamed from: a */
    private volatile boolean f3632a;

    C1487b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo12572a() {
        while (!this.f3632a) {
            wait();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo12573b() {
        this.f3632a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo12574c() {
        boolean z = this.f3632a;
        this.f3632a = true;
        if (!z) {
            notify();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo12575d(boolean z) {
        if (z) {
            mo12574c();
        } else {
            mo12573b();
        }
    }
}
