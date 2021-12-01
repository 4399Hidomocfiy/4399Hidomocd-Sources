package android.support.p009v4.hardware.fingerprint;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.p009v4.hardware.fingerprint.FingerprintManagerCompatApi23;
import android.support.p009v4.p011os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat */
public final class FingerprintManagerCompat {
    static final FingerprintManagerCompatImpl IMPL = (Build.VERSION.SDK_INT >= 23 ? new Api23FingerprintManagerCompatImpl() : new LegacyFingerprintManagerCompatImpl());
    private Context mContext;

    /* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat$Api23FingerprintManagerCompatImpl */
    private static class Api23FingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        static CryptoObject unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        private static FingerprintManagerCompatApi23.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
            return new FingerprintManagerCompatApi23.AuthenticationCallback() {
                /* class android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.Api23FingerprintManagerCompatImpl.C03131 */

                @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    authenticationCallback.onAuthenticationError(i, charSequence);
                }

                @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationFailed() {
                    authenticationCallback.onAuthenticationFailed();
                }

                @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    authenticationCallback.onAuthenticationHelp(i, charSequence);
                }

                @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompatApi23.AuthenticationCallback
                public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationResultInternal) {
                    authenticationCallback.onAuthenticationSucceeded(new AuthenticationResult(Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationResultInternal.getCryptoObject())));
                }
            };
        }

        private static FingerprintManagerCompatApi23.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
            FingerprintManagerCompatApi23.authenticate(context, wrapCryptoObject(cryptoObject), i, cancellationSignal != null ? cancellationSignal.getCancellationSignalObject() : null, wrapCallback(authenticationCallback), handler);
        }

        @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean hasEnrolledFingerprints(Context context) {
            return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
        }

        @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean isHardwareDetected(Context context) {
            return FingerprintManagerCompatApi23.isHardwareDetected(context);
        }
    }

    /* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat$AuthenticationCallback */
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    /* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat$AuthenticationResult */
    public static final class AuthenticationResult {
        private CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    /* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat$CryptoObject */
    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }

        public Signature getSignature() {
            return this.mSignature;
        }
    }

    /* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat$FingerprintManagerCompatImpl */
    private interface FingerprintManagerCompatImpl {
        void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler);

        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    /* renamed from: android.support.v4.hardware.fingerprint.FingerprintManagerCompat$LegacyFingerprintManagerCompatImpl */
    private static class LegacyFingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        }

        @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean hasEnrolledFingerprints(Context context) {
            return false;
        }

        @Override // android.support.p009v4.hardware.fingerprint.FingerprintManagerCompat.FingerprintManagerCompatImpl
        public boolean isHardwareDetected(Context context) {
            return false;
        }
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    public void authenticate(CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        IMPL.authenticate(this.mContext, cryptoObject, i, cancellationSignal, authenticationCallback, handler);
    }

    public boolean hasEnrolledFingerprints() {
        return IMPL.hasEnrolledFingerprints(this.mContext);
    }

    public boolean isHardwareDetected() {
        return IMPL.isHardwareDetected(this.mContext);
    }
}
