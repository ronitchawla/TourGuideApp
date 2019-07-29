package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(Context context, ArrayList<Attraction> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Attraction currentPlace = getItem(position);

        ImageView icon=(ImageView) listItemView.findViewById(R.id.image_id);
        icon.setImageResource(currentPlace.getImageResourceId());


        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_id);
        nameTextView.setText(currentPlace.getPlaceName());

        TextView addressTextView=(TextView) listItemView.findViewById(R.id.add_id);
        addressTextView.setText(currentPlace.getPlaceAddress());

        TextView contactTextView=(TextView) listItemView.findViewById(R.id.contact_id);
        contactTextView.setText(currentPlace.getPlaceContact());



        return listItemView;


    }
}
