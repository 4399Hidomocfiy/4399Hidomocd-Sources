package p069pl.droidsonroids.gif;

import android.content.res.AssetManager;
import android.content.res.Resources;

/* renamed from: pl.droidsonroids.gif.g */
public abstract class AbstractC1498g {

    /* renamed from: pl.droidsonroids.gif.g$b */
    public static final class C1500b extends AbstractC1498g {

        /* renamed from: a */
        private final AssetManager f3685a;

        /* renamed from: b */
        private final String f3686b;

        public C1500b(AssetManager assetManager, String str) {
            super();
            this.f3685a = assetManager;
            this.f3686b = str;
        }

        /* access modifiers changed from: package-private */
        @Override // p069pl.droidsonroids.gif.AbstractC1498g
        /* renamed from: a */
        public GifInfoHandle mo12616a() {
            return new GifInfoHandle(this.f3685a.openFd(this.f3686b));
        }
    }

    /* renamed from: pl.droidsonroids.gif.g$c */
    public static class C1501c extends AbstractC1498g {

        /* renamed from: a */
        private final Resources f3687a;

        /* renamed from: b */
        private final int f3688b;

        public C1501c(Resources resources, int i) {
            super();
            this.f3687a = resources;
            this.f3688b = i;
        }

        /* access modifiers changed from: package-private */
        @Override // p069pl.droidsonroids.gif.AbstractC1498g
        /* renamed from: a */
        public GifInfoHandle mo12616a() {
            return new GifInfoHandle(this.f3687a.openRawResourceFd(this.f3688b));
        }
    }

    private AbstractC1498g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract GifInfoHandle mo12616a();
}
