package android.support.design.widget;

import android.content.Context;
import android.support.p009v4.view.AccessibilityDelegateCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = {16842912};
    private boolean mChecked;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0467R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() {
            /* class android.support.design.widget.CheckableImageButton.C01071 */

            @Override // android.support.p009v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // android.support.p009v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(true);
                accessibilityNodeInfoCompat.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.mChecked) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = DRAWABLE_STATE_CHECKED;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void setChecked(boolean z) {
        if (this.mChecked != z) {
            this.mChecked = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.mChecked);
    }
}
