package com.example.fragmentslab;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity{


    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        viewPager = findViewById(R.id.fragment_container);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                 bottomNavigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setUpAdapter(viewPager);

    }

    private void setUpAdapter(ViewPager viewPager) {
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPageAdapter.addFragment(new HomeFragment());
        viewPageAdapter.addFragment(new DashboardFragment());
        viewPageAdapter.addFragment(new NotificationsFragment());
        viewPageAdapter.addFragment(new NotesFragment());
        viewPager.setAdapter(viewPageAdapter);
    }



    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Log.d("DEBUG", "Item clicked" + item.getItemId());
            switch (item.getItemId()) {
                case R.id.nav_home:
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.nav_dashboard:
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.nav_notifications:
                    viewPager.setCurrentItem(2);
                    return true;
                case R.id.nav_notes:
                    viewPager.setCurrentItem(3);
                    return true;
                default:
                    return false;
            }
        }
    };

    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.cardEvent:
                intent = new Intent(this, Events.class);
                break;
            case R.id.cardTransport:
                intent = new Intent(this, Transport.class);
                break;
            case R.id.cardMarketplace:
                intent = new Intent(this, Marketplace.class);
                break;
            case R.id.cardLocations:
                intent = new Intent(this, MapsActivity.class);
                break;
            case R.id.cardFood:
                intent = new Intent(this, Food.class);
                break;
            case R.id.cardGuide:
                intent = new Intent(this, Guide.class);
                break;
            case R.id.covidImage:
            case R.id.covidText: {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ba.usembassy.gov/covid-19-information/"));
                break;
            }
            case R.id.contactImage:
            case R.id.contactText: {
                intent = new Intent(this, Guide.class);
                break;
            }
            case R.id.ibuImage:
            case R.id.ibuText:{
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ibu.edu.ba/"));
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }

        startActivity(intent);
    }

}