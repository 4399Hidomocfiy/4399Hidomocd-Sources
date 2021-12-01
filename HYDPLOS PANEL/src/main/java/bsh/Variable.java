package bsh;

import java.io.Serializable;

public class Variable implements Serializable {
    static final int ASSIGNMENT = 1;
    static final int DECLARATION = 0;
    LHS lhs;
    Modifiers modifiers;
    String name;
    Class type;
    String typeDescriptor;
    Object value;

    Variable(String str, Class cls, LHS lhs2) {
        this.type = null;
        this.name = str;
        this.lhs = lhs2;
        this.type = cls;
    }

    Variable(String str, Class cls, Object obj, Modifiers modifiers2) {
        this.type = null;
        this.name = str;
        this.type = cls;
        this.modifiers = modifiers2;
        setValue(obj, 0);
    }

    Variable(String str, Object obj, Modifiers modifiers2) {
        this(str, (Class) null, obj, modifiers2);
    }

    Variable(String str, String str2, Object obj, Modifiers modifiers2) {
        this(str, (Class) null, obj, modifiers2);
        this.typeDescriptor = str2;
    }

    public Modifiers getModifiers() {
        return this.modifiers;
    }

    public String getName() {
        return this.name;
    }

    public Class getType() {
        return this.type;
    }

    public String getTypeDescriptor() {
        return this.typeDescriptor;
    }

    /* access modifiers changed from: package-private */
    public Object getValue() {
        LHS lhs2 = this.lhs;
        return lhs2 != null ? lhs2.getValue() : this.value;
    }

    public boolean hasModifier(String str) {
        Modifiers modifiers2 = this.modifiers;
        return modifiers2 != null && modifiers2.hasModifier(str);
    }

    public void setValue(Object obj, int i) {
        if (!hasModifier("final") || this.value == null) {
            if (obj == null) {
                obj = Primitive.getDefaultValue(this.type);
            }
            LHS lhs2 = this.lhs;
            int i2 = 0;
            if (lhs2 != null) {
                lhs2.assign(obj, false);
                return;
            }
            Class cls = this.type;
            if (cls != null) {
                if (i != 0) {
                    i2 = 1;
                }
                obj = Types.castObject(obj, cls, i2);
            }
            this.value = obj;
            return;
        }
        throw new UtilEvalError("Final variable, can't re-assign.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Variable: ");
        stringBuffer.append(super.toString());
        stringBuffer.append(" ");
        stringBuffer.append(this.name);
        stringBuffer.append(", type:");
        stringBuffer.append(this.type);
        stringBuffer.append(", value:");
        stringBuffer.append(this.value);
        stringBuffer.append(", lhs = ");
        stringBuffer.append(this.lhs);
        return stringBuffer.toString();
    }
}
