package p013b.p014a.p015a.p038y.p041e;

import android.support.p009v4.view.InputDeviceCompat;
import android.support.p012v7.widget.helper.ItemTouchHelper;
import bsh.org.objectweb.asm.Constants;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.y.e.b */
public final class C0811b implements AbstractC0816g {
    C0811b() {
    }

    /* renamed from: c */
    private static char m1706c(char c, int i) {
        int i2 = c + ((i * Constants.FCMPL) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }

    @Override // p013b.p014a.p015a.p038y.p041e.AbstractC0816g
    /* renamed from: a */
    public void mo8883a(C0817h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!hVar.mo8903i()) {
                break;
            }
            sb.append(hVar.mo8898c());
            hVar.f1679f++;
            int n = C0819j.m1769n(hVar.mo8899d(), hVar.f1679f, mo8885b());
            if (n != mo8885b()) {
                hVar.mo8909o(n);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.mo8896a() + length + 1;
        hVar.mo8911q(a);
        boolean z = hVar.mo8902g().mo8914a() - a > 0;
        if (hVar.mo8903i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 249 || length > 1555) {
                throw new IllegalStateException("Message length not in valid ranges: " + length);
            } else {
                sb.setCharAt(0, (char) ((length / ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                sb.insert(1, (char) (length % ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo8912r(m1706c(sb.charAt(i), hVar.mo8896a() + 1));
        }
    }

    /* renamed from: b */
    public int mo8885b() {
        return 5;
    }
}
