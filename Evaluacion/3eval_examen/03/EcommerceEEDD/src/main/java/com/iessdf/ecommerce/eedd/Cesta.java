package com.iessdf.ecommerce.eedd;

import java.util.ArrayList;
import java.util.List;

public class Cesta {
    private int id;
    private double total;
    private List<ItemCesta> items;

    public Cesta() {
        this.items = new ArrayList<>();
        this.total = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemCesta> getItems() {
        return items;
    }

    public void setItems(List<ItemCesta> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addProducto(Producto producto, int i) {
    }

    public void removeProducto(Producto producto) {
    }

    public void clear() {
    }
}
