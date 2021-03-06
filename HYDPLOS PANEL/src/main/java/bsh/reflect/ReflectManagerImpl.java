package bsh.reflect;

import bsh.ReflectManager;
import java.lang.reflect.AccessibleObject;

public class ReflectManagerImpl extends ReflectManager {
    @Override // bsh.ReflectManager
    public boolean setAccessible(Object obj) {
        if (!(obj instanceof AccessibleObject)) {
            return false;
        }
        ((AccessibleObject) obj).setAccessible(true);
        return true;
    }
}
