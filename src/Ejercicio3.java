import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int size = (end - begin) / 5 + 1;
        int[] multiplos = new int[size];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos[index++] = i;
                }
            }
            return multiplos;
        }

        public static int sumarValoresArray(int[] array) {
            int suma = 0;
            for (int valor : array) {
                suma += valor;
            }
            return suma;
        }


    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();

        int a = 1;
        int b = 100;

        int[] multiplosDe5 = ejercicio3.obtenerMultiplosDe5(a, b);
        int suma = ejercicio3.sumarValoresArray(multiplosDe5);

        System.out.println("Los multiplos de 5 entre " + a + " y " + b + " son: " + Arrays.toString(multiplosDe5));
        System.out.println("La cantidad de múltiplos de 5 son: " + multiplosDe5.length);
        System.out.println("La suma de todos los múltiplos de 5 es igual a: " + suma + "\n");
    }
}


//Otra forma de hacerlo
    /*int []arrIntTeclado = new int[10];
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


*/

