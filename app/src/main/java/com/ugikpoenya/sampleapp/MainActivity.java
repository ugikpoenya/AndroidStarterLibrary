package com.ugikpoenya.sampleapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.ugikpoenya.sampleapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}