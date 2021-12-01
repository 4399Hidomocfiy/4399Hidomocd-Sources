package p013b.p044b.p045a.p046a;

import android.os.Build;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: b.b.a.a.a */
public class C0828a {
    /* renamed from: a */
    public static byte[] m1804a(String str, String str2) {
        return m1805b(m1806c(str2.getBytes()), m1807d(str));
    }

    /* renamed from: b */
    private static byte[] m1805b(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES");
        instance.init(2, secretKeySpec);
        return instance.doFinal(bArr2);
    }

    /* renamed from: c */
    private static byte[] m1806c(byte[] bArr) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        SecureRandom instance2 = Build.VERSION.SDK_INT > 16 ? SecureRandom.getInstance("SHA1PRNG", "Crypto") : SecureRandom.getInstance("SHA1PRNG");
        instance2.setSeed(bArr);
        instance.init(256, instance2);
        return instance.generateKey().getEncoded();
    }

    /* renamed from: d */
    public static byte[] m1807d(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }
}
