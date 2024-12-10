package ejercicios;

public class JoinArrays {
    public static void main(String[] args) {
        int[] numeros1 = { 1, 2, 3, 4 };
        int[] numeros2 = { 10, 20, 30, 40 };
        int[] numeros3 = new int[numeros1.length + numeros2.length];

        /* Intercarlar los arrays */
        for (int i = 0; i < numeros1.length; i++) {
            numeros3[i] = numeros1[i];
            numeros3[numeros1.length + i] = numeros2[i];
        }

        /* Mostrar valores de array */
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
    }
}
