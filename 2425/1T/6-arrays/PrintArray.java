import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        // Using java.util.Arrays
        System.out.println(Arrays.toString(numeros));
        // Handmade
        System.out.print("[");
        for (int i = 0; i < numeros.length-1; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println(numeros[numeros.length-1] + "]");
    }
}
