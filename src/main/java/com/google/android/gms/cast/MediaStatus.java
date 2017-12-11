package com.google.android.gms.cast;

import java.util.List;

/**
 * Created by alexandre on 11/12/17.
 */

public class MediaStatus {
    public static final int PLAYER_STATE_PLAYING = 0;
    public static final int PLAYER_STATE_PAUSED = 1;
    public static final int PLAYER_STATE_IDLE = 2;
    public static final int IDLE_REASON_CANCELED = 4;
    public static final int PLAYER_STATE_BUFFERING = 3;
    public static final int IDLE_REASON_FINISHED = 5;
    public static final int REPEAT_MODE_REPEAT_OFF = 6;
    public static final int IDLE_REASON_ERROR = 7;
    public static final int IDLE_REASON_INTERRUPTED = 8;

    public int getLoadingItemId() {
        return 0;
    }

    public int getPlayerState() {
        return PLAYER_STATE_IDLE;
    }

    public double getStreamVolume() {
        return 0;
    }

    public boolean isMute() {
        return false;
    }

    public List<MediaQueueItem> getQueueItems() {
        return null;
    }

    public int getCurrentItemId() {
        return 0;
    }

    public MediaQueueItem getQueueItemById(int itemId) {
        return null;
    }

    public int getQueueRepeatMode() {
        return 0;
    }

    public int getIdleReason() {
        return 0;
    }

    public int getPreloadedItemId() {
        return 0;
    }

    public long[] getActiveTrackIds() {
        return new long[0];
    }
}
