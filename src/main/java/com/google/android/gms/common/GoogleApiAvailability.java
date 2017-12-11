package com.google.android.gms.common;

import android.content.Context;

/**
 * Created by alexandre on 11/12/17.
 */

public class GoogleApiAvailability {
    public static GoogleApiAvailability getInstance() {
        return new GoogleApiAvailability();
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return -1;
    }
}
