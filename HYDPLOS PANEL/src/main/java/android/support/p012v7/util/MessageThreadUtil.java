package android.support.p012v7.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.p012v7.util.ThreadUtil;
import android.support.p012v7.util.TileList;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.support.v7.util.MessageThreadUtil */
class MessageThreadUtil<T> implements ThreadUtil<T> {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.util.MessageThreadUtil$MessageQueue */
    public static class MessageQueue {
        private SyncQueueItem mRoot;

        MessageQueue() {
        }

        /* access modifiers changed from: package-private */
        public synchronized SyncQueueItem next() {
            SyncQueueItem syncQueueItem = this.mRoot;
            if (syncQueueItem == null) {
                return null;
            }
            this.mRoot = syncQueueItem.next;
            return syncQueueItem;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void removeMessages(int r5) {
            /*
                r4 = this;
                monitor-enter(r4)
            L_0x0001:
                android.support.v7.util.MessageThreadUtil$SyncQueueItem r0 = r4.mRoot     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x0013
                int r1 = r0.what     // Catch:{ all -> 0x002f }
                if (r1 != r5) goto L_0x0013
                android.support.v7.util.MessageThreadUtil$SyncQueueItem r1 = android.support.p012v7.util.MessageThreadUtil.SyncQueueItem.access$000(r0)     // Catch:{ all -> 0x002f }
                r4.mRoot = r1     // Catch:{ all -> 0x002f }
                r0.recycle()     // Catch:{ all -> 0x002f }
                goto L_0x0001
            L_0x0013:
                if (r0 == 0) goto L_0x002d
                android.support.v7.util.MessageThreadUtil$SyncQueueItem r1 = android.support.p012v7.util.MessageThreadUtil.SyncQueueItem.access$000(r0)     // Catch:{ all -> 0x002f }
            L_0x0019:
                if (r1 == 0) goto L_0x002d
                android.support.v7.util.MessageThreadUtil$SyncQueueItem r2 = android.support.p012v7.util.MessageThreadUtil.SyncQueueItem.access$000(r1)     // Catch:{ all -> 0x002f }
                int r3 = r1.what     // Catch:{ all -> 0x002f }
                if (r3 != r5) goto L_0x002a
                android.support.p012v7.util.MessageThreadUtil.SyncQueueItem.access$002(r0, r2)     // Catch:{ all -> 0x002f }
                r1.recycle()     // Catch:{ all -> 0x002f }
                goto L_0x002b
            L_0x002a:
                r0 = r1
            L_0x002b:
                r1 = r2
                goto L_0x0019
            L_0x002d:
                monitor-exit(r4)
                return
            L_0x002f:
                r5 = move-exception
                monitor-exit(r4)
                goto L_0x0033
            L_0x0032:
                throw r5
            L_0x0033:
                goto L_0x0032
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p012v7.util.MessageThreadUtil.MessageQueue.removeMessages(int):void");
        }

        /* access modifiers changed from: package-private */
        public synchronized void sendMessage(SyncQueueItem syncQueueItem) {
            SyncQueueItem syncQueueItem2 = this.mRoot;
            if (syncQueueItem2 == null) {
                this.mRoot = syncQueueItem;
                return;
            }
            while (syncQueueItem2.next != null) {
                syncQueueItem2 = syncQueueItem2.next;
            }
            syncQueueItem2.next = syncQueueItem;
        }

        /* access modifiers changed from: package-private */
        public synchronized void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
            syncQueueItem.next = this.mRoot;
            this.mRoot = syncQueueItem;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.util.MessageThreadUtil$SyncQueueItem */
    public static class SyncQueueItem {
        private static SyncQueueItem sPool;
        private static final Object sPoolLock = new Object();
        public int arg1;
        public int arg2;
        public int arg3;
        public int arg4;
        public int arg5;
        public Object data;
        private SyncQueueItem next;
        public int what;

        SyncQueueItem() {
        }

        static SyncQueueItem obtainMessage(int i, int i2, int i3) {
            return obtainMessage(i, i2, i3, 0, 0, 0, null);
        }

        static SyncQueueItem obtainMessage(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            SyncQueueItem syncQueueItem;
            synchronized (sPoolLock) {
                syncQueueItem = sPool;
                if (syncQueueItem == null) {
                    syncQueueItem = new SyncQueueItem();
                } else {
                    sPool = syncQueueItem.next;
                    syncQueueItem.next = null;
                }
                syncQueueItem.what = i;
                syncQueueItem.arg1 = i2;
                syncQueueItem.arg2 = i3;
                syncQueueItem.arg3 = i4;
                syncQueueItem.arg4 = i5;
                syncQueueItem.arg5 = i6;
                syncQueueItem.data = obj;
            }
            return syncQueueItem;
        }

        static SyncQueueItem obtainMessage(int i, int i2, Object obj) {
            return obtainMessage(i, i2, 0, 0, 0, 0, obj);
        }

        /* access modifiers changed from: package-private */
        public void recycle() {
            this.next = null;
            this.arg5 = 0;
            this.arg4 = 0;
            this.arg3 = 0;
            this.arg2 = 0;
            this.arg1 = 0;
            this.what = 0;
            this.data = null;
            synchronized (sPoolLock) {
                SyncQueueItem syncQueueItem = sPool;
                if (syncQueueItem != null) {
                    this.next = syncQueueItem;
                }
                sPool = this;
            }
        }
    }

    MessageThreadUtil() {
    }

    @Override // android.support.p012v7.util.ThreadUtil
    public ThreadUtil.BackgroundCallback<T> getBackgroundProxy(final ThreadUtil.BackgroundCallback<T> backgroundCallback) {
        return new ThreadUtil.BackgroundCallback<T>() {
            /* class android.support.p012v7.util.MessageThreadUtil.C04802 */
            static final int LOAD_TILE = 3;
            static final int RECYCLE_TILE = 4;
            static final int REFRESH = 1;
            static final int UPDATE_RANGE = 2;
            private Runnable mBackgroundRunnable = new Runnable() {
                /* class android.support.p012v7.util.MessageThreadUtil.C04802.RunnableC04811 */

                public void run() {
                    while (true) {
                        SyncQueueItem next = C04802.this.mQueue.next();
                        if (next == null) {
                            C04802.this.mBackgroundRunning.set(false);
                            return;
                        }
                        int i = next.what;
                        if (i == 1) {
                            C04802.this.mQueue.removeMessages(1);
                            backgroundCallback.refresh(next.arg1);
                        } else if (i == 2) {
                            C04802.this.mQueue.removeMessages(2);
                            C04802.this.mQueue.removeMessages(3);
                            backgroundCallback.updateRange(next.arg1, next.arg2, next.arg3, next.arg4, next.arg5);
                        } else if (i == 3) {
                            backgroundCallback.loadTile(next.arg1, next.arg2);
                        } else if (i != 4) {
                            Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                        } else {
                            backgroundCallback.recycleTile((TileList.Tile) next.data);
                        }
                    }
                }
            };
            AtomicBoolean mBackgroundRunning = new AtomicBoolean(false);
            private final Executor mExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
            final MessageQueue mQueue = new MessageQueue();

            private void maybeExecuteBackgroundRunnable() {
                if (this.mBackgroundRunning.compareAndSet(false, true)) {
                    this.mExecutor.execute(this.mBackgroundRunnable);
                }
            }

            private void sendMessage(SyncQueueItem syncQueueItem) {
                this.mQueue.sendMessage(syncQueueItem);
                maybeExecuteBackgroundRunnable();
            }

            private void sendMessageAtFrontOfQueue(SyncQueueItem syncQueueItem) {
                this.mQueue.sendMessageAtFrontOfQueue(syncQueueItem);
                maybeExecuteBackgroundRunnable();
            }

            @Override // android.support.p012v7.util.ThreadUtil.BackgroundCallback
            public void loadTile(int i, int i2) {
                sendMessage(SyncQueueItem.obtainMessage(3, i, i2));
            }

            @Override // android.support.p012v7.util.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                sendMessage(SyncQueueItem.obtainMessage(4, 0, tile));
            }

            @Override // android.support.p012v7.util.ThreadUtil.BackgroundCallback
            public void refresh(int i) {
                sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(1, i, (Object) null));
            }

            @Override // android.support.p012v7.util.ThreadUtil.BackgroundCallback
            public void updateRange(int i, int i2, int i3, int i4, int i5) {
                sendMessageAtFrontOfQueue(SyncQueueItem.obtainMessage(2, i, i2, i3, i4, i5, null));
            }
        };
    }

    @Override // android.support.p012v7.util.ThreadUtil
    public ThreadUtil.MainThreadCallback<T> getMainThreadProxy(final ThreadUtil.MainThreadCallback<T> mainThreadCallback) {
        return new ThreadUtil.MainThreadCallback<T>() {
            /* class android.support.p012v7.util.MessageThreadUtil.C04781 */
            static final int ADD_TILE = 2;
            static final int REMOVE_TILE = 3;
            static final int UPDATE_ITEM_COUNT = 1;
            private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
            private Runnable mMainThreadRunnable = new Runnable() {
                /* class android.support.p012v7.util.MessageThreadUtil.C04781.RunnableC04791 */

                public void run() {
                    while (true) {
                        SyncQueueItem next = C04781.this.mQueue.next();
                        if (next != null) {
                            int i = next.what;
                            if (i == 1) {
                                mainThreadCallback.updateItemCount(next.arg1, next.arg2);
                            } else if (i == 2) {
                                mainThreadCallback.addTile(next.arg1, (TileList.Tile) next.data);
                            } else if (i != 3) {
                                Log.e("ThreadUtil", "Unsupported message, what=" + next.what);
                            } else {
                                mainThreadCallback.removeTile(next.arg1, next.arg2);
                            }
                        } else {
                            return;
                        }
                    }
                }
            };
            final MessageQueue mQueue = new MessageQueue();

            private void sendMessage(SyncQueueItem syncQueueItem) {
                this.mQueue.sendMessage(syncQueueItem);
                this.mMainThreadHandler.post(this.mMainThreadRunnable);
            }

            @Override // android.support.p012v7.util.ThreadUtil.MainThreadCallback
            public void addTile(int i, TileList.Tile<T> tile) {
                sendMessage(SyncQueueItem.obtainMessage(2, i, tile));
            }

            @Override // android.support.p012v7.util.ThreadUtil.MainThreadCallback
            public void removeTile(int i, int i2) {
                sendMessage(SyncQueueItem.obtainMessage(3, i, i2));
            }

            @Override // android.support.p012v7.util.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i, int i2) {
                sendMessage(SyncQueueItem.obtainMessage(1, i, i2));
            }
        };
    }
}
