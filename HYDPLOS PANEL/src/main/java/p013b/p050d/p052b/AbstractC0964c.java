package p013b.p050d.p052b;

/* renamed from: b.d.b.c */
public abstract class AbstractC0964c<T, V> {

    /* renamed from: a */
    private final String f2082a;

    public AbstractC0964c(Class<V> cls, String str) {
        this.f2082a = str;
    }

    /* renamed from: a */
    public abstract V mo9166a(T t);

    /* renamed from: b */
    public String mo9227b() {
        return this.f2082a;
    }

    /* renamed from: c */
    public void mo9224c(T t, V v) {
        throw new UnsupportedOperationException("Property " + mo9227b() + " is read-only");
    }
}
