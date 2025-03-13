import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Bienvenido a los ejercicios del tema 1, estos son: ");
        System.out.println("1 - Ejercicio 1.La cantidad de segundos que hay en anios, meses y dias.");
        System.out.println("2.- Ejercicio 2.El valor maximo de un char, short e int.");
        System.out.println("3.- Ejercicio 3.Obtener los multiplos de 5 entre dos numeros y sumarlos.");
        System.out.println("4.- Ejercicio 4.Calcular el minimo y maximo de una lista de numeros enteros positivos.");
        System.out.println("5.- Ejercicio 5.Generar las tablas de multiplicar del 0 al 9 de un numero ingresado.\n");
        System.out.println("6.- Ejercicio 6.Obtener los N primeros numeros primos.\n");

        System.out.println("Ingrese que ejercicio desea hacer: ");
        Scanner sc = new Scanner(System.in);
        int ejercicio = sc.nextInt();

        switch (ejercicio) {
            case 1:
                System.out.println("Ejercicio 1=");
                Ejercicio1.main(args);
                break;
            case 2:
                System.out.println("Ejercicio 2=");
                Ejercicio2.main(args);
                break;
            case 3:
                System.out.println("Ejercicio 3=");
                Ejercicio3.main(args);
                break;
            case 4:
                System.out.println("Ejercicio 4=");
                Ejercicio4.main(args);
                break;
            case 5:
                System.out.println("Ejercicio 5=");
                Ejercicio5.main(args);
                break;
            case 6:
                System.out.println("Ejercicio 6=");
                Ejercicio6.main(args);
                break;
            default:
                System.out.println("Error valor ingresado es incorrecto.");
                break;
        }


    }
}
