import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        int sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguajes = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para Matematicas: ");
        for (int i=0; i<claseMatematicas.length; i++){
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Historia: ");
        for (int i=0; i<claseHistoria.length; i++){
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje: ");
        for (int i=0; i<claseLenguaje.length; i++){
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i=0; i<7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguajes += claseLenguaje[i];
        }

        double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguajes/claseLenguaje.length);
        System.out.println("Promedio clase de matemáticas: " + promedioMatematica);
        System.out.println("Promedio clase de Historia: " + promedioHistoria);
        System.out.println("Promedio clase de Lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total de curso: " + ((promedioMatematica + promedioHistoria + promedioLenguaje) / 3));

    }
}
