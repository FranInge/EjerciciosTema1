import java.util.Scanner;

public class Ejercicio12 {

    public static String leerCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres para contar cuantas vocales tiene:");
        return scanner.nextLine();
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String cadena = leerCadena();
        int numeroDeVocales = contarVocales(cadena);
        System.out.println("La cadena ingresada: " + cadena + ", tiene " + numeroDeVocales + " vocales.");
    }
}
