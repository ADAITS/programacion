public class FuncionRecursiva {

	public static void printRecursivo(int cont){
		System.out.println("Entra: " + cont);
		if(cont < 2){
			printRecursivo(cont + 1);
		}
		System.out.println("Sale: " + cont);
	}

	public static void main(String[] args) {
		printRecursivo(0);
	}


}