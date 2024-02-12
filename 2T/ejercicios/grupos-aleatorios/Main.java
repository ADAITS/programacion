import clases.Programa;

public class Main {
	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.crearGrupos();
		System.out.println(programa.grupos);
	}
}