package com.iapp.app;

import android.app.Activity;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.app.FragmentManager;
import android.support.p009v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p013b.p044b.p045a.p046a.C0844j;
import p013b.p044b.p045a.p046a.C0860r;

public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: f */
    public static C0844j f2951f;

    /* renamed from: a */
    private int f2952a = 0;

    /* renamed from: b */
    private String f2953b;

    /* renamed from: c */
    private ArrayList<String> f2954c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<Fragment> f2955d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<HashMap<Integer, Object>> f2956e = new ArrayList<>();

    public MyFragmentStatePagerAdapter(Activity activity, int i, FragmentManager fragmentManager) {
        super(fragmentManager);
        MyFragment.f2941j = activity;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i);
        stringBuffer.append('_');
        stringBuffer.append(C0860r.m2048g(1000, 9999));
        this.f2953b = stringBuffer.toString();
        C0844j jVar = f2951f;
        if (jVar != null) {
            jVar.mo8941o();
        }
        f2951f = new C0844j(activity, this, 1);
    }

    /* renamed from: a */
    public void mo11524a(int i, String str, String str2, int i2, HashMap<Integer, Object> hashMap) {
        this.f2952a++;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f2953b);
        stringBuffer.append('_');
        stringBuffer.append(this.f2952a);
        String stringBuffer2 = stringBuffer.toString();
        MyFragment.f2940i.put(stringBuffer2, hashMap);
        if (i == -1) {
            this.f2956e.add(hashMap);
            this.f2954c.add(str);
            this.f2955d.add(MyFragment.m3395e(str2, i2, stringBuffer2));
        } else {
            this.f2956e.add(i, hashMap);
            this.f2954c.add(str);
            this.f2955d.add(i, MyFragment.m3395e(str2, i2, stringBuffer2));
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo11525b() {
        new HashMap();
        for (String str : MyFragment.f2940i.keySet()) {
            String valueOf = String.valueOf(str);
            if (valueOf != null && valueOf.startsWith(this.f2953b)) {
                MyFragment.f2940i.remove(valueOf);
            }
        }
        f2951f.mo8941o();
    }

    /* renamed from: c */
    public void mo11526c(int i) {
        if (i == -1) {
            i = this.f2954c.size() - 1;
        }
        this.f2954c.remove(i);
        this.f2955d.remove(i);
        try {
            MyFragment.f2940i.remove(this.f2956e.get(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f2956e.remove(i);
    }

    /* renamed from: d */
    public ArrayList<HashMap<Integer, Object>> mo11527d() {
        return this.f2956e;
    }

    @Override // android.support.p009v4.app.FragmentStatePagerAdapter, android.support.p009v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
    }

    /* renamed from: e */
    public void mo11528e(int i, String str) {
        if (i == -1) {
            i = this.f2954c.size() - 1;
        }
        this.f2954c.set(i, str);
    }

    /* renamed from: f */
    public int mo11529f() {
        return this.f2955d.size();
    }

    @Override // android.support.p009v4.view.PagerAdapter
    public int getCount() {
        return this.f2955d.size();
    }

    @Override // android.support.p009v4.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return this.f2955d.get(i);
    }

    @Override // android.support.p009v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // android.support.p009v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f2954c.get(i);
    }

    @Override // android.support.p009v4.app.FragmentStatePagerAdapter, android.support.p009v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }
}
