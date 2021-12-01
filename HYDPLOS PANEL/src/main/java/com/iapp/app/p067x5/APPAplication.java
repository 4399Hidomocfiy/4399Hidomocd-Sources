package com.iapp.app.p067x5;

import android.app.Application;
import android.os.Build;
import p013b.p044b.p045a.p046a.C0907x;

/* renamed from: com.iapp.app.x5.APPAplication */
public class APPAplication extends Application {
    public void onCreate() {
        if (Build.VERSION.SDK_INT < 21) {
            new C0907x().mo9037m(this);
        }
        super.onCreate();
    }
}
