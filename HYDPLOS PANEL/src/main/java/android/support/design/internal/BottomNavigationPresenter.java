package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.view.menu.MenuItemImpl;
import android.support.p012v7.view.menu.MenuPresenter;
import android.support.p012v7.view.menu.MenuView;
import android.support.p012v7.view.menu.SubMenuBuilder;
import android.view.ViewGroup;

public class BottomNavigationPresenter implements MenuPresenter {
    private int mId;
    private MenuBuilder mMenu;
    private BottomNavigationMenuView mMenuView;
    private boolean mUpdateSuspended = false;

    /* access modifiers changed from: package-private */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class android.support.design.internal.BottomNavigationPresenter.SavedState.C00761 */

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int selectedItemId;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
        }
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public int getId() {
        return this.mId;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        return this.mMenuView;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.mMenuView.initialize(this.mMenu);
        this.mMenu = menuBuilder;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mMenuView.tryRestoreSelectedItemId(((SavedState) parcelable).selectedItemId);
        }
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.mMenuView.getSelectedItemId();
        return savedState;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setBottomNavigationMenuView(BottomNavigationMenuView bottomNavigationMenuView) {
        this.mMenuView = bottomNavigationMenuView;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
    }

    public void setId(int i) {
        this.mId = i;
    }

    public void setUpdateSuspended(boolean z) {
        this.mUpdateSuspended = z;
    }

    @Override // android.support.p012v7.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        if (!this.mUpdateSuspended) {
            if (z) {
                this.mMenuView.buildMenuView();
            } else {
                this.mMenuView.updateMenuView();
            }
        }
    }
}
