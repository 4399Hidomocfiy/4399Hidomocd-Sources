package p013b.p050d.p051a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p013b.p050d.p051a.AbstractC0918a;

/* renamed from: b.d.a.c */
public final class C0921c extends AbstractC0918a {

    /* renamed from: b */
    private ArrayList<AbstractC0918a> f1978b = new ArrayList<>();

    /* renamed from: c */
    private HashMap<AbstractC0918a, C0927f> f1979c = new HashMap<>();

    /* renamed from: d */
    private ArrayList<C0927f> f1980d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<C0927f> f1981e = new ArrayList<>();

    /* renamed from: f */
    private boolean f1982f = true;

    /* renamed from: g */
    private C0923b f1983g = null;

    /* renamed from: h */
    boolean f1984h = false;

    /* renamed from: i */
    private boolean f1985i = false;

    /* renamed from: j */
    private long f1986j = 0;

    /* renamed from: k */
    private C0954m f1987k = null;

    /* access modifiers changed from: package-private */
    /* renamed from: b.d.a.c$a */
    public class C0922a extends AbstractC0920b {

        /* renamed from: a */
        boolean f1988a = false;

        /* renamed from: b */
        final /* synthetic */ ArrayList f1989b;

        C0922a(ArrayList arrayList) {
            this.f1989b = arrayList;
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            if (!this.f1988a) {
                int size = this.f1989b.size();
                for (int i = 0; i < size; i++) {
                    C0927f fVar = (C0927f) this.f1989b.get(i);
                    fVar.f2000a.mo9120j();
                    C0921c.this.f1978b.add(fVar.f2000a);
                }
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0920b, p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
            this.f1988a = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.d.a.c$b */
    public class C0923b implements AbstractC0918a.AbstractC0919a {

        /* renamed from: a */
        private C0921c f1991a;

        C0923b(C0921c cVar) {
            this.f1991a = cVar;
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            aVar.mo9116f(this);
            C0921c.this.f1978b.remove(aVar);
            boolean z = true;
            ((C0927f) this.f1991a.f1979c.get(aVar)).f2005f = true;
            if (!C0921c.this.f1984h) {
                ArrayList arrayList = this.f1991a.f1981e;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (!((C0927f) arrayList.get(i)).f2005f) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    ArrayList<AbstractC0918a.AbstractC0919a> arrayList2 = C0921c.this.f1977a;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = (ArrayList) arrayList2.clone();
                        int size2 = arrayList3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((AbstractC0918a.AbstractC0919a) arrayList3.get(i2)).mo9121a(this.f1991a);
                        }
                    }
                    this.f1991a.f1985i = false;
                }
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: b */
        public void mo9122b(AbstractC0918a aVar) {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: c */
        public void mo9123c(AbstractC0918a aVar) {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
            ArrayList<AbstractC0918a.AbstractC0919a> arrayList;
            C0921c cVar = C0921c.this;
            if (!(cVar.f1984h || cVar.f1978b.size() != 0 || (arrayList = C0921c.this.f1977a) == null)) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0921c.this.f1977a.get(i).mo9124d(this.f1991a);
                }
            }
        }
    }

    /* renamed from: b.d.a.c$c */
    public class C0924c {

        /* renamed from: a */
        private C0927f f1993a;

        C0924c(AbstractC0918a aVar) {
            C0927f fVar = (C0927f) C0921c.this.f1979c.get(aVar);
            this.f1993a = fVar;
            if (fVar == null) {
                this.f1993a = new C0927f(aVar);
                C0921c.this.f1979c.put(aVar, this.f1993a);
                C0921c.this.f1980d.add(this.f1993a);
            }
        }

        /* renamed from: a */
        public C0924c mo9131a(AbstractC0918a aVar) {
            C0927f fVar = (C0927f) C0921c.this.f1979c.get(aVar);
            if (fVar == null) {
                fVar = new C0927f(aVar);
                C0921c.this.f1979c.put(aVar, fVar);
                C0921c.this.f1980d.add(fVar);
            }
            fVar.mo9133a(new C0925d(this.f1993a, 1));
            return this;
        }

        /* renamed from: b */
        public C0924c mo9132b(AbstractC0918a aVar) {
            C0927f fVar = (C0927f) C0921c.this.f1979c.get(aVar);
            if (fVar == null) {
                fVar = new C0927f(aVar);
                C0921c.this.f1979c.put(aVar, fVar);
                C0921c.this.f1980d.add(fVar);
            }
            fVar.mo9133a(new C0925d(this.f1993a, 0));
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.d.a.c$d */
    public static class C0925d {

        /* renamed from: a */
        public C0927f f1995a;

        /* renamed from: b */
        public int f1996b;

        public C0925d(C0927f fVar, int i) {
            this.f1995a = fVar;
            this.f1996b = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.d.a.c$e */
    public static class C0926e implements AbstractC0918a.AbstractC0919a {

        /* renamed from: a */
        private C0921c f1997a;

        /* renamed from: b */
        private C0927f f1998b;

        /* renamed from: c */
        private int f1999c;

        public C0926e(C0921c cVar, C0927f fVar, int i) {
            this.f1997a = cVar;
            this.f1998b = fVar;
            this.f1999c = i;
        }

        /* renamed from: e */
        private void m2519e(AbstractC0918a aVar) {
            if (!this.f1997a.f1984h) {
                C0925d dVar = null;
                int size = this.f1998b.f2002c.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C0925d dVar2 = this.f1998b.f2002c.get(i);
                    if (dVar2.f1996b == this.f1999c && dVar2.f1995a.f2000a == aVar) {
                        aVar.mo9116f(this);
                        dVar = dVar2;
                        break;
                    }
                    i++;
                }
                this.f1998b.f2002c.remove(dVar);
                if (this.f1998b.f2002c.size() == 0) {
                    this.f1998b.f2000a.mo9120j();
                    this.f1997a.f1978b.add(this.f1998b.f2000a);
                }
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: a */
        public void mo9121a(AbstractC0918a aVar) {
            if (this.f1999c == 1) {
                m2519e(aVar);
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: b */
        public void mo9122b(AbstractC0918a aVar) {
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: c */
        public void mo9123c(AbstractC0918a aVar) {
            if (this.f1999c == 0) {
                m2519e(aVar);
            }
        }

        @Override // p013b.p050d.p051a.AbstractC0918a.AbstractC0919a
        /* renamed from: d */
        public void mo9124d(AbstractC0918a aVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.d.a.c$f */
    public static class C0927f implements Cloneable {

        /* renamed from: a */
        public AbstractC0918a f2000a;

        /* renamed from: b */
        public ArrayList<C0925d> f2001b = null;

        /* renamed from: c */
        public ArrayList<C0925d> f2002c = null;

        /* renamed from: d */
        public ArrayList<C0927f> f2003d = null;

        /* renamed from: e */
        public ArrayList<C0927f> f2004e = null;

        /* renamed from: f */
        public boolean f2005f = false;

        public C0927f(AbstractC0918a aVar) {
            this.f2000a = aVar;
        }

        /* renamed from: a */
        public void mo9133a(C0925d dVar) {
            if (this.f2001b == null) {
                this.f2001b = new ArrayList<>();
                this.f2003d = new ArrayList<>();
            }
            this.f2001b.add(dVar);
            if (!this.f2003d.contains(dVar.f1995a)) {
                this.f2003d.add(dVar.f1995a);
            }
            C0927f fVar = dVar.f1995a;
            if (fVar.f2004e == null) {
                fVar.f2004e = new ArrayList<>();
            }
            fVar.f2004e.add(this);
        }

        /* renamed from: b */
        public C0927f clone() {
            try {
                C0927f fVar = (C0927f) super.clone();
                fVar.f2000a = this.f2000a.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: v */
    private void m2497v() {
        if (this.f1982f) {
            this.f1981e.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.f1980d.size();
            for (int i = 0; i < size; i++) {
                C0927f fVar = this.f1980d.get(i);
                ArrayList<C0925d> arrayList2 = fVar.f2001b;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    arrayList.add(fVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C0927f fVar2 = (C0927f) arrayList.get(i2);
                    this.f1981e.add(fVar2);
                    ArrayList<C0927f> arrayList4 = fVar2.f2004e;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            C0927f fVar3 = fVar2.f2004e.get(i3);
                            fVar3.f2003d.remove(fVar2);
                            if (fVar3.f2003d.size() == 0) {
                                arrayList3.add(fVar3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                arrayList3.clear();
            }
            this.f1982f = false;
            if (this.f1981e.size() != this.f1980d.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.f1980d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C0927f fVar4 = this.f1980d.get(i4);
            ArrayList<C0925d> arrayList5 = fVar4.f2001b;
            if (arrayList5 != null && arrayList5.size() > 0) {
                int size5 = fVar4.f2001b.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C0925d dVar = fVar4.f2001b.get(i5);
                    if (fVar4.f2003d == null) {
                        fVar4.f2003d = new ArrayList<>();
                    }
                    if (!fVar4.f2003d.contains(dVar.f1995a)) {
                        fVar4.f2003d.add(dVar.f1995a);
                    }
                }
            }
            fVar4.f2005f = false;
        }
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: b */
    public void mo9111b() {
        this.f1984h = true;
        if (mo9126q()) {
            ArrayList arrayList = null;
            ArrayList<AbstractC0918a.AbstractC0919a> arrayList2 = this.f1977a;
            if (arrayList2 != null) {
                arrayList = (ArrayList) arrayList2.clone();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0918a.AbstractC0919a) it.next()).mo9124d(this);
                }
            }
            C0954m mVar = this.f1987k;
            if (mVar != null && mVar.mo9115e()) {
                this.f1987k.mo9111b();
            } else if (this.f1981e.size() > 0) {
                Iterator<C0927f> it2 = this.f1981e.iterator();
                while (it2.hasNext()) {
                    it2.next().f2000a.mo9111b();
                }
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((AbstractC0918a.AbstractC0919a) it3.next()).mo9121a(this);
                }
            }
            this.f1985i = false;
        }
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: e */
    public boolean mo9115e() {
        Iterator<C0927f> it = this.f1980d.iterator();
        while (it.hasNext()) {
            if (it.next().f2000a.mo9115e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: g */
    public /* bridge */ /* synthetic */ AbstractC0918a mo9117g(long j) {
        mo9130u(j);
        return this;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: h */
    public void mo9118h(long j) {
        this.f1986j = j;
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: i */
    public void mo9119i(Object obj) {
        Iterator<C0927f> it = this.f1980d.iterator();
        while (it.hasNext()) {
            AbstractC0918a aVar = it.next().f2000a;
            if (aVar instanceof C0921c) {
                ((C0921c) aVar).mo9119i(obj);
            } else if (aVar instanceof C0934i) {
                ((C0934i) aVar).mo9119i(obj);
            }
        }
    }

    @Override // p013b.p050d.p051a.AbstractC0918a
    /* renamed from: j */
    public void mo9120j() {
        this.f1984h = false;
        this.f1985i = true;
        m2497v();
        int size = this.f1981e.size();
        for (int i = 0; i < size; i++) {
            C0927f fVar = this.f1981e.get(i);
            ArrayList<AbstractC0918a.AbstractC0919a> d = fVar.f2000a.mo9114d();
            if (d != null && d.size() > 0) {
                Iterator it = new ArrayList(d).iterator();
                while (it.hasNext()) {
                    AbstractC0918a.AbstractC0919a aVar = (AbstractC0918a.AbstractC0919a) it.next();
                    if ((aVar instanceof C0926e) || (aVar instanceof C0923b)) {
                        fVar.f2000a.mo9116f(aVar);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            C0927f fVar2 = this.f1981e.get(i2);
            if (this.f1983g == null) {
                this.f1983g = new C0923b(this);
            }
            ArrayList<C0925d> arrayList2 = fVar2.f2001b;
            if (arrayList2 == null || arrayList2.size() == 0) {
                arrayList.add(fVar2);
            } else {
                int size2 = fVar2.f2001b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0925d dVar = fVar2.f2001b.get(i3);
                    dVar.f1995a.f2000a.mo9110a(new C0926e(this, fVar2, dVar.f1996b));
                }
                fVar2.f2002c = (ArrayList) fVar2.f2001b.clone();
            }
            fVar2.f2000a.mo9110a(this.f1983g);
        }
        if (this.f1986j <= 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0927f fVar3 = (C0927f) it2.next();
                fVar3.f2000a.mo9120j();
                this.f1978b.add(fVar3.f2000a);
            }
        } else {
            C0954m C = C0954m.m2640C(0.0f, 1.0f);
            this.f1987k = C;
            C.mo9117g(this.f1986j);
            this.f1987k.mo9110a(new C0922a(arrayList));
            this.f1987k.mo9120j();
        }
        ArrayList<AbstractC0918a.AbstractC0919a> arrayList3 = this.f1977a;
        if (arrayList3 != null) {
            ArrayList arrayList4 = (ArrayList) arrayList3.clone();
            int size3 = arrayList4.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC0918a.AbstractC0919a) arrayList4.get(i4)).mo9123c(this);
            }
        }
        if (this.f1980d.size() == 0 && this.f1986j == 0) {
            this.f1985i = false;
            ArrayList<AbstractC0918a.AbstractC0919a> arrayList5 = this.f1977a;
            if (arrayList5 != null) {
                ArrayList arrayList6 = (ArrayList) arrayList5.clone();
                int size4 = arrayList6.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((AbstractC0918a.AbstractC0919a) arrayList6.get(i5)).mo9121a(this);
                }
            }
        }
    }

    /* renamed from: p */
    public C0921c clone() {
        C0921c cVar = (C0921c) super.clone();
        cVar.f1982f = true;
        cVar.f1984h = false;
        cVar.f1985i = false;
        cVar.f1978b = new ArrayList<>();
        cVar.f1979c = new HashMap<>();
        cVar.f1980d = new ArrayList<>();
        cVar.f1981e = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<C0927f> it = this.f1980d.iterator();
        while (it.hasNext()) {
            C0927f next = it.next();
            C0927f b = next.clone();
            hashMap.put(next, b);
            cVar.f1980d.add(b);
            cVar.f1979c.put(b.f2000a, b);
            ArrayList arrayList = null;
            b.f2001b = null;
            b.f2002c = null;
            b.f2004e = null;
            b.f2003d = null;
            ArrayList<AbstractC0918a.AbstractC0919a> d = b.f2000a.mo9114d();
            if (d != null) {
                Iterator<AbstractC0918a.AbstractC0919a> it2 = d.iterator();
                while (it2.hasNext()) {
                    AbstractC0918a.AbstractC0919a next2 = it2.next();
                    if (next2 instanceof C0923b) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        d.remove((AbstractC0918a.AbstractC0919a) it3.next());
                    }
                }
            }
        }
        Iterator<C0927f> it4 = this.f1980d.iterator();
        while (it4.hasNext()) {
            C0927f next3 = it4.next();
            C0927f fVar = (C0927f) hashMap.get(next3);
            ArrayList<C0925d> arrayList2 = next3.f2001b;
            if (arrayList2 != null) {
                Iterator<C0925d> it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    C0925d next4 = it5.next();
                    fVar.mo9133a(new C0925d((C0927f) hashMap.get(next4.f1995a), next4.f1996b));
                }
            }
        }
        return cVar;
    }

    /* renamed from: q */
    public boolean mo9126q() {
        return this.f1985i;
    }

    /* renamed from: r */
    public C0924c mo9127r(AbstractC0918a aVar) {
        if (aVar == null) {
            return null;
        }
        this.f1982f = true;
        return new C0924c(aVar);
    }

    /* renamed from: s */
    public void mo9128s(AbstractC0918a... aVarArr) {
        if (aVarArr != null) {
            this.f1982f = true;
            int i = 0;
            if (aVarArr.length == 1) {
                mo9127r(aVarArr[0]);
                return;
            }
            while (i < aVarArr.length - 1) {
                i++;
                mo9127r(aVarArr[i]).mo9131a(aVarArr[i]);
            }
        }
    }

    /* renamed from: t */
    public void mo9129t(AbstractC0918a... aVarArr) {
        if (aVarArr != null) {
            this.f1982f = true;
            C0924c r = mo9127r(aVarArr[0]);
            for (int i = 1; i < aVarArr.length; i++) {
                r.mo9132b(aVarArr[i]);
            }
        }
    }

    /* renamed from: u */
    public C0921c mo9130u(long j) {
        if (j >= 0) {
            Iterator<C0927f> it = this.f1980d.iterator();
            while (it.hasNext()) {
                it.next().f2000a.mo9117g(j);
            }
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }
}
