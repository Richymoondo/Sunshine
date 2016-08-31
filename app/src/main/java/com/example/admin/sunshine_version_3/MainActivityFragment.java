package com.example.admin.sunshine_version_3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Cloudy - 88/63",
                "Wednesday - Foggy - 88/63",
                "Thursday - Sunny - 88/63",
                "Friday - Heavy Rain - 88/63",
                "Saturday - Hail - 88/63",
                "Sunday - Snow Storm :'( - 88/63"
        };

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
