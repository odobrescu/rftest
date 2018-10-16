package com.example.oanna.test.data.model;

import com.google.gson.annotations.SerializedName;

public class Name {

    @SerializedName("first")
    private String firsName;

    @SerializedName("last")
    private String lastName;

    @SerializedName("title")
    private String title;

    public Name(String title , String firsName, String lastName) {
        this.title = title;
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
