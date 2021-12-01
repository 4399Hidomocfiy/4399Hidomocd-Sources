package com.iapp.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.C0072R;
import android.support.design.widget.TabItem;
import android.support.p009v4.util.Pools;
import android.support.p009v4.view.GravityCompat;
import android.support.p009v4.view.PagerAdapter;
import android.support.p009v4.view.PointerIconCompat;
import android.support.p009v4.view.ViewCompat;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.view.animation.FastOutLinearInInterpolator;
import android.support.p009v4.view.animation.FastOutSlowInInterpolator;
import android.support.p009v4.view.animation.LinearOutSlowInInterpolator;
import android.support.p009v4.widget.TextViewCompat;
import android.support.p012v7.app.ActionBar;
import android.support.p012v7.appcompat.C0467R;
import android.support.p012v7.content.res.AppCompatResources;
import android.support.p012v7.widget.ActivityChooserView;
import android.support.p012v7.widget.TooltipCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {

    /* renamed from: E */
    private static final Pools.Pool<C1283g> f2957E = new Pools.SynchronizedPool(16);
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;

    /* renamed from: A */
    private TabLayoutOnPageChangeListener f2958A;

    /* renamed from: B */
    private C1276b f2959B;

    /* renamed from: C */
    private boolean f2960C;

    /* renamed from: D */
    private final Pools.Pool<C1284h> f2961D;

    /* renamed from: a */
    private final ArrayList<C1283g> f2962a;

    /* renamed from: b */
    private C1283g f2963b;

    /* renamed from: c */
    private final C1280f f2964c;

    /* renamed from: d */
    int f2965d;

    /* renamed from: e */
    int f2966e;

    /* renamed from: f */
    int f2967f;

    /* renamed from: g */
    int f2968g;

    /* renamed from: h */
    int f2969h;

    /* renamed from: i */
    ColorStateList f2970i;

    /* renamed from: j */
    float f2971j;

    /* renamed from: k */
    float f2972k;

    /* renamed from: l */
    final int f2973l;

    /* renamed from: m */
    int f2974m;

    /* renamed from: n */
    private final int f2975n;

    /* renamed from: o */
    private final int f2976o;

    /* renamed from: p */
    private final int f2977p;

    /* renamed from: q */
    private int f2978q;

    /* renamed from: r */
    int f2979r;

    /* renamed from: s */
    int f2980s;

    /* renamed from: t */
    private AbstractC1278d f2981t;

    /* renamed from: u */
    private final ArrayList<AbstractC1278d> f2982u;

    /* renamed from: v */
    private AbstractC1278d f2983v;

    /* renamed from: w */
    private ValueAnimator f2984w;

    /* renamed from: x */
    ViewPager f2985x;

    /* renamed from: y */
    private PagerAdapter f2986y;

    /* renamed from: z */
    private DataSetObserver f2987z;

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        private final WeakReference<TabLayout> f2988a;

        /* renamed from: b */
        private int f2989b;

        /* renamed from: c */
        private int f2990c;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f2988a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11578a() {
            this.f2990c = 0;
            this.f2989b = 0;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f2989b = this.f2990c;
            this.f2990c = i;
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.f2988a.get();
            if (tabLayout != null) {
                int i3 = this.f2990c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f2989b == 1;
                if (!(i3 == 2 && this.f2989b == 0)) {
                    z = true;
                }
                tabLayout.mo11576v(i, f, z2, z);
            }
        }

        @Override // android.support.p009v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.f2988a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f2990c;
                tabLayout.mo11574t(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.f2989b == 0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.TabLayout$a */
    public class C1275a implements ValueAnimator.AnimatorUpdateListener {
        C1275a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.TabLayout$b */
    public class C1276b implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a */
        private boolean f2992a;

        C1276b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11580a(boolean z) {
            this.f2992a = z;
        }

        @Override // android.support.p009v4.view.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f2985x == viewPager) {
                tabLayout.mo11575u(pagerAdapter2, this.f2992a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.TabLayout$c */
    public static class C1277c {

        /* renamed from: a */
        static final Interpolator f2994a = new FastOutSlowInInterpolator();

        static {
            new LinearInterpolator();
            new FastOutLinearInInterpolator();
            new LinearOutSlowInInterpolator();
            new DecelerateInterpolator();
        }

        /* renamed from: a */
        public static int m3435a(int i, int i2, float f) {
            return i + Math.round(f * ((float) (i2 - i)));
        }
    }

    /* renamed from: com.iapp.app.TabLayout$d */
    public interface AbstractC1278d {
        /* renamed from: a */
        void mo9030a(C1283g gVar);

        /* renamed from: b */
        void mo9031b(C1283g gVar);

        /* renamed from: c */
        void mo9032c(C1283g gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.TabLayout$e */
    public class C1279e extends DataSetObserver {
        C1279e() {
        }

        public void onChanged() {
            TabLayout.this.mo11555q();
        }

        public void onInvalidated() {
            TabLayout.this.mo11555q();
        }
    }

    /* renamed from: com.iapp.app.TabLayout$f */
    public class C1280f extends LinearLayout {

        /* renamed from: a */
        private int f2996a;

        /* renamed from: b */
        private final Paint f2997b;

        /* renamed from: c */
        int f2998c = -1;

        /* renamed from: d */
        float f2999d;

        /* renamed from: e */
        private int f3000e = -1;

        /* renamed from: f */
        private int f3001f = -1;

        /* renamed from: g */
        private int f3002g = -1;

        /* renamed from: h */
        private ValueAnimator f3003h;

        /* renamed from: i */
        private int f3004i = 0;

        /* access modifiers changed from: package-private */
        /* renamed from: com.iapp.app.TabLayout$f$a */
        public class C1281a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f3006a;

            /* renamed from: b */
            final /* synthetic */ int f3007b;

            /* renamed from: c */
            final /* synthetic */ int f3008c;

            /* renamed from: d */
            final /* synthetic */ int f3009d;

            C1281a(int i, int i2, int i3, int i4) {
                this.f3006a = i;
                this.f3007b = i2;
                this.f3008c = i3;
                this.f3009d = i4;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C1280f.this.mo11585c(C1277c.m3435a(this.f3006a, this.f3007b, animatedFraction), C1277c.m3435a(this.f3008c, this.f3009d, animatedFraction));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.iapp.app.TabLayout$f$b */
        public class C1282b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f3011a;

            C1282b(int i) {
                this.f3011a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C1280f fVar = C1280f.this;
                fVar.f2998c = this.f3011a;
                fVar.f2999d = 0.0f;
            }
        }

        C1280f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f2997b = new Paint();
        }

        /* renamed from: e */
        private void m3439e() {
            int i;
            int i2;
            View childAt = getChildAt(this.f2998c);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f2999d > 0.0f && this.f2998c < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f2998c + 1);
                    float left = this.f2999d * ((float) childAt2.getLeft());
                    float f = this.f2999d;
                    i = (int) (left + ((1.0f - f) * ((float) i)));
                    i2 = (int) ((f * ((float) childAt2.getRight())) + ((1.0f - this.f2999d) * ((float) i2)));
                }
            }
            mo11585c(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11583a(int i, int i2) {
            int i3;
            int i4;
            ValueAnimator valueAnimator = this.f3003h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f3003h.cancel();
            }
            boolean z = ViewCompat.getLayoutDirection(this) == 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                m3439e();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (Math.abs(i - this.f2998c) <= 1) {
                i4 = this.f3001f;
                i3 = this.f3002g;
            } else {
                int n = TabLayout.this.mo11550n(24);
                i4 = (i >= this.f2998c ? !z : z) ? left - n : n + right;
                i3 = i4;
            }
            if (i4 != left || i3 != right) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f3003h = valueAnimator2;
                valueAnimator2.setInterpolator(C1277c.f2994a);
                valueAnimator2.setDuration((long) i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new C1281a(i4, left, i3, right));
                valueAnimator2.addListener(new C1282b(i));
                valueAnimator2.start();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo11584b() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11585c(int i, int i2) {
            if (i != this.f3001f || i2 != this.f3002g) {
                this.f3001f = i;
                this.f3002g = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo11586d(int i, float f) {
            ValueAnimator valueAnimator = this.f3003h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f3003h.cancel();
            }
            this.f2998c = i;
            this.f2999d = f;
            m3439e();
        }

        public void draw(Canvas canvas) {
            int i;
            super.draw(canvas);
            int i2 = this.f3001f;
            if (i2 >= 0 && (i = this.f3002g) > i2) {
                if (this.f3004i == 0) {
                    canvas.drawRect((float) i2, (float) (getHeight() - this.f2996a), (float) this.f3002g, (float) getHeight(), this.f2997b);
                    return;
                }
                int i3 = (i - i2) / 2;
                canvas.drawRoundRect(new RectF((float) ((i2 + i3) - this.f3004i), (float) (getHeight() - this.f2996a), (float) ((this.f3002g - i3) + this.f3004i), (float) getHeight()), 30.0f, 30.0f, this.f2997b);
            }
        }

        /* access modifiers changed from: package-private */
        public float getIndicatorPosition() {
            return ((float) this.f2998c) + this.f2999d;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f3003h;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m3439e();
                return;
            }
            this.f3003h.cancel();
            mo11583a(this.f2998c, Math.round((1.0f - this.f3003h.getAnimatedFraction()) * ((float) this.f3003h.getDuration())));
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f2980s == 1 && tabLayout.f2979r == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.mo11550n(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f2979r = 0;
                            tabLayout2.mo11577z(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f3000e != i) {
                requestLayout();
                this.f3000e = i;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSelectedIndicatorColor(int i) {
            if (this.f2997b.getColor() != i) {
                this.f2997b.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: package-private */
        public void setSelectedIndicatorHeight(int i) {
            if (this.f2996a != i) {
                this.f2996a = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public void setTabIndicatorWidth(int i) {
            this.f3004i = i;
        }
    }

    /* renamed from: com.iapp.app.TabLayout$g */
    public static final class C1283g {

        /* renamed from: a */
        private Drawable f3013a;

        /* renamed from: b */
        private CharSequence f3014b;

        /* renamed from: c */
        private CharSequence f3015c;

        /* renamed from: d */
        private int f3016d = -1;

        /* renamed from: e */
        private View f3017e;

        /* renamed from: f */
        TabLayout f3018f;

        /* renamed from: g */
        C1284h f3019g;

        C1283g() {
        }

        /* renamed from: a */
        public CharSequence mo11597a() {
            return this.f3015c;
        }

        /* renamed from: b */
        public View mo11598b() {
            return this.f3017e;
        }

        /* renamed from: c */
        public Drawable mo11599c() {
            return this.f3013a;
        }

        /* renamed from: d */
        public int mo11600d() {
            return this.f3016d;
        }

        /* renamed from: e */
        public CharSequence mo11601e() {
            return this.f3014b;
        }

        /* renamed from: f */
        public boolean mo11602f() {
            TabLayout tabLayout = this.f3018f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f3016d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo11603g() {
            this.f3018f = null;
            this.f3019g = null;
            this.f3013a = null;
            this.f3014b = null;
            this.f3015c = null;
            this.f3016d = -1;
            this.f3017e = null;
        }

        /* renamed from: h */
        public void mo11604h() {
            TabLayout tabLayout = this.f3018f;
            if (tabLayout != null) {
                tabLayout.mo11560s(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: i */
        public C1283g mo11605i(CharSequence charSequence) {
            this.f3015c = charSequence;
            mo11611o();
            return this;
        }

        /* renamed from: j */
        public C1283g mo11606j(int i) {
            mo11607k(LayoutInflater.from(this.f3019g.getContext()).inflate(i, (ViewGroup) this.f3019g, false));
            return this;
        }

        /* renamed from: k */
        public C1283g mo11607k(View view) {
            this.f3017e = view;
            mo11611o();
            return this;
        }

        /* renamed from: l */
        public C1283g mo11608l(Drawable drawable) {
            this.f3013a = drawable;
            mo11611o();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo11609m(int i) {
            this.f3016d = i;
        }

        /* renamed from: n */
        public C1283g mo11610n(CharSequence charSequence) {
            this.f3014b = charSequence;
            mo11611o();
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo11611o() {
            C1284h hVar = this.f3019g;
            if (hVar != null) {
                hVar.mo11614d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.TabLayout$h */
    public class C1284h extends LinearLayout {

        /* renamed from: a */
        private C1283g f3020a;

        /* renamed from: b */
        private TextView f3021b;

        /* renamed from: c */
        private ImageView f3022c;

        /* renamed from: d */
        private View f3023d;

        /* renamed from: e */
        private TextView f3024e;

        /* renamed from: f */
        private ImageView f3025f;

        /* renamed from: g */
        private int f3026g = 2;

        public C1284h(Context context) {
            super(context);
            int i = TabLayout.this.f2973l;
            if (i != 0) {
                ViewCompat.setBackground(this, AppCompatResources.getDrawable(context, i));
            }
            ViewCompat.setPaddingRelative(this, TabLayout.this.f2965d, TabLayout.this.f2966e, TabLayout.this.f2967f, TabLayout.this.f2968g);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND));
        }

        /* renamed from: a */
        private float m3459a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: e */
        private void m3460e(TextView textView, ImageView imageView) {
            C1283g gVar = this.f3020a;
            CharSequence charSequence = null;
            Drawable c = gVar != null ? gVar.mo11599c() : null;
            C1283g gVar2 = this.f3020a;
            CharSequence e = gVar2 != null ? gVar2.mo11601e() : null;
            C1283g gVar3 = this.f3020a;
            CharSequence a = gVar3 != null ? gVar3.mo11597a() : null;
            int i = 0;
            if (imageView != null) {
                if (c != null) {
                    imageView.setImageDrawable(c);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(a);
            }
            boolean z = !TextUtils.isEmpty(e);
            if (textView != null) {
                if (z) {
                    textView.setText(e);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
                textView.setContentDescription(a);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = TabLayout.this.mo11550n(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence = a;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11612b() {
            mo11613c(null);
            setSelected(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11613c(C1283g gVar) {
            if (gVar != this.f3020a) {
                this.f3020a = gVar;
                mo11614d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo11614d() {
            ImageView imageView;
            TextView textView;
            C1283g gVar = this.f3020a;
            ImageView imageView2 = null;
            View b = gVar != null ? gVar.mo11598b() : null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f3023d = b;
                TextView textView2 = this.f3021b;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                ImageView imageView3 = this.f3022c;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                    this.f3022c.setImageDrawable(null);
                }
                TextView textView3 = (TextView) b.findViewById(16908308);
                this.f3024e = textView3;
                if (textView3 != null) {
                    this.f3026g = TextViewCompat.getMaxLines(textView3);
                }
                imageView2 = (ImageView) b.findViewById(16908294);
            } else {
                View view = this.f3023d;
                if (view != null) {
                    removeView(view);
                    this.f3023d = null;
                }
                this.f3024e = null;
            }
            this.f3025f = imageView2;
            boolean z = false;
            if (this.f3023d == null) {
                if (this.f3022c == null) {
                    ImageView imageView4 = (ImageView) LayoutInflater.from(getContext()).inflate(C0072R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    addView(imageView4, 0);
                    this.f3022c = imageView4;
                }
                if (this.f3021b == null) {
                    TextView textView4 = (TextView) LayoutInflater.from(getContext()).inflate(C0072R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    addView(textView4);
                    this.f3021b = textView4;
                    this.f3026g = TextViewCompat.getMaxLines(textView4);
                }
                TextViewCompat.setTextAppearance(this.f3021b, TabLayout.this.f2969h);
                ColorStateList colorStateList = TabLayout.this.f2970i;
                if (colorStateList != null) {
                    this.f3021b.setTextColor(colorStateList);
                }
                textView = this.f3021b;
                imageView = this.f3022c;
            } else {
                textView = this.f3024e;
                if (!(textView == null && this.f3025f == null)) {
                    imageView = this.f3025f;
                }
                if (gVar != null && gVar.mo11602f()) {
                    z = true;
                }
                setSelected(z);
            }
            m3460e(textView, imageView);
            z = true;
            setSelected(z);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f2974m, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f3021b != null) {
                getResources();
                float f = TabLayout.this.f2971j;
                int i3 = this.f3026g;
                ImageView imageView = this.f3022c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f3021b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f2972k;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f3021b.getTextSize();
                int lineCount = this.f3021b.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f3021b);
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f2980s == 1 && f > textSize && lineCount == 1 && ((layout = this.f3021b.getLayout()) == null || m3459a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f3021b.setTextSize(0, f);
                        this.f3021b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f3020a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f3020a.mo11604h();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f3021b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f3022c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f3023d;
            if (view != null) {
                view.setSelected(z);
            }
        }
    }

    /* renamed from: com.iapp.app.TabLayout$i */
    private static class C1285i {

        /* renamed from: a */
        static final int[] f3028a = {2130903140};

        /* renamed from: a */
        public static void m3464a(Context context) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3028a);
            boolean z = !obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            if (z) {
                throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
            }
        }
    }

    /* renamed from: com.iapp.app.TabLayout$j */
    public static class C1286j implements AbstractC1278d {

        /* renamed from: a */
        private final ViewPager f3029a;

        public C1286j(ViewPager viewPager) {
            this.f3029a = viewPager;
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: a */
        public void mo9030a(C1283g gVar) {
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: b */
        public void mo9031b(C1283g gVar) {
        }

        @Override // com.iapp.app.TabLayout.AbstractC1278d
        /* renamed from: c */
        public void mo9032c(C1283g gVar) {
            this.f3029a.setCurrentItem(gVar.mo11600d());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2962a = new ArrayList<>();
        this.f2974m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2982u = new ArrayList<>();
        this.f2961D = new Pools.SimplePool(12);
        C1285i.m3464a(context);
        setHorizontalScrollBarEnabled(false);
        C1280f fVar = new C1280f(context);
        this.f2964c = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0072R.styleable.TabLayout, i, C0072R.style.Widget_Design_TabLayout);
        fVar.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        fVar.setSelectedIndicatorColor(obtainStyledAttributes.getColor(3, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f2968g = dimensionPixelSize;
        this.f2967f = dimensionPixelSize;
        this.f2966e = dimensionPixelSize;
        this.f2965d = dimensionPixelSize;
        this.f2965d = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.f2966e = obtainStyledAttributes.getDimensionPixelSize(12, this.f2966e);
        this.f2967f = obtainStyledAttributes.getDimensionPixelSize(10, this.f2967f);
        this.f2968g = obtainStyledAttributes.getDimensionPixelSize(9, this.f2968g);
        int resourceId = obtainStyledAttributes.getResourceId(14, C0072R.style.TextAppearance_Design_Tab);
        this.f2969h = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C0467R.styleable.TextAppearance);
        try {
            this.f2971j = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f2970i = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(15)) {
                this.f2970i = obtainStyledAttributes.getColorStateList(15);
            }
            if (obtainStyledAttributes.hasValue(13)) {
                this.f2970i = m3414h(this.f2970i.getDefaultColor(), obtainStyledAttributes.getColor(13, 0));
            }
            this.f2975n = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.f2976o = obtainStyledAttributes.getDimensionPixelSize(5, -1);
            this.f2973l = obtainStyledAttributes.getResourceId(0, 0);
            this.f2978q = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f2980s = obtainStyledAttributes.getInt(7, 1);
            this.f2979r = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f2972k = (float) resources.getDimensionPixelSize(C0072R.dimen.design_tab_text_size_2line);
            this.f2977p = resources.getDimensionPixelSize(C0072R.dimen.design_tab_scrollable_min_width);
            m3411e();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private void m3407a(TabItem tabItem) {
        int parseInt;
        C1283g newTab = newTab();
        Object p = m3421p(tabItem, "mText");
        if (p != null) {
            newTab.mo11610n((CharSequence) p);
        }
        Object p2 = m3421p(tabItem, "mIcon");
        if (p2 != null) {
            newTab.mo11608l((Drawable) p2);
        }
        Object p3 = m3421p(tabItem, "mCustomLayout");
        if (!(p2 == null || (parseInt = Integer.parseInt(p3.toString())) == 0)) {
            newTab.mo11606j(parseInt);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            newTab.mo11605i(tabItem.getContentDescription());
        }
        addTab(newTab);
    }

    /* renamed from: b */
    private void m3408b(C1283g gVar) {
        this.f2964c.addView(gVar.f3019g, gVar.mo11600d(), m3415i());
    }

    /* renamed from: c */
    private void m3409c(View view) {
        if (view instanceof TabItem) {
            m3407a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: d */
    private void m3410d(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.f2964c.mo11584b()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int f = m3412f(i, 0.0f);
            if (scrollX != f) {
                m3420o();
                this.f2984w.setIntValues(scrollX, f);
                this.f2984w.start();
            }
            this.f2964c.mo11583a(i, 300);
        }
    }

    /* renamed from: e */
    private void m3411e() {
        ViewCompat.setPaddingRelative(this.f2964c, this.f2980s == 0 ? Math.max(0, this.f2978q - this.f2965d) : 0, 0, 0, 0);
        int i = this.f2980s;
        if (i == 0) {
            this.f2964c.setGravity(GravityCompat.START);
        } else if (i == 1) {
            this.f2964c.setGravity(1);
        }
        mo11577z(true);
    }

    /* renamed from: f */
    private int m3412f(int i, float f) {
        int i2 = 0;
        if (this.f2980s != 0) {
            return 0;
        }
        View childAt = this.f2964c.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f2964c.getChildCount() ? this.f2964c.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) (((float) (width + i2)) * 0.5f * f);
        return ViewCompat.getLayoutDirection(this) == 0 ? left + i4 : left - i4;
    }

    /* renamed from: g */
    private void m3413g(C1283g gVar, int i) {
        gVar.mo11609m(i);
        this.f2962a.add(i, gVar);
        int size = this.f2962a.size();
        while (true) {
            i++;
            if (i < size) {
                this.f2962a.get(i).mo11609m(i);
            } else {
                return;
            }
        }
    }

    private int getDefaultHeight() {
        int size = this.f2962a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C1283g gVar = this.f2962a.get(i);
                if (gVar != null && gVar.mo11599c() != null && !TextUtils.isEmpty(gVar.mo11601e())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z ? 72 : 48;
    }

    private float getScrollPosition() {
        return this.f2964c.getIndicatorPosition();
    }

    private int getTabMinWidth() {
        int i = this.f2975n;
        if (i != -1) {
            return i;
        }
        if (this.f2980s == 0) {
            return this.f2977p;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f2964c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private static ColorStateList m3414h(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: i */
    private LinearLayout.LayoutParams m3415i() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m3425y(layoutParams);
        return layoutParams;
    }

    /* renamed from: j */
    private C1284h m3416j(C1283g gVar) {
        Pools.Pool<C1284h> pool = this.f2961D;
        C1284h acquire = pool != null ? pool.acquire() : null;
        if (acquire == null) {
            acquire = new C1284h(getContext());
        }
        acquire.mo11613c(gVar);
        acquire.setFocusable(true);
        acquire.setMinimumWidth(getTabMinWidth());
        return acquire;
    }

    /* renamed from: k */
    private void m3417k(C1283g gVar) {
        for (int size = this.f2982u.size() - 1; size >= 0; size--) {
            this.f2982u.get(size).mo9030a(gVar);
        }
    }

    /* renamed from: l */
    private void m3418l(C1283g gVar) {
        for (int size = this.f2982u.size() - 1; size >= 0; size--) {
            this.f2982u.get(size).mo9032c(gVar);
        }
    }

    /* renamed from: m */
    private void m3419m(C1283g gVar) {
        for (int size = this.f2982u.size() - 1; size >= 0; size--) {
            this.f2982u.get(size).mo9031b(gVar);
        }
    }

    /* renamed from: o */
    private void m3420o() {
        if (this.f2984w == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2984w = valueAnimator;
            valueAnimator.setInterpolator(C1277c.f2994a);
            this.f2984w.setDuration(300L);
            this.f2984w.addUpdateListener(new C1275a());
        }
    }

    /* renamed from: p */
    private Object m3421p(TabItem tabItem, String str) {
        try {
            Field declaredField = tabItem.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(tabItem);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    private void m3422r(int i) {
        C1284h hVar = (C1284h) this.f2964c.getChildAt(i);
        this.f2964c.removeViewAt(i);
        if (hVar != null) {
            hVar.mo11612b();
            this.f2961D.release(hVar);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f2964c.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f2964c.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    /* renamed from: w */
    private void m3423w(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f2985x;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f2958A;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            C1276b bVar = this.f2959B;
            if (bVar != null) {
                this.f2985x.removeOnAdapterChangeListener(bVar);
            }
        }
        AbstractC1278d dVar = this.f2983v;
        if (dVar != null) {
            removeOnTabSelectedListener(dVar);
            this.f2983v = null;
        }
        if (viewPager != null) {
            this.f2985x = viewPager;
            if (this.f2958A == null) {
                this.f2958A = new TabLayoutOnPageChangeListener(this);
            }
            this.f2958A.mo11578a();
            viewPager.addOnPageChangeListener(this.f2958A);
            C1286j jVar = new C1286j(viewPager);
            this.f2983v = jVar;
            addOnTabSelectedListener(jVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo11575u(adapter, z);
            }
            if (this.f2959B == null) {
                this.f2959B = new C1276b();
            }
            this.f2959B.mo11580a(z);
            viewPager.addOnAdapterChangeListener(this.f2959B);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f2985x = null;
            mo11575u(null, false);
        }
        this.f2960C = z2;
    }

    /* renamed from: x */
    private void m3424x() {
        int size = this.f2962a.size();
        for (int i = 0; i < size; i++) {
            this.f2962a.get(i).mo11611o();
        }
    }

    /* renamed from: y */
    private void m3425y(LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f2980s == 1 && this.f2979r == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    public void addOnTabSelectedListener(AbstractC1278d dVar) {
        if (!this.f2982u.contains(dVar)) {
            this.f2982u.add(dVar);
        }
    }

    public void addTab(C1283g gVar) {
        addTab(gVar, this.f2962a.isEmpty());
    }

    public void addTab(C1283g gVar, int i) {
        addTab(gVar, i, this.f2962a.isEmpty());
    }

    public void addTab(C1283g gVar, int i, boolean z) {
        if (gVar.f3018f == this) {
            m3413g(gVar, i);
            m3408b(gVar);
            if (z) {
                gVar.mo11604h();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void addTab(C1283g gVar, boolean z) {
        addTab(gVar, this.f2962a.size(), z);
    }

    public void addView(View view) {
        m3409c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m3409c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3409c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3409c(view);
    }

    public void clearOnTabSelectedListeners() {
        this.f2982u.clear();
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C1283g gVar = this.f2963b;
        if (gVar != null) {
            return gVar.mo11600d();
        }
        return -1;
    }

    public C1280f getSlidingTabStrip() {
        return this.f2964c;
    }

    public C1283g getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f2962a.get(i);
    }

    public int getTabCount() {
        return this.f2962a.size();
    }

    public int getTabGravity() {
        return this.f2979r;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.f2974m;
    }

    public int getTabMode() {
        return this.f2980s;
    }

    public ColorStateList getTabTextColors() {
        return this.f2970i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo11550n(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public C1283g newTab() {
        C1283g acquire = f2957E.acquire();
        if (acquire == null) {
            acquire = new C1283g();
        }
        acquire.f3018f = this;
        acquire.f3019g = m3416j(acquire);
        return acquire;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2985x == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m3423w((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2960C) {
            setupWithViewPager(null);
            this.f2960C = false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo11555q() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.f2986y;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C1283g newTab = newTab();
                newTab.mo11610n(this.f2986y.getPageTitle(i));
                addTab(newTab, false);
            }
            ViewPager viewPager = this.f2985x;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo11560s(getTabAt(currentItem));
            }
        }
    }

    public void removeAllTabs() {
        for (int childCount = this.f2964c.getChildCount() - 1; childCount >= 0; childCount--) {
            m3422r(childCount);
        }
        Iterator<C1283g> it = this.f2962a.iterator();
        while (it.hasNext()) {
            C1283g next = it.next();
            it.remove();
            next.mo11603g();
            f2957E.release(next);
        }
        this.f2963b = null;
    }

    public void removeOnTabSelectedListener(AbstractC1278d dVar) {
        this.f2982u.remove(dVar);
    }

    public void removeTab(C1283g gVar) {
        if (gVar.f3018f == this) {
            removeTabAt(gVar.mo11600d());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        C1283g gVar = this.f2963b;
        int d = gVar != null ? gVar.mo11600d() : 0;
        m3422r(i);
        C1283g remove = this.f2962a.remove(i);
        if (remove != null) {
            remove.mo11603g();
            f2957E.release(remove);
        }
        int size = this.f2962a.size();
        for (int i2 = i; i2 < size; i2++) {
            this.f2962a.get(i2).mo11609m(i2);
        }
        if (d == i) {
            mo11560s(this.f2962a.isEmpty() ? null : this.f2962a.get(Math.max(0, i - 1)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo11560s(C1283g gVar) {
        mo11574t(gVar, true);
    }

    @Deprecated
    public void setOnTabSelectedListener(AbstractC1278d dVar) {
        AbstractC1278d dVar2 = this.f2981t;
        if (dVar2 != null) {
            removeOnTabSelectedListener(dVar2);
        }
        this.f2981t = dVar;
        if (dVar != null) {
            addOnTabSelectedListener(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m3420o();
        this.f2984w.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        mo11576v(i, f, z, true);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f2964c.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f2964c.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.f2979r != i) {
            this.f2979r = i;
            m3411e();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f2980s) {
            this.f2980s = i;
            m3411e();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m3414h(i, i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f2970i != colorStateList) {
            this.f2970i = colorStateList;
            m3424x();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo11575u(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        m3423w(viewPager, z, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo11574t(C1283g gVar, boolean z) {
        C1283g gVar2 = this.f2963b;
        if (gVar2 != gVar) {
            int d = gVar != null ? gVar.mo11600d() : -1;
            if (z) {
                if ((gVar2 == null || gVar2.mo11600d() == -1) && d != -1) {
                    setScrollPosition(d, 0.0f, true);
                } else {
                    m3410d(d);
                }
                if (d != -1) {
                    setSelectedTabView(d);
                }
            }
            if (gVar2 != null) {
                m3419m(gVar2);
            }
            this.f2963b = gVar;
            if (gVar != null) {
                m3418l(gVar);
            }
        } else if (gVar2 != null) {
            m3417k(gVar);
            m3410d(gVar.mo11600d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo11575u(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f2986y;
        if (!(pagerAdapter2 == null || (dataSetObserver = this.f2987z) == null)) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f2986y = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f2987z == null) {
                this.f2987z = new C1279e();
            }
            pagerAdapter.registerDataSetObserver(this.f2987z);
        }
        mo11555q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo11576v(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f2964c.getChildCount()) {
            if (z2) {
                this.f2964c.mo11586d(i, f);
            }
            ValueAnimator valueAnimator = this.f2984w;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f2984w.cancel();
            }
            scrollTo(m3412f(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo11577z(boolean z) {
        for (int i = 0; i < this.f2964c.getChildCount(); i++) {
            View childAt = this.f2964c.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m3425y((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }
}
