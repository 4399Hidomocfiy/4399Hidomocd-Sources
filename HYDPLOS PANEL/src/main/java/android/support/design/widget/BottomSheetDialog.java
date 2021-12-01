package android.support.design.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.design.C0072R;
import android.support.design.widget.BottomSheetBehavior;
import android.support.p009v4.view.AccessibilityDelegateCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.p012v7.app.AppCompatDialog;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

public class BottomSheetDialog extends AppCompatDialog {
    private BottomSheetBehavior<FrameLayout> mBehavior;
    private BottomSheetBehavior.BottomSheetCallback mBottomSheetCallback;
    boolean mCancelable;
    private boolean mCanceledOnTouchOutside;
    private boolean mCanceledOnTouchOutsideSet;

    public BottomSheetDialog(Context context) {
        this(context, 0);
    }

    public BottomSheetDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = true;
        this.mBottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {
            /* class android.support.design.widget.BottomSheetDialog.C01064 */

            @Override // android.support.design.widget.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }

            @Override // android.support.design.widget.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i) {
                if (i == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
    }

    protected BottomSheetDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mCancelable = true;
        this.mCanceledOnTouchOutside = true;
        this.mBottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {
            /* class android.support.design.widget.BottomSheetDialog.C01064 */

            @Override // android.support.design.widget.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }

            @Override // android.support.design.widget.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i) {
                if (i == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
        this.mCancelable = z;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C0072R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C0072R.style.Theme_Design_Light_BottomSheetDialog;
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0072R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0072R.C0074id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(C0072R.C0074id.design_bottom_sheet);
        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
        this.mBehavior = from;
        from.setBottomSheetCallback(this.mBottomSheetCallback);
        this.mBehavior.setHideable(this.mCancelable);
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0072R.C0074id.touch_outside).setOnClickListener(new View.OnClickListener() {
            /* class android.support.design.widget.BottomSheetDialog.View$OnClickListenerC01031 */

            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.mCancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout2, new AccessibilityDelegateCompat() {
            /* class android.support.design.widget.BottomSheetDialog.C01042 */

            @Override // android.support.p009v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (BottomSheetDialog.this.mCancelable) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompat.setDismissable(z);
            }

            @Override // android.support.p009v4.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (i == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.mCancelable) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            }
        });
        frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            /* class android.support.design.widget.BottomSheetDialog.View$OnTouchListenerC01053 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatDialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.mBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.mCancelable != z) {
            this.mCancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.mBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.mCancelable) {
            this.mCancelable = true;
        }
        this.mCanceledOnTouchOutside = z;
        this.mCanceledOnTouchOutsideSet = true;
    }

    @Override // android.support.p012v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    @Override // android.support.p012v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // android.support.p012v7.app.AppCompatDialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    /* access modifiers changed from: package-private */
    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.mCanceledOnTouchOutsideSet) {
            if (Build.VERSION.SDK_INT < 11) {
                this.mCanceledOnTouchOutside = true;
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
                this.mCanceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            this.mCanceledOnTouchOutsideSet = true;
        }
        return this.mCanceledOnTouchOutside;
    }
}
