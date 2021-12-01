package android.support.p012v7.widget;

import android.content.Context;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.view.SupportMenuInflater;
import android.support.p012v7.view.menu.MenuBuilder;
import android.support.p012v7.view.menu.MenuPopupHelper;
import android.support.p012v7.view.menu.ShowableListMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.PopupMenu */
public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private View.OnTouchListener mDragListener;
    private final MenuBuilder mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final MenuPopupHelper mPopup;

    /* renamed from: android.support.v7.widget.PopupMenu$OnDismissListener */
    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    /* renamed from: android.support.v7.widget.PopupMenu$OnMenuItemClickListener */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i) {
        this(context, view, i, C0467R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        this.mMenu = menuBuilder;
        menuBuilder.setCallback(new MenuBuilder.Callback() {
            /* class android.support.p012v7.widget.PopupMenu.C05291 */

            @Override // android.support.p012v7.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.mMenuItemClickListener;
                if (onMenuItemClickListener != null) {
                    return onMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }

            @Override // android.support.p012v7.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(context, menuBuilder, view, false, i2, i3);
        this.mPopup = menuPopupHelper;
        menuPopupHelper.setGravity(i);
        menuPopupHelper.setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class android.support.p012v7.widget.PopupMenu.C05302 */

            public void onDismiss() {
                PopupMenu popupMenu = PopupMenu.this;
                OnDismissListener onDismissListener = popupMenu.mOnDismissListener;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(popupMenu);
                }
            }
        });
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) {
                /* class android.support.p012v7.widget.PopupMenu.C05313 */

                @Override // android.support.p012v7.widget.ForwardingListener
                public ShowableListMenu getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }

                /* access modifiers changed from: protected */
                @Override // android.support.p012v7.widget.ForwardingListener
                public boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }

                /* access modifiers changed from: protected */
                @Override // android.support.p012v7.widget.ForwardingListener
                public boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
            };
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContext);
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void setGravity(int i) {
        this.mPopup.setGravity(i);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.show();
    }
}
