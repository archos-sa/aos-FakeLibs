package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;

/**
 * Created by alexandre on 11/12/17.
 */

public class GoogleApiClient {

    public boolean isConnected() {
        return false;
    }

    public void disconnect() {

    }

    public void connect() {

    }

    public boolean isConnecting() {
        return false;
    }

    public static class ConnectionCallbacks{
        public void onConnectionFailed(ConnectionResult result){}
        public void onConnected(Bundle hint){}
        public void onConnectionSuspended(int cause){}
    }

    public interface OnConnectionFailedListener{

    }

    public static class Builder {
        public Builder(Context mContext) {
        }
        public Builder addApi(Object obj, Object oj){
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks baseCastManager) {
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener baseCastManager) {
            return this;
        }

        public GoogleApiClient build() {
            return null;
        }
    }
}
