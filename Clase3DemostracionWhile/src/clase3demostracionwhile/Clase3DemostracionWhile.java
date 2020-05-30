package clase3demostracionwhile;
public class Clase3DemostracionWhile {
//Realizar un algoritmo que muestre por consola los numero pares del 100 al 0

    public static void main(String[] args) {
        int contador = 100;
        System.out.println("inicio del While");        
        //ESTRUCTURA MIENTRAS
        while (contador >= 0) {//ejecuciones : 1 VEZ ,NUNCA ,N Veces 
            System.out.println(contador);
            contador--;
        }
        System.out.println("Fin del while");
        
        System.out.println("Comienzo del Do-while");        
        //Realizar un algoritmo que muestre por consola los numero pares del 0 al 100
          //ESTRUCTURA REPETIR-HASTA QUE
          //ejecuciones : 1 VEZ , N Veces
          contador = 0;//reinicio mi variable de control 
         do{
             //cuerpo del do while 
             System.out.println(contador);
             contador ++;//incremento el contador del bucle
         }while( contador <= 100 );
         
         System.out.println("Fin del Do While");
         
        
        
        
        
        
    }

}
