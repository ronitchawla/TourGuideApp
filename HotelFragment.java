package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_view, container, false);


        ArrayList<Attraction> attractions=new ArrayList<Attraction>();
        attractions.add(new Attraction( getString(R.string.radisson),"13668","7783875209",R.drawable.radisson));
        attractions.add(new Attraction(getString(R.string.ramada),"13668","7783875209",R.drawable.ramada));
        attractions.add(new Attraction(getString(R.string.downtown),"13668","7783875209",R.drawable.downtown));
        attractions.add(new Attraction(getString(R.string.country),"13668","7783875209",R.drawable.country));


        AttractionAdapter adapter=new AttractionAdapter(getActivity(),attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment_view_list);


        listView.setAdapter(adapter);

        return rootView;
    }
}
