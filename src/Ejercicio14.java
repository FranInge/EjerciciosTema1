import java.util.Scanner;

public class Ejercicio14 {

    public static String leerCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres para ver si es palindroma (si al invertir se escribe igual):");
        return scanner.nextLine();
    }

    public static boolean esPalindroma(String cadena) {
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();
        StringBuilder cadenaInvertida = new StringBuilder(cadenaLimpia).reverse();
        return cadenaLimpia.equals(cadenaInvertida.toString());
    }

    public static void main(String[] args) {
        String cadena = leerCadena();
        boolean resultado = esPalindroma(cadena);
        if (resultado) {
            System.out.println("La cadena " + cadena + " SI es palindroma, porque al invertirla se escribe igual.");
        } else {
            System.out.println("La cadena " + cadena + " NO es palindroma, porque al invertirla NO se escribe igual.");
        }
    }
}
