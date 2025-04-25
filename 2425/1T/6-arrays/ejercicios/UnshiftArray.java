package ejercicios;

import java.util.Arrays;

public class UnshiftArray {
    public static void main(String[] args) {
        // int[] numeros = {1,2,3,4,5,6,7,8,0,0};
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length-2; i++) {
            numeros[i] = i+1;
        }

        System.out.println(Arrays.toString(numeros));

        int random = (int) (Math.random()*100)+1;

        System.out.println("El numero generado es: " + random);

        // * 1. Desplazo los valores
        for (int i = numeros.length-1; i >= 1; i--) {
            numeros[i] = numeros[i-1];
        }
        // * 2. Guardo el número en la primera posición
        numeros[0] = random;

        System.out.println(Arrays.toString(numeros));
    }
}
