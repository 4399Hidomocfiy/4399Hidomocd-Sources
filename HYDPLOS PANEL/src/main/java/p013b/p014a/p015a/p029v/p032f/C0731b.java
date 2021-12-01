package p013b.p014a.p015a.p029v.p032f;

import p013b.p014a.p015a.p035x.C0775a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.v.f.b */
public final class C0731b extends AbstractC0737g {

    /* renamed from: c */
    private final short f1422c;

    /* renamed from: d */
    private final short f1423d;

    C0731b(AbstractC0737g gVar, int i, int i2) {
        super(gVar);
        this.f1422c = (short) i;
        this.f1423d = (short) i2;
    }

    @Override // p013b.p014a.p015a.p029v.p032f.AbstractC0737g
    /* renamed from: c */
    public void mo8722c(C0775a aVar, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            short s = this.f1423d;
            if (i2 < s) {
                if (i2 == 0 || (i2 == 31 && s <= 62)) {
                    int i3 = 5;
                    aVar.mo8768c(31, 5);
                    short s2 = this.f1423d;
                    if (s2 > 62) {
                        i = s2 - 31;
                        i3 = 16;
                    } else if (i2 == 0) {
                        aVar.mo8768c(Math.min((int) s2, 31), 5);
                    } else {
                        i = s2 - 31;
                    }
                    aVar.mo8768c(i, i3);
                }
                aVar.mo8768c(bArr[this.f1422c + i2], 8);
                i2++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append((int) this.f1422c);
        sb.append("::");
        sb.append((this.f1422c + this.f1423d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
