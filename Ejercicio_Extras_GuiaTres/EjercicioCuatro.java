/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package Ejercicio_Extras_GuiaTres;

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
        //===========================================================
        Scanner leer = new Scanner(System.in);
        int option;
        System.out.println("Ingrese un numero del 1 al 10");
        option = leer.nextInt();
        //===========================================================
        if (option >= 1 && option<=10){
                  switch(option){
                      case 1:
                          System.out.println("El equivalente del 1 en numero romano es _ I ");
                          break;
                      case 2:
                          System.out.println("El equivalente del 2 en numero romano es _ II ");
                          break;
                      case 3:
                          System.out.println("El equivalente del 3 en numero romano es _ III ");
                          break;
                      case 4:
                          System.out.println("El equivalente del 1 en numero romano es _ IV ");
                          break;
                      case 5:
                          System.out.println("El equivalente del 1 en numero romano es _ V ");
                          break;
                      case 6:
                          System.out.println("El equivalente del 1 en numero romano es _ VI ");
                          break;
                      case 7:
                          System.out.println("El equivalente del 1 en numero romano es _ VII ");
                          break;
                      case 8:
                          System.out.println("El equivalente del 1 en numero romano es _ VIII ");
                          break;
                      case 9:
                          System.out.println("El equivalente del 1 en numero romano es _ IX ");
                          break;
                      case 10:
                          System.out.println("El equivalente del 1 en numero romano es _  X ");
                          break;
                              
                  }
        }else{
            System.out.println("EL NUMERO INGRESADO ES INVALIDO");
        }
    }
    
}
