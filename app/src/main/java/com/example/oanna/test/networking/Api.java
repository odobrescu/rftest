package com.example.oanna.test.networking;

import com.example.oanna.test.networking.responses.UsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://randomuser.me/";

    @GET("api/")
    Call<UsersResponse> getResponse(@Query("page") int page, @Query("results") String results);


}
