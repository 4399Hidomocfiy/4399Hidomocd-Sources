package android.support.p012v7.app;

import android.content.Context;
import android.support.p012v7.app.AppCompatDelegateImplV23;
import android.support.p012v7.app.AppCompatDelegateImplV9;
import android.support.p012v7.view.menu.MenuBuilder;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AppCompatDelegateImplN */
public class AppCompatDelegateImplN extends AppCompatDelegateImplV23 {

    /* renamed from: android.support.v7.app.AppCompatDelegateImplN$AppCompatWindowCallbackN */
    class AppCompatWindowCallbackN extends AppCompatDelegateImplV23.AppCompatWindowCallbackV23 {
        AppCompatWindowCallbackN(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.p012v7.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder;
            AppCompatDelegateImplV9.PanelFeatureState panelState = AppCompatDelegateImplN.this.getPanelState(0, true);
            if (panelState == null || (menuBuilder = panelState.menu) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            }
        }
    }

    AppCompatDelegateImplN(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p012v7.app.AppCompatDelegateImplV23, android.support.p012v7.app.AppCompatDelegateImplBase, android.support.p012v7.app.AppCompatDelegateImplV14
    public Window.Callback wrapWindowCallback(Window.Callback callback) {
        return new AppCompatWindowCallbackN(callback);
    }
}
