package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IspModel {

    @SerializedName("sea_level")
    @Expose
    private String sea_level;

    @SerializedName("vacuum")
    @Expose
    private String vacuum;


    public String getSea_level() {
        return sea_level;
    }

    public String getVacuum() {
        return vacuum;
    }

    @Override
    public String toString() {
        return "{" +
                "sea_level='" + sea_level + '\'' +
                ", vacuum='" + vacuum + '\'' +
                '}';
    }
}
