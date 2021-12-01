package android.support.p012v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.TintResources */
public class TintResources extends ResourcesWrapper {
    private final WeakReference<Context> mContextRef;

    public TintResources(Context context, Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    @Override // android.support.p012v7.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.mContextRef.get();
        if (!(drawable == null || context == null)) {
            AppCompatDrawableManager.get();
            AppCompatDrawableManager.tintDrawableUsingColorFilter(context, i, drawable);
        }
        return drawable;
    }
}
