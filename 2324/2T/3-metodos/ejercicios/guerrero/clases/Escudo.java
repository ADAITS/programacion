package clases;
public class Escudo {
	private String nombre;
	private int defensa;

	public Escudo(String nombre){
		this(
			nombre,
			(int)(Math.ceil(Math.random()*10))
		);
	}

	public Escudo(String nombre, int defensa){
		this.nombre = nombre;
		this.defensa = defensa;
	}

	public int getDefensa(){
		return this.defensa;
	}
}