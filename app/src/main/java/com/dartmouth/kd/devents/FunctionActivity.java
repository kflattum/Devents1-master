package com.dartmouth.kd.devents;

import android.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class FunctionActivity extends AppCompatActivity {
    //see stuff under the tabs
    ViewPager viewPager;

    //need this for the tabs
    TabLayout tabLayout;
    MapFragment fragmentMap;
    CalendarActivity fragmentCalendar;
    CreateFragment fragmentCreate;

    //create a fragment class
    MyFragmentPageAdapter myFragmentPagerAdapter;
    //this is how to not do this from scratch
    ArrayList<Fragment> fragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tab);


        fragmentMap = new MapFragment();
        fragmentCalendar = new CalendarActivity();
        fragmentCreate = new CreateFragment();

        fragments = new ArrayList<>();
        fragments.add(fragmentMap);
        fragments.add(fragmentCalendar);
        fragments.add(fragmentCreate);

        myFragmentPagerAdapter = new MyFragmentPageAdapter(getFragmentManager(), fragments);
        viewPager.setAdapter(myFragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}