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

        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(A);
        circleOptions.radius(17000);
        circleOptions.fillColor(Color.CYAN);
        mMap.addCircle(circleOptions);


        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circleOptions1 = new CircleOptions();
        circleOptions1.center(B);
        circleOptions1.radius(17000);
        circleOptions1.fillColor(Color.CYAN);
        mMap.addCircle(circleOptions1);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circleOptions2 = new CircleOptions();
        circleOptions2.center(C);
        circleOptions2.radius(17000);
        circleOptions2.fillColor(Color.CYAN);
        mMap.addCircle(circleOptions2);


        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circleOptions3 = new CircleOptions();
        circleOptions3.center(D);
        circleOptions3.radius(17000);
        circleOptions3.fillColor(Color.CYAN);
        mMap.addCircle(circleOptions3);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circleOptions4 = new CircleOptions();
        circleOptions4.center(E);
        circleOptions4.radius(17000);
        circleOptions4.fillColor(Color.CYAN);
        mMap.addCircle(circleOptions4);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circleOptions5 = new CircleOptions();
        circleOptions5.center(F);
        circleOptions5.radius(17000);
        circleOptions5.fillColor(Color.CYAN);
        mMap.addCircle(circleOptions5);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions PILOS = new CircleOptions();
        PILOS.center(G);
        PILOS.radius(17000);
        PILOS.fillColor(Color.CYAN);
        mMap.addCircle(PILOS);


        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions PILO = new CircleOptions();
        PILO.center(H);
        PILO.radius(17000);
        PILO.fillColor(Color.CYAN);
        mMap.addCircle(PILO);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions TIBO = new CircleOptions();
        TIBO.center(I);
        TIBO.radius(17000);
        TIBO.fillColor(Color.CYAN);
        mMap.addCircle(TIBO);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions JUJU = new CircleOptions();
        JUJU.center(J);
        JUJU.radius(17000);
        JUJU.fillColor(Color.CYAN);
        mMap.addCircle(JUJU);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions NHNH = new CircleOptions();
        NHNH.center(K);
        NHNH.radius(17000);
        NHNH.fillColor(Color.CYAN);
        mMap.addCircle(NHNH);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions FDSFFDSFFD = new CircleOptions();
        FDSFFDSFFD.center(L);
        FDSFFDSFFD.radius(17000);
        FDSFFDSFFD.fillColor(Color.CYAN);
        mMap.addCircle(FDSFFDSFFD);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions FDSFFSD = new CircleOptions();
        FDSFFSD.center(M);
        FDSFFSD.radius(17000);
        FDSFFSD.fillColor(Color.CYAN);
        mMap.addCircle(FDSFFSD);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions AZ = new CircleOptions();
        AZ.center(N);
        AZ.radius(17000);
        AZ.fillColor(Color.CYAN);
        mMap.addCircle(AZ);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions circFleOptions1 = new CircleOptions();
        circFleOptions1.center(O);
        circFleOptions1.radius(17000);
        circFleOptions1.fillColor(Color.CYAN);
        mMap.addCircle(circFleOptions1);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions FDSF = new CircleOptions();
        FDSF.center(P);
        FDSF.radius(17000);
        FDSF.fillColor(Color.CYAN);
        mMap.addCircle(FDSF);



        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(A , 5));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CircleOptions FDS = new CircleOptions();
        FDS.center(r);
        FDS.radius(17000);
        FDS.fillColor(Color.CYAN);
        mMap.addCircle(FDS);






    }
}