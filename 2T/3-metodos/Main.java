import clases.Moto;

public class Main {
	public static void main(String[] args) {
		Moto moto = new Moto("Marca", "Modelo", "Color");
		Moto motomami = new Moto("Marca", "Modelo", "Color");

		moto.setColor("azul"); // SI
		motomami.setColor("verde");

		System.out.println(moto.getColor());
		System.out.println(motomami.getColor());



	}
}