import ejercicios.Dia1;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//char[] listaCaracteres = Dia1.String2Char("Hola");
		//System.out.println(Arrays.toString(listaCaracteres));

		char[] lista = {'a','e','i','o','u'};
		System.out.println(4==Dia1.contarCaracter("caracola", lista));
		System.out.println(3==Dia1.contarCaracter("aaa", lista));
		System.out.println(0==Dia1.contarCaracter("xxxx", lista));
		System.out.println(5==Dia1.contarCaracter("(abcdefghijklmnopqrstuvwxyz)", lista));
		System.out.println(5==Dia1.contarCaracter("aeiou", lista));
	}

}