package clases;
public class Botas {
	private String nombre;
	private int vida;
	private int agilidad;

	public Botas(String nombre){
		this(
			nombre,
			(int)(Math.ceil(Math.random()*10)),
		 	(int)(Math.ceil(Math.random()*10))
		);
	}

	public Botas(String nombre, int vida, int agilidad){
		this.nombre = nombre;
		this.vida = vida;
		this.agilidad = agilidad;
	}

	public int getVida(){
		return this.vida;
	}

	public int getAgilidad(){
		return this.agilidad;
	}
}