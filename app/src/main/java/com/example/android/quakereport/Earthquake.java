package com.example.android.quakereport;

/**
 * Created by israel on 9/4/2016.
 */
public class Earthquake {
    private String mLocation;
    private Double mMagnitude;
    private long mTimeInMillSec;
    private String mUrl;

    public Earthquake (double magnitude, String location, long time, String url){
        mLocation = location;
        mMagnitude = magnitude;
        mTimeInMillSec = time;
    }

    public String getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMillSec() {
        return mTimeInMillSec;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
