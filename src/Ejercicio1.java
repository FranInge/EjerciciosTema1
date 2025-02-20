public class Ejercicio1 {
    public class Tiempo{
        public static long CaculoTiempo(int anios, int meses, int dias){
            int diasAnio = 365;
            int horasDia = 24;
            int minHora = 60;
            int segMin = 60;
            long SegporDias = (dias + (meses * 30) + (anios * diasAnio)) * horasDia * minHora * segMin;
            return SegporDias;
        }

    }

    public static void main(String[] args) {
        int anios =2; int meses = 5; int dias = 10;

        long totalSegundos = Tiempo.CaculoTiempo(anios, meses, dias);

        System.out.println("La cantidad de segundos que hay en " + anios + "anios, " + meses + "meses y " + dias + "dias es: " + totalSegundos + "segundos.");

    }
}
