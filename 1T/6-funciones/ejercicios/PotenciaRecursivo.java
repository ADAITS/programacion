public class PotenciaRecursivo {

	public static int pow(int base, int exponente){
		if(exponente > 0){
			return base * pow(base, exponente-1);
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(pow(2,3));
		System.out.println(pow(4,4));
		System.out.println(pow(1,30));
		System.out.println(pow(4,0));
	}
}