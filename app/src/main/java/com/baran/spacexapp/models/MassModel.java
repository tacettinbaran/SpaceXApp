package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MassModel {

    @SerializedName("kg")
    @Expose
    private String kg;

    @SerializedName("lb")
    @Expose
    private String lb;

    public String getKg() {
        return kg;
    }

    public String getLb() {
        return lb;
    }

    @Override
    public String toString() {
        return "{" +
                "kg='" + kg + '\'' +
                ", lb='" + lb + '\'' +
                '}';
    }
}
