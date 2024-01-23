package clases;
public class Casco {
	private String nombre;
	private int vida;
	private int defensa;

	public Casco(String nombre){
		this(
			nombre,
			(int)(Math.ceil(Math.random()*10)),
		 	(int)(Math.ceil(Math.random()*10))
		);
	}

	public Casco(String nombre, int vida, int defensa){
		this.nombre = nombre;
		this.vida = vida;
		this.defensa = defensa;
	}

	public int getVida(){
		return this.vida;
	}

	public int getDefensa(){
		return this.defensa;
	}
}