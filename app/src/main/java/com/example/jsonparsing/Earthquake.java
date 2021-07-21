package com.example.jsonparsing;

public class Earthquake {

        private double mMagnitude ;
        private String mPlace ;
        private  long mTime ;
        private String  mUrl ;

    public Earthquake(double magnitude, String place, long time, String url) {

        this.mMagnitude = magnitude;
        this.mPlace = place;
        this.mTime = time;
        this.mUrl = url;

    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getmTime() {
        return mTime;
    }

    public String getmUrl(){return mUrl; }
}
