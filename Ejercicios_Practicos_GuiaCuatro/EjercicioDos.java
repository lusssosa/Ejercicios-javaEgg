/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
   por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al
   usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios_Practicos_GuiaCuatro;

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
        //=====================================================================================
        Scanner leer = new Scanner(System.in);
        int data = 0;
        while (true) {
            String name = nameA();
            int age = ageA();
         
            if (age < 18) {
                System.out.println("===========================================");
                System.out.println(name);
                System.out.println("Es menor de edad");
            }else {
                System.out.println("=============================================");
                System.out.println(name);
                System.out.println("Es mayor de edad");
              }
            
            System.out.println("======================================");
            System.out.println("Desea continuar montrando personas?");
            String answer = leer.nextLine();
            if (answer.equalsIgnoreCase("No")){
                break;
            }
            data ++;
                    
        }
        System.out.println("Se mostraron los datos de " + (data + 1) + " personas.");
    }
    public static String nameA() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre:");
        String name = leer.nextLine();
        return name ;
        
    }
    public static int ageA() {
        Scanner leer = new Scanner(System.in);
        System.out.println("===============================================");
         System.out.println("Ingrese la edad:");
         int age = leer.nextInt();
        return age ;
    }
}
