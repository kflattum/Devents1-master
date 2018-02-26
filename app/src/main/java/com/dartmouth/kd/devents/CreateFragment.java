package com.dartmouth.kd.devents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CreateFragment extends Fragment {
    private Intent myIntent;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        myIntent = new Intent(getActivity(),  CreateCampusEvent.class);
        startActivityForResult(myIntent, 0);

    }
}
