package com.google.android.gms.cast;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.View;

import com.google.android.gms.common.api.Status;

/**
 * Created by alexandre on 11/12/17.
 */

public class CastRemoteDisplayLocalService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static interface Callbacks{
        public void onServiceCreated(CastRemoteDisplayLocalService castRemoteDisplayLocalService) ;

        public void onRemoteDisplaySessionStarted(
                CastRemoteDisplayLocalService service);
        public void onRemoteDisplaySessionError(Status errorReason);

    }

    public static void stopService(){

    }
    public static void startService(
                Context ct,
    Class cl, String id,
    CastDevice device,CastRemoteDisplayLocalService.NotificationSettings settings,
            CastRemoteDisplayLocalService.Callbacks callbacks){}

    public static class NotificationSettings {
        public static class Builder {
            public Builder setNotification(Notification notification) {
                return this;
            }
            public NotificationSettings build(){
                return null;
            }
        }
    }


    public void onCreatePresentation(Display display){}

    public void onDismissPresentation(){}


}
