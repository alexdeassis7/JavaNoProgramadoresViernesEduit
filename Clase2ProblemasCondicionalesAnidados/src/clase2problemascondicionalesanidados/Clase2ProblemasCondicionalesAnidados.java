/*1) Leer dos numeros : si son iguales qeu los multiplique , si  el primero el mayor 
que el segundo que los reste y si no que los sume 
 */
package clase2problemascondicionalesanidados;

import java.util.Scanner;

public class Clase2ProblemasCondicionalesAnidados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        System.out.println("ingrese el num1 ");
        num1 = teclado.nextInt();
        System.out.println("ingrese el num2 ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("Resto :" + (num1 - num2));
        } else if (num1 < num2) {
            System.out.println("Sumo :" + (num1 + num2));
        } else{ 
            System.out.println("multiplico :" + (num1 * num2));
        }
    }

}
