package com.google.android.libraries.cast.companionlibrary.cast.player;

import com.google.android.gms.cast.MediaTrack;

import java.util.List;

public interface OnVideoCastControllerListener{



public abstract void onConfigurationChanged();
public abstract void onPlayPauseClicked(android.view.View p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
public abstract void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2);
public abstract void onSkipNextClicked(android.view.View p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
public abstract void onSkipPreviousClicked(android.view.View p0) throws com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException, com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
public abstract void onStartTrackingTouch(android.widget.SeekBar p0);
public abstract void onStopTrackingTouch(android.widget.SeekBar p0);
public void onTracksSelected(List<MediaTrack> tracks);

}
