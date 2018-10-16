package com.example.oanna.test.networking.responses;

import com.example.oanna.test.data.model.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UsersResponse {

    @SerializedName("results")
    public List<User> usersList;
}

