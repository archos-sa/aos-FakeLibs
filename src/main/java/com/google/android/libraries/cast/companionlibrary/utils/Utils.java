package com.google.android.libraries.cast.companionlibrary.utils;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;

import java.util.List;

/**
 * Created by alexandre on 11/12/17.
 */

public class Utils
{
    public static Uri getImageUri(MediaInfo mediaInfo, int i) {
        return null;
    }

    public static int formatMillis(int position) {
        return 0;
    }

    public static void showToast(Context context, int ccl_failed_no_connection_trans) {

    }

    public static Point getDisplaySize(FragmentActivity activity) {
        return null;
    }

    public static MediaInfo bundleToMediaInfo(Bundle mediaWrapper) {
        return null;
    }

    public static boolean hasAudioOrTextTrack(List<MediaTrack> tracks) {
        return false;
    }

    public static Bundle mediaInfoToBundle(MediaInfo mediaInfo) {
        return null;
    }
}
