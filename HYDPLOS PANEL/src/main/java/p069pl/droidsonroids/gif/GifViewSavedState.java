package p069pl.droidsonroids.gif;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: pl.droidsonroids.gif.GifViewSavedState */
public class GifViewSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<GifViewSavedState> CREATOR = new C1485a();

    /* renamed from: a */
    final long[][] f3631a;

    /* renamed from: pl.droidsonroids.gif.GifViewSavedState$a */
    static class C1485a implements Parcelable.Creator<GifViewSavedState> {
        C1485a() {
        }

        /* renamed from: a */
        public GifViewSavedState createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel, (C1485a) null);
        }

        /* renamed from: b */
        public GifViewSavedState[] newArray(int i) {
            return new GifViewSavedState[i];
        }
    }

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f3631a = new long[parcel.readInt()][];
        int i = 0;
        while (true) {
            long[][] jArr = this.f3631a;
            if (i < jArr.length) {
                jArr[i] = parcel.createLongArray();
                i++;
            } else {
                return;
            }
        }
    }

    /* synthetic */ GifViewSavedState(Parcel parcel, C1485a aVar) {
        this(parcel);
    }

    GifViewSavedState(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        long[][] jArr2 = new long[1][];
        this.f3631a = jArr2;
        jArr2[0] = jArr;
    }

    GifViewSavedState(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.f3631a = new long[drawableArr.length][];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof C1488c) {
                this.f3631a[i] = ((C1488c) drawable).f3639g.mo12518k();
            } else {
                this.f3631a[i] = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12565a(Drawable drawable, int i) {
        long[][] jArr = this.f3631a;
        if (jArr[i] != null && (drawable instanceof C1488c)) {
            C1488c cVar = (C1488c) drawable;
            cVar.mo12599j((long) cVar.f3639g.mo12527v(jArr[i], cVar.f3638f));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3631a.length);
        for (long[] jArr : this.f3631a) {
            parcel.writeLongArray(jArr);
        }
    }
}
