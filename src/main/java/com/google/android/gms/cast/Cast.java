package com.google.android.gms.cast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

import java.io.IOException;

/**
 * Created by alexandre on 11/12/17.
 */

public class Cast {

    public static final java.lang.String EXTRA_APP_NO_LONGER_RUNNING = "lala";
    public static Object API;

    public static class CastOptions{
        public static Builder builder(CastDevice mSelectedCastDevice, Listener castListener) {
            return null;
        }

        public static class Builder{

            public void setVerboseLoggingEnabled(boolean b) {

            }

            public CastOptions build() {
                return null;
            }
        }
    }
    public static class ApplicationConnectionResult{


        public Status getStatus() {
            return null;
        }

        public ApplicationMetadata getApplicationMetadata() {
            return null;
        }

        public String getApplicationStatus() {
            return null;
        }

        public String getSessionId() {
            return null;
        }

        public boolean getWasLaunched() {
            return false;
        }
    }
    public interface MessageReceivedCallback{
        public void onMessageReceived(CastDevice castDevice, String namespace, String message);
    }
    public static class Listener{
        public void onVolumeChanged(){};
        public void onApplicationDisconnected(int statusCode) {
        }


        public void onApplicationStatusChanged() {
        }
    }
    public static class CastApi {
        public static void setMessageReceivedCallbacks(GoogleApiClient mApiClient, String namespace, MessageReceivedCallback dataCastManager) throws IOException{
        }

        public static void removeMessageReceivedCallbacks(GoogleApiClient mApiClient, String namespace) throws IOException{

        }

        public static PendingResult sendMessage(GoogleApiClient mApiClient, String namespace, String message) {
            return null;
        }

        public static String getApplicationStatus(GoogleApiClient mApiClient) {
            return null;
        }

        public static void requestStatus(GoogleApiClient mApiClient) {

        }

        public static PendingResult joinApplication(GoogleApiClient mApiClient, String applicationId, String sessionId) {
            return null;
        }

        public static PendingResult launchApplication(GoogleApiClient mApiClient, String applicationId, boolean launchOptions) {
            return null;
        }

        public static PendingResult stopApplication(GoogleApiClient mApiClient, String mSessionId) {
            return null;
        }

        public static void setVolume(GoogleApiClient mApiClient, double volume) throws IOException {

        }

        public static double getVolume(GoogleApiClient mApiClient) {
            return 0;
        }

        public static boolean isMute(GoogleApiClient mApiClient) {
            return false;
        }

        public static void setMute(GoogleApiClient mApiClient, boolean mute) {

        }
    }
}
