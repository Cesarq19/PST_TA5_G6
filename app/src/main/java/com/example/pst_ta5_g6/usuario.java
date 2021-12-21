package com.example.pst_ta5_g6;

import java.io.Serializable;

public class usuario implements Serializable {
    private String usuario;
    private String pass;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private String favorito;

    public usuario(String usuario, String pass, String nombre, String apellido, String correo, String celular, String favorito){
        this.usuario=usuario;
        this.pass=pass;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.celular=celular;
        this.favorito=favorito;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFavorito() {
        return favorito;
    }

    public void setFavorito(String favorito) {
        this.favorito = favorito;
    }
}
