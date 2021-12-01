package bsh;

import java.io.Serializable;
import java.util.Hashtable;

public class Modifiers implements Serializable {
    public static final int CLASS = 0;
    public static final int FIELD = 2;
    public static final int METHOD = 1;
    Hashtable modifiers;

    private void insureNo(String str, String str2) {
        if (hasModifier(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append(" cannot be declared '");
            stringBuffer.append(str);
            stringBuffer.append("'");
            throw new IllegalStateException(stringBuffer.toString());
        }
    }

    private void validateForClass() {
        validateForMethod();
        insureNo("native", "Class");
        insureNo("synchronized", "Class");
    }

    private void validateForField() {
        insureNo("synchronized", "Variable");
        insureNo("native", "Variable");
        insureNo("abstract", "Variable");
    }

    private void validateForMethod() {
        insureNo("volatile", "Method");
        insureNo("transient", "Method");
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addModifier(int r3, java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Modifiers.addModifier(int, java.lang.String):void");
    }

    public boolean hasModifier(String str) {
        if (this.modifiers == null) {
            this.modifiers = new Hashtable();
        }
        return this.modifiers.get(str) != null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Modifiers: ");
        stringBuffer.append(this.modifiers);
        return stringBuffer.toString();
    }
}
