package a2023;

public class Challenges {

	public static boolean charInString(char letra, String palabra){
		for (int i=0; i<palabra.length; i+=1) {
			if(letra == palabra.charAt(i)){
				return true;
			}		
		}
		return false;
	}

	public static boolean allCharInString(String palabra, String letras){
		for (int i=0; i<palabra.length; i+=1) {
			char letra = palabra.charAt(i);
			if(!charInString(letra, letras)){
				return false;
			}
		}
		return true;
	}

	public static String[] add(String str, String[] arr){
		String[] newArr = new String[arr.length+1];
		return newArr;
	}


	public static String[] manufacture(String[] gifts, String materials){
		// Si allCharInString entonces añado al array


		return new String[1];
	}
}