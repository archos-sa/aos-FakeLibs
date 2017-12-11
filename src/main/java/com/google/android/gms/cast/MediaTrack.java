package com.google.android.gms.cast;

/**
 * Created by alexandre on 11/12/17.
 */

public class MediaTrack {
    public static final int TYPE_TEXT = 1;
    public static final int SUBTYPE_CAPTIONS = 4;
    public static final int TYPE_AUDIO = 2;

    public long getId() {
        return 0;
    }

    public int getType() {
        return -1;
    }

    public int getContentId() {
        return 0;
    }

    public static class Builder {
        public Builder(long i, int typeText) {
        }

        public Builder setName(String mName) {
            return null;
        }

        public Builder setContentId(String localhost) {
            return null;
        }

        public Builder setLanguage(String fr) {
            return null;
        }

        public Builder setSubtype(int subtypeCaptions) {
            return null;
        }

        public Builder setContentType(String s) {
            return null;
        }

        public MediaTrack build() {
            return null;
        }
    }
}
