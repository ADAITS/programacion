import clases.*;

public class Main {
	public static void main(String[] args) {
		Guerrero gabri = new Guerrero("Gabri");
		Arma espada = new Arma("Espada", 10);

		System.out.println(gabri);

		gabri.cogerArma(espada);
		System.out.println(gabri);

		System.out.println(gabri.getFuerza());

		gabri.soltarArma();
		System.out.println(gabri);

	}
}