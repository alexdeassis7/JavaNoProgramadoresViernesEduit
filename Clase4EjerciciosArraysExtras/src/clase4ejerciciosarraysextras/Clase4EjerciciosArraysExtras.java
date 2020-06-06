package clase4ejerciciosarraysextras;

/*Calcular 
el promedio de 50 valores almacenados en un Vector., imprimir el promedio, 
el número de datos mayores que el promedio y una lista de valores mayores que
el promedio .*/
public class Clase4EjerciciosArraysExtras {

    public static void main(String[] args) {
        
        int[] miVector = new int[50];
        int[] vectorDeMayoresAlPromedio;

        int acumulador = 0;
        float promedio = 0;
        int contadorMayoresAPromedio = 0;

        for (int i = 0; i < miVector.length; i++) {
            miVector[i] = (int) (Math.random() * 100 + 1);//Genero numeros aleatorios                                   
        }
        //mostramos el array 
        for (int i = 0; i < miVector.length; i++) {
            System.out.println("miVector[" + i + "]=" + miVector[i]);
            acumulador += miVector[i];
        }
        promedio = acumulador / miVector.length;

        for (int i = 0; i < miVector.length; i++) {
            if (miVector[i] > promedio) {
                contadorMayoresAPromedio++;
            }
        }
        vectorDeMayoresAlPromedio = new int[contadorMayoresAPromedio];
        int j = 0;
        for (int i = 0; i < miVector.length; i++) {
            if (miVector[i] > promedio) {
                vectorDeMayoresAlPromedio[j] = miVector[i];
                j++;
            }
        }
        System.out.println("El promedio es " + promedio);
        System.out.println("tenemos " + contadorMayoresAPromedio + " mayores que el promedio ");
        System.out.println("Esos datos son los siguientes");
        
        for (int i = 0; i < vectorDeMayoresAlPromedio.length; i++) {
            System.out.print(vectorDeMayoresAlPromedio[i] + " - " );
        }

    }

}
