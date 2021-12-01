package bsh;

import bsh.BshClassManager;
import bsh.NameSource;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class NameSpace implements Serializable, BshClassManager.Listener, NameSource {
    public static final NameSpace JAVACODE;
    SimpleNode callerInfoNode;
    private transient Hashtable classCache;
    Object classInstance;
    private transient BshClassManager classManager;
    Class classStatic;
    protected Hashtable importedClasses;
    private Vector importedCommands;
    private Vector importedObjects;
    private Vector importedPackages;
    private Vector importedStatic;
    boolean isClass;
    boolean isMethod;
    private Hashtable methods;
    Vector nameSourceListeners;
    private Hashtable names;
    private String nsName;
    private String packageName;
    private NameSpace parent;
    private This thisReference;
    private Hashtable variables;

    static {
        NameSpace nameSpace = new NameSpace((BshClassManager) null, "Called from compiled Java code.");
        JAVACODE = nameSpace;
        nameSpace.isMethod = true;
    }

    public NameSpace(BshClassManager bshClassManager, String str) {
        this(null, bshClassManager, str);
    }

    public NameSpace(NameSpace nameSpace, BshClassManager bshClassManager, String str) {
        setName(str);
        setParent(nameSpace);
        setClassManager(bshClassManager);
        if (bshClassManager != null) {
            bshClassManager.addListener(this);
        }
    }

    public NameSpace(NameSpace nameSpace, String str) {
        this(nameSpace, null, str);
    }

    private Class classForName(String str) {
        return getClassManager().classForName(str);
    }

    private String[] enumerationToStringArray(Enumeration enumeration) {
        Vector vector = new Vector();
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return strArr;
    }

    private BshMethod[] flattenMethodCollection(Enumeration enumeration) {
        Vector vector = new Vector();
        while (enumeration.hasMoreElements()) {
            Object nextElement = enumeration.nextElement();
            if (nextElement instanceof BshMethod) {
                vector.addElement(nextElement);
            } else {
                Vector vector2 = (Vector) nextElement;
                for (int i = 0; i < vector2.size(); i++) {
                    vector.addElement(vector2.elementAt(i));
                }
            }
        }
        BshMethod[] bshMethodArr = new BshMethod[vector.size()];
        vector.copyInto(bshMethodArr);
        return bshMethodArr;
    }

    private Class getClassImpl(String str) {
        Class cls;
        Hashtable hashtable = this.classCache;
        if (hashtable != null) {
            cls = (Class) hashtable.get(str);
            if (cls != null) {
                return cls;
            }
        } else {
            cls = null;
        }
        boolean z = !Name.isCompound(str);
        if (z) {
            if (cls == null) {
                cls = getImportedClassImpl(str);
            }
            if (cls != null) {
                cacheClass(str, cls);
                return cls;
            }
        }
        Class classForName = classForName(str);
        if (classForName != null) {
            if (z) {
                cacheClass(str, classForName);
            }
            return classForName;
        }
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("getClass(): ");
            stringBuffer.append(str);
            stringBuffer.append(" not\tfound in ");
            stringBuffer.append(this);
            Interpreter.debug(stringBuffer.toString());
        }
        return null;
    }

    private Class getImportedClassImpl(String str) {
        String classNameByUnqName;
        Hashtable hashtable = this.importedClasses;
        String str2 = hashtable != null ? (String) hashtable.get(str) : null;
        if (str2 != null) {
            Class classForName = classForName(str2);
            if (classForName != null) {
                return classForName;
            }
            if (Name.isCompound(str2)) {
                try {
                    classForName = getNameResolver(str2).toClass();
                } catch (ClassNotFoundException unused) {
                }
            } else if (Interpreter.DEBUG) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("imported unpackaged name not found:");
                stringBuffer.append(str2);
                Interpreter.debug(stringBuffer.toString());
            }
            if (classForName == null) {
                return null;
            }
            getClassManager().cacheClassInfo(str2, classForName);
            return classForName;
        }
        Vector vector = this.importedPackages;
        if (vector != null) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append((String) this.importedPackages.elementAt(size));
                stringBuffer2.append(".");
                stringBuffer2.append(str);
                Class classForName2 = classForName(stringBuffer2.toString());
                if (classForName2 != null) {
                    return classForName2;
                }
            }
        }
        BshClassManager classManager2 = getClassManager();
        if (!classManager2.hasSuperImport() || (classNameByUnqName = classManager2.getClassNameByUnqName(str)) == null) {
            return null;
        }
        return classForName(classNameByUnqName);
    }

    public static Class identifierToClass(ClassIdentifier classIdentifier) {
        return classIdentifier.getTargetClass();
    }

    private BshMethod loadScriptedCommand(InputStream inputStream, String str, Class[] clsArr, String str2, Interpreter interpreter) {
        try {
            interpreter.eval(new InputStreamReader(inputStream), this, str2);
            return getMethod(str, clsArr);
        } catch (EvalError e) {
            Interpreter.debug(e.toString());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Error loading script: ");
            stringBuffer.append(e.getMessage());
            throw new UtilEvalError(stringBuffer.toString());
        }
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        this.names = null;
        objectOutputStream.defaultWriteObject();
    }

    @Override // bsh.NameSource
    public void addNameSourceListener(NameSource.Listener listener) {
        if (this.nameSourceListeners == null) {
            this.nameSourceListeners = new Vector();
        }
        this.nameSourceListeners.addElement(listener);
    }

    /* access modifiers changed from: package-private */
    public void cacheClass(String str, Class cls) {
        if (this.classCache == null) {
            this.classCache = new Hashtable();
        }
        this.classCache.put(str, cls);
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        nameSpaceChanged();
    }

    public void clear() {
        this.variables = null;
        this.methods = null;
        this.importedClasses = null;
        this.importedPackages = null;
        this.importedCommands = null;
        this.importedObjects = null;
        if (this.parent == null) {
            loadDefaultImports();
        }
        this.classCache = null;
        this.names = null;
    }

    public void doSuperImport() {
        getClassManager().doSuperImport();
    }

    public Object get(String str, Interpreter interpreter) {
        return getNameResolver(str).toObject(new CallStack(this), interpreter);
    }

    @Override // bsh.NameSource
    public String[] getAllNames() {
        Vector vector = new Vector();
        getAllNamesAux(vector);
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return strArr;
    }

    /* access modifiers changed from: protected */
    public void getAllNamesAux(Vector vector) {
        Enumeration keys = this.variables.keys();
        while (keys.hasMoreElements()) {
            vector.addElement(keys.nextElement());
        }
        Enumeration keys2 = this.methods.keys();
        while (keys2.hasMoreElements()) {
            vector.addElement(keys2.nextElement());
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            nameSpace.getAllNamesAux(vector);
        }
    }

    public Class getClass(String str) {
        Class classImpl = getClassImpl(str);
        if (classImpl != null) {
            return classImpl;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getClass(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Object getClassInstance() {
        Object obj = this.classInstance;
        if (obj != null) {
            return obj;
        }
        if (this.classStatic != null) {
            throw new UtilEvalError("Can't refer to class instance from static context.");
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Can't resolve class instance 'this' in: ");
        stringBuffer.append(this);
        throw new InterpreterError(stringBuffer.toString());
    }

    public BshClassManager getClassManager() {
        BshClassManager bshClassManager = this.classManager;
        if (bshClassManager != null) {
            return bshClassManager;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null && nameSpace != JAVACODE) {
            return nameSpace.getClassManager();
        }
        System.out.println("experiment: creating class manager");
        BshClassManager createClassManager = BshClassManager.createClassManager(null);
        this.classManager = createClassManager;
        return createClassManager;
    }

    public Object getCommand(String str, Class[] clsArr, Interpreter interpreter) {
        StringBuffer stringBuffer;
        String str2;
        if (Interpreter.DEBUG) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("getCommand: ");
            stringBuffer2.append(str);
            Interpreter.debug(stringBuffer2.toString());
        }
        BshClassManager classManager2 = interpreter.getClassManager();
        Vector vector = this.importedCommands;
        if (vector != null) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                String str3 = (String) this.importedCommands.elementAt(size);
                if (str3.equals("/")) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(str3);
                } else {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(str3);
                    stringBuffer.append("/");
                }
                stringBuffer.append(str);
                stringBuffer.append(".bsh");
                String stringBuffer3 = stringBuffer.toString();
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("searching for script: ");
                stringBuffer4.append(stringBuffer3);
                Interpreter.debug(stringBuffer4.toString());
                InputStream resourceAsStream = classManager2.getResourceAsStream(stringBuffer3);
                if (resourceAsStream != null) {
                    return loadScriptedCommand(resourceAsStream, str, clsArr, stringBuffer3, interpreter);
                }
                if (str3.equals("/")) {
                    str2 = str;
                } else {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(str3.substring(1).replace('/', '.'));
                    stringBuffer5.append(".");
                    stringBuffer5.append(str);
                    str2 = stringBuffer5.toString();
                }
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("searching for class: ");
                stringBuffer6.append(str2);
                Interpreter.debug(stringBuffer6.toString());
                Class classForName = classManager2.classForName(str2);
                if (classForName != null) {
                    return classForName;
                }
            }
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getCommand(str, clsArr, interpreter);
        }
        return null;
    }

    public Variable[] getDeclaredVariables() {
        Hashtable hashtable = this.variables;
        int i = 0;
        if (hashtable == null) {
            return new Variable[0];
        }
        Variable[] variableArr = new Variable[hashtable.size()];
        Enumeration elements = this.variables.elements();
        while (elements.hasMoreElements()) {
            variableArr[i] = (Variable) elements.nextElement();
            i++;
        }
        return variableArr;
    }

    public This getGlobal(Interpreter interpreter) {
        NameSpace nameSpace = this.parent;
        return nameSpace != null ? nameSpace.getGlobal(interpreter) : getThis(interpreter);
    }

    /* access modifiers changed from: protected */
    public BshMethod getImportedMethod(String str, Class[] clsArr) {
        if (this.importedObjects != null) {
            for (int i = 0; i < this.importedObjects.size(); i++) {
                Object elementAt = this.importedObjects.elementAt(i);
                Method resolveJavaMethod = Reflect.resolveJavaMethod(getClassManager(), elementAt.getClass(), str, clsArr, false);
                if (resolveJavaMethod != null) {
                    return new BshMethod(resolveJavaMethod, elementAt);
                }
            }
        }
        if (this.importedStatic != null) {
            for (int i2 = 0; i2 < this.importedStatic.size(); i2++) {
                Method resolveJavaMethod2 = Reflect.resolveJavaMethod(getClassManager(), (Class) this.importedStatic.elementAt(i2), str, clsArr, true);
                if (resolveJavaMethod2 != null) {
                    return new BshMethod(resolveJavaMethod2, null);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Variable getImportedVar(String str) {
        if (this.importedObjects != null) {
            for (int i = 0; i < this.importedObjects.size(); i++) {
                Object elementAt = this.importedObjects.elementAt(i);
                Field resolveJavaField = Reflect.resolveJavaField(elementAt.getClass(), str, false);
                if (resolveJavaField != null) {
                    return new Variable(str, resolveJavaField.getType(), new LHS(elementAt, resolveJavaField));
                }
            }
        }
        if (this.importedStatic == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.importedStatic.size(); i2++) {
            Field resolveJavaField2 = Reflect.resolveJavaField((Class) this.importedStatic.elementAt(i2), str, true);
            if (resolveJavaField2 != null) {
                return new Variable(str, resolveJavaField2.getType(), new LHS(resolveJavaField2));
            }
        }
        return null;
    }

    public int getInvocationLine() {
        SimpleNode node = getNode();
        if (node != null) {
            return node.getLineNumber();
        }
        return -1;
    }

    public String getInvocationText() {
        SimpleNode node = getNode();
        return node != null ? node.getText() : "<invoked from Java code>";
    }

    public BshMethod getMethod(String str, Class[] clsArr) {
        return getMethod(str, clsArr, false);
    }

    public BshMethod getMethod(String str, Class[] clsArr, boolean z) {
        NameSpace nameSpace;
        Hashtable hashtable;
        Object obj;
        BshMethod[] bshMethodArr;
        BshMethod importedMethod = (!this.isClass || z) ? null : getImportedMethod(str, clsArr);
        if (!(importedMethod != null || (hashtable = this.methods) == null || (obj = hashtable.get(str)) == null)) {
            if (obj instanceof Vector) {
                Vector vector = (Vector) obj;
                bshMethodArr = new BshMethod[vector.size()];
                vector.copyInto(bshMethodArr);
            } else {
                bshMethodArr = new BshMethod[]{(BshMethod) obj};
            }
            Class[][] clsArr2 = new Class[bshMethodArr.length][];
            for (int i = 0; i < bshMethodArr.length; i++) {
                clsArr2[i] = bshMethodArr[i].getParameterTypes();
            }
            int findMostSpecificSignature = Reflect.findMostSpecificSignature(clsArr, clsArr2);
            if (findMostSpecificSignature != -1) {
                importedMethod = bshMethodArr[findMostSpecificSignature];
            }
        }
        if (importedMethod == null && !this.isClass && !z) {
            importedMethod = getImportedMethod(str, clsArr);
        }
        return (z || importedMethod != null || (nameSpace = this.parent) == null) ? importedMethod : nameSpace.getMethod(str, clsArr);
    }

    public String[] getMethodNames() {
        Hashtable hashtable = this.methods;
        return hashtable == null ? new String[0] : enumerationToStringArray(hashtable.keys());
    }

    public BshMethod[] getMethods() {
        Hashtable hashtable = this.methods;
        return hashtable == null ? new BshMethod[0] : flattenMethodCollection(hashtable.elements());
    }

    public String getName() {
        return this.nsName;
    }

    /* access modifiers changed from: package-private */
    public Name getNameResolver(String str) {
        if (this.names == null) {
            this.names = new Hashtable();
        }
        Name name = (Name) this.names.get(str);
        if (name != null) {
            return name;
        }
        Name name2 = new Name(this, str);
        this.names.put(str, name2);
        return name2;
    }

    /* access modifiers changed from: package-private */
    public SimpleNode getNode() {
        SimpleNode simpleNode = this.callerInfoNode;
        if (simpleNode != null) {
            return simpleNode;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getNode();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String getPackage() {
        String str = this.packageName;
        if (str != null) {
            return str;
        }
        NameSpace nameSpace = this.parent;
        if (nameSpace != null) {
            return nameSpace.getPackage();
        }
        return null;
    }

    public NameSpace getParent() {
        return this.parent;
    }

    public This getSuper(Interpreter interpreter) {
        NameSpace nameSpace = this.parent;
        return nameSpace != null ? nameSpace.getThis(interpreter) : getThis(interpreter);
    }

    /* access modifiers changed from: package-private */
    public This getThis(Interpreter interpreter) {
        if (this.thisReference == null) {
            this.thisReference = This.getThis(this, interpreter);
        }
        return this.thisReference;
    }

    public Object getVariable(String str) {
        return getVariable(str, true);
    }

    public Object getVariable(String str, boolean z) {
        return unwrapVariable(getVariableImpl(str, z));
    }

    /* access modifiers changed from: protected */
    public Variable getVariableImpl(String str, boolean z) {
        NameSpace nameSpace;
        Hashtable hashtable;
        Variable importedVar = this.isClass ? getImportedVar(str) : null;
        if (importedVar == null && (hashtable = this.variables) != null) {
            importedVar = (Variable) hashtable.get(str);
        }
        if (importedVar == null && !this.isClass) {
            importedVar = getImportedVar(str);
        }
        return (!z || importedVar != null || (nameSpace = this.parent) == null) ? importedVar : nameSpace.getVariableImpl(str, z);
    }

    public String[] getVariableNames() {
        Hashtable hashtable = this.variables;
        return hashtable == null ? new String[0] : enumerationToStringArray(hashtable.keys());
    }

    public void importClass(String str) {
        if (this.importedClasses == null) {
            this.importedClasses = new Hashtable();
        }
        this.importedClasses.put(Name.suffix(str, 1), str);
        nameSpaceChanged();
    }

    public void importCommands(String str) {
        if (this.importedCommands == null) {
            this.importedCommands = new Vector();
        }
        String replace = str.replace('.', '/');
        if (!replace.startsWith("/")) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("/");
            stringBuffer.append(replace);
            replace = stringBuffer.toString();
        }
        if (replace.length() > 1 && replace.endsWith("/")) {
            replace = replace.substring(0, replace.length() - 1);
        }
        if (this.importedCommands.contains(replace)) {
            this.importedCommands.remove(replace);
        }
        this.importedCommands.addElement(replace);
        nameSpaceChanged();
    }

    public void importObject(Object obj) {
        if (this.importedObjects == null) {
            this.importedObjects = new Vector();
        }
        if (this.importedObjects.contains(obj)) {
            this.importedObjects.remove(obj);
        }
        this.importedObjects.addElement(obj);
        nameSpaceChanged();
    }

    public void importPackage(String str) {
        if (this.importedPackages == null) {
            this.importedPackages = new Vector();
        }
        if (this.importedPackages.contains(str)) {
            this.importedPackages.remove(str);
        }
        this.importedPackages.addElement(str);
        nameSpaceChanged();
    }

    public void importStatic(Class cls) {
        if (this.importedStatic == null) {
            this.importedStatic = new Vector();
        }
        if (this.importedStatic.contains(cls)) {
            this.importedStatic.remove(cls);
        }
        this.importedStatic.addElement(cls);
        nameSpaceChanged();
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter) {
        return invokeMethod(str, objArr, interpreter, null, null);
    }

    public Object invokeMethod(String str, Object[] objArr, Interpreter interpreter, CallStack callStack, SimpleNode simpleNode) {
        return getThis(interpreter).invokeMethod(str, objArr, interpreter, callStack, simpleNode, false);
    }

    public void loadDefaultImports() {
        importClass("bsh.EvalError");
        importClass("bsh.Interpreter");
        importPackage("javax.swing.event");
        importPackage("javax.swing");
        importPackage("java.awt.event");
        importPackage("java.awt");
        importPackage("java.net");
        importPackage("java.util");
        importPackage("java.io");
        importPackage("java.lang");
        importCommands("/bsh/commands");
    }

    public void nameSpaceChanged() {
        this.classCache = null;
        this.names = null;
    }

    public void prune() {
        if (this.classManager == null) {
            setClassManager(BshClassManager.createClassManager(null));
        }
        setParent(null);
    }

    /* access modifiers changed from: package-private */
    public void setClassInstance(Object obj) {
        this.classInstance = obj;
        importObject(obj);
    }

    /* access modifiers changed from: package-private */
    public void setClassManager(BshClassManager bshClassManager) {
        this.classManager = bshClassManager;
    }

    /* access modifiers changed from: package-private */
    public void setClassStatic(Class cls) {
        this.classStatic = cls;
        importStatic(cls);
    }

    /* access modifiers changed from: package-private */
    public void setLocalVariable(String str, Object obj, boolean z) {
        setVariable(str, obj, z, false);
    }

    public void setMethod(String str, BshMethod bshMethod) {
        if (this.methods == null) {
            this.methods = new Hashtable();
        }
        Object obj = this.methods.get(str);
        if (obj == null) {
            this.methods.put(str, bshMethod);
        } else if (obj instanceof BshMethod) {
            Vector vector = new Vector();
            vector.addElement(obj);
            vector.addElement(bshMethod);
            this.methods.put(str, vector);
        } else {
            ((Vector) obj).addElement(bshMethod);
        }
    }

    public void setName(String str) {
        this.nsName = str;
    }

    /* access modifiers changed from: package-private */
    public void setNode(SimpleNode simpleNode) {
        this.callerInfoNode = simpleNode;
    }

    /* access modifiers changed from: package-private */
    public void setPackage(String str) {
        this.packageName = str;
    }

    public void setParent(NameSpace nameSpace) {
        this.parent = nameSpace;
        if (nameSpace == null) {
            loadDefaultImports();
        }
    }

    public void setTypedVariable(String str, Class cls, Object obj, Modifiers modifiers) {
        if (this.variables == null) {
            this.variables = new Hashtable();
        }
        Variable variableImpl = getVariableImpl(str, false);
        if (variableImpl == null || variableImpl.getType() == null) {
            this.variables.put(str, new Variable(str, cls, obj, modifiers));
        } else if (variableImpl.getType() == cls) {
            variableImpl.setValue(obj, 0);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Typed variable: ");
            stringBuffer.append(str);
            stringBuffer.append(" was previously declared with type: ");
            stringBuffer.append(variableImpl.getType());
            throw new UtilEvalError(stringBuffer.toString());
        }
    }

    public void setTypedVariable(String str, Class cls, Object obj, boolean z) {
        Modifiers modifiers = new Modifiers();
        if (z) {
            modifiers.addModifier(2, "final");
        }
        setTypedVariable(str, cls, obj, modifiers);
    }

    public void setVariable(String str, Object obj, boolean z) {
        setVariable(str, obj, z, Interpreter.LOCALSCOPING ? z : true);
    }

    /* access modifiers changed from: package-private */
    public void setVariable(String str, Object obj, boolean z, boolean z2) {
        if (this.variables == null) {
            this.variables = new Hashtable();
        }
        if (obj != null) {
            Variable variableImpl = getVariableImpl(str, z2);
            if (variableImpl != null) {
                try {
                    variableImpl.setValue(obj, 1);
                } catch (UtilEvalError e) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Variable assignment: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(e.getMessage());
                    throw new UtilEvalError(stringBuffer.toString());
                }
            } else if (!z) {
                this.variables.put(str, new Variable(str, obj, (Modifiers) null));
                nameSpaceChanged();
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("(Strict Java mode) Assignment to undeclared variable: ");
                stringBuffer2.append(str);
                throw new UtilEvalError(stringBuffer2.toString());
            }
        } else {
            throw new InterpreterError("null variable value");
        }
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NameSpace: ");
        if (this.nsName == null) {
            str = super.toString();
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.nsName);
            stringBuffer2.append(" (");
            stringBuffer2.append(super.toString());
            stringBuffer2.append(")");
            str = stringBuffer2.toString();
        }
        stringBuffer.append(str);
        String str2 = "";
        stringBuffer.append(this.isClass ? " (isClass) " : str2);
        stringBuffer.append(this.isMethod ? " (method) " : str2);
        stringBuffer.append(this.classStatic != null ? " (class static) " : str2);
        if (this.classInstance != null) {
            str2 = " (class instance) ";
        }
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public void unsetVariable(String str) {
        Hashtable hashtable = this.variables;
        if (hashtable != null) {
            hashtable.remove(str);
            nameSpaceChanged();
        }
    }

    /* access modifiers changed from: protected */
    public Object unwrapVariable(Variable variable) {
        return variable == null ? Primitive.VOID : variable.getValue();
    }
}
