import java.util.Arrays;

public class BidimensionalArray {
    public static void main(String[] args) {
        String[][] matrix = new String[3][3];
        // Fill values with coordinates
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i + "," + j;
            }
        }
        // Print
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
