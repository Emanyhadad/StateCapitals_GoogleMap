package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.googlemap.databinding.ActivityRvBinding;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class RVActivity extends AppCompatActivity implements Listener {
ActivityRvBinding binding;
Adapter adapter;
    ArrayList<country> countries;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        binding = ActivityRvBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot());

        countries = new ArrayList <>(  );
        countries.add( new country(new LatLng( 	31.771959,35.217018 ) ,"Jerusalem") );
        countries.add( new country(new LatLng( 41.8719, 12.5674 ),"Italic") );

        adapter=new Adapter( countries ,RVActivity.this );
        binding.RV.setAdapter( adapter );
        binding.RV.setHasFixedSize( true );
        binding.RV.setLayoutManager( new LinearLayoutManager
                ( this, RecyclerView.VERTICAL,false ) );


    }

    @Override
    public void show( int pos ) {
        Intent intent=new Intent( RVActivity.this, MapsActivity.class );
        double latitude= countries.get( pos ).id.latitude;
        double longitude= countries.get( pos ).id.longitude;
        intent.putExtra( "latitude",latitude );
        intent.putExtra( "longitude",longitude );
        startActivity( intent );
        Log.d( "Mainpos", latitude+"/" + longitude);

    }
}