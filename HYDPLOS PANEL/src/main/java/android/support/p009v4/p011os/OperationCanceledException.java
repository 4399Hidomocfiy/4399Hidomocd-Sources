package android.support.p009v4.p011os;

/* renamed from: android.support.v4.os.OperationCanceledException */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OperationCanceledException(String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
