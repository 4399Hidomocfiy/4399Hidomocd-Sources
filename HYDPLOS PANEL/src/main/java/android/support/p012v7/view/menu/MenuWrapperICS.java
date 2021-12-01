package android.support.p012v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p009v4.internal.view.SupportMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.MenuWrapperICS */
public class MenuWrapperICS extends BaseMenuWrapper<SupportMenu> implements Menu {
    MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context, supportMenu);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return getMenuItemWrapper(this.mWrappedObject.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return getMenuItemWrapper(this.mWrappedObject.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return getMenuItemWrapper(this.mWrappedObject.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.mWrappedObject.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = getMenuItemWrapper(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return getSubMenuWrapper(this.mWrappedObject.addSubMenu(charSequence));
    }

    public void clear() {
        internalClear();
        this.mWrappedObject.clear();
    }

    public void close() {
        this.mWrappedObject.close();
    }

    public MenuItem findItem(int i) {
        return getMenuItemWrapper(this.mWrappedObject.findItem(i));
    }

    public MenuItem getItem(int i) {
        return getMenuItemWrapper(this.mWrappedObject.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.mWrappedObject.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.mWrappedObject.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.mWrappedObject.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.mWrappedObject.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        internalRemoveGroup(i);
        this.mWrappedObject.removeGroup(i);
    }

    public void removeItem(int i) {
        internalRemoveItem(i);
        this.mWrappedObject.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.mWrappedObject.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.mWrappedObject.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.mWrappedObject.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.mWrappedObject.setQwertyMode(z);
    }

    public int size() {
        return this.mWrappedObject.size();
    }
}
