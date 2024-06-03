package com.iessdf.ecommerce.eedd;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date fecha;
    private double total;
    private List<ItemPedido> items;
    private Cliente cliente;


    public Pedido(int id, double total, List<ItemPedido> items, Cliente cliente) {
        this.id = id;
        this.total = total;
        this.items = items;
        this.cliente = cliente;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
