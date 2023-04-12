/*
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
  Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package Ejercicio_Extras_GuiaTres;

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
        //=====================================================
        Scanner leer = new Scanner (System.in);
        String vocal;
         System.out.println("Ingrese una letra:");
              vocal = leer.nextLine();
        if ("a".equals(vocal) || "e".equals(vocal)|| "i".equals(vocal)|| "o".equals(vocal)|| "u".equals(vocal)) {
            System.out.println("ES UNA VOCAL");
        }else{
            System.out.println("ES UNA CONSONATE");
        }
               
        
        
    }
    
}
