package p069pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p069pl.droidsonroids.gif.p070o.AbstractC1510a;

/* renamed from: pl.droidsonroids.gif.c */
public class C1488c extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: a */
    final ScheduledThreadPoolExecutor f3633a;

    /* renamed from: b */
    volatile boolean f3634b;

    /* renamed from: c */
    long f3635c;

    /* renamed from: d */
    private final Rect f3636d;

    /* renamed from: e */
    protected final Paint f3637e;

    /* renamed from: f */
    final Bitmap f3638f;

    /* renamed from: g */
    final GifInfoHandle f3639g;

    /* renamed from: h */
    final ConcurrentLinkedQueue<AbstractC1486a> f3640h;

    /* renamed from: i */
    private ColorStateList f3641i;

    /* renamed from: j */
    private PorterDuffColorFilter f3642j;

    /* renamed from: k */
    private PorterDuff.Mode f3643k;

    /* renamed from: l */
    final boolean f3644l;

    /* renamed from: m */
    final HandlerC1502h f3645m;

    /* renamed from: n */
    private final C1508m f3646n;

    /* renamed from: o */
    private final Rect f3647o;

    /* renamed from: p */
    ScheduledFuture<?> f3648p;

    /* renamed from: q */
    private int f3649q;

    /* renamed from: r */
    private int f3650r;

    /* renamed from: s */
    private AbstractC1510a f3651s;

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.c$a */
    public class C1489a extends AbstractRunnableC1509n {
        C1489a(C1488c cVar) {
            super(cVar);
        }

        @Override // p069pl.droidsonroids.gif.AbstractRunnableC1509n
        /* renamed from: a */
        public void mo12614a() {
            if (C1488c.this.f3639g.mo12525t()) {
                C1488c.this.start();
            }
        }
    }

    /* renamed from: pl.droidsonroids.gif.c$b */
    class C1490b extends AbstractRunnableC1509n {

        /* renamed from: b */
        final /* synthetic */ int f3653b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1490b(C1488c cVar, int i) {
            super(cVar);
            this.f3653b = i;
        }

        @Override // p069pl.droidsonroids.gif.AbstractRunnableC1509n
        /* renamed from: a */
        public void mo12614a() {
            C1488c cVar = C1488c.this;
            cVar.f3639g.mo12529x(this.f3653b, cVar.f3638f);
            this.f3700a.f3645m.sendEmptyMessageAtTime(-1, 0);
        }
    }

    public C1488c(ContentResolver contentResolver, Uri uri) {
        this(GifInfoHandle.m4117p(contentResolver, uri), null, null, true);
    }

    public C1488c(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public C1488c(AssetManager assetManager, String str) {
        this(assetManager.openFd(str));
    }

    public C1488c(Resources resources, int i) {
        this(resources.openRawResourceFd(i));
        float b = C1495f.m4185b(resources, i);
        this.f3650r = (int) (((float) this.f3639g.mo12513f()) * b);
        this.f3649q = (int) (((float) this.f3639g.mo12519l()) * b);
    }

    public C1488c(String str) {
        this(new GifInfoHandle(str), null, null, true);
    }

    C1488c(GifInfoHandle gifInfoHandle, C1488c cVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f3634b = true;
        this.f3635c = Long.MIN_VALUE;
        this.f3636d = new Rect();
        this.f3637e = new Paint(6);
        this.f3640h = new ConcurrentLinkedQueue<>();
        C1508m mVar = new C1508m(this);
        this.f3646n = mVar;
        this.f3644l = z;
        this.f3633a = scheduledThreadPoolExecutor == null ? C1492e.m4182a() : scheduledThreadPoolExecutor;
        this.f3639g = gifInfoHandle;
        Bitmap bitmap = null;
        if (cVar != null) {
            synchronized (cVar.f3639g) {
                if (!cVar.f3639g.mo12521n() && cVar.f3639g.mo12513f() >= gifInfoHandle.mo12513f() && cVar.f3639g.mo12519l() >= gifInfoHandle.mo12519l()) {
                    cVar.m4169i();
                    Bitmap bitmap2 = cVar.f3638f;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.f3638f = Bitmap.createBitmap(gifInfoHandle.mo12519l(), gifInfoHandle.mo12513f(), Bitmap.Config.ARGB_8888);
        } else {
            this.f3638f = bitmap;
        }
        this.f3638f.setHasAlpha(!gifInfoHandle.mo12520m());
        this.f3647o = new Rect(0, 0, gifInfoHandle.mo12519l(), gifInfoHandle.mo12513f());
        this.f3645m = new HandlerC1502h(this);
        mVar.mo12614a();
        this.f3649q = gifInfoHandle.mo12519l();
        this.f3650r = gifInfoHandle.mo12513f();
    }

    /* renamed from: a */
    private void m4167a() {
        ScheduledFuture<?> scheduledFuture = this.f3648p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f3645m.removeMessages(-1);
    }

    /* renamed from: g */
    private void m4168g() {
        if (this.f3644l && this.f3634b) {
            long j = this.f3635c;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f3635c = Long.MIN_VALUE;
                this.f3633a.remove(this.f3646n);
                this.f3648p = this.f3633a.schedule(this.f3646n, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: i */
    private void m4169i() {
        this.f3634b = false;
        this.f3645m.removeMessages(-1);
        this.f3639g.mo12523r();
    }

    /* renamed from: k */
    private PorterDuffColorFilter m4170k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public int mo12576b() {
        return this.f3639g.mo12509b();
    }

    /* renamed from: c */
    public int mo12577c() {
        int c = this.f3639g.mo12510c();
        return (c == 0 || c < this.f3639g.mo12515g()) ? c : c - 1;
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return mo12581d() > 1;
    }

    public boolean canSeekForward() {
        return mo12581d() > 1;
    }

    /* renamed from: d */
    public int mo12581d() {
        return this.f3639g.mo12517j();
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (this.f3642j == null || this.f3637e.getColorFilter() != null) {
            z = false;
        } else {
            this.f3637e.setColorFilter(this.f3642j);
            z = true;
        }
        AbstractC1510a aVar = this.f3651s;
        if (aVar == null) {
            canvas.drawBitmap(this.f3638f, this.f3647o, this.f3636d, this.f3637e);
        } else {
            aVar.mo12625b(canvas, this.f3637e, this.f3638f);
        }
        if (z) {
            this.f3637e.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public boolean mo12583e() {
        return this.f3639g.mo12521n();
    }

    /* renamed from: f */
    public void mo12584f() {
        this.f3633a.execute(new C1489a(this));
    }

    public int getAlpha() {
        return this.f3637e.getAlpha();
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        return 100;
    }

    public ColorFilter getColorFilter() {
        return this.f3637e.getColorFilter();
    }

    public int getCurrentPosition() {
        return this.f3639g.mo12511d();
    }

    public int getDuration() {
        return this.f3639g.mo12512e();
    }

    public int getIntrinsicHeight() {
        return this.f3650r;
    }

    public int getIntrinsicWidth() {
        return this.f3649q;
    }

    public int getOpacity() {
        return (!this.f3639g.mo12520m() || this.f3637e.getAlpha() < 255) ? -2 : -1;
    }

    /* renamed from: h */
    public void mo12594h(int i) {
        this.f3639g.mo12530y(i);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        m4168g();
    }

    public boolean isPlaying() {
        return this.f3634b;
    }

    public boolean isRunning() {
        return this.f3634b;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f3641i) != null && colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo12599j(long j) {
        if (this.f3644l) {
            this.f3635c = 0;
            this.f3645m.sendEmptyMessageAtTime(-1, 0);
            return;
        }
        m4167a();
        this.f3648p = this.f3633a.schedule(this.f3646n, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3636d.set(rect);
        AbstractC1510a aVar = this.f3651s;
        if (aVar != null) {
            aVar.mo12624a(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f3641i;
        if (colorStateList == null || (mode = this.f3643k) == null) {
            return false;
        }
        this.f3642j = m4170k(colorStateList, mode);
        return true;
    }

    public void pause() {
        stop();
    }

    public void seekTo(int i) {
        if (i >= 0) {
            this.f3633a.execute(new C1490b(this, i));
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public void setAlpha(int i) {
        this.f3637e.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3637e.setColorFilter(colorFilter);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.f3637e.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f3637e.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3641i = colorStateList;
        this.f3642j = m4170k(colorStateList, this.f3643k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3643k = mode;
        this.f3642j = m4170k(this.f3641i, mode);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f3644l) {
            if (z) {
                if (z2) {
                    mo12584f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    public void start() {
        synchronized (this) {
            if (!this.f3634b) {
                this.f3634b = true;
                mo12599j(this.f3639g.mo12526u());
            }
        }
    }

    public void stop() {
        synchronized (this) {
            if (this.f3634b) {
                this.f3634b = false;
                m4167a();
                this.f3639g.mo12528w();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f3639g.mo12519l()), Integer.valueOf(this.f3639g.mo12513f()), Integer.valueOf(this.f3639g.mo12517j()), Integer.valueOf(this.f3639g.mo12516h()));
    }
}
