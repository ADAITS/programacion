package clases;

public class Guerrero {
	String nombre;
	int fuerza;
	int defensa;
	int vida;
	int agilidad;
	Arma arma;
	Escudo escudo;
	Casco casco;
	Botas botas;

	public Guerrero(String nombre){
		this(
			nombre,
			(int)(Math.ceil(Math.random()*6)) + 4,
			(int)(Math.ceil(Math.random()*10)),
			(int)(Math.ceil(Math.random()*21))+ 89,
			(int)(Math.floor(Math.random()*6))
		);
	}

	public Guerrero(String nombre, int fuerza, int defensa, int vida, int agilidad){
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.defensa = defensa;
		this.vida = vida;
		this.agilidad = agilidad;
	}

	public int getFuerza(){
		int fuerzaTotal = this.fuerza;
		if(this.arma != null){
			fuerzaTotal += this.arma.getFuerza();
		}
		return fuerzaTotal;
	}

	public void cogerArma(Arma arma){
		this.arma = arma;
	}

	public Arma soltarArma(){
		Arma armaSoltada = this.arma;
		this.arma = null;
		return armaSoltada;
	}

	@Override
	public String toString(){
		return nombre+"\n\t"+
			this.getFuerza()+"\n\t"+
			defensa+"\n\t"+
			vida+"\n\t"+
			agilidad+"\n\t"+
			(arma != null ? "Arma equipada" : "Sin arma")+"\n\t"+
			(escudo != null ? "Escudo equipado" : "Sin escudo")+"\n\t"+
			(casco != null ? "Casco equipado" : "Sin casco")+"\n\t"+
			(botas != null ? "Botas equipadas" : "Sin botas");
	}
}