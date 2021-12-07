package com.example.fragmentslab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Marketplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);
    }

    public void returnPage(View view){
        Intent intent = new Intent(this, DashboardFragment.class);
        startActivity(intent);
    }

    public void openBrowser(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.olx.ba/"));
        startActivity(intent);
    }
}