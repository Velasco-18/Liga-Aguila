package com.example.rubenvel.ligaaguila.models;

/**
 * Created by rubev on 13/06/2017.
 */

public class Equipo {

    Long idequipo;
    String nombre, ciudad, informacion;

    public Equipo(String nombre, String ciudad, String informacion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.informacion = informacion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
