import java.util.Arrays;

import a2023.Challenges;

public class Main {

	public static String[] createArray(String ...array){
		return array;
	}

	public static void main(String[] args) {
		String[] gifts = createArray("tren", "oso", "pelota");
		String materials = "tronesa";

		String[] builtGifts = Challenges.manufacture(gifts, materials); // ["tren", "oso"]
		System.out.println(Arrays.toString(builtGifts));

		gifts = createArray("juego", "puzzle");
		materials = "jlepuz";
		builtGifts = Challenges.manufacture(gifts, materials); // ["puzzle"]
		System.out.println(Arrays.toString(builtGifts));

		gifts = createArray("libro", "ps5"); // []
		materials = "psli";
		builtGifts = Challenges.manufacture(gifts, materials);
		System.out.println(Arrays.toString(builtGifts));
	}
}