package com.iapp.app;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.iapp.app.run.mian;
import p013b.p044b.p045a.p046a.C0860r;
import p013b.p044b.p045a.p046a.C0864v;

/* renamed from: com.iapp.app.q */
public class C1352q {

    /* renamed from: a */
    private TextView f3190a;

    /* renamed from: b */
    private Activity f3191b;

    /* renamed from: c */
    private String f3192c;

    /* renamed from: d */
    private String f3193d;

    /* renamed from: e */
    private String f3194e;

    /* renamed from: f */
    private String f3195f;

    /* renamed from: g */
    private TextWatcher f3196g;

    /* renamed from: h */
    private TextWatcher f3197h;

    /* renamed from: com.iapp.app.q$a */
    class C1353a implements TextWatcher {
        C1353a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C1352q.this.f3194e != null) {
                C0864v vVar = new C0864v(C1352q.this.f3191b);
                vVar.mo8981T("st_vId", Integer.valueOf(C1352q.this.f3190a.getId()));
                vVar.mo8981T("st_vW", C1352q.this.f3190a);
                vVar.mo8981T("st_sS", editable.toString());
                vVar.mo8985f(C1352q.this.f3194e);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1352q.this.f3193d != null) {
                C0864v vVar = new C0864v(C1352q.this.f3191b);
                vVar.mo8981T("st_vId", Integer.valueOf(C1352q.this.f3190a.getId()));
                vVar.mo8981T("st_vW", C1352q.this.f3190a);
                vVar.mo8981T("st_sS", charSequence.toString());
                vVar.mo8981T("st_sT", Integer.valueOf(i));
                vVar.mo8981T("st_cT", Integer.valueOf(i2));
                vVar.mo8981T("st_aR", Integer.valueOf(i3));
                vVar.mo8985f(C1352q.this.f3193d);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1352q.this.f3192c != null) {
                C0864v vVar = new C0864v(C1352q.this.f3191b);
                vVar.mo8981T("st_vId", Integer.valueOf(C1352q.this.f3190a.getId()));
                vVar.mo8981T("st_vW", C1352q.this.f3190a);
                vVar.mo8981T("st_sS", charSequence.toString());
                vVar.mo8981T("st_sT", Integer.valueOf(i));
                vVar.mo8981T("st_bE", Integer.valueOf(i2));
                vVar.mo8981T("st_cT", Integer.valueOf(i3));
                vVar.mo8985f(C1352q.this.f3192c);
            }
        }
    }

    /* renamed from: com.iapp.app.q$b */
    class C1354b implements TextWatcher {
        C1354b() {
        }

        public void afterTextChanged(Editable editable) {
            if (C1352q.this.f3194e != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1352q.this.f3191b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1352q.this.f3190a.getId()));
                aid_YuCodeX.dim("st_vW", C1352q.this.f3190a);
                aid_YuCodeX.dim("st_sS", editable.toString());
                String str = C1352q.this.f3195f;
                mian.m4024c(str, "aftertextchanged" + C1352q.this.f3194e, aid_YuCodeX);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1352q.this.f3193d != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1352q.this.f3191b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1352q.this.f3190a.getId()));
                aid_YuCodeX.dim("st_vW", C1352q.this.f3190a);
                aid_YuCodeX.dim("st_sS", charSequence.toString());
                aid_YuCodeX.dim("st_sT", Integer.valueOf(i));
                aid_YuCodeX.dim("st_cT", Integer.valueOf(i2));
                aid_YuCodeX.dim("st_aR", Integer.valueOf(i3));
                String str = C1352q.this.f3195f;
                mian.m4024c(str, "beforetextchanged" + C1352q.this.f3193d, aid_YuCodeX);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1352q.this.f3192c != null) {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(C1352q.this.f3191b);
                aid_YuCodeX.dim("st_vId", Integer.valueOf(C1352q.this.f3190a.getId()));
                aid_YuCodeX.dim("st_vW", C1352q.this.f3190a);
                aid_YuCodeX.dim("st_sS", charSequence.toString());
                aid_YuCodeX.dim("st_sT", Integer.valueOf(i));
                aid_YuCodeX.dim("st_bE", Integer.valueOf(i2));
                aid_YuCodeX.dim("st_cT", Integer.valueOf(i3));
                String str = C1352q.this.f3195f;
                mian.m4024c(str, "ontextchanged" + C1352q.this.f3192c, aid_YuCodeX);
            }
        }
    }

    public C1352q(TextView textView, Activity activity) {
        this.f3190a = null;
        this.f3191b = null;
        this.f3195f = null;
        C1353a aVar = new C1353a();
        this.f3196g = aVar;
        this.f3197h = new C1354b();
        this.f3190a = textView;
        this.f3191b = activity;
        textView.addTextChangedListener(aVar);
        String obj = ((Object[]) textView.getTag())[2].toString();
        this.f3192c = C0860r.m2044c(obj, "<eventItme type=\"ontextchanged\">", "</eventItme>");
        this.f3193d = C0860r.m2044c(obj, "<eventItme type=\"beforetextchanged\">", "</eventItme>");
        this.f3194e = C0860r.m2044c(obj, "<eventItme type=\"aftertextchanged\">", "</eventItme>");
    }

    public C1352q(TextView textView, Activity activity, String str) {
        this.f3190a = null;
        this.f3191b = null;
        this.f3195f = null;
        this.f3196g = new C1353a();
        this.f3197h = new C1354b();
        this.f3190a = textView;
        this.f3191b = activity;
        this.f3195f = str;
        String obj = ((Object[]) textView.getTag())[2].toString();
        this.f3192c = C0860r.m2044c(obj, "<eventItme type=\"ontextchanged\">", "</eventItme>");
        this.f3193d = C0860r.m2044c(obj, "<eventItme type=\"beforetextchanged\">", "</eventItme>");
        this.f3194e = C0860r.m2044c(obj, "<eventItme type=\"aftertextchanged\">", "</eventItme>");
        textView.addTextChangedListener(this.f3197h);
    }
}
