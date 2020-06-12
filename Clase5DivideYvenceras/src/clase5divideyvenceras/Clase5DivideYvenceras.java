package clase5divideyvenceras;

import java.util.Scanner;

public class Clase5DivideYvenceras {

    /**
     * Demostracion de Funcion y Procedimiento
     */
    public static void main(String[] args) {
        //ALGORITMO PRINCIPAL
        Scanner teclado = new Scanner(System.in);
        int precioIngresado = 0;
        System.out.println("Ingrese el precio del producto ");
        precioIngresado = teclado.nextInt();
        //invocamos a la funcion IVA()
        double precioDelIva = iva(precioIngresado);
        System.out.println("el iva es de " + precioDelIva);
        System.out.println("el precio final : " + (precioIngresado + precioDelIva));

        //invocamos 3 veces al procedimiento ejecutar...
        ejecutarProcedimiento();
        ejecutarProcedimiento();
        ejecutarProcedimiento();

    }

    //procedimiento que muestra numeros del 1 al 10 ,no recibe parametros
    public static void ejecutarProcedimiento() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    //funcion que calcula el iva de un valor enviado por parametro 
    public static double iva(int valor) {
        //cuerpo de la funcion iva
        double porcentaje = 0.21;
        double resultado = valor * porcentaje;
        return resultado;//retorna el valor al algoritmo que invoca a la funcion iva 
    }

}
