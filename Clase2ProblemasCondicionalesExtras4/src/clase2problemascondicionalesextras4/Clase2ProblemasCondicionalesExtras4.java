/*4) Que lea dos números  y los imprima por pantalla en forma ascendente
 */
package clase2problemascondicionalesextras4;

import java.util.Scanner;
public class Clase2ProblemasCondicionalesExtras4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese primer numero: ");
        num1= teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        num2= teclado.nextInt();
        
        if(num1<num2){
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num2);
            System.out.println(num1);
        }
    }
    
}
