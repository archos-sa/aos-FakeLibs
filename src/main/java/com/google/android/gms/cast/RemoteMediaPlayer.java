package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

import org.json.JSONObject;

/**
 * Created by alexandre on 11/12/17.
 */

public class RemoteMediaPlayer implements Cast.MessageReceivedCallback{
    public static final int RESUME_STATE_UNCHANGED = 61;
    public static final int RESUME_STATE_PLAY = 62;
    public static final int STATUS_FAILED = 4;
    public static final int STATUS_TIMED_OUT = 5;

    public int getStreamDuration() {
        return 0;
    }

    public MediaInfo getMediaInfo() {
        return null;
    }

    public MediaStatus getMediaStatus() {
        return null;
    }

    public void setStreamMute(GoogleApiClient mApiClient, boolean mute) {

    }

    public int getApproximateStreamPosition() {
        return 0;
    }

    public PendingResult requestStatus(GoogleApiClient mApiClient) {
        return null;
    }

    public PendingResult load(GoogleApiClient mApiClient, MediaInfo media, boolean autoPlay, int position, long[] activeTracks, JSONObject customData) {
        return null;
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onMetadataUpdatedListener) {

    }

    public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener onQueueStatusUpdatedListener) {

    }

    public String getNamespace() {
        return null;
    }

    @Override
    public void onMessageReceived(CastDevice castDevice, String namespace, String message) {

    }

    public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener onPreloadStatusUpdatedListener) {
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onStatusUpdatedListener) {
    }

    public PendingResult seek(GoogleApiClient mApiClient, int position, int resumeStateUnchanged) {
        return null;
    }

    public PendingResult queueLoad(GoogleApiClient mApiClient, MediaQueueItem[] items, int startIndex, int repeatMode, JSONObject customData) {
        return null;
    }

    public PendingResult setActiveMediaTracks(GoogleApiClient mApiClient, long[] trackIds) {
        return null;
    }

    public PendingResult setTextTrackStyle(GoogleApiClient mApiClient, TextTrackStyle style) {
        return null;
    }

    public PendingResult queueJumpToItem(GoogleApiClient mApiClient, int itemId, JSONObject customData) {
        return null;
    }

    public PendingResult setStreamVolume(GoogleApiClient mApiClient, double volume) {
        return null;
    }

    public PendingResult queueInsertItems(GoogleApiClient mApiClient, MediaQueueItem[] itemsToInsert, int insertBeforeItemId, JSONObject customData) {
        return null;
    }

    public PendingResult queueUpdateItems(GoogleApiClient mApiClient, MediaQueueItem[] itemsToUpdate, JSONObject customData) {
        return null;
    }

    public PendingResult queueRemoveItems(GoogleApiClient mApiClient, int[] itemIdsToRemove, JSONObject customData) {
        return null;
    }

    public PendingResult queueRemoveItem(GoogleApiClient mApiClient, int itemId, JSONObject customData) {
        return null;
    }

    public PendingResult queueReorderItems(GoogleApiClient mApiClient, int[] itemIdsToReorder, int insertBeforeItemId, JSONObject customData) {
        return null;
    }

    public PendingResult queueMoveItemToNewIndex(GoogleApiClient mApiClient, int itemId, int newIndex, JSONObject customData) {
        return null;
    }

    public PendingResult queueAppendItem(GoogleApiClient mApiClient, MediaQueueItem item, JSONObject customData) {
        return null;
    }

    public PendingResult queueNext(GoogleApiClient mApiClient, JSONObject customData) {
        return null;
    }

    public PendingResult queuePrev(GoogleApiClient mApiClient, JSONObject customData) {
        return null;
    }

    public PendingResult queueSetRepeatMode(GoogleApiClient mApiClient, int repeatMode, JSONObject customData) {
        return null;
    }

    public PendingResult play(GoogleApiClient mApiClient, JSONObject customData) {
        return null;
    }

    public PendingResult stop(GoogleApiClient mApiClient, JSONObject customData) {
        return null;
    }

    public PendingResult pause(GoogleApiClient mApiClient, JSONObject customData) {
        return null;
    }

    public interface OnQueueStatusUpdatedListener {
        public void onQueueStatusUpdated();
    }

    public interface OnPreloadStatusUpdatedListener {
        public void onPreloadStatusUpdated();
    }

    public interface OnStatusUpdatedListener {
        public void onStatusUpdated();
    }

    public static class MediaChannelResult{

        public Status getStatus() {
            return null;
        }
    }

    public interface OnMetadataUpdatedListener {
        public void onMetadataUpdated();
    }
}
