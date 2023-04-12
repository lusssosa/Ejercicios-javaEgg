/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado 
  a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros
  y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Ejercicios_Practicos_GuiaCuatro;

import java.util.Scanner;

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
        //=====================================================================================
        Scanner leer = new Scanner (System.in);
        System.out.println("           COMBETIDOR DE MONEDAS");
        System.out.println("===================================");
        System.out.println("1-LIBRAS");
        System.out.println("2-DOLARES");
        System.out.println("3-YENES");
        System.out.println("===================================");
         System.out.println("Introduce la cantidad de euros a convertir: ");
        double euros = leer.nextDouble(); 
        System.out.println(" ");
        System.out.print("Ingrese una opcion:");
        int option = leer.nextInt();
        convertirDivisa(euros, option);
    }
    
    public static void convertirDivisa(double euros, int option) {
        double resultado;
       
        switch (option) {
            case 1:
                resultado = euros * 0.86;
                
                break;
            case 2:
                resultado = euros * 1.28611;
               
                break;
            case 3:
                resultado = euros * 129.852;
                
                break;
            default:
                System.out.println("Divisa no soportada.");
                return;
        }
        System.out.println("====================================");
        System.out.println(euros + " euros son equivalentes a " + resultado +".");
    }
}
