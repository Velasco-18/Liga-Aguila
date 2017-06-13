package com.example.rubenvel.ligaaguila.fragments;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.attrs.Attrs;
import com.example.rubenvel.ligaaguila.databinding.FragmentHistoriaBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoriaFragment extends Fragment {

    public static HistoriaFragment instace(){return new HistoriaFragment();}

    public HistoriaFragment() {
        // Required empty public constructor
    }

    FragmentHistoriaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_historia, container, false);

        binding.DescripcionTres.setText(getString(R.string.descTresUno) +
                "\n"+ getString(R.string.descTresDos));

        binding.DescripcionCuatro.setText(getString(R.string.descCuatroUno) +
                "\n" + getString(R.string.descCuatroDos) +
                "\n" + getString(R.string.descCuatroTres) +
                "\n" + getString(R.string.descCuatroCuatro) +
                "\n" + getString(R.string.descCuatroCinco));

        Attrs.setImage(binding.imageTrofeo,"http://soccercolombiano.weebly.com/uploads/5/3/3/6/53366349/8485644_orig.jpg");
        Attrs.setImage(binding.image1,"https://upload.wikimedia.org/wikipedia/commons/b/bd/Deportivo_Independiente_Medellin_1922.jpg");
        Attrs.setImage(binding.image2,"https://admin.kienyke.com/wp-content/uploads/2016/09/Alt_Liga_Aguila-549x345.jpg");

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}
