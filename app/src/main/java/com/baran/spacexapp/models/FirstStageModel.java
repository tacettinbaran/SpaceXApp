package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstStageModel {

    @SerializedName("reusable")
    @Expose
    private Boolean reusable;

    @SerializedName("engines")
    @Expose
    private String engines;

    @SerializedName("fuel_amount_tons")
    @Expose
    private String fuel_amount_tons;

    @SerializedName("burn_time_sec")
    @Expose
    private String burn_time_sec;

    @SerializedName("trust_sea_level")
    @Expose
    private TrustSeaLevelModel trust_sea_level;

    @SerializedName("trust_vacuum")
    @Expose
    private TrustVacuumModel trust_vacuum;

    public Boolean getReusable() {
        return reusable;
    }

    public String getEngines() {
        return engines;
    }

    public String getFuel_amount_tons() {
        return fuel_amount_tons;
    }

    public String getBurn_time_sec() {
        return burn_time_sec;
    }

    public TrustSeaLevelModel getTrust_sea_level() {
        return trust_sea_level;
    }

    public TrustVacuumModel getTrust_vacuum() {
        return trust_vacuum;
    }

    @Override
    public String toString() {
        return "{" +
                "reusable=" + reusable +
                ", engines='" + engines + '\'' +
                ", fuel_amount_tons='" + fuel_amount_tons + '\'' +
                ", burn_time_sec='" + burn_time_sec + '\'' +
                ", trust_sea_level=" + trust_sea_level +
                ", trust_vacuum=" + trust_vacuum +
                '}';
    }
}
