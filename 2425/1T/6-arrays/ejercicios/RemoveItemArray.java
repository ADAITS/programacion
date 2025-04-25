package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveItemArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(numeros));

        // * 1. Pedir posicion al usuario
        System.out.print("Introduce una posición: ");
        int indice = Integer.parseInt(console.nextLine()) - 1;

        int numeroAMover = numeros[indice];

        if(indice < numeros.length && indice > 0){
            // * 2. Desplazar los numeros a la izq hasta el indice indicado
            for (int i = indice; i < numeros.length-1; i++) {
                numeros[i] = numeros[i+1];
            }

            // * 3. Rellenar con un 0 la última posición
            numeros[numeros.length-1] = numeroAMover;
        }

        System.out.println(Arrays.toString(numeros));
    }
}
