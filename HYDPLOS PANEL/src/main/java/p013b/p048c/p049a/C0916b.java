package p013b.p048c.p049a;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.p009v4.view.ViewPager;
import android.support.p009v4.widget.DrawerLayout;
import android.support.p009v4.widget.NestedScrollView;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p012v7.widget.CardView;
import android.support.p012v7.widget.RecyclerView;
import android.support.p012v7.widget.SwitchCompat;
import android.support.p012v7.widget.Toolbar;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.VideoView;
import com.iapp.app.C1305g;
import com.iapp.app.RoundImageView;
import com.iapp.app.TabLayout;
import com.iapp.app.p067x5.WebView;
import p013b.p044b.p045a.p046a.C0860r;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;
import p069pl.droidsonroids.gif.GifImageView;

/* renamed from: b.c.a.b */
public class C0916b {

    /* renamed from: a */
    public int f1974a = 0;

    /* renamed from: b */
    private Context f1975b = null;

    public C0916b(Context context) {
        this.f1975b = context;
    }

    /* renamed from: b */
    private Object[] m2419b(String str, String str2) {
        return new Object[]{str, str2, "", null};
    }

    /* renamed from: A */
    public NestedScrollView mo9056A(int i) {
        NestedScrollView nestedScrollView = new NestedScrollView(this.f1975b);
        nestedScrollView.setId(i);
        nestedScrollView.setTag(m2419b("NestedScrollView", "width=-2\nheight=-2"));
        mo9087g(i);
        return nestedScrollView;
    }

    /* renamed from: B */
    public ProgressBar mo9057B(int i) {
        ProgressBar progressBar = new ProgressBar(this.f1975b, null, 16842872);
        progressBar.setId(i);
        progressBar.setTag(m2419b("ProgressBar", "width=-2\nheight=-2"));
        mo9087g(i);
        return progressBar;
    }

    /* renamed from: C */
    public ProgressBar mo9058C(int i, int i2) {
        ProgressBar progressBar = new ProgressBar(this.f1975b, null, i2);
        progressBar.setId(i);
        progressBar.setTag(m2419b("ProgressBar", "width=-2\nheight=-2"));
        mo9087g(i);
        return progressBar;
    }

    /* renamed from: D */
    public RadioButton mo9059D(int i) {
        RadioButton radioButton = new RadioButton(this.f1975b);
        radioButton.setId(i);
        String str = "单选项" + i;
        radioButton.setText(str);
        radioButton.setTag(m2419b("RadioButton", "width=-2\nheight=-2\ntext=" + str));
        mo9087g(i);
        return radioButton;
    }

    /* renamed from: E */
    public RadioGroup mo9060E(int i) {
        RadioGroup radioGroup = new RadioGroup(this.f1975b);
        radioGroup.setId(i);
        radioGroup.setTag(m2419b("RadioGroup", "width=-2\nheight=-2"));
        mo9087g(i);
        return radioGroup;
    }

    /* renamed from: F */
    public RatingBar mo9061F(int i) {
        RatingBar ratingBar = new RatingBar(this.f1975b);
        ratingBar.setId(i);
        ratingBar.setTag(m2419b("RatingBar", "width=-2\nheight=-2"));
        mo9087g(i);
        return ratingBar;
    }

    /* renamed from: G */
    public RecyclerView mo9062G(int i) {
        RecyclerView recyclerView = new RecyclerView(this.f1975b);
        recyclerView.setId(i);
        recyclerView.setTag(m2419b("RecyclerView", "width=-1\nheight=-2"));
        mo9087g(i);
        return recyclerView;
    }

    /* renamed from: H */
    public RelativeLayout mo9063H(int i) {
        RelativeLayout relativeLayout = new RelativeLayout(this.f1975b);
        relativeLayout.setId(i);
        relativeLayout.setTag(m2419b("RelativeLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return relativeLayout;
    }

    /* renamed from: I */
    public RoundImageView mo9064I(int i) {
        RoundImageView roundImageView = new RoundImageView(this.f1975b);
        roundImageView.setId(i);
        roundImageView.setImageResource(17301567);
        roundImageView.setTag(m2419b("RoundImageView", "width=-2\nheight=-2\nsrc=17301567"));
        mo9087g(i);
        return roundImageView;
    }

    /* renamed from: J */
    public ScrollView mo9065J(int i) {
        ScrollView scrollView = new ScrollView(this.f1975b);
        scrollView.setId(i);
        scrollView.setTag(m2419b("ScrollView", "width=-2\nheight=-2"));
        mo9087g(i);
        return scrollView;
    }

    /* renamed from: K */
    public SeekBar mo9066K(int i) {
        SeekBar seekBar = new SeekBar(this.f1975b);
        seekBar.setId(i);
        seekBar.setTag(m2419b("SeekBar", "width=-2\nheight=-2"));
        mo9087g(i);
        return seekBar;
    }

    /* renamed from: L */
    public Spinner mo9067L(int i) {
        Spinner spinner = new Spinner(this.f1975b);
        spinner.setId(i);
        spinner.setTag(m2419b("Spinner", "width=-2\nheight=-2"));
        mo9087g(i);
        return spinner;
    }

    /* renamed from: M */
    public SurfaceView mo9068M(int i) {
        SurfaceView surfaceView = new SurfaceView(this.f1975b);
        surfaceView.setId(i);
        surfaceView.setTag(m2419b("SurfaceView", "width=-2\nheight=-2"));
        mo9087g(i);
        return surfaceView;
    }

    /* renamed from: N */
    public SwipeRefreshLayout mo9069N(int i) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.f1975b);
        swipeRefreshLayout.setId(i);
        swipeRefreshLayout.setTag(m2419b("SwipeRefreshLayout", "width=-1\nheight=-2"));
        swipeRefreshLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        mo9087g(i);
        return swipeRefreshLayout;
    }

    /* renamed from: O */
    public SwitchCompat mo9070O(int i) {
        SwitchCompat switchCompat = new SwitchCompat(this.f1975b);
        switchCompat.setId(i);
        switchCompat.setTag(m2419b("SwitchCompat", "width=-2\nheight=-2"));
        mo9087g(i);
        return switchCompat;
    }

    /* renamed from: P */
    public TabLayout mo9071P(int i) {
        TabLayout tabLayout = new TabLayout(this.f1975b);
        tabLayout.setId(i);
        tabLayout.setTag(m2419b("TabLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return tabLayout;
    }

    /* renamed from: Q */
    public TableLayout mo9072Q(int i) {
        TableLayout tableLayout = new TableLayout(this.f1975b);
        tableLayout.setId(i);
        tableLayout.setTag(m2419b("TableLayout", "width=-2\nheight=-2"));
        tableLayout.setColumnCollapsed(1, true);
        mo9087g(i);
        return tableLayout;
    }

    /* renamed from: R */
    public TableRow mo9073R(int i) {
        TableRow tableRow = new TableRow(this.f1975b);
        tableRow.setId(i);
        tableRow.setTag(m2419b("TableRow", ""));
        mo9087g(i);
        return tableRow;
    }

    /* renamed from: S */
    public TextInputLayout mo9074S(int i) {
        TextInputLayout textInputLayout = new TextInputLayout(this.f1975b);
        textInputLayout.setId(i);
        textInputLayout.setTag(m2419b("TextInputLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return textInputLayout;
    }

    /* renamed from: T */
    public TextView mo9075T(int i) {
        TextView textView = new TextView(this.f1975b);
        textView.setId(i);
        String str = "文本" + i;
        textView.setText(str);
        textView.setTag(m2419b("TextView", "width=-2\nheight=-2\ntext=" + str));
        mo9087g(i);
        return textView;
    }

    /* renamed from: U */
    public TimePicker mo9076U(int i) {
        TimePicker timePicker = new TimePicker(this.f1975b);
        timePicker.setId(i);
        timePicker.setTag(m2419b("TimePicker", "width=-2\nheight=-2"));
        mo9087g(i);
        return timePicker;
    }

    /* renamed from: V */
    public Toolbar mo9077V(int i) {
        Toolbar toolbar = new Toolbar(this.f1975b);
        toolbar.setId(i);
        toolbar.setTag(m2419b("Toolbar", "width=-1\nheight=-3"));
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, C0860r.m2060s(this.f1975b)));
        mo9087g(i);
        return toolbar;
    }

    /* renamed from: W */
    public VerticalViewPager mo9078W(int i) {
        VerticalViewPager verticalViewPager = new VerticalViewPager(this.f1975b);
        verticalViewPager.setId(i);
        verticalViewPager.setTag(m2419b("VerticalViewPager", "width=-1\nheight=-2"));
        verticalViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        mo9087g(i);
        return verticalViewPager;
    }

    /* renamed from: X */
    public VideoView mo9079X(int i) {
        VideoView videoView = new VideoView(this.f1975b);
        videoView.setId(i);
        videoView.setTag(m2419b("VideoView", "width=-2\nheight=-2"));
        mo9087g(i);
        return videoView;
    }

    /* renamed from: Y */
    public ViewPager mo9080Y(int i) {
        ViewPager viewPager = new ViewPager(this.f1975b);
        viewPager.setId(i);
        viewPager.setTag(m2419b("ViewPager", "width=-2\nheight=-2"));
        mo9087g(i);
        return viewPager;
    }

    /* renamed from: Z */
    public WebView mo9081Z(int i) {
        WebView webView = new WebView(this.f1975b);
        webView.setId(i);
        webView.setTag(m2419b("WebView", "width=-2\nheight=-2"));
        mo9087g(i);
        return webView;
    }

    /* renamed from: a */
    public boolean mo9082a(C1305g gVar, String str) {
        int indexOf;
        String[] split = str.replace("&lt;", "<").replace("&gt;", ">").replace("\r", "").split("\n");
        for (String str2 : split) {
            if (!str2.startsWith(".") && !str2.startsWith("//") && (indexOf = str2.indexOf(61)) != -1) {
                try {
                    gVar.mo11827b(str2.substring(0, indexOf).toLowerCase(), str2.substring(indexOf + 1));
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public String mo9083c(String str) {
        if (str.equals("文本")) {
            return "TextView";
        }
        if (str.equals("图像")) {
            return "ImageView";
        }
        if (str.equals("按钮")) {
            return "Button";
        }
        if (str.equals("图像按钮")) {
            return "ImageButton";
        }
        if (str.equals("编辑框")) {
            return "EditText";
        }
        if (str.equals("单选布局")) {
            return "RadioGroup";
        }
        if (str.equals("单选项")) {
            return "RadioButton";
        }
        if (str.equals("多选")) {
            return "CheckBox";
        }
        if (str.equals("列表")) {
            return "ListView";
        }
        if (str.equals("浏览器")) {
            return "WebView";
        }
        if (str.equals("下拉菜单")) {
            return "Spinner";
        }
        if (str.equals("评分")) {
            return "RatingBar";
        }
        if (str.equals("视频")) {
            return "VideoView";
        }
        if (str.equals("动态图")) {
            return "GifView";
        }
        if (str.equals("圆形图")) {
            return "RoundImageView";
        }
        if (str.equals("拖动条")) {
            return "SeekBar";
        }
        if (str.equals("进度条")) {
            return "ProgressBar";
        }
        if (str.equals("日期选择器")) {
            return "DatePicker";
        }
        if (str.equals("时间选择器")) {
            return "TimePicker";
        }
        if (str.equals("网格视图")) {
            return "GridView";
        }
        if (str.equals("线性布局")) {
            return "LinearLayout";
        }
        if (str.equals("相对布局")) {
            return "RelativeLayout";
        }
        if (str.equals("表格布局")) {
            return "TableLayout";
        }
        if (str.equals("表格项")) {
            return "TableRow";
        }
        if (str.equals("帧布局")) {
            return "FrameLayout";
        }
        if (str.equals("面控件")) {
            return "SurfaceView";
        }
        if (str.equals("滚动")) {
            return "ScrollView";
        }
        if (str.equals("水平滚动")) {
            return "HorizontalScrollView";
        }
        if (str.equals("滑动窗体")) {
            return "ViewPager";
        }
        if (str.equals("侧滑窗体")) {
            return "DrawerLayout";
        }
        if (str.equals("协调性布局")) {
            return "CoordinatorLayout";
        }
        if (str.equals("应用栏布局")) {
            return "AppBarLayout";
        }
        if (str.equals("折叠工具栏布局")) {
            return "CollapsingToolbarLayout";
        }
        if (str.equals("工具栏布局")) {
            return "Toolbar";
        }
        if (str.equals("浮动动作按钮")) {
            return "FloatingActionButton";
        }
        if (str.equals("嵌套滚动")) {
            return "NestedScrollView";
        }
        if (str.equals("标签布局")) {
            return "TabLayout";
        }
        if (str.equals("v7列表")) {
            return "RecyclerView";
        }
        if (str.equals("约束性布局")) {
            return "ConstraintLayout";
        }
        if (str.equals("垂直滑动窗体")) {
            return "VerticalViewPager";
        }
        if (str.equals("下拉刷新控件")) {
            return "SwipeRefreshLayout";
        }
        if (str.equals("文本输入布局")) {
            return "TextInputLayout";
        }
        if (str.equals("开关")) {
            return "SwitchCompat";
        }
        if (str.equals("卡片")) {
            return "CardView";
        }
        return null;
    }

    /* renamed from: d */
    public ViewGroup.LayoutParams mo9084d(View view, View view2) {
        return view2 instanceof TableRow ? new TableLayout.LayoutParams() : view instanceof TableRow ? new TableRow.LayoutParams(-2, -2) : view instanceof CoordinatorLayout ? new CoordinatorLayout.LayoutParams(-1, -2) : view instanceof RecyclerView ? new CoordinatorLayout.LayoutParams(-1, -2) : view instanceof AppBarLayout ? new AppBarLayout.LayoutParams(-1, -2) : view instanceof CollapsingToolbarLayout ? new CollapsingToolbarLayout.LayoutParams(-1, -2) : view instanceof Toolbar ? new Toolbar.LayoutParams(-1, -2) : view instanceof ConstraintLayout ? new ConstraintLayout.LayoutParams(-2, -2) : view instanceof TableLayout ? new TableLayout.LayoutParams(-2, -2) : view instanceof RelativeLayout ? new RelativeLayout.LayoutParams(-2, -2) : view instanceof DrawerLayout ? new DrawerLayout.LayoutParams(-2, -2) : view instanceof LinearLayout ? new LinearLayout.LayoutParams(-2, -2) : new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: e */
    public View mo9085e(int i, String str) {
        if (str.equals("TextView")) {
            return mo9075T(i);
        }
        if (str.equals("ImageView")) {
            return mo9104x(i);
        }
        if (str.equals("Button")) {
            return mo9089i(i);
        }
        if (str.equals("ImageButton")) {
            return mo9103w(i);
        }
        if (str.equals("EditText")) {
            return mo9097q(i);
        }
        if (str.equals("RadioGroup")) {
            return mo9060E(i);
        }
        if (str.equals("RadioButton")) {
            return mo9059D(i);
        }
        if (str.equals("CheckBox")) {
            return mo9091k(i);
        }
        if (str.equals("ListView")) {
            return mo9106z(i);
        }
        if (str.equals("WebView")) {
            return mo9081Z(i);
        }
        if (str.equals("Spinner")) {
            return mo9067L(i);
        }
        if (str.equals("VideoView")) {
            return mo9079X(i);
        }
        if (str.equals("GifView")) {
            return mo9100t(i);
        }
        if (str.equals("RoundImageView")) {
            return mo9064I(i);
        }
        if (str.equals("RatingBar")) {
            return mo9061F(i);
        }
        if (str.equals("SeekBar")) {
            return mo9066K(i);
        }
        if (str.equals("ProgressBar")) {
            return mo9057B(i);
        }
        if (str.equals("DatePicker")) {
            return mo9095o(i);
        }
        if (str.equals("TimePicker")) {
            return mo9076U(i);
        }
        if (str.equals("GridView")) {
            return mo9101u(i);
        }
        if (str.equals("LinearLayout")) {
            return mo9105y(i);
        }
        if (str.equals("RelativeLayout")) {
            return mo9063H(i);
        }
        if (str.equals("TableLayout")) {
            return mo9072Q(i);
        }
        if (str.equals("TableRow")) {
            return mo9073R(i);
        }
        if (str.equals("FrameLayout")) {
            return mo9099s(i);
        }
        if (str.equals("SurfaceView")) {
            return mo9068M(i);
        }
        if (str.equals("ScrollView")) {
            return mo9065J(i);
        }
        if (str.equals("HorizontalScrollView")) {
            return mo9102v(i);
        }
        if (str.equals("ViewPager")) {
            return mo9080Y(i);
        }
        if (str.equals("DrawerLayout")) {
            return mo9096p(i);
        }
        if (str.equals("CoordinatorLayout")) {
            return mo9094n(i);
        }
        if (str.equals("AppBarLayout")) {
            return mo9088h(i);
        }
        if (str.equals("CollapsingToolbarLayout")) {
            return mo9092l(i);
        }
        if (str.equals("Toolbar")) {
            return mo9077V(i);
        }
        if (str.equals("FloatingActionButton")) {
            return mo9098r(i);
        }
        if (str.equals("NestedScrollView")) {
            return mo9056A(i);
        }
        if (str.equals("TabLayout")) {
            return mo9071P(i);
        }
        if (str.equals("RecyclerView")) {
            return mo9062G(i);
        }
        if (str.equals("ConstraintLayout")) {
            return mo9093m(i);
        }
        if (str.equals("VerticalViewPager")) {
            return mo9078W(i);
        }
        if (str.equals("SwipeRefreshLayout")) {
            return mo9069N(i);
        }
        if (str.equals("TextInputLayout")) {
            return mo9074S(i);
        }
        if (str.equals("SwitchCompat")) {
            return mo9070O(i);
        }
        if (str.equals("CardView")) {
            return mo9090j(i);
        }
        return null;
    }

    /* renamed from: f */
    public View mo9086f(int i, String str, Object obj) {
        if (str.equals("ProgressBar")) {
            return mo9058C(i, Integer.parseInt(String.valueOf(obj).trim()));
        }
        return null;
    }

    /* renamed from: g */
    public void mo9087g(int i) {
        if (this.f1974a < i) {
            this.f1974a = i;
        }
    }

    /* renamed from: h */
    public AppBarLayout mo9088h(int i) {
        AppBarLayout appBarLayout = new AppBarLayout(this.f1975b);
        appBarLayout.setId(i);
        appBarLayout.setTag(m2419b("AppBarLayout", "width=-1\nheight=-2"));
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        mo9087g(i);
        return appBarLayout;
    }

    /* renamed from: i */
    public Button mo9089i(int i) {
        Button button = new Button(this.f1975b);
        button.setId(i);
        String str = "按钮" + i;
        button.setText(str);
        button.setTag(m2419b("Button", "width=-2\nheight=-2\ntext=" + str));
        mo9087g(i);
        return button;
    }

    /* renamed from: j */
    public CardView mo9090j(int i) {
        CardView cardView = new CardView(this.f1975b);
        cardView.setId(i);
        cardView.setTag(m2419b("CardView", "width=-2\nheight=-2"));
        mo9087g(i);
        return cardView;
    }

    /* renamed from: k */
    public CheckBox mo9091k(int i) {
        CheckBox checkBox = new CheckBox(this.f1975b);
        checkBox.setId(i);
        String str = "多选项" + i;
        checkBox.setText(str);
        checkBox.setTag(m2419b("CheckBox", "width=-2\nheight=-2\ntext=" + str));
        mo9087g(i);
        return checkBox;
    }

    /* renamed from: l */
    public CollapsingToolbarLayout mo9092l(int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = new CollapsingToolbarLayout(this.f1975b);
        collapsingToolbarLayout.setId(i);
        collapsingToolbarLayout.setTag(m2419b("CollapsingToolbarLayout", "width=-1\nheight=-2"));
        collapsingToolbarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        mo9087g(i);
        return collapsingToolbarLayout;
    }

    /* renamed from: m */
    public ConstraintLayout mo9093m(int i) {
        ConstraintLayout constraintLayout = new ConstraintLayout(this.f1975b);
        constraintLayout.setId(i);
        constraintLayout.setTag(m2419b("ConstraintLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return constraintLayout;
    }

    /* renamed from: n */
    public CoordinatorLayout mo9094n(int i) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.f1975b);
        coordinatorLayout.setId(i);
        coordinatorLayout.setTag(m2419b("CoordinatorLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return coordinatorLayout;
    }

    /* renamed from: o */
    public DatePicker mo9095o(int i) {
        DatePicker datePicker = new DatePicker(this.f1975b);
        datePicker.setId(i);
        datePicker.setTag(m2419b("DatePicker", "width=-2\nheight=-2"));
        mo9087g(i);
        return datePicker;
    }

    /* renamed from: p */
    public DrawerLayout mo9096p(int i) {
        DrawerLayout drawerLayout = new DrawerLayout(this.f1975b);
        drawerLayout.setId(i);
        drawerLayout.setTag(m2419b("DrawerLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return drawerLayout;
    }

    /* renamed from: q */
    public EditText mo9097q(int i) {
        EditText editText = new EditText(this.f1975b);
        editText.setId(i);
        String str = "文本框" + i;
        editText.setText(str);
        editText.setTag(m2419b("EditText", "width=-2\nheight=-2\ntext=" + str));
        mo9087g(i);
        return editText;
    }

    /* renamed from: r */
    public FloatingActionButton mo9098r(int i) {
        FloatingActionButton floatingActionButton = new FloatingActionButton(this.f1975b);
        floatingActionButton.setId(i);
        floatingActionButton.setImageResource(17301544);
        floatingActionButton.setTag(m2419b("FloatingActionButton", "width=-2\nheight=-2\nsrc=17301544"));
        mo9087g(i);
        return floatingActionButton;
    }

    /* renamed from: s */
    public FrameLayout mo9099s(int i) {
        FrameLayout frameLayout = new FrameLayout(this.f1975b);
        frameLayout.setId(i);
        frameLayout.setTag(m2419b("FrameLayout", "width=-2\nheight=-2"));
        mo9087g(i);
        return frameLayout;
    }

    /* renamed from: t */
    public GifImageView mo9100t(int i) {
        GifImageView gifImageView = new GifImageView(this.f1975b);
        gifImageView.setId(i);
        gifImageView.setTag(m2419b("GifView", "width=-2\nheight=-2"));
        mo9087g(i);
        return gifImageView;
    }

    /* renamed from: u */
    public GridView mo9101u(int i) {
        GridView gridView = new GridView(this.f1975b);
        gridView.setId(i);
        gridView.setNumColumns(-1);
        gridView.setStretchMode(2);
        gridView.setTag(m2419b("GridView", "width=-2\nheight=-2"));
        mo9087g(i);
        return gridView;
    }

    /* renamed from: v */
    public HorizontalScrollView mo9102v(int i) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f1975b);
        horizontalScrollView.setId(i);
        horizontalScrollView.setTag(m2419b("HorizontalScrollView", "width=-2\nheight=-2"));
        mo9087g(i);
        return horizontalScrollView;
    }

    /* renamed from: w */
    public ImageButton mo9103w(int i) {
        ImageButton imageButton = new ImageButton(this.f1975b);
        imageButton.setId(i);
        imageButton.setImageResource(17301580);
        imageButton.setTag(m2419b("ImageButton", "width=-2\nheight=-2\nsrc=17301580"));
        mo9087g(i);
        return imageButton;
    }

    /* renamed from: x */
    public ImageView mo9104x(int i) {
        ImageView imageView = new ImageView(this.f1975b);
        imageView.setId(i);
        imageView.setImageResource(17301567);
        imageView.setTag(m2419b("ImageView", "width=-2\nheight=-2\nsrc=17301567"));
        mo9087g(i);
        return imageView;
    }

    /* renamed from: y */
    public LinearLayout mo9105y(int i) {
        LinearLayout linearLayout = new LinearLayout(this.f1975b);
        linearLayout.setId(i);
        linearLayout.setTag(m2419b("LinearLayout", "width=-2\nheight=-2\norientation=vertical"));
        mo9087g(i);
        return linearLayout;
    }

    /* renamed from: z */
    public ListView mo9106z(int i) {
        ListView listView = new ListView(this.f1975b);
        listView.setId(i);
        listView.setTag(m2419b("ListView", "width=-2\nheight=-2"));
        mo9087g(i);
        return listView;
    }
}
