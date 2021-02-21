package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HeightModel {

    @SerializedName("meters")
    @Expose
    private String meters;

    @SerializedName("feet")
    @Expose
    private String feet;

    public String getMeters() {
        return meters;
    }

    public String getFeet() {
        return feet;
    }

    @Override
    public String toString() {
        return "{" +
                "meters='" + meters + '\'' +
                ", feet='" + feet + '\'' +
                '}';
    }
}
