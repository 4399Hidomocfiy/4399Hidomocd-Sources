package p013b.p014a.p015a;

import java.util.Map;
import p013b.p014a.p015a.p016a0.C0609b;
import p013b.p014a.p015a.p016a0.C0611d;
import p013b.p014a.p015a.p016a0.C0613f;
import p013b.p014a.p015a.p016a0.C0616i;
import p013b.p014a.p015a.p016a0.C0618k;
import p013b.p014a.p015a.p016a0.C0621n;
import p013b.p014a.p015a.p016a0.C0627t;
import p013b.p014a.p015a.p020b0.C0638d;
import p013b.p014a.p015a.p025c0.C0665b;
import p013b.p014a.p015a.p029v.C0724c;
import p013b.p014a.p015a.p035x.C0776b;
import p013b.p014a.p015a.p038y.C0795b;

/* renamed from: b.a.a.k */
public final class C0710k implements AbstractC0720t {

    /* renamed from: b.a.a.k$a */
    static /* synthetic */ class C0711a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1368a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: p013b.p014a.p015a.C0710k.C0711a.<clinit>():void");
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0720t
    /* renamed from: a */
    public C0776b mo8483a(String str, EnumC0577a aVar, int i, int i2, Map<EnumC0706g, ?> map) {
        AbstractC0720t tVar;
        switch (C0711a.f1368a[aVar.ordinal()]) {
            case 1:
                tVar = new C0618k();
                break;
            case 2:
                tVar = new C0616i();
                break;
            case 3:
                tVar = new C0627t();
                break;
            case 4:
                tVar = new C0665b();
                break;
            case 5:
                tVar = new C0613f();
                break;
            case 6:
                tVar = new C0611d();
                break;
            case 7:
                tVar = new C0621n();
                break;
            case 8:
                tVar = new C0638d();
                break;
            case 9:
                tVar = new C0609b();
                break;
            case 10:
                tVar = new C0795b();
                break;
            case 11:
                tVar = new C0724c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return tVar.mo8483a(str, aVar, i, i2, map);
    }
}
