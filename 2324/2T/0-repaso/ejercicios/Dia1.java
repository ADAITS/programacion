package ejercicios;

public class Dia1 {
	
	public static char[] String2Char(String text){
		char[] textArray = new char[text.length()];

		for(int i=0; i<textArray.length; i+=1){
			textArray[i] = text.charAt(i);
		}

		return textArray;
	}

	public static int contarVocales(String text){
		int vocales = 0;
		char[] textArray = String2Char(text.toUpperCase() );
		for (int i=0; i<textArray.length; i+=1) {	
			if( textArray[i] == 'A' ||
				textArray[i] == 'E' ||
				textArray[i] == 'I' ||
			 	textArray[i] == 'O' ||
				textArray[i] == 'U'
			){
				vocales += 1;
			}
		}
		return vocales;
	}

	public static int contarCaracter(String text){
		int vocales = 0;
		char[] textArray = String2Char(text.toUpperCase() );
		for (int i=0; i<textArray.length; i+=1) {	
			if( textArray[i] == 'C' ){
				vocales += 1;
			}
		}
		return vocales;
	}

	public static int contarCaracter(String text, char caracter){
		int vocales = 0;
		char[] textArray = String2Char(text);
		for (int i=0; i<textArray.length; i+=1) {	
			if( textArray[i] == caracter ){
				vocales += 1;
			}
		}
		return vocales;
	}
				// CARACOLA, [H, O, L]
	public static int contarCaracter(String text, char[] caracteres){
		int vocales = 0;
		char[] textArray = String2Char(text);
		for (int i=0; i<textArray.length; i+=1) {
			for (int j=0; j<caracteres.length; j+=1) {
				if( textArray[i] == caracteres[j] ){
					vocales += 1;
					break;
				}
			}
		}
		return vocales;
	}

}