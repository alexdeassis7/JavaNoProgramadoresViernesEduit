package clase5calculadoraconmetodos;

import java.util.Scanner;

public class Clase5CalculadoraConMetodos {

    //Defino atributos de la Clases ( Variables Globales )
    static Scanner teclado = new Scanner(System.in);
    static int opcionIngresada = 0;
    static float numero1 = 0, numero2 = 0;

    public static void main(String[] args) {
        System.out.println("Inicio de la App");
        mostrarMenuDeOpciones();

        switch (opcionIngresada) {
            case 1:
                System.out.println("Usted selecciono la opcion SUMAR");
                solicitarNumerosAlUsuario();
                mostrarResultado(sumar(), "suma");
                break;
            case 2:
                System.out.println("Usted selecciono la opcion RESTAR");
                solicitarNumerosAlUsuario();
                mostrarResultado(restar(), "resta");
                break;
            case 3:
                System.out.println("Usted selecciono la opcion MULTIPLICAR");
                solicitarNumerosAlUsuario();
                mostrarResultado(multiplicar(), "multiplicacion");
                break;
            case 4:
                System.out.println("Usted selecciono la opcion DIVIDIR");
                solicitarNumerosAlUsuario();
                float retorno = dividir();
                if(retorno != 0){
                  mostrarResultado(retorno, "division");  
                }         

                break;
            default:
                System.out.println("La opcion " + opcionIngresada + " No es una opcion Valida!");

        }
        System.out.println("Fin del App");

    }

    //Procedimiento 
    public static void mostrarMenuDeOpciones() {
        System.out.println("Ingrese la opcion de la operacion aritmetica que desea realizar");
        System.out.print(" 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR \n");
        opcionIngresada = teclado.nextInt();
    }

    //Procedimiento 
    public static void solicitarNumerosAlUsuario() {
        System.out.println("Ingrese el numero uno");
        numero1 = teclado.nextFloat();
        System.out.println("Ingrese el numero dos");
        numero2 = teclado.nextFloat();
    }

    //FUNCION 
    public static float sumar() {
        float resultado = 0;
        resultado = numero1 + numero2;
        return resultado;
    }

    //FUNCION
    public static float restar() {
        return numero1 - numero2;
    }

    //FUNCION
    public static float multiplicar() {
        return numero1 * numero2;
    }

    //FUNCION
    public static float dividir() {
        if (numero2 == 0) {
            mostrarError("no se puede dividir por cero el lo numeros REALES! ");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
    public static void mostrarError(String mensajeError){
        System.out.println(mensajeError);
    }
    //PROCEDIMIENTO
    public static void mostrarResultado(float resultado, String operacionAritmetica) {
        System.out.println("El resultado de la " + operacionAritmetica + " es : " + resultado);
    }

}
