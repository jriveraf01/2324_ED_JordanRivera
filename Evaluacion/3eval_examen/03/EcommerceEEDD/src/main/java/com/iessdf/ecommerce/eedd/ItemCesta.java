package com.iessdf.ecommerce.eedd;

public class ItemCesta {
    private int id;
    private Producto producto;
    private int cantidad;
    private double total;

    public ItemCesta(int id, Producto producto, int cantidad, double total) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
