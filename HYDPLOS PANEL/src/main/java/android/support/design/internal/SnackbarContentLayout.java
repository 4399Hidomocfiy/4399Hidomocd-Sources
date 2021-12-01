package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0072R;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.p009v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements BaseTransientBottomBar.ContentViewCallback {
    private Button mActionView;
    private int mMaxInlineActionWidth;
    private int mMaxWidth;
    private TextView mMessageView;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0072R.styleable.SnackbarLayout);
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(C0072R.styleable.SnackbarLayout_android_maxWidth, -1);
        this.mMaxInlineActionWidth = obtainStyledAttributes.getDimensionPixelSize(C0072R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private static void updateTopBottomPadding(View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean updateViewsWithinLayout(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.mMessageView.getPaddingTop() == i2 && this.mMessageView.getPaddingBottom() == i3) {
            return z;
        }
        updateTopBottomPadding(this.mMessageView, i2, i3);
        return true;
    }

    @Override // android.support.design.widget.BaseTransientBottomBar.ContentViewCallback
    public void animateContentIn(int i, int i2) {
        this.mMessageView.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.mMessageView.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.mActionView.getVisibility() == 0) {
            this.mActionView.setAlpha(0.0f);
            this.mActionView.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // android.support.design.widget.BaseTransientBottomBar.ContentViewCallback
    public void animateContentOut(int i, int i2) {
        this.mMessageView.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.mMessageView.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.mActionView.getVisibility() == 0) {
            this.mActionView.setAlpha(1.0f);
            this.mActionView.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.mActionView;
    }

    public TextView getMessageView() {
        return this.mMessageView;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mMessageView = (TextView) findViewById(C0072R.C0074id.snackbar_text);
        this.mActionView = (Button) findViewById(C0072R.C0074id.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (updateViewsWithinLayout(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (updateViewsWithinLayout(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
