package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RocketMiniModel {

    @SerializedName("rocket_id")
    @Expose
    private String rocket_id;

    @SerializedName("rocket_name")
    @Expose
    private String rocket_name;

    @SerializedName("rocket_type")
    @Expose
    private String rocket_type;

    public String getRocket_id() {
        return rocket_id;
    }

    public String getRocket_name() {
        return rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }

    @Override
    public String toString() {
        return "{" +
                "rocket_id='" + rocket_id + '\'' +
                ", rocket_name='" + rocket_name + '\'' +
                ", rocket_type='" + rocket_type + '\'' +
                '}';
    }
}
