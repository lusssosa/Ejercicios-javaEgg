/*
 * //Escribir un programa que lea un número entero por teclado y 
   //muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
   //Nota: investigar la función Math.sqrt().
*/
package Ejercicios_Practicos_GuiaDos;

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
        //================================================
        Scanner leer=new Scanner(System.in);
        double num,raiz;
        System.out.println("Ingrese un numero entero:");
        num=leer.nextLong();
        raiz=Math.sqrt(num);
              
        System.out.println("El doble de el numero ingresado es: "+(num*2));
        System.out.println("El tiple de el numero ingresado es: "+(num*3));
        System.out.println("La raiz cuadrada de el numero ingresdado es de:"+raiz);
        
    }
    
}
