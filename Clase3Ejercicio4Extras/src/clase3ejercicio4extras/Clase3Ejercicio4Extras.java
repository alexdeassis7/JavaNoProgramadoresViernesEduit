/*4)Leer 10 números e imprimir cuantos son positivos , 
cuantos negativos y cuantos neutros */
package clase3ejercicio4extras;

import java.util.Scanner;

public class Clase3Ejercicio4Extras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;
        //defino variables de tipo contador 
        int contPositivo = 0, contNegativos = 0, contNeutros = 0;
        System.out.println("Comenzo el For");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero " + (i + 1));
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado > 0) {
                contPositivo++;
            } else if (numeroIngresado < 0) {
                contNegativos++;
            } else {
                contNeutros++;
            }
        }
        System.out.println("Finalizo el For");
        System.out.println("la cantidad de numeros positivos ingresados fue :" + contPositivo);
        System.out.println("la cantidad de numeros negativos ingresados fue :" + contNegativos);
        System.out.println("la cantidad de numeros neutros ingresados fue :" + contNeutros);

    }

}
