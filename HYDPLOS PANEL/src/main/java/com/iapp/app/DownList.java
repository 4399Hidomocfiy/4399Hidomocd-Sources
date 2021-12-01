package com.iapp.app;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p012v7.app.ActionBar;
import android.support.p012v7.app.AppCompatActivity;
import android.support.p012v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p013b.p044b.p045a.p046a.C0851m;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0862t;
import p013b.p044b.p045a.p046a.p047y.C0911c;

public class DownList extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: a */
    private C1272d f2909a;

    /* renamed from: b */
    private ArrayList<HashMap<String, Object>> f2910b = new ArrayList<>();

    /* renamed from: c */
    private ImageButton f2911c;

    /* renamed from: d */
    private ImageButton f2912d;

    /* renamed from: e */
    private TextView f2913e;

    /* renamed from: f */
    private View f2914f;

    /* renamed from: g */
    private View f2915g;

    /* renamed from: h */
    private ListView f2916h;

    /* renamed from: i */
    private boolean f2917i;

    /* renamed from: j */
    private DecimalFormat f2918j = new DecimalFormat("0.0");

    /* renamed from: k */
    private Handler f2919k = new HandlerC1271c();

    /* renamed from: com.iapp.app.DownList$a */
    class View$OnClickListenerC1269a implements View.OnClickListener {
        View$OnClickListenerC1269a() {
        }

        public void onClick(View view) {
            DownList.this.f2917i = false;
            DownList.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.DownList$b */
    public class C1270b extends Thread {
        C1270b() {
        }

        public void run() {
            while (DownList.this.f2917i) {
                DownList.this.f2919k.sendEmptyMessage(1);
                try {
                    Thread.sleep(1600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.iapp.app.DownList$c */
    class HandlerC1271c extends Handler {
        HandlerC1271c() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                DownList.this.m3392m();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.iapp.app.DownList$d */
    public class C1272d extends BaseAdapter {

        /* renamed from: a */
        private LayoutInflater f2923a;

        /* renamed from: b */
        private Object f2924b;

        /* renamed from: c */
        private C1274b f2925c;

        /* renamed from: d */
        private View.OnClickListener f2926d = new View$OnClickListenerC1273a();

        /* renamed from: com.iapp.app.DownList$d$a */
        class View$OnClickListenerC1273a implements View.OnClickListener {
            View$OnClickListenerC1273a() {
            }

            public void onClick(View view) {
                Boolean bool = Boolean.TRUE;
                int parseInt = Integer.parseInt(view.getTag().toString());
                if (view.getId() == 2131230930) {
                    C0911c cVar = (C0911c) ((HashMap) DownList.this.f2910b.get(parseInt)).get("download");
                    int i = cVar.f1952m;
                    if (i == 0 || i == 3 || i == -1) {
                        cVar.mo9051u(0);
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("status_t", "等待");
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("status_title", "暂停");
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("status_icon", 2131427332);
                        C1293a.f3049b.mo9043j();
                    } else if (i == 1) {
                        cVar.mo9051u(3);
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("status_t", "已暂停");
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("status_title", "继续");
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("status_icon", 2131427332);
                    } else if (i == 2) {
                        File file = new File(((HashMap) DownList.this.f2910b.get(parseInt)).get("dirfilename").toString());
                        if (file.exists()) {
                            Toast.makeText(DownList.this, "正在打开", 0).show();
                            try {
                                DownList.this.m3393n(file);
                                return;
                            } catch (Exception unused) {
                                Toast.makeText(DownList.this, "找不到程序打开此文件！", 1).show();
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    DownList.this.f2909a.notifyDataSetChanged();
                } else if (view.getId() == 2131230924) {
                    if (((HashMap) DownList.this.f2910b.get(parseInt)).get("sele").equals(bool)) {
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("sele", Boolean.FALSE);
                    } else {
                        ((HashMap) DownList.this.f2910b.get(parseInt)).put("sele", bool);
                    }
                    DownList.this.f2909a.notifyDataSetChanged();
                    Iterator it = DownList.this.f2910b.iterator();
                    boolean z = false;
                    int i2 = 0;
                    while (it.hasNext()) {
                        if (((HashMap) it.next()).get("sele").equals(bool)) {
                            i2++;
                            z = true;
                        }
                    }
                    DownList downList = DownList.this;
                    if (z) {
                        TextView textView = downList.f2913e;
                        textView.setText("已选中" + i2 + "个");
                        DownList.this.f2915g.setVisibility(0);
                        return;
                    }
                    downList.f2915g.setVisibility(8);
                }
            }
        }

        /* renamed from: com.iapp.app.DownList$d$b */
        private final class C1274b {

            /* renamed from: a */
            public ImageView f2929a;

            /* renamed from: b */
            public TextView f2930b;

            /* renamed from: c */
            public ImageView f2931c;

            /* renamed from: d */
            public LinearLayout f2932d;

            /* renamed from: e */
            public ImageView f2933e;

            /* renamed from: f */
            public TextView f2934f;

            /* renamed from: g */
            public ProgressBar f2935g;

            /* renamed from: h */
            public TextView f2936h;

            /* renamed from: i */
            public TextView f2937i;

            /* renamed from: j */
            public TextView f2938j;

            /* renamed from: k */
            public LinearLayout f2939k;

            private C1274b(C1272d dVar) {
            }

            /* synthetic */ C1274b(C1272d dVar, View$OnClickListenerC1269a aVar) {
                this(dVar);
            }
        }

        public C1272d(Context context) {
            this.f2923a = LayoutInflater.from(context);
        }

        public int getCount() {
            return DownList.this.f2910b.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            int i2;
            if (view == null) {
                this.f2925c = new C1274b(this, null);
                view = this.f2923a.inflate(2131361856, (ViewGroup) null);
                this.f2925c.f2929a = (ImageView) view.findViewById(2131230926);
                this.f2925c.f2930b = (TextView) view.findViewById(2131230929);
                this.f2925c.f2931c = (ImageView) view.findViewById(2131230923);
                this.f2925c.f2932d = (LinearLayout) view.findViewById(2131230924);
                this.f2925c.f2933e = (ImageView) view.findViewById(2131230922);
                this.f2925c.f2934f = (TextView) view.findViewById(2131230931);
                this.f2925c.f2935g = (ProgressBar) view.findViewById(2131230921);
                this.f2925c.f2936h = (TextView) view.findViewById(2131230928);
                this.f2925c.f2937i = (TextView) view.findViewById(2131230927);
                this.f2925c.f2938j = (TextView) view.findViewById(2131230925);
                this.f2925c.f2939k = (LinearLayout) view.findViewById(2131230930);
                view.setTag(this.f2925c);
            } else {
                this.f2925c = (C1274b) view.getTag();
            }
            this.f2925c.f2929a.setImageResource(((Integer) ((HashMap) DownList.this.f2910b.get(i)).get("status_icon")).intValue());
            this.f2925c.f2930b.setText((String) ((HashMap) DownList.this.f2910b.get(i)).get("status_title"));
            if (((HashMap) DownList.this.f2910b.get(i)).get("sele").equals(Boolean.TRUE)) {
                imageView = this.f2925c.f2931c;
                i2 = 2131427337;
            } else {
                imageView = this.f2925c.f2931c;
                i2 = 2131427338;
            }
            imageView.setImageResource(i2);
            Object obj = ((HashMap) DownList.this.f2910b.get(i)).get("icon");
            this.f2924b = obj;
            if (obj instanceof Bitmap) {
                this.f2925c.f2933e.setImageBitmap((Bitmap) obj);
            } else if (obj instanceof Integer) {
                this.f2925c.f2933e.setImageResource(Integer.parseInt(String.valueOf(obj)));
            } else {
                this.f2925c.f2933e.setImageResource(2131427328);
            }
            this.f2925c.f2934f.setText((String) ((HashMap) DownList.this.f2910b.get(i)).get("title"));
            this.f2925c.f2935g.setProgress(Integer.parseInt(((HashMap) DownList.this.f2910b.get(i)).get("Progressbar1").toString()));
            this.f2925c.f2936h.setText((String) ((HashMap) DownList.this.f2910b.get(i)).get("status_t"));
            this.f2925c.f2937i.setText((String) ((HashMap) DownList.this.f2910b.get(i)).get("status_s"));
            this.f2925c.f2938j.setText((String) ((HashMap) DownList.this.f2910b.get(i)).get("status_d"));
            this.f2925c.f2932d.setTag(Integer.valueOf(i));
            this.f2925c.f2939k.setTag(Integer.valueOf(i));
            this.f2925c.f2932d.setOnClickListener(this.f2926d);
            this.f2925c.f2939k.setOnClickListener(this.f2926d);
            return view;
        }
    }

    /* renamed from: j */
    private String m3389j(double d) {
        double d2 = d / 1024.0d;
        if (d2 > 1024.0d) {
            double d3 = d2 / 1024.0d;
            if (d3 > 1024.0d) {
                return this.f2918j.format(d3 / 1024.0d) + "G";
            }
            return this.f2918j.format(d3) + "M";
        }
        return this.f2918j.format(d2) + "K";
    }

    /* renamed from: k */
    private String m3390k(int i, long j, long j2) {
        StringBuilder sb;
        String str;
        long j3 = j2 - j;
        if (i < 1 || j3 < 1) {
            return "";
        }
        int i2 = (int) (j3 / ((long) i));
        if (i2 > 120) {
            int i3 = i2 / 60;
            if (i3 > 60) {
                sb = new StringBuilder();
                sb.append("还剩");
                sb.append(i3 / 60);
                str = "小时";
            } else {
                sb = new StringBuilder();
                sb.append("还剩");
                sb.append(i3);
                str = "分";
            }
        } else {
            sb = new StringBuilder();
            sb.append("还剩");
            sb.append(i2);
            str = "秒";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: l */
    private void m3391l() {
        this.f2917i = true;
        this.f2911c = (ImageButton) findViewById(2131230934);
        this.f2912d = (ImageButton) findViewById(2131230919);
        this.f2913e = (TextView) findViewById(2131230935);
        this.f2914f = findViewById(2131230933);
        this.f2915g = findViewById(2131230937);
        this.f2916h = (ListView) findViewById(2131230920);
        C1272d dVar = new C1272d(this);
        this.f2909a = dVar;
        this.f2916h.setAdapter((ListAdapter) dVar);
        new C1270b().start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private void m3392m() {
        Iterator<C0911c> it = C1293a.f3049b.f1934c.iterator();
        while (it.hasNext()) {
            C0911c next = it.next();
            boolean z = false;
            Iterator<HashMap<String, Object>> it2 = this.f2910b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                HashMap<String, Object> next2 = it2.next();
                if (next2.get("id").equals(Integer.valueOf(next.f1941b))) {
                    m3394o(next, next2);
                    z = true;
                    break;
                }
            }
            if (!z) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("id", Integer.valueOf(next.f1941b));
                hashMap.put("sele", Boolean.FALSE);
                hashMap.put("icon", next.f1961v);
                hashMap.put("title", next.f1960u);
                m3394o(next, hashMap);
                hashMap.put("dirfilename", next.f1943d);
                hashMap.put("download", next);
                this.f2910b.add(hashMap);
            }
        }
        this.f2909a.notifyDataSetChanged();
        if (this.f2910b.size() > 0 && this.f2914f.getVisibility() == 0) {
            this.f2914f.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n */
    private void m3393n(File file) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        C0851m.m1975a(this, intent, file, C0860r.m2057p(file));
        startActivity(intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e2  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3394o(p013b.p044b.p045a.p046a.p047y.C0911c r13, java.util.HashMap<java.lang.String, java.lang.Object> r14) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iapp.app.DownList.m3394o(b.b.a.a.y.c, java.util.HashMap):void");
    }

    public void onClick(View view) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        int id = view.getId();
        boolean z = false;
        if (id == 2131230919) {
            Iterator it = ((ArrayList) this.f2910b.clone()).iterator();
            while (it.hasNext()) {
                HashMap hashMap = (HashMap) it.next();
                if (hashMap.get("sele").equals(bool2)) {
                    C0911c cVar = (C0911c) hashMap.get("download");
                    cVar.mo9051u(-2);
                    C1293a.f3049b.f1934c.remove(cVar);
                    this.f2910b.remove(hashMap);
                }
            }
            this.f2915g.setVisibility(8);
            this.f2909a.notifyDataSetChanged();
            if (this.f2910b.size() == 0 && this.f2914f.getVisibility() == 8) {
                this.f2914f.setVisibility(0);
            }
        } else if (id == 2131230934) {
            Iterator<HashMap<String, Object>> it2 = this.f2910b.iterator();
            while (it2.hasNext()) {
                HashMap<String, Object> next = it2.next();
                if (next.get("sele").equals(bool)) {
                    z = true;
                    next.put("sele", bool2);
                }
            }
            if (!z) {
                Iterator<HashMap<String, Object>> it3 = this.f2910b.iterator();
                while (it3.hasNext()) {
                    it3.next().put("sele", bool);
                }
                this.f2915g.setVisibility(8);
            }
            this.f2909a.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.SupportActivity, android.support.p009v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131361855);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("background");
            String string2 = extras.getString("backgroundShadow");
            if (!(string == null || string2 == null)) {
                findViewById(2131230918).setBackgroundColor(Color.parseColor(string));
                C0862t.m2078c(this, Color.parseColor(string2), true, findViewById(2131230938));
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(2131230936);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setHomeButtonEnabled(true);
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerC1269a());
        m3391l();
        this.f2911c.setOnClickListener(this);
        this.f2912d.setOnClickListener(this);
        this.f2913e.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.FragmentActivity
    public void onDestroy() {
        this.f2917i = false;
        super.onDestroy();
    }
}
