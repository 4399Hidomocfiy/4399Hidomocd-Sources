package p013b.p057f.p058a;

/* renamed from: b.f.a.c */
public class C0971c {

    /* renamed from: a */
    private C0970b f2115a;

    /* renamed from: b */
    private C0970b f2116b;

    /* renamed from: a */
    public C0970b mo9269a() {
        return this.f2116b;
    }

    /* renamed from: b */
    public boolean mo9270b() {
        return this.f2115a != null;
    }

    /* renamed from: c */
    public C0970b mo9271c() {
        C0970b bVar = this.f2115a;
        if (bVar != null) {
            this.f2115a = bVar.mo9266b();
        }
        return bVar;
    }

    /* renamed from: d */
    public void mo9272d(C0970b bVar) {
        if (this.f2115a == null) {
            this.f2115a = bVar;
        } else {
            this.f2116b.mo9268d(bVar);
        }
        this.f2116b = bVar;
    }
}
