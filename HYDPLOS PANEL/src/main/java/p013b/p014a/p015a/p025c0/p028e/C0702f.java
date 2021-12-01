package p013b.p014a.p015a.p025c0.p028e;

import android.support.p012v7.widget.helper.ItemTouchHelper;
import p013b.p014a.p015a.p025c0.p026c.C0684j;
import p013b.p014a.p015a.p025c0.p026c.EnumC0680f;
import p013b.p014a.p015a.p025c0.p026c.EnumC0682h;

/* renamed from: b.a.a.c0.e.f */
public final class C0702f {

    /* renamed from: a */
    private EnumC0682h f1332a;

    /* renamed from: b */
    private EnumC0680f f1333b;

    /* renamed from: c */
    private C0684j f1334c;

    /* renamed from: d */
    private int f1335d = -1;

    /* renamed from: e */
    private C0697b f1336e;

    /* renamed from: b */
    public static boolean m1310b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C0697b mo8666a() {
        return this.f1336e;
    }

    /* renamed from: c */
    public void mo8667c(EnumC0680f fVar) {
        this.f1333b = fVar;
    }

    /* renamed from: d */
    public void mo8668d(int i) {
        this.f1335d = i;
    }

    /* renamed from: e */
    public void mo8669e(C0697b bVar) {
        this.f1336e = bVar;
    }

    /* renamed from: f */
    public void mo8670f(EnumC0682h hVar) {
        this.f1332a = hVar;
    }

    /* renamed from: g */
    public void mo8671g(C0684j jVar) {
        this.f1334c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f1332a);
        sb.append("\n ecLevel: ");
        sb.append(this.f1333b);
        sb.append("\n version: ");
        sb.append(this.f1334c);
        sb.append("\n maskPattern: ");
        sb.append(this.f1335d);
        if (this.f1336e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f1336e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
