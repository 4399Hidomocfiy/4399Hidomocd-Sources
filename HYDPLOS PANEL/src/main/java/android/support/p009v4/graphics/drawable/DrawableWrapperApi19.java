package android.support.p009v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p009v4.graphics.drawable.DrawableWrapperApi14;

/* renamed from: android.support.v4.graphics.drawable.DrawableWrapperApi19 */
class DrawableWrapperApi19 extends DrawableWrapperApi14 {

    /* renamed from: android.support.v4.graphics.drawable.DrawableWrapperApi19$DrawableWrapperStateKitKat */
    private static class DrawableWrapperStateKitKat extends DrawableWrapperApi14.DrawableWrapperState {
        DrawableWrapperStateKitKat(DrawableWrapperApi14.DrawableWrapperState drawableWrapperState, Resources resources) {
            super(drawableWrapperState, resources);
        }

        @Override // android.support.p009v4.graphics.drawable.DrawableWrapperApi14.DrawableWrapperState
        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperApi19(this, resources);
        }
    }

    DrawableWrapperApi19(Drawable drawable) {
        super(drawable);
    }

    DrawableWrapperApi19(DrawableWrapperApi14.DrawableWrapperState drawableWrapperState, Resources resources) {
        super(drawableWrapperState, resources);
    }

    public boolean isAutoMirrored() {
        return this.mDrawable.isAutoMirrored();
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p009v4.graphics.drawable.DrawableWrapperApi14
    public DrawableWrapperApi14.DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateKitKat(this.mState, null);
    }

    public void setAutoMirrored(boolean z) {
        this.mDrawable.setAutoMirrored(z);
    }
}
