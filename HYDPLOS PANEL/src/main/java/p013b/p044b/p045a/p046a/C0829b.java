package p013b.p044b.p045a.p046a;

/* renamed from: b.b.a.a.b */
public class C0829b {
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m1808a(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 0
            java.lang.String r1 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x000d, NoSuchPaddingException -> 0x0008 }
            goto L_0x0012
        L_0x0008:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0011
        L_0x000d:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0011:
            r1 = r0
        L_0x0012:
            if (r1 == 0) goto L_0x0050
            r2 = 2
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r7.getBytes(r4)     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            java.lang.String r5 = "AES"
            r3.<init>(r4, r5)     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            byte[] r7 = r7.getBytes()     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            r4.<init>(r7)     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            r1.init(r2, r3, r4)     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            r7 = 4
            byte[] r6 = android.util.Base64.decode(r6, r7)     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            byte[] r6 = r1.doFinal(r6)     // Catch:{ InvalidKeyException -> 0x004c, InvalidAlgorithmParameterException -> 0x0047, UnsupportedEncodingException -> 0x0042, IllegalBlockSizeException -> 0x003d, BadPaddingException -> 0x0038 }
            return r6
        L_0x0038:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0050
        L_0x003d:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0050
        L_0x0042:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0050
        L_0x0047:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0050
        L_0x004c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p044b.p045a.p046a.C0829b.m1808a(java.lang.String, java.lang.String):byte[]");
    }

    /* renamed from: b */
    public static byte[] m1809b(String str, String str2) {
        return m1808a(str, str2.substring(16));
    }
}
