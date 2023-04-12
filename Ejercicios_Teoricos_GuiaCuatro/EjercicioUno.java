/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
  y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que
  se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a  e  i  o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
 Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package Ejercicios_Teoricos_GuiaCuatro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main (String [] args) {
        // TODO code application logic here
        //==========================================================================
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese una frase:");
        String  secuencia = leer.nextLine();
         String frase = codificado (secuencia);
        System.out.println("Frase codificada: "+frase);
         
  }
    public static String codificado(String secuencia) {
        String frase = "";
        
        for (int i = 0 ; i < secuencia.length(); i++){
            char d = secuencia.toLowerCase().charAt(i);
            
            switch(d){
                case 'a':
                    frase += "@";
                    break;
                    
                case 'e':
                   frase += "#";
                    break;
                    
                case 'i':
                    frase += "$";
                    break;
                    
                case 'o':
                   frase += "%";
                    break;
                    
                case 'u':
                  frase += "*";
                  
                default :
                    frase  += d;
                    break;
            }
        }
        return frase;
    }
        
    
}