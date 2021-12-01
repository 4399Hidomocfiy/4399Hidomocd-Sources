package p062cn.hugo.android.scanner;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import p062cn.hugo.android.scanner.p063f.C1046c;
import p062cn.hugo.android.scanner.p063f.EnumC1047d;

/* renamed from: cn.hugo.android.scanner.a */
final class C1033a implements SensorEventListener {

    /* renamed from: a */
    private final Context f2262a;

    /* renamed from: b */
    private C1046c f2263b;

    /* renamed from: c */
    private Sensor f2264c;

    C1033a(Context context) {
        this.f2262a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10058a(C1046c cVar) {
        this.f2263b = cVar;
        if (EnumC1047d.m2952b(PreferenceManager.getDefaultSharedPreferences(this.f2262a)) == EnumC1047d.AUTO) {
            SensorManager sensorManager = (SensorManager) this.f2262a.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f2264c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10059b() {
        if (this.f2264c != null) {
            ((SensorManager) this.f2262a.getSystemService("sensor")).unregisterListener(this);
            this.f2263b = null;
            this.f2264c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        C1046c cVar = this.f2263b;
        if (cVar == null) {
            return;
        }
        if (f <= 45.0f) {
            cVar.mo10095j(true);
        } else if (f >= 450.0f) {
            cVar.mo10095j(false);
        }
    }
}
