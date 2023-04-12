/*
 *   //Escriba un programa que valide si una nota esta entre 0 y 10, sino está 
     //entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package Ejercicios_Teoricos_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int nota;
        System.out.println("Ingrese una nota:");
        nota=leer.nextInt();
        while( nota > 10){
        System.out.println("Ingrese una nota entre el 1 y el 10:");
        nota=leer.nextInt(); 
        }
      
    }
    
}
