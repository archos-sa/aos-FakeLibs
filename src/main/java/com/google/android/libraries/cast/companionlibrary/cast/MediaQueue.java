package com.google.android.libraries.cast.companionlibrary.cast;
public class MediaQueue
    extends java.lang.Object
{

private com.google.android.gms.cast.MediaQueueItem mCurrentItem;
private java.util.List mQueueItems;
private int mRepeatMode;
private boolean mShuffle;
public static final int INVALID_POSITION=-1;

/** Empty implementation */
public MediaQueue(java.util.List p0, com.google.android.gms.cast.MediaQueueItem p1, boolean p2, int p3) {
super ();
 }


/** Empty implementation */
public final int getCount() {
return 0;
}

/** Empty implementation */
public final com.google.android.gms.cast.MediaQueueItem getCurrentItem() {
return null;
}

/** Empty implementation */
public final int getCurrentItemPosition() {
return 0;
}

/** Empty implementation */
public final java.util.List getQueueItems() {
return null;
}

/** Empty implementation */
public final int getRepeatMode() {
return 0;
}

/** Empty implementation */
public final boolean isEmpty() {
return false;
}

/** Empty implementation */
public final boolean isShuffle() {
return false;
}

/** Empty implementation */
public final void setCurrentItem(com.google.android.gms.cast.MediaQueueItem p0) {
}

/** Empty implementation */
public final void setQueueItems(java.util.List p0) {
}

/** Empty implementation */
public final void setRepeatMode(int p0) {
}

/** Empty implementation */
public final void setShuffle(boolean p0) {
}

}
