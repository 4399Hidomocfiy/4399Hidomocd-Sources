package p069pl.droidsonroids.gif;

import java.io.IOException;

/* renamed from: pl.droidsonroids.gif.GifIOException */
public class GifIOException extends IOException {

    /* renamed from: a */
    public final EnumC1491d f3610a;

    /* renamed from: b */
    private final String f3611b;

    GifIOException(int i, String str) {
        this.f3610a = EnumC1491d.m4180a(i);
        this.f3611b = str;
    }

    /* renamed from: a */
    static GifIOException m4112a(int i) {
        if (i == EnumC1491d.NO_ERROR.f3678b) {
            return null;
        }
        return new GifIOException(i, null);
    }

    public String getMessage() {
        if (this.f3611b == null) {
            return this.f3610a.mo12615b();
        }
        return this.f3610a.mo12615b() + ": " + this.f3611b;
    }
}
