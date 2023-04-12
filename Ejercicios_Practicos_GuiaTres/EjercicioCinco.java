/*
 *  //Escriba un programa en el cual se ingrese un valor limite positivo, y a
    //continuacion solicite numeros al usuario hasta que la suma de los numeros
    //introducidos supere el limite inicial.

 */
package Ejercicios_Practicos_GuiaTres;

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
        //======================================================================
        Scanner leer = new Scanner(System.in);
        int limitePositivo;
        int suma;
        //======================================================================
        System.out.println("Ingrese valor limite positivo");
        limitePositivo = leer.nextInt();
        for (int num = 0; num < limitePositivo; num++){
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma=num+num;
            System.out.println("===============================================");
            System.out.println("Imprimo el valor de "+num+" Ingresado es " + suma);
        }
           System.out.println("===============================================");
     
           System.out.println("A sueperado el valor limite");
                
    }
    
}
