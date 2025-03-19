import java.util.Scanner;
import java.util.Random;

public class Ejercicio10 {

    public static void generarMatrizSimetrica(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int num = random.nextInt(100);
                matriz[i][j] = num;
                matriz[j][i] = num;
            }
        }


        System.out.println("Matriz simétrica generada es de [" + n + "][" + n + "] y sus numeros aleatorios de adentro son:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " " + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de una matriz para hacer la en cuadrada:");
        int n = scanner.nextInt();

        generarMatrizSimetrica(n);
    }
}
