package com.example.rubenvel.ligaaguila.models;

/**
 * Created by rubev on 13/06/2017.
 */

public class Usuario {

    Long idusuario;
    String nombre, apellido, user, password, passwordR, correo;

    public Usuario(String nombre, String apellido, String user, String password, String passwordR, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.password = password;
        this.passwordR = passwordR;
        this.correo = correo;
    }

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordR() {
        return passwordR;
    }

    public void setPasswordR(String passwordR) {
        this.passwordR = passwordR;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
