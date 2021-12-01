package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.p007d.p008j.C0064h;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    protected int[] f103a;

    /* renamed from: b */
    protected int f104b;

    /* renamed from: c */
    protected Context f105c;

    /* renamed from: d */
    protected C0064h f106d;

    /* renamed from: e */
    protected boolean f107e;

    /* renamed from: f */
    private String f108f;

    public ConstraintHelper(Context context) {
        super(context);
        this.f103a = new int[32];
        this.f104b = 0;
        this.f106d = null;
        this.f107e = false;
        this.f105c = context;
        mo34b(null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f103a = new int[32];
        this.f104b = 0;
        this.f106d = null;
        this.f107e = false;
        this.f105c = context;
        mo34b(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f103a = new int[32];
        this.f104b = 0;
        this.f106d = null;
        this.f107e = false;
        this.f105c = context;
        mo34b(attributeSet);
    }

    /* renamed from: a */
    private void m40a(String str) {
        int i;
        Object c;
        if (str != null && this.f105c != null) {
            String trim = str.trim();
            try {
                i = C0037b.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f105c.getResources().getIdentifier(trim, "id", this.f105c.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (c = ((ConstraintLayout) getParent()).mo49c(0, trim)) != null && (c instanceof Integer)) {
                i = ((Integer) c).intValue();
            }
            if (i != 0) {
                setTag(i, null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m40a(str.substring(i));
                    return;
                } else {
                    m40a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo34b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0038c.f340a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0038c.f367j) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f108f = string;
                    setIds(string);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo37c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void mo38d(ConstraintLayout constraintLayout) {
    }

    /* renamed from: e */
    public void mo39e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f108f);
        }
        C0064h hVar = this.f106d;
        if (hVar != null) {
            hVar.mo294A0();
            for (int i = 0; i < this.f104b; i++) {
                View findViewById = constraintLayout.findViewById(this.f103a[i]);
                if (findViewById != null) {
                    this.f106d.mo295z0(constraintLayout.mo53f(findViewById));
                }
            }
        }
    }

    /* renamed from: f */
    public void mo40f() {
        if (this.f106d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f176k0 = this.f106d;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f103a, this.f104b);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f107e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f104b = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f104b + 1;
        int[] iArr = this.f103a;
        if (i2 > iArr.length) {
            this.f103a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f103a;
        int i3 = this.f104b;
        iArr2[i3] = i;
        this.f104b = i3 + 1;
    }
}
