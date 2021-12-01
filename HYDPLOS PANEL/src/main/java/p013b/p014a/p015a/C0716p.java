package p013b.p014a.p015a;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: b.a.a.p */
public final class C0716p {

    /* renamed from: a */
    private final String f1375a;

    /* renamed from: b */
    private final byte[] f1376b;

    /* renamed from: c */
    private C0718r[] f1377c;

    /* renamed from: d */
    private final EnumC0577a f1378d;

    /* renamed from: e */
    private Map<EnumC0717q, Object> f1379e;

    public C0716p(String str, byte[] bArr, C0718r[] rVarArr, EnumC0577a aVar) {
        this(str, bArr, rVarArr, aVar, System.currentTimeMillis());
    }

    public C0716p(String str, byte[] bArr, C0718r[] rVarArr, EnumC0577a aVar, long j) {
        this.f1375a = str;
        this.f1376b = bArr;
        this.f1377c = rVarArr;
        this.f1378d = aVar;
        this.f1379e = null;
    }

    /* renamed from: a */
    public void mo8691a(C0718r[] rVarArr) {
        C0718r[] rVarArr2 = this.f1377c;
        if (rVarArr2 == null) {
            this.f1377c = rVarArr;
        } else if (rVarArr != null && rVarArr.length > 0) {
            C0718r[] rVarArr3 = new C0718r[(rVarArr2.length + rVarArr.length)];
            System.arraycopy(rVarArr2, 0, rVarArr3, 0, rVarArr2.length);
            System.arraycopy(rVarArr, 0, rVarArr3, rVarArr2.length, rVarArr.length);
            this.f1377c = rVarArr3;
        }
    }

    /* renamed from: b */
    public EnumC0577a mo8692b() {
        return this.f1378d;
    }

    /* renamed from: c */
    public byte[] mo8693c() {
        return this.f1376b;
    }

    /* renamed from: d */
    public Map<EnumC0717q, Object> mo8694d() {
        return this.f1379e;
    }

    /* renamed from: e */
    public C0718r[] mo8695e() {
        return this.f1377c;
    }

    /* renamed from: f */
    public String mo8696f() {
        return this.f1375a;
    }

    /* renamed from: g */
    public void mo8697g(Map<EnumC0717q, Object> map) {
        if (map != null) {
            Map<EnumC0717q, Object> map2 = this.f1379e;
            if (map2 == null) {
                this.f1379e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo8698h(EnumC0717q qVar, Object obj) {
        if (this.f1379e == null) {
            this.f1379e = new EnumMap(EnumC0717q.class);
        }
        this.f1379e.put(qVar, obj);
    }

    public String toString() {
        return this.f1375a;
    }
}
