package com.iapp.app;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.p009v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import bsh.EvalError;
import com.iapp.app.run.mian;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.keplerproject.luajava.LuaException;
import p013b.p044b.p045a.p046a.C0832d;
import p013b.p044b.p045a.p046a.C0864v;

public class ays extends AccessibilityService {
    public static int ets = -1;

    /* renamed from: f */
    public static int f3051f = 1;
    public static int fbt = -1;

    /* renamed from: nt */
    public static int f3052nt = 500;
    public static String pns = "com.iapp.app";

    /* renamed from: a */
    private C0864v f3053a = null;

    /* renamed from: b */
    private Aid_YuCodeX f3054b = null;

    /* renamed from: c */
    private C1298d f3055c = null;

    /* renamed from: d */
    private C1309h f3056d = null;

    /* renamed from: e */
    private int f3057e = 0;

    @TargetApi(14)
    /* renamed from: a */
    private void m3484a(AccessibilityNodeInfo accessibilityNodeInfo, List<AccessibilityNodeInfo> list) {
        if (accessibilityNodeInfo.getChildCount() > 0) {
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i = 0; i < childCount; i++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
                if (child != null) {
                    list.add(child);
                    m3484a(child, list);
                }
            }
        }
    }

    public static void goset(Context context) {
        context.startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
    }

    public static boolean isas(Context context) {
        int i;
        String string;
        String str = context.getPackageName() + "/" + ays.class.getCanonicalName();
        try {
            i = Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled");
        } catch (Settings.SettingNotFoundException unused) {
            i = 0;
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        if (i == 1 && (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services")) != null) {
            simpleStringSplitter.setString(string);
            while (simpleStringSplitter.hasNext()) {
                if (simpleStringSplitter.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @TargetApi(14)
    /* renamed from: ck */
    public boolean mo11637ck(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        return accessibilityNodeInfo.performAction(i);
    }

    @TargetApi(16)
    /* renamed from: ck */
    public boolean mo11638ck(AccessibilityNodeInfo accessibilityNodeInfo, int i, Bundle bundle) {
        return accessibilityNodeInfo.performAction(i, bundle);
    }

    /* renamed from: ck */
    public boolean mo11639ck(List<AccessibilityNodeInfo> list, int i) {
        boolean z = false;
        for (AccessibilityNodeInfo accessibilityNodeInfo : list) {
            z = cka(accessibilityNodeInfo, i);
        }
        return z;
    }

    /* renamed from: ck */
    public boolean mo11640ck(List<AccessibilityNodeInfo> list, int i, Bundle bundle) {
        boolean z = false;
        for (AccessibilityNodeInfo accessibilityNodeInfo : list) {
            z = cka(accessibilityNodeInfo, i, bundle);
        }
        return z;
    }

    @TargetApi(14)
    public boolean cka(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        if (accessibilityNodeInfo.isEnabled()) {
            return accessibilityNodeInfo.performAction(i);
        }
        return false;
    }

    @TargetApi(14)
    public boolean cka(AccessibilityNodeInfo accessibilityNodeInfo, int i, Bundle bundle) {
        if (accessibilityNodeInfo.isEnabled()) {
            return accessibilityNodeInfo.performAction(i);
        }
        return false;
    }

    public boolean ckfocus(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        return cka(focus(accessibilityNodeInfo, i2), i);
    }

    public boolean ckid(AccessibilityNodeInfo accessibilityNodeInfo, int i, String str) {
        return mo11639ck(mo11672id(accessibilityNodeInfo, str), i);
    }

    public boolean cktext(AccessibilityNodeInfo accessibilityNodeInfo, int i, String str) {
        return mo11639ck(text(accessibilityNodeInfo, str), i);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public boolean enter(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            Bundle bundle = new Bundle();
            bundle.putCharSequence(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, str);
            return accessibilityNodeInfo.performAction(2097152, bundle);
        } else if (i < 18) {
            return false;
        } else {
            ((ClipboardManager) getBaseContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("iapp label", str));
            accessibilityNodeInfo.performAction(1);
            return accessibilityNodeInfo.performAction(32768);
        }
    }

    public boolean enter(List<AccessibilityNodeInfo> list, String str) {
        boolean z = false;
        for (AccessibilityNodeInfo accessibilityNodeInfo : list) {
            z = enter(accessibilityNodeInfo, str);
        }
        return z;
    }

    @TargetApi(16)
    public AccessibilityNodeInfo focus(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        return accessibilityNodeInfo.findFocus(i);
    }

    @TargetApi(16)
    public AccessibilityNodeInfo focussearch(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        return accessibilityNodeInfo.focusSearch(i);
    }

    @SuppressLint({"NewApi"})
    @TargetApi(14)
    public List<AccessibilityNodeInfo.AccessibilityAction> gal(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getActionList();
    }

    @TargetApi(16)
    public AccessibilityNodeInfo gall() {
        return getRootInActiveWindow();
    }

    @TargetApi(14)
    public AccessibilityNodeInfo gall(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getSource();
    }

    public List<AccessibilityNodeInfo> ganiall(AccessibilityNodeInfo accessibilityNodeInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(accessibilityNodeInfo);
        m3484a(accessibilityNodeInfo, arrayList);
        return arrayList;
    }

    public Context gbc() {
        return getBaseContext();
    }

    @TargetApi(14)
    public Rect gbip(AccessibilityNodeInfo accessibilityNodeInfo) {
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect);
        return rect;
    }

    @TargetApi(14)
    public Rect gbis(AccessibilityNodeInfo accessibilityNodeInfo) {
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        return rect;
    }

    public String gcn(AccessibilityEvent accessibilityEvent) {
        CharSequence className = accessibilityEvent.getClassName();
        if (className == null) {
            return null;
        }
        return className.toString();
    }

    @TargetApi(14)
    public String gcn(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence className = accessibilityNodeInfo.getClassName();
        if (className == null) {
            return null;
        }
        return className.toString();
    }

    @TargetApi(14)
    /* renamed from: gi */
    public AccessibilityNodeInfo mo11659gi(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        return accessibilityNodeInfo.getChild(i);
    }

    @TargetApi(18)
    public String gid(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getViewIdResourceName();
    }

    @TargetApi(14)
    /* renamed from: gl */
    public int mo11661gl(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChildCount();
    }

    @TargetApi(14)
    /* renamed from: gp */
    public AccessibilityNodeInfo mo11662gp(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getParent();
    }

    public String gpn(AccessibilityEvent accessibilityEvent) {
        CharSequence packageName = accessibilityEvent.getPackageName();
        if (packageName == null) {
            return null;
        }
        return packageName.toString();
    }

    @TargetApi(14)
    public String gpn(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence packageName = accessibilityNodeInfo.getPackageName();
        if (packageName == null) {
            return null;
        }
        return packageName.toString();
    }

    @TargetApi(16)
    public AccessibilityServiceInfo gsi() {
        return getServiceInfo();
    }

    public int gsl(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getItemCount();
    }

    @TargetApi(14)
    /* renamed from: gt */
    public String mo11667gt(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence text = accessibilityNodeInfo.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public long gtime(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getEventTime();
    }

    public int gtype(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getEventType();
    }

    @TargetApi(14)
    public int gwid(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getWindowId();
    }

    @TargetApi(14)
    public int gwid(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getWindowId();
    }

    @TargetApi(18)
    /* renamed from: id */
    public List<AccessibilityNodeInfo> mo11672id(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        return accessibilityNodeInfo.findAccessibilityNodeInfosByViewId(str);
    }

    @TargetApi(14)
    public boolean iscd(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isChecked();
    }

    @TargetApi(14)
    public boolean isck(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isClickable();
    }

    public boolean ised(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.isEnabled();
    }

    @TargetApi(14)
    public boolean ised(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isEnabled();
    }

    @TargetApi(14)
    public boolean isfd(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFocused();
    }

    @TargetApi(14)
    public boolean islck(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isLongClickable();
    }

    @TargetApi(14)
    public boolean ispd(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isPassword();
    }

    @TargetApi(14)
    public boolean issd(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isSelected();
    }

    @TargetApi(14)
    public boolean isse(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isScrollable();
    }

    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent != null) {
            int i = this.f3057e;
            if (i == 1) {
                if (mian.f3388sh) {
                    this.f3053a.mo8981T("e", accessibilityEvent);
                    this.f3053a.mo8987x0("ays_service.on(e)", "ays", this);
                    return;
                }
                this.f3054b.dim("e", accessibilityEvent);
                this.f3054b.function3("ays_service.on(e)", "ays", this);
            } else if (i == 2) {
                this.f3056d.mo11942b("on", accessibilityEvent);
            } else if (i == 3) {
                this.f3055c.mo11693d("on", accessibilityEvent);
            }
        }
    }

    public void onInterrupt() {
    }

    /* access modifiers changed from: protected */
    @TargetApi(16)
    public void onServiceConnected() {
        int i;
        fbt = -1;
        if (C0864v.f1802l == null || C1293a.f3050c == null) {
            C1293a.f3050c = getPackageName();
            C0864v.f1802l = new HashMap<>();
            C0832d.m1827l();
        }
        Context baseContext = getBaseContext();
        if (C1294b.m3505h9(baseContext, "ays_service.myu")) {
            if (mian.f3388sh) {
                C0864v vVar = new C0864v(baseContext, null);
                this.f3053a = vVar;
                vVar.mo8986w0("ays_service.onsc()");
            } else {
                Aid_YuCodeX aid_YuCodeX = new Aid_YuCodeX(baseContext, null);
                this.f3054b = aid_YuCodeX;
                aid_YuCodeX.function2("ays_service.onsc()");
            }
            i = 1;
        } else if (C1294b.m3505h9(baseContext, "ays_service.mjava")) {
            C1309h hVar = new C1309h(baseContext);
            this.f3056d = hVar;
            try {
                hVar.set("ays", this);
                this.f3056d.set("activity", baseContext);
                this.f3056d.set("i", new Aid_javaCode(baseContext, null, this.f3056d));
            } catch (EvalError e) {
                e.printStackTrace();
            }
            if (this.f3056d.mo11945e("ays_service.mjava")) {
                this.f3056d.mo11941a("onsc");
            }
            i = 2;
        } else {
            if (C1294b.m3505h9(baseContext, "ays_service.mlua")) {
                C1298d dVar = new C1298d(baseContext);
                this.f3055c = dVar;
                dVar.mo11700l("ays", this);
                this.f3055c.mo11700l("activity", baseContext);
                this.f3055c.mo11700l("i", new Aid_luaCode(baseContext, null, this.f3055c));
                this.f3055c.mo11699k();
                try {
                    this.f3055c.mo11697i("ays_service.mlua");
                } catch (LuaException e2) {
                    e2.printStackTrace();
                    C0864v.m2157O2("LuaErr：\n" + e2.getMessage());
                }
                this.f3055c.mo11692c("onsc");
                i = 3;
            }
            AccessibilityServiceInfo serviceInfo = getServiceInfo();
            serviceInfo.eventTypes = ets;
            serviceInfo.packageNames = pns.split(",", -1);
            serviceInfo.feedbackType = fbt;
            serviceInfo.notificationTimeout = (long) f3052nt;
            serviceInfo.flags = f3051f;
            setServiceInfo(serviceInfo);
        }
        this.f3057e = i;
        AccessibilityServiceInfo serviceInfo2 = getServiceInfo();
        serviceInfo2.eventTypes = ets;
        serviceInfo2.packageNames = pns.split(",", -1);
        serviceInfo2.feedbackType = fbt;
        serviceInfo2.notificationTimeout = (long) f3052nt;
        serviceInfo2.flags = f3051f;
        setServiceInfo(serviceInfo2);
    }

    @TargetApi(16)
    public boolean pga(int i) {
        return performGlobalAction(i);
    }

    /* renamed from: re */
    public void mo11686re(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.recycle();
    }

    @TargetApi(14)
    /* renamed from: re */
    public void mo11687re(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.recycle();
    }

    public void ssi(AccessibilityServiceInfo accessibilityServiceInfo) {
        setServiceInfo(accessibilityServiceInfo);
    }

    @TargetApi(14)
    public List<AccessibilityNodeInfo> text(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        return accessibilityNodeInfo.findAccessibilityNodeInfosByText(str);
    }
}
