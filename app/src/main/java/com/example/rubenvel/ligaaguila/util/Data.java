package com.example.rubenvel.ligaaguila.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rubev on 13/06/2017.
 */

public class Data {

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.130.13.87:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
