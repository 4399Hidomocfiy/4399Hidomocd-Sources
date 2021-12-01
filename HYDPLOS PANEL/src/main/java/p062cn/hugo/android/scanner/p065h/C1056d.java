package p062cn.hugo.android.scanner.p065h;

import java.util.Collection;
import java.util.EnumSet;
import java.util.regex.Pattern;
import p013b.p014a.p015a.EnumC0577a;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.h.d */
public final class C1056d {

    /* renamed from: a */
    static final Collection<EnumC0577a> f2325a;

    /* renamed from: b */
    static final Collection<EnumC0577a> f2326b;

    /* renamed from: c */
    static final Collection<EnumC0577a> f2327c = EnumSet.of(EnumC0577a.QR_CODE);

    /* renamed from: d */
    static final Collection<EnumC0577a> f2328d = EnumSet.of(EnumC0577a.DATA_MATRIX);

    static {
        Pattern.compile(",");
        EnumSet of = EnumSet.of(EnumC0577a.UPC_A, EnumC0577a.UPC_E, EnumC0577a.EAN_13, EnumC0577a.EAN_8, EnumC0577a.RSS_14, EnumC0577a.RSS_EXPANDED);
        f2325a = of;
        EnumSet of2 = EnumSet.of(EnumC0577a.CODE_39, EnumC0577a.CODE_93, EnumC0577a.CODE_128, EnumC0577a.ITF, EnumC0577a.CODABAR);
        f2326b = of2;
        of2.addAll(of);
    }
}
