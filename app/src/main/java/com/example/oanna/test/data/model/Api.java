package com.example.oanna.test.data.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://randomuser.me/api/";

    @GET("?page=0&results=20&seed=abc")
    Call<UsersResponse> getResponse();
}
