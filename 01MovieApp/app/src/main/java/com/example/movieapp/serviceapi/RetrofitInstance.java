package com.example.movieapp.serviceapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit = null;
    private static final String BASER_URL = "https://api.themoviedb.org/3/ ";

    public static MovieApiService getService(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().
                    baseUrl(BASER_URL).
                    addConverterFactory(GsonConverterFactory.create()).
                    build();
        }
        return retrofit.create(MovieApiService.class);
    }
}
