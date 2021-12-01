package bsh.org.objectweb.asm;

/* access modifiers changed from: package-private */
public final class Item {
    double doubleVal;
    float floatVal;
    int hashCode;
    short index;
    int intVal;
    long longVal;
    Item next;
    String strVal1;
    String strVal2;
    String strVal3;
    int type;

    Item() {
    }

    Item(short s, Item item) {
        this.index = s;
        this.type = item.type;
        this.intVal = item.intVal;
        this.longVal = item.longVal;
        this.floatVal = item.floatVal;
        this.doubleVal = item.doubleVal;
        this.strVal1 = item.strVal1;
        this.strVal2 = item.strVal2;
        this.strVal3 = item.strVal3;
        this.hashCode = item.hashCode;
    }

    /* access modifiers changed from: package-private */
    public boolean isEqualTo(Item item) {
        int i = item.type;
        int i2 = this.type;
        if (i != i2) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 12) {
                return item.strVal1.equals(this.strVal1) && item.strVal2.equals(this.strVal2);
            }
            switch (i2) {
                case 3:
                    return item.intVal == this.intVal;
                case 4:
                    return item.floatVal == this.floatVal;
                case 5:
                    return item.longVal == this.longVal;
                case 6:
                    return item.doubleVal == this.doubleVal;
                case 7:
                case 8:
                    break;
                default:
                    return item.strVal1.equals(this.strVal1) && item.strVal2.equals(this.strVal2) && item.strVal3.equals(this.strVal3);
            }
        }
        return item.strVal1.equals(this.strVal1);
    }

    /* access modifiers changed from: package-private */
    public void set(double d) {
        this.type = 6;
        this.doubleVal = d;
        this.hashCode = 6 + ((int) d);
    }

    /* access modifiers changed from: package-private */
    public void set(float f) {
        this.type = 4;
        this.floatVal = f;
        this.hashCode = 4 + ((int) f);
    }

    /* access modifiers changed from: package-private */
    public void set(int i) {
        this.type = 3;
        this.intVal = i;
        this.hashCode = 3 + i;
    }

    /* access modifiers changed from: package-private */
    public void set(int i, String str, String str2, String str3) {
        int hashCode2;
        int hashCode3;
        int hashCode4;
        this.type = i;
        this.strVal1 = str;
        this.strVal2 = str2;
        this.strVal3 = str3;
        if (i != 1) {
            if (i == 12) {
                hashCode3 = str.hashCode();
                hashCode4 = str2.hashCode();
            } else if (!(i == 7 || i == 8)) {
                hashCode3 = str.hashCode() * str2.hashCode();
                hashCode4 = str3.hashCode();
            }
            hashCode2 = hashCode3 * hashCode4;
            this.hashCode = i + hashCode2;
        }
        hashCode2 = str.hashCode();
        this.hashCode = i + hashCode2;
    }

    /* access modifiers changed from: package-private */
    public void set(long j) {
        this.type = 5;
        this.longVal = j;
        this.hashCode = 5 + ((int) j);
    }
}
