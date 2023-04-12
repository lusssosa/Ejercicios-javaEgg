/*
 *  Dado un tiempo en minutos, calcular su equivalente en días y horas.
   Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
   equivalente: 1 día, 2 horas. 
*/

package Ejercicio_Extras_GuiaTres;

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
        //======================================================================
        Scanner leer = new Scanner(System.in);
        int minute;
        int days;
        int horus;
        System.out.println("Ingrese la cantidad de minutos:");
        minute = leer.nextInt();
        //======================================================================
        days=minute/1400;
        horus=(minute%1400)/60;
        System.out.println("Dias: "+days);
        System.out.println("Horas: "+horus);
      
                
    }
    
}
