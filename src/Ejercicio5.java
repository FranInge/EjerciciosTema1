import java.util.Scanner;

public class Ejercicio5 {
    public static int[][] generarTablasMultiplicar(int n) {
        int[][] tablas = new int[n][11];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 11; j++) {
                tablas[i][j] = i * j;
            }
        }
        return tablas;
    }

    public static void imprimirTablasMultiplicar(int[][] tablas) {
        for (int i = 1; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j < tablas[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Ingrese el valor de N, para calcular esa cantidad de tablas de verdades: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[][] tablas = generarTablasMultiplicar(n);
        imprimirTablasMultiplicar(tablas);
    }
}
