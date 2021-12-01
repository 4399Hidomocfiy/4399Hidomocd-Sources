package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static SnackbarManager sSnackbarManager;
    private SnackbarRecord mCurrentSnackbar;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        /* class android.support.design.widget.SnackbarManager.C01191 */

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager.this.handleTimeout((SnackbarRecord) message.obj);
            return true;
        }
    });
    private final Object mLock = new Object();
    private SnackbarRecord mNextSnackbar;

    /* access modifiers changed from: package-private */
    public interface Callback {
        void dismiss(int i);

        void show();
    }

    /* access modifiers changed from: private */
    public static class SnackbarRecord {
        final WeakReference<Callback> callback;
        int duration;
        boolean paused;

        SnackbarRecord(int i, Callback callback2) {
            this.callback = new WeakReference<>(callback2);
            this.duration = i;
        }

        /* access modifiers changed from: package-private */
        public boolean isSnackbar(Callback callback2) {
            return callback2 != null && this.callback.get() == callback2;
        }
    }

    private SnackbarManager() {
    }

    private boolean cancelSnackbarLocked(SnackbarRecord snackbarRecord, int i) {
        Callback callback = snackbarRecord.callback.get();
        if (callback == null) {
            return false;
        }
        this.mHandler.removeCallbacksAndMessages(snackbarRecord);
        callback.dismiss(i);
        return true;
    }

    static SnackbarManager getInstance() {
        if (sSnackbarManager == null) {
            sSnackbarManager = new SnackbarManager();
        }
        return sSnackbarManager;
    }

    private boolean isCurrentSnackbarLocked(Callback callback) {
        SnackbarRecord snackbarRecord = this.mCurrentSnackbar;
        return snackbarRecord != null && snackbarRecord.isSnackbar(callback);
    }

    private boolean isNextSnackbarLocked(Callback callback) {
        SnackbarRecord snackbarRecord = this.mNextSnackbar;
        return snackbarRecord != null && snackbarRecord.isSnackbar(callback);
    }

    private void scheduleTimeoutLocked(SnackbarRecord snackbarRecord) {
        int i = snackbarRecord.duration;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? SHORT_DURATION_MS : LONG_DURATION_MS;
            }
            this.mHandler.removeCallbacksAndMessages(snackbarRecord);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), (long) i);
        }
    }

    private void showNextSnackbarLocked() {
        SnackbarRecord snackbarRecord = this.mNextSnackbar;
        if (snackbarRecord != null) {
            this.mCurrentSnackbar = snackbarRecord;
            this.mNextSnackbar = null;
            Callback callback = snackbarRecord.callback.get();
            if (callback != null) {
                callback.show();
            } else {
                this.mCurrentSnackbar = null;
            }
        }
    }

    public void dismiss(Callback callback, int i) {
        SnackbarRecord snackbarRecord;
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                snackbarRecord = this.mCurrentSnackbar;
            } else if (isNextSnackbarLocked(callback)) {
                snackbarRecord = this.mNextSnackbar;
            }
            cancelSnackbarLocked(snackbarRecord, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void handleTimeout(SnackbarRecord snackbarRecord) {
        synchronized (this.mLock) {
            if (this.mCurrentSnackbar == snackbarRecord || this.mNextSnackbar == snackbarRecord) {
                cancelSnackbarLocked(snackbarRecord, 2);
            }
        }
    }

    public boolean isCurrent(Callback callback) {
        boolean isCurrentSnackbarLocked;
        synchronized (this.mLock) {
            isCurrentSnackbarLocked = isCurrentSnackbarLocked(callback);
        }
        return isCurrentSnackbarLocked;
    }

    public boolean isCurrentOrNext(Callback callback) {
        boolean z;
        synchronized (this.mLock) {
            if (!isCurrentSnackbarLocked(callback)) {
                if (!isNextSnackbarLocked(callback)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void onDismissed(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                this.mCurrentSnackbar = null;
                if (this.mNextSnackbar != null) {
                    showNextSnackbarLocked();
                }
            }
        }
    }

    public void onShown(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                scheduleTimeoutLocked(this.mCurrentSnackbar);
            }
        }
    }

    public void pauseTimeout(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                SnackbarRecord snackbarRecord = this.mCurrentSnackbar;
                if (!snackbarRecord.paused) {
                    snackbarRecord.paused = true;
                    this.mHandler.removeCallbacksAndMessages(snackbarRecord);
                }
            }
        }
    }

    public void restoreTimeoutIfPaused(Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                SnackbarRecord snackbarRecord = this.mCurrentSnackbar;
                if (snackbarRecord.paused) {
                    snackbarRecord.paused = false;
                    scheduleTimeoutLocked(snackbarRecord);
                }
            }
        }
    }

    public void show(int i, Callback callback) {
        synchronized (this.mLock) {
            if (isCurrentSnackbarLocked(callback)) {
                SnackbarRecord snackbarRecord = this.mCurrentSnackbar;
                snackbarRecord.duration = i;
                this.mHandler.removeCallbacksAndMessages(snackbarRecord);
                scheduleTimeoutLocked(this.mCurrentSnackbar);
                return;
            }
            if (isNextSnackbarLocked(callback)) {
                this.mNextSnackbar.duration = i;
            } else {
                this.mNextSnackbar = new SnackbarRecord(i, callback);
            }
            SnackbarRecord snackbarRecord2 = this.mCurrentSnackbar;
            if (snackbarRecord2 == null || !cancelSnackbarLocked(snackbarRecord2, 4)) {
                this.mCurrentSnackbar = null;
                showNextSnackbarLocked();
            }
        }
    }
}
