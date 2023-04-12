package Ejercicios_Practicos_GuiaDos;


import java.util.Scanner;

/*
 * //Escribir un programa que pida tu nombre, lo guarde en una variable y lo
   //muestre por pantalla.


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
        //===================================================
        Scanner leer= new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese Nombre:");
        nombre=leer.next();
        System.out.println("Hola!"+nombre);
    }
    
}
