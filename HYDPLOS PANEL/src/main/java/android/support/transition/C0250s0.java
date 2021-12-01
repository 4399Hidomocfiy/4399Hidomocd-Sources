package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: android.support.transition.s0 */
class C0250s0 implements AbstractC0252t0 {

    /* renamed from: a */
    private final ViewOverlay f959a;

    C0250s0(View view) {
        this.f959a = view.getOverlay();
    }

    @Override // android.support.transition.AbstractC0252t0
    /* renamed from: b */
    public void mo1565b(Drawable drawable) {
        this.f959a.add(drawable);
    }

    @Override // android.support.transition.AbstractC0252t0
    /* renamed from: d */
    public void mo1566d(Drawable drawable) {
        this.f959a.remove(drawable);
    }
}
