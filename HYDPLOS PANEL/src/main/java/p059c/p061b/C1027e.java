package p059c.p061b;

import java.util.List;

/* renamed from: c.b.e */
public class C1027e extends Exception {

    /* renamed from: a */
    private List<C1025d> f2215a;

    private C1027e(String str, List<C1025d> list) {
        super(str);
        this.f2215a = list;
    }

    /* renamed from: a */
    public static C1027e m2850a(List<C1025d> list) {
        if (list.size() == 1) {
            return new C1027e(list.get(0).mo9994b(), list);
        }
        if (list.size() <= 1) {
            return new C1027e("An unknown error occured", list);
        }
        return new C1027e(String.format("%d errors occured. First: %s", Integer.valueOf(list.size()), list.get(0).mo9994b()), list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C1025d dVar : this.f2215a) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(dVar);
        }
        return sb.toString();
    }
}
