package com.example.eval;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface Api {

    String BASE_URL = "http://localhost:3000/";
    @GET("topics")
    Call<List<topics>> getTopics();

}


