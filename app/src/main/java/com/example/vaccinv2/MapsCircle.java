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

        LatLng B = new LatLng(49.702075, 0.200462);
        LatLng C = new LatLng(47.535847, -2.628342);
        LatLng D = new LatLng(43.24149731245066, 5.8823190737961895);
        LatLng E = new LatLng(42.98164069298178, 1.013177644133485);
        LatLng F = new LatLng(43.24789849307516, -1.2104554365874165);
        LatLng G = new LatLng(46.18543532020758, 6.058098982691682);
        LatLng H = new LatLng(46.44646345775246, -1.562019277691924);
        LatLng I = new LatLng(49.36475268580122, 6.1635674644707805);
        LatLng J = new LatLng(48.61211563252862, 2.1530835967064332);
        LatLng K = new LatLng(44.88651994979358, 6.704092595398383);
        LatLng L = new LatLng(43.61171338496934, 1.4086824391483832);
        LatLng M = new LatLng(43.122130128517206, 0.6353242773117262);
        LatLng N = new LatLng(44.60874639833536, 0.009573150098161065);
        LatLng O = new LatLng(45.076908727565254,2.881399422555999);
        LatLng P = new LatLng(45.74212493256729,4.775991674184636);
        LatLng r = new LatLng(49.540800049108476,3.6724148799179757);



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
        circleOptions1.fillColor(Color.CYAN);
        circleOptions1.strokeWidth(6);
        mMap.addCircle(circleOptions1);

        CircleOptions circleOptions2 = new CircleOptions();

        circleOptions2.radius(30000);
        circleOptions2.fillColor(Color.YELLOW);
        circleOptions2.strokeWidth(6);
        mMap.addCircle(circleOptions2);

        CircleOptions circleOptions3 = new CircleOptions();

        circleOptions3.radius(30000);
        circleOptions3.fillColor(Color.RED);
        circleOptions3.strokeWidth(6);
        mMap.addCircle(circleOptions3);

        CircleOptions circleOptions4 = new CircleOptions();

        circleOptions4.radius(30000);
        circleOptions4.fillColor(Color.GREEN);
        circleOptions4.strokeWidth(6);
        mMap.addCircle(circleOptions4);

        CircleOptions circleOptions5 = new CircleOptions();

        circleOptions5.radius(30000);
        circleOptions5.fillColor(Color.BLUE);
        circleOptions5.strokeWidth(6);
        mMap.addCircle(circleOptions5);

        CircleOptions circleOptions6 = new CircleOptions();

        circleOptions6.radius(30000);
        circleOptions6.fillColor(Color.GRAY);
        circleOptions6.strokeWidth(6);
        mMap.addCircle(circleOptions6);

        CircleOptions circleOptions7 = new CircleOptions();

        circleOptions7.radius(30000);
        circleOptions7.fillColor(Color.RED);
        circleOptions7.strokeWidth(6);
        mMap.addCircle(circleOptions7);

        CircleOptions circleOptions8 = new CircleOptions();

        circleOptions8.radius(30000);
        circleOptions8.fillColor(Color.YELLOW);
        circleOptions8.strokeWidth(6);
        mMap.addCircle(circleOptions8);

        CircleOptions circleOptions9 = new CircleOptions();

        circleOptions9.radius(30000);
        circleOptions9.fillColor(Color.CYAN);
        circleOptions9.strokeWidth(6);
        mMap.addCircle(circleOptions9);

        CircleOptions circleOptions10 = new CircleOptions();

        circleOptions10.radius(30000);
        circleOptions10.fillColor(Color.CYAN);
        circleOptions10.strokeWidth(6);
        mMap.addCircle(circleOptions10);

        CircleOptions circleOptions11 = new CircleOptions();
        circleOptions11.center(A);
        circleOptions11.radius(30000);
        circleOptions11.fillColor(Color.BLUE);
        circleOptions11.strokeWidth(6);
        mMap.addCircle(circleOptions11);

        CircleOptions circleOptions12 = new CircleOptions();

        circleOptions12.radius(30000);
        circleOptions12.fillColor(Color.YELLOW);
        circleOptions12.strokeWidth(6);
        mMap.addCircle(circleOptions12);

        CircleOptions circleOptions13 = new CircleOptions();

        circleOptions13.radius(30000);
        circleOptions13.fillColor(Color.MAGENTA);
        circleOptions13.strokeWidth(6);
        mMap.addCircle(circleOptions13);

        CircleOptions circleOptions14 = new CircleOptions();

        circleOptions14.radius(30000);
        circleOptions14.fillColor(Color.LTGRAY);
        circleOptions14.strokeWidth(6);
        mMap.addCircle(circleOptions14);

        CircleOptions circleOptions15 = new CircleOptions();
        circleOptions15.center(A);
        circleOptions15.radius(30000);
        circleOptions15.fillColor(Color.DKGRAY);
        circleOptions15.strokeWidth(6);
        mMap.addCircle(circleOptions15);







    }
}