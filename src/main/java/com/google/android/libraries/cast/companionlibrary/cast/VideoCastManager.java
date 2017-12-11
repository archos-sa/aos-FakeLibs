package com.google.android.libraries.cast.companionlibrary.cast;

import android.support.v7.media.MediaRouter;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;

public class VideoCastManager {

private android.media.AudioManager mAudioManager;
private com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthService mAuthService;
private java.lang.String mDataNamespace;
private int mIdleReason;
private long mLiveStreamDuration;
private com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask mLockScreenFetchTask;
private com.google.android.libraries.cast.companionlibrary.cast.MediaQueue mMediaQueue;
private android.support.v4.media.session.MediaSessionCompat mMediaSessionCompat;
private com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask mMediaSessionIconFetchTask;
private com.google.android.gms.cast.MediaStatus mMediaStatus;
private final java.util.Set mMiniControllers = (java.util.Set) null;
private java.lang.Class mNotificationServiceClass;
private com.google.android.gms.cast.MediaQueueItem mPreLoadingItem;
private java.util.concurrent.ScheduledFuture mProgressHandler;
private final java.lang.Runnable mProgressRunnable = (java.lang.Runnable) null;
private final java.util.Set mProgressWatchers = (java.util.Set) null;
private com.google.android.gms.cast.RemoteMediaPlayer mRemoteMediaPlayer;
private int mState;
private java.lang.Class mTargetActivity;
private final java.util.Set mTracksSelectedListeners = (java.util.Set) null;
private final java.util.Set mVideoConsumers = (java.util.Set) null;
private double mVolumeStep;
private final java.util.concurrent.ScheduledExecutorService scheduler = (java.util.concurrent.ScheduledExecutorService) null;
public static final long DEFAULT_LIVE_STREAM_DURATION_MS=7200000l;
public static final java.lang.Class DEFAULT_TARGET_ACTIVITY= null;
public static final double DEFAULT_VOLUME_STEP=0.05d;
public static final java.lang.String EXTRA_CUSTOM_DATA= null;
public static final java.lang.String EXTRA_HAS_AUTH= null;
public static final java.lang.String EXTRA_MEDIA= null;
public static final java.lang.String EXTRA_SHOULD_START= null;
public static final java.lang.String EXTRA_START_POINT= null;
public static final java.lang.String PREFS_KEY_START_ACTIVITY= null;
public static final int QUEUE_OPERATION_APPEND=9;
public static final int QUEUE_OPERATION_INSERT_ITEMS=2;
public static final int QUEUE_OPERATION_JUMP=4;
public static final int QUEUE_OPERATION_LOAD=1;
public static final int QUEUE_OPERATION_MOVE=8;
public static final int QUEUE_OPERATION_NEXT=10;
public static final int QUEUE_OPERATION_PREV=11;
public static final int QUEUE_OPERATION_REMOVE_ITEM=5;
public static final int QUEUE_OPERATION_REMOVE_ITEMS=6;
public static final int QUEUE_OPERATION_REORDER=7;
public static final int QUEUE_OPERATION_SET_REPEAT=12;
public static final int QUEUE_OPERATION_UPDATE_ITEMS=3;
private static final java.lang.String TAG= null;
private static com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager sInstance= null;

/** Empty implementation */
private VideoCastManager() {
super ();
 }

/** Empty implementation */
protected VideoCastManager(android.content.Context p0, com.google.android.libraries.cast.companionlibrary.cast.CastConfiguration p1) {
super ();
 }


/** Empty implementation */
static java.util.Set access$000(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
return null;
}

/** Empty implementation */
static java.lang.String access$100() {
return null;
}

/** Empty implementation */
static com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask access$1002(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask p1) {
return null;
}

/** Empty implementation */
static void access$1100(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, int p1) {
}

/** Empty implementation */
static void access$1200(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
}

/** Empty implementation */
static void access$1300(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
}

/** Empty implementation */
static com.google.android.libraries.cast.companionlibrary.cast.tracks.TracksPreferenceManager access$1400(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
return null;
}

/** Empty implementation */
static int access$1500(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
return 0;
}

/** Empty implementation */
static void access$1600(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, int p1, int p2) {
}

/** Empty implementation */
static void access$200(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
}

/** Empty implementation */
static void access$300(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
}

/** Empty implementation */
static com.google.android.gms.cast.MediaStatus access$400(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
return null;
}

/** Empty implementation */
static com.google.android.gms.cast.MediaStatus access$402(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, com.google.android.gms.cast.MediaStatus p1) {
return null;
}

/** Empty implementation */
static com.google.android.gms.cast.RemoteMediaPlayer access$500(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
return null;
}

/** Empty implementation */
static void access$600(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, java.util.List p1, com.google.android.gms.cast.MediaQueueItem p2, int p3, boolean p4) {
}

/** Empty implementation */
static void access$700(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, int p1) {
}

/** Empty implementation */
static android.support.v4.media.session.MediaSessionCompat access$800(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0) {
return null;
}

/** Empty implementation */
static com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask access$902(com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager p0, com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask p1) {
return null;
}

/** Empty implementation */
private void attachDataChannel() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
private void attachMediaChannel() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
private boolean changeVolume(double p0, boolean p1) {
return false;
}

/** Empty implementation */
private void checkRemoteMediaPlayerAvailable() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc0=null;
if (false) throw exc0;
}

/** Empty implementation */
private void detachMediaChannel() {
}

/** Empty implementation */
private android.app.PendingIntent getCastControllerPendingIntent() {
return null;
}

/** Empty implementation */
public static com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager getInstance() {
return null;
}

/** Empty implementation */
public static synchronized com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager initialize(android.content.Context p0, com.google.android.libraries.cast.companionlibrary.cast.CastConfiguration p1) {
return null;
}

/** Empty implementation */
private void onApplicationDisconnected(int p0) {
}

/** Empty implementation */
private void onApplicationStatusChanged() {
}

/** Empty implementation */
private void onMessageSendFailed(int p0) {
}

/** Empty implementation */
private void onQueueUpdated(java.util.List p0, com.google.android.gms.cast.MediaQueueItem p1, int p2, boolean p3) {
}

/** Empty implementation */
private void onRemoteMediaPlayerStatusUpdated() {
}

/** Empty implementation */
private void onRemoteMediaPreloadStatusUpdated() {
}

/** Empty implementation */
private void onVolumeChanged() {
}

/** Empty implementation */
private void reattachDataChannel() {
}

/** Empty implementation */
private void reattachMediaChannel() {
}

/** Empty implementation */
private void registerCaptionListener(android.content.Context p0) {
}

/** Empty implementation */
private void restartProgressTimer() {
}

/** Empty implementation */
private void setBitmapForLockScreen(com.google.android.gms.cast.MediaInfo p0) {
}

/** Empty implementation */
private void setFlagForStartCastControllerActivity() {
}

/** Empty implementation */
private void setUpMediaSession(com.google.android.gms.cast.MediaInfo p0) {
}

/** Empty implementation */
private boolean startNotificationService() {
return false;
}

/** Empty implementation */
private void stopNotificationService() {
}

/** Empty implementation */
private void stopProgressTimer() {
}

/** Empty implementation */
private void updateLockScreenImage(com.google.android.gms.cast.MediaInfo p0) {
}

/** Empty implementation */
private void updateMediaSession(boolean p0) {
}

/** Empty implementation */
private void updateMediaSessionMetadata() {
}


/** Empty implementation */
public void addMiniController(com.google.android.libraries.cast.companionlibrary.widgets.IMiniController p0) {
}


/** Empty implementation */
public void addTracksSelectedListener(com.google.android.libraries.cast.companionlibrary.cast.tracks.OnTracksSelectedListener p0) {
}

/** Empty implementation */
public synchronized void addVideoCastConsumer(com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumer p0) {
}

/** Empty implementation */
public void adjustVolume(double p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void clearMediaSession() {
}

/** Empty implementation */
public void forward(int p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public long[] getActiveTrackIds() {
return null;
}

/** Empty implementation */
protected com.google.android.gms.cast.Cast.CastOptions.Builder getCastOptionBuilder(com.google.android.gms.cast.CastDevice p0) {
return null;
}

/** Empty implementation */
public long getCurrentMediaPosition() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return 0;
}

/** Empty implementation */
protected java.lang.String getDataNamespace() {
return null;
}

/** Empty implementation */
public int getIdleReason() {
return 0;
}

/** Empty implementation */
public com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthService getMediaAuthService() {
return null;
}

/** Empty implementation */
public long getMediaDuration() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return 0;
}

/** Empty implementation */
public final com.google.android.libraries.cast.companionlibrary.cast.MediaQueue getMediaQueue() {
return null;
}


/** Empty implementation */
public final com.google.android.gms.cast.MediaStatus getMediaStatus() {
return null;
}

/** Empty implementation */
public long getMediaTimeRemaining() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return 0;
}

/** Empty implementation */
public final java.lang.Class getNotificationServiceClass() {
return null;
}

/** Empty implementation */
public int getPlaybackStatus() {
return 0;
}

/** Empty implementation */
public com.google.android.gms.cast.MediaQueueItem getPreLoadingItem() {
return null;
}

/** Empty implementation */
public com.google.android.gms.cast.MediaInfo getRemoteMediaInformation() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return null;
}

/** Empty implementation */
public final com.google.android.gms.cast.RemoteMediaPlayer getRemoteMediaPlayer() {
return null;
}

/** Empty implementation */
public java.lang.String getRemoteMediaUrl() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return null;
}

/** Empty implementation */
public java.lang.Class getTargetActivity() {
return null;
}

/** Empty implementation */
public com.google.android.libraries.cast.companionlibrary.cast.tracks.TracksPreferenceManager getTracksPreferenceManager() {
return null;
}

/** Empty implementation */
public double getVolume() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return 0;
}

/** Empty implementation */
public double getVolumeStep() {
return 0;
}

/** Empty implementation */
public boolean isMute() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return false;
}

/** Empty implementation */
public boolean isRemoteMediaLoaded() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return false;
}

/** Empty implementation */
public boolean isRemoteMediaPaused() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return false;
}

/** Empty implementation */
public boolean isRemoteMediaPlaying() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return false;
}

/** Empty implementation */
public final boolean isRemoteStreamLive() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return false;
}

/** Empty implementation */
public void loadMedia(com.google.android.gms.cast.MediaInfo p0, boolean p1, int p2) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void loadMedia(com.google.android.gms.cast.MediaInfo p0, boolean p1, int p2, org.json.JSONObject p3) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void loadMedia(com.google.android.gms.cast.MediaInfo p0, long[] p1, boolean p2, int p3, org.json.JSONObject p4) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void notifyTracksSelectedListeners(java.util.List p0) {
}

/** Empty implementation */
protected void onApplicationConnected(com.google.android.gms.cast.ApplicationMetadata p0, java.lang.String p1, java.lang.String p2, boolean p3) {
}

/** Empty implementation */
public void onApplicationConnectionFailed(int p0) {
}

/** Empty implementation */
public void onApplicationStopFailed(int p0) {
}

/** Empty implementation */
public void onConnectionFailed(com.google.android.gms.common.ConnectionResult p0) {
}

/** Empty implementation */
public void onConnectivityRecovered() {
}

/** Empty implementation */
protected void onDeviceUnselected() {
}

/** Empty implementation */
public void onDisconnected(boolean p0, boolean p1, boolean p2) {
}

/** Empty implementation */
public boolean onDispatchVolumeKeyEvent(android.view.KeyEvent p0, double p1) {
return false;
}

/** Empty implementation */
public void onFailed(int p0, int p1) {
}

/** Empty implementation */
public void onPlayPauseClicked(android.view.View p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void onRemoteMediaPlayerMetadataUpdated() {
}

/** Empty implementation */
public void onTargetActivityInvoked(android.content.Context p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void onTextTrackEnabledChanged(boolean p0) {
}

/** Empty implementation */
public void onTextTrackLocaleChanged(java.util.Locale p0) {
}

/** Empty implementation */
public void onTextTrackStyleChanged(com.google.android.gms.cast.TextTrackStyle p0) {
}

/** Empty implementation */
public void onUpcomingPlayClicked(android.view.View p0, com.google.android.gms.cast.MediaQueueItem p1) {
}

/** Empty implementation */
public void onUpcomingStopClicked(android.view.View p0, com.google.android.gms.cast.MediaQueueItem p1) {
}

/** Empty implementation */
public void pause() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void pause(org.json.JSONObject p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void play() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void play(int p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void play(org.json.JSONObject p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueAppendItem(com.google.android.gms.cast.MediaQueueItem p0, org.json.JSONObject p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueInsertBeforeCurrentAndPlay(com.google.android.gms.cast.MediaQueueItem p0, int p1, org.json.JSONObject p2) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueInsertItems(com.google.android.gms.cast.MediaQueueItem[] p0, int p1, org.json.JSONObject p2) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueJumpToItem(int p0, org.json.JSONObject p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException, java.lang.IllegalArgumentException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
java.lang.IllegalArgumentException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void queueLoad(com.google.android.gms.cast.MediaQueueItem[] p0, int p1, int p2, org.json.JSONObject p3) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueMoveItemToNewIndex(int p0, int p1, org.json.JSONObject p2) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueNext(org.json.JSONObject p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queuePrev(org.json.JSONObject p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueRemoveItem(int p0, org.json.JSONObject p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException, java.lang.IllegalArgumentException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
java.lang.IllegalArgumentException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void queueRemoveItems(int[] p0, org.json.JSONObject p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException, java.lang.IllegalArgumentException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
java.lang.IllegalArgumentException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void queueReorderItems(int[] p0, int p1, org.json.JSONObject p2) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException, java.lang.IllegalArgumentException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
java.lang.IllegalArgumentException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void queueSetRepeatMode(int p0, org.json.JSONObject p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void queueUpdateItems(com.google.android.gms.cast.MediaQueueItem[] p0, org.json.JSONObject p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public boolean removeDataChannel() {
return false;
}

/** Empty implementation */
public void removeMediaAuthService() {
}

/** Empty implementation */
public void removeMiniController(com.google.android.libraries.cast.companionlibrary.widgets.IMiniController p0) {
}




/** Empty implementation */
public synchronized void removeVideoCastConsumer(com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumer p0) {
}

/** Empty implementation */
public void seek(int p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void seekAndPlay(int p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void sendDataMessage(java.lang.String p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void setActiveTrackIds(long[] p0) {
}

/** Empty implementation */
public void setActiveTracks(java.util.List p0) {
}

/** Empty implementation */
public void setLiveStreamDuration(long p0) {
}

/** Empty implementation */
public void setMediaAuthService(com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthService p0) {
}

/** Empty implementation */
public void setMute(boolean p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void setTextTrackStyle(com.google.android.gms.cast.TextTrackStyle p0) {
}

/** Empty implementation */
public void setVolume(double p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager setVolumeStep(double p0) {
return null;
}


/** Empty implementation */
protected void setupTrackManager() {
}

/** Empty implementation */
public boolean shouldRemoteUiBeVisible(int p0, int p1) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
return false;
}

/** Empty implementation */
public void startVideoCastControllerActivity(android.content.Context p0, android.os.Bundle p1, int p2, boolean p3) {
}

/** Empty implementation */
public void startVideoCastControllerActivity(android.content.Context p0, android.os.Bundle p1, int p2, boolean p3, org.json.JSONObject p4) {
}

/** Empty implementation */
public void startVideoCastControllerActivity(android.content.Context p0, com.google.android.gms.cast.MediaInfo p1, int p2, boolean p3) {
}

/** Empty implementation */
public void startVideoCastControllerActivity(android.content.Context p0, com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthService p1) {
}

/** Empty implementation */
public void stop() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void stop(org.json.JSONObject p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc1=null;
if (false) throw exc1;
}

/** Empty implementation */
public void togglePlayback() throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException {
com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException exc0=null;
if (false) throw exc0;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException exc1=null;
if (false) throw exc1;
com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException exc2=null;
if (false) throw exc2;
}

/** Empty implementation */
public void updateCaptionSummary(java.lang.String p0, android.preference.PreferenceScreen p1) {
}

/** Empty implementation */
public void updateMiniControllersVisibility(boolean p0) {
}

/** Empty implementation */
public void updateMiniControllersVisibilityForUpcoming(com.google.android.gms.cast.MediaQueueItem p0) {
}

/** Empty implementation */
public void updateVolume(int p0) {
}

 public PreferenceAccessor getPreferenceAccessor() {
  return null;
 }

 public CastConfiguration getCastConfiguration() {
  return null;
 }

 public boolean isConnected() {
  return false;
 }

 public void disconnect() {

 }

 public void removeBaseCastConsumer(VideoCastConsumerImpl mCastConsumer) {

 }

 public void incrementUiCounter() {

 }

 public MenuItem addMediaRouterButton(Menu menu, int media_route_menu_item) {
  return null;
 }

 public void decrementUiCounter() {

 }

 public boolean isConnecting() {
  return false;
 }

 public void onDeviceSelected(CastDevice selectedDevice, MediaRouter.RouteInfo selectedRoute) {

 }

 public static class PreferenceAccessor{

  public boolean getBooleanFromPreference(String prefsKeyStartActivity, boolean b) {
   return false;
  }

  public void saveBooleanToPreference(String prefsKeyStartActivity, boolean b) {

  }

  public void saveStringToPreference(String prefsKeyRouteId, String id) {

  }
 }
}
