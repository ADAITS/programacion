package ejercicios;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        final int N = 10;//Integer.parseInt(args[0]);
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numeros));

        for (int j = 0; j < N; j++) {
            int temp = numeros[numeros.length-1];
            // * 1. Desplazo los valores
            for (int i = numeros.length-1; i >= 1; i--) {
                numeros[i] = numeros[i-1];
            }
            // * 2. Guardo el número en la primera posición
            numeros[0] = temp;
            
            System.out.println(Arrays.toString(numeros));
        }
    }
}
