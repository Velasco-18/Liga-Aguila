package com.example.rubenvel.ligaaguila.fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;

import com.example.rubenvel.ligaaguila.R;
import com.example.rubenvel.ligaaguila.attrs.Attrs;
import com.example.rubenvel.ligaaguila.databinding.FragmentEquipoBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class EquipoFragment extends Fragment {

    public static EquipoFragment instace(){return new EquipoFragment();}

    public EquipoFragment() {
        // Required empty public constructor
    }

    FragmentEquipoBinding binding;
    SharedPreferences preferences;
    Context contexto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_equipo, container, false);

        cargarDatos();

        return binding.getRoot();
    }

    void cargarDatos(){

        preferences = this.getActivity().getSharedPreferences("Registro", contexto.MODE_PRIVATE);

        binding.paginaWebEquipo.getSettings().setJavaScriptEnabled(true);
        binding.paginaWebEquipo.setWebViewClient(new WebViewClient());

        int spinnerEquipo = preferences.getInt("Equipo",-1);
        if(spinnerEquipo != -1){
            //region Casos para mostrar equipo
            switch(spinnerEquipo){
                case 0:
                    Attrs.setImage(binding.imageViewEquipo,"http://1.bp.blogspot.com/-wNoVmzHIxh4/UUO_WuU_YAI/AAAAAAAAAnA/evnh28VXIBk/s1600/AmericadeCali_Escudo.png");
                    binding.textViewNombreEquipo.setText("América de Cali");
                    binding.textViewAnio.setText("1927");
                    binding.textViewJugador.setText("Cristian Martínez Borja");
                    binding.textViewGoles.setText("Goles: 9");
                    Attrs.setImage(binding.imageViewJugador,"http://americadecali.co/wp-content/uploads/2016/08/borja.png");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/america_de_cali/3952/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 1:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3855.png");
                    binding.textViewNombreEquipo.setText("Atl. Nacional");
                    binding.textViewAnio.setText("1947");
                    binding.textViewJugador.setText("Dayro Moreno");
                    binding.textViewGoles.setText("Goles: 13");
                    Attrs.setImage(binding.imageViewJugador,"http://static.hsbnoticias.com/sites/default/files/styles/medium/public/gallery/2017/06/dayro-moreno.png?itok=MjK5vitt");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/atletico_nacional/3855/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 2:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4200.png");
                    binding.textViewNombreEquipo.setText("Ind. Medellín");
                    binding.textViewAnio.setText("1913");
                    binding.textViewJugador.setText("Juan Quintero");
                    binding.textViewGoles.setText("Goles: 8");
                    Attrs.setImage(binding.imageViewJugador,"http://admin.bluradio.com/sites/default/files/styles/blu_medium_650x466/public/juan-fernado-quintero.png?itok=M2Ih7tY4");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/medellin/4200/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 3:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4201.png");
                    binding.textViewNombreEquipo.setText("Deportivo Cali");
                    binding.textViewAnio.setText("1912");
                    binding.textViewJugador.setText("Jefferson Duque");
                    binding.textViewGoles.setText("Goles: 10");
                    Attrs.setImage(binding.imageViewJugador,"http://hsbnoticias.com/sites/default/files/gallery/2015/10/duque-getty.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/deportivo_cali/4201/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 4:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4196.png");
                    binding.textViewNombreEquipo.setText("Millonarios");
                    binding.textViewAnio.setText("1946");
                    binding.textViewJugador.setText("Duvier Riascos");
                    binding.textViewGoles.setText("Goles: 7");
                    Attrs.setImage(binding.imageViewJugador,"http://static.hsbnoticias.com/sites/default/files/styles/medium/public/gallery/2017/02/riascos.jpg?itok=b-g-hrV_");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/millonarios/4196/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 5:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4206.png");
                    binding.textViewNombreEquipo.setText("Jaguares de Córdoba");
                    binding.textViewAnio.setText("2012");
                    binding.textViewJugador.setText("Juan Mezú");
                    binding.textViewGoles.setText("Goles: 4");
                    Attrs.setImage(binding.imageViewJugador,"http://assets.winsports.co/sites/default/files/articulos/estandar/golmezu2.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/jaguares_fc/4206/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 6:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4194.png");
                    binding.textViewNombreEquipo.setText("Ind. Santa Fe");
                    binding.textViewAnio.setText("1941");
                    binding.textViewJugador.setText("Jonathan Gómez");
                    binding.textViewGoles.setText("Goles: 3");
                    Attrs.setImage(binding.imageViewJugador,"http://www.elmundo.com/assets/uploads/files/656c4-santa-fe-vs-millonarios.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/santa_fe/4194/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 7:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4199.png");
                    binding.textViewNombreEquipo.setText("Alianza Petrolera");
                    binding.textViewAnio.setText("1982");
                    binding.textViewJugador.setText("César Arias");
                    binding.textViewGoles.setText("Goles: 9");
                    Attrs.setImage(binding.imageViewJugador,"http://www.futbolred.com/contenido/liga-aguila/IMAGEN/IMAGEN-16845566-0.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/alianza/4199/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 8:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3839.png");
                    binding.textViewNombreEquipo.setText("Patriotas");
                    binding.textViewAnio.setText("2003");
                    binding.textViewJugador.setText("Uvaldo Luna");
                    binding.textViewGoles.setText("Goles: 7");
                    Attrs.setImage(binding.imageViewJugador,"http://img.informador.com.mx/biblioteca/imagen/370x277/1440/1439148.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/patriotas/3839/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 9:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3849.png");
                    binding.textViewNombreEquipo.setText("La Equidad");
                    binding.textViewAnio.setText("1982");
                    binding.textViewJugador.setText("Diego Álvarez");
                    binding.textViewGoles.setText("Goles: 4");
                    //Attrs.setImage(binding.imageViewJugador,"");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/la_equidad/3849/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 10:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4227.png");
                    binding.textViewNombreEquipo.setText("Atl. Bucaramanga");
                    binding.textViewAnio.setText("1948");
                    binding.textViewJugador.setText("Jhony Cano");
                    binding.textViewGoles.setText("Goles: 6");
                    Attrs.setImage(binding.imageViewJugador,"http://static.hsbnoticias.com/sites/default/files/styles/medium/public/gallery/2017/05/jhony-cano_r0.png?itok=9NWC4Kki");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/atletico_bucaramanga/4227/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 11:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3840.png");
                    binding.textViewNombreEquipo.setText("Tolima");
                    binding.textViewAnio.setText("1954");
                    binding.textViewJugador.setText("Marco Pérez");
                    binding.textViewGoles.setText("Goles: 5");
                    Attrs.setImage(binding.imageViewJugador,"http://espijao.com/wp-content/uploads/2015/06/marco-perez-tolima.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/tolima/3840/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 12:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4228.png");
                    binding.textViewNombreEquipo.setText("Tigres");
                    binding.textViewAnio.setText("2003");
                    binding.textViewJugador.setText("N.N");
                    binding.textViewGoles.setText("Goles: 1");
                    //Attrs.setImage(binding.imageViewJugador,"http://www.futbolred.com/contenido/liga-aguila/IMAGEN/IMAGEN-16845566-0.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/expreso_rojo/4228/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 13:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3850.png");
                    binding.textViewNombreEquipo.setText("Rionegro Águilas");
                    binding.textViewAnio.setText("2008");
                    binding.textViewJugador.setText("Daniel Hernández");
                    binding.textViewGoles.setText("Goles: 4");
                    Attrs.setImage(binding.imageViewJugador,"http://static.hsbnoticias.com/sites/default/files/styles/original/public/gallery/2017/02/daniel-hernandez-0.jpg?itok=_ej2hTYM");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/itagui_ditaires/3850/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 14:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3847.png");
                    binding.textViewNombreEquipo.setText("Atl. Huila");
                    binding.textViewAnio.setText("1990");
                    binding.textViewJugador.setText("Sergio Almirón");
                    binding.textViewGoles.setText("Goles: 8");
                    Attrs.setImage(binding.imageViewJugador,"http://www.futbolred.com/contenido/liga-aguila/IMAGEN/IMAGEN-16845566-0.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/huila/3847/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 15:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3851.png");
                    binding.textViewNombreEquipo.setText("Junior");
                    binding.textViewAnio.setText("1924");
                    binding.textViewJugador.setText("Roberto Ovelar");
                    binding.textViewGoles.setText("Goles: 7");
                    Attrs.setImage(binding.imageViewJugador,"http://www.futbolred.com/contenido/liga-aguila/IMAGEN/IMAGEN-16344135-0.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/junior/3851/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 16:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4208.png");
                    binding.textViewNombreEquipo.setText("Cortuluá");
                    binding.textViewAnio.setText("1967");
                    binding.textViewJugador.setText("Feiver Mercado");
                    binding.textViewGoles.setText("Goles: 11");
                    Attrs.setImage(binding.imageViewJugador,"http://static.hsbnoticias.com/sites/default/files/styles/original/public/gallery/2017/03/1b-5rrr.jpg?itok=P7G86m_6");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/cortulua/4208/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 17:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4202.png");
                    binding.textViewNombreEquipo.setText("Once Caldas");
                    binding.textViewAnio.setText("1959");
                    binding.textViewJugador.setText("Michael Ortega");
                    binding.textViewGoles.setText("Goles: 5");
                    Attrs.setImage(binding.imageViewJugador,"http://www.oncecaldas.com.co/wp-content/uploads/2017/02/08.png");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/once_caldas/4202/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 18:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/3841.png");
                    binding.textViewNombreEquipo.setText("Envigado");
                    binding.textViewAnio.setText("1989");
                    binding.textViewJugador.setText("Joseph Cox");
                    binding.textViewGoles.setText("Goles: 4");
                    Attrs.setImage(binding.imageViewJugador,"http://images.tvmax-9.com/somoslasele/panas_en_el_extranjero/Debut-Joseph-Cox-Envigado-FC_9134383.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/envigado_futbol_club/3841/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                case 19:
                    Attrs.setImage(binding.imageViewEquipo,"http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/4195.png");
                    binding.textViewNombreEquipo.setText("Dep. Pasto");
                    binding.textViewAnio.setText("1949");
                    binding.textViewJugador.setText("Santiago Tréllez");
                    binding.textViewGoles.setText("Goles: 9");
                    Attrs.setImage(binding.imageViewJugador,"http://saquedemeta.co/wp-content/uploads/2017/03/Trellez-regresa-al-gol.jpg");

                    binding.paginaWebEquipo.loadUrl("http://colombia.as.com/resultados/ficha/equipo/pasto/4195/");

                    binding.buttonPrincipal.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //binding.buttonPrincipal.loadUrl("http://colombia.as.com/tag/c/4166a9c5bd1c0f85c03313a41aa334dc");
                        }
                    });

                    break;
                default:
                    binding.textViewNombreEquipo.setText("-1");
                    break;
            }
            //endregion
        }

    }
}
