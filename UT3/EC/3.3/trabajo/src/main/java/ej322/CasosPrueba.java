package ej322;

public class CasosPrueba {

    public static int Metodo2(int x, int y) {
        if (x < 0 || y < 0) {
            System.out.println("Error: los valores no pueden ser negativos");
            return -1;
        }

        if (x == 1 && y == 1) {
            return 1;
        }

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        return x;
    }
}
