package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnginesModel {

    @SerializedName("number")
    @Expose
    private String number;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("version")
    @Expose
    private String version;

    @SerializedName("layout")
    @Expose
    private String layout;

    @SerializedName("isp")
    @Expose
    private IspModel isp;


    @SerializedName("enegine_loss_max")
    @Expose
    private String enegine_loss_max;

    @SerializedName("propellant_1")
    @Expose
    private String propellant_1;

    @SerializedName("propellant_2")
    @Expose
    private String propellant_2;

    @SerializedName("trust_sea_level")
    @Expose
    private TrustSeaLevelModel trust_sea_level;

    @SerializedName("trust_vacuum")
    @Expose
    private TrustVacuumModel trust_vacuum;

    @SerializedName("trust_to_weight")
    @Expose
    private String trust_to_weight;

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getLayout() {
        return layout;
    }

    public String getEnegine_loss_max() {
        return enegine_loss_max;
    }


    public String getPropellant_2() {
        return propellant_2;
    }

    public String getPropellant_1() {
        return propellant_1;
    }

    public TrustSeaLevelModel getTrust_sea_level() {
        return trust_sea_level;
    }


    public TrustVacuumModel getTrust_vacuum() {
        return trust_vacuum;
    }

    public String getTrust_to_weight() {
        return trust_to_weight;
    }

    @Override
    public String toString() {
        return "{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", layout='" + layout + '\'' +
                ", negine_loss_max='" + enegine_loss_max + '\'' +
                ", propellant_1='" + propellant_1 + '\'' +
                ", propellant_2='" + propellant_2 + '\'' +
                ", trust_sea_level=" + trust_sea_level +
                ", trust_vacuum=" + trust_vacuum +
                ", trust_to_weight='" + trust_to_weight + '\'' +
                '}';
    }
}
