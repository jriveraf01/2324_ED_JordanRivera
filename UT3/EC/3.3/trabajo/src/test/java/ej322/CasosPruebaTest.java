package ej322;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CasosPruebaTest {

    @Test
    public void testMetodo2_Camino1() {
        // Caso donde x es negativo
        int x = -1;
        int y = 5;
        Assertions.assertEquals(-1, ej322.CasosPrueba.Metodo2(x, y));
    }

    @Test
    public void testMetodo2_Camino2() {
        // Caso donde y es negativo
        int x = 5;
        int y = -1;
        Assertions.assertEquals(-1, ej322.CasosPrueba.Metodo2(x, y));
    }

    @Test
    public void testMetodo2_Camino3() {
        // Caso donde x e y son iguales a 1
        int x = 1;
        int y = 1;
        Assertions.assertEquals(1, ej322.CasosPrueba.Metodo2(x, y));
    }

    @Test
    public void testMetodo2_Camino4() {
        // Caso donde el bucle while no se ejecuta
        int x = 3;
        int y = 3;
        Assertions.assertEquals(3, ej322.CasosPrueba.Metodo2(x, y));
    }

    @Test
    public void testMetodo2_Camino5() {
        // Caso donde el bucle while se ejecuta al menos una vez y x > y inicialmente
        int x = 6;
        int y = 3;
        Assertions.assertEquals(3, ej322.CasosPrueba.Metodo2(x, y));
    }

    @Test
    public void testMetodo2_Camino6() {
        // Caso donde el bucle while se ejecuta al menos una vez y y > x inicialmente
        int x = 3;
        int y = 6;
        Assertions.assertEquals(3, ej322.CasosPrueba.Metodo2(x, y));
    }
}
