package com.example.eval

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        Api api = retorofit.create(Api.class);

        Call<List<topics>> call = api.getTopics();

        call.enqueue(new Callback<List<topics>>){
            override fun onResponse(call: Call<List<topics>>, response: Response<List<topics>>) {
                val allTopics = response.body()
                if (allTopics != null) {
                    for (c in allTopics)
                        info(" : ${c.topic_title} : ${c.topic_content} ")
                }
            }
        }
    }
}
