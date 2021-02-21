package com.baran.spacexapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PayloadsModel {

    @SerializedName("option_1")
    @Expose
    private String option_1;

    @SerializedName("composite_fairing")
    @Expose
    private CompositeFairingModel composite_fairing;

    public String getOption_1() {
        return option_1;
    }

    public CompositeFairingModel getComposite_fairing() {
        return composite_fairing;
    }

    @Override
    public String toString() {
        return "{" +
                "option_1='" + option_1 + '\'' +
                ", composite_fairing=" + composite_fairing +
                '}';
    }
}
