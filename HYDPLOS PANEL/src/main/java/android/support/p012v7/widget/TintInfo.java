package android.support.p012v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.TintInfo */
public class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode;

    TintInfo() {
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.mTintList = null;
        this.mHasTintList = false;
        this.mTintMode = null;
        this.mHasTintMode = false;
    }
}
