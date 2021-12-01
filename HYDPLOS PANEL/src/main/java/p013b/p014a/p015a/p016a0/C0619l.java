package p013b.p014a.p015a.p016a0;

import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: b.a.a.a0.l */
public final class C0619l {

    /* renamed from: a */
    private final List<int[]> f1129a = new ArrayList();

    /* renamed from: b */
    private final List<String> f1130b = new ArrayList();

    C0619l() {
    }

    /* renamed from: a */
    private void m894a(int[] iArr, String str) {
        this.f1129a.add(iArr);
        this.f1130b.add(str);
    }

    /* renamed from: b */
    private synchronized void m895b() {
        if (this.f1129a.isEmpty()) {
            m894a(new int[]{0, 19}, "US/CA");
            m894a(new int[]{30, 39}, "US");
            m894a(new int[]{60, 139}, "US/CA");
            m894a(new int[]{300, 379}, "FR");
            m894a(new int[]{380}, "BG");
            m894a(new int[]{383}, "SI");
            m894a(new int[]{385}, "HR");
            m894a(new int[]{387}, "BA");
            m894a(new int[]{400, 440}, "DE");
            m894a(new int[]{450, 459}, "JP");
            m894a(new int[]{460, 469}, "RU");
            m894a(new int[]{471}, "TW");
            m894a(new int[]{474}, "EE");
            m894a(new int[]{475}, "LV");
            m894a(new int[]{476}, "AZ");
            m894a(new int[]{477}, "LT");
            m894a(new int[]{478}, "UZ");
            m894a(new int[]{479}, "LK");
            m894a(new int[]{480}, "PH");
            m894a(new int[]{481}, "BY");
            m894a(new int[]{482}, "UA");
            m894a(new int[]{484}, "MD");
            m894a(new int[]{485}, "AM");
            m894a(new int[]{486}, "GE");
            m894a(new int[]{487}, "KZ");
            m894a(new int[]{489}, "HK");
            m894a(new int[]{490, 499}, "JP");
            m894a(new int[]{500, 509}, "GB");
            m894a(new int[]{520}, "GR");
            m894a(new int[]{528}, "LB");
            m894a(new int[]{529}, "CY");
            m894a(new int[]{531}, "MK");
            m894a(new int[]{535}, "MT");
            m894a(new int[]{539}, "IE");
            m894a(new int[]{540, 549}, "BE/LU");
            m894a(new int[]{560}, "PT");
            m894a(new int[]{569}, "IS");
            m894a(new int[]{570, 579}, "DK");
            m894a(new int[]{590}, "PL");
            m894a(new int[]{594}, "RO");
            m894a(new int[]{599}, "HU");
            m894a(new int[]{600, 601}, "ZA");
            m894a(new int[]{603}, "GH");
            m894a(new int[]{608}, "BH");
            m894a(new int[]{609}, "MU");
            m894a(new int[]{611}, "MA");
            m894a(new int[]{613}, "DZ");
            m894a(new int[]{616}, "KE");
            m894a(new int[]{618}, "CI");
            m894a(new int[]{619}, "TN");
            m894a(new int[]{621}, "SY");
            m894a(new int[]{622}, "EG");
            m894a(new int[]{624}, "LY");
            m894a(new int[]{625}, "JO");
            m894a(new int[]{626}, "IR");
            m894a(new int[]{627}, "KW");
            m894a(new int[]{628}, "SA");
            m894a(new int[]{629}, "AE");
            m894a(new int[]{640, 649}, "FI");
            m894a(new int[]{690, 695}, "CN");
            m894a(new int[]{700, 709}, "NO");
            m894a(new int[]{729}, "IL");
            m894a(new int[]{730, 739}, "SE");
            m894a(new int[]{740}, "GT");
            m894a(new int[]{741}, "SV");
            m894a(new int[]{742}, "HN");
            m894a(new int[]{743}, "NI");
            m894a(new int[]{744}, "CR");
            m894a(new int[]{745}, "PA");
            m894a(new int[]{746}, "DO");
            m894a(new int[]{750}, "MX");
            m894a(new int[]{754, 755}, "CA");
            m894a(new int[]{759}, "VE");
            m894a(new int[]{760, 769}, "CH");
            m894a(new int[]{770}, "CO");
            m894a(new int[]{773}, "UY");
            m894a(new int[]{775}, "PE");
            m894a(new int[]{777}, "BO");
            m894a(new int[]{779}, "AR");
            m894a(new int[]{780}, "CL");
            m894a(new int[]{784}, "PY");
            m894a(new int[]{785}, "PE");
            m894a(new int[]{786}, "EC");
            m894a(new int[]{789, 790}, "BR");
            m894a(new int[]{800, 839}, "IT");
            m894a(new int[]{840, 849}, "ES");
            m894a(new int[]{850}, "CU");
            m894a(new int[]{858}, "SK");
            m894a(new int[]{859}, "CZ");
            m894a(new int[]{860}, "YU");
            m894a(new int[]{865}, "MN");
            m894a(new int[]{867}, "KP");
            m894a(new int[]{868, 869}, "TR");
            m894a(new int[]{870, 879}, "NL");
            m894a(new int[]{880}, "KR");
            m894a(new int[]{885}, "TH");
            m894a(new int[]{888}, "SG");
            m894a(new int[]{890}, "IN");
            m894a(new int[]{893}, "VN");
            m894a(new int[]{896}, "PK");
            m894a(new int[]{899}, "ID");
            m894a(new int[]{900, 919}, "AT");
            m894a(new int[]{930, 939}, "AU");
            m894a(new int[]{940, 949}, "AZ");
            m894a(new int[]{955}, "MY");
            m894a(new int[]{958}, "MO");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo8486c(String str) {
        int[] iArr;
        int i;
        m895b();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f1129a.size();
        int i2 = 0;
        while (i2 < size && parseInt >= (i = (iArr = this.f1129a.get(i2))[0])) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (parseInt <= i) {
                return this.f1130b.get(i2);
            }
            i2++;
        }
        return null;
    }
}
