package bsh.classpath;

import bsh.BshClassManager;
import bsh.classpath.BshClassPath;
import java.util.HashMap;

public class DiscreteFilesClassLoader extends BshClassLoader {
    ClassSourceMap map;

    public static class ClassSourceMap extends HashMap {
        public BshClassPath.ClassSource get(String str) {
            return (BshClassPath.ClassSource) super.get((Object) str);
        }

        public void put(String str, BshClassPath.ClassSource classSource) {
            super.put((Object) str, (Object) classSource);
        }
    }

    public DiscreteFilesClassLoader(BshClassManager bshClassManager, ClassSourceMap classSourceMap) {
        super(bshClassManager);
        this.map = classSourceMap;
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader, bsh.classpath.BshClassLoader
    public Class findClass(String str) {
        BshClassPath.ClassSource classSource = this.map.get(str);
        if (classSource == null) {
            return super.findClass(str);
        }
        byte[] code = classSource.getCode(str);
        return defineClass(str, code, 0, code.length);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("for files: ");
        stringBuffer.append(this.map);
        return stringBuffer.toString();
    }
}
