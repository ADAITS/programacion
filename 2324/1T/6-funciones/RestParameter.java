public class RestParameter {
	public static int suma(int ...numeros){
		int resultado = 0;
		for (int i=0; i<numeros.length; i+=1) {
			resultado += numeros[i];
		}
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println("El resultado debe ser 3: " + (suma(1,2) == 3));
		System.out.println("El resultado debe ser 6: " + (suma(1,2,3) == 6));
		System.out.println("El resultado debe ser 30: " + (suma(10,20) == 30));
		System.out.println("El resultado debe ser 1: " + (suma(-1,2) == 1));
	}
}