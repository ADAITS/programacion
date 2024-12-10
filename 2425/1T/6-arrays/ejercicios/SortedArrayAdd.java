package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayAdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numeros = { 1, 3, 5, 7, 9, 0, 0, 0, 0, 0 }; // 0 .. 9
        System.out.println(Arrays.toString(numeros));

        System.out.print("Introduce un numero: ");
        int newNumber = Integer.parseInt(console.nextLine());
        while(newNumber > 0){
            // * 1. Pedir o generar número 
            System.out.print("Introduce un numero: ");
            newNumber = Integer.parseInt(console.nextLine());
            
            // * 2. Encontrar índice donde insertar
            int posicion = -1;
            for (int i = 0; i < numeros.length && posicion == -1; i++) {
                if(newNumber < numeros[i] || numeros[i] == 0){
                    posicion = i;
                }
            }
            if(posicion == -1){
                posicion = numeros.length-1;
            }

            // * 3. Rotar los valores para hacer espacio para el nuevo valor
            for (int i = numeros.length-1; i > posicion; i--) {
                numeros[i] = numeros[i-1];
            }
            
            // * 4. Insertar nuevo valor en la posición indicada
            numeros[posicion] = newNumber;
            
            System.out.println(Arrays.toString(numeros));

            System.out.print("Introduce un numero: ");
            newNumber = Integer.parseInt(console.nextLine());
        }
    }
}
