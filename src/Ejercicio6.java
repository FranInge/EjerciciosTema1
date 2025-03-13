import java.util.Scanner;

public class Ejercicio6 {
    public static int[] obtenerNumerosPrimos(int n) {
        int[] primos = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (esPrimo(num)) {
                primos[count++] = num;
            }
            num++;
        }

        return primos;
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Ingrese el valor de N, para devolver los N primeros numeros primos: ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int[] primos = obtenerNumerosPrimos(n);

        System.out.println("Los primeros " + n + " números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }
}
