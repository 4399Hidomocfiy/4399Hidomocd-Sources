package android.support.p012v7.view.menu;

import android.content.Context;
import android.support.p009v4.internal.view.SupportMenuItem;
import android.support.p009v4.view.ActionProvider;
import android.support.p012v7.view.menu.MenuItemWrapperICS;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.MenuItemWrapperJB */
public class MenuItemWrapperJB extends MenuItemWrapperICS {

    /* renamed from: android.support.v7.view.menu.MenuItemWrapperJB$ActionProviderWrapperJB */
    class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper implements ActionProvider.VisibilityListener {
        ActionProvider.VisibilityListener mListener;

        public ActionProviderWrapperJB(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.p009v4.view.ActionProvider
        public boolean isVisible() {
            return this.mInner.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            ActionProvider.VisibilityListener visibilityListener = this.mListener;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // android.support.p009v4.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            return this.mInner.onCreateActionView(menuItem);
        }

        @Override // android.support.p009v4.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }

        @Override // android.support.p009v4.view.ActionProvider
        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }

        @Override // android.support.p009v4.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            this.mListener = visibilityListener;
            this.mInner.setVisibilityListener(visibilityListener != null ? this : null);
        }
    }

    MenuItemWrapperJB(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p012v7.view.menu.MenuItemWrapperICS
    public MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(android.view.ActionProvider actionProvider) {
        return new ActionProviderWrapperJB(this.mContext, actionProvider);
    }
}
