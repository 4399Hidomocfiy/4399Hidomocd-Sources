package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0072R;
import android.support.p009v4.content.ContextCompat;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.AccessibilityDelegateCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.p009v4.widget.Space;
import android.support.p009v4.widget.TextViewCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.content.res.AppCompatResources;
import android.support.p012v7.widget.AppCompatDrawableManager;
import android.support.p012v7.widget.AppCompatTextView;
import android.support.p012v7.widget.DrawableUtils;
import android.support.p012v7.widget.TintTypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextInputLayout extends LinearLayout {
    private static final int ANIMATION_DURATION = 200;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final String LOG_TAG = "TextInputLayout";
    private ValueAnimator mAnimator;
    final CollapsingTextHelper mCollapsingTextHelper;
    boolean mCounterEnabled;
    private int mCounterMaxLength;
    private int mCounterOverflowTextAppearance;
    private boolean mCounterOverflowed;
    private int mCounterTextAppearance;
    private TextView mCounterView;
    private ColorStateList mDefaultTextColor;
    EditText mEditText;
    private CharSequence mError;
    private boolean mErrorEnabled;
    private boolean mErrorShown;
    private int mErrorTextAppearance;
    TextView mErrorView;
    private ColorStateList mFocusedTextColor;
    private boolean mHasPasswordToggleTintList;
    private boolean mHasPasswordToggleTintMode;
    private boolean mHasReconstructedEditTextBackground;
    private CharSequence mHint;
    private boolean mHintAnimationEnabled;
    private boolean mHintEnabled;
    private boolean mHintExpanded;
    private boolean mInDrawableStateChanged;
    private LinearLayout mIndicatorArea;
    private int mIndicatorsAdded;
    private final FrameLayout mInputFrame;
    private Drawable mOriginalEditTextEndDrawable;
    private CharSequence mOriginalHint;
    private CharSequence mPasswordToggleContentDesc;
    private Drawable mPasswordToggleDrawable;
    private Drawable mPasswordToggleDummyDrawable;
    private boolean mPasswordToggleEnabled;
    private ColorStateList mPasswordToggleTintList;
    private PorterDuff.Mode mPasswordToggleTintMode;
    private CheckableImageButton mPasswordToggleView;
    private boolean mPasswordToggledVisible;
    private boolean mRestoringSavedState;
    private Paint mTmpPaint;
    private final Rect mTmpRect;
    private Typeface mTypeface;

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class android.support.design.widget.TextInputLayout.SavedState.C01301 */

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        CharSequence error;
        boolean isPasswordToggledVisible;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isPasswordToggledVisible = parcel.readInt() != 1 ? false : true;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // android.support.p009v4.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isPasswordToggledVisible ? 1 : 0);
        }
    }

    private class TextInputAccessibilityDelegate extends AccessibilityDelegateCompat {
        TextInputAccessibilityDelegate() {
        }

        @Override // android.support.p009v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        @Override // android.support.p009v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(TextInputLayout.class.getSimpleName());
            CharSequence text = TextInputLayout.this.mCollapsingTextHelper.getText();
            if (!TextUtils.isEmpty(text)) {
                accessibilityNodeInfoCompat.setText(text);
            }
            EditText editText = TextInputLayout.this.mEditText;
            if (editText != null) {
                accessibilityNodeInfoCompat.setLabelFor(editText);
            }
            TextView textView = TextInputLayout.this.mErrorView;
            CharSequence text2 = textView != null ? textView.getText() : null;
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfoCompat.setContentInvalid(true);
                accessibilityNodeInfoCompat.setError(text2);
            }
        }

        @Override // android.support.p009v4.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            CharSequence text = TextInputLayout.this.mCollapsingTextHelper.getText();
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mTmpRect = new Rect();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.mCollapsingTextHelper = collapsingTextHelper;
        ThemeUtils.checkAppCompatTheme(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mInputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        collapsingTextHelper.setPositionInterpolator(new AccelerateInterpolator());
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0072R.styleable.TextInputLayout, i, C0072R.style.Widget_Design_TextInputLayout);
        this.mHintEnabled = obtainStyledAttributes.getBoolean(C0072R.styleable.TextInputLayout_hintEnabled, true);
        setHint(obtainStyledAttributes.getText(C0072R.styleable.TextInputLayout_android_hint));
        this.mHintAnimationEnabled = obtainStyledAttributes.getBoolean(C0072R.styleable.TextInputLayout_hintAnimationEnabled, true);
        int i2 = C0072R.styleable.TextInputLayout_android_textColorHint;
        if (obtainStyledAttributes.hasValue(i2)) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(i2);
            this.mFocusedTextColor = colorStateList;
            this.mDefaultTextColor = colorStateList;
        }
        int i3 = C0072R.styleable.TextInputLayout_hintTextAppearance;
        if (obtainStyledAttributes.getResourceId(i3, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(i3, 0));
        }
        this.mErrorTextAppearance = obtainStyledAttributes.getResourceId(C0072R.styleable.TextInputLayout_errorTextAppearance, 0);
        boolean z = obtainStyledAttributes.getBoolean(C0072R.styleable.TextInputLayout_errorEnabled, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C0072R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(C0072R.styleable.TextInputLayout_counterMaxLength, -1));
        this.mCounterTextAppearance = obtainStyledAttributes.getResourceId(C0072R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.mCounterOverflowTextAppearance = obtainStyledAttributes.getResourceId(C0072R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        this.mPasswordToggleEnabled = obtainStyledAttributes.getBoolean(C0072R.styleable.TextInputLayout_passwordToggleEnabled, false);
        this.mPasswordToggleDrawable = obtainStyledAttributes.getDrawable(C0072R.styleable.TextInputLayout_passwordToggleDrawable);
        this.mPasswordToggleContentDesc = obtainStyledAttributes.getText(C0072R.styleable.TextInputLayout_passwordToggleContentDescription);
        int i4 = C0072R.styleable.TextInputLayout_passwordToggleTint;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.mHasPasswordToggleTintList = true;
            this.mPasswordToggleTintList = obtainStyledAttributes.getColorStateList(i4);
        }
        int i5 = C0072R.styleable.TextInputLayout_passwordToggleTintMode;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.mHasPasswordToggleTintMode = true;
            this.mPasswordToggleTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(i5, -1), null);
        }
        obtainStyledAttributes.recycle();
        setErrorEnabled(z);
        setCounterEnabled(z2);
        applyPasswordToggleTint();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setAccessibilityDelegate(this, new TextInputAccessibilityDelegate());
    }

    private void addIndicator(TextView textView, int i) {
        if (this.mIndicatorArea == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.mIndicatorArea = linearLayout;
            linearLayout.setOrientation(0);
            addView(this.mIndicatorArea, -1, -2);
            this.mIndicatorArea.addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.mEditText != null) {
                adjustIndicatorPadding();
            }
        }
        this.mIndicatorArea.setVisibility(0);
        this.mIndicatorArea.addView(textView, i);
        this.mIndicatorsAdded++;
    }

    private void adjustIndicatorPadding() {
        ViewCompat.setPaddingRelative(this.mIndicatorArea, ViewCompat.getPaddingStart(this.mEditText), 0, ViewCompat.getPaddingEnd(this.mEditText), this.mEditText.getPaddingBottom());
    }

    private void applyPasswordToggleTint() {
        Drawable drawable;
        Drawable drawable2 = this.mPasswordToggleDrawable;
        if (drawable2 == null) {
            return;
        }
        if (this.mHasPasswordToggleTintList || this.mHasPasswordToggleTintMode) {
            Drawable mutate = DrawableCompat.wrap(drawable2).mutate();
            this.mPasswordToggleDrawable = mutate;
            if (this.mHasPasswordToggleTintList) {
                DrawableCompat.setTintList(mutate, this.mPasswordToggleTintList);
            }
            if (this.mHasPasswordToggleTintMode) {
                DrawableCompat.setTintMode(this.mPasswordToggleDrawable, this.mPasswordToggleTintMode);
            }
            CheckableImageButton checkableImageButton = this.mPasswordToggleView;
            if (checkableImageButton != null && checkableImageButton.getDrawable() != (drawable = this.mPasswordToggleDrawable)) {
                this.mPasswordToggleView.setImageDrawable(drawable);
            }
        }
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mAnimator.cancel();
        }
        if (!z || !this.mHintAnimationEnabled) {
            this.mCollapsingTextHelper.setExpansionFraction(1.0f);
        } else {
            animateToExpansionFraction(1.0f);
        }
        this.mHintExpanded = false;
    }

    private void ensureBackgroundDrawableStateWorkaround() {
        Drawable background;
        int i = Build.VERSION.SDK_INT;
        if ((i == 21 || i == 22) && (background = this.mEditText.getBackground()) != null && !this.mHasReconstructedEditTextBackground) {
            Drawable newDrawable = background.getConstantState().newDrawable();
            if (background instanceof DrawableContainer) {
                this.mHasReconstructedEditTextBackground = DrawableUtils.setContainerConstantState((DrawableContainer) background, newDrawable.getConstantState());
            }
            if (!this.mHasReconstructedEditTextBackground) {
                ViewCompat.setBackground(this.mEditText, newDrawable);
                this.mHasReconstructedEditTextBackground = true;
            }
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mAnimator.cancel();
        }
        if (!z || !this.mHintAnimationEnabled) {
            this.mCollapsingTextHelper.setExpansionFraction(0.0f);
        } else {
            animateToExpansionFraction(0.0f);
        }
        this.mHintExpanded = true;
    }

    private boolean hasPasswordTransformation() {
        EditText editText = this.mEditText;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void passwordVisibilityToggleRequested(boolean z) {
        boolean z2;
        if (this.mPasswordToggleEnabled) {
            int selectionEnd = this.mEditText.getSelectionEnd();
            if (hasPasswordTransformation()) {
                this.mEditText.setTransformationMethod(null);
                z2 = true;
            } else {
                this.mEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                z2 = false;
            }
            this.mPasswordToggledVisible = z2;
            this.mPasswordToggleView.setChecked(this.mPasswordToggledVisible);
            if (z) {
                this.mPasswordToggleView.jumpDrawablesToCurrentState();
            }
            this.mEditText.setSelection(selectionEnd);
        }
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void removeIndicator(TextView textView) {
        LinearLayout linearLayout = this.mIndicatorArea;
        if (linearLayout != null) {
            linearLayout.removeView(textView);
            int i = this.mIndicatorsAdded - 1;
            this.mIndicatorsAdded = i;
            if (i == 0) {
                this.mIndicatorArea.setVisibility(8);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.mEditText == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.mEditText = editText;
            if (!hasPasswordTransformation()) {
                this.mCollapsingTextHelper.setTypefaces(this.mEditText.getTypeface());
            }
            this.mCollapsingTextHelper.setExpandedTextSize(this.mEditText.getTextSize());
            int gravity = this.mEditText.getGravity();
            this.mCollapsingTextHelper.setCollapsedTextGravity((gravity & -113) | 48);
            this.mCollapsingTextHelper.setExpandedTextGravity(gravity);
            this.mEditText.addTextChangedListener(new TextWatcher() {
                /* class android.support.design.widget.TextInputLayout.C01251 */

                public void afterTextChanged(Editable editable) {
                    TextInputLayout textInputLayout = TextInputLayout.this;
                    textInputLayout.updateLabelState(!textInputLayout.mRestoringSavedState);
                    TextInputLayout textInputLayout2 = TextInputLayout.this;
                    if (textInputLayout2.mCounterEnabled) {
                        textInputLayout2.updateCounter(editable.length());
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            if (this.mDefaultTextColor == null) {
                this.mDefaultTextColor = this.mEditText.getHintTextColors();
            }
            if (this.mHintEnabled && TextUtils.isEmpty(this.mHint)) {
                CharSequence hint = this.mEditText.getHint();
                this.mOriginalHint = hint;
                setHint(hint);
                this.mEditText.setHint((CharSequence) null);
            }
            if (this.mCounterView != null) {
                updateCounter(this.mEditText.getText().length());
            }
            if (this.mIndicatorArea != null) {
                adjustIndicatorPadding();
            }
            updatePasswordToggleView();
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setError(final CharSequence charSequence, boolean z) {
        ViewPropertyAnimator viewPropertyAnimator;
        this.mError = charSequence;
        if (!this.mErrorEnabled) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        this.mErrorShown = !TextUtils.isEmpty(charSequence);
        this.mErrorView.animate().cancel();
        if (this.mErrorShown) {
            this.mErrorView.setText(charSequence);
            this.mErrorView.setVisibility(0);
            TextView textView = this.mErrorView;
            if (z) {
                if (textView.getAlpha() == 1.0f) {
                    this.mErrorView.setAlpha(0.0f);
                }
                viewPropertyAnimator = this.mErrorView.animate().alpha(1.0f).setDuration(200).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {
                    /* class android.support.design.widget.TextInputLayout.C01262 */

                    public void onAnimationStart(Animator animator) {
                        TextInputLayout.this.mErrorView.setVisibility(0);
                    }
                });
            } else {
                textView.setAlpha(1.0f);
                updateEditTextBackground();
                updateLabelState(z);
            }
        } else {
            if (this.mErrorView.getVisibility() == 0) {
                TextView textView2 = this.mErrorView;
                if (z) {
                    viewPropertyAnimator = textView2.animate().alpha(0.0f).setDuration(200).setInterpolator(AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {
                        /* class android.support.design.widget.TextInputLayout.C01273 */

                        public void onAnimationEnd(Animator animator) {
                            TextInputLayout.this.mErrorView.setText(charSequence);
                            TextInputLayout.this.mErrorView.setVisibility(4);
                        }
                    });
                } else {
                    textView2.setText(charSequence);
                    this.mErrorView.setVisibility(4);
                }
            }
            updateEditTextBackground();
            updateLabelState(z);
        }
        viewPropertyAnimator.start();
        updateEditTextBackground();
        updateLabelState(z);
    }

    private void setHintInternal(CharSequence charSequence) {
        this.mHint = charSequence;
        this.mCollapsingTextHelper.setText(charSequence);
    }

    private boolean shouldShowPasswordIcon() {
        return this.mPasswordToggleEnabled && (hasPasswordTransformation() || this.mPasswordToggledVisible);
    }

    private void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.mEditText;
        if (editText != null && (background = editText.getBackground()) != null) {
            ensureBackgroundDrawableStateWorkaround();
            if (DrawableUtils.canSafelyMutateDrawable(background)) {
                background = background.mutate();
            }
            if ((!this.mErrorShown || (textView = this.mErrorView) == null) && (!this.mCounterOverflowed || (textView = this.mCounterView) == null)) {
                DrawableCompat.clearColorFilter(background);
                this.mEditText.refreshDrawableState();
                return;
            }
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
    }

    private void updateInputLayoutMargins() {
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mInputFrame.getLayoutParams();
        if (this.mHintEnabled) {
            if (this.mTmpPaint == null) {
                this.mTmpPaint = new Paint();
            }
            this.mTmpPaint.setTypeface(this.mCollapsingTextHelper.getCollapsedTypeface());
            this.mTmpPaint.setTextSize(this.mCollapsingTextHelper.getCollapsedTextSize());
            i = (int) (-this.mTmpPaint.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.mInputFrame.requestLayout();
        }
    }

    private void updatePasswordToggleView() {
        if (this.mEditText != null) {
            if (shouldShowPasswordIcon()) {
                if (this.mPasswordToggleView == null) {
                    CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0072R.layout.design_text_input_password_icon, (ViewGroup) this.mInputFrame, false);
                    this.mPasswordToggleView = checkableImageButton;
                    checkableImageButton.setImageDrawable(this.mPasswordToggleDrawable);
                    this.mPasswordToggleView.setContentDescription(this.mPasswordToggleContentDesc);
                    this.mInputFrame.addView(this.mPasswordToggleView);
                    this.mPasswordToggleView.setOnClickListener(new View.OnClickListener() {
                        /* class android.support.design.widget.TextInputLayout.View$OnClickListenerC01284 */

                        public void onClick(View view) {
                            TextInputLayout.this.passwordVisibilityToggleRequested(false);
                        }
                    });
                }
                EditText editText = this.mEditText;
                if (editText != null && ViewCompat.getMinimumHeight(editText) <= 0) {
                    this.mEditText.setMinimumHeight(ViewCompat.getMinimumHeight(this.mPasswordToggleView));
                }
                this.mPasswordToggleView.setVisibility(0);
                this.mPasswordToggleView.setChecked(this.mPasswordToggledVisible);
                if (this.mPasswordToggleDummyDrawable == null) {
                    this.mPasswordToggleDummyDrawable = new ColorDrawable();
                }
                this.mPasswordToggleDummyDrawable.setBounds(0, 0, this.mPasswordToggleView.getMeasuredWidth(), 1);
                Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.mEditText);
                Drawable drawable = compoundDrawablesRelative[2];
                Drawable drawable2 = this.mPasswordToggleDummyDrawable;
                if (drawable != drawable2) {
                    this.mOriginalEditTextEndDrawable = compoundDrawablesRelative[2];
                }
                TextViewCompat.setCompoundDrawablesRelative(this.mEditText, compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable2, compoundDrawablesRelative[3]);
                this.mPasswordToggleView.setPadding(this.mEditText.getPaddingLeft(), this.mEditText.getPaddingTop(), this.mEditText.getPaddingRight(), this.mEditText.getPaddingBottom());
                return;
            }
            CheckableImageButton checkableImageButton2 = this.mPasswordToggleView;
            if (checkableImageButton2 != null && checkableImageButton2.getVisibility() == 0) {
                this.mPasswordToggleView.setVisibility(8);
            }
            if (this.mPasswordToggleDummyDrawable != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.mEditText);
                if (compoundDrawablesRelative2[2] == this.mPasswordToggleDummyDrawable) {
                    TextViewCompat.setCompoundDrawablesRelative(this.mEditText, compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], this.mOriginalEditTextEndDrawable, compoundDrawablesRelative2[3]);
                    this.mPasswordToggleDummyDrawable = null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.mInputFrame.addView(view, layoutParams2);
            this.mInputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void animateToExpansionFraction(float f) {
        if (this.mCollapsingTextHelper.getExpansionFraction() != f) {
            if (this.mAnimator == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.mAnimator = valueAnimator;
                valueAnimator.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
                this.mAnimator.setDuration(200L);
                this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class android.support.design.widget.TextInputLayout.C01295 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.mCollapsingTextHelper.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.mAnimator.setFloatValues(this.mCollapsingTextHelper.getExpansionFraction(), f);
            this.mAnimator.start();
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.mOriginalHint == null || (editText = this.mEditText) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        CharSequence hint = editText.getHint();
        this.mEditText.setHint(this.mOriginalHint);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.mEditText.setHint(hint);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.mRestoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.mRestoringSavedState = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mHintEnabled) {
            this.mCollapsingTextHelper.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.mInDrawableStateChanged) {
            boolean z = true;
            this.mInDrawableStateChanged = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!ViewCompat.isLaidOut(this) || !isEnabled()) {
                z = false;
            }
            updateLabelState(z);
            updateEditTextBackground();
            CollapsingTextHelper collapsingTextHelper = this.mCollapsingTextHelper;
            if (collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) | false : false) {
                invalidate();
            }
            this.mInDrawableStateChanged = false;
        }
    }

    public int getCounterMaxLength() {
        return this.mCounterMaxLength;
    }

    public EditText getEditText() {
        return this.mEditText;
    }

    public CharSequence getError() {
        if (this.mErrorEnabled) {
            return this.mError;
        }
        return null;
    }

    public CharSequence getHint() {
        if (this.mHintEnabled) {
            return this.mHint;
        }
        return null;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.mPasswordToggleContentDesc;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.mPasswordToggleDrawable;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public boolean isCounterEnabled() {
        return this.mCounterEnabled;
    }

    public boolean isErrorEnabled() {
        return this.mErrorEnabled;
    }

    public boolean isHintAnimationEnabled() {
        return this.mHintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.mHintEnabled;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHintExpanded() {
        return this.mHintExpanded;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.mPasswordToggleEnabled;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText;
        super.onLayout(z, i, i2, i3, i4);
        if (this.mHintEnabled && (editText = this.mEditText) != null) {
            Rect rect = this.mTmpRect;
            ViewGroupUtils.getDescendantRect(this, editText, rect);
            int compoundPaddingLeft = rect.left + this.mEditText.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.mEditText.getCompoundPaddingRight();
            this.mCollapsingTextHelper.setExpandedBounds(compoundPaddingLeft, rect.top + this.mEditText.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.mEditText.getCompoundPaddingBottom());
            this.mCollapsingTextHelper.setCollapsedBounds(compoundPaddingLeft, getPaddingTop(), compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.mCollapsingTextHelper.recalculate();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        updatePasswordToggleView();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isPasswordToggledVisible) {
            passwordVisibilityToggleRequested(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.mErrorShown) {
            savedState.error = getError();
        }
        savedState.isPasswordToggledVisible = this.mPasswordToggledVisible;
        return savedState;
    }

    public void setCounterEnabled(boolean z) {
        if (this.mCounterEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.mCounterView = appCompatTextView;
                appCompatTextView.setId(C0072R.C0074id.textinput_counter);
                Typeface typeface = this.mTypeface;
                if (typeface != null) {
                    this.mCounterView.setTypeface(typeface);
                }
                this.mCounterView.setMaxLines(1);
                try {
                    TextViewCompat.setTextAppearance(this.mCounterView, this.mCounterTextAppearance);
                } catch (Exception unused) {
                    TextViewCompat.setTextAppearance(this.mCounterView, C0467R.style.TextAppearance_AppCompat_Caption);
                    this.mCounterView.setTextColor(ContextCompat.getColor(getContext(), C0467R.color.error_color_material));
                }
                addIndicator(this.mCounterView, -1);
                EditText editText = this.mEditText;
                updateCounter(editText == null ? 0 : editText.getText().length());
            } else {
                removeIndicator(this.mCounterView);
                this.mCounterView = null;
            }
            this.mCounterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.mCounterMaxLength != i) {
            if (i <= 0) {
                i = -1;
            }
            this.mCounterMaxLength = i;
            if (this.mCounterEnabled) {
                EditText editText = this.mEditText;
                updateCounter(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        TextView textView;
        setError(charSequence, ViewCompat.isLaidOut(this) && isEnabled() && ((textView = this.mErrorView) == null || !TextUtils.equals(textView.getText(), charSequence)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setErrorEnabled(boolean r6) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(int i) {
        this.mErrorTextAppearance = i;
        TextView textView = this.mErrorView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.mHintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.mHintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.mHintEnabled) {
            this.mHintEnabled = z;
            CharSequence hint = this.mEditText.getHint();
            if (!this.mHintEnabled) {
                if (!TextUtils.isEmpty(this.mHint) && TextUtils.isEmpty(hint)) {
                    this.mEditText.setHint(this.mHint);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.mHint)) {
                    setHint(hint);
                }
                this.mEditText.setHint((CharSequence) null);
            }
            if (this.mEditText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.mCollapsingTextHelper.setCollapsedTextAppearance(i);
        this.mFocusedTextColor = this.mCollapsingTextHelper.getCollapsedTextColor();
        if (this.mEditText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.mPasswordToggleContentDesc = charSequence;
        CheckableImageButton checkableImageButton = this.mPasswordToggleView;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.mPasswordToggleDrawable = drawable;
        CheckableImageButton checkableImageButton = this.mPasswordToggleView;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        EditText editText;
        if (this.mPasswordToggleEnabled != z) {
            this.mPasswordToggleEnabled = z;
            if (!z && this.mPasswordToggledVisible && (editText = this.mEditText) != null) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.mPasswordToggledVisible = false;
            updatePasswordToggleView();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.mPasswordToggleTintList = colorStateList;
        this.mHasPasswordToggleTintList = true;
        applyPasswordToggleTint();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.mPasswordToggleTintMode = mode;
        this.mHasPasswordToggleTintMode = true;
        applyPasswordToggleTint();
    }

    public void setTypeface(Typeface typeface) {
        Typeface typeface2 = this.mTypeface;
        if ((typeface2 != null && !typeface2.equals(typeface)) || (this.mTypeface == null && typeface != null)) {
            this.mTypeface = typeface;
            this.mCollapsingTextHelper.setTypefaces(typeface);
            TextView textView = this.mCounterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
            TextView textView2 = this.mErrorView;
            if (textView2 != null) {
                textView2.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCounter(int i) {
        boolean z = this.mCounterOverflowed;
        int i2 = this.mCounterMaxLength;
        if (i2 == -1) {
            this.mCounterView.setText(String.valueOf(i));
            this.mCounterOverflowed = false;
        } else {
            boolean z2 = i > i2;
            this.mCounterOverflowed = z2;
            if (z != z2) {
                TextViewCompat.setTextAppearance(this.mCounterView, z2 ? this.mCounterOverflowTextAppearance : this.mCounterTextAppearance);
            }
            this.mCounterView.setText(getContext().getString(C0072R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.mCounterMaxLength)));
        }
        if (this.mEditText != null && z != this.mCounterOverflowed) {
            updateLabelState(false);
            updateEditTextBackground();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    /* access modifiers changed from: package-private */
    public void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.mEditText;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        boolean arrayContains = arrayContains(getDrawableState(), 16842908);
        boolean isEmpty = true ^ TextUtils.isEmpty(getError());
        ColorStateList colorStateList2 = this.mDefaultTextColor;
        if (colorStateList2 != null) {
            this.mCollapsingTextHelper.setExpandedTextColor(colorStateList2);
        }
        if (isEnabled && this.mCounterOverflowed && (textView = this.mCounterView) != null) {
            this.mCollapsingTextHelper.setCollapsedTextColor(textView.getTextColors());
        } else if ((isEnabled && arrayContains && (colorStateList = this.mFocusedTextColor) != null) || (colorStateList = this.mDefaultTextColor) != null) {
            this.mCollapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z3 || (isEnabled() && (arrayContains || isEmpty))) {
            if (z2 || this.mHintExpanded) {
                collapseHint(z);
            }
        } else if (z2 || !this.mHintExpanded) {
            expandHint(z);
        }
    }
}
