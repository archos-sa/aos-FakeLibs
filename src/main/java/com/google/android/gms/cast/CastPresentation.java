package com.google.android.gms.cast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by alexandre on 11/12/17.
 */

public class CastPresentation extends Activity {
    public CastPresentation(Context context, Display display) {

    }

    public boolean isShowing() {
        return false;
    }

    public void dismiss() {

    }

    public void show() throws WindowManager.InvalidDisplayException{

    }

    public interface OnCreateCallback{

        public void onCreatePresentation(Display display);

        public void onDismissPresentation();
        void onFirstScreenPresentationCreated(View rootView);
    }

    protected void onCreate(Bundle savedInstanceState) {

    }
}
