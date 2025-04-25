package lib;

import java.util.Scanner;

public class Leer{

	public static String texto(){
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		return texto;
	}

	public static String texto(String info){
		System.out.print(info);
		return texto();
	}

	public static int entero(){
		int numero;
		try{
			numero = Integer.parseInt(texto());
		}catch(Exception e){
			numero = entero("Introduzca un numero valido: ");
		}
		return numero;
	}

	public static int entero(String info){
		System.out.print(info);
		return entero();
	}
}