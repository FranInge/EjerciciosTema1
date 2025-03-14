import java.util.Scanner;

public class Ejercicio9 {

    public static int[] recibirVector(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[n];

        System.out.println("Introduce " + n + " elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de los vectores:");
        int n = scanner.nextInt();

        int[] vector1 = recibirVector(n);
        int[] vector2 = recibirVector(n);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El vector 1 es:"+ java.util.Arrays.toString(vector1));
        System.out.println("El vector 2 es:"+ java.util.Arrays.toString(vector2));
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);
    }
}
