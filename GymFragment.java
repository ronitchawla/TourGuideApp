package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class GymFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_view, container, false);


        ArrayList<Attraction> attractions=new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.burn),"13668","7783875209",R.drawable.burn));
        attractions.add(new Attraction( getString(R.string.gold),"13668","7783875209",R.drawable.golds));
        attractions.add(new Attraction(getString(R.string.neo),"13668","7783875209",R.drawable.neo));
        attractions.add(new Attraction(getString(R.string.gymkhana),"13668","7783875209",R.drawable.gymkahna));


        AttractionAdapter adapter=new AttractionAdapter(getActivity(),attractions);
        ListView listView = (ListView) rootView.findViewById(R.id.fragment_view_list);


        listView.setAdapter(adapter);

        return rootView;
    }
}
