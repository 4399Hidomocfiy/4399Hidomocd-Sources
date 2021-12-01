package com.iapp.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bsh.EvalError;
import com.iapp.app.run.mian;
import java.util.HashMap;
import org.keplerproject.luajava.LuaObject;
import p013b.p044b.p045a.p046a.C0839h;
import p013b.p044b.p045a.p046a.C0864v;

public class MyFragment extends Fragment {

    /* renamed from: i */
    public static HashMap<String, Object> f2940i = new HashMap<>();

    /* renamed from: j */
    public static Activity f2941j = null;

    /* renamed from: k */
    private static final Object[] f2942k = new Object[0];

    /* renamed from: a */
    private Aid_YuCodeX f2943a = null;

    /* renamed from: b */
    private String f2944b = null;

    /* renamed from: c */
    private boolean f2945c = true;

    /* renamed from: d */
    private C0864v f2946d = null;

    /* renamed from: e */
    private C1298d f2947e = null;

    /* renamed from: f */
    private Aid_luaCode f2948f = null;

    /* renamed from: g */
    private C1309h f2949g = null;

    /* renamed from: h */
    private Aid_javaCode f2950h = null;

    /* renamed from: e */
    public static MyFragment m3395e(String str, int i, String str2) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("iyu", str);
        bundle.putInt("addid", i);
        bundle.putString("pagename", str2);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    /* renamed from: a */
    public View mo11520a(Context context, String str, String str2, int i) {
        if (this.f2950h == null) {
            this.f2949g = new C1309h(context);
            this.f2950h = new Aid_javaCode(context, f2941j, this.f2949g);
            try {
                this.f2949g.set("activity", f2941j);
                this.f2949g.set("i", this.f2950h);
            } catch (EvalError e) {
                e.printStackTrace();
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        C1309h openRestoreinterface = this.f2950h.openRestoreinterface(str, linearLayout, i, null);
        HashMap hashMap = (HashMap) f2940i.get(str2);
        HashMap hashMap2 = new HashMap();
        for (Object obj : hashMap.keySet()) {
            int parseInt = Integer.parseInt(String.valueOf(obj));
            if (parseInt > 0) {
                hashMap2.put(Integer.valueOf(parseInt), linearLayout.findViewById(parseInt + i));
            }
        }
        for (Object obj2 : hashMap.keySet()) {
            int parseInt2 = Integer.parseInt(String.valueOf(obj2));
            if (parseInt2 > 0) {
                C0839h.m1914w((View) hashMap2.get(Integer.valueOf(parseInt2)), hashMap.get(Integer.valueOf(parseInt2)), hashMap, MyFragmentStatePagerAdapter.f2951f);
            }
        }
        if (openRestoreinterface != null) {
            try {
                openRestoreinterface.getNameSpace().invokeMethod("loading", f2942k, openRestoreinterface);
            } catch (EvalError e2) {
                e2.printStackTrace();
            }
        }
        return linearLayout;
    }

    /* renamed from: b */
    public View mo11521b(Context context, String str, String str2, int i) {
        if (this.f2948f == null) {
            this.f2947e = new C1298d(context);
            this.f2948f = new Aid_luaCode(context, f2941j, this.f2947e);
            this.f2947e.mo11700l("activity", f2941j);
            this.f2947e.mo11700l("i", this.f2948f);
            this.f2947e.mo11699k();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LuaObject openRestoreinterface = this.f2948f.openRestoreinterface(str, linearLayout, i, null);
        HashMap hashMap = (HashMap) f2940i.get(str2);
        HashMap hashMap2 = new HashMap();
        for (Object obj : hashMap.keySet()) {
            int parseInt = Integer.parseInt(String.valueOf(obj));
            if (parseInt > 0) {
                hashMap2.put(Integer.valueOf(parseInt), linearLayout.findViewById(parseInt + i));
            }
        }
        for (Object obj2 : hashMap.keySet()) {
            int parseInt2 = Integer.parseInt(String.valueOf(obj2));
            if (parseInt2 > 0) {
                C0839h.m1914w((View) hashMap2.get(Integer.valueOf(parseInt2)), hashMap.get(Integer.valueOf(parseInt2)), hashMap, MyFragmentStatePagerAdapter.f2951f);
            }
        }
        if (openRestoreinterface != null) {
            openRestoreinterface.callxNoErr();
        }
        return linearLayout;
    }

    /* renamed from: c */
    public View mo11522c(Context context, String str, String str2, int i) {
        if (this.f2946d == null) {
            this.f2946d = new C0864v(context, f2941j);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f2946d.mo8978J1(str, linearLayout, i, null);
        HashMap hashMap = (HashMap) f2940i.get(str2);
        HashMap hashMap2 = new HashMap();
        for (Object obj : hashMap.keySet()) {
            int parseInt = Integer.parseInt(String.valueOf(obj));
            if (parseInt > 0) {
                hashMap2.put(Integer.valueOf(parseInt), linearLayout.findViewById(parseInt + i));
            }
        }
        for (Object obj2 : hashMap.keySet()) {
            int parseInt2 = Integer.parseInt(String.valueOf(obj2));
            if (parseInt2 > 0) {
                C0839h.m1914w((View) hashMap2.get(Integer.valueOf(parseInt2)), hashMap.get(Integer.valueOf(parseInt2)), hashMap, MyFragmentStatePagerAdapter.f2951f);
            }
        }
        if (this.f2945c) {
            if (this.f2944b == null) {
                this.f2944b = this.f2946d.mo8980Q0(str);
            }
            if (this.f2944b != null) {
                linearLayout.setTag(new Object[]{null, null, null, f2940i.get(str2)});
                this.f2946d.mo8981T("st_vW", linearLayout);
                this.f2946d.mo8981T("st_lS", f2940i.get(str2));
                this.f2946d.mo8981T("st_pN", -1);
                this.f2946d.mo8985f(this.f2944b);
            } else {
                this.f2945c = false;
            }
        }
        return linearLayout;
    }

    /* renamed from: d */
    public View mo11523d(Context context, String str, String str2, String str3, int i) {
        if (this.f2943a == null) {
            this.f2943a = new Aid_YuCodeX(context, f2941j);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f2943a.openRestoreinterface(str, linearLayout, i, null);
        HashMap hashMap = (HashMap) f2940i.get(str3);
        HashMap hashMap2 = new HashMap();
        for (Object obj : hashMap.keySet()) {
            int parseInt = Integer.parseInt(String.valueOf(obj));
            if (parseInt > 0) {
                hashMap2.put(Integer.valueOf(parseInt), linearLayout.findViewById(parseInt + i));
            }
        }
        for (Object obj2 : hashMap.keySet()) {
            int parseInt2 = Integer.parseInt(String.valueOf(obj2));
            if (parseInt2 > 0) {
                C0839h.m1914w((View) hashMap2.get(Integer.valueOf(parseInt2)), hashMap.get(Integer.valueOf(parseInt2)), hashMap, MyFragmentStatePagerAdapter.f2951f);
            }
        }
        if (this.f2945c) {
            if (this.f2944b == null) {
                this.f2944b = this.f2943a.getopenRestoreinterface(str);
            }
            if (this.f2944b != null) {
                linearLayout.setTag(new Object[]{null, null, null, f2940i.get(str3)});
                this.f2943a.dim("st_vW", linearLayout);
                this.f2943a.dim("st_lS", f2940i.get(str3));
                this.f2943a.dim("st_pN", -1);
                mian.m4024c(str2, "loading" + this.f2944b, this.f2943a);
            } else {
                this.f2945c = false;
            }
        }
        return linearLayout;
    }

    @Override // android.support.p009v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments.getString("pagename");
        String string2 = arguments.getString("iyu");
        int i = arguments.getInt("addid");
        if (string2.endsWith(".iyu")) {
            if (mian.f3388sh) {
                return mo11522c(layoutInflater.getContext(), string2, string, i);
            }
            return mo11523d(layoutInflater.getContext(), string2, string2.substring(0, string2.length() - 4).toLowerCase(), string, i);
        } else if (string2.endsWith(".ijava")) {
            return mo11520a(layoutInflater.getContext(), string2, string, i);
        } else {
            if (string2.endsWith(".ilua")) {
                return mo11521b(layoutInflater.getContext(), string2, string, i);
            }
            return null;
        }
    }
}
