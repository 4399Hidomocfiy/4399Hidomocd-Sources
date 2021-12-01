package android.support.p009v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.SwipeProgressBar */
final class SwipeProgressBar {
    private static final int ANIMATION_DURATION_MS = 2000;
    private static final int COLOR1 = -1291845632;
    private static final int COLOR2 = Integer.MIN_VALUE;
    private static final int COLOR3 = 1291845632;
    private static final int COLOR4 = 436207616;
    private static final int FINISH_ANIMATION_DURATION_MS = 1000;
    private static final Interpolator INTERPOLATOR = new FastOutSlowInInterpolator();
    private Rect mBounds = new Rect();
    private final RectF mClipRect = new RectF();
    private int mColor1;
    private int mColor2;
    private int mColor3;
    private int mColor4;
    private long mFinishTime;
    private final Paint mPaint = new Paint();
    private View mParent;
    private boolean mRunning;
    private long mStartTime;
    private float mTriggerPercentage;

    SwipeProgressBar(View view) {
        this.mParent = view;
        this.mColor1 = COLOR1;
        this.mColor2 = Integer.MIN_VALUE;
        this.mColor3 = COLOR3;
        this.mColor4 = COLOR4;
    }

    private void drawCircle(Canvas canvas, float f, float f2, int i, float f3) {
        this.mPaint.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = INTERPOLATOR.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.mPaint);
        canvas.restore();
    }

    private void drawTrigger(Canvas canvas, int i, int i2) {
        this.mPaint.setColor(this.mColor1);
        float f = (float) i;
        canvas.drawCircle(f, (float) i2, this.mTriggerPercentage * f, this.mPaint);
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas) {
        int i;
        int width = this.mBounds.width();
        int height = this.mBounds.height();
        int i2 = width / 2;
        int i3 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.mBounds);
        if (this.mRunning || this.mFinishTime > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = this.mStartTime;
            long j2 = (currentAnimationTimeMillis - j) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - j) % 2000)) / 20.0f;
            boolean z = false;
            if (!this.mRunning) {
                long j3 = this.mFinishTime;
                if (currentAnimationTimeMillis - j3 >= 1000) {
                    this.mFinishTime = 0;
                    return;
                }
                float f2 = (float) i2;
                float interpolation = INTERPOLATOR.getInterpolation((((float) ((currentAnimationTimeMillis - j3) % 1000)) / 10.0f) / 100.0f) * f2;
                this.mClipRect.set(f2 - interpolation, 0.0f, f2 + interpolation, (float) height);
                canvas.saveLayerAlpha(this.mClipRect, 0, 0);
                z = true;
            }
            if (j2 != 0) {
                if (f >= 0.0f && f < 25.0f) {
                    i = this.mColor4;
                    canvas.drawColor(i);
                    drawCircle(canvas, (float) i2, (float) i3, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
                    drawCircle(canvas, (float) i2, (float) i3, this.mColor2, (f * 2.0f) / 100.0f);
                    drawCircle(canvas, (float) i2, (float) i3, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
                    drawCircle(canvas, (float) i2, (float) i3, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
                    drawCircle(canvas, (float) i2, (float) i3, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
                    canvas.restoreToCount(save);
                    int save2 = canvas.save();
                    canvas.clipRect(this.mBounds);
                    drawTrigger(canvas, i2, i3);
                    save = save2;
                    View view = this.mParent;
                    Rect rect = this.mBounds;
                    ViewCompat.postInvalidateOnAnimation(view, rect.left, rect.top, rect.right, rect.bottom);
                } else if (f < 25.0f || f >= 50.0f) {
                    i = (f < 50.0f || f >= 75.0f) ? this.mColor3 : this.mColor2;
                    canvas.drawColor(i);
                    if (f >= 0.0f && f <= 25.0f) {
                        drawCircle(canvas, (float) i2, (float) i3, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
                    }
                    if (f >= 0.0f && f <= 50.0f) {
                        drawCircle(canvas, (float) i2, (float) i3, this.mColor2, (f * 2.0f) / 100.0f);
                    }
                    if (f >= 25.0f && f <= 75.0f) {
                        drawCircle(canvas, (float) i2, (float) i3, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
                    }
                    if (f >= 50.0f && f <= 100.0f) {
                        drawCircle(canvas, (float) i2, (float) i3, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
                    }
                    if (f >= 75.0f && f <= 100.0f) {
                        drawCircle(canvas, (float) i2, (float) i3, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
                    }
                    if (this.mTriggerPercentage > 0.0f && z) {
                        canvas.restoreToCount(save);
                        int save22 = canvas.save();
                        canvas.clipRect(this.mBounds);
                        drawTrigger(canvas, i2, i3);
                        save = save22;
                    }
                    View view2 = this.mParent;
                    Rect rect2 = this.mBounds;
                    ViewCompat.postInvalidateOnAnimation(view2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
            }
            i = this.mColor1;
            canvas.drawColor(i);
            drawCircle(canvas, (float) i2, (float) i3, this.mColor1, ((f + 25.0f) * 2.0f) / 100.0f);
            drawCircle(canvas, (float) i2, (float) i3, this.mColor2, (f * 2.0f) / 100.0f);
            drawCircle(canvas, (float) i2, (float) i3, this.mColor3, ((f - 25.0f) * 2.0f) / 100.0f);
            drawCircle(canvas, (float) i2, (float) i3, this.mColor4, ((f - 50.0f) * 2.0f) / 100.0f);
            drawCircle(canvas, (float) i2, (float) i3, this.mColor1, ((f - 75.0f) * 2.0f) / 100.0f);
            canvas.restoreToCount(save);
            int save222 = canvas.save();
            canvas.clipRect(this.mBounds);
            drawTrigger(canvas, i2, i3);
            save = save222;
            View view22 = this.mParent;
            Rect rect22 = this.mBounds;
            ViewCompat.postInvalidateOnAnimation(view22, rect22.left, rect22.top, rect22.right, rect22.bottom);
        } else {
            float f3 = this.mTriggerPercentage;
            if (f3 > 0.0f && ((double) f3) <= 1.0d) {
                drawTrigger(canvas, i2, i3);
            }
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: package-private */
    public boolean isRunning() {
        return this.mRunning || this.mFinishTime > 0;
    }

    /* access modifiers changed from: package-private */
    public void setBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.mBounds;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
    }

    /* access modifiers changed from: package-private */
    public void setColorScheme(int i, int i2, int i3, int i4) {
        this.mColor1 = i;
        this.mColor2 = i2;
        this.mColor3 = i3;
        this.mColor4 = i4;
    }

    /* access modifiers changed from: package-private */
    public void setTriggerPercentage(float f) {
        this.mTriggerPercentage = f;
        this.mStartTime = 0;
        View view = this.mParent;
        Rect rect = this.mBounds;
        ViewCompat.postInvalidateOnAnimation(view, rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void start() {
        if (!this.mRunning) {
            this.mTriggerPercentage = 0.0f;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mRunning = true;
            this.mParent.postInvalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        if (this.mRunning) {
            this.mTriggerPercentage = 0.0f;
            this.mFinishTime = AnimationUtils.currentAnimationTimeMillis();
            this.mRunning = false;
            this.mParent.postInvalidate();
        }
    }
}
