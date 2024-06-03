package com.iessdf.ecommerce.eedd;

public class Administrador extends Usuario{

    private String direccion;
    private int telefono;

    public Administrador(String nombre, String email, String contraseña) {
        super(nombre, email, contraseña);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
