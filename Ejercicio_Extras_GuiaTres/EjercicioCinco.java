/*
 * Una obra social tiene tres clases de socios:
   * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
   * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que 
    los socios del tipo A.
    *Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
   * Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo 
    del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package Ejercicio_Extras_GuiaTres;

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
        //==================================================
        Scanner leer = new Scanner (System.in);
        char socios;
        double costoTratamiento,total;
        System.out.println("Ingrese el tipo de socio(TIpo A,Tipo B,TipoC)");
        socios = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el costo del tratamiento:");
        costoTratamiento = leer.nextDouble();
       switch(socios){
           case 'A':
               total=(costoTratamiento/50)/100;
               System.out.println("El total a pagar es de: "+total);
               break;
           case 'B':
               total=(costoTratamiento/35)/100;
                System.out.println("El total a pagar es de: "+total);
                break;
           case 'C':
               total=costoTratamiento;
                System.out.println("El total a pagar es de: "+total);
                break;
           default:
               System.out.println("El tipo de soscio ingresado es invalido:");
        }
        
    }
    
}
