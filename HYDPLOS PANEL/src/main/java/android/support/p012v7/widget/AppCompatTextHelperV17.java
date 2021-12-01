package android.support.p012v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p012v7.appcompat.C0467R;
import android.util.AttributeSet;
import android.widget.TextView;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.AppCompatTextHelperV17 */
public class AppCompatTextHelperV17 extends AppCompatTextHelper {
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableStartTint;

    AppCompatTextHelperV17(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p012v7.widget.AppCompatTextHelper
    public void applyCompoundDrawablesTints() {
        super.applyCompoundDrawablesTints();
        if (this.mDrawableStartTint != null || this.mDrawableEndTint != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p012v7.widget.AppCompatTextHelper
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        super.loadFromAttributes(attributeSet, i);
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0467R.styleable.AppCompatTextHelper, i, 0);
        int i2 = C0467R.styleable.AppCompatTextHelper_android_drawableStart;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.mDrawableStartTint = AppCompatTextHelper.createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(i2, 0));
        }
        int i3 = C0467R.styleable.AppCompatTextHelper_android_drawableEnd;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mDrawableEndTint = AppCompatTextHelper.createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(i3, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
