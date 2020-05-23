/*3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
package clase2problemascondiconalesextras3;
import java.util.Scanner;
public class Clase2ProblemasCondiconalesExtras3 {
    public static void main(String[] args) {
       //definimos las variables de trabajos 
       int hsExtras = 0 ,salarioSemanal = 0 , HsTrabajadas = 0;
       Scanner teclado = new Scanner(System.in);       
       //solicitamos datos al usuario
        System.out.println("Por favor ingrese las horas trabajadas en esta Semana");
        HsTrabajadas = teclado.nextInt();        
        //procesamos la informacion 
        if(HsTrabajadas > 40 ){//calculamos el salario con hs extras
            hsExtras = HsTrabajadas - 40 ;  //calculo la cantidad de hs extras 
            salarioSemanal = hsExtras * 20 + 40 * 16 ; // calculo el salario 
        }else{//calculamos el salario sin hs extras
            salarioSemanal = HsTrabajadas * 16;
        }
        
        //mostramos los resultados 
        System.out.println("El salario semanal es: " +salarioSemanal);
    }
    
}
