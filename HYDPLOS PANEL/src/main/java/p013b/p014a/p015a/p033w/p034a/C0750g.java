package p013b.p014a.p015a.p033w.p034a;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: b.a.a.w.a.g */
public final class C0750g extends AbstractC0765q {

    /* renamed from: j */
    private static final Pattern f1467j = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* renamed from: k */
    private static final long[] f1468k = {604800000, 86400000, 3600000, 60000, 1000};

    /* renamed from: l */
    private static final Pattern f1469l = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* renamed from: a */
    private final String f1470a;

    /* renamed from: b */
    private final Date f1471b;

    /* renamed from: c */
    private final boolean f1472c;

    /* renamed from: d */
    private final Date f1473d;

    /* renamed from: e */
    private final boolean f1474e;

    /* renamed from: f */
    private final String f1475f;

    /* renamed from: g */
    private final String f1476g;

    /* renamed from: h */
    private final String[] f1477h;

    /* renamed from: i */
    private final String f1478i;

    public C0750g(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(EnumC0766r.CALENDAR);
        this.f1470a = str;
        try {
            Date g = m1472g(str2);
            this.f1471b = g;
            if (str3 == null) {
                long h = m1473h(str4);
                this.f1473d = h < 0 ? null : new Date(g.getTime() + h);
            } else {
                try {
                    this.f1473d = m1472g(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            int length = str2.length();
            boolean z = true;
            this.f1472c = length == 8;
            this.f1474e = (str3 == null || str3.length() != 8) ? false : z;
            this.f1475f = str5;
            this.f1476g = str6;
            this.f1477h = strArr;
            this.f1478i = str7;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    /* renamed from: d */
    private static DateFormat m1469d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: e */
    private static DateFormat m1470e() {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);
    }

    /* renamed from: f */
    private static String m1471f(boolean z, Date date) {
        if (date == null) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(date);
    }

    /* renamed from: g */
    private static Date m1472g(String str) {
        if (!f1469l.matcher(str).matches()) {
            throw new ParseException(str, 0);
        } else if (str.length() == 8) {
            return m1469d().parse(str);
        } else {
            if (str.length() != 16 || str.charAt(15) != 'Z') {
                return m1470e().parse(str);
            }
            Date parse = m1470e().parse(str.substring(0, 15));
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            long time = parse.getTime() + ((long) gregorianCalendar.get(15));
            gregorianCalendar.setTime(new Date(time));
            return new Date(time + ((long) gregorianCalendar.get(16)));
        }
    }

    /* renamed from: h */
    private static long m1473h(CharSequence charSequence) {
        if (charSequence == null) {
            return -1;
        }
        Matcher matcher = f1467j.matcher(charSequence);
        if (!matcher.matches()) {
            return -1;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = f1468k;
            if (i >= jArr.length) {
                return j;
            }
            int i2 = i + 1;
            String group = matcher.group(i2);
            if (group != null) {
                j += jArr[i] * ((long) Integer.parseInt(group));
            }
            i = i2;
        }
    }

    @Override // p013b.p014a.p015a.p033w.p034a.AbstractC0765q
    /* renamed from: a */
    public String mo8744a() {
        StringBuilder sb = new StringBuilder(100);
        AbstractC0765q.m1511b(this.f1470a, sb);
        AbstractC0765q.m1511b(m1471f(this.f1472c, this.f1471b), sb);
        AbstractC0765q.m1511b(m1471f(this.f1474e, this.f1473d), sb);
        AbstractC0765q.m1511b(this.f1475f, sb);
        AbstractC0765q.m1511b(this.f1476g, sb);
        AbstractC0765q.m1512c(this.f1477h, sb);
        AbstractC0765q.m1511b(this.f1478i, sb);
        return sb.toString();
    }
}
