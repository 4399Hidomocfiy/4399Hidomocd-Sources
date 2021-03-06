package android.support.p009v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: android.support.v4.widget.TintableImageSourceView */
public interface TintableImageSourceView {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
