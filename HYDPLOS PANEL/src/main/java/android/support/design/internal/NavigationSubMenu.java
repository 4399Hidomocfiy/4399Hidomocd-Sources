package android.support.design.internal;

import android.content.Context;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.view.menu.MenuItemImpl;
import android.support.p012v7.view.menu.SubMenuBuilder;

public class NavigationSubMenu extends SubMenuBuilder {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, MenuItemImpl menuItemImpl) {
        super(context, navigationMenu, menuItemImpl);
    }

    @Override // android.support.p012v7.view.menu.MenuBuilder
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((MenuBuilder) getParentMenu()).onItemsChanged(z);
    }
}
