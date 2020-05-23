/*1) Determinar si un alumno aprueba un curso de programación, sabiendo 
que aprobara si su promedio de tres calificaciones es mayor o igual a 7; reprueba en caso contrario.
 */
package clase2condicionalsimple;

import java.util.Scanner;

public class Clase2CondicionalSimple {

    public static void main(String[] args) {
        //variables de trabajo 
        Scanner teclado = new Scanner(System.in);
        float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
        System.out.println("inicio del app");
        //solicitamos los datos al user 
        System.out.println("ingrese la nota 1 ");
        nota1 = teclado.nextFloat();
        System.out.println("ingrese la nota 2 ");
        nota2 = teclado.nextFloat();
        System.out.println("ingrese la nota 3 ");
        nota3 = teclado.nextFloat();
        //procesamos la informacion 
        promedio = (nota1 + nota2 + nota3) / 3;//calculamos el promedio 

        if (promedio >= 7) {            //bloque de acciones a ejecutar si la condicion se cumple (TRUE) 
            System.out.println("El alumno aprobo el curso ");
        } else {    //bloque de acciones a ejecutar si la condicion NO se cumple  (FALSE)
            System.out.println("El alumno Reprobo el curso ");
        }
        System.out.println("su promedio es de " + promedio);
        System.out.println("fin del app");
    }

}
