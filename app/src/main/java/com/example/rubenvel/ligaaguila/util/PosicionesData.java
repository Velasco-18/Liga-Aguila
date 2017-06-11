package com.example.rubenvel.ligaaguila.util;

import com.example.rubenvel.ligaaguila.models.Posiciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rubev on 11/06/2017.
 */

public class PosicionesData {

    private static List<Posiciones> dataPosiciones;

    public static List<Posiciones> getDataPosiciones(){
        if(dataPosiciones == null) {
            dataPosiciones = new ArrayList<>();
            //////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po1 = new Posiciones();
            po1.setNombreE("Atl. Nacional");
            po1.setPuntos("49");
            po1.setPJ("20");
            po1.setPG("15");
            po1.setPE("4");
            po1.setPP("1");
            po1.setDG("24");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po2 = new Posiciones();
            po2.setNombreE("Ind. Medellín");
            po2.setPuntos("42");
            po2.setPJ("20");
            po2.setPG("13");
            po2.setPE("3");
            po2.setPP("4");
            po2.setDG("12");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po3 = new Posiciones();
            po3.setNombreE("Dep. Pasto");
            po3.setPuntos("35");
            po3.setPJ("20");
            po3.setPG("10");
            po3.setPE("5");
            po3.setPP("5");
            po3.setDG("11");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po4 = new Posiciones();
            po4.setNombreE("Millonarios");
            po4.setPuntos("33");
            po4.setPJ("20");
            po4.setPG("10");
            po4.setPE("3");
            po4.setPP("7");
            po4.setDG("12");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po5 = new Posiciones();
            po5.setNombreE("Jaguares");
            po5.setPuntos("31");
            po5.setPJ("20");
            po5.setPG("8");
            po5.setPE("7");
            po5.setPP("5");
            po5.setDG("2");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po6 = new Posiciones();
            po6.setNombreE("Dep. Cali");
            po6.setPuntos("30");
            po6.setPJ("20");
            po6.setPG("7");
            po6.setPE("9");
            po6.setPP("4");
            po6.setDG("7");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po7 = new Posiciones();
            po7.setNombreE("América");
            po7.setPuntos("29");
            po7.setPJ("20");
            po7.setPG("8");
            po7.setPE("5");
            po7.setPP("7");
            po7.setDG("5");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po8 = new Posiciones();
            po8.setNombreE("Bucaramanga");
            po8.setPuntos("29");
            po8.setPJ("20");
            po8.setPG("8");
            po8.setPE("5");
            po8.setPP("7");
            po8.setDG("-1");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po9 = new Posiciones();
            po9.setNombreE("Santa Fé");
            po9.setPuntos("28");
            po9.setPJ("20");
            po9.setPG("7");
            po9.setPE("7");
            po9.setPP("6");
            po9.setDG("-4");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po10 = new Posiciones();
            po10.setNombreE("A. Petrolera");
            po10.setPuntos("27");
            po10.setPJ("20");
            po10.setPG("7");
            po10.setPE("6");
            po10.setPP("7");
            po10.setDG("0");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po11 = new Posiciones();
            po11.setNombreE("Patriotas");
            po11.setPuntos("24");
            po11.setPJ("20");
            po11.setPG("5");
            po11.setPE("9");
            po11.setPP("6");
            po11.setDG("-1");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po12 = new Posiciones();
            po12.setNombreE("Junior");
            po12.setPuntos("23");
            po12.setPJ("20");
            po12.setPG("6");
            po12.setPE("5");
            po12.setPP("9");
            po12.setDG("-1");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po13 = new Posiciones();
            po13.setNombreE("Equidad");
            po13.setPuntos("23");
            po13.setPJ("20");
            po13.setPG("5");
            po13.setPE("8");
            po13.setPP("7");
            po13.setDG("-3");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po14 = new Posiciones();
            po14.setNombreE("R. Áquilas");
            po14.setPuntos("21");
            po14.setPJ("20");
            po14.setPG("4");
            po14.setPE("9");
            po14.setPP("7");
            po14.setDG("-7");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po15 = new Posiciones();
            po15.setNombreE("Atl. Huila");
            po15.setPuntos("21");
            po15.setPJ("20");
            po15.setPG("6");
            po15.setPE("3");
            po15.setPP("11");
            po15.setDG("-9");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po16 = new Posiciones();
            po16.setNombreE("Once Caldas");
            po16.setPuntos("21");
            po16.setPJ("20");
            po16.setPG("5");
            po16.setPE("6");
            po16.setPP("9");
            po16.setDG("-11");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po17 = new Posiciones();
            po17.setNombreE("D. Tolima");
            po17.setPuntos("20");
            po17.setPJ("20");
            po17.setPG("5");
            po17.setPE("5");
            po17.setPP("10");
            po17.setDG("-4");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po18 = new Posiciones();
            po18.setNombreE("Tigres FC");
            po18.setPuntos("19");
            po18.setPJ("20");
            po18.setPG("4");
            po18.setPE("7");
            po18.setPP("9");
            po18.setDG("-12");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po19 = new Posiciones();
            po19.setNombreE("Envigado");
            po19.setPuntos("18");
            po19.setPJ("20");
            po19.setPG("4");
            po19.setPE("6");
            po19.setPP("10");
            po19.setDG("-8");
            /////////////////////////////////////////////////////////////////////////////////////////////////////
            Posiciones po20= new Posiciones();
            po20.setNombreE("Cortuluá");
            po20.setPuntos("18");
            po20.setPJ("20");
            po20.setPG("4");
            po20.setPE("6");
            po20.setPP("10");
            po20.setDG("-12");
            /////////////////////////////////////////////////////////////////////////////////////////////////////

            dataPosiciones.add(po1);
            dataPosiciones.add(po2);
            dataPosiciones.add(po3);
            dataPosiciones.add(po4);
            dataPosiciones.add(po5);
            dataPosiciones.add(po6);
            dataPosiciones.add(po7);
            dataPosiciones.add(po8);
            dataPosiciones.add(po9);
            dataPosiciones.add(po10);
            dataPosiciones.add(po11);
            dataPosiciones.add(po12);
            dataPosiciones.add(po13);
            dataPosiciones.add(po14);
            dataPosiciones.add(po15);
            dataPosiciones.add(po16);
            dataPosiciones.add(po17);
            dataPosiciones.add(po18);
            dataPosiciones.add(po19);
            dataPosiciones.add(po10);

        }
        return dataPosiciones;
    }

}
