package com.example.rubenvel.ligaaguila.fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.databinding.FragmentEquipoBinding;
import com.example.rubenvel.ligaaguila.models.Equipo;
import com.example.rubenvel.ligaaguila.net.EquipoService;
import com.example.rubenvel.ligaaguila.util.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class EquipoFragment extends Fragment {

    public static EquipoFragment instace(){return new EquipoFragment();}

    public EquipoFragment() {
        // Required empty public constructor
    }

    FragmentEquipoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_equipo, container, false);

        return binding.getRoot();
    }
}
