package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.p009v4.graphics.ColorUtils;

class CircularBorderDrawable extends Drawable {
    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333f;
    private ColorStateList mBorderTint;
    float mBorderWidth;
    private int mBottomInnerStrokeColor;
    private int mBottomOuterStrokeColor;
    private int mCurrentBorderTintColor;
    private boolean mInvalidateShader = true;
    final Paint mPaint;
    final Rect mRect = new Rect();
    final RectF mRectF = new RectF();
    private float mRotation;
    private int mTopInnerStrokeColor;
    private int mTopOuterStrokeColor;

    public CircularBorderDrawable() {
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader createGradientShader() {
        Rect rect = this.mRect;
        copyBounds(rect);
        float height = this.mBorderWidth / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{ColorUtils.compositeColors(this.mTopOuterStrokeColor, this.mCurrentBorderTintColor), ColorUtils.compositeColors(this.mTopInnerStrokeColor, this.mCurrentBorderTintColor), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.mTopInnerStrokeColor, 0), this.mCurrentBorderTintColor), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.mBottomInnerStrokeColor, 0), this.mCurrentBorderTintColor), ColorUtils.compositeColors(this.mBottomInnerStrokeColor, this.mCurrentBorderTintColor), ColorUtils.compositeColors(this.mBottomOuterStrokeColor, this.mCurrentBorderTintColor)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void draw(Canvas canvas) {
        if (this.mInvalidateShader) {
            this.mPaint.setShader(createGradientShader());
            this.mInvalidateShader = false;
        }
        float strokeWidth = this.mPaint.getStrokeWidth() / 2.0f;
        RectF rectF = this.mRectF;
        copyBounds(this.mRect);
        rectF.set(this.mRect);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.mRotation, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.mPaint);
        canvas.restore();
    }

    public int getOpacity() {
        return this.mBorderWidth > 0.0f ? -3 : -2;
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.mBorderWidth);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.mBorderTint;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.mInvalidateShader = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.mBorderTint;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.mCurrentBorderTintColor)) == this.mCurrentBorderTintColor)) {
            this.mInvalidateShader = true;
            this.mCurrentBorderTintColor = colorForState;
        }
        if (this.mInvalidateShader) {
            invalidateSelf();
        }
        return this.mInvalidateShader;
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void setBorderTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.mCurrentBorderTintColor = colorStateList.getColorForState(getState(), this.mCurrentBorderTintColor);
        }
        this.mBorderTint = colorStateList;
        this.mInvalidateShader = true;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void setBorderWidth(float f) {
        if (this.mBorderWidth != f) {
            this.mBorderWidth = f;
            this.mPaint.setStrokeWidth(f * DRAW_STROKE_WIDTH_MULTIPLE);
            this.mInvalidateShader = true;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void setGradientColors(int i, int i2, int i3, int i4) {
        this.mTopOuterStrokeColor = i;
        this.mTopInnerStrokeColor = i2;
        this.mBottomOuterStrokeColor = i3;
        this.mBottomInnerStrokeColor = i4;
    }

    /* access modifiers changed from: package-private */
    public final void setRotation(float f) {
        if (f != this.mRotation) {
            this.mRotation = f;
            invalidateSelf();
        }
    }
}
