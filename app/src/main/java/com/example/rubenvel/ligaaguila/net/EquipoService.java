package com.example.rubenvel.ligaaguila.net;

import com.example.rubenvel.ligaaguila.models.Equipo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by rubev on 13/06/2017.
 */

public interface EquipoService {

    @GET("equipos")
    Call<List<Equipo>> all();

}
