package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0022a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: c */
    static final Map<Class, C0020a> f75c = new HashMap();

    /* renamed from: a */
    private final Object f76a;

    /* renamed from: b */
    private final C0020a f77b;

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$a */
    public static class C0020a {

        /* renamed from: a */
        final Map<AbstractC0022a.EnumC0023a, List<C0021b>> f78a = new HashMap();

        /* renamed from: b */
        final Map<C0021b, AbstractC0022a.EnumC0023a> f79b;

        C0020a(Map<C0021b, AbstractC0022a.EnumC0023a> map) {
            this.f79b = map;
            for (Map.Entry<C0021b, AbstractC0022a.EnumC0023a> entry : map.entrySet()) {
                AbstractC0022a.EnumC0023a value = entry.getValue();
                List<C0021b> list = this.f78a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f78a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.ReflectiveGenericLifecycleObserver$b */
    public static class C0021b {

        /* renamed from: a */
        final int f80a;

        /* renamed from: b */
        final Method f81b;

        C0021b(int i, Method method) {
            this.f80a = i;
            this.f81b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0021b.class != obj.getClass()) {
                return false;
            }
            C0021b bVar = (C0021b) obj;
            return this.f80a == bVar.f80a && this.f81b.getName().equals(bVar.f81b.getName());
        }

        public int hashCode() {
            return (this.f80a * 31) + this.f81b.getName().hashCode();
        }
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f76a = obj;
        this.f77b = m13c(obj.getClass());
    }

    /* renamed from: b */
    private static C0020a m12b(Class cls) {
        int i;
        C0020a c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = m13c(superclass)) == null)) {
            hashMap.putAll(c.f79b);
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0021b, AbstractC0022a.EnumC0023a> entry : m13c(cls2).f79b.entrySet()) {
                m17g(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        for (Method method : declaredMethods) {
            AbstractC0030e eVar = (AbstractC0030e) method.getAnnotation(AbstractC0030e.class);
            if (eVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(AbstractC0025b.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                AbstractC0022a.EnumC0023a value = eVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0022a.EnumC0023a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == AbstractC0022a.EnumC0023a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m17g(hashMap, new C0021b(i, method), value, cls);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0020a aVar = new C0020a(hashMap);
        f75c.put(cls, aVar);
        return aVar;
    }

    /* renamed from: c */
    private static C0020a m13c(Class cls) {
        C0020a aVar = f75c.get(cls);
        return aVar != null ? aVar : m12b(cls);
    }

    /* renamed from: d */
    private void m14d(C0021b bVar, AbstractC0025b bVar2, AbstractC0022a.EnumC0023a aVar) {
        try {
            int i = bVar.f80a;
            if (i == 0) {
                bVar.f81b.invoke(this.f76a, new Object[0]);
            } else if (i == 1) {
                bVar.f81b.invoke(this.f76a, bVar2);
            } else if (i == 2) {
                bVar.f81b.invoke(this.f76a, bVar2, aVar);
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Failed to call observer method", e.getCause());
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: e */
    private void m15e(C0020a aVar, AbstractC0025b bVar, AbstractC0022a.EnumC0023a aVar2) {
        m16f(aVar.f78a.get(aVar2), bVar, aVar2);
        m16f(aVar.f78a.get(AbstractC0022a.EnumC0023a.ON_ANY), bVar, aVar2);
    }

    /* renamed from: f */
    private void m16f(List<C0021b> list, AbstractC0025b bVar, AbstractC0022a.EnumC0023a aVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                m14d(list.get(size), bVar, aVar);
            }
        }
    }

    /* renamed from: g */
    private static void m17g(Map<C0021b, AbstractC0022a.EnumC0023a> map, C0021b bVar, AbstractC0022a.EnumC0023a aVar, Class cls) {
        AbstractC0022a.EnumC0023a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f81b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous" + " value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a */
    public void mo17a(AbstractC0025b bVar, AbstractC0022a.EnumC0023a aVar) {
        m15e(this.f77b, bVar, aVar);
    }
}
