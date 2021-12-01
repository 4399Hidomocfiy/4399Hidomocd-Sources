package android.support.p012v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p009v4.widget.PopupWindowCompat;
import android.support.p012v7.appcompat.C0467R;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.AppCompatPopupWindow */
public class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = (Build.VERSION.SDK_INT < 21);
    private static final String TAG = "AppCompatPopupWindow";
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0467R.styleable.PopupWindow, i, i2);
        int i3 = C0467R.styleable.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            setSupportOverlapAnchor(obtainStyledAttributes.getBoolean(i3, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(C0467R.styleable.PopupWindow_android_popupBackground));
        int i4 = Build.VERSION.SDK_INT;
        if (i2 != 0 && i4 < 11) {
            int i5 = C0467R.styleable.PopupWindow_android_popupAnimationStyle;
            if (obtainStyledAttributes.hasValue(i5)) {
                setAnimationStyle(obtainStyledAttributes.getResourceId(i5, -1));
            }
        }
        obtainStyledAttributes.recycle();
        if (i4 < 14) {
            wrapOnScrollChangedListener(this);
        }
    }

    private static void wrapOnScrollChangedListener(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() {
                /* class android.support.p012v7.widget.AppCompatPopupWindow.ViewTreeObserver$OnScrollChangedListenerC05031 */

                public void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference == null) {
                            return;
                        }
                        if (weakReference.get() != null) {
                            onScrollChangedListener.onScrollChanged();
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            });
        } catch (Exception e) {
            Log.d(TAG, "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    public boolean getSupportOverlapAnchor() {
        return COMPAT_OVERLAP_ANCHOR ? this.mOverlapAnchor : PopupWindowCompat.getOverlapAnchor(this);
    }

    public void setSupportOverlapAnchor(boolean z) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
