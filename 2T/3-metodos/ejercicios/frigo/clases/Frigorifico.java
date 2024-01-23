package clases;

import clases.Carne;

public class Frigorifico {
	/* ATRIBUTOS */
	Carne[] carnes;

	/* CONSTRUCTORES */
	public Frigorifico(){
		this.carnes = new Carne[0];
	}

	/* GETTER / SETTER */
	public Carne[] getCarnes(){
		return this.carnes;
	}

	public void setCarnes(Carne[] carnes){
		this.carnes = carnes;
	}

	public Carne getCarne(int i){
		Carne carne = this.carnes[i];
		this.carnes[i] = null;
		return carne;
	}

	public Carne getCarne(){
		Carne carne = this.carnes[this.carnes.length-1];
		Carne[] carnesNew = new Carne[this.carnes.length-1];
		for (int i=0; i<carnesNew.length; i++) {
			carnesNew[i] = this.carnes[i];
		}
		this.carnes = carnesNew;
		return carne;
	}

	public void addCarne(Carne carne){
		Carne[] carnesNew = new Carne[this.carnes.length+1];
		for (int i=0; i<this.carnes.length; i++) {
			carnesNew[i] = this.carnes[i];
		}
		carnesNew[carnesNew.length-1] = carne;
		this.carnes = carnesNew;
	}
}

