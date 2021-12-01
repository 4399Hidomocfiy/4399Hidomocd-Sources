package com.iapp.app;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TextInputLayout;
import android.support.p009v4.app.FragmentTransaction;
import android.support.p009v4.app.NotificationCompat;
import android.support.p009v4.view.GravityCompat;
import android.support.p009v4.view.InputDeviceCompat;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p012v7.widget.CardView;
import android.support.p012v7.widget.LinearLayoutManager;
import android.support.p012v7.widget.RecyclerView;
import android.support.p012v7.widget.SwitchCompat;
import android.support.p012v7.widget.Toolbar;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;
import bsh.org.objectweb.asm.Constants;
import com.iapp.app.TabLayout;
import com.iapp.app.p067x5.WebView;
import java.lang.reflect.Field;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0844j;
import p013b.p044b.p045a.p046a.C0849k;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0861s;
import p013b.p048c.p049a.C0917c;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;
import p069pl.droidsonroids.gif.C1488c;
import p069pl.droidsonroids.gif.GifImageView;

/* renamed from: com.iapp.app.g */
public class C1305g {

    /* renamed from: a */
    private View f3066a = null;

    /* renamed from: b */
    private Context f3067b = null;

    /* renamed from: c */
    private int f3068c = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.g$a */
    public class C1306a implements InputFilter {
        C1306a(C1305g gVar) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.g$b */
    public class C1307b implements InputFilter {
        C1307b(C1305g gVar) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return charSequence.length() < 1 ? spanned.subSequence(i3, i4) : "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.g$c */
    public class C1308c extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private int f3069a;

        /* renamed from: b */
        private int f3070b;

        /* renamed from: c */
        private int f3071c;

        /* renamed from: d */
        private int f3072d;

        public C1308c(C1305g gVar, int i, int i2, int i3, int i4) {
            this.f3069a = i;
            this.f3070b = i2;
            this.f3071c = i3;
            this.f3072d = i4;
        }

        @Override // android.support.p012v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            rect.left = this.f3069a;
            rect.right = this.f3071c;
            rect.bottom = this.f3072d;
            rect.top = this.f3070b;
        }
    }

    public C1305g(View view, Context context) {
        this.f3066a = view;
        this.f3067b = context;
    }

    public C1305g(View view, Context context, int i) {
        this.f3066a = view;
        this.f3067b = context;
        this.f3068c = i;
    }

    /* renamed from: A */
    private int m3563A(String str) {
        if (!str.contains("|")) {
            return m3589z(str.trim());
        }
        String[] d = C0861s.m2071d(str, "|");
        int length = d.length;
        if (length == 2) {
            return m3589z(d[1].trim()) | m3589z(d[0].trim());
        } else if (length == 3) {
            return m3589z(d[2].trim()) | m3589z(d[0].trim()) | m3589z(d[1].trim());
        } else if (length != 4) {
            return 0;
        } else {
            return m3589z(d[3].trim()) | m3589z(d[0].trim()) | m3589z(d[1].trim()) | m3589z(d[2].trim());
        }
    }

    /* renamed from: C */
    private ViewGroup.LayoutParams m3564C(ViewGroup.LayoutParams layoutParams, String str) {
        FrameLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        int t = m3587t(str);
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
        } else {
            if (layoutParams instanceof DrawerLayout.LayoutParams) {
                ((DrawerLayout.LayoutParams) layoutParams).gravity = t;
            } else {
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                } else if (layoutParams instanceof AppBarLayout.LayoutParams) {
                    layoutParams3 = (AppBarLayout.LayoutParams) layoutParams;
                } else if (layoutParams instanceof CollapsingToolbarLayout.LayoutParams) {
                    layoutParams2 = (CollapsingToolbarLayout.LayoutParams) layoutParams;
                } else if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    ((CoordinatorLayout.LayoutParams) layoutParams).gravity = t;
                } else if (layoutParams instanceof ViewPager.LayoutParams) {
                    ((ViewPager.LayoutParams) layoutParams).gravity = t;
                } else if (!(layoutParams instanceof VerticalViewPager.LayoutParams)) {
                    return null;
                } else {
                    ((VerticalViewPager.LayoutParams) layoutParams).f3584b = t;
                }
                layoutParams2.gravity = t;
            }
            return layoutParams;
        }
        layoutParams3.gravity = t;
        return layoutParams;
    }

    /* renamed from: H */
    private ViewGroup.LayoutParams m3565H(ViewGroup.LayoutParams layoutParams, String str) {
        int parseDouble = (int) Double.parseDouble(str);
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            return null;
        }
        ((LinearLayout.LayoutParams) layoutParams).weight = (float) parseDouble;
        return layoutParams;
    }

    @TargetApi(9)
    /* renamed from: J */
    private int m3566J(String str) {
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("if")) {
            return 1;
        }
        return str.equals("never") ? 2 : 0;
    }

    /* renamed from: O */
    private ImageView.ScaleType m3567O(String str) {
        if (str.equals("center")) {
            return ImageView.ScaleType.CENTER;
        }
        if (str.equals("centercrop")) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (str.equals("centerinside")) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if (str.equals("fitcenter")) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (str.equals("fitend")) {
            return ImageView.ScaleType.FIT_END;
        }
        if (str.equals("fitstart")) {
            return ImageView.ScaleType.FIT_START;
        }
        if (str.equals("fitxy")) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (str.equals("matrix")) {
            return ImageView.ScaleType.MATRIX;
        }
        return null;
    }

    /* renamed from: P */
    private int m3568P(String str) {
        if (str.equals("insideoverlay")) {
            return 0;
        }
        if (str.equals("insideinset")) {
            return 16777216;
        }
        if (str.equals("outsideoverlay")) {
            return 33554432;
        }
        return str.equals("outsideinset") ? 50331648 : 0;
    }

    /* renamed from: S */
    private float[] m3569S(String str) {
        float f;
        int i;
        if (str.endsWith("sp")) {
            str = str.substring(0, str.length() - 2);
        } else if (!str.matches("[0-9]+")) {
            if (str.endsWith("dp")) {
                f = Float.parseFloat(str.substring(0, str.length() - 2));
                i = 1;
            } else if (!str.endsWith("px")) {
                return null;
            } else {
                f = Float.parseFloat(str.substring(0, str.length() - 2));
                i = 0;
            }
            return new float[]{(float) i, f};
        }
        f = Float.parseFloat(str);
        i = 2;
        return new float[]{(float) i, f};
    }

    /* renamed from: T */
    private int m3570T(String str) {
        if (str.equals("bold")) {
            return 1;
        }
        if (str.equals("italic")) {
            return 2;
        }
        return str.equals("bolditalic") ? 3 : 0;
    }

    /* renamed from: U */
    private Typeface m3571U(String str) {
        if (str.equals("normal")) {
            return null;
        }
        if (str.equals("sans")) {
            return Typeface.SANS_SERIF;
        }
        if (str.equals("serif")) {
            return Typeface.SERIF;
        }
        if (str.equals("monospace")) {
            return Typeface.MONOSPACE;
        }
        if (str.startsWith("@")) {
            return Typeface.createFromAsset(this.f3067b.getAssets(), C0835f.m1857n(this.f3067b, str));
        }
        if (str.startsWith("%") || str.startsWith("$") || str.startsWith("/")) {
            return Typeface.createFromFile(C0835f.m1857n(this.f3067b, str));
        }
        return null;
    }

    /* renamed from: Z */
    private int m3572Z(String str) {
        return str.endsWith("dp") ? C0860r.m2053l(this.f3067b, Float.parseFloat(str.substring(0, str.length() - 2))) : (int) Double.parseDouble(str);
    }

    /* renamed from: Z1 */
    private boolean m3573Z1(Object obj) {
        View view = this.f3066a;
        if (!(view instanceof WebView)) {
            return false;
        }
        ((WebView) view).goBackOrForward((int) Double.parseDouble(String.valueOf(obj)));
        return true;
    }

    /* renamed from: Z2 */
    private boolean m3574Z2(String str, String str2) {
        View view = this.f3066a;
        if (!(view instanceof EditText)) {
            return false;
        }
        ((EditText) view).setSelection((int) Double.parseDouble(str), (int) Double.parseDouble(str2));
        return true;
    }

    /* renamed from: c */
    private int m3575c(String str) {
        return str.equals("top") ? ((ListView) this.f3066a).getTop() : str.equals("bottom") ? ((ListView) this.f3066a).getBottom() : str.equals("left") ? ((ListView) this.f3066a).getLeft() : str.equals("right") ? ((ListView) this.f3066a).getRight() : (int) Double.parseDouble(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC, Splitter:B:18:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f A[SYNTHETIC, Splitter:B:9:0x002f] */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3576c0(android.view.Menu r4, int r5, java.lang.String r6, android.content.Context r7) {
        /*
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String[] r6 = p013b.p044b.p045a.p046a.C0861s.m2069b(r6, r0)
            int r0 = r6.length
            r1 = 3
            r2 = 0
            if (r0 <= r1) goto L_0x0016
            r1 = r6[r1]     // Catch:{ Exception -> 0x0012 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0012:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0016:
            r1 = 0
        L_0x0017:
            r3 = r6[r2]
            r4.add(r2, r5, r1, r3)
            int r5 = r4.size()
            r1 = 1
            int r5 = r5 - r1
            android.view.MenuItem r4 = r4.getItem(r5)
            r5 = 0
            r3 = r6[r1]
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x003a
            r3 = r6[r1]     // Catch:{ Exception -> 0x0036 }
            android.graphics.drawable.Drawable r5 = m3582m(r3, r7)     // Catch:{ Exception -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
        L_0x003a:
            if (r5 == 0) goto L_0x0040
            r4.setIcon(r5)
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            r5 = 2
            if (r0 <= r5) goto L_0x004f
            r5 = r6[r5]     // Catch:{ Exception -> 0x004b }
            int r2 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r5 = move-exception
            r5.printStackTrace()
        L_0x004f:
            r4.setShowAsAction(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.C1305g.m3576c0(android.view.Menu, int, java.lang.String, android.content.Context):boolean");
    }

    /* renamed from: g */
    public static int m3577g(String str) {
        if (!str.contains("|")) {
            return m3578h(str.trim());
        }
        String[] d = C0861s.m2071d(str, "|");
        int length = d.length;
        if (length == 2) {
            return m3578h(d[1].trim()) | m3578h(d[0].trim());
        } else if (length == 3) {
            return m3578h(d[2].trim()) | m3578h(d[0].trim()) | m3578h(d[1].trim());
        } else if (length != 4) {
            return 1;
        } else {
            return m3578h(d[3].trim()) | m3578h(d[0].trim()) | m3578h(d[1].trim()) | m3578h(d[2].trim());
        }
    }

    /* renamed from: h */
    private static int m3578h(String str) {
        if (str.equals("exitUntilCollapsed")) {
            return 2;
        }
        if (str.equals("enterAlwaysCollapsed")) {
            return 8;
        }
        if (str.equals("scroll")) {
            return 1;
        }
        if (str.equals("enterAlways")) {
            return 4;
        }
        if (str.equals("snap")) {
            return 16;
        }
        if (str.matches("[0-9]+")) {
            return (int) Double.parseDouble(str);
        }
        return 1;
    }

    /* renamed from: i */
    private static Drawable m3579i(Context context, int i) {
        Drawable drawable = null;
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i, typedValue, true);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{i});
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        } catch (Exception e) {
            e.printStackTrace();
            return drawable;
        }
    }

    /* renamed from: j */
    private ColorStateList m3580j(int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842912}, new int[0]}, new int[]{i3, i, i2});
    }

    /* renamed from: l */
    private int m3581l(String str) {
        if (str.equals("web")) {
            return 1;
        }
        if (str.equals(NotificationCompat.CATEGORY_EMAIL)) {
            return 2;
        }
        if (str.equals("phone")) {
            return 4;
        }
        if (str.equals("map")) {
            return 8;
        }
        return str.equals("all") ? 15 : 0;
    }

    /* renamed from: m */
    public static Drawable m3582m(String str, Context context) {
        if (str.startsWith("@")) {
            return new BitmapDrawable(C0849k.m1962b(context, C0835f.m1857n(context, str)));
        }
        if (str.startsWith("%") || str.startsWith("$") || str.startsWith("/")) {
            return new BitmapDrawable(C0849k.m1963c(C0835f.m1857n(context, str)));
        }
        if (str.startsWith("#")) {
            return new ColorDrawable(Color.parseColor(str));
        }
        if (str.equals("through")) {
            return new C0917c(context).mo9107b(Color.parseColor("#10000000"), Color.parseColor("#10000000"), Color.parseColor("#00000000"));
        }
        if (str.equals("white")) {
            return new C0917c(context).mo9107b(Color.parseColor("#e6eaf7"), Color.parseColor("#e6eaf7"), Color.parseColor("#ffffff"));
        }
        if (str.equals("black")) {
            return new C0917c(context).mo9107b(Color.parseColor("#202020"), Color.parseColor("#202020"), Color.parseColor("#000000"));
        }
        if (str.equals("selectableitem")) {
            return m3579i(context, 16843534);
        }
        if (str.equals("selectableitemborderless")) {
            return m3579i(context, 16843868);
        }
        if (str.matches("[0-9]+")) {
            return context.getResources().getDrawable((int) Double.parseDouble(str));
        }
        return null;
    }

    /* renamed from: n */
    private int m3583n(String str) {
        if (str.equals("spread_inside")) {
            return 1;
        }
        return (!str.equals("spread") && str.equals("packed")) ? 2 : 0;
    }

    /* renamed from: q */
    private int m3584q(String str) {
        return str.startsWith("#") ? Color.parseColor(str) : Integer.parseInt(str);
    }

    /* renamed from: r */
    private int m3585r(String str) {
        if (str.equals("closed")) {
            return 1;
        }
        if (str.equals("open")) {
            return 2;
        }
        if (str.equals("unlocked")) {
            return 0;
        }
        return Integer.parseInt(str);
    }

    /* renamed from: s */
    private TextUtils.TruncateAt m3586s(String str) {
        return str.equals("start") ? TextUtils.TruncateAt.START : str.equals("end") ? TextUtils.TruncateAt.END : str.equals("middle") ? TextUtils.TruncateAt.MIDDLE : str.equals("marquee") ? TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.valueOf(str);
    }

    /* renamed from: t */
    public static int m3587t(String str) {
        if (!str.contains("|")) {
            return m3588u(str.trim());
        }
        String[] d = C0861s.m2071d(str, "|");
        int length = d.length;
        if (length == 2) {
            return m3588u(d[1].trim()) | m3588u(d[0].trim());
        } else if (length == 3) {
            return m3588u(d[2].trim()) | m3588u(d[0].trim()) | m3588u(d[1].trim());
        } else if (length != 4) {
            return 0;
        } else {
            return m3588u(d[3].trim()) | m3588u(d[0].trim()) | m3588u(d[1].trim()) | m3588u(d[2].trim());
        }
    }

    @TargetApi(14)
    /* renamed from: u */
    private static int m3588u(String str) {
        int i = Build.VERSION.SDK_INT;
        if (str.equals("center")) {
            return 17;
        }
        if (str.equals("top")) {
            return 48;
        }
        if (str.equals("bottom")) {
            return 80;
        }
        if (str.equals("left")) {
            return 3;
        }
        if (str.equals("right")) {
            return 5;
        }
        if (str.equals("center_vertical")) {
            return 16;
        }
        if (str.equals("center_horizontal")) {
            return 1;
        }
        if (str.equals("start")) {
            if (i >= 14) {
                return GravityCompat.START;
            }
            return 3;
        } else if (str.equals("end")) {
            if (i >= 14) {
                return GravityCompat.END;
            }
            return 5;
        } else if (str.matches("[0-9]+")) {
            return (int) Double.parseDouble(str);
        } else {
            return 0;
        }
    }

    /* renamed from: z */
    private int m3589z(String str) {
        if (str.equals("none")) {
            return 0;
        }
        if (str.equals("text")) {
            return 1;
        }
        if (str.equals("textcapcharacters")) {
            return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (str.equals("textcapwords")) {
            return 8193;
        }
        if (str.equals("textcapsentences")) {
            return 16385;
        }
        if (str.equals("textautocomplete")) {
            return 65537;
        }
        if (str.equals("textautocorrect")) {
            return 32769;
        }
        if (str.equals("texturi")) {
            return 17;
        }
        if (str.equals("textemailaddress")) {
            return 33;
        }
        if (str.equals("textpostaladdress")) {
            return 113;
        }
        if (str.equals("textpassword")) {
            return 129;
        }
        if (str.equals("textvisiblepassword")) {
            return Constants.I2B;
        }
        if (str.equals("textwebedittext")) {
            return Constants.IF_ICMPLT;
        }
        if (str.equals("number")) {
            return 2;
        }
        if (str.equals("numbersigned")) {
            return InputDeviceCompat.SOURCE_TOUCHSCREEN;
        }
        if (str.equals("numberdecimal")) {
            return 8194;
        }
        if (str.equals("phone")) {
            return 3;
        }
        if (str.equals("datetime")) {
            return 4;
        }
        if (str.equals("date")) {
            return 20;
        }
        if (str.equals("time")) {
            return 36;
        }
        if (str.matches("[0-9]+")) {
            return (int) Double.parseDouble(str);
        }
        return 0;
    }

    /* renamed from: A0 */
    public boolean mo11703A0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CollapsingToolbarLayout)) {
            return false;
        }
        ((CollapsingToolbarLayout) view).setExpandedTitleGravity(m3587t(str));
        return true;
    }

    /* renamed from: A1 */
    public boolean mo11704A1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f165f = i2;
        return true;
    }

    /* renamed from: A2 */
    public boolean mo11705A2(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        return true;
    }

    /* renamed from: A3 */
    public boolean mo11706A3(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setTypeface(((TextView) view).getTypeface(), m3570T(str));
        return true;
    }

    /* renamed from: B */
    public Object mo11707B(Object obj) {
        View view = this.f3066a;
        if (view instanceof DrawerLayout) {
            return Boolean.valueOf(((DrawerLayout) view).isDrawerOpen(m3587t(obj.toString())));
        }
        return null;
    }

    /* renamed from: B0 */
    public boolean mo11708B0(String str) {
        int i = 0;
        if (!(this.f3066a instanceof CollapsingToolbarLayout)) {
            return false;
        }
        String[] a = C0861s.m2068a(str.trim());
        int length = a.length;
        int Z = length > 0 ? m3572Z(a[0].trim()) : 0;
        int Z2 = length > 1 ? m3572Z(a[1].trim()) : 0;
        int Z3 = length > 2 ? m3572Z(a[2].trim()) : 0;
        if (length > 3) {
            i = m3572Z(a[3].trim());
        }
        ((CollapsingToolbarLayout) this.f3066a).setExpandedTitleMargin(Z, Z2, Z3, i);
        return true;
    }

    /* renamed from: B1 */
    public boolean mo11709B1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f167g = i2;
        return true;
    }

    /* renamed from: B2 */
    public boolean mo11710B2(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setMaxLines(i);
        return true;
    }

    /* renamed from: B3 */
    public boolean mo11711B3(String str) {
        View view = this.f3066a;
        if (!(view instanceof SwitchCompat)) {
            return false;
        }
        ((SwitchCompat) view).setThumbTintList(ColorStateList.valueOf(m3584q(str)));
        return true;
    }

    /* renamed from: C0 */
    public boolean mo11712C0(int i) {
        if (!(this.f3066a.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return false;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.f3066a.getLayoutParams();
        layoutParams.setAnchorId(this.f3068c + i);
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: C1 */
    public boolean mo11713C1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f182p = i2;
        return true;
    }

    /* renamed from: C2 */
    public boolean mo11714C2(String str) {
        View view = this.f3066a;
        if (!(view instanceof ImageView)) {
            return false;
        }
        ((ImageView) view).setMaxWidth(m3572Z(str));
        return true;
    }

    /* renamed from: C3 */
    public boolean mo11715C3(String str) {
        SwitchCompat switchCompat;
        PorterDuff.Mode mode;
        if (!(this.f3066a instanceof SwitchCompat)) {
            return false;
        }
        if (str.equals("add")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.ADD;
        } else if (str.equals("multiply")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.MULTIPLY;
        } else if (str.equals("screen")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SCREEN;
        } else if (str.equals("src_atop")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SRC_ATOP;
        } else if (!str.equals("src_in") && str.equals("src_over")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SRC_OVER;
        } else {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SRC_IN;
        }
        switchCompat.setThumbTintMode(mode);
        return true;
    }

    /* renamed from: D */
    public int mo11716D() {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return 0;
    }

    /* renamed from: D0 */
    public boolean mo11717D0(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return false;
        }
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.f3066a.getLayoutParams();
        layoutParams.anchorGravity = m3587t(str);
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: D1 */
    public boolean mo11718D1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f183q = i2;
        return true;
    }

    /* renamed from: D2 */
    public boolean mo11719D2(String str) {
        this.f3066a.setMinimumHeight(m3572Z(str));
        return true;
    }

    /* renamed from: D3 */
    public boolean mo11720D3(String str) {
        ColorStateList colorStateList;
        SwitchCompat switchCompat;
        if (!(this.f3066a instanceof SwitchCompat)) {
            return false;
        }
        if (str.contains("|")) {
            String[] b = C0861s.m2069b(str, '|');
            switchCompat = (SwitchCompat) this.f3066a;
            colorStateList = m3580j(m3584q(b[0].trim()), m3584q(b[1].trim()), m3584q(b[2].trim()));
        } else {
            switchCompat = (SwitchCompat) this.f3066a;
            colorStateList = ColorStateList.valueOf(m3584q(str));
        }
        switchCompat.setTrackTintList(colorStateList);
        return true;
    }

    /* renamed from: E */
    public int mo11721E() {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        return 0;
    }

    /* renamed from: E0 */
    public boolean mo11722E0(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (!(this.f3066a.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                return false;
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) this.f3066a.getLayoutParams();
            layoutParams.setBehavior((CoordinatorLayout.Behavior) cls.newInstance());
            this.f3066a.setLayoutParams(layoutParams);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: E1 */
    public boolean mo11723E1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f171i = i2;
        return true;
    }

    /* renamed from: E2 */
    public boolean mo11724E2(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setMinLines(i);
        return true;
    }

    /* renamed from: E3 */
    public boolean mo11725E3(String str) {
        SwitchCompat switchCompat;
        PorterDuff.Mode mode;
        View view = this.f3066a;
        if (!(view instanceof SwitchCompat) || !(view instanceof SwitchCompat)) {
            return false;
        }
        if (str.equals("add")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.ADD;
        } else if (str.equals("multiply")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.MULTIPLY;
        } else if (str.equals("screen")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SCREEN;
        } else if (str.equals("src_atop")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SRC_ATOP;
        } else if (!str.equals("src_in") && str.equals("src_over")) {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SRC_OVER;
        } else {
            switchCompat = (SwitchCompat) this.f3066a;
            mode = PorterDuff.Mode.SRC_IN;
        }
        switchCompat.setTrackTintMode(mode);
        return true;
    }

    /* renamed from: F */
    public int mo11726F() {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
        return 0;
    }

    /* renamed from: F0 */
    public boolean mo11727F0(String str) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof AppBarLayout.LayoutParams) {
            layoutParams = this.f3066a.getLayoutParams();
        } else if (!(layoutParams instanceof CollapsingToolbarLayout.LayoutParams)) {
            return false;
        }
        CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) layoutParams;
        if (str.equals("pin")) {
            layoutParams2.setCollapseMode(1);
        } else if (str.equals("parallax")) {
            layoutParams2.setCollapseMode(2);
        } else if (str.equals("none")) {
            layoutParams2.setCollapseMode(0);
        }
        this.f3066a.setLayoutParams(layoutParams2);
        return true;
    }

    /* renamed from: F1 */
    public boolean mo11728F1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f169h = i2;
        return true;
    }

    /* renamed from: F2 */
    public boolean mo11729F2(String str) {
        this.f3066a.setMinimumWidth(m3572Z(str));
        return true;
    }

    /* renamed from: F3 */
    public boolean mo11730F3(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setTypeface(m3571U(str));
        return true;
    }

    /* renamed from: G */
    public int mo11731G() {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return 0;
    }

    /* renamed from: G0 */
    public boolean mo11732G0(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof AppBarLayout.LayoutParams)) {
            return false;
        }
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.f3066a.getLayoutParams();
        layoutParams.setScrollFlags(m3577g(str));
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: G1 */
    public boolean mo11733G1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f129A = Float.parseFloat(str);
        return true;
    }

    /* renamed from: G2 */
    public boolean mo11734G2(String str) {
        View view = this.f3066a;
        if (!(view instanceof RatingBar)) {
            return false;
        }
        ((RatingBar) view).setNumStars((int) Double.parseDouble(str));
        return true;
    }

    /* renamed from: G3 */
    public boolean mo11735G3(String str) {
        StringBuilder sb;
        String str2;
        if (!(this.f3066a instanceof WebView)) {
            return false;
        }
        if (str.startsWith("@")) {
            sb = new StringBuilder();
            str2 = "file:///android_asset/";
        } else {
            if (str.startsWith("%") || str.startsWith("$") || str.startsWith("/")) {
                sb = new StringBuilder();
                str2 = "file://";
            }
            ((WebView) this.f3066a).loadUrl(str);
            return true;
        }
        sb.append(str2);
        sb.append(C0835f.m1857n(this.f3067b, str));
        str = sb.toString();
        ((WebView) this.f3066a).loadUrl(str);
        return true;
    }

    /* renamed from: H0 */
    public boolean mo11736H0(String str) {
        int i;
        if (this.f3066a instanceof Toolbar) {
            if (str.equals("ThemeOverlay_AppCompat")) {
                i = 2131624251;
            } else if (str.equals("ThemeOverlay_AppCompat_Dark")) {
                i = 2131624253;
            } else if (str.equals("ThemeOverlay_AppCompat_ActionBar")) {
                i = 2131624252;
            } else if (str.equals("ThemeOverlay_AppCompat_Dark_ActionBar")) {
                i = 2131624254;
            } else if (str.equals("ThemeOverlay_AppCompat_Dialog")) {
                i = 2131624255;
            } else if (str.equals("ThemeOverlay_AppCompat_Dialog_Alert")) {
                i = 2131624256;
            } else if (str.equals("ThemeOverlay_AppCompat_Light")) {
                i = 2131624257;
            } else if (str.matches("[0-9]+")) {
                i = (int) Double.parseDouble(str);
            }
            ((Toolbar) this.f3066a).setPopupTheme(i);
        }
        return false;
    }

    /* renamed from: H1 */
    public boolean mo11737H1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f135G = m3583n(str);
        return true;
    }

    /* renamed from: H2 */
    public boolean mo11738H2(Object obj) {
        View view = this.f3066a;
        if (!(view instanceof DrawerLayout)) {
            return false;
        }
        ((DrawerLayout) view).openDrawer(m3587t(obj.toString()));
        return true;
    }

    /* renamed from: H3 */
    public boolean mo11739H3(String str, String str2, String str3) {
        View view = this.f3066a;
        if (!(view instanceof WebView)) {
            return false;
        }
        WebView webView = (WebView) view;
        webView.getSettings().setDefaultTextEncodingName(str2);
        webView.loadDataWithBaseURL(null, str, str3, str2, null);
        return true;
    }

    /* renamed from: I */
    public int mo11740I(String str) {
        if (str.equals("marquee_forever")) {
            return -1;
        }
        if (str.matches("[0-9]+")) {
            return (int) Double.parseDouble(str);
        }
        return 1;
    }

    /* renamed from: I0 */
    public boolean mo11741I0(String str) {
        View view = this.f3066a;
        if (!(view instanceof Toolbar)) {
            return false;
        }
        ((Toolbar) view).setSubtitle(str);
        return true;
    }

    /* renamed from: I1 */
    public boolean mo11742I1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f133E = (float) Integer.parseInt(str);
        return true;
    }

    /* renamed from: I2 */
    public boolean mo11743I2(String str) {
        int i = !str.equals("horizontal");
        View view = this.f3066a;
        if (view instanceof LinearLayout) {
            ((LinearLayout) view).setOrientation(i);
        } else if (view instanceof RadioGroup) {
            ((RadioGroup) view).setOrientation(i);
        } else if (view instanceof TableLayout) {
            ((TableLayout) view).setOrientation(i);
        } else if (!(view instanceof TableRow)) {
            return false;
        } else {
            ((TableRow) view).setOrientation(i);
        }
        return true;
    }

    /* renamed from: I3 */
    public boolean mo11744I3(int i) {
        return mo11818Y3(2, i);
    }

    /* renamed from: J0 */
    public boolean mo11745J0(String str) {
        View view = this.f3066a;
        if (!(view instanceof Toolbar)) {
            return false;
        }
        ((Toolbar) view).setSubtitleTextColor(m3584q(str));
        return true;
    }

    /* renamed from: J1 */
    public boolean mo11746J1(Object obj) {
        View view = this.f3066a;
        if (view instanceof ViewPager) {
            ((ViewPager) view).setCurrentItem((int) Double.parseDouble(obj.toString()));
            return true;
        } else if (!(view instanceof VerticalViewPager)) {
            return false;
        } else {
            ((VerticalViewPager) view).setCurrentItem((int) Double.parseDouble(obj.toString()));
            return true;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: J2 */
    public boolean mo11747J2(String str) {
        if (Build.VERSION.SDK_INT < 9) {
            return true;
        }
        this.f3066a.setOverScrollMode(m3566J(str));
        return true;
    }

    /* renamed from: J3 */
    public boolean mo11748J3(int i) {
        return mo11818Y3(4, i);
    }

    /* renamed from: K */
    public int mo11749K() {
        return this.f3066a.getPaddingBottom();
    }

    /* renamed from: K0 */
    public boolean mo11750K0(String str) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        TabLayout tabLayout = (TabLayout) view;
        TabLayout.C1283g newTab = tabLayout.newTab();
        newTab.mo11610n(str);
        tabLayout.addTab(newTab);
        return true;
    }

    /* renamed from: K1 */
    public boolean mo11751K1(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        textView.setCursorVisible(z);
        return true;
    }

    /* renamed from: K2 */
    public boolean mo11752K2(String str) {
        int Z = m3572Z(str);
        this.f3066a.setPadding(Z, Z, Z, Z);
        return true;
    }

    /* renamed from: K3 */
    public boolean mo11753K3(int i) {
        return mo11818Y3(8, i);
    }

    /* renamed from: L */
    public int mo11754L() {
        return this.f3066a.getPaddingLeft();
    }

    /* renamed from: L0 */
    public boolean mo11755L0(String str) {
        int i;
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        TabLayout tabLayout = (TabLayout) view;
        try {
            i = Integer.parseInt(str);
            tabLayout.removeTabAt(i);
        } catch (Exception e) {
            e.printStackTrace();
            i = -1;
        }
        if (i != -1) {
            return true;
        }
        for (int i2 = 0; i2 < tabLayout.getTabCount(); i2++) {
            if (String.valueOf(tabLayout.getTabAt(i2).mo11601e()).equals(str)) {
                tabLayout.removeTabAt(i);
                return true;
            }
        }
        return true;
    }

    /* renamed from: L1 */
    public boolean mo11756L1(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setKeyListener(DigitsKeyListener.getInstance(str));
        return true;
    }

    /* renamed from: L2 */
    public boolean mo11757L2(String str) {
        this.f3066a.setPadding(0, 0, 0, m3572Z(str));
        return true;
    }

    /* renamed from: L3 */
    public boolean mo11758L3(int i) {
        return mo11818Y3(5, i);
    }

    /* renamed from: M */
    public int mo11759M() {
        return this.f3066a.getPaddingRight();
    }

    /* renamed from: M0 */
    public boolean mo11760M0(int i) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        ((TabLayout) view).setTabGravity(i);
        return true;
    }

    /* renamed from: M1 */
    public boolean mo11761M1(Object obj) {
        if (!(this.f3066a instanceof ListView)) {
            return false;
        }
        ((ListView) this.f3066a).setDivider(obj instanceof Drawable ? (Drawable) obj : obj instanceof Bitmap ? new BitmapDrawable((Resources) null, (Bitmap) obj) : m3582m(String.valueOf(obj), this.f3067b));
        return true;
    }

    /* renamed from: M2 */
    public boolean mo11762M2(String str) {
        this.f3066a.setPadding(m3572Z(str), 0, 0, 0);
        return true;
    }

    /* renamed from: M3 */
    public boolean mo11763M3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(12, -1) : mo11818Y3(12, 0);
    }

    /* renamed from: N */
    public int mo11764N() {
        return this.f3066a.getPaddingTop();
    }

    /* renamed from: N0 */
    public boolean mo11765N0(String str) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        ((TabLayout) view).setSelectedTabIndicatorColor(m3584q(str));
        return true;
    }

    /* renamed from: N1 */
    public boolean mo11766N1(String str) {
        View view = this.f3066a;
        if (!(view instanceof ListView)) {
            return false;
        }
        ((ListView) view).setDivider(m3582m(str, this.f3067b));
        return true;
    }

    /* renamed from: N2 */
    public boolean mo11767N2(String str) {
        this.f3066a.setPadding(0, 0, m3572Z(str), 0);
        return true;
    }

    /* renamed from: N3 */
    public boolean mo11768N3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(9, -1) : mo11818Y3(9, 0);
    }

    /* renamed from: O0 */
    public boolean mo11769O0(String str) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        ((TabLayout) view).setSelectedTabIndicatorHeight(m3572Z(str));
        return true;
    }

    /* renamed from: O1 */
    public boolean mo11770O1(String str) {
        View view = this.f3066a;
        if (!(view instanceof ListView)) {
            return false;
        }
        ((ListView) view).setDividerHeight(m3572Z(str));
        return true;
    }

    /* renamed from: O2 */
    public boolean mo11771O2(String str) {
        this.f3066a.setPadding(0, m3572Z(str), 0, 0);
        return true;
    }

    /* renamed from: O3 */
    public boolean mo11772O3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(11, -1) : mo11818Y3(11, 0);
    }

    /* renamed from: P0 */
    public boolean mo11773P0(String str) {
        TabLayout.C1280f slidingTabStrip;
        View view = this.f3066a;
        if (!(view instanceof TabLayout) || (slidingTabStrip = ((TabLayout) view).getSlidingTabStrip()) == null) {
            return false;
        }
        slidingTabStrip.setTabIndicatorWidth(m3572Z(str));
        return true;
    }

    /* renamed from: P1 */
    public boolean mo11774P1(Object obj) {
        View view = this.f3066a;
        if (!(view instanceof DrawerLayout)) {
            return false;
        }
        ((DrawerLayout) view).setDrawerLockMode(m3585r(obj.toString()));
        return true;
    }

    /* renamed from: P2 */
    public boolean mo11775P2(String str) {
        View view = this.f3066a;
        if (!(view instanceof ProgressBar)) {
            return false;
        }
        ((ProgressBar) view).setProgress((int) Double.parseDouble(str));
        return true;
    }

    /* renamed from: P3 */
    public boolean mo11776P3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(10, -1) : mo11818Y3(10, 0);
    }

    /* renamed from: Q */
    public Object mo11777Q(Object obj) {
        View view = this.f3066a;
        if (view instanceof TableLayout) {
            return Boolean.valueOf(((TableLayout) view).isColumnShrinkable((int) Double.parseDouble(String.valueOf(obj))));
        }
        return null;
    }

    /* renamed from: Q0 */
    public boolean mo11778Q0(String str) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        TabLayout tabLayout = (TabLayout) view;
        String[] b = C0861s.m2069b(str, '|');
        tabLayout.removeAllTabs();
        for (String str2 : b) {
            TabLayout.C1283g newTab = tabLayout.newTab();
            newTab.mo11610n(str2);
            tabLayout.addTab(newTab);
        }
        return true;
    }

    /* renamed from: Q1 */
    public boolean mo11779Q1(String str) {
        if (!(this.f3066a instanceof TextView)) {
            return false;
        }
        if (str.equals("true") || str.equals("1")) {
            ((TextView) this.f3066a).setFilters(new InputFilter[]{new C1306a(this)});
        } else {
            ((TextView) this.f3066a).setFilters(new InputFilter[]{new C1307b(this)});
        }
        return true;
    }

    /* renamed from: Q2 */
    public boolean mo11780Q2(String str) {
        View view = this.f3066a;
        if (!(view instanceof RatingBar)) {
            return false;
        }
        ((RatingBar) view).setRating(Float.parseFloat(str));
        return true;
    }

    /* renamed from: Q3 */
    public boolean mo11781Q3(int i) {
        return mo11818Y3(7, i);
    }

    /* renamed from: R */
    public Object mo11782R(Object obj) {
        View view = this.f3066a;
        if (view instanceof TableLayout) {
            return Boolean.valueOf(((TableLayout) view).isColumnStretchable((int) Double.parseDouble(String.valueOf(obj))));
        }
        return null;
    }

    /* renamed from: R0 */
    public boolean mo11783R0(int i) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        ((TabLayout) view).setTabMode(i);
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: R1 */
    public boolean mo11784R1(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return true;
        }
        this.f3066a.setElevation((float) m3572Z(str));
        return true;
    }

    /* renamed from: R2 */
    public boolean mo11785R2(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof SwipeRefreshLayout)) {
            return false;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        swipeRefreshLayout.setRefreshing(z);
        return true;
    }

    /* renamed from: R3 */
    public boolean mo11786R3(int i) {
        return mo11818Y3(6, i);
    }

    /* renamed from: S0 */
    public boolean mo11787S0(String str) {
        if (this.f3066a instanceof TabLayout) {
            String[] b = C0861s.m2069b(str, '|');
            if (b.length == 2) {
                ((TabLayout) this.f3066a).setTabTextColors(m3584q(b[0]), m3584q(b[1]));
                return true;
            }
        }
        return false;
    }

    /* renamed from: S1 */
    public boolean mo11788S1(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setEllipsize(m3586s(str));
        return true;
    }

    /* renamed from: S2 */
    public boolean mo11789S2(String str) {
        View view = this.f3066a;
        if (!(view instanceof ImageView)) {
            return false;
        }
        ((ImageView) view).setScaleType(m3567O(str));
        return true;
    }

    /* renamed from: S3 */
    public boolean mo11790S3(int i) {
        return mo11818Y3(3, i);
    }

    /* renamed from: T0 */
    public boolean mo11791T0(String str) {
        View view = this.f3066a;
        if (!(view instanceof Toolbar)) {
            return false;
        }
        ((Toolbar) view).setTitle(str);
        return true;
    }

    /* renamed from: T1 */
    public boolean mo11792T1(String str) {
        if (str.equals("none")) {
            this.f3066a.setVerticalFadingEdgeEnabled(false);
            this.f3066a.setHorizontalFadingEdgeEnabled(false);
            return true;
        }
        if (str.equals("horizontal")) {
            this.f3066a.setHorizontalFadingEdgeEnabled(true);
        } else if (!str.equals("vertical")) {
            return false;
        } else {
            this.f3066a.setVerticalFadingEdgeEnabled(true);
        }
        return true;
    }

    /* renamed from: T2 */
    public boolean mo11793T2(String str) {
        if (str.equals("none")) {
            this.f3066a.setVerticalScrollBarEnabled(false);
            this.f3066a.setHorizontalScrollBarEnabled(false);
            return true;
        }
        if (str.equals("horizontal")) {
            this.f3066a.setHorizontalScrollBarEnabled(true);
        } else if (!str.equals("vertical")) {
            return false;
        } else {
            this.f3066a.setVerticalScrollBarEnabled(true);
        }
        return true;
    }

    /* renamed from: T3 */
    public boolean mo11794T3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(14, -1) : mo11818Y3(14, 0);
    }

    /* renamed from: U0 */
    public boolean mo11795U0(String str) {
        View view = this.f3066a;
        if (!(view instanceof Toolbar)) {
            return false;
        }
        ((Toolbar) view).setTitleTextColor(m3584q(str));
        return true;
    }

    /* renamed from: U1 */
    public boolean mo11796U1(String str) {
        this.f3066a.setFadingEdgeLength((int) Double.parseDouble(str));
        return true;
    }

    /* renamed from: U2 */
    public boolean mo11797U2(String str) {
        this.f3066a.setScrollBarStyle(m3568P(str));
        return true;
    }

    /* renamed from: U3 */
    public boolean mo11798U3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(13, -1) : mo11818Y3(13, 0);
    }

    /* renamed from: V */
    public String mo11799V() {
        View view = this.f3066a;
        if (view instanceof WebView) {
            return ((WebView) view).getUrl();
        }
        return null;
    }

    /* renamed from: V0 */
    public boolean mo11800V0(String str) {
        boolean z = false;
        if (this.f3066a instanceof Toolbar) {
            String[] a = C0861s.m2068a(str.trim());
            int length = a.length;
            if (length > 0) {
                ((Toolbar) this.f3066a).setTitleMarginStart(m3572Z(a[0].trim()));
            }
            z = true;
            if (length > 1) {
                ((Toolbar) this.f3066a).setTitleMarginTop(m3572Z(a[1].trim()));
            }
            if (length > 2) {
                ((Toolbar) this.f3066a).setTitleMarginEnd(m3572Z(a[2].trim()));
            }
            if (length > 3) {
                ((Toolbar) this.f3066a).setTitleMarginBottom(m3572Z(a[3].trim()));
            }
        }
        return z;
    }

    /* renamed from: V1 */
    public boolean mo11801V1(String str) {
        this.f3066a.setFocusable(str.equals("true") || str.equals("1"));
        return true;
    }

    /* renamed from: V2 */
    public boolean mo11802V2(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        textView.setHorizontallyScrolling(z);
        return true;
    }

    /* renamed from: V3 */
    public boolean mo11803V3(String str) {
        return str.equals("true") || str.equals("1") ? mo11818Y3(15, -1) : mo11818Y3(15, 0);
    }

    /* renamed from: W */
    public int mo11804W() {
        return this.f3066a.getVisibility();
    }

    /* renamed from: W0 */
    public boolean mo11805W0(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setAutoLinkMask(m3581l(str));
        return true;
    }

    /* renamed from: W1 */
    public boolean mo11806W1(String str) {
        this.f3066a.setFocusableInTouchMode(str.equals("true") || str.equals("1"));
        return true;
    }

    /* renamed from: W2 */
    public boolean mo11807W2(String str) {
        View view = this.f3066a;
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            scrollView.smoothScrollTo((int) Double.parseDouble(str), scrollView.getScrollY());
            return true;
        } else if (!(view instanceof HorizontalScrollView)) {
            return false;
        } else {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
            horizontalScrollView.smoothScrollTo((int) Double.parseDouble(str), horizontalScrollView.getScrollY());
            return true;
        }
    }

    /* renamed from: W3 */
    public boolean mo11808W3(int i) {
        return mo11818Y3(0, i);
    }

    /* renamed from: X */
    public int mo11809X(String str) {
        if (str.equals("visible")) {
            return 0;
        }
        if (str.equals("invisible")) {
            return 4;
        }
        if (str.equals("gone")) {
            return 8;
        }
        if (str.matches("[0-9]+")) {
            return (int) Double.parseDouble(str);
        }
        return 0;
    }

    /* renamed from: X0 */
    public boolean mo11810X0(Object obj) {
        if (this.f3067b != null && (obj instanceof String)) {
            String obj2 = obj.toString();
            String lowerCase = obj2.toLowerCase();
            if (lowerCase.startsWith("http:") || lowerCase.startsWith("https:") || lowerCase.startsWith("ftp:")) {
                C0844j.m1936a(this.f3067b, this.f3066a, obj2, lowerCase, true);
                return true;
            }
        }
        Drawable bitmapDrawable = obj instanceof Drawable ? (Drawable) obj : obj instanceof Bitmap ? new BitmapDrawable((Bitmap) obj) : m3582m(String.valueOf(obj), this.f3067b);
        if (bitmapDrawable == null) {
            this.f3066a.setBackgroundDrawable(null);
        } else {
            this.f3066a.setBackgroundDrawable(bitmapDrawable);
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: X1 */
    public boolean mo11811X1(Object obj) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        Drawable bitmapDrawable = obj instanceof Drawable ? (Drawable) obj : obj instanceof Bitmap ? new BitmapDrawable((Resources) null, (Bitmap) obj) : m3582m(String.valueOf(obj), this.f3067b);
        if (bitmapDrawable == null) {
            this.f3066a.setForeground(null);
            return true;
        }
        this.f3066a.setForeground(bitmapDrawable);
        return true;
    }

    /* renamed from: X2 */
    public boolean mo11812X2(String str) {
        View view = this.f3066a;
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            scrollView.smoothScrollTo(scrollView.getScrollX(), (int) Double.parseDouble(str));
            return true;
        } else if (!(view instanceof HorizontalScrollView)) {
            return false;
        } else {
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
            horizontalScrollView.smoothScrollTo(horizontalScrollView.getScrollX(), (int) Double.parseDouble(str));
            return true;
        }
    }

    /* renamed from: X3 */
    public boolean mo11813X3(int i) {
        return mo11818Y3(1, i);
    }

    /* renamed from: Y */
    public int mo11814Y() {
        return this.f3066a.getLayoutParams().width;
    }

    /* renamed from: Y0 */
    public boolean mo11815Y0(String str) {
        if (!(this.f3067b == null || str == null)) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("http:") || lowerCase.startsWith("https:") || lowerCase.startsWith("ftp:")) {
                C0844j.m1936a(this.f3067b, this.f3066a, str, lowerCase, true);
                return true;
            }
        }
        Drawable m = m3582m(str, this.f3067b);
        if (m == null) {
            this.f3066a.setBackgroundDrawable(null);
        } else {
            this.f3066a.setBackgroundDrawable(m);
        }
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Y1 */
    public boolean mo11816Y1(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        this.f3066a.setForeground(m3582m(str, this.f3067b));
        return true;
    }

    /* renamed from: Y2 */
    public boolean mo11817Y2(String str) {
        View view = this.f3066a;
        if (view instanceof AbsSpinner) {
            ((AbsSpinner) view).setSelection((int) Double.parseDouble(str), true);
        } else if (view instanceof EditText) {
            ((EditText) view).setSelection((int) Double.parseDouble(str));
        } else if (view instanceof ListView) {
            ((ListView) view).setSelection(m3575c(str));
        } else if (!(view instanceof RecyclerView)) {
            return false;
        } else {
            ((RecyclerView) view).smoothScrollToPosition((int) Double.parseDouble(str));
        }
        return true;
    }

    /* renamed from: Y3 */
    public boolean mo11818Y3(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (!(i2 == -1 || i2 == 0)) {
            i2 += this.f3068c;
        }
        layoutParams2.addRule(i, i2);
        this.f3066a.setLayoutParams(layoutParams2);
        return true;
    }

    /* renamed from: Z0 */
    public boolean mo11819Z0(int i) {
        this.f3066a.setBackgroundColor(i);
        return true;
    }

    /* renamed from: Z3 */
    public boolean mo11820Z3(String str) {
        this.f3066a.setVisibility(mo11809X(str));
        return true;
    }

    /* renamed from: a */
    public boolean mo11821a(String str) {
        int i = 0;
        if (!(this.f3066a instanceof Toolbar)) {
            return false;
        }
        String[] a = C0861s.m2068a(str.trim());
        int length = a.length;
        int Z = length > 0 ? m3572Z(a[0].trim()) : 0;
        int Z2 = length > 1 ? m3572Z(a[1].trim()) : 0;
        int Z3 = length > 2 ? m3572Z(a[2].trim()) : 0;
        if (length > 3) {
            i = m3572Z(a[3].trim());
        }
        ((Toolbar) this.f3066a).setContentInsetsAbsolute(Z, Z3);
        if (!(Z2 == 0 && i == 0)) {
            ((Toolbar) this.f3066a).setContentInsetsRelative(Z2, i);
        }
        return true;
    }

    /* renamed from: a0 */
    public int mo11822a0() {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            return ((WindowManager.LayoutParams) layoutParams).x;
        }
        return -1;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a1 */
    public boolean mo11823a1(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return true;
        }
        this.f3066a.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(m3584q(str)), this.f3066a.getBackground(), this.f3066a.getBackground()));
        return true;
    }

    /* renamed from: a2 */
    public boolean mo11824a2(String str) {
        View view = this.f3066a;
        if (view instanceof TextView) {
            ((TextView) view).setGravity(m3587t(str));
            return true;
        } else if (view instanceof GridView) {
            ((GridView) view).setGravity(m3587t(str));
            return true;
        } else if (view instanceof LinearLayout) {
            ((LinearLayout) view).setGravity(m3587t(str));
            return true;
        } else if (!(view instanceof RelativeLayout)) {
            return false;
        } else {
            ((RelativeLayout) view).setGravity(m3587t(str));
            return true;
        }
    }

    /* renamed from: a3 */
    public boolean mo11825a3(float f, float f2, float f3, int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setShadowLayer(f, f2, f3, i);
        return true;
    }

    /* renamed from: a4 */
    public boolean mo11826a4(String str) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        layoutParams.width = str.equals("-1") ? -1 : str.equals("-2") ? -2 : m3572Z(str);
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: b */
    public boolean mo11827b(String str, String str2) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("id")) {
            this.f3066a.setId((int) Double.parseDouble(str2));
            return true;
        } else if (lowerCase.equals("text")) {
            return mo11860i0(str2.replace("\\\\", "\\U5c").replace("\\n", "\n").replace("\\U5c", "\\"));
        } else {
            if (lowerCase.equals("textcolor")) {
                return mo11898q3(m3584q(str2));
            }
            if (lowerCase.equals("textcolorhighlight")) {
                return mo11902r3(m3584q(str2));
            }
            if (lowerCase.equals("textcolorlink")) {
                return mo11910t3(m3584q(str2));
            }
            if (lowerCase.equals("textscalex")) {
                return mo11934y3(Float.parseFloat(str2));
            }
            if (lowerCase.equals("textstyle")) {
                return mo11706A3(str2);
            }
            if (lowerCase.equals("typeface")) {
                return mo11730F3(str2);
            }
            if (lowerCase.equals("src")) {
                return mo11872k3(str2);
            }
            if (lowerCase.equals("gravity")) {
                return mo11824a2(str2);
            }
            if (lowerCase.equals("layout_gravity")) {
                return mo11862i2(str2);
            }
            if (lowerCase.equals("textsize")) {
                return mo11938z3(str2);
            }
            if (lowerCase.equals("background")) {
                return mo11815Y0(str2);
            }
            if (lowerCase.equals("backgroundcolor")) {
                return mo11819Z0(m3584q(str2));
            }
            if (lowerCase.equals("width")) {
                return mo11826a4(str2);
            }
            if (lowerCase.equals("height")) {
                return mo11830b2(str2);
            }
            if (lowerCase.equals("adjustviewbounds")) {
                return mo11864j0(str2);
            }
            if (lowerCase.equals("maxheight")) {
                return mo11937z2(str2);
            }
            if (lowerCase.equals("minheight")) {
                return mo11719D2(str2);
            }
            if (lowerCase.equals("maxwidth")) {
                return mo11714C2(str2);
            }
            if (lowerCase.equals("minwidth")) {
                return mo11729F2(str2);
            }
            if (lowerCase.equals("layout_weight")) {
                return mo11893p2(str2);
            }
            if (lowerCase.equals("padding")) {
                return mo11752K2(str2);
            }
            if (lowerCase.equals("paddingleft")) {
                return mo11762M2(str2);
            }
            if (lowerCase.equals("paddingtop")) {
                return mo11771O2(str2);
            }
            if (lowerCase.equals("paddingright")) {
                return mo11767N2(str2);
            }
            if (lowerCase.equals("paddingbottom")) {
                return mo11757L2(str2);
            }
            if (lowerCase.equals("layout_margin")) {
                return mo11866j2(str2);
            }
            if (lowerCase.equals("layout_marginleft")) {
                return mo11875l2(str2);
            }
            if (lowerCase.equals("layout_margintop")) {
                return mo11883n2(str2);
            }
            if (lowerCase.equals("layout_marginright")) {
                return mo11879m2(str2);
            }
            if (lowerCase.equals("layout_marginbottom")) {
                return mo11871k2(str2);
            }
            if (lowerCase.equals("singleline")) {
                return mo11859h3(str2);
            }
            if (lowerCase.equals("scaletype")) {
                return mo11789S2(str2);
            }
            if (lowerCase.equals("hint")) {
                return mo11834c2(str2.replace("\\\\", "\\U5c").replace("\\n", "\n").replace("\\U5c", "\\"));
            }
            if (lowerCase.equals("textcolorhint")) {
                return mo11906s3(m3584q(str2));
            }
            if (lowerCase.equals("inputtype")) {
                return mo11845e2(str2);
            }
            if (lowerCase.equals("autolink")) {
                return mo11805W0(str2);
            }
            if (lowerCase.equals("cursorvisible")) {
                return mo11751K1(str2);
            }
            if (lowerCase.equals("digits")) {
                return mo11756L1(str2);
            }
            if (lowerCase.equals("editable")) {
                return mo11779Q1(str2);
            }
            if (lowerCase.equals("ellipsize")) {
                return mo11788S1(str2);
            }
            if (lowerCase.equals("marqueerepeatlimit")) {
                return mo11928x2(str2);
            }
            if (lowerCase.equals("imeoptions")) {
                return mo11840d2(str2);
            }
            if (lowerCase.equals("linksclickable")) {
                return mo11909t2(str2);
            }
            if (lowerCase.equals("maxlength")) {
                return mo11705A2((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("lines")) {
                return mo11897q2((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("maxlines")) {
                return mo11710B2((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("minlines")) {
                return mo11724E2((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("linespacingextra")) {
                return mo11901r2(Float.parseFloat(str2));
            }
            if (lowerCase.equals("linespacingmultiplier")) {
                return mo11905s2(Float.parseFloat(str2));
            }
            if (lowerCase.equals("scrollhorizontally")) {
                return mo11802V2(str2);
            }
            if (lowerCase.equals("shadowradius")) {
                return mo11846e3(Float.parseFloat(str2));
            }
            if (lowerCase.equals("shadowcolor")) {
                return mo11831b3(m3584q(str2));
            }
            if (lowerCase.equals("shadowdx")) {
                return mo11835c3(Float.parseFloat(str2));
            }
            if (lowerCase.equals("shadowdy")) {
                return mo11841d3(Float.parseFloat(str2));
            }
            if (lowerCase.equals("orientation")) {
                return mo11743I2(str2);
            }
            if (lowerCase.equals("ut_above")) {
                return mo11744I3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_below")) {
                return mo11790S3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_toleftof")) {
                return mo11808W3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_torightof")) {
                return mo11813X3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_alignbaseline")) {
                return mo11748J3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_aligntop")) {
                return mo11786R3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_alignbottom")) {
                return mo11753K3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_alignleft")) {
                return mo11758L3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_alignright")) {
                return mo11781Q3((int) Double.parseDouble(str2));
            }
            if (lowerCase.equals("ut_alignparenttop")) {
                return mo11776P3(str2);
            }
            if (lowerCase.equals("ut_alignparentbottom")) {
                return mo11763M3(str2);
            }
            if (lowerCase.equals("ut_alignparentleft")) {
                return mo11768N3(str2);
            }
            if (lowerCase.equals("ut_alignparentright")) {
                return mo11772O3(str2);
            }
            if (lowerCase.equals("ut_centerhorizontal")) {
                return mo11794T3(str2);
            }
            if (lowerCase.equals("ut_centervertical")) {
                return mo11803V3(str2);
            }
            if (lowerCase.equals("ut_centerinparent")) {
                return mo11798U3(str2);
            }
            if (lowerCase.equals("visibility")) {
                return mo11820Z3(str2);
            }
            if (lowerCase.equals("checked")) {
                return mo11833c1(str2);
            }
            if (lowerCase.equals("url")) {
                return mo11735G3(str2);
            }
            if (lowerCase.equals("selection")) {
                return mo11817Y2(str2);
            }
            if (lowerCase.equals("rating")) {
                return mo11780Q2(str2);
            }
            if (lowerCase.equals("numstars")) {
                return mo11734G2(str2);
            }
            if (lowerCase.equals("isindicator")) {
                return mo11850f2(str2);
            }
            if (lowerCase.equals("max")) {
                return mo11933y2(str2);
            }
            if (lowerCase.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                return mo11775P2(str2);
            }
            if (lowerCase.equals("style")) {
                return mo11884n3(str2);
            }
            if (lowerCase.equals("columnwidth")) {
                return mo11861i1(str2);
            }
            if (lowerCase.equals("clickable")) {
                return mo11839d1(str2);
            }
            if (lowerCase.equals("longclickable")) {
                return mo11923w2(str2);
            }
            if (lowerCase.equals("fadingedge")) {
                return mo11792T1(str2);
            }
            if (lowerCase.equals("fadingedgelength")) {
                return mo11796U1(str2);
            }
            if (lowerCase.equals("focusable")) {
                return mo11801V1(str2);
            }
            if (lowerCase.equals("focusableintouchmode")) {
                return mo11806W1(str2);
            }
            if (lowerCase.equals("scrollx")) {
                return mo11807W2(str2);
            }
            if (lowerCase.equals("scrolly")) {
                return mo11812X2(str2);
            }
            if (lowerCase.equals("scrollbarstyle")) {
                return mo11797U2(str2);
            }
            if (lowerCase.equals("scrollbars")) {
                return mo11793T2(str2);
            }
            if (lowerCase.equals("overscrollmode")) {
                return mo11747J2(str2);
            }
            if (lowerCase.equals("divider")) {
                return mo11766N1(str2);
            }
            if (lowerCase.equals("dividerheight")) {
                return mo11770O1(str2);
            }
            if (lowerCase.equals("cachecolorhint")) {
                return mo11829b1(str2);
            }
            if (lowerCase.equals("listselector")) {
                return mo11918v2(str2);
            }
            if (lowerCase.equals("collapsecolumns")) {
                return mo11853g1(str2);
            }
            if (lowerCase.equals("stretchcolumns")) {
                return mo11880m3(str2);
            }
            if (lowerCase.equals("shrinkcolumns")) {
                return mo11855g3(str2);
            }
            if (lowerCase.equals("layout_column")) {
                return mo11858h2(str2);
            }
            if (lowerCase.equals("layout_span")) {
                return mo11888o2(str2);
            }
            if (lowerCase.equals("textisselectable")) {
                return mo11919v3(str2);
            }
            if (!lowerCase.equals("backgroundripple")) {
                return lowerCase.equals("textcursordrawable") ? mo11914u3(str2) : lowerCase.equals("pagelimit") ? mo11838d0(str2) : lowerCase.equals("app_layout_behavior") ? mo11722E0(str2) : lowerCase.equals("app_contentscrim") ? mo11911u0(str2) : lowerCase.equals("app_layout_scrollflags") ? mo11732G0(str2) : lowerCase.equals("app_layout_collapsemode") ? mo11727F0(str2) : lowerCase.equals("app_popuptheme") ? mo11736H0(str2) : lowerCase.equals("app_title") ? mo11791T0(str2) : lowerCase.equals("app_subtitle") ? mo11741I0(str2) : lowerCase.equals("app_titlecolor") ? mo11795U0(str2) : lowerCase.equals("app_subtitlecolor") ? mo11745J0(str2) : lowerCase.equals("app_titlemargin") ? mo11800V0(str2) : lowerCase.equals("ct_left_toleft") ? mo11932y1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_left_toright") ? mo11936z1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_right_toleft") ? mo11704A1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_right_toright") ? mo11709B1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_top_totop") ? mo11728F1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_top_tobottom") ? mo11723E1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_bottom_totop") ? mo11874l1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_bottom_tobottom") ? mo11870k1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_baseline_tobaseline") ? mo11865j1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_start_toend") ? mo11713C1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_start_tostart") ? mo11718D1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_end_tostart") ? mo11887o1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_end_toend") ? mo11882n1((int) Double.parseDouble(str2)) : lowerCase.equals("ct_gonemarginstart") ? mo11908t1(str2) : lowerCase.equals("ct_gonemarginend") ? mo11896q1(str2) : lowerCase.equals("ct_gonemarginleft") ? mo11900r1(str2) : lowerCase.equals("ct_gonemargintop") ? mo11912u1(str2) : lowerCase.equals("ct_gonemarginright") ? mo11904s1(str2) : lowerCase.equals("ct_gonemarginbottom") ? mo11892p1(str2) : lowerCase.equals("ct_horizontal_bias") ? mo11917v1(str2) : lowerCase.equals("ct_vertical_bias") ? mo11733G1(str2) : lowerCase.equals("ct_dimensionratio") ? mo11878m1(str2) : lowerCase.equals("ct_horizontal_chainstyle") ? mo11922w1(str2) : lowerCase.equals("ct_vertical_chainstyle") ? mo11737H1(str2) : lowerCase.equals("ct_horizontal_weight") ? mo11927x1(str2) : lowerCase.equals("ct_vertical_weight") ? mo11742I1(str2) : lowerCase.equals("app_tablist") ? mo11778Q0(str2) : lowerCase.equals("app_tabindicatorcolor") ? mo11765N0(str2) : lowerCase.equals("app_tabindicatorheight") ? mo11769O0(str2) : lowerCase.equals("app_tabtextcolor") ? mo11787S0(str2) : lowerCase.equals("app_tabmode") ? mo11783R0((int) Double.parseDouble(str2)) : lowerCase.equals("app_tabgravity") ? mo11760M0((int) Double.parseDouble(str2)) : lowerCase.equals("app_tabindicatorwidth") ? mo11773P0(str2) : lowerCase.equals("app_tabadd") ? mo11750K0(str2) : lowerCase.equals("app_tabdel") ? mo11755L0(str2) : lowerCase.equals("app_layout_anchor") ? mo11712C0((int) Double.parseDouble(str2)) : lowerCase.equals("app_layout_anchorgravity") ? mo11717D0(str2) : lowerCase.equals("colorschemecolors") ? mo11857h1(str2) : lowerCase.equals("refreshing") ? mo11785R2(str2) : lowerCase.equals("itemdecoration") ? mo11854g2(str2) : lowerCase.equals("foreground") ? mo11816Y1(str2) : lowerCase.equals("tabselect") ? mo11894p3((int) Double.parseDouble(str2)) : lowerCase.equals("elevation") ? mo11784R1(str2) : lowerCase.equals("app_counterenabled") ? mo11916v0(str2) : lowerCase.equals("app_countermaxlength") ? mo11921w0((int) Double.parseDouble(str2)) : lowerCase.equals("app_errorenabled") ? mo11931y0(str2) : lowerCase.equals("app_error") ? mo11926x0(str2) : lowerCase.equals("showtext") ? mo11851f3(str2) : lowerCase.equals("splittrack") ? mo11863i3(str2) : lowerCase.equals("switchminwidth") ? mo11889o3(str2) : lowerCase.equals("thumbtint") ? mo11711B3(str2) : lowerCase.equals("thumbtintmode") ? mo11715C3(str2) : lowerCase.equals("tracktint") ? mo11720D3(str2) : lowerCase.equals("tracktintmode") ? mo11725E3(str2) : lowerCase.equals("textoff") ? mo11924w3(str2) : lowerCase.equals("texton") ? mo11929x3(str2) : lowerCase.equals("app_cardbackgroundcolor") ? mo11869k0(str2) : lowerCase.equals("app_cardcornerradius") ? mo11873l0(str2) : lowerCase.equals("app_cardelevation") ? mo11877m0(str2) : lowerCase.equals("app_cardmaxelevation") ? mo11881n0(str2) : lowerCase.equals("app_cardusecompatpadding") ? mo11891p0(str2) : lowerCase.equals("app_cardpreventcorneroverlap") ? mo11886o0(str2) : lowerCase.equals("app_contentpadding") ? mo11903s0(str2) : lowerCase.equals("app_expandedtitlecolor") ? mo11935z0(str2) : lowerCase.equals("app_expandedtitlegravity") ? mo11703A0(str2) : lowerCase.equals("app_expandedtitlemargin") ? mo11708B0(str2) : lowerCase.equals("app_collapsedtitletextcolor") ? mo11899r0(str2) : lowerCase.equals("app_collapsedtitlegravity") ? mo11895q0(str2) : lowerCase.equals("clipchildren") ? mo11844e1(str2) : lowerCase.equals("app_contentInset") ? mo11821a(str2) : lowerCase.equals("ps");
            }
            mo11823a1(str2);
            return true;
        }
    }

    /* renamed from: b0 */
    public int mo11828b0() {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            return ((WindowManager.LayoutParams) layoutParams).y;
        }
        return -1;
    }

    /* renamed from: b1 */
    public boolean mo11829b1(String str) {
        View view = this.f3066a;
        if (!(view instanceof ListView)) {
            return false;
        }
        ((ListView) view).setCacheColorHint(m3572Z(str));
        return true;
    }

    /* renamed from: b2 */
    public boolean mo11830b2(String str) {
        int Z;
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (str.equals("-1")) {
            Z = -1;
        } else {
            if (!str.equals("-2")) {
                if (str.equals("-3")) {
                    View view = this.f3066a;
                    if ((view instanceof Toolbar) || ((view.getTag() instanceof Object[]) && ((Object[]) this.f3066a.getTag())[0].equals("Toolbar"))) {
                        Z = C0860r.m2060s(this.f3067b);
                    }
                } else {
                    Z = m3572Z(str);
                }
            }
            layoutParams.height = -2;
            this.f3066a.setLayoutParams(layoutParams);
            return true;
        }
        layoutParams.height = Z;
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b3 */
    public boolean mo11831b3(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        ((TextView) view).setShadowLayer(((TextView) view).getShadowRadius(), ((TextView) this.f3066a).getShadowDx(), ((TextView) this.f3066a).getShadowDy(), i);
        return true;
    }

    /* renamed from: b4 */
    public boolean mo11832b4(Object obj) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            return false;
        }
        ((WindowManager.LayoutParams) layoutParams).x = (int) Float.parseFloat(String.valueOf(obj));
        return true;
    }

    /* renamed from: c1 */
    public boolean mo11833c1(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof CompoundButton)) {
            return false;
        }
        CompoundButton compoundButton = (CompoundButton) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        compoundButton.setChecked(z);
        return true;
    }

    /* renamed from: c2 */
    public boolean mo11834c2(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setHint(str);
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c3 */
    public boolean mo11835c3(float f) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        ((TextView) view).setShadowLayer(((TextView) view).getShadowRadius(), f, ((TextView) this.f3066a).getShadowDy(), ((TextView) this.f3066a).getShadowColor());
        return true;
    }

    /* renamed from: c4 */
    public boolean mo11836c4(Object obj) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams)) {
            return false;
        }
        ((WindowManager.LayoutParams) layoutParams).y = (int) Float.parseFloat(String.valueOf(obj));
        return true;
    }

    /* renamed from: d */
    public Object mo11837d() {
        View view = this.f3066a;
        return Integer.valueOf(view instanceof ViewPager ? ((ViewPager) view).getOffscreenPageLimit() : view instanceof VerticalViewPager ? ((VerticalViewPager) view).getOffscreenPageLimit() : -1);
    }

    /* renamed from: d0 */
    public boolean mo11838d0(String str) {
        View view = this.f3066a;
        if (view instanceof ViewPager) {
            ((ViewPager) view).setOffscreenPageLimit((int) Double.parseDouble(str));
            return true;
        } else if (!(view instanceof VerticalViewPager)) {
            return false;
        } else {
            ((VerticalViewPager) view).setOffscreenPageLimit((int) Double.parseDouble(str));
            return true;
        }
    }

    /* renamed from: d1 */
    public boolean mo11839d1(String str) {
        this.f3066a.setClickable(str.equals("true") || str.equals("1"));
        return true;
    }

    /* renamed from: d2 */
    public boolean mo11840d2(String str) {
        View view = this.f3066a;
        if (!(view instanceof EditText)) {
            return false;
        }
        ((EditText) view).setImeOptions(mo11930y(str));
        return true;
    }

    @TargetApi(16)
    /* renamed from: d3 */
    public boolean mo11841d3(float f) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        ((TextView) view).setShadowLayer(((TextView) view).getShadowRadius(), ((TextView) this.f3066a).getShadowDx(), f, ((TextView) this.f3066a).getShadowColor());
        return true;
    }

    /* renamed from: e */
    public Object mo11842e(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("text")) {
            return mo11868k();
        }
        if (lowerCase.equals("background")) {
            return this.f3066a.getBackground();
        }
        if (lowerCase.equals("width")) {
            return Integer.valueOf(mo11814Y());
        }
        if (lowerCase.equals("height")) {
            return Integer.valueOf(mo11915v());
        }
        if (lowerCase.equals("x")) {
            return Integer.valueOf(mo11822a0());
        }
        if (lowerCase.equals("y")) {
            return Integer.valueOf(mo11828b0());
        }
        if (lowerCase.equals("paddingleft")) {
            return Integer.valueOf(mo11754L());
        }
        if (lowerCase.equals("paddingtop")) {
            return Integer.valueOf(mo11764N());
        }
        if (lowerCase.equals("paddingright")) {
            return Integer.valueOf(mo11759M());
        }
        if (lowerCase.equals("paddingbottom")) {
            return Integer.valueOf(mo11749K());
        }
        if (lowerCase.equals("layout_marginleft")) {
            return Integer.valueOf(mo11721E());
        }
        if (lowerCase.equals("layout_margintop")) {
            return Integer.valueOf(mo11731G());
        }
        if (lowerCase.equals("layout_marginright")) {
            return Integer.valueOf(mo11726F());
        }
        if (lowerCase.equals("layout_marginbottom")) {
            return Integer.valueOf(mo11716D());
        }
        if (lowerCase.equals("hint")) {
            return mo11920w();
        }
        if (lowerCase.equals("imeoptions")) {
            return Integer.valueOf(mo11925x());
        }
        if (lowerCase.equals("visibility")) {
            return Integer.valueOf(mo11804W());
        }
        if (lowerCase.equals("checked")) {
            return Boolean.valueOf(mo11885o());
        }
        if (lowerCase.equals("url")) {
            return mo11799V();
        }
        if (lowerCase.equals("title")) {
            View view = this.f3066a;
            if (view instanceof WebView) {
                return ((WebView) view).getTitle();
            }
        }
        if (lowerCase.equals("lastvisibleposition")) {
            View view2 = this.f3066a;
            if (view2 instanceof RecyclerView) {
                return Integer.valueOf(((LinearLayoutManager) ((RecyclerView) view2).getLayoutManager()).findFirstVisibleItemPosition());
            }
            if (view2 instanceof AbsListView) {
                return Integer.valueOf(((AbsListView) view2).getLastVisiblePosition());
            }
            return null;
        } else if (lowerCase.equals("count")) {
            View view3 = this.f3066a;
            if (view3 instanceof RecyclerView) {
                return Integer.valueOf(((LinearLayoutManager) ((RecyclerView) view3).getLayoutManager()).getItemCount());
            }
            if (view3 instanceof AbsListView) {
                return Integer.valueOf(((AbsListView) view3).getCount());
            }
            return null;
        } else {
            if (lowerCase.equals("selecteditem")) {
                View view4 = this.f3066a;
                if (view4 instanceof AdapterView) {
                    return ((AdapterView) view4).getSelectedItem().toString();
                }
            }
            if (lowerCase.equals("rating")) {
                View view5 = this.f3066a;
                if (view5 instanceof RatingBar) {
                    return Float.valueOf(((RatingBar) view5).getRating());
                }
            }
            if (lowerCase.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                View view6 = this.f3066a;
                if (view6 instanceof ProgressBar) {
                    return Integer.valueOf(((ProgressBar) view6).getProgress());
                }
            }
            if (lowerCase.equals("date")) {
                View view7 = this.f3066a;
                if (view7 instanceof DatePicker) {
                    DatePicker datePicker = (DatePicker) view7;
                    return datePicker.getYear() + "-" + (datePicker.getMonth() + 1) + "-" + datePicker.getDayOfMonth();
                }
            }
            if (lowerCase.equals("time")) {
                View view8 = this.f3066a;
                if (view8 instanceof TimePicker) {
                    TimePicker timePicker = (TimePicker) view8;
                    return timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();
                }
            }
            if (lowerCase.equals("currentitem")) {
                View view9 = this.f3066a;
                if (view9 instanceof ViewPager) {
                    return Integer.valueOf(((ViewPager) view9).getCurrentItem());
                }
                if (view9 instanceof VerticalViewPager) {
                    return Integer.valueOf(((VerticalViewPager) view9).getCurrentItem());
                }
                return null;
            }
            if (lowerCase.equals("selectionstart")) {
                View view10 = this.f3066a;
                if (view10 instanceof EditText) {
                    return Integer.valueOf(((EditText) view10).getSelectionStart());
                }
            }
            if (lowerCase.equals("selectionend")) {
                View view11 = this.f3066a;
                if (view11 instanceof EditText) {
                    return Integer.valueOf(((EditText) view11).getSelectionEnd());
                }
            }
            if (lowerCase.equals("cangoback")) {
                View view12 = this.f3066a;
                if (view12 instanceof WebView) {
                    return Boolean.valueOf(((WebView) view12).canGoBack());
                }
            }
            if (lowerCase.equals("cangoforward")) {
                View view13 = this.f3066a;
                if (view13 instanceof WebView) {
                    return Boolean.valueOf(((WebView) view13).canGoForward());
                }
            }
            if (lowerCase.equals("shrinkcolumnsall")) {
                View view14 = this.f3066a;
                if (view14 instanceof TableLayout) {
                    return Boolean.valueOf(((TableLayout) view14).isShrinkAllColumns());
                }
            }
            if (lowerCase.equals("stretchcolumnsall")) {
                View view15 = this.f3066a;
                if (view15 instanceof TableLayout) {
                    return Boolean.valueOf(((TableLayout) view15).isStretchAllColumns());
                }
            }
            if (lowerCase.equals("pagelimit")) {
                return mo11837d();
            }
            if (lowerCase.equals("app_title")) {
                return String.valueOf(((Toolbar) this.f3066a).getTitle());
            }
            if (lowerCase.equals("app_subtitle")) {
                return String.valueOf(((Toolbar) this.f3066a).getSubtitle());
            }
            if (lowerCase.equals("refreshing")) {
                return Boolean.valueOf(((SwipeRefreshLayout) this.f3066a).isRefreshing());
            }
            return null;
        }
    }

    /* renamed from: e0 */
    public boolean mo11843e0(String str, Object obj) {
        String lowerCase = str.toLowerCase();
        return lowerCase.equals("text") ? mo11860i0(String.valueOf(obj)) : lowerCase.equals("hint") ? mo11834c2(String.valueOf(obj)) : lowerCase.equals("background") ? mo11810X0(obj) : lowerCase.equals("src") ? mo11867j3(obj) : lowerCase.equals("currentitem") ? mo11746J1(obj) : lowerCase.equals("closedrawer") ? mo11849f1(obj) : lowerCase.equals("opendrawer") ? mo11738H2(obj) : lowerCase.equals("drawerlockmode") ? mo11774P1(obj) : lowerCase.equals("gobackorforward") ? m3573Z1(obj) : lowerCase.equals("dh") ? mo11876l3(obj) : lowerCase.equals("x") ? mo11832b4(obj) : lowerCase.equals("y") ? mo11836c4(obj) : lowerCase.equals("backgroundripple") ? mo11823a1(String.valueOf(obj)) : lowerCase.equals("foreground") ? mo11811X1(obj) : lowerCase.equals("app_contentscrim") ? mo11907t0(obj) : lowerCase.equals("listselector") ? mo11913u2(obj) : lowerCase.equals("divider") ? mo11761M1(obj) : mo11827b(lowerCase, String.valueOf(obj));
    }

    /* renamed from: e1 */
    public boolean mo11844e1(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        viewGroup.setClipChildren(z);
        return true;
    }

    /* renamed from: e2 */
    public boolean mo11845e2(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setInputType(m3563A(str));
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e3 */
    public boolean mo11846e3(float f) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        ((TextView) view).setShadowLayer(f, ((TextView) view).getShadowDx(), ((TextView) this.f3066a).getShadowDy(), ((TextView) this.f3066a).getShadowColor());
        return true;
    }

    /* renamed from: f */
    public Object mo11847f(String str, Object obj) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("isdraweropen")) {
            return mo11707B(obj);
        }
        if (lowerCase.equals("collapsecolumns")) {
            return mo11890p(obj);
        }
        if (lowerCase.equals("stretchcolumns")) {
            return mo11782R(obj);
        }
        if (lowerCase.equals("shrinkcolumns")) {
            return mo11777Q(obj);
        }
        return null;
    }

    /* renamed from: f0 */
    public boolean mo11848f0(String str, String str2, String str3) {
        if (str.toLowerCase().equals("selection")) {
            return m3574Z2(str2, str3);
        }
        return false;
    }

    /* renamed from: f1 */
    public boolean mo11849f1(Object obj) {
        View view = this.f3066a;
        if (!(view instanceof DrawerLayout)) {
            return false;
        }
        ((DrawerLayout) view).closeDrawer(m3587t(obj.toString()));
        return true;
    }

    /* renamed from: f2 */
    public boolean mo11850f2(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof RatingBar)) {
            return false;
        }
        RatingBar ratingBar = (RatingBar) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        ratingBar.setIsIndicator(z);
        return true;
    }

    /* renamed from: f3 */
    public boolean mo11851f3(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof SwitchCompat)) {
            return false;
        }
        SwitchCompat switchCompat = (SwitchCompat) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        switchCompat.setShowText(z);
        return true;
    }

    /* renamed from: g0 */
    public boolean mo11852g0(String str, String str2, String str3, String str4) {
        if (str.toLowerCase().equals("url")) {
            return mo11739H3(str2, str3, str4);
        }
        return false;
    }

    /* renamed from: g1 */
    public boolean mo11853g1(String str) {
        View view = this.f3066a;
        if (!(view instanceof TableLayout)) {
            return false;
        }
        ((TableLayout) view).setColumnCollapsed((int) Double.parseDouble(String.valueOf(str)), true);
        return true;
    }

    /* renamed from: g2 */
    public boolean mo11854g2(String str) {
        if (!(this.f3066a instanceof RecyclerView)) {
            return false;
        }
        String[] a = C0861s.m2068a(str.trim());
        int length = a.length;
        ((RecyclerView) this.f3066a).addItemDecoration(new C1308c(this, length > 0 ? m3572Z(a[0].trim()) : 0, length > 1 ? m3572Z(a[1].trim()) : 0, length > 2 ? m3572Z(a[2].trim()) : 0, length > 3 ? m3572Z(a[3].trim()) : 0));
        return true;
    }

    /* renamed from: g3 */
    public boolean mo11855g3(String str) {
        if (!(this.f3066a instanceof TableLayout)) {
            return false;
        }
        if (str.equals("true")) {
            ((TableLayout) this.f3066a).setShrinkAllColumns(true);
        } else if (str.equals("false")) {
            ((TableLayout) this.f3066a).setShrinkAllColumns(false);
        } else {
            ((TableLayout) this.f3066a).setColumnShrinkable((int) Double.parseDouble(String.valueOf(str)), true);
        }
        return true;
    }

    /* renamed from: h0 */
    public boolean mo11856h0(String str, String str2, String str3, String str4, String str5) {
        if (str.toLowerCase().equals("shadow")) {
            return mo11825a3(Float.parseFloat(str2), Float.parseFloat(str3), Float.parseFloat(str4), m3584q(str5));
        }
        return false;
    }

    /* renamed from: h1 */
    public boolean mo11857h1(String str) {
        if (!(this.f3066a instanceof SwipeRefreshLayout)) {
            return false;
        }
        String[] b = C0861s.m2069b(str, '|');
        int[] iArr = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            iArr[i] = m3584q(b[i]);
        }
        ((SwipeRefreshLayout) this.f3066a).setColorSchemeColors(iArr);
        return true;
    }

    /* renamed from: h2 */
    public boolean mo11858h2(String str) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof TableRow.LayoutParams)) {
            return false;
        }
        TableRow.LayoutParams layoutParams2 = (TableRow.LayoutParams) layoutParams;
        layoutParams2.column = (int) Double.parseDouble(String.valueOf(str));
        this.f3066a.setLayoutParams(layoutParams2);
        return true;
    }

    /* renamed from: h3 */
    public boolean mo11859h3(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        textView.setSingleLine(z);
        return true;
    }

    /* renamed from: i0 */
    public boolean mo11860i0(String str) {
        CharSequence charSequence;
        TextView textView;
        if (!(this.f3066a instanceof TextView)) {
            return false;
        }
        if (str.startsWith("(html)")) {
            textView = (TextView) this.f3066a;
            charSequence = Html.fromHtml(str.substring(6));
        } else {
            textView = (TextView) this.f3066a;
            charSequence = str;
        }
        textView.setText(charSequence);
        return true;
    }

    /* renamed from: i1 */
    public boolean mo11861i1(String str) {
        View view = this.f3066a;
        if (!(view instanceof GridView)) {
            return false;
        }
        ((GridView) view).setColumnWidth(m3572Z(str));
        return true;
    }

    /* renamed from: i2 */
    public boolean mo11862i2(String str) {
        ViewGroup.LayoutParams C = m3564C(this.f3066a.getLayoutParams(), str);
        if (C == null) {
            return false;
        }
        this.f3066a.setLayoutParams(C);
        return true;
    }

    /* renamed from: i3 */
    public boolean mo11863i3(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof SwitchCompat)) {
            return false;
        }
        SwitchCompat switchCompat = (SwitchCompat) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        switchCompat.setSplitTrack(z);
        return true;
    }

    /* renamed from: j0 */
    public boolean mo11864j0(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof ImageView)) {
            return false;
        }
        ImageView imageView = (ImageView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        imageView.setAdjustViewBounds(z);
        return true;
    }

    /* renamed from: j1 */
    public boolean mo11865j1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f177l = i2;
        return true;
    }

    /* renamed from: j2 */
    public boolean mo11866j2(String str) {
        int Z = m3572Z(str);
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(Z, Z, Z, Z);
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: j3 */
    public boolean mo11867j3(Object obj) {
        ImageView imageView;
        Bitmap c;
        ImageView imageView2;
        View view = this.f3066a;
        if (view instanceof GifImageView) {
            if (!(obj instanceof Drawable)) {
                return mo11872k3(obj.toString());
            }
            imageView2 = (GifImageView) view;
        } else if (!(view instanceof ImageView)) {
            return false;
        } else {
            if (this.f3067b != null && (obj instanceof String)) {
                String obj2 = obj.toString();
                String lowerCase = obj2.toLowerCase();
                if (lowerCase.startsWith("http:") || lowerCase.startsWith("https:") || lowerCase.startsWith("ftp:")) {
                    C0844j.m1936a(this.f3067b, this.f3066a, obj2, lowerCase, false);
                    return true;
                }
            }
            if (obj instanceof Drawable) {
                imageView2 = (ImageView) this.f3066a;
            } else {
                if (obj instanceof Bitmap) {
                    imageView = (ImageView) this.f3066a;
                    c = (Bitmap) obj;
                } else {
                    if (obj == null) {
                        ((ImageView) this.f3066a).setImageBitmap(null);
                    } else {
                        String valueOf = String.valueOf(obj);
                        if (valueOf.startsWith("@")) {
                            imageView = (ImageView) this.f3066a;
                            Context context = this.f3067b;
                            c = C0849k.m1962b(context, C0835f.m1857n(context, valueOf));
                        } else if (valueOf.startsWith("%") || valueOf.startsWith("$") || valueOf.startsWith("/")) {
                            imageView = (ImageView) this.f3066a;
                            c = C0849k.m1963c(C0835f.m1857n(this.f3067b, valueOf));
                        } else if (!valueOf.matches("[0-9]+")) {
                            return false;
                        } else {
                            ((ImageView) this.f3066a).setImageResource((int) Double.parseDouble(valueOf));
                        }
                    }
                    return true;
                }
                imageView.setImageBitmap(c);
                return true;
            }
        }
        imageView2.setImageDrawable((Drawable) obj);
        return true;
    }

    /* renamed from: k */
    public Object mo11868k() {
        View view = this.f3066a;
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        return null;
    }

    /* renamed from: k0 */
    public boolean mo11869k0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CardView)) {
            return false;
        }
        ((CardView) view).setCardBackgroundColor(m3584q(str));
        return true;
    }

    /* renamed from: k1 */
    public boolean mo11870k1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f175k = i2;
        return true;
    }

    /* renamed from: k2 */
    public boolean mo11871k2(String str) {
        int Z = m3572Z(str);
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = Z;
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: k3 */
    public boolean mo11872k3(String str) {
        ImageView imageView;
        Bitmap c;
        View view = this.f3066a;
        if (view instanceof GifImageView) {
            if (str.startsWith("@")) {
                try {
                    C1488c cVar = new C1488c(this.f3067b.getAssets(), C0835f.m1857n(this.f3067b, str));
                    ((GifImageView) this.f3066a).setImageDrawable(cVar);
                    cVar.start();
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            } else if (str.startsWith("%") || str.startsWith("$") || str.startsWith("/")) {
                try {
                    C1488c cVar2 = new C1488c(C0835f.m1857n(this.f3067b, str));
                    ((GifImageView) this.f3066a).setImageDrawable(cVar2);
                    cVar2.start();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return false;
                }
            } else if (str.matches("[0-9]+")) {
                ((GifImageView) this.f3066a).setImageResource((int) Double.parseDouble(str));
            }
            return true;
        } else if (!(view instanceof ImageView)) {
            return false;
        } else {
            if (!(this.f3067b == null || str == null)) {
                String lowerCase = str.toLowerCase();
                if (lowerCase.startsWith("http:") || lowerCase.startsWith("https:") || lowerCase.startsWith("ftp:")) {
                    C0844j.m1936a(this.f3067b, this.f3066a, str, lowerCase, false);
                    return true;
                }
            }
            if (str.startsWith("@")) {
                imageView = (ImageView) this.f3066a;
                Context context = this.f3067b;
                c = C0849k.m1962b(context, C0835f.m1857n(context, str));
            } else if (str.startsWith("%") || str.startsWith("$") || str.startsWith("/")) {
                imageView = (ImageView) this.f3066a;
                c = C0849k.m1963c(C0835f.m1857n(this.f3067b, str));
            } else {
                if (str.equals("null")) {
                    ((ImageView) this.f3066a).setImageBitmap(null);
                } else if (!str.matches("[0-9]+")) {
                    return false;
                } else {
                    ((ImageView) this.f3066a).setImageResource((int) Double.parseDouble(str));
                }
                return true;
            }
            imageView.setImageBitmap(c);
            return true;
        }
    }

    /* renamed from: l0 */
    public boolean mo11873l0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CardView)) {
            return false;
        }
        ((CardView) view).setRadius((float) m3572Z(str));
        return true;
    }

    /* renamed from: l1 */
    public boolean mo11874l1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f173j = i2;
        return true;
    }

    /* renamed from: l2 */
    public boolean mo11875l2(String str) {
        int Z = m3572Z(str);
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = Z;
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: l3 */
    public boolean mo11876l3(Object obj) {
        this.f3066a.startAnimation((Animation) obj);
        return true;
    }

    /* renamed from: m0 */
    public boolean mo11877m0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CardView)) {
            return false;
        }
        ((CardView) view).setCardElevation((float) m3572Z(str));
        return true;
    }

    /* renamed from: m1 */
    public boolean mo11878m1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f130B = str;
        return true;
    }

    /* renamed from: m2 */
    public boolean mo11879m2(String str) {
        int Z = m3572Z(str);
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = Z;
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: m3 */
    public boolean mo11880m3(String str) {
        if (!(this.f3066a instanceof TableLayout)) {
            return false;
        }
        if (str.equals("true")) {
            ((TableLayout) this.f3066a).setStretchAllColumns(true);
        } else if (str.equals("false")) {
            ((TableLayout) this.f3066a).setStretchAllColumns(false);
        } else {
            ((TableLayout) this.f3066a).setColumnStretchable((int) Double.parseDouble(String.valueOf(str)), true);
        }
        return true;
    }

    /* renamed from: n0 */
    public boolean mo11881n0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CardView)) {
            return false;
        }
        ((CardView) view).setMaxCardElevation((float) m3572Z(str));
        return true;
    }

    /* renamed from: n1 */
    public boolean mo11882n1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f185s = i2;
        return true;
    }

    /* renamed from: n2 */
    public boolean mo11883n2(String str) {
        int Z = m3572Z(str);
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = Z;
        this.f3066a.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: n3 */
    public boolean mo11884n3(String str) {
        return this.f3066a instanceof ProgressBar;
    }

    /* renamed from: o */
    public boolean mo11885o() {
        View view = this.f3066a;
        if (view instanceof CompoundButton) {
            return ((CompoundButton) view).isChecked();
        }
        return false;
    }

    /* renamed from: o0 */
    public boolean mo11886o0(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof CardView)) {
            return false;
        }
        CardView cardView = (CardView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        cardView.setPreventCornerOverlap(z);
        return true;
    }

    /* renamed from: o1 */
    public boolean mo11887o1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f184r = i2;
        return true;
    }

    /* renamed from: o2 */
    public boolean mo11888o2(String str) {
        ViewGroup.LayoutParams layoutParams = this.f3066a.getLayoutParams();
        if (!(layoutParams instanceof TableRow.LayoutParams)) {
            return false;
        }
        TableRow.LayoutParams layoutParams2 = (TableRow.LayoutParams) layoutParams;
        layoutParams2.span = (int) Double.parseDouble(String.valueOf(str));
        this.f3066a.setLayoutParams(layoutParams2);
        return true;
    }

    /* renamed from: o3 */
    public boolean mo11889o3(String str) {
        View view = this.f3066a;
        if (!(view instanceof SwitchCompat)) {
            return false;
        }
        ((SwitchCompat) view).setSwitchMinWidth(m3572Z(str));
        return true;
    }

    /* renamed from: p */
    public Object mo11890p(Object obj) {
        View view = this.f3066a;
        if (view instanceof TableLayout) {
            return Boolean.valueOf(((TableLayout) view).isColumnCollapsed((int) Double.parseDouble(String.valueOf(obj))));
        }
        return null;
    }

    /* renamed from: p0 */
    public boolean mo11891p0(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof CardView)) {
            return false;
        }
        CardView cardView = (CardView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        cardView.setUseCompatPadding(z);
        return true;
    }

    /* renamed from: p1 */
    public boolean mo11892p1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f161d = m3572Z(str);
        return true;
    }

    /* renamed from: p2 */
    public boolean mo11893p2(String str) {
        ViewGroup.LayoutParams H = m3565H(this.f3066a.getLayoutParams(), str);
        if (H == null) {
            return false;
        }
        this.f3066a.setLayoutParams(H);
        return true;
    }

    /* renamed from: p3 */
    public boolean mo11894p3(int i) {
        View view = this.f3066a;
        if (!(view instanceof TabLayout)) {
            return false;
        }
        TabLayout tabLayout = (TabLayout) view;
        if (tabLayout.getTabCount() <= 0) {
            return true;
        }
        tabLayout.getTabAt(i).mo11604h();
        return true;
    }

    /* renamed from: q0 */
    public boolean mo11895q0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CollapsingToolbarLayout)) {
            return false;
        }
        ((CollapsingToolbarLayout) view).setCollapsedTitleGravity(m3587t(str));
        return true;
    }

    /* renamed from: q1 */
    public boolean mo11896q1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f191y = m3572Z(str);
        return true;
    }

    /* renamed from: q2 */
    public boolean mo11897q2(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setLines(i);
        return true;
    }

    /* renamed from: q3 */
    public boolean mo11898q3(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setTextColor(i);
        return true;
    }

    /* renamed from: r0 */
    public boolean mo11899r0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CollapsingToolbarLayout)) {
            return false;
        }
        ((CollapsingToolbarLayout) view).setCollapsedTitleTextColor(m3584q(str));
        return true;
    }

    /* renamed from: r1 */
    public boolean mo11900r1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f161d = m3572Z(str);
        return true;
    }

    @TargetApi(16)
    /* renamed from: r2 */
    public boolean mo11901r2(float f) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        ((TextView) view).setLineSpacing(f, ((TextView) view).getLineSpacingMultiplier());
        return true;
    }

    /* renamed from: r3 */
    public boolean mo11902r3(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setHighlightColor(i);
        return true;
    }

    /* renamed from: s0 */
    public boolean mo11903s0(String str) {
        int i = 0;
        if (!(this.f3066a instanceof CardView)) {
            return false;
        }
        String[] a = C0861s.m2068a(str.trim());
        int length = a.length;
        int Z = length > 0 ? m3572Z(a[0].trim()) : 0;
        int Z2 = length > 1 ? m3572Z(a[1].trim()) : 0;
        int Z3 = length > 2 ? m3572Z(a[2].trim()) : 0;
        if (length > 3) {
            i = m3572Z(a[3].trim());
        }
        ((CardView) this.f3066a).setContentPadding(Z, Z2, Z3, i);
        return true;
    }

    /* renamed from: s1 */
    public boolean mo11904s1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f161d = m3572Z(str);
        return true;
    }

    @TargetApi(16)
    /* renamed from: s2 */
    public boolean mo11905s2(float f) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return true;
        }
        ((TextView) view).setLineSpacing(((TextView) view).getLineSpacingExtra(), f);
        return true;
    }

    /* renamed from: s3 */
    public boolean mo11906s3(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setHintTextColor(i);
        return true;
    }

    /* renamed from: t0 */
    public boolean mo11907t0(Object obj) {
        if (!(this.f3066a instanceof CollapsingToolbarLayout)) {
            return false;
        }
        ((CollapsingToolbarLayout) this.f3066a).setContentScrim(obj instanceof Drawable ? (Drawable) obj : obj instanceof Bitmap ? new BitmapDrawable((Resources) null, (Bitmap) obj) : m3582m(String.valueOf(obj), this.f3067b));
        return true;
    }

    /* renamed from: t1 */
    public boolean mo11908t1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f190x = m3572Z(str);
        return true;
    }

    /* renamed from: t2 */
    public boolean mo11909t2(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        textView.setLinksClickable(z);
        return true;
    }

    /* renamed from: t3 */
    public boolean mo11910t3(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setLinkTextColor(i);
        return true;
    }

    /* renamed from: u0 */
    public boolean mo11911u0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CollapsingToolbarLayout)) {
            return false;
        }
        ((CollapsingToolbarLayout) view).setContentScrim(m3582m(str, this.f3067b));
        return true;
    }

    /* renamed from: u1 */
    public boolean mo11912u1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f161d = m3572Z(str);
        return true;
    }

    /* renamed from: u2 */
    public boolean mo11913u2(Object obj) {
        if (!(this.f3066a instanceof ListView)) {
            return false;
        }
        ((ListView) this.f3066a).setSelector(obj instanceof Drawable ? (Drawable) obj : obj instanceof Bitmap ? new BitmapDrawable((Resources) null, (Bitmap) obj) : m3582m(String.valueOf(obj), this.f3067b));
        return true;
    }

    /* renamed from: u3 */
    public boolean mo11914u3(String str) {
        if (!(this.f3066a instanceof EditText)) {
            return false;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(this.f3066a);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(this.f3066a);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {this.f3066a.getContext().getResources().getDrawable(i)};
            drawableArr[0].setColorFilter(m3584q(str), PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: v */
    public int mo11915v() {
        return this.f3066a.getLayoutParams().height;
    }

    /* renamed from: v0 */
    public boolean mo11916v0(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextInputLayout)) {
            return false;
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        textInputLayout.setCounterEnabled(z);
        return true;
    }

    /* renamed from: v1 */
    public boolean mo11917v1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f192z = Float.parseFloat(str);
        return true;
    }

    /* renamed from: v2 */
    public boolean mo11918v2(String str) {
        View view = this.f3066a;
        if (!(view instanceof ListView)) {
            return false;
        }
        ((ListView) view).setSelector(m3582m(str, this.f3067b));
        return true;
    }

    @TargetApi(11)
    /* renamed from: v3 */
    public boolean mo11919v3(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextView)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            TextView textView = (TextView) view;
            if (str.equals("true") || str.equals("1")) {
                z = true;
            }
            textView.setTextIsSelectable(z);
        }
        return true;
    }

    /* renamed from: w */
    public String mo11920w() {
        View view = this.f3066a;
        if (view instanceof TextView) {
            return ((TextView) view).getHint().toString();
        }
        return null;
    }

    /* renamed from: w0 */
    public boolean mo11921w0(int i) {
        View view = this.f3066a;
        if (!(view instanceof TextInputLayout)) {
            return false;
        }
        ((TextInputLayout) view).setCounterMaxLength(i);
        return true;
    }

    /* renamed from: w1 */
    public boolean mo11922w1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f134F = m3583n(str);
        return true;
    }

    /* renamed from: w2 */
    public boolean mo11923w2(String str) {
        this.f3066a.setLongClickable(str.equals("true") || str.equals("1"));
        return true;
    }

    /* renamed from: w3 */
    public boolean mo11924w3(String str) {
        View view = this.f3066a;
        if (!(view instanceof SwitchCompat)) {
            return false;
        }
        ((SwitchCompat) view).setTextOff(str);
        return true;
    }

    /* renamed from: x */
    public int mo11925x() {
        View view = this.f3066a;
        if (view instanceof EditText) {
            return ((EditText) view).getImeOptions();
        }
        return 0;
    }

    /* renamed from: x0 */
    public boolean mo11926x0(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextInputLayout)) {
            return false;
        }
        ((TextInputLayout) view).setError(str);
        return true;
    }

    /* renamed from: x1 */
    public boolean mo11927x1(String str) {
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ((ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams()).f132D = (float) Integer.parseInt(str);
        return true;
    }

    /* renamed from: x2 */
    public boolean mo11928x2(String str) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setMarqueeRepeatLimit(mo11740I(str));
        return true;
    }

    /* renamed from: x3 */
    public boolean mo11929x3(String str) {
        View view = this.f3066a;
        if (!(view instanceof SwitchCompat)) {
            return false;
        }
        ((SwitchCompat) view).setTextOn(str);
        return true;
    }

    /* renamed from: y */
    public int mo11930y(String str) {
        if (str.equals("actionnone")) {
            return 1;
        }
        if (str.equals("actiongo")) {
            return 2;
        }
        if (str.equals("actionsearch")) {
            return 3;
        }
        if (str.equals("actionsend")) {
            return 4;
        }
        if (str.equals("actionnext")) {
            return 5;
        }
        if (str.equals("actiondone")) {
            return 6;
        }
        if (str.matches("[0-9]+")) {
            return (int) Double.parseDouble(str);
        }
        return 1;
    }

    /* renamed from: y0 */
    public boolean mo11931y0(String str) {
        View view = this.f3066a;
        boolean z = false;
        if (!(view instanceof TextInputLayout)) {
            return false;
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        if (str.equals("true") || str.equals("1")) {
            z = true;
        }
        textInputLayout.setErrorEnabled(z);
        return true;
    }

    /* renamed from: y1 */
    public boolean mo11932y1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f161d = i2;
        return true;
    }

    /* renamed from: y2 */
    public boolean mo11933y2(String str) {
        View view = this.f3066a;
        if (view instanceof AbsSeekBar) {
            ((AbsSeekBar) view).setMax((int) Double.parseDouble(str));
            return true;
        } else if (!(view instanceof ProgressBar)) {
            return false;
        } else {
            ((ProgressBar) view).setMax((int) Double.parseDouble(str));
            return true;
        }
    }

    /* renamed from: y3 */
    public boolean mo11934y3(float f) {
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setTextScaleX(f);
        return true;
    }

    /* renamed from: z0 */
    public boolean mo11935z0(String str) {
        View view = this.f3066a;
        if (!(view instanceof CollapsingToolbarLayout)) {
            return false;
        }
        ((CollapsingToolbarLayout) view).setExpandedTitleColor(m3584q(str));
        return true;
    }

    /* renamed from: z1 */
    public boolean mo11936z1(int i) {
        int i2 = 0;
        if (!(this.f3066a.getLayoutParams() instanceof ConstraintLayout.LayoutParams)) {
            return false;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f3066a.getLayoutParams();
        if (i != 0) {
            i2 = this.f3068c + i;
        }
        layoutParams.f163e = i2;
        return true;
    }

    /* renamed from: z2 */
    public boolean mo11937z2(String str) {
        View view = this.f3066a;
        if (!(view instanceof ImageView)) {
            return false;
        }
        ((ImageView) view).setMaxHeight(m3572Z(str));
        return true;
    }

    /* renamed from: z3 */
    public boolean mo11938z3(String str) {
        float[] S = m3569S(str);
        if (S == null) {
            return false;
        }
        View view = this.f3066a;
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setTextSize((int) S[0], S[1]);
        return true;
    }
}
