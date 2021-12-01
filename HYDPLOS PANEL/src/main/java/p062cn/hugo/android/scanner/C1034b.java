package p062cn.hugo.android.scanner;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: cn.hugo.android.scanner.b */
public final class C1034b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: e */
    private static final String f2265e = C1034b.class.getSimpleName();

    /* renamed from: a */
    private final Activity f2266a;

    /* renamed from: b */
    private MediaPlayer f2267b = null;

    /* renamed from: c */
    private boolean f2268c;

    /* renamed from: d */
    private boolean f2269d;

    C1034b(Activity activity) {
        this.f2266a = activity;
        mo10064e();
    }

    /* renamed from: a */
    private MediaPlayer m2908a(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(2131492864);
        try {
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f2265e, e);
            return null;
        }
    }

    /* renamed from: d */
    private static boolean m2909d(SharedPreferences sharedPreferences, Context context) {
        boolean z = sharedPreferences.getBoolean("preferences_play_beep", true);
        if (!z || ((AudioManager) context.getSystemService("audio")).getRingerMode() == 2) {
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public synchronized void mo10062b() {
        MediaPlayer mediaPlayer = this.f2267b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f2267b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo10063c() {
        MediaPlayer mediaPlayer;
        if (this.f2268c && (mediaPlayer = this.f2267b) != null) {
            mediaPlayer.start();
        }
        if (this.f2269d) {
            ((Vibrator) this.f2266a.getSystemService("vibrator")).vibrate(200);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo10064e() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f2266a);
        this.f2268c = m2909d(defaultSharedPreferences, this.f2266a);
        this.f2269d = defaultSharedPreferences.getBoolean("preferences_vibrate", false);
        if (this.f2268c && this.f2267b == null) {
            this.f2266a.setVolumeControlStream(3);
            this.f2267b = m2908a(this.f2266a);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
    }

    public synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 100) {
            this.f2266a.finish();
        } else {
            mediaPlayer.release();
            this.f2267b = null;
            mo10064e();
        }
        return true;
    }
}
