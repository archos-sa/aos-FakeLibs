package com.google.android.libraries.cast.companionlibrary.cast.callbacks;

import android.support.v7.media.MediaRouter;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaQueueItem;

public class VideoCastConsumerImpl extends VideoCastConsumer {


/** Empty implementation */
public VideoCastConsumerImpl() {
super ();
 }


/** Empty implementation */
public void onApplicationConnected(com.google.android.gms.cast.ApplicationMetadata p0, java.lang.String p1, boolean p2) {
}

/** Empty implementation */
public void onApplicationConnectionFailed(int p0) {
}

/** Empty implementation */
public void onApplicationDisconnected(int p0) {
}

/** Empty implementation */
public void onApplicationStatusChanged(java.lang.String p0) {
}

/** Empty implementation */
public void onApplicationStopFailed(int p0) {
}

/** Empty implementation */
public void onDataMessageReceived(java.lang.String p0) {
}

/** Empty implementation */
public void onDataMessageSendFailed(int p0) {
}

/** Empty implementation */
public void onMediaLoadResult(int p0) {
}

/** Empty implementation */
public void onMediaQueueOperationResult(int p0, int p1) {
}

/** Empty implementation */
public void onMediaQueueUpdated(java.util.List<MediaQueueItem> p0, com.google.android.gms.cast.MediaQueueItem p1, int p2, boolean p3) {
}

/** Empty implementation */
public void onNamespaceRemoved() {
}

/** Empty implementation */
public void onRemoteMediaPlayerMetadataUpdated() {
}

/** Empty implementation */
public void onRemoteMediaPlayerStatusUpdated() {
}

/** Empty implementation */
public void onRemoteMediaPreloadStatusUpdated(com.google.android.gms.cast.MediaQueueItem p0) {
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
public void onVolumeChanged(double p0, boolean p1) {
}


 public void onDeviceSelected(CastDevice device, MediaRouter.RouteInfo routeInfo) {}

 public void onCastAvailabilityChanged(boolean castPresent) {}


}
