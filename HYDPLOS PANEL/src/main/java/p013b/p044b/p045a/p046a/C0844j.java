package p013b.p044b.p045a.p046a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p009v4.app.FragmentStatePagerAdapter;
import android.support.p012v7.widget.RecyclerView;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: b.b.a.a.j */
public class C0844j {

    /* renamed from: n */
    private static String f1744n;

    /* renamed from: o */
    public static C0844j f1745o;

    /* renamed from: a */
    public Context f1746a;

    /* renamed from: b */
    public HashMap<String, SoftReference<Drawable>> f1747b = new HashMap<>();

    /* renamed from: c */
    private ArrayList<C0847c> f1748c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<String> f1749d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<C0847c> f1750e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<String> f1751f = new ArrayList<>();

    /* renamed from: g */
    private BaseAdapter f1752g = null;

    /* renamed from: h */
    private RecyclerView.Adapter f1753h = null;

    /* renamed from: i */
    private FragmentStatePagerAdapter f1754i = null;

    /* renamed from: j */
    private int f1755j = 0;

    /* renamed from: k */
    private int f1756k = 0;

    /* renamed from: l */
    private Handler f1757l;

    /* renamed from: m */
    private boolean f1758m = false;

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.j$a */
    public class C0845a extends Thread {
        C0845a() {
        }

        public void run() {
            while (true) {
                int size = C0844j.this.f1748c.size();
                int i = 0;
                if (size <= 0) {
                    C0844j.this.f1757l.sendEmptyMessage(1);
                    C0844j.this.f1758m = false;
                    return;
                } else if (C0844j.this.f1756k < 3) {
                    C0844j.m1940e(C0844j.this);
                    if (C0844j.this.f1755j == 1000) {
                        i = size - 1;
                    }
                    C0844j.this.f1748c.remove(i);
                    C0844j.this.f1749d.remove(i);
                    new C0848d((C0847c) C0844j.this.f1748c.get(i)).start();
                } else {
                    C0844j.this.m1937b(300);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.b.a.a.j$b */
    public class HandlerC0846b extends Handler {
        HandlerC0846b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C0844j.this.m1954w();
            } else if (i == 2) {
                C0847c cVar = (C0847c) message.obj;
                if (cVar.f1768h) {
                    ImageView imageView = cVar.f1765e;
                    if (imageView != null) {
                        imageView.setBackgroundDrawable(cVar.f1767g);
                        return;
                    }
                    View view = cVar.f1766f;
                    if (view != null) {
                        view.setBackgroundDrawable(cVar.f1767g);
                        return;
                    }
                    return;
                }
                ImageView imageView2 = cVar.f1765e;
                if (imageView2 == null) {
                    View view2 = cVar.f1766f;
                    if (view2 instanceof ImageView) {
                        imageView2 = (ImageView) view2;
                    } else {
                        return;
                    }
                }
                imageView2.setImageDrawable(cVar.f1767g);
            }
        }
    }

    /* renamed from: b.b.a.a.j$c */
    public class C0847c {

        /* renamed from: a */
        public String f1761a = null;

        /* renamed from: b */
        public String f1762b = null;

        /* renamed from: c */
        public String f1763c = null;

        /* renamed from: d */
        public String f1764d = null;

        /* renamed from: e */
        public ImageView f1765e = null;

        /* renamed from: f */
        public View f1766f = null;

        /* renamed from: g */
        public Drawable f1767g = null;

        /* renamed from: h */
        public boolean f1768h = false;

        public C0847c(C0844j jVar, ImageView imageView, String str, String str2) {
            this.f1765e = imageView;
            this.f1762b = str;
            this.f1764d = str2;
        }

        public C0847c(C0844j jVar, String str, String str2, View view, boolean z) {
            this.f1761a = str;
            this.f1763c = str2;
            this.f1766f = view;
            this.f1768h = z;
        }

        public C0847c(C0844j jVar, String str, String str2, ImageView imageView) {
            this.f1761a = str;
            this.f1763c = str2;
            this.f1765e = imageView;
        }
    }

    /* renamed from: b.b.a.a.j$d */
    public class C0848d extends Thread {

        /* renamed from: a */
        private C0847c f1769a;

        public C0848d(C0847c cVar) {
            this.f1769a = cVar;
        }

        public void run() {
            C0847c cVar = this.f1769a;
            if (cVar.f1761a == null) {
                C0844j.this.m1952s(cVar);
            } else {
                C0844j.this.m1953v(cVar);
            }
            C0844j.m1941f(C0844j.this);
        }
    }

    public C0844j(Context context, int i) {
        this.f1746a = context;
        this.f1755j = i;
        m1950p();
    }

    public C0844j(Context context, FragmentStatePagerAdapter fragmentStatePagerAdapter, int i) {
        this.f1746a = context;
        this.f1754i = fragmentStatePagerAdapter;
        this.f1755j = i;
        m1950p();
    }

    public C0844j(Context context, RecyclerView.Adapter adapter, int i) {
        this.f1746a = context;
        this.f1753h = adapter;
        this.f1755j = i;
        m1950p();
    }

    public C0844j(Context context, BaseAdapter baseAdapter, int i) {
        this.f1746a = context;
        this.f1752g = baseAdapter;
        this.f1755j = i;
        m1950p();
    }

    /* renamed from: a */
    public static void m1936a(Context context, View view, String str, String str2, boolean z) {
        if (f1745o == null) {
            f1745o = new C0844j(context, 2);
        }
        SoftReference<Drawable> softReference = f1745o.f1747b.get(str2);
        Drawable drawable = softReference == null ? null : softReference.get();
        if (drawable == null) {
            f1745o.mo8943t(view, str, str2, z);
        } else if (z) {
            view.setBackgroundDrawable(drawable);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m1937b(long j) {
        try {
            Thread.sleep(j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    static /* synthetic */ int m1940e(C0844j jVar) {
        int i = jVar.f1756k;
        jVar.f1756k = i + 1;
        return i;
    }

    /* renamed from: f */
    static /* synthetic */ int m1941f(C0844j jVar) {
        int i = jVar.f1756k;
        jVar.f1756k = i - 1;
        return i;
    }

    /* renamed from: p */
    private void m1950p() {
        if (f1744n == null) {
            f1744n = this.f1746a.getFilesDir().getAbsolutePath();
        }
        this.f1757l = new HandlerC0846b(this.f1746a.getMainLooper());
    }

    /* renamed from: q */
    private synchronized void m1951q(String str, Drawable drawable) {
        while (true) {
            int indexOf = this.f1751f.indexOf(str);
            if (indexOf != -1) {
                C0847c cVar = this.f1750e.get(indexOf);
                this.f1750e.remove(cVar);
                this.f1751f.remove(str);
                cVar.f1767g = drawable;
                m1956y(2, cVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s */
    private void m1952s(C0847c cVar) {
        int i = this.f1755j;
        if (i == 1) {
            Bitmap b = C0839h.m1893b(this.f1746a, cVar.f1762b);
            this.f1747b.put(cVar.f1764d, new SoftReference<>(new BitmapDrawable(this.f1746a.getResources(), b)));
            if (b != null) {
                this.f1757l.sendEmptyMessage(1);
            }
        } else if (i == 2 || i == 3) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f1746a.getResources(), C0839h.m1893b(this.f1746a, cVar.f1762b));
            this.f1747b.put(cVar.f1764d, new SoftReference<>(bitmapDrawable));
            cVar.f1767g = bitmapDrawable;
            m1956y(2, cVar);
            if (this.f1751f.contains(cVar.f1764d)) {
                m1951q(cVar.f1764d, bitmapDrawable);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: v */
    private void m1953v(C0847c cVar) {
        int i = this.f1755j;
        if (i == 1) {
            cVar.f1762b = String.format("%s/temp/%s.img", f1744n, C0860r.m2045d(cVar.f1761a));
            File file = new File(cVar.f1762b);
            if ((file.exists() && new Date().getTime() - file.lastModified() >= 1800000) || C0841i.m1918a(cVar.f1761a, cVar.f1762b, false) >= 0) {
                Bitmap c = C0839h.m1894c(this.f1746a, cVar.f1762b);
                this.f1747b.put(cVar.f1763c, new SoftReference<>(new BitmapDrawable(this.f1746a.getResources(), c)));
                if (c != null) {
                    this.f1757l.sendEmptyMessage(1);
                }
            }
        } else if (i == 2 || i == 3) {
            cVar.f1762b = String.format("%s/temp/%s.img", f1744n, C0860r.m2045d(cVar.f1761a));
            File file2 = new File(cVar.f1762b);
            if ((file2.exists() && new Date().getTime() - file2.lastModified() >= 1800000) || C0841i.m1918a(cVar.f1761a, cVar.f1762b, false) >= 0) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f1746a.getResources(), C0839h.m1893b(this.f1746a, cVar.f1762b));
                this.f1747b.put(cVar.f1763c, new SoftReference<>(bitmapDrawable));
                cVar.f1767g = bitmapDrawable;
                m1956y(2, cVar);
                if (this.f1751f.contains(cVar.f1763c)) {
                    m1951q(cVar.f1763c, bitmapDrawable);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: w */
    private void m1954w() {
        BaseAdapter baseAdapter = this.f1752g;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
            return;
        }
        RecyclerView.Adapter adapter = this.f1753h;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
            return;
        }
        FragmentStatePagerAdapter fragmentStatePagerAdapter = this.f1754i;
        if (fragmentStatePagerAdapter != null) {
            fragmentStatePagerAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: x */
    private void m1955x() {
        if (!this.f1758m) {
            this.f1758m = true;
            new C0845a().start();
        }
    }

    /* renamed from: y */
    private void m1956y(int i, Object obj) {
        Message message = new Message();
        message.what = i;
        message.obj = obj;
        this.f1757l.sendMessage(message);
    }

    /* renamed from: o */
    public void mo8941o() {
        this.f1747b.clear();
        this.f1748c.clear();
        this.f1749d.clear();
        this.f1750e.clear();
        this.f1751f.clear();
        C0844j jVar = f1745o;
        if (jVar != null) {
            jVar.f1747b.clear();
            f1745o.f1748c.clear();
            f1745o.f1749d.clear();
            f1745o.f1750e.clear();
            f1745o.f1751f.clear();
            f1745o = null;
        }
    }

    /* renamed from: r */
    public void mo8942r(ImageView imageView, String str, String str2, boolean z) {
        if (str == null) {
            imageView.setImageDrawable(null);
            return;
        }
        if (z) {
            imageView.setImageDrawable(null);
        }
        if (this.f1749d.contains(str2)) {
            int i = this.f1755j;
            if (i == 2 || i == 3) {
                this.f1750e.add(new C0847c(this, imageView, str, str2));
                this.f1751f.add(str2);
                return;
            }
            return;
        }
        this.f1748c.add(new C0847c(this, imageView, str, str2));
        this.f1749d.add(str2);
        m1955x();
    }

    /* renamed from: t */
    public void mo8943t(View view, String str, String str2, boolean z) {
        if (this.f1749d.contains(str2)) {
            int i = this.f1755j;
            if (i == 2 || i == 3) {
                this.f1750e.add(new C0847c(this, str, str2, view, z));
                this.f1751f.add(str2);
                return;
            }
            return;
        }
        this.f1748c.add(new C0847c(this, str, str2, view, z));
        this.f1749d.add(str2);
        m1955x();
    }

    /* renamed from: u */
    public void mo8944u(ImageView imageView, String str, String str2, boolean z) {
        if (str == null) {
            imageView.setImageDrawable(null);
            return;
        }
        if (z) {
            imageView.setImageDrawable(null);
        }
        if (this.f1749d.contains(str2)) {
            int i = this.f1755j;
            if (i == 2 || i == 3) {
                this.f1750e.add(new C0847c(this, str, str2, imageView));
                this.f1751f.add(str2);
                return;
            }
            return;
        }
        this.f1748c.add(new C0847c(this, str, str2, imageView));
        this.f1749d.add(str2);
        m1955x();
    }
}
