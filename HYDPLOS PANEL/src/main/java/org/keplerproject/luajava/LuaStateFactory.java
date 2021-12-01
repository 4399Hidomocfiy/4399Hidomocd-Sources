package org.keplerproject.luajava;

import java.util.ArrayList;
import java.util.List;

public final class LuaStateFactory {
    private static final String LUAJAVA_LIB = "luajava";

    /* renamed from: a */
    public static byte[] f3602a;
    private static final boolean isLuaLibLoaded;
    private static final List<Object> states = new ArrayList();

    static {
        boolean z;
        try {
            System.loadLibrary(LUAJAVA_LIB);
            z = true;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            z = false;
        }
        isLuaLibLoaded = z;
    }

    private LuaStateFactory() {
    }

    public static synchronized LuaState getExistingState(int i) {
        LuaState luaState;
        synchronized (LuaStateFactory.class) {
            luaState = (LuaState) states.get(i);
        }
        return luaState;
    }

    private static synchronized int getNextStateIndex() {
        int i;
        synchronized (LuaStateFactory.class) {
            i = 0;
            while (true) {
                List<Object> list = states;
                if (i < list.size() && list.get(i) != null) {
                    i++;
                }
            }
        }
        return i;
    }

    public static synchronized int insertLuaState(LuaState luaState) {
        synchronized (LuaStateFactory.class) {
            int i = 0;
            while (true) {
                List<Object> list = states;
                if (i < list.size()) {
                    LuaState luaState2 = (LuaState) list.get(i);
                    if (luaState2 != null && luaState2.getCPtrPeer() == luaState.getCPtrPeer()) {
                        return i;
                    }
                    i++;
                } else {
                    int nextStateIndex = getNextStateIndex();
                    list.set(nextStateIndex, luaState);
                    return nextStateIndex;
                }
            }
        }
    }

    public static synchronized LuaState newLuaState() {
        synchronized (LuaStateFactory.class) {
            if (!isLuaLibLoaded) {
                return null;
            }
            int nextStateIndex = getNextStateIndex();
            LuaState luaState = new LuaState(nextStateIndex);
            states.add(nextStateIndex, luaState);
            return luaState;
        }
    }

    public static synchronized void removeLuaState(int i) {
        synchronized (LuaStateFactory.class) {
            states.add(i, null);
        }
    }
}
