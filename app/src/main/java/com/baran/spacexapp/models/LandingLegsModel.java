package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LandingLegsModel {

    @SerializedName("number")
    @Expose
    private String number;

    @SerializedName("material")
    @Expose
    private String material;

    public String getNumber() {
        return number;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "{" +
                "number='" + number + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
