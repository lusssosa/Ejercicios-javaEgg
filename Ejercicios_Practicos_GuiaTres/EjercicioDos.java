/*
 *  //Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    //el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
    //Nota: investigar la función equals() en Java.
 */
package Ejercicios_Practicos_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //==============================================
        Scanner leer = new Scanner(System.in);
        String contraseña="eureka";
        int intentos = 3;
        String pass;
        boolean acierto = false;
        //=============================================================
        for (int i = 0;i < intentos && ! acierto; i++){
            System.out.println("Introduce una contraseña");
            pass = leer.next();
            if (pass.equals(contraseña)){
                System.out.println("Ingreso al sistema exitosamente");
                acierto=true;
            }
        } 
                
                
    }
}
