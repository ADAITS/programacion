package ejercicios;

public class SandwichArrayBulk {
  public static void main(String[] args) {
    final int N = Integer.parseInt(args[0]);
    int[] numeros1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    int[] numeros2 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
    int[] numeros3 = new int[numeros1.length + numeros2.length];

    /* Intercarlar los arrays */
    for (int i = 0; i < numeros1.length; i += N) {
      for (int j = 0; j < N; j++) {
        numeros3[i * 2 + j] = numeros1[i + j];
        numeros3[i * 2 + N + j] = numeros2[i + j];
      }
    }

    /* Mostrar valores de array */
    for (int i = 0; i < numeros3.length; i++) {
      System.out.println(numeros3[i]);
    }
  }
}