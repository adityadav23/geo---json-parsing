package com.example.jsonparsing;

public class Earthquake {

        private double mMagnitude ;
        private String mPlace ;
        private  long mTime ;

    public Earthquake(double mMagnitude, String mPlace, long mTime) {

        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mTime = mTime;

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
}
