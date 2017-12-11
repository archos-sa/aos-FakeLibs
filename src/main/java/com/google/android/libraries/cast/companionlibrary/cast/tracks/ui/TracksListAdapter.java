package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.google.android.gms.cast.MediaTrack;

import java.util.List;

/**
 * Created by alexandre on 11/12/17.
 */

public class TracksListAdapter implements ListAdapter {
    public TracksListAdapter(Context context, int resource, List<MediaTrack> tracks, int activePosition) {

    }

    public MediaTrack getSelectedTrack() {
        return null;
    }

    public Context getContext() {
        return null;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public void onClick(View v) {

    }
}
