package com.example.rubenvel.ligaaguila.fragments;



import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.databinding.FragmentNoticiasBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoticiasFragment extends Fragment{

    FragmentNoticiasBinding binding;

    public NoticiasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_noticias, container, false);

        binding.buttonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.paginaWeb.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
            }
        });

        binding.paginaWeb.getSettings().setJavaScriptEnabled(true);
        binding.paginaWeb.setWebViewClient(new WebViewClient());
        binding.paginaWeb.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");

        return binding.getRoot();
    }

}
