package com.example.googlemap.Models;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.googlemap.databinding.ItemBinding;

import java.util.List;

public class Adapter extends RecyclerView.Adapter< Adapter.ViewHolder > {
    private final List< country > countryList;
    private final Listener listener;

    public Adapter( List < country > countryList , Listener listener ) {
        this.countryList = countryList;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( @NonNull ViewGroup parent , int viewType ) {
        ItemBinding binding=ItemBinding.inflate
                ( LayoutInflater.from( parent.getContext() ),
                parent,false);
        return new ViewHolder( binding );
    }

    @Override
    public void onBindViewHolder( @NonNull ViewHolder holder , int position ) {

        country course=countryList.get( position );

    holder.CName.setText( String.valueOf(course.name) );

    holder.btnshow.setOnClickListener( view -> listener.show( position ) );
    }

    @Override
    public int getItemCount( ) {
        return countryList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView CName;
        public Button btnshow;
        public ViewHolder( @NonNull ItemBinding binding ) {
            super( binding.getRoot() );

            CName=binding.tvCountry;

            btnshow=binding.button;

        }
    }


    
}
