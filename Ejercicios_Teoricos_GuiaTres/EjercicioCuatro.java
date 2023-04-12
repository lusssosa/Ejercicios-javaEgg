/*
 *  //Escriba un programa que lea 20 números. Si el número leído es igual a cero 
    //se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
    //El programa deberá calcular y mostrar el resultado de la suma de los números
    //leídos, pero si el número es negativo no debe sumarse. 
    //Nota: recordar el uso
    //de la sentencia break.
 */
package Ejercicios_Teoricos_GuiaTres;

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
        //===========================================================
        Scanner leer=new Scanner(System.in);
        int num;
        int i=0;
        //===========================================================
        
            
            do {
                System.out.println("ingrese un numero:");
                num=leer.nextInt();
               i=i+1;
            }while(num!=0 && i<20);
            
            if(num==0){
                System.out.println("Se capturo el numero cero");
          } else{
                System.out.println("Intentos agotados");
            } 
            
                    
                  
    }
    
}
