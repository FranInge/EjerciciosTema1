import java.util.Scanner;

public class Ejercicio11 {

    public static int[][] recibirMatriz(int filas, int columnas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce los valores de la matriz con " + filas + "x" + columnas + ":");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("x[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;


        if (columnas1 != filas2) {
            System.out.println("Error: Las dimensiones de las matrices ingresadas no son compatibles para la multiplicación. Tienen que tener las mismas dimensiones.");
            return null;
        }

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " " + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de filas que va a tener la matriz A:");
        int filas1 = scanner.nextInt();
        System.out.println("Introduce la cantidad de columnas que va a tener la matriz A:");
        int columnas1 = scanner.nextInt();

        int[][] matriz1 = recibirMatriz(filas1, columnas1);

        System.out.println("Introduce la cantidad de filas que va a tener la matriz B:");
        int filas2 = scanner.nextInt();
        System.out.println("Introduce la cantidad de columnas que va a tener la matriz B:");
        int columnas2 = scanner.nextInt();


        int[][] matriz2 = recibirMatriz(filas2, columnas2);

        int[][] resultado = multiplicarMatrices(matriz1, matriz2);

        if (resultado != null) {
            System.out.println("Matriz A es:");
            imprimirMatriz(matriz1);

            System.out.println("Matriz B es:");
            imprimirMatriz(matriz2);

            System.out.println("AxB es igual a:");
            imprimirMatriz(resultado);
        }
    }
}
