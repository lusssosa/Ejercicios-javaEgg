/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación,
   realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D
   tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Ejercicio_Extras_GuiaTres;

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
        //=========================================================
        int A = 5, B = 8, C = 10, D = 6;
        int aux;
        //=========================================================
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        //==========================================================
        aux = A;
        A= B;
        B= C;
        C= D;
        D = aux;
        //=========================================================
        System.out.println("=======================================");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        
                
                
                
        
        
                
               
        
  
    }
    
}
