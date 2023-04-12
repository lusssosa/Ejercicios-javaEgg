/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package Ejercicios_Practicos_GuiaDos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //==========================================================
        Scanner leer=new Scanner(System.in);
        long gradosCen;
        System.out.println("Ingrese la cantidad de grados Centigrados:");
        gradosCen=leer.nextLong();
        long resultado=32+(9 *gradosCen/ 5);
        System.out.println("Su equivalente en grados Fahrenheit es: "+resultado);
        
    }
    
}
