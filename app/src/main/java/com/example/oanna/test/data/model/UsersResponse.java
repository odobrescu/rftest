package com.example.oanna.test.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UsersResponse {

    @SerializedName("results")
    public List<User> usersList;
}

