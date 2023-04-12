/*
 *  //Escriba un programa que pida una frase o palabra y valide si la primera 
    //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
    //de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
    //se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y
    //equals() de Java.
 */
package Ejercicios_Practicos_GuiaTres;

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
         Scanner leer = new Scanner(System.in);
        String palabra;
        
        //==============================================
        System.out.println("Ingrese una frase:");
        palabra = leer.next();
        if (palabra.substring(0,1).equals("a")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
    
}
