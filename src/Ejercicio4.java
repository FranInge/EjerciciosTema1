import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    public static int[] calcularMinMax(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            return new int[]{-1, -1};
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numeros) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros positivos (ingrese un numero negativo para terminar de introducir numeros positivos):");

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            numeros.add(num);
        }

        int[] minMax = calcularMinMax(numeros);

        if (minMax[0] == -1 && minMax[1] == -1) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("El número mínimo entre todos los ingresados es: " + minMax[0]);
            System.out.println("El número máximo entre todos los ingresados es: " + minMax[1]);
        }
    }
}
