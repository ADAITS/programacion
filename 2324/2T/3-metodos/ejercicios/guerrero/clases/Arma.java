package clases;
public class Arma {
	private String nombre;
	private int fuerza;

	public Arma(String nombre){
		this(
			nombre,
			(int)(Math.ceil(Math.random()*10))
		);
	}

	public Arma(String nombre, int fuerza){
		this.nombre = nombre;
		this.fuerza = fuerza;
	}

	public int getFuerza(){
		return this.fuerza;
	}
}