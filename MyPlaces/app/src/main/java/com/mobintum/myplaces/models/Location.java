package com.mobintum.myplaces.models;

/**
 * Created by Ricardo on 05/05/17.
 * www.mobintum.com
 */

public class Location {

    private String address;
    private double lat;
    private double lng;
    private int distance;

    public Location(String address, double lat, double lng, int distance) {
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.distance = distance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}