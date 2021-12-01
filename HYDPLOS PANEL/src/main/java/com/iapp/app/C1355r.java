package com.iapp.app;

import android.text.Editable;
import android.text.TextWatcher;
import android.webkit.WebView;
import android.widget.TextView;

/* renamed from: com.iapp.app.r */
public class C1355r {

    /* renamed from: a */
    private TextView f3200a = null;

    /* renamed from: b */
    private C1298d f3201b = null;

    /* renamed from: c */
    private boolean f3202c;

    /* renamed from: d */
    private boolean f3203d;

    /* renamed from: e */
    private boolean f3204e;

    /* renamed from: f */
    private int f3205f;

    /* renamed from: g */
    private C1309h f3206g = null;

    /* renamed from: h */
    private WebView f3207h;

    /* renamed from: i */
    private String f3208i;

    /* renamed from: com.iapp.app.r$a */
    class C1356a implements TextWatcher {
        C1356a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C1355r.this.f3204e) {
                C1298d dVar = C1355r.this.f3201b;
                dVar.mo11693d("aftertextchanged" + C1355r.this.f3205f, Integer.valueOf(C1355r.this.f3205f), C1355r.this.f3200a, editable.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1355r.this.f3203d) {
                C1298d dVar = C1355r.this.f3201b;
                dVar.mo11693d("beforetextchanged" + C1355r.this.f3205f, Integer.valueOf(C1355r.this.f3205f), C1355r.this.f3200a, charSequence.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1355r.this.f3202c) {
                C1298d dVar = C1355r.this.f3201b;
                dVar.mo11693d("ontextchanged" + C1355r.this.f3205f, Integer.valueOf(C1355r.this.f3205f), C1355r.this.f3200a, charSequence.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
    }

    /* renamed from: com.iapp.app.r$b */
    class C1357b implements TextWatcher {
        C1357b() {
        }

        public void afterTextChanged(Editable editable) {
            if (C1355r.this.f3204e) {
                C1309h hVar = C1355r.this.f3206g;
                hVar.mo11942b("aftertextchanged" + C1355r.this.f3205f, Integer.valueOf(C1355r.this.f3205f), C1355r.this.f3200a, editable.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1355r.this.f3203d) {
                C1309h hVar = C1355r.this.f3206g;
                hVar.mo11942b("beforetextchanged" + C1355r.this.f3205f, Integer.valueOf(C1355r.this.f3205f), C1355r.this.f3200a, charSequence.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1355r.this.f3202c) {
                C1309h hVar = C1355r.this.f3206g;
                hVar.mo11942b("ontextchanged" + C1355r.this.f3205f, Integer.valueOf(C1355r.this.f3205f), C1355r.this.f3200a, charSequence.toString(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
    }

    /* renamed from: com.iapp.app.r$c */
    class C1358c implements TextWatcher {
        C1358c() {
        }

        public void afterTextChanged(Editable editable) {
            if (C1355r.this.f3204e) {
                C1355r.this.m3975j("aftertextchanged" + C1355r.this.f3205f, C1355r.this.f3205f + ", '" + C1355r.this.f3208i + "', '" + editable.toString() + "'");
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1355r.this.f3203d) {
                C1355r.this.m3975j("beforetextchanged" + C1355r.this.f3205f, C1355r.this.f3205f + ", '" + C1355r.this.f3208i + "', '" + charSequence.toString() + "', " + i + ", " + i2 + ", " + i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C1355r.this.f3202c) {
                C1355r.this.m3975j("ontextchanged" + C1355r.this.f3205f, C1355r.this.f3205f + ", '" + C1355r.this.f3208i + "', '" + charSequence.toString() + "', " + i + ", " + i2 + ", " + i3);
            }
        }
    }

    public C1355r(TextView textView, WebView webView, String str, boolean z, boolean z2, boolean z3) {
        this.f3200a = textView;
        this.f3207h = webView;
        this.f3205f = textView.getId();
        this.f3208i = str;
        this.f3202c = z;
        this.f3203d = z2;
        this.f3204e = z3;
        textView.addTextChangedListener(new C1358c());
    }

    public C1355r(TextView textView, C1298d dVar, boolean z, boolean z2, boolean z3) {
        this.f3200a = textView;
        this.f3201b = dVar;
        this.f3205f = textView.getId();
        this.f3202c = z;
        this.f3203d = z2;
        this.f3204e = z3;
        textView.addTextChangedListener(new C1356a());
    }

    public C1355r(TextView textView, C1309h hVar, boolean z, boolean z2, boolean z3) {
        this.f3200a = textView;
        this.f3206g = hVar;
        this.f3205f = textView.getId();
        this.f3202c = z;
        this.f3203d = z2;
        this.f3204e = z3;
        textView.addTextChangedListener(new C1357b());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private void m3975j(String str, String str2) {
        WebView webView = this.f3207h;
        webView.loadUrl("javascript:" + str + "(" + str2 + ")");
    }
}
