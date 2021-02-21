package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class RocketModel {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("active")
    @Expose
    private Boolean active;

    @SerializedName("stages")
    @Expose
    private String stages;

    @SerializedName("boosters")
    @Expose
    private String boosters;

    @SerializedName("cost_per_launc")
    @Expose
    private String cost_per_launc;

    @SerializedName("success_rate_ptc")
    @Expose
    private String success_rate_ptc;

    @SerializedName("first_flight")
    @Expose
    private String first_flight;

    @SerializedName("cuontry")
    @Expose
    private String cuontry;

    @SerializedName("company")
    @Expose
    private String company;

    @SerializedName("height")
    @Expose
    private HeightModel height;

    @SerializedName("diameter")
    @Expose
    private DiameterModel diameter;

    @SerializedName("mass")
    @Expose
    private MassModel mass;

    @SerializedName("payload_weights")
    @Expose
    private List<PayloadWeightsModel> payload_weights;

    @SerializedName("first_stage")
    @Expose
    private FirstStageModel first_stage;

    //SecondStageModel
    @SerializedName("second_stage")
    @Expose
    private FirstStageModel second_stage;

    @SerializedName("engines")
    @Expose
    private EnginesModel engines;

    @SerializedName("landing_legs")
    @Expose
    private LandingLegsModel landing_legs;

    @SerializedName("flickr_images")
    @Expose
    private String[] flickr_images;


    @SerializedName("wikipedia")
    @Expose
    private String wikipedia;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("rocket_id")
    @Expose
    private String rocket_id;

    @SerializedName("rocket_name")
    @Expose
    private String rocket_name;

    @SerializedName("rocket_type")
    @Expose
    private String rocket_type;


    public String getId() {
        return id;
    }

    public Boolean getActive() {
        return active;
    }

    public String getStages() {
        return stages;
    }

    public String getBoosters() {
        return boosters;
    }

    public String getCost_per_launc() {
        return cost_per_launc;
    }

    public String getSuccess_rate_ptc() {
        return success_rate_ptc;
    }

    public String getFirst_flight() {
        return first_flight;
    }

    public String getCuontry() {
        return cuontry;
    }

    public String getCompany() {
        return company;
    }

    public HeightModel getHeight() {
        return height;
    }

    public DiameterModel getDiameter() {
        return diameter;
    }

    public MassModel getMass() {
        return mass;
    }

    public List<PayloadWeightsModel> getPayload_weights() {
        return payload_weights;
    }

    public FirstStageModel getFirst_stage() {
        return first_stage;
    }

    public FirstStageModel getSecond_stage() {
        return second_stage;
    }

    public EnginesModel getEngines() {
        return engines;
    }

    public LandingLegsModel getLanding_legs() {
        return landing_legs;
    }

    public String[] getFlickr_images() {
        return flickr_images;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public String getDescription() {
        return description;
    }

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
                "id='" + id + '\'' +
                ", active=" + active +
                ", stages='" + stages + '\'' +
                ", boosters='" + boosters + '\'' +
                ", cost_per_launc='" + cost_per_launc + '\'' +
                ", success_rate_ptc='" + success_rate_ptc + '\'' +
                ", first_flight='" + first_flight + '\'' +
                ", cuontry='" + cuontry + '\'' +
                ", company='" + company + '\'' +
                ", height=" + height +
                ", diameter=" + diameter +
                ", mass=" + mass +
                ", payload_weights=" + payload_weights +
                ", first_stage=" + first_stage +
                ", second_stage=" + second_stage +
                ", engines=" + engines +
                ", landing_legs=" + landing_legs +
                ", flickr_images=" + Arrays.toString(flickr_images) +
                ", wikipedia='" + wikipedia + '\'' +
                ", description='" + description + '\'' +
                ", rocket_id='" + rocket_id + '\'' +
                ", rocket_name='" + rocket_name + '\'' +
                ", rocket_type='" + rocket_type + '\'' +
                '}';
    }
}
