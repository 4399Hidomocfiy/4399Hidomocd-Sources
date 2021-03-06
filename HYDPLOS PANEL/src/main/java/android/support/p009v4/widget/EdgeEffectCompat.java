package android.support.p009v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.EdgeEffectCompat */
public final class EdgeEffectCompat {
    private static final EdgeEffectBaseImpl IMPL = (Build.VERSION.SDK_INT >= 21 ? new EdgeEffectApi21Impl() : new EdgeEffectBaseImpl());
    private EdgeEffect mEdgeEffect;

    /* renamed from: android.support.v4.widget.EdgeEffectCompat$EdgeEffectApi21Impl */
    static class EdgeEffectApi21Impl extends EdgeEffectBaseImpl {
        EdgeEffectApi21Impl() {
        }

        @Override // android.support.p009v4.widget.EdgeEffectCompat.EdgeEffectBaseImpl
        public void onPull(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.EdgeEffectCompat$EdgeEffectBaseImpl */
    public static class EdgeEffectBaseImpl {
        EdgeEffectBaseImpl() {
        }

        public void onPull(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    public static void onPull(EdgeEffect edgeEffect, float f, float f2) {
        IMPL.onPull(edgeEffect, f, f2);
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.mEdgeEffect.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i) {
        this.mEdgeEffect.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean onPull(float f) {
        this.mEdgeEffect.onPull(f);
        return true;
    }

    @Deprecated
    public boolean onPull(float f, float f2) {
        IMPL.onPull(this.mEdgeEffect, f, f2);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public void setSize(int i, int i2) {
        this.mEdgeEffect.setSize(i, i2);
    }
}
