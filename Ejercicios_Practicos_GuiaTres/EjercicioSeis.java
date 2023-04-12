/*Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
 *el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
 *El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
 *si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 *se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
 *del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
 *caso contrario se vuelve a mostrar el menú.
 */
package Ejercicios_Practicos_GuiaTres;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //======================================================================
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        char confirm;
        boolean salir = true;
        int option,suma,resta,multiplicacion,divicion;
        //======================================================================
        
        //======================================================================
        do {
         System.out.println("=====MENU=====");
         System.out.println("1.SUMAR");
         System.out.println("2.RESTAR");
         System.out.println("3.MULTIPLICAR");
         System.out.println("4.DIVIDIR");
         System.out.println("5.SALIR");
         System.out.println("==============");
         System.out.println("Elija una opcion:");
         option = leer.nextInt();
         OUTER:
   
        switch(option){
            case 1:
                System.out.println("Ingrese un numero entero positivo:");
                num1 = leer.nextInt();
                System.out.println("Velva a ingresar un numero entero positivo:");
                num2 = leer.nextInt();
                suma=num1+num2;
                System.out.println("Cargando...");
                System.out.println("Resultado:" + suma);
                break;
            case 2:
                System.out.println("Ingrese un numero entero positivo:");
                num1 = leer.nextInt();
                System.out.println("Velva a ingresar un numero entero positivo:");
                num2 = leer.nextInt();
                resta=num1-num2;
                System.out.println("Cargando...");
                System.out.println("Resultado:" + resta);
                break;
               
            case 3:
                System.out.println("Ingrese un numero entero positivo:");
                num1 = leer.nextInt();
                System.out.println("Velva a ingresar un numero entero positivo:");
                num2 = leer.nextInt();
                multiplicacion=num1*num2;
                System.out.println("Cargando...");
                System.out.println("Resultado:" + multiplicacion);
            
                break;
            case 4:
                System.out.println("Ingrese un numero entero positivo:");
                num1 = leer.nextInt();
                System.out.println("Velva a ingresar un numero entero positivo:");
                num2 = leer.nextInt();
                 if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        System.out.println("Cargando...");
                        System.out.println("Resultado: " + ((double) num1 / num2));
                    }
                    break;
               
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? ");
                    confirm = leer.next().charAt(0);
                    switch (confirm) {
                        case 'S':
                        case 's':
                            System.out.println("Saliendo del programa...");
                            return;
                        case 'N':
                        case 'n':
                            break OUTER;
                        default:
                            System.out.println("Opción inválida. Volviendo al menú principal.");
                            break OUTER;
                    }
                default:
                    System.out.println("Opción invalida");
            }
        } while (salir);
                    
                
               
        }
                
    }
    

