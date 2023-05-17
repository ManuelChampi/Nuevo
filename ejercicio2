import java.util.Arrays;
import java.util.*;
 
public class Main {
     
    private static int[] numeros = {1, 2, 3, 4, 5};
 
    public static void main(String[] args) {

        System.out.println("Array");
        visualizar();
        rotarIzda();
        System.out.println("\nArray rotado a la izquierda");
        visualizar();
    }
     
    private static void rotarIzda(){
        int aux = numeros[0];
        for (int i = 0; i < numeros.length-1; i++) {
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length-1] = aux;
    }
 
    private static void visualizar() {
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
