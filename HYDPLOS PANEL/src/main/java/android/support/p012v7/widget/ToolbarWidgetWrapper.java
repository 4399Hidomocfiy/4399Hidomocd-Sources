package android.support.p012v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.ViewPropertyAnimatorCompat;
import android.support.p009v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.content.res.AppCompatResources;
import android.support.p012v7.view.menu.ActionMenuItem;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.view.menu.MenuPresenter;
import android.support.p012v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* renamed from: android.support.v7.widget.ToolbarWidgetWrapper */
public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final String TAG = "ToolbarWidgetWrapper";
    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private Spinner mSpinner;
    private CharSequence mSubtitle;
    private View mTabView;
    CharSequence mTitle;
    private boolean mTitleSet;
    Toolbar mToolbar;
    Window.Callback mWindowCallback;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0467R.string.abc_action_bar_up_description, C0467R.C0468drawable.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = this.mTitle != null;
        this.mNavIcon = toolbar.getNavigationIcon();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, C0467R.styleable.ActionBar, C0467R.attr.actionBarStyle, 0);
        this.mDefaultNavigationIcon = obtainStyledAttributes.getDrawable(C0467R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence text = obtainStyledAttributes.getText(C0467R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = obtainStyledAttributes.getText(C0467R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(C0467R.styleable.ActionBar_logo);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            Drawable drawable3 = obtainStyledAttributes.getDrawable(C0467R.styleable.ActionBar_icon);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.mNavIcon == null && (drawable = this.mDefaultNavigationIcon) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(obtainStyledAttributes.getInt(C0467R.styleable.ActionBar_displayOptions, 0));
            int resourceId = obtainStyledAttributes.getResourceId(C0467R.styleable.ActionBar_customNavigationLayout, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, (ViewGroup) this.mToolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0467R.styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.mToolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0467R.styleable.ActionBar_contentInsetStart, -1);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(C0467R.styleable.ActionBar_contentInsetEnd, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.mToolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(C0467R.styleable.ActionBar_titleTextStyle, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.mToolbar;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(C0467R.styleable.ActionBar_subtitleTextStyle, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.mToolbar;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(C0467R.styleable.ActionBar_popupTheme, 0);
            if (resourceId4 != 0) {
                this.mToolbar.setPopupTheme(resourceId4);
            }
        } else {
            this.mDisplayOpts = detectDisplayOptions();
        }
        obtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            /* class android.support.p012v7.widget.ToolbarWidgetWrapper.View$OnClickListenerC05641 */
            final ActionMenuItem mNavItem;

            {
                this.mNavItem = new ActionMenuItem(ToolbarWidgetWrapper.this.mToolbar.getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.this.mTitle);
            }

            public void onClick(View view) {
                ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                Window.Callback callback = toolbarWidgetWrapper.mWindowCallback;
                if (callback != null && toolbarWidgetWrapper.mMenuPrepared) {
                    callback.onMenuItemSelected(0, this.mNavItem);
                }
            }
        });
    }

    private int detectDisplayOptions() {
        if (this.mToolbar.getNavigationIcon() == null) {
            return 11;
        }
        this.mDefaultNavigationIcon = this.mToolbar.getNavigationIcon();
        return 15;
    }

    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new AppCompatSpinner(getContext(), null, C0467R.attr.actionDropDownStyle);
            this.mSpinner.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void setTitleInt(CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
        }
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.mHomeDescription)) {
            this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
        } else {
            this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
        }
    }

    private void updateNavigationIcon() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.mDisplayOpts & 4) != 0) {
            toolbar = this.mToolbar;
            drawable = this.mNavIcon;
            if (drawable == null) {
                drawable = this.mDefaultNavigationIcon;
            }
        } else {
            toolbar = this.mToolbar;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void updateToolbarLogo() {
        Drawable drawable;
        int i = this.mDisplayOpts;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.mLogo) == null) {
            drawable = this.mIcon;
        }
        this.mToolbar.setLogo(drawable);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void animateToVisibility(int i) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = setupAnimatorToVisibility(i, DEFAULT_FADE_DURATION_MS);
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.start();
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public Context getContext() {
        return this.mToolbar.getContext();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public View getCustomView() {
        return this.mCustomView;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public int getDropdownItemCount() {
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public int getHeight() {
        return this.mToolbar.getHeight();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean hasIcon() {
        return this.mIcon != null;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean hasLogo() {
        return this.mLogo != null;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void initIndeterminateProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void initProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.restoreHierarchyState(sparseArray);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.saveHierarchyState(sparseArray);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setBackgroundDrawable(Drawable drawable) {
        ViewCompat.setBackground(this.mToolbar, drawable);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setCollapsible(boolean z) {
        this.mToolbar.setCollapsible(z);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setCustomView(View view) {
        View view2 = this.mCustomView;
        if (!(view2 == null || (this.mDisplayOpts & 16) == 0)) {
            this.mToolbar.removeView(view2);
        }
        this.mCustomView = view;
        if (view != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.addView(view);
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int i) {
        if (i != this.mDefaultNavigationContentDescription) {
            this.mDefaultNavigationContentDescription = i;
            if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
                setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            }
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setDisplayOptions(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.mDisplayOpts ^ i;
        this.mDisplayOpts = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    updateHomeAccessibility();
                }
                updateNavigationIcon();
            }
            if ((i2 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.mToolbar.setTitle(this.mTitle);
                    toolbar = this.mToolbar;
                    charSequence = this.mSubtitle;
                } else {
                    charSequence = null;
                    this.mToolbar.setTitle((CharSequence) null);
                    toolbar = this.mToolbar;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.mCustomView) != null) {
                if ((i & 16) != 0) {
                    this.mToolbar.addView(view);
                } else {
                    this.mToolbar.removeView(view);
                }
            }
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ensureSpinner();
        this.mSpinner.setAdapter(spinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setDropdownSelectedPosition(int i) {
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.mTabView;
        if (view != null && view.getParent() == (toolbar = this.mToolbar)) {
            toolbar.removeView(this.mTabView);
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.mNavigationMode == 2) {
            this.mToolbar.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            layoutParams.gravity = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean z) {
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setIcon(int i) {
        setIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setLogo(int i) {
        setLogo(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setLogo(Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        if (this.mActionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.mToolbar.getContext());
            this.mActionMenuPresenter = actionMenuPresenter;
            actionMenuPresenter.setId(C0467R.C0469id.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(callback);
        this.mToolbar.setMenu((MenuBuilder) menu, this.mActionMenuPresenter);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mToolbar.setMenuCallbacks(callback, callback2);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setNavigationIcon(Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.support.p012v7.widget.DecorToolbar
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNavigationMode(int r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p012v7.widget.ToolbarWidgetWrapper.setNavigationMode(int):void");
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setTitle(CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setVisibility(int i) {
        this.mToolbar.setVisibility(i);
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
        this.mWindowCallback = callback;
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.mTitleSet) {
            setTitleInt(charSequence);
        }
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int i, long j) {
        return ViewCompat.animate(this.mToolbar).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new ViewPropertyAnimatorListenerAdapter() {
            /* class android.support.p012v7.widget.ToolbarWidgetWrapper.C05652 */
            private boolean mCanceled = false;

            @Override // android.support.p009v4.view.ViewPropertyAnimatorListenerAdapter, android.support.p009v4.view.ViewPropertyAnimatorListener
            public void onAnimationCancel(View view) {
                this.mCanceled = true;
            }

            @Override // android.support.p009v4.view.ViewPropertyAnimatorListenerAdapter, android.support.p009v4.view.ViewPropertyAnimatorListener
            public void onAnimationEnd(View view) {
                if (!this.mCanceled) {
                    ToolbarWidgetWrapper.this.mToolbar.setVisibility(i);
                }
            }

            @Override // android.support.p009v4.view.ViewPropertyAnimatorListenerAdapter, android.support.p009v4.view.ViewPropertyAnimatorListener
            public void onAnimationStart(View view) {
                ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
            }
        });
    }

    @Override // android.support.p012v7.widget.DecorToolbar
    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }
}
