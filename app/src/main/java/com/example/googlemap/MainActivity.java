package com.example.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.googlemap.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.BaseTransientBottomBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
Animation animation;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        binding=ActivityMainBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );

        animation = AnimationUtils.loadAnimation( this,R.anim.splash );
        binding.imageView.setAnimation( animation );

        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                    startActivity(new Intent(getBaseContext(), RVActivity.class));
                finish();
            }}, 4000);
    }
}