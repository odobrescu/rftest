package com.example.oanna.test.data.model;

import com.google.gson.annotations.SerializedName;

public class UserPicture {

    @SerializedName("medium")
    private String medium;
    @SerializedName("large")
    private String large;
    @SerializedName("thumbnail")
    private String thumbnail;

    public UserPicture(String medium, String large, String thumbnail) {
        this.medium = medium;
        this.large = large;
        this.thumbnail = thumbnail;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
