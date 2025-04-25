package clases;

public class Moto {
	private String marca;
	private String modelo;
	private String color;

	public Moto(){
		this("Marca", "Modelo", "Color");
	}

	public Moto(String marca,String modelo,String color){
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca(){
		return this.marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getModelo(){
		return this.modelo;
	}

	private void setModelo(String modelo){
		this.modelo = modelo;
	}

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		if(this.marca.equals("BMW") && color.equals("verde")) {
			System.err.println("color no valido");
			return;
		}
		this.color = color;
	}
}