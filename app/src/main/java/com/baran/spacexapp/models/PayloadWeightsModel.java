package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PayloadWeightsModel {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("kg")
    @Expose
    private String kg;

    @SerializedName("lb")
    @Expose
    private String lb;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKg() {
        return kg;
    }

    public String getLb() {
        return lb;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", kg='" + kg + '\'' +
                ", lb='" + lb + '\'' +
                '}';
    }
}
