package com.example.rubenvel.ligaaguila.models;

/**
 * Created by rubev on 13/06/2017.
 */

public class Equipo {

    Long idequipo;
    String nombre;
    int posicion, puntos, PJ, PG, PE, PP, DG;

    public Equipo(String nombre, int posicion, int puntos, int PJ, int PG, int PE, int PP, int DG) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.puntos = puntos;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.DG = DG;
    }
    public Long getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(Long idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPJ() {
        return PJ;
    }

    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    public int getPG() {
        return PG;
    }

    public void setPG(int PG) {
        this.PG = PG;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getDG() {
        return DG;
    }

    public void setDG(int DG) {
        this.DG = DG;
    }
}
