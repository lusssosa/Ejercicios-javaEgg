/*
 *  //Crear un programa que dado un número determine si es par o impar.
 */
package Ejercicios_Practicos_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //====================================================
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingresa un numero");
        num = leer.nextInt();
        
        //====================================================
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("el numero es impar");
        }
        
    }
    
}
