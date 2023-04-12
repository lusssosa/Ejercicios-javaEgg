/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
   y el promedio de estaturas en general.
 */
package Ejercicio_Extras_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int cont1 = 0, cont2 = 0;
        double proMen = 0, promGel = 0, altura;
        System.out.println("Ingrese la cantidad de personas a medir");
        int cantPer = sc.nextInt(); // Lee la cantidad de personas
        for (int i = 0; i < cantPer; i++) { // Se intera hasta la cantidad de personas que se ingresaron anteriormente
            System.out.print("Ingrese la altura ");
            altura = sc.nextDouble();
            if (altura <= 1.60) {
                cont1++;
                proMen += altura;
            } else {
                cont2++;
                promGel += altura;
            }
        }
        System.out.println("El promedio general es: " + promGel / cont2 + " y la cantidad de personas que son mayor a 1.60 son: " + cont2);
        System.out.println("El promedio menor es: " + proMen / cont1 + " y la cantidad de personas que son mayor a 1.60 son: " + cont1);
    }
    
}
