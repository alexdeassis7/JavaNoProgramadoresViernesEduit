package clase3estructurasrepetitivas;
import java.util.Scanner;
public class Clase3EstructurasRepetitivas {
//solicitar 6 notas de un alumno y calcular su promedio 

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota = 0, promedio = 0, acumulador = 0;
        int contador = 0 , cantidadDeNotas = 10;

        while (contador < cantidadDeNotas) {
            System.out.println("Por favor ingrese la nota " + (contador + 1));
            nota = teclado.nextFloat();
            //acumulador = acumulador + nota;
            acumulador += nota;
            contador++;
        }
        System.out.println("el acumulador de notas es :" + acumulador);
        promedio = acumulador / cantidadDeNotas; //calculo el promedio de las 6 notas
        System.out.println("El promedio de las notas es : " + promedio);
        System.out.println("Fin de programa");
        //Estructura MIENTRAS
//        while(contador < 10){
//            //LOOP INFINITO
//            //cuerpo del while
//            //sentencias a ejecutar mientras se cumpla la condicion 
//            System.out.println("Hola mundo 1");
//            System.out.println("Hola mundo 2");
//            System.out.println("Hola mundo 3");   
//            
//            contador ++ ;
//            //contador += 1;
//            //contador = contador + 1;
//        }
      
        //promedio = (nota1+ nota2 +nota3 + nota4 + nota5 + nota6 ) /6;
//        System.out.println("el promedio de las seis notas es "+ promedio);
    }

}
