package com.example.vaccinv2;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsCircle extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_circle);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng A = new LatLng(48.860545, 2.337819);

        LatLng B = new LatLng(45.860545, 2.337819);
        LatLng C = new LatLng(45.860545, 2.337819);
        LatLng D = new LatLng(45.860545, 2.337819);
        LatLng E = new LatLng(45.860545, 2.337819);
        LatLng F = new LatLng(45.860545, 2.337819);
        LatLng G = new LatLng(45.860545, 2.337819);
        LatLng H = new LatLng(45.860545, 2.337819);
        LatLng I = new LatLng(45.860545, 2.337819);
        LatLng J = new LatLng(45.860545, 2.337819);
        LatLng K = new LatLng(45.860545, 2.337819);
        LatLng L = new LatLng(45.860545, 2.337819);
        LatLng M = new LatLng(45.860545, 2.337819);
        LatLng N = new LatLng(45.860545, 2.337819);
        LatLng O = new LatLng(45.860545, 2.337819);
        LatLng P = new LatLng(45.860545, 2.337819);

        LatLng r = new LatLng(45.860545, 2.337819);



        //mMap.addMarker(new MarkerOptions().position(A).title("Zone à risque"));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);

        CircleOptions circleOptions = new CircleOptions();

        circleOptions.radius(30000);
        circleOptions.fillColor(Color.RED);
        circleOptions.strokeWidth(6);
        mMap.addCircle(circleOptions);

        CircleOptions circleOptions1 = new CircleOptions();

        circleOptions1.radius(30000);
        circleOptions1.fillColor(Color.RED);
        circleOptions1.strokeWidth(6);
        mMap.addCircle(circleOptions1);

        CircleOptions circleOptions2 = new CircleOptions();

        circleOptions2.radius(30000);
        circleOptions2.fillColor(Color.RED);
        circleOptions2.strokeWidth(6);
        mMap.addCircle(circleOptions2);

        CircleOptions circleOptions3 = new CircleOptions();

        circleOptions3.radius(30000);
        circleOptions3.fillColor(Color.RED);
        circleOptions3.strokeWidth(6);
        mMap.addCircle(circleOptions3);

        CircleOptions circleOptions4 = new CircleOptions();

        circleOptions4.radius(30000);
        circleOptions4.fillColor(Color.RED);
        circleOptions4.strokeWidth(6);
        mMap.addCircle(circleOptions4);

        CircleOptions circleOptions5 = new CircleOptions();

        circleOptions5.radius(30000);
        circleOptions5.fillColor(Color.RED);
        circleOptions5.strokeWidth(6);
        mMap.addCircle(circleOptions5);

        CircleOptions circleOptions6 = new CircleOptions();

        circleOptions6.radius(30000);
        circleOptions6.fillColor(Color.RED);
        circleOptions6.strokeWidth(6);
        mMap.addCircle(circleOptions6);

        CircleOptions circleOptions7 = new CircleOptions();

        circleOptions7.radius(30000);
        circleOptions7.fillColor(Color.RED);
        circleOptions7.strokeWidth(6);
        mMap.addCircle(circleOptions7);

        CircleOptions circleOptions8 = new CircleOptions();

        circleOptions8.radius(30000);
        circleOptions8.fillColor(Color.RED);
        circleOptions8.strokeWidth(6);
        mMap.addCircle(circleOptions8);

        CircleOptions circleOptions9 = new CircleOptions();

        circleOptions9.radius(30000);
        circleOptions9.fillColor(Color.RED);
        circleOptions9.strokeWidth(6);
        mMap.addCircle(circleOptions9);

        CircleOptions circleOptions10 = new CircleOptions();

        circleOptions10.radius(30000);
        circleOptions10.fillColor(Color.RED);
        circleOptions10.strokeWidth(6);
        mMap.addCircle(circleOptions10);

        CircleOptions circleOptions11 = new CircleOptions();
        circleOptions11.center(A);
        circleOptions11.radius(30000);
        circleOptions11.fillColor(Color.RED);
        circleOptions11.strokeWidth(6);
        mMap.addCircle(circleOptions11);

        CircleOptions circleOptions12 = new CircleOptions();

        circleOptions12.radius(30000);
        circleOptions12.fillColor(Color.RED);
        circleOptions12.strokeWidth(6);
        mMap.addCircle(circleOptions12);

        CircleOptions circleOptions13 = new CircleOptions();

        circleOptions13.radius(30000);
        circleOptions13.fillColor(Color.RED);
        circleOptions13.strokeWidth(6);
        mMap.addCircle(circleOptions13);

        CircleOptions circleOptions14 = new CircleOptions();

        circleOptions14.radius(30000);
        circleOptions14.fillColor(Color.RED);
        circleOptions14.strokeWidth(6);
        mMap.addCircle(circleOptions14);

        CircleOptions circleOptions15 = new CircleOptions();
        circleOptions15.center(A);
        circleOptions15.radius(30000);
        circleOptions15.fillColor(Color.RED);
        circleOptions15.strokeWidth(6);
        mMap.addCircle(circleOptions15);







    }
}