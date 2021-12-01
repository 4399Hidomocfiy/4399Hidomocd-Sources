package p062cn.hugo.android.scanner.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import bsh.org.objectweb.asm.Constants;
import java.util.ArrayList;
import java.util.List;
import p013b.p014a.p015a.C0718r;
import p062cn.hugo.android.scanner.p063f.C1046c;

/* renamed from: cn.hugo.android.scanner.view.ViewfinderView */
public final class ViewfinderView extends View {

    /* renamed from: m */
    private static int f2337m;

    /* renamed from: n */
    private static int f2338n;

    /* renamed from: a */
    private int f2339a;

    /* renamed from: b */
    private Paint f2340b;

    /* renamed from: c */
    private int f2341c;

    /* renamed from: d */
    private int f2342d;

    /* renamed from: e */
    private Bitmap f2343e;

    /* renamed from: f */
    private final int f2344f;

    /* renamed from: g */
    private final int f2345g;

    /* renamed from: h */
    private final int f2346h;

    /* renamed from: i */
    private List<C0718r> f2347i;

    /* renamed from: j */
    private List<C0718r> f2348j;

    /* renamed from: k */
    boolean f2349k = true;

    /* renamed from: l */
    private C1046c f2350l;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2339a = mo10109b(context, 0.0f);
        f2338n = mo10109b(context, 20.0f);
        f2337m = mo10109b(context, 3.0f);
        this.f2340b = new Paint(1);
        Resources resources = getResources();
        this.f2344f = resources.getColor(2131034245);
        this.f2345g = resources.getColor(2131034222);
        this.f2346h = resources.getColor(2131034210);
        this.f2347i = new ArrayList(5);
        this.f2348j = null;
    }

    /* renamed from: c */
    private void m2966c(Canvas canvas, Rect rect) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f2340b.setColor(this.f2343e != null ? this.f2345g : this.f2344f);
        float f = (float) width;
        canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f2340b);
        canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f2340b);
        canvas.drawRect((float) (rect.right + 1), (float) rect.top, f, (float) (rect.bottom + 1), this.f2340b);
        canvas.drawRect(0.0f, (float) (rect.bottom + 1), f, (float) height, this.f2340b);
    }

    /* renamed from: d */
    private void m2967d(Canvas canvas, Rect rect) {
        this.f2340b.setColor(-1);
        this.f2340b.setAlpha(255);
        Resources resources = getResources();
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, 2131427353);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, 2131427354);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(resources, 2131427351);
        Bitmap decodeResource4 = BitmapFactory.decodeResource(resources, 2131427352);
        int i = rect.left;
        int i2 = this.f2339a;
        canvas.drawBitmap(decodeResource, (float) (i + i2), (float) (rect.top + i2), this.f2340b);
        canvas.drawBitmap(decodeResource2, (float) ((rect.right - this.f2339a) - decodeResource2.getWidth()), (float) (rect.top + this.f2339a), this.f2340b);
        int i3 = rect.left;
        int i4 = this.f2339a;
        canvas.drawBitmap(decodeResource3, (float) (i3 + i4), (float) (((rect.bottom - i4) - decodeResource3.getHeight()) + 2), this.f2340b);
        canvas.drawBitmap(decodeResource4, (float) ((rect.right - this.f2339a) - decodeResource4.getWidth()), (float) (((rect.bottom - this.f2339a) - decodeResource4.getHeight()) + 2), this.f2340b);
        decodeResource.recycle();
        decodeResource2.recycle();
        decodeResource3.recycle();
        decodeResource4.recycle();
    }

    /* renamed from: e */
    private void m2968e(Canvas canvas, Rect rect) {
        if (this.f2349k) {
            this.f2349k = false;
            this.f2341c = rect.top;
            this.f2342d = rect.bottom;
        }
        int i = this.f2341c + 10;
        this.f2341c = i;
        if (i >= this.f2342d) {
            this.f2341c = rect.top;
        }
        Rect rect2 = new Rect();
        int i2 = rect.left;
        int i3 = f2338n;
        rect2.left = i2 + i3;
        rect2.right = rect.right - i3;
        int i4 = this.f2341c;
        rect2.top = i4;
        rect2.bottom = i4 + f2337m;
        canvas.drawBitmap(((BitmapDrawable) getResources().getDrawable(2131427357)).getBitmap(), (Rect) null, rect2, this.f2340b);
    }

    /* renamed from: a */
    public void mo10108a(C0718r rVar) {
        List<C0718r> list = this.f2347i;
        synchronized (list) {
            list.add(rVar);
            int size = list.size();
            if (size > 20) {
                list.subList(0, size - 10).clear();
            }
        }
    }

    /* renamed from: b */
    public int mo10109b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: f */
    public void mo10110f() {
        Bitmap bitmap = this.f2343e;
        this.f2343e = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        Rect d;
        C1046c cVar = this.f2350l;
        if (!(cVar == null || (d = cVar.mo10089d()) == null)) {
            m2966c(canvas, d);
            if (this.f2343e != null) {
                this.f2340b.setAlpha(Constants.IF_ICMPNE);
                canvas.drawBitmap(this.f2343e, (Rect) null, d, this.f2340b);
                return;
            }
            m2967d(canvas, d);
            m2968e(canvas, d);
            List<C0718r> list = this.f2347i;
            List<C0718r> list2 = this.f2348j;
            if (list.isEmpty()) {
                this.f2348j = null;
            } else {
                this.f2347i = new ArrayList(5);
                this.f2348j = list;
                this.f2340b.setAlpha(255);
                this.f2340b.setColor(this.f2346h);
                for (C0718r rVar : list) {
                    canvas.drawCircle(((float) d.left) + rVar.mo8700c(), ((float) d.top) + rVar.mo8701d(), 6.0f, this.f2340b);
                }
            }
            if (list2 != null) {
                this.f2340b.setAlpha(127);
                this.f2340b.setColor(this.f2346h);
                for (C0718r rVar2 : list2) {
                    canvas.drawCircle(((float) d.left) + rVar2.mo8700c(), ((float) d.top) + rVar2.mo8701d(), 3.0f, this.f2340b);
                }
            }
            postInvalidateDelayed(10, d.left, d.top, d.right, d.bottom);
        }
    }

    public void setCameraManager(C1046c cVar) {
        this.f2350l = cVar;
    }
}
