package p013b.p055e.p056a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: b.e.a.a */
public class C0966a {

    /* renamed from: f */
    private static String f2101f;

    /* renamed from: a */
    private final C0968b f2102a;

    /* renamed from: b */
    private boolean f2103b;

    /* renamed from: c */
    private boolean f2104c;

    /* renamed from: d */
    private View f2105d;

    /* renamed from: e */
    private View f2106e;

    /* renamed from: b.e.a.a$b */
    public static class C0968b {

        /* renamed from: a */
        private final int f2107a;

        /* renamed from: b */
        private final boolean f2108b;

        /* renamed from: c */
        private final int f2109c;

        /* renamed from: d */
        private final int f2110d;

        /* renamed from: e */
        private final boolean f2111e;

        /* renamed from: f */
        private final float f2112f;

        private C0968b(Activity activity, boolean z, boolean z2) {
            Resources resources = activity.getResources();
            boolean z3 = false;
            this.f2111e = resources.getConfiguration().orientation == 1;
            this.f2112f = m2728g(activity);
            this.f2107a = m2725b(resources, "status_bar_height");
            m2724a(activity);
            int d = m2726d(activity);
            this.f2109c = d;
            this.f2110d = m2727f(activity);
            this.f2108b = d > 0 ? true : z3;
        }

        @TargetApi(14)
        /* renamed from: a */
        private int m2724a(Context context) {
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        /* renamed from: b */
        private int m2725b(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        /* renamed from: d */
        private int m2726d(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !m2729i(context)) {
                return 0;
            }
            return m2725b(resources, this.f2111e ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }

        @TargetApi(14)
        /* renamed from: f */
        private int m2727f(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !m2729i(context)) {
                return 0;
            }
            return m2725b(resources, "navigation_bar_width");
        }

        @SuppressLint({"NewApi"})
        /* renamed from: g */
        private float m2728g(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int i = Build.VERSION.SDK_INT;
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            if (i >= 16) {
                defaultDisplay.getRealMetrics(displayMetrics);
            } else {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f = displayMetrics.density;
            return Math.min(((float) displayMetrics.widthPixels) / f, ((float) displayMetrics.heightPixels) / f);
        }

        @TargetApi(14)
        /* renamed from: i */
        private boolean m2729i(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z = resources.getBoolean(identifier);
            if ("1".equals(C0966a.f2101f)) {
                return false;
            }
            if ("0".equals(C0966a.f2101f)) {
                return true;
            }
            return z;
        }

        /* renamed from: c */
        public int mo9260c() {
            return this.f2109c;
        }

        /* renamed from: e */
        public int mo9261e() {
            return this.f2110d;
        }

        /* renamed from: h */
        public int mo9262h() {
            return this.f2107a;
        }

        /* renamed from: j */
        public boolean mo9263j() {
            return this.f2108b;
        }

        /* renamed from: k */
        public boolean mo9264k() {
            return this.f2112f >= 600.0f || this.f2111e;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                declaredMethod.setAccessible(true);
                f2101f = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable unused) {
                f2101f = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @TargetApi(19)
    public C0966a(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f2103b = obtainStyledAttributes.getBoolean(0, false);
                this.f2104c = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                int i = window.getAttributes().flags;
                if ((67108864 & i) != 0) {
                    this.f2103b = true;
                }
                if ((i & 134217728) != 0) {
                    this.f2104c = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        C0968b bVar = new C0968b(activity, this.f2103b, this.f2104c);
        this.f2102a = bVar;
        if (!bVar.mo9263j()) {
            this.f2104c = false;
        }
        if (this.f2103b) {
            m2718h(activity, viewGroup);
        }
        if (this.f2104c) {
            m2717g(activity, viewGroup);
        }
    }

    /* renamed from: g */
    private void m2717g(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        this.f2106e = new View(context);
        if (this.f2102a.mo9264k()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f2102a.mo9260c());
            i = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f2102a.mo9261e(), -1);
            i = 5;
        }
        layoutParams.gravity = i;
        this.f2106e.setLayoutParams(layoutParams);
        this.f2106e.setBackgroundColor(-1728053248);
        this.f2106e.setVisibility(8);
        viewGroup.addView(this.f2106e);
    }

    /* renamed from: h */
    private void m2718h(Context context, ViewGroup viewGroup) {
        this.f2105d = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f2102a.mo9262h());
        layoutParams.gravity = 48;
        if (this.f2104c && !this.f2102a.mo9264k()) {
            layoutParams.rightMargin = this.f2102a.mo9261e();
        }
        this.f2105d.setLayoutParams(layoutParams);
        this.f2105d.setBackgroundColor(-1728053248);
        this.f2105d.setVisibility(8);
        viewGroup.addView(this.f2105d);
    }

    /* renamed from: b */
    public void mo9255b(int i) {
        if (this.f2104c) {
            this.f2106e.setBackgroundColor(i);
        }
    }

    /* renamed from: c */
    public void mo9256c(boolean z) {
        if (this.f2104c) {
            this.f2106e.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: d */
    public void mo9257d(int i) {
        if (this.f2103b) {
            this.f2105d.setBackgroundColor(i);
        }
    }

    /* renamed from: e */
    public void mo9258e(boolean z) {
        if (this.f2103b) {
            this.f2105d.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: f */
    public void mo9259f(int i) {
        mo9257d(i);
        mo9255b(i);
    }
}
