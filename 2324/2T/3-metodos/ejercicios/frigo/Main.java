import clases.Frigorifico;
import clases.Carne;

public class Main {
	public static void main(String[] args) {
		Frigorifico frigo = new Frigorifico();

		Carne carne = new Carne("Pavo", "123", "1");
		frigo.addCarne(carne);

		System.out.println(frigo.getCarnes().length);

		System.out.println(frigo.getCarne());

		System.out.println(frigo.getCarnes().length);

	}
}