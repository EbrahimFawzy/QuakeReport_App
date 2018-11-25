package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String city;
    private long date;
    private String url;

    public Earthquake(double magnitude, String city, long date, String url) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getCity() {
        return city;
    }


    public long getDate() {
        return date;
    }


    public String getUrl() {
        return url;
    }
}
