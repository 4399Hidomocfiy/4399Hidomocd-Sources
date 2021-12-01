package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.p009v4.math.MathUtils;
import android.support.p009v4.text.TextDirectionHeuristicsCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;

final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final boolean USE_SCALING_TEXTURE = (Build.VERSION.SDK_INT < 18);
    private boolean mBoundsChanged;
    private final Rect mCollapsedBounds;
    private float mCollapsedDrawX;
    private float mCollapsedDrawY;
    private int mCollapsedShadowColor;
    private float mCollapsedShadowDx;
    private float mCollapsedShadowDy;
    private float mCollapsedShadowRadius;
    private ColorStateList mCollapsedTextColor;
    private int mCollapsedTextGravity = 16;
    private float mCollapsedTextSize = 15.0f;
    private Typeface mCollapsedTypeface;
    private final RectF mCurrentBounds;
    private float mCurrentDrawX;
    private float mCurrentDrawY;
    private float mCurrentTextSize;
    private Typeface mCurrentTypeface;
    private boolean mDrawTitle;
    private final Rect mExpandedBounds;
    private float mExpandedDrawX;
    private float mExpandedDrawY;
    private float mExpandedFraction;
    private int mExpandedShadowColor;
    private float mExpandedShadowDx;
    private float mExpandedShadowDy;
    private float mExpandedShadowRadius;
    private ColorStateList mExpandedTextColor;
    private int mExpandedTextGravity = 16;
    private float mExpandedTextSize = 15.0f;
    private Bitmap mExpandedTitleTexture;
    private Typeface mExpandedTypeface;
    private boolean mIsRtl;
    private Interpolator mPositionInterpolator;
    private float mScale;
    private int[] mState;
    private CharSequence mText;
    private final TextPaint mTextPaint;
    private Interpolator mTextSizeInterpolator;
    private CharSequence mTextToDraw;
    private float mTextureAscent;
    private float mTextureDescent;
    private Paint mTexturePaint;
    private boolean mUseTexture;
    private final View mView;

    static {
        Paint paint = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public CollapsingTextHelper(View view) {
        this.mView = view;
        this.mTextPaint = new TextPaint(129);
        this.mCollapsedBounds = new Rect();
        this.mExpandedBounds = new Rect();
        this.mCurrentBounds = new RectF();
    }

    private boolean areTypefacesDifferent(Typeface typeface, Typeface typeface2) {
        return (typeface != null && !typeface.equals(typeface2)) || (typeface == null && typeface2 != null);
    }

    private static int blendColors(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void calculateBaseOffsets() {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingTextHelper.calculateBaseOffsets():void");
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.mExpandedFraction);
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
        boolean z = true;
        if (ViewCompat.getLayoutDirection(this.mView) != 1) {
            z = false;
        }
        return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private void calculateOffsets(float f) {
        int i;
        TextPaint textPaint;
        interpolateBounds(f);
        this.mCurrentDrawX = lerp(this.mExpandedDrawX, this.mCollapsedDrawX, f, this.mPositionInterpolator);
        this.mCurrentDrawY = lerp(this.mExpandedDrawY, this.mCollapsedDrawY, f, this.mPositionInterpolator);
        setInterpolatedTextSize(lerp(this.mExpandedTextSize, this.mCollapsedTextSize, f, this.mTextSizeInterpolator));
        if (this.mCollapsedTextColor != this.mExpandedTextColor) {
            textPaint = this.mTextPaint;
            i = blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f);
        } else {
            textPaint = this.mTextPaint;
            i = getCurrentCollapsedTextColor();
        }
        textPaint.setColor(i);
        this.mTextPaint.setShadowLayer(lerp(this.mExpandedShadowRadius, this.mCollapsedShadowRadius, f, null), lerp(this.mExpandedShadowDx, this.mCollapsedShadowDx, f, null), lerp(this.mExpandedShadowDy, this.mCollapsedShadowDy, f, null), blendColors(this.mExpandedShadowColor, this.mCollapsedShadowColor, f));
        ViewCompat.postInvalidateOnAnimation(this.mView);
    }

    private void calculateUsingTextSize(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.mText != null) {
            float width = (float) this.mCollapsedBounds.width();
            float width2 = (float) this.mExpandedBounds.width();
            boolean z3 = true;
            if (isClose(f, this.mCollapsedTextSize)) {
                f2 = this.mCollapsedTextSize;
                this.mScale = 1.0f;
                if (areTypefacesDifferent(this.mCurrentTypeface, this.mCollapsedTypeface)) {
                    this.mCurrentTypeface = this.mCollapsedTypeface;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.mExpandedTextSize;
                if (areTypefacesDifferent(this.mCurrentTypeface, this.mExpandedTypeface)) {
                    this.mCurrentTypeface = this.mExpandedTypeface;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (isClose(f, this.mExpandedTextSize)) {
                    this.mScale = 1.0f;
                } else {
                    this.mScale = f / this.mExpandedTextSize;
                }
                float f4 = this.mCollapsedTextSize / this.mExpandedTextSize;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.mCurrentTextSize != f2 || this.mBoundsChanged || z;
                this.mCurrentTextSize = f2;
                this.mBoundsChanged = false;
            }
            if (this.mTextToDraw == null || z) {
                this.mTextPaint.setTextSize(this.mCurrentTextSize);
                this.mTextPaint.setTypeface(this.mCurrentTypeface);
                TextPaint textPaint = this.mTextPaint;
                if (this.mScale == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.mText, this.mTextPaint, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.mTextToDraw)) {
                    this.mTextToDraw = ellipsize;
                    this.mIsRtl = calculateIsRtl(ellipsize);
                }
            }
        }
    }

    private void clearTexture() {
        Bitmap bitmap = this.mExpandedTitleTexture;
        if (bitmap != null) {
            bitmap.recycle();
            this.mExpandedTitleTexture = null;
        }
    }

    private void ensureExpandedTexture() {
        if (this.mExpandedTitleTexture == null && !this.mExpandedBounds.isEmpty() && !TextUtils.isEmpty(this.mTextToDraw)) {
            calculateOffsets(0.0f);
            this.mTextureAscent = this.mTextPaint.ascent();
            this.mTextureDescent = this.mTextPaint.descent();
            TextPaint textPaint = this.mTextPaint;
            CharSequence charSequence = this.mTextToDraw;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.mTextureDescent - this.mTextureAscent);
            if (round > 0 && round2 > 0) {
                this.mExpandedTitleTexture = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.mExpandedTitleTexture);
                CharSequence charSequence2 = this.mTextToDraw;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.mTextPaint.descent(), this.mTextPaint);
                if (this.mTexturePaint == null) {
                    this.mTexturePaint = new Paint(3);
                }
            }
        }
    }

    private int getCurrentCollapsedTextColor() {
        int[] iArr = this.mState;
        return iArr != null ? this.mCollapsedTextColor.getColorForState(iArr, 0) : this.mCollapsedTextColor.getDefaultColor();
    }

    private int getCurrentExpandedTextColor() {
        int[] iArr = this.mState;
        return iArr != null ? this.mExpandedTextColor.getColorForState(iArr, 0) : this.mExpandedTextColor.getDefaultColor();
    }

    private void interpolateBounds(float f) {
        this.mCurrentBounds.left = lerp((float) this.mExpandedBounds.left, (float) this.mCollapsedBounds.left, f, this.mPositionInterpolator);
        this.mCurrentBounds.top = lerp(this.mExpandedDrawY, this.mCollapsedDrawY, f, this.mPositionInterpolator);
        this.mCurrentBounds.right = lerp((float) this.mExpandedBounds.right, (float) this.mCollapsedBounds.right, f, this.mPositionInterpolator);
        this.mCurrentBounds.bottom = lerp((float) this.mExpandedBounds.bottom, (float) this.mCollapsedBounds.bottom, f, this.mPositionInterpolator);
    }

    private static boolean isClose(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    private static float lerp(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    private Typeface readFontFamilyTypeface(int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void setInterpolatedTextSize(float f) {
        calculateUsingTextSize(f);
        boolean z = USE_SCALING_TEXTURE && this.mScale != 1.0f;
        this.mUseTexture = z;
        if (z) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.mView);
    }

    public void draw(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.mTextToDraw != null && this.mDrawTitle) {
            float f2 = this.mCurrentDrawX;
            float f3 = this.mCurrentDrawY;
            boolean z = this.mUseTexture && this.mExpandedTitleTexture != null;
            if (z) {
                f = this.mTextureAscent * this.mScale;
            } else {
                f = this.mTextPaint.ascent() * this.mScale;
                this.mTextPaint.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = this.mScale;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (z) {
                canvas.drawBitmap(this.mExpandedTitleTexture, f2, f3, this.mTexturePaint);
            } else {
                CharSequence charSequence = this.mTextToDraw;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f3, this.mTextPaint);
            }
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList getCollapsedTextColor() {
        return this.mCollapsedTextColor;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedTextGravity() {
        return this.mCollapsedTextGravity;
    }

    /* access modifiers changed from: package-private */
    public float getCollapsedTextSize() {
        return this.mCollapsedTextSize;
    }

    /* access modifiers changed from: package-private */
    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.mCollapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList getExpandedTextColor() {
        return this.mExpandedTextColor;
    }

    /* access modifiers changed from: package-private */
    public int getExpandedTextGravity() {
        return this.mExpandedTextGravity;
    }

    /* access modifiers changed from: package-private */
    public float getExpandedTextSize() {
        return this.mExpandedTextSize;
    }

    /* access modifiers changed from: package-private */
    public Typeface getExpandedTypeface() {
        Typeface typeface = this.mExpandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    public float getExpansionFraction() {
        return this.mExpandedFraction;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getText() {
        return this.mText;
    }

    /* access modifiers changed from: package-private */
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.mCollapsedTextColor;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.mExpandedTextColor) != null && colorStateList.isStateful());
    }

    /* access modifiers changed from: package-private */
    public void onBoundsChanged() {
        this.mDrawTitle = this.mCollapsedBounds.width() > 0 && this.mCollapsedBounds.height() > 0 && this.mExpandedBounds.width() > 0 && this.mExpandedBounds.height() > 0;
    }

    public void recalculate() {
        if (this.mView.getHeight() > 0 && this.mView.getWidth() > 0) {
            calculateBaseOffsets();
            calculateCurrentOffsets();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.mCollapsedBounds, i, i2, i3, i4)) {
            this.mCollapsedBounds.set(i, i2, i3, i4);
            this.mBoundsChanged = true;
            onBoundsChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCollapsedTextAppearance(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), i, C0467R.styleable.TextAppearance);
        int i2 = C0467R.styleable.TextAppearance_android_textColor;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.mCollapsedTextColor = obtainStyledAttributes.getColorStateList(i2);
        }
        int i3 = C0467R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mCollapsedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(i3, (int) this.mCollapsedTextSize);
        }
        this.mCollapsedShadowColor = obtainStyledAttributes.getInt(C0467R.styleable.TextAppearance_android_shadowColor, 0);
        this.mCollapsedShadowDx = obtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.mCollapsedShadowDy = obtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.mCollapsedShadowRadius = obtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.mCollapsedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    /* access modifiers changed from: package-private */
    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.mCollapsedTextColor != colorStateList) {
            this.mCollapsedTextColor = colorStateList;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCollapsedTextGravity(int i) {
        if (this.mCollapsedTextGravity != i) {
            this.mCollapsedTextGravity = i;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCollapsedTextSize(float f) {
        if (this.mCollapsedTextSize != f) {
            this.mCollapsedTextSize = f;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setCollapsedTypeface(Typeface typeface) {
        if (areTypefacesDifferent(this.mCollapsedTypeface, typeface)) {
            this.mCollapsedTypeface = typeface;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.mExpandedBounds, i, i2, i3, i4)) {
            this.mExpandedBounds.set(i, i2, i3, i4);
            this.mBoundsChanged = true;
            onBoundsChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public void setExpandedTextAppearance(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), i, C0467R.styleable.TextAppearance);
        int i2 = C0467R.styleable.TextAppearance_android_textColor;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.mExpandedTextColor = obtainStyledAttributes.getColorStateList(i2);
        }
        int i3 = C0467R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mExpandedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(i3, (int) this.mExpandedTextSize);
        }
        this.mExpandedShadowColor = obtainStyledAttributes.getInt(C0467R.styleable.TextAppearance_android_shadowColor, 0);
        this.mExpandedShadowDx = obtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.mExpandedShadowDy = obtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.mExpandedShadowRadius = obtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.mExpandedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    /* access modifiers changed from: package-private */
    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.mExpandedTextColor != colorStateList) {
            this.mExpandedTextColor = colorStateList;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setExpandedTextGravity(int i) {
        if (this.mExpandedTextGravity != i) {
            this.mExpandedTextGravity = i;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setExpandedTextSize(float f) {
        if (this.mExpandedTextSize != f) {
            this.mExpandedTextSize = f;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setExpandedTypeface(Typeface typeface) {
        if (areTypefacesDifferent(this.mExpandedTypeface, typeface)) {
            this.mExpandedTypeface = typeface;
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setExpansionFraction(float f) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        if (clamp != this.mExpandedFraction) {
            this.mExpandedFraction = clamp;
            calculateCurrentOffsets();
        }
    }

    /* access modifiers changed from: package-private */
    public void setPositionInterpolator(Interpolator interpolator) {
        this.mPositionInterpolator = interpolator;
        recalculate();
    }

    /* access modifiers changed from: package-private */
    public final boolean setState(int[] iArr) {
        this.mState = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setText(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.mText)) {
            this.mText = charSequence;
            this.mTextToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    /* access modifiers changed from: package-private */
    public void setTextSizeInterpolator(Interpolator interpolator) {
        this.mTextSizeInterpolator = interpolator;
        recalculate();
    }

    /* access modifiers changed from: package-private */
    public void setTypefaces(Typeface typeface) {
        this.mExpandedTypeface = typeface;
        this.mCollapsedTypeface = typeface;
        recalculate();
    }
}
