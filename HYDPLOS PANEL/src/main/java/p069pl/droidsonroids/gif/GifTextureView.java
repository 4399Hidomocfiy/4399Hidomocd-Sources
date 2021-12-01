package p069pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p069pl.droidsonroids.gif.AbstractC1498g;
import p069pl.droidsonroids.gif.C1495f;

/* renamed from: pl.droidsonroids.gif.GifTextureView */
public class GifTextureView extends TextureView {

    /* renamed from: g */
    private static final ImageView.ScaleType[] f3616g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a */
    private ImageView.ScaleType f3617a = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: b */
    private final Matrix f3618b = new Matrix();

    /* renamed from: c */
    private AbstractC1498g f3619c;

    /* renamed from: d */
    private TextureView$SurfaceTextureListenerC1483c f3620d;

    /* renamed from: e */
    private float f3621e = 1.0f;

    /* renamed from: f */
    private C1495f.C1497b f3622f;

    /* access modifiers changed from: package-private */
    /* renamed from: pl.droidsonroids.gif.GifTextureView$a */
    public static /* synthetic */ class C1481a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3623a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = p069pl.droidsonroids.gif.GifTextureView.C1481a.f3623a     // Catch:{ NoSuchFieldError -> 0x0060 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p069pl.droidsonroids.gif.GifTextureView.C1481a.<clinit>():void");
        }
    }

    /* renamed from: pl.droidsonroids.gif.GifTextureView$b */
    public interface AbstractC1482b {
        /* renamed from: a */
        void mo12557a(Canvas canvas);
    }

    /* access modifiers changed from: private */
    /* renamed from: pl.droidsonroids.gif.GifTextureView$c */
    public static class TextureView$SurfaceTextureListenerC1483c extends Thread implements TextureView.SurfaceTextureListener {

        /* renamed from: a */
        final C1487b f3624a = new C1487b();

        /* renamed from: b */
        private GifInfoHandle f3625b = new GifInfoHandle();

        /* renamed from: c */
        private IOException f3626c;

        /* renamed from: d */
        long[] f3627d;

        /* renamed from: e */
        private final WeakReference<GifTextureView> f3628e;

        /* renamed from: pl.droidsonroids.gif.GifTextureView$c$a */
        class RunnableC1484a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ GifTextureView f3629a;

            RunnableC1484a(GifTextureView gifTextureView) {
                this.f3629a = gifTextureView;
            }

            public void run() {
                this.f3629a.m4153i(TextureView$SurfaceTextureListenerC1483c.this.f3625b);
            }
        }

        TextureView$SurfaceTextureListenerC1483c(GifTextureView gifTextureView) {
            super("GifRenderThread");
            this.f3628e = new WeakReference<>(gifTextureView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo12558c(GifTextureView gifTextureView, AbstractC1482b bVar) {
            this.f3624a.mo12573b();
            gifTextureView.setSuperSurfaceTextureListener(bVar != null ? new TextureView$SurfaceTextureListenerC1504j(bVar) : null);
            this.f3625b.mo12522q();
            interrupt();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            GifTextureView gifTextureView = this.f3628e.get();
            if (gifTextureView != null) {
                gifTextureView.m4153i(this.f3625b);
            }
            this.f3624a.mo12574c();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f3624a.mo12573b();
            this.f3625b.mo12522q();
            interrupt();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void run() {
            try {
                GifTextureView gifTextureView = this.f3628e.get();
                if (gifTextureView != null) {
                    GifInfoHandle a = gifTextureView.f3619c.mo12616a();
                    this.f3625b = a;
                    a.mo12531z(1, gifTextureView.isOpaque());
                    if (gifTextureView.f3622f.f3684b >= 0) {
                        this.f3625b.mo12530y(gifTextureView.f3622f.f3684b);
                    }
                    GifTextureView gifTextureView2 = this.f3628e.get();
                    if (gifTextureView2 == null) {
                        this.f3625b.mo12523r();
                        return;
                    }
                    gifTextureView2.setSuperSurfaceTextureListener(this);
                    boolean isAvailable = gifTextureView2.isAvailable();
                    this.f3624a.mo12575d(isAvailable);
                    if (isAvailable) {
                        gifTextureView2.post(new RunnableC1484a(gifTextureView2));
                    }
                    this.f3625b.mo12507A(gifTextureView2.f3621e);
                    while (!isInterrupted()) {
                        try {
                            this.f3624a.mo12572a();
                            GifTextureView gifTextureView3 = this.f3628e.get();
                            if (gifTextureView3 == null) {
                                break;
                            }
                            SurfaceTexture surfaceTexture = gifTextureView3.getSurfaceTexture();
                            if (surfaceTexture != null) {
                                Surface surface = new Surface(surfaceTexture);
                                try {
                                    this.f3625b.mo12508a(surface, this.f3627d);
                                } finally {
                                    surface.release();
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    this.f3625b.mo12523r();
                    this.f3625b = new GifInfoHandle();
                }
            } catch (IOException e) {
                this.f3626c = e;
            }
        }
    }

    public GifTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4152g(attributeSet, 0, 0);
    }

    public GifTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4152g(attributeSet, i, 0);
    }

    /* renamed from: f */
    private static AbstractC1498g m4151f(TypedArray typedArray) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(C1505k.f3693b, typedValue)) {
            return null;
        }
        if (typedValue.resourceId != 0) {
            String resourceTypeName = typedArray.getResources().getResourceTypeName(typedValue.resourceId);
            if (C1495f.f3680a.contains(resourceTypeName)) {
                return new AbstractC1498g.C1501c(typedArray.getResources(), typedValue.resourceId);
            }
            if (!"string".equals(resourceTypeName)) {
                throw new IllegalArgumentException("Expected string, drawable, mipmap or raw resource type. '" + resourceTypeName + "' is not supported");
            }
        }
        return new AbstractC1498g.C1500b(typedArray.getResources().getAssets(), typedValue.string.toString());
    }

    /* renamed from: g */
    private void m4152g(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f3616g;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f3617a = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1505k.f3692a, i, i2);
            this.f3619c = m4151f(obtainStyledAttributes);
            super.setOpaque(obtainStyledAttributes.getBoolean(C1505k.f3694c, false));
            obtainStyledAttributes.recycle();
            this.f3622f = new C1495f.C1497b(this, attributeSet, i, i2);
        } else {
            super.setOpaque(false);
            this.f3622f = new C1495f.C1497b();
        }
        if (!isInEditMode()) {
            TextureView$SurfaceTextureListenerC1483c cVar = new TextureView$SurfaceTextureListenerC1483c(this);
            this.f3620d = cVar;
            if (this.f3619c != null) {
                cVar.start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private void m4153i(GifInfoHandle gifInfoHandle) {
        Matrix.ScaleToFit scaleToFit;
        Matrix matrix = new Matrix();
        float width = (float) getWidth();
        float height = (float) getHeight();
        float l = ((float) gifInfoHandle.mo12519l()) / width;
        float f = ((float) gifInfoHandle.mo12513f()) / height;
        RectF rectF = new RectF(0.0f, 0.0f, (float) gifInfoHandle.mo12519l(), (float) gifInfoHandle.mo12513f());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        float f2 = 1.0f;
        switch (C1481a.f3623a[this.f3617a.ordinal()]) {
            case 1:
                matrix.setScale(l, f, width / 2.0f, height / 2.0f);
                break;
            case 2:
                f2 = 1.0f / Math.min(l, f);
                matrix.setScale(l * f2, f2 * f, width / 2.0f, height / 2.0f);
                break;
            case 3:
                if (((float) gifInfoHandle.mo12519l()) > width || ((float) gifInfoHandle.mo12513f()) > height) {
                    f2 = Math.min(1.0f / l, 1.0f / f);
                }
                matrix.setScale(l * f2, f2 * f, width / 2.0f, height / 2.0f);
                break;
            case 4:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                matrix.preScale(l, f);
                break;
            case 5:
                scaleToFit = Matrix.ScaleToFit.END;
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                matrix.preScale(l, f);
                break;
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                matrix.setRectToRect(rectF, rectF2, scaleToFit);
                matrix.preScale(l, f);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f3618b);
                matrix.preScale(l, f);
                break;
        }
        super.setTransform(matrix);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    public IOException getIOException() {
        return this.f3620d.f3626c != null ? this.f3620d.f3626c : GifIOException.m4112a(this.f3620d.f3625b.mo12516h());
    }

    public ImageView.ScaleType getScaleType() {
        return this.f3617a;
    }

    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f3618b);
        return matrix;
    }

    /* renamed from: h */
    public synchronized void mo12544h(AbstractC1498g gVar, AbstractC1482b bVar) {
        this.f3620d.mo12558c(this, bVar);
        try {
            this.f3620d.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f3619c = gVar;
        TextureView$SurfaceTextureListenerC1483c cVar = new TextureView$SurfaceTextureListenerC1483c(this);
        this.f3620d = cVar;
        if (gVar != null) {
            cVar.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f3620d.mo12558c(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        this.f3620d.f3627d = gifViewSavedState.f3631a[0];
    }

    public Parcelable onSaveInstanceState() {
        TextureView$SurfaceTextureListenerC1483c cVar = this.f3620d;
        cVar.f3627d = cVar.f3625b.mo12518k();
        return new GifViewSavedState(super.onSaveInstanceState(), this.f3622f.f3683a ? this.f3620d.f3627d : null);
    }

    public void setFreezesAnimation(boolean z) {
        this.f3622f.f3683a = z;
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public synchronized void setInputSource(AbstractC1498g gVar) {
        mo12544h(gVar, null);
    }

    public void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            setInputSource(this.f3619c);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f3617a = scaleType;
        m4153i(this.f3620d.f3625b);
    }

    public void setSpeed(float f) {
        this.f3621e = f;
        this.f3620d.f3625b.mo12507A(f);
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    public void setTransform(Matrix matrix) {
        this.f3618b.set(matrix);
        m4153i(this.f3620d.f3625b);
    }
}
