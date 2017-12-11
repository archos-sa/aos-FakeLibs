package com.google.android.libraries.cast.companionlibrary.cast.player;
public abstract interface MediaAuthListener
{



public abstract void onAuthFailure(java.lang.String p0);
public abstract void onAuthResult(com.google.android.libraries.cast.companionlibrary.cast.player.MediaAuthStatus p0, com.google.android.gms.cast.MediaInfo p1, java.lang.String p2, int p3, org.json.JSONObject p4);
}
