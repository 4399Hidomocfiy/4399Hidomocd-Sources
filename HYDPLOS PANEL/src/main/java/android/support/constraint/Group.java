package android.support.constraint;

import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;

public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintHelper
    /* renamed from: b */
    public void mo34b(AttributeSet attributeSet) {
        super.mo34b(attributeSet);
        this.f107e = false;
    }

    @Override // android.support.constraint.ConstraintHelper
    /* renamed from: c */
    public void mo37c(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f176k0.mo251p0(0);
        layoutParams.f176k0.mo218T(0);
    }

    @Override // android.support.constraint.ConstraintHelper
    /* renamed from: e */
    public void mo39e(ConstraintLayout constraintLayout) {
        int i = Build.VERSION.SDK_INT;
        int visibility = getVisibility();
        float elevation = i >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f104b; i2++) {
            View e = constraintLayout.mo52e(this.f103a[i2]);
            if (e != null) {
                e.setVisibility(visibility);
                if (elevation > 0.0f && i >= 21) {
                    e.setElevation(elevation);
                }
            }
        }
    }
}
