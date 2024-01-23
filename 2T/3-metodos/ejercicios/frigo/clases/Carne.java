package clases;

public class Carne {
	/* ATRIBUTOS */
	String nombre;
	String peso;
	String proteina;

	/* CONSTRUCTORES */
	public Carne(){}
	public Carne(String nombre,String peso, String proteina){
		this.nombre = nombre;
		this.peso = peso;
		this.proteina = proteina;
	}

	/* GETTER / SETTER */
	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

   	/* toString */
	@Override
	public String toString(){
		return nombre + " "+ peso +" " +proteina;
	}
}