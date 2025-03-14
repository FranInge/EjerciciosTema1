import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

    public static int[] recibirNumeros() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros (ingrese un 0 para terminar de introducir numeros):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numeros.add(num);
        }

        return numeros.stream().mapToInt(i -> i).toArray();
    }

    public static double calcularMedia(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }

    public static int calcularMinimo(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int calcularMaximo(int[] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numeros = recibirNumeros();

        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("La media de los numeros ingresados es: " + media);
        System.out.println("El numero mínimo entre todos los ingresados es: " + minimo);
        System.out.println("El numero máximo entre todos los ingresados es: " + maximo);
    }
}
