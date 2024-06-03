package com.iessdf.ecommerce.eedd;

import com.iessdf.ecommerce.eedd.Cesta;
import com.iessdf.ecommerce.eedd.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CestaTest {

    @Test
    void should_BeEmptyWhenCreated() {
        Cesta cesta = new Cesta();
        assertTrue(cesta.getItems().isEmpty());
        assertEquals(0, cesta.getTotal());
    }

    @Test
    void should_RemoveProductFromBasket() {
        Cesta cesta = new Cesta();
        Producto producto = new Producto(1, "12345", "Producto 1", "Descripción 1", 10.0, 100);
        cesta.addProducto(producto, 2);
        cesta.removeProducto(producto);

        assertTrue(cesta.getItems().isEmpty());
        assertEquals(0, cesta.getTotal());
    }

    @Test
    void should_ClearBasket() {
        Cesta cesta = new Cesta();
        Producto producto = new Producto(1, "12345", "Producto 1", "Descripción 1", 10.0, 100);
        cesta.addProducto(producto, 2);
        cesta.clear();

        assertTrue(cesta.getItems().isEmpty());
        assertEquals(0, cesta.getTotal());
    }
}