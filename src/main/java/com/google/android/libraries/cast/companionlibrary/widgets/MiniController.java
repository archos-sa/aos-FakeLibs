package com.google.android.libraries.cast.companionlibrary.widgets;

import android.content.Context;
import android.view.View;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;

/**
 * Created by alexandre on 11/12/17.
 */

public class MiniController {
    public interface
    OnMiniControllerChangedListener {
        void onPlayPauseClicked(View v) throws NoConnectionException,CastException,TransientNetworkDisconnectionException;

        void onFailed(int ccl_failed_no_connection_trans, int undefinedStatusCode);

        void onUpcomingPlayClicked(View v, MediaQueueItem mUpcomingItem);

        void onUpcomingStopClicked(View v, MediaQueueItem mUpcomingItem);
        public void onTargetActivityInvoked(Context context) throws TransientNetworkDisconnectionException, NoConnectionException;
        }
}
