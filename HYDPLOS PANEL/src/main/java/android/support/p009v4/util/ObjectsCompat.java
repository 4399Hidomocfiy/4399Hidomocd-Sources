package android.support.p009v4.util;

import android.os.Build;
import java.util.Objects;

/* renamed from: android.support.v4.util.ObjectsCompat */
public class ObjectsCompat {
    private static final ImplBase IMPL = (Build.VERSION.SDK_INT >= 19 ? new ImplApi19() : new ImplBase());

    /* renamed from: android.support.v4.util.ObjectsCompat$ImplApi19 */
    private static class ImplApi19 extends ImplBase {
        private ImplApi19() {
            super();
        }

        @Override // android.support.p009v4.util.ObjectsCompat.ImplBase
        public boolean equals(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.util.ObjectsCompat$ImplBase */
    public static class ImplBase {
        private ImplBase() {
        }

        public boolean equals(Object obj, Object obj2) {
            return obj == obj2 || (obj != null && obj.equals(obj2));
        }
    }

    private ObjectsCompat() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return IMPL.equals(obj, obj2);
    }
}
