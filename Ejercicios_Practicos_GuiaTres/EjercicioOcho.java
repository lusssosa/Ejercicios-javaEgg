/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
   Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
   * * * *
   *     *
   *     *
   * * * *

 */
package Ejercicios_Practicos_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //======================================================================
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        //======================================================================
        for (int i = 0; i < num; i ++) {
            for (int j = 0; j < num; j++) {
                if (i==0 || i==num-1 || j==0 || j==num-1 ){
                    System.out.println("   *");
                }else{
                    System.out.println("*");
                }
            }
            System.out.println(""); 
        }                 
             
        
    }
    
}
