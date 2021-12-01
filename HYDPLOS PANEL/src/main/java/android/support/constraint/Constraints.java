package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {

    /* renamed from: a */
    C0034a f194a;

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: m0 */
        public float f195m0;

        /* renamed from: n0 */
        public boolean f196n0;

        /* renamed from: o0 */
        public float f197o0;

        /* renamed from: p0 */
        public float f198p0;

        /* renamed from: q0 */
        public float f199q0;

        /* renamed from: r0 */
        public float f200r0;

        /* renamed from: s0 */
        public float f201s0;

        /* renamed from: t0 */
        public float f202t0;

        /* renamed from: u0 */
        public float f203u0;

        /* renamed from: v0 */
        public float f204v0;

        /* renamed from: w0 */
        public float f205w0;

        /* renamed from: x0 */
        public float f206x0;

        /* renamed from: y0 */
        public float f207y0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f195m0 = 1.0f;
            this.f196n0 = false;
            this.f197o0 = 0.0f;
            this.f198p0 = 0.0f;
            this.f199q0 = 0.0f;
            this.f200r0 = 0.0f;
            this.f201s0 = 1.0f;
            this.f202t0 = 1.0f;
            this.f203u0 = 0.0f;
            this.f204v0 = 0.0f;
            this.f205w0 = 0.0f;
            this.f206x0 = 0.0f;
            this.f207y0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            float f;
            this.f195m0 = 1.0f;
            this.f196n0 = false;
            this.f197o0 = 0.0f;
            this.f198p0 = 0.0f;
            this.f199q0 = 0.0f;
            this.f200r0 = 0.0f;
            this.f201s0 = 1.0f;
            this.f202t0 = 1.0f;
            this.f203u0 = 0.0f;
            this.f204v0 = 0.0f;
            this.f205w0 = 0.0f;
            this.f206x0 = 0.0f;
            this.f207y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0038c.f374l0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0038c.f404v0) {
                    this.f195m0 = obtainStyledAttributes.getFloat(index, this.f195m0);
                } else if (index == C0038c.f305I0) {
                    this.f197o0 = obtainStyledAttributes.getFloat(index, this.f197o0);
                    this.f196n0 = true;
                } else if (index == C0038c.f295D0) {
                    this.f199q0 = obtainStyledAttributes.getFloat(index, this.f199q0);
                } else if (index == C0038c.f297E0) {
                    this.f200r0 = obtainStyledAttributes.getFloat(index, this.f200r0);
                } else if (index == C0038c.f293C0) {
                    this.f198p0 = obtainStyledAttributes.getFloat(index, this.f198p0);
                } else if (index == C0038c.f287A0) {
                    this.f201s0 = obtainStyledAttributes.getFloat(index, this.f201s0);
                } else if (index == C0038c.f290B0) {
                    this.f202t0 = obtainStyledAttributes.getFloat(index, this.f202t0);
                } else if (index == C0038c.f407w0) {
                    this.f203u0 = obtainStyledAttributes.getFloat(index, this.f203u0);
                } else if (index == C0038c.f410x0) {
                    this.f204v0 = obtainStyledAttributes.getFloat(index, this.f204v0);
                } else {
                    if (index == C0038c.f413y0) {
                        f = this.f205w0;
                    } else if (index == C0038c.f416z0) {
                        this.f206x0 = obtainStyledAttributes.getFloat(index, this.f206x0);
                    } else if (index == C0038c.f303H0) {
                        f = this.f207y0;
                    }
                    this.f205w0 = obtainStyledAttributes.getFloat(index, f);
                }
            }
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: c */
    private void m62c(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public C0034a getConstraintSet() {
        if (this.f194a == null) {
            this.f194a = new C0034a();
        }
        this.f194a.mo101b(this);
        return this.f194a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
