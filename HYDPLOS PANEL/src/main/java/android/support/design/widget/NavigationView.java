package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0072R;
import android.support.design.internal.NavigationMenu;
import android.support.design.internal.NavigationMenuPresenter;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.p009v4.content.ContextCompat;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.WindowInsetsCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.content.res.AppCompatResources;
import android.support.p012v7.view.SupportMenuInflater;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.view.menu.MenuItemImpl;
import android.support.p012v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    OnNavigationItemSelectedListener mListener;
    private int mMaxWidth;
    private final NavigationMenu mMenu;
    private MenuInflater mMenuInflater;
    private final NavigationMenuPresenter mPresenter;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class android.support.design.widget.NavigationView.SavedState.C01171 */

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
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.support.p009v4.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        int i2;
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.mPresenter = navigationMenuPresenter;
        ThemeUtils.checkAppCompatTheme(context);
        NavigationMenu navigationMenu = new NavigationMenu(context);
        this.mMenu = navigationMenu;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0072R.styleable.NavigationView, i, C0072R.style.Widget_Design_NavigationView);
        ViewCompat.setBackground(this, obtainStyledAttributes.getDrawable(C0072R.styleable.NavigationView_android_background));
        int i3 = C0072R.styleable.NavigationView_elevation;
        if (obtainStyledAttributes.hasValue(i3)) {
            ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(i3, 0));
        }
        ViewCompat.setFitsSystemWindows(this, obtainStyledAttributes.getBoolean(C0072R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(C0072R.styleable.NavigationView_android_maxWidth, 0);
        int i4 = C0072R.styleable.NavigationView_itemIconTint;
        ColorStateList colorStateList = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getColorStateList(i4) : createDefaultColorStateList(16842808);
        int i5 = C0072R.styleable.NavigationView_itemTextAppearance;
        if (obtainStyledAttributes.hasValue(i5)) {
            i2 = obtainStyledAttributes.getResourceId(i5, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        ColorStateList colorStateList2 = null;
        int i6 = C0072R.styleable.NavigationView_itemTextColor;
        colorStateList2 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getColorStateList(i6) : colorStateList2;
        if (!z && colorStateList2 == null) {
            colorStateList2 = createDefaultColorStateList(16842806);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(C0072R.styleable.NavigationView_itemBackground);
        navigationMenu.setCallback(new MenuBuilder.Callback() {
            /* class android.support.design.widget.NavigationView.C01161 */

            @Override // android.support.p012v7.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.mListener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // android.support.p012v7.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context, navigationMenu);
        navigationMenuPresenter.setItemIconTintList(colorStateList);
        if (z) {
            navigationMenuPresenter.setItemTextAppearance(i2);
        }
        navigationMenuPresenter.setItemTextColor(colorStateList2);
        navigationMenuPresenter.setItemBackground(drawable);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i7 = C0072R.styleable.NavigationView_menu;
        if (obtainStyledAttributes.hasValue(i7)) {
            inflateMenu(obtainStyledAttributes.getResourceId(i7, 0));
        }
        int i8 = C0072R.styleable.NavigationView_headerLayout;
        if (obtainStyledAttributes.hasValue(i8)) {
            inflateHeaderView(obtainStyledAttributes.getResourceId(i8, 0));
        }
        obtainStyledAttributes.recycle();
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0467R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            this.mMenuInflater = new SupportMenuInflater(getContext());
        }
        return this.mMenuInflater;
    }

    public void addHeaderView(View view) {
        this.mPresenter.addHeaderView(view);
    }

    public int getHeaderCount() {
        return this.mPresenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.mPresenter.getHeaderView(i);
    }

    public Drawable getItemBackground() {
        return this.mPresenter.getItemBackground();
    }

    public ColorStateList getItemIconTintList() {
        return this.mPresenter.getItemTintList();
    }

    public ColorStateList getItemTextColor() {
        return this.mPresenter.getItemTextColor();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public View inflateHeaderView(int i) {
        return this.mPresenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.mPresenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.mMenu);
        this.mPresenter.setUpdateSuspended(false);
        this.mPresenter.updateMenuView(false);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.design.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        this.mPresenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.mMaxWidth;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.mMaxWidth);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
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
        this.mMenu.restorePresenterStates(savedState.menuState);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.mMenu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeHeaderView(View view) {
        this.mPresenter.removeHeaderView(view);
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.mMenu.findItem(i);
        if (findItem != null) {
            this.mPresenter.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.mPresenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.mPresenter.setItemIconTintList(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.mPresenter.setItemTextAppearance(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.mPresenter.setItemTextColor(colorStateList);
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.mListener = onNavigationItemSelectedListener;
    }
}
