package p059c.p061b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* renamed from: c.b.c */
public class C1024c extends AbstractC1023b<C1022a> {

    /* renamed from: e */
    private Reader f2206e;

    /* renamed from: f */
    private int f2207f = 1;

    /* renamed from: g */
    private int f2208g = 0;

    public C1024c(Reader reader) {
        if (reader != null) {
            this.f2206e = new BufferedReader(reader);
            return;
        }
        throw new IllegalArgumentException("input must not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C1022a mo9986d() {
        return new C1022a(0, this.f2207f, this.f2208g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1022a mo9987e() {
        try {
            int read = this.f2206e.read();
            if (read == -1) {
                return null;
            }
            if (read == 10) {
                this.f2207f++;
                this.f2208g = 0;
            }
            this.f2208g++;
            return new C1022a((char) read, this.f2207f, this.f2208g);
        } catch (IOException e) {
            this.f2204c.add(C1025d.m2848a(new C1022a(0, this.f2207f, this.f2208g), e.getMessage()));
            return null;
        }
    }

    public String toString() {
        StringBuilder sb;
        Object f;
        if (this.f2202a.size() == 0) {
            sb = new StringBuilder();
            sb.append(this.f2207f);
            sb.append(":");
            sb.append(this.f2208g);
            sb.append(": Buffer empty");
        } else {
            if (this.f2202a.size() < 2) {
                sb = new StringBuilder();
                sb.append(this.f2207f);
                sb.append(":");
                sb.append(this.f2208g);
                sb.append(": ");
                f = mo9985c();
            } else {
                sb = new StringBuilder();
                sb.append(this.f2207f);
                sb.append(":");
                sb.append(this.f2208g);
                sb.append(": ");
                sb.append(mo9985c());
                sb.append(", ");
                f = mo9988f();
            }
            sb.append(f);
        }
        return sb.toString();
    }
}
