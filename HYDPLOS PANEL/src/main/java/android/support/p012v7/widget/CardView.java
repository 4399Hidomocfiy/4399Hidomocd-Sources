package android.support.p012v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p012v7.cardview.C0470R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final CardViewImpl IMPL;
    private final CardViewDelegate mCardViewDelegate = new CardViewDelegate() {
        /* class android.support.p012v7.widget.CardView.C05081 */
        private Drawable mCardBackground;

        @Override // android.support.p012v7.widget.CardViewDelegate
        public Drawable getCardBackground() {
            return this.mCardBackground;
        }

        @Override // android.support.p012v7.widget.CardViewDelegate
        public View getCardView() {
            return CardView.this;
        }

        @Override // android.support.p012v7.widget.CardViewDelegate
        public boolean getPreventCornerOverlap() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // android.support.p012v7.widget.CardViewDelegate
        public boolean getUseCompatPadding() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // android.support.p012v7.widget.CardViewDelegate
        public void setCardBackground(Drawable drawable) {
            this.mCardBackground = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // android.support.p012v7.widget.CardViewDelegate
        public void setMinWidthHeightInternal(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.mUserSetMinWidth) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.mUserSetMinHeight) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // android.support.p012v7.widget.CardViewDelegate
        public void setShadowPadding(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    };
    private boolean mCompatPadding;
    final Rect mContentPadding = new Rect();
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds = new Rect();
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    static {
        int i = Build.VERSION.SDK_INT;
        IMPL = i >= 21 ? new CardViewApi21Impl() : i >= 17 ? new CardViewApi17Impl() : new CardViewBaseImpl();
        IMPL.initStatic();
    }

    public CardView(Context context) {
        super(context);
        initialize(context, null, 0);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet, 0);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet, i);
    }

    private void initialize(Context context, AttributeSet attributeSet, int i) {
        Resources resources;
        int i2;
        ColorStateList valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0470R.styleable.CardView, i, C0470R.style.CardView);
        int i3 = C0470R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = C0470R.color.cardview_light_background;
            } else {
                resources = getResources();
                i2 = C0470R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        float dimension = obtainStyledAttributes.getDimension(C0470R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0470R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C0470R.styleable.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(C0470R.styleable.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(C0470R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_contentPadding, 0);
        this.mContentPadding.left = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        this.mContentPadding.top = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        this.mContentPadding.right = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        this.mContentPadding.bottom = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(C0470R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        IMPL.initialize(this.mCardViewDelegate, context, valueOf, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.getBackgroundColor(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.getElevation(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.getRadius(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        CardViewImpl cardViewImpl = IMPL;
        if (!(cardViewImpl instanceof CardViewApi21Impl)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cardViewImpl.getMinWidth(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cardViewImpl.getMinHeight(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, colorStateList);
    }

    public void setCardElevation(float f) {
        IMPL.setElevation(this.mCardViewDelegate, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.updatePadding(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.setMaxElevation(this.mCardViewDelegate, f);
    }

    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.setRadius(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }
}
