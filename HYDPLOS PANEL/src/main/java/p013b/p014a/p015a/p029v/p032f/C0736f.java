package p013b.p014a.p015a.p029v.p032f;

import java.util.LinkedList;
import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.v.f.f */
public final class C0736f {

    /* renamed from: e */
    static final C0736f f1432e = new C0736f(AbstractC0737g.f1437b, 0, 0, 0);

    /* renamed from: a */
    private final int f1433a;

    /* renamed from: b */
    private final AbstractC0737g f1434b;

    /* renamed from: c */
    private final int f1435c;

    /* renamed from: d */
    private final int f1436d;

    private C0736f(AbstractC0737g gVar, int i, int i2, int i3) {
        this.f1434b = gVar;
        this.f1433a = i;
        this.f1435c = i2;
        this.f1436d = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0736f mo8728a(int i) {
        AbstractC0737g gVar = this.f1434b;
        int i2 = this.f1433a;
        int i3 = this.f1436d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C0733d.f1426c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo8738a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f1435c;
        C0736f fVar = new C0736f(gVar, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return fVar.f1435c == 2078 ? fVar.mo8729b(i + 1) : fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0736f mo8729b(int i) {
        int i2 = this.f1435c;
        return i2 == 0 ? this : new C0736f(this.f1434b.mo8739b(i - i2, i2), this.f1433a, 0, this.f1436d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo8730c() {
        return this.f1435c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8731d() {
        return this.f1436d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo8732e() {
        return this.f1433a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8733f(C0736f fVar) {
        int i;
        int i2 = this.f1436d + (C0733d.f1426c[this.f1433a][fVar.f1433a] >> 16);
        int i3 = fVar.f1435c;
        if (i3 > 0 && ((i = this.f1435c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= fVar.f1436d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0736f mo8734g(int i, int i2) {
        int i3 = this.f1436d;
        AbstractC0737g gVar = this.f1434b;
        int i4 = this.f1433a;
        if (i != i4) {
            int i5 = C0733d.f1426c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVar = gVar.mo8738a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C0736f(gVar.mo8738a(i2, i8), i, 0, i3 + i8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0736f mo8735h(int i, int i2) {
        AbstractC0737g gVar = this.f1434b;
        int i3 = this.f1433a;
        int i4 = i3 == 2 ? 4 : 5;
        return new C0736f(gVar.mo8738a(C0733d.f1428e[i3][i], i4).mo8738a(i2, 5), this.f1433a, 0, this.f1436d + i4 + 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0775a mo8736i(byte[] bArr) {
        LinkedList<AbstractC0737g> linkedList = new LinkedList();
        for (AbstractC0737g gVar = mo8729b(bArr.length).f1434b; gVar != null; gVar = gVar.mo8740d()) {
            linkedList.addFirst(gVar);
        }
        C0775a aVar = new C0775a();
        for (AbstractC0737g gVar2 : linkedList) {
            gVar2.mo8722c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", C0733d.f1425b[this.f1433a], Integer.valueOf(this.f1436d), Integer.valueOf(this.f1435c));
    }
}
