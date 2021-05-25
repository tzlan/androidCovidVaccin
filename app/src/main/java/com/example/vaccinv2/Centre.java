package com.example.vaccinv2;

import com.google.android.gms.maps.model.LatLng;

public class Centre {
    private int id;
    private String name;
    private String lon;
    private String lat;

    public Centre(int id, String name, String lon, String lat) {
        this.setId(id);
        this.setName(name);
        this.setLon(lon);
        this.setLat(lat);
    }

    public Centre(String name, String lon, String lat) {
        this.setName(name);
        this.setLon(lon);
        this.setLat(lat);
    }

    public Centre(String name, LatLng latLng) {
        this.setName(name);
        this.setLon(String.valueOf(latLng.longitude));
        this.setLat(String.valueOf(latLng.latitude));
    }

    @Override
    public String toString() {
        return "Centre{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lon='" + getLon() + '\'' +
                ", lat='" + getLat() + '\'' +
                '}';
    }

    public LatLng getLatLng(){
        return new LatLng(Float.parseFloat(this.getLat()), Float.parseFloat(this.getLon()));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
