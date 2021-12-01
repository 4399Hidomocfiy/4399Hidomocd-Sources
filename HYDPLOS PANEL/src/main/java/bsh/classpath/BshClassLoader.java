package bsh.classpath;

import bsh.BshClassManager;
import java.net.URL;
import java.net.URLClassLoader;

public class BshClassLoader extends URLClassLoader {
    static /* synthetic */ Class class$bsh$Interpreter;
    BshClassManager classManager;

    protected BshClassLoader(BshClassManager bshClassManager) {
        this(bshClassManager, new URL[0]);
    }

    public BshClassLoader(BshClassManager bshClassManager, BshClassPath bshClassPath) {
        this(bshClassManager, bshClassPath.getPathComponents());
    }

    public BshClassLoader(BshClassManager bshClassManager, URL[] urlArr) {
        super(urlArr);
        this.classManager = bshClassManager;
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void addURL(URL url) {
        super.addURL(url);
    }

    /* access modifiers changed from: protected */
    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) {
        ClassManagerImpl classManagerImpl = (ClassManagerImpl) getClassManager();
        ClassLoader loaderForClass = classManagerImpl.getLoaderForClass(str);
        if (loaderForClass == null || loaderForClass == this) {
            if (getURLs().length > 0) {
                try {
                    return super.findClass(str);
                } catch (ClassNotFoundException unused) {
                }
            }
            ClassLoader baseLoader = classManagerImpl.getBaseLoader();
            if (!(baseLoader == null || baseLoader == this)) {
                try {
                    return baseLoader.loadClass(str);
                } catch (ClassNotFoundException unused2) {
                }
            }
            return classManagerImpl.plainClassForName(str);
        }
        try {
            return loaderForClass.loadClass(str);
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Designated loader could not find class: ");
            stringBuffer.append(e);
            throw new ClassNotFoundException(stringBuffer.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public BshClassManager getClassManager() {
        return this.classManager;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|(5:5|6|(1:8)|9|10)|11|12|(2:(1:16)|17)(2:18|19)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    @Override // java.lang.ClassLoader
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Class loadClass(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.findLoadedClass(r3)
            if (r0 == 0) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r1 = "bsh"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L_0x0024
            java.lang.Class r1 = bsh.classpath.BshClassLoader.class$bsh$Interpreter     // Catch:{ ClassNotFoundException -> 0x0024 }
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = "bsh.Interpreter"
            java.lang.Class r1 = class$(r1)     // Catch:{ ClassNotFoundException -> 0x0024 }
            bsh.classpath.BshClassLoader.class$bsh$Interpreter = r1     // Catch:{ ClassNotFoundException -> 0x0024 }
        L_0x001b:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.Class r3 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x0024 }
            return r3
        L_0x0024:
            java.lang.Class r0 = r2.findClass(r3)     // Catch:{ ClassNotFoundException -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            if (r4 == 0) goto L_0x0031
            r2.resolveClass(r0)
        L_0x0031:
            return r0
        L_0x0032:
            java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException
            java.lang.String r4 = "here in loaClass"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.classpath.BshClassLoader.loadClass(java.lang.String, boolean):java.lang.Class");
    }
}
