package com.iapp.app;

import android.support.p009v4.view.PagerAdapter;
import android.support.p009v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p068fr.castorflex.android.verticalviewpager.VerticalViewPager;

/* renamed from: com.iapp.app.s */
public class C1437s {

    /* renamed from: a */
    private ArrayList<Object> f3448a;

    /* renamed from: b */
    private PagerAdapter f3449b;

    /* renamed from: com.iapp.app.s$a */
    class C1438a extends PagerAdapter {
        C1438a() {
        }

        @Override // android.support.p009v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) C1437s.this.f3448a.get(i));
        }

        @Override // android.support.p009v4.view.PagerAdapter
        public int getCount() {
            return C1437s.this.f3448a.size();
        }

        @Override // android.support.p009v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = (View) C1437s.this.f3448a.get(i);
            viewGroup.addView(view);
            return view;
        }

        @Override // android.support.p009v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public C1437s(View view, ArrayList<Object> arrayList) {
        C1438a aVar = new C1438a();
        this.f3449b = aVar;
        this.f3448a = arrayList;
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            viewPager.setAdapter(aVar);
            viewPager.setOffscreenPageLimit(arrayList.size());
        } else if (view instanceof VerticalViewPager) {
            VerticalViewPager verticalViewPager = (VerticalViewPager) view;
            verticalViewPager.setAdapter(aVar);
            verticalViewPager.setOffscreenPageLimit(arrayList.size());
        }
    }
}
