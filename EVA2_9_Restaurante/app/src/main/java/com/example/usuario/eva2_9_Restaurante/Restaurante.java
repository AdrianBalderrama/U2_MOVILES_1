package com.example.usuario.eva2_9_Restaurante;

public class Restaurante {
    private int imagen;
    private  String lugar;
    private String telefono;
    private String descripcion;
    private String direccion;

    public Restaurante(int imagen, String lugar, String telefono, String descripcion, String direccion) {
        this.imagen = imagen;
        this.lugar = lugar;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getLugar() {
        return lugar;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

}