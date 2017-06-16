package com.example.rubenvel.ligaaguila.fragments;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.rubenvel.ligaaguila.MoreInfoActivity;
import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.adapters.EquipoAdapter;
import com.example.rubenvel.ligaaguila.databinding.FragmentPosicionesBinding;
import com.example.rubenvel.ligaaguila.models.Equipo;
import com.example.rubenvel.ligaaguila.net.EquipoService;
import com.example.rubenvel.ligaaguila.util.Data;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class PosicionesFragment extends Fragment implements Callback<List<Equipo>> {

    public static PosicionesFragment instace(){return new PosicionesFragment();}

    public PosicionesFragment() {
        // Required empty public constructor
    }

    FragmentPosicionesBinding binding;
    EquipoAdapter adapter;
    EquipoService service;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_posiciones, container, false);

        binding.buttonMasInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Selecciona el equipo del cual deseas ver mas información", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getActivity(), MoreInfoActivity.class);
                startActivity(intent);
            }
        });

        adapter = new EquipoAdapter(getLayoutInflater(null), new ArrayList<Equipo>(), null);
        binding.posicionesList.setAdapter(adapter); //Posicion Recycler
        binding.posicionesList.setLayoutManager(new LinearLayoutManager(getActivity())); //Organizar elementos en pantalla

        service = Data.retrofit.create(EquipoService.class);

        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        cargarEquipos();
    }

    private void cargarEquipos(){
        Call<List<Equipo>> req = service.all();
        req.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<Equipo>> call, Response<List<Equipo>> response) {
        if(response.isSuccessful()){
            adapter.setData(response.body());
        }
    }

    @Override
    public void onFailure(Call<List<Equipo>> call, Throwable t) {
        Toast.makeText(getActivity(), R.string.errorConnect, Toast.LENGTH_SHORT).show();
    }
}
