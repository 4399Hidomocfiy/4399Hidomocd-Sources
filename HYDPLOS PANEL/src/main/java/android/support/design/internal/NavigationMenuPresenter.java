package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0072R;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.WindowInsetsCompat;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.view.menu.MenuItemImpl;
import android.support.p012v7.view.menu.MenuPresenter;
import android.support.p012v7.view.menu.MenuView;
import android.support.p012v7.view.menu.SubMenuBuilder;
import android.support.p012v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class NavigationMenuPresenter implements MenuPresenter {
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter mAdapter;
    private MenuPresenter.Callback mCallback;
    LinearLayout mHeaderLayout;
    ColorStateList mIconTintList;
    private int mId;
    Drawable mItemBackground;
    LayoutInflater mLayoutInflater;
    MenuBuilder mMenu;
    private NavigationMenuView mMenuView;
    final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        /* class android.support.design.internal.NavigationMenuPresenter.View$OnClickListenerC00781 */

        public void onClick(View view) {
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.mMenu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.mAdapter.setCheckedItem(itemData);
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            NavigationMenuPresenter.this.updateMenuView(false);
        }
    };
    int mPaddingSeparator;
    private int mPaddingTopDefault;
    int mTextAppearance;
    boolean mTextAppearanceSet;
    ColorStateList mTextColor;

    /* access modifiers changed from: private */
    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: private */
    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private MenuItemImpl mCheckedItem;
        private final ArrayList<NavigationMenuItem> mItems = new ArrayList<>();
        private boolean mUpdateSuspended;

        NavigationMenuAdapter() {
            prepareMenuItems();
        }

        private void appendTransparentIconIfMissing(int i, int i2) {
            while (i < i2) {
                ((NavigationMenuTextItem) this.mItems.get(i)).needsEmptyIcon = true;
                i++;
            }
        }

        private void prepareMenuItems() {
            if (!this.mUpdateSuspended) {
                this.mUpdateSuspended = true;
                this.mItems.clear();
                this.mItems.add(new NavigationMenuHeaderItem());
                int i = -1;
                int size = NavigationMenuPresenter.this.mMenu.getVisibleItems().size();
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl = NavigationMenuPresenter.this.mMenu.getVisibleItems().get(i3);
                    if (menuItemImpl.isChecked()) {
                        setCheckedItem(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.setExclusiveCheckable(false);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.mItems.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.mPaddingSeparator, 0));
                            }
                            this.mItems.add(new NavigationMenuTextItem(menuItemImpl));
                            int size2 = this.mItems.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                                if (menuItemImpl2.isVisible()) {
                                    if (!z2 && menuItemImpl2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.setExclusiveCheckable(false);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        setCheckedItem(menuItemImpl);
                                    }
                                    this.mItems.add(new NavigationMenuTextItem(menuItemImpl2));
                                }
                            }
                            if (z2) {
                                appendTransparentIconIfMissing(size2, this.mItems.size());
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i2 = this.mItems.size();
                            z = menuItemImpl.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<NavigationMenuItem> arrayList = this.mItems;
                                int i5 = NavigationMenuPresenter.this.mPaddingSeparator;
                                arrayList.add(new NavigationMenuSeparatorItem(i5, i5));
                            }
                        } else if (!z && menuItemImpl.getIcon() != null) {
                            appendTransparentIconIfMissing(i2, this.mItems.size());
                            z = true;
                        }
                        NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(menuItemImpl);
                        navigationMenuTextItem.needsEmptyIcon = z;
                        this.mItems.add(navigationMenuTextItem);
                        i = groupId;
                    }
                }
                this.mUpdateSuspended = false;
            }
        }

        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.mCheckedItem;
            if (menuItemImpl != null) {
                bundle.putInt(STATE_CHECKED_ITEM, menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.mItems.size();
            for (int i = 0; i < size; i++) {
                NavigationMenuItem navigationMenuItem = this.mItems.get(i);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    MenuItemImpl menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mItems.size();
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return (long) i;
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            NavigationMenuItem navigationMenuItem = this.mItems.get(i);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.mIconTintList);
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                if (navigationMenuPresenter.mTextAppearanceSet) {
                    navigationMenuItemView.setTextAppearance(navigationMenuPresenter.mTextAppearance);
                }
                ColorStateList colorStateList = NavigationMenuPresenter.this.mTextColor;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = NavigationMenuPresenter.this.mItemBackground;
                ViewCompat.setBackground(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.mItems.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
                navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), 0);
            } else if (itemViewType == 1) {
                ((TextView) viewHolder.itemView).setText(((NavigationMenuTextItem) this.mItems.get(i)).getMenuItem().getTitle());
            } else if (itemViewType == 2) {
                NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.mItems.get(i);
                viewHolder.itemView.setPadding(0, navigationMenuSeparatorItem.getPaddingTop(), 0, navigationMenuSeparatorItem.getPaddingBottom());
            }
        }

        @Override // android.support.p012v7.widget.RecyclerView.Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.mLayoutInflater, viewGroup, navigationMenuPresenter.mOnClickListener);
            } else if (i == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.mLayoutInflater, viewGroup);
            } else {
                if (i == 2) {
                    return new SeparatorViewHolder(NavigationMenuPresenter.this.mLayoutInflater, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new HeaderViewHolder(NavigationMenuPresenter.this.mHeaderLayout);
            }
        }

        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }

        public void restoreInstanceState(Bundle bundle) {
            MenuItemImpl menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl menuItem2;
            int i = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i != 0) {
                this.mUpdateSuspended = true;
                int size = this.mItems.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    NavigationMenuItem navigationMenuItem = this.mItems.get(i2);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.getItemId() == i) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                    i2++;
                }
                this.mUpdateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.mItems.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    NavigationMenuItem navigationMenuItem2 = this.mItems.get(i3);
                    if (!(!(navigationMenuItem2 instanceof NavigationMenuTextItem) || (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) == null || (actionView = menuItem.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(MenuItemImpl menuItemImpl) {
            if (this.mCheckedItem != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.mCheckedItem;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.mCheckedItem = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        public void setUpdateSuspended(boolean z) {
            this.mUpdateSuspended = z;
        }

        public void update() {
            prepareMenuItems();
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
        NavigationMenuHeaderItem() {
        }
    }

    /* access modifiers changed from: private */
    public interface NavigationMenuItem {
    }

    /* access modifiers changed from: private */
    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int mPaddingBottom;
        private final int mPaddingTop;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.mPaddingTop = i;
            this.mPaddingBottom = i2;
        }

        public int getPaddingBottom() {
            return this.mPaddingBottom;
        }

        public int getPaddingTop() {
            return this.mPaddingTop;
        }
    }

    /* access modifiers changed from: private */
    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final MenuItemImpl mMenuItem;
        boolean needsEmptyIcon;

        NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.mMenuItem = menuItemImpl;
        }

        public MenuItemImpl getMenuItem() {
            return this.mMenuItem;
        }
    }

    /* access modifiers changed from: private */
    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0072R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: private */
    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0072R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* access modifiers changed from: private */
    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0072R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    public void addHeaderView(View view) {
        this.mHeaderLayout.addView(view);
        NavigationMenuView navigationMenuView = this.mMenuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public void dispatchApplyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.mPaddingTopDefault != systemWindowInsetTop) {
            this.mPaddingTopDefault = systemWindowInsetTop;
            if (this.mHeaderLayout.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.mMenuView;
                navigationMenuView.setPadding(0, this.mPaddingTopDefault, 0, navigationMenuView.getPaddingBottom());
            }
        }
        ViewCompat.dispatchApplyWindowInsets(this.mHeaderLayout, windowInsetsCompat);
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public int getHeaderCount() {
        return this.mHeaderLayout.getChildCount();
    }

    public View getHeaderView(int i) {
        return this.mHeaderLayout.getChildAt(i);
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public int getId() {
        return this.mId;
    }

    public Drawable getItemBackground() {
        return this.mItemBackground;
    }

    public ColorStateList getItemTextColor() {
        return this.mTextColor;
    }

    public ColorStateList getItemTintList() {
        return this.mIconTintList;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (NavigationMenuView) this.mLayoutInflater.inflate(C0072R.layout.design_navigation_menu, viewGroup, false);
            if (this.mAdapter == null) {
                this.mAdapter = new NavigationMenuAdapter();
            }
            this.mHeaderLayout = (LinearLayout) this.mLayoutInflater.inflate(C0072R.layout.design_navigation_item_header, (ViewGroup) this.mMenuView, false);
            this.mMenuView.setAdapter(this.mAdapter);
        }
        return this.mMenuView;
    }

    public View inflateHeaderView(int i) {
        View inflate = this.mLayoutInflater.inflate(i, (ViewGroup) this.mHeaderLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mMenu = menuBuilder;
        this.mPaddingSeparator = context.getResources().getDimensionPixelOffset(C0072R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.mCallback;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.mMenuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.mAdapter.restoreInstanceState(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.mHeaderLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        if (Build.VERSION.SDK_INT < 11) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (this.mMenuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.mMenuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.mAdapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.mHeaderLayout != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.mHeaderLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void removeHeaderView(View view) {
        this.mHeaderLayout.removeView(view);
        if (this.mHeaderLayout.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.mMenuView;
            navigationMenuView.setPadding(0, this.mPaddingTopDefault, 0, navigationMenuView.getPaddingBottom());
        }
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.mCallback = callback;
    }

    public void setCheckedItem(MenuItemImpl menuItemImpl) {
        this.mAdapter.setCheckedItem(menuItemImpl);
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setItemBackground(Drawable drawable) {
        this.mItemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.mIconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i) {
        this.mTextAppearance = i;
        this.mTextAppearanceSet = true;
        updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.mTextColor = colorStateList;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.mAdapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z);
        }
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.mAdapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
