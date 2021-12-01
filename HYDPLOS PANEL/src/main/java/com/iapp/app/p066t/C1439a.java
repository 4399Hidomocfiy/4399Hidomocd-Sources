package com.iapp.app.p066t;

import android.content.Context;
import android.widget.VideoView;

/* renamed from: com.iapp.app.t.a */
public class C1439a extends VideoView {

    /* renamed from: a */
    public boolean f3451a = true;

    public C1439a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f3451a) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(VideoView.getDefaultSize(0, i), VideoView.getDefaultSize(0, i2));
        }
    }
}
