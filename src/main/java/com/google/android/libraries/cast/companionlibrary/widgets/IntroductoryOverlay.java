package com.google.android.libraries.cast.companionlibrary.widgets;

import android.app.Activity;
import android.view.MenuItem;

/**
 * Created by alexandre on 11/12/17.
 */

public class IntroductoryOverlay
{
    public void show() {

    }

    public boolean isShown() {
        return false;
    }

    public void fadeOut(int i) {

    }

    public interface OnOverlayDismissedListener {
        public void onOverlayDismissed();
    }

    public static class Builder {
        public Builder(Activity mainActivity) {
        }

        public Builder setTitleText(int cast_introduction) {
            return this;
        }

        public Builder setSingleTime() {
            return this;
        }

        public Builder setOnDismissed(OnOverlayDismissedListener onOverlayDismissedListener) {
            return this;
        }

        public Builder setMenuItem(MenuItem mMediaRouteMenuItem) {
            return this;
        }

        public IntroductoryOverlay build() {
            return null;
        }
    }
}
