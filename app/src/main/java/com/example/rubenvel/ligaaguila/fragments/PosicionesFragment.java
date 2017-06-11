package com.example.rubenvel.ligaaguila.fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.adapters.PosicionesAdapter;
import com.example.rubenvel.ligaaguila.databinding.FragmentPosicionesBinding;
import com.example.rubenvel.ligaaguila.models.Posiciones;
import com.example.rubenvel.ligaaguila.util.PosicionesData;

/**
 * A simple {@link Fragment} subclass.
 */
public class PosicionesFragment extends Fragment {

    public static PosicionesFragment instace(){return new PosicionesFragment();}

    public PosicionesFragment() {
        // Required empty public constructor
    }

    FragmentPosicionesBinding binding;
    PosicionesAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_posiciones, container, false);

        adapter = new PosicionesAdapter(getLayoutInflater(null), PosicionesData.getDataPosiciones(), null);
        binding.posicionesList.setAdapter(adapter); //Posicion Recycler
        binding.posicionesList.setLayoutManager(new LinearLayoutManager(getActivity())); //Organizar elementos en pantalla
        //binding.
        return binding.getRoot();
    }

}
