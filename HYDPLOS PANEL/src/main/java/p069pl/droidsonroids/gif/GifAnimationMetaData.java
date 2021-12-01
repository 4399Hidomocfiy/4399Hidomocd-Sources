package p069pl.droidsonroids.gif;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: pl.droidsonroids.gif.GifAnimationMetaData */
public class GifAnimationMetaData implements Serializable, Parcelable {
    public static final Parcelable.Creator<GifAnimationMetaData> CREATOR = new C1480a();

    /* renamed from: a */
    private final int f3603a;

    /* renamed from: b */
    private final int f3604b;

    /* renamed from: c */
    private final int f3605c;

    /* renamed from: d */
    private final int f3606d;

    /* renamed from: e */
    private final int f3607e;

    /* renamed from: f */
    private final long f3608f;

    /* renamed from: g */
    private final long f3609g;

    /* renamed from: pl.droidsonroids.gif.GifAnimationMetaData$a */
    static class C1480a implements Parcelable.Creator<GifAnimationMetaData> {
        C1480a() {
        }

        /* renamed from: a */
        public GifAnimationMetaData createFromParcel(Parcel parcel) {
            return new GifAnimationMetaData(parcel, null);
        }

        /* renamed from: b */
        public GifAnimationMetaData[] newArray(int i) {
            return new GifAnimationMetaData[i];
        }
    }

    private GifAnimationMetaData(Parcel parcel) {
        this.f3603a = parcel.readInt();
        this.f3604b = parcel.readInt();
        this.f3605c = parcel.readInt();
        this.f3606d = parcel.readInt();
        this.f3607e = parcel.readInt();
        this.f3609g = parcel.readLong();
        this.f3608f = parcel.readLong();
    }

    /* synthetic */ GifAnimationMetaData(Parcel parcel, C1480a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public boolean mo12486a() {
        return this.f3607e > 1 && this.f3604b > 0;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i = this.f3603a;
        String format = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", Integer.valueOf(this.f3606d), Integer.valueOf(this.f3605c), Integer.valueOf(this.f3607e), i == 0 ? "Infinity" : Integer.toString(i), Integer.valueOf(this.f3604b));
        if (!mo12486a()) {
            return format;
        }
        return "Animated " + format;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3603a);
        parcel.writeInt(this.f3604b);
        parcel.writeInt(this.f3605c);
        parcel.writeInt(this.f3606d);
        parcel.writeInt(this.f3607e);
        parcel.writeLong(this.f3609g);
        parcel.writeLong(this.f3608f);
    }
}
