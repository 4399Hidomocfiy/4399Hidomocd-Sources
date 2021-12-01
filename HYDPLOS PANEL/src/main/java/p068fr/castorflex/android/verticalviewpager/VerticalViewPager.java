package p068fr.castorflex.android.verticalviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p009v4.p011os.ParcelableCompat;
import android.support.p009v4.p011os.ParcelableCompatCreatorCallbacks;
import android.support.p009v4.view.AccessibilityDelegateCompat;
import android.support.p009v4.view.KeyEventCompat;
import android.support.p009v4.view.MotionEventCompat;
import android.support.p009v4.view.PagerAdapter;
import android.support.p009v4.view.VelocityTrackerCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.ViewConfigurationCompat;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.p009v4.view.accessibility.AccessibilityRecordCompat;
import android.support.p009v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager */
public class VerticalViewPager extends ViewGroup {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;

    /* renamed from: e0 */
    private static final int[] f3526e0 = {16842931};

    /* renamed from: f0 */
    private static final Comparator<C1475d> f3527f0 = new C1472a();

    /* renamed from: g0 */
    private static final Interpolator f3528g0 = new animationInterpolatorC1473b();

    /* renamed from: h0 */
    private static final C1479h f3529h0 = new C1479h();

    /* renamed from: A */
    private int f3530A;

    /* renamed from: B */
    private float f3531B;

    /* renamed from: C */
    private float f3532C;

    /* renamed from: D */
    private float f3533D;

    /* renamed from: E */
    private float f3534E;

    /* renamed from: F */
    private int f3535F = -1;

    /* renamed from: G */
    private VelocityTracker f3536G;

    /* renamed from: H */
    private int f3537H;

    /* renamed from: I */
    private int f3538I;

    /* renamed from: J */
    private int f3539J;

    /* renamed from: K */
    private int f3540K;

    /* renamed from: L */
    private boolean f3541L;

    /* renamed from: M */
    private long f3542M;

    /* renamed from: N */
    private EdgeEffectCompat f3543N;

    /* renamed from: O */
    private EdgeEffectCompat f3544O;

    /* renamed from: P */
    private boolean f3545P = true;

    /* renamed from: Q */
    private boolean f3546Q;

    /* renamed from: R */
    private int f3547R;

    /* renamed from: S */
    private ViewPager.OnPageChangeListener f3548S;

    /* renamed from: T */
    private ViewPager.OnPageChangeListener f3549T;

    /* renamed from: U */
    private AbstractC1477f f3550U;

    /* renamed from: V */
    private ViewPager.PageTransformer f3551V;

    /* renamed from: W */
    private Method f3552W;

    /* renamed from: a */
    private int f3553a;

    /* renamed from: a0 */
    private int f3554a0;

    /* renamed from: b */
    private final ArrayList<C1475d> f3555b = new ArrayList<>();

    /* renamed from: b0 */
    private ArrayList<View> f3556b0;

    /* renamed from: c */
    private final C1475d f3557c = new C1475d();

    /* renamed from: c0 */
    private final Runnable f3558c0 = new RunnableC1474c();

    /* renamed from: d */
    private final Rect f3559d = new Rect();

    /* renamed from: d0 */
    private int f3560d0 = 0;

    /* renamed from: e */
    private PagerAdapter f3561e;

    /* renamed from: f */
    private int f3562f;

    /* renamed from: g */
    private int f3563g = -1;

    /* renamed from: h */
    private Parcelable f3564h = null;

    /* renamed from: i */
    private ClassLoader f3565i = null;

    /* renamed from: j */
    private Scroller f3566j;

    /* renamed from: k */
    private C1478g f3567k;

    /* renamed from: l */
    private int f3568l;

    /* renamed from: m */
    private Drawable f3569m;

    /* renamed from: n */
    private int f3570n;

    /* renamed from: o */
    private int f3571o;

    /* renamed from: p */
    private float f3572p = -3.4028235E38f;

    /* renamed from: q */
    private float f3573q = Float.MAX_VALUE;

    /* renamed from: r */
    private int f3574r;

    /* renamed from: s */
    private boolean f3575s;

    /* renamed from: t */
    private boolean f3576t;

    /* renamed from: u */
    private boolean f3577u;

    /* renamed from: v */
    private int f3578v = 1;

    /* renamed from: w */
    private boolean f3579w;

    /* renamed from: x */
    private boolean f3580x;

    /* renamed from: y */
    private int f3581y;

    /* renamed from: z */
    private int f3582z;

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$LayoutParams */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3583a;

        /* renamed from: b */
        public int f3584b;

        /* renamed from: c */
        float f3585c = 0.0f;

        /* renamed from: d */
        boolean f3586d;

        /* renamed from: e */
        int f3587e;

        /* renamed from: f */
        int f3588f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f3526e0);
            this.f3584b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new C1471a());

        /* renamed from: a */
        int f3589a;

        /* renamed from: b */
        Parcelable f3590b;

        /* renamed from: c */
        ClassLoader f3591c;

        /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$SavedState$a */
        static class C1471a implements ParcelableCompatCreatorCallbacks<SavedState> {
            C1471a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3589a = parcel.readInt();
            this.f3590b = parcel.readParcelable(classLoader);
            this.f3591c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3589a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3589a);
            parcel.writeParcelable(this.f3590b, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$a */
    public static class C1472a implements Comparator<C1475d> {
        C1472a() {
        }

        /* renamed from: a */
        public int compare(C1475d dVar, C1475d dVar2) {
            return dVar.f3594b - dVar2.f3594b;
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$b  reason: invalid class name */
    static class animationInterpolatorC1473b implements Interpolator {
        animationInterpolatorC1473b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$c */
    class RunnableC1474c implements Runnable {
        RunnableC1474c() {
        }

        public void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.mo12264A();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$d */
    public static class C1475d {

        /* renamed from: a */
        Object f3593a;

        /* renamed from: b */
        int f3594b;

        /* renamed from: c */
        boolean f3595c;

        /* renamed from: d */
        float f3596d;

        /* renamed from: e */
        float f3597e;

        C1475d() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$e */
    public class C1476e extends AccessibilityDelegateCompat {
        C1476e() {
        }

        private boolean canScroll() {
            return VerticalViewPager.this.f3561e != null && VerticalViewPager.this.f3561e.getCount() > 1;
        }

        @Override // android.support.p009v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat obtain = AccessibilityRecordCompat.obtain();
            obtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f3561e != null) {
                obtain.setItemCount(VerticalViewPager.this.f3561e.getCount());
                obtain.setFromIndex(VerticalViewPager.this.f3562f);
                obtain.setToIndex(VerticalViewPager.this.f3562f);
            }
        }

        @Override // android.support.p009v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (VerticalViewPager.this.internalCanScrollVertically(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (VerticalViewPager.this.internalCanScrollVertically(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // android.support.p009v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            VerticalViewPager verticalViewPager;
            int i2;
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !VerticalViewPager.this.internalCanScrollVertically(-1)) {
                    return false;
                }
                verticalViewPager = VerticalViewPager.this;
                i2 = verticalViewPager.f3562f - 1;
            } else if (!VerticalViewPager.this.internalCanScrollVertically(1)) {
                return false;
            } else {
                verticalViewPager = VerticalViewPager.this;
                i2 = verticalViewPager.f3562f + 1;
            }
            verticalViewPager.setCurrentItem(i2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$f */
    public interface AbstractC1477f {
        /* renamed from: a */
        void mo12336a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* access modifiers changed from: private */
    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$g */
    public class C1478g extends DataSetObserver {
        private C1478g() {
        }

        /* synthetic */ C1478g(VerticalViewPager verticalViewPager, C1472a aVar) {
            this();
        }

        public void onChanged() {
            VerticalViewPager.this.mo12293i();
        }

        public void onInvalidated() {
            VerticalViewPager.this.mo12293i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.castorflex.android.verticalviewpager.VerticalViewPager$h */
    public static class C1479h implements Comparator<View> {
        C1479h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f3583a;
            return z != layoutParams2.f3583a ? z ? 1 : -1 : layoutParams.f3587e - layoutParams2.f3587e;
        }
    }

    public VerticalViewPager(Context context) {
        super(context);
        mo12312s();
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo12312s();
    }

    /* renamed from: C */
    private void m4067C(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f3555b.isEmpty()) {
            C1475d r = mo12310r(this.f3562f);
            int min = (int) ((r != null ? Math.min(r.f3597e, this.f3573q) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m4077h(false);
                scrollTo(getScrollX(), min);
                return;
            }
            return;
        }
        int scrollY = (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
        scrollTo(getScrollX(), scrollY);
        if (!this.f3566j.isFinished()) {
            this.f3566j.startScroll(0, scrollY, 0, (int) (mo12310r(this.f3562f).f3597e * ((float) i)), this.f3566j.getDuration() - this.f3566j.timePassed());
        }
    }

    /* renamed from: D */
    private void m4068D() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f3583a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: E */
    private void m4069E(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: F */
    private void m4070F(int i, boolean z, int i2, boolean z2) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        ViewPager.OnPageChangeListener onPageChangeListener3;
        ViewPager.OnPageChangeListener onPageChangeListener4;
        C1475d r = mo12310r(i);
        int clientHeight = r != null ? (int) (((float) getClientHeight()) * Math.max(this.f3572p, Math.min(r.f3597e, this.f3573q))) : 0;
        if (z) {
            mo12268I(0, clientHeight, i2);
            if (z2 && (onPageChangeListener4 = this.f3548S) != null) {
                onPageChangeListener4.onPageSelected(i);
            }
            if (z2 && (onPageChangeListener3 = this.f3549T) != null) {
                onPageChangeListener3.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && (onPageChangeListener2 = this.f3548S) != null) {
            onPageChangeListener2.onPageSelected(i);
        }
        if (z2 && (onPageChangeListener = this.f3549T) != null) {
            onPageChangeListener.onPageSelected(i);
        }
        m4077h(false);
        scrollTo(0, clientHeight);
        m4085x(clientHeight);
    }

    /* renamed from: J */
    private void m4071J() {
        if (this.f3554a0 != 0) {
            ArrayList<View> arrayList = this.f3556b0;
            if (arrayList == null) {
                this.f3556b0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3556b0.add(getChildAt(i));
            }
            Collections.sort(this.f3556b0, f3529h0);
        }
    }

    /* renamed from: f */
    private void m4076f(C1475d dVar, int i, C1475d dVar2) {
        int i2;
        int i3;
        C1475d dVar3;
        C1475d dVar4;
        int count = this.f3561e.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f3568l) / ((float) clientHeight) : 0.0f;
        if (dVar2 != null) {
            int i4 = dVar2.f3594b;
            int i5 = dVar.f3594b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = dVar2.f3597e + dVar2.f3596d + f;
                while (true) {
                    i4++;
                    if (i4 > dVar.f3594b || i6 >= this.f3555b.size()) {
                        break;
                    }
                    while (true) {
                        dVar4 = this.f3555b.get(i6);
                        if (i4 > dVar4.f3594b && i6 < this.f3555b.size() - 1) {
                            i6++;
                        }
                    }
                    while (i4 < dVar4.f3594b) {
                        f2 += this.f3561e.getPageWidth(i4) + f;
                        i4++;
                    }
                    dVar4.f3597e = f2;
                    f2 += dVar4.f3596d + f;
                }
            } else if (i4 > i5) {
                int size = this.f3555b.size() - 1;
                float f3 = dVar2.f3597e;
                while (true) {
                    i4--;
                    if (i4 < dVar.f3594b || size < 0) {
                        break;
                    }
                    while (true) {
                        dVar3 = this.f3555b.get(size);
                        if (i4 < dVar3.f3594b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > dVar3.f3594b) {
                        f3 -= this.f3561e.getPageWidth(i4) + f;
                        i4--;
                    }
                    f3 -= dVar3.f3596d + f;
                    dVar3.f3597e = f3;
                }
            }
        }
        int size2 = this.f3555b.size();
        float f4 = dVar.f3597e;
        int i7 = dVar.f3594b;
        int i8 = i7 - 1;
        this.f3572p = i7 == 0 ? f4 : -3.4028235E38f;
        int i9 = count - 1;
        this.f3573q = i7 == i9 ? (dVar.f3596d + f4) - 1.0f : Float.MAX_VALUE;
        int i10 = i - 1;
        while (i10 >= 0) {
            C1475d dVar5 = this.f3555b.get(i10);
            while (true) {
                i3 = dVar5.f3594b;
                if (i8 <= i3) {
                    break;
                }
                f4 -= this.f3561e.getPageWidth(i8) + f;
                i8--;
            }
            f4 -= dVar5.f3596d + f;
            dVar5.f3597e = f4;
            if (i3 == 0) {
                this.f3572p = f4;
            }
            i10--;
            i8--;
        }
        float f5 = dVar.f3597e + dVar.f3596d + f;
        int i11 = dVar.f3594b + 1;
        int i12 = i + 1;
        while (i12 < size2) {
            C1475d dVar6 = this.f3555b.get(i12);
            while (true) {
                i2 = dVar6.f3594b;
                if (i11 >= i2) {
                    break;
                }
                f5 += this.f3561e.getPageWidth(i11) + f;
                i11++;
            }
            if (i2 == i9) {
                this.f3573q = (dVar6.f3596d + f5) - 1.0f;
            }
            dVar6.f3597e = f5;
            f5 += dVar6.f3596d + f;
            i12++;
            i11++;
        }
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: h */
    private void m4077h(boolean z) {
        boolean z2 = this.f3560d0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f3566j.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f3566j.getCurrX();
            int currY = this.f3566j.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f3577u = false;
        for (int i = 0; i < this.f3555b.size(); i++) {
            C1475d dVar = this.f3555b.get(i);
            if (dVar.f3595c) {
                dVar.f3595c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.postOnAnimation(this, this.f3558c0);
        } else {
            this.f3558c0.run();
        }
    }

    /* renamed from: j */
    private int m4078j(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f3539J || Math.abs(i2) <= this.f3537H) {
            i = (int) (((float) i) + f + (i >= this.f3562f ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f3555b.size() <= 0) {
            return i;
        }
        ArrayList<C1475d> arrayList = this.f3555b;
        return Math.max(this.f3555b.get(0).f3594b, Math.min(i, arrayList.get(arrayList.size() - 1).f3594b));
    }

    /* renamed from: l */
    private void m4079l(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.setLayerType(getChildAt(i), z ? 2 : 0, null);
        }
    }

    /* renamed from: m */
    private void m4080m() {
        this.f3579w = false;
        this.f3580x = false;
        VelocityTracker velocityTracker = this.f3536G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3536G = null;
        }
    }

    /* renamed from: n */
    private Rect m4081n(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: q */
    private C1475d m4082q() {
        int i;
        int clientHeight = getClientHeight();
        float f = 0.0f;
        float scrollY = clientHeight > 0 ? ((float) getScrollY()) / ((float) clientHeight) : 0.0f;
        float f2 = clientHeight > 0 ? ((float) this.f3568l) / ((float) clientHeight) : 0.0f;
        C1475d dVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f3555b.size()) {
            C1475d dVar2 = this.f3555b.get(i3);
            if (!z && dVar2.f3594b != (i = i2 + 1)) {
                dVar2 = this.f3557c;
                dVar2.f3597e = f + f3 + f2;
                dVar2.f3594b = i;
                dVar2.f3596d = this.f3561e.getPageWidth(i);
                i3--;
            }
            f = dVar2.f3597e;
            float f4 = dVar2.f3596d + f + f2;
            if (!z && scrollY < f) {
                return dVar;
            }
            if (scrollY < f4 || i3 == this.f3555b.size() - 1) {
                return dVar2;
            }
            i2 = dVar2.f3594b;
            f3 = dVar2.f3596d;
            i3++;
            dVar = dVar2;
            z = false;
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollState(int i) {
        if (this.f3560d0 != i) {
            this.f3560d0 = i;
            if (this.f3551V != null) {
                m4079l(i != 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = this.f3548S;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3576t != z) {
            this.f3576t = z;
        }
    }

    /* renamed from: t */
    private boolean m4083t(float f, float f2) {
        return (f < ((float) this.f3582z) && f2 > 0.0f) || (f > ((float) (getHeight() - this.f3582z)) && f2 < 0.0f);
    }

    /* renamed from: v */
    private void m4084v(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f3535F) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3532C = MotionEventCompat.getY(motionEvent, i);
            this.f3535F = MotionEventCompat.getPointerId(motionEvent, i);
            VelocityTracker velocityTracker = this.f3536G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: x */
    private boolean m4085x(int i) {
        if (this.f3555b.size() == 0) {
            this.f3546Q = false;
            mo12324u(0, 0.0f, 0);
            if (this.f3546Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1475d q = m4082q();
        int clientHeight = getClientHeight();
        int i2 = this.f3568l;
        int i3 = clientHeight + i2;
        float f = (float) clientHeight;
        int i4 = q.f3594b;
        float f2 = ((((float) i) / f) - q.f3597e) / (q.f3596d + (((float) i2) / f));
        this.f3546Q = false;
        mo12324u(i4, f2, (int) (((float) i3) * f2));
        if (this.f3546Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: z */
    private boolean m4086z(float f) {
        boolean z;
        float f2 = this.f3532C - f;
        this.f3532C = f;
        float scrollY = ((float) getScrollY()) + f2;
        float clientHeight = (float) getClientHeight();
        float f3 = this.f3572p * clientHeight;
        float f4 = this.f3573q * clientHeight;
        boolean z2 = false;
        C1475d dVar = this.f3555b.get(0);
        ArrayList<C1475d> arrayList = this.f3555b;
        boolean z3 = true;
        C1475d dVar2 = arrayList.get(arrayList.size() - 1);
        if (dVar.f3594b != 0) {
            f3 = dVar.f3597e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (dVar2.f3594b != this.f3561e.getCount() - 1) {
            f4 = dVar2.f3597e * clientHeight;
            z3 = false;
        }
        if (scrollY < f3) {
            if (z) {
                z2 = this.f3543N.onPull(Math.abs(f3 - scrollY) / clientHeight);
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z3) {
                z2 = this.f3544O.onPull(Math.abs(scrollY - f4) / clientHeight);
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.f3531B += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m4085x(i);
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo12264A() {
        mo12265B(this.f3562f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r10 == r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        if (r11 >= 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d5, code lost:
        if (r11 >= 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        if (r11 >= 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ee, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0142, code lost:
        if (r5 < r17.f3555b.size()) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014d, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0160, code lost:
        if (r5 < r17.f3555b.size()) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0172, code lost:
        if (r5 < r17.f3555b.size()) goto L_0x0144;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12265B(int r18) {
        /*
        // Method dump skipped, instructions count: 597
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.mo12265B(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo12266G(int i, boolean z, boolean z2) {
        mo12267H(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo12267H(int i, boolean z, boolean z2, int i2) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        PagerAdapter pagerAdapter = this.f3561e;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3562f != i || this.f3555b.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3561e.getCount()) {
                i = this.f3561e.getCount() - 1;
            }
            int i3 = this.f3578v;
            int i4 = this.f3562f;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f3555b.size(); i5++) {
                    this.f3555b.get(i5).f3595c = true;
                }
            }
            if (this.f3562f != i) {
                z3 = true;
            }
            if (this.f3545P) {
                this.f3562f = i;
                if (z3 && (onPageChangeListener2 = this.f3548S) != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
                if (z3 && (onPageChangeListener = this.f3549T) != null) {
                    onPageChangeListener.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            mo12265B(i);
            m4070F(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo12268I(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i - scrollX;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m4077h(false);
            mo12264A();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i7 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i7;
        float k = f2 + (mo12296k(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(k / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i5)) / ((f * this.f3561e.getPageWidth(this.f3562f)) + ((float) this.f3568l))) + 1.0f) * 100.0f);
        }
        this.f3566j.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1475d p;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (p = mo12309p(childAt)) != null && p.f3594b == this.f3562f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C1475d p;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (p = mo12309p(childAt)) != null && p.f3594b == this.f3562f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f3583a | false;
        layoutParams2.f3583a = z;
        if (!this.f3575s) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !z) {
            layoutParams2.f3586d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.f3579w) {
            return false;
        }
        this.f3541L = true;
        setScrollState(1);
        this.f3532C = 0.0f;
        this.f3534E = 0.0f;
        VelocityTracker velocityTracker = this.f3536G;
        if (velocityTracker == null) {
            this.f3536G = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f3536G.addMovement(obtain);
        obtain.recycle();
        this.f3542M = uptimeMillis;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f3566j.isFinished() || !this.f3566j.computeScrollOffset()) {
            m4077h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3566j.getCurrX();
        int currY = this.f3566j.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m4085x(currY)) {
                this.f3566j.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1475d p;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (p = mo12309p(childAt)) != null && p.f3594b == this.f3562f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f3561e) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f3543N.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f3572p * ((float) height));
                this.f3543N.setSize(width, height);
                z = false | this.f3543N.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3544O.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f3573q + 1.0f)) * ((float) height2));
                this.f3544O.setSize(width2, height2);
                z |= this.f3544O.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3543N.finish();
            this.f3544O.finish();
        }
        if (z) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3569m;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1475d mo12280e(int i, int i2) {
        C1475d dVar = new C1475d();
        dVar.f3594b = i;
        dVar.f3593a = this.f3561e.instantiateItem((ViewGroup) this, i);
        dVar.f3596d = this.f3561e.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f3555b.size()) {
            this.f3555b.add(dVar);
        } else {
            this.f3555b.add(i2, dVar);
        }
        return dVar;
    }

    public void endFakeDrag() {
        if (this.f3541L) {
            VelocityTracker velocityTracker = this.f3536G;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f3538I);
            int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.f3535F);
            this.f3577u = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            C1475d q = m4082q();
            mo12267H(m4078j(q.f3594b, ((((float) scrollY) / ((float) clientHeight)) - q.f3597e) / q.f3596d, yVelocity, (int) (this.f3532C - this.f3534E)), true, true, yVelocity);
            m4080m();
            this.f3541L = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                i = 17;
            } else if (keyCode == 22) {
                i = 66;
            } else if (keyCode == 61 && Build.VERSION.SDK_INT >= 11) {
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    i = 2;
                } else if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                    return arrowScroll(1);
                }
            }
            return arrowScroll(i);
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (this.f3541L) {
            this.f3532C += f;
            float scrollY = ((float) getScrollY()) - f;
            float clientHeight = (float) getClientHeight();
            float f2 = this.f3572p * clientHeight;
            float f3 = this.f3573q * clientHeight;
            C1475d dVar = this.f3555b.get(0);
            ArrayList<C1475d> arrayList = this.f3555b;
            C1475d dVar2 = arrayList.get(arrayList.size() - 1);
            if (dVar.f3594b != 0) {
                f2 = dVar.f3597e * clientHeight;
            }
            if (dVar2.f3594b != this.f3561e.getCount() - 1) {
                f3 = dVar2.f3597e * clientHeight;
            }
            if (scrollY < f2) {
                scrollY = f2;
            } else if (scrollY > f3) {
                scrollY = f3;
            }
            int i = (int) scrollY;
            this.f3532C += scrollY - ((float) i);
            scrollTo(getScrollX(), i);
            m4085x(i);
            MotionEvent obtain = MotionEvent.obtain(this.f3542M, SystemClock.uptimeMillis(), 2, 0.0f, this.f3532C, 0);
            this.f3536G.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo12284g(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && mo12284g(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && ViewCompat.canScrollVertically(view, -i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.f3561e;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3554a0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f3556b0.get(i2).getLayoutParams()).f3588f;
    }

    public int getCurrentItem() {
        return this.f3562f;
    }

    public int getOffscreenPageLimit() {
        return this.f3578v;
    }

    public int getPageMargin() {
        return this.f3568l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo12293i() {
        int count = this.f3561e.getCount();
        this.f3553a = count;
        boolean z = this.f3555b.size() < (this.f3578v * 2) + 1 && this.f3555b.size() < count;
        int i = this.f3562f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f3555b.size()) {
            C1475d dVar = this.f3555b.get(i2);
            int itemPosition = this.f3561e.getItemPosition(dVar.f3593a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f3555b.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f3561e.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f3561e.destroyItem((ViewGroup) this, dVar.f3594b, dVar.f3593a);
                    int i3 = this.f3562f;
                    if (i3 == dVar.f3594b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = dVar.f3594b;
                    if (i4 != itemPosition) {
                        if (i4 == this.f3562f) {
                            i = itemPosition;
                        }
                        dVar.f3594b = itemPosition;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f3561e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f3555b, f3527f0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f3583a) {
                    layoutParams.f3585c = 0.0f;
                }
            }
            mo12266G(i, false, true);
            requestLayout();
        }
    }

    public boolean internalCanScrollVertically(int i) {
        if (this.f3561e == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        return i < 0 ? scrollY > ((int) (((float) clientHeight) * this.f3572p)) : i > 0 && scrollY < ((int) (((float) clientHeight) * this.f3573q));
    }

    public boolean isFakeDragging() {
        return this.f3541L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo12296k(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C1475d mo12297o(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo12309p(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3545P = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3558c0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r19) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f3579w = false;
            this.f3580x = false;
            this.f3535F = -1;
            VelocityTracker velocityTracker = this.f3536G;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3536G = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f3579w) {
                return true;
            }
            if (this.f3580x) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f3533D = x;
            this.f3531B = x;
            float y = motionEvent.getY();
            this.f3534E = y;
            this.f3532C = y;
            this.f3535F = MotionEventCompat.getPointerId(motionEvent, 0);
            this.f3580x = false;
            this.f3566j.computeScrollOffset();
            if (this.f3560d0 != 2 || Math.abs(this.f3566j.getFinalY() - this.f3566j.getCurrY()) <= this.f3540K) {
                m4077h(false);
                this.f3579w = false;
            } else {
                this.f3566j.abortAnimation();
                this.f3577u = false;
                mo12264A();
                this.f3579w = true;
                m4069E(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f3535F;
            if (i != -1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
                float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                float f = y2 - this.f3532C;
                float abs = Math.abs(f);
                float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                float abs2 = Math.abs(x2 - this.f3533D);
                if (f == 0.0f || m4083t(this.f3532C, f) || !mo12284g(this, false, (int) f, (int) x2, (int) y2)) {
                    int i2 = this.f3530A;
                    if (abs > ((float) i2) && abs * 0.5f > abs2) {
                        this.f3579w = true;
                        m4069E(true);
                        setScrollState(1);
                        this.f3532C = f > 0.0f ? this.f3534E + ((float) this.f3530A) : this.f3534E - ((float) this.f3530A);
                        this.f3531B = x2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i2)) {
                        this.f3580x = true;
                    }
                    if (this.f3579w && m4086z(y2)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                    }
                } else {
                    this.f3531B = x2;
                    this.f3532C = y2;
                    this.f3580x = true;
                    return false;
                }
            }
        } else if (action == 6) {
            m4084v(motionEvent);
        }
        if (this.f3536G == null) {
            this.f3536G = VelocityTracker.obtain();
        }
        this.f3536G.addMovement(motionEvent);
        return this.f3579w;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1475d p;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (p = mo12309p(childAt)) != null && p.f3594b == this.f3562f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f3561e;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f3590b, savedState.f3591c);
            mo12266G(savedState.f3589a, false, true);
            return;
        }
        this.f3563g = savedState.f3589a;
        this.f3564h = savedState.f3590b;
        this.f3565i = savedState.f3591c;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3589a = this.f3562f;
        PagerAdapter pagerAdapter = this.f3561e;
        if (pagerAdapter != null) {
            savedState.f3590b = pagerAdapter.saveState();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.f3568l;
            m4067C(i2, i4, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C1475d mo12309p(View view) {
        for (int i = 0; i < this.f3555b.size(); i++) {
            C1475d dVar = this.f3555b.get(i);
            if (this.f3561e.isViewFromObject(view, dVar.f3593a)) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1475d mo12310r(int i) {
        for (int i2 = 0; i2 < this.f3555b.size(); i2++) {
            C1475d dVar = this.f3555b.get(i2);
            if (dVar.f3594b == i) {
                return dVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.f3575s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo12312s() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3566j = new Scroller(context, f3528g0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3530A = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.f3537H = (int) (400.0f * f);
        this.f3538I = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3543N = new EdgeEffectCompat(context);
        this.f3544O = new EdgeEffectCompat(context);
        this.f3539J = (int) (25.0f * f);
        this.f3540K = (int) (2.0f * f);
        this.f3581y = (int) (f * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new C1476e());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f3561e;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.f3567k);
            this.f3561e.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f3555b.size(); i++) {
                C1475d dVar = this.f3555b.get(i);
                this.f3561e.destroyItem((ViewGroup) this, dVar.f3594b, dVar.f3593a);
            }
            this.f3561e.finishUpdate((ViewGroup) this);
            this.f3555b.clear();
            m4068D();
            this.f3562f = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f3561e;
        this.f3561e = pagerAdapter;
        this.f3553a = 0;
        if (pagerAdapter != null) {
            if (this.f3567k == null) {
                this.f3567k = new C1478g(this, null);
            }
            this.f3561e.registerDataSetObserver(this.f3567k);
            this.f3577u = false;
            boolean z = this.f3545P;
            this.f3545P = true;
            this.f3553a = this.f3561e.getCount();
            if (this.f3563g >= 0) {
                this.f3561e.restoreState(this.f3564h, this.f3565i);
                mo12266G(this.f3563g, false, true);
                this.f3563g = -1;
                this.f3564h = null;
                this.f3565i = null;
            } else if (!z) {
                mo12264A();
            } else {
                requestLayout();
            }
        }
        AbstractC1477f fVar = this.f3550U;
        if (!(fVar == null || pagerAdapter3 == pagerAdapter)) {
            fVar.mo12336a(pagerAdapter3, pagerAdapter);
        }
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f3552W == null) {
                try {
                    this.f3552W = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f3552W.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f3577u = false;
        mo12266G(i, !this.f3545P, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.f3577u = false;
        mo12266G(i, z, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f3578v) {
            this.f3578v = i;
            mo12264A();
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(AbstractC1477f fVar) {
        this.f3550U = fVar;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f3548S = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.f3568l;
        this.f3568l = i;
        int height = getHeight();
        m4067C(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3569m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, ViewPager.PageTransformer pageTransformer) {
        if (Build.VERSION.SDK_INT >= 11) {
            int i = 1;
            boolean z2 = pageTransformer != null;
            boolean z3 = z2 != (this.f3551V != null);
            this.f3551V = pageTransformer;
            setChildrenDrawingOrderEnabledCompat(z2);
            if (z2) {
                if (z) {
                    i = 2;
                }
                this.f3554a0 = i;
            } else {
                this.f3554a0 = 0;
            }
            if (z3) {
                mo12264A();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12324u(int r12, float r13, int r14) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: p068fr.castorflex.android.verticalviewpager.VerticalViewPager.mo12324u(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3569m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo12326w() {
        PagerAdapter pagerAdapter = this.f3561e;
        if (pagerAdapter == null || this.f3562f >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.f3562f + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo12327y() {
        int i = this.f3562f;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }
}
