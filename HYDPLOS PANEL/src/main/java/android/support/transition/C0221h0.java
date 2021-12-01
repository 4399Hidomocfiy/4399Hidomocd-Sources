package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.transition.h0 */
public class C0221h0 {

    /* renamed from: a */
    public final Map<String, Object> f922a = new HashMap();

    /* renamed from: b */
    public View f923b;

    /* renamed from: c */
    final ArrayList<Transition> f924c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (!(obj instanceof C0221h0)) {
            return false;
        }
        C0221h0 h0Var = (C0221h0) obj;
        return this.f923b == h0Var.f923b && this.f922a.equals(h0Var.f922a);
    }

    public int hashCode() {
        return (this.f923b.hashCode() * 31) + this.f922a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f923b + "\n") + "    values:";
        for (String str2 : this.f922a.keySet()) {
            str = str + "    " + str2 + ": " + this.f922a.get(str2) + "\n";
        }
        return str;
    }
}
