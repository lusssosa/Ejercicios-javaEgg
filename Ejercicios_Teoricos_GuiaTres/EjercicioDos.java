/*
 *  //Considera que estás desarrollando una web para una empresa que fabrica motores
    //(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
    //Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
    //El programa debe mostrar lo siguiente:
    //-Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba 
    //de agua”.
    //-Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba 
    //de gasolina”.
    //-Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba 
    //de hormigón”.
    //-Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba 
    //de pasta alimenticia”.
    //-Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe
    //un valor válido para tipo de bomba”
 */
package Ejercicios_Teoricos_GuiaTres;

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
        //=====================================================================
        Scanner leer=new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese el tipo de motor en niveles numericos del 1 al 4:");
        tipoMotor=leer.nextInt();
        //=====================================================================
        switch(tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua...");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina...");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón...");
                break;
            case 4:
                System.out.println("“La bomba es una bomba de pasta alimentici...");
                break;
            default:
                System.out.println("“No existe un valor válido para tipo de bomba...");
        }
                
                
    }
    
}
