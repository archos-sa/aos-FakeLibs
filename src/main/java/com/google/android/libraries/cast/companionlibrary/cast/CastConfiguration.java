package com.google.android.libraries.cast.companionlibrary.cast;

import android.app.Activity;

import java.util.Locale;

public class CastConfiguration
    extends java.lang.Object
{

private java.lang.String mApplicationId;
private int mCapabilities;
private boolean mCastControllerImmersive;
private java.lang.Class mCustomNotificationService;
private final boolean mDisableLaunchOnConnect = (boolean) false;
private int mForwardStep;
private com.google.android.gms.cast.LaunchOptions mLaunchOptions;
private java.util.List mNamespaces;
private int mNextPrevVisibilityPolicy;
private java.util.List mNotificationActions;
private java.util.List mNotificationCompactActions;
private java.lang.Class mTargetActivity;
public static final int CCL_DEFAULT_FORWARD_STEP_S=30;
public static final int FEATURE_AUTO_RECONNECT=32;
public static final int FEATURE_CAPTIONS_PREFERENCE=16;
public static final int FEATURE_DEBUGGING=1;
public static final int FEATURE_LOCKSCREEN=2;
public static final int FEATURE_NOTIFICATION=4;
public static final int FEATURE_WIFI_RECONNECT=8;
public static final int NEXT_PREV_VISIBILITY_POLICY_ALWAYS=3;
public static final int NEXT_PREV_VISIBILITY_POLICY_DISABLED=2;
public static final int NEXT_PREV_VISIBILITY_POLICY_HIDDEN=1;
public static final int NOTIFICATION_ACTION_DISCONNECT=4;
public static final int NOTIFICATION_ACTION_FORWARD=6;
public static final int NOTIFICATION_ACTION_PLAY_PAUSE=1;
public static final int NOTIFICATION_ACTION_REWIND=5;
public static final int NOTIFICATION_ACTION_SKIP_NEXT=2;
public static final int NOTIFICATION_ACTION_SKIP_PREVIOUS=3;

/** Empty implementation */
private CastConfiguration(com.google.android.libraries.cast.companionlibrary.cast.CastConfiguration.Builder p0) {
super ();
 }

/** Empty implementation */
 CastConfiguration(com.google.android.libraries.cast.companionlibrary.cast.CastConfiguration.Builder p0, com.google.android.libraries.cast.companionlibrary.cast.CastConfiguration p1) {
super ();
 }


/** Empty implementation */
public java.lang.String getApplicationId() {
return null;
}

/** Empty implementation */
public int getCapabilities() {
return 0;
}

/** Empty implementation */
public java.lang.Class getCustomNotificationService() {
return null;
}

/** Empty implementation */
public int getForwardStep() {
return 0;
}

/** Empty implementation */
public com.google.android.gms.cast.LaunchOptions getLaunchOptions() {
return null;
}

/** Empty implementation */
public java.util.List getNamespaces() {
return null;
}

/** Empty implementation */
public int getNextPrevVisibilityPolicy() {
return 0;
}

/** Empty implementation */
public java.util.List getNotificationActions() {
return null;
}

/** Empty implementation */
public java.util.List getNotificationCompactActions() {
return null;
}

/** Empty implementation */
public java.lang.Class getTargetActivity() {
return null;
}

/** Empty implementation */
public boolean isCastControllerImmersive() {
return false;
}

/** Empty implementation */
public boolean isDisableLaunchOnConnect() {
return false;
}

 public @interface PrevNextPolicy {
 }

 public static class Builder {
  public Builder(String string){

  }

  public Builder enableAutoReconnect() {
   return null;
  }

  public Builder enableCaptionManagement() {
   return null;
  }

  public Builder enableDebug() {
   return null;
  }

  public Builder enableLockScreen() {
   return null;
  }

  public Builder enableNotification() {
   return null;
  }

  public Builder enableWifiReconnection() {
   return null;
  }

  public Builder setTargetActivity(Class mainActivityClass) {
   return null;
  }

  public Builder setCastControllerImmersive(boolean b) {
   return null;
  }

  public Builder setLaunchOptions(boolean b, Locale aDefault) {
   return null;
  }

  public Builder setNextPrevVisibilityPolicy(int nextPrevVisibilityPolicyDisabled) {
   return null;
  }

  public Builder addNotificationAction(int notificationActionRewind, boolean b) {
   return null;
  }

  public Builder setForwardStep(int i) {
   return null;
  }

  public CastConfiguration build() {
   return null;
  }
 }
}
