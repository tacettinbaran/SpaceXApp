package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaunchesModel {

    @SerializedName("rocket")
    @Expose
    private RocketMiniModel rocket;

    @SerializedName("links")
    @Expose
    private LinksModel links;

    public RocketMiniModel getRocket() {
        return rocket;
    }

    public LinksModel getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "{" +
                "rocket=" + rocket +
                ", links=" + links +
                '}';
    }
}
