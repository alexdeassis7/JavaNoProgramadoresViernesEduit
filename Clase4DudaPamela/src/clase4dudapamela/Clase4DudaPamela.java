package clase4dudapamela;

import java.util.Scanner;

public class Clase4DudaPamela {
    public static void main(String[] args) {
        
        int antiguedad=0;
        float salario=0.0f, utilidad = 0.0f;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INGRESE EL MONTO DE SU SALARIO:");
        salario=teclado.nextFloat();
        System.out.println("INGRESE SU ANTIGUEDAD:");
        antiguedad=teclado.nextInt();
        
        double num = antiguedad;
        if (antiguedad>=10)
        {
            utilidad=salario * 0.2f;
            
            System.out.println("UTILIDAD: " + utilidad);
    }
    
}
