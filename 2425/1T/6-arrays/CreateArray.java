import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Crear array con valores directamente
        int[] directArray = {1, 2, 3, 4, 5};

        // Crear array vacío de un tamaño fijo
        int[] fixedSizeArray = new int[5];

        // Rellenar el array con el valor de cada índice
        for (int i = 0; i < fixedSizeArray.length; i++) {
            fixedSizeArray[i] = i;
        }

        // Rellenar el array solicitando los datos por scanner
        int[] userInputArray = new int[5];
        for (int i = 0; i < userInputArray.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            userInputArray[i] = console.nextInt();
        }
    }
}
