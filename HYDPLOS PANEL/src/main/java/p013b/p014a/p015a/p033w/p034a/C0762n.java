package p013b.p014a.p015a.p033w.p034a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p013b.p014a.p015a.C0716p;

/* renamed from: b.a.a.w.a.n */
public final class C0762n extends AbstractC0769u {

    /* renamed from: e */
    private static final Pattern f1514e = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    /* renamed from: n */
    public C0761m mo8741h(C0716p pVar) {
        Matcher matcher = f1514e.matcher(AbstractC0769u.m1518b(pVar));
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d) {
                if (parseDouble >= -90.0d) {
                    double parseDouble2 = Double.parseDouble(matcher.group(2));
                    if (parseDouble2 <= 180.0d) {
                        if (parseDouble2 >= -180.0d) {
                            double d = 0.0d;
                            if (matcher.group(3) != null) {
                                double parseDouble3 = Double.parseDouble(matcher.group(3));
                                if (parseDouble3 < 0.0d) {
                                    return null;
                                }
                                d = parseDouble3;
                            }
                            return new C0761m(parseDouble, parseDouble2, d, group);
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
