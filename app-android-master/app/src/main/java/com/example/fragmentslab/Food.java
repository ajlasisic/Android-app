package com.example.fragmentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void previousPage(View view){
        Intent intent = new Intent(this, DashboardFragment.class);
        startActivity(intent);
    }

    public void redirect(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://korpa.ba/"));
        startActivity(intent);
    }
}