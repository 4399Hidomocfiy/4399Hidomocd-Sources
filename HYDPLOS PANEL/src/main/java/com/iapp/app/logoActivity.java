package com.iapp.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.p012v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import com.iapp.app.p067x5.WebView;
import com.iapp.app.run.mian;
import java.io.File;
import org.keplerproject.luajava.LuaException;
import p013b.p044b.p045a.p046a.C0832d;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0839h;
import p013b.p044b.p045a.p046a.C0849k;
import p013b.p044b.p045a.p046a.C0851m;
import p013b.p044b.p045a.p046a.C0852n;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;
import p013b.p044b.p045a.p046a.p047y.C0909b;

public class logoActivity extends AppCompatActivity {

    /* renamed from: a */
    private boolean f3121a = true;

    /* renamed from: b */
    private AlertDialog f3122b = null;

    /* renamed from: c */
    private EditText f3123c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.logoActivity$a */
    public class View$OnClickListenerC1331a implements View.OnClickListener {
        View$OnClickListenerC1331a() {
        }

        public void onClick(View view) {
            String d = C0860r.m2045d(logoActivity.this.f3123c.getText().toString() + "mmpfbf");
            if (C1294b.m3498h2(logoActivity.this, d)) {
                String str = logoActivity.this.getFilesDir().getPath() + "/config/userencryption.xml";
                C0835f.m1845b(str, false);
                C0835f.m1854k(str, "<s>" + d + "</s>");
                logoActivity.this.m3896h();
                return;
            }
            Toast.makeText(logoActivity.this, "答案错误", 0).show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.logoActivity$b */
    public class DialogInterface$OnClickListenerC1332b implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC1332b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            logoActivity.this.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.iapp.app.logoActivity$c */
    public class View$OnClickListenerC1333c implements View.OnClickListener {
        View$OnClickListenerC1333c() {
        }

        public void onClick(View view) {
            if (logoActivity.this.f3122b != null) {
                logoActivity.this.f3122b.dismiss();
                logoActivity.this.f3122b = null;
            }
            logoActivity.this.m3898j();
        }
    }

    /* renamed from: f */
    private String m3895f(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo);
            return applicationLabel != null ? applicationLabel.toString() : "请等等";
        } catch (Exception e) {
            e.printStackTrace();
            return "请等等";
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m3896h() {
        Intent flags = new Intent(this, mian.class).setFlags(67108864);
        Bundle bundle = new Bundle();
        bundle.putString("OpenFilexmlui", "mian.iyu");
        flags.putExtras(bundle);
        startActivity(flags);
        finish();
    }

    /* renamed from: i */
    private void m3897i(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            m3899k();
            return;
        }
        boolean z = false;
        try {
            z = C0851m.m1978d(activity, activity.getPackageManager().getPackageInfo(activity.getPackageName(), 4096).requestedPermissions);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z) {
            m3899k();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private void m3898j() {
        String f = C0835f.m1849f(this, "userencryption.xml");
        if (f == null || !f.contains("<ok>true</ok>")) {
            new File(getFilesDir().getPath() + "/config/userencryption.xml").delete();
            m3896h();
            return;
        }
        String af = C1303e.m3528af(this);
        if (af != null) {
            if (C1294b.m3498h2(this, af)) {
                m3896h();
                return;
            }
            new File(getFilesDir().getPath() + "/config/userencryption.xml").delete();
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setPadding(20, 0, 20, 0);
        EditText editText = new EditText(this);
        this.f3123c = editText;
        editText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f3123c.setHint("请输入答案");
        this.f3123c.setHighlightColor(Color.parseColor("#bbbbbb"));
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        button.setText("马上使用");
        button.setOnClickListener(new View$OnClickListenerC1331a());
        linearLayout.addView(this.f3123c);
        linearLayout.addView(button);
        Bitmap b = C0849k.m1962b(this, "res/" + C0860r.m2049h(f, "img"));
        if (b != null) {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            imageView.setImageBitmap(b);
            linearLayout.addView(imageView);
        }
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.addView(linearLayout);
        this.f3122b = new AlertDialog.Builder(this).setIcon(getResources().getDrawable(2131427340)).setTitle(m3895f(this)).setMessage(C0860r.m2049h(f, "text")).setView(scrollView).setNegativeButton("再见", new DialogInterface$OnClickListenerC1332b()).show();
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        Button button2 = new Button(this);
        button2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        button2.setText("开始使用");
        button2.setOnClickListener(new View$OnClickListenerC1333c());
        linearLayout2.addView(button2);
        setContentView(linearLayout2);
    }

    /* renamed from: k */
    private void m3899k() {
        WebView.m4048b(getApplicationContext());
        try {
            String[] list = getAssets().list("");
            int length = list.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (list[i].equals("yuv0.xml")) {
                    C0864v.f1805o = 0;
                    break;
                } else {
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C1293a.f3049b = new C0909b(this, C0835f.f1721a + "/iApp/DownloadFileDir/TempDefaultDownFile", C0835f.f1721a + "/iApp/DownloadFileDir/DefaultDownFile", 3, 3, 2, 12000, true);
        C1293a.f3050c = getPackageName();
        C0832d.m1827l();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("command");
        if (stringExtra != null) {
            new C0864v(this).mo8985f(stringExtra);
        } else {
            String stringExtra2 = intent.getStringExtra("command2");
            if (stringExtra2 != null) {
                C1298d dVar = new C1298d(this);
                dVar.mo11700l("activity", this);
                dVar.mo11700l("i", new Aid_luaCode(this, dVar));
                dVar.mo11699k();
                try {
                    dVar.mo11696h(stringExtra2);
                } catch (LuaException e2) {
                    e2.printStackTrace();
                    C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
                }
                finish();
                return;
            }
            String stringExtra3 = intent.getStringExtra("command3");
            if (stringExtra3 != null) {
                C1295c.m3509d(C1295c.m3506a(this, 0), "<html><head><script type='text/javascript'>" + C0839h.m1892a(this, "import.mjs") + "\nvar functionItme = " + stringExtra3 + ";\nfunctionItme();\n</script></head></html>");
            } else {
                m3898j();
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p012v7.app.AppCompatActivity, android.support.p009v4.app.SupportActivity, android.support.p009v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3897i(this);
    }

    @Override // android.support.p009v4.app.ActivityCompat.OnRequestPermissionsResultCallback, android.support.p009v4.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i == 60542 && strArr != null) {
            int length = iArr.length;
            if (length == strArr.length) {
                z = true;
                for (int i2 = 0; i2 < length; i2++) {
                    if (iArr[i2] == -1) {
                        String[] strArr2 = C0852n.f1771a;
                        int length2 = strArr2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                break;
                            } else if (strArr2[i3].equals(strArr[i2])) {
                                z = false;
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (!z) {
                            break;
                        }
                    }
                }
            } else {
                z = true;
            }
            if (!z) {
                Toast.makeText(this, "部分功能权限授权失败", 1).show();
            }
        }
        if (this.f3121a) {
            m3899k();
            this.f3121a = false;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
