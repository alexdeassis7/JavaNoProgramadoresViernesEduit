/* 1)Suponga que individuo desea invertir su capital en un banco y desea 
saber cuanto dinero ganara despues de un mes si el banco paga a razon de 2% mensual
 */
package clase2viernesproblemassecuenciales;
import java.util.Scanner;
//import javax.swing.JOptionPane;
public class Clase2ViernesProblemasSecuenciales {
    public static void main(String[] args) {
        //definimos las variables de trabajo 
        float capital = 0  , ganancia = 0  ; 
        float interes = 0.02f ;        
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al usuario  d
        System.out.println("ingrese por favor el capital que desea invertir");
        capital = teclado.nextFloat();
        
//        String nombreIngresado = JOptionPane.showInputDialog("ingrese por favor su nombre");
//        JOptionPane.showMessageDialog(null, "el nombre ingresado es " + nombreIngresado);
        //procesamos la informacion 
        ganancia = capital * interes;
        
        //mostramos los resultados         
        System.out.println("usted invirtio $" + capital + " su ganancia en 30 dias fue de $" + ganancia);       
        
        
        
        
        
        
    }
    
}
