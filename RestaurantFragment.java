package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_view, container, false);


        ArrayList<Attraction> attractions=new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.reefers),"13668","7783875209",R.drawable.reefers));
        attractions.add(new Attraction(getString(R.string.bbq),"13668","7783875209",R.drawable.bbq));
        attractions.add(new Attraction( getString(R.string.haveli),"13668","7783875209",R.drawable.havelee));
        attractions.add(new Attraction(getString(R.string.tamasha),"13668","7783875209",R.drawable.tamasha));


        AttractionAdapter adapter=new AttractionAdapter(getActivity(),attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment_view_list);


        listView.setAdapter(adapter);

        return rootView;
    }
}
