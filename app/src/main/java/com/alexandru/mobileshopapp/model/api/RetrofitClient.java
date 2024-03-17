package com.alexandru.mobileshopapp.model.api;

import java.util.Collections;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static final String BASE_URL = "http://mobile-shop-api.hiring.devebs.net/";

    public static Retrofit retrofit = null;

    public static Retrofit getClient(){


        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

