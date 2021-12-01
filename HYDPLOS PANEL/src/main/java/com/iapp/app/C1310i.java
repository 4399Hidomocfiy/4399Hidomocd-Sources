package com.iapp.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: com.iapp.app.i */
public class C1310i {

    /* renamed from: a */
    private Context f3074a = null;

    /* renamed from: b */
    private Resources f3075b = null;

    /* renamed from: c */
    private AssetManager f3076c = null;

    /* renamed from: d */
    private String f3077d = null;

    public C1310i(Context context) {
        this.f3074a = context;
        this.f3076c = context.getAssets();
        this.f3075b = context.getResources();
    }

    public C1310i(Context context, String str) {
        this.f3074a = context;
        try {
            this.f3076c = (AssetManager) AssetManager.class.newInstance();
            AssetManager.class.getMethod("addAssetPath", String.class).invoke(this.f3076c, str);
        } catch (Exception unused) {
        }
        this.f3075b = new Resources(this.f3076c, context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 1);
        if (packageArchiveInfo != null) {
            this.f3077d = packageArchiveInfo.packageName;
        }
    }

    /* renamed from: a */
    public AssetManager mo11947a() {
        return this.f3076c;
    }

    /* renamed from: b */
    public int mo11948b(String str, String str2) {
        return this.f3075b.getIdentifier(str, str2, this.f3077d);
    }

    /* renamed from: c */
    public Resources mo11949c() {
        return this.f3075b;
    }

    /* renamed from: d */
    public Object mo11950d(String str, String str2) {
        int identifier = this.f3075b.getIdentifier(str, str2, this.f3077d);
        if (str2.equals("drawable")) {
            return this.f3075b.getDrawable(identifier);
        }
        if (str2.equals("string")) {
            return this.f3075b.getString(identifier);
        }
        if (str2.equals("color")) {
            return Integer.valueOf(this.f3075b.getColor(identifier));
        }
        if (str2.equals("stringarray")) {
            return this.f3075b.getStringArray(identifier);
        }
        if (str2.equals("layout")) {
            return LayoutInflater.from(this.f3074a).inflate(this.f3075b.getLayout(identifier), (ViewGroup) null);
        }
        return null;
    }
}
