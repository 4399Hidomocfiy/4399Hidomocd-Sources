package p069pl.droidsonroids.gif;

import android.support.p009v4.view.PointerIconCompat;
import java.util.Locale;

/* renamed from: pl.droidsonroids.gif.d */
public enum EnumC1491d {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(101, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(112, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(1000, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(PointerIconCompat.TYPE_CONTEXT_MENU, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(PointerIconCompat.TYPE_HAND, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(PointerIconCompat.TYPE_HELP, "Image size exceeds screen size"),
    REWIND_FAILED(PointerIconCompat.TYPE_WAIT, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    

    /* renamed from: a */
    public final String f3677a;

    /* renamed from: b */
    int f3678b;

    private EnumC1491d(int i, String str) {
        this.f3678b = i;
        this.f3677a = str;
    }

    /* renamed from: a */
    static EnumC1491d m4180a(int i) {
        EnumC1491d[] values = values();
        for (EnumC1491d dVar : values) {
            if (dVar.f3678b == i) {
                return dVar;
            }
        }
        EnumC1491d dVar2 = UNKNOWN;
        dVar2.f3678b = i;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo12615b() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(this.f3678b), this.f3677a);
    }
}
