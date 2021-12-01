package p069pl.droidsonroids.gif;

import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import p069pl.droidsonroids.gif.GifTextureView;

/* renamed from: pl.droidsonroids.gif.j */
class TextureView$SurfaceTextureListenerC1504j implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    private final GifTextureView.AbstractC1482b f3691a;

    TextureView$SurfaceTextureListenerC1504j(GifTextureView.AbstractC1482b bVar) {
        this.f3691a = bVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        Canvas lockCanvas = surface.lockCanvas(null);
        this.f3691a.mo12557a(lockCanvas);
        surface.unlockCanvasAndPost(lockCanvas);
        surface.release();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
