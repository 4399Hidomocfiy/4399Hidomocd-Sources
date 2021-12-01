package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0072R;
import android.support.p009v4.content.res.ResourcesCompat;
import android.support.p009v4.graphics.drawable.DrawableCompat;
import android.support.p009v4.view.AccessibilityDelegateCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.p009v4.widget.TextViewCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.view.menu.MenuItemImpl;
import android.support.p012v7.view.menu.MenuView;
import android.support.p012v7.widget.LinearLayoutCompat;
import android.support.p012v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private final AccessibilityDelegateCompat mAccessibilityDelegate;
    private FrameLayout mActionArea;
    boolean mCheckable;
    private Drawable mEmptyDrawable;
    private boolean mHasIconTintList;
    private final int mIconSize;
    private ColorStateList mIconTintList;
    private MenuItemImpl mItemData;
    private boolean mNeedsEmptyIcon;
    private final CheckedTextView mTextView;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C00771 r4 = new AccessibilityDelegateCompat() {
            /* class android.support.design.internal.NavigationMenuItemView.C00771 */

            @Override // android.support.p009v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.mCheckable);
            }
        };
        this.mAccessibilityDelegate = r4;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0072R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.mIconSize = context.getResources().getDimensionPixelSize(C0072R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0072R.C0074id.design_menu_item_text);
        this.mTextView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(checkedTextView, r4);
    }

    private void adjustAppearance() {
        int i;
        LinearLayoutCompat.LayoutParams layoutParams;
        if (shouldExpandActionArea()) {
            this.mTextView.setVisibility(8);
            FrameLayout frameLayout = this.mActionArea;
            if (frameLayout != null) {
                layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.mTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.mActionArea;
            if (frameLayout2 != null) {
                layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).width = i;
        this.mActionArea.setLayoutParams(layoutParams);
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0467R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.mActionArea == null) {
                this.mActionArea = (FrameLayout) ((ViewStub) findViewById(C0072R.C0074id.design_menu_item_action_area_stub)).inflate();
            }
            this.mActionArea.removeAllViews();
            this.mActionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        return this.mItemData.getTitle() == null && this.mItemData.getIcon() == null && this.mItemData.getActionView() != null;
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.setBackground(this, createDefaultBackground());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        adjustAppearance();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.mItemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.mItemData.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.mActionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.mTextView.setCompoundDrawables(null, null, null, null);
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.mCheckable != z) {
            this.mCheckable = z;
            this.mAccessibilityDelegate.sendAccessibilityEvent(this.mTextView, 2048);
        }
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.mTextView.setChecked(z);
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.mHasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.mIconTintList);
            }
            int i = this.mIconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.mNeedsEmptyIcon) {
            if (this.mEmptyDrawable == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), C0072R.C0073drawable.navigation_empty_icon, getContext().getTheme());
                this.mEmptyDrawable = drawable2;
                if (drawable2 != null) {
                    int i2 = this.mIconSize;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.mEmptyDrawable;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.mTextView, drawable, null, null, null);
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        this.mHasIconTintList = colorStateList != null;
        MenuItemImpl menuItemImpl = this.mItemData;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.mNeedsEmptyIcon = z;
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        TextViewCompat.setTextAppearance(this.mTextView, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.mTextView.setTextColor(colorStateList);
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.mTextView.setText(charSequence);
    }

    @Override // android.support.p012v7.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }
}
