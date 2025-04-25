public class Funciones {
	public static void main(String[] args) {
		print("FOR", 12);
	}

	public static void print() {
		System.out.println("hello");
		System.out.println(4);
		System.out.println(4f);
		System.out.println(4.0);
	}

	public static void print(int n) {
		System.out.println(n);
	}

	public static void print(String s) {
		System.out.println(s);
	}


	public static void print(String texto, int n) {
		for (int i=0; i<n ; i++ ) {
			print(texto);
		}
	}

	public static void print(int n, String texto) {
		for (int i=0; i<n ; i++ ) {
			System.out.print(texto);
		}
	}

	public static int sum(int a, int b){
		if(a+b>10) return -1;
		return a+b;
	}


}