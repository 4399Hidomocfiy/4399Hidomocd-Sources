package com.iapp.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import com.iapp.app.p066t.C1439a;
import java.io.File;
import p013b.p044b.p045a.p046a.C0835f;
import p013b.p044b.p045a.p046a.C0851m;
import p013b.p044b.p045a.p046a.C0860r;

public class Videoview extends Activity {

    /* renamed from: a */
    private String f3030a = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        getWindow().clearFlags(2048);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(128);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString("video");
        this.f3030a = string;
        if (string == null) {
            finish();
        }
        if (!C0860r.m2063v(this.f3030a.toLowerCase())) {
            this.f3030a = C0835f.m1857n(this, this.f3030a);
            if (!new File(this.f3030a).exists()) {
                Toast.makeText(this, "视频文件不存在!", 1).show();
                finish();
            }
        }
        if (extras.getBoolean("sfhp")) {
            if (getRequestedOrientation() != 0) {
                setRequestedOrientation(0);
            }
        } else if (getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(Color.parseColor("#000000"));
        C1439a aVar = new C1439a(this);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.addView(aVar);
        setContentView(linearLayout);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(aVar);
        aVar.setMediaController(mediaController);
        aVar.setVideoURI(C0851m.m1977c(this, this.f3030a));
        aVar.start();
        aVar.requestFocus();
    }
}
