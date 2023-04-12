/*
 * //Define variables donde puedas alojar los resultados y prueba usar dos
   //operadores de cada tipo.

 */
package Ejercicios_teoricos_GuiaDos;

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
        int num1=5;
        int num2=2;
        //=========================================================
        //Operadores Aritmetico
        long suma=num1+num2;
        long resta=num1-num2;
        long multiplicacion=num1*num2;
        long divicion=num1/num2;
        long modulo=num1%num2;
        //=========================================================
        //Operadores unitarios
        long uniSuma=-num1;
        long uniResta=++num2;
        long incremento= num1++;
        long decremento= num2--;
        //=========================================================
        //operadores De Igualdad Y Relacion
        boolean igual=num1==num2;
        boolean distinto=num1!=num2;
        boolean mayorQue=num1>num2;
        boolean mayorIgual=num1>=num2;
        boolean menor=num1<num2;
        boolean menorIgual=num1<=num2;
        
    }
    
}
