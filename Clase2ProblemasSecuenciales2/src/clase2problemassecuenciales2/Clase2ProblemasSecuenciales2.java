/*Un Maestro desea saber que porcentaje de hombre y que porcentaje de mujeres hay en un
grupo de entudiantes de algoritmos 1
 */
package clase2problemassecuenciales2;
import java.util.Scanner;
public class Clase2ProblemasSecuenciales2 {

    public static void main(String[] args) {
       //Defino las variables de trabajo 
       Scanner teclado = new Scanner(System.in);
       float numHombres = 0 , numMujeres = 0 , totalAlumnos = 0 ,porcentajeH = 0 , porcentajeM = 0;
       //solicitamos los datos al user 
        System.out.println("ingrese la cantidad de hombres ");
        numHombres = teclado.nextFloat();
        
        System.out.println("ingrese la cantidad de mujeres ");
        numMujeres = teclado.nextFloat();
       
        //procesamos la informacion 
        totalAlumnos = numHombres + numMujeres ;
        porcentajeH = numHombres *  100 /  totalAlumnos ;
        porcentajeM = numMujeres *  100 /  totalAlumnos ;
        //mostramos los resultados
        System.out.println("el porcentaje de hombres en el curso es  : %" + porcentajeH);
        
        System.out.println("el porcentaje de mujeres en el curso es  : %" + porcentajeM);
    }
    
}
