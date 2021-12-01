package android.support.p009v4.p011os;

import android.os.Parcel;

@Deprecated
/* renamed from: android.support.v4.os.ParcelableCompatCreatorCallbacks */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
