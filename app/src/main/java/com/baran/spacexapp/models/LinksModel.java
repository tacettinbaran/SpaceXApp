package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LinksModel {

    @SerializedName("mission_patch")
    @Expose
    private String mission_patch;

    @SerializedName("mission_patch_small")
    @Expose
    private String mission_patch_small;

    public String getMission_patch() {
        return mission_patch;
    }

    public String getMission_patch_small() {
        return mission_patch_small;
    }

    @Override
    public String toString() {
        return "{" +
                "mission_patch='" + mission_patch + '\'' +
                ", mission_patch_small='" + mission_patch_small + '\'' +
                '}';
    }
}
