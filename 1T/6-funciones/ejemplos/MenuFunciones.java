import java.util.Scanner;

public class MenuFunciones {

	public static int menu(){
		Scanner console = new Scanner(System.in);
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.print("Elija una opcion: ");
		int opcion = Integer.parseInt(console.nextLine());
		return opcion;
	}

	public static int pedirNumero(){
		Scanner console = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		int a = Integer.parseInt(console.nextLine());
		return a;
	}

	public static int calcularResultado(int a, int b, int opcion){
		int result = 0;

		if(opcion == 1){
			result = a + b;
		}else if(opcion == 2){
			result = a - b;
		}else if(opcion == 3){
			result = a * b;
		}

		return result;
	}

	public static void main(String[] args) {
		int opcion = menu();
		
		int a = pedirNumero();
		int b = pedirNumero();

		int result = calcularResultado(a, b, opcion);

		System.out.println(result);

	}
}