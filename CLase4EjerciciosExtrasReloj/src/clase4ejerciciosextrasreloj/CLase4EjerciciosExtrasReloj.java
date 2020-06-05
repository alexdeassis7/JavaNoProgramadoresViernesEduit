package clase4ejerciciosextrasreloj;

public class CLase4EjerciciosExtrasReloj {

    /**
     * Simular el comportamiento de un reloj digital, imprimiendo la hora,
     * minutos y segundos de un día desde las 00:00:00 hasta las 23:59:59
     */
    public static void main(String[] args) {

        for (int hs = 0; hs <= 23; hs++) { //for que itera las horas 
            for (int min = 0; min <= 59; min++) {//for que itera las minutos 
                for (int seg = 0; seg <= 59; seg++) {
                    System.out.println(hs + ":" + min + ":" + seg);
                }
            }

        }

//        0:0:0
//        0:0:1
//        0:0:2
//        0:0:3
//        
//        ..
//        ..
//        ...
//        23:59:59
//        
    }

}
