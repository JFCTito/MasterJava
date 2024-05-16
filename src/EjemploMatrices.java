public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[4][4];

        System.out.println("numero de filas: " + numeros.length);
        System.out.println("numero de columnas: " + numeros[0].length);
        int contador = 0;
        for (int[] a : numeros){
            for (int i=0; i<a.length; i++){
                 a[i]= ++contador;
            }
        }

        System.out.println("contador = " + contador);

        for (int[] a : numeros){
            for (int b : a){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
