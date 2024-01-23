import java.util.Arrays;

public class ArrayCoordenadas {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		int[][] array = new int[N][N]; // [[0,0,0],[0,0,0],[0,0,0]]
		//int[][] array = { {1,2,3}, {4}, {}, {5,6,7} };

		for (int i=0; i<array.length; i+=1) {
			for (int j=0; j<array[i].length ; j+=1) {
				array[i][j] = i+j;
			}
		}

		for (int i=0; i<array.length ; i+=1 ) {
			System.out.println(Arrays.toString(array[i]));
		}


	}
}