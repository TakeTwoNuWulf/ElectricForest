package com.example.android.electricforest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SetListFragment extends Fragment {
    private DrawerLayout navDrawer;
    private ActionBar acBar;


    public SetListFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.stage_item_list,container);
            ArrayList<stageInfo> stageInfos = new ArrayList<stageInfo>();
            stageInfos.add(new stageInfo("", "THURSDAY\n------------------"));
            stageInfos.add(new stageInfo("Wilkinson", "11:30am"));
            stageInfos.add(new stageInfo("Camo & Krooked", "12:30pm"));
            stageInfos.add(new stageInfo("D.R.S", "1:30pm"));
            stageInfos.add(new stageInfo("LSB ", "2:30pm"));
            stageInfos.add(new stageInfo("LSB", "3:30pm"));
            stageInfos.add(new stageInfo("Mohican Sun", "4:30pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "5:30pm"));
            stageInfos.add(new stageInfo("Low:r", "6:30pm"));
            stageInfos.add(new stageInfo("Etherwood", "8:15pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "10:00pm"));
            stageInfos.add(new stageInfo("", "\n--------------\nFRIDAY\n--------------"));
            stageInfos.add(new stageInfo("Wilkinson", "11:30am"));
            stageInfos.add(new stageInfo("Camo & Krooked", "12:30pm"));
            stageInfos.add(new stageInfo("D.R.S", "1:30pm"));
            stageInfos.add(new stageInfo("LSB ", "2:30pm"));
            stageInfos.add(new stageInfo("LSB", "3:30pm"));
            stageInfos.add(new stageInfo("Mohican Sun", "4:30pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "5:30pm"));
            stageInfos.add(new stageInfo("Low:r", "6:30pm"));
            stageInfos.add(new stageInfo("Etherwood", "8:15pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "10:00pm"));
            stageInfos.add(new stageInfo("", "\n--------------\nSATURDAY\n--------------"));
            stageInfos.add(new stageInfo("Wilkinson", "11:30am"));
            stageInfos.add(new stageInfo("Camo & Krooked", "12:30pm"));
            stageInfos.add(new stageInfo("D.R.S", "1:30pm"));
            stageInfos.add(new stageInfo("LSB ", "2:30pm"));
            stageInfos.add(new stageInfo("LSB", "3:30pm"));
            stageInfos.add(new stageInfo("Mohican Sun", "4:30pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "5:30pm"));
            stageInfos.add(new stageInfo("Low:r", "6:30pm"));
            stageInfos.add(new stageInfo("Etherwood", "8:15pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "10:00pm"));
            stageInfos.add(new stageInfo("", "\n--------------\nSUNDAY\n--------------"));
            stageInfos.add(new stageInfo("Wilkinson", "11:30am"));
            stageInfos.add(new stageInfo("Camo & Krooked", "12:30pm"));
            stageInfos.add(new stageInfo("D.R.S", "1:30pm"));
            stageInfos.add(new stageInfo("LSB ", "2:30pm"));
            stageInfos.add(new stageInfo("LSB", "3:30pm"));
            stageInfos.add(new stageInfo("Mohican Sun", "4:30pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "5:30pm"));
            stageInfos.add(new stageInfo("Low:r", "6:30pm"));
            stageInfos.add(new stageInfo("Etherwood", "8:15pm"));
            stageInfos.add(new stageInfo("Dawn Wall", "10:00pm"));
//** This method creates the custom MusicAdapter
            StageInfoAdapter adapter = new StageInfoAdapter(getActivity(), stageInfos);
            ListView musicView = (ListView) rootview.findViewById(R.id.list_view);


            musicView.setAdapter(adapter);



        return rootview;

    }


}
