package com.example.android.tourguide;

public class Attraction {
    private String placeName;
    private String placeAddress;
    private String placeContact;
    private int imageResourceId;

    public Attraction(String pn,String pa,String pc,int id)
    {
        placeName=pn;
        placeAddress=pa;
        placeContact=pc;
        imageResourceId=id;
    }

    public String getPlaceName()
    {
        return placeName;
    }
    public String getPlaceAddress()
    {
        return placeAddress;
    }
    public  String getPlaceContact()
    {
        return placeContact;
    }
    public int getImageResourceId()
    {
        return imageResourceId;
    }



}
