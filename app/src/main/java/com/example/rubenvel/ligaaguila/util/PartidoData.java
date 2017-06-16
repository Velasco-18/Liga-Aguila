package com.example.rubenvel.ligaaguila.util;

import com.example.rubenvel.ligaaguila.models.Partido;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rubev on 30/05/2017.
 */

public class PartidoData {

    private static List<Partido> dataP;

    public static List<Partido> getDataPartido(){
        if(dataP == null){
            dataP = new ArrayList<>();
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p1 = new Partido();
            p1.setEquipo1("Cortuluá");
            p1.setEquipo2("Once Caldas");
            p1.setFecha("Lunes 29 Mayo - Finalizado");
            p1.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2015/10/ver-cortulua-vs-once-caldas-sabado-31-de-octubre-de-2015.jpg");
            p1.setEstadio("Todos contra Todos \nEstadio: Pascual Guerrero");
            p1.setResultado(" 1 - 1 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p2 = new Partido();
            p2.setEquipo1("América de Cali");
            p2.setEquipo2("Deportivo Pasto");
            p2.setFecha("Miércoles 31 Mayo - Finalizado");
            p2.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2017/02/ver-america-vs-pasto-domingo-26-de-febrero-de-2017.jpg");
            p2.setEstadio("Cuartos de Final \nEstadio: Pascual Guerrero");
            p2.setResultado(" 0 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p3 = new Partido();
            p3.setEquipo1("Atlético Bucaramanga");
            p3.setEquipo2("Millonarios");
            p3.setFecha("Miércoles 31 Mayo - Finalizado");
            p3.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2016/04/ver-bucaramanga-vs-millonarios-sabado-23-de-abril-de-2016.jpg");
            p3.setEstadio("Cuartos de Final \nEstadio: Álvaro Gómez Hurtado");
            p3.setResultado(" 2 - 2 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p4 = new Partido();
            p4.setEquipo1("Deportivo Cali");
            p4.setEquipo2("Independiente Medellín");
            p4.setFecha("Miércoles 31 Mayo - Finalizado");
            p4.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2014/09/ver-cali-vs-medellin-domingo-28-de-septiembre-de-2014.jpg");
            p4.setEstadio("Cuartos de Final \nEstadio: Monumental de Palma Seca");
            p4.setResultado(" 2 - 2 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p5 = new Partido();
            p5.setEquipo1("Jaguares de Córdoba");
            p5.setEquipo2("Atlético Nacional");
            p5.setFecha("Miércoles 31 Mayo - Finalizado");
            p5.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2015/04/ver-jaguares-vs-nacional-domingo-12-de-abril-de-2015.jpg");
            p5.setEstadio("Cuartos de Final \nEstadio: Jaraguay (Municipal de Montería)");
            p5.setResultado(" 1 - 3 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p6 = new Partido();
            p6.setEquipo1("Atlético Nacional");
            p6.setEquipo2("Jaguares de Córdoba");
            p6.setFecha("Domingo 4 Junio - Finalizado");
            p6.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2015/10/ver-nacional-vs-jaguares-sabado-3-de-octubre-de-2015.jpg");
            p6.setEstadio("Cuartos de Final \nEstadio: Atanasio Girardot");
            p6.setResultado(" 3 - 2 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p7 = new Partido();
            p7.setEquipo1("Deportivo Pasto");
            p7.setEquipo2("América de Cali");
            p7.setFecha("Domingo 4 Junio - Finalizado");
            p7.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2017/02/ver-america-vs-pasto-domingo-26-de-febrero-de-2017.jpg");
            p7.setEstadio("Cuartos de Final \nEstadio: Departamental Libertad");
            p7.setResultado(" 0 - 1 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            Partido p8 = new Partido();
            p8.setEquipo1("Millonarios");
            p8.setEquipo2("Atlético Bucaramanga");
            p8.setFecha("Domingo 4 Junio - Finalizado");
            p8.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2017/02/ver-millonarios-vs-bucaramanga-domingo-12-de-febrero-de-2017.jpg");
            p8.setEstadio("Cuartos de Final \nEstadio: Nemesio Camacho (El Campin)");
            p8.setResultado(" 2 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p9 = new Partido();
            p9.setEquipo1("Independiente Medellín");
            p9.setEquipo2("Deportivo Cali");
            p9.setFecha("Domingo 4 Junio - Finalizado");
            p9.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2016/06/ver-medellin-vs-cali-domingo-5-de-junio-de-2016.jpg");
            p9.setEstadio("Cuartos de Final \nEstadio: Atanasio Girardot");
            p9.setResultado(" 3 - 1 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p10 = new Partido();
            p10.setEquipo1("Millonarios");
            p10.setEquipo2("Atlético Nacional");
            p10.setFecha("Miércoles 7 de Junio - Finalizado");
            p10.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2016/11/ver-millonarios-vs-nacional-domingo-27-de-noviembre-de-2016.jpg");
            p10.setEstadio("SemiFinal \nEstadio: Nemesio Camacho (El Campin)");
            p10.setResultado(" 0 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p11 = new Partido();
            p11.setEquipo1("América de Cali");
            p11.setEquipo2("Deportivo Cali");
            p11.setFecha("Jueves 8 de Junio - Finalizado");
            p11.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2017/02/ver-america-vs-pasto-domingo-26-de-febrero-de-2017.jpg");
            p11.setEstadio("SemiFinal \nEstadio: Pascual Guerrero");
            p11.setResultado(" 0 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p12 = new Partido();
            p12.setEquipo1("Deportivo Cali");
            p12.setEquipo2("América de Cali");
            p12.setFecha("Domingo 11 de Junio - 5:15pm");
            p12.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2017/02/ver-america-vs-pasto-domingo-26-de-febrero-de-2017.jpg");
            p12.setEstadio("SemiFinal \nEstadio: Monumental de Palma Seca");
            p12.setResultado(" 2 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p13 = new Partido();
            p13.setEquipo1("Atlético Nacional");
            p13.setEquipo2("Millonarios");
            p13.setFecha("Domingo 11 de Junio - 7:30pm");
            p13.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2016/08/ver-nacional-vs-millonarios-domingo-21-de-agosto-de-2016.jpg");
            p13.setEstadio("SemiFinal \nEstadio: Atanasio Girardot");
            p13.setResultado(" 1 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p14 = new Partido();
            p14.setEquipo1("Peportivo Cali");
            p14.setEquipo2("Atlético Nacional");
            p14.setFecha("Miércoles 14 de Junio - 7:00pm");
            p14.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2013/12/ver-cali-vs-nacional-miercoles-11-de-diciembre-2013.jpg");
            p14.setEstadio("GRAN FINAL IDA \nEstadio: Monumental de Palma Seca");
            p14.setResultado(" 2 - 0 ");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Partido p15 = new Partido();
            p15.setEquipo1("Atlético Nacional");
            p15.setEquipo2("Deportivo Cali");
            p15.setFecha("Domingo 18 de Junio - 7:00pm");
            p15.setImagen("http://www.sitioco.com/futbolcolombiano/wp-content/uploads/2014/07/ver-nacional-vs-cali-domingo-27-de-julio-2014.jpg");
            p15.setEstadio("GRAN FINAL VUELTA \nEstadio: Atanasio Girardot");
            p15.setResultado(" Esperando Resultado ");

            dataP.add(p15);
            dataP.add(p14);
            dataP.add(p13);
            dataP.add(p12);
            dataP.add(p11);
            dataP.add(p10);
            dataP.add(p9);
            dataP.add(p8);
            dataP.add(p7);
            dataP.add(p6);
            dataP.add(p5);
            dataP.add(p4);
            dataP.add(p3);
            dataP.add(p2);
            dataP.add(p1);

        }

        return dataP;
    }
}
