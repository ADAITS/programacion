public class InvertirNumeroRecursivo {

	public static String invertirNumero(int numero){
		int siguiente = numero / 10;
		int digito = numero % 10;
		//System.out.print(digito);
		if(siguiente > 0){
			return "" + digito + invertirNumero(siguiente);
		}
		return ""+digito;
	}

	public static void main(String[] args) {
		invertirNumero(123);
		System.out.println(invertirNumero(123));
		invertirNumero(4001);
		System.out.println();
		invertirNumero(123456789);
		System.out.println();
		invertirNumero(0);
	}
}