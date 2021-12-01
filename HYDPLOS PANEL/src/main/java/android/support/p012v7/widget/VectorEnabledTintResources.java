package android.support.p012v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p012v7.app.AppCompatDelegate;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.VectorEnabledTintResources */
public class VectorEnabledTintResources extends Resources {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private final WeakReference<Context> mContextRef;

    public VectorEnabledTintResources(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mContextRef = new WeakReference<>(context);
    }

    public static boolean shouldBeUsed() {
        return AppCompatDelegate.isCompatVectorFromResourcesEnabled() && Build.VERSION.SDK_INT <= 20;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.mContextRef.get();
        return context != null ? AppCompatDrawableManager.get().onDrawableLoadedFromResources(context, this, i) : super.getDrawable(i);
    }

    /* access modifiers changed from: package-private */
    public final Drawable superGetDrawable(int i) {
        return super.getDrawable(i);
    }
}
