/*
 * Simular la división usando solamente restas. Dados dos números enteros
   mayores que uno, realizar un algoritmo que calcule el cociente y el
   residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
   obtener un resultado menor que el divisor, este resultado es el residuo, y
   el número de restas realizadas es el cociente.
 */
package Ejercicio_Extras_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Lusssosa
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();

        System.out.println("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        int cociente = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        int residuo = dividendo;

        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }
    
}
