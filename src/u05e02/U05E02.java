
package u05e02;

import java.util.Scanner;

public class U05E02 {
    
    public static void main(String args[]) {
      float num1, num2, suma=0, resta=0, resultado;
      char operacion, S, R;
      Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1=entrada.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        num2=entrada.nextFloat();
        do{
            System.out.print("Elija la operacion a realizar, S para suma, R para resta: ");
            operacion=entrada.next().charAt(0);
            operacion=Character.toUpperCase(operacion);
            switch (operacion){
                case 'S':
                    suma=calculaSuma(num1, num2);
                    System.out.print("El resultado es: "+suma);
                    break;
                case 'R':
                    resta=calculaResta(num1, num2);
                    System.out.print("El resultado es: "+resta);
                    break;
                default:
                    System.out.print("Reingrese la opcion, solo se permite (S)uma o (R)esta\n");
            }
        }while((operacion!='S')&&(operacion!='R'));
    }
    static float calculaSuma (float a, float b){
        float c=a+b;
        return(c);
    }
    static float calculaResta (float a, float b){
        float c=a-b;
        return(c);
    }
}