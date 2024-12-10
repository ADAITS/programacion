package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public ArrayList<Grupo> grupos;
	ArrayList<Miembro> miembros;

	public Programa(){
		this.grupos = new ArrayList<Grupo>();
		this.miembros = new ArrayList<Miembro>();
	}

	public void crearGrupos(){
		Scanner console = new Scanner(System.in);
		System.out.print("Introduzca el numero de grupos:");
		int nGrupos = Integer.parseInt(console.nextLine());
		for (int i=1; i<=nGrupos; i+=1) {
			System.out.print("Introduzca el nombre del grupo "+i+":");
			this.grupos.add(new Grupo(console.nextLine()));
		}
	}

	public void registrarMiembros(){
		// TODO
	}

	public void sortear(){
		// TODO
	}

	public void imprimir(){
		// TODO
	}

	public void pedirDatos(){
		// TODO
	}

	public void cargarDatos(){
		// TODO
	}

}