package android.support.p012v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p009v4.view.GravityCompat;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p012v7.app.ActionBarDrawerToggleHoneycomb;
import android.support.p012v7.graphics.drawable.DrawerArrowDrawable;
import android.support.p012v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.app.ActionBarDrawerToggle */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mDrawerSlideAnimationEnabled;
    private boolean mHasCustomUpIndicator;
    private Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private DrawerArrowDrawable mSlider;
    View.OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$Delegate */
    public interface Delegate {
        Context getActionBarThemedContext();

        Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(int i);

        void setActionBarUpIndicator(Drawable drawable, int i);
    }

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$DelegateProvider */
    public interface DelegateProvider {
        Delegate getDrawerToggleDelegate();
    }

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$DummyDelegate */
    static class DummyDelegate implements Delegate {
        final Activity mActivity;

        DummyDelegate(Activity activity) {
            this.mActivity = activity;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return this.mActivity;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            return null;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            return true;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
        }
    }

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$HoneycombDelegate */
    private static class HoneycombDelegate implements Delegate {
        final Activity mActivity;
        ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;

        HoneycombDelegate(Activity activity) {
            this.mActivity = activity;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return this.mActivity;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(this.mActivity);
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            ActionBar actionBar = this.mActivity.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            this.mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(this.mSetIndicatorInfo, this.mActivity, i);
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }
    }

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$IcsDelegate */
    private static class IcsDelegate extends HoneycombDelegate {
        IcsDelegate(Activity activity) {
            super(activity);
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.HoneycombDelegate, android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            ActionBar actionBar = this.mActivity.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.mActivity;
        }
    }

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$JellybeanMr2Delegate */
    private static class JellybeanMr2Delegate implements Delegate {
        final Activity mActivity;

        JellybeanMr2Delegate(Activity activity) {
            this.mActivity = activity;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            ActionBar actionBar = this.mActivity.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.mActivity;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TypedArray obtainStyledAttributes = getActionBarThemedContext().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            ActionBar actionBar = this.mActivity.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }
    }

    /* renamed from: android.support.v7.app.ActionBarDrawerToggle$ToolbarCompatDelegate */
    static class ToolbarCompatDelegate implements Delegate {
        final CharSequence mDefaultContentDescription;
        final Drawable mDefaultUpIndicator;
        final Toolbar mToolbar;

        ToolbarCompatDelegate(Toolbar toolbar) {
            this.mToolbar = toolbar;
            this.mDefaultUpIndicator = toolbar.getNavigationIcon();
            this.mDefaultContentDescription = toolbar.getNavigationContentDescription();
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return this.mToolbar.getContext();
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            return this.mDefaultUpIndicator;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            return true;
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            if (i == 0) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultContentDescription);
            } else {
                this.mToolbar.setNavigationContentDescription(i);
            }
        }

        @Override // android.support.p012v7.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            this.mToolbar.setNavigationIcon(drawable);
            setActionBarDescription(i);
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    ActionBarDrawerToggle(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, DrawerArrowDrawable drawerArrowDrawable, int i, int i2) {
        this.mDrawerSlideAnimationEnabled = true;
        this.mDrawerIndicatorEnabled = true;
        this.mWarnedForDisplayHomeAsUp = false;
        if (toolbar != null) {
            this.mActivityImpl = new ToolbarCompatDelegate(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                /* class android.support.p012v7.app.ActionBarDrawerToggle.View$OnClickListenerC04411 */

                public void onClick(View view) {
                    ActionBarDrawerToggle actionBarDrawerToggle = ActionBarDrawerToggle.this;
                    if (actionBarDrawerToggle.mDrawerIndicatorEnabled) {
                        actionBarDrawerToggle.toggle();
                        return;
                    }
                    View.OnClickListener onClickListener = actionBarDrawerToggle.mToolbarNavigationClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        } else if (activity instanceof DelegateProvider) {
            this.mActivityImpl = ((DelegateProvider) activity).getDrawerToggleDelegate();
        } else {
            int i3 = Build.VERSION.SDK_INT;
            this.mActivityImpl = i3 >= 18 ? new JellybeanMr2Delegate(activity) : i3 >= 14 ? new IcsDelegate(activity) : i3 >= 11 ? new HoneycombDelegate(activity) : new DummyDelegate(activity);
        }
        this.mDrawerLayout = drawerLayout;
        this.mOpenDrawerContentDescRes = i;
        this.mCloseDrawerContentDescRes = i2;
        if (drawerArrowDrawable == null) {
            this.mSlider = new DrawerArrowDrawable(this.mActivityImpl.getActionBarThemedContext());
        } else {
            this.mSlider = drawerArrowDrawable;
        }
        this.mHomeAsUpIndicator = getThemeUpIndicator();
    }

    private void setPosition(float f) {
        DrawerArrowDrawable drawerArrowDrawable;
        boolean z;
        if (f == 1.0f) {
            drawerArrowDrawable = this.mSlider;
            z = true;
        } else {
            if (f == 0.0f) {
                drawerArrowDrawable = this.mSlider;
                z = false;
            }
            this.mSlider.setProgress(f);
        }
        drawerArrowDrawable.setVerticalMirror(z);
        this.mSlider.setProgress(f);
    }

    public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.mSlider;
    }

    /* access modifiers changed from: package-private */
    public Drawable getThemeUpIndicator() {
        return this.mActivityImpl.getThemeUpIndicator();
    }

    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.mToolbarNavigationClickListener;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.mDrawerSlideAnimationEnabled;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mHasCustomUpIndicator) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
        }
        syncState();
    }

    @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.mDrawerSlideAnimationEnabled) {
            setPosition(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            setPosition(0.0f);
        }
    }

    @Override // android.support.p009v4.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.mDrawerIndicatorEnabled) {
            return false;
        }
        toggle();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setActionBarDescription(int i) {
        this.mActivityImpl.setActionBarDescription(i);
    }

    /* access modifiers changed from: package-private */
    public void setActionBarUpIndicator(Drawable drawable, int i) {
        if (!this.mWarnedForDisplayHomeAsUp && !this.mActivityImpl.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.mWarnedForDisplayHomeAsUp = true;
        }
        this.mActivityImpl.setActionBarUpIndicator(drawable, i);
    }

    public void setDrawerArrowDrawable(DrawerArrowDrawable drawerArrowDrawable) {
        this.mSlider = drawerArrowDrawable;
        syncState();
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        int i;
        Drawable drawable;
        if (z != this.mDrawerIndicatorEnabled) {
            if (z) {
                drawable = this.mSlider;
                i = this.mDrawerLayout.isDrawerOpen(GravityCompat.START) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes;
            } else {
                drawable = this.mHomeAsUpIndicator;
                i = 0;
            }
            setActionBarUpIndicator(drawable, i);
            this.mDrawerIndicatorEnabled = z;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean z) {
        this.mDrawerSlideAnimationEnabled = z;
        if (!z) {
            setPosition(0.0f);
        }
    }

    public void setHomeAsUpIndicator(int i) {
        setHomeAsUpIndicator(i != 0 ? this.mDrawerLayout.getResources().getDrawable(i) : null);
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        if (drawable == null) {
            this.mHomeAsUpIndicator = getThemeUpIndicator();
            this.mHasCustomUpIndicator = false;
        } else {
            this.mHomeAsUpIndicator = drawable;
            this.mHasCustomUpIndicator = true;
        }
        if (!this.mDrawerIndicatorEnabled) {
            setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
        }
    }

    public void setToolbarNavigationClickListener(View.OnClickListener onClickListener) {
        this.mToolbarNavigationClickListener = onClickListener;
    }

    public void syncState() {
        setPosition(this.mDrawerLayout.isDrawerOpen(GravityCompat.START) ? 1.0f : 0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarUpIndicator(this.mSlider, this.mDrawerLayout.isDrawerOpen(GravityCompat.START) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes);
        }
    }

    /* access modifiers changed from: package-private */
    public void toggle() {
        int drawerLockMode = this.mDrawerLayout.getDrawerLockMode(GravityCompat.START);
        if (this.mDrawerLayout.isDrawerVisible(GravityCompat.START) && drawerLockMode != 2) {
            this.mDrawerLayout.closeDrawer(GravityCompat.START);
        } else if (drawerLockMode != 1) {
            this.mDrawerLayout.openDrawer(GravityCompat.START);
        }
    }
}
