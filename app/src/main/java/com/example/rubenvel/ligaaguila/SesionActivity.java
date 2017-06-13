package com.example.rubenvel.ligaaguila;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rubenvel.ligaaguila.databinding.ActivitySesionBinding;
import com.example.rubenvel.ligaaguila.models.SimpleResponse;
import com.example.rubenvel.ligaaguila.models.Usuario;
import com.example.rubenvel.ligaaguila.net.UserService;
import com.example.rubenvel.ligaaguila.util.Data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SesionActivity extends AppCompatActivity {

    ActivitySesionBinding binding;
    UserService service;

    Context contexto;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences("Registro", contexto.MODE_PRIVATE);

        boolean login = preferences.getBoolean("login", false);
        if(login){
            Intent intent=new Intent(this, NoticiasActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_sesion);
        binding.setHandlerSesion(this);
        binding.setHandlerRegistro(this);
        binding.setHandlerOmitir(this);
        //Objeto del servicio usuario
        service = Data.retrofit.create(UserService.class);
    }

    public void goToInicioSesion(){

        String user = binding.user.getText().toString();
        String password = binding.password.getText().toString();

        if(user.isEmpty() || password.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Llene los campos completamente", Toast.LENGTH_SHORT).show();
        }else{
            ////////////////////////////////Se crea el objeto de usuario para enviar al Servidor/////////////////////
            Usuario usuario = new Usuario(user, password);
            //Recupera de forma Síncrona
            Call<SimpleResponse> request = service.login(usuario);
            request.enqueue(new Callback<SimpleResponse>() {
                @Override
                public void onResponse(Call<SimpleResponse> call, Response<SimpleResponse> response) {

                    if (response.isSuccessful()) {

                        SimpleResponse res = response.body();

                        if (res.isSuccess()) {
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putBoolean("login", true);
                            editor.apply();

                            Intent intent = new Intent(SesionActivity.this, NoticiasActivity.class);
                            startActivity(intent);
                            finish();

                        } else {
                            Toast.makeText(SesionActivity.this, res.getMsg(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<SimpleResponse> call, Throwable t) {
                    Toast.makeText(SesionActivity.this, R.string.errorConnect, Toast.LENGTH_SHORT).show();
                }
            });
            //////////////////////////////////////////////////////////////////////////////////////////////////////////
        }
    }

    public void goToRegistro(){
        Intent intent = new Intent(this, InicioActivity.class);
        startActivity(intent);
        finish();
    }

    public void goToOmitir(){
        Intent intent = new Intent(this, NoticiasActivity.class);
        startActivity(intent);
        finish();
    }
}
