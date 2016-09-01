package com.example.admin.sunshine_version_3;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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

        new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecastArray);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
