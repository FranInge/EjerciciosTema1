public class Main {


    public static void main(String[] args) {

        //Ejercicio 1
        int anios = 2;
        int meses = 5;
        int dias = 10;

        long totalSegundos = Ejercicio1.Tiempo.CaculoTiempo(anios, meses, dias);

        System.out.println("La cantidad de segundos que hay en " + anios + " anios, " + meses + " meses y " + dias + " dias son: " + totalSegundos + " segundos.");

        //Ejercicio 2
        System.out.println("El valor maximo de un char es: " + Character.MAX_VALUE + "\nEl valor maximo de un short es: " + Short.MAX_VALUE + "\nEl valor maximo de un int es: " + Integer.MAX_VALUE);
    }
}
