import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    int []arrIntTeclado = new int[10];
    Scanner sc = new Scanner(System.in);
    public void leerTeclado(){
        for (int i = 0; i < arrIntTeclado.length; i++) {
            System.out.println("Introduce el entero num. " + i + "...");
            arrIntTeclado[i] = sc.nextInt();
        }

        System.out.println("arrIntTeclado: " + Arrays.toString(arrIntTeclado));

        int []arrIntTeclado2 = new int[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrIntTeclado2.length; i++) {
            System.out.println("Introduce el entero num. " + i + "...");
            String lectura = sc.nextLine();
            arrIntTeclado2[i] = Integer.parseInt(lectura); //parse: analizar un texto y extraer sus partes. Hacemos el uso de la wrap class

        }

        System.out.println("arrIntTeclado2: " + Arrays.toString(arrIntTeclado2));
    }

}
