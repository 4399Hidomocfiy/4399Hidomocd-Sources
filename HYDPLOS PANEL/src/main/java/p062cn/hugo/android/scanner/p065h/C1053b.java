package p062cn.hugo.android.scanner.p065h;

import android.graphics.Bitmap;
import p013b.p014a.p015a.AbstractC0708i;

/* renamed from: cn.hugo.android.scanner.h.b */
public class C1053b extends AbstractC0708i {

    /* renamed from: c */
    private byte[] f2315c;

    protected C1053b(Bitmap bitmap) {
        super(bitmap.getWidth(), bitmap.getHeight());
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        this.f2315c = new byte[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap.getPixels(iArr, 0, mo8681d(), 0, 0, mo8681d(), mo8678a());
        for (int i = 0; i < width; i++) {
            this.f2315c[i] = (byte) iArr[i];
        }
    }

    @Override // p013b.p014a.p015a.AbstractC0708i
    /* renamed from: b */
    public byte[] mo8679b() {
        return this.f2315c;
    }

    @Override // p013b.p014a.p015a.AbstractC0708i
    /* renamed from: c */
    public byte[] mo8680c(int i, byte[] bArr) {
        System.arraycopy(this.f2315c, i * mo8681d(), bArr, 0, mo8681d());
        return bArr;
    }
}
