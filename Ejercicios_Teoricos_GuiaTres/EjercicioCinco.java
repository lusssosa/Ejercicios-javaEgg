/*
 *   //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
     //e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
     //5 *****
     //3 ***
     //11 ***********
     //2 **

 */
package Ejercicios_Teoricos_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //==================================================
        Scanner leer=new Scanner(System.in);
        int n1,n2,n3,n4;
        //===================================================
        System.out.println("Ingrese cuatro numeros:");
        n1=leer.nextInt();    
        n2=leer.nextInt();
        n3=leer.nextInt();
        n4=leer.nextInt();
        //===================================================
        if (n1<=20) {
     
            System.out.print(n1);
            for (int i = 0; i < n1; i++) {
                System.out.print("*");
        }
        }else {
            System.out.print("El numero ingresado en invalido");
 
        }System.out.println(" ");
        //======================================================
        if  (n2<=20) {
            System.out.print(n2);
            for (int i = 0; i < n2; i++){
                System.out.print("*");
            }
        }else {
            System.out.print("El numero ingresado es invalido");
        }System.out.println(" ");
        //======================================================
        if (n3 <= 20) {
            System.out.print(n3);
            for (int i = 0; i < n3; i++) {
                System.out.print("*");
            }
        }else {
           System.out.print("El numero ingresado es invalido"); 
        }System.out.println(" ");
        //========================================================
        if (n4 <= 20) {
           System.out.print(n4);
           for (int i = 0; i < n4; i++) {
               System.out.print("*");
           }
        }else {
            System.out.print("El numero ingresado es invalido");
        }
        //========================================================
    }
    
}
