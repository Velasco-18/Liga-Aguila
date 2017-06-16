package com.example.rubenvel.ligaaguila;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rubenvel.ligaaguila.databinding.ActivityInicioBinding;
import com.example.rubenvel.ligaaguila.models.SimpleResponse;
import com.example.rubenvel.ligaaguila.models.Usuario;
import com.example.rubenvel.ligaaguila.net.UserService;
import com.example.rubenvel.ligaaguila.util.Data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InicioActivity extends AppCompatActivity{

    Context contexto;
    ActivityInicioBinding binding;
    UserService service;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_inicio);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.setHandler(this);

        service = Data.retrofit.create(UserService.class);

        preferences = getSharedPreferences("Registro", contexto.MODE_PRIVATE);

        int spinnerEquipo = preferences.getInt("Equipo",-1);
        if(spinnerEquipo != -1){
            binding.spinner.setSelection(spinnerEquipo);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Intent intent = new Intent(this, SesionActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, SesionActivity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }

    public void goToGuardarRegistro(){

        String nombre = binding.editNombre.getText().toString();
        String apellido=binding.editApellido.getText().toString();
        String usuario =binding.editUsuario.getText().toString();
        String contrasena= binding.editContrasena.getText().toString();
        String contrasenaR = binding.editContrasenaRec.getText().toString();
        String correo = binding.editCorreo.getText().toString();
        int equipo=binding.spinner.getSelectedItemPosition();

         if(nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || contrasena.isEmpty() || contrasenaR.isEmpty() || correo.isEmpty()){

             Toast.makeText(getApplicationContext(), "Llene los campos de registro completamente", Toast.LENGTH_SHORT).show();

         }else if(contrasena.equals(contrasenaR)){
             /////////////////////////////Se crea el objeto de usuario para enviar al Servidor/////////////////////////
             Usuario usuarios = new Usuario(nombre, apellido, usuario, contrasena, contrasenaR, correo, equipo);
             Call<SimpleResponse> request = service.registro(usuarios);
             request.enqueue(new Callback<SimpleResponse>() {
                 @Override
                 public void onResponse(Call<SimpleResponse> call, Response<SimpleResponse> response) {
                     if(response.isSuccessful()){

                         SimpleResponse res = response.body();

                         if(res.isSuccess()){
                             Toast.makeText(getApplicationContext(), "Registrado Correctamente", Toast.LENGTH_SHORT).show();

                             Intent intent = new Intent(InicioActivity.this, SesionActivity.class);
                             startActivity(intent);
                             finish();
                         }else{
                             Toast.makeText(InicioActivity.this, res.getMsg(), Toast.LENGTH_SHORT).show();
                         }
                     }
                 }

                 @Override
                 public void onFailure(Call<SimpleResponse> call, Throwable t) {
                     Toast.makeText(InicioActivity.this, R.string.errorConnect, Toast.LENGTH_SHORT).show();

                 }
             });
             /////////////////////////////////////////////////////////////////////////////////////////////////////////

             SharedPreferences.Editor editor = preferences.edit();
             editor.putString("Nombre", nombre);
             editor.putString("Apellido", apellido);
             editor.putString("Usuario", usuario);
             editor.putString("Contrasena", contrasena);
             editor.putString("ContrasenaRec", contrasenaR);
             editor.putString("Correo", correo);

             editor.putInt("Equipo", equipo);

             editor.apply();

         }else{

                Toast.makeText(getApplicationContext(), "Rectifica tu contraseña", Toast.LENGTH_SHORT).show();

         }
    }
}
