package com.example.fragmentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }


    public void onClick(View view) {
        Intent intent = new Intent(this, DashboardFragment.class);
        startActivity(intent);
    }
}