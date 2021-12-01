package android.support.p012v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.p012v7.widget.RoundRectDrawableWithShadow;

/* renamed from: android.support.v7.widget.CardViewApi17Impl */
class CardViewApi17Impl extends CardViewBaseImpl {
    CardViewApi17Impl() {
    }

    @Override // android.support.p012v7.widget.CardViewImpl, android.support.p012v7.widget.CardViewBaseImpl
    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {
            /* class android.support.p012v7.widget.CardViewApi17Impl.C05091 */

            @Override // android.support.p012v7.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
