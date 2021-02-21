package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondStageModel {

    @SerializedName("engines")
    @Expose
    private String engines;

    @SerializedName("fuel_amount_tons")
    @Expose
    private String fuel_amount_tons;

    @SerializedName("trust")
    @Expose
    private TrustSeaLevelModel trust;

    @SerializedName("payloads")
    @Expose
    private PayloadsModel payloads;

    public String getEngines() {
        return engines;
    }

    public String getFuel_amount_tons() {
        return fuel_amount_tons;
    }

    public TrustSeaLevelModel getTrust() {
        return trust;
    }

    @Override
    public String toString() {
        return "{" +
                "engines='" + engines + '\'' +
                ", fuel_amount_tons='" + fuel_amount_tons + '\'' +
                ", trust=" + trust +
                ", payloads=" + payloads +
                '}';
    }
}
