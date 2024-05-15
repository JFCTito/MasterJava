import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[5];

        productos[0] = "Tabla";
        productos[1] = "Zapato";
        productos[2] = "Laptop";
        productos[3] = "Teclado";
        productos[4] = "Mouse";

        Arrays.sort(productos);
        Collections.reverse(Arrays.asList(productos));

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = Integer.parseInt("2");
        numeros[2] = 3;
        numeros[3] = 4;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
