package com.google.android.gms.cast;

import android.os.Bundle;

/**
 * Created by alexandre on 11/12/17.
 */

public class CastDevice {
    public boolean isOnLocalNetwork() {
        return false;
    }

    public String getFriendlyName() {
        return null;
    }

    public static CastDevice getFromBundle(Bundle extras) {
        return null;
    }
}
