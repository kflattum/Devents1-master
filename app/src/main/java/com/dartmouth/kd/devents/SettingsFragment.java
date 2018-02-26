package com.dartmouth.kd.devents;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;


/**
 * Have to click back for it to work
 *Use a PreferenceFragment to store user preferences
 */



public class SettingsFragment extends PreferenceFragment {
    private Intent myIntent;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myIntent = new Intent(getActivity(),  UserProfile.class);
        startActivityForResult(myIntent, 0);
        //addPreferencesFromResource(com.dartmouth.kd.devents.R.xml.preferences);

    }
}
