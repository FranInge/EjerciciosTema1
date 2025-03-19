import java.util.Scanner;

public class Ejercicio13 {

    public static String leerCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres para hacer su inversa:");
        return scanner.nextLine();
    }

    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        return cadenaInvertida.reverse().toString();
    }

    public static void main(String[] args) {
        String cadena = leerCadena();
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("De la cadena ingresada: " + cadena + ", su invertida es: " + cadenaInvertida);
    }
}
