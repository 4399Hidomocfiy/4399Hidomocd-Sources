package p013b.p014a.p015a;

import p013b.p014a.p015a.p035x.C0775a;
import p013b.p014a.p015a.p035x.C0776b;

/* renamed from: b.a.a.c */
public final class C0663c {

    /* renamed from: a */
    private final AbstractC0634b f1249a;

    /* renamed from: b */
    private C0776b f1250b;

    public C0663c(AbstractC0634b bVar) {
        if (bVar != null) {
            this.f1249a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C0776b mo8597a() {
        if (this.f1250b == null) {
            this.f1250b = this.f1249a.mo8499a();
        }
        return this.f1250b;
    }

    /* renamed from: b */
    public C0775a mo8598b(int i, C0775a aVar) {
        return this.f1249a.mo8500b(i, aVar);
    }

    /* renamed from: c */
    public int mo8599c() {
        return this.f1249a.mo8501c();
    }

    /* renamed from: d */
    public int mo8600d() {
        return this.f1249a.mo8503e();
    }

    /* renamed from: e */
    public boolean mo8601e() {
        return this.f1249a.mo8502d().mo8682e();
    }

    /* renamed from: f */
    public C0663c mo8602f() {
        this.f1249a.mo8502d().mo8683f();
        throw null;
    }

    public String toString() {
        try {
            return mo8597a().toString();
        } catch (C0712l unused) {
            return "";
        }
    }
}
