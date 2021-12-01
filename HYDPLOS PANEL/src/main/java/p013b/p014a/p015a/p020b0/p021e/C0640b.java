package p013b.p014a.p015a.p020b0.p021e;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p013b.p014a.p015a.p020b0.C0635a;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.b0.e.b */
public final class C0640b {

    /* renamed from: a */
    private final Map<Integer, Integer> f1169a = new HashMap();

    C0640b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo8513a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f1169a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() != i) {
            }
            arrayList.add(entry.getKey());
        }
        return C0635a.m966c(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8514b(int i) {
        Integer num = this.f1169a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f1169a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
