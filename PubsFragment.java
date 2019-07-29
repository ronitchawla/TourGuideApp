package com.example.android.tourguide;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PubsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_view, container, false);


        ArrayList<Attraction> attractions=new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.brew),"13668","7783875209",R.drawable.brewmasters));
        attractions.add(new Attraction(getString(R.string.peddlers),"13668","7783875209",R.drawable.peddlers));
        attractions.add(new Attraction(getString(R.string.fbar),"13668","7783875209",R.drawable.fbar));
        attractions.add(new Attraction(getString(R.string.deneove),"13668","7783875209",R.drawable.deneuvo));
        attractions.add(new Attraction(getString(R.string.underdogs),"13668","7783875209",R.drawable.underdogs));


        AttractionAdapter adapter=new AttractionAdapter(getActivity(),attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment_view_list);


        listView.setAdapter(adapter);

        return rootView;
    }
}
