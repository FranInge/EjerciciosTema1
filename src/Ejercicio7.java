import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static int[] descomponerEnFactoresPrimos(int numero) {
        List<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factores.add(i);
                numero /= i;
            }
        }
        return factores.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = scanner.nextInt();

        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.println("Los factores primos del numero ingresado " + numero + " son:");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }
    }
}
