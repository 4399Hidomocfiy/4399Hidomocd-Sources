package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.C0072R;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.p009v4.content.ContextCompat;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.ViewCompat;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.content.res.AppCompatResources;
import android.support.p012v7.view.SupportMenuInflater;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

public class BottomNavigationView extends FrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int MENU_PRESENTER_ID = 1;
    private final MenuBuilder mMenu;
    private MenuInflater mMenuInflater;
    private final BottomNavigationMenuView mMenuView;
    private final BottomNavigationPresenter mPresenter;
    private OnNavigationItemReselectedListener mReselectedListener;
    private OnNavigationItemSelectedListener mSelectedListener;

    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(MenuItem menuItem);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class android.support.design.widget.BottomNavigationView.SavedState.C00991 */

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
        Bundle menuPresenterState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // android.support.p009v4.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.mPresenter = bottomNavigationPresenter;
        ThemeUtils.checkAppCompatTheme(context);
        MenuBuilder bottomNavigationMenu = new BottomNavigationMenu(context);
        this.mMenu = bottomNavigationMenu;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context);
        this.mMenuView = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.setBottomNavigationMenuView(bottomNavigationMenuView);
        bottomNavigationPresenter.setId(1);
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        bottomNavigationMenu.addMenuPresenter(bottomNavigationPresenter);
        bottomNavigationPresenter.initForMenu(getContext(), bottomNavigationMenu);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0072R.styleable.BottomNavigationView, i, C0072R.style.Widget_Design_BottomNavigationView);
        int i2 = C0072R.styleable.BottomNavigationView_itemIconTint;
        bottomNavigationMenuView.setIconTintList(obtainStyledAttributes.hasValue(i2) ? obtainStyledAttributes.getColorStateList(i2) : createDefaultColorStateList(16842808));
        int i3 = C0072R.styleable.BottomNavigationView_itemTextColor;
        bottomNavigationMenuView.setItemTextColor(obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getColorStateList(i3) : createDefaultColorStateList(16842808));
        int i4 = C0072R.styleable.BottomNavigationView_elevation;
        if (obtainStyledAttributes.hasValue(i4)) {
            ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(i4, 0));
        }
        bottomNavigationMenuView.setItemBackgroundRes(obtainStyledAttributes.getResourceId(C0072R.styleable.BottomNavigationView_itemBackground, 0));
        int i5 = C0072R.styleable.BottomNavigationView_menu;
        if (obtainStyledAttributes.hasValue(i5)) {
            inflateMenu(obtainStyledAttributes.getResourceId(i5, 0));
        }
        obtainStyledAttributes.recycle();
        addView(bottomNavigationMenuView, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            addCompatibilityTopDivider(context);
        }
        bottomNavigationMenu.setCallback(new MenuBuilder.Callback() {
            /* class android.support.design.widget.BottomNavigationView.C00981 */

            @Override // android.support.p012v7.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (BottomNavigationView.this.mReselectedListener == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                    return BottomNavigationView.this.mSelectedListener != null && !BottomNavigationView.this.mSelectedListener.onNavigationItemSelected(menuItem);
                }
                BottomNavigationView.this.mReselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // android.support.p012v7.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
    }

    private void addCompatibilityTopDivider(Context context) {
        View view = new View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, C0072R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0072R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
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

    public int getItemBackgroundResource() {
        return this.mMenuView.getItemBackgroundRes();
    }

    public ColorStateList getItemIconTintList() {
        return this.mMenuView.getIconTintList();
    }

    public ColorStateList getItemTextColor() {
        return this.mMenuView.getItemTextColor();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public int getSelectedItemId() {
        return this.mMenuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.mPresenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.mMenu);
        this.mPresenter.setUpdateSuspended(false);
        this.mPresenter.updateMenuView(true);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mMenu.restorePresenterStates(savedState.menuPresenterState);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.mMenu.savePresenterStates(bundle);
        return savedState;
    }

    public void setItemBackgroundResource(int i) {
        this.mMenuView.setItemBackgroundRes(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.mMenuView.setIconTintList(colorStateList);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.mMenuView.setItemTextColor(colorStateList);
    }

    public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        this.mReselectedListener = onNavigationItemReselectedListener;
    }

    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.mSelectedListener = onNavigationItemSelectedListener;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.mMenu.findItem(i);
        if (findItem != null && !this.mMenu.performItemAction(findItem, this.mPresenter, 0)) {
            findItem.setChecked(true);
        }
    }
}
