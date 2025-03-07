import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public class Tiempo {
        public static long CaculoTiempo(int anios, int meses, int dias) {
            int diasAnio = 365;
            int horasDia = 24;
            int minHora = 60;
            int segMin = 60;
            long SegporTotales = (dias + (meses * 30) + (anios * diasAnio)) * horasDia * minHora * segMin;
            return SegporTotales;
        }
        /*
        public static long getSegsFromAnioMesDia(byte anios, byte meses, byte dias) {
            byte segs=60;
            byte mins=60;
            byte horas=24;
            short diasAnio=365;
            long segsAnio= diasAnio * horas * mins * segs;
            long segsMes= diasAnio * horas * mins * segs;
            long segsDia= horas * mins * segs; // 24 * 60 * 60
            long segsTotales = (anios * segsAnio) + (meses * segsMes) + (dias * segsDia);
            return segsTotales;
        }*/


    }
}
/*
    public static void main(String[] args) {
        int anios = 2;
        int meses = 5;
        int dias = 10;

        long totalSegundos = Tiempo.CaculoTiempo(anios, meses, dias);

        System.out.println("La cantidad de segundos que hay en " + anios + " anios, " + meses + " meses y " + dias + " dias son: " + totalSegundos + " segundos.");

    }
}*/

/*
    public static int ejMetodoEstaticoClaseSuma(int a, int b){
        return a + b;

    }

    public static void main(String[] args) {

        byte segs=60;
        byte mins=60;
        byte horas=24;
        short dias=365;
        byte anios=0;

        //short a = 32768; //Da error porque el maximo que cabe en un short es 32767
        short a = (short) 32768; //Con esto se soluciona el error. Porque al llegar al 32767, el siguiente es -32768
        System.out.println(a);
        int segsAnio= dias * horas * mins * segs; // 365 * 24 * 60 * 60 Si ponemos short en vez de main, da error porque no tiene espacio
        System.out.println("Un año tiene " + segsAnio + " segundos");

        int num=0;
        num = ejMetodoEstaticoClaseSuma(5, 10);
        System.out.println("La suma de 5 + 10 es: " + num);

    }
}
 */