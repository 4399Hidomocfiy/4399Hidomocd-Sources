package bsh;

import bsh.Capabilities;

public abstract class ClassGenerator {

    /* renamed from: cg */
    private static ClassGenerator f2117cg;

    public static ClassGenerator getClassGenerator() {
        if (f2117cg == null) {
            try {
                f2117cg = (ClassGenerator) Class.forName("bsh.ClassGeneratorImpl").newInstance();
            } catch (Exception e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("ClassGenerator unavailable: ");
                stringBuffer.append(e);
                throw new Capabilities.Unavailable(stringBuffer.toString());
            }
        }
        return f2117cg;
    }

    public abstract Class generateClass(String str, Modifiers modifiers, Class[] clsArr, Class cls, BSHBlock bSHBlock, boolean z, CallStack callStack, Interpreter interpreter);

    public abstract Object invokeSuperclassMethod(BshClassManager bshClassManager, Object obj, String str, Object[] objArr);

    public abstract void setInstanceNameSpaceParent(Object obj, String str, NameSpace nameSpace);
}
