/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package Ejercicios_Practicos_GuiaCuatro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        //====================================================================================
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean exit = true;
 
        do {
            System.out.println("===========MENU===========");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTAR");
            System.out.println("3- MULTIPLICAR");
            System.out.println("4- DIVIDIR");
            System.out.println("5- SALIR");
            System.out.println("===========================");
            System.out.println("Ingresa una opcion:");
            int option = leer.nextInt();
            switch (option) {
                case 1:
                    int resul = sumarr(num1,num2);
                    System.out.println("Resultado: "+resul);
                    break;
                case 2:
                    int result = restar (num1,num2);
                    System.out.println("Resultado: "+ result);
                    break;
                     case 3:
                     int resu= multi (num1,num2);
                         System.out.println("Resultado: "+resu);
                    break;
                     case 4:
                   int res = dividir (num1,num2);
                   if (num2 == 0){
                       System.out.println("No se puede dividir por cero");
                   }else {
                         System.out.println("Resultado: "+res);
                   } 
                    break;
                     case 5:
                         System.out.println("Saliendo del programa...............");
                         exit = false;
                    break;
                     default:
                         System.out.println("Opcion invalida");
                    
            }
            
        }while (exit );
       
            
        }
        
    public static int sumarr(int num1,int num2){
         int suma;
         suma= num1+num2;
        return suma;
        
    }
   public static int restar(int num1,int num2){
         int resta;
         resta= num1-num2;
        return resta;  
        }
   public static int multi(int num1,int num2){
         int mul;
         mul= num1*num2;
        return mul;
   }
   public static int dividir(int num1,int num2){
         int divi;
         divi= num1/num2;
        return divi;
   }
}
