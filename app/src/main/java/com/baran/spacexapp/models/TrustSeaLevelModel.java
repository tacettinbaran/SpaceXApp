package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrustSeaLevelModel {

    @SerializedName("kN")
    @Expose
    private String kN;

    @SerializedName("lbf")
    @Expose
    private String lbf;

    public String getkN() {
        return kN;
    }

    public String getLbf() {
        return lbf;
    }

    @Override
    public String toString() {
        return "{" +
                "kN='" + kN + '\'' +
                ", lbf='" + lbf + '\'' +
                '}';
    }
}
