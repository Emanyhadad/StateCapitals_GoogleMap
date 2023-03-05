package com.example.googlemap.Models;

import com.google.android.gms.maps.model.LatLng;

public class country {
    public LatLng id;
    String name;

    public country( LatLng id , String name ) {
        this.id = id;
        this.name = name;
    }

    public LatLng getId( ) {
        return id;
    }

    public void setId( LatLng id ) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
