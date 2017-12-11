package com.google.android.gms.cast;

import java.util.List;

/**
 * Created by alexandre on 11/12/17.
 */

public class MediaInfo {
    public static final int STREAM_TYPE_BUFFERED = -1;
    public static final int STREAM_TYPE_LIVE = 3;

    public MediaMetadata getMetadata() {
        return null;
    }

    public int getStreamType() {
        return 0;
    }

    public String getContentId() {
        return null;
    }

    public long getStreamDuration() {
        return 0;
    }

    public List<MediaTrack> getMediaTracks() {
    return null;
    }

    public static class Builder {
        public Builder(String castUri) {
        }

        public Builder setStreamType(int streamTypeBuffered) {
            return null;
        }

        public Builder setContentType(String s) {
            return null;
        }

        public Builder setMetadata(MediaMetadata metadata) {
            return null;
        }

        public Builder setMediaTracks(List<MediaTrack> tracks) {
            return null;
        }

        public MediaInfo build() {
            return null;
        }
    }
}
