package android.support.p012v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.p012v7.app.AppCompatDelegateImplV14;
import android.view.ActionMode;
import android.view.Window;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AppCompatDelegateImplV23 */
public class AppCompatDelegateImplV23 extends AppCompatDelegateImplV14 {
    private final UiModeManager mUiModeManager;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV23$AppCompatWindowCallbackV23 */
    public class AppCompatWindowCallbackV23 extends AppCompatDelegateImplV14.AppCompatWindowCallbackV14 {
        AppCompatWindowCallbackV23(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.p012v7.view.WindowCallbackWrapper, android.support.p012v7.app.AppCompatDelegateImplV14.AppCompatWindowCallbackV14
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.support.p012v7.view.WindowCallbackWrapper
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!AppCompatDelegateImplV23.this.isHandleNativeActionModesEnabled() || i != 0) ? super.onWindowStartingActionMode(callback, i) : startAsSupportActionMode(callback);
        }
    }

    AppCompatDelegateImplV23(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
        this.mUiModeManager = (UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p012v7.app.AppCompatDelegateImplV14
    public int mapNightMode(int i) {
        if (i == 0 && this.mUiModeManager.getNightMode() == 0) {
            return -1;
        }
        return super.mapNightMode(i);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p012v7.app.AppCompatDelegateImplBase, android.support.p012v7.app.AppCompatDelegateImplV14
    public Window.Callback wrapWindowCallback(Window.Callback callback) {
        return new AppCompatWindowCallbackV23(callback);
    }
}
