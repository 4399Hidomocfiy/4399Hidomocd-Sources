package android.support.p009v4.p011os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: android.support.v4.os.LocaleListCompat */
public final class LocaleListCompat {
    static final LocaleListInterface IMPL = (Build.VERSION.SDK_INT >= 24 ? new LocaleListCompatApi24Impl() : new LocaleListCompatBaseImpl());
    private static final LocaleListCompat sEmptyLocaleList = new LocaleListCompat();

    /* renamed from: android.support.v4.os.LocaleListCompat$LocaleListCompatApi24Impl */
    static class LocaleListCompatApi24Impl implements LocaleListInterface {
        private LocaleList mLocaleList = new LocaleList(new Locale[0]);

        LocaleListCompatApi24Impl() {
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public Locale getFirstMatch(String[] strArr) {
            LocaleList localeList = this.mLocaleList;
            if (localeList != null) {
                return localeList.getFirstMatch(strArr);
            }
            return null;
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public Object getLocaleList() {
            return this.mLocaleList;
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public void setLocaleList(Locale... localeArr) {
            this.mLocaleList = new LocaleList(localeArr);
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public int size() {
            return this.mLocaleList.size();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public String toString() {
            return this.mLocaleList.toString();
        }
    }

    /* renamed from: android.support.v4.os.LocaleListCompat$LocaleListCompatBaseImpl */
    static class LocaleListCompatBaseImpl implements LocaleListInterface {
        private LocaleListHelper mLocaleList = new LocaleListHelper(new Locale[0]);

        LocaleListCompatBaseImpl() {
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public Locale getFirstMatch(String[] strArr) {
            LocaleListHelper localeListHelper = this.mLocaleList;
            if (localeListHelper != null) {
                return localeListHelper.getFirstMatch(strArr);
            }
            return null;
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public Object getLocaleList() {
            return this.mLocaleList;
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public void setLocaleList(Locale... localeArr) {
            this.mLocaleList = new LocaleListHelper(localeArr);
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public int size() {
            return this.mLocaleList.size();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        @Override // android.support.p009v4.p011os.LocaleListInterface
        public String toString() {
            return this.mLocaleList.toString();
        }
    }

    private LocaleListCompat() {
    }

    public static LocaleListCompat create(Locale... localeArr) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    public static LocaleListCompat forLanguageTags(String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",");
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(split[i]) : LocaleHelper.forLanguageTag(split[i]);
        }
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    public static LocaleListCompat getAdjustedDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getAdjustedDefault());
        }
        return create(Locale.getDefault());
    }

    public static LocaleListCompat getDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getDefault());
        }
        return create(Locale.getDefault());
    }

    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    private void setLocaleList(LocaleList localeList) {
        int size = localeList.size();
        if (size > 0) {
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            IMPL.setLocaleList(localeArr);
        }
    }

    private void setLocaleListArray(Locale... localeArr) {
        IMPL.setLocaleList(localeArr);
    }

    public static LocaleListCompat wrap(Object obj) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        if (obj instanceof LocaleList) {
            localeListCompat.setLocaleList((LocaleList) obj);
        }
        return localeListCompat;
    }

    public boolean equals(Object obj) {
        return IMPL.equals(obj);
    }

    public Locale get(int i) {
        return IMPL.get(i);
    }

    public Locale getFirstMatch(String[] strArr) {
        return IMPL.getFirstMatch(strArr);
    }

    public int hashCode() {
        return IMPL.hashCode();
    }

    public int indexOf(Locale locale) {
        return IMPL.indexOf(locale);
    }

    public boolean isEmpty() {
        return IMPL.isEmpty();
    }

    public int size() {
        return IMPL.size();
    }

    public String toLanguageTags() {
        return IMPL.toLanguageTags();
    }

    public String toString() {
        return IMPL.toString();
    }

    public Object unwrap() {
        return IMPL.getLocaleList();
    }
}
