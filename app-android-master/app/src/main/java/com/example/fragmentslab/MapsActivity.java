package com.example.fragmentslab;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.fragmentslab.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sarajevo = new LatLng(43.859811324848124, 18.43128979123138);
        LatLng skakavac = new LatLng(43.948610634903616, 18.448889145116382);
        LatLng zicara = new LatLng(43.85550322065983, 18.43500248118338);
        LatLng trebevic = new LatLng(43.84176246446542, 18.45338012556001);
        LatLng tabija = new LatLng(43.861441049910425, 18.437646987678193);
        LatLng scc = new LatLng(43.8555142026085, 18.407864320382743);
        LatLng vilsonovo = new LatLng(43.8537545593715, 18.398158560469163);
        LatLng viewpoint = new LatLng(43.86662006149693, 18.442082111426334);
        LatLng vatra = new LatLng(43.8588178246988, 18.42186151966721);
        LatLng SFF = new LatLng(43.85737151932303, 18.420627553197274);
        LatLng airport = new LatLng(43.826887739114724, 18.33681642117991);
        LatLng zeljeznicka = new LatLng(43.86015137765179, 18.399495134256803);
        LatLng bus = new LatLng(43.858637208984426, 18.396927788540147);
        LatLng bjelasnica = new LatLng(43.71733526086515, 18.285594048496414);
        LatLng igman = new LatLng(43.76823948918349, 18.247532374467422);
        LatLng tunel = new LatLng(43.81980034697867, 18.337279241643195);
        LatLng despic = new LatLng(43.85757613255601, 18.427310865223387);
        LatLng gavrilo = new LatLng(43.85792737916593, 18.428934419271098);
        LatLng vijecnica = new LatLng(43.858919208605684, 18.433449885551);
        LatLng begova = new LatLng(43.859716999834426, 18.428874193607243);
        LatLng svrzo = new LatLng(43.862398713314384, 18.429200321538847);
        LatLng srebrenica = new LatLng(43.8590519670943, 18.42637006049013);
        LatLng fks = new LatLng(43.87340525300847, 18.409822612750915);

        mMap.addMarker(new MarkerOptions().position(sarajevo).title("Baščaršija")).setIcon(BitmapDescriptorFactory.defaultMarker(3));
        mMap.addMarker(new MarkerOptions().position(zicara).title("Cable car to Trebević Mountain"));
        mMap.addMarker(new MarkerOptions().position(skakavac).title("Skakavac Waterfall"));
        mMap.addMarker(new MarkerOptions().position(trebevic).title("Trebević Viewpoint"));
        mMap.addMarker(new MarkerOptions().position(tabija).title("Yellow Fortress"));
        mMap.addMarker(new MarkerOptions().position(scc).title("Sarajevo City Center"));
        mMap.addMarker(new MarkerOptions().position(vilsonovo).title("Vilsonovo Street - Walkarea"));
        mMap.addMarker(new MarkerOptions().position(viewpoint).title("Sarajevo Viewpoint"));
        mMap.addMarker(new MarkerOptions().position(vatra).title("The Eternal Flame"));
        mMap.addMarker(new MarkerOptions().position(SFF).title("Sarajevo Film Festival"));
        mMap.addMarker(new MarkerOptions().position(airport).title("International Airport"));
        mMap.addMarker(new MarkerOptions().position(zeljeznicka).title("Railway Station"));
        mMap.addMarker(new MarkerOptions().position(bus).title("Main Bus Station"));
        mMap.addMarker(new MarkerOptions().position(bjelasnica).title("Bjelašnica Mountain"));
        mMap.addMarker(new MarkerOptions().position(igman).title("Igman Mountain"));
        mMap.addMarker(new MarkerOptions().position(tunel).title("Tunnel of Hope"));
        mMap.addMarker(new MarkerOptions().position(despic).title("Despić House"));
        mMap.addMarker(new MarkerOptions().position(gavrilo).title("Sarajevo Museum 1878-1918"));
        mMap.addMarker(new MarkerOptions().position(vijecnica).title("Sarajevo City Hall - Vijećnica"));
        mMap.addMarker(new MarkerOptions().position(begova).title("Gazi Husrev-beg Museum"));
        mMap.addMarker(new MarkerOptions().position(svrzo).title("Svrzo's house"));
        mMap.addMarker(new MarkerOptions().position(srebrenica).title("Museum of Crimes Against Humanity and Genocide"));
        mMap.addMarker(new MarkerOptions().position(fks).title("Football Club Sarajevo"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sarajevo));
    }
}