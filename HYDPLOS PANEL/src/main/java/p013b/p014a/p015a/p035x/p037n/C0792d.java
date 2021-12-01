package p013b.p014a.p015a.p035x.p037n;

import java.util.ArrayList;
import java.util.List;

/* renamed from: b.a.a.x.n.d */
public final class C0792d {

    /* renamed from: a */
    private final C0789a f1630a;

    /* renamed from: b */
    private final List<C0790b> f1631b;

    public C0792d(C0789a aVar) {
        this.f1630a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f1631b = arrayList;
        arrayList.add(new C0790b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C0790b m1645a(int i) {
        if (i >= this.f1631b.size()) {
            List<C0790b> list = this.f1631b;
            C0790b bVar = list.get(list.size() - 1);
            for (int size = this.f1631b.size(); size <= i; size++) {
                C0789a aVar = this.f1630a;
                bVar = bVar.mo8847i(new C0790b(aVar, new int[]{1, aVar.mo8830c((size - 1) + aVar.mo8831d())}));
                this.f1631b.add(bVar);
            }
        }
        return this.f1631b.get(i);
    }

    /* renamed from: b */
    public void mo8851b(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C0790b a = m1645a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] e = new C0790b(this.f1630a, iArr2).mo8848j(i, 1).mo8840b(a)[1].mo8843e();
                int length2 = i - e.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(e, 0, iArr, length + length2, e.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
