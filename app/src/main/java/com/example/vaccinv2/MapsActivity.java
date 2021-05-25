package com.example.vaccinv2;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import android.os.Build;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        System.out.println("Insert ...");
        VaccinDatabase db = new VaccinDatabase(this);
        // db.truncate();
        // Ajout des centres
        List.of(
                new Centre("Centre de vaccination - 90 Pfizer - 265410 Astrazeneca", new LatLng(48.872590, 2.340440)),
                new Centre("Centre de vaccination - 190 Pfizer - 216540 Astrazeneca", new LatLng(48.863990, 2.361530)),
                new Centre("Centre de vaccination - 96560 Pfizer - 210 Astrazeneca", new LatLng(48.672522, 2.002116)),
                new Centre("Centre de vaccination - 96540 Pfizer - 216540 Astrazeneca", new LatLng(48.164170, 1.770569)),
                new Centre("Centre de vaccination - 65490 Pfizer - 654210 Astrazeneca", new LatLng(47.693738, 2.220804)),
                new Centre("Centre de vaccination - 99870 Pfizer - 219870 Astrazeneca", new LatLng(46.473518, 5.075102)),


                new Centre("Centre de vaccination - 390 Pfizer - 174 Astrazeneca", new LatLng(44.2012986,1.8576953)),
                new Centre("Centre de vaccination - 656 Pfizer - 1645 Astrazeneca", new LatLng(46.141736,0.404965)),
                new Centre("Centre de vaccination - 456 Pfizer - 676 Astrazeneca", new LatLng(46.4351729231305,4.65821921825409)),
                new Centre("Centre de vaccination - 8987 Pfizer - 786 Astrazeneca", new LatLng(44.7679,-0.3125)),
                new Centre("Centre de vaccination - 214 Pfizer - 917 Astrazeneca", new LatLng(43.7056788063795,4.66414824128151)),
                new Centre("Centre de vaccination - 5654 Pfizer - 6876 Astrazeneca", new LatLng(48.6359715815921,-1.51141405105591)),
                new Centre("Centre de vaccination - 64 Pfizer - 767 Astrazeneca", new LatLng(43.4501102,6.3080895)),
                new Centre("Centre de vaccination - 489 Pfizer - 678 Astrazeneca", new LatLng(47.597702,-3.0633934)),
                new Centre("Centre de vaccination - 490 Pfizer - 676 Astrazeneca", new LatLng(48.873818,2.295023)),
                new Centre("Centre de vaccination - 645 Pfizer - 676 Astrazeneca", new LatLng(48.9354196846302,2.35991477966309)),
                new Centre("Centre de vaccination - 645 Pfizer - 979 Astrazeneca", new LatLng(48.6675691351204,-3.85842740535736)),
                new Centre("Centre de vaccination - 231 Pfizer - 456 Astrazeneca", new LatLng(47.2336343,6.0303255)),
                new Centre("Centre de vaccination - 664 Pfizer - 210 Astrazeneca", new LatLng(48.9244255560091,2.02827036380768)),
                new Centre("Centre de vaccination - 490 Pfizer - 686 Astrazeneca", new LatLng(46.36354,4.700442)),
                new Centre("Centre de vaccination - 177 Pfizer - 656 Astrazeneca", new LatLng(48.8736985969585,2.32269108295441)),
                new Centre("Centre de vaccination - 7678 Pfizer - 468 Astrazeneca", new LatLng(47.4698136,-0.5593384)),
                new Centre("Centre de vaccination - 6746 Pfizer - 4684 Astrazeneca", new LatLng(44.6752839,1.8792255)),
                new Centre("Centre de vaccination - 546 Pfizer - 6543 Astrazeneca", new LatLng(45.775,3.498889)),
                new Centre("Centre de vaccination - 490 Pfizer - 6549 Astrazeneca", new LatLng(47.2595533,0.4666037)),
                new Centre("Centre de vaccination - 4654 Pfizer - 6465 Astrazeneca", new LatLng(43.2798571264442,5.32513439655304)),
                new Centre("Centre de vaccination - 6546 Pfizer - 6456 Astrazeneca", new LatLng(46.9518734665508,-0.0773334503173828)),
                new Centre("Centre de vaccination - 987 Pfizer - 123 Astrazeneca", new LatLng(47.5615776782153,4.52347576618195)),
                new Centre("Centre de vaccination - 7854 Pfizer - 321 Astrazeneca", new LatLng(44.638101219349,-0.320652723312378)),
                new Centre("Centre de vaccination - 6456 Pfizer - 610 Astrazeneca", new LatLng(48.5601290798993,-0.154345035552979)),
                new Centre("Centre de vaccination - 7897 Pfizer - 620 Astrazeneca", new LatLng(46.2394201556751,3.22972297668457)),
                new Centre("Centre de vaccination - 1742 Pfizer - 420 Astrazeneca", new LatLng(48.0707956173737,1.32372379302979)),
                new Centre("Centre de vaccination - 2814 Pfizer - 7810 Astrazeneca", new LatLng(49.521774855251,3.31861138343811)),

                new Centre("Centre de Marie Curie - 1742 Pfizer - 75 Astrazeneca", new LatLng(47.4477388488549,1.3438081741333)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(43.9580329,0.9211763)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(48.4671345668952,3.43147337436676)),
                new Centre("Centre de vaccination - 1742 Pfizer - 978 Astrazeneca", new LatLng(48.9471671045817,2.15389966964722)),
                new Centre("Centre de vaccination - 1742 Pfizer - 420 Astrazeneca", new LatLng(44.8624197,1.8599192)),
                new Centre("Centre de vaccination - 1742 Pfizer - 975 Astrazeneca", new LatLng(49.3469937613645,2.98019707202911)),
                new Centre("Centre de vaccination - 1742 Pfizer - 66547 Astrazeneca", new LatLng(45.425833,0.744444)),
                new Centre("Centre de vaccination - 1742 Pfizer - 879 Astrazeneca", new LatLng(48.6454040146198,1.81732803583145)),
                new Centre("Centre de vaccination - 1742 Pfizer - 9486 Astrazeneca", new LatLng(45.4779965450436,3.18597078323364)),
                new Centre("Centre de vaccination - 1742 Pfizer - 3641 Astrazeneca", new LatLng(48.84266824545,2.43570327758789)),


                new Centre("Centre de vaccination - 1742 Pfizer - 65 Astrazeneca", new LatLng(49.2559 ,3.092076)),
                new Centre("Centre de vaccination - 1742 Pfizer - 6548 Astrazeneca", new LatLng(46.2581309,6.1043544)),
                new Centre("Centre de vaccination - 1742 Pfizer - 987 Astrazeneca", new LatLng(48.8536468310556,2.60403871536255)),
                new Centre("Centre de vaccination - 1742 Pfizer - 98 Astrazeneca", new LatLng(43.2072833574495,2.36326217651367)),
                new Centre("Centre de vaccination - 1742 Pfizer - 564 Astrazeneca", new LatLng(43.4330627773556,6.73715114593506)),
                new Centre("Centre de vaccination - 1742 Pfizer - 5654 Astrazeneca", new LatLng(45.0461801,3.8848592)),
                new Centre("Centre de vaccination - 1742 Pfizer - 6132 Astrazeneca", new LatLng(47.3958291154544,0.694069862365723)),
                new Centre("Centre de vaccination - 1742 Pfizer - 354 Astrazeneca", new LatLng(48.853207 ,2.369101 )),
                new Centre("Centre de vaccination - 1742 Pfizer - 985 Astrazeneca", new LatLng(50.7644118,1.6310642)),
                new Centre("Centre de vaccination - 1742 Pfizer - 852 Astrazeneca", new LatLng(48.8558175524787,2.34595119953156)),
                new Centre("Centre de vaccination - 1742 Pfizer - 741 Astrazeneca", new LatLng(48.8374322716853,2.75358259677887)),
                new Centre("Centre de vaccination - 1742 Pfizer - 963 Astrazeneca", new LatLng(48.836821431274,2.21820831298828)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(48.864972372625,2.33773827552795)),
                new Centre("Centre de vaccination - 1742 Pfizer - 7453 Astrazeneca", new LatLng(43.9662,4.8001)),
                new Centre("Centre de vaccination - 1742 Pfizer - 354 Astrazeneca", new LatLng(42.8396802790619,2.91830241680145)),
                new Centre("Centre de vaccination - 1742 Pfizer - 453 Astrazeneca", new LatLng(45.0396354,-0.5022214)),
                new Centre("Centre de vaccination - 1742 Pfizer - 987 Astrazeneca", new LatLng(48.86661 ,2.322681)),
                new Centre("Centre de vaccination - 1742 Pfizer - 354 Astrazeneca", new LatLng(43.789129 ,4.83102 )),
                new Centre("Centre de vaccination - 1742 Pfizer - 987 Astrazeneca", new LatLng(48.854703,2.363875)),
                new Centre("Centre de vaccination - 1742 Pfizer - 34 Astrazeneca", new LatLng(44.935997691242,1.01565062999725)),
                new Centre("Centre de vaccination - 1742 Pfizer - 897 Astrazeneca", new LatLng(48.788491,-3.2271867)),
                new Centre("Centre de vaccination - 1742 Pfizer - 3312 Astrazeneca", new LatLng(46.6254445,1.9749036)),
                new Centre("Centre de vaccination - 1742 Pfizer - 864 Astrazeneca", new LatLng(46.4063,-1.5474)),
                new Centre("Centre de vaccination - 1742 Pfizer - 879 Astrazeneca", new LatLng(48.8272072,2.1985906)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(43.9878757,7.5509564)),
                new Centre("Centre de vaccination - 1742 Pfizer - 54 Astrazeneca", new LatLng(46.1978767,5.2356066)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(48.8564775743156,2.31269717216492)),
                new Centre("Centre de vaccination - 1742 Pfizer - 32 Astrazeneca", new LatLng(49.2530901204998,4.03418183326721)),
                new Centre("Centre de vaccination - 1742 Pfizer - 241 Astrazeneca", new LatLng(47.085296,2.3944818)),

                new Centre("Centre de vaccination - 1742 Pfizer - 254 Astrazeneca", new LatLng(48.8462842078404,2.34607324004173)),
                new Centre("Centre de vaccination - 1742 Pfizer - 4578 Astrazeneca", new LatLng(44.6691299,6.6252286)),
                new Centre("Centre de vaccination - 1742 Pfizer - 879 Astrazeneca", new LatLng(48.8553675326006,2.3450231552124)),
                new Centre("Centre de vaccination - 1742 Pfizer - 879 Astrazeneca", new LatLng(43.7736,4.833)),
                new Centre("Centre de vaccination - 1742 Pfizer - 785 Astrazeneca", new LatLng(44.8587327,0.0638404)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(43.2246742,0.6370025)),
                new Centre("Centre de vaccination - 1742 Pfizer - 345 Astrazeneca", new LatLng(43.310556,3.115278)),
                new Centre("Centre de vaccination - 1742 Pfizer - 9814 Astrazeneca", new LatLng(47.5732972,-2.9574633)),
                new Centre("Centre de vaccination - 1742 Pfizer - 3751 Astrazeneca", new LatLng(46.4941324,-0.0070385)),
                new Centre("Centre de vaccination - 1742 Pfizer - 984 Astrazeneca", new LatLng(47.0824115207644,2.3984956741333)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(44.8379962,-0.5777064)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(48.4477636872284,1.48798227310181)),
                new Centre("Centre de vaccination - 1742 Pfizer - 65 Astrazeneca", new LatLng(49.2534,4.033)),

                new Centre("Centre de vaccination - 1742 Pfizer - 648 Astrazeneca", new LatLng(48.8529761826414,2.34995305538177)),
                new Centre("Centre de vaccination - 1742 Pfizer - 984 Astrazeneca", new LatLng(46.1558010144313,-1.15323185920715)),
                new Centre("Centre de vaccination - 1742 Pfizer - 894 Astrazeneca", new LatLng(43.5678143607364,4.19086575508118)),
                new Centre("Centre de vaccination - 1742 Pfizer - 9878 Astrazeneca", new LatLng(49.895,2.302222)),
                new Centre("Centre de vaccination - 1742 Pfizer - 654 Astrazeneca", new LatLng(43.7448050133043,7.40184009075165)),
                new Centre("Centre de vaccination - 1742 Pfizer - 9877 Astrazeneca", new LatLng(50.666709,3.162723)),
                new Centre("Centre de vaccination - 1742 Pfizer - 636 Astrazeneca", new LatLng(43.70316,7.333887)),
                new Centre("Centre de vaccination - 1742 Pfizer - 112 Astrazeneca", new LatLng(48.9244255560091,2.02827036380768))



        ).forEach(db::add);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        VaccinDatabase db = new VaccinDatabase(this);
        List<Centre> centres = db.getAll();
        for (Centre c : centres) {
            mMap.addMarker(new MarkerOptions().position(c.getLatLng()).title(c.getName()));
            // mMap.addMarker(new MarkerOptions().position(c.getLatLng()).title(c.name).icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow))));
        }

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(centres.get(0).getLatLng(), 5), 1000, null);

        mMap.getUiSettings().setZoomControlsEnabled(true);

    }
}