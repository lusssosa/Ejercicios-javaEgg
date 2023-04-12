package Ejercicios_Practicos_GuiaDos;


import java.util.Scanner;

/*
 * //Escribir un programa que pida dos n�meros enteros por teclado y calcule
   //la suma de los dos. El programa deber� despu�s mostrar el resultado de
   //la suma:

/*
*/

/**
 *
 * @author Usuario
 */
public class ejercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //==================================================
        Scanner leer= new Scanner(System.in);
        int num1;
        int num2;
        //===================================================
        System.out.println("Ingrese dos numeros:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        //==================================================
        long suma=num1+num2;
        System.out.println("la suma de los numeros es:"+suma);
        
                
        
        
    }
    
}
