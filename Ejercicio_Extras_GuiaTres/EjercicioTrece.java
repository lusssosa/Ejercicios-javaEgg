/*
 * *
 *Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y 
   termine en el número de la línea. 
   Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 *
 *
 */
package Ejercicio_Extras_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = sc.nextInt(); // Calcula la cantidad de digitos de la escalera

        for (int i = 1; i <= altura; i++) { // Este I va hasta la cantidad de altura
            for (int j = 1; j <= i; j++) { // Este intera hasta I por lo cual corre 1 - de I
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
