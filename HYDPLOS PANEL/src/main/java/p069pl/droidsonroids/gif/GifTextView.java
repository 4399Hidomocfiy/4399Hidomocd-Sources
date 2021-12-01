package p069pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.IOException;
import p069pl.droidsonroids.gif.C1495f;

/* renamed from: pl.droidsonroids.gif.GifTextView */
public class GifTextView extends TextView {

    /* renamed from: a */
    private C1495f.C1497b f3615a;

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4144c(attributeSet, 0, 0);
    }

    public GifTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4144c(attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m4142a() {
        if (this.f3615a.f3684b >= 0) {
            for (Drawable drawable : getCompoundDrawables()) {
                C1495f.m4184a(this.f3615a.f3684b, drawable);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                for (Drawable drawable2 : getCompoundDrawablesRelative()) {
                    C1495f.m4184a(this.f3615a.f3684b, drawable2);
                }
            }
            C1495f.m4184a(this.f3615a.f3684b, getBackground());
        }
    }

    /* renamed from: b */
    private Drawable m4143b(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && C1495f.f3680a.contains(resourceTypeName)) {
            try {
                return new C1488c(resources, i);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, getContext().getTheme()) : resources.getDrawable(i);
    }

    /* renamed from: c */
    private void m4144c(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            Drawable b = m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable b2 = m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable b3 = m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable b4 = m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable b5 = m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable b6 = m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (Build.VERSION.SDK_INT >= 17) {
                if (getLayoutDirection() == 0) {
                    if (b5 == null) {
                        b5 = b;
                    }
                    if (b6 == null) {
                        b6 = b3;
                    }
                } else {
                    if (b5 == null) {
                        b5 = b3;
                    }
                    if (b6 == null) {
                        b6 = b;
                    }
                }
                setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
            }
            setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            setBackgroundInternal(m4143b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            this.f3615a = new C1495f.C1497b(this, attributeSet, i, i2);
            m4142a();
        }
        this.f3615a = new C1495f.C1497b();
    }

    /* renamed from: d */
    private static void m4145d(Drawable[] drawableArr, boolean z) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z, false);
            }
        }
    }

    private void setBackgroundInternal(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    private void setCompoundDrawablesVisible(boolean z) {
        m4145d(getCompoundDrawables(), z);
        if (Build.VERSION.SDK_INT >= 17) {
            m4145d(getCompoundDrawablesRelative(), z);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        gifViewSavedState.mo12565a(compoundDrawables[0], 0);
        gifViewSavedState.mo12565a(compoundDrawables[1], 1);
        gifViewSavedState.mo12565a(compoundDrawables[2], 2);
        gifViewSavedState.mo12565a(compoundDrawables[3], 3);
        if (Build.VERSION.SDK_INT >= 17) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            gifViewSavedState.mo12565a(compoundDrawablesRelative[0], 4);
            gifViewSavedState.mo12565a(compoundDrawablesRelative[2], 5);
        }
        gifViewSavedState.mo12565a(getBackground(), 6);
    }

    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f3615a.f3683a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            if (Build.VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
                drawableArr[4] = compoundDrawablesRelative[0];
                drawableArr[5] = compoundDrawablesRelative[2];
            }
            drawableArr[6] = getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), drawableArr);
    }

    public void setBackgroundResource(int i) {
        setBackgroundInternal(m4143b(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(m4143b(i), m4143b(i2), m4143b(i3), m4143b(i4));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(m4143b(i), m4143b(i2), m4143b(i3), m4143b(i4));
    }

    public void setFreezesAnimation(boolean z) {
        this.f3615a.f3683a = z;
    }
}
