package com.example.rubenvel.ligaaguila;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebViewClient;

import com.example.rubenvel.ligaaguila.databinding.ActivityMoreInfoBinding;
import com.example.rubenvel.ligaaguila.fragments.PosicionesFragment;

public class MoreInfoActivity extends AppCompatActivity {

    ActivityMoreInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_more_info);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.paginaWebInfo.loadUrl("http://colombia.as.com/resultados/futbol/colombia_i/clasificacion/");
            }
        });

        binding.paginaWebInfo.getSettings().setJavaScriptEnabled(true);
        binding.paginaWebInfo.setWebViewClient(new WebViewClient());
        binding.paginaWebInfo.loadUrl("http://colombia.as.com/resultados/futbol/colombia_i/clasificacion/");

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Intent intent = new Intent(this, NoticiasActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, NoticiasActivity.class);
        startActivity(intent);
        finish();
        super.onBackPressed();
    }
}
