package android.support.p009v4.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p009v4.app.BundleCompat;
import android.support.p009v4.media.MediaBrowserCompat;
import android.support.p009v4.media.MediaBrowserServiceCompatApi21;
import android.support.p009v4.media.MediaBrowserServiceCompatApi23;
import android.support.p009v4.media.MediaBrowserServiceCompatApi24;
import android.support.p009v4.media.session.IMediaSession;
import android.support.p009v4.media.session.MediaSessionCompat;
import android.support.p009v4.p011os.ResultReceiver;
import android.support.p009v4.util.ArrayMap;
import android.support.p009v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserServiceCompat */
public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final float EPSILON = 1.0E-5f;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String KEY_SEARCH_RESULTS = "search_results";
    static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    static final int RESULT_OK = 0;
    static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final String TAG = "MBServiceCompat";
    final ArrayMap<IBinder, ConnectionRecord> mConnections = new ArrayMap<>();
    ConnectionRecord mCurConnection;
    final ServiceHandler mHandler = new ServiceHandler();
    private MediaBrowserServiceImpl mImpl;
    MediaSessionCompat.Token mSession;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$BrowserRoot */
    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(String str, Bundle bundle) {
            if (str != null) {
                this.mRootId = str;
                this.mExtras = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public String getRootId() {
            return this.mRootId;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ConnectionRecord */
    public static class ConnectionRecord {
        ServiceCallbacks callbacks;
        String pkg;
        BrowserRoot root;
        Bundle rootHints;
        HashMap<String, List<Pair<IBinder, Bundle>>> subscriptions = new HashMap<>();

        ConnectionRecord() {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl */
    interface MediaBrowserServiceImpl {
        Bundle getBrowserRootHints();

        void notifyChildrenChanged(String str, Bundle bundle);

        IBinder onBind(Intent intent);

        void onCreate();

        void setSessionToken(MediaSessionCompat.Token token);
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 */
    class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy {
        Messenger mMessenger;
        final List<Bundle> mRootExtrasList = new ArrayList();
        Object mServiceObj;

        MediaBrowserServiceImplApi21() {
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
            if (this.mMessenger == null) {
                return null;
            }
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem or onSearch methods");
            } else if (connectionRecord.rootHints == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
            }
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final String str, final Bundle bundle) {
            if (this.mMessenger == null) {
                MediaBrowserServiceCompatApi21.notifyChildrenChanged(this.mServiceObj, str);
            } else {
                MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                    /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.RunnableC03372 */

                    public void run() {
                        for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(iBinder);
                            List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
                            if (list != null) {
                                for (Pair<IBinder, Bundle> pair : list) {
                                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, pair.second)) {
                                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, pair.second);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            return MediaBrowserServiceCompatApi21.onBind(this.mServiceObj, intent);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            Object createService = MediaBrowserServiceCompatApi21.createService(MediaBrowserServiceCompat.this, this);
            this.mServiceObj = createService;
            MediaBrowserServiceCompatApi21.onCreate(createService);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(MediaBrowserProtocol.EXTRA_CLIENT_VERSION);
                this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                bundle2 = new Bundle();
                bundle2.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 1);
                BundleCompat.putBinder(bundle2, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, this.mMessenger.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.mSession;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    BundleCompat.putBinder(bundle2, MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.mRootExtrasList.add(bundle2);
                }
            }
            BrowserRoot onGetRoot = MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
            if (onGetRoot == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = onGetRoot.getExtras();
            } else if (onGetRoot.getExtras() != null) {
                bundle2.putAll(onGetRoot.getExtras());
            }
            return new MediaBrowserServiceCompatApi21.BrowserRoot(onGetRoot.getRootId(), bundle2);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompatApi21.ServiceCompatProxy
        public void onLoadChildren(String str, final MediaBrowserServiceCompatApi21.ResultWrapper<List<Parcel>> resultWrapper) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new Result<List<MediaBrowserCompat.MediaItem>>(str) {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.C03383 */

                @Override // android.support.p009v4.media.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                /* access modifiers changed from: package-private */
                public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    resultWrapper.sendResult(arrayList);
                }
            });
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.RunnableC03361 */

                public void run() {
                    if (!MediaBrowserServiceImplApi21.this.mRootExtrasList.isEmpty()) {
                        IMediaSession extraBinder = token.getExtraBinder();
                        if (extraBinder != null) {
                            for (Bundle bundle : MediaBrowserServiceImplApi21.this.mRootExtrasList) {
                                BundleCompat.putBinder(bundle, MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder.asBinder());
                            }
                        }
                        MediaBrowserServiceImplApi21.this.mRootExtrasList.clear();
                    }
                    MediaBrowserServiceCompatApi21.setSessionToken(MediaBrowserServiceImplApi21.this.mServiceObj, token.getToken());
                }
            });
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 */
    class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 implements MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        MediaBrowserServiceImplApi23() {
            super();
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl, android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        public void onCreate() {
            Object createService = MediaBrowserServiceCompatApi23.createService(MediaBrowserServiceCompat.this, this);
            this.mServiceObj = createService;
            MediaBrowserServiceCompatApi21.onCreate(createService);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompatApi23.ServiceCompatProxy
        public void onLoadItem(String str, final MediaBrowserServiceCompatApi21.ResultWrapper<Parcel> resultWrapper) {
            MediaBrowserServiceCompat.this.onLoadItem(str, new Result<MediaBrowserCompat.MediaItem>(str) {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.C03391 */

                @Override // android.support.p009v4.media.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                /* access modifiers changed from: package-private */
                public void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                    MediaBrowserServiceCompatApi21.ResultWrapper resultWrapper;
                    Parcel parcel;
                    if (mediaItem == null) {
                        resultWrapper = resultWrapper;
                        parcel = null;
                    } else {
                        parcel = Parcel.obtain();
                        mediaItem.writeToParcel(parcel, 0);
                        resultWrapper = resultWrapper;
                    }
                    resultWrapper.sendResult(parcel);
                }
            });
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi24 */
    class MediaBrowserServiceImplApi24 extends MediaBrowserServiceImplApi23 implements MediaBrowserServiceCompatApi24.ServiceCompatProxy {
        MediaBrowserServiceImplApi24() {
            super();
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl, android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        public Bundle getBrowserRootHints() {
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord == null) {
                return MediaBrowserServiceCompatApi24.getBrowserRootHints(this.mServiceObj);
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl, android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21
        public void notifyChildrenChanged(String str, Bundle bundle) {
            if (bundle == null) {
                MediaBrowserServiceCompatApi21.notifyChildrenChanged(this.mServiceObj, str);
            } else {
                MediaBrowserServiceCompatApi24.notifyChildrenChanged(this.mServiceObj, str, bundle);
            }
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl, android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21, android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23
        public void onCreate() {
            Object createService = MediaBrowserServiceCompatApi24.createService(MediaBrowserServiceCompat.this, this);
            this.mServiceObj = createService;
            MediaBrowserServiceCompatApi21.onCreate(createService);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompatApi24.ServiceCompatProxy
        public void onLoadChildren(String str, final MediaBrowserServiceCompatApi24.ResultWrapper resultWrapper, Bundle bundle) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new Result<List<MediaBrowserCompat.MediaItem>>(str) {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi24.C03401 */

                @Override // android.support.p009v4.media.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                /* access modifiers changed from: package-private */
                public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    resultWrapper.sendResult(arrayList, getFlags());
                }
            }, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$MediaBrowserServiceImplBase */
    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;

        MediaBrowserServiceImplBase() {
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mCurConnection;
            if (connectionRecord == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem or onSearch methods");
            } else if (connectionRecord.rootHints == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
            }
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.RunnableC03422 */

                public void run() {
                    for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                        ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(iBinder);
                        List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
                        if (list != null) {
                            for (Pair<IBinder, Bundle> pair : list) {
                                if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, pair.second)) {
                                    MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, pair.second);
                                }
                            }
                        }
                    }
                }
            });
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            if (MediaBrowserServiceCompat.SERVICE_INTERFACE.equals(intent.getAction())) {
                return this.mMessenger.getBinder();
            }
            return null;
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.RunnableC03411 */

                public void run() {
                    Iterator<ConnectionRecord> it = MediaBrowserServiceCompat.this.mConnections.values().iterator();
                    while (it.hasNext()) {
                        ConnectionRecord next = it.next();
                        try {
                            next.callbacks.onConnect(next.root.getRootId(), token, next.root.getExtras());
                        } catch (RemoteException unused) {
                            Log.w(MediaBrowserServiceCompat.TAG, "Connection for " + next.pkg + " is no longer valid.");
                            it.remove();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$Result */
    public static class Result<T> {
        private final Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendProgressUpdateCalled;
        private boolean mSendResultCalled;

        Result(Object obj) {
            this.mDebug = obj;
        }

        private void checkExtraFields(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                if (f < -1.0E-5f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        public void detach() {
            if (this.mDetachCalled) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.mDebug);
            } else if (this.mSendResultCalled) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.mDebug);
            } else if (!this.mSendErrorCalled) {
                this.mDetachCalled = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.mDebug);
            }
        }

        /* access modifiers changed from: package-private */
        public int getFlags() {
            return this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public boolean isDone() {
            return this.mDetachCalled || this.mSendResultCalled || this.mSendErrorCalled;
        }

        /* access modifiers changed from: package-private */
        public void onErrorSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.mDebug);
        }

        /* access modifiers changed from: package-private */
        public void onProgressUpdateSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.mDebug);
        }

        /* access modifiers changed from: package-private */
        public void onResultSent(T t) {
        }

        public void sendError(Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            this.mSendErrorCalled = true;
            onErrorSent(bundle);
        }

        public void sendProgressUpdate(Bundle bundle) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            checkExtraFields(bundle);
            this.mSendProgressUpdateCalled = true;
            onProgressUpdateSent(bundle);
        }

        public void sendResult(T t) {
            if (this.mSendResultCalled || this.mSendErrorCalled) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.mDebug);
            }
            this.mSendResultCalled = true;
            onResultSent(t);
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i) {
            this.mFlags = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ResultFlags */
    private @interface ResultFlags {
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ServiceBinderImpl */
    private class ServiceBinderImpl {
        ServiceBinderImpl() {
        }

        public void addSubscription(final String str, final IBinder iBinder, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03453 */

                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w(MediaBrowserServiceCompat.TAG, "addSubscription for callback that isn't registered id=" + str);
                        return;
                    }
                    MediaBrowserServiceCompat.this.addSubscription(str, connectionRecord, iBinder, bundle);
                }
            });
        }

        public void connect(final String str, final int i, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i)) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03431 */

                    public void run() {
                        IBinder asBinder = serviceCallbacks.asBinder();
                        MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                        ConnectionRecord connectionRecord = new ConnectionRecord();
                        String str = str;
                        connectionRecord.pkg = str;
                        Bundle bundle = bundle;
                        connectionRecord.rootHints = bundle;
                        connectionRecord.callbacks = serviceCallbacks;
                        BrowserRoot onGetRoot = MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
                        connectionRecord.root = onGetRoot;
                        if (onGetRoot == null) {
                            Log.i(MediaBrowserServiceCompat.TAG, "No root for client " + str + " from service " + getClass().getName());
                            try {
                                serviceCallbacks.onConnectFailed();
                            } catch (RemoteException unused) {
                                Log.w(MediaBrowserServiceCompat.TAG, "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
                            }
                        } else {
                            try {
                                MediaBrowserServiceCompat.this.mConnections.put(asBinder, connectionRecord);
                                if (MediaBrowserServiceCompat.this.mSession != null) {
                                    serviceCallbacks.onConnect(connectionRecord.root.getRootId(), MediaBrowserServiceCompat.this.mSession, connectionRecord.root.getExtras());
                                }
                            } catch (RemoteException unused2) {
                                Log.w(MediaBrowserServiceCompat.TAG, "Calling onConnect() failed. Dropping client. pkg=" + str);
                                MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + str);
        }

        public void disconnect(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03442 */

                public void run() {
                    MediaBrowserServiceCompat.this.mConnections.remove(serviceCallbacks.asBinder());
                }
            });
        }

        public void getMediaItem(final String str, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03475 */

                    public void run() {
                        ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                        if (connectionRecord == null) {
                            Log.w(MediaBrowserServiceCompat.TAG, "getMediaItem for callback that isn't registered id=" + str);
                            return;
                        }
                        MediaBrowserServiceCompat.this.performLoadItem(str, connectionRecord, resultReceiver);
                    }
                });
            }
        }

        public void registerCallbacks(final ServiceCallbacks serviceCallbacks, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03486 */

                public void run() {
                    IBinder asBinder = serviceCallbacks.asBinder();
                    MediaBrowserServiceCompat.this.mConnections.remove(asBinder);
                    ConnectionRecord connectionRecord = new ConnectionRecord();
                    connectionRecord.callbacks = serviceCallbacks;
                    connectionRecord.rootHints = bundle;
                    MediaBrowserServiceCompat.this.mConnections.put(asBinder, connectionRecord);
                }
            });
        }

        public void removeSubscription(final String str, final IBinder iBinder, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03464 */

                public void run() {
                    ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        Log.w(MediaBrowserServiceCompat.TAG, "removeSubscription for callback that isn't registered id=" + str);
                    } else if (!MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, iBinder)) {
                        Log.w(MediaBrowserServiceCompat.TAG, "removeSubscription called for " + str + " which is not subscribed");
                    }
                }
            });
        }

        public void search(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03508 */

                    public void run() {
                        ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                        if (connectionRecord == null) {
                            Log.w(MediaBrowserServiceCompat.TAG, "search for callback that isn't registered query=" + str);
                            return;
                        }
                        MediaBrowserServiceCompat.this.performSearch(str, bundle, connectionRecord, resultReceiver);
                    }
                });
            }
        }

        public void sendCustomAction(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                    /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03519 */

                    public void run() {
                        ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.mConnections.get(serviceCallbacks.asBinder());
                        if (connectionRecord == null) {
                            Log.w(MediaBrowserServiceCompat.TAG, "sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                            return;
                        }
                        MediaBrowserServiceCompat.this.performCustomAction(str, bundle, connectionRecord, resultReceiver);
                    }
                });
            }
        }

        public void unregisterCallbacks(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable() {
                /* class android.support.p009v4.media.MediaBrowserServiceCompat.ServiceBinderImpl.RunnableC03497 */

                public void run() {
                    MediaBrowserServiceCompat.this.mConnections.remove(serviceCallbacks.asBinder());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ServiceCallbacks */
    public interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle);

        void onConnectFailed();

        void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ServiceCallbacksCompat */
    private static class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger mCallbacks;

        ServiceCallbacksCompat(Messenger messenger) {
            this.mCallbacks = messenger;
        }

        private void sendRequest(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            this.mCallbacks.send(obtain);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnect(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN, token);
            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
            sendRequest(1, bundle2);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onConnectFailed() {
            sendRequest(2, null);
        }

        @Override // android.support.p009v4.media.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            if (list != null) {
                bundle2.putParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            sendRequest(3, bundle2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$ServiceHandler */
    public final class ServiceHandler extends Handler {
        private final ServiceBinderImpl mServiceBinderImpl;

        ServiceHandler() {
            this.mServiceBinderImpl = new ServiceBinderImpl();
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.mServiceBinderImpl.connect(data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 2:
                    this.mServiceBinderImpl.disconnect(new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 3:
                    this.mServiceBinderImpl.addSubscription(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), BundleCompat.getBinder(data, MediaBrowserProtocol.DATA_CALLBACK_TOKEN), data.getBundle(MediaBrowserProtocol.DATA_OPTIONS), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 4:
                    this.mServiceBinderImpl.removeSubscription(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), BundleCompat.getBinder(data, MediaBrowserProtocol.DATA_CALLBACK_TOKEN), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 5:
                    this.mServiceBinderImpl.getMediaItem(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 6:
                    this.mServiceBinderImpl.registerCallbacks(new ServiceCallbacksCompat(message.replyTo), data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                    return;
                case 7:
                    this.mServiceBinderImpl.unregisterCallbacks(new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 8:
                    this.mServiceBinderImpl.search(data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY), data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new ServiceCallbacksCompat(message.replyTo));
                    return;
                case 9:
                    this.mServiceBinderImpl.sendCustomAction(data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION), data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new ServiceCallbacksCompat(message.replyTo));
                    return;
                default:
                    Log.w(MediaBrowserServiceCompat.TAG, "Unhandled message: " + message + "\n  Service version: " + 1 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void addSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (Pair<IBinder, Bundle> pair : list) {
            if (iBinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, pair.second)) {
                return;
            }
        }
        list.add(new Pair<>(iBinder, bundle));
        connectionRecord.subscriptions.put(str, list);
        performLoadChildren(str, connectionRecord, bundle);
    }

    /* access modifiers changed from: package-private */
    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        if (i == -1 && i2 == -1) {
            return list;
        }
        int i3 = i2 * i;
        int i4 = i3 + i2;
        if (i < 0 || i2 < 1 || i3 >= list.size()) {
            return Collections.EMPTY_LIST;
        }
        if (i4 > list.size()) {
            i4 = list.size();
        }
        return list.subList(i3, i4);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.getBrowserRootHints();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    /* access modifiers changed from: package-private */
    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void notifyChildrenChanged(String str) {
        if (str != null) {
            this.mImpl.notifyChildrenChanged(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.mImpl.notifyChildrenChanged(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public IBinder onBind(Intent intent) {
        return this.mImpl.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        this.mImpl = i >= 26 ? new MediaBrowserServiceImplApi24() : i >= 23 ? new MediaBrowserServiceImplApi23() : i >= 21 ? new MediaBrowserServiceImplApi21() : new MediaBrowserServiceImplBase();
        this.mImpl.onCreate();
    }

    public void onCustomAction(String str, Bundle bundle, Result<Bundle> result) {
        result.sendError(null);
    }

    public abstract BrowserRoot onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result, Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, Result<MediaBrowserCompat.MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(String str, Bundle bundle, Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    /* access modifiers changed from: package-private */
    public void performCustomAction(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        C03354 r0 = new Result<Bundle>(str) {
            /* class android.support.p009v4.media.MediaBrowserServiceCompat.C03354 */

            /* access modifiers changed from: package-private */
            @Override // android.support.p009v4.media.MediaBrowserServiceCompat.Result
            public void onErrorSent(Bundle bundle) {
                resultReceiver.send(-1, bundle);
            }

            /* access modifiers changed from: package-private */
            @Override // android.support.p009v4.media.MediaBrowserServiceCompat.Result
            public void onProgressUpdateSent(Bundle bundle) {
                resultReceiver.send(1, bundle);
            }

            /* access modifiers changed from: package-private */
            public void onResultSent(Bundle bundle) {
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onCustomAction(str, bundle, r0);
        this.mCurConnection = null;
        if (!r0.isDone()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void performLoadChildren(final String str, final ConnectionRecord connectionRecord, final Bundle bundle) {
        C03321 r6 = new Result<List<MediaBrowserCompat.MediaItem>>(str) {
            /* class android.support.p009v4.media.MediaBrowserServiceCompat.C03321 */

            /* access modifiers changed from: package-private */
            public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                if (MediaBrowserServiceCompat.this.mConnections.get(connectionRecord.callbacks.asBinder()) == connectionRecord) {
                    if ((getFlags() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    try {
                        connectionRecord.callbacks.onLoadChildren(str, list, bundle);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserServiceCompat.TAG, "Calling onLoadChildren() failed for id=" + str + " package=" + connectionRecord.pkg);
                    }
                } else if (MediaBrowserServiceCompat.DEBUG) {
                    Log.d(MediaBrowserServiceCompat.TAG, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + connectionRecord.pkg + " id=" + str);
                }
            }
        };
        this.mCurConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, r6);
        } else {
            onLoadChildren(str, r6, bundle);
        }
        this.mCurConnection = null;
        if (!r6.isDone()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + connectionRecord.pkg + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public void performLoadItem(String str, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        C03332 r0 = new Result<MediaBrowserCompat.MediaItem>(str) {
            /* class android.support.p009v4.media.MediaBrowserServiceCompat.C03332 */

            /* access modifiers changed from: package-private */
            public void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onLoadItem(str, r0);
        this.mCurConnection = null;
        if (!r0.isDone()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public void performSearch(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        C03343 r0 = new Result<List<MediaBrowserCompat.MediaItem>>(str) {
            /* class android.support.p009v4.media.MediaBrowserServiceCompat.C03343 */

            /* access modifiers changed from: package-private */
            public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                resultReceiver.send(0, bundle);
            }
        };
        this.mCurConnection = connectionRecord;
        onSearch(str, bundle, r0);
        this.mCurConnection = null;
        if (!r0.isDone()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean removeSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z = false;
        if (iBinder == null) {
            return connectionRecord.subscriptions.remove(str) != null;
        }
        List<Pair<IBinder, Bundle>> list = connectionRecord.subscriptions.get(str);
        if (list != null) {
            Iterator<Pair<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().first) {
                    it.remove();
                    z = true;
                }
            }
            if (list.size() == 0) {
                connectionRecord.subscriptions.remove(str);
            }
        }
        return z;
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.mSession == null) {
            this.mSession = token;
            this.mImpl.setSessionToken(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }
}
