/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
    Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos 
    matemáticamente utilizando el operador de división. 
    Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */
package Ejercicio_Extras_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Lusssosa
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero y te va a devolver la cantidad de digitos");
        int num = sc.nextInt();
        int cont = 0;
        while (num != 0) {
            num /= 10;
            cont++;
        }
        System.out.println("Cantidad de digitos " + cont);
    }
    
}
