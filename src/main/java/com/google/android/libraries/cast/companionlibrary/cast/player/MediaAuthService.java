package com.google.android.libraries.cast.companionlibrary.cast.player;
public abstract interface MediaAuthService
{



public abstract void abortAuthorization(com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthStatus p0);
public abstract com.google.android.gms.cast.MediaInfo getMediaInfo();
public abstract java.lang.String getPendingMessage();
public abstract com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthStatus getStatus();
public abstract long getTimeout();
public abstract void setMediaAuthListener(com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthListener p0);
public abstract void startAuthorization();
}
