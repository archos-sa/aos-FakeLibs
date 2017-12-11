package com.google.android.libraries.cast.companionlibrary.cast.tracks;

import com.google.android.gms.cast.MediaTrack;

import java.util.List;

/**
 * Created by alexandre on 11/12/17.
 */

public interface OnTracksSelectedListener {
    public void onTracksSelected(List<MediaTrack> tracks);
}
