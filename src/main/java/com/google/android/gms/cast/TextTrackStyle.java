package com.google.android.gms.cast;

import android.content.Context;

/**
 * Created by alexandre on 11/12/17.
 */

public class TextTrackStyle {
    public static final Integer FONT_FAMILY_SANS_SERIF = -1;
    public static final Integer FONT_FAMILY_SERIF = -2;
    public static final Integer FONT_FAMILY_MONOSPACED_SANS_SERIF = -3;
    public static final Integer EDGE_TYPE_NONE = -4;
    public static final Integer EDGE_TYPE_OUTLINE = -5;
    public static final Integer EDGE_TYPE_DROP_SHADOW = -6;
    public static final int FONT_STYLE_NORMAL = -7;
    public static int FONT_STYLE_BOLD_ITALIC= -8;
    public static int FONT_STYLE_BOLD = -9;

    public static TextTrackStyle fromSystemSettings(Context mContext) {
        return null;
    }

    public void setFontGenericFamily(Integer integer) {

    }

    public void setBackgroundColor(int i) {

    }

    public void setEdgeType(Integer integer) {

    }

    public void setFontScale(float fontScale) {

    }
}
