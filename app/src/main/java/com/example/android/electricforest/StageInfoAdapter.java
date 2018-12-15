package com.example.android.electricforest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.electricforest.R;

import java.util.ArrayList;

public class StageInfoAdapter extends ArrayAdapter<stageInfo> {

    public StageInfoAdapter(Activity context, ArrayList<stageInfo> stageInfos) {
        super(context, 0, stageInfos);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        stageInfo info = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.stage_item_list, parent, false);
        }
        // Lookup view for data population
        TextView artistName = (TextView) convertView.findViewById(R.id.artist);
        TextView trackName = (TextView) convertView.findViewById(R.id.set_time);
        // Populate the data into the template view using the data object
        artistName.setText(info.getArtistName());
        trackName.setText(info.getmSetTime());

        // Return the completed view to render on screen
        return convertView;
    }
}