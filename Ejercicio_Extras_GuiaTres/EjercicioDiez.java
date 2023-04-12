/*
 * Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package Ejercicio_Extras_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int resultado;
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        resultado = num1 * num2;
        System.out.println("Adivina el numero");
        int respuesta = sc.nextInt();
        while (respuesta != resultado) {
            System.out.println("Respuesta incorrecta, intenta de nuevo.");
            System.out.println("Adivine el numero");
            respuesta = sc.nextInt();
        }
        System.out.println("¡Respuesta correcta! Felicitaciones.");
    }
    
}
