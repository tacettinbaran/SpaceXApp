package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompositeFairingModel {

    @SerializedName("height")
    @Expose
    private HeightModel height;

    @SerializedName("diameter")
    @Expose
    private DiameterModel diameter;

    public HeightModel getHeight() {
        return height;
    }

    public DiameterModel getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "{" +
                "height=" + height +
                ", diameter=" + diameter +
                '}';
    }
}
