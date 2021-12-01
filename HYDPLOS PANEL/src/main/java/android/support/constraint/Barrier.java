package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.p007d.p008j.C0050a;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {

    /* renamed from: g */
    private int f100g = 0;

    /* renamed from: h */
    private int f101h = 0;

    /* renamed from: i */
    private C0050a f102i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.constraint.ConstraintHelper
    /* renamed from: b */
    public void mo34b(AttributeSet attributeSet) {
        super.mo34b(attributeSet);
        this.f102i = new C0050a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0038c.f340a);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0038c.f361h) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0038c.f358g) {
                    this.f102i.mo178B0(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f106d = this.f102i;
        mo40f();
    }

    public int getType() {
        return this.f100g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r7 == 6) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r7 == 6) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r7) {
        /*
            r6 = this;
            r6.f100g = r7
            r6.f101h = r7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            r2 = 5
            r3 = 0
            r4 = 1
            r5 = 17
            if (r0 >= r5) goto L_0x0018
            if (r7 != r2) goto L_0x0013
        L_0x0010:
            r6.f101h = r3
            goto L_0x003b
        L_0x0013:
            if (r7 != r1) goto L_0x003b
        L_0x0015:
            r6.f101h = r4
            goto L_0x003b
        L_0x0018:
            android.content.res.Resources r7 = r6.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            if (r4 != r7) goto L_0x0028
            r7 = 1
            goto L_0x0029
        L_0x0028:
            r7 = 0
        L_0x0029:
            if (r7 == 0) goto L_0x0033
            int r7 = r6.f100g
            if (r7 != r2) goto L_0x0030
            goto L_0x0015
        L_0x0030:
            if (r7 != r1) goto L_0x003b
            goto L_0x0010
        L_0x0033:
            int r7 = r6.f100g
            if (r7 != r2) goto L_0x0038
            goto L_0x0010
        L_0x0038:
            if (r7 != r1) goto L_0x003b
            goto L_0x0015
        L_0x003b:
            android.support.constraint.d.j.a r7 = r6.f102i
            int r0 = r6.f101h
            r7.mo179C0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.Barrier.setType(int):void");
    }
}
