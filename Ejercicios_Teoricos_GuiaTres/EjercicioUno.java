/*
 *  //Implementar un programa que le pida dos números enteros al usuario y determine 
    //si ambos o alguno de ellos es mayor a 25.
 */
package Ejercicios_Teoricos_GuiaTres;

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
        //===================================================
        Scanner leer=new Scanner(System.in);
        int num1;
        int num2;
        int num3=25;
        //===================================================
        System.out.println("Ingrese un numero entero:");
        num1=leer.nextInt();
        System.out.println("Ingrese un numero entero:");
        num2=leer.nextInt();
        //=====================================================
         if(num1>num3||num2>num3) {
         System.out.println("Ambos numeros ingresados o uno de ellos es mayor a 25....");
    }   else
            System.out.println("Ninguno de los numeros ingresados es mayor a 25....");
              
    }
    
}
