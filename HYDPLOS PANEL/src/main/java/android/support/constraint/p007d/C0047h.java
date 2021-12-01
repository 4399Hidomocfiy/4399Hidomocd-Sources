package android.support.constraint.p007d;

/* access modifiers changed from: package-private */
/* renamed from: android.support.constraint.d.h */
public class C0047h<T> implements AbstractC0046g<T> {

    /* renamed from: a */
    private final Object[] f481a;

    /* renamed from: b */
    private int f482b;

    C0047h(int i) {
        if (i > 0) {
            this.f481a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // android.support.constraint.p007d.AbstractC0046g
    /* renamed from: a */
    public void mo169a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f482b;
            Object[] objArr = this.f481a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f482b = i3 + 1;
            }
        }
    }

    @Override // android.support.constraint.p007d.AbstractC0046g
    public T acquire() {
        int i = this.f482b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f481a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f482b = i - 1;
        return t;
    }

    @Override // android.support.constraint.p007d.AbstractC0046g
    public boolean release(T t) {
        int i = this.f482b;
        Object[] objArr = this.f481a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f482b = i + 1;
        return true;
    }
}
