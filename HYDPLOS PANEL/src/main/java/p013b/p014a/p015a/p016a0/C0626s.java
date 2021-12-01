package p013b.p014a.p015a.p016a0;

import java.util.Map;
import p013b.p014a.p015a.C0663c;
import p013b.p014a.p015a.C0707h;
import p013b.p014a.p015a.C0716p;
import p013b.p014a.p015a.EnumC0577a;
import p013b.p014a.p015a.EnumC0704e;
import p013b.p014a.p015a.p035x.C0775a;

/* renamed from: b.a.a.a0.s */
public final class C0626s extends AbstractC0631x {

    /* renamed from: h */
    private final AbstractC0631x f1140h = new C0615h();

    /* renamed from: r */
    private static C0716p m923r(C0716p pVar) {
        String f = pVar.mo8696f();
        if (f.charAt(0) == '0') {
            return new C0716p(f.substring(1), null, pVar.mo8695e(), EnumC0577a.UPC_A);
        }
        throw C0707h.m1320a();
    }

    @Override // p013b.p014a.p015a.AbstractC0714n, p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: a */
    public C0716p mo8489a(C0663c cVar, Map<EnumC0704e, ?> map) {
        return m923r(this.f1140h.mo8489a(cVar, map));
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x, p013b.p014a.p015a.p016a0.AbstractC0624q
    /* renamed from: c */
    public C0716p mo8413c(int i, C0775a aVar, Map<EnumC0704e, ?> map) {
        return m923r(this.f1140h.mo8413c(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: l */
    public int mo8484l(C0775a aVar, int[] iArr, StringBuilder sb) {
        return this.f1140h.mo8484l(aVar, iArr, sb);
    }

    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: m */
    public C0716p mo8491m(int i, C0775a aVar, int[] iArr, Map<EnumC0704e, ?> map) {
        return m923r(this.f1140h.mo8491m(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    @Override // p013b.p014a.p015a.p016a0.AbstractC0631x
    /* renamed from: q */
    public EnumC0577a mo8485q() {
        return EnumC0577a.UPC_A;
    }
}
