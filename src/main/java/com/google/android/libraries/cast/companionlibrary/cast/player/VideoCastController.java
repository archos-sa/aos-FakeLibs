package com.google.android.libraries.cast.companionlibrary.cast.player;
public abstract interface VideoCastController
{

public static final int CC_DISABLED=2;
public static final int CC_ENABLED=1;
public static final int CC_HIDDEN=3;


public abstract void adjustControllersForLiveStream(boolean p0);
public abstract void closeActivity();
public abstract void onQueueItemsUpdated(int p0, int p1);
public abstract void setClosedCaptionState(int p0);
public abstract void setImage(android.graphics.Bitmap p0);
public abstract void setNextPreviousVisibilityPolicy(int p0);
public abstract void setOnVideoCastControllerChangedListener(com.google.android.libraries.cast.companionlibrary.cast.player.OnVideoCastControllerListener p0);
public abstract void setPlaybackStatus(int p0);
public abstract void setStreamType(int p0);
public abstract void setSubTitle(java.lang.String p0);
public abstract void setTitle(java.lang.String p0);
public abstract void showLoading(boolean p0);
public abstract void updateControllersStatus(boolean p0);
public abstract void updateSeekbar(int p0, int p1);
}
