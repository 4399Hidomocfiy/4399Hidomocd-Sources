package com.iapp.app;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

/* renamed from: com.iapp.app.p */
public class C1349p {

    /* renamed from: a */
    private TextToSpeech f3182a;

    /* renamed from: b */
    private int f3183b = 0;

    /* renamed from: com.iapp.app.p$a */
    class C1350a implements TextToSpeech.OnInitListener {
        C1350a() {
        }

        public void onInit(int i) {
            if (i != 0) {
                C1349p.this.f3183b = -1;
            }
        }
    }

    /* renamed from: com.iapp.app.p$b */
    class C1351b implements TextToSpeech.OnInitListener {

        /* renamed from: a */
        final /* synthetic */ String f3185a;

        /* renamed from: b */
        final /* synthetic */ float f3186b;

        /* renamed from: c */
        final /* synthetic */ float f3187c;

        /* renamed from: d */
        final /* synthetic */ String f3188d;

        C1351b(String str, float f, float f2, String str2) {
            this.f3185a = str;
            this.f3186b = f;
            this.f3187c = f2;
            this.f3188d = str2;
        }

        public void onInit(int i) {
            if (i == 0) {
                int language = C1349p.this.f3182a.setLanguage(new Locale(this.f3185a));
                if (language == -1 || language == -2) {
                    C1349p.this.f3183b = -2;
                    return;
                }
                C1349p.this.f3183b = 1;
                C1349p.this.f3182a.setSpeechRate(this.f3186b);
                C1349p.this.f3182a.setPitch(this.f3187c);
                C1349p.this.f3182a.speak(this.f3188d, 0, null);
                return;
            }
            C1349p.this.f3183b = -1;
        }
    }

    public C1349p(Context context) {
        this.f3182a = new TextToSpeech(context, new C1350a());
    }

    public C1349p(Context context, String str, String str2, float f, float f2) {
        this.f3182a = new TextToSpeech(context, new C1351b(str, f, f2, str2));
    }

    /* renamed from: c */
    public int mo11990c() {
        return this.f3183b;
    }

    /* renamed from: d */
    public boolean mo11991d() {
        return this.f3182a.isSpeaking();
    }

    /* renamed from: e */
    public void mo11992e(String str) {
        int language = this.f3182a.setLanguage(new Locale(str));
        if (language == -1 || language == -2) {
            this.f3183b = -2;
        } else {
            this.f3183b = 1;
        }
    }

    /* renamed from: f */
    public void mo11993f(float f) {
        this.f3182a.setPitch(0.5f);
    }

    /* renamed from: g */
    public void mo11994g(float f) {
        this.f3182a.setSpeechRate(0.5f);
    }

    /* renamed from: h */
    public void mo11995h() {
        this.f3182a.shutdown();
    }

    /* renamed from: i */
    public boolean mo11996i(String str, int i) {
        return this.f3182a.speak(str, i, null) != -1;
    }

    /* renamed from: j */
    public boolean mo11997j() {
        return this.f3182a.stop() != -1;
    }

    /* renamed from: k */
    public boolean mo11998k(String str, String str2) {
        return this.f3182a.synthesizeToFile(str, null, str2) != -1;
    }
}
