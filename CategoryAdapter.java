package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PubsFragment();
        } else if (position == 1){
            return new RestaurantFragment();
        }
        else if (position == 2){
            return new HotelFragment();
        }else {
            return new GymFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (0 == position) {
            return "Pubs/Bars";
        } else if (1 == position) {
            return "Restaurants";
        } else if (2 == position) {
            return "Hotels/Accomodations";
        } else {
            return "Gyms/Recreational Center";
        }
    }

}
