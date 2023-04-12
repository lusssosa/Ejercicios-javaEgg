package Ejercicios_Practicos_GuiaDos;


import java.util.Scanner;

/*
 *  //Escribir un programa que pida una frase y la muestre toda en may�sculas
    //y despu�s toda en min�sculas.
    //Nota: investigar la funci�n toUpperCase() y toLowerCase() en Java.
 */

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
        //====================================================
        Scanner leer= new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase:");
        frase=leer.next();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
       
    }
}
