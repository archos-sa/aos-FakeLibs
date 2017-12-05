package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by alexandre on 05/12/17.
 */

public class AdView extends View {

    public AdView(Context context) {
        super(context);
    }

    public AdView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AdView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setAdSize(int adSize) {
    }

    public void setAdUnitId(String adUnitId) {

    }

    public void loadAd(AdRequest build) {

    }

    public void setAdListener(AdListener adListener) {

    }

    public void destroy() {

    }

    public void resume() {

    }

    public void pause() {

    }
}
