package android.support.p009v4.p011os;

import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.os.LocaleListInterface */
public interface LocaleListInterface {
    boolean equals(Object obj);

    Locale get(int i);

    Locale getFirstMatch(String[] strArr);

    Object getLocaleList();

    int hashCode();

    int indexOf(Locale locale);

    boolean isEmpty();

    void setLocaleList(Locale... localeArr);

    int size();

    String toLanguageTags();

    String toString();
}
