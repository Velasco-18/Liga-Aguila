package com.example.rubenvel.ligaaguila.net;

import com.example.rubenvel.ligaaguila.models.SimpleResponse;
import com.example.rubenvel.ligaaguila.models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by rubev on 13/06/2017.
 */

public interface UserService {

    //Ejecutar de manera síncrona Call<>
    @POST("usuarios/login")
    Call<SimpleResponse> login(@Body Usuario usuario);

    @POST("usuarios/registro")
    Call<SimpleResponse> registro(@Body Usuario usuario);

}
